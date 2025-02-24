package o;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import o.Page6KLFragment;
import o.setRecyclerListener;
/* loaded from: classes-dex2jar.jar:o/FragmentContainerView$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class FragmentContainerView$MediaBrowserCompat$CustomActionResultReceiver {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/FragmentContainerView$MediaBrowserCompat$CustomActionResultReceiver$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, onCLickStatusNpwp> {
        final /* synthetic */ CancellationSignal a;
        final /* synthetic */ UpdateReceiverDataPresenter d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(CancellationSignal cancellationSignal, UpdateReceiverDataPresenter updateReceiverDataPresenter) {
            super(1);
            this.a = cancellationSignal;
            this.d = updateReceiverDataPresenter;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(Throwable th) {
            setRecyclerListener.write.c(this.a);
            this.d.a((CancellationException) null);
            return onCLickStatusNpwp.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/FragmentContainerView$MediaBrowserCompat$CustomActionResultReceiver$read.class */
    public static final class read extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super R>, Object> {
        int c;
        final /* synthetic */ Callable<R> e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(Callable<R> callable, ProsesTarikanFragment<? super read> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
            this.e = callable;
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new read(this.e, prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, Object obj) {
            return create(inquiryLoadDataSetunPresenter, (ProsesTarikanFragment) obj).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                return this.e.call();
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/FragmentContainerView$MediaBrowserCompat$CustomActionResultReceiver$write.class */
    public static final class write extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
        int b;
        final /* synthetic */ Callable<R> d;
        final /* synthetic */ GetBranchROPresenter<R> e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public write(Callable<R> callable, GetBranchROPresenter<? super R> getBranchROPresenter, ProsesTarikanFragment<? super write> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
            this.d = callable;
            this.e = getBranchROPresenter;
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new write(this.d, this.e, prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                try {
                    Object call = this.d.call();
                    ProsesTarikanFragment prosesTarikanFragment = this.e;
                    Page6KLFragment.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver = Page6KLFragment.a;
                    prosesTarikanFragment.resumeWith(Page6KLFragment.d(call));
                } catch (Throwable th) {
                    ProsesTarikanFragment prosesTarikanFragment2 = this.e;
                    Page6KLFragment.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver2 = Page6KLFragment.a;
                    subscribeReservationRescheduleEvent.e(th, "");
                    prosesTarikanFragment2.resumeWith(Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th)));
                }
                return onCLickStatusNpwp.e;
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
        }
    }

    private FragmentContainerView$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ FragmentContainerView$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }
}
