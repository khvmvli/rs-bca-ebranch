package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
/* loaded from: classes-dex2jar.jar:o/getCardCode.class */
public class getCardCode extends setCheckMarkDrawable {
    private boolean a;

    public getCardCode(Context context) {
        super(context);
    }

    public getCardCode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public getCardCode(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return this.a || enoughToFilter();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        if (enoughToFilter() && isFocused() && getWindowVisibility() == 0) {
            showDropDown();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        onFocusChanged(z, i, rect);
        if (enoughToFilter() && isFocused() && getWindowVisibility() == 0) {
            showDropDown();
        }
    }

    public void setShowAlways(boolean z) {
        this.a = z;
    }
}
