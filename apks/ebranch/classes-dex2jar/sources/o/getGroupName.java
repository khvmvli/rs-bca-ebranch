package o;

import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/getGroupName.class */
class getGroupName extends setTrimPathStart {
    @Override // o.setTrimPathOffset, o.setTrimPathEnd
    public void a(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // o.getTrimPathStart, o.setTrimPathEnd
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // o.setTrimPathStart, o.setTrimPathEnd
    public void d(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // o.setStrokeWidth, o.setTrimPathEnd
    public void d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // o.getTrimPathStart, o.setTrimPathEnd
    public void e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // o.setTrimPathOffset, o.setTrimPathEnd
    public void e(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
