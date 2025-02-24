package o;

import android.graphics.PointF;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setMinFrame.class */
public final class setMinFrame {
    private static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver e = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static targetType e(onClickUbahCabang onclickubahcabang, BindAnim bindAnim, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        ListenerMethod<PointF, PointF> listenerMethod = null;
        DebouncingOnClickListener$$ExternalSyntheticLambda0 debouncingOnClickListener$$ExternalSyntheticLambda0 = null;
        boolean z2 = false;
        while (onclickubahcabang.i()) {
            int a = onclickubahcabang.a(e);
            if (a == 0) {
                str = onclickubahcabang.k();
            } else if (a == 1) {
                listenerMethod = setImageAssetDelegate.a(onclickubahcabang, bindAnim);
            } else if (a == 2) {
                debouncingOnClickListener$$ExternalSyntheticLambda0 = new DebouncingOnClickListener$$ExternalSyntheticLambda0(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), AktivasiMBCAKlikBCAActivity.a, true));
            } else if (a == 3) {
                z2 = onclickubahcabang.g();
            } else if (a != 4) {
                onclickubahcabang.l();
                onclickubahcabang.m();
            } else {
                z = onclickubahcabang.j() == 3;
            }
        }
        return new targetType(str, listenerMethod, debouncingOnClickListener$$ExternalSyntheticLambda0, z, z2);
    }
}
