package o;

import android.content.Context;
import android.os.Process;
/* loaded from: classes-dex2jar.jar:o/getMandatorySystemGestureInsets.class */
public final class getMandatorySystemGestureInsets {
    public static int a(Context context, String str) {
        return b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int b(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String d = setStatusBarBackgroundColor.d(str);
        if (d == null) {
            return 0;
        }
        String str3 = str2;
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str3 = packagesForUid[0];
        }
        return setStatusBarBackgroundColor.d(context, d, str3) != 0 ? -2 : 0;
    }
}
