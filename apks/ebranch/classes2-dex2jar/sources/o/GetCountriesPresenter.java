package o;
/* loaded from: classes2-dex2jar.jar:o/GetCountriesPresenter.class */
public final class GetCountriesPresenter extends UpdateTxnTellerSetunDetailPresenter {
    public final GetBranchPresenter<?> c;

    public GetCountriesPresenter(GetBranchPresenter<?> getBranchPresenter) {
        this.c = getBranchPresenter;
    }

    public final /* synthetic */ Object a(Object obj) {
        Throwable th = (Throwable) obj;
        GetBranchPresenter<?> getBranchPresenter = this.c;
        GeneratedAppGlideModule generatedAppGlideModule = this.d;
        if (generatedAppGlideModule == null) {
            subscribeReservationRescheduleEvent.e("");
            generatedAppGlideModule = null;
        }
        getBranchPresenter.e(GetBranchPresenter.a((UpdateReceiverDataPresenter) generatedAppGlideModule));
        return onCLickStatusNpwp.e;
    }

    @Override // o.GetIdentityPresenter
    public final void e(Throwable th) {
        GetBranchPresenter<?> getBranchPresenter = this.c;
        GeneratedAppGlideModule generatedAppGlideModule = this.d;
        if (generatedAppGlideModule == null) {
            subscribeReservationRescheduleEvent.e("");
            generatedAppGlideModule = null;
        }
        getBranchPresenter.e(GetBranchPresenter.a((UpdateReceiverDataPresenter) generatedAppGlideModule));
    }
}
