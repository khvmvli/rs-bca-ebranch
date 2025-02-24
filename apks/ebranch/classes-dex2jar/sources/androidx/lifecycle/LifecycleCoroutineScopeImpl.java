package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import o.InquiryLoadDataSetunPresenter;
import o.Page6KLFragment;
import o.ProsesTarikanFragment;
import o.ProsesTarikanFragment_ViewBinding;
import o.ReviewSetoranFragment_ViewBinding;
import o.UpdateReceiverDataPresenter;
import o.onCLickStatusNpwp;
import o.onClickInfo;
import o.onRequestPermissionsResult;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.onViewCreated;
import o.performContextItemSelected;
import o.showSiupNibPage;
import o.subscribeReservationRescheduleEvent;
/* loaded from: classes-dex2jar.jar:androidx/lifecycle/LifecycleCoroutineScopeImpl.class */
public final class LifecycleCoroutineScopeImpl extends onViewCreated implements onResume {
    final onRequestPermissionsResult b;
    private final ProsesTarikanFragment_ViewBinding d;

    /* loaded from: classes-dex2jar.jar:androidx/lifecycle/LifecycleCoroutineScopeImpl$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
        private /* synthetic */ Object a;
        int b;

        public RemoteActionCompatParcelizer(ProsesTarikanFragment prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            subscribeReservationRescheduleEvent.e(prosesTarikanFragment, "");
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(prosesTarikanFragment);
            remoteActionCompatParcelizer.a = obj;
            return remoteActionCompatParcelizer;
        }

        @Override // o.onClickInfo
        public final Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter = (InquiryLoadDataSetunPresenter) this.a;
                if (LifecycleCoroutineScopeImpl.this.b.a().compareTo(onRequestPermissionsResult.read.INITIALIZED) >= 0) {
                    LifecycleCoroutineScopeImpl.this.b.c(LifecycleCoroutineScopeImpl.this);
                } else {
                    UpdateReceiverDataPresenter b = inquiryLoadDataSetunPresenter.b().b(UpdateReceiverDataPresenter.b);
                    if (b != null) {
                        b.a((CancellationException) null);
                    }
                }
                return onCLickStatusNpwp.e;
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
        }
    }

    public LifecycleCoroutineScopeImpl(onRequestPermissionsResult onrequestpermissionsresult, ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        UpdateReceiverDataPresenter b;
        subscribeReservationRescheduleEvent.e(onrequestpermissionsresult, "");
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment_ViewBinding, "");
        this.b = onrequestpermissionsresult;
        this.d = prosesTarikanFragment_ViewBinding;
        if (onrequestpermissionsresult.a() == onRequestPermissionsResult.read.DESTROYED && (b = this.d.b(UpdateReceiverDataPresenter.b)) != null) {
            b.a((CancellationException) null);
        }
    }

    public final ProsesTarikanFragment_ViewBinding b() {
        return this.d;
    }

    @Override // o.onResume
    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        subscribeReservationRescheduleEvent.e(performcontextitemselected, "");
        subscribeReservationRescheduleEvent.e(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver, "");
        if (this.b.a().compareTo(onRequestPermissionsResult.read.DESTROYED) <= 0) {
            this.b.e(this);
            UpdateReceiverDataPresenter b = this.d.b(UpdateReceiverDataPresenter.b);
            if (b != null) {
                b.a((CancellationException) null);
            }
        }
    }
}
