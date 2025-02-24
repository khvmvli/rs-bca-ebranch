package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getFlagAgreeAutodebet.class */
public final class getFlagAgreeAutodebet extends getEmergencyContactBCACardNumber {
    /* JADX INFO: Access modifiers changed from: protected */
    public getFlagAgreeAutodebet() {
        this.a.add(getFlagOtherCC.AND);
        this.a.add(getFlagOtherCC.NOT);
        this.a.add(getFlagOtherCC.OR);
    }

    @Override // o.getEmergencyContactBCACardNumber
    public final getCustomerFullName a(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        getFlagOtherCC getflagothercc = getFlagOtherCC.ADD;
        int ordinal = realmSet$flagBCAAccount.d(str).ordinal();
        if (ordinal == 1) {
            realmSet$flagBCAAccount.b(getFlagOtherCC.AND.name(), 2, list);
            getCustomerFullName a = realmset_ccotherbankcreditcards.a(list.get(0));
            return !a.b().booleanValue() ? a : realmset_ccotherbankcreditcards.a(list.get(1));
        } else if (ordinal == 47) {
            realmSet$flagBCAAccount.b(getFlagOtherCC.NOT.name(), 1, list);
            return new getCurrCompanyName(Boolean.valueOf(!realmset_ccotherbankcreditcards.a(list.get(0)).b().booleanValue()));
        } else if (ordinal != 50) {
            return a(str);
        } else {
            realmSet$flagBCAAccount.b(getFlagOtherCC.OR.name(), 2, list);
            getCustomerFullName a2 = realmset_ccotherbankcreditcards.a(list.get(0));
            return a2.b().booleanValue() ? a2 : realmset_ccotherbankcreditcards.a(list.get(1));
        }
    }
}
