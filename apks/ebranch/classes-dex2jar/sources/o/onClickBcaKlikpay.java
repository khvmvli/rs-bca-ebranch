package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
/* loaded from: classes-dex2jar.jar:o/onClickBcaKlikpay.class */
public class onClickBcaKlikpay<T> {
    public int a;
    public Float b;
    private final BindAnim c;
    public float d;
    public T e;
    public final Interpolator f;
    public PointF g;
    public final T h;
    public PointF i;
    public final float j;
    public int k;
    public final Interpolator l;
    public float m;
    public final Interpolator n;

    /* renamed from: o  reason: collision with root package name */
    private float f169o;
    private float s;

    public onClickBcaKlikpay(T t) {
        this.m = -3987645.8f;
        this.d = -3987645.8f;
        this.k = 784923401;
        this.a = 784923401;
        this.s = Float.MIN_VALUE;
        this.f169o = Float.MIN_VALUE;
        this.i = null;
        this.g = null;
        this.c = null;
        this.h = t;
        this.e = t;
        this.f = null;
        this.n = null;
        this.l = null;
        this.j = Float.MIN_VALUE;
        this.b = Float.valueOf(Float.MAX_VALUE);
    }

    public onClickBcaKlikpay(BindAnim bindAnim, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.m = -3987645.8f;
        this.d = -3987645.8f;
        this.k = 784923401;
        this.a = 784923401;
        this.s = Float.MIN_VALUE;
        this.f169o = Float.MIN_VALUE;
        this.i = null;
        this.g = null;
        this.c = bindAnim;
        this.h = t;
        this.e = t2;
        this.f = interpolator;
        this.n = null;
        this.l = null;
        this.j = f;
        this.b = f2;
    }

    public onClickBcaKlikpay(BindAnim bindAnim, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.m = -3987645.8f;
        this.d = -3987645.8f;
        this.k = 784923401;
        this.a = 784923401;
        this.s = Float.MIN_VALUE;
        this.f169o = Float.MIN_VALUE;
        this.i = null;
        this.g = null;
        this.c = bindAnim;
        this.h = t;
        this.e = t2;
        this.f = null;
        this.n = interpolator;
        this.l = interpolator2;
        this.j = f;
        this.b = f2;
    }

    public onClickBcaKlikpay(BindAnim bindAnim, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.m = -3987645.8f;
        this.d = -3987645.8f;
        this.k = 784923401;
        this.a = 784923401;
        this.s = Float.MIN_VALUE;
        this.f169o = Float.MIN_VALUE;
        this.i = null;
        this.g = null;
        this.c = bindAnim;
        this.h = t;
        this.e = t2;
        this.f = interpolator;
        this.n = interpolator2;
        this.l = interpolator3;
        this.j = f;
        this.b = f2;
    }

    public final float b() {
        BindAnim bindAnim = this.c;
        if (bindAnim == null) {
            return 0.0f;
        }
        if (this.s == Float.MIN_VALUE) {
            float f = this.j;
            float f2 = bindAnim.l;
            BindAnim bindAnim2 = this.c;
            this.s = (f - f2) / (bindAnim2.d - bindAnim2.l);
        }
        return this.s;
    }

    public final float e() {
        if (this.c == null) {
            return 1.0f;
        }
        if (this.f169o == Float.MIN_VALUE) {
            if (this.b == null) {
                this.f169o = 1.0f;
            } else {
                float b = b();
                float floatValue = this.b.floatValue();
                float f = this.j;
                BindAnim bindAnim = this.c;
                this.f169o = b + ((floatValue - f) / (bindAnim.d - bindAnim.l));
            }
        }
        return this.f169o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Keyframe{startValue=");
        sb.append(this.h);
        sb.append(", endValue=");
        sb.append(this.e);
        sb.append(", startFrame=");
        sb.append(this.j);
        sb.append(", endFrame=");
        sb.append(this.b);
        sb.append(", interpolator=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
