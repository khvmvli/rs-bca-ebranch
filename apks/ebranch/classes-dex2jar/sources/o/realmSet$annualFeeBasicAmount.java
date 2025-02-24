package o;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes-dex2jar.jar:o/realmSet$annualFeeBasicAmount.class */
final class realmSet$annualFeeBasicAmount {
    private static final realmSet$incomeDisplayAmount<?, ?> a;
    private static final realmSet$incomeDisplayAmount<?, ?> b;
    private static final Class<?> c;
    private static final realmSet$incomeDisplayAmount<?, ?> d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            cls = null;
        }
        c = cls;
        a = c(false);
        d = c(true);
        b = new CreditCardSupplement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<?> list, realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int a2 = setCustomerName.a(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            a2 += obj instanceof setPreferredMailingAddress ? setCustomerName.e((setPreferredMailingAddress) obj) : setCustomerName.d((realmGet$cardDescription) obj, realmset_annualfeebasicdisplayamount);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * setCustomerName.a(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof setTotalDependent)) {
            int i4 = 0;
            while (true) {
                i = i2;
                if (i4 >= size) {
                    break;
                }
                long longValue = list.get(i4).longValue();
                i2 += setCustomerName.b((longValue + longValue) ^ (longValue >> 63));
                i4++;
            }
        } else {
            setTotalDependent settotaldependent = (setTotalDependent) list;
            int i5 = 0;
            while (true) {
                i = i3;
                if (i5 >= size) {
                    break;
                }
                long d2 = settotaldependent.d(i5);
                i3 += setCustomerName.b((d2 + d2) ^ (d2 >> 63));
                i5++;
            }
        }
        return i;
    }

    public static void a(int i, List<Long> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.k(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void a(realmGet$annualFeeAddOnDisplayAmount realmget_annualfeeaddondisplayamount, T t, T t2, long j) {
        realmGet$jobSector.e(t, j, realmGet$annualFeeAddOnDisplayAmount.d(realmGet$jobSector.f(t, j), realmGet$jobSector.f(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, Object obj, realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount) {
        if (!(obj instanceof setPreferredMailingAddress)) {
            return setCustomerName.h(i << 3) + setCustomerName.d((realmGet$cardDescription) obj, realmset_annualfeebasicdisplayamount);
        }
        int h = setCustomerName.h(i << 3);
        int a2 = ((setPreferredMailingAddress) obj).a();
        return h + setCustomerName.h(a2) + a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<setCurrOfficePostCode> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int a2 = size * setCustomerName.a(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            a2 += setCustomerName.d(list.get(i2));
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a(list) + (size * setCustomerName.a(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof setIdentityCardNumber)) {
            int i4 = 0;
            while (true) {
                i = i2;
                if (i4 >= size) {
                    break;
                }
                i2 += setCustomerName.d(list.get(i4).intValue());
                i4++;
            }
        } else {
            setIdentityCardNumber setidentitycardnumber = (setIdentityCardNumber) list;
            int i5 = 0;
            while (true) {
                i = i3;
                if (i5 >= size) {
                    break;
                }
                i3 += setCustomerName.d(setidentitycardnumber.a(i5));
                i5++;
            }
        }
        return i;
    }

    static <UT, UB> UB b(int i, int i2, UB ub, realmSet$incomeDisplayAmount<UT, UB> realmset_incomedisplayamount) {
        UB ub2 = ub;
        if (ub == null) {
            ub2 = realmset_incomedisplayamount.b();
        }
        realmset_incomedisplayamount.d(ub2, i, (long) i2);
        return ub2;
    }

    public static realmSet$incomeDisplayAmount<?, ?> b() {
        return d;
    }

    public static void b(int i, List<?> list, setEmergencyContactOfficeExt setemergencycontactofficeext, realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount) throws IOException {
        if (!(list == null || list.isEmpty())) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                setemergencycontactofficeext.c(i, list.get(i2), realmset_annualfeebasicdisplayamount);
            }
        }
    }

    public static void b(int i, List<Double> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.a(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void b(realmSet$incomeDisplayAmount<UT, UB> realmset_incomedisplayamount, T t, T t2) {
        realmset_incomedisplayamount.c(t, realmset_incomedisplayamount.b(realmset_incomedisplayamount.a(t), realmset_incomedisplayamount.a(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, List<?> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int a2 = setCustomerName.a(i) * size;
        int i5 = a2;
        if (!(list instanceof setReferalCode)) {
            while (true) {
                i2 = i5;
                if (i3 >= size) {
                    break;
                }
                Object obj = list.get(i3);
                i5 += obj instanceof setCurrOfficePostCode ? setCustomerName.d((setCurrOfficePostCode) obj) : setCustomerName.e((String) obj);
                i3++;
            }
        } else {
            setReferalCode setreferalcode = (setReferalCode) list;
            int i6 = a2;
            while (true) {
                i2 = i6;
                if (i4 >= size) {
                    break;
                }
                Object b2 = setreferalcode.b(i4);
                i6 += b2 instanceof setCurrOfficePostCode ? setCustomerName.d((setCurrOfficePostCode) b2) : setCustomerName.e((String) b2);
                i4++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * setCustomerName.a(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof setTotalDependent)) {
            int i4 = 0;
            while (true) {
                i = i2;
                if (i4 >= size) {
                    break;
                }
                i2 += setCustomerName.b(list.get(i4).longValue());
                i4++;
            }
        } else {
            setTotalDependent settotaldependent = (setTotalDependent) list;
            int i5 = 0;
            while (true) {
                i = i3;
                if (i5 >= size) {
                    break;
                }
                i3 += setCustomerName.b(settotaldependent.d(i5));
                i5++;
            }
        }
        return i;
    }

    private static realmSet$incomeDisplayAmount<?, ?> c(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (realmSet$incomeDisplayAmount) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable th2) {
            return null;
        }
    }

    public static void c(int i, List<?> list, setEmergencyContactOfficeExt setemergencycontactofficeext, realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount) throws IOException {
        if (!(list == null || list.isEmpty())) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                setemergencycontactofficeext.b(i, list.get(i2), realmset_annualfeebasicdisplayamount);
            }
        }
    }

    public static void c(int i, List<Float> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.c(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, List<realmGet$cardDescription> list, realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += setCustomerName.c(i, list.get(i3), realmset_annualfeebasicdisplayamount);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return c(list) + (list.size() * setCustomerName.a(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof setTotalDependent)) {
            int i4 = 0;
            while (true) {
                i = i2;
                if (i4 >= size) {
                    break;
                }
                i2 += setCustomerName.b(list.get(i4).longValue());
                i4++;
            }
        } else {
            setTotalDependent settotaldependent = (setTotalDependent) list;
            int i5 = 0;
            while (true) {
                i = i3;
                if (i5 >= size) {
                    break;
                }
                i3 += setCustomerName.b(settotaldependent.d(i5));
                i5++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB d(int i, List<Integer> list, setKrisFlyer setkrisflyer, UB ub, realmSet$incomeDisplayAmount<UT, UB> realmset_incomedisplayamount) {
        UB ub2;
        if (setkrisflyer == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (true) {
                ub2 = ub;
                if (!it.hasNext()) {
                    break;
                }
                int intValue = it.next().intValue();
                if (!setkrisflyer.c(intValue)) {
                    ub = (UB) b(i, intValue, ub, realmset_incomedisplayamount);
                    it.remove();
                }
            }
        } else {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = list.get(i3).intValue();
                if (setkrisflyer.c(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub = (UB) b(i, intValue2, ub, realmset_incomedisplayamount);
                }
            }
            if (i2 == size) {
                ub2 = ub;
            } else {
                list.subList(i2, size).clear();
                return ub;
            }
        }
        return ub2;
    }

    public static realmSet$incomeDisplayAmount<?, ?> d() {
        return a;
    }

    public static void d(int i, List<setCurrOfficePostCode> list, setEmergencyContactOfficeExt setemergencycontactofficeext) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.a(i, list);
        }
    }

    public static void d(int i, List<Long> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.n(i, list, z);
        }
    }

    public static void d(Class<?> cls) {
        Class<?> cls2;
        if (!setHmKecamatan.class.isAssignableFrom(cls) && (cls2 = c) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Object obj, Object obj2) {
        boolean z = false;
        if (obj != obj2) {
            if (obj != null) {
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * setCustomerName.a(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof setIdentityCardNumber)) {
            int i4 = 0;
            while (true) {
                i = i2;
                if (i4 >= size) {
                    break;
                }
                i2 += setCustomerName.d(list.get(i4).intValue());
                i4++;
            }
        } else {
            setIdentityCardNumber setidentitycardnumber = (setIdentityCardNumber) list;
            int i5 = 0;
            while (true) {
                i = i3;
                if (i5 >= size) {
                    break;
                }
                i3 += setCustomerName.d(setidentitycardnumber.a(i5));
                i5++;
            }
        }
        return i;
    }

    public static realmSet$incomeDisplayAmount<?, ?> e() {
        return b;
    }

    public static void e(int i, List<String> list, setEmergencyContactOfficeExt setemergencycontactofficeext) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.d(i, list);
        }
    }

    public static void e(int i, List<Long> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.g(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends setFlagAgreeLifeInsurance<FT>> void e(setFlagAgreeDisclosure<FT> setflagagreedisclosure, T t, T t2) {
        setflagagreedisclosure.a(t2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * setCustomerName.a(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof setIdentityCardNumber)) {
            int i4 = 0;
            while (true) {
                i = i2;
                if (i4 >= size) {
                    break;
                }
                i2 += setCustomerName.h(list.get(i4).intValue());
                i4++;
            }
        } else {
            setIdentityCardNumber setidentitycardnumber = (setIdentityCardNumber) list;
            int i5 = 0;
            while (true) {
                i = i3;
                if (i5 >= size) {
                    break;
                }
                i3 += setCustomerName.h(setidentitycardnumber.a(i5));
                i5++;
            }
        }
        return i;
    }

    public static void f(int i, List<Long> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.i(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (setCustomerName.h(i << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<?> list) {
        return list.size();
    }

    public static void g(int i, List<Integer> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.j(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + (size * setCustomerName.a(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(List<?> list) {
        return list.size() * 4;
    }

    public static void h(int i, List<Long> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.o(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (setCustomerName.h(i << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static void i(int i, List<Integer> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.b(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (setCustomerName.h(i << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof setIdentityCardNumber)) {
            int i4 = 0;
            while (true) {
                i = i2;
                if (i4 >= size) {
                    break;
                }
                int intValue = list.get(i4).intValue();
                i2 += setCustomerName.h((intValue + intValue) ^ (intValue >> 31));
                i4++;
            }
        } else {
            setIdentityCardNumber setidentitycardnumber = (setIdentityCardNumber) list;
            int i5 = 0;
            while (true) {
                i = i3;
                if (i5 >= size) {
                    break;
                }
                int a2 = setidentitycardnumber.a(i5);
                i3 += setCustomerName.h((a2 + a2) ^ (a2 >> 31));
                i5++;
            }
        }
        return i;
    }

    public static void j(int i, List<Integer> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.h(i, list, z);
        }
    }

    public static void k(int i, List<Integer> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.f(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.m(i, list, z);
        }
    }

    public static void n(int i, List<Integer> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.e(i, list, z);
        }
    }

    public static void o(int i, List<Boolean> list, setEmergencyContactOfficeExt setemergencycontactofficeext, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            setemergencycontactofficeext.d(i, list, z);
        }
    }
}
