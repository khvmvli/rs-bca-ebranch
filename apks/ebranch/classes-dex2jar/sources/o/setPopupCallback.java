package o;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.stetho.websocket.CloseCodes;
import io.realm.internal.Property;
import java.util.List;
import o.Keep;
import o.inset;
import o.onHasView;
import o.onRequestPermissionsResult;
import o.setActionBarVisibilityCallback;
import o.setDividerDrawable;
import o.setDropDownBackgroundResource;
import o.setHasDecor;
import o.setOnDismissListener;
import o.setPopupCallback;
/* loaded from: classes-dex2jar.jar:o/setPopupCallback.class */
public class setPopupCallback extends setIcon implements setOnDismissListener.RemoteActionCompatParcelizer, LayoutInflater.Factory2 {
    private MediaMetadataCompat A;
    private boolean B;
    private boolean C;
    private IconCompatParcelizer D;
    private boolean E;
    private boolean F;
    private boolean G;
    private setPopupCallback$MediaBrowserCompat$SearchResultReceiver H;
    private setPopupCallback$MediaBrowserCompat$SearchResultReceiver I;
    private boolean J;
    private boolean K;
    private boolean L;
    private setBaselineAligned M;
    private boolean N;
    private final Runnable O;
    private int P;
    private boolean Q;
    private setPopupCallback$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver R;
    private setForceShowIcon S;
    private boolean T;
    private boolean U;
    private setPopupCallback$MediaSessionCompat$QueueItem[] V;
    private View W;
    private setPopupCallback$MediaSessionCompat$QueueItem X;
    private TextView Y;
    private Rect Z;
    final setItemInvoker a;
    private Rect aa;
    private int ab;
    private CharSequence ac;
    setActionBarVisibilityCallback b;
    setBackgroundResource c;
    PopupWindow d;
    setTextSize e;
    final Context f;
    generateActivityResultKey g;
    final Object h;
    int i;
    boolean j;
    boolean k;
    boolean l;
    MenuInflater m;
    boolean n;

    /* renamed from: o */
    boolean f263o;
    boolean p;
    Runnable q;
    boolean r;
    ViewGroup s;
    Window t;
    private setGroupDividerEnabled z;
    private static final setCollapseIcon<String, Integer> v = new setCollapseIcon<>();
    private static final boolean w = false;
    private static final int[] x = {16842836};
    private static final boolean u = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean y = true;

    /* loaded from: classes-dex2jar.jar:o/setPopupCallback$IconCompatParcelizer.class */
    public final class IconCompatParcelizer implements setDropDownBackgroundResource.IconCompatParcelizer {
        IconCompatParcelizer() {
            setPopupCallback.this = r4;
        }

        @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
        public final void a(setOnDismissListener setondismisslistener, boolean z) {
            setPopupCallback.this.d(setondismisslistener);
        }

        @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
        public final boolean a(setOnDismissListener setondismisslistener) {
            Window.Callback t = setPopupCallback.this.t();
            if (t == null) {
                return true;
            }
            t.onMenuOpened(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy, setondismisslistener);
            return true;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setPopupCallback$MediaDescriptionCompat.class */
    public static class MediaDescriptionCompat {
        static void c(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setPopupCallback$MediaMetadataCompat.class */
    public class MediaMetadataCompat extends setWindowTitle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(Window.Callback callback) {
            super(callback);
            setPopupCallback.this = r4;
        }

        final ActionMode d(ActionMode.Callback callback) {
            setMenuPrepared$MediaBrowserCompat$CustomActionResultReceiver setmenuprepared_mediabrowsercompat_customactionresultreceiver = new setMenuPrepared$MediaBrowserCompat$CustomActionResultReceiver(setPopupCallback.this.f, callback);
            setActionBarVisibilityCallback c = setPopupCallback.this.c(setmenuprepared_mediabrowsercompat_customactionresultreceiver);
            if (c != null) {
                return setmenuprepared_mediabrowsercompat_customactionresultreceiver.b(c);
            }
            return null;
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return setPopupCallback.this.d(keyEvent) || dispatchKeyEvent(keyEvent);
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return dispatchKeyShortcutEvent(keyEvent) || setPopupCallback.this.b(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof setOnDismissListener)) {
                return onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            onMenuOpened(i, menu);
            setPopupCallback.this.f(i);
            return true;
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            onPanelClosed(i, menu);
            setPopupCallback.this.g(i);
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            setOnDismissListener setondismisslistener = menu instanceof setOnDismissListener ? (setOnDismissListener) menu : null;
            if (i == 0 && setondismisslistener == null) {
                return false;
            }
            if (setondismisslistener != null) {
                setondismisslistener.f250o = true;
            }
            boolean onPreparePanel = onPreparePanel(i, view, menu);
            if (setondismisslistener != null) {
                setondismisslistener.f250o = false;
            }
            return onPreparePanel;
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            setPopupCallback$MediaSessionCompat$QueueItem a = setPopupCallback.this.a(0, true);
            if (a == null || a.m == null) {
                onProvideKeyboardShortcuts(list, menu, i);
            } else {
                onProvideKeyboardShortcuts(list, a.m, i);
            }
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return setPopupCallback.this.p() ? d(callback) : onWindowStartingActionMode(callback);
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!setPopupCallback.this.p() || i != 0) ? onWindowStartingActionMode(callback, i) : d(callback);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setPopupCallback$RatingCompat.class */
    static class RatingCompat {
        static void e(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setPopupCallback$RemoteActionCompatParcelizer.class */
    class RemoteActionCompatParcelizer implements Keep.RemoteActionCompatParcelizer {
        RemoteActionCompatParcelizer() {
            setPopupCallback.this = r4;
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public void a(int i) {
            setBackgroundResource e = setPopupCallback.this.e();
            if (e != null) {
                e.c(i);
            }
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public Context c() {
            return setPopupCallback.this.o();
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public void c(Drawable drawable, int i) {
            setBackgroundResource e = setPopupCallback.this.e();
            if (e != null) {
                e.a(drawable);
                e.c(i);
            }
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public boolean d() {
            setBackgroundResource e = setPopupCallback.this.e();
            return (e == null || (e.e() & 4) == 0) ? false : true;
        }

        @Override // o.Keep.RemoteActionCompatParcelizer
        public Drawable e() {
            Context c = c();
            setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(c, c.obtainStyledAttributes((AttributeSet) null, new int[]{setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.I}));
            Drawable d = seticonifiedbydefault.d(0);
            seticonifiedbydefault.d.recycle();
            return d;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setPopupCallback$read.class */
    static class read {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setPopupCallback$write.class */
    public class write implements setActionBarVisibilityCallback.RemoteActionCompatParcelizer {
        private setActionBarVisibilityCallback.RemoteActionCompatParcelizer c;

        public write(setActionBarVisibilityCallback.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            setPopupCallback.this = r4;
            this.c = remoteActionCompatParcelizer;
        }

        @Override // o.setActionBarVisibilityCallback.RemoteActionCompatParcelizer
        public boolean c(setActionBarVisibilityCallback setactionbarvisibilitycallback, Menu menu) {
            findFragmentByWho.J(setPopupCallback.this.s);
            return this.c.c(setactionbarvisibilitycallback, menu);
        }

        @Override // o.setActionBarVisibilityCallback.RemoteActionCompatParcelizer
        public boolean c(setActionBarVisibilityCallback setactionbarvisibilitycallback, MenuItem menuItem) {
            return this.c.c(setactionbarvisibilitycallback, menuItem);
        }

        @Override // o.setActionBarVisibilityCallback.RemoteActionCompatParcelizer
        public void d(setActionBarVisibilityCallback setactionbarvisibilitycallback) {
            this.c.d(setactionbarvisibilitycallback);
            if (setPopupCallback.this.d != null) {
                setPopupCallback.this.t.getDecorView().removeCallbacks(setPopupCallback.this.q);
            }
            if (setPopupCallback.this.e != null) {
                setPopupCallback.this.n();
                setPopupCallback setpopupcallback = setPopupCallback.this;
                setpopupcallback.g = findFragmentByWho.a(setpopupcallback.e).e(0.0f);
                setPopupCallback.this.g.d(new getAnimatingAway() { // from class: o.setPopupCallback.write.3
                    @Override // o.getAnimatingAway, o.getAllowReturnTransitionOverlap
                    public void c(View view) {
                        setPopupCallback.this.e.setVisibility(8);
                        if (setPopupCallback.this.d != null) {
                            setPopupCallback.this.d.dismiss();
                        } else if (setPopupCallback.this.e.getParent() instanceof View) {
                            findFragmentByWho.J((View) setPopupCallback.this.e.getParent());
                        }
                        setPopupCallback.this.e.b();
                        setPopupCallback.this.g.d((getAllowReturnTransitionOverlap) null);
                        setPopupCallback.this.g = null;
                        findFragmentByWho.J(setPopupCallback.this.s);
                    }
                });
            }
            if (setPopupCallback.this.a != null) {
                setPopupCallback.this.a.e(setPopupCallback.this.b);
            }
            setPopupCallback.this.b = null;
            findFragmentByWho.J(setPopupCallback.this.s);
        }

        @Override // o.setActionBarVisibilityCallback.RemoteActionCompatParcelizer
        public boolean d(setActionBarVisibilityCallback setactionbarvisibilitycallback, Menu menu) {
            return this.c.d(setactionbarvisibilitycallback, menu);
        }
    }

    public setPopupCallback(Activity activity, setItemInvoker setiteminvoker) {
        this(activity, null, setiteminvoker, activity);
    }

    public setPopupCallback(Dialog dialog, setItemInvoker setiteminvoker) {
        this(dialog.getContext(), dialog.getWindow(), setiteminvoker, dialog);
    }

    private setPopupCallback(Context context, Window window, setItemInvoker setiteminvoker, Object obj) {
        setCollapseIcon<String, Integer> setcollapseicon;
        Integer num;
        setPadding G;
        this.g = null;
        this.K = true;
        this.P = -100;
        this.O = new Runnable() { // from class: o.setPopupCallback.4
            @Override // java.lang.Runnable
            public void run() {
                if ((setPopupCallback.this.i & 1) != 0) {
                    setPopupCallback.this.j(0);
                }
                if ((setPopupCallback.this.i & 4096) != 0) {
                    setPopupCallback.this.j(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy);
                }
                setPopupCallback.this.k = false;
                setPopupCallback.this.i = 0;
            }
        };
        this.f = context;
        this.a = setiteminvoker;
        this.h = obj;
        if (this.P == -100 && (obj instanceof Dialog) && (G = G()) != null) {
            this.P = G.h().c();
        }
        if (this.P == -100 && (num = (setcollapseicon = v).get(obj.getClass().getName())) != null) {
            this.P = num.intValue();
            setcollapseicon.remove(obj.getClass().getName());
        }
        if (window != null) {
            e(window);
        }
        setImageResource.b();
    }

    private void A() {
        if (this.U) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void B() {
        D();
        if (this.j && this.c == null) {
            Object obj = this.h;
            if (obj instanceof Activity) {
                this.c = new setStackedBackground((Activity) this.h, this.l);
            } else if (obj instanceof Dialog) {
                this.c = new setStackedBackground((Dialog) this.h);
            }
            setBackgroundResource setbackgroundresource = this.c;
            if (setbackgroundresource != null) {
                setbackgroundresource.e(this.L);
            }
        }
    }

    private boolean C() {
        if (!this.C && (this.h instanceof Activity)) {
            PackageManager packageManager = this.f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f, this.h.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : Build.VERSION.SDK_INT >= 24 ? 786432 : 0);
                this.B = (activityInfo == null || (activityInfo.configChanges & Property.TYPE_DICTIONARY) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.B = false;
            }
        }
        this.C = true;
        return this.B;
    }

    private void D() {
        if (!this.U) {
            this.s = y();
            CharSequence q = q();
            if (!TextUtils.isEmpty(q)) {
                setBaselineAligned setbaselinealigned = this.M;
                if (setbaselinealigned != null) {
                    setbaselinealigned.setWindowTitle(q);
                } else if (r() != null) {
                    r().a(q);
                } else {
                    TextView textView = this.Y;
                    if (textView != null) {
                        textView.setText(q);
                    }
                }
            }
            w();
            c(this.s);
            this.U = true;
            setPopupCallback$MediaSessionCompat$QueueItem a = a(0, false);
            if (this.n) {
                return;
            }
            if (a == null || a.m == null) {
                i(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy);
            }
        }
    }

    private setPadding G() {
        for (Context context = this.f; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof setPadding) {
                return (setPadding) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }

    private setPopupCallback$MediaBrowserCompat$SearchResultReceiver a(Context context) {
        if (this.I == null) {
            if (setVisibility.e == null) {
                Context applicationContext = context.getApplicationContext();
                setVisibility.e = new setVisibility(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.I = new setPopupCallback$MediaBrowserCompat$SearchResultReceiver(setVisibility.e) { // from class: o.setPopupCallback$MediaSessionCompat$Token
                private final setVisibility d;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.d = r5;
                }

                @Override // o.setPopupCallback$MediaBrowserCompat$SearchResultReceiver
                IntentFilter b() {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.TIME_SET");
                    intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                    intentFilter.addAction("android.intent.action.TIME_TICK");
                    return intentFilter;
                }

                @Override // o.setPopupCallback$MediaBrowserCompat$SearchResultReceiver
                /* Code decompiled incorrectly, please refer to instructions dump */
                public int c() {
                    /*
                    // Method dump skipped, instructions count: 499
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setPopupCallback$MediaSessionCompat$Token.c():int");
                }

                @Override // o.setPopupCallback$MediaBrowserCompat$SearchResultReceiver
                public void e() {
                    setPopupCallback.this.l();
                }
            };
        }
        return this.I;
    }

    private void a(setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!setpopupcallback_mediasessioncompat_queueitem.i && !this.n) {
            if (setpopupcallback_mediasessioncompat_queueitem.c == 0) {
                if ((this.f.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback t = t();
            if (t == null || t.onMenuOpened(setpopupcallback_mediasessioncompat_queueitem.c, setpopupcallback_mediasessioncompat_queueitem.m)) {
                WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
                if (windowManager != null && e(setpopupcallback_mediasessioncompat_queueitem, keyEvent)) {
                    if (setpopupcallback_mediasessioncompat_queueitem.d == null || setpopupcallback_mediasessioncompat_queueitem.l) {
                        if (setpopupcallback_mediasessioncompat_queueitem.d == null) {
                            if (!c(setpopupcallback_mediasessioncompat_queueitem) || setpopupcallback_mediasessioncompat_queueitem.d == null) {
                                return;
                            }
                        } else if (setpopupcallback_mediasessioncompat_queueitem.l && setpopupcallback_mediasessioncompat_queueitem.d.getChildCount() > 0) {
                            setpopupcallback_mediasessioncompat_queueitem.d.removeAllViews();
                        }
                        if (!e(setpopupcallback_mediasessioncompat_queueitem) || !setpopupcallback_mediasessioncompat_queueitem.a()) {
                            setpopupcallback_mediasessioncompat_queueitem.l = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = setpopupcallback_mediasessioncompat_queueitem.r.getLayoutParams();
                        ViewGroup.LayoutParams layoutParams3 = layoutParams2;
                        if (layoutParams2 == null) {
                            layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        setpopupcallback_mediasessioncompat_queueitem.d.setBackgroundResource(setpopupcallback_mediasessioncompat_queueitem.a);
                        ViewParent parent = setpopupcallback_mediasessioncompat_queueitem.r.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(setpopupcallback_mediasessioncompat_queueitem.r);
                        }
                        setpopupcallback_mediasessioncompat_queueitem.d.addView(setpopupcallback_mediasessioncompat_queueitem.r, layoutParams3);
                        if (!setpopupcallback_mediasessioncompat_queueitem.r.hasFocus()) {
                            setpopupcallback_mediasessioncompat_queueitem.r.requestFocus();
                        }
                    } else if (!(setpopupcallback_mediasessioncompat_queueitem.e == null || (layoutParams = setpopupcallback_mediasessioncompat_queueitem.e.getLayoutParams()) == null || layoutParams.width != -1)) {
                        i = -1;
                        setpopupcallback_mediasessioncompat_queueitem.f = false;
                        WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, setpopupcallback_mediasessioncompat_queueitem.s, setpopupcallback_mediasessioncompat_queueitem.p, CloseCodes.PROTOCOL_ERROR, 8519680, -3);
                        layoutParams4.gravity = setpopupcallback_mediasessioncompat_queueitem.g;
                        layoutParams4.windowAnimations = setpopupcallback_mediasessioncompat_queueitem.q;
                        windowManager.addView(setpopupcallback_mediasessioncompat_queueitem.d, layoutParams4);
                        setpopupcallback_mediasessioncompat_queueitem.i = true;
                        return;
                    }
                    i = -2;
                    setpopupcallback_mediasessioncompat_queueitem.f = false;
                    WindowManager.LayoutParams layoutParams42 = new WindowManager.LayoutParams(i, -2, setpopupcallback_mediasessioncompat_queueitem.s, setpopupcallback_mediasessioncompat_queueitem.p, CloseCodes.PROTOCOL_ERROR, 8519680, -3);
                    layoutParams42.gravity = setpopupcallback_mediasessioncompat_queueitem.g;
                    layoutParams42.windowAnimations = setpopupcallback_mediasessioncompat_queueitem.q;
                    windowManager.addView(setpopupcallback_mediasessioncompat_queueitem.d, layoutParams42);
                    setpopupcallback_mediasessioncompat_queueitem.i = true;
                    return;
                }
                return;
            }
            b(setpopupcallback_mediasessioncompat_queueitem, true);
        }
    }

    private boolean a(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        setPopupCallback$MediaSessionCompat$QueueItem a = a(i, true);
        if (!a.i) {
            return e(a, keyEvent);
        }
        return false;
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.t.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || findFragmentByWho.F((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r6.c == 108) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean a(o.setPopupCallback$MediaSessionCompat$QueueItem r6) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupCallback.a(o.setPopupCallback$MediaSessionCompat$QueueItem):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (e(r6, r8) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean a(o.setPopupCallback$MediaSessionCompat$QueueItem r6, int r7, android.view.KeyEvent r8, int r9) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0.isSystem()
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L_0x0010
            r0 = 0
            return r0
        L_0x0010:
            r0 = r6
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x0024
            r0 = r11
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r8
            boolean r0 = r0.e(r1, r2)
            if (r0 == 0) goto L_0x003c
        L_0x0024:
            r0 = r11
            r10 = r0
            r0 = r6
            o.setOnDismissListener r0 = r0.m
            if (r0 == 0) goto L_0x003c
            r0 = r6
            o.setOnDismissListener r0 = r0.m
            r1 = r7
            r2 = r8
            r3 = r9
            boolean r0 = r0.performShortcut(r1, r2, r3)
            r10 = r0
        L_0x003c:
            r0 = r10
            if (r0 == 0) goto L_0x0055
            r0 = r9
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0055
            r0 = r5
            o.setBaselineAligned r0 = r0.M
            if (r0 != 0) goto L_0x0055
            r0 = r5
            r1 = r6
            r2 = 1
            r0.b(r1, r2)
        L_0x0055:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupCallback.a(o.setPopupCallback$MediaSessionCompat$QueueItem, int, android.view.KeyEvent, int):boolean");
    }

    private Configuration b(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    private void b(View view) {
        view.setBackgroundColor((findFragmentByWho.w(view) & 8192) != 0 ? copyWindowDataInto.a(this.f, setHasDecor.read.a) : copyWindowDataInto.a(this.f, setHasDecor.read.c));
    }

    private setPopupCallback$MediaBrowserCompat$SearchResultReceiver c(Context context) {
        if (this.H == null) {
            this.H = new setPopupCallback$MediaBrowserCompat$SearchResultReceiver(context) { // from class: o.setPopupCallback$MediaBrowserCompat$MediaItem
                private final PowerManager d;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.d = (PowerManager) r6.getApplicationContext().getSystemService("power");
                }

                @Override // o.setPopupCallback$MediaBrowserCompat$SearchResultReceiver
                IntentFilter b() {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                    return intentFilter;
                }

                @Override // o.setPopupCallback$MediaBrowserCompat$SearchResultReceiver
                public int c() {
                    return setPopupCallback.read.a(this.d) ? 2 : 1;
                }

                @Override // o.setPopupCallback$MediaBrowserCompat$SearchResultReceiver
                public void e() {
                    setPopupCallback.this.l();
                }
            };
        }
        return this.H;
    }

    private void c(boolean z) {
        setBaselineAligned setbaselinealigned = this.M;
        if (setbaselinealigned == null || !setbaselinealigned.b() || (ViewConfiguration.get(this.f).hasPermanentMenuKey() && !this.M.c())) {
            setPopupCallback$MediaSessionCompat$QueueItem a = a(0, true);
            a.l = true;
            b(a, false);
            a(a, (KeyEvent) null);
            return;
        }
        Window.Callback t = t();
        if (this.M.e() && z) {
            this.M.a();
            if (!this.n) {
                t.onPanelClosed(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy, a(0, true).m);
            }
        } else if (t != null && !this.n) {
            if (this.k && (this.i & 1) != 0) {
                this.t.getDecorView().removeCallbacks(this.O);
                this.O.run();
            }
            setPopupCallback$MediaSessionCompat$QueueItem a2 = a(0, true);
            if (a2.m != null && !a2.n && t.onPreparePanel(0, a2.e, a2.m)) {
                t.onMenuOpened(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy, a2.m);
                this.M.h();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean c(int r5, android.view.KeyEvent r6) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupCallback.c(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean c(int r6, boolean r7) {
        /*
            r5 = this;
            r0 = r5
            r1 = r5
            android.content.Context r1 = r1.f
            r2 = r6
            r3 = 0
            android.content.res.Configuration r0 = r0.b(r1, r2, r3)
            r8 = r0
            r0 = r5
            boolean r0 = r0.C()
            r9 = r0
            r0 = r5
            android.content.Context r0 = r0.f
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r1 = 48
            r0 = r0 & r1
            r10 = r0
            r0 = r8
            int r0 = r0.uiMode
            r1 = 48
            r0 = r0 & r1
            r11 = r0
            r0 = 1
            r12 = r0
            r0 = r10
            r1 = r11
            if (r0 == r1) goto L_0x0078
            r0 = r7
            if (r0 == 0) goto L_0x0078
            r0 = r9
            if (r0 != 0) goto L_0x0078
            r0 = r5
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0078
            boolean r0 = o.setPopupCallback.u
            if (r0 != 0) goto L_0x0053
            r0 = r5
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x0078
        L_0x0053:
            r0 = r5
            java.lang.Object r0 = r0.h
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0078
            r0 = r8
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChild()
            if (r0 != 0) goto L_0x0078
            r0 = r5
            java.lang.Object r0 = r0.h
            android.app.Activity r0 = (android.app.Activity) r0
            o.setOnHierarchyChangeListener.b(r0)
            r0 = 1
            r7 = r0
            goto L_0x007a
        L_0x0078:
            r0 = 0
            r7 = r0
        L_0x007a:
            r0 = r7
            if (r0 != 0) goto L_0x0094
            r0 = r10
            r1 = r11
            if (r0 == r1) goto L_0x0094
            r0 = r5
            r1 = r11
            r2 = r9
            r3 = 0
            r0.e(r1, r2, r3)
            r0 = r12
            r7 = r0
            goto L_0x0094
        L_0x0094:
            r0 = r7
            if (r0 == 0) goto L_0x00ac
            r0 = r5
            java.lang.Object r0 = r0.h
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof o.setPadding
            if (r0 == 0) goto L_0x00ac
            r0 = r8
            o.setPadding r0 = (o.setPadding) r0
            r1 = r6
            r0.c(r1)
        L_0x00ac:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupCallback.c(int, boolean):boolean");
    }

    private boolean c(setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem) {
        setpopupcallback_mediasessioncompat_queueitem.c(o());
        setpopupcallback_mediasessioncompat_queueitem.d = new setDividerDrawable(setpopupcallback_mediasessioncompat_queueitem.f264o) { // from class: o.setPopupCallback$MediaSessionCompat$ResultReceiverWrapper
            private boolean d(int i, int i2) {
                return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
            }

            @Override // android.view.View, android.view.ViewGroup
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                return setPopupCallback.this.d(keyEvent) || dispatchKeyEvent(keyEvent);
            }

            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || !d((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return onInterceptTouchEvent(motionEvent);
                }
                setPopupCallback.this.c(0);
                return true;
            }

            @Override // android.view.View
            public void setBackgroundResource(int i) {
                setBackgroundDrawable(setPrimaryBackground.c(getContext(), i));
            }
        };
        setpopupcallback_mediasessioncompat_queueitem.g = 81;
        return true;
    }

    private static Configuration d(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            if (configuration.fontScale != configuration2.fontScale) {
                configuration3.fontScale = configuration2.fontScale;
            }
            if (configuration.mcc != configuration2.mcc) {
                configuration3.mcc = configuration2.mcc;
            }
            if (configuration.mnc != configuration2.mnc) {
                configuration3.mnc = configuration2.mnc;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                MediaDescriptionCompat.c(configuration, configuration2, configuration3);
            } else if (!onDetach.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            if (configuration.touchscreen != configuration2.touchscreen) {
                configuration3.touchscreen = configuration2.touchscreen;
            }
            if (configuration.keyboard != configuration2.keyboard) {
                configuration3.keyboard = configuration2.keyboard;
            }
            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                configuration3.keyboardHidden = configuration2.keyboardHidden;
            }
            if (configuration.navigation != configuration2.navigation) {
                configuration3.navigation = configuration2.navigation;
            }
            if (configuration.navigationHidden != configuration2.navigationHidden) {
                configuration3.navigationHidden = configuration2.navigationHidden;
            }
            if (configuration.orientation != configuration2.orientation) {
                configuration3.orientation = configuration2.orientation;
            }
            if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                configuration3.screenLayout |= configuration2.screenLayout & 15;
            }
            if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                configuration3.screenLayout |= configuration2.screenLayout & 192;
            }
            if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                configuration3.screenLayout |= configuration2.screenLayout & 48;
            }
            if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                configuration3.screenLayout |= configuration2.screenLayout & 768;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                setPopupCallback$MediaBrowserCompat$ItemReceiver.c(configuration, configuration2, configuration3);
            }
            if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                configuration3.uiMode |= configuration2.uiMode & 15;
            }
            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                configuration3.uiMode |= configuration2.uiMode & 48;
            }
            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                configuration3.screenWidthDp = configuration2.screenWidthDp;
            }
            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                configuration3.screenHeightDp = configuration2.screenHeightDp;
            }
            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
            }
            setPopupCallback$MediaBrowserCompat$CustomActionResultReceiver.c(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private void e(int i, boolean z, Configuration configuration) {
        Resources resources = this.f.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26 && Build.VERSION.SDK_INT < 28) {
            if (Build.VERSION.SDK_INT >= 24) {
                setTitle.a(resources);
            } else if (Build.VERSION.SDK_INT >= 23) {
                setTitle.e(resources);
            } else {
                setTitle.b(resources);
            }
        }
        int i2 = this.ab;
        boolean z2 = true;
        if (i2 != 0) {
            this.f.setTheme(i2);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f.getTheme().applyStyle(this.ab, true);
            }
        }
        if (z) {
            Object obj = this.h;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof performContextItemSelected) {
                    if (((performContextItemSelected) activity).getLifecycle().a().compareTo(onRequestPermissionsResult.read.STARTED) < 0) {
                        z2 = false;
                    }
                    if (z2) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.T) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void e(Window window) {
        if (this.t == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof MediaMetadataCompat)) {
                MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(callback);
                this.A = mediaMetadataCompat;
                window.setCallback(mediaMetadataCompat);
                Context context = this.f;
                setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes((AttributeSet) null, x));
                Drawable a = seticonifiedbydefault.a(0);
                if (a != null) {
                    window.setBackgroundDrawable(a);
                }
                seticonifiedbydefault.d.recycle();
                this.t = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean e(setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem) {
        boolean z = true;
        if (setpopupcallback_mediasessioncompat_queueitem.e != null) {
            setpopupcallback_mediasessioncompat_queueitem.r = setpopupcallback_mediasessioncompat_queueitem.e;
            return true;
        } else if (setpopupcallback_mediasessioncompat_queueitem.m == null) {
            return false;
        } else {
            if (this.R == null) {
                this.R = new setDropDownBackgroundResource.IconCompatParcelizer() { // from class: o.setPopupCallback$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                    @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
                    public final void a(setOnDismissListener setondismisslistener, boolean z2) {
                        setOnDismissListener d = setondismisslistener.d();
                        boolean z3 = d != setondismisslistener;
                        setPopupCallback setpopupcallback = setPopupCallback.this;
                        if (z3) {
                            setondismisslistener = d;
                        }
                        setPopupCallback$MediaSessionCompat$QueueItem b = setpopupcallback.b(setondismisslistener);
                        if (b == null) {
                            return;
                        }
                        if (z3) {
                            setPopupCallback.this.b(b.c, b, d);
                            setPopupCallback.this.b(b, true);
                            return;
                        }
                        setPopupCallback.this.b(b, z2);
                    }

                    @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
                    public final boolean a(setOnDismissListener setondismisslistener) {
                        Window.Callback t;
                        if (setondismisslistener != setondismisslistener.d() || !setPopupCallback.this.j || (t = setPopupCallback.this.t()) == null || setPopupCallback.this.n) {
                            return true;
                        }
                        t.onMenuOpened(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy, setondismisslistener);
                        return true;
                    }
                };
            }
            setpopupcallback_mediasessioncompat_queueitem.r = (View) setpopupcallback_mediasessioncompat_queueitem.e(this.R);
            if (setpopupcallback_mediasessioncompat_queueitem.r == null) {
                z = false;
            }
            return z;
        }
    }

    private boolean e(setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem, KeyEvent keyEvent) {
        setBaselineAligned setbaselinealigned;
        setBaselineAligned setbaselinealigned2;
        setBaselineAligned setbaselinealigned3;
        if (this.n) {
            return false;
        }
        if (setpopupcallback_mediasessioncompat_queueitem.j) {
            return true;
        }
        setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem2 = this.X;
        if (!(setpopupcallback_mediasessioncompat_queueitem2 == null || setpopupcallback_mediasessioncompat_queueitem2 == setpopupcallback_mediasessioncompat_queueitem)) {
            b(setpopupcallback_mediasessioncompat_queueitem2, false);
        }
        Window.Callback t = t();
        if (t != null) {
            setpopupcallback_mediasessioncompat_queueitem.e = t.onCreatePanelView(setpopupcallback_mediasessioncompat_queueitem.c);
        }
        boolean z = setpopupcallback_mediasessioncompat_queueitem.c == 0 || setpopupcallback_mediasessioncompat_queueitem.c == 108;
        if (z && (setbaselinealigned3 = this.M) != null) {
            setbaselinealigned3.setMenuPrepared();
        }
        if (setpopupcallback_mediasessioncompat_queueitem.e == null && (!z || !(r() instanceof setSplitBackground))) {
            if (setpopupcallback_mediasessioncompat_queueitem.m == null || setpopupcallback_mediasessioncompat_queueitem.n) {
                if (setpopupcallback_mediasessioncompat_queueitem.m == null && (!a(setpopupcallback_mediasessioncompat_queueitem) || setpopupcallback_mediasessioncompat_queueitem.m == null)) {
                    return false;
                }
                if (z && this.M != null) {
                    if (this.D == null) {
                        this.D = new IconCompatParcelizer();
                    }
                    this.M.setMenu(setpopupcallback_mediasessioncompat_queueitem.m, this.D);
                }
                setOnDismissListener setondismisslistener = setpopupcallback_mediasessioncompat_queueitem.m;
                if (!setondismisslistener.p) {
                    setondismisslistener.p = true;
                    setondismisslistener.n = false;
                    setondismisslistener.t = false;
                }
                if (!t.onCreatePanelMenu(setpopupcallback_mediasessioncompat_queueitem.c, setpopupcallback_mediasessioncompat_queueitem.m)) {
                    setpopupcallback_mediasessioncompat_queueitem.a(null);
                    if (!z || (setbaselinealigned2 = this.M) == null) {
                        return false;
                    }
                    setbaselinealigned2.setMenu(null, this.D);
                    return false;
                }
                setpopupcallback_mediasessioncompat_queueitem.n = false;
            }
            setOnDismissListener setondismisslistener2 = setpopupcallback_mediasessioncompat_queueitem.m;
            if (!setondismisslistener2.p) {
                setondismisslistener2.p = true;
                setondismisslistener2.n = false;
                setondismisslistener2.t = false;
            }
            if (setpopupcallback_mediasessioncompat_queueitem.b != null) {
                setpopupcallback_mediasessioncompat_queueitem.m.c(setpopupcallback_mediasessioncompat_queueitem.b);
                setpopupcallback_mediasessioncompat_queueitem.b = null;
            }
            if (!t.onPreparePanel(0, setpopupcallback_mediasessioncompat_queueitem.e, setpopupcallback_mediasessioncompat_queueitem.m)) {
                if (z && (setbaselinealigned = this.M) != null) {
                    setbaselinealigned.setMenu(null, this.D);
                }
                setOnDismissListener setondismisslistener3 = setpopupcallback_mediasessioncompat_queueitem.m;
                setondismisslistener3.p = false;
                if (!setondismisslistener3.n) {
                    return false;
                }
                setondismisslistener3.n = false;
                setondismisslistener3.e(setondismisslistener3.t);
                return false;
            }
            setpopupcallback_mediasessioncompat_queueitem.k = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            setpopupcallback_mediasessioncompat_queueitem.m.setQwertyMode(setpopupcallback_mediasessioncompat_queueitem.k);
            setOnDismissListener setondismisslistener4 = setpopupcallback_mediasessioncompat_queueitem.m;
            setondismisslistener4.p = false;
            if (setondismisslistener4.n) {
                setondismisslistener4.n = false;
                setondismisslistener4.e(setondismisslistener4.t);
            }
        }
        setpopupcallback_mediasessioncompat_queueitem.j = true;
        setpopupcallback_mediasessioncompat_queueitem.f = false;
        this.X = setpopupcallback_mediasessioncompat_queueitem;
        return true;
    }

    private boolean e(boolean z) {
        if (this.n) {
            return false;
        }
        int u2 = u();
        boolean c = c(a(this.f, u2), z);
        if (u2 == 0) {
            a(this.f).d();
        } else {
            setPopupCallback$MediaBrowserCompat$SearchResultReceiver setpopupcallback_mediabrowsercompat_searchresultreceiver = this.I;
            if (setpopupcallback_mediabrowsercompat_searchresultreceiver != null) {
                setpopupcallback_mediabrowsercompat_searchresultreceiver.a();
            }
        }
        if (u2 == 3) {
            c(this.f).d();
        } else {
            setPopupCallback$MediaBrowserCompat$SearchResultReceiver setpopupcallback_mediabrowsercompat_searchresultreceiver2 = this.H;
            if (setpopupcallback_mediabrowsercompat_searchresultreceiver2 != null) {
                setpopupcallback_mediabrowsercompat_searchresultreceiver2.a();
            }
        }
        return c;
    }

    private int h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy;
        }
        int i2 = i;
        if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
        }
        return i2;
    }

    private void i(int i) {
        this.i = (1 << i) | this.i;
        if (!this.k) {
            findFragmentByWho.c(this.t.getDecorView(), this.O);
            this.k = true;
        }
    }

    private int u() {
        int i = this.P;
        int i2 = i;
        if (i == -100) {
            i2 = a();
        }
        return i2;
    }

    private void w() {
        setDividerDrawable setdividerdrawable = (setDividerDrawable) this.s.findViewById(16908290);
        View decorView = this.t.getDecorView();
        setdividerdrawable.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f.obtainStyledAttributes(setHasDecor$MediaBrowserCompat$MediaItem.az);
        obtainStyledAttributes.getValue(setHasDecor$MediaBrowserCompat$MediaItem.aP, setdividerdrawable.d());
        obtainStyledAttributes.getValue(setHasDecor$MediaBrowserCompat$MediaItem.aM, setdividerdrawable.j());
        if (obtainStyledAttributes.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.aH)) {
            obtainStyledAttributes.getValue(setHasDecor$MediaBrowserCompat$MediaItem.aH, setdividerdrawable.a());
        }
        if (obtainStyledAttributes.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.aN)) {
            obtainStyledAttributes.getValue(setHasDecor$MediaBrowserCompat$MediaItem.aN, setdividerdrawable.c());
        }
        if (obtainStyledAttributes.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.aL)) {
            obtainStyledAttributes.getValue(setHasDecor$MediaBrowserCompat$MediaItem.aL, setdividerdrawable.e());
        }
        if (obtainStyledAttributes.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.aI)) {
            obtainStyledAttributes.getValue(setHasDecor$MediaBrowserCompat$MediaItem.aI, setdividerdrawable.b());
        }
        obtainStyledAttributes.recycle();
        setdividerdrawable.requestLayout();
    }

    private void x() {
        setPopupCallback$MediaBrowserCompat$SearchResultReceiver setpopupcallback_mediabrowsercompat_searchresultreceiver = this.I;
        if (setpopupcallback_mediabrowsercompat_searchresultreceiver != null) {
            setpopupcallback_mediabrowsercompat_searchresultreceiver.a();
        }
        setPopupCallback$MediaBrowserCompat$SearchResultReceiver setpopupcallback_mediabrowsercompat_searchresultreceiver2 = this.H;
        if (setpopupcallback_mediabrowsercompat_searchresultreceiver2 != null) {
            setpopupcallback_mediabrowsercompat_searchresultreceiver2.a();
        }
    }

    private ViewGroup y() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f.obtainStyledAttributes(setHasDecor$MediaBrowserCompat$MediaItem.az);
        if (obtainStyledAttributes.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.aD)) {
            if (obtainStyledAttributes.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.aQ, false)) {
                a(1);
            } else if (obtainStyledAttributes.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.aD, false)) {
                a(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy);
            }
            if (obtainStyledAttributes.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.aK, false)) {
                a(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB);
            }
            if (obtainStyledAttributes.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.aJ, false)) {
                a(10);
            }
            this.f263o = obtainStyledAttributes.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.aE, false);
            obtainStyledAttributes.recycle();
            z();
            this.t.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f);
            if (this.r) {
                viewGroup = this.p ? (ViewGroup) from.inflate(setHasDecor.MediaMetadataCompat.p, (ViewGroup) null) : (ViewGroup) from.inflate(setHasDecor.MediaMetadataCompat.q, (ViewGroup) null);
            } else if (this.f263o) {
                viewGroup = (ViewGroup) from.inflate(setHasDecor.MediaMetadataCompat.f, (ViewGroup) null);
                this.l = false;
                this.j = false;
            } else if (this.j) {
                TypedValue typedValue = new TypedValue();
                this.f.getTheme().resolveAttribute(setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.f, typedValue, true);
                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new setShowingForActionMode(this.f, typedValue.resourceId) : this.f).inflate(setHasDecor.MediaMetadataCompat.s, (ViewGroup) null);
                setBaselineAligned setbaselinealigned = (setBaselineAligned) viewGroup2.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.p);
                this.M = setbaselinealigned;
                setbaselinealigned.setWindowCallback(t());
                if (this.l) {
                    this.M.e(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB);
                }
                if (this.J) {
                    this.M.e(2);
                }
                viewGroup = viewGroup2;
                if (this.N) {
                    this.M.e(5);
                    viewGroup = viewGroup2;
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                findFragmentByWho.d(viewGroup, new instantiate() { // from class: o.setPopupCallback.2
                    @Override // o.instantiate
                    public WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
                        int h = windowInsetsCompat.h();
                        int b = setPopupCallback.this.b(windowInsetsCompat, (Rect) null);
                        WindowInsetsCompat windowInsetsCompat2 = windowInsetsCompat;
                        if (h != b) {
                            windowInsetsCompat2 = windowInsetsCompat.c(windowInsetsCompat.i(), b, windowInsetsCompat.f(), windowInsetsCompat.j());
                        }
                        return findFragmentByWho.b(view, windowInsetsCompat2);
                    }
                });
                if (this.M == null) {
                    this.Y = (TextView) viewGroup.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.P);
                }
                setSubmitButtonEnabled.b(viewGroup);
                setDividerDrawable setdividerdrawable = (setDividerDrawable) viewGroup.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.a);
                ViewGroup viewGroup3 = (ViewGroup) this.t.findViewById(16908290);
                if (viewGroup3 != null) {
                    while (viewGroup3.getChildCount() > 0) {
                        View childAt = viewGroup3.getChildAt(0);
                        viewGroup3.removeViewAt(0);
                        setdividerdrawable.addView(childAt);
                    }
                    viewGroup3.setId(-1);
                    setdividerdrawable.setId(16908290);
                    if (viewGroup3 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup3).setForeground(null);
                    }
                }
                this.t.setContentView(viewGroup);
                setdividerdrawable.setAttachListener(new setDividerDrawable.RemoteActionCompatParcelizer() { // from class: o.setPopupCallback.3
                    @Override // o.setDividerDrawable.RemoteActionCompatParcelizer
                    public void c() {
                        setPopupCallback.this.k();
                    }

                    @Override // o.setDividerDrawable.RemoteActionCompatParcelizer
                    public void d() {
                    }
                });
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.j);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.l);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f263o);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.p);
            sb.append(", windowNoTitle: ");
            sb.append(this.r);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void z() {
        if (this.t == null) {
            Object obj = this.h;
            if (obj instanceof Activity) {
                e(((Activity) obj).getWindow());
            }
        }
        if (this.t == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    int a(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return c(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return a(context).c();
            } else {
                return -1;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r0.length <= r7) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected o.setPopupCallback$MediaSessionCompat$QueueItem a(int r7, boolean r8) {
        /*
            r6 = this;
            r0 = r6
            o.setPopupCallback$MediaSessionCompat$QueueItem[] r0 = r0.V
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L_0x0012
            r0 = r9
            r10 = r0
            r0 = r9
            int r0 = r0.length
            r1 = r7
            if (r0 > r1) goto L_0x002e
        L_0x0012:
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            o.setPopupCallback$MediaSessionCompat$QueueItem[] r0 = new o.setPopupCallback$MediaSessionCompat$QueueItem[r0]
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L_0x0028
            r0 = r9
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r9
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L_0x0028:
            r0 = r6
            r1 = r10
            r0.V = r1
        L_0x002e:
            r0 = r10
            r1 = r7
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            r9 = r0
            r0 = r11
            if (r0 != 0) goto L_0x004a
            o.setPopupCallback$MediaSessionCompat$QueueItem r0 = new o.setPopupCallback$MediaSessionCompat$QueueItem
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r9 = r0
            r0 = r10
            r1 = r7
            r2 = r9
            r0[r1] = r2
        L_0x004a:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupCallback.a(int, boolean):o.setPopupCallback$MediaSessionCompat$QueueItem");
    }

    @Override // o.setIcon
    public void a(Bundle bundle) {
        D();
    }

    @Override // o.setIcon
    public void a(View view) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.A.b().onContentChanged();
    }

    @Override // o.setIcon
    public void a(setInputType setinputtype) {
        if (this.h instanceof Activity) {
            setBackgroundResource e = e();
            if (!(e instanceof setStackedBackground)) {
                this.m = null;
                if (e != null) {
                    e.h();
                }
                if (setinputtype != null) {
                    setSplitBackground setsplitbackground = new setSplitBackground(setinputtype, q(), this.A);
                    this.c = setsplitbackground;
                    this.t.setCallback(setsplitbackground.e);
                } else {
                    this.c = null;
                    this.t.setCallback(this.A);
                }
                i();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // o.setIcon
    public boolean a(int i) {
        int h = h(i);
        if (this.r && h == 108) {
            return false;
        }
        if (this.j && h == 1) {
            this.j = false;
        }
        if (h == 1) {
            A();
            this.r = true;
            return true;
        } else if (h == 2) {
            A();
            this.J = true;
            return true;
        } else if (h == 5) {
            A();
            this.N = true;
            return true;
        } else if (h == 10) {
            A();
            this.p = true;
            return true;
        } else if (h == 108) {
            A();
            this.j = true;
            return true;
        } else if (h != 109) {
            return this.t.requestFeature(h);
        } else {
            A();
            this.l = true;
            return true;
        }
    }

    final int b(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = 0;
        int h = windowInsetsCompat != null ? windowInsetsCompat.h() : rect != null ? rect.top : 0;
        setTextSize settextsize = this.e;
        if (settextsize == null || !(settextsize.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
            boolean z5 = true;
            if (this.e.isShown()) {
                if (this.aa == null) {
                    this.aa = new Rect();
                    this.Z = new Rect();
                }
                Rect rect2 = this.aa;
                Rect rect3 = this.Z;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.i(), windowInsetsCompat.h(), windowInsetsCompat.f(), windowInsetsCompat.j());
                }
                setSubmitButtonEnabled.c(this.s, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                WindowInsetsCompat v2 = findFragmentByWho.v(this.s);
                int i6 = v2 == null ? 0 : v2.i();
                int f = v2 == null ? 0 : v2.f();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z4 = true;
                }
                if (i3 <= 0 || this.W != null) {
                    View view = this.W;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (!(marginLayoutParams2.height == marginLayoutParams.topMargin && marginLayoutParams2.leftMargin == i6 && marginLayoutParams2.rightMargin == f)) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = i6;
                            marginLayoutParams2.rightMargin = f;
                            this.W.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f);
                    this.W = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i6;
                    layoutParams.rightMargin = f;
                    this.s.addView(this.W, -1, layoutParams);
                }
                View view3 = this.W;
                if (view3 == null) {
                    z5 = false;
                }
                if (z5 && view3.getVisibility() != 0) {
                    b(this.W);
                }
                i = h;
                z2 = z5;
                z3 = z4;
                if (!this.p) {
                    i = h;
                    z2 = z5;
                    z3 = z4;
                    if (z5) {
                        i = 0;
                        z2 = z5;
                        z3 = z4;
                    }
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z2 = false;
                i = h;
            }
            h = i;
            z = z2;
            if (z3) {
                this.e.setLayoutParams(marginLayoutParams);
                h = i;
                z = z2;
            }
        }
        View view4 = this.W;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return h;
    }

    @Override // o.setIcon
    public final Keep.RemoteActionCompatParcelizer b() {
        return new RemoteActionCompatParcelizer();
    }

    public setPopupCallback$MediaSessionCompat$QueueItem b(Menu menu) {
        setPopupCallback$MediaSessionCompat$QueueItem[] setpopupcallback_mediasessioncompat_queueitemArr = this.V;
        int length = setpopupcallback_mediasessioncompat_queueitemArr != null ? setpopupcallback_mediasessioncompat_queueitemArr.length : 0;
        for (int i = 0; i < length; i++) {
            setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem = setpopupcallback_mediasessioncompat_queueitemArr[i];
            if (setpopupcallback_mediasessioncompat_queueitem != null && setpopupcallback_mediasessioncompat_queueitem.m == menu) {
                return setpopupcallback_mediasessioncompat_queueitem;
            }
        }
        return null;
    }

    @Override // o.setIcon
    public void b(int i) {
        this.ab = i;
    }

    public void b(int i, setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem, Menu menu) {
        setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem2 = setpopupcallback_mediasessioncompat_queueitem;
        Menu menu2 = menu;
        if (menu == null) {
            setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem3 = setpopupcallback_mediasessioncompat_queueitem;
            if (setpopupcallback_mediasessioncompat_queueitem == null) {
                setpopupcallback_mediasessioncompat_queueitem3 = setpopupcallback_mediasessioncompat_queueitem;
                if (i >= 0) {
                    setPopupCallback$MediaSessionCompat$QueueItem[] setpopupcallback_mediasessioncompat_queueitemArr = this.V;
                    setpopupcallback_mediasessioncompat_queueitem3 = setpopupcallback_mediasessioncompat_queueitem;
                    if (i < setpopupcallback_mediasessioncompat_queueitemArr.length) {
                        setpopupcallback_mediasessioncompat_queueitem3 = setpopupcallback_mediasessioncompat_queueitemArr[i];
                    }
                }
            }
            setpopupcallback_mediasessioncompat_queueitem2 = setpopupcallback_mediasessioncompat_queueitem3;
            menu2 = menu;
            if (setpopupcallback_mediasessioncompat_queueitem3 != null) {
                menu2 = setpopupcallback_mediasessioncompat_queueitem3.m;
                setpopupcallback_mediasessioncompat_queueitem2 = setpopupcallback_mediasessioncompat_queueitem3;
            }
        }
        if ((setpopupcallback_mediasessioncompat_queueitem2 == null || setpopupcallback_mediasessioncompat_queueitem2.i) && !this.n) {
            this.A.b().onPanelClosed(i, menu2);
        }
    }

    @Override // o.setIcon
    public void b(Bundle bundle) {
    }

    @Override // o.setIcon
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.A.b().onContentChanged();
    }

    @Override // o.setIcon
    public final void b(CharSequence charSequence) {
        this.ac = charSequence;
        setBaselineAligned setbaselinealigned = this.M;
        if (setbaselinealigned != null) {
            setbaselinealigned.setWindowTitle(charSequence);
        } else if (r() != null) {
            r().a(charSequence);
        } else {
            TextView textView = this.Y;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public void b(setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem, boolean z) {
        setBaselineAligned setbaselinealigned;
        if (!z || setpopupcallback_mediasessioncompat_queueitem.c != 0 || (setbaselinealigned = this.M) == null || !setbaselinealigned.e()) {
            WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
            if (!(windowManager == null || !setpopupcallback_mediasessioncompat_queueitem.i || setpopupcallback_mediasessioncompat_queueitem.d == null)) {
                windowManager.removeView(setpopupcallback_mediasessioncompat_queueitem.d);
                if (z) {
                    b(setpopupcallback_mediasessioncompat_queueitem.c, setpopupcallback_mediasessioncompat_queueitem, (Menu) null);
                }
            }
            setpopupcallback_mediasessioncompat_queueitem.j = false;
            setpopupcallback_mediasessioncompat_queueitem.f = false;
            setpopupcallback_mediasessioncompat_queueitem.i = false;
            setpopupcallback_mediasessioncompat_queueitem.r = null;
            setpopupcallback_mediasessioncompat_queueitem.l = true;
            if (this.X == setpopupcallback_mediasessioncompat_queueitem) {
                this.X = null;
                return;
            }
            return;
        }
        d(setpopupcallback_mediasessioncompat_queueitem.m);
    }

    boolean b(int i, KeyEvent keyEvent) {
        setBackgroundResource e = e();
        if (e != null && e.a(i, keyEvent)) {
            return true;
        }
        setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem = this.X;
        if (setpopupcallback_mediasessioncompat_queueitem != null && a(setpopupcallback_mediasessioncompat_queueitem, keyEvent.getKeyCode(), keyEvent, 1)) {
            setPopupCallback$MediaSessionCompat$QueueItem setpopupcallback_mediasessioncompat_queueitem2 = this.X;
            if (setpopupcallback_mediasessioncompat_queueitem2 == null) {
                return true;
            }
            setpopupcallback_mediasessioncompat_queueitem2.f = true;
            return true;
        } else if (this.X != null) {
            return false;
        } else {
            setPopupCallback$MediaSessionCompat$QueueItem a = a(0, true);
            e(a, keyEvent);
            boolean a2 = a(a, keyEvent.getKeyCode(), keyEvent, 1);
            a.j = false;
            return a2;
        }
    }

    @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
    public boolean b(setOnDismissListener setondismisslistener, MenuItem menuItem) {
        setPopupCallback$MediaSessionCompat$QueueItem b;
        Window.Callback t = t();
        if (t == null || this.n || (b = b(setondismisslistener.d())) == null) {
            return false;
        }
        return t.onMenuItemSelected(b.c, menuItem);
    }

    @Override // o.setIcon
    public int c() {
        return this.P;
    }

    public setActionBarVisibilityCallback c(setActionBarVisibilityCallback.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        setItemInvoker setiteminvoker;
        if (remoteActionCompatParcelizer != null) {
            setActionBarVisibilityCallback setactionbarvisibilitycallback = this.b;
            if (setactionbarvisibilitycallback != null) {
                setactionbarvisibilitycallback.d();
            }
            write write2 = new write(remoteActionCompatParcelizer);
            setBackgroundResource e = e();
            if (e != null) {
                setActionBarVisibilityCallback a = e.a(write2);
                this.b = a;
                if (!(a == null || (setiteminvoker = this.a) == null)) {
                    setiteminvoker.b(a);
                }
            }
            if (this.b == null) {
                this.b = e(write2);
            }
            return this.b;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public void c(int i) {
        b(a(i, true), true);
    }

    void c(ViewGroup viewGroup) {
    }

    @Override // o.setIcon
    public MenuInflater d() {
        if (this.m == null) {
            B();
            setBackgroundResource setbackgroundresource = this.c;
            this.m = new setUiOptions(setbackgroundresource != null ? setbackgroundresource.a() : this.f);
        }
        return this.m;
    }

    @Override // o.setIcon
    public <T extends View> T d(int i) {
        D();
        return (T) this.t.findViewById(i);
    }

    @Override // o.setIcon
    public void d(Configuration configuration) {
        setBackgroundResource e;
        if (this.j && this.U && (e = e()) != null) {
            e.b(configuration);
        }
        setImageResource.c().e(this.f);
        e(false);
    }

    @Override // o.setIcon
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        ((ViewGroup) this.s.findViewById(16908290)).addView(view, layoutParams);
        this.A.b().onContentChanged();
    }

    void d(setOnDismissListener setondismisslistener) {
        if (!this.G) {
            this.G = true;
            this.M.d();
            Window.Callback t = t();
            if (t != null && !this.n) {
                t.onPanelClosed(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy, setondismisslistener);
            }
            this.G = false;
        }
    }

    boolean d(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & Property.TYPE_ARRAY) == 0) {
                z = false;
            }
            this.Q = z;
            return false;
        } else if (i != 82) {
            return false;
        } else {
            a(0, keyEvent);
            return true;
        }
    }

    public boolean d(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.h;
        boolean z = true;
        if (((obj instanceof onHasView.read) || (obj instanceof setContentHeight)) && (decorView = this.t.getDecorView()) != null && findFragmentByWho.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.A.b().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? d(keyCode, keyEvent) : e(keyCode, keyEvent);
    }

    @Override // o.setIcon
    public Context e(Context context) {
        boolean z = true;
        this.E = true;
        int a = a(context, u());
        Configuration configuration = null;
        if (y && (context instanceof ContextThemeWrapper)) {
            try {
                RatingCompat.e((ContextThemeWrapper) context, b(context, a, (Configuration) null));
                return context;
            } catch (IllegalStateException e) {
            }
        }
        if (context instanceof setShowingForActionMode) {
            try {
                ((setShowingForActionMode) context).a(b(context, a, (Configuration) null));
                return context;
            } catch (IllegalStateException e2) {
            }
        }
        if (!u) {
            return e(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = setPopupCallback$MediaBrowserCompat$CustomActionResultReceiver.b(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = d(configuration3, configuration4);
        }
        Configuration b = b(context, a, configuration);
        setShowingForActionMode setshowingforactionmode = new setShowingForActionMode(context, setHasDecor.MediaDescriptionCompat.c);
        setshowingforactionmode.a(b);
        z = false;
        try {
            if (context.getTheme() == null) {
                z = false;
            }
        } catch (NullPointerException e3) {
        }
        if (z) {
            inset.write.e(setshowingforactionmode.getTheme());
        }
        return e(setshowingforactionmode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0113, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r14).getDepth() > 1) goto L_0x00fd;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.view.View e(android.view.View r11, java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupCallback.e(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    o.setActionBarVisibilityCallback e(o.setActionBarVisibilityCallback.RemoteActionCompatParcelizer r8) {
        /*
        // Method dump skipped, instructions count: 599
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupCallback.e(o.setActionBarVisibilityCallback$RemoteActionCompatParcelizer):o.setActionBarVisibilityCallback");
    }

    @Override // o.setIcon
    public setBackgroundResource e() {
        B();
        return this.c;
    }

    @Override // o.setIcon
    public void e(int i) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f).inflate(i, viewGroup);
        this.A.b().onContentChanged();
    }

    @Override // o.setIcon
    public void e(Bundle bundle) {
        String str;
        this.E = true;
        e(false);
        z();
        Object obj = this.h;
        if (obj instanceof Activity) {
            try {
                str = setStatusBarBackgroundResource.c((Activity) obj);
            } catch (IllegalArgumentException e) {
                str = null;
            }
            if (str != null) {
                setBackgroundResource r = r();
                if (r == null) {
                    this.L = true;
                } else {
                    r.e(true);
                }
            }
            b(this);
        }
        this.F = true;
    }

    @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
    public void e(setOnDismissListener setondismisslistener) {
        c(true);
    }

    boolean e(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.Q;
            this.Q = false;
            setPopupCallback$MediaSessionCompat$QueueItem a = a(0, false);
            if (a == null || !a.i) {
                return s();
            }
            if (z) {
                return true;
            }
            b(a, true);
            return true;
        } else if (i != 82) {
            return false;
        } else {
            c(0, keyEvent);
            return true;
        }
    }

    @Override // o.setIcon
    public void f() {
        this.T = true;
        l();
    }

    void f(int i) {
        setBackgroundResource e;
        if (i == 108 && (e = e()) != null) {
            e.a(true);
        }
    }

    @Override // o.setIcon
    public void g() {
        setBackgroundResource e = e();
        if (e != null) {
            e.b(true);
        }
    }

    void g(int i) {
        if (i == 108) {
            setBackgroundResource e = e();
            if (e != null) {
                e.a(false);
            }
        } else if (i == 0) {
            setPopupCallback$MediaSessionCompat$QueueItem a = a(i, true);
            if (a.i) {
                b(a, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    @Override // o.setIcon
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void h() {
        /*
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.h
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x000e
            r0 = r4
            a(r0)
        L_0x000e:
            r0 = r4
            boolean r0 = r0.k
            if (r0 == 0) goto L_0x0024
            r0 = r4
            android.view.Window r0 = r0.t
            android.view.View r0 = r0.getDecorView()
            r1 = r4
            java.lang.Runnable r1 = r1.O
            boolean r0 = r0.removeCallbacks(r1)
        L_0x0024:
            r0 = r4
            r1 = 0
            r0.T = r1
            r0 = r4
            r1 = 1
            r0.n = r1
            r0 = r4
            int r0 = r0.P
            r1 = -100
            if (r0 == r1) goto L_0x0068
            r0 = r4
            java.lang.Object r0 = r0.h
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0068
            r0 = r5
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0068
            o.setCollapseIcon<java.lang.String, java.lang.Integer> r0 = o.setPopupCallback.v
            r1 = r4
            java.lang.Object r1 = r1.h
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r2 = r4
            int r2 = r2.P
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            goto L_0x0079
        L_0x0068:
            o.setCollapseIcon<java.lang.String, java.lang.Integer> r0 = o.setPopupCallback.v
            r1 = r4
            java.lang.Object r1 = r1.h
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.Object r0 = r0.remove(r1)
        L_0x0079:
            r0 = r4
            o.setBackgroundResource r0 = r0.c
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0086
            r0 = r5
            r0.h()
        L_0x0086:
            r0 = r4
            r0.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupCallback.h():void");
    }

    @Override // o.setIcon
    public void i() {
        setBackgroundResource e = e();
        if (e == null || !e.c()) {
            i(0);
        }
    }

    @Override // o.setIcon
    public void j() {
        LayoutInflater from = LayoutInflater.from(this.f);
        if (from.getFactory() == null) {
            onStop.d(from, this);
        } else if (!(from.getFactory2() instanceof setPopupCallback)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    void j(int i) {
        setPopupCallback$MediaSessionCompat$QueueItem a;
        setPopupCallback$MediaSessionCompat$QueueItem a2 = a(i, true);
        if (a2.m != null) {
            Bundle bundle = new Bundle();
            a2.m.b(bundle);
            if (bundle.size() > 0) {
                a2.b = bundle;
            }
            setOnDismissListener setondismisslistener = a2.m;
            if (!setondismisslistener.p) {
                setondismisslistener.p = true;
                setondismisslistener.n = false;
                setondismisslistener.t = false;
            }
            a2.m.clear();
        }
        a2.n = true;
        a2.l = true;
        if ((i == 108 || i == 0) && this.M != null && (a = a(0, false)) != null) {
            a.j = false;
            e(a, (KeyEvent) null);
        }
    }

    void k() {
        setBaselineAligned setbaselinealigned = this.M;
        if (setbaselinealigned != null) {
            setbaselinealigned.d();
        }
        if (this.d != null) {
            this.t.getDecorView().removeCallbacks(this.q);
            if (this.d.isShowing()) {
                try {
                    this.d.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.d = null;
        }
        n();
        setPopupCallback$MediaSessionCompat$QueueItem a = a(0, false);
        if (a != null && a.m != null) {
            a.m.close();
        }
    }

    public boolean l() {
        return e(true);
    }

    @Override // o.setIcon
    public void m() {
        this.T = false;
        setBackgroundResource e = e();
        if (e != null) {
            e.b(false);
        }
    }

    void n() {
        generateActivityResultKey generateactivityresultkey = this.g;
        if (generateactivityresultkey != null) {
            generateactivityresultkey.c();
        }
    }

    final Context o() {
        setBackgroundResource e = e();
        Context a = e != null ? e.a() : null;
        Context context = a;
        if (a == null) {
            context = this.f;
        }
        return context;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return e(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public boolean p() {
        return this.K;
    }

    final CharSequence q() {
        Object obj = this.h;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.ac;
    }

    final setBackgroundResource r() {
        return this.c;
    }

    boolean s() {
        setActionBarVisibilityCallback setactionbarvisibilitycallback = this.b;
        if (setactionbarvisibilitycallback != null) {
            setactionbarvisibilitycallback.d();
            return true;
        }
        setBackgroundResource e = e();
        return e != null && e.b();
    }

    public final Window.Callback t() {
        return this.t.getCallback();
    }

    final boolean v() {
        ViewGroup viewGroup;
        return this.U && (viewGroup = this.s) != null && findFragmentByWho.G(viewGroup);
    }
}
