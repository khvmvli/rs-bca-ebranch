package o;

import android.view.MotionEvent;
/* loaded from: classes-dex2jar.jar:o/setCancelable.class */
public final class setCancelable {
    @Deprecated
    public static int a(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static int b(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    public static boolean d(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    @Deprecated
    public static float e(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    public static int e(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }
}
