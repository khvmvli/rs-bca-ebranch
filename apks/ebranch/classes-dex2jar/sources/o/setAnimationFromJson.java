package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
/* loaded from: classes-dex2jar.jar:o/setAnimationFromJson.class */
public final class setAnimationFromJson extends setPageColor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setAnimationFromJson(setText settext, setCentered setcentered) {
        super(settext, setcentered);
    }

    @Override // o.setPageColor
    final void b(Canvas canvas, Matrix matrix, int i) {
    }

    @Override // o.setPageColor, o.ButterKnife
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
