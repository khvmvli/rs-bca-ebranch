package o;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/App.class */
final class App {
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver b = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ViewCollections a(onClickUbahCabang onclickubahcabang) throws IOException {
        onclickubahcabang.d();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (onclickubahcabang.i()) {
            int a = onclickubahcabang.a(b);
            if (a == 0) {
                str = onclickubahcabang.k();
            } else if (a == 1) {
                str2 = onclickubahcabang.k();
            } else if (a == 2) {
                str3 = onclickubahcabang.k();
            } else if (a != 3) {
                onclickubahcabang.l();
                onclickubahcabang.m();
            } else {
                f = (float) onclickubahcabang.h();
            }
        }
        onclickubahcabang.b();
        return new ViewCollections(str, str2, str3, f);
    }
}
