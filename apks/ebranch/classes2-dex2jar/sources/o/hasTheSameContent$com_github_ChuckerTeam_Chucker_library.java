package o;

import o.Page6KLFragment;
/* loaded from: classes2-dex2jar.jar:o/hasTheSameContent$com_github_ChuckerTeam_Chucker_library.class */
public final class hasTheSameContent$com_github_ChuckerTeam_Chucker_library {
    public static final <T, R> Object b(getResponseImageData<? super T> getresponseimagedata, R r, onClickInfo<? super R, ? super ProsesTarikanFragment<? super T>, ? extends Object> onclickinfo) {
        Object obj;
        Object obj2;
        try {
        } catch (Throwable th) {
            obj = new GetDaftarPekerjaanPresenter(th, false, 2);
        }
        if (onclickinfo != null) {
            obj = ((onClickInfo) subscriberLoadDraftCC.d(onclickinfo, 2)).invoke(r, getresponseimagedata);
            if (obj == ReviewSetoranFragment_ViewBinding.COROUTINE_SUSPENDED) {
                obj2 = ReviewSetoranFragment_ViewBinding.COROUTINE_SUSPENDED;
            } else {
                Object c = getresponseimagedata.c(obj);
                if (c == Glide.d) {
                    obj2 = ReviewSetoranFragment_ViewBinding.COROUTINE_SUSPENDED;
                } else if (c instanceof GetDaftarPekerjaanPresenter) {
                    Throwable th2 = ((GetDaftarPekerjaanPresenter) c).a;
                    ProsesTarikanFragment<? super T> prosesTarikanFragment = getresponseimagedata.e;
                    Throwable th3 = th2;
                    if (RateTransactionPresenter.b()) {
                        th3 = !(prosesTarikanFragment instanceof SumberDanaDataPemilikSetunFragment) ? th2 : getResponseHeadersString$com_github_ChuckerTeam_Chucker_library.c(th2, (SumberDanaDataPemilikSetunFragment) prosesTarikanFragment);
                    }
                    throw th3;
                } else {
                    obj2 = Glide.d(c);
                }
            }
            return obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    public static final <R, T> void b(onClickInfo<? super R, ? super ProsesTarikanFragment<? super T>, ? extends Object> onclickinfo, R r, ProsesTarikanFragment<? super T> prosesTarikanFragment) {
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment, "");
        try {
            ProsesTarikanFragment_ViewBinding context = prosesTarikanFragment.getContext();
            Object b = getResponseSummaryText$com_github_ChuckerTeam_Chucker_library.b(context, null);
            if (onclickinfo != null) {
                Object invoke = ((onClickInfo) subscriberLoadDraftCC.d(onclickinfo, 2)).invoke(r, prosesTarikanFragment);
                getResponseSummaryText$com_github_ChuckerTeam_Chucker_library.d(context, b);
                if (invoke != ReviewSetoranFragment_ViewBinding.COROUTINE_SUSPENDED) {
                    Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
                    prosesTarikanFragment.resumeWith(Page6KLFragment.d(invoke));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
            subscribeReservationRescheduleEvent.e(th, "");
            prosesTarikanFragment.resumeWith(Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th)));
        }
    }
}
