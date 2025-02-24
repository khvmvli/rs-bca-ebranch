package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$AlamatBankPenerima.class */
public final class realmGet$AlamatBankPenerima implements realmSet$promotionCode<realmGet$FlagAlamatBankPenerimaBelumSesuai> {
    private static final realmGet$AlamatBankPenerima b = new realmGet$AlamatBankPenerima();
    private final realmSet$promotionCode<realmGet$FlagAlamatBankPenerimaBelumSesuai> e = realmSet$referenceSalesCode.d(realmSet$referenceSalesCode.a(new realmGet$FlagAlamatBankPenerimaBelumSesuai() { // from class: o.realmGet$CodewordBankPenerima
        public static final realmSet$nationality<Boolean> a;
        public static final realmSet$nationality<Long> b;
        public static final realmSet$nationality<Long> c;
        public static final realmSet$nationality<Boolean> d;
        public static final realmSet$nationality<Boolean> e;

        static {
            realmSet$monthlyIncome realmset_monthlyincome = new realmSet$monthlyIncome(realmSet$identityCardImg.e("com.google.android.gms.measurement"));
            c = realmset_monthlyincome.a("measurement.id.lifecycle.app_in_background_parameter", 0);
            d = realmset_monthlyincome.b("measurement.lifecycle.app_backgrounded_engagement", false);
            a = realmset_monthlyincome.b("measurement.lifecycle.app_backgrounded_tracking", true);
            e = realmset_monthlyincome.b("measurement.lifecycle.app_in_background_parameter", false);
            b = realmset_monthlyincome.a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
        }

        @Override // o.realmGet$FlagAlamatBankPenerimaBelumSesuai
        public final boolean b() {
            return e.e().booleanValue();
        }

        @Override // o.realmGet$FlagAlamatBankPenerimaBelumSesuai
        public final boolean d() {
            return d.e().booleanValue();
        }
    }));

    public static boolean d() {
        return b.c().d();
    }

    public static boolean e() {
        return b.c().b();
    }

    /* renamed from: a */
    public final realmGet$FlagAlamatBankPenerimaBelumSesuai c() {
        return this.e.c();
    }
}
