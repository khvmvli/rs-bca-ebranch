package o;

import android.app.Application;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
/* loaded from: classes-dex2jar.jar:o/tambahPemegangKartu.class */
public final class tambahPemegangKartu {
    public final boolean b;
    private final Context c;
    private final FingerprintManager e;

    public tambahPemegangKartu(Context context) {
        if ((context instanceof Application) && onClickHubungan.e) {
            if (onClickHubungan.b == null) {
                onClickHubungan.b = new CC26AFormKartuKreditFragment();
            }
            onClickHubungan.b.a("Passing an Application Context to RxFingerprint might cause issues when the authentication is active and the application changes orientation. Consider passing an Activity Context.");
        }
        this.c = context;
        boolean z = Build.VERSION.SDK_INT >= 23;
        this.b = z;
        if (z) {
            this.e = a();
        } else {
            this.e = null;
        }
    }

    private FingerprintManager a() {
        try {
            return (FingerprintManager) this.c.getSystemService("fingerprint");
        } catch (Exception | NoClassDefFoundError e) {
            if (!onClickHubungan.e) {
                return null;
            }
            if (onClickHubungan.b == null) {
                onClickHubungan.b = new CC26AFormKartuKreditFragment();
            }
            onClickHubungan.b.d("Device with SDK >=23 doesn't provide Fingerprint APIs", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r0.isHardwareDetected() == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean b() {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.b
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L_0x003b
            r0 = r3
            android.content.Context r0 = r0.c
            java.lang.String r1 = "android.permission.USE_FINGERPRINT"
            int r0 = r0.checkSelfPermission(r1)
            if (r0 != 0) goto L_0x001c
            r0 = 1
            r6 = r0
            goto L_0x001e
        L_0x001c:
            r0 = 0
            r6 = r0
        L_0x001e:
            r0 = r6
            if (r0 != 0) goto L_0x0025
            goto L_0x003b
        L_0x0025:
            r0 = r3
            android.hardware.fingerprint.FingerprintManager r0 = r0.e
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x003b
            r0 = r7
            boolean r0 = r0.isHardwareDetected()
            if (r0 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r0 = 0
            r5 = r0
        L_0x003d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tambahPemegangKartu.b():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r0.hasEnrolledFingerprints() == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean c() {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.b
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L_0x003b
            r0 = r3
            android.content.Context r0 = r0.c
            java.lang.String r1 = "android.permission.USE_FINGERPRINT"
            int r0 = r0.checkSelfPermission(r1)
            if (r0 != 0) goto L_0x001c
            r0 = 1
            r6 = r0
            goto L_0x001e
        L_0x001c:
            r0 = 0
            r6 = r0
        L_0x001e:
            r0 = r6
            if (r0 != 0) goto L_0x0025
            goto L_0x003b
        L_0x0025:
            r0 = r3
            android.hardware.fingerprint.FingerprintManager r0 = r0.e
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x003b
            r0 = r7
            boolean r0 = r0.hasEnrolledFingerprints()
            if (r0 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r0 = 0
            r5 = r0
        L_0x003d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tambahPemegangKartu.c():boolean");
    }
}
