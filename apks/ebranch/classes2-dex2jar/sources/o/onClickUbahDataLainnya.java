package o;
/* loaded from: classes2-dex2jar.jar:o/onClickUbahDataLainnya.class */
public abstract class onClickUbahDataLainnya<T, V> {
    private final Class<V> a;
    public final String c;

    public onClickUbahDataLainnya(Class<V> cls, String str) {
        this.c = str;
        this.a = cls;
    }

    public abstract V b(T t);

    public void c(T t, V v) {
        StringBuilder sb = new StringBuilder("Property ");
        sb.append(this.c);
        sb.append(" is read-only");
        throw new UnsupportedOperationException(sb.toString());
    }
}
