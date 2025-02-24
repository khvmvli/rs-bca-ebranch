package o;

import com.facebook.stetho.common.Utf8Charset;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
/* loaded from: classes-dex2jar.jar:o/getNextCategoryCd.class */
final class getNextCategoryCd {
    static final Charset b = Charset.forName("US-ASCII");
    static final Charset d = Charset.forName(Utf8Charset.NAME);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    e(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sb = new StringBuilder("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("not a readable directory: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }
}
