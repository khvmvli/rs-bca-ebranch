package o;
/* loaded from: classes-dex2jar.jar:o/togglePINLama.class */
public final class togglePINLama {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public togglePINLama() {
        this(null, null, 0, null, 15);
    }

    private togglePINLama(String str, String str2, int i, String str3) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        subscribeReservationRescheduleEvent.e(str3, "");
        this.b = str;
        this.a = str2;
        this.d = i;
        this.c = str3;
    }

    public /* synthetic */ togglePINLama(String str, String str2, int i, String str3, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? "" : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof togglePINLama)) {
            return false;
        }
        togglePINLama togglepinlama = (togglePINLama) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.b, (Object) togglepinlama.b) && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) togglepinlama.a) && this.d == togglepinlama.d && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) togglepinlama.c);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.d) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnConfirmationKliringFormReset(errorMessage=");
        sb.append(this.b);
        sb.append(", formTagName=");
        sb.append(this.a);
        sb.append(", warkatPosition=");
        sb.append(this.d);
        sb.append(", newValue=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
