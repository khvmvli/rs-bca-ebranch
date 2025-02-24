package o;
/* loaded from: classes2-dex2jar.jar:o/GetHBPresenter.class */
public final class GetHBPresenter {
    public final Object c;
    public final T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, onCLickStatusNpwp> e;

    /* JADX WARN: Multi-variable type inference failed */
    public GetHBPresenter(Object obj, T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding) {
        this.c = obj;
        this.e = t1TransaksiTarikanUbahFragment_ViewBinding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetHBPresenter)) {
            return false;
        }
        GetHBPresenter getHBPresenter = (GetHBPresenter) obj;
        return subscribeReservationRescheduleEvent.b(this.c, getHBPresenter.c) && subscribeReservationRescheduleEvent.b(this.e, getHBPresenter.e);
    }

    public final int hashCode() {
        Object obj = this.c;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedWithCancellation(result=");
        sb.append(this.c);
        sb.append(", onCancellation=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
