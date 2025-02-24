package o;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import o.OR4DataBankPenerimaFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/OR3DataTransaksiBFragment_ViewBinding.class */
public final class OR3DataTransaksiBFragment_ViewBinding extends View {
    private boolean a;
    private float b;
    private int c;
    private float d;
    private float e;
    private read f;
    private boolean g;
    private boolean h;
    private float i;
    private boolean j;
    private int k;
    private float l;
    private float m;
    private final Paint n = new Paint();

    /* renamed from: o */
    private boolean f42o = false;
    private int p;
    private int q;
    private int r;
    private double s;
    private float t;
    private float u;
    private int v;
    private float x;
    private int y;

    /* loaded from: classes2-dex2jar.jar:o/OR3DataTransaksiBFragment_ViewBinding$read.class */
    public final class read implements ValueAnimator.AnimatorUpdateListener {
        private read() {
            OR3DataTransaksiBFragment_ViewBinding.this = r4;
        }

        /* synthetic */ read(OR3DataTransaksiBFragment_ViewBinding oR3DataTransaksiBFragment_ViewBinding, byte b) {
            this();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            OR3DataTransaksiBFragment_ViewBinding.this.invalidate();
        }
    }

    public OR3DataTransaksiBFragment_ViewBinding(Context context) {
        super(context);
    }

    public final ObjectAnimator c() {
        if (!this.f42o || !this.a) {
            Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, this.x), Keyframe.ofFloat(0.2f, this.x), Keyframe.ofFloat(0.84f, this.u), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.2f, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration(625L);
        duration.addUpdateListener(this.f);
        return duration;
    }

    public final int d(float f, float f2, boolean z, Boolean[] boolArr) {
        int i;
        if (!this.a) {
            return -1;
        }
        float f3 = f2 - ((float) this.y);
        float f4 = f - ((float) this.v);
        double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
        boolean z2 = true;
        if (this.g) {
            if (z) {
                boolArr[0] = Boolean.valueOf(((int) Math.abs(sqrt - ((double) ((int) (((float) this.c) * this.i))))) <= ((int) Math.abs(sqrt - ((double) ((int) (((float) this.c) * this.m))))));
            } else {
                float f5 = (float) this.c;
                float f6 = this.i;
                int i2 = (int) (f5 * f6);
                int i3 = this.r;
                float f7 = this.m;
                int i4 = (int) (f5 * f7);
                int i5 = (int) (f5 * ((f7 + f6) / 2.0f));
                if (sqrt >= ((double) (i2 - i3)) && sqrt <= ((double) i5)) {
                    boolArr[0] = Boolean.TRUE;
                } else if (sqrt > ((double) (i4 + i3)) || sqrt < ((double) i5)) {
                    return -1;
                } else {
                    boolArr[0] = Boolean.FALSE;
                }
            }
        } else if (!z && ((int) Math.abs(sqrt - ((double) this.k))) > ((int) (((float) this.c) * (1.0f - this.l)))) {
            return -1;
        }
        int asin = (int) ((Math.asin(((double) Math.abs(f2 - ((float) this.y))) / sqrt) * 180.0d) / 3.141592653589793d);
        boolean z3 = f > ((float) this.v);
        if (f2 >= ((float) this.y)) {
            z2 = false;
        }
        if (z3 && z2) {
            i = 90 - asin;
        } else if (z3 && !z2) {
            i = asin + 90;
        } else if (z3 || z2) {
            i = asin;
            if (!z3) {
                i = asin;
                if (z2) {
                    i = asin + 270;
                }
            }
        } else {
            i = 270 - asin;
        }
        return i;
    }

    public final ObjectAnimator d() {
        if (!this.f42o || !this.a) {
            Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.u), Keyframe.ofFloat(1.0f, this.x)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(500L);
        duration.addUpdateListener(this.f);
        return duration;
    }

    public final void d(Context context, onChooseTipeTujuanTransaksiPenerima onchoosetipetujuantransaksipenerima, boolean z, boolean z2, int i, boolean z3) {
        if (this.f42o) {
            Log.e("RadialSelectorView", "This RadialSelectorView may only be initialized once.");
            return;
        }
        Resources resources = context.getResources();
        this.n.setColor(onchoosetipetujuantransaksipenerima.c());
        this.n.setAntiAlias(true);
        onchoosetipetujuantransaksipenerima.h();
        this.q = 255;
        boolean a = onchoosetipetujuantransaksipenerima.a();
        this.h = a;
        if (a || onchoosetipetujuantransaksipenerima.e() != OR4DataBankPenerimaFragment_ViewBinding.write.VERSION_1) {
            this.e = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.b));
        } else {
            this.e = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.e));
            this.d = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.c));
        }
        this.g = z;
        if (z) {
            this.i = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.m));
            this.m = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.k));
        } else {
            this.l = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.l));
        }
        this.t = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.x));
        this.b = 1.0f;
        int i2 = -1;
        this.u = (((float) (z2 ? -1 : 1)) * 0.05f) + 1.0f;
        if (z2) {
            i2 = 1;
        }
        this.x = (((float) i2) * 0.3f) + 1.0f;
        this.f = new read(this, (byte) 0);
        setSelection(i, z3, false);
        this.f42o = true;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        if (getWidth() != 0 && this.f42o) {
            if (!this.a) {
                this.v = getWidth() / 2;
                int height = getHeight() / 2;
                this.y = height;
                int min = (int) (((float) Math.min(this.v, height)) * this.e);
                this.c = min;
                if (!this.h) {
                    this.y = (int) (((double) this.y) - (((double) ((int) (((float) min) * this.d))) * 0.75d));
                }
                this.r = (int) (((float) min) * this.t);
                this.a = true;
            }
            int i2 = (int) (((float) this.c) * this.l * this.b);
            this.k = i2;
            int sin = this.v + ((int) (((double) i2) * Math.sin(this.s)));
            int cos = this.y - ((int) (((double) this.k) * Math.cos(this.s)));
            this.n.setAlpha(this.q);
            float f = (float) sin;
            float f2 = (float) cos;
            canvas.drawCircle(f, f2, (float) this.r, this.n);
            if (this.j || (this.p % 30 != 0)) {
                this.n.setAlpha(255);
                canvas.drawCircle(f, f2, (float) ((this.r << 1) / 7), this.n);
                i = sin;
            } else {
                double d = (double) (this.k - this.r);
                i = this.v + ((int) (Math.sin(this.s) * d));
                cos = this.y - ((int) (d * Math.cos(this.s)));
            }
            this.n.setAlpha(255);
            this.n.setStrokeWidth(3.0f);
            canvas.drawLine((float) this.v, (float) this.y, (float) i, (float) cos, this.n);
        }
    }

    public final void setAnimationRadiusMultiplier(float f) {
        this.b = f;
    }

    public final void setSelection(int i, boolean z, boolean z2) {
        this.p = i;
        this.s = (((double) i) * 3.141592653589793d) / 180.0d;
        this.j = z2;
        if (!this.g) {
            return;
        }
        if (z) {
            this.l = this.i;
        } else {
            this.l = this.m;
        }
    }
}
