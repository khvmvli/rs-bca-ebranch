package o;

import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes-dex2jar.jar:o/getEmergencyContactRelation.class */
public final class getEmergencyContactRelation {
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static o.getCustomerFullName b(o.getCurrCompanyPosition r10, o.realmSet$ccOtherBankCreditCards r11, java.util.List<o.getCustomerFullName> r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEmergencyContactRelation.b(o.getCurrCompanyPosition, o.realmSet$ccOtherBankCreditCards, java.util.List, boolean):o.getCustomerFullName");
    }

    private static getCurrCompanyPosition c(getCurrCompanyPosition getcurrcompanyposition, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, getCurrCompanyBusinessType getcurrcompanybusinesstype, Boolean bool, Boolean bool2) {
        getCurrCompanyPosition getcurrcompanyposition2 = new getCurrCompanyPosition();
        Iterator<Integer> i = getcurrcompanyposition.i();
        while (i.hasNext()) {
            int intValue = i.next().intValue();
            if (getcurrcompanyposition.e(intValue)) {
                getCustomerFullName b = getcurrcompanybusinesstype.b(realmset_ccotherbankcreditcards, Arrays.asList(getcurrcompanyposition.b(intValue), new getCreditCardSupplements(Double.valueOf((double) intValue)), getcurrcompanyposition));
                if (b.b().equals(bool)) {
                    return getcurrcompanyposition2;
                }
                if (bool2 == null || b.b().equals(bool2)) {
                    getcurrcompanyposition2.a(intValue, b);
                }
            }
        }
        return getcurrcompanyposition2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v268, types: [double] */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v5, types: [double] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static o.getCustomerFullName e(java.lang.String r10, o.getCurrCompanyPosition r11, o.realmSet$ccOtherBankCreditCards r12, java.util.List<o.getCustomerFullName> r13) {
        /*
        // Method dump skipped, instructions count: 2978
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEmergencyContactRelation.e(java.lang.String, o.getCurrCompanyPosition, o.realmSet$ccOtherBankCreditCards, java.util.List):o.getCustomerFullName");
    }
}
