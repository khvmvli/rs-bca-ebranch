package o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import o.setActionBarVisibilityCallback;
import o.setOnDismissListener;
/* loaded from: classes-dex2jar.jar:o/setWindowCallback.class */
public final class setWindowCallback extends setActionBarVisibilityCallback implements setOnDismissListener.RemoteActionCompatParcelizer {
    private setTextSize a;
    private setActionBarVisibilityCallback.RemoteActionCompatParcelizer c;
    private Context d;
    private WeakReference<View> f;
    private setOnDismissListener g;
    private boolean h;
    private boolean j;

    public setWindowCallback(Context context, setTextSize settextsize, setActionBarVisibilityCallback.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
        this.d = context;
        this.a = settextsize;
        this.c = remoteActionCompatParcelizer;
        setOnDismissListener setondismisslistener = new setOnDismissListener(settextsize.getContext());
        setondismisslistener.a = 1;
        this.g = setondismisslistener;
        setondismisslistener.e(this);
        this.j = z;
    }

    @Override // o.setActionBarVisibilityCallback
    public final MenuInflater a() {
        return new setUiOptions(this.a.getContext());
    }

    @Override // o.setActionBarVisibilityCallback
    public final View b() {
        WeakReference<View> weakReference = this.f;
        return weakReference != null ? weakReference.get() : null;
    }

    @Override // o.setActionBarVisibilityCallback
    public final void b(int i) {
        this.a.setTitle(this.d.getString(i));
    }

    @Override // o.setActionBarVisibilityCallback
    public final void b(View view) {
        this.a.setCustomView(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
    public final boolean b(setOnDismissListener setondismisslistener, MenuItem menuItem) {
        return this.c.c(this, menuItem);
    }

    @Override // o.setActionBarVisibilityCallback
    public final void c(CharSequence charSequence) {
        this.a.setSubtitle(charSequence);
    }

    @Override // o.setActionBarVisibilityCallback
    public final void d() {
        if (!this.h) {
            this.h = true;
            this.a.sendAccessibilityEvent(32);
            this.c.d(this);
        }
    }

    @Override // o.setActionBarVisibilityCallback
    public final void d(int i) {
        this.a.setSubtitle(this.d.getString(i));
    }

    @Override // o.setActionBarVisibilityCallback
    public final void d(boolean z) {
        d(z);
        this.a.setTitleOptional(z);
    }

    @Override // o.setActionBarVisibilityCallback
    public final Menu e() {
        return this.g;
    }

    @Override // o.setActionBarVisibilityCallback
    public final void e(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
    public final void e(setOnDismissListener setondismisslistener) {
        this.c.c(this, this.g);
        this.a.c();
    }

    @Override // o.setActionBarVisibilityCallback
    public final CharSequence f() {
        return this.a.h;
    }

    @Override // o.setActionBarVisibilityCallback
    public final void g() {
        this.c.c(this, this.g);
    }

    @Override // o.setActionBarVisibilityCallback
    public final CharSequence i() {
        return this.a.i;
    }

    @Override // o.setActionBarVisibilityCallback
    public final boolean j() {
        return this.a.j;
    }
}
