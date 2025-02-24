package o;

import com.google.android.gms.internal.measurement.zzkn;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setCurrCompanyName.class */
public final class setCurrCompanyName {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, setCreditCardSupplements setcreditcardsupplements) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            setcreditcardsupplements.b = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            setcreditcardsupplements.b = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            setcreditcardsupplements.b = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        int i11 = i10;
        if (b4 >= 0) {
            setcreditcardsupplements.b = i9 | (b4 << 28);
            return i10;
        }
        while (true) {
            int i12 = i11 + 1;
            if (bArr[i11] < 0) {
                i11 = i12;
            } else {
                setcreditcardsupplements.b = i9 | ((b4 & Byte.MAX_VALUE) << 28);
                return i12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, setCreditCardSupplements setcreditcardsupplements) throws zzkn {
        int c = c(bArr, i, setcreditcardsupplements);
        int i2 = setcreditcardsupplements.b;
        if (i2 < 0) {
            throw zzkn.e();
        } else if (i2 == 0) {
            setcreditcardsupplements.e = "";
            return c;
        } else {
            setcreditcardsupplements.e = realmSet$supplementCardOptions.c(bArr, c, i2);
            return c + i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, setMonthlyIncome<?> setmonthlyincome, setCreditCardSupplements setcreditcardsupplements) throws IOException {
        setIdentityCardNumber setidentitycardnumber = (setIdentityCardNumber) setmonthlyincome;
        int c = c(bArr, i, setcreditcardsupplements);
        int i2 = setcreditcardsupplements.b + c;
        while (c < i2) {
            c = c(bArr, c, setcreditcardsupplements);
            setidentitycardnumber.d(setcreditcardsupplements.b);
        }
        if (c == i2) {
            return c;
        }
        throw zzkn.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, byte[] bArr, int i2, int i3, setMonthlyIncome<?> setmonthlyincome, setCreditCardSupplements setcreditcardsupplements) {
        setIdentityCardNumber setidentitycardnumber = (setIdentityCardNumber) setmonthlyincome;
        int c = c(bArr, i2, setcreditcardsupplements);
        setidentitycardnumber.d(setcreditcardsupplements.b);
        while (c < i3) {
            int c2 = c(bArr, c, setcreditcardsupplements);
            if (i != setcreditcardsupplements.b) {
                break;
            }
            c = c(bArr, c2, setcreditcardsupplements);
            setidentitycardnumber.d(setcreditcardsupplements.b);
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount, byte[] bArr, int i, int i2, int i3, setCreditCardSupplements setcreditcardsupplements) throws IOException {
        realmGet$cardName realmget_cardname = (realmGet$cardName) realmset_annualfeebasicdisplayamount;
        Object e = realmget_cardname.e();
        int e2 = realmget_cardname.e(e, bArr, i, i2, i3, setcreditcardsupplements);
        realmget_cardname.b((realmGet$cardName) e);
        setcreditcardsupplements.e = e;
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i, setCreditCardSupplements setcreditcardsupplements) throws zzkn {
        int c = c(bArr, i, setcreditcardsupplements);
        int i2 = setcreditcardsupplements.b;
        if (i2 < 0) {
            throw zzkn.e();
        } else if (i2 == 0) {
            setcreditcardsupplements.e = "";
            return c;
        } else {
            setcreditcardsupplements.e = new String(bArr, c, i2, setNationality.c);
            return c + i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, byte[] bArr, int i2, int i3, getSupplementCardLimit getsupplementcardlimit, setCreditCardSupplements setcreditcardsupplements) throws zzkn {
        int i4;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 == 0) {
                int e = e(bArr, i2, setcreditcardsupplements);
                getsupplementcardlimit.b(i, Long.valueOf(setcreditcardsupplements.c));
                return e;
            } else if (i5 == 1) {
                getsupplementcardlimit.b(i, Long.valueOf(c(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int c = c(bArr, i2, setcreditcardsupplements);
                int i6 = setcreditcardsupplements.b;
                if (i6 < 0) {
                    throw zzkn.e();
                } else if (i6 <= bArr.length - c) {
                    if (i6 == 0) {
                        getsupplementcardlimit.b(i, setCurrOfficePostCode.a);
                    } else {
                        getsupplementcardlimit.b(i, setCurrOfficePostCode.b(bArr, c, i6));
                    }
                    return c + i6;
                } else {
                    throw zzkn.a();
                }
            } else if (i5 == 3) {
                int i7 = (i & -8) | 4;
                getSupplementCardLimit d = getSupplementCardLimit.d();
                int i8 = 0;
                while (true) {
                    i4 = i2;
                    if (i2 >= i3) {
                        break;
                    }
                    i4 = c(bArr, i2, setcreditcardsupplements);
                    i8 = setcreditcardsupplements.b;
                    if (i8 == i7) {
                        break;
                    }
                    i2 = c(i8, bArr, i4, i3, d, setcreditcardsupplements);
                }
                if (i4 > i3 || i8 != i7) {
                    throw zzkn.b();
                }
                getsupplementcardlimit.b(i, d);
                return i4;
            } else if (i5 == 5) {
                getsupplementcardlimit.b(i, Integer.valueOf(e(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzkn.c();
            }
        } else {
            throw zzkn.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount, byte[] bArr, int i, int i2, setCreditCardSupplements setcreditcardsupplements) throws IOException {
        int i3 = i + 1;
        byte b = bArr[i];
        int i4 = i3;
        int i5 = b;
        if (b < 0) {
            i4 = a(b, bArr, i3, setcreditcardsupplements);
            i5 = setcreditcardsupplements.b;
        }
        if (i5 < 0 || i5 > i2 - i4) {
            throw zzkn.a();
        }
        Object e = realmset_annualfeebasicdisplayamount.e();
        int i6 = i5 + i4;
        realmset_annualfeebasicdisplayamount.c(e, bArr, i4, i6, setcreditcardsupplements);
        realmset_annualfeebasicdisplayamount.b(e);
        setcreditcardsupplements.e = e;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(byte[] bArr, int i, setCreditCardSupplements setcreditcardsupplements) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return a(b, bArr, i2, setcreditcardsupplements);
        }
        setcreditcardsupplements.b = b;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long c(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(byte[] bArr, int i, setCreditCardSupplements setcreditcardsupplements) throws zzkn {
        int c = c(bArr, i, setcreditcardsupplements);
        int i2 = setcreditcardsupplements.b;
        if (i2 < 0) {
            throw zzkn.e();
        } else if (i2 > bArr.length - c) {
            throw zzkn.a();
        } else if (i2 == 0) {
            setcreditcardsupplements.e = setCurrOfficePostCode.a;
            return c;
        } else {
            setcreditcardsupplements.e = setCurrOfficePostCode.b(bArr, c, i2);
            return c + i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(realmSet$annualFeeBasicDisplayAmount<?> realmset_annualfeebasicdisplayamount, int i, byte[] bArr, int i2, int i3, setMonthlyIncome<?> setmonthlyincome, setCreditCardSupplements setcreditcardsupplements) throws IOException {
        int c = c(realmset_annualfeebasicdisplayamount, bArr, i2, i3, setcreditcardsupplements);
        setmonthlyincome.add(setcreditcardsupplements.e);
        while (c < i3) {
            int c2 = c(bArr, c, setcreditcardsupplements);
            if (i != setcreditcardsupplements.b) {
                break;
            }
            c = c(realmset_annualfeebasicdisplayamount, bArr, c2, i3, setcreditcardsupplements);
            setmonthlyincome.add(setcreditcardsupplements.e);
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(byte[] bArr, int i, setCreditCardSupplements setcreditcardsupplements) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            int i4 = 7;
            while (b < 0) {
                b = bArr[i3];
                i4 += 7;
                j2 |= ((long) (b & Byte.MAX_VALUE)) << i4;
                i3++;
            }
            setcreditcardsupplements.c = j2;
            return i3;
        }
        setcreditcardsupplements.c = j;
        return i2;
    }
}
