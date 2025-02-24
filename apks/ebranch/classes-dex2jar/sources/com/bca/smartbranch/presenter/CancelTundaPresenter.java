package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.choosePic;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CancelTundaPresenter.class */
public class CancelTundaPresenter {
    public IconCompatParcelizer a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<Object>> d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CancelTundaPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void A_(String str);

        @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
        void b(String str);

        @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
        void b_(String str);

        @Override // com.bca.smartbranch.presenter.CancelReservationPresenter.write
        void g_();

        void i(String str);

        void u();

        void x_(String str);
    }

    public CancelTundaPresenter() {
        App.d().d(this);
    }

    public final void a(choosePic choosepic) {
        this.a.g_();
        Call<OpenAccountSuccessActivity<Object>> e = this.apiService.e(choosepic);
        this.d = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.CancelTundaPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (CancelTundaPresenter.this.d != null && !CancelTundaPresenter.this.d.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = CancelTundaPresenter.this.a;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.x_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.x_(str);
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
                        IconCompatParcelizer iconCompatParcelizer = CancelTundaPresenter.this.a;
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        detailRTGSCNY detailrtgscny2 = body2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body2.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver != null) {
                            String str = detailrtgscny_mediabrowsercompat_customactionresultreceiver.c;
                        } else {
                            String str2 = detailrtgscny2.b;
                        }
                        iconCompatParcelizer.u();
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body3 = response.body();
                    detailRTGSCNY detailrtgscny3 = body3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body3.b;
                    }
                    String str3 = detailrtgscny3.a;
                    if ((str3 != null ? str3 : detailrtgscny3.c).equals("MID-00-898")) {
                        IconCompatParcelizer iconCompatParcelizer2 = CancelTundaPresenter.this.a;
                        OpenAccountSuccessActivity<Object> body4 = response.body();
                        detailRTGSCNY detailrtgscny4 = body4.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                        iconCompatParcelizer2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body5 = response.body();
                    detailRTGSCNY detailrtgscny5 = body5.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = body5.b;
                    }
                    String str4 = detailrtgscny5.a;
                    if ((str4 != null ? str4 : detailrtgscny5.c).equals("MID-00-899")) {
                        IconCompatParcelizer iconCompatParcelizer3 = CancelTundaPresenter.this.a;
                        OpenAccountSuccessActivity<Object> body6 = response.body();
                        detailRTGSCNY detailrtgscny6 = body6.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        iconCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    IconCompatParcelizer iconCompatParcelizer4 = CancelTundaPresenter.this.a;
                    OpenAccountSuccessActivity<Object> body7 = response.body();
                    detailRTGSCNY detailrtgscny7 = body7.c;
                    if (detailrtgscny7 == null) {
                        detailrtgscny7 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny7.e;
                    iconCompatParcelizer4.i(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny7.b);
                    return;
                }
                CancelTundaPresenter.this.a.A_(response.message());
            }
        });
    }
}
