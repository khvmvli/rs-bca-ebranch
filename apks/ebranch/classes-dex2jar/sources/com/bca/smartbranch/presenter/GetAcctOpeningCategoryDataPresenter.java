package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAcctOpeningCategoryDataPresenter.class */
public class GetAcctOpeningCategoryDataPresenter {
    public Call<OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RemoteActionCompatParcelizer c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAcctOpeningCategoryDataPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a(GetAcctOpeningCategoryDataResponse getAcctOpeningCategoryDataResponse);

        void a_(String str);

        void b(String str);

        void b_(String str);

        void g_();

        void m_(String str);

        void n_(String str);
    }

    public GetAcctOpeningCategoryDataPresenter() {
        App.d().c(this);
    }

    public final void b() {
        this.c.g_();
        Call<OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse>> e = this.apiService.e();
        this.a = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse>>() { // from class: com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse>> call, Throwable th) {
                String str;
                if (GetAcctOpeningCategoryDataPresenter.this.a != null && !GetAcctOpeningCategoryDataPresenter.this.a.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = GetAcctOpeningCategoryDataPresenter.this.c;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        remoteActionCompatParcelizer.a_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    remoteActionCompatParcelizer.a_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse>> call, Response<OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = GetAcctOpeningCategoryDataPresenter.this.c;
                        OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse> body2 = response.body();
                        GetAcctOpeningCategoryDataResponse getAcctOpeningCategoryDataResponse = body2.d;
                        if (getAcctOpeningCategoryDataResponse == null) {
                            getAcctOpeningCategoryDataResponse = body2.a;
                            if (getAcctOpeningCategoryDataResponse == null) {
                                getAcctOpeningCategoryDataResponse = null;
                            }
                        }
                        remoteActionCompatParcelizer.a(getAcctOpeningCategoryDataResponse);
                        return;
                    }
                    OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = GetAcctOpeningCategoryDataPresenter.this.c;
                        OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        remoteActionCompatParcelizer2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = GetAcctOpeningCategoryDataPresenter.this.c;
                        OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        remoteActionCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = GetAcctOpeningCategoryDataPresenter.this.c;
                    OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    remoteActionCompatParcelizer4.m_(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                GetAcctOpeningCategoryDataPresenter.this.c.n_(response.message());
            }
        });
    }
}
