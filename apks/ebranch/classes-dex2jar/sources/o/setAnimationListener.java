package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
/* loaded from: classes-dex2jar.jar:o/setAnimationListener.class */
public final class setAnimationListener extends Drawable implements Animatable {
    final write a;
    boolean b;
    float d;
    private Animator h;
    private Resources i;
    private float j;
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator g = new onDestroy();
    private static final int[] c = {-16777216};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setAnimationListener$write.class */
    public static final class write {
        Path b;
        final Paint c;
        int d;
        final Paint f;
        int[] g;
        int h;
        int i;
        int j;
        boolean l;
        float m;
        final Paint n;
        float q;
        float r;
        float t;
        final RectF v = new RectF();
        float s = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        float f197o = 0.0f;
        float k = 0.0f;
        float p = 5.0f;
        float a = 1.0f;
        int e = 255;

        write() {
            Paint paint = new Paint();
            this.n = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.f = paint3;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }
    }

    public setAnimationListener(Context context) {
        this.i = context.getResources();
        write write2 = new write();
        this.a = write2;
        write2.g = c;
        write2.i = 0;
        write2.h = write2.g[0];
        write write3 = this.a;
        write3.p = 2.5f;
        write3.n.setStrokeWidth(2.5f);
        invalidateSelf();
        final write write4 = this.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.setAnimationListener.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                setAnimationListener.this.e(floatValue, write4);
                setAnimationListener.this.b(floatValue, write4, false);
                setAnimationListener.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(e);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: o.setAnimationListener.4
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                setAnimationListener.this.b(1.0f, write4, true);
                write write5 = write4;
                write5.q = write5.s;
                write5.t = write5.f197o;
                write5.r = write5.k;
                write write6 = write4;
                int length = (write6.i + 1) % write6.g.length;
                write6.i = length;
                write6.h = write6.g[length];
                if (setAnimationListener.this.b) {
                    setAnimationListener.this.b = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    write write7 = write4;
                    if (write7.l) {
                        write7.l = false;
                        return;
                    }
                    return;
                }
                setAnimationListener.this.d += 1.0f;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                setAnimationListener.this.d = 0.0f;
            }
        });
        this.h = ofFloat;
    }

    private static int c(float f, int i, int i2) {
        int i3 = i >>> 24;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) ((i2 >>> 24) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    private void d(float f, float f2, float f3, float f4) {
        write write2 = this.a;
        float f5 = this.i.getDisplayMetrics().density;
        float f6 = f2 * f5;
        write2.p = f6;
        write2.n.setStrokeWidth(f6);
        write2.m = f * f5;
        write2.i = 0;
        write2.h = write2.g[0];
        write2.j = (int) (f3 * f5);
        write2.d = (int) (f4 * f5);
    }

    public final void a(float f, float f2) {
        this.a.s = 0.0f;
        this.a.f197o = f2;
        invalidateSelf();
    }

    final void b(float f, write write2, boolean z) {
        float f2;
        float f3;
        if (this.b) {
            e(f, write2);
            write2.s = write2.q + (((write2.t - 0.01f) - write2.q) * f);
            write2.f197o = write2.t;
            write2.k = write2.r + ((((float) (Math.floor((double) (write2.r / 0.8f)) + 1.0d)) - write2.r) * f);
        } else if (f != 1.0f || z) {
            float f4 = write2.r;
            if (f < 0.5f) {
                f3 = write2.q;
                f2 = (g.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f3;
            } else {
                f2 = write2.q + 0.79f;
                f3 = f2 - (((1.0f - g.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f5 = this.d;
            write2.s = f3;
            write2.f197o = f2;
            write2.k = f4 + (0.20999998f * f);
            this.j = (f + f5) * 216.0f;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.j, bounds.exactCenterX(), bounds.exactCenterY());
        write write2 = this.a;
        RectF rectF = write2.v;
        float f = write2.m;
        float f2 = (write2.p / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) write2.j) * write2.a) / 2.0f, write2.p / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = write2.s;
        float f4 = write2.k;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((write2.f197o + f4) * 360.0f) - f5;
        write2.n.setColor(write2.h);
        write2.n.setAlpha(write2.e);
        float f7 = write2.p / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, write2.f);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, write2.n);
        if (write2.l) {
            Path path = write2.b;
            if (path == null) {
                Path path2 = new Path();
                write2.b = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (((float) write2.j) * write2.a) / 2.0f;
            write2.b.moveTo(0.0f, 0.0f);
            write2.b.lineTo(((float) write2.j) * write2.a, 0.0f);
            Path path3 = write2.b;
            float f10 = (float) write2.j;
            float f11 = write2.a;
            path3.lineTo((f10 * f11) / 2.0f, ((float) write2.d) * f11);
            write2.b.offset((min + rectF.centerX()) - f9, rectF.centerY() + (write2.p / 2.0f));
            write2.b.close();
            write2.c.setColor(write2.h);
            write2.c.setAlpha(write2.e);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(write2.b, write2.c);
            canvas.restore();
        }
        canvas.restore();
    }

    final void e(float f, write write2) {
        if (f > 0.75f) {
            write2.h = c((f - 0.75f) / 0.25f, write2.g[write2.i], write2.g[(write2.i + 1) % write2.g.length]);
        } else {
            write2.h = write2.g[write2.i];
        }
    }

    public final void e(int i) {
        if (i == 0) {
            d(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            d(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.h.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.e = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.h.cancel();
        write write2 = this.a;
        write2.q = write2.s;
        write2.t = write2.f197o;
        write2.r = write2.k;
        if (this.a.f197o != this.a.s) {
            this.b = true;
            this.h.setDuration(666);
            this.h.start();
            return;
        }
        write write3 = this.a;
        write3.i = 0;
        write3.h = write3.g[0];
        write write4 = this.a;
        write4.q = 0.0f;
        write4.t = 0.0f;
        write4.r = 0.0f;
        write4.s = 0.0f;
        write4.f197o = 0.0f;
        write4.k = 0.0f;
        this.h.setDuration(1332);
        this.h.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.h.cancel();
        this.j = 0.0f;
        write write2 = this.a;
        if (write2.l) {
            write2.l = false;
        }
        write write3 = this.a;
        write3.i = 0;
        write3.h = write3.g[0];
        write write4 = this.a;
        write4.q = 0.0f;
        write4.t = 0.0f;
        write4.r = 0.0f;
        write4.s = 0.0f;
        write4.f197o = 0.0f;
        write4.k = 0.0f;
        invalidateSelf();
    }
}
