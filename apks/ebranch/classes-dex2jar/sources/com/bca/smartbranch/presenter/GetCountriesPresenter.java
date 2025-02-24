package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.OpenCCSuccessActivity_ViewBinding;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCountriesPresenter.class */
public class GetCountriesPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public GetCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver b;
    public Call<OpenAccountSuccessActivity<OpenCCSuccessActivity_ViewBinding>> c;

    public GetCountriesPresenter() {
        App.d().e(this);
    }

    public final void e() {
        this.b.s();
        Call<OpenAccountSuccessActivity<OpenCCSuccessActivity_ViewBinding>> d = this.apiService.d();
        this.c = d;
        d.enqueue(new Callback<OpenAccountSuccessActivity<OpenCCSuccessActivity_ViewBinding>>() { // from class: com.bca.smartbranch.presenter.GetCountriesPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<OpenCCSuccessActivity_ViewBinding>> call, Throwable th) {
                String str;
                if (GetCountriesPresenter.this.c != null && !GetCountriesPresenter.this.c.isCanceled()) {
                    GetCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver getCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCountriesPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        getCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver.b(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    getCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver.b(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<OpenCCSuccessActivity_ViewBinding>> call, Response<OpenAccountSuccessActivity<OpenCCSuccessActivity_ViewBinding>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<OpenCCSuccessActivity_ViewBinding> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        GetCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver getCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCountriesPresenter.this.b;
                        OpenAccountSuccessActivity<OpenCCSuccessActivity_ViewBinding> body2 = response.body();
                        OpenCCSuccessActivity_ViewBinding openCCSuccessActivity_ViewBinding = body2.d;
                        if (openCCSuccessActivity_ViewBinding == null) {
                            openCCSuccessActivity_ViewBinding = body2.a;
                            if (openCCSuccessActivity_ViewBinding == null) {
                                openCCSuccessActivity_ViewBinding = null;
                            }
                        }
                        getCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver.b(openCCSuccessActivity_ViewBinding);
                        return;
                    }
                    GetCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver getCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = GetCountriesPresenter.this.b;
                    OpenAccountSuccessActivity<OpenCCSuccessActivity_ViewBinding> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    getCountriesPresenter$MediaBrowserCompat$CustomActionResultReceiver2.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                GetCountriesPresenter.this.b.d(response.message());
            }
        });
    }
}
