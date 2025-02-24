package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$BankBicKey.class */
public final class realmGet$BankBicKey implements realmSet$promotionCode<realmGet$AlamatLengkapPenerima> {
    private static final realmGet$BankBicKey d = new realmGet$BankBicKey();
    private final realmSet$promotionCode<realmGet$AlamatLengkapPenerima> e = realmSet$referenceSalesCode.d(realmSet$referenceSalesCode.a(new realmGet$AlamatLengkapPenerima() { // from class: o.realmGet$BeritaTransaksi
        public static final realmSet$nationality<Boolean> a;
        public static final realmSet$nationality<Boolean> b;

        static {
            realmSet$monthlyIncome realmset_monthlyincome = new realmSet$monthlyIncome(realmSet$identityCardImg.e("com.google.android.gms.measurement"));
            b = realmset_monthlyincome.b("measurement.sdk.screen.manual_screen_view_logging", true);
            a = realmset_monthlyincome.b("measurement.sdk.screen.disabling_automatic_reporting", true);
        }

        @Override // o.realmGet$AlamatLengkapPenerima
        public final boolean a() {
            return true;
        }

        @Override // o.realmGet$AlamatLengkapPenerima
        public final boolean b() {
            return b.e().booleanValue();
        }

        @Override // o.realmGet$AlamatLengkapPenerima
        public final boolean d() {
            return a.e().booleanValue();
        }
    }));

    public static boolean a() {
        d.c().a();
        return true;
    }

    public static boolean d() {
        return d.c().d();
    }

    public static boolean e() {
        return d.c().b();
    }

    /* renamed from: b */
    public final realmGet$AlamatLengkapPenerima c() {
        return this.e.c();
    }
}
