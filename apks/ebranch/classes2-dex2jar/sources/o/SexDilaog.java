package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2-dex2jar.jar:o/SexDilaog.class */
final class SexDilaog implements SetiapTanggalDialog {
    private final String a;
    private final String c;
    private final File e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SexDilaog(String str, String str2, File file) {
        this.a = str;
        this.c = str2;
        this.e = file;
    }

    private byte[] e() {
        byte[] bArr = new byte[8192];
        try {
            InputStream c = c();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (c == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (c == null) {
                    return null;
                }
                c.close();
                return null;
            }
            while (true) {
                try {
                    int read = c.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    gZIPOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            if (c != null) {
                c.close();
            }
            return byteArray;
        } catch (IOException e) {
            return null;
        }
    }

    @Override // o.SetiapTanggalDialog
    public final CrashlyticsReport.FilesPayload.File a() {
        byte[] e = e();
        return e != null ? CrashlyticsReport.FilesPayload.File.builder().setContents(e).setFilename(this.a).build() : null;
    }

    @Override // o.SetiapTanggalDialog
    public final String b() {
        return this.c;
    }

    @Override // o.SetiapTanggalDialog
    public final InputStream c() {
        if (!this.e.exists() || !this.e.isFile()) {
            return null;
        }
        try {
            return new FileInputStream(this.e);
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
