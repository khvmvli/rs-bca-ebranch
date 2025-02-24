package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/RescheduleReservationPresenter.class */
public final class RescheduleReservationPresenter implements TxnTellerPresenter {
    final boolean e;

    public RescheduleReservationPresenter(boolean z) {
        this.e = z;
    }

    @Override // o.TxnTellerPresenter
    public final boolean b() {
        return this.e;
    }

    @Override // o.TxnTellerPresenter
    public final Registry$NoImageHeaderParserException e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.e ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
