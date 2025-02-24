package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setAutoSizeTextTypeUniformWithConfiguration.class */
final class setAutoSizeTextTypeUniformWithConfiguration extends setSupportBackgroundTintList implements SubMenu {
    private final setChildInsets e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAutoSizeTextTypeUniformWithConfiguration(Context context, setChildInsets setchildinsets) {
        super(context, setchildinsets);
        this.e = setchildinsets;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return b(this.e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }
}
