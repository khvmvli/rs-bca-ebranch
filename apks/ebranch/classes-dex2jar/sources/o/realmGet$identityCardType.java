package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$identityCardType.class */
public enum realmGet$identityCardType implements setIdentityCardType {
    UNKNOWN_MATCH_TYPE(0),
    REGEXP(1),
    BEGINS_WITH(2),
    ENDS_WITH(3),
    PARTIAL(4),
    EXACT(5),
    IN_LIST(6);
    
    private static final setMobileNumber<realmGet$identityCardType> h = new setMobileNumber<realmGet$identityCardType>() { // from class: o.realmGet$mobileNumber
    };
    private final int j;

    realmGet$identityCardType(int i2) {
        this.j = i2;
    }

    public static realmGet$identityCardType b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_MATCH_TYPE;
            case 1:
                return REGEXP;
            case 2:
                return BEGINS_WITH;
            case 3:
                return ENDS_WITH;
            case 4:
                return PARTIAL;
            case 5:
                return EXACT;
            case 6:
                return IN_LIST;
            default:
                return null;
        }
    }

    public static setKrisFlyer b() {
        return realmGet$isKrisFlyer.a;
    }

    @Override // java.lang.Enum, java.lang.Object
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.j + " name=" + name() + '>';
    }
}
