package o;

import android.graphics.Path;
import java.io.IOException;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/AktivasiMBCAKlikBCAActivity_ViewBinding.class */
public final class AktivasiMBCAKlikBCAActivity_ViewBinding {
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver a = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static listFilteringNull d(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        size size = null;
        String str = null;
        run run = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (onclickubahcabang.i()) {
            int a2 = onclickubahcabang.a(a);
            if (a2 == 0) {
                str = onclickubahcabang.k();
            } else if (a2 == 1) {
                run = new run(saveQRCode.d(onclickubahcabang, bindAnim, 1.0f, setPerformanceTrackingEnabled.e, false));
            } else if (a2 == 2) {
                size = new size(saveQRCode.d(onclickubahcabang, bindAnim, 1.0f, setScale.a, false));
            } else if (a2 == 3) {
                z = onclickubahcabang.g();
            } else if (a2 == 4) {
                i = onclickubahcabang.j();
            } else if (a2 != 5) {
                onclickubahcabang.l();
                onclickubahcabang.m();
            } else {
                z2 = onclickubahcabang.g();
            }
        }
        size size2 = size;
        if (size == null) {
            size2 = new size(Collections.singletonList(new onClickBcaKlikpay(100)));
        }
        return new listFilteringNull(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, run, size2, z2);
    }
}
