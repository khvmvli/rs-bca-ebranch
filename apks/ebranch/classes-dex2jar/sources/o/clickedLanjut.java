package o;

import java.io.IOException;
import o.castParam;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/clickedLanjut.class */
public final class clickedLanjut {
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver c = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static castParam b(onClickUbahCabang onclickubahcabang) throws IOException {
        String str = null;
        castParam.IconCompatParcelizer iconCompatParcelizer = null;
        boolean z = false;
        while (onclickubahcabang.i()) {
            int a = onclickubahcabang.a(c);
            if (a == 0) {
                str = onclickubahcabang.k();
            } else if (a == 1) {
                iconCompatParcelizer = castParam.IconCompatParcelizer.b(onclickubahcabang.j());
            } else if (a != 2) {
                onclickubahcabang.l();
                onclickubahcabang.m();
            } else {
                z = onclickubahcabang.g();
            }
        }
        return new castParam(str, iconCompatParcelizer, z);
    }
}
