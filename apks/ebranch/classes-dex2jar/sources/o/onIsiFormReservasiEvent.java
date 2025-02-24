package o;
/* loaded from: classes-dex2jar.jar:o/onIsiFormReservasiEvent.class */
public final class onIsiFormReservasiEvent {
    public String b;
    public String d;

    public onIsiFormReservasiEvent(String str, String str2) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        this.b = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onIsiFormReservasiEvent)) {
            return false;
        }
        onIsiFormReservasiEvent onisiformreservasievent = (onIsiFormReservasiEvent) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.b, (Object) onisiformreservasievent.b) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) onisiformreservasievent.d);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseValueJenisWarkatBankTransfer(value=");
        sb.append(this.b);
        sb.append(", code=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
