package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import o.BindFont;
import o.OnPageChange;
import o.R;
import o.setSnap;
/* loaded from: classes-dex2jar.jar:o/BindViews.class */
public final class BindViews implements OnItemClick, OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver, OnFocusChange {
    private final setText a;
    private final targetType b;
    private final String d;
    private boolean e;
    private final OnPageChange.Callback<?, PointF> f;
    private final OnPageChange.Callback<?, PointF> h;
    private final Path c = new Path();
    private BindFont.TypefaceStyle j = new BindFont.TypefaceStyle();

    public BindViews(setText settext, setPageColor setpagecolor, targetType targettype) {
        this.d = targettype.c;
        this.a = settext;
        R.id idVar = new R.id(targettype.a.c);
        this.f = idVar;
        OnPageChange.Callback<PointF, PointF> a = targettype.e.a();
        this.h = a;
        this.b = targettype;
        setpagecolor.e.add(idVar);
        if (a != null) {
            setpagecolor.e.add(a);
        }
        idVar.d.add(this);
        a.d.add(this);
    }

    @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        this.e = false;
        this.a.invalidateSelf();
    }

    @Override // o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        if (t == value.g) {
            this.f.d(onclickbcamobile);
        } else if (t == value.p) {
            this.h.d(onclickbcamobile);
        }
    }

    @Override // o.OnItemClick
    public final Path b() {
        if (this.e) {
            return this.c;
        }
        this.c.reset();
        if (this.b.d) {
            this.e = true;
            return this.c;
        }
        PointF h = this.f.h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.c.reset();
        if (this.b.b) {
            float f5 = -f2;
            this.c.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.c.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.c.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.c.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.c.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.c.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.c.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.c.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.c.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.c.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF h2 = this.h.h();
        this.c.offset(h2.x, h2.y);
        this.c.close();
        this.j.a(this.c);
        this.e = true;
        return this.c;
    }

    @Override // o.style
    public final void b(List<style> list, List<style> list2) {
        for (int i = 0; i < list.size(); i++) {
            style style = list.get(i);
            if (style instanceof OnTouch) {
                OnTouch onTouch = (OnTouch) style;
                if (onTouch.i == setSnap.write.SIMULTANEOUSLY) {
                    this.j.d.add(onTouch);
                    onTouch.d.add(this);
                }
            }
        }
    }

    @Override // o.style
    public final String e() {
        return this.d;
    }

    @Override // o.doClick
    public final void e(unbind unbind, int i, List<unbind> list, unbind unbind2) {
        BN6PembayaranActivity.c(unbind, i, list, unbind2, this);
    }
}
