package o;

import com.google.android.gms.internal.measurement.zzkn;
import io.realm.internal.Property;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$supplementCardOptions.class */
public final class realmSet$supplementCardOptions {
    private static final realmSet$relationship b;

    static {
        if (realmGet$jobSector.a() && realmGet$jobSector.c()) {
            int i = setBirthDate.c;
        }
        b = new realmSet$relationship() { // from class: o.realmSet$jobSector
            @Override // o.realmSet$relationship
            final int a(int i2, byte[] bArr, int i3, int i4) {
                int i5;
                while (i3 < i4 && bArr[i3] >= 0) {
                    i3++;
                }
                int i6 = i3;
                if (i3 >= i4) {
                    i5 = 0;
                } else {
                    while (true) {
                        if (i6 < i4) {
                            int i7 = i6 + 1;
                            byte b2 = bArr[i6];
                            i6 = i7;
                            if (b2 < 0) {
                                if (b2 >= -32) {
                                    if (b2 >= -16) {
                                        if (i7 < i4 - 2) {
                                            int i8 = i7 + 1;
                                            byte b3 = bArr[i7];
                                            if (b3 > -65 || (((b2 << 28) + (b3 + 112)) >> 30) != 0) {
                                                break;
                                            }
                                            int i9 = i8 + 1;
                                            if (bArr[i8] > -65) {
                                                break;
                                            }
                                            i6 = i9 + 1;
                                            if (bArr[i9] > -65) {
                                                break;
                                            }
                                        } else {
                                            i5 = realmSet$supplementCardOptions.d(bArr, i7, i4);
                                            break;
                                        }
                                    } else if (i7 < i4 - 1) {
                                        int i10 = i7 + 1;
                                        byte b4 = bArr[i7];
                                        if (b4 > -65 || ((b2 == -32 && b4 < -96) || (b2 == -19 && b4 >= -96))) {
                                            break;
                                        }
                                        i6 = i10 + 1;
                                        if (bArr[i10] > -65) {
                                            break;
                                        }
                                    } else {
                                        i5 = realmSet$supplementCardOptions.d(bArr, i7, i4);
                                        break;
                                    }
                                } else if (i7 < i4) {
                                    if (b2 < -62) {
                                        break;
                                    }
                                    i6 = i7 + 1;
                                    if (bArr[i7] > -65) {
                                        break;
                                    }
                                } else {
                                    i5 = b2;
                                    break;
                                }
                            }
                        } else {
                            i5 = 0;
                            break;
                        }
                    }
                    i5 = -1;
                }
                return i5;
            }
        };
    }

    public static int a(CharSequence charSequence) {
        int i;
        int i2;
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length && charSequence.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            i = i5;
            if (i4 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                int length2 = charSequence.length();
                while (i4 < length2) {
                    char charAt2 = charSequence.charAt(i4);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                        i2 = i4;
                    } else {
                        int i6 = i3 + 2;
                        i3 = i6;
                        i2 = i4;
                        if (charAt2 >= 55296) {
                            i3 = i6;
                            i2 = i4;
                            if (charAt2 > 57343) {
                                continue;
                            } else if (Character.codePointAt(charSequence, i4) >= 65536) {
                                i2 = i4 + 1;
                                i3 = i6;
                            } else {
                                throw new realmSet$supplementCardLimit(i4, length2);
                            }
                        } else {
                            continue;
                        }
                    }
                    i4 = i2 + 1;
                }
                i = i5 + i3;
            }
        }
        if (i >= length) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String c(byte[] bArr, int i, int i2) throws zzkn {
        int i3;
        int i4;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i5 = i + i2;
            char[] cArr = new char[i2];
            int i6 = 0;
            int i7 = i;
            while (true) {
                i3 = i6;
                i4 = i7;
                if (i7 >= i5) {
                    break;
                }
                byte b2 = bArr[i7];
                if (!setJobSector.b(b2)) {
                    i3 = i6;
                    i4 = i7;
                    break;
                }
                i7++;
                cArr[i6] = (char) ((char) b2);
                i6++;
            }
            while (i4 < i5) {
                int i8 = i4 + 1;
                byte b3 = bArr[i4];
                if (setJobSector.b(b3)) {
                    int i9 = i3 + 1;
                    cArr[i3] = (char) ((char) b3);
                    while (true) {
                        i3 = i9;
                        i4 = i8;
                        if (i8 < i5) {
                            byte b4 = bArr[i8];
                            if (!setJobSector.b(b4)) {
                                i3 = i9;
                                i4 = i8;
                                break;
                            }
                            i8++;
                            i9++;
                            cArr[i9] = (char) ((char) b4);
                        }
                    }
                } else {
                    if (b3 < -32) {
                        if (i8 < i5) {
                            setJobSector.a(b3, bArr[i8], cArr, i3);
                            i4 = i8 + 1;
                        } else {
                            throw zzkn.j();
                        }
                    } else if (b3 < -16) {
                        if (i8 < i5 - 1) {
                            int i10 = i8 + 1;
                            setJobSector.d(b3, bArr[i8], bArr[i10], cArr, i3);
                            i4 = i10 + 1;
                        } else {
                            throw zzkn.j();
                        }
                    } else if (i8 < i5 - 2) {
                        int i11 = i8 + 1;
                        int i12 = i11 + 1;
                        setJobSector.c(b3, bArr[i8], bArr[i11], bArr[i12], cArr, i3);
                        i3 += 2;
                        i4 = i12 + 1;
                    } else {
                        throw zzkn.j();
                    }
                    i3++;
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static boolean c(byte[] bArr) {
        return b.a(bArr, 0, bArr.length);
    }

    public static int d(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) ((byte) charAt);
            i7++;
        }
        if (i7 == length) {
            i3 = i + length;
        } else {
            int i8 = i + i7;
            int i9 = i7;
            while (true) {
                i3 = i8;
                if (i9 >= length) {
                    break;
                }
                char charAt2 = charSequence.charAt(i9);
                if (charAt2 < 128 && i8 < i6) {
                    i8++;
                    bArr[i8] = (byte) ((byte) charAt2);
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i10 = i8 + 1;
                    bArr[i8] = (byte) ((byte) ((charAt2 >>> 6) | 960));
                    i8 = i10 + 1;
                    bArr[i10] = (byte) ((byte) ((charAt2 & '?') | Property.TYPE_ARRAY));
                } else if ((charAt2 < 55296 || charAt2 > 57343) && i8 <= i6 - 3) {
                    int i11 = i8 + 1;
                    bArr[i8] = (byte) ((byte) ((charAt2 >>> '\f') | 480));
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) ((byte) (((charAt2 >>> 6) & 63) | Property.TYPE_ARRAY));
                    i8 = i12 + 1;
                    bArr[i12] = (byte) ((byte) ((charAt2 & '?') | Property.TYPE_ARRAY));
                } else if (i8 <= i6 - 4) {
                    int i13 = i9 + 1;
                    if (i13 == charSequence.length()) {
                        break;
                    }
                    char charAt3 = charSequence.charAt(i13);
                    if (!Character.isSurrogatePair(charAt2, charAt3)) {
                        i9 = i13;
                        break;
                    }
                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                    int i14 = i8 + 1;
                    bArr[i8] = (byte) ((byte) ((codePoint >>> 18) | 240));
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) ((byte) (((codePoint >>> 12) & 63) | Property.TYPE_ARRAY));
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) ((byte) (((codePoint >>> 6) & 63) | Property.TYPE_ARRAY));
                    i8 = i16 + 1;
                    bArr[i16] = (byte) ((byte) ((codePoint & 63) | Property.TYPE_ARRAY));
                    i9 = i13;
                } else if (charAt2 < 55296 || charAt2 > 57343 || ((i4 = i9 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Failed writing ");
                    sb.append(charAt2);
                    sb.append(" at index ");
                    sb.append(i8);
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                } else {
                    throw new realmSet$supplementCardLimit(i9, length);
                }
                i9++;
            }
            throw new realmSet$supplementCardLimit(i9 - 1, length);
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (r0 > -12) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ int d(byte[] r4, int r5, int r6) {
        /*
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r7 = r0
            r0 = r6
            r1 = r5
            int r0 = r0 - r1
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x006b
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L_0x004e
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L_0x0046
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            r6 = r0
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r5 = r0
            r0 = r7
            r1 = -12
            if (r0 > r1) goto L_0x0073
            r0 = r6
            r1 = -65
            if (r0 > r1) goto L_0x0073
            r0 = r5
            r1 = -65
            if (r0 <= r1) goto L_0x0037
            goto L_0x0073
        L_0x0037:
            r0 = r6
            r1 = 8
            int r0 = r0 << r1
            r1 = r7
            r0 = r0 ^ r1
            r1 = r5
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 ^ r1
            r5 = r0
            goto L_0x0075
        L_0x0046:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L_0x004e:
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            r5 = r0
            r0 = r7
            r1 = -12
            if (r0 > r1) goto L_0x0073
            r0 = r5
            r1 = -65
            if (r0 <= r1) goto L_0x0061
            goto L_0x0073
        L_0x0061:
            r0 = r7
            r1 = r5
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 ^ r1
            r5 = r0
            goto L_0x0075
        L_0x006b:
            r0 = r7
            r5 = r0
            r0 = r7
            r1 = -12
            if (r0 <= r1) goto L_0x0075
        L_0x0073:
            r0 = -1
            r5 = r0
        L_0x0075:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$supplementCardOptions.d(byte[], int, int):int");
    }

    public static boolean e(byte[] bArr, int i, int i2) {
        return b.a(bArr, i, i2);
    }
}
