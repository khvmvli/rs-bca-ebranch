package o;
/* loaded from: classes2-dex2jar.jar:o/UpdateTxnTellerDetailPresenter.class */
final class UpdateTxnTellerDetailPresenter extends GetCategoriesORPresenter {
    private final T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, onCLickStatusNpwp> a;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateTxnTellerDetailPresenter(T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding) {
        this.a = t1TransaksiTarikanUbahFragment_ViewBinding;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        this.a.a((Throwable) obj);
        return onCLickStatusNpwp.e;
    }

    @Override // o.GetCategoryPresenter
    public final void a(Throwable th) {
        this.a.a(th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvokeOnCancel[");
        sb.append(this.a.getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(']');
        return sb.toString();
    }
}
