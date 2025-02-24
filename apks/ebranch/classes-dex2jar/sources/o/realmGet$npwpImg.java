package o;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/realmGet$npwpImg.class */
public final class realmGet$npwpImg {
    final getEmergencyContactCity a;
    final realmSet$ccOtherBankCreditCards c;
    final realmSet$ccOtherBankCreditCards d;
    final setCurrCompanyPosition e;

    public realmGet$npwpImg() {
        getEmergencyContactCity getemergencycontactcity = new getEmergencyContactCity();
        this.a = getemergencycontactcity;
        realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards = new realmSet$ccOtherBankCreditCards(null, getemergencycontactcity);
        this.d = realmset_ccotherbankcreditcards;
        this.c = realmset_ccotherbankcreditcards.d();
        setCurrCompanyPosition setcurrcompanyposition = new setCurrCompanyPosition();
        this.e = setcurrcompanyposition;
        realmset_ccotherbankcreditcards.c("require", new getCurrCompanyBusinessType(setcurrcompanyposition) { // from class: o.realmGet$SumberDanaTransaksi
            final Map<String, getCurrCompanyBusinessType> c = new HashMap();
            private final setCurrCompanyPosition d;

            {
                this.d = r5;
            }

            @Override // o.getCurrCompanyBusinessType
            public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards2, List<getCustomerFullName> list) {
                getCustomerFullName getcustomerfullname;
                realmSet$flagBCAAccount.b("require", 1, list);
                String d = realmset_ccotherbankcreditcards2.a(list.get(0)).d();
                if (this.c.containsKey(d)) {
                    return this.c.get(d);
                }
                setCurrCompanyPosition setcurrcompanyposition2 = this.d;
                if (setcurrcompanyposition2.b.containsKey(d)) {
                    try {
                        getcustomerfullname = (getCustomerFullName) setcurrcompanyposition2.b.get(d).call();
                    } catch (Exception e) {
                        String valueOf = String.valueOf(d);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
                    }
                } else {
                    getcustomerfullname = getCustomerFullName.g;
                }
                if (getcustomerfullname instanceof getCurrCompanyBusinessType) {
                    this.c.put(d, (getCurrCompanyBusinessType) getcustomerfullname);
                }
                return getcustomerfullname;
            }
        });
        setcurrcompanyposition.b("internal.platform", realmGet$emergencyContactMobileNumber.c);
        realmset_ccotherbankcreditcards.c("runtime.counter", new getCreditCardSupplements(Double.valueOf(0.0d)));
    }

    public final getCustomerFullName c(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, realmSet$emergencyContactMobileNumber... realmset_emergencycontactmobilenumberArr) {
        getCustomerFullName getcustomerfullname = getCustomerFullName.g;
        for (realmSet$emergencyContactMobileNumber realmset_emergencycontactmobilenumber : realmset_emergencycontactmobilenumberArr) {
            getCustomerFullName a = realmSet$prevWorkPeriod.a(realmset_emergencycontactmobilenumber);
            realmSet$flagBCAAccount.e(this.d);
            if (!(a instanceof getCustomerName)) {
                getcustomerfullname = a;
                if (!(a instanceof getDraft)) {
                }
            }
            getcustomerfullname = this.a.b(realmset_ccotherbankcreditcards, a);
        }
        return getcustomerfullname;
    }
}
