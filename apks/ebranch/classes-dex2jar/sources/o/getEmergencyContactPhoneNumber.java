package o;

import java.util.Arrays;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getEmergencyContactPhoneNumber.class */
public final class getEmergencyContactPhoneNumber implements Comparator<getCustomerFullName> {
    final /* synthetic */ getCurrCompanyBusinessType b;
    final /* synthetic */ realmSet$ccOtherBankCreditCards d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getEmergencyContactPhoneNumber(getCurrCompanyBusinessType getcurrcompanybusinesstype, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards) {
        this.b = getcurrcompanybusinesstype;
        this.d = realmset_ccotherbankcreditcards;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(getCustomerFullName getcustomerfullname, getCustomerFullName getcustomerfullname2) {
        getCustomerFullName getcustomerfullname3 = getcustomerfullname;
        getCustomerFullName getcustomerfullname4 = getcustomerfullname2;
        getCurrCompanyBusinessType getcurrcompanybusinesstype = this.b;
        realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards = this.d;
        int i = 1;
        if (!(getcustomerfullname3 instanceof getEmergencyContactName)) {
            i = getcustomerfullname4 instanceof getEmergencyContactName ? -1 : getcurrcompanybusinesstype == null ? getcustomerfullname3.d().compareTo(getcustomerfullname4.d()) : (int) realmSet$flagBCAAccount.d(getcurrcompanybusinesstype.b(realmset_ccotherbankcreditcards, Arrays.asList(getcustomerfullname3, getcustomerfullname4)).a().doubleValue());
        } else if (getcustomerfullname4 instanceof getEmergencyContactName) {
            return 0;
        }
        return i;
    }
}
