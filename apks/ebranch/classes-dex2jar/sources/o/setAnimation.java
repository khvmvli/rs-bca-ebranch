package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.OnPageChange;
import o.setCentered;
/* loaded from: classes-dex2jar.jar:o/setAnimation.class */
public final class setAnimation extends setPageColor {
    private OnPageChange.Callback<Float, Float> n;

    /* renamed from: o */
    private final List<setPageColor> f195o = new ArrayList();
    private final RectF l = new RectF();
    private final RectF k = new RectF();
    private final Paint j = new Paint();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setAnimation$4 */
    /* loaded from: classes-dex2jar.jar:o/setAnimation$4.class */
    public static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[setCentered.read.values().length];
            a = iArr;
            try {
                iArr[setCentered.read.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[setCentered.read.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public setAnimation(setText settext, setCentered setcentered, List<setCentered> list, BindAnim bindAnim) {
        super(settext, setcentered);
        int i;
        setPageColor setpagecolor;
        ImmutableList immutableList = setcentered.y;
        if (immutableList != null) {
            OnPageChange onPageChange = new OnPageChange(immutableList.c);
            this.n = onPageChange;
            e(onPageChange);
            this.n.d.add(this);
        } else {
            this.n = null;
        }
        setTrackDrawable settrackdrawable = new setTrackDrawable(bindAnim.g.size());
        int size = list.size() - 1;
        setPageColor setpagecolor2 = null;
        while (true) {
            if (size >= 0) {
                setCentered setcentered2 = list.get(size);
                setPageColor e = setPageColor.e(this, setcentered2, settext, bindAnim);
                setpagecolor2 = setpagecolor2;
                if (e != null) {
                    settrackdrawable.c(e.h.f, e);
                    if (setpagecolor2 != null) {
                        setpagecolor2.b(e);
                        setpagecolor2 = null;
                    } else {
                        this.f195o.add(0, e);
                        int i2 = AnonymousClass4.a[setcentered2.j.ordinal()];
                        if (i2 != 1) {
                            setpagecolor2 = setpagecolor2;
                            if (i2 != 2) {
                            }
                        }
                        setpagecolor2 = e;
                    }
                }
                size--;
            }
        }
        for (i = 0; i < settrackdrawable.a(); i++) {
            setPageColor setpagecolor3 = (setPageColor) settrackdrawable.a(settrackdrawable.d(i), null);
            if (!(setpagecolor3 == null || (setpagecolor = (setPageColor) settrackdrawable.a(setpagecolor3.h.m, null)) == null)) {
                setpagecolor3.e(setpagecolor);
            }
        }
    }

    @Override // o.setPageColor, o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        a(t, onclickbcamobile);
        if (t != value.A) {
            return;
        }
        if (onclickbcamobile == null) {
            OnPageChange.Callback<Float, Float> callback = this.n;
            if (callback != null) {
                callback.d(null);
                return;
            }
            return;
        }
        Unbinder unbinder = new Unbinder(onclickbcamobile);
        this.n = unbinder;
        unbinder.d.add(this);
        e(this.n);
    }

    @Override // o.setPageColor
    public final void b(float f) {
        b(f);
        float f2 = f;
        if (this.n != null) {
            BindAnim bindAnim = this.f.d;
            f2 = ((this.n.h().floatValue() * this.h.b.a) - this.h.b.l) / ((bindAnim.d - bindAnim.l) + 0.01f);
        }
        float f3 = f2;
        if (this.n == null) {
            setCentered setcentered = this.h;
            float f4 = setcentered.s;
            BindAnim bindAnim2 = setcentered.b;
            f3 = f2 - (f4 / (bindAnim2.d - bindAnim2.l));
        }
        float f5 = f3;
        if (this.h.w != 0.0f) {
            f5 = f3;
            if (!"__container".equals(this.h.i)) {
                f5 = f3 / this.h.w;
            }
        }
        for (int size = this.f195o.size() - 1; size >= 0; size--) {
            this.f195o.get(size).b(f5);
        }
    }

    @Override // o.setPageColor
    final void b(Canvas canvas, Matrix matrix, int i) {
        apply.c("CompositionLayer#draw");
        this.k.set(0.0f, 0.0f, (float) this.h.l, (float) this.h.n);
        matrix.mapRect(this.k);
        boolean z = this.f.l && this.f195o.size() > 1 && i != 255;
        if (z) {
            this.j.setAlpha(i);
            copyNoRef.d(canvas, this.k, this.j);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f195o.size() - 1; size >= 0; size--) {
            if (!this.k.isEmpty() ? canvas.clipRect(this.k) : true) {
                this.f195o.get(size).c(canvas, matrix, i);
            }
        }
        canvas.restore();
        apply.d("CompositionLayer#draw");
    }

    @Override // o.setPageColor
    public final void b(boolean z) {
        b(z);
        for (setPageColor setpagecolor : this.f195o) {
            setpagecolor.b(z);
        }
    }

    @Override // o.setPageColor
    protected final void c(unbind unbind, int i, List<unbind> list, unbind unbind2) {
        for (int i2 = 0; i2 < this.f195o.size(); i2++) {
            this.f195o.get(i2).e(unbind, i, list, unbind2);
        }
    }

    @Override // o.setPageColor, o.ButterKnife
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        d(rectF, matrix, z);
        for (int size = this.f195o.size() - 1; size >= 0; size--) {
            this.l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f195o.get(size).d(this.l, this.b, true);
            rectF.union(this.l);
        }
    }
}
