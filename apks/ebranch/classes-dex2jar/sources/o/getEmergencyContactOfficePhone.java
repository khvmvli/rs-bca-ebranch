package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getEmergencyContactOfficePhone.class */
public final class getEmergencyContactOfficePhone extends getEmergencyContactBCACardNumber {
    public getEmergencyContactOfficePhone() {
        this.a.add(getFlagOtherCC.EQUALS);
        this.a.add(getFlagOtherCC.GREATER_THAN);
        this.a.add(getFlagOtherCC.GREATER_THAN_EQUALS);
        this.a.add(getFlagOtherCC.IDENTITY_EQUALS);
        this.a.add(getFlagOtherCC.IDENTITY_NOT_EQUALS);
        this.a.add(getFlagOtherCC.LESS_THAN);
        this.a.add(getFlagOtherCC.LESS_THAN_EQUALS);
        this.a.add(getFlagOtherCC.NOT_EQUALS);
    }

    private static boolean b(getCustomerFullName getcustomerfullname, getCustomerFullName getcustomerfullname2) {
        if (getcustomerfullname.getClass().equals(getcustomerfullname2.getClass())) {
            if ((getcustomerfullname instanceof getEmergencyContactName) || (getcustomerfullname instanceof getCurrOfficeCity)) {
                return true;
            }
            if (!(getcustomerfullname instanceof getCreditCardSupplements)) {
                return getcustomerfullname instanceof getEmergencyContactMobileNumber ? getcustomerfullname.d().equals(getcustomerfullname2.d()) : getcustomerfullname instanceof getCurrCompanyName ? getcustomerfullname.b().equals(getcustomerfullname2.b()) : getcustomerfullname == getcustomerfullname2;
            }
            if (Double.isNaN(getcustomerfullname.a().doubleValue()) || Double.isNaN(getcustomerfullname2.a().doubleValue())) {
                return false;
            }
            return getcustomerfullname.a().equals(getcustomerfullname2.a());
        } else if (((getcustomerfullname instanceof getEmergencyContactName) || (getcustomerfullname instanceof getCurrOfficeCity)) && ((getcustomerfullname2 instanceof getEmergencyContactName) || (getcustomerfullname2 instanceof getCurrOfficeCity))) {
            return true;
        } else {
            boolean z = getcustomerfullname instanceof getCreditCardSupplements;
            if (z && (getcustomerfullname2 instanceof getEmergencyContactMobileNumber)) {
                return b(getcustomerfullname, new getCreditCardSupplements(getcustomerfullname2.a()));
            }
            boolean z2 = getcustomerfullname instanceof getEmergencyContactMobileNumber;
            if ((!z2 || !(getcustomerfullname2 instanceof getCreditCardSupplements)) && !(getcustomerfullname instanceof getCurrCompanyName)) {
                if (getcustomerfullname2 instanceof getCurrCompanyName) {
                    return b(getcustomerfullname, new getCreditCardSupplements(getcustomerfullname2.a()));
                }
                if ((z2 || z) && (getcustomerfullname2 instanceof getCurrOfficeExtensionNumber)) {
                    return b(getcustomerfullname, new getEmergencyContactMobileNumber(getcustomerfullname2.d()));
                }
                if (!(getcustomerfullname instanceof getCurrOfficeExtensionNumber)) {
                    return false;
                }
                if ((getcustomerfullname2 instanceof getEmergencyContactMobileNumber) || (getcustomerfullname2 instanceof getCreditCardSupplements)) {
                    return b(new getEmergencyContactMobileNumber(getcustomerfullname.d()), getcustomerfullname2);
                }
                return false;
            }
            return b(new getCreditCardSupplements(getcustomerfullname.a()), getcustomerfullname2);
        }
    }

    private static boolean c(getCustomerFullName getcustomerfullname, getCustomerFullName getcustomerfullname2) {
        getCustomerFullName getcustomerfullname3 = getcustomerfullname;
        if (getcustomerfullname instanceof getCurrOfficeExtensionNumber) {
            getcustomerfullname3 = new getEmergencyContactMobileNumber(getcustomerfullname.d());
        }
        getCustomerFullName getcustomerfullname4 = getcustomerfullname2;
        if (getcustomerfullname2 instanceof getCurrOfficeExtensionNumber) {
            getcustomerfullname4 = new getEmergencyContactMobileNumber(getcustomerfullname2.d());
        }
        return (((getcustomerfullname3 instanceof getEmergencyContactMobileNumber) && (getcustomerfullname4 instanceof getEmergencyContactMobileNumber)) || (!Double.isNaN(getcustomerfullname3.a().doubleValue()) && !Double.isNaN(getcustomerfullname4.a().doubleValue()))) && !d(getcustomerfullname4, getcustomerfullname3);
    }

    private static boolean d(getCustomerFullName getcustomerfullname, getCustomerFullName getcustomerfullname2) {
        getCustomerFullName getcustomerfullname3 = getcustomerfullname;
        if (getcustomerfullname instanceof getCurrOfficeExtensionNumber) {
            getcustomerfullname3 = new getEmergencyContactMobileNumber(getcustomerfullname.d());
        }
        getCustomerFullName getcustomerfullname4 = getcustomerfullname2;
        if (getcustomerfullname2 instanceof getCurrOfficeExtensionNumber) {
            getcustomerfullname4 = new getEmergencyContactMobileNumber(getcustomerfullname2.d());
        }
        if ((getcustomerfullname3 instanceof getEmergencyContactMobileNumber) && (getcustomerfullname4 instanceof getEmergencyContactMobileNumber)) {
            return getcustomerfullname3.d().compareTo(getcustomerfullname4.d()) < 0;
        }
        double doubleValue = getcustomerfullname3.a().doubleValue();
        double doubleValue2 = getcustomerfullname4.a().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && Double.compare(doubleValue, doubleValue2) < 0;
    }

    @Override // o.getEmergencyContactBCACardNumber
    public final getCustomerFullName a(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        boolean z;
        boolean z2;
        realmSet$flagBCAAccount.b(realmSet$flagBCAAccount.d(str).name(), 2, list);
        getCustomerFullName a = realmset_ccotherbankcreditcards.a(list.get(0));
        getCustomerFullName a2 = realmset_ccotherbankcreditcards.a(list.get(1));
        int ordinal = realmSet$flagBCAAccount.d(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                z2 = b(a, a2);
            } else if (ordinal == 42) {
                z = d(a, a2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                        z = d(a2, a);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                        z = c(a2, a);
                        break;
                    case 39:
                        z = realmSet$flagBCAAccount.c(a, a2);
                        break;
                    case 40:
                        z2 = realmSet$flagBCAAccount.c(a, a2);
                        break;
                    default:
                        return a(str);
                }
            } else {
                z = c(a, a2);
            }
            z = !z2;
        } else {
            z = b(a, a2);
        }
        return z ? getCustomerFullName.n : getCustomerFullName.k;
    }
}
