package o;
/* loaded from: classes-dex2jar.jar:o/clikedKeyHilang.class */
public final class clikedKeyHilang {
    @infoContactPersonDialogEvent(c = "holiday_flag")
    public final String d;
    @infoContactPersonDialogEvent(c = "date")
    public final String e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clikedKeyHilang)) {
            return false;
        }
        clikedKeyHilang clikedkeyhilang = (clikedKeyHilang) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.e, (Object) clikedkeyhilang.e) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) clikedkeyhilang.d);
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetAvailableDateKliring(date=");
        sb.append(this.e);
        sb.append(", holidayFlag=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
