package o;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getCurrOfficePhoneNumber.class */
public final /* synthetic */ class getCurrOfficePhoneNumber {
    public static Iterator<getCustomerFullName> a(Map<String, getCustomerFullName> map) {
        return new getCurrOfficeEmailAddress(map.keySet().iterator());
    }

    public static getCustomerFullName d(getCurrOfficeExtensionNumber getcurrofficeextensionnumber, getCustomerFullName getcustomerfullname, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        if (getcurrofficeextensionnumber.e(getcustomerfullname.d())) {
            getCustomerFullName c = getcurrofficeextensionnumber.c(getcustomerfullname.d());
            if (c instanceof getCurrCompanyBusinessType) {
                return ((getCurrCompanyBusinessType) c).b(realmset_ccotherbankcreditcards, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", getcustomerfullname.d()));
        } else if ("hasOwnProperty".equals(getcustomerfullname.d())) {
            realmSet$flagBCAAccount.b("hasOwnProperty", 1, list);
            return getcurrofficeextensionnumber.e(realmset_ccotherbankcreditcards.a(list.get(0)).d()) ? getCustomerFullName.n : getCustomerFullName.k;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", getcustomerfullname.d()));
        }
    }
}
