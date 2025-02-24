package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* loaded from: classes-dex2jar.jar:o/getSumberDanaTransaksi.class */
public final class getSumberDanaTransaksi {
    private static Boolean a;
    public static Boolean b;
    private static Boolean c;
    public static Boolean d;

    public static boolean b(Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return c.booleanValue();
    }

    public static boolean d(Context context) {
        if (e(context.getPackageManager())) {
            if (!(Build.VERSION.SDK_INT >= 24)) {
                return true;
            }
        }
        if (!b(context)) {
            return false;
        }
        if (!(Build.VERSION.SDK_INT >= 26)) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean e(PackageManager packageManager) {
        if (a == null) {
            a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return a.booleanValue();
    }
}
