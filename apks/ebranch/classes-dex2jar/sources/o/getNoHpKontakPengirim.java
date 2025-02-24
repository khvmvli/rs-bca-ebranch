package o;

import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/getNoHpKontakPengirim.class */
public final class getNoHpKontakPengirim {
    public static <T> boolean b(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (i < length) {
            T t2 = tArr[i];
            if (t2 == t || (t2 != null && t2.equals(t))) {
                return i >= 0;
            }
            i++;
        }
        return false;
    }

    public static <T> T[] d(T[]... tArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += tArr[i2].length;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr[0], i);
        int length = tArr[0].length;
        for (int i3 = 1; i3 < 2; i3++) {
            T[] tArr3 = tArr[1];
            System.arraycopy(tArr3, 0, tArr2, length, tArr3.length);
        }
        return tArr2;
    }

    public static boolean e(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
