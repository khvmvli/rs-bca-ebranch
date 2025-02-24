package o;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.log.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
/* loaded from: classes2-dex2jar.jar:o/StatusKewarganegaraanDialog.class */
public final class StatusKewarganegaraanDialog implements SimpanDraftAndHitServiceDialog_ViewBinding {
    private static final Charset c = Charset.forName("UTF-8");
    private QueueFile b;
    private final int d;
    private final File e;

    public StatusKewarganegaraanDialog(File file, int i) {
        this.e = file;
        this.d = i;
    }

    private StatusKewarganegaraanDialog$MediaBrowserCompat$CustomActionResultReceiver d() {
        if (!this.e.exists()) {
            return null;
        }
        j();
        QueueFile queueFile = this.b;
        if (queueFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[queueFile.a()];
        try {
            this.b.c(new QueueFile.ElementReader() { // from class: o.StatusKewarganegaraanDialog.2
                @Override // com.google.firebase.crashlytics.internal.log.QueueFile.ElementReader
                public final void read(InputStream inputStream, int i) throws IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr2 = iArr;
                        iArr2[0] = iArr2[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e) {
            Logger.getLogger().e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new StatusKewarganegaraanDialog$MediaBrowserCompat$CustomActionResultReceiver(bArr, iArr[0]);
    }

    private void j() {
        if (this.b == null) {
            try {
                this.b = new QueueFile(this.e);
            } catch (IOException e) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Could not open log file: ");
                sb.append(this.e);
                logger.e(sb.toString(), e);
            }
        }
    }

    @Override // o.SimpanDraftAndHitServiceDialog_ViewBinding
    public final String a() {
        byte[] e = e();
        return e != null ? new String(e, c) : null;
    }

    @Override // o.SimpanDraftAndHitServiceDialog_ViewBinding
    public final void b() {
        CommonUtils.closeOrLog(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
        this.e.delete();
    }

    @Override // o.SimpanDraftAndHitServiceDialog_ViewBinding
    public final void c() {
        CommonUtils.closeOrLog(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    @Override // o.SimpanDraftAndHitServiceDialog_ViewBinding
    public final void d(long j, String str) {
        j();
        if (this.b != null) {
            String str2 = str;
            if (str == null) {
                str2 = "null";
            }
            try {
                int i = this.d / 4;
                String str3 = str2;
                if (str2.length() > i) {
                    StringBuilder sb = new StringBuilder("...");
                    sb.append(str2.substring(str2.length() - i));
                    str3 = sb.toString();
                }
                this.b.d(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str3.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
                while (!this.b.d() && this.b.a() > this.d) {
                    this.b.c();
                }
            } catch (IOException e) {
                Logger.getLogger().e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    @Override // o.SimpanDraftAndHitServiceDialog_ViewBinding
    public final byte[] e() {
        StatusKewarganegaraanDialog$MediaBrowserCompat$CustomActionResultReceiver d = d();
        if (d == null) {
            return null;
        }
        byte[] bArr = new byte[d.c];
        System.arraycopy(d.d, 0, bArr, 0, d.c);
        return bArr;
    }
}
