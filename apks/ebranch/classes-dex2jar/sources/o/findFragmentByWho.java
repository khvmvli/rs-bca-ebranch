package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.WindowInsetsCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.getChildFragmentManager;
import o.onDismiss;
import o.setGuidelineBegin;
/* loaded from: classes-dex2jar.jar:o/findFragmentByWho.class */
public class findFragmentByWho {
    private static Field a;
    private static ThreadLocal<Rect> i;
    private static final AtomicInteger f = new AtomicInteger(1);
    private static WeakHashMap<View, generateActivityResultKey> h = null;
    private static boolean c = false;
    private static final int[] b = {setGuidelineBegin.RemoteActionCompatParcelizer.e, setGuidelineBegin.RemoteActionCompatParcelizer.b, setGuidelineBegin.RemoteActionCompatParcelizer.m, setGuidelineBegin.RemoteActionCompatParcelizer.w, setGuidelineBegin.RemoteActionCompatParcelizer.A, setGuidelineBegin.RemoteActionCompatParcelizer.D, setGuidelineBegin.RemoteActionCompatParcelizer.z, setGuidelineBegin.RemoteActionCompatParcelizer.H, setGuidelineBegin.RemoteActionCompatParcelizer.I, setGuidelineBegin.RemoteActionCompatParcelizer.G, setGuidelineBegin.RemoteActionCompatParcelizer.a, setGuidelineBegin.RemoteActionCompatParcelizer.c, setGuidelineBegin.RemoteActionCompatParcelizer.g, setGuidelineBegin.RemoteActionCompatParcelizer.f, setGuidelineBegin.RemoteActionCompatParcelizer.j, setGuidelineBegin.RemoteActionCompatParcelizer.i, setGuidelineBegin.RemoteActionCompatParcelizer.h, setGuidelineBegin.RemoteActionCompatParcelizer.n, setGuidelineBegin.RemoteActionCompatParcelizer.l, setGuidelineBegin.RemoteActionCompatParcelizer.f227o, setGuidelineBegin.RemoteActionCompatParcelizer.k, setGuidelineBegin.RemoteActionCompatParcelizer.q, setGuidelineBegin.RemoteActionCompatParcelizer.r, setGuidelineBegin.RemoteActionCompatParcelizer.p, setGuidelineBegin.RemoteActionCompatParcelizer.t, setGuidelineBegin.RemoteActionCompatParcelizer.s, setGuidelineBegin.RemoteActionCompatParcelizer.x, setGuidelineBegin.RemoteActionCompatParcelizer.v, setGuidelineBegin.RemoteActionCompatParcelizer.y, setGuidelineBegin.RemoteActionCompatParcelizer.u, setGuidelineBegin.RemoteActionCompatParcelizer.C, setGuidelineBegin.RemoteActionCompatParcelizer.B};
    private static final initLifecycle d = new initLifecycle() { // from class: o.findFragmentByWho.3
        @Override // o.initLifecycle
        public onSaveInstanceState a(onSaveInstanceState onsaveinstancestate) {
            return onsaveinstancestate;
        }
    };
    private static RemoteActionCompatParcelizer e = new RemoteActionCompatParcelizer();

    /* loaded from: classes-dex2jar.jar:o/findFragmentByWho$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer<T> {
        private final int a;
        private final Class<T> b;
        private final int c;
        private final int d;

        IconCompatParcelizer(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        IconCompatParcelizer(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        private boolean a() {
            return true;
        }

        private boolean e() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        abstract T a(View view);

        void b(View view, T t) {
            if (e()) {
                d(view, (View) t);
            } else if (a() && c(c(view), t)) {
                findFragmentByWho.q(view);
                view.setTag(this.a, t);
                findFragmentByWho.b(view, this.d);
            }
        }

        T c(View view) {
            if (e()) {
                return a(view);
            }
            if (!a()) {
                return null;
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }

        boolean c(T t, T t2) {
            return !t2.equals(t);
        }

        abstract void d(View view, T t);

        boolean d(Boolean bool, Boolean bool2) {
            boolean z = false;
            if ((bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue())) {
                z = true;
            }
            return z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/findFragmentByWho$MediaMetadataCompat.class */
    public static class MediaMetadataCompat {
        private static final ArrayList<WeakReference<View>> b = new ArrayList<>();
        private WeakHashMap<View, Boolean> c = null;
        private SparseArray<WeakReference<View>> d = null;
        private WeakReference<KeyEvent> a = null;

        MediaMetadataCompat() {
        }

        private SparseArray<WeakReference<View>> c() {
            if (this.d == null) {
                this.d = new SparseArray<>();
            }
            return this.d;
        }

        static MediaMetadataCompat c(View view) {
            MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) view.getTag(setGuidelineBegin.RemoteActionCompatParcelizer.R);
            MediaMetadataCompat mediaMetadataCompat2 = mediaMetadataCompat;
            if (mediaMetadataCompat == null) {
                mediaMetadataCompat2 = new MediaMetadataCompat();
                view.setTag(setGuidelineBegin.RemoteActionCompatParcelizer.R, mediaMetadataCompat2);
            }
            return mediaMetadataCompat2;
        }

        private View d(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.c;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View d = d(viewGroup.getChildAt(childCount), keyEvent);
                    if (d != null) {
                        return d;
                    }
                }
            }
            if (e(view, keyEvent)) {
                return view;
            }
            return null;
        }

        private void d() {
            WeakHashMap<View, Boolean> weakHashMap = this.c;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = b;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.c == null) {
                        this.c = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = b;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.c.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.c.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(setGuidelineBegin.RemoteActionCompatParcelizer.Q);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((findFragmentByWho$MediaBrowserCompat$MediaItem) arrayList.get(size)).c(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        boolean a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                d();
            }
            View d = d(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (d != null && !KeyEvent.isModifierKey(keyCode)) {
                    c().put(keyCode, new WeakReference<>(d));
                }
            }
            return d != null;
        }

        boolean b(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.a;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.a = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> c = c();
            if (keyEvent.getAction() != 1 || (indexOfKey = c.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = c.valueAt(indexOfKey);
                c.removeAt(indexOfKey);
            }
            WeakReference<View> weakReference3 = weakReference;
            if (weakReference == null) {
                weakReference3 = c.get(keyEvent.getKeyCode());
            }
            if (weakReference3 == null) {
                return false;
            }
            View view = weakReference3.get();
            if (view == null || !findFragmentByWho.F(view)) {
                return true;
            }
            e(view, keyEvent);
            return true;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/findFragmentByWho$RemoteActionCompatParcelizer.class */
    static class RemoteActionCompatParcelizer implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private WeakHashMap<View, Boolean> b = new WeakHashMap<>();

        RemoteActionCompatParcelizer() {
        }

        private void c(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                findFragmentByWho.b(view, z2 ? 16 : 32);
                this.b.put(view, Boolean.valueOf(z2));
            }
        }

        private void e(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.b.entrySet()) {
                    c(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            e(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/findFragmentByWho$read.class */
    public static class read {
        static WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets n = windowInsetsCompat.n();
            if (n != null) {
                return WindowInsetsCompat.a(view.computeSystemWindowInsets(n, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        static void a(final View view, final instantiate instantiate) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(setGuidelineBegin.RemoteActionCompatParcelizer.N, instantiate);
            }
            if (instantiate == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(setGuidelineBegin.RemoteActionCompatParcelizer.P));
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o.findFragmentByWho.read.2
                    WindowInsetsCompat c = null;

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        WindowInsetsCompat a = WindowInsetsCompat.a(windowInsets, view2);
                        if (Build.VERSION.SDK_INT < 30) {
                            read.a(windowInsets, view);
                            if (a.equals(this.c)) {
                                return instantiate.d(view2, a).n();
                            }
                        }
                        this.c = a;
                        WindowInsetsCompat d = instantiate.d(view2, a);
                        if (Build.VERSION.SDK_INT >= 30) {
                            return d.n();
                        }
                        findFragmentByWho.J(view2);
                        return d.n();
                    }
                });
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(setGuidelineBegin.RemoteActionCompatParcelizer.P);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static WindowInsetsCompat c(View view) {
            return WindowInsetsCompat.IconCompatParcelizer.b(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/findFragmentByWho$write.class */
    public static class write {
        public static WindowInsetsCompat b(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat c = WindowInsetsCompat.c(rootWindowInsets);
            c.d(c);
            c.d(view.getRootView());
            return c;
        }
    }

    @Deprecated
    protected findFragmentByWho() {
    }

    public static boolean A(View view) {
        return view.hasOnClickListeners();
    }

    public static float B(View view) {
        return view.getZ();
    }

    public static boolean C(View view) {
        Boolean c2 = a().c(view);
        return c2 == null ? false : c2.booleanValue();
    }

    public static boolean D(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean E(View view) {
        Boolean c2 = b().c(view);
        return c2 == null ? false : c2.booleanValue();
    }

    public static boolean F(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean G(View view) {
        return view.isLaidOut();
    }

    public static boolean H(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static boolean I(View view) {
        return view.isPaddingRelative();
    }

    public static void J(View view) {
        view.requestApplyInsets();
    }

    public static void K(View view) {
        view.postInvalidateOnAnimation();
    }

    private static View.AccessibilityDelegate L(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : N(view);
    }

    public static void M(View view) {
        view.stopNestedScroll();
    }

    private static View.AccessibilityDelegate N(View view) {
        if (c) {
            return null;
        }
        if (a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable th2) {
            c = true;
            return null;
        }
    }

    private static void O(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    private static void P(View view) {
        if (l(view) == 0) {
            j(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (l((View) parent) == 4) {
                j(view, 2);
                return;
            }
        }
    }

    private static List<getChildFragmentManager.read> Q(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(setGuidelineBegin.RemoteActionCompatParcelizer.F);
        ArrayList arrayList2 = arrayList;
        if (arrayList == null) {
            arrayList2 = new ArrayList();
            view.setTag(setGuidelineBegin.RemoteActionCompatParcelizer.F, arrayList2);
        }
        return arrayList2;
    }

    private static int R(View view) {
        List<getChildFragmentManager.read> Q = Q(view);
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = b;
            if (i2 >= iArr.length || i3 != -1) {
                break;
            }
            int i4 = iArr[i2];
            boolean z = true;
            for (int i5 = 0; i5 < Q.size(); i5++) {
                z &= Q.get(i5).e() != i4;
            }
            if (z) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    private static initLifecycle S(View view) {
        return view instanceof initLifecycle ? (initLifecycle) view : d;
    }

    public static int a(View view, CharSequence charSequence, getContext getcontext) {
        int R = R(view);
        if (R != -1) {
            a(view, new getChildFragmentManager.read(R, charSequence, getcontext));
        }
        return R;
    }

    private static IconCompatParcelizer<Boolean> a() {
        return new IconCompatParcelizer<Boolean>(setGuidelineBegin.RemoteActionCompatParcelizer.K, Boolean.class, 28) { // from class: o.findFragmentByWho.5
            public boolean c(Boolean bool, Boolean bool2) {
                return !d(bool, bool2);
            }

            /* renamed from: d */
            public Boolean a(View view) {
                return Boolean.valueOf(view.isAccessibilityHeading());
            }

            public void d(View view, Boolean bool) {
                view.setAccessibilityHeading(bool.booleanValue());
            }
        };
    }

    public static generateActivityResultKey a(View view) {
        if (h == null) {
            h = new WeakHashMap<>();
        }
        generateActivityResultKey generateactivityresultkey = h.get(view);
        generateActivityResultKey generateactivityresultkey2 = generateactivityresultkey;
        if (generateactivityresultkey == null) {
            generateactivityresultkey2 = new generateActivityResultKey(view);
            h.put(view, generateactivityresultkey2);
        }
        return generateactivityresultkey2;
    }

    public static onSaveInstanceState a(View view, onSaveInstanceState onsaveinstancestate) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder("performReceiveContent: ");
            sb.append(onsaveinstancestate);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
            Log.d("ViewCompat", sb.toString());
        }
        prepareCallInternal preparecallinternal = (prepareCallInternal) view.getTag(setGuidelineBegin.RemoteActionCompatParcelizer.M);
        if (preparecallinternal == null) {
            return S(view).a(onsaveinstancestate);
        }
        onSaveInstanceState a2 = preparecallinternal.a(view, onsaveinstancestate);
        return a2 == null ? null : S(view).a(a2);
    }

    public static void a(View view, int i2) {
        view.setAccessibilityLiveRegion(i2);
    }

    private static void a(View view, getChildFragmentManager.read read2) {
        q(view);
        c(read2.e(), view);
        Q(view).add(read2);
        b(view, 0);
    }

    public static void a(View view, getMinimumMaxLifecycleState getminimummaxlifecyclestate) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (getminimummaxlifecyclestate != null ? getminimummaxlifecyclestate.b() : null));
        }
    }

    @Deprecated
    public static void a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return MediaMetadataCompat.c(view).b(keyEvent);
    }

    public static int b(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets n = windowInsetsCompat.n();
        if (n != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(n);
            if (!onApplyWindowInsets.equals(n)) {
                return WindowInsetsCompat.a(onApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    private static IconCompatParcelizer<Boolean> b() {
        return new IconCompatParcelizer<Boolean>(setGuidelineBegin.RemoteActionCompatParcelizer.S, Boolean.class, 28) { // from class: o.findFragmentByWho.1
            /* renamed from: a */
            public void d(View view, Boolean bool) {
                view.setScreenReaderFocusable(bool.booleanValue());
            }

            /* renamed from: b */
            public boolean c(Boolean bool, Boolean bool2) {
                return !d(bool, bool2);
            }

            /* renamed from: e */
            public Boolean a(View view) {
                return Boolean.valueOf(view.isScreenReaderFocusable());
            }
        };
    }

    public static void b(View view, float f2) {
        view.setElevation(f2);
    }

    static void b(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = d(view) != null && view.getVisibility() == 0;
            int i3 = 32;
            if (b(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i3 = 2048;
                }
                obtain.setEventType(i3);
                obtain.setContentChangeTypes(i2);
                if (z) {
                    obtain.getText().add(d(view));
                    P(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), e2);
                }
            }
        }
    }

    public static void b(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static void b(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static void b(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void b(View view, boolean z) {
        view.setHasTransientState(z);
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return MediaMetadataCompat.c(view).a(view, keyEvent);
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets n = windowInsetsCompat.n();
        if (n != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(n);
            if (!dispatchApplyWindowInsets.equals(n)) {
                return WindowInsetsCompat.a(dispatchApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    private static IconCompatParcelizer<CharSequence> c() {
        return new IconCompatParcelizer<CharSequence>(setGuidelineBegin.RemoteActionCompatParcelizer.J, CharSequence.class, 8, 28) { // from class: o.findFragmentByWho.4
            /* renamed from: a */
            public void d(View view, CharSequence charSequence) {
                view.setAccessibilityPaneTitle(charSequence);
            }

            /* renamed from: b */
            public CharSequence a(View view) {
                return view.getAccessibilityPaneTitle();
            }

            /* renamed from: b */
            public boolean c(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    private static void c(int i2, View view) {
        List<getChildFragmentManager.read> Q = Q(view);
        for (int i3 = 0; i3 < Q.size(); i3++) {
            if (Q.get(i3).e() == i2) {
                Q.remove(i3);
                return;
            }
        }
    }

    public static void c(View view, float f2) {
        view.setZ(f2);
    }

    public static void c(View view, int i2) {
        c(i2, view);
        b(view, 0);
    }

    public static void c(View view, int i2, int i3, int i4, int i5) {
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static void c(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static void c(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void c(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static void c(View view, getChildFragmentManager.read read2, CharSequence charSequence, getContext getcontext) {
        if (getcontext == null && charSequence == null) {
            c(view, read2.e());
        } else {
            a(view, read2.c(charSequence, getcontext));
        }
    }

    public static void c(View view, getChildFragmentManager getchildfragmentmanager) {
        view.onInitializeAccessibilityNodeInfo(getchildfragmentmanager.x());
    }

    public static boolean c(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    private static Rect d() {
        if (i == null) {
            i = new ThreadLocal<>();
        }
        Rect rect = i.get();
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect();
            i.set(rect2);
        }
        rect2.setEmpty();
        return rect2;
    }

    public static CharSequence d(View view) {
        return c().c(view);
    }

    public static void d(View view, int i2) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        Rect d2 = d();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            d2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !d2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        h(view, i2);
        if (z && d2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(d2);
        }
    }

    public static void d(View view, instantiate instantiate) {
        read.a(view, instantiate);
    }

    public static void d(View view, onDismiss ondismiss) {
        onDismiss ondismiss2 = ondismiss;
        if (ondismiss == null) {
            ondismiss2 = ondismiss;
            if (L(view) instanceof onDismiss.IconCompatParcelizer) {
                ondismiss2 = new onDismiss();
            }
        }
        view.setAccessibilityDelegate(ondismiss2 == null ? null : ondismiss2.e());
    }

    public static void d(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static int e() {
        return View.generateViewId();
    }

    public static WindowInsetsCompat e(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return read.a(view, windowInsetsCompat, rect);
    }

    public static onDismiss e(View view) {
        View.AccessibilityDelegate L = L(view);
        if (L == null) {
            return null;
        }
        return L instanceof onDismiss.IconCompatParcelizer ? ((onDismiss.IconCompatParcelizer) L).c : new onDismiss(L);
    }

    public static void e(View view, float f2) {
        view.setTranslationZ(f2);
    }

    public static void e(View view, int i2) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        Rect d2 = d();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            d2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !d2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        f(view, i2);
        if (z && d2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(d2);
        }
    }

    public static void e(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            findFragmentByWho$MediaBrowserCompat$CustomActionResultReceiver.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static void e(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static void e(View view, CharSequence charSequence) {
        i().b(view, charSequence);
    }

    public static void e(View view, String str) {
        view.setTransitionName(str);
    }

    public static void e(View view, boolean z) {
        a().b(view, Boolean.valueOf(z));
    }

    public static PorterDuff.Mode f(View view) {
        return view.getBackgroundTintMode();
    }

    private static void f(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            O(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                O((View) parent);
            }
        }
    }

    public static Rect g(View view) {
        return view.getClipBounds();
    }

    public static void g(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    private static void h(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            O(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                O((View) parent);
            }
        }
    }

    public static boolean h(View view) {
        return view.getFitsSystemWindows();
    }

    public static Display i(View view) {
        return view.getDisplay();
    }

    private static IconCompatParcelizer<CharSequence> i() {
        return new IconCompatParcelizer<CharSequence>(setGuidelineBegin.RemoteActionCompatParcelizer.O, CharSequence.class, 64, 30) { // from class: o.findFragmentByWho.2
            /* renamed from: b */
            public void d(View view, CharSequence charSequence) {
                view.setStateDescription(charSequence);
            }

            /* renamed from: b */
            public boolean c(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }

            /* renamed from: e */
            public CharSequence a(View view) {
                return view.getStateDescription();
            }
        };
    }

    public static float j(View view) {
        return view.getElevation();
    }

    public static void j(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    public static int k(View view) {
        return view.getLayoutDirection();
    }

    public static int l(View view) {
        return view.getImportantForAccessibility();
    }

    public static int m(View view) {
        return view.getMinimumHeight();
    }

    public static int n(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static int o(View view) {
        return view.getMinimumWidth();
    }

    public static String[] p(View view) {
        return (String[]) view.getTag(setGuidelineBegin.RemoteActionCompatParcelizer.L);
    }

    static onDismiss q(View view) {
        onDismiss e2 = e(view);
        onDismiss ondismiss = e2;
        if (e2 == null) {
            ondismiss = new onDismiss();
        }
        d(view, ondismiss);
        return ondismiss;
    }

    public static ViewParent r(View view) {
        return view.getParentForAccessibility();
    }

    public static int s(View view) {
        return view.getPaddingEnd();
    }

    public static int t(View view) {
        return view.getPaddingStart();
    }

    public static final CharSequence u(View view) {
        return i().c(view);
    }

    public static WindowInsetsCompat v(View view) {
        return Build.VERSION.SDK_INT >= 23 ? write.b(view) : read.c(view);
    }

    public static int w(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float x(View view) {
        return view.getTranslationZ();
    }

    public static String y(View view) {
        return view.getTransitionName();
    }

    public static boolean z(View view) {
        return view.hasTransientState();
    }
}
