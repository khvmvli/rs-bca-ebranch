package o;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;
/* loaded from: classes-dex2jar.jar:o/getDefaultViewModelProviderFactory.class */
public class getDefaultViewModelProviderFactory {
    private final AccessibilityRecord b;

    public static void b(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i) {
        accessibilityRecord.setSource(view, i);
    }

    public static void d(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDefaultViewModelProviderFactory)) {
            return false;
        }
        getDefaultViewModelProviderFactory getdefaultviewmodelproviderfactory = (getDefaultViewModelProviderFactory) obj;
        AccessibilityRecord accessibilityRecord = this.b;
        return accessibilityRecord == null ? getdefaultviewmodelproviderfactory.b == null : accessibilityRecord.equals(getdefaultviewmodelproviderfactory.b);
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.b;
        return accessibilityRecord == null ? 0 : accessibilityRecord.hashCode();
    }
}
