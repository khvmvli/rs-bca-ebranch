package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import o.getChildFragmentManager;
import o.setGuidelineBegin;
/* loaded from: classes-dex2jar.jar:o/onDismiss.class */
public class onDismiss {
    private static final View.AccessibilityDelegate b = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/onDismiss$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends View.AccessibilityDelegate {
        final onDismiss c;

        IconCompatParcelizer(onDismiss ondismiss) {
            this.c = ondismiss;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.c.b(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            getEnterAnim c = this.c.c(view);
            return c != null ? (AccessibilityNodeProvider) c.d() : null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.c.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            getChildFragmentManager d = getChildFragmentManager.d(accessibilityNodeInfo);
            d.m(findFragmentByWho.E(view));
            d.i(findFragmentByWho.C(view));
            d.h(findFragmentByWho.d(view));
            d.j(findFragmentByWho.u(view));
            this.c.b(view, d);
            d.b(accessibilityNodeInfo.getText(), view);
            List<getChildFragmentManager.read> d2 = onDismiss.d(view);
            for (int i = 0; i < d2.size(); i++) {
                d.a(d2.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.c.d(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.c.d(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.c.b(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.c.b(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.c.e(view, accessibilityEvent);
        }
    }

    public onDismiss() {
        this(b);
    }

    public onDismiss(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.c = new IconCompatParcelizer(this);
    }

    private boolean b(ClickableSpan clickableSpan, View view) {
        if (clickableSpan == null) {
            return false;
        }
        ClickableSpan[] e = getChildFragmentManager.e(view.createAccessibilityNodeInfo().getText());
        int i = 0;
        while (e != null && i < e.length) {
            if (clickableSpan.equals(e[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    static List<getChildFragmentManager.read> d(View view) {
        List<getChildFragmentManager.read> list = (List) view.getTag(setGuidelineBegin.RemoteActionCompatParcelizer.F);
        List<getChildFragmentManager.read> list2 = list;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    private boolean e(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(setGuidelineBegin.RemoteActionCompatParcelizer.E);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!b(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void b(View view, int i) {
        this.a.sendAccessibilityEvent(view, i);
    }

    public void b(View view, getChildFragmentManager getchildfragmentmanager) {
        this.a.onInitializeAccessibilityNodeInfo(view, getchildfragmentmanager.x());
    }

    public boolean b(View view, int i, Bundle bundle) {
        List<getChildFragmentManager.read> d = d(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= d.size()) {
                break;
            }
            getChildFragmentManager.read read = d.get(i2);
            if (read.e() == i) {
                z = read.e(view, bundle);
                break;
            }
            i2++;
        }
        boolean z2 = z;
        if (!z) {
            z2 = this.a.performAccessibilityAction(view, i, bundle);
        }
        boolean z3 = z2;
        if (!z2) {
            z3 = z2;
            if (i == setGuidelineBegin.RemoteActionCompatParcelizer.d) {
                z3 = e(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
            }
        }
        return z3;
    }

    public boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public getEnterAnim c(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new getEnterAnim(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.AccessibilityDelegate e() {
        return this.c;
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
