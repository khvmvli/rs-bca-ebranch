package o;

import android.content.Context;
import android.view.MotionEvent;
/* loaded from: classes2-dex2jar.jar:o/onClickedUbahCC274.class */
public class onClickedUbahCC274 extends onClickedUbahCC276 {
    protected int j = -1;
    protected int i = 0;

    public onClickedUbahCC274(Context context) {
        super(context);
    }

    @Override // o.onClickedUbahCC276, o.onFocuscc2710
    public boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int i = 0;
        if (action != 0) {
            int i2 = 1;
            if (action == 1 || action == 3) {
                this.j = -1;
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() >> 8) & 255;
                if (motionEvent.getPointerId(action2) == this.j) {
                    if (action2 != 0) {
                        i2 = 0;
                    }
                    this.j = motionEvent.getPointerId(i2);
                    this.a = motionEvent.getX(i2);
                    this.c = motionEvent.getY(i2);
                }
            }
        } else {
            this.j = motionEvent.getPointerId(0);
        }
        int i3 = this.j;
        if (i3 != -1) {
            i = i3;
        }
        this.i = motionEvent.findPointerIndex(i);
        return b(motionEvent);
    }

    @Override // o.onClickedUbahCC276
    final float c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.i);
        } catch (Exception e) {
            return motionEvent.getY();
        }
    }

    @Override // o.onClickedUbahCC276
    final float e(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.i);
        } catch (Exception e) {
            return motionEvent.getX();
        }
    }
}
