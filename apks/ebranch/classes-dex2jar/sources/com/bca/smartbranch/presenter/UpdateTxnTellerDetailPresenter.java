package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.request.UpdateTxnTellerDetailRequest;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateTxnTellerDetailPresenter.class */
public class UpdateTxnTellerDetailPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<Object>> b;
    public write e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateTxnTellerDetailPresenter$write.class */
    public interface write {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void u();

        void v();
    }

    public UpdateTxnTellerDetailPresenter() {
        App.d().d(this);
    }

    public final void d(UpdateTxnTellerDetailRequest updateTxnTellerDetailRequest) {
        this.e.u();
        Call<OpenAccountSuccessActivity<Object>> b = this.apiService.b(updateTxnTellerDetailRequest);
        this.b = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (UpdateTxnTellerDetailPresenter.this.b != null && !UpdateTxnTellerDetailPresenter.this.b.isCanceled()) {
                    write write2 = UpdateTxnTellerDetailPresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        write2.b(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    write2.b(str);
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
                        UpdateTxnTellerDetailPresenter.this.e.v();
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body2 = response.body();
                    detailRTGSCNY detailrtgscny2 = body2.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body2.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        write write2 = UpdateTxnTellerDetailPresenter.this.e;
                        OpenAccountSuccessActivity<Object> body3 = response.body();
                        detailRTGSCNY detailrtgscny3 = body3.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body3.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        write2.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body4 = response.body();
                    detailRTGSCNY detailrtgscny4 = body4.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body4.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        write write3 = UpdateTxnTellerDetailPresenter.this.e;
                        OpenAccountSuccessActivity<Object> body5 = response.body();
                        detailRTGSCNY detailrtgscny5 = body5.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        write3.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    write write4 = UpdateTxnTellerDetailPresenter.this.e;
                    OpenAccountSuccessActivity<Object> body6 = response.body();
                    detailRTGSCNY detailrtgscny6 = body6.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body6.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    write4.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                UpdateTxnTellerDetailPresenter.this.e.e(response.message());
            }
        });
    }
}
