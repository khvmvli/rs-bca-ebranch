package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.forgotPin;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/RegistrationPresenter.class */
public class RegistrationPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<Object>> c;
    public RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver e;

    public RegistrationPresenter() {
        App.d().c(this);
    }

    public final void e(forgotPin forgotpin) {
        this.e.w();
        Call<OpenAccountSuccessActivity<Object>> c = this.apiService.c(forgotpin);
        this.c = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.RegistrationPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (RegistrationPresenter.this.c != null && !RegistrationPresenter.this.c.isCanceled()) {
                    RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver registrationPresenter$MediaBrowserCompat$CustomActionResultReceiver = RegistrationPresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        registrationPresenter$MediaBrowserCompat$CustomActionResultReceiver.e(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    registrationPresenter$MediaBrowserCompat$CustomActionResultReceiver.e(str);
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
                        RegistrationPresenter.this.e.y();
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body2 = response.body();
                    detailRTGSCNY detailrtgscny2 = body2.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body2.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-01-111")) {
                        RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver registrationPresenter$MediaBrowserCompat$CustomActionResultReceiver = RegistrationPresenter.this.e;
                        OpenAccountSuccessActivity<Object> body3 = response.body();
                        detailRTGSCNY detailrtgscny3 = body3.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body3.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver != null) {
                            String str2 = detailrtgscny_mediabrowsercompat_customactionresultreceiver.c;
                        } else {
                            String str3 = detailrtgscny3.b;
                        }
                        registrationPresenter$MediaBrowserCompat$CustomActionResultReceiver.s();
                        return;
                    }
                    RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver registrationPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = RegistrationPresenter.this.e;
                    OpenAccountSuccessActivity<Object> body4 = response.body();
                    detailRTGSCNY detailrtgscny4 = body4.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body4.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                    registrationPresenter$MediaBrowserCompat$CustomActionResultReceiver2.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                    return;
                }
                RegistrationPresenter.this.e.d(response.message());
            }
        });
    }
}
