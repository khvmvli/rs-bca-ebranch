package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2-dex2jar.jar:o/ReservasiCSDialog_ViewBinding.class */
final class ReservasiCSDialog_ViewBinding implements SetiapTanggalDialog {
    private final String b;
    private final String c;
    private final byte[] d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReservasiCSDialog_ViewBinding(String str, String str2, byte[] bArr) {
        this.c = str;
        this.b = str2;
        this.d = bArr;
    }

    private byte[] e() {
        byte[] bArr = this.d;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.d);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            return null;
        }
    }

    @Override // o.SetiapTanggalDialog
    public final CrashlyticsReport.FilesPayload.File a() {
        byte[] e = e();
        return e == null ? null : CrashlyticsReport.FilesPayload.File.builder().setContents(e).setFilename(this.c).build();
    }

    @Override // o.SetiapTanggalDialog
    public final String b() {
        return this.b;
    }

    @Override // o.SetiapTanggalDialog
    public final InputStream c() {
        byte[] bArr = this.d;
        return bArr == null || bArr.length == 0 ? null : new ByteArrayInputStream(this.d);
    }
}
