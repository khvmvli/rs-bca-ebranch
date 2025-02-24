package o;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import o.R;
import o.castParam;
/* loaded from: classes-dex2jar.jar:o/OnClick.class */
public final class OnClick implements OnItemClick, OnCheckedChanged {
    private final castParam a;
    private final String c;
    private final Path b = new Path();
    private final Path g = new Path();
    private final Path d = new Path();
    private final List<OnItemClick> e = new ArrayList();

    /* renamed from: o.OnClick$1  reason: invalid class name */
    /* loaded from: classes-dex2jar.jar:o/OnClick$1.class */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[castParam.IconCompatParcelizer.values().length];
            e = iArr;
            try {
                iArr[castParam.IconCompatParcelizer.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                e[castParam.IconCompatParcelizer.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                e[castParam.IconCompatParcelizer.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                e[castParam.IconCompatParcelizer.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
            try {
                e[castParam.IconCompatParcelizer.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    public OnClick(castParam castparam) {
        this.c = castparam.d;
        this.a = castparam;
    }

    private void b(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.g.reset();
        this.b.reset();
        for (int size = this.e.size() - 1; size > 0; size--) {
            OnItemClick onItemClick = this.e.get(size);
            if (onItemClick instanceof setDebug) {
                setDebug setdebug = (setDebug) onItemClick;
                List<OnItemClick> d = setdebug.d();
                for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                    Path b = d.get(size2).b();
                    R.style style = setdebug.e;
                    if (style != null) {
                        matrix2 = style.c();
                    } else {
                        setdebug.c.reset();
                        matrix2 = setdebug.c;
                    }
                    b.transform(matrix2);
                    this.g.addPath(b);
                }
            } else {
                this.g.addPath(onItemClick.b());
            }
        }
        OnItemClick onItemClick2 = this.e.get(0);
        if (onItemClick2 instanceof setDebug) {
            setDebug setdebug2 = (setDebug) onItemClick2;
            List<OnItemClick> d2 = setdebug2.d();
            for (int i = 0; i < d2.size(); i++) {
                Path b2 = d2.get(i).b();
                R.style style2 = setdebug2.e;
                if (style2 != null) {
                    matrix = style2.c();
                } else {
                    setdebug2.c.reset();
                    matrix = setdebug2.c;
                }
                b2.transform(matrix);
                this.b.addPath(b2);
            }
        } else {
            this.b.set(onItemClick2.b());
        }
        this.d.op(this.b, this.g, op);
    }

    @Override // o.OnCheckedChanged
    public final void a(ListIterator<style> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            style previous = listIterator.previous();
            if (previous instanceof OnItemClick) {
                this.e.add((OnItemClick) previous);
                listIterator.remove();
            }
        }
    }

    @Override // o.OnItemClick
    public final Path b() {
        this.d.reset();
        if (this.a.a) {
            return this.d;
        }
        int i = AnonymousClass1.e[this.a.c.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                this.d.addPath(this.e.get(i2).b());
            }
        } else if (i == 2) {
            b(Path.Op.UNION);
        } else if (i == 3) {
            b(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            b(Path.Op.INTERSECT);
        } else if (i == 5) {
            b(Path.Op.XOR);
        }
        return this.d;
    }

    @Override // o.style
    public final void b(List<style> list, List<style> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).b(list, list2);
        }
    }

    @Override // o.style
    public final String e() {
        return this.c;
    }
}
