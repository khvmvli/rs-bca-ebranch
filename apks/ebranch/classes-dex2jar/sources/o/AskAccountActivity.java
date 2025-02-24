package o;

import android.graphics.PointF;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/AskAccountActivity.class */
public final class AskAccountActivity {
    private static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver a = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static findOptionalViewAsType b(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        String str = null;
        ListenerMethod<PointF, PointF> listenerMethod = null;
        DebouncingOnClickListener$$ExternalSyntheticLambda0 debouncingOnClickListener$$ExternalSyntheticLambda0 = null;
        ImmutableList immutableList = null;
        boolean z = false;
        while (onclickubahcabang.i()) {
            int a2 = onclickubahcabang.a(a);
            if (a2 == 0) {
                str = onclickubahcabang.k();
            } else if (a2 == 1) {
                listenerMethod = setImageAssetDelegate.a(onclickubahcabang, bindAnim);
            } else if (a2 == 2) {
                debouncingOnClickListener$$ExternalSyntheticLambda0 = new DebouncingOnClickListener$$ExternalSyntheticLambda0(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), AktivasiMBCAKlikBCAActivity.a, true));
            } else if (a2 == 3) {
                immutableList = setMinAndMaxProgress.c(onclickubahcabang, bindAnim);
            } else if (a2 != 4) {
                onclickubahcabang.m();
            } else {
                z = onclickubahcabang.g();
            }
        }
        return new findOptionalViewAsType(str, listenerMethod, debouncingOnClickListener$$ExternalSyntheticLambda0, immutableList, z);
    }
}
