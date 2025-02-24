package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getCurrOfficeBusinessField.class */
public class getCurrOfficeBusinessField implements getCustomerFullName, getCurrOfficeExtensionNumber {
    final Map<String, getCustomerFullName> c = new HashMap();

    @Override // o.getCustomerFullName
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    @Override // o.getCustomerFullName
    public final Boolean b() {
        return true;
    }

    @Override // o.getCustomerFullName
    public final Iterator<getCustomerFullName> c() {
        return getCurrOfficePhoneNumber.a(this.c);
    }

    @Override // o.getCurrOfficeExtensionNumber
    public final getCustomerFullName c(String str) {
        return this.c.containsKey(str) ? this.c.get(str) : g;
    }

    @Override // o.getCustomerFullName
    public getCustomerFullName c(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        return "toString".equals(str) ? new getEmergencyContactMobileNumber(toString()) : getCurrOfficePhoneNumber.d(this, new getEmergencyContactMobileNumber(str), realmset_ccotherbankcreditcards, list);
    }

    @Override // o.getCurrOfficeExtensionNumber
    public final void c(String str, getCustomerFullName getcustomerfullname) {
        if (getcustomerfullname == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, getcustomerfullname);
        }
    }

    @Override // o.getCustomerFullName
    public final String d() {
        return "[object Object]";
    }

    public final List<String> e() {
        return new ArrayList(this.c.keySet());
    }

    @Override // o.getCurrOfficeExtensionNumber
    public final boolean e(String str) {
        return this.c.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrOfficeBusinessField)) {
            return false;
        }
        return this.c.equals(((getCurrOfficeBusinessField) obj).c);
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName h() {
        getCurrOfficeBusinessField getcurrofficebusinessfield = new getCurrOfficeBusinessField();
        for (Map.Entry<String, getCustomerFullName> entry : this.c.entrySet()) {
            if (entry.getValue() instanceof getCurrOfficeExtensionNumber) {
                getcurrofficebusinessfield.c.put(entry.getKey(), entry.getValue());
            } else {
                getcurrofficebusinessfield.c.put(entry.getKey(), entry.getValue().h());
            }
        }
        return getcurrofficebusinessfield;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.c.isEmpty()) {
            for (String str : this.c.keySet()) {
                sb.append(String.format("%s: %s,", str, this.c.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
