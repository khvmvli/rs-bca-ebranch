package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.request.TxnTellerRequest;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/TxnTellerPresenter.class */
public class TxnTellerPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public TxnTellerResponse c;
    public IconCompatParcelizer d;
    public Call<OpenAccountSuccessActivity<TxnTellerResponse>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/TxnTellerPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        void b(TxnTellerResponse txnTellerResponse);

        void b(String str);

        void b_(String str);

        void c(TxnTellerResponse txnTellerResponse);

        @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void g_();

        void i_(String str);

        void l(String str);
    }

    public TxnTellerPresenter() {
        App.d().c(this);
    }

    public final void b(String str, TxnTellerRequest txnTellerRequest, final String str2) {
        this.d.g_();
        Call<OpenAccountSuccessActivity<TxnTellerResponse>> d = this.apiService.d(str, txnTellerRequest);
        this.e = d;
        d.enqueue(new Callback<OpenAccountSuccessActivity<TxnTellerResponse>>() { // from class: com.bca.smartbranch.presenter.TxnTellerPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<TxnTellerResponse>> call, Throwable th) {
                String str3;
                if (TxnTellerPresenter.this.e != null && !TxnTellerPresenter.this.e.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = TxnTellerPresenter.this.d;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str3 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str3 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.a_(str3);
                    }
                    str3 = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.a_(str3);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<TxnTellerResponse>> call, Response<OpenAccountSuccessActivity<TxnTellerResponse>> response) {
                TxnTellerResponse txnTellerResponse;
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<TxnTellerResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        TxnTellerResponse txnTellerResponse2 = null;
                        if (str2.equalsIgnoreCase("kliring")) {
                            TxnTellerPresenter txnTellerPresenter = TxnTellerPresenter.this;
                            OpenAccountSuccessActivity<TxnTellerResponse> body2 = response.body();
                            TxnTellerResponse txnTellerResponse3 = body2.d;
                            if (txnTellerResponse3 == null) {
                                txnTellerResponse3 = body2.a;
                                if (txnTellerResponse3 == null) {
                                    txnTellerResponse3 = null;
                                }
                            }
                            txnTellerPresenter.c = txnTellerResponse3;
                        }
                        IconCompatParcelizer iconCompatParcelizer = TxnTellerPresenter.this.d;
                        OpenAccountSuccessActivity<TxnTellerResponse> body3 = response.body();
                        txnTellerResponse2 = body3.d;
                        if (txnTellerResponse2 == null && (txnTellerResponse = body3.a) != null) {
                            txnTellerResponse2 = txnTellerResponse;
                        }
                        iconCompatParcelizer.c(txnTellerResponse2);
                        return;
                    }
                    OpenAccountSuccessActivity<TxnTellerResponse> body4 = response.body();
                    detailRTGSCNY detailrtgscny2 = body4.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body4.b;
                    }
                    String str3 = detailrtgscny2.a;
                    if ((str3 != null ? str3 : detailrtgscny2.c).equals("MID-00-898")) {
                        IconCompatParcelizer iconCompatParcelizer2 = TxnTellerPresenter.this.d;
                        OpenAccountSuccessActivity<TxnTellerResponse> body5 = response.body();
                        detailRTGSCNY detailrtgscny3 = body5.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        iconCompatParcelizer2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<TxnTellerResponse> body6 = response.body();
                    detailRTGSCNY detailrtgscny4 = body6.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body6.b;
                    }
                    String str4 = detailrtgscny4.a;
                    if ((str4 != null ? str4 : detailrtgscny4.c).equals("MID-00-899")) {
                        IconCompatParcelizer iconCompatParcelizer3 = TxnTellerPresenter.this.d;
                        OpenAccountSuccessActivity<TxnTellerResponse> body7 = response.body();
                        detailRTGSCNY detailrtgscny5 = body7.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body7.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        iconCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    IconCompatParcelizer iconCompatParcelizer4 = TxnTellerPresenter.this.d;
                    OpenAccountSuccessActivity<TxnTellerResponse> body8 = response.body();
                    detailRTGSCNY detailrtgscny6 = body8.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body8.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    iconCompatParcelizer4.i_(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                TxnTellerPresenter.this.d.l(response.message());
            }
        });
    }
}
