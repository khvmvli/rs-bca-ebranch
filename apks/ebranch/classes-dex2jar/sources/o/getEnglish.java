package o;
/* loaded from: classes-dex2jar.jar:o/getEnglish.class */
public class getEnglish<T> implements setIbanFlag<T> {
    protected final T c;

    public getEnglish(T t) {
        if (t != null) {
            this.c = t;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // o.setIbanFlag
    public final T a() {
        return this.c;
    }

    @Override // o.setIbanFlag
    public final void b() {
    }

    @Override // o.setIbanFlag
    public final int d() {
        return 1;
    }

    @Override // o.setIbanFlag
    public final Class<T> e() {
        return (Class<T>) this.c.getClass();
    }
}
