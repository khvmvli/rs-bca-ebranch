package o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import o.OnPageChange;
/* loaded from: classes-dex2jar.jar:o/OnEditorAction.class */
public final class OnEditorAction extends BindString {
    private final int b;
    private final RectF d;
    private final setTrackDrawable<LinearGradient> f;
    private Unbinder g;
    private final OnPageChange.Callback<PointF, PointF> h;
    private final boolean i;
    private final OnPageChange.Callback<Utils, Utils> j;
    private final setTrackDrawable<RadialGradient> l;
    private final OnPageChange.Callback<PointF, PointF> m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final returnType f122o;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public OnEditorAction(o.setText r12, o.setPageColor r13, o.arrayFilteringNull r14) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: o.OnEditorAction.<init>(o.setText, o.setPageColor, o.arrayFilteringNull):void");
    }

    private int[] b(int[] iArr) {
        Unbinder unbinder = this.g;
        int[] iArr2 = iArr;
        if (unbinder != null) {
            Integer[] numArr = (Integer[]) unbinder.h();
            int i = 0;
            int i2 = 0;
            if (iArr.length != numArr.length) {
                int[] iArr3 = new int[numArr.length];
                while (true) {
                    iArr2 = iArr3;
                    if (i >= numArr.length) {
                        break;
                    }
                    iArr3[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                while (true) {
                    iArr2 = iArr;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr2;
    }

    private int c() {
        int round = Math.round(this.m.e() * ((float) this.b));
        int round2 = Math.round(this.h.e() * ((float) this.b));
        int round3 = Math.round(this.j.e() * ((float) this.b));
        int i = round != 0 ? round * 527 : 17;
        int i2 = i;
        if (round2 != 0) {
            i2 = i * 31 * round2;
        }
        int i3 = i2;
        if (round3 != 0) {
            i3 = i2 * 31 * round3;
        }
        return i3;
    }

    private RadialGradient d() {
        long c = (long) c();
        RadialGradient a = this.l.a(c, null);
        if (a != null) {
            return a;
        }
        PointF h = this.m.h();
        PointF h2 = this.h.h();
        Utils h3 = this.j.h();
        int[] b = b(h3.d);
        float[] fArr = h3.e;
        float f = h.x;
        float f2 = h.y;
        RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot((double) (h2.x - f), (double) (h2.y - f2)), b, fArr, Shader.TileMode.CLAMP);
        this.l.c(c, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.BindString, o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        a(t, onclickbcamobile);
        if (t == value.f297o) {
            if (this.g != null) {
                setPageColor setpagecolor = this.c;
                setpagecolor.e.remove(this.g);
            }
            if (onclickbcamobile == null) {
                this.g = null;
                return;
            }
            Unbinder unbinder = new Unbinder(onclickbcamobile);
            this.g = unbinder;
            unbinder.d.add(this);
            setPageColor setpagecolor2 = this.c;
            Unbinder unbinder2 = this.g;
            if (unbinder2 != null) {
                setpagecolor2.e.add(unbinder2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.BindString, o.ButterKnife
    public final void c(Canvas canvas, Matrix matrix, int i) {
        LinearGradient linearGradient;
        if (!this.i) {
            d(this.d, matrix, false);
            if (this.f122o == returnType.LINEAR) {
                long c = (long) c();
                linearGradient = this.f.a(c, null);
                if (linearGradient == null) {
                    PointF h = this.m.h();
                    PointF h2 = this.h.h();
                    Utils h3 = this.j.h();
                    linearGradient = new LinearGradient(h.x, h.y, h2.x, h2.y, b(h3.d), h3.e, Shader.TileMode.CLAMP);
                    this.f.c(c, linearGradient);
                }
            } else {
                linearGradient = d();
            }
            linearGradient.setLocalMatrix(matrix);
            this.a.setShader(linearGradient);
            c(canvas, matrix, i);
        }
    }

    @Override // o.style
    public final String e() {
        return this.n;
    }
}
