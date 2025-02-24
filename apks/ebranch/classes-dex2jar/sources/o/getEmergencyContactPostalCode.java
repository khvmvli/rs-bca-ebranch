package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getEmergencyContactPostalCode.class */
public final class getEmergencyContactPostalCode extends getEmergencyContactBCACardNumber {
    /* JADX INFO: Access modifiers changed from: protected */
    public getEmergencyContactPostalCode() {
        this.a.add(getFlagOtherCC.APPLY);
        this.a.add(getFlagOtherCC.BLOCK);
        this.a.add(getFlagOtherCC.BREAK);
        this.a.add(getFlagOtherCC.CASE);
        this.a.add(getFlagOtherCC.DEFAULT);
        this.a.add(getFlagOtherCC.CONTINUE);
        this.a.add(getFlagOtherCC.DEFINE_FUNCTION);
        this.a.add(getFlagOtherCC.FN);
        this.a.add(getFlagOtherCC.IF);
        this.a.add(getFlagOtherCC.QUOTE);
        this.a.add(getFlagOtherCC.RETURN);
        this.a.add(getFlagOtherCC.SWITCH);
        this.a.add(getFlagOtherCC.TERNARY);
    }

    private static getCustomerFullName d(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        realmSet$flagBCAAccount.d(getFlagOtherCC.FN.name(), 2, list);
        getCustomerFullName a = realmset_ccotherbankcreditcards.a(list.get(0));
        getCustomerFullName a2 = realmset_ccotherbankcreditcards.a(list.get(1));
        if (a2 instanceof getCurrCompanyPosition) {
            List<getCustomerFullName> e = ((getCurrCompanyPosition) a2).e();
            List<getCustomerFullName> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new getDraft(a.d(), e, arrayList, realmset_ccotherbankcreditcards);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", a2.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d2, code lost:
        if (r0.equals("continue") == false) goto L_0x01da;
     */
    @Override // o.getEmergencyContactBCACardNumber
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.getCustomerFullName a(java.lang.String r9, o.realmSet$ccOtherBankCreditCards r10, java.util.List<o.getCustomerFullName> r11) {
        /*
        // Method dump skipped, instructions count: 947
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEmergencyContactPostalCode.a(java.lang.String, o.realmSet$ccOtherBankCreditCards, java.util.List):o.getCustomerFullName");
    }
}
