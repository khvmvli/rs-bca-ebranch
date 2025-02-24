package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setMenuPrepared.class */
public final class setMenuPrepared extends ActionMode {
    final Context a;
    final setActionBarVisibilityCallback d;

    public setMenuPrepared(Context context, setActionBarVisibilityCallback setactionbarvisibilitycallback) {
        this.a = context;
        this.d = setactionbarvisibilitycallback;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.d.d();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.d.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new setSupportBackgroundTintList(this.a, (WindowInsetsCompat$Impl29) this.d.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.d.a();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.d.i();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.d.b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.d.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.d.e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.d.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.d.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.d.b(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.d.d(i);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.d.c(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.d.b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.d.b(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.d.e(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.d.d(z);
    }
}
