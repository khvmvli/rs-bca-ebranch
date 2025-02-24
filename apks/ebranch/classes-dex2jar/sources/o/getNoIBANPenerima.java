package o;
/* loaded from: classes-dex2jar.jar:o/getNoIBANPenerima.class */
public final class getNoIBANPenerima implements getNegaraBagianPenerimaCode {
    public static final realmSet$nationality<Boolean> a;
    public static final realmSet$nationality<Boolean> b;
    public static final realmSet$nationality<Boolean> d;

    static {
        realmSet$monthlyIncome realmset_monthlyincome = new realmSet$monthlyIncome(realmSet$identityCardImg.e("com.google.android.gms.measurement"));
        a = realmset_monthlyincome.b("measurement.client.sessions.check_on_reset_and_enable2", true);
        b = realmset_monthlyincome.b("measurement.client.sessions.check_on_startup", true);
        d = realmset_monthlyincome.b("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // o.getNegaraBagianPenerimaCode
    public final boolean b() {
        return true;
    }

    @Override // o.getNegaraBagianPenerimaCode
    public final boolean d() {
        return a.e().booleanValue();
    }
}
