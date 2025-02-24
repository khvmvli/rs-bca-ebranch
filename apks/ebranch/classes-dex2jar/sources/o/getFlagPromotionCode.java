package o;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getFlagPromotionCode.class */
public final class getFlagPromotionCode extends getEmergencyContactBCACardNumber {
    /* JADX INFO: Access modifiers changed from: protected */
    public getFlagPromotionCode() {
        this.a.add(getFlagOtherCC.ASSIGN);
        this.a.add(getFlagOtherCC.CONST);
        this.a.add(getFlagOtherCC.CREATE_ARRAY);
        this.a.add(getFlagOtherCC.CREATE_OBJECT);
        this.a.add(getFlagOtherCC.EXPRESSION_LIST);
        this.a.add(getFlagOtherCC.GET);
        this.a.add(getFlagOtherCC.GET_INDEX);
        this.a.add(getFlagOtherCC.GET_PROPERTY);
        this.a.add(getFlagOtherCC.NULL);
        this.a.add(getFlagOtherCC.SET_PROPERTY);
        this.a.add(getFlagOtherCC.TYPEOF);
        this.a.add(getFlagOtherCC.UNDEFINED);
        this.a.add(getFlagOtherCC.VAR);
    }

    @Override // o.getEmergencyContactBCACardNumber
    public final getCustomerFullName a(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        getCurrCompanyPosition getcurrcompanyposition;
        getCurrOfficeBusinessField getcurrofficebusinessfield;
        getCustomerFullName getcustomerfullname;
        String str2;
        getFlagOtherCC getflagothercc = getFlagOtherCC.ADD;
        int ordinal = realmSet$flagBCAAccount.d(str).ordinal();
        int i = 0;
        int i2 = 0;
        if (ordinal == 3) {
            realmSet$flagBCAAccount.b(getFlagOtherCC.ASSIGN.name(), 2, list);
            getCustomerFullName a = realmset_ccotherbankcreditcards.a(list.get(0));
            if (!(a instanceof getEmergencyContactMobileNumber)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", a.getClass().getCanonicalName()));
            } else if (realmset_ccotherbankcreditcards.d(a.d())) {
                getCustomerFullName a2 = realmset_ccotherbankcreditcards.a(list.get(1));
                realmset_ccotherbankcreditcards.c(a.d(), a2);
                return a2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", a.d()));
            }
        } else if (ordinal == 14) {
            realmSet$flagBCAAccount.d(getFlagOtherCC.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i3 = 0; i3 < list.size() - 1; i3 += 2) {
                    getCustomerFullName a3 = realmset_ccotherbankcreditcards.a(list.get(i3));
                    if (a3 instanceof getEmergencyContactMobileNumber) {
                        realmset_ccotherbankcreditcards.d(a3.d(), realmset_ccotherbankcreditcards.a(list.get(i3 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", a3.getClass().getCanonicalName()));
                    }
                }
                return getCustomerFullName.g;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 24) {
            realmSet$flagBCAAccount.d(getFlagOtherCC.EXPRESSION_LIST.name(), 1, list);
            getCustomerFullName getcustomerfullname2 = getCustomerFullName.g;
            for (int i4 = 0; i4 < list.size(); i4++) {
                getcustomerfullname2 = realmset_ccotherbankcreditcards.a(list.get(i4));
                if (getcustomerfullname2 instanceof getCurrOfficeAddress) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return getcustomerfullname2;
        } else if (ordinal == 33) {
            realmSet$flagBCAAccount.b(getFlagOtherCC.GET.name(), 1, list);
            getCustomerFullName a4 = realmset_ccotherbankcreditcards.a(list.get(0));
            if (a4 instanceof getEmergencyContactMobileNumber) {
                return realmset_ccotherbankcreditcards.e(a4.d());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", a4.getClass().getCanonicalName()));
        } else if (ordinal == 49) {
            realmSet$flagBCAAccount.b(getFlagOtherCC.NULL.name(), 0, list);
            return getCustomerFullName.h;
        } else if (ordinal == 58) {
            realmSet$flagBCAAccount.b(getFlagOtherCC.SET_PROPERTY.name(), 3, list);
            getCustomerFullName a5 = realmset_ccotherbankcreditcards.a(list.get(0));
            getCustomerFullName a6 = realmset_ccotherbankcreditcards.a(list.get(1));
            getCustomerFullName a7 = realmset_ccotherbankcreditcards.a(list.get(2));
            if (a5 == getCustomerFullName.g || a5 == getCustomerFullName.h) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", a6.d(), a5.d()));
            }
            if ((a5 instanceof getCurrCompanyPosition) && (a6 instanceof getCreditCardSupplements)) {
                ((getCurrCompanyPosition) a5).a(a6.a().intValue(), a7);
            } else if (a5 instanceof getCurrOfficeExtensionNumber) {
                ((getCurrOfficeExtensionNumber) a5).c(a6.d(), a7);
            }
            return a7;
        } else if (ordinal == 17) {
            if (!list.isEmpty()) {
                getCurrCompanyPosition getcurrcompanyposition2 = new getCurrCompanyPosition();
                Iterator<getCustomerFullName> it = list.iterator();
                while (true) {
                    getcurrcompanyposition = getcurrcompanyposition2;
                    if (!it.hasNext()) {
                        break;
                    }
                    getCustomerFullName a8 = realmset_ccotherbankcreditcards.a(it.next());
                    if (!(a8 instanceof getCurrOfficeAddress)) {
                        getcurrcompanyposition2.a(i, a8);
                        i++;
                    } else {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                }
            } else {
                getcurrcompanyposition = new getCurrCompanyPosition();
            }
            return getcurrcompanyposition;
        } else if (ordinal == 18) {
            if (list.isEmpty()) {
                getcurrofficebusinessfield = new getCurrOfficeBusinessField();
            } else if (list.size() % 2 == 0) {
                getCurrOfficeBusinessField getcurrofficebusinessfield2 = new getCurrOfficeBusinessField();
                while (true) {
                    getcurrofficebusinessfield = getcurrofficebusinessfield2;
                    if (i2 >= list.size() - 1) {
                        break;
                    }
                    getCustomerFullName a9 = realmset_ccotherbankcreditcards.a(list.get(i2));
                    getCustomerFullName a10 = realmset_ccotherbankcreditcards.a(list.get(i2 + 1));
                    if ((a9 instanceof getCurrOfficeAddress) || (a10 instanceof getCurrOfficeAddress)) {
                        break;
                    }
                    getcurrofficebusinessfield2.c(a9.d(), a10);
                    i2 += 2;
                }
                throw new IllegalStateException("Failed to evaluate map entry");
            } else {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            return getcurrofficebusinessfield;
        } else if (ordinal == 35 || ordinal == 36) {
            realmSet$flagBCAAccount.b(getFlagOtherCC.GET_PROPERTY.name(), 2, list);
            getCustomerFullName a11 = realmset_ccotherbankcreditcards.a(list.get(0));
            getCustomerFullName a12 = realmset_ccotherbankcreditcards.a(list.get(1));
            if ((a11 instanceof getCurrCompanyPosition) && realmSet$flagBCAAccount.b(a12)) {
                getcustomerfullname = ((getCurrCompanyPosition) a11).b(a12.a().intValue());
            } else if (a11 instanceof getCurrOfficeExtensionNumber) {
                getcustomerfullname = ((getCurrOfficeExtensionNumber) a11).c(a12.d());
            } else {
                if (a11 instanceof getEmergencyContactMobileNumber) {
                    if ("length".equals(a12.d())) {
                        getcustomerfullname = new getCreditCardSupplements(Double.valueOf((double) a11.d().length()));
                    } else if (realmSet$flagBCAAccount.b(a12) && a12.a().doubleValue() < ((double) a11.d().length())) {
                        getcustomerfullname = new getEmergencyContactMobileNumber(String.valueOf(a11.d().charAt(a12.a().intValue())));
                    }
                }
                getcustomerfullname = getCustomerFullName.g;
            }
            return getcustomerfullname;
        } else {
            switch (ordinal) {
                case 62:
                    realmSet$flagBCAAccount.b(getFlagOtherCC.TYPEOF.name(), 1, list);
                    getCustomerFullName a13 = realmset_ccotherbankcreditcards.a(list.get(0));
                    if (a13 instanceof getEmergencyContactName) {
                        str2 = "undefined";
                    } else if (a13 instanceof getCurrCompanyName) {
                        str2 = "boolean";
                    } else if (a13 instanceof getCreditCardSupplements) {
                        str2 = "number";
                    } else if (a13 instanceof getEmergencyContactMobileNumber) {
                        str2 = "string";
                    } else if (a13 instanceof getDraft) {
                        str2 = "function";
                    } else if ((a13 instanceof getCustomerName) || (a13 instanceof getCurrOfficeAddress)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", a13));
                    } else {
                        str2 = "object";
                    }
                    return new getEmergencyContactMobileNumber(str2);
                case 63:
                    realmSet$flagBCAAccount.b(getFlagOtherCC.UNDEFINED.name(), 0, list);
                    return getCustomerFullName.g;
                case 64:
                    realmSet$flagBCAAccount.d(getFlagOtherCC.VAR.name(), 1, list);
                    for (getCustomerFullName getcustomerfullname3 : list) {
                        getCustomerFullName a14 = realmset_ccotherbankcreditcards.a(getcustomerfullname3);
                        if (a14 instanceof getEmergencyContactMobileNumber) {
                            realmset_ccotherbankcreditcards.a(a14.d(), getCustomerFullName.g);
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", a14.getClass().getCanonicalName()));
                        }
                    }
                    return getCustomerFullName.g;
                default:
                    return a(str);
            }
        }
    }
}
