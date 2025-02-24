package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.R;
/* loaded from: classes-dex2jar.jar:o/setText.class */
public final class setText extends Drawable implements Drawable.Callback, Animatable {
    public setUserInputEnabled a;
    setAnimation b;
    final AvailableBookingTimeV2Activity c;
    public BindAnim d;
    public boolean e;
    public Setter f;
    public R.styleable g;
    public String i;
    public setLayoutDirection j;
    public boolean l;
    boolean m;

    /* renamed from: o */
    boolean f277o;
    public BindView r;
    private final ValueAnimator.AnimatorUpdateListener y;
    private final Matrix u = new Matrix();
    float t = 1.0f;
    boolean q = true;
    boolean h = false;
    boolean k = false;
    final ArrayList<setText$MediaBrowserCompat$CustomActionResultReceiver> n = new ArrayList<>();
    private int s = 255;
    private boolean w = true;
    private boolean p = false;

    public setText() {
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = new AvailableBookingTimeV2Activity();
        this.c = availableBookingTimeV2Activity;
        AnonymousClass5 r0 = new ValueAnimator.AnimatorUpdateListener() { // from class: o.setText.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (setText.this.b != null) {
                    setText.this.b.b(setText.this.c.c());
                }
            }
        };
        this.y = r0;
        availableBookingTimeV2Activity.addUpdateListener(r0);
    }

    private float c() {
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.c;
        BindAnim bindAnim = availableBookingTimeV2Activity.c;
        if (bindAnim == null) {
            return 0.0f;
        }
        float f = availableBookingTimeV2Activity.b;
        float f2 = f;
        if (f == 2.1474836E9f) {
            f2 = bindAnim.d;
        }
        return f2;
    }

    private List<unbind> c(unbind unbind) {
        if (this.b == null) {
            AvailableBookingTimeActivity_ViewBinding.b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.b.e(unbind, 0, arrayList, new unbind(new String[0]));
        return arrayList;
    }

    private void e(Canvas canvas) {
        float f;
        float f2;
        BindAnim bindAnim = this.d;
        boolean z = true;
        if (bindAnim != null) {
            if (getBounds().isEmpty()) {
                z = true;
            } else {
                Rect bounds = getBounds();
                float width = ((float) bounds.width()) / ((float) bounds.height());
                Rect rect = bindAnim.c;
                z = width == ((float) rect.width()) / ((float) rect.height());
            }
        }
        int i = -1;
        if (!z) {
            if (this.b != null) {
                Rect bounds2 = getBounds();
                float width2 = ((float) bounds2.width()) / ((float) this.d.c.width());
                float height = ((float) bounds2.height()) / ((float) this.d.c.height());
                int i2 = -1;
                float f3 = width2;
                float f4 = height;
                if (this.w) {
                    float min = Math.min(width2, height);
                    if (min < 1.0f) {
                        f2 = 1.0f / min;
                        width2 /= f2;
                        height /= f2;
                    } else {
                        f2 = 1.0f;
                    }
                    i2 = -1;
                    f3 = width2;
                    f4 = height;
                    if (f2 > 1.0f) {
                        i2 = canvas.save();
                        float width3 = ((float) bounds2.width()) / 2.0f;
                        float height2 = ((float) bounds2.height()) / 2.0f;
                        float f5 = width3 * min;
                        float f6 = min * height2;
                        canvas.translate(width3 - f5, height2 - f6);
                        canvas.scale(f2, f2, f5, f6);
                        f4 = height;
                        f3 = width2;
                    }
                }
                this.u.reset();
                this.u.preScale(f3, f4);
                this.b.c(canvas, this.u, this.s);
                if (i2 > 0) {
                    canvas.restoreToCount(i2);
                }
            }
        } else if (this.b != null) {
            float f7 = this.t;
            float min2 = Math.min(((float) canvas.getWidth()) / ((float) this.d.c.width()), ((float) canvas.getHeight()) / ((float) this.d.c.height()));
            if (f7 > min2) {
                f = this.t / min2;
            } else {
                min2 = f7;
                f = 1.0f;
            }
            if (f > 1.0f) {
                i = canvas.save();
                float width4 = ((float) this.d.c.width()) / 2.0f;
                float height3 = ((float) this.d.c.height()) / 2.0f;
                float f8 = width4 * min2;
                float f9 = height3 * min2;
                float f10 = this.t;
                canvas.translate((width4 * f10) - f8, (f10 * height3) - f9);
                canvas.scale(f, f, f8, f9);
            }
            this.u.reset();
            this.u.preScale(min2, min2);
            this.b.c(canvas, this.u, this.s);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    private float g() {
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.c;
        BindAnim bindAnim = availableBookingTimeV2Activity.c;
        if (bindAnim == null) {
            return 0.0f;
        }
        float f = availableBookingTimeV2Activity.d;
        float f2 = f;
        if (f == -2.1474836E9f) {
            f2 = bindAnim.l;
        }
        return f2;
    }

    public void a() {
        setAnimation setanimation = new setAnimation(this, selesai.b(this.d), this.d.g, this.d);
        this.b = setanimation;
        if (this.f277o) {
            setanimation.b(true);
        }
    }

    public final void a(final float f) {
        if (this.d == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.7
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.a(f);
                }
            });
            return;
        }
        apply.c("Drawable#setProgress");
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.c;
        BindAnim bindAnim = this.d;
        availableBookingTimeV2Activity.a(BN6PembayaranActivity.b(bindAnim.l, bindAnim.d, f));
        apply.d("Drawable#setProgress");
    }

    public final void a(final int i) {
        if (this.d == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.12
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.a(i);
                }
            });
            return;
        }
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.c;
        availableBookingTimeV2Activity.c(availableBookingTimeV2Activity.d, ((float) i) + 0.99f);
    }

    public final void a(final int i, final int i2) {
        if (this.d == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.2
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.a(i, i2);
                }
            });
        } else {
            this.c.c((float) i, ((float) i2) + 0.99f);
        }
    }

    public final void a(final String str) {
        BindAnim bindAnim = this.d;
        if (bindAnim == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.14
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.a(str);
                }
            });
            return;
        }
        C0013onClick e = bindAnim.e(str);
        if (e != null) {
            b((int) e.d);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void b() {
        if (this.b == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.6
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.b();
                }
            });
            return;
        }
        boolean z = false;
        if ((this.q || this.h) || this.c.getRepeatCount() == 0) {
            this.c.h();
        }
        if (this.q || this.h) {
            z = true;
        }
        if (!z) {
            c((int) (this.c.h < 0.0f ? g() : c()));
            this.c.a();
        }
    }

    public final void b(final float f) {
        BindAnim bindAnim = this.d;
        if (bindAnim == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.11
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.b(f);
                }
            });
        } else {
            a((int) BN6PembayaranActivity.b(bindAnim.l, this.d.d, f));
        }
    }

    public final void b(final int i) {
        if (this.d == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.15
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.b(i);
                }
            });
            return;
        }
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.c;
        availableBookingTimeV2Activity.c((float) i, (float) ((int) availableBookingTimeV2Activity.b));
    }

    public final void b(final String str, final String str2, final boolean z) {
        BindAnim bindAnim = this.d;
        if (bindAnim == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.4
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.b(str, str2, z);
                }
            });
            return;
        }
        C0013onClick e = bindAnim.e(str);
        if (e != null) {
            int i = (int) e.d;
            C0013onClick e2 = this.d.e(str2);
            if (e2 != null) {
                a(i, (int) (e2.d + (z ? 1.0f : 0.0f)));
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str2);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Cannot find marker with name ");
        sb2.append(str);
        sb2.append(".");
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> void b(final unbind unbind, final T t, final onClickBcaMobile<T> onclickbcamobile) {
        if (this.b == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.9
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.b(unbind, (unbind) t, (onClickBcaMobile<unbind>) onclickbcamobile);
                }
            });
            return;
        }
        boolean z = true;
        if (unbind == unbind.c) {
            this.b.a(t, onclickbcamobile);
        } else if (unbind.a != null) {
            unbind.a.a(t, onclickbcamobile);
        } else {
            List<unbind> c = c(unbind);
            for (int i = 0; i < c.size(); i++) {
                c.get(i).a.a(t, onclickbcamobile);
            }
            z = true ^ c.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == value.A) {
                a(this.c.c());
            }
        }
    }

    public final void c(final float f, final float f2) {
        BindAnim bindAnim = this.d;
        if (bindAnim == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.3
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.c(f, f2);
                }
            });
        } else {
            a((int) BN6PembayaranActivity.b(bindAnim.l, this.d.d, f), (int) BN6PembayaranActivity.b(this.d.l, this.d.d, f2));
        }
    }

    public final void c(final int i) {
        if (this.d == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.10
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.c(i);
                }
            });
        } else {
            this.c.a((float) i);
        }
    }

    public final void c(final String str) {
        BindAnim bindAnim = this.d;
        if (bindAnim == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.1
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.c(str);
                }
            });
            return;
        }
        C0013onClick e = bindAnim.e(str);
        if (e != null) {
            int i = (int) e.d;
            a(i, ((int) e.e) + i);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean c(BindAnim bindAnim) {
        boolean z = false;
        if (this.d == bindAnim) {
            return false;
        }
        this.p = false;
        e();
        this.d = bindAnim;
        a();
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.c;
        if (availableBookingTimeV2Activity.c == null) {
            z = true;
        }
        availableBookingTimeV2Activity.c = bindAnim;
        if (z) {
            availableBookingTimeV2Activity.c((float) ((int) Math.max(availableBookingTimeV2Activity.d, bindAnim.l)), (float) ((int) Math.min(availableBookingTimeV2Activity.b, bindAnim.d)));
        } else {
            availableBookingTimeV2Activity.c((float) ((int) bindAnim.l), (float) ((int) bindAnim.d));
        }
        float f = availableBookingTimeV2Activity.a;
        availableBookingTimeV2Activity.a = 0.0f;
        availableBookingTimeV2Activity.a((float) ((int) f));
        availableBookingTimeV2Activity.b();
        a(this.c.getAnimatedFraction());
        this.t = this.t;
        Iterator it = new ArrayList(this.n).iterator();
        while (it.hasNext()) {
            setText$MediaBrowserCompat$CustomActionResultReceiver settext_mediabrowsercompat_customactionresultreceiver = (setText$MediaBrowserCompat$CustomActionResultReceiver) it.next();
            if (settext_mediabrowsercompat_customactionresultreceiver != null) {
                settext_mediabrowsercompat_customactionresultreceiver.c();
            }
            it.remove();
        }
        this.n.clear();
        bindAnim.f77o.c = this.m;
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    public final void d() {
        if (this.b == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.8
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.d();
                }
            });
            return;
        }
        boolean z = false;
        if ((this.q || this.h) || this.c.getRepeatCount() == 0) {
            this.c.j();
        }
        if (this.q || this.h) {
            z = true;
        }
        if (!z) {
            c((int) (this.c.h < 0.0f ? g() : c()));
            this.c.a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.p = false;
        apply.c("Drawable#draw");
        if (this.k) {
            try {
                e(canvas);
            } catch (Throwable th) {
                AvailableBookingTimeActivity_ViewBinding.b("Lottie crashed in draw!", th);
            }
        } else {
            e(canvas);
        }
        apply.d("Drawable#draw");
    }

    public final void e() {
        if (this.c.isRunning()) {
            this.c.cancel();
        }
        this.d = null;
        this.b = null;
        this.f = null;
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.c;
        availableBookingTimeV2Activity.c = null;
        availableBookingTimeV2Activity.d = -2.1474836E9f;
        availableBookingTimeV2Activity.b = 2.1474836E9f;
        invalidateSelf();
    }

    public final void e(final float f) {
        BindAnim bindAnim = this.d;
        if (bindAnim == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.13
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.e(f);
                }
            });
        } else {
            b((int) BN6PembayaranActivity.b(bindAnim.l, this.d.d, f));
        }
    }

    public final void e(final String str) {
        BindAnim bindAnim = this.d;
        if (bindAnim == null) {
            this.n.add(new setText$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setText.20
                @Override // o.setText$MediaBrowserCompat$CustomActionResultReceiver
                public final void c() {
                    setText.this.e(str);
                }
            });
            return;
        }
        C0013onClick e = bindAnim.e(str);
        if (e != null) {
            a((int) (e.d + e.e));
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        BindAnim bindAnim = this.d;
        return bindAnim == null ? -1 : (int) (((float) bindAnim.c.height()) * this.t);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        BindAnim bindAnim = this.d;
        return bindAnim == null ? -1 : (int) (((float) bindAnim.c.width()) * this.t);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (!this.p) {
            this.p = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.c;
        if (availableBookingTimeV2Activity == null) {
            return false;
        }
        return availableBookingTimeV2Activity.isRunning();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.s = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AvailableBookingTimeActivity_ViewBinding.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.n.clear();
        this.c.a();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
