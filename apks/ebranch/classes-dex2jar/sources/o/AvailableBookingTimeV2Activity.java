package o;

import android.view.Choreographer;
/* loaded from: classes-dex2jar.jar:o/AvailableBookingTimeV2Activity.class */
public final class AvailableBookingTimeV2Activity extends retry implements Choreographer.FrameCallback {
    public BindAnim c;
    public float h = 1.0f;
    private boolean g = false;
    private long f = 0;
    public float a = 0.0f;
    private int j = 0;
    public float d = -2.1474836E9f;
    public float b = 2.1474836E9f;
    protected boolean e = false;

    private void n() {
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void a() {
        Choreographer.getInstance().removeFrameCallback(this);
        boolean z = false;
        this.e = false;
        if (this.h < 0.0f) {
            z = true;
        }
        d(z);
    }

    public final void a(float f) {
        if (this.a != f) {
            this.a = BN6PembayaranActivity.d(f, i(), g());
            this.f = 0;
            b();
        }
    }

    public final float c() {
        BindAnim bindAnim = this.c;
        if (bindAnim == null) {
            return 0.0f;
        }
        return (this.a - bindAnim.l) / (this.c.d - this.c.l);
    }

    public final void c(float f, float f2) {
        if (f <= f2) {
            BindAnim bindAnim = this.c;
            float f3 = bindAnim == null ? -3.4028235E38f : bindAnim.l;
            BindAnim bindAnim2 = this.c;
            float f4 = bindAnim2 == null ? Float.MAX_VALUE : bindAnim2.d;
            float d = BN6PembayaranActivity.d(f, f3, f4);
            float d2 = BN6PembayaranActivity.d(f2, f3, f4);
            if (d != this.d || d2 != this.b) {
                this.d = d;
                this.b = d2;
                a((float) ((int) BN6PembayaranActivity.d(this.a, d, d2)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        d();
        Choreographer.getInstance().removeFrameCallback(this);
        this.e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0208  */
    @Override // android.view.Choreographer.FrameCallback
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void doFrame(long r9) {
        /*
        // Method dump skipped, instructions count: 791
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AvailableBookingTimeV2Activity.doFrame(long):void");
    }

    public final void f() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.e = false;
    }

    public final float g() {
        BindAnim bindAnim = this.c;
        if (bindAnim == null) {
            return 0.0f;
        }
        float f = this.b;
        float f2 = f;
        if (f == 2.1474836E9f) {
            f2 = bindAnim.d;
        }
        return f2;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (this.c == null) {
            return 0.0f;
        }
        if (this.h < 0.0f) {
            BindAnim bindAnim = this.c;
            if (bindAnim == null) {
                f4 = 0.0f;
            } else {
                float f6 = this.b;
                f4 = f6;
                if (f6 == 2.1474836E9f) {
                    f4 = bindAnim.d;
                }
            }
            float f7 = f4 - this.a;
            BindAnim bindAnim2 = this.c;
            if (bindAnim2 == null) {
                f = 0.0f;
            } else {
                float f8 = this.b;
                f = f8;
                if (f8 == 2.1474836E9f) {
                    f = bindAnim2.d;
                }
            }
            BindAnim bindAnim3 = this.c;
            if (bindAnim3 == null) {
                f2 = f7;
                f = f;
            } else {
                float f9 = this.d;
                f5 = f9;
                f2 = f7;
                f = f;
                if (f9 == -2.1474836E9f) {
                    f5 = bindAnim3.l;
                    f2 = f7;
                }
            }
            return f2 / (f - f5);
        }
        float f10 = this.a;
        BindAnim bindAnim4 = this.c;
        if (bindAnim4 == null) {
            f3 = 0.0f;
        } else {
            float f11 = this.d;
            f3 = f11;
            if (f11 == -2.1474836E9f) {
                f3 = bindAnim4.l;
            }
        }
        float f12 = f10 - f3;
        BindAnim bindAnim5 = this.c;
        if (bindAnim5 == null) {
            f = 0.0f;
        } else {
            float f13 = this.b;
            f = f13;
            if (f13 == 2.1474836E9f) {
                f = bindAnim5.d;
            }
        }
        BindAnim bindAnim6 = this.c;
        if (bindAnim6 == null) {
            f2 = f12;
            f = f;
        } else {
            float f14 = this.d;
            f5 = f14;
            f2 = f12;
            f = f;
            if (f14 == -2.1474836E9f) {
                f5 = bindAnim6.l;
                f2 = f12;
            }
        }
        return f2 / (f - f5);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(c());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        BindAnim bindAnim = this.c;
        return bindAnim == null ? 0 : (long) ((float) ((long) (((bindAnim.d - bindAnim.l) / bindAnim.a) * 1000.0f)));
    }

    public final void h() {
        boolean z = true;
        this.e = true;
        n();
        this.f = 0;
        if (!(this.h < 0.0f) || this.a != i()) {
            if (this.h >= 0.0f) {
                z = false;
            }
            if (!z && this.a == g()) {
                this.a = i();
                return;
            }
            return;
        }
        this.a = g();
    }

    public final float i() {
        BindAnim bindAnim = this.c;
        if (bindAnim == null) {
            return 0.0f;
        }
        float f = this.d;
        float f2 = f;
        if (f == -2.1474836E9f) {
            f2 = bindAnim.l;
        }
        return f2;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.e;
    }

    public final void j() {
        boolean z = true;
        this.e = true;
        e(this.h < 0.0f);
        if (this.h >= 0.0f) {
            z = false;
        }
        a((float) ((int) (z ? g() : i())));
        this.f = 0;
        this.j = 0;
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        setRepeatMode(i);
        if (i != 2 && this.g) {
            this.g = false;
            this.h = -this.h;
        }
    }
}
