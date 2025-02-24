package o;
/* loaded from: classes-dex2jar.jar:o/showInfo.class */
public class showInfo extends onClickedSetiapTanggal {
    public static final int b(int i) {
        int i2 = i;
        if (i >= 0) {
            i2 = i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return i2;
    }
}
