package o;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes2-dex2jar.jar:o/ErrorGetRateBNDialog.class */
public final class ErrorGetRateBNDialog implements View.OnTouchListener {
    private final int a;
    private final int b;
    private final int d;
    private final Dialog e;

    public ErrorGetRateBNDialog(Dialog dialog, Rect rect) {
        this.e = dialog;
        this.d = rect.left;
        this.b = rect.top;
        this.a = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.d + findViewById.getLeft();
        int width = findViewById.getWidth();
        int top = this.b + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) (width + left), (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            float f = (float) ((-this.a) - 1);
            obtain.setLocation(f, f);
        }
        view.performClick();
        return this.e.onTouchEvent(obtain);
    }
}
