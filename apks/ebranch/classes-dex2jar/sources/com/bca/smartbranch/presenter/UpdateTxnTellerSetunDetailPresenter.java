package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.request.UpdateTxnTellerSetunDetailRequest;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateTxnTellerSetunDetailPresenter.class */
public class UpdateTxnTellerSetunDetailPresenter {
    public read a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<Object>> c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateTxnTellerSetunDetailPresenter$read.class */
    public interface read {
        void a();

        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e();

        void e(String str);
    }

    public UpdateTxnTellerSetunDetailPresenter() {
        App.d().d(this);
    }

    public final void b(UpdateTxnTellerSetunDetailRequest updateTxnTellerSetunDetailRequest, User user, String str) {
        this.a.e();
        Call<OpenAccountSuccessActivity<Object>> d = this.apiService.d(getPromotion.e(user), str, updateTxnTellerSetunDetailRequest);
        this.c = d;
        d.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.UpdateTxnTellerSetunDetailPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str2;
                if (UpdateTxnTellerSetunDetailPresenter.this.c != null && !UpdateTxnTellerSetunDetailPresenter.this.c.isCanceled()) {
                    read read2 = UpdateTxnTellerSetunDetailPresenter.this.a;
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

            public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<Object> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        UpdateTxnTellerSetunDetailPresenter.this.a.a();
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body2 = response.body();
                    detailRTGSCNY detailrtgscny2 = body2.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body2.b;
                    }
                    String str2 = detailrtgscny2.a;
                    if ((str2 != null ? str2 : detailrtgscny2.c).equals("MID-00-898")) {
                        read read2 = UpdateTxnTellerSetunDetailPresenter.this.a;
                        OpenAccountSuccessActivity<Object> body3 = response.body();
                        detailRTGSCNY detailrtgscny3 = body3.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body3.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        read2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body4 = response.body();
                    detailRTGSCNY detailrtgscny4 = body4.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body4.b;
                    }
                    String str3 = detailrtgscny4.a;
                    if ((str3 != null ? str3 : detailrtgscny4.c).equals("MID-00-899")) {
                        read read3 = UpdateTxnTellerSetunDetailPresenter.this.a;
                        OpenAccountSuccessActivity<Object> body5 = response.body();
                        detailRTGSCNY detailrtgscny5 = body5.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        read3.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    read read4 = UpdateTxnTellerSetunDetailPresenter.this.a;
                    OpenAccountSuccessActivity<Object> body6 = response.body();
                    detailRTGSCNY detailrtgscny6 = body6.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body6.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    read4.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                UpdateTxnTellerSetunDetailPresenter.this.a.c(response.message());
            }
        });
    }
}
