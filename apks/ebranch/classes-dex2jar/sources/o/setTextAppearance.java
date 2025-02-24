package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import o.setOnDismissListener;
/* loaded from: classes-dex2jar.jar:o/setTextAppearance.class */
public class setTextAppearance extends setOnDismissListener implements SubMenu {
    public setOnDismissListener q;
    private setExpandActivityOverflowButtonDrawable r;

    public setTextAppearance(Context context, setOnDismissListener setondismisslistener, setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        super(context);
        this.q = setondismisslistener;
        this.r = setexpandactivityoverflowbuttondrawable;
    }

    @Override // o.setOnDismissListener
    public final String c() {
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.r;
        int itemId = setexpandactivityoverflowbuttondrawable != null ? setexpandactivityoverflowbuttondrawable.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    @Override // o.setOnDismissListener
    public final boolean c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return this.q.c(setexpandactivityoverflowbuttondrawable);
    }

    @Override // o.setOnDismissListener
    public final setOnDismissListener d() {
        return this.q.d();
    }

    @Override // o.setOnDismissListener
    public final boolean d(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return this.q.d(setexpandactivityoverflowbuttondrawable);
    }

    @Override // o.setOnDismissListener
    public final void e(setOnDismissListener.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.q.e(remoteActionCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setOnDismissListener
    public final boolean e(setOnDismissListener setondismisslistener, MenuItem menuItem) {
        return e(setondismisslistener, menuItem) || this.q.e(setondismisslistener, menuItem);
    }

    @Override // o.setOnDismissListener
    public final boolean f() {
        return this.q.f();
    }

    public final Menu g() {
        return this.q;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.r;
    }

    @Override // o.setOnDismissListener
    public final boolean h() {
        return this.q.h();
    }

    @Override // o.setOnDismissListener
    public final boolean j() {
        return this.q.j();
    }

    @Override // o.setOnDismissListener, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.q.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) a(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) c(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) b(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) d(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) d(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.r.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.r.setIcon(drawable);
        return this;
    }

    @Override // o.setOnDismissListener, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.q.setQwertyMode(z);
    }
}
