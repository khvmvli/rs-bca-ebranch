package o;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* loaded from: classes-dex2jar.jar:o/setPivotY.class */
public class setPivotY {
    public static Interpolator d(Context context, int i) throws Resources.NotFoundException {
        return AnimationUtils.loadInterpolator(context, i);
    }
}
