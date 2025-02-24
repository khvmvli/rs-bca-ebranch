package o;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import io.realm.internal.Property;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.getContext;
import o.setGuidelineBegin;
/* loaded from: classes-dex2jar.jar:o/getChildFragmentManager.class */
public class getChildFragmentManager {
    private static int a;
    private final AccessibilityNodeInfo d;
    public int b = -1;
    private int e = -1;

    /* loaded from: classes-dex2jar.jar:o/getChildFragmentManager$IconCompatParcelizer.class */
    public static class IconCompatParcelizer {
        final Object b;

        IconCompatParcelizer(Object obj) {
            this.b = obj;
        }

        public static IconCompatParcelizer c(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new IconCompatParcelizer(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getChildFragmentManager$read.class */
    public static class read {
        public static final read A;
        public static final read B;
        public static final read E;
        public static final read F;
        public static final read G;
        public static final read H;
        public static final read M;
        public static final read N;
        public static final read g;
        public static final read m;

        /* renamed from: o */
        public static final read f143o;
        public static final read p;
        public static final read q;
        public static final read s;
        public static final read v;
        public static final read w;
        public static final read x;
        final Object L;
        protected final getContext P;
        private final Class<? extends getContext.write> R;
        private final int S;
        public static final read k = new read(1, null);
        public static final read b = new read(2, null);
        public static final read I = new read(4, null);
        public static final read e = new read(8, null);
        public static final read d = new read(16, null);
        public static final read l = new read(32, null);
        public static final read a = new read(64, null);
        public static final read c = new read(Property.TYPE_ARRAY, null);
        public static final read r = new read((int) Property.TYPE_SET, (CharSequence) null, getContext.RemoteActionCompatParcelizer.class);
        public static final read u = new read((int) Property.TYPE_DICTIONARY, (CharSequence) null, getContext.RemoteActionCompatParcelizer.class);
        public static final read t = new read(1024, (CharSequence) null, getContext.IconCompatParcelizer.class);
        public static final read z = new read(2048, (CharSequence) null, getContext.IconCompatParcelizer.class);
        public static final read D = new read(4096, null);
        public static final read C = new read(8192, null);
        public static final read i = new read(16384, null);
        public static final read y = new read(32768, null);
        public static final read f = new read(65536, null);
        public static final read K = new read(131072, (CharSequence) null, getContext$MediaBrowserCompat$ItemReceiver.class);
        public static final read n = new read(262144, null);
        public static final read j = new read(524288, null);
        public static final read h = new read(1048576, null);
        public static final read J = new read(2097152, (CharSequence) null, getContext.MediaDescriptionCompat.class);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            N = new read(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            H = new read(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, getContext.read.class);
            G = new read(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            B = new read(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            A = new read(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            F = new read(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            x = new read(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            q = new read(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            p = new read(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            v = new read(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            g = new read(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            E = new read(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, getContext$MediaBrowserCompat$MediaItem.class);
            s = new read(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, getContext$MediaBrowserCompat$CustomActionResultReceiver.class);
            M = new read(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            m = new read(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            w = new read(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            if (Build.VERSION.SDK_INT >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            f143o = new read(accessibilityAction, 16908372, null, null, null);
        }

        public read(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        private read(int i2, CharSequence charSequence, Class<? extends getContext.write> cls) {
            this(null, i2, charSequence, null, cls);
        }

        public read(int i2, CharSequence charSequence, getContext getcontext) {
            this(null, i2, charSequence, getcontext, null);
        }

        read(Object obj) {
            this(obj, 0, null, null, null);
        }

        read(Object obj, int i2, CharSequence charSequence, getContext getcontext, Class<? extends getContext.write> cls) {
            this.S = i2;
            this.P = getcontext;
            if (obj == null) {
                this.L = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.L = obj;
            }
            this.R = cls;
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.L).getLabel();
        }

        public read c(CharSequence charSequence, getContext getcontext) {
            return new read(null, this.S, charSequence, getcontext, this.R);
        }

        public int e() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.L).getId();
        }

        public boolean e(View view, Bundle bundle) {
            if (this.P == null) {
                return false;
            }
            Class<? extends getContext.write> cls = this.R;
            if (cls != null) {
                try {
                    ((getContext.write) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).c = bundle;
                } catch (Exception e2) {
                    Class<? extends getContext.write> cls2 = this.R;
                    String name = cls2 == null ? "null" : cls2.getName();
                    StringBuilder sb = new StringBuilder("Failed to execute command with argument class ViewCommandArgument: ");
                    sb.append(name);
                    Log.e("A11yActionCompat", sb.toString(), e2);
                }
            }
            return this.P.b(view);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            Object obj2 = this.L;
            return obj2 == null ? read.L == null : obj2.equals(read.L);
        }

        public int hashCode() {
            Object obj = this.L;
            return obj != null ? obj.hashCode() : 0;
        }
    }

    private getChildFragmentManager(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.d = accessibilityNodeInfo;
    }

    private boolean B() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private void C() {
        this.d.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.d.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.d.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.d.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private void a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private static String b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case Property.TYPE_ARRAY:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case Property.TYPE_SET:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case Property.TYPE_DICTIONARY:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static getChildFragmentManager b() {
        return d(AccessibilityNodeInfo.obtain());
    }

    private int c(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = a;
        a = i2 + 1;
        return i2;
    }

    private void c(int i, boolean z) {
        Bundle i2 = i();
        if (i2 != null) {
            int i3 = 0;
            int i4 = i2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            if (z) {
                i3 = i;
            }
            i2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", ((i ^ -1) & i4) | i3);
        }
    }

    private boolean c(int i) {
        Bundle i2 = i();
        boolean z = false;
        if (i2 == null) {
            return false;
        }
        if ((i2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            z = true;
        }
        return z;
    }

    public static getChildFragmentManager d(View view) {
        return d(AccessibilityNodeInfo.obtain(view));
    }

    public static getChildFragmentManager d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new getChildFragmentManager(accessibilityNodeInfo);
    }

    public static getChildFragmentManager d(getChildFragmentManager getchildfragmentmanager) {
        return d(AccessibilityNodeInfo.obtain(getchildfragmentmanager.d));
    }

    private List<Integer> e(String str) {
        ArrayList<Integer> integerArrayList = this.d.getExtras().getIntegerArrayList(str);
        ArrayList<Integer> arrayList = integerArrayList;
        if (integerArrayList == null) {
            arrayList = new ArrayList<>();
            this.d.getExtras().putIntegerArrayList(str, arrayList);
        }
        return arrayList;
    }

    public static ClickableSpan[] e(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> f(View view) {
        SparseArray<WeakReference<ClickableSpan>> h = h(view);
        SparseArray<WeakReference<ClickableSpan>> sparseArray = h;
        if (h == null) {
            sparseArray = new SparseArray<>();
            view.setTag(setGuidelineBegin.RemoteActionCompatParcelizer.E, sparseArray);
        }
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> h(View view) {
        return (SparseArray) view.getTag(setGuidelineBegin.RemoteActionCompatParcelizer.E);
    }

    private void j(View view) {
        SparseArray<WeakReference<ClickableSpan>> h = h(view);
        if (h != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < h.size(); i++) {
                if (h.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                h.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public int a() {
        return this.d.getChildCount();
    }

    public void a(Rect rect) {
        this.d.setBoundsInScreen(rect);
    }

    public void a(View view) {
        this.d.addChild(view);
    }

    public void a(View view, int i) {
        this.e = i;
        this.d.setSource(view, i);
    }

    public void a(CharSequence charSequence) {
        this.d.setError(charSequence);
    }

    public void a(read read2) {
        this.d.addAction((AccessibilityNodeInfo.AccessibilityAction) read2.L);
    }

    public void a(boolean z) {
        this.d.setCanOpenPopup(z);
    }

    @Deprecated
    public void b(Rect rect) {
        this.d.getBoundsInParent(rect);
    }

    public void b(View view) {
        this.b = -1;
        this.d.setParent(view);
    }

    public void b(View view, int i) {
        this.d.addChild(view, i);
    }

    public void b(CharSequence charSequence) {
        this.d.setClassName(charSequence);
    }

    public void b(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            C();
            j(view);
            ClickableSpan[] e = e(charSequence);
            if (e != null && e.length > 0) {
                i().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", setGuidelineBegin.RemoteActionCompatParcelizer.d);
                SparseArray<WeakReference<ClickableSpan>> f = f(view);
                int i = 0;
                while (e != null && i < e.length) {
                    int c = c(e[i], f);
                    f.put(c, new WeakReference<>(e[i]));
                    a(e[i], (Spanned) charSequence, c);
                    i++;
                }
            }
        }
    }

    public void b(Object obj) {
        this.d.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((IconCompatParcelizer) obj).b);
    }

    public void b(boolean z) {
        this.d.setAccessibilityFocused(z);
    }

    public boolean b(int i, Bundle bundle) {
        return this.d.performAction(i, bundle);
    }

    public boolean b(read read2) {
        return this.d.removeAction((AccessibilityNodeInfo.AccessibilityAction) read2.L);
    }

    public CharSequence c() {
        return this.d.getClassName();
    }

    public void c(Rect rect) {
        this.d.getBoundsInScreen(rect);
    }

    public void c(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.d.setTraversalAfter(view);
        }
    }

    public void c(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
    }

    public void c(Object obj) {
        this.d.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver) obj).a);
    }

    public void c(boolean z) {
        this.d.setCheckable(z);
    }

    public List<read> d() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.d.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new read(actionList.get(i)));
        }
        return arrayList;
    }

    public void d(int i) {
        this.d.setMaxTextLength(i);
    }

    @Deprecated
    public void d(Rect rect) {
        this.d.setBoundsInParent(rect);
    }

    public void d(View view, int i) {
        this.b = i;
        this.d.setParent(view, i);
    }

    public void d(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.d.setHintText(charSequence);
        } else {
            this.d.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void d(boolean z) {
        this.d.setClickable(z);
    }

    public int e() {
        return this.d.getActions();
    }

    public void e(int i) {
        this.d.addAction(i);
    }

    public void e(View view) {
        this.e = -1;
        this.d.setSource(view);
    }

    public void e(boolean z) {
        this.d.setChecked(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof getChildFragmentManager)) {
            return false;
        }
        getChildFragmentManager getchildfragmentmanager = (getChildFragmentManager) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.d;
        if (accessibilityNodeInfo == null) {
            if (getchildfragmentmanager.d != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(getchildfragmentmanager.d)) {
            return false;
        }
        return this.e == getchildfragmentmanager.e && this.b == getchildfragmentmanager.b;
    }

    public String f() {
        return this.d.getViewIdResourceName();
    }

    public void f(CharSequence charSequence) {
        this.d.setPackageName(charSequence);
    }

    public void f(boolean z) {
        this.d.setFocused(z);
    }

    public CharSequence g() {
        if (!B()) {
            return this.d.getText();
        }
        List<Integer> e = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> e2 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> e3 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> e4 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.d.getText(), 0, this.d.getText().length()));
        for (int i = 0; i < e.size(); i++) {
            spannableString.setSpan(new getAllowEnterTransitionOverlap(e4.get(i).intValue(), this, i().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), e.get(i).intValue(), e2.get(i).intValue(), e3.get(i).intValue());
        }
        return spannableString;
    }

    public void g(CharSequence charSequence) {
        this.d.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void g(boolean z) {
        this.d.setDismissable(z);
    }

    public CharSequence h() {
        return this.d.getContentDescription();
    }

    public void h(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.d.setPaneTitle(charSequence);
        } else {
            this.d.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void h(boolean z) {
        this.d.setEnabled(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.d;
        return accessibilityNodeInfo == null ? 0 : accessibilityNodeInfo.hashCode();
    }

    public Bundle i() {
        return this.d.getExtras();
    }

    public void i(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void i(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.d.setHeading(z);
        } else {
            c(2, z);
        }
    }

    public CharSequence j() {
        return this.d.getPackageName();
    }

    public void j(CharSequence charSequence) {
        if (setSmoothScrollingEnabled.e()) {
            this.d.setStateDescription(charSequence);
        } else {
            this.d.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void j(boolean z) {
        this.d.setFocusable(z);
    }

    public void k(boolean z) {
        this.d.setScrollable(z);
    }

    public boolean k() {
        return this.d.isCheckable();
    }

    public void l(boolean z) {
        this.d.setSelected(z);
    }

    public boolean l() {
        return this.d.isClickable();
    }

    public void m(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.d.setScreenReaderFocusable(z);
        } else {
            c(1, z);
        }
    }

    public boolean m() {
        return this.d.isChecked();
    }

    public void n(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.d.setShowingHintText(z);
        } else {
            c(4, z);
        }
    }

    public boolean n() {
        return this.d.isEnabled();
    }

    public void o(boolean z) {
        this.d.setLongClickable(z);
    }

    public boolean o() {
        return this.d.isAccessibilityFocused();
    }

    public boolean p() {
        return this.d.isFocused();
    }

    public void q(boolean z) {
        this.d.setVisibleToUser(z);
    }

    public boolean q() {
        return this.d.isPassword();
    }

    public boolean r() {
        return this.d.isScrollable();
    }

    public boolean s() {
        return this.d.isFocusable();
    }

    public boolean t() {
        return this.d.isLongClickable();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        Rect rect = new Rect();
        b(rect);
        StringBuilder sb2 = new StringBuilder("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        c(rect);
        StringBuilder sb3 = new StringBuilder("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(j());
        sb.append("; className: ");
        sb.append(c());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; contentDescription: ");
        sb.append(h());
        sb.append("; viewId: ");
        sb.append(f());
        sb.append("; checkable: ");
        sb.append(k());
        sb.append("; checked: ");
        sb.append(m());
        sb.append("; focusable: ");
        sb.append(s());
        sb.append("; focused: ");
        sb.append(p());
        sb.append("; selected: ");
        sb.append(w());
        sb.append("; clickable: ");
        sb.append(l());
        sb.append("; longClickable: ");
        sb.append(t());
        sb.append("; enabled: ");
        sb.append(n());
        sb.append("; password: ");
        sb.append(q());
        StringBuilder sb4 = new StringBuilder("; scrollable: ");
        sb4.append(r());
        sb.append(sb4.toString());
        sb.append("; [");
        List<read> d = d();
        for (int i = 0; i < d.size(); i++) {
            read read2 = d.get(i);
            String b = b(read2.e());
            String str = b;
            if (b.equals("ACTION_UNKNOWN")) {
                str = b;
                if (read2.c() != null) {
                    str = read2.c().toString();
                }
            }
            sb.append(str);
            if (i != d.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        return Build.VERSION.SDK_INT >= 26 ? this.d.isShowingHintText() : c(4);
    }

    public void v() {
        this.d.recycle();
    }

    public boolean w() {
        return this.d.isSelected();
    }

    public AccessibilityNodeInfo x() {
        return this.d;
    }

    public boolean y() {
        return this.d.isVisibleToUser();
    }
}
