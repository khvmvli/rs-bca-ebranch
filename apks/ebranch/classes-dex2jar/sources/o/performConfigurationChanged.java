package o;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes-dex2jar.jar:o/performConfigurationChanged.class */
public final class performConfigurationChanged {
    public static final onViewCreated b(performContextItemSelected performcontextitemselected) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z;
        subscribeReservationRescheduleEvent.e(performcontextitemselected, "");
        onRequestPermissionsResult lifecycle = performcontextitemselected.getLifecycle();
        subscribeReservationRescheduleEvent.d(lifecycle, "");
        subscribeReservationRescheduleEvent.e(lifecycle, "");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.c.get();
            if (lifecycleCoroutineScopeImpl2 == null) {
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, new HttpException((UpdateReceiverDataPresenter) null).b(ReservasiListChosenPresenter.c().e()));
                AtomicReference<Object> atomicReference = lifecycle.c;
                while (true) {
                    if (!atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                        if (atomicReference.get() != null) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            } else {
                return lifecycleCoroutineScopeImpl2;
            }
        } while (!z);
        GetAreaPresenter.a(lifecycleCoroutineScopeImpl, ReservasiListChosenPresenter.c().e(), (KategoriTujuanTransaksiORPresenter) null, new LifecycleCoroutineScopeImpl.RemoteActionCompatParcelizer(null), 2);
        return lifecycleCoroutineScopeImpl;
    }
}
