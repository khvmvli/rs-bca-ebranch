package o;
/* loaded from: classes-dex2jar.jar:o/ReservasiSuccessActivity_ViewBinding.class */
public final class ReservasiSuccessActivity_ViewBinding {
    public String a;

    public ReservasiSuccessActivity_ViewBinding(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReservasiSuccessActivity_ViewBinding) && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) ((ReservasiSuccessActivity_ViewBinding) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseValueSaranaPembayaranPengirimBankTransfer(value=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
