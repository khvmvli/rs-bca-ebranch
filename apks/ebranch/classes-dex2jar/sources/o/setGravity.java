package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.setDividerPadding;
/* loaded from: classes-dex2jar.jar:o/setGravity.class */
public class setGravity extends FrameLayout implements setDividerPadding {
    private setDividerPadding.write d;

    public setGravity(Context context) {
        super(context);
    }

    public setGravity(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(setDividerPadding.write write) {
        this.d = write;
    }
}
