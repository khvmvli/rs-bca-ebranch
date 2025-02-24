package o;

import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes-dex2jar.jar:o/getActivity.class */
public final class getActivity {
    public static int c(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void c(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
