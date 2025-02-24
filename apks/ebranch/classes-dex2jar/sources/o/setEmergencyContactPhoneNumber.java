package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/setEmergencyContactPhoneNumber.class */
public final class setEmergencyContactPhoneNumber {
    private static volatile setEmergencyContactPhoneNumber a;
    private static volatile setEmergencyContactPhoneNumber b;
    static final setEmergencyContactPhoneNumber d = new setEmergencyContactPhoneNumber(true);
    private final Map<setEmergencyContactName, setFlagSubmitSupplement<?, ?>> e;

    setEmergencyContactPhoneNumber() {
        this.e = new HashMap();
    }

    setEmergencyContactPhoneNumber(boolean z) {
        this.e = Collections.emptyMap();
    }

    public static setEmergencyContactPhoneNumber a() {
        setEmergencyContactPhoneNumber setemergencycontactphonenumber = b;
        if (setemergencycontactphonenumber != null) {
            return setemergencycontactphonenumber;
        }
        synchronized (setEmergencyContactPhoneNumber.class) {
            try {
                setEmergencyContactPhoneNumber setemergencycontactphonenumber2 = b;
                if (setemergencycontactphonenumber2 != null) {
                    return setemergencycontactphonenumber2;
                }
                setEmergencyContactPhoneNumber d2 = setFlagReferalCode.d(setEmergencyContactPhoneNumber.class);
                b = d2;
                return d2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static setEmergencyContactPhoneNumber c() {
        setEmergencyContactPhoneNumber setemergencycontactphonenumber = a;
        setEmergencyContactPhoneNumber setemergencycontactphonenumber2 = setemergencycontactphonenumber;
        if (setemergencycontactphonenumber == null) {
            synchronized (setEmergencyContactPhoneNumber.class) {
                try {
                    setEmergencyContactPhoneNumber setemergencycontactphonenumber3 = a;
                    setemergencycontactphonenumber2 = setemergencycontactphonenumber3;
                    if (setemergencycontactphonenumber3 == null) {
                        setemergencycontactphonenumber2 = d;
                        a = setemergencycontactphonenumber2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return setemergencycontactphonenumber2;
    }

    public final <ContainingType extends realmGet$cardDescription> setFlagSubmitSupplement<ContainingType, ?> e(ContainingType containingtype, int i) {
        return (setFlagSubmitSupplement<ContainingType, ?>) this.e.get(new setEmergencyContactName(containingtype, i));
    }
}
