package o;

import android.app.Dialog;
import android.os.Bundle;
/* loaded from: classes-dex2jar.jar:o/setShortcut.class */
public class setShortcut extends getText {
    @Override // o.getText
    public Dialog onCreateDialog(Bundle bundle) {
        return new setContentHeight(getContext(), getTheme());
    }

    @Override // o.getText
    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof setContentHeight) {
            setContentHeight setcontentheight = (setContentHeight) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            setcontentheight.a(1);
            return;
        }
        setupDialog(dialog, i);
    }
}
