package o;

import o.realmSet$NegaraTujuanPenerimaISO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setPromoCode.class */
public final class setPromoCode extends setFlagBicCode {
    final /* synthetic */ realmSet$NegaraTujuanPenerimaISO.IconCompatParcelizer c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setPromoCode(realmSet$NegaraTujuanPenerimaISO realmset_negaratujuanpenerimaiso, realmSet$NegaraTujuanPenerimaISO.IconCompatParcelizer iconCompatParcelizer) {
        this.c = iconCompatParcelizer;
    }

    @Override // o.setFlagHubunganKeuanganTransaksi
    public final boolean d(cascadeDelete cascadedelete) {
        return this.c.c(new setLimitMaxNominalTransaksi(cascadedelete));
    }
}
