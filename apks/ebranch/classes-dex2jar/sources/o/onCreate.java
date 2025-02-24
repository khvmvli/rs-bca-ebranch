package o;

import android.text.TextUtils;
import java.util.Locale;
/* loaded from: classes-dex2jar.jar:o/onCreate.class */
public final class onCreate {
    private static final Locale b = new Locale("", "");

    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
