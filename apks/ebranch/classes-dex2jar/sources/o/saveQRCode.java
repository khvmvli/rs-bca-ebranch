package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.R;
import o.onClickUbahCabang;
/* loaded from: classes-dex2jar.jar:o/saveQRCode.class */
public final class saveQRCode {
    static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver c = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("k");

    public static <T> void a(List<? extends onClickBcaKlikpay<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            onClickBcaKlikpay onclickbcaklikpay = (onClickBcaKlikpay) list.get(i2);
            int i3 = i2 + 1;
            onClickBcaKlikpay onclickbcaklikpay2 = (onClickBcaKlikpay) list.get(i3);
            onclickbcaklikpay.b = Float.valueOf(onclickbcaklikpay2.j);
            i2 = i3;
            if (onclickbcaklikpay.e == null) {
                i2 = i3;
                if (onclickbcaklikpay2.h != null) {
                    onclickbcaklikpay.e = onclickbcaklikpay2.h;
                    i2 = i3;
                    if (onclickbcaklikpay instanceof R.color) {
                        ((R.color) onclickbcaklikpay).d();
                        i2 = i3;
                    }
                }
            }
        }
        onClickBcaKlikpay onclickbcaklikpay3 = (onClickBcaKlikpay) list.get(i);
        if ((onclickbcaklikpay3.h == null || onclickbcaklikpay3.e == null) && list.size() > 1) {
            list.remove(onclickbcaklikpay3);
        }
    }

    public static <T> List<onClickBcaKlikpay<T>> d(onClickUbahCabang onclickubahcabang, BindAnim bindAnim, float f, onFormSuccess<T> onformsuccess, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.STRING) {
            AvailableBookingTimeActivity_ViewBinding.b("Lottie doesn't support expressions.");
            bindAnim.m.add("Lottie doesn't support expressions.");
            return arrayList;
        }
        onclickubahcabang.d();
        while (onclickubahcabang.i()) {
            if (onclickubahcabang.a(c) != 0) {
                onclickubahcabang.m();
            } else if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_ARRAY) {
                onclickubahcabang.e();
                if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER) {
                    arrayList.add(showDetail.c(onclickubahcabang, bindAnim, f, onformsuccess, false, z));
                } else {
                    while (onclickubahcabang.i()) {
                        arrayList.add(showDetail.c(onclickubahcabang, bindAnim, f, onformsuccess, true, z));
                    }
                }
                onclickubahcabang.a();
            } else {
                arrayList.add(showDetail.c(onclickubahcabang, bindAnim, f, onformsuccess, false, z));
            }
        }
        onclickubahcabang.b();
        a(arrayList);
        return arrayList;
    }
}
