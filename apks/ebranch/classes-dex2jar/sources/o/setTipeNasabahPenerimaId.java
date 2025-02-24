package o;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setTipeNasabahPenerimaId.class */
public final class setTipeNasabahPenerimaId extends realmSet$FlagPromoCode {
    private final realmGet$resRT<realmSet$BeritaTransaksi> c;

    @Override // o.realmSet$FlagKodeAutoCompletePenerima
    public final void b(LocationResult locationResult) {
        this.c.e(new setNominalPenerima(this, locationResult));
    }

    @Override // o.realmSet$FlagKodeAutoCompletePenerima
    public final void e(LocationAvailability locationAvailability) {
        this.c.e(new setNorekPenerima(this, locationAvailability));
    }
}
