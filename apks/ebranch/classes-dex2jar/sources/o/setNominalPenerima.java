package o;

import com.google.android.gms.location.LocationResult;
import o.realmGet$resRT;
/* loaded from: classes-dex2jar.jar:o/setNominalPenerima.class */
final class setNominalPenerima implements realmGet$resRT.IconCompatParcelizer<realmSet$BeritaTransaksi> {
    final /* synthetic */ LocationResult e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNominalPenerima(setTipeNasabahPenerimaId settipenasabahpenerimaid, LocationResult locationResult) {
        this.e = locationResult;
    }

    @Override // o.realmGet$resRT.IconCompatParcelizer
    public final /* synthetic */ void a(realmSet$BeritaTransaksi realmset_beritatransaksi) {
        realmset_beritatransaksi.e(this.e);
    }

    @Override // o.realmGet$resRT.IconCompatParcelizer
    public final void d() {
    }
}
