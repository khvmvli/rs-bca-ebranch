package o;
/* loaded from: classes-dex2jar.jar:o/isFlagBicCode.class */
public final class isFlagBicCode implements getTujuanTransaksiKode {
    public static final realmSet$nationality<Long> a;
    public static final realmSet$nationality<Boolean> b;
    public static final realmSet$nationality<Boolean> c;
    public static final realmSet$nationality<Boolean> d;
    public static final realmSet$nationality<Boolean> e;

    static {
        realmSet$monthlyIncome realmset_monthlyincome = new realmSet$monthlyIncome(realmSet$identityCardImg.e("com.google.android.gms.measurement"));
        d = realmset_monthlyincome.b("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = realmset_monthlyincome.b("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = realmset_monthlyincome.b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        e = realmset_monthlyincome.b("measurement.sdk.collection.last_gclid_from_referrer2", false);
        a = realmset_monthlyincome.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    @Override // o.getTujuanTransaksiKode
    public final boolean a() {
        return b.e().booleanValue();
    }

    @Override // o.getTujuanTransaksiKode
    public final boolean b() {
        return e.e().booleanValue();
    }

    @Override // o.getTujuanTransaksiKode
    public final boolean d() {
        return d.e().booleanValue();
    }

    @Override // o.getTujuanTransaksiKode
    public final boolean e() {
        return c.e().booleanValue();
    }
}
