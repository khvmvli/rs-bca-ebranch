package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getCurrCompanyBusinessType.class */
public abstract class getCurrCompanyBusinessType implements getCustomerFullName, getCurrOfficeExtensionNumber {
    protected final String a;
    protected final Map<String, getCustomerFullName> e = new HashMap();

    public getCurrCompanyBusinessType(String str) {
        this.a = str;
    }

    @Override // o.getCustomerFullName
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    @Override // o.getCustomerFullName
    public final Boolean b() {
        return true;
    }

    public abstract getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list);

    @Override // o.getCustomerFullName
    public final Iterator<getCustomerFullName> c() {
        return getCurrOfficePhoneNumber.a(this.e);
    }

    @Override // o.getCurrOfficeExtensionNumber
    public final getCustomerFullName c(String str) {
        return this.e.containsKey(str) ? this.e.get(str) : g;
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName c(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        return "toString".equals(str) ? new getEmergencyContactMobileNumber(this.a) : getCurrOfficePhoneNumber.d(this, new getEmergencyContactMobileNumber(str), realmset_ccotherbankcreditcards, list);
    }

    @Override // o.getCurrOfficeExtensionNumber
    public final void c(String str, getCustomerFullName getcustomerfullname) {
        if (getcustomerfullname == null) {
            this.e.remove(str);
        } else {
            this.e.put(str, getcustomerfullname);
        }
    }

    @Override // o.getCustomerFullName
    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.a;
    }

    @Override // o.getCurrOfficeExtensionNumber
    public final boolean e(String str) {
        return this.e.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrCompanyBusinessType)) {
            return false;
        }
        getCurrCompanyBusinessType getcurrcompanybusinesstype = (getCurrCompanyBusinessType) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(getcurrcompanybusinesstype.a);
        }
        return false;
    }

    @Override // o.getCustomerFullName
    public getCustomerFullName h() {
        return this;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
