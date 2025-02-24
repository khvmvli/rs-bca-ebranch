package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* loaded from: classes-dex2jar.jar:o/getStrokeWidth.class */
class getStrokeWidth implements getTrimPathEnd {
    private final ViewGroupOverlay d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getStrokeWidth(ViewGroup viewGroup) {
        this.d = viewGroup.getOverlay();
    }

    @Override // o.setFillColor
    public void c(Drawable drawable) {
        this.d.add(drawable);
    }

    @Override // o.getTrimPathEnd
    public void c(View view) {
        this.d.add(view);
    }

    @Override // o.setFillColor
    public void e(Drawable drawable) {
        this.d.remove(drawable);
    }

    @Override // o.getTrimPathEnd
    public void e(View view) {
        this.d.remove(view);
    }
}
