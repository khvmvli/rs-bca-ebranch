package o;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* loaded from: classes2-dex2jar.jar:o/unbindViews.class */
public final class unbindViews {
    public static final TimeInterpolator c = new LinearInterpolator();
    public static final TimeInterpolator d = new onDestroy();
    public static final TimeInterpolator a = new onCreateOptionsMenu();
    public static final TimeInterpolator e = new onCreateContextMenu();
    public static final TimeInterpolator b = new DecelerateInterpolator();

    public static float b(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : f + (((f5 - f3) / (f4 - f3)) * (f2 - f));
    }
}
