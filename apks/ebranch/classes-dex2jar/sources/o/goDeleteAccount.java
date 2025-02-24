package o;
/* loaded from: classes-dex2jar.jar:o/goDeleteAccount.class */
public final class goDeleteAccount {
    public String a;
    public String c;
    public String d;

    public goDeleteAccount(String str, String str2, String str3) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        subscribeReservationRescheduleEvent.e(str3, "");
        this.a = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goDeleteAccount)) {
            return false;
        }
        goDeleteAccount godeleteaccount = (goDeleteAccount) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.a, (Object) godeleteaccount.a) && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) godeleteaccount.c) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) godeleteaccount.d);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseValueBankTujuanBankTransfer(value=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.c);
        sb.append(", localClearingCode=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
