package o;
/* loaded from: classes-dex2jar.jar:o/realmSet$creditCardSupplements.class */
public enum realmSet$creditCardSupplements implements setIdentityCardType {
    RADS(1),
    PROVISIONING(2);
    
    private static final setMobileNumber<realmSet$creditCardSupplements> d = new setMobileNumber<realmSet$creditCardSupplements>() { // from class: o.realmSet$creditCardOptions
    };
    private final int a;

    realmSet$creditCardSupplements(int i) {
        this.a = i;
    }

    public static setKrisFlyer b() {
        return realmSet$country.a;
    }

    public static realmSet$creditCardSupplements e(int i) {
        if (i == 1) {
            return RADS;
        }
        if (i != 2) {
            return null;
        }
        return PROVISIONING;
    }

    @Override // java.lang.Enum, java.lang.Object
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
