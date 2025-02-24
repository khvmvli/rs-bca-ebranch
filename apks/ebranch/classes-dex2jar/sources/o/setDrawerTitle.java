package o;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes-dex2jar.jar:o/setDrawerTitle.class */
public final class setDrawerTitle {
    private static final setDrawerTitle b = e(new Locale[0]);
    private setScrimColor e;

    private setDrawerTitle(setScrimColor setscrimcolor) {
        this.e = setscrimcolor;
    }

    public static Locale c(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        StringBuilder sb = new StringBuilder("Can not parse language tag: [");
        sb.append(str);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }

    public static setDrawerTitle c(LocaleList localeList) {
        return new setDrawerTitle(new setDrawerLockMode(localeList));
    }

    public static setDrawerTitle e(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? c(new LocaleList(localeArr)) : new setDrawerTitle(new setDrawerListener(localeArr));
    }

    public final Locale d(int i) {
        return this.e.d(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof setDrawerTitle) && this.e.equals(((setDrawerTitle) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e.toString();
    }
}
