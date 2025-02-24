package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.CustDataResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.fillForm;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCustDataPresenter.class */
public class GetCustDataPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<CustDataResponse>> b;
    public write d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCustDataPresenter$write.class */
    public interface write {
        @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        void b(String str);

        @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        void b_(String str);

        void d(CustDataResponse custDataResponse);

        @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
        void g_();

        void i(String str);

        void n(String str);

        void u();
    }

    public GetCustDataPresenter() {
        App.d().c(this);
    }

    public final void e(fillForm fillform) {
        this.d.g_();
        Call<OpenAccountSuccessActivity<CustDataResponse>> e = this.apiService.e(fillform);
        this.b = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<CustDataResponse>>() { // from class: com.bca.smartbranch.presenter.GetCustDataPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<CustDataResponse>> call, Throwable th) {
                String str;
                if (GetCustDataPresenter.this.b != null && !GetCustDataPresenter.this.b.isCanceled()) {
                    write write2 = GetCustDataPresenter.this.d;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        write2.a_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    write2.a_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<CustDataResponse>> call, Response<OpenAccountSuccessActivity<CustDataResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<CustDataResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = GetCustDataPresenter.this.d;
                        OpenAccountSuccessActivity<CustDataResponse> body2 = response.body();
                        CustDataResponse custDataResponse = body2.d;
                        if (custDataResponse == null) {
                            custDataResponse = body2.a;
                            if (custDataResponse == null) {
                                custDataResponse = null;
                            }
                        }
                        write2.d(custDataResponse);
                        return;
                    }
                    OpenAccountSuccessActivity<CustDataResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        write write3 = GetCustDataPresenter.this.d;
                        OpenAccountSuccessActivity<CustDataResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        write3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<CustDataResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        write write4 = GetCustDataPresenter.this.d;
                        OpenAccountSuccessActivity<CustDataResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        write4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    OpenAccountSuccessActivity<CustDataResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    String str3 = detailrtgscny6.a;
                    if ((str3 != null ? str3 : detailrtgscny6.c).equals("MID-07-003")) {
                        write write5 = GetCustDataPresenter.this.d;
                        OpenAccountSuccessActivity<CustDataResponse> body8 = response.body();
                        detailRTGSCNY detailrtgscny7 = body8.c;
                        if (detailrtgscny7 == null) {
                            detailrtgscny7 = body8.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny7.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null) {
                            String str4 = detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c;
                        } else {
                            String str5 = detailrtgscny7.b;
                        }
                        write5.u();
                        return;
                    }
                    write write6 = GetCustDataPresenter.this.d;
                    OpenAccountSuccessActivity<CustDataResponse> body9 = response.body();
                    detailRTGSCNY detailrtgscny8 = body9.c;
                    if (detailrtgscny8 == null) {
                        detailrtgscny8 = body9.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny8.e;
                    write6.i(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny8.b);
                    return;
                }
                GetCustDataPresenter.this.d.n(response.message());
            }
        });
    }
}
