package o;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
/* loaded from: classes-dex2jar.jar:o/setStatusBarBackgroundColor.class */
public final class setStatusBarBackgroundColor {
    public static int d(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    public static String d(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}
