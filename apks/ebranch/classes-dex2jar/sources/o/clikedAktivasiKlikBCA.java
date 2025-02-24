package o;

import java.io.IOException;
import o.onClickUbahCabang;
/* loaded from: classes-dex2jar.jar:o/clikedAktivasiKlikBCA.class */
public final class clikedAktivasiKlikBCA implements onFormSuccess<BN6PembayaranTundaActivity_ViewBinding> {
    public static final clikedAktivasiKlikBCA a = new clikedAktivasiKlikBCA();

    private clikedAktivasiKlikBCA() {
    }

    @Override // o.onFormSuccess
    public final /* synthetic */ BN6PembayaranTundaActivity_ViewBinding e(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        boolean z = onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_ARRAY;
        if (z) {
            onclickubahcabang.e();
        }
        float h = (float) onclickubahcabang.h();
        float h2 = (float) onclickubahcabang.h();
        while (onclickubahcabang.i()) {
            onclickubahcabang.m();
        }
        if (z) {
            onclickubahcabang.a();
        }
        return new BN6PembayaranTundaActivity_ViewBinding((h / 100.0f) * f, (h2 / 100.0f) * f);
    }
}
