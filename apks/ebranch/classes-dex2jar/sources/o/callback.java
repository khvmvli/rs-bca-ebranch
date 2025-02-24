package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import o.OnPageChange;
import o.R;
/* loaded from: classes-dex2jar.jar:o/callback.class */
public final class callback implements ButterKnife, OnItemClick, OnCheckedChanged, OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver, OnFocusChange {
    private setDebug a;
    private final OnPageChange.Callback<Float, Float> b;
    private final setPageColor c;
    private final setText d;
    private final boolean e;
    private final String g;
    private final OnPageChange.Callback<Float, Float> i;
    private final R.style j;
    private final Matrix f = new Matrix();
    private final Path h = new Path();

    public callback(setText settext, setPageColor setpagecolor, castView castview) {
        this.d = settext;
        this.c = setpagecolor;
        this.g = castview.d;
        this.e = castview.a;
        OnPageChange onPageChange = new OnPageChange(castview.c.c);
        this.b = onPageChange;
        setpagecolor.e.add(onPageChange);
        onPageChange.d.add(this);
        OnPageChange onPageChange2 = new OnPageChange(castview.b.c);
        this.i = onPageChange2;
        setpagecolor.e.add(onPageChange2);
        onPageChange2.d.add(this);
        R.style style = new R.style(castview.e);
        this.j = style;
        style.c(setpagecolor);
        style.e(this);
    }

    @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        this.d.invalidateSelf();
    }

    @Override // o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        if (!this.j.a(t, onclickbcamobile)) {
            if (t == value.v) {
                this.b.d(onclickbcamobile);
            } else if (t == value.x) {
                this.i.d(onclickbcamobile);
            }
        }
    }

    @Override // o.OnCheckedChanged
    public final void a(ListIterator<style> listIterator) {
        if (this.a == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.a = new setDebug(this.d, this.c, "Repeater", this.e, arrayList, null);
        }
    }

    @Override // o.OnItemClick
    public final Path b() {
        Path b = this.a.b();
        this.h.reset();
        float floatValue = this.b.h().floatValue();
        float floatValue2 = this.i.h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f.set(this.j.e(((float) i) + floatValue2));
            this.h.addPath(b, this.f);
        }
        return this.h;
    }

    @Override // o.style
    public final void b(List<style> list, List<style> list2) {
        this.a.b(list, list2);
    }

    @Override // o.ButterKnife
    public final void c(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.b.h().floatValue();
        float floatValue2 = this.i.h().floatValue();
        float floatValue3 = this.j.j.h().floatValue() / 100.0f;
        float floatValue4 = this.j.e.h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f.set(matrix);
            float f = (float) i2;
            this.f.preConcat(this.j.e(f + floatValue2));
            this.a.c(canvas, this.f, (int) (((float) i) * BN6PembayaranActivity.b(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // o.ButterKnife
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.a.d(rectF, matrix, z);
    }

    @Override // o.style
    public final String e() {
        return this.g;
    }

    @Override // o.doClick
    public final void e(unbind unbind, int i, List<unbind> list, unbind unbind2) {
        BN6PembayaranActivity.c(unbind, i, list, unbind2, this);
    }
}
