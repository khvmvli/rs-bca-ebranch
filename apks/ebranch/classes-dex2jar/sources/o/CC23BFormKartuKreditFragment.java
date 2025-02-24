package o;
/* loaded from: classes-dex2jar.jar:o/CC23BFormKartuKreditFragment.class */
public final class CC23BFormKartuKreditFragment {
    public static int b;
    public static final Object c = new Object();
    public static int d;
    public static int e;

    public static int a(int i) {
        CC21BFormKartuKreditFragment_ViewBinding cC21BFormKartuKreditFragment_ViewBinding = CC21BFormKartuKreditFragment_ViewBinding.a;
        return ((cC21BFormKartuKreditFragment_ViewBinding.c[0][i >>> 24] + cC21BFormKartuKreditFragment_ViewBinding.c[1][(i >>> 16) & 255]) ^ cC21BFormKartuKreditFragment_ViewBinding.c[2][(i >>> 8) & 255]) + cC21BFormKartuKreditFragment_ViewBinding.c[3][i & 255];
    }

    public static void d(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
