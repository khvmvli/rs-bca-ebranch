package o;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/getReturnTransition.class */
public final class getReturnTransition {
    private static final Interpolator k = new Interpolator() { // from class: o.getReturnTransition.4
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public float[] a;
    public float[] b;
    public int c;
    public int d;
    public View e;
    public float[] f;
    public float[] g;
    public int h;
    public int i;
    public float j;
    public int m;
    private final getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f155o;
    private int[] p;
    private final ViewGroup q;
    private int[] r;
    private float s;
    private boolean t;
    private VelocityTracker u;
    private OverScroller y;
    private int l = -1;
    private final Runnable w = new Runnable() { // from class: o.getReturnTransition.3
        @Override // java.lang.Runnable
        public final void run() {
            getReturnTransition.this.e(0);
        }
    };

    private getReturnTransition(Context context, ViewGroup viewGroup, getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver getreturntransition_mediabrowsercompat_customactionresultreceiver) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (getreturntransition_mediabrowsercompat_customactionresultreceiver != null) {
            this.q = viewGroup;
            this.n = getreturntransition_mediabrowsercompat_customactionresultreceiver;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.c = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.i = viewConfiguration.getScaledTouchSlop();
            this.s = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.j = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.y = new OverScroller(context, k);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private static int a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        int i4 = i3;
        if (i <= 0) {
            i4 = -i3;
        }
        return i4;
    }

    public static getReturnTransition a(ViewGroup viewGroup, getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver getreturntransition_mediabrowsercompat_customactionresultreceiver) {
        return new getReturnTransition(viewGroup.getContext(), viewGroup, getreturntransition_mediabrowsercompat_customactionresultreceiver);
    }

    private void a() {
        this.u.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE, this.s);
        b(e(this.u.getXVelocity(this.l), this.j, this.s), e(this.u.getYVelocity(this.l), this.j, this.s));
    }

    private void a(int i) {
        if (this.a != null) {
            boolean z = true;
            int i2 = 1 << i;
            if ((this.h & i2) == 0) {
                z = false;
            }
            if (z) {
                this.a[i] = 0.0f;
                this.b[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.p[i] = 0;
                this.f155o[i] = 0;
                this.r[i] = 0;
                this.h = (i2 ^ -1) & this.h;
            }
        }
    }

    private boolean a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        boolean z = false;
        if ((this.p[i] & i2) == i2) {
            z = false;
            if ((this.m & i2) != 0) {
                z = false;
                if ((this.r[i] & i2) != i2) {
                    z = false;
                    if ((this.f155o[i] & i2) != i2) {
                        float f3 = (float) this.i;
                        if (abs > f3 || abs2 > f3) {
                            z = false;
                            if ((this.f155o[i] & i2) == 0) {
                                z = false;
                                if (abs > ((float) this.i)) {
                                    z = true;
                                }
                            }
                        } else {
                            z = false;
                        }
                    }
                }
            }
        }
        return z;
    }

    private boolean a(View view, int i) {
        if (view == this.e && this.l == i) {
            return true;
        }
        if (view == null || !this.n.b(view, i)) {
            return false;
        }
        this.l = i;
        d(view, i);
        return true;
    }

    public static getReturnTransition b(ViewGroup viewGroup, float f, getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver getreturntransition_mediabrowsercompat_customactionresultreceiver) {
        getReturnTransition getreturntransition = new getReturnTransition(viewGroup.getContext(), viewGroup, getreturntransition_mediabrowsercompat_customactionresultreceiver);
        getreturntransition.i = (int) (((float) getreturntransition.i) * (1.0f / f));
        return getreturntransition;
    }

    private void b(float f, float f2) {
        this.t = true;
        this.n.a(this.e, f, f2);
        this.t = false;
        if (this.d == 1) {
            e(0);
        }
    }

    private void b(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (c(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    private int c(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.q.getWidth();
        float f = (float) (width / 2);
        float sin = (float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f));
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs((f + (sin * f)) / ((float) abs)) * 1000.0f) << 2 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    private void c(float f, float f2, int i) {
        boolean a = a(f, f2, i, 1);
        boolean z = a;
        if (a(f2, f, i, 4)) {
            z = a | true;
        }
        boolean z2 = z;
        if (a(f, f2, i, 2)) {
            z2 = z | true;
        }
        boolean z3 = z2;
        if (a(f2, f, i, 8)) {
            z3 = z2 | true;
        }
        if (z3) {
            int[] iArr = this.f155o;
            int i2 = iArr[i];
            int i3 = z3 ? 1 : 0;
            char c = z3 ? 1 : 0;
            char c2 = z3 ? 1 : 0;
            iArr[i] = i2 | i3;
            getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver getreturntransition_mediabrowsercompat_customactionresultreceiver = this.n;
            int i4 = z3 ? 1 : 0;
            int i5 = z3 ? 1 : 0;
            int i6 = z3 ? 1 : 0;
            getreturntransition_mediabrowsercompat_customactionresultreceiver.e(i4, i);
        }
    }

    private boolean c(int i) {
        if ((this.h & (1 << i)) != 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    private boolean c(View view, float f, float f2) {
        boolean z = false;
        boolean z2 = false;
        if (view == null) {
            return false;
        }
        boolean z3 = this.n.d(view) > 0;
        boolean z4 = this.n.c() > 0;
        if (z3 && z4) {
            int i = this.i;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                z2 = true;
            }
            return z2;
        } else if (z3) {
            if (Math.abs(f) > ((float) this.i)) {
                z = true;
            }
            return z;
        } else {
            boolean z5 = false;
            if (z4) {
                z5 = false;
                if (Math.abs(f2) > ((float) this.i)) {
                    z5 = true;
                }
            }
            return z5;
        }
    }

    private boolean d(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.e.getLeft();
        int top = this.e.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.y.abortAnimation();
            e(0);
            return false;
        }
        View view = this.e;
        int a = a(i3, (int) this.j, (int) this.s);
        int a2 = a(i4, (int) this.j, (int) this.s);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (a != 0) {
            f2 = (float) abs3;
            f = (float) i7;
        } else {
            f2 = (float) abs;
            f = (float) i8;
        }
        float f5 = f2 / f;
        if (a2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i7;
        } else {
            f4 = (float) abs2;
            f3 = (float) i8;
        }
        this.y.startScroll(left, top, i5, i6, (int) ((((float) c(i5, a, this.n.d(view))) * f5) + (((float) c(i6, a2, this.n.c())) * (f4 / f3))));
        e(2);
        return true;
    }

    private static float e(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        float f4 = f3;
        if (f <= 0.0f) {
            f4 = -f3;
        }
        return f4;
    }

    private void e(float f, float f2, int i) {
        float[] fArr = this.a;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.b;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.p;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f155o;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.r;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.a = fArr2;
            this.b = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.p = iArr;
            this.f155o = iArr2;
            this.r = iArr3;
        }
        float[] fArr9 = this.a;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.b;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.p;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.q.getLeft() + this.c) {
            i2 = 1;
        }
        int i6 = i2;
        if (i5 < this.q.getTop() + this.c) {
            i6 = i2 | 4;
        }
        int i7 = i6;
        if (i4 > this.q.getRight() - this.c) {
            i7 = i6 | 2;
        }
        int i8 = i7;
        if (i5 > this.q.getBottom() - this.c) {
            i8 = i7 | 8;
        }
        iArr7[i] = i8;
        this.h |= 1 << i;
    }

    public final void a(MotionEvent motionEvent) {
        boolean z;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            e();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View e = e((int) x, (int) y);
            e(x, y, pointerId);
            a(e, pointerId);
            if ((this.p[pointerId] & this.m) != 0) {
                this.n.a();
            }
        } else if (actionMasked == 1) {
            if (this.d == 1) {
                a();
            }
            e();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.d == 1) {
                    b(0.0f, 0.0f);
                }
                e();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                e(x2, y2, pointerId2);
                if (this.d == 0) {
                    a(e((int) x2, (int) y2), pointerId2);
                    if ((this.p[pointerId2] & this.m) != 0) {
                        this.n.a();
                        return;
                    }
                    return;
                }
                int i3 = (int) x2;
                int i4 = (int) y2;
                View view = this.e;
                if (view == null) {
                    z = false;
                } else {
                    z = false;
                    if (i3 >= view.getLeft()) {
                        z = false;
                        if (i3 < view.getRight()) {
                            z = false;
                            if (i4 >= view.getTop()) {
                                z = false;
                                if (i4 < view.getBottom()) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                if (z) {
                    a(this.e, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.d == 1 && pointerId3 == this.l) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.l) {
                            View e2 = e((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view2 = this.e;
                            if (e2 == view2 && a(view2, pointerId4)) {
                                i = this.l;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        a();
                    }
                }
                a(pointerId3);
            }
        } else if (this.d != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i5 = 0; i5 < pointerCount2; i5++) {
                int pointerId5 = motionEvent.getPointerId(i5);
                if (c(pointerId5)) {
                    float x3 = motionEvent.getX(i5);
                    float y3 = motionEvent.getY(i5);
                    float f = x3 - this.a[pointerId5];
                    float f2 = y3 - this.b[pointerId5];
                    c(f, f2, pointerId5);
                    if (this.d == 1) {
                        break;
                    }
                    View e3 = e((int) x3, (int) y3);
                    if (c(e3, f, f2) && a(e3, pointerId5)) {
                        break;
                    }
                }
            }
            b(motionEvent);
        } else if (c(this.l)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.l);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f;
            int i6 = this.l;
            int i7 = (int) (x4 - fArr[i6]);
            int i8 = (int) (y4 - this.g[i6]);
            int left = this.e.getLeft() + i7;
            int top = this.e.getTop() + i8;
            int left2 = this.e.getLeft();
            int top2 = this.e.getTop();
            int i9 = left;
            if (i7 != 0) {
                i9 = this.n.e(this.e, left);
                findFragmentByWho.d(this.e, i9 - left2);
            }
            int i10 = top;
            if (i8 != 0) {
                i10 = this.n.a(this.e, top);
                findFragmentByWho.e(this.e, i10 - top2);
            }
            if (!(i7 == 0 && i8 == 0)) {
                this.n.c(this.e, i9, i10);
            }
            b(motionEvent);
        }
    }

    public final boolean a(int i, int i2) {
        if (this.t) {
            return d(i, i2, (int) this.u.getXVelocity(this.l), (int) this.u.getYVelocity(this.l));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x018a, code lost:
        if (r0 != r0) goto L_0x019e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean c(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 567
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getReturnTransition.c(android.view.MotionEvent):boolean");
    }

    public final boolean c(View view, int i, int i2) {
        this.e = view;
        this.l = -1;
        boolean d = d(i, i2, 0, 0);
        if (!d && this.d == 0 && this.e != null) {
            this.e = null;
        }
        return d;
    }

    public final void d(View view, int i) {
        if (view.getParent() == this.q) {
            this.e = view;
            this.l = i;
            this.n.d(view, i);
            e(1);
            return;
        }
        StringBuilder sb = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.q);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public final View e(int i, int i2) {
        for (int childCount = this.q.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.q.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void e() {
        this.l = -1;
        float[] fArr = this.a;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.b, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.p, 0);
            Arrays.fill(this.f155o, 0);
            Arrays.fill(this.r, 0);
            this.h = 0;
        }
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    final void e(int i) {
        this.q.removeCallbacks(this.w);
        if (this.d != i) {
            this.d = i;
            this.n.c(i);
            if (this.d == 0) {
                this.e = null;
            }
        }
    }

    public final boolean e(boolean z) {
        boolean z2 = false;
        if (this.d == 2) {
            boolean computeScrollOffset = this.y.computeScrollOffset();
            int currX = this.y.getCurrX();
            int currY = this.y.getCurrY();
            int left = currX - this.e.getLeft();
            int top = currY - this.e.getTop();
            if (left != 0) {
                findFragmentByWho.d(this.e, left);
            }
            if (top != 0) {
                findFragmentByWho.e(this.e, top);
            }
            if (!(left == 0 && top == 0)) {
                this.n.c(this.e, currX, currY);
            }
            boolean z3 = computeScrollOffset;
            if (computeScrollOffset) {
                z3 = computeScrollOffset;
                if (currX == this.y.getFinalX()) {
                    z3 = computeScrollOffset;
                    if (currY == this.y.getFinalY()) {
                        this.y.abortAnimation();
                        z3 = false;
                    }
                }
            }
            if (!z3) {
                this.q.post(this.w);
            }
        }
        if (this.d == 2) {
            z2 = true;
        }
        return z2;
    }
}
