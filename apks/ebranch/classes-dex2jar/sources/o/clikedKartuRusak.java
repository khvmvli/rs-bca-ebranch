package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/clikedKartuRusak.class */
public final class clikedKartuRusak {
    @infoContactPersonDialogEvent(c = "date_list")
    public final List<clikedKeyHilang> c;

    public clikedKartuRusak() {
        this(null, 1);
    }

    private clikedKartuRusak(List<clikedKeyHilang> list) {
        this.c = list;
    }

    private /* synthetic */ clikedKartuRusak(List list, int i) {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clikedKartuRusak) && subscribeReservationRescheduleEvent.b(this.c, ((clikedKartuRusak) obj).c);
    }

    public final int hashCode() {
        List<clikedKeyHilang> list = this.c;
        return list == null ? 0 : list.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetAvailableDateKliringList(dateList=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
