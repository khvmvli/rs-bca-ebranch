package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.chooseReservasiTeller;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateProfilePresenter.class */
public class UpdateProfilePresenter {
    public Call<OpenAccountSuccessActivity<Object>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver e;

    public UpdateProfilePresenter() {
        App.d().a(this);
    }

    public final void d(String str, chooseReservasiTeller choosereservasiteller) {
        this.e.t();
        Call<OpenAccountSuccessActivity<Object>> c = this.apiService.c(str, choosereservasiteller);
        this.a = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.UpdateProfilePresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str2;
                if (UpdateProfilePresenter.this.a != null && !UpdateProfilePresenter.this.a.isCanceled()) {
                    UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver updateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver = UpdateProfilePresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str2 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str2 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        updateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver.e(str2);
                    }
                    str2 = "Oops! Terjadi kesalahan.";
                    updateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver.e(str2);
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
                        UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver updateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver = UpdateProfilePresenter.this.e;
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        if (body2.d == null) {
                            Object obj = body2.a;
                        }
                        OpenAccountSuccessActivity<Object> body3 = response.body();
                        detailRTGSCNY detailrtgscny2 = body3.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body3.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver != null) {
                            String str2 = detailrtgscny_mediabrowsercompat_customactionresultreceiver.c;
                        } else {
                            String str3 = detailrtgscny2.b;
                        }
                        updateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver.s();
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body4 = response.body();
                    detailRTGSCNY detailrtgscny3 = body4.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body4.b;
                    }
                    String str4 = detailrtgscny3.a;
                    if ((str4 != null ? str4 : detailrtgscny3.c).equals("MID-00-898")) {
                        UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver updateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver2 = UpdateProfilePresenter.this.e;
                        OpenAccountSuccessActivity<Object> body5 = response.body();
                        detailRTGSCNY detailrtgscny4 = body5.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = body5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                        updateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body6 = response.body();
                    detailRTGSCNY detailrtgscny5 = body6.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = body6.b;
                    }
                    String str5 = detailrtgscny5.a;
                    if ((str5 != null ? str5 : detailrtgscny5.c).equals("MID-00-899")) {
                        UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver updateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver3 = UpdateProfilePresenter.this.e;
                        OpenAccountSuccessActivity<Object> body7 = response.body();
                        detailRTGSCNY detailrtgscny6 = body7.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = body7.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        updateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver3.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver updateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver4 = UpdateProfilePresenter.this.e;
                    OpenAccountSuccessActivity<Object> body8 = response.body();
                    detailRTGSCNY detailrtgscny7 = body8.c;
                    if (detailrtgscny7 == null) {
                        detailrtgscny7 = body8.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny7.e;
                    updateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver4.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny7.b);
                    return;
                }
                UpdateProfilePresenter.this.e.a(response.message());
            }
        });
    }
}
