package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setDrawerListener.class */
public final class setDrawerListener implements setScrimColor {
    private final Locale[] d;
    private final String h;
    private static final Locale[] e = new Locale[0];
    private static final Locale b = new Locale("en", "XA");
    private static final Locale c = new Locale("ar", "XB");
    private static final Locale a = setDrawerTitle.c("en-Latn");

    /* JADX INFO: Access modifiers changed from: package-private */
    public setDrawerListener(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.d = e;
            this.h = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    a(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("list[");
                sb2.append(i);
                sb2.append("] is null");
                throw new NullPointerException(sb2.toString());
            }
        }
        this.d = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
        this.h = sb.toString();
    }

    static void a(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    @Override // o.setScrimColor
    public final Object d() {
        return null;
    }

    @Override // o.setScrimColor
    public final Locale d(int i) {
        Locale locale;
        if (i >= 0) {
            Locale[] localeArr = this.d;
            if (i < localeArr.length) {
                locale = localeArr[i];
                return locale;
            }
        }
        locale = null;
        return locale;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setDrawerListener)) {
            return false;
        }
        Locale[] localeArr = ((setDrawerListener) obj).d;
        if (this.d.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.d;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.d;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.d;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.d.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
