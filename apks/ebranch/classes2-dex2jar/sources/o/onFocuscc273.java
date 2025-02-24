package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
/* loaded from: classes2-dex2jar.jar:o/onFocuscc273.class */
public final class onFocuscc273 extends onClickedUbahCC274 {
    protected final ScaleGestureDetector g;

    public onFocuscc273(Context context) {
        super(context);
        this.g = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: o.onFocuscc273.5
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                onFocuscc273.this.b.e(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }
        });
    }

    @Override // o.onClickedUbahCC274, o.onClickedUbahCC276, o.onFocuscc2710
    public final boolean b(MotionEvent motionEvent) {
        this.g.onTouchEvent(motionEvent);
        return b(motionEvent);
    }

    @Override // o.onClickedUbahCC276, o.onFocuscc2710
    public final boolean d() {
        return this.g.isInProgress();
    }
}
