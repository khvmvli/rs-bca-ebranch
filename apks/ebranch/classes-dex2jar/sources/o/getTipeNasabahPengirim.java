package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/getTipeNasabahPengirim.class */
public final class getTipeNasabahPengirim {
    public static boolean b(Context context, int i) {
        if (!realmGet$jenisWarkatTransaksi.a.e(context).b(i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            realmGet$kitasKitapFlag e = realmGet$kitasKitapFlag.e(context);
            if (packageInfo == null) {
                return false;
            }
            if (realmGet$kitasKitapFlag.c(packageInfo, false)) {
                return true;
            }
            if (!realmGet$kitasKitapFlag.c(packageInfo, true)) {
                return false;
            }
            if (realmGet$lastEducation.honorsDebugCertificates(e.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }
}
