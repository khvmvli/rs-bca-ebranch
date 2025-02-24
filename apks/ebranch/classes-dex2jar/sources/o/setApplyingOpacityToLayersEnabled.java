package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import o.ListenerClass;
/* loaded from: classes-dex2jar.jar:o/setApplyingOpacityToLayersEnabled.class */
public final class setApplyingOpacityToLayersEnabled extends setPageColor {
    private final setAnimation j;

    /* renamed from: o  reason: collision with root package name */
    private final setDebug f199o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setApplyingOpacityToLayersEnabled(setText settext, setCentered setcentered, setAnimation setanimation) {
        super(settext, setcentered);
        this.j = setanimation;
        setDebug setdebug = new setDebug(settext, this, new setViewPager("__container", setcentered.k, false));
        this.f199o = setdebug;
        setdebug.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // o.setPageColor
    public final setSafeMode b() {
        setSafeMode b = b();
        return b != null ? b : this.j.b();
    }

    @Override // o.setPageColor
    final void b(Canvas canvas, Matrix matrix, int i) {
        this.f199o.c(canvas, matrix, i);
    }

    @Override // o.setPageColor
    protected final void c(unbind unbind, int i, List<unbind> list, unbind unbind2) {
        this.f199o.e(unbind, i, list, unbind2);
    }

    @Override // o.setPageColor
    public final ListenerClass.NONE d() {
        ListenerClass.NONE d = d();
        return d != null ? d : this.j.d();
    }

    @Override // o.setPageColor, o.ButterKnife
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        d(rectF, matrix, z);
        this.f199o.d(rectF, this.b, z);
    }
}
