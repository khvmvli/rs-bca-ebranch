package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$FlagSimpanDaftarTransferPenerima.class */
public final class realmGet$FlagSimpanDaftarTransferPenerima implements realmSet$promotionCode<realmGet$ISONegaraTujuanTransaksi> {
    private static final realmGet$FlagSimpanDaftarTransferPenerima e = new realmGet$FlagSimpanDaftarTransferPenerima();
    private final realmSet$promotionCode<realmGet$ISONegaraTujuanTransaksi> b = realmSet$referenceSalesCode.d(realmSet$referenceSalesCode.a(new realmGet$ISONegaraTujuanTransaksi() { // from class: o.realmGet$FlagValueTodayTransaksi
        public static final realmSet$nationality<Long> a;
        public static final realmSet$nationality<String> b;
        public static final realmSet$nationality<Double> c;
        public static final realmSet$nationality<Boolean> d;
        public static final realmSet$nationality<Long> e;

        static {
            realmSet$monthlyIncome realmset_monthlyincome = new realmSet$monthlyIncome(realmSet$identityCardImg.e("com.google.android.gms.measurement"));
            d = realmset_monthlyincome.b("measurement.test.boolean_flag", false);
            c = realmset_monthlyincome.b("measurement.test.double_flag", -3.0d);
            e = realmset_monthlyincome.a("measurement.test.int_flag", -2);
            a = realmset_monthlyincome.a("measurement.test.long_flag", -1);
            b = realmset_monthlyincome.e("measurement.test.string_flag", "---");
        }

        @Override // o.realmGet$ISONegaraTujuanTransaksi
        public final String a() {
            return b.e();
        }

        @Override // o.realmGet$ISONegaraTujuanTransaksi
        public final long b() {
            return a.e().longValue();
        }

        @Override // o.realmGet$ISONegaraTujuanTransaksi
        public final long c() {
            return e.e().longValue();
        }

        @Override // o.realmGet$ISONegaraTujuanTransaksi
        public final double d() {
            return c.e().doubleValue();
        }

        @Override // o.realmGet$ISONegaraTujuanTransaksi
        public final boolean e() {
            return d.e().booleanValue();
        }
    }));

    public static long a() {
        return e.c().c();
    }

    public static boolean b() {
        return e.c().e();
    }

    public static double d() {
        return e.c().d();
    }

    public static long e() {
        return e.c().b();
    }

    public static String j() {
        return e.c().a();
    }

    /* renamed from: f */
    public final realmGet$ISONegaraTujuanTransaksi c() {
        return this.b.c();
    }
}
