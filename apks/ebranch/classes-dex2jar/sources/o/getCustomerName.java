package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getCustomerName.class */
public final class getCustomerName implements getCustomerFullName {
    private final ArrayList<getCustomerFullName> b;
    private final String d;

    public getCustomerName(String str, List<getCustomerFullName> list) {
        this.d = str;
        ArrayList<getCustomerFullName> arrayList = new ArrayList<>();
        this.b = arrayList;
        arrayList.addAll(list);
    }

    @Override // o.getCustomerFullName
    public final Double a() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // o.getCustomerFullName
    public final Boolean b() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // o.getCustomerFullName
    public final Iterator<getCustomerFullName> c() {
        return null;
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName c(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // o.getCustomerFullName
    public final String d() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCustomerName)) {
            return false;
        }
        getCustomerName getcustomername = (getCustomerName) obj;
        String str = this.d;
        if (str != null) {
            if (!str.equals(getcustomername.d)) {
                return false;
            }
        } else if (getcustomername.d != null) {
            return false;
        }
        return this.b.equals(getcustomername.b);
    }

    public final ArrayList<getCustomerFullName> g() {
        return this.b;
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName h() {
        return this;
    }

    public final int hashCode() {
        String str = this.d;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b.hashCode();
    }
}
