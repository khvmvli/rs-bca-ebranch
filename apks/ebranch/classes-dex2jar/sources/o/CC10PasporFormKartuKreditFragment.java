package o;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* loaded from: classes-dex2jar.jar:o/CC10PasporFormKartuKreditFragment.class */
public final class CC10PasporFormKartuKreditFragment {
    private static String a(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        StringBuilder sb = new StringBuilder("Unknown DateFormat style: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String e(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        StringBuilder sb = new StringBuilder("Unknown DateFormat style: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static DateFormat e(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(i));
        sb.append(" ");
        sb.append(e(i2));
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }
}
