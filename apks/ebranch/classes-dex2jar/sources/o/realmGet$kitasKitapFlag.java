package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
import javax.annotation.Nullable;
@CheckReturnValue
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes-dex2jar.jar:o/realmGet$kitasKitapFlag.class */
public class realmGet$kitasKitapFlag {
    @Nullable
    private static realmGet$kitasKitapFlag e;
    public final Context a;
    private volatile String c;

    private realmGet$kitasKitapFlag(Context context) {
        this.a = context.getApplicationContext();
    }

    @Nullable
    private static realmGet$statusKewarganegaraanPengirim c(PackageInfo packageInfo, realmGet$statusKewarganegaraanPengirim... realmget_statuskewarganegaraanpengirimArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        realmGet$statusPendudukPengirim realmget_statuspendudukpengirim = new realmGet$statusPendudukPengirim(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < realmget_statuskewarganegaraanpengirimArr.length; i++) {
            if (realmget_statuskewarganegaraanpengirimArr[i].equals(realmget_statuspendudukpengirim)) {
                return realmget_statuskewarganegaraanpengirimArr[i];
            }
        }
        return null;
    }

    private final realmGet$tujuanTransaksiCode c(@Nullable String str) {
        realmGet$tujuanTransaksiCode a;
        if (str == null) {
            return realmGet$tujuanTransaksiCode.a("null pkg");
        }
        if (str.equals(this.c)) {
            return realmGet$tujuanTransaksiCode.d();
        }
        if (realmGet$tanggalJatuhTempoTransaksi.d()) {
            a = realmGet$tanggalJatuhTempoTransaksi.c(str, realmGet$lastEducation.honorsDebugCertificates(this.a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                boolean honorsDebugCertificates = realmGet$lastEducation.honorsDebugCertificates(this.a);
                if (packageInfo == null) {
                    a = realmGet$tujuanTransaksiCode.a("null pkg");
                } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                    a = realmGet$tujuanTransaksiCode.a("single cert required");
                } else {
                    realmGet$statusPendudukPengirim realmget_statuspendudukpengirim = new realmGet$statusPendudukPengirim(packageInfo.signatures[0].toByteArray());
                    String str2 = packageInfo.packageName;
                    a = realmGet$tanggalJatuhTempoTransaksi.e(str2, realmget_statuspendudukpengirim, honorsDebugCertificates, false);
                    if (a.c && packageInfo.applicationInfo != null && (packageInfo.applicationInfo.flags & 2) != 0 && realmGet$tanggalJatuhTempoTransaksi.e(str2, realmget_statuspendudukpengirim, false, true).c) {
                        a = realmGet$tujuanTransaksiCode.a("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                return realmGet$tujuanTransaksiCode.e("no pkg ".concat(str), e2);
            }
        }
        if (a.c) {
            this.c = str;
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if ("com.google.android.gms".equals(r7.packageName) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final boolean c(android.content.pm.PackageInfo r7, boolean r8) {
        /*
            r0 = r8
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L_0x004a
            r0 = r7
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "com.android.vending"
            r1 = r7
            java.lang.String r1 = r1.packageName
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0024
            r0 = r8
            r9 = r0
            java.lang.String r0 = "com.google.android.gms"
            r1 = r7
            java.lang.String r1 = r1.packageName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
        L_0x0024:
            r0 = r7
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L_0x0030
            goto L_0x0040
        L_0x0030:
            r0 = r10
            int r0 = r0.flags
            r1 = 129(0x81, float:1.81E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0040
            r0 = 1
            r9 = r0
            goto L_0x004a
        L_0x0040:
            r0 = 0
            r9 = r0
            goto L_0x004a
        L_0x0045:
            r0 = 0
            r10 = r0
            goto L_0x004e
        L_0x004a:
            r0 = r7
            r10 = r0
            r0 = r9
            r8 = r0
        L_0x004e:
            r0 = r7
            if (r0 == 0) goto L_0x007f
            r0 = r10
            android.content.pm.Signature[] r0 = r0.signatures
            if (r0 == 0) goto L_0x007f
            r0 = r8
            if (r0 == 0) goto L_0x0068
            r0 = r10
            o.realmGet$statusKewarganegaraanPengirim[] r1 = o.realmGet$sumberDanaTransaksiCode.a
            o.realmGet$statusKewarganegaraanPengirim r0 = c(r0, r1)
            r7 = r0
            goto L_0x0079
        L_0x0068:
            r0 = r10
            r1 = 1
            o.realmGet$statusKewarganegaraanPengirim[] r1 = new o.realmGet$statusKewarganegaraanPengirim[r1]
            r2 = r1
            r3 = 0
            o.realmGet$statusKewarganegaraanPengirim[] r4 = o.realmGet$sumberDanaTransaksiCode.a
            r5 = 0
            r4 = r4[r5]
            r2[r3] = r4
            o.realmGet$statusKewarganegaraanPengirim r0 = c(r0, r1)
            r7 = r0
        L_0x0079:
            r0 = r7
            if (r0 == 0) goto L_0x007f
            r0 = 1
            return r0
        L_0x007f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$kitasKitapFlag.c(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static realmGet$kitasKitapFlag e(Context context) {
        if (context != null) {
            synchronized (realmGet$kitasKitapFlag.class) {
                try {
                    if (e == null) {
                        realmGet$tanggalJatuhTempoTransaksi.d(context);
                        e = new realmGet$kitasKitapFlag(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return e;
        }
        throw new NullPointerException("null reference");
    }

    public final boolean d(int i) {
        realmGet$tujuanTransaksiCode realmget_tujuantransaksicode;
        int length;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            realmget_tujuantransaksicode = realmGet$tujuanTransaksiCode.a("no pkgs");
        } else {
            realmget_tujuantransaksicode = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    realmGet$tujuanTransaksiCode c = c(packagesForUid[i2]);
                    realmget_tujuantransaksicode = c;
                    if (c.c) {
                        break;
                    }
                    i2++;
                    realmget_tujuantransaksicode = c;
                } else if (realmget_tujuantransaksicode == null) {
                    throw new NullPointerException("null reference");
                }
            }
        }
        realmget_tujuantransaksicode.b();
        return realmget_tujuantransaksicode.c;
    }
}
