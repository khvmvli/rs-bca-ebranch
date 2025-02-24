package o;

import android.content.Context;
import android.view.SubMenu;
/* loaded from: classes2-dex2jar.jar:o/FiturReservasiGuestDialog.class */
public final class FiturReservasiGuestDialog extends setOnDismissListener {
    public FiturReservasiGuestDialog(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        setExpandActivityOverflowButtonDrawable b = b(i, i2, i3, charSequence);
        setTextAppearance fullAmountDialog = new FullAmountDialog(b(), this, b);
        b.l = fullAmountDialog;
        fullAmountDialog.setHeaderTitle(b.getTitle());
        return fullAmountDialog;
    }
}
