package o;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes-dex2jar.jar:o/restoreViewState.class */
public final class restoreViewState {
    public static void a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof setupDialog) {
            ((setupDialog) viewParent).b(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onStopNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof show) {
            ((show) viewParent).e(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof setupDialog) {
            ((setupDialog) viewParent).b(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedFling");
            Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    @Deprecated
    public static boolean a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof setupDialog) {
            ((setupDialog) viewParent).b(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScrollAccepted");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedPreFling");
            Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof setupDialog) {
            ((setupDialog) viewParent).c(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }
    }

    public static boolean e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof setupDialog) {
            return ((setupDialog) viewParent).c(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onStartNestedScroll");
            Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }
}
