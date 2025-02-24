package o;

import android.graphics.Path;
import java.io.IOException;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/AktivasiEChannelSuccessActivity.class */
public final class AktivasiEChannelSuccessActivity {
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver e = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver d = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static parameters d(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        Path.FillType fillType = Path.FillType.WINDING;
        size size = null;
        String str = null;
        DebouncingOnClickListener$$ExternalSyntheticLambda0 debouncingOnClickListener$$ExternalSyntheticLambda0 = null;
        DebouncingOnClickListener$$ExternalSyntheticLambda0 debouncingOnClickListener$$ExternalSyntheticLambda02 = null;
        boolean z = false;
        get get = null;
        returnType returntype = null;
        while (onclickubahcabang.i()) {
            switch (onclickubahcabang.a(e)) {
                case 0:
                    str = onclickubahcabang.k();
                    break;
                case 1:
                    onclickubahcabang.d();
                    int i = -1;
                    while (onclickubahcabang.i()) {
                        int a = onclickubahcabang.a(d);
                        if (a == 0) {
                            i = onclickubahcabang.j();
                        } else if (a != 1) {
                            onclickubahcabang.l();
                            onclickubahcabang.m();
                        } else {
                            get = setMinAndMaxProgress.b(onclickubahcabang, bindAnim, i);
                        }
                    }
                    onclickubahcabang.b();
                    break;
                case 2:
                    size = new size(saveQRCode.d(onclickubahcabang, bindAnim, 1.0f, setScale.a, false));
                    break;
                case 3:
                    returntype = onclickubahcabang.j() == 1 ? returnType.LINEAR : returnType.RADIAL;
                    break;
                case 4:
                    debouncingOnClickListener$$ExternalSyntheticLambda0 = new DebouncingOnClickListener$$ExternalSyntheticLambda0(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), AktivasiMBCAKlikBCAActivity.a, true));
                    break;
                case 5:
                    debouncingOnClickListener$$ExternalSyntheticLambda02 = new DebouncingOnClickListener$$ExternalSyntheticLambda0(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), AktivasiMBCAKlikBCAActivity.a, true));
                    break;
                case 6:
                    fillType = onclickubahcabang.j() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = onclickubahcabang.g();
                    break;
                default:
                    onclickubahcabang.l();
                    onclickubahcabang.m();
                    break;
            }
        }
        return new parameters(str, returntype, fillType, get, size == null ? new size(Collections.singletonList(new onClickBcaKlikpay(100))) : size, debouncingOnClickListener$$ExternalSyntheticLambda0, debouncingOnClickListener$$ExternalSyntheticLambda02, null, null, z);
    }
}
