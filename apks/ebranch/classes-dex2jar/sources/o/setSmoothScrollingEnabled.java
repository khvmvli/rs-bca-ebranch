package o;

import android.os.Build;
/* loaded from: classes-dex2jar.jar:o/setSmoothScrollingEnabled.class */
public class setSmoothScrollingEnabled {
    @Deprecated
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Deprecated
    public static boolean e() {
        return Build.VERSION.SDK_INT >= 30;
    }
}
