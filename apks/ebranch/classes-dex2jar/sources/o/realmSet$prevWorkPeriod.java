package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$prevWorkPeriod.class */
public final class realmSet$prevWorkPeriod {
    public static getCustomerFullName a(realmSet$emergencyContactMobileNumber realmset_emergencycontactmobilenumber) {
        if (realmset_emergencycontactmobilenumber == null) {
            return getCustomerFullName.g;
        }
        realmSet$emergencyContactOfficeExt realmset_emergencycontactofficeext = realmSet$emergencyContactOfficeExt.UNKNOWN;
        int ordinal = realmset_emergencycontactmobilenumber.e().ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        } else if (ordinal == 1) {
            return realmset_emergencycontactmobilenumber.b() ? new getEmergencyContactMobileNumber(realmset_emergencycontactmobilenumber.i()) : getCustomerFullName.f144o;
        } else {
            if (ordinal == 2) {
                return realmset_emergencycontactmobilenumber.g() ? new getCreditCardSupplements(Double.valueOf(realmset_emergencycontactmobilenumber.h())) : new getCreditCardSupplements(null);
            }
            if (ordinal == 3) {
                return realmset_emergencycontactmobilenumber.j() ? new getCurrCompanyName(Boolean.valueOf(realmset_emergencycontactmobilenumber.f())) : new getCurrCompanyName(null);
            }
            if (ordinal == 4) {
                List<realmSet$emergencyContactMobileNumber> c = realmset_emergencycontactmobilenumber.c();
                ArrayList arrayList = new ArrayList();
                for (realmSet$emergencyContactMobileNumber realmset_emergencycontactmobilenumber2 : c) {
                    arrayList.add(a(realmset_emergencycontactmobilenumber2));
                }
                return new getCustomerName(realmset_emergencycontactmobilenumber.a(), arrayList);
            }
            String valueOf = String.valueOf(realmset_emergencycontactmobilenumber);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Invalid entity: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static getCustomerFullName e(Object obj) {
        if (obj == null) {
            return getCustomerFullName.h;
        }
        if (obj instanceof String) {
            return new getEmergencyContactMobileNumber((String) obj);
        }
        if (obj instanceof Double) {
            return new getCreditCardSupplements((Double) obj);
        }
        if (obj instanceof Long) {
            return new getCreditCardSupplements(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new getCreditCardSupplements(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new getCurrCompanyName((Boolean) obj);
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
