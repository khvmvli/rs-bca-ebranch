package o;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ViewAnimator;
/* loaded from: classes2-dex2jar.jar:o/showInfoKursOR.class */
public class showInfoKursOR extends ViewAnimator {
    private long c;

    public showInfoKursOR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.c, 22));
        return true;
    }

    public void setDateMillis(long j) {
        this.c = j;
    }
}
