package o;

import android.graphics.Path;
import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:o/isConsumed.class */
public final class isConsumed {

    /* loaded from: classes-dex2jar.jar:o/isConsumed$IconCompatParcelizer.class */
    public static class IconCompatParcelizer {
        public char a;
        public float[] c;

        IconCompatParcelizer(char c, float[] fArr) {
            this.a = (char) c;
            this.c = fArr;
        }

        IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this.a = (char) iconCompatParcelizer.a;
            float[] fArr = iconCompatParcelizer.c;
            this.c = isConsumed.b(fArr, 0, fArr.length);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v79, types: [double] */
        /* JADX WARN: Type inference failed for: r43v1 */
        /* JADX WARN: Type inference failed for: r43v2 */
        /* JADX WARN: Type inference failed for: r43v6 */
        /* JADX WARN: Type inference failed for: r43v7 */
        /* JADX WARN: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private static void b(android.graphics.Path r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, boolean r28, boolean r29) {
            /*
            // Method dump skipped, instructions count: 479
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isConsumed.IconCompatParcelizer.b(android.graphics.Path, float, float, float, float, float, float, float, boolean, boolean):void");
        }

        public static void b(IconCompatParcelizer[] iconCompatParcelizerArr, Path path) {
            int i;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float[] fArr = new float[6];
            char c = 'm';
            for (int i2 = 0; i2 < iconCompatParcelizerArr.length; i2++) {
                IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerArr[i2];
                char c2 = iconCompatParcelizer.a;
                float[] fArr2 = iconCompatParcelizer.c;
                float f7 = fArr[0];
                float f8 = fArr[1];
                float f9 = fArr[2];
                float f10 = fArr[3];
                float f11 = fArr[4];
                float f12 = fArr[5];
                switch (c2) {
                    case 'A':
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cs:
                        i = 7;
                        break;
                    case 'C':
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cr:
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cu:
                    case setHasDecor$MediaBrowserCompat$MediaItem.aK:
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case setHasDecor$MediaBrowserCompat$MediaItem.aH:
                        path.close();
                        path.moveTo(f11, f12);
                        f7 = f11;
                        f9 = f7;
                        f8 = f12;
                        f10 = f8;
                    default:
                        i = 2;
                        break;
                }
                int i3 = 0;
                while (i3 < fArr2.length) {
                    if (c2 != 'A') {
                        if (c2 != 'C') {
                            if (c2 == 'H') {
                                path.lineTo(fArr2[i3], f8);
                                f7 = fArr2[i3];
                            } else if (c2 == 'Q') {
                                float f13 = fArr2[i3];
                                int i4 = i3 + 1;
                                float f14 = fArr2[i4];
                                int i5 = i3 + 2;
                                float f15 = fArr2[i5];
                                int i6 = i3 + 3;
                                path.quadTo(f13, f14, f15, fArr2[i6]);
                                f9 = fArr2[i3];
                                f10 = fArr2[i4];
                                f7 = fArr2[i5];
                                f8 = fArr2[i6];
                            } else if (c2 == 'V') {
                                path.lineTo(f7, fArr2[i3]);
                                f8 = fArr2[i3];
                            } else if (c2 != 'a') {
                                if (c2 == 'c') {
                                    float f16 = fArr2[i3];
                                    float f17 = fArr2[i3 + 1];
                                    int i7 = i3 + 2;
                                    float f18 = fArr2[i7];
                                    int i8 = i3 + 3;
                                    float f19 = fArr2[i8];
                                    int i9 = i3 + 4;
                                    int i10 = i3 + 5;
                                    path.rCubicTo(f16, f17, f18, f19, fArr2[i9], fArr2[i10]);
                                    f9 = fArr2[i7] + f7;
                                    f10 = fArr2[i8] + f8;
                                    f7 += fArr2[i9];
                                    f = fArr2[i10];
                                } else if (c2 == 'h') {
                                    path.rLineTo(fArr2[i3], 0.0f);
                                    f7 += fArr2[i3];
                                } else if (c2 != 'q') {
                                    if (c2 == 'v') {
                                        path.rLineTo(0.0f, fArr2[i3]);
                                        f2 = fArr2[i3];
                                    } else if (c2 == 'L') {
                                        float f20 = fArr2[i3];
                                        int i11 = i3 + 1;
                                        path.lineTo(f20, fArr2[i11]);
                                        f7 = fArr2[i3];
                                        f8 = fArr2[i11];
                                    } else if (c2 == 'M') {
                                        f7 = fArr2[i3];
                                        f8 = fArr2[i3 + 1];
                                        if (i3 > 0) {
                                            path.lineTo(f7, f8);
                                        } else {
                                            path.moveTo(f7, f8);
                                            f12 = f8;
                                            f11 = f7;
                                        }
                                    } else if (c2 == 'S') {
                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                            f8 = (f8 * 2.0f) - f10;
                                            f7 = (f7 * 2.0f) - f9;
                                        }
                                        float f21 = fArr2[i3];
                                        int i12 = i3 + 1;
                                        float f22 = fArr2[i12];
                                        int i13 = i3 + 2;
                                        float f23 = fArr2[i13];
                                        int i14 = i3 + 3;
                                        path.cubicTo(f7, f8, f21, f22, f23, fArr2[i14]);
                                        f9 = fArr2[i3];
                                        f10 = fArr2[i12];
                                        f7 = fArr2[i13];
                                        f8 = fArr2[i14];
                                    } else if (c2 == 'T') {
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f7 = (f7 * 2.0f) - f9;
                                            f8 = (f8 * 2.0f) - f10;
                                        }
                                        float f24 = fArr2[i3];
                                        int i15 = i3 + 1;
                                        path.quadTo(f7, f8, f24, fArr2[i15]);
                                        f7 = fArr2[i3];
                                        f8 = fArr2[i15];
                                        f9 = f7;
                                        f10 = f8;
                                    } else if (c2 == 'l') {
                                        float f25 = fArr2[i3];
                                        int i16 = i3 + 1;
                                        path.rLineTo(f25, fArr2[i16]);
                                        f7 += fArr2[i3];
                                        f2 = fArr2[i16];
                                    } else if (c2 == 'm') {
                                        float f26 = fArr2[i3];
                                        f7 += f26;
                                        float f27 = fArr2[i3 + 1];
                                        f8 += f27;
                                        if (i3 > 0) {
                                            path.rLineTo(f26, f27);
                                        } else {
                                            path.rMoveTo(f26, f27);
                                            f12 = f8;
                                            f11 = f7;
                                        }
                                    } else if (c2 == 's') {
                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                            f3 = f7 - f9;
                                            f4 = f8 - f10;
                                        } else {
                                            f3 = 0.0f;
                                            f4 = 0.0f;
                                        }
                                        float f28 = fArr2[i3];
                                        int i17 = i3 + 1;
                                        float f29 = fArr2[i17];
                                        int i18 = i3 + 2;
                                        float f30 = fArr2[i18];
                                        int i19 = i3 + 3;
                                        path.rCubicTo(f3, f4, f28, f29, f30, fArr2[i19]);
                                        f9 = fArr2[i3] + f7;
                                        f10 = fArr2[i17] + f8;
                                        f7 += fArr2[i18];
                                        f = fArr2[i19];
                                    } else if (c2 == 't') {
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f6 = f7 - f9;
                                            f5 = f8 - f10;
                                        } else {
                                            f5 = 0.0f;
                                            f6 = 0.0f;
                                        }
                                        float f31 = fArr2[i3];
                                        int i20 = i3 + 1;
                                        path.rQuadTo(f6, f5, f31, fArr2[i20]);
                                        f10 = f5 + f8;
                                        f7 = fArr2[i3] + f7;
                                        f8 = fArr2[i20] + f8;
                                        f9 = f6 + f7;
                                    }
                                    f8 += f2;
                                } else {
                                    float f32 = fArr2[i3];
                                    int i21 = i3 + 1;
                                    float f33 = fArr2[i21];
                                    int i22 = i3 + 2;
                                    float f34 = fArr2[i22];
                                    int i23 = i3 + 3;
                                    path.rQuadTo(f32, f33, f34, fArr2[i23]);
                                    f9 = fArr2[i3] + f7;
                                    f10 = fArr2[i21] + f8;
                                    f7 += fArr2[i22];
                                    f = fArr2[i23];
                                }
                                f8 += f;
                            } else {
                                int i24 = i3 + 5;
                                float f35 = fArr2[i24];
                                int i25 = i3 + 6;
                                b(path, f7, f8, f35 + f7, fArr2[i25] + f8, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                                f7 += fArr2[i24];
                                f8 += fArr2[i25];
                            }
                            i3 += i;
                            c = c2;
                            c2 = c2;
                        } else {
                            float f36 = fArr2[i3];
                            float f37 = fArr2[i3 + 1];
                            int i26 = i3 + 2;
                            float f38 = fArr2[i26];
                            int i27 = i3 + 3;
                            float f39 = fArr2[i27];
                            int i28 = i3 + 4;
                            int i29 = i3 + 5;
                            path.cubicTo(f36, f37, f38, f39, fArr2[i28], fArr2[i29]);
                            f7 = fArr2[i28];
                            f8 = fArr2[i29];
                            f9 = fArr2[i26];
                            f10 = fArr2[i27];
                        }
                        i3 += i;
                        c = c2;
                        c2 = c2;
                    } else {
                        int i30 = i3 + 5;
                        float f40 = fArr2[i30];
                        int i31 = i3 + 6;
                        b(path, f7, f8, f40, fArr2[i31], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f7 = fArr2[i30];
                        f8 = fArr2[i31];
                    }
                    f10 = f8;
                    f9 = f7;
                    i3 += i;
                    c = c2;
                    c2 = c2;
                }
                fArr[0] = f7;
                fArr[1] = f8;
                fArr[2] = f9;
                fArr[3] = f10;
                fArr[4] = f11;
                fArr[5] = f12;
                c = iconCompatParcelizerArr[i2].a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v42, types: [double] */
        /* JADX WARN: Type inference failed for: r0v49, types: [double] */
        /* JADX WARN: Type inference failed for: r0v52, types: [double] */
        /* JADX WARN: Type inference failed for: r0v55, types: [double] */
        /* JADX WARN: Type inference failed for: r0v58, types: [double] */
        /* JADX WARN: Type inference failed for: r20v0, types: [double] */
        /* JADX WARN: Type inference failed for: r22v0, types: [double] */
        /* JADX WARN: Type inference failed for: r24v3 */
        /* JADX WARN: Type inference failed for: r24v4 */
        /* JADX WARN: Type inference failed for: r24v6 */
        /* JADX WARN: Type inference failed for: r26v0, types: [double] */
        /* JADX WARN: Type inference failed for: r26v2 */
        /* JADX WARN: Type inference failed for: r26v3 */
        /* JADX WARN: Type inference failed for: r26v5 */
        /* JADX WARN: Unknown variable types count: 7 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private static void c(android.graphics.Path r11, double r12, double r14, double r16, double r18, double r20, double r22, double r24, double r26, double r28) {
            /*
            // Method dump skipped, instructions count: 362
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isConsumed.IconCompatParcelizer.c(android.graphics.Path, double, double, double, double, double, double, double, double, double):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/isConsumed$write.class */
    public static final class write {
        int a;
        boolean d;

        write() {
        }
    }

    public static IconCompatParcelizer[] a(IconCompatParcelizer[] iconCompatParcelizerArr) {
        if (iconCompatParcelizerArr == null) {
            return null;
        }
        IconCompatParcelizer[] iconCompatParcelizerArr2 = new IconCompatParcelizer[iconCompatParcelizerArr.length];
        for (int i = 0; i < iconCompatParcelizerArr.length; i++) {
            iconCompatParcelizerArr2[i] = new IconCompatParcelizer(iconCompatParcelizerArr[i]);
        }
        return iconCompatParcelizerArr2;
    }

    static float[] b(float[] fArr, int i, int i2) {
        if (i2 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i2, length);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static IconCompatParcelizer[] b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int d = d(str, i);
            String trim = str.substring(i2, d).trim();
            if (trim.length() > 0) {
                arrayList.add(new IconCompatParcelizer(trim.charAt(0), c(trim)));
            }
            i2 = d;
            i = d + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            arrayList.add(new IconCompatParcelizer(str.charAt(i2), new float[0]));
        }
        return (IconCompatParcelizer[]) arrayList.toArray(new IconCompatParcelizer[arrayList.size()]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd A[LOOP:1: B:12:0x0046->B:38:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe A[Catch: NumberFormatException -> 0x013c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x013c, blocks: (B:6:0x0014, B:10:0x0034, B:12:0x0046, B:14:0x004f, B:27:0x009a, B:32:0x00b6, B:39:0x00e7, B:42:0x00fe, B:44:0x0113, B:49:0x0132), top: B:56:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static float[] c(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 357
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isConsumed.c(java.lang.String):float[]");
    }

    private static int d(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - setHasDecor$MediaBrowserCompat$MediaItem.aH) <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    public static Path d(String str) {
        Path path = new Path();
        IconCompatParcelizer[] b = b(str);
        if (b == null) {
            return null;
        }
        try {
            IconCompatParcelizer.b(b, path);
            return path;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("Error in parsing ");
            sb.append(str);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static boolean d(IconCompatParcelizer[] iconCompatParcelizerArr, IconCompatParcelizer[] iconCompatParcelizerArr2) {
        if (iconCompatParcelizerArr == null || iconCompatParcelizerArr2 == null || iconCompatParcelizerArr.length != iconCompatParcelizerArr2.length) {
            return false;
        }
        for (int i = 0; i < iconCompatParcelizerArr.length; i++) {
            if (!(iconCompatParcelizerArr[i].a == iconCompatParcelizerArr2[i].a && iconCompatParcelizerArr[i].c.length == iconCompatParcelizerArr2[i].c.length)) {
                return false;
            }
        }
        return true;
    }
}
