package o;

import com.google.zxing.WriterException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import o.SubscribeExpiredDate;
/* loaded from: classes2-dex2jar.jar:o/onClickBankPenerbit.class */
public final class onClickBankPenerbit {
    private static final int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: o.onClickBankPenerbit$4  reason: invalid class name */
    /* loaded from: classes2-dex2jar.jar:o/onClickBankPenerbit$4.class */
    static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[onBankPenerbitEvent.values().length];
            b = iArr;
            try {
                iArr[onBankPenerbitEvent.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[onBankPenerbitEvent.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[onBankPenerbitEvent.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[onBankPenerbitEvent.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    private static SubscribeExpired b(SubscribeExpired subscribeExpired, int i, int i2, int i3) throws WriterException {
        if ((subscribeExpired.d + 7) / 8 == i2) {
            ArrayList<clickTanggalExp> arrayList = new ArrayList(i3);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                if (i7 < i3) {
                    int i8 = i % i3;
                    int i9 = i3 - i8;
                    int i10 = i / i3;
                    int i11 = i2 / i3;
                    int i12 = i11 + 1;
                    int i13 = i10 - i11;
                    int i14 = (i10 + 1) - i12;
                    if (i13 != i14) {
                        throw new WriterException("EC bytes mismatch");
                    } else if (i3 != i9 + i8) {
                        throw new WriterException("RS blocks mismatch");
                    } else if (i == ((i11 + i13) * i9) + ((i12 + i14) * i8)) {
                        if (i7 < i9) {
                            iArr[0] = i11;
                            iArr2[0] = i13;
                        } else {
                            iArr[0] = i12;
                            iArr2[0] = i14;
                        }
                        int i15 = iArr[0];
                        byte[] bArr = new byte[i15];
                        subscribeExpired.b(i4 << 3, bArr, 0, i15);
                        byte[] b2 = b(bArr, iArr2[0]);
                        arrayList.add(new clickTanggalExp(bArr, b2));
                        i5 = Math.max(i5, i15);
                        i6 = Math.max(i6, b2.length);
                        i4 += iArr[0];
                    } else {
                        throw new WriterException("Total bytes mismatch");
                    }
                } else {
                    throw new WriterException("Block ID too large");
                }
            }
            if (i2 == i4) {
                SubscribeExpired subscribeExpired2 = new SubscribeExpired();
                for (int i16 = 0; i16 < i5; i16++) {
                    for (clickTanggalExp clicktanggalexp : arrayList) {
                        byte[] bArr2 = clicktanggalexp.a;
                        if (i16 < bArr2.length) {
                            subscribeExpired2.a(bArr2[i16], 8);
                        }
                    }
                }
                for (int i17 = 0; i17 < i6; i17++) {
                    for (clickTanggalExp clicktanggalexp2 : arrayList) {
                        byte[] bArr3 = clicktanggalexp2.e;
                        if (i17 < bArr3.length) {
                            subscribeExpired2.a(bArr3[i17], 8);
                        }
                    }
                }
                if (i == (subscribeExpired2.d + 7) / 8) {
                    return subscribeExpired2;
                }
                StringBuilder sb = new StringBuilder("Interleaving error: ");
                sb.append(i);
                sb.append(" and ");
                sb.append((subscribeExpired2.d + 7) / 8);
                sb.append(" differ.");
                throw new WriterException(sb.toString());
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    private static SubscribeExpiredDate b(int i, CC17FormKartuKreditFragment_ViewBinding cC17FormKartuKreditFragment_ViewBinding) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            SubscribeExpiredDate d = SubscribeExpiredDate.d(i2);
            if (e(i, d, cC17FormKartuKreditFragment_ViewBinding)) {
                return d;
            }
        }
        throw new WriterException("Data too big");
    }

    private static void b(int i, SubscribeExpired subscribeExpired) throws WriterException {
        int i2 = i << 3;
        if (subscribeExpired.d <= i2) {
            for (int i3 = 0; i3 < 4 && subscribeExpired.d < i2; i3++) {
                subscribeExpired.a(false);
            }
            int i4 = subscribeExpired.d & 7;
            if (i4 > 0) {
                while (i4 < 8) {
                    subscribeExpired.a(false);
                    i4++;
                }
            }
            int i5 = (subscribeExpired.d + 7) / 8;
            for (int i6 = 0; i6 < i - i5; i6++) {
                subscribeExpired.a((i6 & 1) == 0 ? 236 : 17, 8);
            }
            if (subscribeExpired.d != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        StringBuilder sb = new StringBuilder("data bits cannot fit in the QR Code");
        sb.append(subscribeExpired.d);
        sb.append(" > ");
        sb.append(i2);
        throw new WriterException(sb.toString());
    }

    private static void b(int i, SubscribeExpiredDate subscribeExpiredDate, onBankPenerbitEvent onbankpenerbitevent, SubscribeExpired subscribeExpired) throws WriterException {
        int e = onbankpenerbitevent.e(subscribeExpiredDate);
        int i2 = 1 << e;
        if (i < i2) {
            subscribeExpired.a(i, e);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is bigger than ");
        sb.append(i2 - 1);
        throw new WriterException(sb.toString());
    }

    private static byte[] b(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = bArr[i3] & 255;
        }
        CC16FormKartuKreditFragment_ViewBinding cC16FormKartuKreditFragment_ViewBinding = new CC16FormKartuKreditFragment_ViewBinding(CC16FormKartuKreditFragment.f);
        if (i != 0) {
            int i4 = i2 - i;
            if (i4 > 0) {
                if (i >= cC16FormKartuKreditFragment_ViewBinding.b.size()) {
                    List<onClickedHubungan> list = cC16FormKartuKreditFragment_ViewBinding.b;
                    onClickedHubungan onclickedhubungan = list.get(list.size() - 1);
                    for (int size = cC16FormKartuKreditFragment_ViewBinding.b.size(); size <= i; size++) {
                        CC16FormKartuKreditFragment cC16FormKartuKreditFragment = cC16FormKartuKreditFragment_ViewBinding.c;
                        onClickedHubungan onclickedhubungan2 = new onClickedHubungan(cC16FormKartuKreditFragment, new int[]{1, cC16FormKartuKreditFragment.j[(size - 1) + cC16FormKartuKreditFragment.i]});
                        if (onclickedhubungan.a.equals(onclickedhubungan2.a)) {
                            if (!(onclickedhubungan.d[0] == 0)) {
                                if (!(onclickedhubungan2.d[0] == 0)) {
                                    int[] iArr2 = onclickedhubungan.d;
                                    int length2 = iArr2.length;
                                    int[] iArr3 = onclickedhubungan2.d;
                                    int length3 = iArr3.length;
                                    int[] iArr4 = new int[(length2 + length3) - 1];
                                    for (int i5 = 0; i5 < length2; i5++) {
                                        int i6 = iArr2[i5];
                                        for (int i7 = 0; i7 < length3; i7++) {
                                            int i8 = i5 + i7;
                                            iArr4[i8] = CC16FormKartuKreditFragment.b(iArr4[i8], onclickedhubungan.a.d(i6, iArr3[i7]));
                                        }
                                    }
                                    onclickedhubungan = new onClickedHubungan(onclickedhubungan.a, iArr4);
                                    cC16FormKartuKreditFragment_ViewBinding.b.add(onclickedhubungan);
                                }
                            }
                            onclickedhubungan = onclickedhubungan.a.m;
                            cC16FormKartuKreditFragment_ViewBinding.b.add(onclickedhubungan);
                        } else {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                    }
                }
                onClickedHubungan onclickedhubungan3 = cC16FormKartuKreditFragment_ViewBinding.b.get(i);
                int[] iArr5 = new int[i4];
                System.arraycopy(iArr, 0, iArr5, 0, i4);
                int[] iArr6 = new onClickedHubungan(cC16FormKartuKreditFragment_ViewBinding.c, iArr5).e(i, 1).c(onclickedhubungan3)[1].d;
                int length4 = i - iArr6.length;
                for (int i9 = 0; i9 < length4; i9++) {
                    iArr[i4 + i9] = 0;
                }
                System.arraycopy(iArr6, 0, iArr, i4 + length4, iArr6.length);
                byte[] bArr2 = new byte[i];
                for (int i10 = 0; i10 < i; i10++) {
                    bArr2[i10] = (byte) ((byte) iArr[length + i10]);
                }
                return bArr2;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4 A[LOOP:1: B:54:0x0145->B:69:0x01a4, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static o.CC19FormKartuKreditFragment c(java.lang.String r6, o.CC17FormKartuKreditFragment_ViewBinding r7, java.util.Map<o.CC15FormKartuKreditFragment_ViewBinding, ?> r8) throws com.google.zxing.WriterException {
        /*
        // Method dump skipped, instructions count: 834
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onClickBankPenerbit.c(java.lang.String, o.CC17FormKartuKreditFragment_ViewBinding, java.util.Map):o.CC19FormKartuKreditFragment");
    }

    private static void c(CharSequence charSequence, SubscribeExpired subscribeExpired) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                subscribeExpired.a((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    subscribeExpired.a((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    subscribeExpired.a(charAt, 4);
                }
            }
        }
    }

    private static void c(String str, SubscribeExpired subscribeExpired, String str2) throws WriterException {
        try {
            for (byte b2 : str.getBytes(str2)) {
                subscribeExpired.a(b2, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    private static void d(CharSequence charSequence, SubscribeExpired subscribeExpired) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            int[] iArr = b;
            int i2 = charAt < iArr.length ? iArr[charAt] : -1;
            if (i2 != -1) {
                int i3 = i + 1;
                if (i3 < length) {
                    char charAt2 = charSequence.charAt(i3);
                    int[] iArr2 = b;
                    int i4 = charAt2 < iArr2.length ? iArr2[charAt2] : -1;
                    if (i4 != -1) {
                        subscribeExpired.a((i2 * 45) + i4, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    subscribeExpired.a(i2, 6);
                    i = i3;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x017a, code lost:
        if (o.CC20FormKartuKreditFragment.e(r0, r23 + 7, r23 + 11) != false) goto L_0x017d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static int e(o.SubscribeExpired r6, o.CC17FormKartuKreditFragment_ViewBinding r7, o.SubscribeExpiredDate r8, o.CC18FormKartuKreditFragment r9) throws com.google.zxing.WriterException {
        /*
        // Method dump skipped, instructions count: 747
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onClickBankPenerbit.e(o.SubscribeExpired, o.CC17FormKartuKreditFragment_ViewBinding, o.SubscribeExpiredDate, o.CC18FormKartuKreditFragment):int");
    }

    private static boolean e(int i, SubscribeExpiredDate subscribeExpiredDate, CC17FormKartuKreditFragment_ViewBinding cC17FormKartuKreditFragment_ViewBinding) {
        int i2 = subscribeExpiredDate.a;
        SubscribeExpiredDate.RemoteActionCompatParcelizer remoteActionCompatParcelizer = subscribeExpiredDate.d[cC17FormKartuKreditFragment_ViewBinding.ordinal()];
        return i2 - (remoteActionCompatParcelizer.b * remoteActionCompatParcelizer.d()) >= (i + 7) / 8;
    }

    private static boolean e(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }
}
