package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getFlagReferalCode.class */
public final class getFlagReferalCode extends getEmergencyContactBCACardNumber {
    @Override // o.getEmergencyContactBCACardNumber
    public final getCustomerFullName a(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        if (str == null || str.isEmpty() || !realmset_ccotherbankcreditcards.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        getCustomerFullName e = realmset_ccotherbankcreditcards.e(str);
        if (e instanceof getCurrCompanyBusinessType) {
            return ((getCurrCompanyBusinessType) e).b(realmset_ccotherbankcreditcards, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
