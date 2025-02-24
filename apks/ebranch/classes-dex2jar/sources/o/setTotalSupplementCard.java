package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setTotalSupplementCard.class */
public final class setTotalSupplementCard implements realmSet$benefit {
    private static final realmGet$benefit a = new setReferenceBranchCode();
    private final realmGet$benefit d;

    public setTotalSupplementCard() {
        realmGet$benefit realmget_benefit;
        setFlagReferenceSales b = setFlagReferenceSales.b();
        try {
            realmget_benefit = (realmGet$benefit) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            realmget_benefit = a;
        }
        setSelectedCardOptions setselectedcardoptions = new setSelectedCardOptions(b, realmget_benefit);
        setNationality.e(setselectedcardoptions, "messageInfoFactory");
        this.d = setselectedcardoptions;
    }

    private static boolean a(realmGet$cardCode realmget_cardcode) {
        return realmget_cardcode.d() == 1;
    }

    @Override // o.realmSet$benefit
    public final <T> realmSet$annualFeeBasicDisplayAmount<T> d(Class<T> cls) {
        realmSet$annualFeeBasicAmount.d((Class<?>) cls);
        realmGet$cardCode b = this.d.b(cls);
        if (b.b()) {
            return setHmKecamatan.class.isAssignableFrom(cls) ? realmGet$cardID.d(realmSet$annualFeeBasicAmount.e(), setFlagAgreeAutodebet.c(), b.e()) : realmGet$cardID.d(realmSet$annualFeeBasicAmount.d(), setFlagAgreeAutodebet.b(), b.e());
        }
        return setHmKecamatan.class.isAssignableFrom(cls) ? a(b) ? realmGet$cardName.e(cls, b, realmGet$promotion.c(), setReferenceSalesCode.e(), realmSet$annualFeeBasicAmount.e(), setFlagAgreeAutodebet.c(), realmGet$annualFeeBasicDisplayAmount.a()) : realmGet$cardName.e(cls, b, realmGet$promotion.c(), setReferenceSalesCode.e(), realmSet$annualFeeBasicAmount.e(), null, realmGet$annualFeeBasicDisplayAmount.a()) : a(b) ? realmGet$cardName.e(cls, b, realmGet$promotion.a(), setReferenceSalesCode.a(), realmSet$annualFeeBasicAmount.d(), setFlagAgreeAutodebet.b(), realmGet$annualFeeBasicDisplayAmount.d()) : realmGet$cardName.e(cls, b, realmGet$promotion.a(), setReferenceSalesCode.a(), realmSet$annualFeeBasicAmount.b(), null, realmGet$annualFeeBasicDisplayAmount.d());
    }
}
