package o;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getEmergencyContactName.class */
public final class getEmergencyContactName implements getCustomerFullName {
    @Override // o.getCustomerFullName
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    @Override // o.getCustomerFullName
    public final Boolean b() {
        return false;
    }

    @Override // o.getCustomerFullName
    public final Iterator<getCustomerFullName> c() {
        return null;
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName c(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // o.getCustomerFullName
    public final String d() {
        return "undefined";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof getEmergencyContactName;
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName h() {
        return getCustomerFullName.g;
    }
}
