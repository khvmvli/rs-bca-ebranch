package o;

import android.os.Build;
import android.view.ViewGroup;
/* loaded from: classes-dex2jar.jar:o/setFillAlpha.class */
final class setFillAlpha {
    private static boolean a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError e) {
                a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError e) {
                a = false;
            }
        }
    }
}
