package o;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
/* loaded from: classes-dex2jar.jar:o/setProgressBackgroundColorSchemeColor.class */
final class setProgressBackgroundColorSchemeColor implements TypeEvaluator<Rect> {
    private Rect d;

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Rect evaluate(float f, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i = rect3.left + ((int) (((float) (rect4.left - rect3.left)) * f));
        int i2 = rect3.top + ((int) (((float) (rect4.top - rect3.top)) * f));
        int i3 = rect3.right + ((int) (((float) (rect4.right - rect3.right)) * f));
        int i4 = rect3.bottom + ((int) (((float) (rect4.bottom - rect3.bottom)) * f));
        Rect rect5 = this.d;
        if (rect5 == null) {
            return new Rect(i, i2, i3, i4);
        }
        rect5.set(i, i2, i3, i4);
        return this.d;
    }
}
