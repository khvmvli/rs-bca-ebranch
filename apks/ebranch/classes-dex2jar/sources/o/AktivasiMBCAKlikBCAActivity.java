package o;

import android.graphics.PointF;
import java.io.IOException;
import o.onClickUbahCabang;
/* loaded from: classes-dex2jar.jar:o/AktivasiMBCAKlikBCAActivity.class */
public final class AktivasiMBCAKlikBCAActivity implements onFormSuccess<PointF> {
    public static final AktivasiMBCAKlikBCAActivity a = new AktivasiMBCAKlikBCAActivity();

    private AktivasiMBCAKlikBCAActivity() {
    }

    @Override // o.onFormSuccess
    public final /* synthetic */ PointF e(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        onClickUbahCabang.RemoteActionCompatParcelizer n = onclickubahcabang.n();
        if (!(n == onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_ARRAY || n == onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_OBJECT)) {
            if (n == onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER) {
                PointF pointF = new PointF(((float) onclickubahcabang.h()) * f, ((float) onclickubahcabang.h()) * f);
                while (onclickubahcabang.i()) {
                    onclickubahcabang.m();
                }
                return pointF;
            }
            StringBuilder sb = new StringBuilder("Cannot convert json to point. Next token is ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        return onBatalTransaksiOrReservasiEvent.c(onclickubahcabang, f);
    }
}
