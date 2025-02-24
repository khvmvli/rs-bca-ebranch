package o;

import android.graphics.PointF;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/zoomQRCode.class */
public final class zoomQRCode implements onFormSuccess<PointF> {
    public static final zoomQRCode b = new zoomQRCode();

    private zoomQRCode() {
    }

    @Override // o.onFormSuccess
    public final /* synthetic */ PointF e(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        return onBatalTransaksiOrReservasiEvent.c(onclickubahcabang, f);
    }
}
