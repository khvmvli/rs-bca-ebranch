package o;

import com.google.android.gms.location.LocationAvailability;
import o.realmGet$resRT;
/* loaded from: classes-dex2jar.jar:o/setNorekPenerima.class */
final class setNorekPenerima implements realmGet$resRT.IconCompatParcelizer<realmSet$BeritaTransaksi> {
    final /* synthetic */ LocationAvailability c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNorekPenerima(setTipeNasabahPenerimaId settipenasabahpenerimaid, LocationAvailability locationAvailability) {
        this.c = locationAvailability;
    }

    @Override // o.realmGet$resRT.IconCompatParcelizer
    public final /* synthetic */ void a(realmSet$BeritaTransaksi realmset_beritatransaksi) {
        realmset_beritatransaksi.e(this.c);
    }

    @Override // o.realmGet$resRT.IconCompatParcelizer
    public final void d() {
    }
}
