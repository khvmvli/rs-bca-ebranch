package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes2-dex2jar.jar:o/CameraDialog_ViewBinding.class */
public abstract class CameraDialog_ViewBinding<V extends View> extends cancelReservationAndTransaction<V> {
    private boolean b;
    private int c;
    OverScroller d;
    private Runnable e;
    private VelocityTracker j;
    private int a = -1;
    private int h = -1;

    /* JADX WARN: Incorrect field signature: TV; */
    /* loaded from: classes2-dex2jar.jar:o/CameraDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    final class RemoteActionCompatParcelizer implements Runnable {
        private final View a;
        private final CoordinatorLayout b;

        RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, V v) {
            this.b = coordinatorLayout;
            this.a = v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            if (this.a != null && CameraDialog_ViewBinding.this.d != null) {
                if (CameraDialog_ViewBinding.this.d.computeScrollOffset()) {
                    CameraDialog_ViewBinding cameraDialog_ViewBinding = CameraDialog_ViewBinding.this;
                    cameraDialog_ViewBinding.a(this.b, this.a, cameraDialog_ViewBinding.d.getCurrY(), Integer.MIN_VALUE, Integer.MAX_VALUE);
                    findFragmentByWho.c(this.a, this);
                    return;
                }
                CameraDialog_ViewBinding.this.e(this.b, this.a);
            }
        }
    }

    public CameraDialog_ViewBinding() {
    }

    public CameraDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int i4;
        int d = d();
        if (i2 != 0 && d >= i2 && d <= i3) {
            if (i >= i2) {
                i2 = i;
                if (i > i3) {
                    i2 = i3;
                }
            }
            if (d != i2) {
                a(i2);
                i4 = d - i2;
                return i4;
            }
        }
        i4 = 0;
        return i4;
    }

    public int b() {
        return d();
    }

    protected int b(V v) {
        return -v.getHeight();
    }

    protected int c(V v) {
        return v.getHeight();
    }

    public final boolean c(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
            int i = this.a;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.c) > this.h) {
                this.c = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.a = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = d(v) && coordinatorLayout.c(v, x, y2);
            this.b = z;
            if (z) {
                this.c = y2;
                this.a = motionEvent.getPointerId(0);
                if (this.j == null) {
                    this.j = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker == null) {
            return false;
        }
        velocityTracker.addMovement(motionEvent);
        return false;
    }

    protected boolean d(V v) {
        return false;
    }

    protected void e(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout r11, V r12, android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CameraDialog_ViewBinding.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
