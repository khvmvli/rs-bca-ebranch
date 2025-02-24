package o;
/* loaded from: classes-dex2jar.jar:o/setNoRekening.class */
public final class setNoRekening implements realmSet$promotionCode<EChannel$$Parcelable> {
    private static final setNoRekening a = new setNoRekening();
    private final realmSet$promotionCode<EChannel$$Parcelable> b = realmSet$referenceSalesCode.d(realmSet$referenceSalesCode.a(new EChannel$$Parcelable() { // from class: o.realmSet$NoRekening
        public static final realmSet$nationality<Boolean> b;
        public static final realmSet$nationality<Boolean> e;

        static {
            realmSet$monthlyIncome realmset_monthlyincome = new realmSet$monthlyIncome(realmSet$identityCardImg.e("com.google.android.gms.measurement"));
            b = realmset_monthlyincome.b("measurement.androidId.delete_feature", true);
            e = realmset_monthlyincome.b("measurement.log_androidId_enabled", false);
        }

        @Override // o.EChannel$$Parcelable
        public final boolean b() {
            return b.e().booleanValue();
        }
    }));

    public static boolean a() {
        return a.c().b();
    }

    /* renamed from: b */
    public final EChannel$$Parcelable c() {
        return this.b.c();
    }
}
