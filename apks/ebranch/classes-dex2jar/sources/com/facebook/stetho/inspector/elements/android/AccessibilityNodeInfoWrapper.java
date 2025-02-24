package com.facebook.stetho.inspector.elements.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.stetho.common.android.AccessibilityUtil;
import io.realm.internal.Property;
import o.findFragmentByWho;
import o.getChildFragmentManager;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/elements/android/AccessibilityNodeInfoWrapper.class */
public final class AccessibilityNodeInfoWrapper {
    public static getChildFragmentManager createNodeInfoFromView(View view) {
        getChildFragmentManager b = getChildFragmentManager.b();
        findFragmentByWho.c(view, b);
        return b;
    }

    public static String getActions(View view) {
        getChildFragmentManager createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            StringBuilder sb = new StringBuilder();
            for (getChildFragmentManager.read read : createNodeInfoFromView.d()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                int e = read.e();
                if (e == 1) {
                    sb.append("focus");
                } else if (e != 2) {
                    switch (e) {
                        case 4:
                            sb.append("select");
                            continue;
                        case 8:
                            sb.append("clear-selection");
                            continue;
                        case 16:
                            sb.append("click");
                            continue;
                        case 32:
                            sb.append("long-click");
                            continue;
                        case 64:
                            sb.append("accessibility-focus");
                            continue;
                        case Property.TYPE_ARRAY:
                            sb.append("clear-accessibility-focus");
                            continue;
                        case Property.TYPE_SET:
                            sb.append("next-at-movement-granularity");
                            continue;
                        case Property.TYPE_DICTIONARY:
                            sb.append("previous-at-movement-granularity");
                            continue;
                        case 1024:
                            sb.append("next-html-element");
                            continue;
                        case 2048:
                            sb.append("previous-html-element");
                            continue;
                        case 4096:
                            sb.append("scroll-forward");
                            continue;
                        case 8192:
                            sb.append("scroll-backward");
                            continue;
                        case 16384:
                            sb.append("copy");
                            continue;
                        case 32768:
                            sb.append("paste");
                            continue;
                        case 65536:
                            sb.append("cut");
                            continue;
                        case 131072:
                            sb.append("set-selection");
                            continue;
                        default:
                            CharSequence c = read.c();
                            if (c == null) {
                                sb.append("unknown");
                                break;
                            } else {
                                sb.append(c);
                                continue;
                            }
                    }
                } else {
                    sb.append("clear-focus");
                }
            }
            return sb.length() > 0 ? sb.toString() : null;
        } finally {
            createNodeInfoFromView.v();
        }
    }

    public static CharSequence getDescription(View view) {
        getChildFragmentManager createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            CharSequence h = createNodeInfoFromView.h();
            CharSequence g = createNodeInfoFromView.g();
            boolean z = !TextUtils.isEmpty(g);
            boolean z2 = view instanceof EditText;
            if (!(TextUtils.isEmpty(h) || (z2 && z))) {
                return h;
            }
            if (z) {
                return g;
            }
            boolean z3 = view instanceof ViewGroup;
            String str = null;
            if (z3) {
                StringBuilder sb = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    getChildFragmentManager b = getChildFragmentManager.b();
                    findFragmentByWho.c(childAt, b);
                    CharSequence description = (!AccessibilityUtil.isSpeakingNode(b, childAt) || AccessibilityUtil.isAccessibilityFocusable(b, childAt)) ? null : getDescription(childAt);
                    if (!TextUtils.isEmpty(description)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(description);
                    }
                    b.v();
                }
                if (sb.length() > 0) {
                    str = sb.toString();
                }
                return str;
            }
            createNodeInfoFromView.v();
            return null;
        } finally {
            createNodeInfoFromView.v();
        }
    }

    /* JADX WARN: Finally extract failed */
    public static String getFocusableReasons(View view) {
        getChildFragmentManager createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            boolean hasText = AccessibilityUtil.hasText(createNodeInfoFromView);
            boolean k = createNodeInfoFromView.k();
            boolean hasNonActionableSpeakingDescendants = AccessibilityUtil.hasNonActionableSpeakingDescendants(createNodeInfoFromView, view);
            if (AccessibilityUtil.isActionableForAccessibility(createNodeInfoFromView)) {
                if (createNodeInfoFromView.a() <= 0) {
                    createNodeInfoFromView.v();
                    return "View is actionable and has no children.";
                } else if (hasText) {
                    createNodeInfoFromView.v();
                    return "View is actionable and has a description.";
                } else if (k) {
                    createNodeInfoFromView.v();
                    return "View is actionable and checkable.";
                } else if (hasNonActionableSpeakingDescendants) {
                    createNodeInfoFromView.v();
                    return "View is actionable and has non-actionable descendants with descriptions.";
                }
            }
            if (AccessibilityUtil.isTopLevelScrollItem(createNodeInfoFromView, view)) {
                if (hasText) {
                    createNodeInfoFromView.v();
                    return "View is a direct child of a scrollable container and has a description.";
                } else if (k) {
                    createNodeInfoFromView.v();
                    return "View is a direct child of a scrollable container and is checkable.";
                } else if (hasNonActionableSpeakingDescendants) {
                    createNodeInfoFromView.v();
                    return "View is a direct child of a scrollable container and has non-actionable descendants with descriptions.";
                }
            }
            createNodeInfoFromView.v();
            if (hasText) {
                return "View has a description and is not actionable, but has no actionable ancestor.";
            }
            return null;
        } catch (Throwable th) {
            createNodeInfoFromView.v();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean getIgnored(View view) {
        int l = findFragmentByWho.l(view);
        if (l == 2 || l == 4) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (findFragmentByWho.l((View) parent) == 4) {
                return true;
            }
        }
        getChildFragmentManager createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!createNodeInfoFromView.y()) {
                createNodeInfoFromView.v();
                return true;
            } else if (AccessibilityUtil.isAccessibilityFocusable(createNodeInfoFromView, view)) {
                if (createNodeInfoFromView.a() <= 0) {
                    createNodeInfoFromView.v();
                    return false;
                } else if (AccessibilityUtil.isSpeakingNode(createNodeInfoFromView, view)) {
                    createNodeInfoFromView.v();
                    return false;
                } else {
                    createNodeInfoFromView.v();
                    return true;
                }
            } else if (AccessibilityUtil.hasFocusableAncestor(createNodeInfoFromView, view) || !AccessibilityUtil.hasText(createNodeInfoFromView)) {
                createNodeInfoFromView.v();
                return true;
            } else {
                createNodeInfoFromView.v();
                return false;
            }
        } catch (Throwable th) {
            createNodeInfoFromView.v();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static String getIgnoredReasons(View view) {
        int l = findFragmentByWho.l(view);
        if (l == 2) {
            return "View has importantForAccessibility set to 'NO'.";
        }
        if (l == 4) {
            return "View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (findFragmentByWho.l((View) parent) == 4) {
                return "An ancestor View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
            }
        }
        getChildFragmentManager createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!createNodeInfoFromView.y()) {
                createNodeInfoFromView.v();
                return "View is not visible.";
            } else if (AccessibilityUtil.isAccessibilityFocusable(createNodeInfoFromView, view)) {
                createNodeInfoFromView.v();
                return "View is actionable, but has no description.";
            } else if (AccessibilityUtil.hasText(createNodeInfoFromView)) {
                createNodeInfoFromView.v();
                return "View is not actionable, and an ancestor View has co-opted its description.";
            } else {
                createNodeInfoFromView.v();
                return "View is not actionable and has no description.";
            }
        } catch (Throwable th) {
            createNodeInfoFromView.v();
            throw th;
        }
    }

    public static boolean getIsAccessibilityFocused(View view) {
        getChildFragmentManager createNodeInfoFromView = createNodeInfoFromView(view);
        boolean o2 = createNodeInfoFromView.o();
        createNodeInfoFromView.v();
        return o2;
    }
}
