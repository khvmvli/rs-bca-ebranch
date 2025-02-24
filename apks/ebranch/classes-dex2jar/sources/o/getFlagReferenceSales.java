package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getFlagReferenceSales.class */
public final class getFlagReferenceSales extends getEmergencyContactBCACardNumber {
    /* JADX INFO: Access modifiers changed from: protected */
    public getFlagReferenceSales() {
        this.a.add(getFlagOtherCC.ADD);
        this.a.add(getFlagOtherCC.DIVIDE);
        this.a.add(getFlagOtherCC.MODULUS);
        this.a.add(getFlagOtherCC.MULTIPLY);
        this.a.add(getFlagOtherCC.NEGATE);
        this.a.add(getFlagOtherCC.POST_DECREMENT);
        this.a.add(getFlagOtherCC.POST_INCREMENT);
        this.a.add(getFlagOtherCC.PRE_DECREMENT);
        this.a.add(getFlagOtherCC.PRE_INCREMENT);
        this.a.add(getFlagOtherCC.SUBTRACT);
    }

    @Override // o.getEmergencyContactBCACardNumber
    public final getCustomerFullName a(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        getCustomerFullName getcustomerfullname;
        getFlagOtherCC getflagothercc = getFlagOtherCC.ADD;
        int ordinal = realmSet$flagBCAAccount.d(str).ordinal();
        if (ordinal == 0) {
            realmSet$flagBCAAccount.b(getFlagOtherCC.ADD.name(), 2, list);
            getCustomerFullName a = realmset_ccotherbankcreditcards.a(list.get(0));
            getCustomerFullName a2 = realmset_ccotherbankcreditcards.a(list.get(1));
            if ((a instanceof getCurrOfficeExtensionNumber) || (a instanceof getEmergencyContactMobileNumber) || (a2 instanceof getCurrOfficeExtensionNumber) || (a2 instanceof getEmergencyContactMobileNumber)) {
                String valueOf = String.valueOf(a.d());
                String valueOf2 = String.valueOf(a2.d());
                getcustomerfullname = new getEmergencyContactMobileNumber(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            } else {
                getcustomerfullname = new getCreditCardSupplements(Double.valueOf(a.a().doubleValue() + a2.a().doubleValue()));
            }
            return getcustomerfullname;
        } else if (ordinal == 21) {
            realmSet$flagBCAAccount.b(getFlagOtherCC.DIVIDE.name(), 2, list);
            return new getCreditCardSupplements(Double.valueOf(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue() / realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()));
        } else if (ordinal == 59) {
            realmSet$flagBCAAccount.b(getFlagOtherCC.SUBTRACT.name(), 2, list);
            return new getCreditCardSupplements(Double.valueOf(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue() + new getCreditCardSupplements(Double.valueOf(-realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue())).a().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            realmSet$flagBCAAccount.b(str, 2, list);
            getCustomerFullName a3 = realmset_ccotherbankcreditcards.a(list.get(0));
            realmset_ccotherbankcreditcards.a(list.get(1));
            return a3;
        } else if (ordinal == 55 || ordinal == 56) {
            realmSet$flagBCAAccount.b(str, 1, list);
            return realmset_ccotherbankcreditcards.a(list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    realmSet$flagBCAAccount.b(getFlagOtherCC.MODULUS.name(), 2, list);
                    return new getCreditCardSupplements(Double.valueOf(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue() % realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()));
                case 45:
                    realmSet$flagBCAAccount.b(getFlagOtherCC.MULTIPLY.name(), 2, list);
                    return new getCreditCardSupplements(Double.valueOf(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue() * realmset_ccotherbankcreditcards.a(list.get(1)).a().doubleValue()));
                case 46:
                    realmSet$flagBCAAccount.b(getFlagOtherCC.NEGATE.name(), 1, list);
                    return new getCreditCardSupplements(Double.valueOf(-realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue()));
                default:
                    return a(str);
            }
        }
    }
}
