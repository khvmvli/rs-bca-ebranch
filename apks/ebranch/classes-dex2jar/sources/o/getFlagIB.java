package o;
/* loaded from: classes-dex2jar.jar:o/getFlagIB.class */
public final class getFlagIB<T> implements Page6JLFragment_ViewBinding<T> {
    private static final Object c = new Object();
    private volatile Object b = c;
    private volatile Page6JLFragment_ViewBinding<T> d;

    public getFlagIB(Page6JLFragment_ViewBinding<T> page6JLFragment_ViewBinding) {
        this.d = page6JLFragment_ViewBinding;
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final T c() {
        Object obj = this.b;
        Object obj2 = c;
        T t = (T) obj;
        if (obj == obj2) {
            synchronized (this) {
                Object obj3 = this.b;
                t = obj3;
                if (obj3 == obj2) {
                    t = this.d.c();
                    Object obj4 = this.b;
                    if (!(obj4 != c && !(obj4 instanceof getFotoKtp)) || obj4 == t) {
                        this.b = t;
                        this.d = null;
                    } else {
                        StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                        sb.append(obj4);
                        sb.append(" & ");
                        sb.append(t);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
        }
        return t;
    }
}
