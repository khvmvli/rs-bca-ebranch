package com.facebook.stetho.common.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Spinner;
import java.util.List;
import o.findFragmentByWho;
import o.getChildFragmentManager;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/common/android/AccessibilityUtil.class */
public final class AccessibilityUtil {
    private AccessibilityUtil() {
    }

    /* JADX WARN: Finally extract failed */
    public static boolean hasFocusableAncestor(getChildFragmentManager getchildfragmentmanager, View view) {
        if (getchildfragmentmanager == null || view == null) {
            return false;
        }
        ViewParent r = findFragmentByWho.r(view);
        if (!(r instanceof View)) {
            return false;
        }
        getChildFragmentManager b = getChildFragmentManager.b();
        try {
            findFragmentByWho.c((View) r, b);
            if (b == null) {
                b.v();
                return false;
            } else if (isAccessibilityFocusable(b, (View) r)) {
                b.v();
                return true;
            } else if (hasFocusableAncestor(b, (View) r)) {
                b.v();
                return true;
            } else {
                b.v();
                return false;
            }
        } catch (Throwable th) {
            b.v();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean hasNonActionableSpeakingDescendants(getChildFragmentManager getchildfragmentmanager, View view) {
        if (getchildfragmentmanager == null || view == null || !(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                getChildFragmentManager b = getChildFragmentManager.b();
                try {
                    findFragmentByWho.c(childAt, b);
                    if (!isAccessibilityFocusable(b, childAt) && isSpeakingNode(b, childAt)) {
                        b.v();
                        return true;
                    }
                    b.v();
                } catch (Throwable th) {
                    b.v();
                    throw th;
                }
            }
        }
        return false;
    }

    public static boolean hasText(getChildFragmentManager getchildfragmentmanager) {
        boolean z = false;
        if (getchildfragmentmanager == null) {
            return false;
        }
        if (!TextUtils.isEmpty(getchildfragmentmanager.g()) || !TextUtils.isEmpty(getchildfragmentmanager.h())) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (isSpeakingNode(r3, r4) != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static boolean isAccessibilityFocusable(o.getChildFragmentManager r3, android.view.View r4) {
        /*
            r0 = 1
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0032
            r0 = r4
            if (r0 != 0) goto L_0x000d
            goto L_0x0032
        L_0x000d:
            r0 = r3
            boolean r0 = r0.y()
            if (r0 != 0) goto L_0x0016
            r0 = 0
            return r0
        L_0x0016:
            r0 = r3
            boolean r0 = isActionableForAccessibility(r0)
            if (r0 == 0) goto L_0x001f
            r0 = 1
            return r0
        L_0x001f:
            r0 = r3
            r1 = r4
            boolean r0 = isTopLevelScrollItem(r0, r1)
            if (r0 == 0) goto L_0x0032
            r0 = r3
            r1 = r4
            boolean r0 = isSpeakingNode(r0, r1)
            if (r0 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r0 = 0
            r5 = r0
        L_0x0034:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.android.AccessibilityUtil.isAccessibilityFocusable(o.getChildFragmentManager, android.view.View):boolean");
    }

    public static boolean isActionableForAccessibility(getChildFragmentManager getchildfragmentmanager) {
        boolean z = false;
        if (getchildfragmentmanager == null) {
            return false;
        }
        if (getchildfragmentmanager.l() || getchildfragmentmanager.t() || getchildfragmentmanager.s()) {
            return true;
        }
        List<getChildFragmentManager.read> d = getchildfragmentmanager.d();
        if (d.contains(16) || d.contains(32) || d.contains(1)) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (hasNonActionableSpeakingDescendants(r3, r4) != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static boolean isSpeakingNode(o.getChildFragmentManager r3, android.view.View r4) {
        /*
            r0 = 0
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0054
            r0 = r4
            if (r0 != 0) goto L_0x0011
            r0 = r5
            r6 = r0
            goto L_0x0054
        L_0x0011:
            r0 = r3
            boolean r0 = r0.y()
            if (r0 != 0) goto L_0x001a
            r0 = 0
            return r0
        L_0x001a:
            r0 = r4
            int r0 = o.findFragmentByWho.l(r0)
            r7 = r0
            r0 = r5
            r6 = r0
            r0 = r7
            r1 = 4
            if (r0 == r1) goto L_0x0054
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L_0x003a
            r0 = r3
            int r0 = r0.a()
            if (r0 > 0) goto L_0x003a
            r0 = r5
            r6 = r0
            goto L_0x0054
        L_0x003a:
            r0 = r3
            boolean r0 = r0.k()
            if (r0 != 0) goto L_0x0052
            r0 = r3
            boolean r0 = hasText(r0)
            if (r0 != 0) goto L_0x0052
            r0 = r5
            r6 = r0
            r0 = r3
            r1 = r4
            boolean r0 = hasNonActionableSpeakingDescendants(r0, r1)
            if (r0 == 0) goto L_0x0054
        L_0x0052:
            r0 = 1
            r6 = r0
        L_0x0054:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.android.AccessibilityUtil.isSpeakingNode(o.getChildFragmentManager, android.view.View):boolean");
    }

    public static boolean isTopLevelScrollItem(getChildFragmentManager getchildfragmentmanager, View view) {
        View view2;
        boolean z = false;
        if (getchildfragmentmanager == null || view == null || (view2 = (View) findFragmentByWho.r(view)) == null) {
            return false;
        }
        if (getchildfragmentmanager.r()) {
            return true;
        }
        List<getChildFragmentManager.read> d = getchildfragmentmanager.d();
        if (d.contains(4096) || d.contains(8192)) {
            return true;
        }
        if (view2 instanceof Spinner) {
            return false;
        }
        if ((view2 instanceof AdapterView) || (view2 instanceof ScrollView) || (view2 instanceof HorizontalScrollView)) {
            z = true;
        }
        return z;
    }
}
