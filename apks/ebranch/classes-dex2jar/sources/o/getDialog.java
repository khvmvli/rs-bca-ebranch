package o;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
/* loaded from: classes-dex2jar.jar:o/getDialog.class */
public final class getDialog {
    public static Spanned c(String str, int i) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, i) : Html.fromHtml(str);
    }
}
