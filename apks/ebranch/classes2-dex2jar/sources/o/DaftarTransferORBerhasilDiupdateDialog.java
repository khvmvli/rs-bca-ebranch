package o;

import android.content.Context;
import android.util.TypedValue;
/* loaded from: classes2-dex2jar.jar:o/DaftarTransferORBerhasilDiupdateDialog.class */
public final class DaftarTransferORBerhasilDiupdateDialog {
    public static int d(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue : null;
        return typedValue2 != null ? typedValue2.data : i2;
    }
}
