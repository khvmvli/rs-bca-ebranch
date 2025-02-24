package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import o.InfoKursORActivity;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetBranchROPresenter.class */
public class GetBranchROPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<GetBranchROResponse>> b;
    public read e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetBranchROPresenter$read.class */
    public interface read {
        @Override // com.bca.smartbranch.presenter.GetCitySearchPresenter.write, com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
        void b(String str);

        @Override // com.bca.smartbranch.presenter.GetCitySearchPresenter.write, com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
        void b_(String str);

        void c(String str);

        void d(String str);

        void d(List<GetBranchROResponse.DetailBranch> list);

        void e(String str);

        void g_();

        void u();
    }

    public GetBranchROPresenter() {
        App.d().d(this);
    }

    public final void a(String str, InfoKursORActivity infoKursORActivity) {
        this.e.g_();
        Call<OpenAccountSuccessActivity<GetBranchROResponse>> c = this.apiService.c(str, infoKursORActivity.e, infoKursORActivity.d, infoKursORActivity.c, infoKursORActivity.b);
        this.b = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<GetBranchROResponse>>() { // from class: com.bca.smartbranch.presenter.GetBranchROPresenter.4
            public final void onFailure(Call<OpenAccountSuccessActivity<GetBranchROResponse>> call, Throwable th) {
                String str2;
                if (GetBranchROPresenter.this.b != null && !GetBranchROPresenter.this.b.isCanceled()) {
                    read read2 = GetBranchROPresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str2 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str2 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        read2.d(str2);
                    }
                    str2 = "Oops! Terjadi kesalahan.";
                    read2.d(str2);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<GetBranchROResponse>> call, Response<OpenAccountSuccessActivity<GetBranchROResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<GetBranchROResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        OpenAccountSuccessActivity<GetBranchROResponse> body2 = response.body();
                        GetBranchROResponse getBranchROResponse = body2.d;
                        if (getBranchROResponse == null) {
                            getBranchROResponse = body2.a;
                            if (getBranchROResponse == null) {
                                getBranchROResponse = null;
                            }
                        }
                        GetBranchROPresenter.this.e.d(getBranchROResponse.getBranchLists());
                        return;
                    }
                    OpenAccountSuccessActivity<GetBranchROResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str2 = detailrtgscny2.a;
                    if ((str2 != null ? str2 : detailrtgscny2.c).equals("MID-00-898")) {
                        read read2 = GetBranchROPresenter.this.e;
                        OpenAccountSuccessActivity<GetBranchROResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        read2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<GetBranchROResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str3 = detailrtgscny4.a;
                    if ((str3 != null ? str3 : detailrtgscny4.c).equals("MID-00-899")) {
                        read read3 = GetBranchROPresenter.this.e;
                        OpenAccountSuccessActivity<GetBranchROResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        read3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    OpenAccountSuccessActivity<GetBranchROResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    String str4 = detailrtgscny6.a;
                    if ((str4 != null ? str4 : detailrtgscny6.c).equals("EBR-2-373")) {
                        read read4 = GetBranchROPresenter.this.e;
                        OpenAccountSuccessActivity<GetBranchROResponse> body8 = response.body();
                        detailRTGSCNY detailrtgscny7 = body8.c;
                        if (detailrtgscny7 == null) {
                            detailrtgscny7 = body8.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny7.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null) {
                            String str5 = detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c;
                        } else {
                            String str6 = detailrtgscny7.b;
                        }
                        read4.u();
                        return;
                    }
                    read read5 = GetBranchROPresenter.this.e;
                    OpenAccountSuccessActivity<GetBranchROResponse> body9 = response.body();
                    detailRTGSCNY detailrtgscny8 = body9.c;
                    if (detailrtgscny8 == null) {
                        detailrtgscny8 = body9.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny8.e;
                    read5.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny8.b);
                    return;
                }
                GetBranchROPresenter.this.e.e(response.message());
            }
        });
    }
}
