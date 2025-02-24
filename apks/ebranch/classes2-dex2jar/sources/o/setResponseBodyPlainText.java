package o;

import android.view.animation.Interpolator;
/* loaded from: classes2-dex2jar.jar:o/setResponseBodyPlainText.class */
abstract class setResponseBodyPlainText implements Interpolator {
    private final float a;
    private final float[] b;

    public setResponseBodyPlainText(float[] fArr) {
        this.b = fArr;
        this.a = 1.0f / ((float) (fArr.length - 1));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.b;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = (float) min;
        float f3 = this.a;
        float f4 = (f - (f2 * f3)) / f3;
        float[] fArr2 = this.b;
        float f5 = fArr2[min];
        return f5 + (f4 * (fArr2[min + 1] - f5));
    }
}
