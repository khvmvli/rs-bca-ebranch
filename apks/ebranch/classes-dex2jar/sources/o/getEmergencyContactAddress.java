package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getEmergencyContactAddress.class */
public final class getEmergencyContactAddress extends getEmergencyContactBCACardNumber {
    public getEmergencyContactAddress() {
        this.a.add(getFlagOtherCC.BITWISE_AND);
        this.a.add(getFlagOtherCC.BITWISE_LEFT_SHIFT);
        this.a.add(getFlagOtherCC.BITWISE_NOT);
        this.a.add(getFlagOtherCC.BITWISE_OR);
        this.a.add(getFlagOtherCC.BITWISE_RIGHT_SHIFT);
        this.a.add(getFlagOtherCC.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(getFlagOtherCC.BITWISE_XOR);
    }

    @Override // o.getEmergencyContactBCACardNumber
    public final getCustomerFullName a(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        getFlagOtherCC getflagothercc = getFlagOtherCC.ADD;
        switch (realmSet$flagBCAAccount.d(str).ordinal()) {
            case 4:
                realmSet$flagBCAAccount.b(getFlagOtherCC.BITWISE_AND.name(), 2, list);
                return new getCreditCardSupplements(Double.valueOf((double) (realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue()) & realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()))));
            case 5:
                realmSet$flagBCAAccount.b(getFlagOtherCC.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new getCreditCardSupplements(Double.valueOf((double) (realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue()) << ((int) (realmSet$flagBCAAccount.c(realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()) & 31)))));
            case 6:
                realmSet$flagBCAAccount.b(getFlagOtherCC.BITWISE_NOT.name(), 1, list);
                return new getCreditCardSupplements(Double.valueOf((double) (realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue()) ^ -1)));
            case 7:
                realmSet$flagBCAAccount.b(getFlagOtherCC.BITWISE_OR.name(), 2, list);
                return new getCreditCardSupplements(Double.valueOf((double) (realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue()) | realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()))));
            case 8:
                realmSet$flagBCAAccount.b(getFlagOtherCC.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new getCreditCardSupplements(Double.valueOf((double) (realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue()) >> ((int) (realmSet$flagBCAAccount.c(realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()) & 31)))));
            case 9:
                realmSet$flagBCAAccount.b(getFlagOtherCC.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new getCreditCardSupplements(Double.valueOf((double) (realmSet$flagBCAAccount.c(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue()) >>> ((int) (realmSet$flagBCAAccount.c(realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()) & 31)))));
            case 10:
                realmSet$flagBCAAccount.b(getFlagOtherCC.BITWISE_XOR.name(), 2, list);
                return new getCreditCardSupplements(Double.valueOf((double) (realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue()) ^ realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()))));
            default:
                return a(str);
        }
    }
}
