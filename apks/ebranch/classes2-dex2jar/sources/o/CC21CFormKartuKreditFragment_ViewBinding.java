package o;
/* loaded from: classes2-dex2jar.jar:o/CC21CFormKartuKreditFragment_ViewBinding.class */
public final class CC21CFormKartuKreditFragment_ViewBinding {
    public static void a(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            e(iArr);
        }
        int i4 = 0;
        int i5 = i;
        while (i4 < i3) {
            i2 = i5 ^ iArr[i4];
            i4++;
            i5 = i2 ^ e(i2, iArr2);
        }
        int i6 = iArr[iArr.length - 2];
        int i7 = iArr[iArr.length - 1];
        if (!z) {
            e(iArr);
        }
        iArr3[0] = i2 ^ i7;
        iArr3[1] = i5 ^ i6;
    }

    private static int e(int i, int[][] iArr) {
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }

    private static void e(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
