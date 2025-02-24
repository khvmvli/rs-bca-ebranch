package o;

import android.graphics.Matrix;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setTrimPathOffset.class */
public class setTrimPathOffset extends getTrimPathStart {
    private static boolean a = true;
    private static boolean e = true;

    @Override // o.setTrimPathEnd
    public void a(View view, Matrix matrix) {
        if (e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError e2) {
                e = false;
            }
        }
    }

    @Override // o.setTrimPathEnd
    public void e(View view, Matrix matrix) {
        if (a) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError e2) {
                a = false;
            }
        }
    }
}
