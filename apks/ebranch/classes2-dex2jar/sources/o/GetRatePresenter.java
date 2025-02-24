package o;

import o.Page6KLFragment;
/* loaded from: classes2-dex2jar.jar:o/GetRatePresenter.class */
public final class GetRatePresenter {
    public static final <T> Object b(Object obj, ProsesTarikanFragment<? super T> prosesTarikanFragment) {
        Object obj2;
        if (obj instanceof GetDaftarPekerjaanPresenter) {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
            Throwable th = ((GetDaftarPekerjaanPresenter) obj).a;
            Throwable th2 = th;
            if (RateTransactionPresenter.b()) {
                th2 = !(prosesTarikanFragment instanceof SumberDanaDataPemilikSetunFragment) ? th : getResponseHeadersString$com_github_ChuckerTeam_Chucker_library.c(th, (SumberDanaDataPemilikSetunFragment) prosesTarikanFragment);
            }
            subscribeReservationRescheduleEvent.e(th2, "");
            obj2 = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th2));
        } else {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
            obj2 = Page6KLFragment.d(obj);
        }
        return obj2;
    }

    public static final <T> Object e(Object obj, T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding) {
        Object obj2;
        Throwable e = Page6KLFragment.e(obj);
        if (e == null) {
            obj2 = obj;
            if (t1TransaksiTarikanUbahFragment_ViewBinding != null) {
                obj2 = new GetHBPresenter(obj, t1TransaksiTarikanUbahFragment_ViewBinding);
            }
        } else {
            obj2 = new GetDaftarPekerjaanPresenter(e, false, 2);
        }
        return obj2;
    }
}
