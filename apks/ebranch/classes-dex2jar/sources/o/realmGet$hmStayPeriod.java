package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$hmStayPeriod.class */
public enum realmGet$hmStayPeriod implements setIdentityCardType {
    UNKNOWN_COMPARISON_TYPE(0),
    LESS_THAN(1),
    GREATER_THAN(2),
    EQUAL(3),
    BETWEEN(4);
    
    private static final setMobileNumber<realmGet$hmStayPeriod> i = new setMobileNumber<realmGet$hmStayPeriod>() { // from class: o.realmGet$flagOtherCC
    };
    private final int f;

    realmGet$hmStayPeriod(int i2) {
        this.f = i2;
    }

    public static setKrisFlyer c() {
        return realmGet$flagReferenceSales.d;
    }

    public static realmGet$hmStayPeriod e(int i2) {
        if (i2 == 0) {
            return UNKNOWN_COMPARISON_TYPE;
        }
        if (i2 == 1) {
            return LESS_THAN;
        }
        if (i2 == 2) {
            return GREATER_THAN;
        }
        if (i2 == 3) {
            return EQUAL;
        }
        if (i2 != 4) {
            return null;
        }
        return BETWEEN;
    }

    @Override // java.lang.Enum, java.lang.Object
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f + " name=" + name() + '>';
    }
}
