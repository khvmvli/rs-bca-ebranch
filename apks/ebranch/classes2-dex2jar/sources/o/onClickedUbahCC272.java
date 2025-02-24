package o;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* loaded from: classes2-dex2jar.jar:o/onClickedUbahCC272.class */
public final class onClickedUbahCC272 extends Animation {
    public static final boolean c;
    private static final WeakHashMap<View, onClickedUbahCC272> l;
    public float b;
    public boolean e;
    public float f;
    public float h;
    public float i;
    public float j;
    public float k;
    public float m;
    public final WeakReference<View> n;
    private final Camera r = new Camera();
    public float a = 1.0f;
    public float g = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    public float f77o = 1.0f;
    public final RectF d = new RectF();
    private final RectF q = new RectF();
    private final Matrix s = new Matrix();

    static {
        c = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        l = new WeakHashMap<>();
    }

    private onClickedUbahCC272(View view) {
        setDuration(0);
        setFillAfter(true);
        view.setAnimation(this);
        this.n = new WeakReference<>(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r0 != r4.getAnimation()) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static o.onClickedUbahCC272 b(android.view.View r4) {
        /*
            java.util.WeakHashMap<android.view.View, o.onClickedUbahCC272> r0 = o.onClickedUbahCC272.l
            r5 = r0
            r0 = r5
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            o.onClickedUbahCC272 r0 = (o.onClickedUbahCC272) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x001b
            r0 = r6
            r7 = r0
            r0 = r6
            r1 = r4
            android.view.animation.Animation r1 = r1.getAnimation()
            if (r0 == r1) goto L_0x002b
        L_0x001b:
            o.onClickedUbahCC272 r0 = new o.onClickedUbahCC272
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r7 = r0
            r0 = r5
            r1 = r4
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
        L_0x002b:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onClickedUbahCC272.b(android.view.View):o.onClickedUbahCC272");
    }

    private void e(Matrix matrix, View view) {
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        boolean z = this.e;
        float f = z ? this.b : width / 2.0f;
        float f2 = z ? this.j : height / 2.0f;
        float f3 = this.h;
        float f4 = this.i;
        float f5 = this.f;
        if (!(f3 == 0.0f && f4 == 0.0f && f5 == 0.0f)) {
            Camera camera = this.r;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.g;
        float f7 = this.f77o;
        if (!(f6 == 1.0f && f7 == 1.0f)) {
            matrix.postScale(f6, f7);
            matrix.postTranslate((-(f / width)) * ((f6 * width) - width), (-(f2 / height)) * ((f7 * height) - height));
        }
        matrix.postTranslate(this.k, this.m);
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        View view = this.n.get();
        if (view != null) {
            transformation.setAlpha(this.a);
            e(transformation.getMatrix(), view);
        }
    }

    public void c(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        Matrix matrix = this.s;
        matrix.reset();
        e(matrix, view);
        this.s.mapRect(rectF);
        rectF.offset((float) view.getLeft(), (float) view.getTop());
        if (rectF.right < rectF.left) {
            float f = rectF.right;
            rectF.right = rectF.left;
            rectF.left = f;
        }
        if (rectF.bottom < rectF.top) {
            float f2 = rectF.top;
            rectF.top = rectF.bottom;
            rectF.bottom = f2;
        }
    }

    public void e() {
        View view = this.n.get();
        if (view != null && view.getParent() != null) {
            RectF rectF = this.q;
            c(rectF, view);
            rectF.union(this.d);
            ((View) view.getParent()).invalidate((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
    }
}
