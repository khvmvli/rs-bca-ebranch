package o;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.facebook.stetho.server.http.HttpStatus;
/* loaded from: classes-dex2jar.jar:o/getExitTransition.class */
public abstract class getExitTransition implements View.OnTouchListener {
    private static final int h = ViewConfiguration.getTapTimeout();
    boolean a;
    boolean b;
    final View c;
    boolean e;
    private boolean j;
    private boolean k;

    /* renamed from: o */
    private boolean f146o;
    private Runnable r;
    final IconCompatParcelizer d = new IconCompatParcelizer();
    private final Interpolator f = new AccelerateInterpolator();
    private float[] s = {0.0f, 0.0f};
    private float[] l = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] t = {0.0f, 0.0f};
    private float[] n = {0.0f, 0.0f};
    private float[] m = {Float.MAX_VALUE, Float.MAX_VALUE};
    private int g = 1;
    private int i = h;

    /* loaded from: classes-dex2jar.jar:o/getExitTransition$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        int b;
        int c;
        float g;
        int h;
        float j;
        float m;
        long i = Long.MIN_VALUE;
        long f = -1;
        long a = 0;
        int d = 0;
        int e = 0;

        IconCompatParcelizer() {
        }

        public float b(long j) {
            long j2 = this.i;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f;
            if (j3 < 0 || j < j3) {
                return getExitTransition.e(((float) (j - j2)) / ((float) this.h), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.j;
            return (1.0f - f) + (f * getExitTransition.e(((float) (j - j3)) / ((float) this.b), 0.0f, 1.0f));
        }
    }

    public getExitTransition(View view) {
        this.c = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = (float) i;
        float[] fArr = this.m;
        float f2 = f / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float f3 = (float) i2;
        float[] fArr2 = this.n;
        float f4 = f3 / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        float[] fArr3 = this.l;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.s;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.t;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.d.h = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        this.d.c = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
    }

    private float a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.a || i != 1) ? 0.0f : 1.0f;
            }
            return 0.0f;
        } else if (i != 2 || f >= 0.0f) {
            return 0.0f;
        } else {
            return f / (-f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private float a(int r5, float r6, float r7, float r8) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getExitTransition.a(int, float, float, float):float");
    }

    private void b() {
        int i = 0;
        if (this.e) {
            this.a = false;
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = this.d;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - iconCompatParcelizer.i);
        i = iconCompatParcelizer.c;
        if (i2 <= i && i2 >= 0) {
            i = i2;
        }
        iconCompatParcelizer.b = i;
        iconCompatParcelizer.j = iconCompatParcelizer.b(currentAnimationTimeMillis);
        iconCompatParcelizer.f = currentAnimationTimeMillis;
    }

    static float e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public final getExitTransition a(boolean z) {
        if (this.f146o && !z) {
            b();
        }
        this.f146o = z;
        return this;
    }

    public abstract boolean b(int i);

    public abstract void d(int i);

    public final boolean d() {
        IconCompatParcelizer iconCompatParcelizer = this.d;
        float f = iconCompatParcelizer.m;
        int abs = (int) (f / Math.abs(f));
        float f2 = iconCompatParcelizer.g;
        int abs2 = (int) (f2 / Math.abs(f2));
        return abs != 0 && b(abs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0 == 3) goto L_0x002b;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    @Override // android.view.View.OnTouchListener
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getExitTransition.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
