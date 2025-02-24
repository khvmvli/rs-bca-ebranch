package o;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getCurrOfficeAddress.class */
public final class getCurrOfficeAddress implements getCustomerFullName {
    private final String b;
    private final getCustomerFullName c;

    public getCurrOfficeAddress() {
        getCustomerFullName getcustomerfullname = g;
        throw null;
    }

    public getCurrOfficeAddress(String str) {
        this.c = g;
        this.b = str;
    }

    public getCurrOfficeAddress(String str, getCustomerFullName getcustomerfullname) {
        this.c = getcustomerfullname;
        this.b = str;
    }

    @Override // o.getCustomerFullName
    public final Double a() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // o.getCustomerFullName
    public final Boolean b() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // o.getCustomerFullName
    public final Iterator<getCustomerFullName> c() {
        return null;
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName c(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // o.getCustomerFullName
    public final String d() {
        throw new IllegalStateException("Control is not a String");
    }

    public final getCustomerFullName e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getCurrOfficeAddress)) {
            return false;
        }
        getCurrOfficeAddress getcurrofficeaddress = (getCurrOfficeAddress) obj;
        return this.b.equals(getcurrofficeaddress.b) && this.c.equals(getcurrofficeaddress.c);
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName h() {
        return new getCurrOfficeAddress(this.b, this.c.h());
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String j() {
        return this.b;
    }
}
