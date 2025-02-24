package o;

import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setStrokeWidth.class */
class setStrokeWidth extends setTrimPathOffset {
    private static boolean d = true;

    @Override // o.setTrimPathEnd
    public void d(View view, int i, int i2, int i3, int i4) {
        if (d) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError e) {
                d = false;
            }
        }
    }
}
