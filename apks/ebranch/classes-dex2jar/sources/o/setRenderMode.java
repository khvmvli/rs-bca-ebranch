package o;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/setRenderMode.class */
public final class setRenderMode implements onFormSuccess<Float> {
    public static final setRenderMode a = new setRenderMode();

    private setRenderMode() {
    }

    @Override // o.onFormSuccess
    public final /* synthetic */ Float e(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        return Float.valueOf(onBatalTransaksiOrReservasiEvent.b(onclickubahcabang) * f);
    }
}
