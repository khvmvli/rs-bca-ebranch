package o;
/* loaded from: classes-dex2jar.jar:o/getNegaraTujuanTransaksi.class */
public final class getNegaraTujuanTransaksi implements getNominalTransaksi {
    public static final realmSet$nationality<Long> a;
    public static final realmSet$nationality<Boolean> c;
    public static final realmSet$nationality<Boolean> e;

    static {
        realmSet$monthlyIncome realmset_monthlyincome = new realmSet$monthlyIncome(realmSet$identityCardImg.e("com.google.android.gms.measurement"));
        c = realmset_monthlyincome.b("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        e = realmset_monthlyincome.b("measurement.collection.redundant_engagement_removal_enabled", false);
        a = realmset_monthlyincome.a("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    @Override // o.getNominalTransaksi
    public final boolean d() {
        return e.e().booleanValue();
    }
}
