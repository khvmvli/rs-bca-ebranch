package o;
/* loaded from: classes-dex2jar.jar:o/UbahProfilActivity.class */
public final class UbahProfilActivity {
    public final String c;
    public final String e;

    public UbahProfilActivity(String str, String str2) {
        subscribeReservationRescheduleEvent.e(str, "");
        this.c = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UbahProfilActivity)) {
            return false;
        }
        UbahProfilActivity ubahProfilActivity = (UbahProfilActivity) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.c, (Object) ubahProfilActivity.c) && subscribeReservationRescheduleEvent.b((Object) this.e, (Object) ubahProfilActivity.e);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        String str = this.e;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnUpdateKliringPenerimaDataClick(formTagName=");
        sb.append(this.c);
        sb.append(", currentValue=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
