package o;
/* loaded from: classes2-dex2jar.jar:o/GetAreaPresenter.class */
public final /* synthetic */ class GetAreaPresenter {
    public static final <T> Object a(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, onClickInfo<? super InquiryLoadDataSetunPresenter, ? super ProsesTarikanFragment<? super T>, ? extends Object> onclickinfo, ProsesTarikanFragment<? super T> prosesTarikanFragment) {
        Object obj;
        boolean z;
        ProsesTarikanFragment_ViewBinding context = prosesTarikanFragment.getContext();
        ProsesTarikanFragment_ViewBinding b = context.b(prosesTarikanFragment_ViewBinding);
        UpdateReceiverDataPresenter updateReceiverDataPresenter = (UpdateReceiverDataPresenter) b.b(UpdateReceiverDataPresenter.b);
        if (updateReceiverDataPresenter == null || updateReceiverDataPresenter.e()) {
            if (b == context) {
                getResponseImageData getresponseimagedata = new getResponseImageData(b, prosesTarikanFragment);
                obj = hasTheSameContent$com_github_ChuckerTeam_Chucker_library.b(getresponseimagedata, getresponseimagedata, (onClickInfo<? super getResponseImageData, ? super ProsesTarikanFragment<? super T>, ? extends Object>) onclickinfo);
            } else if (subscribeReservationRescheduleEvent.b(b.b(ProsesORFragment.e), context.b(ProsesORFragment.e))) {
                GlideException glideException = new GlideException(b, prosesTarikanFragment);
                Object b2 = getResponseSummaryText$com_github_ChuckerTeam_Chucker_library.b(b, null);
                try {
                    obj = hasTheSameContent$com_github_ChuckerTeam_Chucker_library.b((getResponseImageData) glideException, glideException, (onClickInfo<? super GlideException, ? super ProsesTarikanFragment<? super T>, ? extends Object>) onclickinfo);
                } finally {
                    getResponseSummaryText$com_github_ChuckerTeam_Chucker_library.d(b, b2);
                }
            } else {
                RegistrationPresenter registrationPresenter = new RegistrationPresenter(b, prosesTarikanFragment);
                getTookMs.c(onclickinfo, registrationPresenter, registrationPresenter, null);
                while (true) {
                    int i = registrationPresenter._decision;
                    z = true;
                    if (i == 0) {
                        if (RegistrationPresenter.d.compareAndSet(registrationPresenter, 0, 1)) {
                            break;
                        }
                    } else if (i == 2) {
                        z = false;
                    } else {
                        throw new IllegalStateException("Already suspended".toString());
                    }
                }
                if (z) {
                    obj = ReviewSetoranFragment_ViewBinding.COROUTINE_SUSPENDED;
                } else {
                    obj = Glide.d(registrationPresenter.n());
                    if (obj instanceof GetDaftarPekerjaanPresenter) {
                        throw ((GetDaftarPekerjaanPresenter) obj).a;
                    }
                }
            }
            if (obj == ReviewSetoranFragment_ViewBinding.COROUTINE_SUSPENDED) {
                subscribeReservationRescheduleEvent.e(prosesTarikanFragment, "");
            }
            return obj;
        }
        throw updateReceiverDataPresenter.h();
    }

    public static /* synthetic */ UpdateReceiverDataPresenter a(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, KategoriTujuanTransaksiORPresenter kategoriTujuanTransaksiORPresenter, onClickInfo onclickinfo, int i) {
        if ((i & 1) != 0) {
            prosesTarikanFragment_ViewBinding = ReviewSetoranFragment.e;
        }
        if ((i & 2) != 0) {
            kategoriTujuanTransaksiORPresenter = KategoriTujuanTransaksiORPresenter.DEFAULT;
        }
        return GetAvailableBookingV2Presenter.d(inquiryLoadDataSetunPresenter, prosesTarikanFragment_ViewBinding, kategoriTujuanTransaksiORPresenter, onclickinfo);
    }
}
