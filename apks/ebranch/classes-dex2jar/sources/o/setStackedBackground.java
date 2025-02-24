package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.setActionBarVisibilityCallback;
import o.setHasDecor;
import o.setOnDismissListener;
import o.setSupportCompoundDrawablesTintList;
/* loaded from: classes-dex2jar.jar:o/setStackedBackground.class */
public final class setStackedBackground extends setBackgroundResource implements setSupportCompoundDrawablesTintList.write {
    private static final Interpolator s = new AccelerateInterpolator();
    private static final Interpolator t = new DecelerateInterpolator();
    private boolean D;
    private Context G;
    IconCompatParcelizer a;
    Context c;
    setSupportButtonTintList d;
    View e;
    setSelector f;
    setActionBarVisibilityCallback.RemoteActionCompatParcelizer g;
    setTextSize h;
    setActionBarVisibilityCallback i;
    setOverlayMode j;
    boolean k;
    setSupportCompoundDrawablesTintList l;
    boolean m;
    boolean n;
    setTabSelected q;
    private boolean v;
    private boolean w;
    private boolean x;
    private Activity y;
    private boolean z;
    private ArrayList<Object> H = new ArrayList<>();
    private int B = -1;
    private ArrayList<Object> C = new ArrayList<>();
    private int u = 0;
    boolean b = true;
    private boolean A = true;

    /* renamed from: o  reason: collision with root package name */
    final getAllowReturnTransitionOverlap f269o = new getAnimatingAway() { // from class: o.setStackedBackground.5
        @Override // o.getAnimatingAway, o.getAllowReturnTransitionOverlap
        public final void c(View view) {
            if (setStackedBackground.this.b && setStackedBackground.this.e != null) {
                setStackedBackground.this.e.setTranslationY(0.0f);
                setStackedBackground.this.d.setTranslationY(0.0f);
            }
            setStackedBackground.this.d.setVisibility(8);
            setStackedBackground.this.d.setTransitioning(false);
            setStackedBackground.this.j = null;
            setStackedBackground setstackedbackground = setStackedBackground.this;
            setActionBarVisibilityCallback.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setstackedbackground.g;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.d(setstackedbackground.i);
                setstackedbackground.i = null;
                setstackedbackground.g = null;
            }
            if (setStackedBackground.this.l != null) {
                findFragmentByWho.J(setStackedBackground.this.l);
            }
        }
    };
    final getAllowReturnTransitionOverlap r = new getAnimatingAway() { // from class: o.setStackedBackground.1
        @Override // o.getAnimatingAway, o.getAllowReturnTransitionOverlap
        public final void c(View view) {
            setStackedBackground.this.j = null;
            setStackedBackground.this.d.requestLayout();
        }
    };
    final getAnimator p = new getAnimator() { // from class: o.setStackedBackground.2
        @Override // o.getAnimator
        public final void d() {
            ((View) setStackedBackground.this.d.getParent()).invalidate();
        }
    };

    /* loaded from: classes-dex2jar.jar:o/setStackedBackground$IconCompatParcelizer.class */
    public final class IconCompatParcelizer extends setActionBarVisibilityCallback implements setOnDismissListener.RemoteActionCompatParcelizer {
        final setOnDismissListener c;
        private final Context d;
        private WeakReference<View> g;
        private setActionBarVisibilityCallback.RemoteActionCompatParcelizer i;

        public IconCompatParcelizer(Context context, setActionBarVisibilityCallback.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.d = context;
            this.i = remoteActionCompatParcelizer;
            setOnDismissListener setondismisslistener = new setOnDismissListener(context);
            setondismisslistener.a = 1;
            this.c = setondismisslistener;
            setondismisslistener.e(this);
        }

        @Override // o.setActionBarVisibilityCallback
        public final MenuInflater a() {
            return new setUiOptions(this.d);
        }

        @Override // o.setActionBarVisibilityCallback
        public final View b() {
            WeakReference<View> weakReference = this.g;
            return weakReference != null ? weakReference.get() : null;
        }

        @Override // o.setActionBarVisibilityCallback
        public final void b(int i) {
            setStackedBackground.this.h.setTitle(setStackedBackground.this.c.getResources().getString(i));
        }

        @Override // o.setActionBarVisibilityCallback
        public final void b(View view) {
            setStackedBackground.this.h.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
        public final boolean b(setOnDismissListener setondismisslistener, MenuItem menuItem) {
            setActionBarVisibilityCallback.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.i;
            if (remoteActionCompatParcelizer != null) {
                return remoteActionCompatParcelizer.c(this, menuItem);
            }
            return false;
        }

        @Override // o.setActionBarVisibilityCallback
        public final void c(CharSequence charSequence) {
            setStackedBackground.this.h.setSubtitle(charSequence);
        }

        public final boolean c() {
            setOnDismissListener setondismisslistener = this.c;
            if (!setondismisslistener.p) {
                setondismisslistener.p = true;
                setondismisslistener.n = false;
                setondismisslistener.t = false;
            }
            try {
                return this.i.d(this, this.c);
            } finally {
                setOnDismissListener setondismisslistener2 = this.c;
                setondismisslistener2.p = false;
                if (setondismisslistener2.n) {
                    setondismisslistener2.n = false;
                    setondismisslistener2.e(setondismisslistener2.t);
                }
            }
        }

        @Override // o.setActionBarVisibilityCallback
        public final void d() {
            if (setStackedBackground.this.a == this) {
                if (!setStackedBackground.a(setStackedBackground.this.n, setStackedBackground.this.m, false)) {
                    setStackedBackground.this.i = this;
                    setStackedBackground.this.g = this.i;
                } else {
                    this.i.d(this);
                }
                this.i = null;
                setStackedBackground.this.j(false);
                setStackedBackground.this.h.a();
                setStackedBackground.this.f.f().sendAccessibilityEvent(32);
                setStackedBackground.this.l.setHideOnContentScrollEnabled(setStackedBackground.this.k);
                setStackedBackground.this.a = null;
            }
        }

        @Override // o.setActionBarVisibilityCallback
        public final void d(int i) {
            setStackedBackground.this.h.setSubtitle(setStackedBackground.this.c.getResources().getString(i));
        }

        @Override // o.setActionBarVisibilityCallback
        public final void d(boolean z) {
            d(z);
            setStackedBackground.this.h.setTitleOptional(z);
        }

        @Override // o.setActionBarVisibilityCallback
        public final Menu e() {
            return this.c;
        }

        @Override // o.setActionBarVisibilityCallback
        public final void e(CharSequence charSequence) {
            setStackedBackground.this.h.setTitle(charSequence);
        }

        @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
        public final void e(setOnDismissListener setondismisslistener) {
            if (this.i != null) {
                g();
                setStackedBackground.this.h.c();
            }
        }

        @Override // o.setActionBarVisibilityCallback
        public final CharSequence f() {
            return setStackedBackground.this.h.h;
        }

        @Override // o.setActionBarVisibilityCallback
        public final void g() {
            if (setStackedBackground.this.a == this) {
                setOnDismissListener setondismisslistener = this.c;
                if (!setondismisslistener.p) {
                    setondismisslistener.p = true;
                    setondismisslistener.n = false;
                    setondismisslistener.t = false;
                }
                try {
                    this.i.c(this, this.c);
                    setOnDismissListener setondismisslistener2 = this.c;
                    setondismisslistener2.p = false;
                    if (setondismisslistener2.n) {
                        setondismisslistener2.n = false;
                        setondismisslistener2.e(setondismisslistener2.t);
                    }
                } catch (Throwable th) {
                    setOnDismissListener setondismisslistener3 = this.c;
                    setondismisslistener3.p = false;
                    if (setondismisslistener3.n) {
                        setondismisslistener3.n = false;
                        setondismisslistener3.e(setondismisslistener3.t);
                    }
                    throw th;
                }
            }
        }

        @Override // o.setActionBarVisibilityCallback
        public final CharSequence i() {
            return setStackedBackground.this.h.i;
        }

        @Override // o.setActionBarVisibilityCallback
        public final boolean j() {
            return setStackedBackground.this.h.j;
        }
    }

    public setStackedBackground(Activity activity, boolean z) {
        this.y = activity;
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z) {
            this.e = decorView.findViewById(16908290);
        }
    }

    public setStackedBackground(Dialog dialog) {
        b(dialog.getWindow().getDecorView());
    }

    private void a(int i, int i2) {
        int b = this.f.b();
        this.w = true;
        this.f.e((i & 4) | (b & -5));
    }

    static boolean a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    private void b(View view) {
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = (setSupportCompoundDrawablesTintList) view.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.p);
        this.l = setsupportcompounddrawablestintlist;
        if (setsupportcompounddrawablestintlist != null) {
            setsupportcompounddrawablestintlist.setActionBarVisibilityCallback(this);
        }
        this.f = d(view.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.d));
        this.h = (setTextSize) view.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.f);
        setSupportButtonTintList setsupportbuttontintlist = (setSupportButtonTintList) view.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.b);
        this.d = setsupportbuttontintlist;
        setSelector setselector = this.f;
        if (setselector == null || this.h == null || setsupportbuttontintlist == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.c = setselector.c();
        if ((this.f.b() & 4) != 0) {
            this.w = true;
        }
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = new setHideOnContentScrollEnabled(this.c);
        int i = sethideoncontentscrollenabled.e.getApplicationInfo().targetSdkVersion;
        h(sethideoncontentscrollenabled.e.getResources().getBoolean(setHasDecor.IconCompatParcelizer.c));
        TypedArray obtainStyledAttributes = this.c.obtainStyledAttributes(null, setHasDecor$MediaBrowserCompat$MediaItem.e, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.d, 0);
        if (obtainStyledAttributes.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.l, false)) {
            c(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.f231o, 0);
        if (dimensionPixelSize != 0) {
            findFragmentByWho.b(this.d, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private static setSelector d(View view) {
        if (view instanceof setSelector) {
            return (setSelector) view;
        }
        if (view instanceof setInputType) {
            setInputType setinputtype = (setInputType) view;
            if (setinputtype.n == null) {
                setinputtype.n = new setQuery(setinputtype, true);
            }
            return setinputtype.n;
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void g(boolean z) {
        View view;
        setOverlayMode setoverlaymode = this.j;
        if (setoverlaymode != null) {
            setoverlaymode.d();
        }
        if (this.u != 0 || (!this.z && !z)) {
            this.f269o.c(null);
            return;
        }
        this.d.setAlpha(1.0f);
        this.d.setTransitioning(true);
        setOverlayMode setoverlaymode2 = new setOverlayMode();
        float f = (float) (-this.d.getHeight());
        float f2 = f;
        if (z) {
            int[] iArr = {0, 0};
            this.d.getLocationInWindow(iArr);
            f2 = f - ((float) iArr[1]);
        }
        generateActivityResultKey c = findFragmentByWho.a(this.d).c(f2);
        c.d(this.p);
        setoverlaymode2.a(c);
        if (this.b && (view = this.e) != null) {
            setoverlaymode2.a(findFragmentByWho.a(view).c(f2));
        }
        setoverlaymode2.b(s);
        setoverlaymode2.e(250);
        setoverlaymode2.e(this.f269o);
        this.j = setoverlaymode2;
        setoverlaymode2.e();
    }

    private void h(boolean z) {
        this.x = z;
        if (!z) {
            this.f.c((setTabSelected) null);
            this.d.setTabContainer(this.q);
        } else {
            this.d.setTabContainer(null);
            this.f.c(this.q);
        }
        boolean z2 = true;
        boolean z3 = this.f.j() == 2;
        setTabSelected settabselected = this.q;
        if (settabselected != null) {
            if (z3) {
                settabselected.setVisibility(0);
                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.l;
                if (setsupportcompounddrawablestintlist != null) {
                    findFragmentByWho.J(setsupportcompounddrawablestintlist);
                }
            } else {
                settabselected.setVisibility(8);
            }
        }
        this.f.b(!this.x && z3);
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist2 = this.l;
        if (this.x || !z3) {
            z2 = false;
        }
        setsupportcompounddrawablestintlist2.setHasNonEmbeddedTabs(z2);
    }

    private void i(boolean z) {
        if (this.D || (!this.n && !this.m)) {
            if (!this.A) {
                this.A = true;
                n(z);
            }
        } else if (this.A) {
            this.A = false;
            g(z);
        }
    }

    private void n(boolean z) {
        View view;
        View view2;
        setOverlayMode setoverlaymode = this.j;
        if (setoverlaymode != null) {
            setoverlaymode.d();
        }
        this.d.setVisibility(0);
        if (this.u != 0 || (!this.z && !z)) {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.b && (view = this.e) != null) {
                view.setTranslationY(0.0f);
            }
            this.r.c(null);
        } else {
            this.d.setTranslationY(0.0f);
            float f = (float) (-this.d.getHeight());
            float f2 = f;
            if (z) {
                int[] iArr = {0, 0};
                this.d.getLocationInWindow(iArr);
                f2 = f - ((float) iArr[1]);
            }
            this.d.setTranslationY(f2);
            setOverlayMode setoverlaymode2 = new setOverlayMode();
            generateActivityResultKey c = findFragmentByWho.a(this.d).c(0.0f);
            c.d(this.p);
            setoverlaymode2.a(c);
            if (this.b && (view2 = this.e) != null) {
                view2.setTranslationY(f2);
                setoverlaymode2.a(findFragmentByWho.a(this.e).c(0.0f));
            }
            setoverlaymode2.b(t);
            setoverlaymode2.e(250);
            setoverlaymode2.e(this.r);
            this.j = setoverlaymode2;
            setoverlaymode2.e();
        }
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.l;
        if (setsupportcompounddrawablestintlist != null) {
            findFragmentByWho.J(setsupportcompounddrawablestintlist);
        }
    }

    @Override // o.setBackgroundResource
    public final Context a() {
        if (this.G == null) {
            TypedValue typedValue = new TypedValue();
            this.c.getTheme().resolveAttribute(setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.g, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.G = new ContextThemeWrapper(this.c, i);
            } else {
                this.G = this.c;
            }
        }
        return this.G;
    }

    @Override // o.setBackgroundResource
    public final setActionBarVisibilityCallback a(setActionBarVisibilityCallback.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.d();
        }
        this.l.setHideOnContentScrollEnabled(false);
        this.h.b();
        IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(this.h.getContext(), remoteActionCompatParcelizer);
        if (!iconCompatParcelizer2.c()) {
            return null;
        }
        this.a = iconCompatParcelizer2;
        iconCompatParcelizer2.g();
        this.h.a(iconCompatParcelizer2);
        j(true);
        this.h.sendAccessibilityEvent(32);
        return iconCompatParcelizer2;
    }

    @Override // o.setBackgroundResource
    public final void a(Drawable drawable) {
        this.f.a(drawable);
    }

    @Override // o.setBackgroundResource
    public final void a(CharSequence charSequence) {
        this.f.d(charSequence);
    }

    @Override // o.setBackgroundResource
    public final void a(boolean z) {
        if (z != this.v) {
            this.v = z;
            int size = this.C.size();
            for (int i = 0; i < size; i++) {
                this.C.get(i);
            }
        }
    }

    @Override // o.setBackgroundResource
    public final boolean a(int i, KeyEvent keyEvent) {
        setOnDismissListener setondismisslistener;
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer == null || (setondismisslistener = iconCompatParcelizer.c) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        setondismisslistener.setQwertyMode(z);
        return setondismisslistener.performShortcut(i, keyEvent, 0);
    }

    @Override // o.setBackgroundResource
    public final void b(Configuration configuration) {
        h(new setHideOnContentScrollEnabled(this.c).e.getResources().getBoolean(setHasDecor.IconCompatParcelizer.c));
    }

    @Override // o.setBackgroundResource
    public final void b(boolean z) {
        setOverlayMode setoverlaymode;
        this.z = z;
        if (!z && (setoverlaymode = this.j) != null) {
            setoverlaymode.d();
        }
    }

    @Override // o.setBackgroundResource
    public final boolean b() {
        setSelector setselector = this.f;
        if (setselector == null || !setselector.h()) {
            return false;
        }
        this.f.a();
        return true;
    }

    @Override // o.setBackgroundResource
    public final void c(int i) {
        this.f.b(i);
    }

    @Override // o.setBackgroundResource
    public final void c(boolean z) {
        if (this.l.i) {
            this.k = true;
            this.l.setHideOnContentScrollEnabled(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    @Override // o.setBackgroundResource
    public final void d(CharSequence charSequence) {
        this.f.a(charSequence);
    }

    @Override // o.setBackgroundResource
    public final void d(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // o.setBackgroundResource
    public final int e() {
        return this.f.b();
    }

    @Override // o.setSupportCompoundDrawablesTintList.write
    public final void e(int i) {
        this.u = i;
    }

    @Override // o.setBackgroundResource
    public final void e(boolean z) {
        if (!this.w) {
            a(z ? 4 : 0, 4);
        }
    }

    @Override // o.setSupportCompoundDrawablesTintList.write
    public final void f() {
        setOverlayMode setoverlaymode = this.j;
        if (setoverlaymode != null) {
            setoverlaymode.d();
            this.j = null;
        }
    }

    @Override // o.setSupportCompoundDrawablesTintList.write
    public final void f(boolean z) {
        this.b = z;
    }

    @Override // o.setSupportCompoundDrawablesTintList.write
    public final void i() {
        if (this.m) {
            this.m = false;
            i(true);
        }
    }

    @Override // o.setSupportCompoundDrawablesTintList.write
    public final void j() {
        if (!this.m) {
            this.m = true;
            i(true);
        }
    }

    public final void j(boolean z) {
        generateActivityResultKey generateactivityresultkey;
        generateActivityResultKey generateactivityresultkey2;
        if (z) {
            if (!this.D) {
                this.D = true;
                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.l;
                if (setsupportcompounddrawablestintlist != null) {
                    setsupportcompounddrawablestintlist.setShowingForActionMode(true);
                }
                i(false);
            }
        } else if (this.D) {
            this.D = false;
            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist2 = this.l;
            if (setsupportcompounddrawablestintlist2 != null) {
                setsupportcompounddrawablestintlist2.setShowingForActionMode(false);
            }
            i(false);
        }
        if (findFragmentByWho.G(this.d)) {
            if (z) {
                generateactivityresultkey = this.f.e(4, 100);
                generateactivityresultkey2 = this.h.c(0, 200);
            } else {
                generateactivityresultkey2 = this.f.e(0, 200);
                generateactivityresultkey = this.h.c(8, 100);
            }
            setOverlayMode setoverlaymode = new setOverlayMode();
            setoverlaymode.d(generateactivityresultkey, generateactivityresultkey2);
            setoverlaymode.e();
        } else if (z) {
            this.f.d(4);
            this.h.setVisibility(0);
        } else {
            this.f.d(0);
            this.h.setVisibility(8);
        }
    }
}
