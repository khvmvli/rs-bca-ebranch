package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.ChuckerDatabase;
import o.defaultInspectorModulesProvider;
import o.initialize;
import o.setScheme$com_github_ChuckerTeam_Chucker_library;
import o.setTookMs;
import okhttp3.internal.Util;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
/* loaded from: classes-dex2jar.jar:okhttp3/internal/cache/DiskLruCache.class */
public final class DiskLruCache implements Closeable, Flushable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final long ANY_SEQUENCE_NUMBER = -1;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    static final String JOURNAL_FILE = "journal";
    static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final String JOURNAL_FILE_TEMP = "journal.tmp";
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    static final String MAGIC = "libcore.io.DiskLruCache";
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    static final String VERSION_1 = "1";
    private final int appVersion;
    boolean closed;
    final File directory;
    private final Executor executor;
    final FileSystem fileSystem;
    boolean hasJournalErrors;
    boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    setScheme$com_github_ChuckerTeam_Chucker_library journalWriter;
    private long maxSize;
    boolean mostRecentRebuildFailed;
    boolean mostRecentTrimFailed;
    int redundantOpCount;
    final int valueCount;
    private long size = 0;
    final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long nextSequenceNumber = 0;
    private final Runnable cleanupRunnable = new 1(this);

    /* loaded from: classes-dex2jar.jar:okhttp3/internal/cache/DiskLruCache$Editor.class */
    public final class Editor {
        private boolean done;
        final Entry entry;
        final boolean[] written;

        Editor(Entry entry) {
            this.entry = entry;
            this.written = entry.readable ? null : new boolean[DiskLruCache.this.valueCount];
        }

        public final void abort() throws IOException {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (this.entry.currentEditor == this) {
                        DiskLruCache.this.completeEdit(this, false);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public final void abortUnlessCommitted() {
            synchronized (DiskLruCache.this) {
                if (!this.done && this.entry.currentEditor == this) {
                    try {
                        DiskLruCache.this.completeEdit(this, false);
                    } catch (IOException e) {
                    }
                }
            }
        }

        public final void commit() throws IOException {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (this.entry.currentEditor == this) {
                        DiskLruCache.this.completeEdit(this, true);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        final void detach() {
            if (this.entry.currentEditor == this) {
                for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                    try {
                        DiskLruCache.this.fileSystem.delete(this.entry.dirtyFiles[i]);
                    } catch (IOException e) {
                    }
                }
                this.entry.currentEditor = null;
            }
        }

        public final initialize newSink(int i) {
            synchronized (DiskLruCache.this) {
                if (this.done) {
                    throw new IllegalStateException();
                } else if (this.entry.currentEditor != this) {
                    return ChuckerDatabase.c();
                } else {
                    if (!this.entry.readable) {
                        this.written[i] = true;
                    }
                    try {
                        return new 1(this, DiskLruCache.this.fileSystem.sink(this.entry.dirtyFiles[i]));
                    } catch (FileNotFoundException e) {
                        return ChuckerDatabase.c();
                    }
                }
            }
        }

        public final defaultInspectorModulesProvider newSource(int i) {
            synchronized (DiskLruCache.this) {
                if (this.done) {
                    throw new IllegalStateException();
                } else if (!this.entry.readable || this.entry.currentEditor != this) {
                    return null;
                } else {
                    try {
                        return DiskLruCache.this.fileSystem.source(this.entry.cleanFiles[i]);
                    } catch (FileNotFoundException e) {
                        return null;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:okhttp3/internal/cache/DiskLruCache$Entry.class */
    public final class Entry {
        final File[] cleanFiles;
        Editor currentEditor;
        final File[] dirtyFiles;
        final String key;
        final long[] lengths;
        boolean readable;
        long sequenceNumber;

        Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new File[DiskLruCache.this.valueCount];
            this.dirtyFiles = new File[DiskLruCache.this.valueCount];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                sb.append(i);
                this.cleanFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.append(".tmp");
                this.dirtyFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        final void setLengths(String[] strArr) throws IOException {
            if (strArr.length == DiskLruCache.this.valueCount) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.lengths[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException e) {
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        final Snapshot snapshot() {
            defaultInspectorModulesProvider defaultinspectormodulesprovider;
            if (Thread.holdsLock(DiskLruCache.this)) {
                defaultInspectorModulesProvider[] defaultinspectormodulesproviderArr = new defaultInspectorModulesProvider[DiskLruCache.this.valueCount];
                long[] jArr = (long[]) this.lengths.clone();
                int i = 0;
                for (int i2 = 0; i2 < DiskLruCache.this.valueCount; i2++) {
                    try {
                        defaultinspectormodulesproviderArr[i2] = DiskLruCache.this.fileSystem.source(this.cleanFiles[i2]);
                    } catch (FileNotFoundException e) {
                        while (i < DiskLruCache.this.valueCount && (defaultinspectormodulesprovider = defaultinspectormodulesproviderArr[i]) != null) {
                            Util.closeQuietly(defaultinspectormodulesprovider);
                            i++;
                        }
                        try {
                            DiskLruCache.this.removeEntry(this);
                            return null;
                        } catch (IOException e2) {
                            return null;
                        }
                    }
                }
                return new Snapshot(DiskLruCache.this, this.key, this.sequenceNumber, defaultinspectormodulesproviderArr, jArr);
            }
            throw new AssertionError();
        }

        final void writeLengths(setScheme$com_github_ChuckerTeam_Chucker_library setscheme_com_github_chuckerteam_chucker_library) throws IOException {
            for (long j : this.lengths) {
                setscheme_com_github_chuckerteam_chucker_library.e(32).j(j);
            }
        }
    }

    DiskLruCache(FileSystem fileSystem, File file, int i, int i2, long j, Executor executor) {
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
        this.valueCount = i2;
        this.maxSize = j;
        this.executor = executor;
    }

    private void checkNotClosed() {
        synchronized (this) {
            if (isClosed()) {
                throw new IllegalStateException("cache is closed");
            }
        }
    }

    public static DiskLruCache create(FileSystem fileSystem, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new DiskLruCache(fileSystem, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private setScheme$com_github_ChuckerTeam_Chucker_library newJournalWriter() throws FileNotFoundException {
        return ChuckerDatabase.d(new 2(this, this.fileSystem.appendingSink(this.journalFile)));
    }

    private void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            if (next.currentEditor == null) {
                for (int i = 0; i < this.valueCount; i++) {
                    this.size += next.lengths[i];
                }
            } else {
                next.currentEditor = null;
                for (int i2 = 0; i2 < this.valueCount; i2++) {
                    this.fileSystem.delete(next.cleanFiles[i2]);
                    this.fileSystem.delete(next.dirtyFiles[i2]);
                }
                it.remove();
            }
        }
    }

    private void readJournal() throws IOException {
        setTookMs b = ChuckerDatabase.b(this.fileSystem.source(this.journalFile));
        try {
            String r = b.r();
            String r2 = b.r();
            String r3 = b.r();
            String r4 = b.r();
            String r5 = b.r();
            if (!MAGIC.equals(r) || !VERSION_1.equals(r2) || !Integer.toString(this.appVersion).equals(r3) || !Integer.toString(this.valueCount).equals(r4) || !"".equals(r5)) {
                StringBuilder sb = new StringBuilder("unexpected journal header: [");
                sb.append(r);
                sb.append(", ");
                sb.append(r2);
                sb.append(", ");
                sb.append(r4);
                sb.append(", ");
                sb.append(r5);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(b.r());
                    i++;
                } catch (EOFException e) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (!b.f()) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = newJournalWriter();
                    }
                    Util.closeQuietly(b);
                    return;
                }
            }
        } catch (Throwable th) {
            Util.closeQuietly(b);
            throw th;
        }
    }

    private void readJournalLine(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                String substring = str.substring(i);
                str2 = substring;
                if (indexOf == 6) {
                    str2 = substring;
                    if (str.startsWith(REMOVE)) {
                        this.lruEntries.remove(substring);
                        return;
                    }
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            Entry entry = this.lruEntries.get(str2);
            Entry entry2 = entry;
            if (entry == null) {
                entry2 = new Entry(str2);
                this.lruEntries.put(str2, entry2);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(CLEAN)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                entry2.readable = true;
                entry2.currentEditor = null;
                entry2.setLengths(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(DIRTY)) {
                entry2.currentEditor = new Editor(entry2);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(READ)) {
                StringBuilder sb = new StringBuilder("unexpected journal line: ");
                sb.append(str);
                throw new IOException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("unexpected journal line: ");
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
    }

    private void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.initialized && !this.closed) {
                Entry[] entryArr = (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()]);
                for (Entry entry : entryArr) {
                    if (entry.currentEditor != null) {
                        entry.currentEditor.abort();
                    }
                }
                trimToSize();
                this.journalWriter.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        }
    }

    final void completeEdit(Editor editor, boolean z) throws IOException {
        synchronized (this) {
            Entry entry = editor.entry;
            if (entry.currentEditor == editor) {
                int i = 0;
                if (z) {
                    i = 0;
                    if (!entry.readable) {
                        int i2 = 0;
                        while (true) {
                            i = 0;
                            if (i2 >= this.valueCount) {
                                break;
                            } else if (!editor.written[i2]) {
                                editor.abort();
                                StringBuilder sb = new StringBuilder();
                                sb.append("Newly created entry didn't create value for index ");
                                sb.append(i2);
                                throw new IllegalStateException(sb.toString());
                            } else if (!this.fileSystem.exists(entry.dirtyFiles[i2])) {
                                editor.abort();
                                return;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                while (i < this.valueCount) {
                    File file = entry.dirtyFiles[i];
                    if (!z) {
                        this.fileSystem.delete(file);
                    } else if (this.fileSystem.exists(file)) {
                        File file2 = entry.cleanFiles[i];
                        this.fileSystem.rename(file, file2);
                        long j = entry.lengths[i];
                        long size = this.fileSystem.size(file2);
                        entry.lengths[i] = size;
                        this.size = (this.size - j) + size;
                    }
                    i++;
                }
                this.redundantOpCount++;
                entry.currentEditor = null;
                if (entry.readable || z) {
                    entry.readable = true;
                    this.journalWriter.e(CLEAN).e(32);
                    this.journalWriter.e(entry.key);
                    entry.writeLengths(this.journalWriter);
                    this.journalWriter.e(10);
                    if (z) {
                        long j2 = this.nextSequenceNumber;
                        this.nextSequenceNumber = 1 + j2;
                        entry.sequenceNumber = j2;
                    }
                } else {
                    this.lruEntries.remove(entry.key);
                    this.journalWriter.e(REMOVE).e(32);
                    this.journalWriter.e(entry.key);
                    this.journalWriter.e(10);
                }
                this.journalWriter.flush();
                if (this.size > this.maxSize || journalRebuildRequired()) {
                    this.executor.execute(this.cleanupRunnable);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    @Nullable
    public final Editor edit(String str) throws IOException {
        return edit(str, -1);
    }

    final Editor edit(String str, long j) throws IOException {
        synchronized (this) {
            initialize();
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (j != -1 && (entry == null || entry.sequenceNumber != j)) {
                return null;
            }
            if (entry != null && entry.currentEditor != null) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                this.journalWriter.e(DIRTY).e(32).e(str).e(10);
                this.journalWriter.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                Entry entry2 = entry;
                if (entry == null) {
                    entry2 = new Entry(str);
                    this.lruEntries.put(str, entry2);
                }
                Editor editor = new Editor(entry2);
                entry2.currentEditor = editor;
                return editor;
            }
            this.executor.execute(this.cleanupRunnable);
            return null;
        }
    }

    public final void evictAll() throws IOException {
        synchronized (this) {
            initialize();
            for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
                removeEntry(entry);
            }
            this.mostRecentTrimFailed = false;
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        synchronized (this) {
            if (this.initialized) {
                checkNotClosed();
                trimToSize();
                this.journalWriter.flush();
            }
        }
    }

    public final Snapshot get(String str) throws IOException {
        synchronized (this) {
            initialize();
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (entry != null && entry.readable) {
                Snapshot snapshot = entry.snapshot();
                if (snapshot == null) {
                    return null;
                }
                this.redundantOpCount++;
                this.journalWriter.e(READ).e(32).e(str).e(10);
                if (journalRebuildRequired()) {
                    this.executor.execute(this.cleanupRunnable);
                }
                return snapshot;
            }
            return null;
        }
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final long getMaxSize() {
        long j;
        synchronized (this) {
            j = this.maxSize;
        }
        return j;
    }

    public final void initialize() throws IOException {
        synchronized (this) {
            if (!this.initialized) {
                if (this.fileSystem.exists(this.journalFileBackup)) {
                    if (this.fileSystem.exists(this.journalFile)) {
                        this.fileSystem.delete(this.journalFileBackup);
                    } else {
                        this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                    }
                }
                if (this.fileSystem.exists(this.journalFile)) {
                    try {
                        readJournal();
                        processJournal();
                        this.initialized = true;
                        return;
                    } catch (IOException e) {
                        Platform platform = Platform.get();
                        StringBuilder sb = new StringBuilder("DiskLruCache ");
                        sb.append(this.directory);
                        sb.append(" is corrupt: ");
                        sb.append(e.getMessage());
                        sb.append(", removing");
                        platform.log(5, sb.toString(), e);
                        delete();
                        this.closed = false;
                    }
                }
                rebuildJournal();
                this.initialized = true;
            }
        }
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.closed;
        }
        return z;
    }

    final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    final void rebuildJournal() throws IOException {
        synchronized (this) {
            setScheme$com_github_ChuckerTeam_Chucker_library setscheme_com_github_chuckerteam_chucker_library = this.journalWriter;
            if (setscheme_com_github_chuckerteam_chucker_library != null) {
                setscheme_com_github_chuckerteam_chucker_library.close();
            }
            setScheme$com_github_ChuckerTeam_Chucker_library d = ChuckerDatabase.d(this.fileSystem.sink(this.journalFileTmp));
            d.e(MAGIC).e(10);
            d.e(VERSION_1).e(10);
            d.j((long) this.appVersion).e(10);
            d.j((long) this.valueCount).e(10);
            d.e(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.currentEditor != null) {
                    d.e(DIRTY).e(32);
                    d.e(entry.key);
                    d.e(10);
                } else {
                    d.e(CLEAN).e(32);
                    d.e(entry.key);
                    entry.writeLengths(d);
                    d.e(10);
                }
            }
            d.close();
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        }
    }

    public final boolean remove(String str) throws IOException {
        synchronized (this) {
            initialize();
            checkNotClosed();
            validateKey(str);
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                return false;
            }
            boolean removeEntry = removeEntry(entry);
            if (removeEntry && this.size <= this.maxSize) {
                this.mostRecentTrimFailed = false;
            }
            return removeEntry;
        }
    }

    final boolean removeEntry(Entry entry) throws IOException {
        if (entry.currentEditor != null) {
            entry.currentEditor.detach();
        }
        for (int i = 0; i < this.valueCount; i++) {
            this.fileSystem.delete(entry.cleanFiles[i]);
            this.size -= entry.lengths[i];
            entry.lengths[i] = 0;
        }
        this.redundantOpCount++;
        this.journalWriter.e(REMOVE).e(32).e(entry.key).e(10);
        this.lruEntries.remove(entry.key);
        if (!journalRebuildRequired()) {
            return true;
        }
        this.executor.execute(this.cleanupRunnable);
        return true;
    }

    public final void setMaxSize(long j) {
        synchronized (this) {
            this.maxSize = j;
            if (this.initialized) {
                this.executor.execute(this.cleanupRunnable);
            }
        }
    }

    public final long size() throws IOException {
        long j;
        synchronized (this) {
            initialize();
            j = this.size;
        }
        return j;
    }

    public final Iterator<Snapshot> snapshots() throws IOException {
        3 r0;
        synchronized (this) {
            initialize();
            r0 = new 3(this);
        }
        return r0;
    }

    final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            removeEntry(this.lruEntries.values().iterator().next());
        }
        this.mostRecentTrimFailed = false;
    }
}
