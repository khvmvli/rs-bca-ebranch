package o;

import java.io.IOException;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setEmergencyContactOfficeExt.class */
final class setEmergencyContactOfficeExt {
    private final setCustomerName b;

    private setEmergencyContactOfficeExt(setCustomerName setcustomername) {
        setNationality.e(setcustomername, "output");
        this.b = setcustomername;
        setcustomername.c = this;
    }

    public static setEmergencyContactOfficeExt c(setCustomerName setcustomername) {
        setEmergencyContactOfficeExt setemergencycontactofficeext = setcustomername.c;
        return setemergencycontactofficeext != null ? setemergencycontactofficeext : new setEmergencyContactOfficeExt(setcustomername);
    }

    public final void a(int i) throws IOException {
        this.b.b(i, 4);
    }

    public final void a(int i, double d) throws IOException {
        this.b.b(i, Double.doubleToRawLongBits(d));
    }

    public final void a(int i, float f) throws IOException {
        this.b.c(i, Float.floatToRawIntBits(f));
    }

    public final void a(int i, int i2) throws IOException {
        this.b.c(i, i2);
    }

    public final void a(int i, long j) throws IOException {
        this.b.a(i, j);
    }

    public final void a(int i, List<setCurrOfficePostCode> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.b.e(i, list.get(i2));
        }
    }

    public final void a(int i, List<Double> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).doubleValue();
                i2 += 8;
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.d(Double.doubleToRawLongBits(list.get(i4).doubleValue()));
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.b(i, Double.doubleToRawLongBits(list.get(i5).doubleValue()));
        }
    }

    public final void a(int i, setCurrOfficePostCode setcurrofficepostcode) throws IOException {
        this.b.e(i, setcurrofficepostcode);
    }

    public final void b(int i) throws IOException {
        this.b.b(i, 3);
    }

    public final void b(int i, int i2) throws IOException {
        this.b.c(i, i2);
    }

    public final void b(int i, long j) throws IOException {
        this.b.a(i, (j + j) ^ (j >> 63));
    }

    public final void b(int i, Object obj, realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount) throws IOException {
        setCustomerName setcustomername = this.b;
        setcustomername.b(i, 3);
        realmset_annualfeebasicdisplayamount.b((realmGet$cardDescription) obj, setcustomername.c);
        setcustomername.b(i, 4);
    }

    public final void b(int i, String str) throws IOException {
        this.b.b(i, str);
    }

    public final void b(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                i2 += setCustomerName.h(list.get(i3).intValue());
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.c(list.get(i4).intValue());
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.e(i, list.get(i5).intValue());
        }
    }

    public final void b(int i, boolean z) throws IOException {
        this.b.e(i, z);
    }

    public final void c(int i, int i2) throws IOException {
        this.b.a(i, i2);
    }

    public final void c(int i, long j) throws IOException {
        this.b.b(i, j);
    }

    public final void c(int i, Object obj, realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount) throws IOException {
        realmGet$cardDescription realmget_carddescription = (realmGet$cardDescription) obj;
        setEmergencyContactCity setemergencycontactcity = (setEmergencyContactCity) this.b;
        setemergencycontactcity.c((i << 3) | 2);
        setBcaDebitCardType setbcadebitcardtype = (setBcaDebitCardType) realmget_carddescription;
        int ak = setbcadebitcardtype.ak();
        int i2 = ak;
        if (ak == -1) {
            i2 = realmset_annualfeebasicdisplayamount.c(setbcadebitcardtype);
            setbcadebitcardtype.g(i2);
        }
        setemergencycontactcity.c(i2);
        realmset_annualfeebasicdisplayamount.b(realmget_carddescription, setemergencycontactcity.c);
    }

    public final void c(int i, List<Float> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).floatValue();
                i2 += 4;
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.e(Float.floatToRawIntBits(list.get(i4).floatValue()));
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.c(i, Float.floatToRawIntBits(list.get(i5).floatValue()));
        }
    }

    public final void d(int i, int i2) throws IOException {
        this.b.a(i, i2);
    }

    public final void d(int i, long j) throws IOException {
        this.b.a(i, j);
    }

    public final void d(int i, List<String> list) throws IOException {
        if (list instanceof setReferalCode) {
            setReferalCode setreferalcode = (setReferalCode) list;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object b = setreferalcode.b(i2);
                if (b instanceof String) {
                    this.b.b(i, (String) b);
                } else {
                    this.b.e(i, (setCurrOfficePostCode) b);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.b.b(i, list.get(i3));
        }
    }

    public final void d(int i, List<Boolean> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).booleanValue();
                i2++;
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.d(list.get(i4).booleanValue() ? (byte) 1 : 0);
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.e(i, list.get(i5).booleanValue());
        }
    }

    public final void e(int i, int i2) throws IOException {
        this.b.e(i, i2);
    }

    public final void e(int i, long j) throws IOException {
        this.b.b(i, j);
    }

    public final void e(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                i2 += setCustomerName.d(list.get(i3).intValue());
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.b(list.get(i4).intValue());
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.a(i, list.get(i5).intValue());
        }
    }

    public final void f(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).intValue();
                i2 += 4;
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.e(list.get(i4).intValue());
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.c(i, list.get(i5).intValue());
        }
    }

    public final void g(int i, int i2) throws IOException {
        this.b.e(i, (i2 + i2) ^ (i2 >> 31));
    }

    public final void g(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long longValue = list.get(i3).longValue();
                i2 += setCustomerName.b((longValue + longValue) ^ (longValue >> 63));
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                setCustomerName setcustomername = this.b;
                long longValue2 = list.get(i4).longValue();
                setcustomername.e((longValue2 + longValue2) ^ (longValue2 >> 63));
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            setCustomerName setcustomername2 = this.b;
            long longValue3 = list.get(i5).longValue();
            setcustomername2.a(i, (longValue3 + longValue3) ^ (longValue3 >> 63));
        }
    }

    public final void h(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                i2 += setCustomerName.d(list.get(i3).intValue());
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.b(list.get(i4).intValue());
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.a(i, list.get(i5).intValue());
        }
    }

    public final void i(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).longValue();
                i2 += 8;
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.d(list.get(i4).longValue());
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.b(i, list.get(i5).longValue());
        }
    }

    public final void j(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int intValue = list.get(i3).intValue();
                i2 += setCustomerName.h((intValue + intValue) ^ (intValue >> 31));
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                setCustomerName setcustomername = this.b;
                int intValue2 = list.get(i4).intValue();
                setcustomername.c((intValue2 + intValue2) ^ (intValue2 >> 31));
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            setCustomerName setcustomername2 = this.b;
            int intValue3 = list.get(i5).intValue();
            setcustomername2.e(i, (intValue3 + intValue3) ^ (intValue3 >> 31));
        }
    }

    public final void k(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                i2 += setCustomerName.b(list.get(i3).longValue());
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.e(list.get(i4).longValue());
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.a(i, list.get(i5).longValue());
        }
    }

    public final void m(int i, List<Integer> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).intValue();
                i2 += 4;
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.e(list.get(i4).intValue());
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.c(i, list.get(i5).intValue());
        }
    }

    public final void n(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                i2 += setCustomerName.b(list.get(i3).longValue());
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.e(list.get(i4).longValue());
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.a(i, list.get(i5).longValue());
        }
    }

    public final void o(int i, List<Long> list, boolean z) throws IOException {
        if (z) {
            this.b.b(i, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).longValue();
                i2 += 8;
            }
            this.b.c(i2);
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.b.d(list.get(i4).longValue());
            }
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.b.b(i, list.get(i5).longValue());
        }
    }
}
