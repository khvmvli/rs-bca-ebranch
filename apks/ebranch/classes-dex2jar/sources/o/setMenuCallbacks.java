package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setMenuCallbacks.class */
public final class setMenuCallbacks implements setDrawerElevation {
    private CharSequence b;
    private Context c;
    private MenuItem.OnMenuItemClickListener d;
    private Drawable f;
    private Intent k;
    private char n;
    private CharSequence p;
    private char q;
    private CharSequence r;
    private CharSequence s;
    private int t = 4096;
    private int m = 4096;
    private ColorStateList g = null;
    private PorterDuff.Mode h = null;
    private boolean i = false;
    private boolean j = false;
    private int a = 16;
    private final int l = 16908332;
    private final int e = 0;

    /* renamed from: o  reason: collision with root package name */
    private final int f244o = 0;

    public setMenuCallbacks(Context context, int i, int i2, int i3, CharSequence charSequence) {
        this.c = context;
        this.p = charSequence;
    }

    private void c() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return;
        }
        if (this.i || this.j) {
            Drawable h = getInsetsForType.h(drawable);
            this.f = h;
            Drawable mutate = h.mutate();
            this.f = mutate;
            if (this.i) {
                getInsetsForType.e(mutate, this.g);
            }
            if (this.j) {
                getInsetsForType.d(this.f, this.h);
            }
        }
    }

    @Override // o.setDrawerElevation
    public final setDrawerElevation a(CharSequence charSequence) {
        this.s = charSequence;
        return this;
    }

    @Override // o.setDrawerElevation
    public final onCreateDialog b() {
        return null;
    }

    @Override // o.setDrawerElevation
    public final setDrawerElevation b(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // o.setDrawerElevation
    public final setDrawerElevation c(onCreateDialog oncreatedialog) {
        throw new UnsupportedOperationException();
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.n;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.g;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f244o;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.r;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = this.p;
        }
        return charSequence2;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.s;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        boolean z = true;
        if ((this.a & 1) == 0) {
            z = false;
        }
        return z;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.a & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.a & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.a & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.n = Character.toLowerCase(c);
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.n = Character.toLowerCase(c);
        this.m = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.a = (z ? 1 : 0) | (this.a & -2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.a = (z ? 2 : 0) | (this.a & -3);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.a = (z ? 16 : 0) | (this.a & -17);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f = copyWindowDataInto.b(this.c, i);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f = drawable;
        c();
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        c();
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.k = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.q = (char) c;
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.q = (char) c;
        this.t = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.d = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.q = (char) c;
        this.n = Character.toLowerCase(c2);
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.q = (char) c;
        this.t = KeyEvent.normalizeMetaState(i);
        this.n = Character.toLowerCase(c2);
        this.m = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.p = this.c.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.r = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.a = (z ? 0 : 8) | (this.a & 8);
        return this;
    }
}
