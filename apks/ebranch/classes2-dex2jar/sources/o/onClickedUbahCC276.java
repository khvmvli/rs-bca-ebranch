package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.joda.time.DateTimeConstants;
/* loaded from: classes2-dex2jar.jar:o/onClickedUbahCC276.class */
public class onClickedUbahCC276 implements onFocuscc2710 {
    protected float a;
    protected onFocuscc274 b;
    protected float c;
    protected final float d;
    protected boolean e;
    protected VelocityTracker f;
    protected final float h;

    public onClickedUbahCC276(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.h = (float) viewConfiguration.getScaledTouchSlop();
        this.d = (float) viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // o.onFocuscc2710
    public boolean b(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.a = e(motionEvent);
            this.c = c(motionEvent);
            this.e = false;
            return true;
        } else if (action == 1) {
            if (this.e && this.f != null) {
                this.a = e(motionEvent);
                this.c = c(motionEvent);
                this.f.addMovement(motionEvent);
                this.f.computeCurrentVelocity(DateTimeConstants.MILLIS_PER_SECOND);
                float xVelocity = this.f.getXVelocity();
                float yVelocity = this.f.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.d) {
                    this.b.c(-xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f;
            if (velocityTracker2 == null) {
                return true;
            }
            velocityTracker2.recycle();
            this.f = null;
            return true;
        } else if (action == 2) {
            float e = e(motionEvent);
            float c = c(motionEvent);
            float f = e - this.a;
            float f2 = c - this.c;
            if (!this.e) {
                if (Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.h)) {
                    z = true;
                }
                this.e = z;
            }
            if (!this.e) {
                return true;
            }
            this.b.e(f, f2);
            this.a = e;
            this.c = c;
            VelocityTracker velocityTracker3 = this.f;
            if (velocityTracker3 == null) {
                return true;
            }
            velocityTracker3.addMovement(motionEvent);
            return true;
        } else if (action != 3 || (velocityTracker = this.f) == null) {
            return true;
        } else {
            velocityTracker.recycle();
            this.f = null;
            return true;
        }
    }

    float c(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    @Override // o.onFocuscc2710
    public final void d(onFocuscc274 onfocuscc274) {
        this.b = onfocuscc274;
    }

    @Override // o.onFocuscc2710
    public boolean d() {
        return false;
    }

    float e(MotionEvent motionEvent) {
        return motionEvent.getX();
    }
}
