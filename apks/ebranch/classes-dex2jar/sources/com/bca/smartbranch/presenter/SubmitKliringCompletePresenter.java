package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import o.subscribeReservationRescheduleEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/SubmitKliringCompletePresenter.class */
public final class SubmitKliringCompletePresenter {
    public Call<OpenAccountSuccessActivity<Object>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver b;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/SubmitKliringCompletePresenter$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Callback<OpenAccountSuccessActivity<Object>> {
        public IconCompatParcelizer() {
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
            SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver;
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            if (SubmitKliringCompletePresenter.this.a != null) {
                Call call2 = SubmitKliringCompletePresenter.this.a;
                boolean z = false;
                if (call2 != null) {
                    z = false;
                    if (!call2.isCanceled()) {
                        z = true;
                    }
                }
                if (z && (submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver = SubmitKliringCompletePresenter.this.b) != null) {
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver.e(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver.e(str);
                }
            }
        }

        public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(response, "");
            if (response.isSuccessful()) {
                OpenAccountSuccessActivity<Object> body = response.body();
                subscribeReservationRescheduleEvent.c(body);
                OpenAccountSuccessActivity<Object> openAccountSuccessActivity = body;
                detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                if (detailrtgscny == null) {
                    detailrtgscny = openAccountSuccessActivity.b;
                }
                if (detailrtgscny.e()) {
                    SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver = SubmitKliringCompletePresenter.this.b;
                    if (submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver != null) {
                        submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver.a();
                        return;
                    }
                    return;
                }
                OpenAccountSuccessActivity<Object> body2 = response.body();
                subscribeReservationRescheduleEvent.c(body2);
                OpenAccountSuccessActivity<Object> openAccountSuccessActivity2 = body2;
                detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity2.c;
                if (detailrtgscny2 == null) {
                    detailrtgscny2 = openAccountSuccessActivity2.b;
                }
                String str = detailrtgscny2.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str != null ? str : detailrtgscny2.c), (Object) "MID-00-898")) {
                    SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver2 = SubmitKliringCompletePresenter.this.b;
                    if (submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                        OpenAccountSuccessActivity<Object> body3 = response.body();
                        subscribeReservationRescheduleEvent.c(body3);
                        OpenAccountSuccessActivity<Object> openAccountSuccessActivity3 = body3;
                        detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity3.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = openAccountSuccessActivity3.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver2.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    return;
                }
                OpenAccountSuccessActivity<Object> body4 = response.body();
                subscribeReservationRescheduleEvent.c(body4);
                OpenAccountSuccessActivity<Object> openAccountSuccessActivity4 = body4;
                detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity4.c;
                if (detailrtgscny4 == null) {
                    detailrtgscny4 = openAccountSuccessActivity4.b;
                }
                String str2 = detailrtgscny4.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str2 != null ? str2 : detailrtgscny4.c), (Object) "MID-00-899")) {
                    SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver3 = SubmitKliringCompletePresenter.this.b;
                    if (submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver3 != null) {
                        OpenAccountSuccessActivity<Object> body5 = response.body();
                        subscribeReservationRescheduleEvent.c(body5);
                        OpenAccountSuccessActivity<Object> openAccountSuccessActivity5 = body5;
                        detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity5.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = openAccountSuccessActivity5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    return;
                }
                SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver4 = SubmitKliringCompletePresenter.this.b;
                if (submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver4 != null) {
                    OpenAccountSuccessActivity<Object> body6 = response.body();
                    subscribeReservationRescheduleEvent.c(body6);
                    OpenAccountSuccessActivity<Object> openAccountSuccessActivity6 = body6;
                    detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity6.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = openAccountSuccessActivity6.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver4.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                return;
            }
            SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver5 = SubmitKliringCompletePresenter.this.b;
            if (submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver5 != null) {
                submitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver5.c(response.message());
            }
        }
    }

    public SubmitKliringCompletePresenter() {
        App.d().a(this);
    }
}
