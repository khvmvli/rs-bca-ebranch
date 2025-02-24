package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* loaded from: classes-dex2jar.jar:o/restoreChildFragmentState.class */
final class restoreChildFragmentState implements Closeable {
    private final File a;
    private final File b;
    private final RandomAccessFile c;
    private final FileLock d;
    private final FileChannel e;
    private final long f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/restoreChildFragmentState$read.class */
    public static class read extends File {
        public long b = -1;

        public read(File file, String str) {
            super(file, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [long] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public restoreChildFragmentState(java.io.File r6, java.io.File r7) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: o.restoreChildFragmentState.<init>(java.io.File, java.io.File):void");
    }

    private void a() {
        File[] listFiles = this.a.listFiles(new FileFilter() { // from class: o.restoreChildFragmentState.4
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return !file.getName().equals("MultiDex.lock");
            }
        });
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder("Failed to list secondary dex dir content (");
            sb.append(this.a.getPath());
            sb.append(").");
            Log.w("MultiDex", sb.toString());
            return;
        }
        for (File file : listFiles) {
            StringBuilder sb2 = new StringBuilder("Trying to delete old file ");
            sb2.append(file.getPath());
            sb2.append(" of size ");
            sb2.append(file.length());
            Log.i("MultiDex", sb2.toString());
            if (!file.delete()) {
                StringBuilder sb3 = new StringBuilder("Failed to delete old file ");
                sb3.append(file.getPath());
                Log.w("MultiDex", sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder("Deleted old file ");
                sb4.append(file.getPath());
                Log.i("MultiDex", sb4.toString());
            }
        }
    }

    private static void a(Context context, String str, long j, long j2, List<read> list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        edit.putLong(sb.toString(), j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        edit.putLong(sb2.toString(), j2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("dex.number");
        edit.putInt(sb3.toString(), list.size() + 1);
        int i = 2;
        for (read read2 : list) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("dex.crc.");
            sb4.append(i);
            edit.putLong(sb4.toString(), read2.b);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("dex.time.");
            sb5.append(i);
            edit.putLong(sb5.toString(), read2.lastModified());
            i++;
        }
        edit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v131, types: [long] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.util.List<o.restoreChildFragmentState.read> b() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 670
        */
        throw new UnsupportedOperationException("Method not decompiled: o.restoreChildFragmentState.b():java.util.List");
    }

    private static void d(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        StringBuilder sb = new StringBuilder("tmp-");
        sb.append(str);
        File createTempFile = File.createTempFile(sb.toString(), ".zip", file.getParentFile());
        StringBuilder sb2 = new StringBuilder("Extracting ");
        sb2.append(createTempFile.getPath());
        Log.i("MultiDex", sb2.toString());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read2 = inputStream.read(bArr); read2 != -1; read2 = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read2);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Renaming to ");
                sb3.append(file.getPath());
                Log.i("MultiDex", sb3.toString());
                if (!createTempFile.renameTo(file)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to rename \"");
                    sb4.append(createTempFile.getAbsolutePath());
                    sb4.append("\" to \"");
                    sb4.append(file.getAbsolutePath());
                    sb4.append("\"");
                    throw new IOException(sb4.toString());
                }
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Failed to mark readonly \"");
            sb5.append(createTempFile.getAbsolutePath());
            sb5.append("\" (tmp of \"");
            sb5.append(file.getAbsolutePath());
            sb5.append("\")");
            throw new IOException(sb5.toString());
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
            }
            createTempFile.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [long] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.util.List<o.restoreChildFragmentState.read> e(android.content.Context r6, java.lang.String r7) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: o.restoreChildFragmentState.e(android.content.Context, java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v33, types: [long] */
    /* JADX WARN: Type inference failed for: r0v59, types: [long] */
    /* JADX WARN: Type inference failed for: r0v72, types: [long] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.util.List<? extends java.io.File> c(android.content.Context r9, java.lang.String r10, boolean r11) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: o.restoreChildFragmentState.c(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.release();
        this.e.close();
        this.c.close();
    }
}
