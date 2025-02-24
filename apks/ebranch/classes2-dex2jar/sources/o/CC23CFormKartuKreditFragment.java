package o;
/* loaded from: classes2-dex2jar.jar:o/CC23CFormKartuKreditFragment.class */
public final class CC23CFormKartuKreditFragment {
    public static int a;
    public static final Object b = new Object();
    public static int d;

    public static char[] b(long j, char[] cArr, int i) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 0; i4 < cArr.length; i4++) {
            if ((((j >>> i4) & 1) != ((long) i) || i2 >= 4) && i3 < length) {
                cArr2[i3] = (char) cArr[i4];
                i3++;
            } else {
                cArr2[i2] = (char) cArr[i4];
                i2++;
            }
        }
        return cArr2;
    }
}
