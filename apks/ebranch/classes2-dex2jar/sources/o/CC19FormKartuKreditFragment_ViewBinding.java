package o;

import com.google.zxing.WriterException;
import io.realm.RealmFieldTypeConstants;
/* loaded from: classes2-dex2jar.jar:o/CC19FormKartuKreditFragment_ViewBinding.class */
final class CC19FormKartuKreditFragment_ViewBinding {
    private static final int[][] e = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] a = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, RealmFieldTypeConstants.LIST_OFFSET, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static void a(int i, int i2, CC18FormKartuKreditFragment cC18FormKartuKreditFragment) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (cC18FormKartuKreditFragment.e[i2][i4] == -1) {
                cC18FormKartuKreditFragment.e[i2][i4] = (byte) ((byte) 0);
            } else {
                throw new WriterException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(SubscribeExpired subscribeExpired, CC17FormKartuKreditFragment_ViewBinding cC17FormKartuKreditFragment_ViewBinding, SubscribeExpiredDate subscribeExpiredDate, int i, CC18FormKartuKreditFragment cC18FormKartuKreditFragment) throws WriterException {
        for (int i2 = 0; i2 < cC18FormKartuKreditFragment.b; i2++) {
            for (int i3 = 0; i3 < cC18FormKartuKreditFragment.c; i3++) {
                cC18FormKartuKreditFragment.e[i2][i3] = (byte) -1;
            }
        }
        int length = e[0].length;
        b(0, 0, cC18FormKartuKreditFragment);
        b(cC18FormKartuKreditFragment.c - length, 0, cC18FormKartuKreditFragment);
        b(0, cC18FormKartuKreditFragment.c - length, cC18FormKartuKreditFragment);
        a(0, 7, cC18FormKartuKreditFragment);
        a(cC18FormKartuKreditFragment.c - 8, 7, cC18FormKartuKreditFragment);
        a(0, cC18FormKartuKreditFragment.c - 8, cC18FormKartuKreditFragment);
        d(7, 0, cC18FormKartuKreditFragment);
        d((cC18FormKartuKreditFragment.b - 7) - 1, 0, cC18FormKartuKreditFragment);
        d(7, cC18FormKartuKreditFragment.b - 7, cC18FormKartuKreditFragment);
        if (cC18FormKartuKreditFragment.e[cC18FormKartuKreditFragment.b - 8][8] != 0) {
            cC18FormKartuKreditFragment.e[cC18FormKartuKreditFragment.b - 8][8] = (byte) ((byte) 1);
            if (subscribeExpiredDate.b >= 2) {
                int[] iArr = a[subscribeExpiredDate.b - 1];
                for (int i4 : iArr) {
                    for (int i5 : iArr) {
                        if (!(i5 == -1 || i4 == -1)) {
                            if (cC18FormKartuKreditFragment.e[i4][i5] == -1) {
                                for (int i6 = 0; i6 < 5; i6++) {
                                    for (int i7 = 0; i7 < 5; i7++) {
                                        cC18FormKartuKreditFragment.e[(i4 - 2) + i6][(i5 - 2) + i7] = (byte) ((byte) c[i6][i7]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i8 = 8;
            while (i8 < cC18FormKartuKreditFragment.c - 8) {
                int i9 = i8 + 1;
                int i10 = i9 % 2;
                if (cC18FormKartuKreditFragment.e[6][i8] == -1) {
                    cC18FormKartuKreditFragment.e[6][i8] = (byte) ((byte) i10);
                }
                if (cC18FormKartuKreditFragment.e[i8][6] == -1) {
                    cC18FormKartuKreditFragment.e[i8][6] = (byte) ((byte) i10);
                }
                i8 = i9;
            }
            SubscribeExpired subscribeExpired2 = new SubscribeExpired();
            if (i >= 0 && i < 8) {
                int i11 = (cC17FormKartuKreditFragment_ViewBinding.d << 3) | i;
                subscribeExpired2.a(i11, 5);
                subscribeExpired2.a(e(i11, 1335), 10);
                SubscribeExpired subscribeExpired3 = new SubscribeExpired();
                subscribeExpired3.a(21522, 15);
                if (subscribeExpired2.d == subscribeExpired3.d) {
                    int i12 = 0;
                    while (true) {
                        int[] iArr2 = subscribeExpired2.a;
                        if (i12 >= iArr2.length) {
                            break;
                        }
                        iArr2[i12] = iArr2[i12] ^ subscribeExpired3.a[i12];
                        i12++;
                    }
                    if (subscribeExpired2.d == 15) {
                        for (int i13 = 0; i13 < subscribeExpired2.d; i13++) {
                            int i14 = (subscribeExpired2.d - 1) - i13;
                            int i15 = (subscribeExpired2.a[i14 / 32] & (1 << (i14 & 31))) != 0 ? 1 : 0;
                            int[] iArr3 = d[i13];
                            int i16 = iArr3[0];
                            byte[] bArr = cC18FormKartuKreditFragment.e[iArr3[1]];
                            byte b = (byte) i15;
                            bArr[i16] = (byte) b;
                            if (i13 < 8) {
                                cC18FormKartuKreditFragment.e[8][(cC18FormKartuKreditFragment.c - i13) - 1] = (byte) b;
                            } else {
                                cC18FormKartuKreditFragment.e[(cC18FormKartuKreditFragment.b - 7) + (i13 - 8)][8] = (byte) b;
                            }
                        }
                        d(subscribeExpiredDate, cC18FormKartuKreditFragment);
                        c(subscribeExpired, i, cC18FormKartuKreditFragment);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("should not happen but we got: ");
                    sb.append(subscribeExpired2.d);
                    throw new WriterException(sb.toString());
                }
                throw new IllegalArgumentException("Sizes don't match");
            }
            throw new WriterException("Invalid mask pattern");
        }
        throw new WriterException();
    }

    private static void b(int i, int i2, CC18FormKartuKreditFragment cC18FormKartuKreditFragment) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                cC18FormKartuKreditFragment.e[i2 + i3][i + i4] = (byte) ((byte) e[i3][i4]);
            }
        }
    }

    private static void c(SubscribeExpired subscribeExpired, int i, CC18FormKartuKreditFragment cC18FormKartuKreditFragment) throws WriterException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = cC18FormKartuKreditFragment.c - 1;
        int i8 = cC18FormKartuKreditFragment.b - 1;
        int i9 = 0;
        int i10 = -1;
        while (i7 > 0) {
            int i11 = i7;
            int i12 = i8;
            int i13 = i9;
            if (i7 == 6) {
                i11 = i7 - 1;
                i13 = i9;
                i12 = i8;
            }
            while (i12 >= 0 && i12 < cC18FormKartuKreditFragment.b) {
                int i14 = i13;
                for (int i15 = 0; i15 < 2; i15++) {
                    int i16 = i11 - i15;
                    i14 = i14;
                    if (cC18FormKartuKreditFragment.e[i12][i16] == -1) {
                        if (i14 < subscribeExpired.d) {
                            i2 = ((1 << (i14 & 31)) & subscribeExpired.a[i14 / 32]) != 0 ? 1 : 0;
                            i14++;
                        } else {
                            i2 = 0;
                        }
                        int i17 = i2;
                        if (i != -1) {
                            switch (i) {
                                case 0:
                                    i6 = i12;
                                    i5 = i16;
                                    i4 = i6 + i5;
                                    i3 = i4 & 1;
                                    break;
                                case 1:
                                    i4 = i12;
                                    i3 = i4 & 1;
                                    break;
                                case 2:
                                    i3 = i16 % 3;
                                    break;
                                case 3:
                                    i3 = (i12 + i16) % 3;
                                    break;
                                case 4:
                                    i6 = i12 / 2;
                                    i5 = i16 / 3;
                                    i4 = i6 + i5;
                                    i3 = i4 & 1;
                                    break;
                                case 5:
                                    int i18 = i12 * i16;
                                    i3 = (i18 % 3) + (i18 & 1);
                                    break;
                                case 6:
                                    int i19 = i12 * i16;
                                    i4 = (i19 % 3) + (i19 & 1);
                                    i3 = i4 & 1;
                                    break;
                                case 7:
                                    i6 = (i12 * i16) % 3;
                                    i5 = (i12 + i16) & 1;
                                    i4 = i6 + i5;
                                    i3 = i4 & 1;
                                    break;
                                default:
                                    StringBuilder sb = new StringBuilder("Invalid mask pattern: ");
                                    sb.append(i);
                                    throw new IllegalArgumentException(sb.toString());
                            }
                            boolean z = i3 == 0;
                            i17 = i2;
                            if (z) {
                                i17 = i2 ^ 1;
                            }
                        }
                        cC18FormKartuKreditFragment.e[i12][i16] = (byte) ((byte) i17);
                    }
                }
                i12 += i10;
                i13 = i14;
            }
            i10 = -i10;
            i8 = i12 + i10;
            i7 = i11 - 2;
            i9 = i13;
        }
        if (i9 != subscribeExpired.d) {
            StringBuilder sb2 = new StringBuilder("Not all bits consumed: ");
            sb2.append(i9);
            sb2.append('/');
            sb2.append(subscribeExpired.d);
            throw new WriterException(sb2.toString());
        }
    }

    private static void d(int i, int i2, CC18FormKartuKreditFragment cC18FormKartuKreditFragment) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (cC18FormKartuKreditFragment.e[i4][i] == -1) {
                cC18FormKartuKreditFragment.e[i4][i] = (byte) ((byte) 0);
            } else {
                throw new WriterException();
            }
        }
    }

    private static void d(SubscribeExpiredDate subscribeExpiredDate, CC18FormKartuKreditFragment cC18FormKartuKreditFragment) throws WriterException {
        if (subscribeExpiredDate.b >= 7) {
            SubscribeExpired subscribeExpired = new SubscribeExpired();
            subscribeExpired.a(subscribeExpiredDate.b, 6);
            subscribeExpired.a(e(subscribeExpiredDate.b, 7973), 12);
            if (subscribeExpired.d == 18) {
                int i = 17;
                for (int i2 = 0; i2 < 6; i2++) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        int i4 = 1;
                        if (((1 << (i & 31)) & subscribeExpired.a[i / 32]) == 0) {
                            i4 = 0;
                        }
                        i--;
                        byte b = (byte) i4;
                        cC18FormKartuKreditFragment.e[(cC18FormKartuKreditFragment.b - 11) + i3][i2] = (byte) b;
                        cC18FormKartuKreditFragment.e[i2][(cC18FormKartuKreditFragment.b - 11) + i3] = (byte) b;
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder("should not happen but we got: ");
            sb.append(subscribeExpired.d);
            throw new WriterException(sb.toString());
        }
    }

    private static int e(int i, int i2) {
        if (i2 != 0) {
            int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i2);
            int i3 = i << (numberOfLeadingZeros - 1);
            while (32 - Integer.numberOfLeadingZeros(i3) >= numberOfLeadingZeros) {
                i3 ^= i2 << ((32 - Integer.numberOfLeadingZeros(i3)) - numberOfLeadingZeros);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }
}
