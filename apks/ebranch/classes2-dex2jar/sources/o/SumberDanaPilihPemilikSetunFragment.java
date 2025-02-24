package o;
/* loaded from: classes2-dex2jar.jar:o/SumberDanaPilihPemilikSetunFragment.class */
public final class SumberDanaPilihPemilikSetunFragment {
    public static final int e(int i, int i2, int i3) {
        int i4 = i % i3;
        int i5 = i4;
        if (i4 < 0) {
            i5 = i4 + i3;
        }
        int i6 = i2 % i3;
        int i7 = i6;
        if (i6 < 0) {
            i7 = i6 + i3;
        }
        int i8 = (i5 - i7) % i3;
        int i9 = i8;
        if (i8 < 0) {
            i9 = i8 + i3;
        }
        return i9;
    }
}
