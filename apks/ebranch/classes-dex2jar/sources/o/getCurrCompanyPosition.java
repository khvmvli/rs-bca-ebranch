package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes-dex2jar.jar:o/getCurrCompanyPosition.class */
public final class getCurrCompanyPosition implements Iterable<getCustomerFullName>, getCustomerFullName, getCurrOfficeExtensionNumber {
    final Map<String, getCustomerFullName> d;
    final SortedMap<Integer, getCustomerFullName> e;

    public getCurrCompanyPosition() {
        this.e = new TreeMap();
        this.d = new TreeMap();
    }

    public getCurrCompanyPosition(List<getCustomerFullName> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                a(i, list.get(i));
            }
        }
    }

    @Override // o.getCustomerFullName
    public final Double a() {
        return this.e.size() == 1 ? b(0).a() : this.e.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @RequiresNonNull({"elements"})
    public final void a(int i, getCustomerFullName getcustomerfullname) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (getcustomerfullname == null) {
            this.e.remove(Integer.valueOf(i));
        } else {
            this.e.put(Integer.valueOf(i), getcustomerfullname);
        }
    }

    @Override // o.getCustomerFullName
    public final Boolean b() {
        return true;
    }

    public final String b(String str) {
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.e.isEmpty()) {
            for (int i = 0; i < g(); i++) {
                getCustomerFullName b = b(i);
                sb.append(str2);
                if (!(b instanceof getEmergencyContactName) && !(b instanceof getCurrOfficeCity)) {
                    sb.append(b.d());
                }
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final getCustomerFullName b(int i) {
        getCustomerFullName getcustomerfullname;
        if (i < g()) {
            return (!e(i) || (getcustomerfullname = this.e.get(Integer.valueOf(i))) == null) ? g : getcustomerfullname;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // o.getCustomerFullName
    public final Iterator<getCustomerFullName> c() {
        return new getCcOtherBankCreditCards(this, this.e.keySet().iterator(), this.d.keySet().iterator());
    }

    @Override // o.getCurrOfficeExtensionNumber
    public final getCustomerFullName c(String str) {
        getCustomerFullName getcustomerfullname;
        return "length".equals(str) ? new getCreditCardSupplements(Double.valueOf((double) g())) : (!e(str) || (getcustomerfullname = this.d.get(str)) == null) ? g : getcustomerfullname;
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName c(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? getEmergencyContactRelation.e(str, this, realmset_ccotherbankcreditcards, list) : getCurrOfficePhoneNumber.d(this, new getEmergencyContactMobileNumber(str), realmset_ccotherbankcreditcards, list);
    }

    public final void c(int i) {
        int intValue = this.e.lastKey().intValue();
        if (i <= intValue && i >= 0) {
            this.e.remove(Integer.valueOf(i));
            int i2 = i;
            if (i == intValue) {
                SortedMap<Integer, getCustomerFullName> sortedMap = this.e;
                int i3 = i - 1;
                Integer valueOf = Integer.valueOf(i3);
                if (!sortedMap.containsKey(valueOf) && i3 >= 0) {
                    this.e.put(valueOf, getCustomerFullName.g);
                    return;
                }
                return;
            }
            while (true) {
                int i4 = i2 + 1;
                if (i4 <= this.e.lastKey().intValue()) {
                    SortedMap<Integer, getCustomerFullName> sortedMap2 = this.e;
                    Integer valueOf2 = Integer.valueOf(i4);
                    getCustomerFullName getcustomerfullname = sortedMap2.get(valueOf2);
                    i2 = i4;
                    if (getcustomerfullname != null) {
                        this.e.put(Integer.valueOf(i4 - 1), getcustomerfullname);
                        this.e.remove(valueOf2);
                        i2 = i4;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void c(int i, getCustomerFullName getcustomerfullname) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid value index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= g()) {
            a(i, getcustomerfullname);
        } else {
            for (int intValue = this.e.lastKey().intValue(); intValue >= i; intValue--) {
                SortedMap<Integer, getCustomerFullName> sortedMap = this.e;
                Integer valueOf = Integer.valueOf(intValue);
                getCustomerFullName getcustomerfullname2 = sortedMap.get(valueOf);
                if (getcustomerfullname2 != null) {
                    a(intValue + 1, getcustomerfullname2);
                    this.e.remove(valueOf);
                }
            }
            a(i, getcustomerfullname);
        }
    }

    @Override // o.getCurrOfficeExtensionNumber
    public final void c(String str, getCustomerFullName getcustomerfullname) {
        if (getcustomerfullname == null) {
            this.d.remove(str);
        } else {
            this.d.put(str, getcustomerfullname);
        }
    }

    @Override // o.getCustomerFullName
    public final String d() {
        return b(",");
    }

    public final List<getCustomerFullName> e() {
        ArrayList arrayList = new ArrayList(g());
        for (int i = 0; i < g(); i++) {
            arrayList.add(b(i));
        }
        return arrayList;
    }

    public final boolean e(int i) {
        if (i >= 0 && i <= this.e.lastKey().intValue()) {
            return this.e.containsKey(Integer.valueOf(i));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // o.getCurrOfficeExtensionNumber
    public final boolean e(String str) {
        return "length".equals(str) || this.d.containsKey(str);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getCurrCompanyPosition)) {
            return false;
        }
        getCurrCompanyPosition getcurrcompanyposition = (getCurrCompanyPosition) obj;
        if (g() != getcurrcompanyposition.g()) {
            return false;
        }
        if (this.e.isEmpty()) {
            return getcurrcompanyposition.e.isEmpty();
        }
        for (int intValue = this.e.firstKey().intValue(); intValue <= this.e.lastKey().intValue(); intValue++) {
            if (!b(intValue).equals(getcurrcompanyposition.b(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.e.size();
    }

    public final int g() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.lastKey().intValue() + 1;
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName h() {
        getCurrCompanyPosition getcurrcompanyposition = new getCurrCompanyPosition();
        for (Map.Entry<Integer, getCustomerFullName> entry : this.e.entrySet()) {
            if (entry.getValue() instanceof getCurrOfficeExtensionNumber) {
                getcurrcompanyposition.e.put(entry.getKey(), entry.getValue());
            } else {
                getcurrcompanyposition.e.put(entry.getKey(), entry.getValue().h());
            }
        }
        return getcurrcompanyposition;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.e.hashCode() * 31;
    }

    public final Iterator<Integer> i() {
        return this.e.keySet().iterator();
    }

    @Override // java.lang.Iterable
    public final Iterator<getCustomerFullName> iterator() {
        return new getCountry(this);
    }

    public final void j() {
        this.e.clear();
    }

    @Override // java.lang.Object
    public final String toString() {
        return b(",");
    }
}
