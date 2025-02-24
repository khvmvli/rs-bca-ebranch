package o;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setProdukRekomendasi.class */
public final class setProdukRekomendasi extends realmSet$typeOfProduct {
    final /* synthetic */ realmSet$NegaraTujuanTransaksi c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setProdukRekomendasi(setNominalTransaksi setnominaltransaksi, realmSet$NegaraTujuanTransaksi realmset_negaratujuantransaksi) {
        this.c = realmset_negaratujuantransaksi;
    }

    @Override // o.setBeritaTransaksi
    public final void b(realmSet$StatusPendudukPenerima realmset_statuspendudukpenerima) throws RemoteException {
        this.c.a(new realmSet$NegaraTujuanPenerimaISO(realmset_statuspendudukpenerima));
    }
}
