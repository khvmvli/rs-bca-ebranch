package o;

import android.location.Location;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setStatusPendudukPenerima.class */
public final class setStatusPendudukPenerima extends realmSet$FlagUpdateDaftarTransferPenerima {
    private final realmGet$resRT<realmSet$CodewordBankPenerima> c;

    public setStatusPendudukPenerima(realmGet$resRT<realmSet$CodewordBankPenerima> realmget_resrt) {
        this.c = realmget_resrt;
    }

    @Override // o.realmSet$FlagValueTodayTransaksi
    public final void c(Location location) {
        synchronized (this) {
            this.c.e(new setStatusKewarganegaraanPenerima(this, location));
        }
    }
}
