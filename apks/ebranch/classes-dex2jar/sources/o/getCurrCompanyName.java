package o;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getCurrCompanyName.class */
public final class getCurrCompanyName implements getCustomerFullName {
    private final boolean b;

    public getCurrCompanyName(Boolean bool) {
        if (bool == null) {
            this.b = false;
        } else {
            this.b = bool.booleanValue();
        }
    }

    @Override // o.getCustomerFullName
    public final Double a() {
        return Double.valueOf(true != this.b ? 0.0d : 1.0d);
    }

    @Override // o.getCustomerFullName
    public final Boolean b() {
        return Boolean.valueOf(this.b);
    }

    @Override // o.getCustomerFullName
    public final Iterator<getCustomerFullName> c() {
        return null;
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName c(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        if ("toString".equals(str)) {
            return new getEmergencyContactMobileNumber(Boolean.toString(this.b));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.b), str));
    }

    @Override // o.getCustomerFullName
    public final String d() {
        return Boolean.toString(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getCurrCompanyName) && this.b == ((getCurrCompanyName) obj).b;
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName h() {
        return new getCurrCompanyName(Boolean.valueOf(this.b));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
