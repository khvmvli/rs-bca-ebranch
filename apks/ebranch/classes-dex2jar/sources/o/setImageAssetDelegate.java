package o;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import o.R;
import o.onClickUbahCabang;
/* loaded from: classes-dex2jar.jar:o/setImageAssetDelegate.class */
public final class setImageAssetDelegate {
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver a = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("k", "x", "y");

    public static ListenerMethod<PointF, PointF> a(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        onclickubahcabang.d();
        contains contains = null;
        ImmutableList immutableList = null;
        ImmutableList immutableList2 = null;
        boolean z = false;
        while (onclickubahcabang.n() != onClickUbahCabang.RemoteActionCompatParcelizer.END_OBJECT) {
            int a2 = onclickubahcabang.a(a);
            if (a2 == 0) {
                contains = c(onclickubahcabang, bindAnim);
            } else if (a2 != 1) {
                if (a2 != 2) {
                    onclickubahcabang.l();
                    onclickubahcabang.m();
                } else if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.STRING) {
                    onclickubahcabang.m();
                    z = true;
                } else {
                    immutableList2 = new ImmutableList(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), setRenderMode.a, false));
                }
            } else if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.STRING) {
                onclickubahcabang.m();
                z = true;
            } else {
                immutableList = new ImmutableList(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), setRenderMode.a, false));
            }
        }
        onclickubahcabang.b();
        if (z) {
            AvailableBookingTimeActivity_ViewBinding.b("Lottie doesn't support expressions.");
            bindAnim.m.add("Lottie doesn't support expressions.");
        }
        return contains != null ? contains : new method(immutableList, immutableList2);
    }

    public static contains c(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_ARRAY) {
            onclickubahcabang.e();
            while (onclickubahcabang.i()) {
                arrayList.add(new R.color(bindAnim, showDetail.c(onclickubahcabang, bindAnim, copyNoRef.d(), zoomQRCode.b, onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_OBJECT, false)));
            }
            onclickubahcabang.a();
            saveQRCode.a(arrayList);
        } else {
            arrayList.add(new onClickBcaKlikpay(onBatalTransaksiOrReservasiEvent.c(onclickubahcabang, copyNoRef.d())));
        }
        return new contains(arrayList);
    }
}
