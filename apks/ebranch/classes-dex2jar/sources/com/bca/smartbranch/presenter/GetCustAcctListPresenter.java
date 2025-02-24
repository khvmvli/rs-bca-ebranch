package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.localdb.User;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.getPromotion;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCustAcctListPresenter.class */
public class GetCustAcctListPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> b;
    public read e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCustAcctListPresenter$read.class */
    public interface read {
        void B(String str);

        @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        void b(String str);

        @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        void b_(String str);

        void c(GetCustAcctListResponse getCustAcctListResponse);

        @Override // com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
        void g_();

        void o(String str);

        void v(String str);
    }

    public GetCustAcctListPresenter() {
        App.d().a(this);
    }

    public final void b(User user, String str) {
        this.e.g_();
        Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> b = this.apiService.b(getPromotion.e(user), user.getEmail(), str);
        this.b = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<GetCustAcctListResponse>>() { // from class: com.bca.smartbranch.presenter.GetCustAcctListPresenter.5
            public final void onFailure(Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call, Throwable th) {
                String str2;
                if (GetCustAcctListPresenter.this.b != null && !GetCustAcctListPresenter.this.b.isCanceled()) {
                    read read2 = GetCustAcctListPresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str2 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str2 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        read2.v(str2);
                    }
                    str2 = "Oops! Terjadi kesalahan.";
                    read2.v(str2);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call, Response<OpenAccountSuccessActivity<GetCustAcctListResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        read read2 = GetCustAcctListPresenter.this.e;
                        OpenAccountSuccessActivity<GetCustAcctListResponse> body2 = response.body();
                        GetCustAcctListResponse getCustAcctListResponse = body2.d;
                        if (getCustAcctListResponse == null) {
                            getCustAcctListResponse = body2.a;
                            if (getCustAcctListResponse == null) {
                                getCustAcctListResponse = null;
                            }
                        }
                        read2.c(getCustAcctListResponse);
                        return;
                    }
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str2 = detailrtgscny2.a;
                    if ((str2 != null ? str2 : detailrtgscny2.c).equals("MID-00-898")) {
                        read read3 = GetCustAcctListPresenter.this.e;
                        OpenAccountSuccessActivity<GetCustAcctListResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        read3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str3 = detailrtgscny4.a;
                    if ((str3 != null ? str3 : detailrtgscny4.c).equals("MID-00-899")) {
                        read read4 = GetCustAcctListPresenter.this.e;
                        OpenAccountSuccessActivity<GetCustAcctListResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        read4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    read read5 = GetCustAcctListPresenter.this.e;
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    read5.o(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                GetCustAcctListPresenter.this.e.B(response.message());
            }
        });
    }
}
