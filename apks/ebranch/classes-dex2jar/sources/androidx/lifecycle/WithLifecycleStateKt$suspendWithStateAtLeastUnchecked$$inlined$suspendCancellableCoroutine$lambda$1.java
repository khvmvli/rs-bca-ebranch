package androidx.lifecycle;

import o.GetBranchROPresenter;
import o.Page6KLFragment;
import o.ProsesTarikanFragment;
import o.onRequestPermissionsResult;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.performContextItemSelected;
import o.pilihNoRek;
import o.subscribeReservationRescheduleEvent;
/* loaded from: classes-dex2jar.jar:androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.class */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1 implements onResume {
    final /* synthetic */ GetBranchROPresenter a;
    final /* synthetic */ onRequestPermissionsResult b;
    final /* synthetic */ onRequestPermissionsResult.read d;
    final /* synthetic */ pilihNoRek e;

    @Override // o.onResume
    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        Object obj;
        subscribeReservationRescheduleEvent.e(performcontextitemselected, "");
        subscribeReservationRescheduleEvent.e(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver, "");
        if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.e(this.d)) {
            this.b.e(this);
            GetBranchROPresenter getBranchROPresenter = this.a;
            pilihNoRek pilihnorek = this.e;
            try {
                Page6KLFragment.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver = Page6KLFragment.a;
                obj = Page6KLFragment.d(pilihnorek.invoke());
            } catch (Throwable th) {
                Page6KLFragment.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver2 = Page6KLFragment.a;
                subscribeReservationRescheduleEvent.e(th, "");
                obj = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th));
            }
            getBranchROPresenter.resumeWith(obj);
        } else if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY) {
            this.b.e(this);
            ProsesTarikanFragment prosesTarikanFragment = this.a;
            LifecycleDestroyedException lifecycleDestroyedException = new LifecycleDestroyedException();
            Page6KLFragment.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver3 = Page6KLFragment.a;
            subscribeReservationRescheduleEvent.e(lifecycleDestroyedException, "");
            prosesTarikanFragment.resumeWith(Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(lifecycleDestroyedException)));
        }
    }
}
