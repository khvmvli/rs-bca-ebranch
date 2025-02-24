package o;
/* loaded from: classes-dex2jar.jar:o/getFlagPromoCode.class */
public final class getFlagPromoCode implements getFlagSimpanDaftarTransferPenerima {
    public static final realmSet$nationality<Boolean> a;
    public static final realmSet$nationality<Boolean> b;
    public static final realmSet$nationality<Long> c;
    public static final realmSet$nationality<Boolean> d;
    public static final realmSet$nationality<Long> e;

    static {
        realmSet$monthlyIncome realmset_monthlyincome = new realmSet$monthlyIncome(realmSet$identityCardImg.e("com.google.android.gms.measurement"));
        b = realmset_monthlyincome.b("measurement.client.consent_state_v1", true);
        a = realmset_monthlyincome.b("measurement.client.3p_consent_state_v1", true);
        d = realmset_monthlyincome.b("measurement.service.consent_state_v1_W36", true);
        e = realmset_monthlyincome.a("measurement.id.service.consent_state_v1_W36", 0);
        c = realmset_monthlyincome.a("measurement.service.storage_consent_support_version", 203590);
    }

    @Override // o.getFlagSimpanDaftarTransferPenerima
    public final long a() {
        return c.e().longValue();
    }
}
