package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
/* loaded from: classes-dex2jar.jar:o/setShowsDialog.class */
public final class setShowsDialog {
    public static void a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof setDrawerElevation) {
            ((setDrawerElevation) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    public static void a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof setDrawerElevation) {
            ((setDrawerElevation) menuItem).b(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void b(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof setDrawerElevation) {
            ((setDrawerElevation) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static void d(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof setDrawerElevation) {
            ((setDrawerElevation) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    public static void d(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof setDrawerElevation) {
            ((setDrawerElevation) menuItem).a(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    public static MenuItem e(MenuItem menuItem, onCreateDialog oncreatedialog) {
        if (menuItem instanceof setDrawerElevation) {
            return ((setDrawerElevation) menuItem).c(oncreatedialog);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void e(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof setDrawerElevation) {
            ((setDrawerElevation) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }
}
