package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import o.setDividerPadding;
/* loaded from: classes-dex2jar.jar:o/setHorizontalGravity.class */
public class setHorizontalGravity extends LinearLayout implements setDividerPadding {
    private setDividerPadding.write c;

    public setHorizontalGravity(Context context) {
        super(context);
    }

    public setHorizontalGravity(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(setDividerPadding.write write) {
        this.c = write;
    }
}
