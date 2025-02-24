package o;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/AskAccountActivity_ViewBinding.class */
public final class AskAccountActivity_ViewBinding {
    static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver c = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static getTintedDrawable b(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        String str = null;
        callbacks callbacks = null;
        int i = 0;
        boolean z = false;
        while (onclickubahcabang.i()) {
            int a = onclickubahcabang.a(c);
            if (a == 0) {
                str = onclickubahcabang.k();
            } else if (a == 1) {
                i = onclickubahcabang.j();
            } else if (a == 2) {
                callbacks = new callbacks(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), clikedAktivasiMBCA.b, false));
            } else if (a != 3) {
                onclickubahcabang.m();
            } else {
                z = onclickubahcabang.g();
            }
        }
        return new getTintedDrawable(str, i, callbacks, z);
    }
}
