package o;
/* loaded from: classes-dex2jar.jar:o/setPicName.class */
public final class setPicName implements getAlamatBankPenerima {
    public static final realmSet$nationality<Boolean> c;
    public static final realmSet$nationality<Boolean> d;
    public static final realmSet$nationality<Long> e;

    static {
        realmSet$monthlyIncome realmset_monthlyincome = new realmSet$monthlyIncome(realmSet$identityCardImg.e("com.google.android.gms.measurement"));
        d = realmset_monthlyincome.b("measurement.frontend.directly_maybe_log_error_events", false);
        c = realmset_monthlyincome.b("measurement.upload.directly_maybe_log_error_events", true);
        e = realmset_monthlyincome.a("measurement.id.frontend.directly_maybe_log_error_events", 0);
    }

    @Override // o.getAlamatBankPenerima
    public final boolean c() {
        return d.e().booleanValue();
    }

    @Override // o.getAlamatBankPenerima
    public final boolean e() {
        return c.e().booleanValue();
    }
}
