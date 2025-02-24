package o;

import android.content.Context;
/* loaded from: classes2-dex2jar.jar:o/pilihKategoriTujuanTransaksiOR.class */
public final class pilihKategoriTujuanTransaksiOR extends onChooseORProduct {
    public pilihKategoriTujuanTransaksiOR(OR2PilihProductFragment oR2PilihProductFragment) {
        super(oR2PilihProductFragment);
    }

    @Override // o.onChooseORProduct
    public final onChooseProductOR c(Context context) {
        return new pilihSumberDanaOR(context, null, this.e);
    }
}
