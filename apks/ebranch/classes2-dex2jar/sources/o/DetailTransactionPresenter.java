package o;
/* loaded from: classes2-dex2jar.jar:o/DetailTransactionPresenter.class */
public abstract class DetailTransactionPresenter<T> extends GeneratedAppGlideModule implements ProsesTarikanFragment<T>, InquiryLoadDataSetunPresenter {
    private final ProsesTarikanFragment_ViewBinding a;

    public DetailTransactionPresenter(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, boolean z, boolean z2) {
        super(z2);
        e((UpdateReceiverDataPresenter) prosesTarikanFragment_ViewBinding.b(UpdateReceiverDataPresenter.b));
        this.a = prosesTarikanFragment_ViewBinding.b(this);
    }

    @Override // o.GeneratedAppGlideModule
    public final String a() {
        String b = GetTxnBerkalaDetailPresenter.b(this.a);
        if (b == null) {
            return a();
        }
        StringBuilder sb = new StringBuilder("\"");
        sb.append(b);
        sb.append("\":");
        sb.append(a());
        return sb.toString();
    }

    protected void a(Object obj) {
        e(obj);
    }

    @Override // o.InquiryLoadDataSetunPresenter
    public final ProsesTarikanFragment_ViewBinding b() {
        return this.a;
    }

    @Override // o.GeneratedAppGlideModule
    public final void b(Throwable th) {
        GetTxnTellerDetailPresenter.b(this.a, th);
    }

    @Override // o.GeneratedAppGlideModule
    protected final String c() {
        return subscribeReservationRescheduleEvent.b(getClass().getSimpleName(), " was cancelled");
    }

    @Override // o.GeneratedAppGlideModule
    protected final void d(Object obj) {
        if (obj instanceof GetDaftarPekerjaanPresenter) {
            int i = ((GetDaftarPekerjaanPresenter) obj)._handled;
        }
    }

    @Override // o.GeneratedAppGlideModule, o.UpdateReceiverDataPresenter
    public final boolean e() {
        return e();
    }

    @Override // o.ProsesTarikanFragment
    public final ProsesTarikanFragment_ViewBinding getContext() {
        return this.a;
    }

    @Override // o.ProsesTarikanFragment
    public final void resumeWith(Object obj) {
        Object c = c(GetRatePresenter.e(obj, null));
        if (c != Glide.d) {
            a(c);
        }
    }
}
