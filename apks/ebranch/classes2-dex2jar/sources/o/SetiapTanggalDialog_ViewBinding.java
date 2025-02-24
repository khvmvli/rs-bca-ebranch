package o;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2-dex2jar.jar:o/SetiapTanggalDialog_ViewBinding.class */
final class SetiapTanggalDialog_ViewBinding {
    SetiapTanggalDialog_ViewBinding() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(File file, List<SetiapTanggalDialog> list) {
        for (SetiapTanggalDialog setiapTanggalDialog : list) {
            InputStream inputStream = null;
            try {
                InputStream c = setiapTanggalDialog.c();
                if (c == null) {
                    inputStream = c;
                } else {
                    c(c, new File(file, setiapTanggalDialog.b()));
                    inputStream = c;
                }
            } catch (IOException e) {
            } catch (Throwable th) {
                CommonUtils.closeQuietly((Closeable) null);
                throw th;
            }
            CommonUtils.closeQuietly(inputStream);
        }
    }

    private static void c(InputStream inputStream, File file) throws IOException {
        Throwable th;
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            CommonUtils.closeQuietly(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPOutputStream = gZIPOutputStream2;
                        CommonUtils.closeQuietly(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
