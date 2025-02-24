package o;

import android.os.Build;
/* loaded from: classes-dex2jar.jar:o/realmSet$emergencyContactPhoneNumber.class */
public final class realmSet$emergencyContactPhoneNumber {
    private static volatile boolean e = !e();

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
