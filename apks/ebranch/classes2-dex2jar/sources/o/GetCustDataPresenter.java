package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/GetCustDataPresenter.class */
public final class GetCustDataPresenter {
    public final T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, onCLickStatusNpwp> a;
    public final Object b;
    public final Throwable c;
    public final GetCategoriesORPresenter d;
    public final Object e;

    /* JADX WARN: Multi-variable type inference failed */
    private GetCustDataPresenter(Object obj, GetCategoriesORPresenter getCategoriesORPresenter, T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding, Object obj2, Throwable th) {
        this.b = obj;
        this.d = getCategoriesORPresenter;
        this.a = t1TransaksiTarikanUbahFragment_ViewBinding;
        this.e = obj2;
        this.c = th;
    }

    public /* synthetic */ GetCustDataPresenter(Object obj, GetCategoriesORPresenter getCategoriesORPresenter, T1TransaksiTarikanUbahFragment_ViewBinding t1TransaksiTarikanUbahFragment_ViewBinding, Object obj2, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : getCategoriesORPresenter, (i & 4) != 0 ? null : t1TransaksiTarikanUbahFragment_ViewBinding, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    public static /* synthetic */ GetCustDataPresenter a(GetCustDataPresenter getCustDataPresenter, Object obj, GetCategoriesORPresenter getCategoriesORPresenter, T1TransaksiTarikanUbahFragment_ViewBinding t1TransaksiTarikanUbahFragment_ViewBinding, Object obj2, Throwable th, int i) {
        if ((i & 1) != 0) {
            obj = getCustDataPresenter.b;
        }
        if ((i & 2) != 0) {
            getCategoriesORPresenter = getCustDataPresenter.d;
        }
        if ((i & 4) != 0) {
            t1TransaksiTarikanUbahFragment_ViewBinding = getCustDataPresenter.a;
        }
        if ((i & 8) != 0) {
            obj2 = getCustDataPresenter.e;
        }
        if ((i & 16) != 0) {
            th = getCustDataPresenter.c;
        }
        return new GetCustDataPresenter(obj, getCategoriesORPresenter, t1TransaksiTarikanUbahFragment_ViewBinding, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCustDataPresenter)) {
            return false;
        }
        GetCustDataPresenter getCustDataPresenter = (GetCustDataPresenter) obj;
        return subscribeReservationRescheduleEvent.b(this.b, getCustDataPresenter.b) && subscribeReservationRescheduleEvent.b(this.d, getCustDataPresenter.d) && subscribeReservationRescheduleEvent.b(this.a, getCustDataPresenter.a) && subscribeReservationRescheduleEvent.b(this.e, getCustDataPresenter.e) && subscribeReservationRescheduleEvent.b(this.c, getCustDataPresenter.c);
    }

    public final int hashCode() {
        Object obj = this.b;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        GetCategoriesORPresenter getCategoriesORPresenter = this.d;
        int hashCode2 = getCategoriesORPresenter == null ? 0 : getCategoriesORPresenter.hashCode();
        T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding = this.a;
        int hashCode3 = t1TransaksiTarikanUbahFragment_ViewBinding == null ? 0 : t1TransaksiTarikanUbahFragment_ViewBinding.hashCode();
        Object obj2 = this.e;
        int hashCode4 = obj2 == null ? 0 : obj2.hashCode();
        Throwable th = this.c;
        if (th != null) {
            i = th.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedContinuation(result=");
        sb.append(this.b);
        sb.append(", cancelHandler=");
        sb.append(this.d);
        sb.append(", onCancellation=");
        sb.append(this.a);
        sb.append(", idempotentResume=");
        sb.append(this.e);
        sb.append(", cancelCause=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
