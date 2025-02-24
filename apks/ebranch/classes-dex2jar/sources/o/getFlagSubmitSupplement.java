package o;

import java.util.Iterator;
/* loaded from: classes-dex2jar.jar:o/getFlagSubmitSupplement.class */
public final class getFlagSubmitSupplement extends getEmergencyContactBCACardNumber {
    /* JADX INFO: Access modifiers changed from: protected */
    public getFlagSubmitSupplement() {
        this.a.add(getFlagOtherCC.FOR_IN);
        this.a.add(getFlagOtherCC.FOR_IN_CONST);
        this.a.add(getFlagOtherCC.FOR_IN_LET);
        this.a.add(getFlagOtherCC.FOR_LET);
        this.a.add(getFlagOtherCC.FOR_OF);
        this.a.add(getFlagOtherCC.FOR_OF_CONST);
        this.a.add(getFlagOtherCC.FOR_OF_LET);
        this.a.add(getFlagOtherCC.WHILE);
    }

    private static getCustomerFullName a(getFlagAgreeLifeInsurance getflagagreelifeinsurance, Iterator<getCustomerFullName> it, getCustomerFullName getcustomerfullname) {
        if (it != null) {
            while (it.hasNext()) {
                getCustomerFullName a = getflagagreelifeinsurance.a(it.next()).a((getCurrCompanyPosition) getcustomerfullname);
                if (a instanceof getCurrOfficeAddress) {
                    getCurrOfficeAddress getcurrofficeaddress = (getCurrOfficeAddress) a;
                    if ("break".equals(getcurrofficeaddress.j())) {
                        return getCustomerFullName.g;
                    }
                    if ("return".equals(getcurrofficeaddress.j())) {
                        return getcurrofficeaddress;
                    }
                }
            }
        }
        return getCustomerFullName.g;
    }

    private static getCustomerFullName b(getFlagAgreeLifeInsurance getflagagreelifeinsurance, getCustomerFullName getcustomerfullname, getCustomerFullName getcustomerfullname2) {
        return a(getflagagreelifeinsurance, getcustomerfullname.c(), getcustomerfullname2);
    }

    private static getCustomerFullName e(getFlagAgreeLifeInsurance getflagagreelifeinsurance, getCustomerFullName getcustomerfullname, getCustomerFullName getcustomerfullname2) {
        if (getcustomerfullname instanceof Iterable) {
            return a(getflagagreelifeinsurance, ((Iterable) getcustomerfullname).iterator(), getcustomerfullname2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0426, code lost:
        if ("return".equals(r6.j()) != false) goto L_0x0482;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [o.getCustomerFullName] */
    /* JADX WARN: Type inference failed for: r6v4, types: [o.getCurrOfficeAddress] */
    /* JADX WARN: Type inference failed for: r6v5, types: [o.getCustomerFullName] */
    /* JADX WARN: Type inference failed for: r6v6, types: [o.getCustomerFullName] */
    /* JADX WARN: Type inference failed for: r6v8, types: [o.getCurrOfficeAddress] */
    /* JADX WARN: Type inference failed for: r6v9, types: [o.getCustomerFullName] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // o.getEmergencyContactBCACardNumber
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.getCustomerFullName a(java.lang.String r6, o.realmSet$ccOtherBankCreditCards r7, java.util.List<o.getCustomerFullName> r8) {
        /*
        // Method dump skipped, instructions count: 1156
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getFlagSubmitSupplement.a(java.lang.String, o.realmSet$ccOtherBankCreditCards, java.util.List):o.getCustomerFullName");
    }
}
