package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.ListenerClass;
import o.OnPageChange;
import o.R;
import o.findRequiredView;
import o.setCentered;
/* loaded from: classes-dex2jar.jar:o/setPageColor.class */
public abstract class setPageColor implements ButterKnife, OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver, doClick {
    BlurMaskFilter a;
    OnPageChange d;
    final setText f;
    final R.style g;
    final setCentered h;
    boolean i;
    private final String l;

    /* renamed from: o */
    private R.attr f259o;
    private setPageColor p;
    private final Paint t;
    private Paint u;
    private setPageColor v;
    private List<setPageColor> w;
    private boolean x;
    private final Path y = new Path();
    private final Matrix r = new Matrix();
    private final Paint k = new BindInt(1);
    private final Paint n = new BindInt(1, PorterDuff.Mode.DST_IN);
    private final Paint m = new BindInt(1, PorterDuff.Mode.DST_OUT);
    private final Paint j = new BindInt(PorterDuff.Mode.CLEAR);
    private final RectF D = new RectF();
    private final RectF q = new RectF();
    private final RectF s = new RectF();
    private final RectF A = new RectF();
    final Matrix b = new Matrix();
    public final List<OnPageChange.Callback<?, ?>> e = new ArrayList();
    float c = 0.0f;

    /* renamed from: o.setPageColor$4 */
    /* loaded from: classes-dex2jar.jar:o/setPageColor$4.class */
    public static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[findRequiredView.write.values().length];
            b = iArr;
            try {
                iArr[findRequiredView.write.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[findRequiredView.write.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[findRequiredView.write.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[findRequiredView.write.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            int[] iArr2 = new int[setCentered$MediaBrowserCompat$CustomActionResultReceiver.values().length];
            a = iArr2;
            try {
                iArr2[setCentered$MediaBrowserCompat$CustomActionResultReceiver.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                a[setCentered$MediaBrowserCompat$CustomActionResultReceiver.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                a[setCentered$MediaBrowserCompat$CustomActionResultReceiver.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
            try {
                a[setCentered$MediaBrowserCompat$CustomActionResultReceiver.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError e8) {
            }
            try {
                a[setCentered$MediaBrowserCompat$CustomActionResultReceiver.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError e9) {
            }
            try {
                a[setCentered$MediaBrowserCompat$CustomActionResultReceiver.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError e10) {
            }
            try {
                a[setCentered$MediaBrowserCompat$CustomActionResultReceiver.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError e11) {
            }
        }
    }

    public setPageColor(setText settext, setCentered setcentered) {
        boolean z = true;
        BindInt bindInt = new BindInt(1);
        this.t = bindInt;
        this.i = true;
        this.f = settext;
        this.h = setcentered;
        StringBuilder sb = new StringBuilder();
        sb.append(setcentered.i);
        sb.append("#draw");
        this.l = sb.toString();
        if (setcentered.j == setCentered.read.INVERT) {
            bindInt.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            bindInt.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        R.style style = new R.style(setcentered.x);
        this.g = style;
        style.e(this);
        if (setcentered.h != null && !setcentered.h.isEmpty()) {
            R.attr attr = new R.attr(setcentered.h);
            this.f259o = attr;
            for (OnPageChange.Callback<getFloat, Path> callback : attr.b) {
                callback.d.add(this);
            }
            for (OnPageChange.Callback<Integer, Integer> callback2 : this.f259o.d) {
                if (callback2 != null) {
                    this.e.add(callback2);
                }
                callback2.d.add(this);
            }
        }
        if (!this.h.d.isEmpty()) {
            OnPageChange onPageChange = new OnPageChange(this.h.d);
            this.d = onPageChange;
            onPageChange.a = true;
            this.d.d.add(new OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setPageColor.5
                @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
                public final void a() {
                    setPageColor setpagecolor = setPageColor.this;
                    boolean z2 = setpagecolor.d.i() == 1.0f;
                    if (z2 != setpagecolor.i) {
                        setpagecolor.i = z2;
                        setpagecolor.f.invalidateSelf();
                    }
                }
            });
            z = this.d.h().floatValue() != 1.0f ? false : z;
            if (z != this.i) {
                this.i = z;
                this.f.invalidateSelf();
            }
            OnPageChange onPageChange2 = this.d;
            if (onPageChange2 != null) {
                this.e.add(onPageChange2);
            }
        } else if (true != this.i) {
            this.i = true;
            this.f.invalidateSelf();
        }
    }

    private void c() {
        if (this.w == null) {
            if (this.v == null) {
                this.w = Collections.emptyList();
                return;
            }
            this.w = new ArrayList();
            for (setPageColor setpagecolor = this.v; setpagecolor != null; setpagecolor = setpagecolor.v) {
                this.w.add(setpagecolor);
            }
        }
    }

    private void d(float f) {
        BindFloat bindFloat = this.f.d.f77o;
        String str = this.h.i;
        if (bindFloat.c) {
            AvailableBookingTimeROActivity_ViewBinding availableBookingTimeROActivity_ViewBinding = bindFloat.a.get(str);
            AvailableBookingTimeROActivity_ViewBinding availableBookingTimeROActivity_ViewBinding2 = availableBookingTimeROActivity_ViewBinding;
            if (availableBookingTimeROActivity_ViewBinding == null) {
                availableBookingTimeROActivity_ViewBinding2 = new AvailableBookingTimeROActivity_ViewBinding();
                bindFloat.a.put(str, availableBookingTimeROActivity_ViewBinding2);
            }
            float f2 = availableBookingTimeROActivity_ViewBinding2.b + f;
            availableBookingTimeROActivity_ViewBinding2.b = f2;
            int i = availableBookingTimeROActivity_ViewBinding2.d + 1;
            availableBookingTimeROActivity_ViewBinding2.d = i;
            if (i == Integer.MAX_VALUE) {
                availableBookingTimeROActivity_ViewBinding2.b = f2 / 2.0f;
                availableBookingTimeROActivity_ViewBinding2.d = i / 2;
            }
            if (str.equals("__container")) {
                Iterator<Object> it = bindFloat.b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public static setPageColor e(setAnimation setanimation, setCentered setcentered, setText settext, BindAnim bindAnim) {
        switch (AnonymousClass4.a[setcentered.g.ordinal()]) {
            case 1:
                return new setApplyingOpacityToLayersEnabled(settext, setcentered, setanimation);
            case 2:
                return new setAnimation(settext, setcentered, bindAnim.k.get(setcentered.f204o), bindAnim);
            case 3:
                return new setAnimationFromUrl(settext, setcentered);
            case 4:
                return new setRealViewCount(settext, setcentered);
            case 5:
                return new setAnimationFromJson(settext, setcentered);
            case 6:
                return new setCacheComposition(settext, setcentered);
            default:
                StringBuilder sb = new StringBuilder("Unknown layer type ");
                sb.append(setcentered.g);
                AvailableBookingTimeActivity_ViewBinding.b(sb.toString());
                return null;
        }
    }

    private void e(Canvas canvas) {
        apply.c("Layer#clearLayer");
        canvas.drawRect(this.D.left - 1.0f, this.D.top - 1.0f, this.D.right + 1.0f, this.D.bottom + 1.0f, this.j);
        apply.d("Layer#clearLayer");
    }

    @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        this.f.invalidateSelf();
    }

    @Override // o.doClick
    public <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        this.g.a(t, onclickbcamobile);
    }

    public final void a(OnPageChange.Callback<?, ?> callback) {
        this.e.remove(callback);
    }

    public setSafeMode b() {
        return this.h.e;
    }

    public void b(float f) {
        R.style style = this.g;
        OnPageChange.Callback<Integer, Integer> callback = style.b;
        if (callback != null) {
            callback.b(f);
        }
        OnPageChange.Callback<?, Float> callback2 = style.j;
        if (callback2 != null) {
            callback2.b(f);
        }
        OnPageChange.Callback<?, Float> callback3 = style.e;
        if (callback3 != null) {
            callback3.b(f);
        }
        OnPageChange.Callback<PointF, PointF> callback4 = style.c;
        if (callback4 != null) {
            callback4.b(f);
        }
        OnPageChange.Callback<?, PointF> callback5 = style.d;
        if (callback5 != null) {
            callback5.b(f);
        }
        OnPageChange.Callback<BN6PembayaranTundaActivity_ViewBinding, BN6PembayaranTundaActivity_ViewBinding> callback6 = style.h;
        if (callback6 != null) {
            callback6.b(f);
        }
        OnPageChange.Callback<Float, Float> callback7 = style.a;
        if (callback7 != null) {
            callback7.b(f);
        }
        OnPageChange onPageChange = style.g;
        if (onPageChange != null) {
            onPageChange.b(f);
        }
        OnPageChange onPageChange2 = style.i;
        if (onPageChange2 != null) {
            onPageChange2.b(f);
        }
        if (this.f259o != null) {
            for (int i = 0; i < this.f259o.b.size(); i++) {
                this.f259o.b.get(i).b(f);
            }
        }
        OnPageChange onPageChange3 = this.d;
        if (onPageChange3 != null) {
            onPageChange3.b(f);
        }
        setPageColor setpagecolor = this.p;
        int i2 = 0;
        if (setpagecolor != null) {
            setpagecolor.b(f);
            i2 = 0;
        }
        while (i2 < this.e.size()) {
            this.e.get(i2).b(f);
            i2++;
        }
    }

    abstract void b(Canvas canvas, Matrix matrix, int i);

    @Override // o.style
    public final void b(List<style> list, List<style> list2) {
    }

    public final void b(setPageColor setpagecolor) {
        this.p = setpagecolor;
    }

    public void b(boolean z) {
        if (z && this.u == null) {
            this.u = new BindInt();
        }
        this.x = z;
    }

    public final BlurMaskFilter c(float f) {
        if (this.c == f) {
            return this.a;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.a = blurMaskFilter;
        this.c = f;
        return blurMaskFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0686 A[SYNTHETIC] */
    @Override // o.ButterKnife
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void c(android.graphics.Canvas r8, android.graphics.Matrix r9, int r10) {
        /*
        // Method dump skipped, instructions count: 1909
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPageColor.c(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    void c(unbind unbind, int i, List<unbind> list, unbind unbind2) {
    }

    public ListenerClass.NONE d() {
        return this.h.c;
    }

    @Override // o.ButterKnife
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.D.set(0.0f, 0.0f, 0.0f, 0.0f);
        c();
        this.b.set(matrix);
        if (z) {
            List<setPageColor> list = this.w;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.b.preConcat(this.w.get(size).g.c());
                }
            } else {
                setPageColor setpagecolor = this.v;
                if (setpagecolor != null) {
                    this.b.preConcat(setpagecolor.g.c());
                }
            }
        }
        this.b.preConcat(this.g.c());
    }

    @Override // o.style
    public final String e() {
        return this.h.i;
    }

    public final void e(OnPageChange.Callback<?, ?> callback) {
        if (callback != null) {
            this.e.add(callback);
        }
    }

    public final void e(setPageColor setpagecolor) {
        this.v = setpagecolor;
    }

    @Override // o.doClick
    public final void e(unbind unbind, int i, List<unbind> list, unbind unbind2) {
        setPageColor setpagecolor = this.p;
        if (setpagecolor != null) {
            String str = setpagecolor.h.i;
            unbind unbind3 = new unbind(unbind2);
            unbind3.e.add(str);
            if (unbind.b(this.p.h.i, i)) {
                setPageColor setpagecolor2 = this.p;
                unbind unbind4 = new unbind(unbind3);
                unbind4.a = setpagecolor2;
                list.add(unbind4);
            }
            if (unbind.e(this.h.i, i)) {
                this.p.c(unbind, unbind.d(this.p.h.i, i) + i, list, unbind3);
            }
        }
        if (unbind.c(this.h.i, i)) {
            unbind unbind5 = unbind2;
            if (!"__container".equals(this.h.i)) {
                String str2 = this.h.i;
                unbind5 = new unbind(unbind2);
                unbind5.e.add(str2);
                if (unbind.b(this.h.i, i)) {
                    unbind unbind6 = new unbind(unbind5);
                    unbind6.a = this;
                    list.add(unbind6);
                }
            }
            if (unbind.e(this.h.i, i)) {
                c(unbind, i + unbind.d(this.h.i, i), list, unbind5);
            }
        }
    }
}
