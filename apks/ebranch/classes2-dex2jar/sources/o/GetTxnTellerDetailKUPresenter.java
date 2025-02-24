package o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* loaded from: classes2-dex2jar.jar:o/GetTxnTellerDetailKUPresenter.class */
public final class GetTxnTellerDetailKUPresenter {
    private static final List<CoroutineExceptionHandler> e = CancelReservationPresenter.d(CancelReservationPresenter.b(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final void d(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Throwable th) {
        Iterator<CoroutineExceptionHandler> it = e.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
