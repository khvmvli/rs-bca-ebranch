package o;

import java.util.HashMap;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setGender.class */
public final class setGender extends getCurrCompanyBusinessType {
    private final getCcOtherBankAccounts c;

    public setGender(getCcOtherBankAccounts getccotherbankaccounts) {
        super("internal.eventLogger");
        this.c = getccotherbankaccounts;
    }

    @Override // o.getCurrCompanyBusinessType
    public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        realmSet$flagBCAAccount.b(this.a, 3, list);
        String d = realmset_ccotherbankcreditcards.a(list.get(0)).d();
        long d2 = (long) realmSet$flagBCAAccount.d(realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue());
        getCustomerFullName a = realmset_ccotherbankcreditcards.a(list.get(2));
        HashMap hashMap = new HashMap();
        if (a instanceof getCurrOfficeBusinessField) {
            getCurrOfficeBusinessField getcurrofficebusinessfield = (getCurrOfficeBusinessField) a;
            for (String str : getcurrofficebusinessfield.e()) {
                Object d3 = realmSet$flagBCAAccount.d(getcurrofficebusinessfield.c(str));
                if (d3 != null) {
                    hashMap.put(str, d3);
                }
            }
        }
        this.c.b(d, d2, hashMap);
        return getCustomerFullName.g;
    }
}
