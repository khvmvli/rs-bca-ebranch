package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import o.onCreateDialog;
/* loaded from: classes-dex2jar.jar:o/setProvider.class */
public final class setProvider extends setOverflowIcon implements MenuItem {
    private final setDrawerElevation a;
    private Method e;

    /* loaded from: classes-dex2jar.jar:o/setProvider$IconCompatParcelizer.class */
    final class IconCompatParcelizer implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener b;

        IconCompatParcelizer(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            setProvider.this = r4;
            this.b = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.b.onMenuItemClick(setProvider.this.b(menuItem));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setProvider$RemoteActionCompatParcelizer.class */
    final class RemoteActionCompatParcelizer implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener e;

        RemoteActionCompatParcelizer(MenuItem.OnActionExpandListener onActionExpandListener) {
            setProvider.this = r4;
            this.e = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.e.onMenuItemActionCollapse(setProvider.this.b(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.e.onMenuItemActionExpand(setProvider.this.b(menuItem));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setProvider$read.class */
    class read extends setProvider$MediaBrowserCompat$CustomActionResultReceiver implements ActionProvider.VisibilityListener {
        private onCreateDialog.write e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(Context context, ActionProvider actionProvider) {
            super(r6, context, actionProvider);
            setProvider.this = r6;
        }

        @Override // o.onCreateDialog
        public boolean a() {
            return this.b.isVisible();
        }

        @Override // o.onCreateDialog
        public void c(onCreateDialog.write write) {
            this.e = write;
            this.b.setVisibilityListener(write != null ? this : null);
        }

        @Override // o.onCreateDialog
        public View d(MenuItem menuItem) {
            return this.b.onCreateActionView(menuItem);
        }

        @Override // o.onCreateDialog
        public boolean e() {
            return this.b.overridesItemVisibility();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            onCreateDialog.write write = this.e;
            if (write != null) {
                write.c();
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setProvider$write.class */
    static final class write extends FrameLayout implements setMenu {
        final CollapsibleActionView c;

        write(View view) {
            super(view.getContext());
            this.c = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // o.setMenu
        public final void c() {
            this.c.onActionViewCollapsed();
        }

        @Override // o.setMenu
        public final void e() {
            this.c.onActionViewExpanded();
        }
    }

    public setProvider(Context context, setDrawerElevation setdrawerelevation) {
        super(context);
        if (setdrawerelevation != null) {
            this.a = setdrawerelevation;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final void b(boolean z) {
        try {
            if (this.e == null) {
                this.e = this.a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.e.invoke(this.a, Boolean.TRUE);
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.a.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.a.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        onCreateDialog b = this.a.b();
        if (b instanceof setProvider$MediaBrowserCompat$CustomActionResultReceiver) {
            return ((setProvider$MediaBrowserCompat$CustomActionResultReceiver) b).b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.a.getActionView();
        View view = actionView;
        if (actionView instanceof write) {
            view = (View) ((write) actionView).c;
        }
        return view;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.a.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.a.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.a.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.a.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.a.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.a.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.a.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.a.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.a.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.a.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.a.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.a.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.a.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return e(this.a.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.a.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.a.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.a.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.a.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.a.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.a.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.a.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        read read2 = new read(this.b, actionProvider);
        setDrawerElevation setdrawerelevation = this.a;
        if (actionProvider == null) {
            read2 = null;
        }
        setdrawerelevation.c(read2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        this.a.setActionView(i);
        View actionView = this.a.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.a.setActionView(new write(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        View view2 = view;
        if (view instanceof CollapsibleActionView) {
            view2 = new write(view);
        }
        this.a.setActionView(view2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.a.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.a.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.a.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.a.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.a.b(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.a.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.a.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.a.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.a.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.a.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.a.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.a.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.a.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a.setOnActionExpandListener(onActionExpandListener != null ? new RemoteActionCompatParcelizer(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a.setOnMenuItemClickListener(onMenuItemClickListener != null ? new IconCompatParcelizer(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.a.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.a.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.a.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.a.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.a.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.a.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.a.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.a.a(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.a.setVisible(z);
    }
}
