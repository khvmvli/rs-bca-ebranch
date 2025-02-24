package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
/* loaded from: classes-dex2jar.jar:o/setOrientation.class */
public abstract class setOrientation implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private Runnable a;
    private final float b;
    private int c;
    private boolean d;
    private final int e;
    private final int f;
    private final int[] h = new int[2];
    final View i;
    private Runnable j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setOrientation$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer implements Runnable {
        RemoteActionCompatParcelizer() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = setOrientation.this.i.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setOrientation$write.class */
    public final class write implements Runnable {
        write() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            setOrientation.this.b();
        }
    }

    public setOrientation(View view) {
        this.i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.b = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f = tapTimeout;
        this.e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.j;
        if (runnable != null) {
            this.i.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.a;
        if (runnable2 != null) {
            this.i.removeCallbacks(runnable2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
        if (r11 != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean a(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = r4
            android.view.View r0 = r0.i
            r6 = r0
            r0 = r4
            o.setSupportBackgroundTintMode r0 = r0.d()
            r7 = r0
            r0 = 1
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0084
            r0 = r7
            boolean r0 = r0.f()
            if (r0 != 0) goto L_0x001d
            goto L_0x0084
        L_0x001d:
            r0 = r7
            android.widget.ListView r0 = r0.b_()
            o.setMeasureWithLargestChildEnabled r0 = (o.setMeasureWithLargestChildEnabled) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0084
            r0 = r7
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L_0x0035
            goto L_0x0084
        L_0x0035:
            r0 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r0)
            r9 = r0
            r0 = r4
            r1 = r6
            r2 = r9
            boolean r0 = r0.d(r1, r2)
            r0 = r4
            r1 = r7
            r2 = r9
            boolean r0 = r0.a(r1, r2)
            r0 = r7
            r1 = r9
            r2 = r4
            int r2 = r2.c
            boolean r0 = r0.c(r1, r2)
            r10 = r0
            r0 = r9
            r0.recycle()
            r0 = r5
            int r0 = r0.getActionMasked()
            r11 = r0
            r0 = r11
            r1 = 1
            if (r0 == r1) goto L_0x0074
            r0 = r11
            r1 = 3
            if (r0 == r1) goto L_0x0074
            r0 = 1
            r11 = r0
            goto L_0x0077
        L_0x0074:
            r0 = 0
            r11 = r0
        L_0x0077:
            r0 = r10
            if (r0 == 0) goto L_0x0084
            r0 = r11
            if (r0 == 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            r0 = 0
            r8 = r0
        L_0x0087:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOrientation.a(android.view.MotionEvent):boolean");
    }

    private boolean a(View view, MotionEvent motionEvent) {
        int[] iArr = this.h;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    private static boolean b(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean d(View view, MotionEvent motionEvent) {
        int[] iArr = this.h;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean e(MotionEvent motionEvent) {
        View view = this.i;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.c);
                    if (findPointerIndex < 0 || b(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.b)) {
                        return false;
                    }
                    a();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                } else if (actionMasked != 3) {
                    return false;
                }
            }
            a();
            return false;
        }
        this.c = motionEvent.getPointerId(0);
        if (this.a == null) {
            this.a = new RemoteActionCompatParcelizer();
        }
        view.postDelayed(this.a, (long) this.f);
        if (this.j == null) {
            this.j = new write();
        }
        view.postDelayed(this.j, (long) this.e);
        return false;
    }

    void b() {
        a();
        View view = this.i;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.d = true;
        }
    }

    protected boolean c() {
        setSupportBackgroundTintMode d = d();
        if (d == null || d.f()) {
            return true;
        }
        d.j();
        return true;
    }

    public abstract setSupportBackgroundTintMode d();

    protected boolean e() {
        setSupportBackgroundTintMode d = d();
        if (d == null || !d.f()) {
            return true;
        }
        d.c();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.d;
        boolean z3 = false;
        if (z2) {
            if (!a(motionEvent) && e()) {
                z = false;
            }
            z = true;
        } else {
            boolean z4 = e(motionEvent) && c();
            z = z4;
            if (z4) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.i.onTouchEvent(obtain);
                obtain.recycle();
                z = true;
            }
        }
        this.d = z;
        if (z || z2) {
            z3 = true;
        }
        return z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.d = false;
        this.c = -1;
        Runnable runnable = this.a;
        if (runnable != null) {
            this.i.removeCallbacks(runnable);
        }
    }
}
