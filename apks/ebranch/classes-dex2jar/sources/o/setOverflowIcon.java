package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
/* loaded from: classes-dex2jar.jar:o/setOverflowIcon.class */
public abstract class setOverflowIcon {
    final Context b;
    private setCollapseIcon<setDrawerElevation, MenuItem> d;
    private setCollapseIcon<setChildInsets, SubMenu> e;

    public setOverflowIcon(Context context) {
        this.b = context;
    }

    final void a() {
        setCollapseIcon<setDrawerElevation, MenuItem> setcollapseicon = this.d;
        if (setcollapseicon != null) {
            setcollapseicon.clear();
        }
        setCollapseIcon<setChildInsets, SubMenu> setcollapseicon2 = this.e;
        if (setcollapseicon2 != null) {
            setcollapseicon2.clear();
        }
    }

    final void a(int i) {
        if (this.d != null) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                if (((setDrawerElevation) this.d.h[i2 << 1]).getItemId() == i) {
                    this.d.b(i2);
                    return;
                }
            }
        }
    }

    final MenuItem b(MenuItem menuItem) {
        MenuItem menuItem2 = menuItem;
        if (menuItem instanceof setDrawerElevation) {
            setDrawerElevation setdrawerelevation = (setDrawerElevation) menuItem;
            if (this.d == null) {
                this.d = new setCollapseIcon<>();
            }
            MenuItem menuItem3 = this.d.get(menuItem);
            menuItem2 = menuItem3;
            if (menuItem3 == null) {
                menuItem2 = new setProvider(this.b, setdrawerelevation);
                this.d.put(setdrawerelevation, menuItem2);
            }
        }
        return menuItem2;
    }

    final void c(int i) {
        if (this.d != null) {
            int i2 = 0;
            while (i2 < this.d.size()) {
                int i3 = i2;
                if (((setDrawerElevation) this.d.h[i2 << 1]).getGroupId() == i) {
                    this.d.b(i2);
                    i3 = i2 - 1;
                }
                i2 = i3 + 1;
            }
        }
    }

    final SubMenu e(SubMenu subMenu) {
        if (!(subMenu instanceof setChildInsets)) {
            return subMenu;
        }
        setChildInsets setchildinsets = (setChildInsets) subMenu;
        if (this.e == null) {
            this.e = new setCollapseIcon<>();
        }
        SubMenu subMenu2 = this.e.get(setchildinsets);
        SubMenu subMenu3 = subMenu2;
        if (subMenu2 == null) {
            subMenu3 = new setAutoSizeTextTypeUniformWithConfiguration(this.b, setchildinsets);
            this.e.put(setchildinsets, subMenu3);
        }
        return subMenu3;
    }
}
