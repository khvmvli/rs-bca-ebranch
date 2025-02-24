package o;
/* loaded from: classes-dex2jar.jar:o/ResetAccountActivity_ViewBinding.class */
public final class ResetAccountActivity_ViewBinding {
    public String b;
    public String c;
    public int d;

    public ResetAccountActivity_ViewBinding(String str, int i, String str2) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        this.c = str;
        this.d = i;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResetAccountActivity_ViewBinding)) {
            return false;
        }
        ResetAccountActivity_ViewBinding resetAccountActivity_ViewBinding = (ResetAccountActivity_ViewBinding) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.c, (Object) resetAccountActivity_ViewBinding.c) && this.d == resetAccountActivity_ViewBinding.d && subscribeReservationRescheduleEvent.b((Object) this.b, (Object) resetAccountActivity_ViewBinding.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.d) * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseValueTipeNasabahKliring(value=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", tag=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
