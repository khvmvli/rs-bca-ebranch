package o;

import kotlinx.coroutines.CoroutineExceptionHandler;
/* loaded from: classes2-dex2jar.jar:o/GetTxnTellerDetailPresenter.class */
public final class GetTxnTellerDetailPresenter {
    public static final void b(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Throwable th) {
        try {
            if (((CoroutineExceptionHandler) prosesTarikanFragment_ViewBinding.b(CoroutineExceptionHandler.b)) == null) {
                GetTxnTellerDetailKUPresenter.d(prosesTarikanFragment_ViewBinding, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                subscribeReservationRescheduleEvent.e(runtimeException, "");
                subscribeReservationRescheduleEvent.e(th, "");
                if (runtimeException != th) {
                    clickOrangLain.c.a(runtimeException, th);
                }
                th = runtimeException;
            }
            GetTxnTellerDetailKUPresenter.d(prosesTarikanFragment_ViewBinding, th);
        }
    }
}
