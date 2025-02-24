package o;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/setScale.class */
public final class setScale implements onFormSuccess<Integer> {
    public static final setScale a = new setScale();

    private setScale() {
    }

    @Override // o.onFormSuccess
    public final /* synthetic */ Integer e(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        return Integer.valueOf(Math.round(onBatalTransaksiOrReservasiEvent.b(onclickubahcabang) * f));
    }
}
