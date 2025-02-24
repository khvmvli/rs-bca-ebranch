package o;
/* loaded from: classes-dex2jar.jar:o/resetAccount.class */
public final class resetAccount {
    public String a;
    public String d;
    public int e;

    public resetAccount(String str, int i, String str2) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        this.d = str;
        this.e = i;
        this.a = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof resetAccount)) {
            return false;
        }
        resetAccount resetaccount = (resetAccount) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.d, (Object) resetaccount.d) && this.e == resetaccount.e && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) resetaccount.a);
    }

    public final int hashCode() {
        return (((this.d.hashCode() * 31) + this.e) * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseValueTipeNasabahBankTransfer(value=");
        sb.append(this.d);
        sb.append(", position=");
        sb.append(this.e);
        sb.append(", tag=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
