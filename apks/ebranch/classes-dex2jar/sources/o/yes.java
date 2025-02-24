package o;

import java.io.IOException;
import o.setSnap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/yes.class */
public final class yes {
    private static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver b = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setSnap d(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        String str = null;
        setSnap.write write = null;
        ImmutableList immutableList = null;
        ImmutableList immutableList2 = null;
        ImmutableList immutableList3 = null;
        boolean z = false;
        while (onclickubahcabang.i()) {
            int a = onclickubahcabang.a(b);
            if (a == 0) {
                immutableList = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
            } else if (a == 1) {
                immutableList2 = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
            } else if (a == 2) {
                immutableList3 = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
            } else if (a == 3) {
                str = onclickubahcabang.k();
            } else if (a == 4) {
                write = setSnap.write.a(onclickubahcabang.j());
            } else if (a != 5) {
                onclickubahcabang.m();
            } else {
                z = onclickubahcabang.g();
            }
        }
        return new setSnap(str, write, immutableList, immutableList2, immutableList3, z);
    }
}
