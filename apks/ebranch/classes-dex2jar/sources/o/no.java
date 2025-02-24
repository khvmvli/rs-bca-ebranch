package o;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/no.class */
public final class no {
    private static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver a = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static castView d(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        String str = null;
        ImmutableList immutableList = null;
        ImmutableList immutableList2 = null;
        type type = null;
        boolean z = false;
        while (onclickubahcabang.i()) {
            int a2 = onclickubahcabang.a(a);
            if (a2 == 0) {
                str = onclickubahcabang.k();
            } else if (a2 == 1) {
                immutableList = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
            } else if (a2 == 2) {
                immutableList2 = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
            } else if (a2 == 3) {
                type = setMinAndMaxFrame.d(onclickubahcabang, bindAnim);
            } else if (a2 != 4) {
                onclickubahcabang.m();
            } else {
                z = onclickubahcabang.g();
            }
        }
        return new castView(str, immutableList, immutableList2, type, z);
    }
}
