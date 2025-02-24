package o;

import java.io.UnsupportedEncodingException;
/* loaded from: classes2-dex2jar.jar:o/setResponseImageData.class */
final class setResponseImageData {
    private static final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    private static String b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) << 2];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int i3 = i + 1;
            bArr3[i] = (byte) bArr2[(bArr[i2] & 255) >> 2];
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            bArr3[i3] = (byte) bArr2[((bArr[i2] & 3) << 4) | ((bArr[i5] & 255) >> 4)];
            int i6 = i4 + 1;
            byte b2 = bArr[i5];
            int i7 = i2 + 2;
            bArr3[i4] = (byte) bArr2[((b2 & 15) << 2) | ((bArr[i7] & 255) >> 6)];
            i = i6 + 1;
            bArr3[i6] = (byte) bArr2[bArr[i7] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i8 = i + 1;
            bArr3[i] = (byte) bArr2[(bArr[length] & 255) >> 2];
            int i9 = i8 + 1;
            bArr3[i8] = (byte) bArr2[(bArr[length] & 3) << 4];
            bArr3[i9] = (byte) 61;
            bArr3[i9 + 1] = (byte) 61;
        } else if (length2 == 2) {
            int i10 = i + 1;
            bArr3[i] = (byte) bArr2[(bArr[length] & 255) >> 2];
            int i11 = i10 + 1;
            int i12 = length + 1;
            bArr3[i10] = (byte) bArr2[((bArr[length] & 3) << 4) | ((bArr[i12] & 255) >> 4)];
            bArr3[i11] = (byte) bArr2[(bArr[i12] & 15) << 2];
            bArr3[i11 + 1] = (byte) 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] c(String str) {
        int i;
        int i2;
        int length = str.length();
        while (length > 0 && ((r0 = str.charAt(length - 1)) == '=' || r0 == '\n' || r0 == '\r' || r0 == ' ' || r0 == '\t')) {
            length--;
        }
        int i3 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (charAt >= 'A' && charAt <= 'Z') {
                i2 = charAt - 'A';
            } else if (charAt >= 'a' && charAt <= 'z') {
                i2 = charAt - 'G';
            } else if (charAt >= '0' && charAt <= '9') {
                i2 = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i2 = 62;
            } else if (charAt == '/' || charAt == '_') {
                i2 = 63;
            } else {
                i4 = i4;
                i5 = i5;
                i6 = i6;
                if (charAt != '\n') {
                    i4 = i4;
                    i5 = i5;
                    i6 = i6;
                    if (charAt != '\r') {
                        i4 = i4;
                        i5 = i5;
                        i6 = i6;
                        if (charAt == ' ') {
                            continue;
                        } else if (charAt != '\t') {
                            return null;
                        } else {
                            i4 = i4;
                            i5 = i5;
                            i6 = i6;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            int i8 = ((byte) i2) | (i6 << 6);
            int i9 = i4 + 1;
            i4 = i9;
            i5 = i5;
            i6 = i8;
            if (i9 % 4 == 0) {
                int i10 = i5 + 1;
                bArr[i5] = (byte) ((byte) (i8 >> 16));
                int i11 = i10 + 1;
                bArr[i10] = (byte) ((byte) (i8 >> 8));
                bArr[i11] = (byte) ((byte) i8);
                i5 = i11 + 1;
                i6 = i8;
                i4 = i9;
            }
        }
        int i12 = i4 % 4;
        if (i12 == 1) {
            return null;
        }
        if (i12 == 2) {
            bArr[i5] = (byte) ((byte) ((i6 << 12) >> 16));
            i = i5 + 1;
        } else {
            i = i5;
            if (i12 == 3) {
                int i13 = i6 << 6;
                int i14 = i5 + 1;
                bArr[i5] = (byte) ((byte) (i13 >> 16));
                i = i14 + 1;
                bArr[i14] = (byte) ((byte) (i13 >> 8));
            }
        }
        if (i == i3) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public static String e(byte[] bArr) {
        return b(bArr, a);
    }
}
