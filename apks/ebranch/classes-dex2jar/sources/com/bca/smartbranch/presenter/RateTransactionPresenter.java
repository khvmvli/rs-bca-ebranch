package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.loginAsGuest;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/RateTransactionPresenter.class */
public class RateTransactionPresenter {
    public Call<OpenAccountSuccessActivity<Object>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver e;

    public RateTransactionPresenter() {
        App.d().c(this);
    }

    public final void d(loginAsGuest loginasguest) {
        this.e.t();
        Call<OpenAccountSuccessActivity<Object>> d = this.apiService.d(loginasguest);
        this.a = d;
        d.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.RateTransactionPresenter.4
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (RateTransactionPresenter.this.a != null && !RateTransactionPresenter.this.a.isCanceled()) {
                    RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver rateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver = RateTransactionPresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        rateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver.j(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    rateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver.j(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<Object> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver rateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver = RateTransactionPresenter.this.e;
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        detailRTGSCNY detailrtgscny2 = body2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body2.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        rateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver.i(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                        return;
                    }
                    RateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver rateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = RateTransactionPresenter.this.e;
                    OpenAccountSuccessActivity<Object> body3 = response.body();
                    detailRTGSCNY detailrtgscny3 = body3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny3.e;
                    rateTransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver2.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny3.b);
                    return;
                }
                RateTransactionPresenter.this.e.g(response.message());
            }
        });
    }
}
