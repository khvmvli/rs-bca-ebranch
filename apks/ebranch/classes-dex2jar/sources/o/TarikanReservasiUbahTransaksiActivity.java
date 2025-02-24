package o;
/* loaded from: classes-dex2jar.jar:o/TarikanReservasiUbahTransaksiActivity.class */
public final class TarikanReservasiUbahTransaksiActivity {
    public final String d;
    public final String e;

    public TarikanReservasiUbahTransaksiActivity(String str, String str2) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TarikanReservasiUbahTransaksiActivity)) {
            return false;
        }
        TarikanReservasiUbahTransaksiActivity tarikanReservasiUbahTransaksiActivity = (TarikanReservasiUbahTransaksiActivity) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.d, (Object) tarikanReservasiUbahTransaksiActivity.d) && subscribeReservationRescheduleEvent.b((Object) this.e, (Object) tarikanReservasiUbahTransaksiActivity.e);
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseValueWaktuPengiriman(value=");
        sb.append(this.d);
        sb.append(", tanggalJatuhTempo=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
