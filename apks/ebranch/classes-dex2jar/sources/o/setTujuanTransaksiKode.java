package o;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setTujuanTransaksiKode.class */
public final class setTujuanTransaksiKode extends setCodewordBankPenerima {
    final /* synthetic */ realmSet$NoHpPengirim b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTujuanTransaksiKode(setTypeOfProduct settypeofproduct, realmSet$NoHpPengirim realmset_nohppengirim) {
        this.b = realmset_nohppengirim;
    }

    @Override // o.setFlagAlamatBankPenerimaBelumSesuai
    public final void c(realmSet$TipeTujuanTransaksiPenerima realmset_tipetujuantransaksipenerima) throws RemoteException {
        this.b.d(new realmSet$NorekPengirim(realmset_tipetujuantransaksipenerima));
    }
}
