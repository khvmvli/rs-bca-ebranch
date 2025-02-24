package o;
/* loaded from: classes-dex2jar.jar:o/realmSet$emergencyContactOfficeExt.class */
public enum realmSet$emergencyContactOfficeExt implements setIdentityCardType {
    UNKNOWN(0),
    STRING(1),
    NUMBER(2),
    BOOLEAN(3),
    STATEMENT(4);
    
    private static final setMobileNumber<realmSet$emergencyContactOfficeExt> j = new setMobileNumber<realmSet$emergencyContactOfficeExt>() { // from class: o.realmSet$emergencyContactOfficePhone
    };
    private final int g;

    realmSet$emergencyContactOfficeExt(int i) {
        this.g = i;
    }

    public static realmSet$emergencyContactOfficeExt b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STRING;
        }
        if (i == 2) {
            return NUMBER;
        }
        if (i == 3) {
            return BOOLEAN;
        }
        if (i != 4) {
            return null;
        }
        return STATEMENT;
    }

    public static setKrisFlyer e() {
        return realmSet$emergencyContactCity.c;
    }

    @Override // java.lang.Enum, java.lang.Object
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.g + " name=" + name() + '>';
    }
}
