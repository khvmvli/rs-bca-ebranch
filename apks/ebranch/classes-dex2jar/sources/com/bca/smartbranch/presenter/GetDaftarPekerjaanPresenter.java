package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetDaftarPekerjaanPresenter.class */
public class GetDaftarPekerjaanPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> b;
    public GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver c;

    public GetDaftarPekerjaanPresenter() {
        App.d().e(this);
    }

    public final void d(String str) {
        this.c.b();
        Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> g = this.apiService.g(str);
        this.b = g;
        g.enqueue(new Callback<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>>() { // from class: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> call, Throwable th) {
                String str2;
                if (GetDaftarPekerjaanPresenter.this.b != null && !GetDaftarPekerjaanPresenter.this.b.isCanceled()) {
                    GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver getDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetDaftarPekerjaanPresenter.this.c;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str2 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str2 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        getDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver.c(str2);
                    }
                    str2 = "Oops! Terjadi kesalahan.";
                    getDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver.c(str2);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> call, Response<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<GetDaftarPekerjaanResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver getDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetDaftarPekerjaanPresenter.this.c;
                        OpenAccountSuccessActivity<GetDaftarPekerjaanResponse> body2 = response.body();
                        GetDaftarPekerjaanResponse getDaftarPekerjaanResponse = body2.d;
                        if (getDaftarPekerjaanResponse == null) {
                            getDaftarPekerjaanResponse = body2.a;
                            if (getDaftarPekerjaanResponse == null) {
                                getDaftarPekerjaanResponse = null;
                            }
                        }
                        getDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver.a(getDaftarPekerjaanResponse);
                        return;
                    }
                    GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver getDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = GetDaftarPekerjaanPresenter.this.c;
                    OpenAccountSuccessActivity<GetDaftarPekerjaanResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    getDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver2.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                GetDaftarPekerjaanPresenter.this.c.i(response.message());
            }
        });
    }
}
