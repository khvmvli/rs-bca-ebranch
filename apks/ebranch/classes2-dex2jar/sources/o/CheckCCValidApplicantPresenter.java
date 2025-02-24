package o;

import java.util.Iterator;
/* loaded from: classes2-dex2jar.jar:o/CheckCCValidApplicantPresenter.class */
public class CheckCCValidApplicantPresenter extends CategoriesKUPresenter {

    /* loaded from: classes2-dex2jar.jar:o/CheckCCValidApplicantPresenter$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements CancelTundaPresenter<T> {
        final /* synthetic */ Iterator c;

        public RemoteActionCompatParcelizer(Iterator it) {
            this.c = it;
        }

        @Override // o.CancelTundaPresenter
        public final Iterator<T> d() {
            return this.c;
        }
    }

    public static final <T> CancelTundaPresenter<T> b(Iterator<? extends T> it) {
        subscribeReservationRescheduleEvent.e(it, "");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(it);
        subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
        BeneficiaryBankPresenter beneficiaryBankPresenter = remoteActionCompatParcelizer;
        if (!(remoteActionCompatParcelizer instanceof BeneficiaryBankPresenter)) {
            beneficiaryBankPresenter = new BeneficiaryBankPresenter(remoteActionCompatParcelizer);
        }
        return beneficiaryBankPresenter;
    }
}
