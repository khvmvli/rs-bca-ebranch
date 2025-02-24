package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.List;
import o.BaseDialogKotlin;
import o.GuestWarningWebViewDialog_ViewBinding;
import o.HubunganDialog_ViewBinding;
import o.KeluarFormReservationDialog;
import o.KetentuanBankTransferDialog;
import o.KetentuanORDialog;
import o.findFragmentByWho;
import o.instantiate;
import o.isRound;
import o.onDismiss;
import o.unbindViews;
/* loaded from: classes-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar.class */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final boolean e;
    final KeluarFormReservationDialog d;
    int f;
    int g;
    final Context h;
    int i;
    int j;
    public final RemoteActionCompatParcelizer k;
    int m;
    private final AccessibilityManager n;
    private List<Object<B>> p;
    private View q;
    private Behavior s;
    private boolean u;
    private int v;
    private Rect w;
    private final ViewGroup x;
    private static final int[] l = {BaseDialogKotlin.MediaBrowserCompat.CustomActionResultReceiver.K};
    static final String b = "BaseTransientBottomBar";
    static final Handler a = new Handler(Looper.getMainLooper(), new 5());
    boolean c = false;
    private final ViewTreeObserver.OnGlobalLayoutListener t = new 15(this);
    private final Runnable r = new 11(this);

    /* renamed from: o */
    public KetentuanORDialog.write f73o = new 13(this);

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, KeluarFormReservationDialog keluarFormReservationDialog) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (keluarFormReservationDialog != null) {
            this.x = viewGroup;
            this.d = keluarFormReservationDialog;
            this.h = context;
            GuestWarningWebViewDialog_ViewBinding.a(context);
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = this.h.obtainStyledAttributes(l);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            RemoteActionCompatParcelizer inflate = from.inflate(resourceId != -1 ? BaseDialogKotlin.MediaBrowserCompat.MediaItem.A : BaseDialogKotlin.MediaBrowserCompat.MediaItem.b, viewGroup, false);
            this.k = inflate;
            if (view instanceof KetentuanBankTransferDialog) {
                KetentuanBankTransferDialog ketentuanBankTransferDialog = (KetentuanBankTransferDialog) view;
                float f = inflate.c;
                if (f != 1.0f) {
                    int currentTextColor = ketentuanBankTransferDialog.c.getCurrentTextColor();
                    ketentuanBankTransferDialog.c.setTextColor(isRound.a(isRound.b(currentTextColor, Math.round(((float) Color.alpha(currentTextColor)) * f)), HubunganDialog_ViewBinding.c(ketentuanBankTransferDialog.getContext(), BaseDialogKotlin.MediaBrowserCompat.CustomActionResultReceiver.t, ketentuanBankTransferDialog.getClass().getCanonicalName())));
                }
            }
            inflate.addView(view);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.w = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            findFragmentByWho.a((View) inflate, 1);
            findFragmentByWho.j(inflate, 1);
            findFragmentByWho.a((View) inflate, true);
            findFragmentByWho.d((View) inflate, (instantiate) new 12(this));
            findFragmentByWho.d((View) inflate, (onDismiss) new 14(this));
            this.n = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    static /* synthetic */ int a(BaseTransientBottomBar baseTransientBottomBar) {
        int[] iArr = new int[2];
        baseTransientBottomBar.k.getLocationOnScreen(iArr);
        return iArr[1] + baseTransientBottomBar.k.getHeight();
    }

    static /* synthetic */ void d(BaseTransientBottomBar baseTransientBottomBar) {
        int f = baseTransientBottomBar.f();
        if (e) {
            findFragmentByWho.e((View) baseTransientBottomBar.k, f);
        } else {
            baseTransientBottomBar.k.setTranslationY((float) f);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(f, 0);
        valueAnimator.setInterpolator(unbindViews.d);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new 9(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new 8(baseTransientBottomBar, f));
        valueAnimator.start();
    }

    private int f() {
        int height = this.k.getHeight();
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        int i = height;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i = height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (((r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.read) && (((androidx.coordinatorlayout.widget.CoordinatorLayout.read) r0).g instanceof com.google.android.material.behavior.SwipeDismissBehavior)) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean i() {
        /*
            r2 = this;
            r0 = r2
            int r0 = r0.g
            r3 = r0
            r0 = 1
            r4 = r0
            r0 = r3
            if (r0 <= 0) goto L_0x003c
            r0 = r2
            boolean r0 = r0.u
            if (r0 != 0) goto L_0x003c
            r0 = r2
            com.google.android.material.snackbar.BaseTransientBottomBar$RemoteActionCompatParcelizer r0 = r0.k
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.read
            if (r0 == 0) goto L_0x0033
            r0 = r5
            androidx.coordinatorlayout.widget.CoordinatorLayout$read r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.read) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$write r0 = r0.g
            boolean r0 = r0 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r0 == 0) goto L_0x0033
            r0 = 1
            r3 = r0
            goto L_0x0035
        L_0x0033:
            r0 = 0
            r3 = r0
        L_0x0035:
            r0 = r3
            if (r0 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r0 = 0
            r4 = r0
        L_0x003e:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.i():boolean");
    }

    public void l() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.w) == null) {
            Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.q != null ? this.i : this.f);
        marginLayoutParams.leftMargin = this.w.left + this.j;
        marginLayoutParams.rightMargin = this.w.right + this.m;
        this.k.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && i()) {
            this.k.removeCallbacks(this.r);
            this.k.post(this.r);
        }
    }

    private boolean m() {
        AccessibilityManager accessibilityManager = this.n;
        boolean z = true;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            z = false;
        }
        return z;
    }

    public void n() {
        if (m()) {
            this.k.post(new 2(this));
            return;
        }
        if (this.k.getParent() != null) {
            this.k.setVisibility(0);
        }
        j();
    }

    int a() {
        View view = this.q;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.x.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.x.getHeight()) - i;
    }

    final void a(int i) {
        if (KetentuanORDialog.e == null) {
            KetentuanORDialog.e = new KetentuanORDialog();
        }
        KetentuanORDialog ketentuanORDialog = KetentuanORDialog.e;
        KetentuanORDialog.write write = this.f73o;
        synchronized (ketentuanORDialog.b) {
            KetentuanORDialog.IconCompatParcelizer iconCompatParcelizer = ketentuanORDialog.a;
            boolean z = false;
            if (iconCompatParcelizer != null) {
                z = false;
                if (write != null && iconCompatParcelizer.e.get() == write) {
                    z = true;
                }
            }
            if (z) {
                ketentuanORDialog.a = null;
                if (ketentuanORDialog.c != null) {
                    ketentuanORDialog.b();
                }
            }
        }
        List<Object<B>> list = this.p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.p.get(size);
            }
        }
        ViewParent parent = this.k.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.k);
        }
    }

    public final View b() {
        return this.k;
    }

    final void b(int i) {
        if (!m() || this.k.getVisibility() != 0) {
            a(i);
        } else if (this.k.e == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setInterpolator(unbindViews.c);
            ofFloat.addUpdateListener(new 3(this));
            ofFloat.setDuration(75L);
            ofFloat.addListener(new 1(this, i));
            ofFloat.start();
        } else {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(0, f());
            valueAnimator.setInterpolator(unbindViews.d);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new 10(this, i));
            valueAnimator.addUpdateListener(new 7(this));
            valueAnimator.start();
        }
    }

    public int c() {
        return this.v;
    }

    public final B c(int i) {
        this.v = i;
        return this;
    }

    public void d() {
        if (KetentuanORDialog.e == null) {
            KetentuanORDialog.e = new KetentuanORDialog();
        }
        KetentuanORDialog.e.c(this.f73o, 3);
    }

    public final Context e() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: all -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0027, B:12:0x0039, B:23:0x0061, B:26:0x0080, B:30:0x008f, B:41:0x00b8, B:42:0x00c3, B:44:0x00d6, B:46:0x00de, B:51:0x00ef), top: B:58:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080 A[Catch: all -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0027, B:12:0x0039, B:23:0x0061, B:26:0x0080, B:30:0x008f, B:41:0x00b8, B:42:0x00c3, B:44:0x00d6, B:46:0x00de, B:51:0x00ef), top: B:58:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[Catch: all -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0027, B:12:0x0039, B:23:0x0061, B:26:0x0080, B:30:0x008f, B:41:0x00b8, B:42:0x00c3, B:44:0x00d6, B:46:0x00de, B:51:0x00ef), top: B:58:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0027, B:12:0x0039, B:23:0x0061, B:26:0x0080, B:30:0x008f, B:41:0x00b8, B:42:0x00c3, B:44:0x00d6, B:46:0x00de, B:51:0x00ef), top: B:58:0x0027 }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void g() {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.g():void");
    }

    final void h() {
        this.k.b = new 16(this);
        if (this.k.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.read) {
                CoordinatorLayout.read read = (CoordinatorLayout.read) layoutParams;
                Behavior behavior = this.s;
                Behavior behavior2 = behavior;
                if (behavior == null) {
                    behavior2 = new Behavior();
                }
                if (behavior2 instanceof Behavior) {
                    behavior2.j.c = this.f73o;
                }
                ((SwipeDismissBehavior) behavior2).e = new 19(this);
                read.b(behavior2);
                if (this.q == null) {
                    read.c = 80;
                }
            }
            this.i = a();
            l();
            this.k.setVisibility(4);
            this.x.addView(this.k);
        }
        if (findFragmentByWho.G(this.k)) {
            n();
            return;
        }
        this.k.d = new 18(this);
    }

    final void j() {
        if (KetentuanORDialog.e == null) {
            KetentuanORDialog.e = new KetentuanORDialog();
        }
        KetentuanORDialog ketentuanORDialog = KetentuanORDialog.e;
        KetentuanORDialog.write write = this.f73o;
        synchronized (ketentuanORDialog.b) {
            KetentuanORDialog.IconCompatParcelizer iconCompatParcelizer = ketentuanORDialog.a;
            boolean z = false;
            if (iconCompatParcelizer != null) {
                z = false;
                if (write != null && iconCompatParcelizer.e.get() == write) {
                    z = true;
                }
            }
            if (z) {
                ketentuanORDialog.d(ketentuanORDialog.a);
            }
        }
        List<Object<B>> list = this.p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.p.get(size);
            }
        }
    }
}
