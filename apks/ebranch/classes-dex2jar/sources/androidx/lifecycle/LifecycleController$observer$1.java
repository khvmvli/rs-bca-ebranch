package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import o.UpdateReceiverDataPresenter;
import o.onPause;
import o.onRequestPermissionsResult;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.performAttach;
import o.performContextItemSelected;
import o.subscribeReservationRescheduleEvent;
/* loaded from: classes-dex2jar.jar:androidx/lifecycle/LifecycleController$observer$1.class */
public final class LifecycleController$observer$1 implements onResume {
    final /* synthetic */ UpdateReceiverDataPresenter b;
    final /* synthetic */ performAttach e;

    @Override // o.onResume
    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        subscribeReservationRescheduleEvent.e(performcontextitemselected, "");
        subscribeReservationRescheduleEvent.e(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver, "");
        onRequestPermissionsResult lifecycle = performcontextitemselected.getLifecycle();
        subscribeReservationRescheduleEvent.d(lifecycle, "");
        if (lifecycle.a() == onRequestPermissionsResult.read.DESTROYED) {
            performAttach performattach = this.e;
            this.b.a((CancellationException) null);
            performattach.a.e(performattach.d);
            onPause onpause = performattach.b;
            onpause.d = true;
            onpause.e();
            return;
        }
        onRequestPermissionsResult lifecycle2 = performcontextitemselected.getLifecycle();
        subscribeReservationRescheduleEvent.d(lifecycle2, "");
        if (lifecycle2.a().compareTo(this.e.c) < 0) {
            this.e.b.e = true;
            return;
        }
        onPause onpause2 = this.e.b;
        if (!onpause2.e) {
            return;
        }
        if (!onpause2.d) {
            onpause2.e = false;
            onpause2.e();
            return;
        }
        throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
    }
}
