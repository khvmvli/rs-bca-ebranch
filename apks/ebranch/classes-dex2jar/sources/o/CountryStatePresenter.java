package o;
/* loaded from: classes-dex2jar.jar:o/CountryStatePresenter.class */
public class CountryStatePresenter {
    public static final int c(int i) {
        setRegionPrefix setregionprefix = new setRegionPrefix(2, 36);
        if (((setBackgroundTransparent) setregionprefix).c <= i && i <= ((setBackgroundTransparent) setregionprefix).d) {
            return i;
        }
        StringBuilder sb = new StringBuilder("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new setRegionPrefix(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
}
