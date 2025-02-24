package o;
/* loaded from: classes-dex2jar.jar:o/getLimitMaxNominalTransaksi.class */
public final class getLimitMaxNominalTransaksi implements getNamaBankPenerima {
    public static final realmSet$nationality<Boolean> a;
    public static final realmSet$nationality<Boolean> b;
    public static final realmSet$nationality<Boolean> c;
    public static final realmSet$nationality<Boolean> e;

    static {
        realmSet$monthlyIncome realmset_monthlyincome = new realmSet$monthlyIncome(realmSet$identityCardImg.e("com.google.android.gms.measurement"));
        c = realmset_monthlyincome.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = realmset_monthlyincome.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        e = realmset_monthlyincome.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        b = realmset_monthlyincome.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // o.getNamaBankPenerima
    public final boolean a() {
        return e.e().booleanValue();
    }

    @Override // o.getNamaBankPenerima
    public final boolean b() {
        return true;
    }

    @Override // o.getNamaBankPenerima
    public final boolean d() {
        return a.e().booleanValue();
    }

    @Override // o.getNamaBankPenerima
    public final boolean e() {
        return b.e().booleanValue();
    }
}
