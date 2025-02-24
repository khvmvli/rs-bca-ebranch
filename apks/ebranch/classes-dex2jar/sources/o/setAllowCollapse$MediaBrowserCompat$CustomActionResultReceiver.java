package o;

import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setAllowCollapse$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setAllowCollapse$MediaBrowserCompat$CustomActionResultReceiver implements View.OnTouchListener {
    final /* synthetic */ setAllowCollapse d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAllowCollapse$MediaBrowserCompat$CustomActionResultReceiver(setAllowCollapse setallowcollapse) {
        this.d = setallowcollapse;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && this.d.j != null && this.d.j.isShowing() && x >= 0 && x < this.d.j.getWidth() && y >= 0 && y < this.d.j.getHeight()) {
            this.d.a.postDelayed(this.d.h, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            this.d.a.removeCallbacks(this.d.h);
            return false;
        }
    }
}
