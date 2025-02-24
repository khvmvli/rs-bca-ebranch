package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/realmSet$ccOtherBankCreditCards.class */
public final class realmSet$ccOtherBankCreditCards {
    public final realmSet$ccOtherBankCreditCards d;
    final getEmergencyContactCity e;
    final Map<String, getCustomerFullName> b = new HashMap();
    final Map<String, Boolean> a = new HashMap();

    public realmSet$ccOtherBankCreditCards(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, getEmergencyContactCity getemergencycontactcity) {
        this.d = realmset_ccotherbankcreditcards;
        this.e = getemergencycontactcity;
    }

    public final getCustomerFullName a(getCurrCompanyPosition getcurrcompanyposition) {
        getCustomerFullName getcustomerfullname = getCustomerFullName.g;
        Iterator<Integer> i = getcurrcompanyposition.i();
        while (true) {
            if (!i.hasNext()) {
                break;
            }
            getCustomerFullName b = this.e.b(this, getcurrcompanyposition.b(i.next().intValue()));
            getcustomerfullname = b;
            if (b instanceof getCurrOfficeAddress) {
                getcustomerfullname = b;
                break;
            }
        }
        return getcustomerfullname;
    }

    public final getCustomerFullName a(getCustomerFullName getcustomerfullname) {
        return this.e.b(this, getcustomerfullname);
    }

    public final void a(String str, getCustomerFullName getcustomerfullname) {
        if (!this.a.containsKey(str)) {
            if (getcustomerfullname == null) {
                this.b.remove(str);
            } else {
                this.b.put(str, getcustomerfullname);
            }
        }
    }

    public final void c(String str, getCustomerFullName getcustomerfullname) {
        realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards;
        if (!this.b.containsKey(str) && (realmset_ccotherbankcreditcards = this.d) != null && realmset_ccotherbankcreditcards.d(str)) {
            this.d.c(str, getcustomerfullname);
        } else if (!this.a.containsKey(str)) {
            if (getcustomerfullname == null) {
                this.b.remove(str);
            } else {
                this.b.put(str, getcustomerfullname);
            }
        }
    }

    public final realmSet$ccOtherBankCreditCards d() {
        return new realmSet$ccOtherBankCreditCards(this, this.e);
    }

    public final void d(String str, getCustomerFullName getcustomerfullname) {
        a(str, getcustomerfullname);
        this.a.put(str, true);
    }

    public final boolean d(String str) {
        if (this.b.containsKey(str)) {
            return true;
        }
        realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards = this.d;
        if (realmset_ccotherbankcreditcards != null) {
            return realmset_ccotherbankcreditcards.d(str);
        }
        return false;
    }

    public final getCustomerFullName e(String str) {
        if (this.b.containsKey(str)) {
            return this.b.get(str);
        }
        realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards = this.d;
        if (realmset_ccotherbankcreditcards != null) {
            return realmset_ccotherbankcreditcards.e(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
