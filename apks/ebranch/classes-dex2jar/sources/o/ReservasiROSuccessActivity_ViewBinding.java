package o;
/* loaded from: classes-dex2jar.jar:o/ReservasiROSuccessActivity_ViewBinding.class */
public final class ReservasiROSuccessActivity_ViewBinding {
    public String e;

    public ReservasiROSuccessActivity_ViewBinding(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReservasiROSuccessActivity_ViewBinding) && subscribeReservationRescheduleEvent.b((Object) this.e, (Object) ((ReservasiROSuccessActivity_ViewBinding) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseValueSaranaPembayaranBankTransfer(value=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
