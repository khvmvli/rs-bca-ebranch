package o;
/* loaded from: classes-dex2jar.jar:o/requireContext.class */
public final class requireContext<D> {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public RemoteActionCompatParcelizer<D> e;
    public boolean g;
    public boolean j;

    /* loaded from: classes-dex2jar.jar:o/requireContext$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer<D> {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        onAttach.d(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
