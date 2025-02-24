package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.R;
/* loaded from: classes-dex2jar.jar:o/setDebug.class */
public final class setDebug implements ButterKnife, OnItemClick, OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver, doClick {
    private final setText a;
    private final List<style> b;
    final Matrix c;
    private final boolean d;
    R.style e;
    private final Path f;
    private List<OnItemClick> g;
    private Paint h;
    private final String i;
    private RectF j;
    private final RectF n;

    public setDebug(setText settext, setPageColor setpagecolor, String str, boolean z, List<style> list, type type) {
        this.h = new BindInt();
        this.j = new RectF();
        this.c = new Matrix();
        this.f = new Path();
        this.n = new RectF();
        this.i = str;
        this.a = settext;
        this.d = z;
        this.b = list;
        if (type != null) {
            R.style style = new R.style(type);
            this.e = style;
            style.c(setpagecolor);
            this.e.e(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            style style2 = list.get(size);
            if (style2 instanceof OnCheckedChanged) {
                arrayList.add((OnCheckedChanged) style2);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((OnCheckedChanged) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }

    public setDebug(setText settext, setPageColor setpagecolor, setViewPager setviewpager) {
        this(settext, setpagecolor, setviewpager.d, setviewpager.a, b(settext, setpagecolor, setviewpager.e), e(setviewpager.e));
    }

    private static List<style> b(setText settext, setPageColor setpagecolor, List<name> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            style e = list.get(i).e(settext, setpagecolor);
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    private static type e(List<name> list) {
        for (int i = 0; i < list.size(); i++) {
            name name = list.get(i);
            if (name instanceof type) {
                return (type) name;
            }
        }
        return null;
    }

    @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        R.style style = this.e;
        if (style != null) {
            style.a(t, onclickbcamobile);
        }
    }

    @Override // o.OnItemClick
    public final Path b() {
        this.c.reset();
        R.style style = this.e;
        if (style != null) {
            this.c.set(style.c());
        }
        this.f.reset();
        if (this.d) {
            return this.f;
        }
        for (int size = this.b.size() - 1; size >= 0; size--) {
            style style2 = this.b.get(size);
            if (style2 instanceof OnItemClick) {
                this.f.addPath(((OnItemClick) style2).b(), this.c);
            }
        }
        return this.f;
    }

    @Override // o.style
    public final void b(List<style> list, List<style> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.b.size());
        arrayList.addAll(list);
        for (int size = this.b.size() - 1; size >= 0; size--) {
            style style = this.b.get(size);
            style.b(arrayList, this.b.subList(0, size));
            arrayList.add(style);
        }
    }

    @Override // o.ButterKnife
    public final void c(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        if (!this.d) {
            this.c.set(matrix);
            R.style style = this.e;
            int i2 = i;
            if (style != null) {
                this.c.preConcat(style.c());
                i2 = (int) ((((((float) (this.e.b == null ? 100 : this.e.b.h().intValue())) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            boolean z2 = false;
            if (this.a.l) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= this.b.size()) {
                        z = false;
                        break;
                    }
                    i4 = i4;
                    if (this.b.get(i3) instanceof ButterKnife) {
                        int i5 = i4 + 1;
                        i4 = i5;
                        if (i5 >= 2) {
                            z = true;
                            break;
                        }
                    }
                    i3++;
                }
                z2 = false;
                if (z) {
                    z2 = false;
                    if (i2 != 255) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
                d(this.j, this.c, true);
                this.h.setAlpha(i2);
                copyNoRef.d(canvas, this.j, this.h);
            }
            if (z2) {
                i2 = 255;
            }
            for (int size = this.b.size() - 1; size >= 0; size--) {
                style style2 = this.b.get(size);
                if (style2 instanceof ButterKnife) {
                    ((ButterKnife) style2).c(canvas, this.c, i2);
                }
            }
            if (z2) {
                canvas.restore();
            }
        }
    }

    public final List<OnItemClick> d() {
        if (this.g == null) {
            this.g = new ArrayList();
            for (int i = 0; i < this.b.size(); i++) {
                style style = this.b.get(i);
                if (style instanceof OnItemClick) {
                    this.g.add((OnItemClick) style);
                }
            }
        }
        return this.g;
    }

    @Override // o.ButterKnife
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        R.style style = this.e;
        if (style != null) {
            this.c.preConcat(style.c());
        }
        this.n.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.b.size() - 1; size >= 0; size--) {
            style style2 = this.b.get(size);
            if (style2 instanceof ButterKnife) {
                ((ButterKnife) style2).d(this.n, this.c, z);
                rectF.union(this.n);
            }
        }
    }

    @Override // o.style
    public final String e() {
        return this.i;
    }

    @Override // o.doClick
    public final void e(unbind unbind, int i, List<unbind> list, unbind unbind2) {
        if (unbind.c(this.i, i) || "__container".equals(this.i)) {
            unbind unbind3 = unbind2;
            if (!"__container".equals(this.i)) {
                String str = this.i;
                unbind3 = new unbind(unbind2);
                unbind3.e.add(str);
                if (unbind.b(this.i, i)) {
                    unbind unbind4 = new unbind(unbind3);
                    unbind4.a = this;
                    list.add(unbind4);
                }
            }
            if (unbind.e(this.i, i)) {
                int d = unbind.d(this.i, i);
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    style style = this.b.get(i2);
                    if (style instanceof doClick) {
                        ((doClick) style).e(unbind, i + d, list, unbind3);
                    }
                }
            }
        }
    }
}
