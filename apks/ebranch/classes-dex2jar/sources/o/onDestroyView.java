package o;
/* loaded from: classes-dex2jar.jar:o/onDestroyView.class */
public final class onDestroyView<F, S> {
    public final S c;
    public final F d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof onDestroyView)) {
            return false;
        }
        onDestroyView ondestroyview = (onDestroyView) obj;
        boolean z = false;
        if (onDetach.a(ondestroyview.d, this.d)) {
            z = false;
            if (onDetach.a(ondestroyview.c, this.c)) {
                z = true;
            }
        }
        return z;
    }

    public final int hashCode() {
        F f = this.d;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.c;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.d);
        sb.append(" ");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
