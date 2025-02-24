package o;
/* loaded from: classes-dex2jar.jar:o/getISONegaraTujuanTransaksi.class */
public final class getISONegaraTujuanTransaksi implements getKategoriTujuanTransaksi {
    public static final realmSet$nationality<Boolean> a;
    public static final realmSet$nationality<Boolean> c;

    static {
        realmSet$monthlyIncome realmset_monthlyincome = new realmSet$monthlyIncome(realmSet$identityCardImg.e("com.google.android.gms.measurement"));
        a = realmset_monthlyincome.b("measurement.euid.client.dev", false);
        c = realmset_monthlyincome.b("measurement.euid.service", false);
    }

    @Override // o.getKategoriTujuanTransaksi
    public final boolean a() {
        return a.e().booleanValue();
    }

    @Override // o.getKategoriTujuanTransaksi
    public final boolean b() {
        return c.e().booleanValue();
    }
}
