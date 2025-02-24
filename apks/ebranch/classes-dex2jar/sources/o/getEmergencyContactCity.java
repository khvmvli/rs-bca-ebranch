package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getEmergencyContactCity.class */
public final class getEmergencyContactCity {
    final Map<String, getEmergencyContactBCACardNumber> c = new HashMap();
    final getFlagReferalCode d = new getFlagReferalCode();

    public getEmergencyContactCity() {
        c(new getEmergencyContactAddress());
        c(new getEmergencyContactOfficePhone());
        c(new getEmergencyContactPostalCode());
        c(new getFlagAgreeAutodebet());
        c(new getFlagSubmitSupplement());
        c(new getFlagReferenceSales());
        c(new getFlagPromotionCode());
    }

    public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, getCustomerFullName getcustomerfullname) {
        realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards);
        if (!(getcustomerfullname instanceof getCustomerName)) {
            return getcustomerfullname;
        }
        getCustomerName getcustomername = (getCustomerName) getcustomerfullname;
        ArrayList<getCustomerFullName> g = getcustomername.g();
        String e = getcustomername.e();
        return (this.c.containsKey(e) ? this.c.get(e) : this.d).a(e, realmset_ccotherbankcreditcards, g);
    }

    final void c(getEmergencyContactBCACardNumber getemergencycontactbcacardnumber) {
        for (getFlagOtherCC getflagothercc : getemergencycontactbcacardnumber.a) {
            this.c.put(getflagothercc.e().toString(), getemergencycontactbcacardnumber);
        }
    }
}
