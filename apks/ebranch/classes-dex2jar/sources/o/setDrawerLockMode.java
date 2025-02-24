package o;

import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes-dex2jar.jar:o/setDrawerLockMode.class */
final class setDrawerLockMode implements setScrimColor {
    private final LocaleList a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setDrawerLockMode(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // o.setScrimColor
    public final Object d() {
        return this.a;
    }

    @Override // o.setScrimColor
    public final Locale d(int i) {
        return this.a.get(i);
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((setScrimColor) obj).d());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
