package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckCutOffPresenter.class */
public class CheckCutOffPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read b;
    public Call<OpenAccountSuccessActivity> d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckCutOffPresenter$read.class */
    public interface read {
        @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        void f(String str);

        @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
        void g_();

        void m(String str);

        void t();
    }

    public CheckCutOffPresenter() {
        App.d().a(this);
    }

    public final void b() {
        this.b.g_();
        Call<OpenAccountSuccessActivity> c = this.apiService.c();
        this.d = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity>() { // from class: com.bca.smartbranch.presenter.CheckCutOffPresenter.4
            public final void onFailure(Call<OpenAccountSuccessActivity> call, Throwable th) {
                String str;
                if (CheckCutOffPresenter.this.d != null && !CheckCutOffPresenter.this.d.isCanceled()) {
                    read read2 = CheckCutOffPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        read2.a_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    read2.a_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity> call, Response<OpenAccountSuccessActivity> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        CheckCutOffPresenter.this.b.t();
                        return;
                    }
                    read read2 = CheckCutOffPresenter.this.b;
                    OpenAccountSuccessActivity body2 = response.body();
                    detailRTGSCNY detailrtgscny2 = body2.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body2.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    read2.f(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                CheckCutOffPresenter.this.b.m(response.message());
            }
        });
    }
}
