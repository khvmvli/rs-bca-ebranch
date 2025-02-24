package o;
/* loaded from: classes2-dex2jar.jar:o/AppModule.class */
public class AppModule extends NetworkModule {
    public static final int e(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(i3);
        sb.append(" is less than minimum ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
}
