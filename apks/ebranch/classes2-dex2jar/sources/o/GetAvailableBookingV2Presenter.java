package o;

import kotlin.NoWhenBranchMatchedException;
import o.KategoriTujuanTransaksiORPresenter;
import o.Page6KLFragment;
/* loaded from: classes2-dex2jar.jar:o/GetAvailableBookingV2Presenter.class */
public final class GetAvailableBookingV2Presenter {
    public static final UpdateReceiverDataPresenter d(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, KategoriTujuanTransaksiORPresenter kategoriTujuanTransaksiORPresenter, onClickInfo<? super InquiryLoadDataSetunPresenter, ? super ProsesTarikanFragment<? super onCLickStatusNpwp>, ? extends Object> onclickinfo) {
        ProsesTarikanFragment_ViewBinding c = GetTxnBerkalaDetailPresenter.c(inquiryLoadDataSetunPresenter, prosesTarikanFragment_ViewBinding);
        Registry$NoResultEncoderAvailableException registry$NoResultEncoderAvailableException = kategoriTujuanTransaksiORPresenter == KategoriTujuanTransaksiORPresenter.LAZY ? new ParcelFileDescriptorRewinder$InternalRewinder(c, onclickinfo) { // from class: o.Registry$NoResultEncoderAvailableException
            private final ProsesTarikanFragment<onCLickStatusNpwp> d;

            {
                this.d = ReviewSetoranReservasiUbahFragment_ViewBinding.e(r7, this, this);
            }

            @Override // o.GeneratedAppGlideModule
            protected final void l() {
                Registry$NoResultEncoderAvailableException registry$NoResultEncoderAvailableException2 = this;
                try {
                    ProsesTarikanFragment e = ReviewSetoranReservasiUbahFragment_ViewBinding.e(this.d);
                    Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
                    getRequestDateString$com_github_ChuckerTeam_Chucker_library.c(e, Page6KLFragment.d(onCLickStatusNpwp.e), null);
                } catch (Throwable th) {
                    Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
                    subscribeReservationRescheduleEvent.e(th, "");
                    registry$NoResultEncoderAvailableException2.resumeWith(Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th)));
                    throw th;
                }
            }
        } : new ParcelFileDescriptorRewinder$InternalRewinder(c, true);
        ParcelFileDescriptorRewinder$InternalRewinder parcelFileDescriptorRewinder$InternalRewinder = registry$NoResultEncoderAvailableException;
        int i = KategoriTujuanTransaksiORPresenter.IconCompatParcelizer.e[kategoriTujuanTransaksiORPresenter.ordinal()];
        if (i == 1) {
            getTookMs.c(onclickinfo, registry$NoResultEncoderAvailableException, parcelFileDescriptorRewinder$InternalRewinder, null);
        } else if (i == 2) {
            subscribeReservationRescheduleEvent.e(onclickinfo, "");
            subscribeReservationRescheduleEvent.e(parcelFileDescriptorRewinder$InternalRewinder, "");
            ProsesTarikanFragment e = ReviewSetoranReservasiUbahFragment_ViewBinding.e(ReviewSetoranReservasiUbahFragment_ViewBinding.e(onclickinfo, registry$NoResultEncoderAvailableException, parcelFileDescriptorRewinder$InternalRewinder));
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
            e.resumeWith(Page6KLFragment.d(onCLickStatusNpwp.e));
        } else if (i == 3) {
            hasTheSameContent$com_github_ChuckerTeam_Chucker_library.b((onClickInfo<? super ParcelFileDescriptorRewinder$InternalRewinder, ? super ProsesTarikanFragment<? super T>, ? extends Object>) onclickinfo, registry$NoResultEncoderAvailableException, (ProsesTarikanFragment) parcelFileDescriptorRewinder$InternalRewinder);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return registry$NoResultEncoderAvailableException;
    }
}
