package o;
/* loaded from: classes-dex2jar.jar:o/ReservasiSuccessAskNextActivity.class */
public final class ReservasiSuccessAskNextActivity {
    public String a;
    public String d;

    public ReservasiSuccessAskNextActivity(String str, String str2) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        this.d = str;
        this.a = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReservasiSuccessAskNextActivity)) {
            return false;
        }
        ReservasiSuccessAskNextActivity reservasiSuccessAskNextActivity = (ReservasiSuccessAskNextActivity) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.d, (Object) reservasiSuccessAskNextActivity.d) && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) reservasiSuccessAskNextActivity.a);
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseValueStatusPendudukBankTransfer(value=");
        sb.append(this.d);
        sb.append(", tag=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
