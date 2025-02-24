package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.setDropDownBackgroundResource;
import o.setHasDecor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setPresenter.class */
public final class setPresenter extends setInitialActivityCount implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int i = setHasDecor.MediaMetadataCompat.i;
    private boolean B;
    private int C;
    View a;
    final Handler b;
    boolean e;
    private View f;
    ViewTreeObserver h;
    private final Context l;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f265o;
    private int p;
    private PopupWindow.OnDismissListener r;
    private final int s;
    private final boolean t;
    private final int u;
    private final int v;
    private setDropDownBackgroundResource.IconCompatParcelizer w;
    private int z;
    private final List<setOnDismissListener> y = new ArrayList();
    final List<write> d = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.setPresenter.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (setPresenter.this.f() && setPresenter.this.d.size() > 0 && !setPresenter.this.d.get(0).d.s()) {
                View view = setPresenter.this.a;
                if (view == null || !view.isShown()) {
                    setPresenter.this.c();
                    return;
                }
                for (write write2 : setPresenter.this.d) {
                    write2.d.j();
                }
            }
        }
    };
    private final View.OnAttachStateChangeListener g = new View.OnAttachStateChangeListener() { // from class: o.setPresenter.3
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (setPresenter.this.h != null) {
                if (!setPresenter.this.h.isAlive()) {
                    setPresenter.this.h = view.getViewTreeObserver();
                }
                setPresenter.this.h.removeGlobalOnLayoutListener(setPresenter.this.c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final setShowDividers q = new setShowDividers() { // from class: o.setPresenter.5
        @Override // o.setShowDividers
        public final void a(setOnDismissListener setondismisslistener, MenuItem menuItem) {
            setPresenter.this.b.removeCallbacksAndMessages(setondismisslistener);
        }

        @Override // o.setShowDividers
        public final void d(final setOnDismissListener setondismisslistener, final MenuItem menuItem) {
            int i2;
            final write write2 = null;
            setPresenter.this.b.removeCallbacksAndMessages(null);
            int size = setPresenter.this.d.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i2 = -1;
                    break;
                }
                i2 = i3;
                if (setondismisslistener == setPresenter.this.d.get(i3).a) {
                    break;
                }
                i3++;
            }
            if (i2 != -1) {
                int i4 = i2 + 1;
                if (i4 < setPresenter.this.d.size()) {
                    write2 = setPresenter.this.d.get(i4);
                }
                setPresenter.this.b.postAtTime(new Runnable() { // from class: o.setPresenter.5.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (write2 != null) {
                            setPresenter.this.e = true;
                            write2.a.d(false);
                            setPresenter.this.e = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            setondismisslistener.d(menuItem, null, 4);
                        }
                    }
                }, setondismisslistener, SystemClock.uptimeMillis() + 200);
            }
        }
    };
    private int x = 0;
    private int k = 0;
    private boolean m = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setPresenter$write.class */
    public static final class write {
        public final setOnDismissListener a;
        public final int c;
        public final setVerticalGravity d;

        public write(setVerticalGravity setverticalgravity, setOnDismissListener setondismisslistener, int i) {
            this.d = setverticalgravity;
            this.a = setondismisslistener;
            this.c = i;
        }
    }

    public setPresenter(Context context, View view, int i2, int i3, boolean z) {
        int i4 = 0;
        this.l = context;
        this.f = view;
        this.u = i2;
        this.v = i3;
        this.t = z;
        if (findFragmentByWho.k(view) != 1) {
            i4 = 1;
        }
        this.p = i4;
        Resources resources = context.getResources();
        this.s = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(setHasDecor.write.c));
        this.b = new Handler();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0357  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void b(o.setOnDismissListener r8) {
        /*
        // Method dump skipped, instructions count: 1014
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPresenter.b(o.setOnDismissListener):void");
    }

    @Override // o.setInitialActivityCount
    public final void a(int i2) {
        this.f265o = true;
        this.C = i2;
    }

    @Override // o.setInitialActivityCount
    public final void a(setOnDismissListener setondismisslistener) {
        Context context = this.l;
        setondismisslistener.s.add(new WeakReference<>(this));
        e(context, setondismisslistener);
        setondismisslistener.i = true;
        if (f()) {
            b(setondismisslistener);
        } else {
            this.y.add(setondismisslistener);
        }
    }

    @Override // o.setInitialActivityCount
    public final void a(boolean z) {
        this.B = z;
    }

    @Override // o.setDropDownBackgroundResource
    public final boolean a(setTextAppearance settextappearance) {
        for (write write2 : this.d) {
            if (settextappearance == write2.a) {
                write2.d.b_().requestFocus();
                return true;
            }
        }
        if (!settextappearance.hasVisibleItems()) {
            return false;
        }
        a((setOnDismissListener) settextappearance);
        setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = this.w;
        if (iconCompatParcelizer == null) {
            return true;
        }
        iconCompatParcelizer.a(settextappearance);
        return true;
    }

    @Override // o.setInitialActivityCount
    public final void b(int i2) {
        this.n = true;
        this.z = i2;
    }

    @Override // o.setDropDownBackgroundResource
    public final void b(Parcelable parcelable) {
    }

    @Override // o.setInitialActivityCount
    public final void b(PopupWindow.OnDismissListener onDismissListener) {
        this.r = onDismissListener;
    }

    @Override // o.setSupportBackgroundTintMode
    public final ListView b_() {
        ListView listView;
        if (this.d.isEmpty()) {
            listView = null;
        } else {
            List<write> list = this.d;
            listView = list.get(list.size() - 1).d.b_();
        }
        return listView;
    }

    @Override // o.setSupportBackgroundTintMode
    public final void c() {
        int size = this.d.size();
        if (size > 0) {
            write[] writeArr = (write[]) this.d.toArray(new write[size]);
            while (true) {
                int i2 = size - 1;
                if (i2 >= 0) {
                    write write2 = writeArr[i2];
                    size = i2;
                    if (write2.d.f()) {
                        write2.d.c();
                        size = i2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void c(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer) {
        this.w = iconCompatParcelizer;
    }

    @Override // o.setDropDownBackgroundResource
    public final void c(boolean z) {
        for (write write2 : this.d) {
            ListAdapter adapter = write2.d.b_().getAdapter();
            ((setDefaultActionButtonContentDescription) (adapter instanceof HeaderViewListAdapter ? ((HeaderViewListAdapter) adapter).getWrappedAdapter() : adapter)).notifyDataSetChanged();
        }
    }

    @Override // o.setInitialActivityCount
    public final void d(boolean z) {
        this.m = z;
    }

    @Override // o.setInitialActivityCount
    protected final boolean d() {
        return false;
    }

    @Override // o.setInitialActivityCount
    public final void e(int i2) {
        if (this.x != i2) {
            this.x = i2;
            this.k = onGetLayoutInflater.c(i2, findFragmentByWho.k(this.f));
        }
    }

    @Override // o.setInitialActivityCount
    public final void e(View view) {
        if (this.f != view) {
            this.f = view;
            this.k = onGetLayoutInflater.c(this.x, findFragmentByWho.k(view));
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void e(setOnDismissListener setondismisslistener, boolean z) {
        int size = this.d.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (setondismisslistener == this.d.get(i2).a) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.d.size()) {
                this.d.get(i3).a.d(false);
            }
            write remove = this.d.remove(i2);
            remove.a.a(this);
            if (this.e) {
                setVerticalGravity setverticalgravity = remove.d;
                if (Build.VERSION.SDK_INT >= 23) {
                    setverticalgravity.j.setExitTransition(null);
                }
                remove.d.a(0);
            }
            remove.d.c();
            int size2 = this.d.size();
            if (size2 > 0) {
                this.p = this.d.get(size2 - 1).c;
            } else {
                this.p = findFragmentByWho.k(this.f) == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                c();
                setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = this.w;
                if (iconCompatParcelizer != null) {
                    iconCompatParcelizer.a(setondismisslistener, true);
                }
                ViewTreeObserver viewTreeObserver = this.h;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.h.removeGlobalOnLayoutListener(this.c);
                    }
                    this.h = null;
                }
                this.a.removeOnAttachStateChangeListener(this.g);
                this.r.onDismiss();
            } else if (z) {
                this.d.get(0).a.d(false);
            }
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final boolean e() {
        return false;
    }

    @Override // o.setSupportBackgroundTintMode
    public final boolean f() {
        boolean z = false;
        if (this.d.size() > 0) {
            z = false;
            if (this.d.get(0).d.f()) {
                z = true;
            }
        }
        return z;
    }

    @Override // o.setDropDownBackgroundResource
    public final Parcelable i() {
        return null;
    }

    @Override // o.setSupportBackgroundTintMode
    public final void j() {
        if (!f()) {
            for (setOnDismissListener setondismisslistener : this.y) {
                b(setondismisslistener);
            }
            this.y.clear();
            View view = this.f;
            this.a = view;
            if (view != null) {
                boolean z = this.h == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.h = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.c);
                }
                this.a.addOnAttachStateChangeListener(this.g);
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        write write2;
        int size = this.d.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                write2 = null;
                break;
            }
            write write3 = this.d.get(i2);
            write2 = write3;
            if (!write3.d.f()) {
                break;
            }
            i2++;
        }
        if (write2 != null) {
            write2.a.d(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        c();
        return true;
    }
}
