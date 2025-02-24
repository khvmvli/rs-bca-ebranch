package o;

import java.util.concurrent.CancellationException;
import o.ProsesTarikanFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/UpdateReceiverDataPresenter.class */
public interface UpdateReceiverDataPresenter extends ProsesTarikanFragment_ViewBinding.IconCompatParcelizer {
    public static final write b = write.e;

    /* loaded from: classes2-dex2jar.jar:o/UpdateReceiverDataPresenter$read.class */
    public static final class read {
        public static /* synthetic */ RescheduleReservationV2Presenter d(UpdateReceiverDataPresenter updateReceiverDataPresenter, boolean z, boolean z2, T1TransaksiTarikanUbahFragment_ViewBinding t1TransaksiTarikanUbahFragment_ViewBinding, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return updateReceiverDataPresenter.e(z, z2, t1TransaksiTarikanUbahFragment_ViewBinding);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/UpdateReceiverDataPresenter$write.class */
    public static final class write implements ProsesTarikanFragment_ViewBinding.read<UpdateReceiverDataPresenter> {
        static final /* synthetic */ write e = new write();

        private write() {
        }
    }

    void a(CancellationException cancellationException);

    GetCustAcctListPresenter d(GetCreditCardOptionsPresenter getCreditCardOptionsPresenter);

    RescheduleReservationV2Presenter e(boolean z, boolean z2, T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding);

    boolean e();

    boolean g();

    CancellationException h();
}
