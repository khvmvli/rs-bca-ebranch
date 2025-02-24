package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import o.setDropDownBackgroundResource;
import o.setHasDecor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setSupportAllCaps.class */
public final class setSupportAllCaps extends setInitialActivityCount implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {
    private static final int e = setHasDecor.MediaMetadataCompat.f233o;
    ViewTreeObserver a;
    final setVerticalGravity b;
    View d;
    private int f;
    private final setDefaultActionButtonContentDescription g;
    private View h;
    private PopupWindow.OnDismissListener k;
    private final Context l;
    private final setOnDismissListener m;
    private boolean n;
    private final boolean p;
    private final int q;
    private setDropDownBackgroundResource.IconCompatParcelizer r;
    private final int s;
    private final int t;
    private boolean w;
    private boolean x;
    final ViewTreeObserver.OnGlobalLayoutListener c = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.setSupportAllCaps.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (setSupportAllCaps.this.f() && !setSupportAllCaps.this.b.s()) {
                View view = setSupportAllCaps.this.d;
                if (view == null || !view.isShown()) {
                    setSupportAllCaps.this.c();
                } else {
                    setSupportAllCaps.this.b.j();
                }
            }
        }
    };
    private final View.OnAttachStateChangeListener i = new View.OnAttachStateChangeListener() { // from class: o.setSupportAllCaps.3
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (setSupportAllCaps.this.a != null) {
                if (!setSupportAllCaps.this.a.isAlive()) {
                    setSupportAllCaps.this.a = view.getViewTreeObserver();
                }
                setSupportAllCaps.this.a.removeGlobalOnLayoutListener(setSupportAllCaps.this.c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: o  reason: collision with root package name */
    private int f271o = 0;

    public setSupportAllCaps(Context context, setOnDismissListener setondismisslistener, View view, int i, int i2, boolean z) {
        this.l = context;
        this.m = setondismisslistener;
        this.p = z;
        this.g = new setDefaultActionButtonContentDescription(setondismisslistener, LayoutInflater.from(context), z, e);
        this.q = i;
        this.s = i2;
        Resources resources = context.getResources();
        this.t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(setHasDecor.write.c));
        this.h = view;
        this.b = new setVerticalGravity(context, null, i, i2);
        setondismisslistener.s.add(new WeakReference<>(this));
        e(context, setondismisslistener);
        setondismisslistener.i = true;
    }

    @Override // o.setInitialActivityCount
    public final void a(int i) {
        this.b.e(i);
    }

    @Override // o.setInitialActivityCount
    public final void a(setOnDismissListener setondismisslistener) {
    }

    @Override // o.setInitialActivityCount
    public final void a(boolean z) {
        this.w = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // o.setDropDownBackgroundResource
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean a(o.setTextAppearance r10) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSupportAllCaps.a(o.setTextAppearance):boolean");
    }

    @Override // o.setInitialActivityCount
    public final void b(int i) {
        this.b.c(i);
    }

    @Override // o.setDropDownBackgroundResource
    public final void b(Parcelable parcelable) {
    }

    @Override // o.setInitialActivityCount
    public final void b(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    @Override // o.setSupportBackgroundTintMode
    public final ListView b_() {
        return this.b.b_();
    }

    @Override // o.setSupportBackgroundTintMode
    public final void c() {
        if (f()) {
            this.b.c();
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void c(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer) {
        this.r = iconCompatParcelizer;
    }

    @Override // o.setDropDownBackgroundResource
    public final void c(boolean z) {
        this.n = false;
        setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = this.g;
        if (setdefaultactionbuttoncontentdescription != null) {
            setdefaultactionbuttoncontentdescription.notifyDataSetChanged();
        }
    }

    @Override // o.setInitialActivityCount
    public final void d(boolean z) {
        this.g.d = z;
    }

    @Override // o.setInitialActivityCount
    public final void e(int i) {
        this.f271o = i;
    }

    @Override // o.setInitialActivityCount
    public final void e(View view) {
        this.h = view;
    }

    @Override // o.setDropDownBackgroundResource
    public final void e(setOnDismissListener setondismisslistener, boolean z) {
        if (setondismisslistener == this.m) {
            c();
            setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = this.r;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.a(setondismisslistener, z);
            }
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final boolean e() {
        return false;
    }

    @Override // o.setSupportBackgroundTintMode
    public final boolean f() {
        return !this.x && this.b.f();
    }

    @Override // o.setDropDownBackgroundResource
    public final Parcelable i() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0150  */
    @Override // o.setSupportBackgroundTintMode
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void j() {
        /*
        // Method dump skipped, instructions count: 347
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSupportAllCaps.j():void");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.x = true;
        this.m.close();
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a = this.d.getViewTreeObserver();
            }
            this.a.removeGlobalOnLayoutListener(this.c);
            this.a = null;
        }
        this.d.removeOnAttachStateChangeListener(this.i);
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        c();
        return true;
    }
}
