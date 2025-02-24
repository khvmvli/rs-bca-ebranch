package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import o.onCreateDialog;
/* loaded from: classes-dex2jar.jar:o/setExpandActivityOverflowButtonDrawable.class */
public final class setExpandActivityOverflowButtonDrawable implements setDrawerElevation {
    private MenuItem.OnActionExpandListener A;
    private Runnable B;
    private CharSequence C;
    private CharSequence D;
    private CharSequence F;
    public setOnDismissListener a;
    public onCreateDialog c;
    ContextMenu.ContextMenuInfo e;
    char f;
    char g;
    final int j;
    private View k;
    public setTextAppearance l;
    private final int m;
    private MenuItem.OnMenuItemClickListener n;

    /* renamed from: o */
    public int f225o;
    private final int q;
    private CharSequence s;
    private Drawable t;
    private final int u;
    private Intent x;
    int h = 4096;
    int i = 4096;
    private int y = 0;
    private ColorStateList v = null;
    private PorterDuff.Mode w = null;
    private boolean r = false;
    private boolean p = false;
    private boolean z = false;
    public int b = 16;
    public boolean d = false;

    public setExpandActivityOverflowButtonDrawable(setOnDismissListener setondismisslistener, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.a = setondismisslistener;
        this.u = i2;
        this.q = i;
        this.m = i3;
        this.j = i4;
        this.D = charSequence;
        this.f225o = i5;
    }

    /* renamed from: a */
    public setDrawerElevation setActionView(View view) {
        int i;
        this.k = view;
        this.c = null;
        if (view != null && view.getId() == -1 && (i = this.u) > 0) {
            view.setId(i);
        }
        setOnDismissListener setondismisslistener = this.a;
        setondismisslistener.i = true;
        setondismisslistener.e(true);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r3.p != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private android.graphics.drawable.Drawable b(android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L_0x004a
            r0 = r4
            r5 = r0
            r0 = r3
            boolean r0 = r0.z
            if (r0 == 0) goto L_0x004a
            r0 = r3
            boolean r0 = r0.r
            if (r0 != 0) goto L_0x001f
            r0 = r4
            r5 = r0
            r0 = r3
            boolean r0 = r0.p
            if (r0 == 0) goto L_0x004a
        L_0x001f:
            r0 = r4
            android.graphics.drawable.Drawable r0 = o.getInsetsForType.h(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r5 = r0
            r0 = r3
            boolean r0 = r0.r
            if (r0 == 0) goto L_0x0036
            r0 = r5
            r1 = r3
            android.content.res.ColorStateList r1 = r1.v
            o.getInsetsForType.e(r0, r1)
        L_0x0036:
            r0 = r3
            boolean r0 = r0.p
            if (r0 == 0) goto L_0x0045
            r0 = r5
            r1 = r3
            android.graphics.PorterDuff$Mode r1 = r1.w
            o.getInsetsForType.d(r0, r1)
        L_0x0045:
            r0 = r3
            r1 = 0
            r0.z = r1
        L_0x004a:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExpandActivityOverflowButtonDrawable.b(android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    @Override // o.setDrawerElevation
    public final setDrawerElevation a(CharSequence charSequence) {
        this.F = charSequence;
        this.a.e(false);
        return this;
    }

    public final boolean a() {
        onCreateDialog oncreatedialog;
        boolean z = false;
        if ((this.f225o & 8) != 0) {
            if (this.k == null && (oncreatedialog = this.c) != null) {
                this.k = oncreatedialog.d(this);
            }
            z = false;
            if (this.k != null) {
                z = true;
            }
        }
        return z;
    }

    @Override // o.setDrawerElevation
    public final onCreateDialog b() {
        return this.c;
    }

    @Override // o.setDrawerElevation
    public final setDrawerElevation b(CharSequence charSequence) {
        this.s = charSequence;
        this.a.e(false);
        return this;
    }

    @Override // o.setDrawerElevation
    public final setDrawerElevation c(onCreateDialog oncreatedialog) {
        onCreateDialog oncreatedialog2 = this.c;
        if (oncreatedialog2 != null) {
            oncreatedialog2.f();
        }
        this.k = null;
        this.c = oncreatedialog;
        this.a.e(true);
        onCreateDialog oncreatedialog3 = this.c;
        if (oncreatedialog3 != null) {
            oncreatedialog3.c(new onCreateDialog.write() { // from class: o.setExpandActivityOverflowButtonDrawable.5
                @Override // o.onCreateDialog.write
                public final void c() {
                    setOnDismissListener setondismisslistener = setExpandActivityOverflowButtonDrawable.this.a;
                    setondismisslistener.f = true;
                    setondismisslistener.e(true);
                }
            });
        }
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f225o & 8) == 0) {
            return false;
        }
        if (this.k == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.a.d(this);
        }
        return false;
    }

    final void d(boolean z) {
        int i = this.b;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.b = i2;
        if (i != i2) {
            this.a.e(false);
        }
    }

    public final boolean e() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.n;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        setOnDismissListener setondismisslistener = this.a;
        if (setondismisslistener.e(setondismisslistener, this)) {
            return true;
        }
        Runnable runnable = this.B;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.x != null) {
            try {
                this.a.e.startActivity(this.x);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        onCreateDialog oncreatedialog = this.c;
        return oncreatedialog != null && oncreatedialog.c();
    }

    public final boolean e(boolean z) {
        int i = this.b;
        boolean z2 = false;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.b = i2;
        if (i != i2) {
            z2 = true;
        }
        return z2;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final boolean expandActionView() {
        if (!a()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.a.c(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final View getActionView() {
        View view = this.k;
        if (view != null) {
            return view;
        }
        onCreateDialog oncreatedialog = this.c;
        if (oncreatedialog == null) {
            return null;
        }
        View d = oncreatedialog.d(this);
        this.k = d;
        return d;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.g;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.s;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.t;
        if (drawable != null) {
            return b(drawable);
        }
        if (this.y == 0) {
            return null;
        }
        Drawable c = setPrimaryBackground.c(this.a.e, this.y);
        this.y = 0;
        this.t = c;
        return b(c);
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.v;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.w;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.x;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.e;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.l;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.C;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = this.D;
        }
        return charSequence2;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.F;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.l != null;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        boolean z = true;
        if ((this.b & 1) != 1) {
            z = false;
        }
        return z;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.b & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.b & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        onCreateDialog oncreatedialog = this.c;
        boolean z = false;
        if (oncreatedialog == null || !oncreatedialog.e()) {
            if ((this.b & 8) == 0) {
                z = true;
            }
            return z;
        }
        boolean z2 = false;
        if ((this.b & 8) == 0) {
            z2 = this.c.a();
        }
        return z2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.a.e;
        setActionView(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.g == c) {
            return this;
        }
        this.g = Character.toLowerCase(c);
        this.a.e(false);
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.g == c && this.i == i) {
            return this;
        }
        this.g = Character.toLowerCase(c);
        this.i = KeyEvent.normalizeMetaState(i);
        this.a.e(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.b;
        int i2 = (z ? 1 : 0) | (i & -2);
        this.b = i2;
        if (i != i2) {
            this.a.e(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.b & 4) != 0) {
            setOnDismissListener setondismisslistener = this.a;
            int groupId = getGroupId();
            int size = setondismisslistener.m.size();
            if (!setondismisslistener.p) {
                setondismisslistener.p = true;
                setondismisslistener.n = false;
                setondismisslistener.t = false;
            }
            for (int i = 0; i < size; i++) {
                setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = setondismisslistener.m.get(i);
                if (setexpandactivityoverflowbuttondrawable.getGroupId() == groupId) {
                    if (((setexpandactivityoverflowbuttondrawable.b & 4) != 0) && setexpandactivityoverflowbuttondrawable.isCheckable()) {
                        setexpandactivityoverflowbuttondrawable.d(setexpandactivityoverflowbuttondrawable == this);
                    }
                }
            }
            setondismisslistener.p = false;
            if (setondismisslistener.n) {
                setondismisslistener.n = false;
                setondismisslistener.e(setondismisslistener.t);
            }
        } else {
            d(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.s = charSequence;
        this.a.e(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.b |= 16;
        } else {
            this.b &= -17;
        }
        this.a.e(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.t = null;
        this.y = i;
        this.z = true;
        this.a.e(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.y = 0;
        this.t = drawable;
        this.z = true;
        this.a.e(false);
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.v = colorStateList;
        this.r = true;
        this.z = true;
        this.a.e(false);
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.w = mode;
        this.p = true;
        this.z = true;
        this.a.e(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.x = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f == c) {
            return this;
        }
        this.f = (char) c;
        this.a.e(false);
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f == c && this.h == i) {
            return this;
        }
        this.f = (char) c;
        this.h = KeyEvent.normalizeMetaState(i);
        this.a.e(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.n = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f = (char) c;
        this.g = Character.toLowerCase(c2);
        this.a.e(false);
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f = (char) c;
        this.h = KeyEvent.normalizeMetaState(i);
        this.g = Character.toLowerCase(c2);
        this.i = KeyEvent.normalizeMetaState(i2);
        this.a.e(false);
        return this;
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f225o = i;
            setOnDismissListener setondismisslistener = this.a;
            setondismisslistener.i = true;
            setondismisslistener.e(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // o.setDrawerElevation, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        return setTitle(this.a.e.getString(i));
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.D = charSequence;
        this.a.e(false);
        setTextAppearance settextappearance = this.l;
        if (settextappearance != null) {
            settextappearance.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.C = charSequence;
        this.a.e(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.F = charSequence;
        this.a.e(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (e(z)) {
            setOnDismissListener setondismisslistener = this.a;
            setondismisslistener.f = true;
            setondismisslistener.e(true);
        }
        return this;
    }

    @Override // java.lang.Object
    public final String toString() {
        CharSequence charSequence = this.D;
        return charSequence != null ? charSequence.toString() : null;
    }
}
