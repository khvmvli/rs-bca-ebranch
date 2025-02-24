package o;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* loaded from: classes2-dex2jar.jar:o/BidangPekerjaanDialog.class */
public class BidangPekerjaanDialog implements TypeEvaluator<Matrix> {
    private final float[] c = new float[9];
    private final float[] d = new float[9];
    private final Matrix e = new Matrix();

    /* renamed from: e */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.c);
        matrix2.getValues(this.d);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.d;
            float f2 = fArr[i];
            float f3 = this.c[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.e.setValues(this.d);
        return this.e;
    }
}
