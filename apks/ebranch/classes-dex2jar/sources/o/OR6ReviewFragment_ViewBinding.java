package o;
/* loaded from: classes-dex2jar.jar:o/OR6ReviewFragment_ViewBinding.class */
public final class OR6ReviewFragment_ViewBinding<T> implements Page6JLFragment_ViewBinding<T> {
    private static final Object b = new Object();
    private volatile Object a = b;
    private volatile Page6JLFragment_ViewBinding<T> d;

    private OR6ReviewFragment_ViewBinding(Page6JLFragment_ViewBinding<T> page6JLFragment_ViewBinding) {
        this.d = page6JLFragment_ViewBinding;
    }

    public static <P extends Page6JLFragment_ViewBinding<T>, T> Page6JLFragment_ViewBinding<T> a(P p) {
        return p instanceof OR6ReviewFragment_ViewBinding ? p : new OR6ReviewFragment_ViewBinding(p);
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final T c() {
        Object obj = this.a;
        Object obj2 = b;
        T t = (T) obj;
        if (obj == obj2) {
            synchronized (this) {
                Object obj3 = this.a;
                t = obj3;
                if (obj3 == obj2) {
                    t = this.d.c();
                    Object obj4 = this.a;
                    if (!(obj4 != b && !(obj4 instanceof Page6CFragment)) || obj4 == t) {
                        this.a = t;
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
