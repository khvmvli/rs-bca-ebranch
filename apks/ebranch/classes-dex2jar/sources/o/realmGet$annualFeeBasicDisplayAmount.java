package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$annualFeeBasicDisplayAmount.class */
final class realmGet$annualFeeBasicDisplayAmount {
    private static final realmGet$annualFeeAddOnDisplayAmount d;
    private static final realmGet$annualFeeAddOnDisplayAmount e;

    static {
        realmGet$annualFeeAddOnDisplayAmount realmget_annualfeeaddondisplayamount;
        try {
            realmget_annualfeeaddondisplayamount = (realmGet$annualFeeAddOnDisplayAmount) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            realmget_annualfeeaddondisplayamount = null;
        }
        d = realmget_annualfeeaddondisplayamount;
        e = new realmGet$annualFeeAddOnDisplayAmount();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static realmGet$annualFeeAddOnDisplayAmount a() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static realmGet$annualFeeAddOnDisplayAmount d() {
        return d;
    }
}
