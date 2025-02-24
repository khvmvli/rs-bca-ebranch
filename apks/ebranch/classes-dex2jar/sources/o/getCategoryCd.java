package o;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes-dex2jar.jar:o/getCategoryCd.class */
public final class getCategoryCd implements Closeable {
    Writer a;
    final int b;
    int c;
    final File d;
    private final File f;
    private final File g;
    private final int h;
    private final File j;
    private long m;
    private long l = 0;
    private final LinkedHashMap<String, RemoteActionCompatParcelizer> k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: o */
    private long f142o = 0;
    final ThreadPoolExecutor e = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new IconCompatParcelizer((byte) 0));
    private final Callable<Void> i = new Callable<Void>() { // from class: o.getCategoryCd.3
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (getCategoryCd.this) {
                if (getCategoryCd.this.a == null) {
                    return null;
                }
                getCategoryCd.this.a();
                if (getCategoryCd.this.d()) {
                    getCategoryCd.this.e();
                    getCategoryCd.this.c = 0;
                }
                return null;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getCategoryCd$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements ThreadFactory {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread;
            synchronized (this) {
                thread = new Thread(runnable, "glide-disk-lru-cache-thread");
                thread.setPriority(1);
            }
            return thread;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getCategoryCd$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer {
        File[] a;
        write b;
        final String c;
        File[] d;
        final long[] e;
        boolean h;
        long j;

        private RemoteActionCompatParcelizer(String str) {
            getCategoryCd.this = r8;
            this.c = str;
            this.e = new long[r8.b];
            this.d = new File[r8.b];
            this.a = new File[r8.b];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < r8.b; i++) {
                sb.append(i);
                this.d[i] = new File(r8.d, sb.toString());
                sb.append(".tmp");
                this.a[i] = new File(r8.d, sb.toString());
                sb.setLength(length);
            }
        }

        /* synthetic */ RemoteActionCompatParcelizer(getCategoryCd getcategorycd, String str, byte b) {
            this(str);
        }

        public final String d() throws IOException {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.e;
            for (long j : jArr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        void d(String[] strArr) throws IOException {
            if (strArr.length == getCategoryCd.this.b) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.e[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException e) {
                        StringBuilder sb = new StringBuilder("unexpected journal line: ");
                        sb.append(Arrays.toString(strArr));
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder("unexpected journal line: ");
            sb2.append(Arrays.toString(strArr));
            throw new IOException(sb2.toString());
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getCategoryCd$write.class */
    public final class write {
        final boolean[] b;
        private boolean d;
        final RemoteActionCompatParcelizer e;

        private write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            getCategoryCd.this = r4;
            this.e = remoteActionCompatParcelizer;
            this.b = remoteActionCompatParcelizer.h ? null : new boolean[r4.b];
        }

        /* synthetic */ write(getCategoryCd getcategorycd, RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        public final void a() throws IOException {
            getCategoryCd.b(getCategoryCd.this, this, true);
            this.d = true;
        }

        public final File b(int i) throws IOException {
            File file;
            synchronized (getCategoryCd.this) {
                if (this.e.b == this) {
                    if (!this.e.h) {
                        this.b[0] = true;
                    }
                    file = this.e.a[0];
                    getCategoryCd.this.d.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }

        public final void c() throws IOException {
            getCategoryCd.b(getCategoryCd.this, this, false);
        }

        public final void e() {
            if (!this.d) {
                try {
                    c();
                } catch (IOException e) {
                }
            }
        }
    }

    private getCategoryCd(File file, int i, int i2, long j) {
        this.d = file;
        this.h = i;
        this.f = new File(file, "journal");
        this.g = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
        this.b = i2;
        this.m = j;
    }

    private void b() throws IOException {
        File file = this.g;
        if (!file.exists() || file.delete()) {
            Iterator<RemoteActionCompatParcelizer> it = this.k.values().iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer next = it.next();
                if (next.b == null) {
                    for (int i = 0; i < this.b; i++) {
                        this.l += next.e[i];
                    }
                } else {
                    next.b = null;
                    for (int i2 = 0; i2 < this.b; i2++) {
                        File file2 = next.d[i2];
                        if (!file2.exists() || file2.delete()) {
                            File file3 = next.a[i2];
                            if (file3.exists() && !file3.delete()) {
                                throw new IOException();
                            }
                        } else {
                            throw new IOException();
                        }
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IOException();
    }

    private static void b(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    static /* synthetic */ void b(getCategoryCd getcategorycd, write write2, boolean z) throws IOException {
        synchronized (getcategorycd) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = write2.e;
            if (remoteActionCompatParcelizer.b == write2) {
                int i = 0;
                if (z) {
                    i = 0;
                    if (!remoteActionCompatParcelizer.h) {
                        int i2 = 0;
                        while (true) {
                            i = 0;
                            if (i2 >= getcategorycd.b) {
                                break;
                            } else if (!write2.b[i2]) {
                                b(getCategoryCd.this, write2, false);
                                StringBuilder sb = new StringBuilder();
                                sb.append("Newly created entry didn't create value for index ");
                                sb.append(i2);
                                throw new IllegalStateException(sb.toString());
                            } else if (!remoteActionCompatParcelizer.a[i2].exists()) {
                                b(getCategoryCd.this, write2, false);
                                return;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                while (i < getcategorycd.b) {
                    File file = remoteActionCompatParcelizer.a[i];
                    if (z) {
                        if (file.exists()) {
                            File file2 = remoteActionCompatParcelizer.d[i];
                            file.renameTo(file2);
                            long j = remoteActionCompatParcelizer.e[i];
                            long length = file2.length();
                            remoteActionCompatParcelizer.e[i] = length;
                            getcategorycd.l = (getcategorycd.l - j) + length;
                        }
                    } else if (file.exists() && !file.delete()) {
                        throw new IOException();
                    }
                    i++;
                }
                getcategorycd.c++;
                remoteActionCompatParcelizer.b = null;
                if (remoteActionCompatParcelizer.h || z) {
                    remoteActionCompatParcelizer.h = true;
                    getcategorycd.a.append((CharSequence) "CLEAN");
                    getcategorycd.a.append(' ');
                    getcategorycd.a.append((CharSequence) remoteActionCompatParcelizer.c);
                    getcategorycd.a.append((CharSequence) remoteActionCompatParcelizer.d());
                    getcategorycd.a.append('\n');
                    if (z) {
                        long j2 = getcategorycd.f142o;
                        getcategorycd.f142o = 1 + j2;
                        remoteActionCompatParcelizer.j = j2;
                    }
                } else {
                    getcategorycd.k.remove(remoteActionCompatParcelizer.c);
                    getcategorycd.a.append((CharSequence) "REMOVE");
                    getcategorycd.a.append(' ');
                    getcategorycd.a.append((CharSequence) remoteActionCompatParcelizer.c);
                    getcategorycd.a.append('\n');
                }
                b(getcategorycd.a);
                if (getcategorycd.l > getcategorycd.m || getcategorycd.d()) {
                    getcategorycd.e.submit(getcategorycd.i);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    private void c() throws IOException {
        String e;
        String str;
        getCategoryIn getcategoryin = new getCategoryIn(new FileInputStream(this.f), getNextCategoryCd.b);
        try {
            String e2 = getcategoryin.e();
            String e3 = getcategoryin.e();
            String e4 = getcategoryin.e();
            String e5 = getcategoryin.e();
            String e6 = getcategoryin.e();
            if (!"libcore.io.DiskLruCache".equals(e2) || !"1".equals(e3) || !Integer.toString(this.h).equals(e4) || !Integer.toString(this.b).equals(e5) || !"".equals(e6)) {
                StringBuilder sb = new StringBuilder("unexpected journal header: [");
                sb.append(e2);
                sb.append(", ");
                sb.append(e3);
                sb.append(", ");
                sb.append(e5);
                sb.append(", ");
                sb.append(e6);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            boolean z = false;
            int i = 0;
            while (true) {
                try {
                    e = getcategoryin.e();
                    int indexOf = e.indexOf(32);
                    if (indexOf != -1) {
                        int i2 = indexOf + 1;
                        int indexOf2 = e.indexOf(32, i2);
                        if (indexOf2 == -1) {
                            String substring = e.substring(i2);
                            str = substring;
                            if (indexOf == 6) {
                                str = substring;
                                if (e.startsWith("REMOVE")) {
                                    this.k.remove(substring);
                                    i++;
                                }
                            }
                        } else {
                            str = e.substring(i2, indexOf2);
                        }
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.k.get(str);
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
                        if (remoteActionCompatParcelizer == null) {
                            remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer(this, str, (byte) 0);
                            this.k.put(str, remoteActionCompatParcelizer2);
                        }
                        if (indexOf2 != -1 && indexOf == 5 && e.startsWith("CLEAN")) {
                            String[] split = e.substring(indexOf2 + 1).split(" ");
                            remoteActionCompatParcelizer2.h = true;
                            remoteActionCompatParcelizer2.b = null;
                            remoteActionCompatParcelizer2.d(split);
                        } else if (indexOf2 == -1 && indexOf == 5 && e.startsWith("DIRTY")) {
                            remoteActionCompatParcelizer2.b = new write(this, remoteActionCompatParcelizer2, (byte) 0);
                        } else if (indexOf2 != -1 || indexOf != 4 || !e.startsWith("READ")) {
                            break;
                        }
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder("unexpected journal line: ");
                        sb2.append(e);
                        throw new IOException(sb2.toString());
                    }
                } catch (EOFException e7) {
                    this.c = i - this.k.size();
                    if (getcategoryin.b == -1) {
                        z = true;
                    }
                    if (z) {
                        e();
                    } else {
                        this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), getNextCategoryCd.b));
                    }
                    getNextCategoryCd.c(getcategoryin);
                    return;
                }
            }
            StringBuilder sb3 = new StringBuilder("unexpected journal line: ");
            sb3.append(e);
            throw new IOException(sb3.toString());
        } catch (Throwable th) {
            getNextCategoryCd.c(getcategoryin);
            throw th;
        }
    }

    private static void d(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static getCategoryCd e(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            getCategoryCd getcategorycd = new getCategoryCd(file, 1, 1, j);
            if (getcategorycd.f.exists()) {
                try {
                    getcategorycd.c();
                    getcategorycd.b();
                    return getcategorycd;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    getcategorycd.close();
                    getNextCategoryCd.e(getcategorycd.d);
                }
            }
            file.mkdirs();
            getCategoryCd getcategorycd2 = new getCategoryCd(file, 1, 1, j);
            getcategorycd2.e();
            return getcategorycd2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private boolean e(String str) throws IOException {
        synchronized (this) {
            if (this.a != null) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.k.get(str);
                if (remoteActionCompatParcelizer != null && remoteActionCompatParcelizer.b == null) {
                    for (int i = 0; i < this.b; i++) {
                        File file = remoteActionCompatParcelizer.d[i];
                        if (file.exists() && !file.delete()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("failed to delete ");
                            sb.append(file);
                            throw new IOException(sb.toString());
                        }
                        this.l -= remoteActionCompatParcelizer.e[i];
                        remoteActionCompatParcelizer.e[i] = 0;
                    }
                    this.c++;
                    this.a.append((CharSequence) "REMOVE");
                    this.a.append(' ');
                    this.a.append((CharSequence) str);
                    this.a.append('\n');
                    this.k.remove(str);
                    if (d()) {
                        this.e.submit(this.i);
                    }
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public write a(String str, long j) throws IOException {
        synchronized (this) {
            if (this.a != null) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.k.get(str);
                if (remoteActionCompatParcelizer == null) {
                    remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this, str, (byte) 0);
                    this.k.put(str, remoteActionCompatParcelizer);
                } else if (remoteActionCompatParcelizer.b != null) {
                    return null;
                }
                write write2 = new write(this, remoteActionCompatParcelizer, (byte) 0);
                remoteActionCompatParcelizer.b = write2;
                this.a.append((CharSequence) "DIRTY");
                this.a.append(' ');
                this.a.append((CharSequence) str);
                this.a.append('\n');
                b(this.a);
                return write2;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    void a() throws IOException {
        while (this.l > this.m) {
            e(this.k.entrySet().iterator().next().getKey());
        }
    }

    public final getCategoryCd$MediaBrowserCompat$CustomActionResultReceiver c(String str) throws IOException {
        synchronized (this) {
            if (this.a != null) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.k.get(str);
                if (remoteActionCompatParcelizer == null) {
                    return null;
                }
                if (!remoteActionCompatParcelizer.h) {
                    return null;
                }
                for (File file : remoteActionCompatParcelizer.d) {
                    if (!file.exists()) {
                        return null;
                    }
                }
                this.c++;
                this.a.append((CharSequence) "READ");
                this.a.append(' ');
                this.a.append((CharSequence) str);
                this.a.append('\n');
                if (d()) {
                    this.e.submit(this.i);
                }
                return new getCategoryCd$MediaBrowserCompat$CustomActionResultReceiver(this, str, remoteActionCompatParcelizer.j, remoteActionCompatParcelizer.d, remoteActionCompatParcelizer.e, (byte) 0);
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.a != null) {
                Iterator it = new ArrayList(this.k.values()).iterator();
                while (it.hasNext()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) it.next();
                    if (remoteActionCompatParcelizer.b != null) {
                        remoteActionCompatParcelizer.b.c();
                    }
                }
                a();
                d(this.a);
                this.a = null;
            }
        }
    }

    boolean d() {
        int i = this.c;
        return i >= 2000 && i >= this.k.size();
    }

    void e() throws IOException {
        synchronized (this) {
            Writer writer = this.a;
            if (writer != null) {
                d(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g), getNextCategoryCd.b));
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.h));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.b));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.k.values()) {
                if (remoteActionCompatParcelizer.b != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(remoteActionCompatParcelizer.c);
                    sb.append('\n');
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(remoteActionCompatParcelizer.c);
                    sb2.append(remoteActionCompatParcelizer.d());
                    sb2.append('\n');
                    bufferedWriter.write(sb2.toString());
                }
            }
            d(bufferedWriter);
            if (this.f.exists()) {
                File file = this.f;
                File file2 = this.j;
                if (file2.exists() && !file2.delete()) {
                    throw new IOException();
                }
                if (!file.renameTo(file2)) {
                    throw new IOException();
                }
            }
            if (this.g.renameTo(this.f)) {
                this.j.delete();
                this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), getNextCategoryCd.b));
            } else {
                throw new IOException();
            }
        }
    }
}
