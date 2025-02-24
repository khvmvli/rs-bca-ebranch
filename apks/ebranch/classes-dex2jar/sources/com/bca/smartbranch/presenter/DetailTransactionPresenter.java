package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import o.InfoDocumentUnderlyingActivity;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DetailTransactionPresenter.class */
public class DetailTransactionPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<DetailTransactionResponse>> c;
    public read e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DetailTransactionPresenter$read.class */
    public interface read {
        void a_(String str);

        void a_(List<DetailTransactionResponse.TxnDataDetail> list);

        void b(String str);

        void b_(String str);

        void d(String str);

        void f_(String str);

        void h_();
    }

    public DetailTransactionPresenter() {
        App.d().e(this);
    }

    public final void d(String str, InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity) {
        this.e.h_();
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> e = this.apiService.e(str, infoDocumentUnderlyingActivity.d, infoDocumentUnderlyingActivity.a, infoDocumentUnderlyingActivity.e, infoDocumentUnderlyingActivity.b);
        this.c = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<DetailTransactionResponse>>() { // from class: com.bca.smartbranch.presenter.DetailTransactionPresenter.4
            public final void onFailure(Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call, Throwable th) {
                String str2;
                if (DetailTransactionPresenter.this.c != null && !DetailTransactionPresenter.this.c.isCanceled()) {
                    read read2 = DetailTransactionPresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str2 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str2 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        read2.a_(str2);
                    }
                    str2 = "Oops! Terjadi kesalahan.";
                    read2.a_(str2);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call, Response<OpenAccountSuccessActivity<DetailTransactionResponse>> response) {
                DetailTransactionResponse detailTransactionResponse;
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<DetailTransactionResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        OpenAccountSuccessActivity<DetailTransactionResponse> body2 = response.body();
                        DetailTransactionResponse detailTransactionResponse2 = body2.d;
                        DetailTransactionResponse detailTransactionResponse3 = null;
                        if (detailTransactionResponse2 == null) {
                            detailTransactionResponse2 = body2.a;
                            if (detailTransactionResponse2 == null) {
                                detailTransactionResponse2 = null;
                            }
                        }
                        if (detailTransactionResponse2 != null) {
                            read read2 = DetailTransactionPresenter.this.e;
                            OpenAccountSuccessActivity<DetailTransactionResponse> body3 = response.body();
                            detailTransactionResponse3 = body3.d;
                            if (detailTransactionResponse3 == null && (detailTransactionResponse = body3.a) != null) {
                                detailTransactionResponse3 = detailTransactionResponse;
                            }
                            read2.a_(detailTransactionResponse3.getTxnDataDetailList());
                            return;
                        }
                        return;
                    }
                    OpenAccountSuccessActivity<DetailTransactionResponse> body4 = response.body();
                    detailRTGSCNY detailrtgscny2 = body4.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body4.b;
                    }
                    String str2 = detailrtgscny2.a;
                    if ((str2 != null ? str2 : detailrtgscny2.c).equals("MID-00-898")) {
                        read read3 = DetailTransactionPresenter.this.e;
                        OpenAccountSuccessActivity<DetailTransactionResponse> body5 = response.body();
                        detailRTGSCNY detailrtgscny3 = body5.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        read3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<DetailTransactionResponse> body6 = response.body();
                    detailRTGSCNY detailrtgscny4 = body6.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body6.b;
                    }
                    String str3 = detailrtgscny4.a;
                    if ((str3 != null ? str3 : detailrtgscny4.c).equals("MID-00-899")) {
                        read read4 = DetailTransactionPresenter.this.e;
                        OpenAccountSuccessActivity<DetailTransactionResponse> body7 = response.body();
                        detailRTGSCNY detailrtgscny5 = body7.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body7.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        read4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    read read5 = DetailTransactionPresenter.this.e;
                    OpenAccountSuccessActivity<DetailTransactionResponse> body8 = response.body();
                    detailRTGSCNY detailrtgscny6 = body8.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body8.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    read5.f_(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                DetailTransactionPresenter.this.e.d(response.message());
            }
        });
    }
}
