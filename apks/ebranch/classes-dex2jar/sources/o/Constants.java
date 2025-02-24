package o;
/* loaded from: classes-dex2jar.jar:o/Constants.class */
public final class Constants<T> {
    public T a;
    public T b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof onDestroyView)) {
            return false;
        }
        onDestroyView ondestroyview = (onDestroyView) obj;
        F f = ondestroyview.d;
        Object obj2 = this.b;
        boolean z = false;
        if (f == obj2 || (f != 0 && f.equals(obj2))) {
            S s = ondestroyview.c;
            Object obj3 = this.a;
            z = false;
            if (s == obj3 || (s != 0 && s.equals(obj3))) {
                z = true;
            }
        }
        return z;
    }

    public final int hashCode() {
        T t = this.b;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.a;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.b));
        sb.append(" ");
        sb.append(String.valueOf(this.a));
        sb.append("}");
        return sb.toString();
    }
}
