package o;

import android.location.Location;
import o.realmGet$resRT;
/* loaded from: classes-dex2jar.jar:o/setStatusKewarganegaraanPenerima.class */
final class setStatusKewarganegaraanPenerima implements realmGet$resRT.IconCompatParcelizer<realmSet$CodewordBankPenerima> {
    final /* synthetic */ Location e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setStatusKewarganegaraanPenerima(setStatusPendudukPenerima setstatuspendudukpenerima, Location location) {
        this.e = location;
    }

    @Override // o.realmGet$resRT.IconCompatParcelizer
    public final /* synthetic */ void a(realmSet$CodewordBankPenerima realmset_codewordbankpenerima) {
        realmset_codewordbankpenerima.e(this.e);
    }

    @Override // o.realmGet$resRT.IconCompatParcelizer
    public final void d() {
    }
}
