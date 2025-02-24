package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setStrokeAlpha.class */
public class setStrokeAlpha implements setFillColor {
    private final ViewOverlay b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setStrokeAlpha(View view) {
        this.b = view.getOverlay();
    }

    @Override // o.setFillColor
    public void c(Drawable drawable) {
        this.b.add(drawable);
    }

    @Override // o.setFillColor
    public void e(Drawable drawable) {
        this.b.remove(drawable);
    }
}
