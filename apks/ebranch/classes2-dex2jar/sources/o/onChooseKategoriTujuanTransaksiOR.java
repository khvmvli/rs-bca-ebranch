package o;

import android.content.Context;
import android.util.AttributeSet;
/* loaded from: classes2-dex2jar.jar:o/onChooseKategoriTujuanTransaksiOR.class */
public final class onChooseKategoriTujuanTransaksiOR extends OR3DataTransaksiBFragment {
    public onChooseKategoriTujuanTransaksiOR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public onChooseKategoriTujuanTransaksiOR(Context context, OR2PilihProductFragment oR2PilihProductFragment) {
        super(context, oR2PilihProductFragment);
    }

    @Override // o.OR3DataTransaksiBFragment
    public final onChooseORProduct b(OR2PilihProductFragment oR2PilihProductFragment) {
        return new pilihKategoriTujuanTransaksiOR(oR2PilihProductFragment);
    }
}
