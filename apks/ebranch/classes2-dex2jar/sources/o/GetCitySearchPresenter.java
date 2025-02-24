package o;
/* loaded from: classes2-dex2jar.jar:o/GetCitySearchPresenter.class */
public final class GetCitySearchPresenter extends UpdateTxnTellerSetunDetailPresenter implements GetCustAcctListPresenter {
    public final GetCreditCardOptionsPresenter a;

    public GetCitySearchPresenter(GetCreditCardOptionsPresenter getCreditCardOptionsPresenter) {
        this.a = getCreditCardOptionsPresenter;
    }

    public final /* synthetic */ Object a(Object obj) {
        Throwable th = (Throwable) obj;
        GetCreditCardOptionsPresenter getCreditCardOptionsPresenter = this.a;
        GeneratedAppGlideModule generatedAppGlideModule = this.d;
        if (generatedAppGlideModule == null) {
            subscribeReservationRescheduleEvent.e("");
            generatedAppGlideModule = null;
        }
        getCreditCardOptionsPresenter.b((hasAlpha) generatedAppGlideModule);
        return onCLickStatusNpwp.e;
    }

    @Override // o.GetCustAcctListPresenter
    public final boolean c(Throwable th) {
        GeneratedAppGlideModule generatedAppGlideModule = this.d;
        if (generatedAppGlideModule == null) {
            subscribeReservationRescheduleEvent.e("");
            generatedAppGlideModule = null;
        }
        return generatedAppGlideModule.e(th);
    }

    @Override // o.GetIdentityPresenter
    public final void e(Throwable th) {
        GetCreditCardOptionsPresenter getCreditCardOptionsPresenter = this.a;
        GeneratedAppGlideModule generatedAppGlideModule = this.d;
        if (generatedAppGlideModule == null) {
            subscribeReservationRescheduleEvent.e("");
            generatedAppGlideModule = null;
        }
        getCreditCardOptionsPresenter.b((hasAlpha) generatedAppGlideModule);
    }
}
