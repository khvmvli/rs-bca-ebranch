package o;
/* loaded from: classes-dex2jar.jar:o/onChooseCameraEvent.class */
public final class onChooseCameraEvent {
    public final String d;
    public final String e;

    public onChooseCameraEvent(String str, String str2) {
        subscribeReservationRescheduleEvent.e(str, "");
        this.e = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onChooseCameraEvent)) {
            return false;
        }
        onChooseCameraEvent onchoosecameraevent = (onChooseCameraEvent) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.e, (Object) onchoosecameraevent.e) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) onchoosecameraevent.d);
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode();
        String str = this.d;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnUpdateKliringPenerimaData(formTagName=");
        sb.append(this.e);
        sb.append(", valueChange=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
