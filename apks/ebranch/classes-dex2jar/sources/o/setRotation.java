package o;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes-dex2jar.jar:o/setRotation.class */
public final class setRotation {
    public static <T extends View> T a(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T t = (T) viewGroup.getChildAt(i2).findViewById(i);
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}
