package o;

import android.graphics.Bitmap;
import android.graphics.Matrix;
/* loaded from: classes2-dex2jar.jar:o/onClickedUbahCC278.class */
public final class onClickedUbahCC278 {
    public int b;
    Bitmap c;

    public onClickedUbahCC278(Bitmap bitmap, int i) {
        this.c = bitmap;
        this.b = i % 360;
    }

    public final Matrix b() {
        Matrix matrix = new Matrix();
        Bitmap bitmap = this.c;
        if (!(bitmap == null || this.b == 0)) {
            matrix.preTranslate((float) (-(bitmap.getWidth() / 2)), (float) (-(this.c.getHeight() / 2)));
            matrix.postRotate((float) this.b);
            int i = 0;
            boolean z = false;
            if (this.c != null) {
                if ((this.b / 90) % 2 != 0) {
                    z = true;
                }
                i = z ? this.c.getHeight() : this.c.getWidth();
            }
            matrix.postTranslate((float) (i / 2), (float) (d() / 2));
        }
        return matrix;
    }

    public final int d() {
        boolean z = false;
        if (this.c == null) {
            return 0;
        }
        if ((this.b / 90) % 2 != 0) {
            z = true;
        }
        return z ? this.c.getWidth() : this.c.getHeight();
    }
}
