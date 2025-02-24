package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.LandingActivity;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/ReRegistrationPresenter.class */
public class ReRegistrationPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<Object>> b;
    public write e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/ReRegistrationPresenter$write.class */
    public interface write {
        void a_(String str);

        void c(String str);

        void g_();

        void h_(String str);

        void j(String str);

        void y();
    }

    public ReRegistrationPresenter() {
        App.d().a(this);
    }

    public final void e(LandingActivity landingActivity) {
        this.e.g_();
        Call<OpenAccountSuccessActivity<Object>> b = this.apiService.b(landingActivity);
        this.b = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.ReRegistrationPresenter.5
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (ReRegistrationPresenter.this.b != null && !ReRegistrationPresenter.this.b.isCanceled()) {
                    write write2 = ReRegistrationPresenter.this.e;
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

            public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<Object> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = ReRegistrationPresenter.this.e;
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
                        write2.y();
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body3 = response.body();
                    detailRTGSCNY detailrtgscny3 = body3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body3.b;
                    }
                    String str3 = detailrtgscny3.a;
                    if ((str3 != null ? str3 : detailrtgscny3.c).equals("MID-03-222")) {
                        write write3 = ReRegistrationPresenter.this.e;
                        OpenAccountSuccessActivity<Object> body4 = response.body();
                        detailRTGSCNY detailrtgscny4 = body4.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                        write3.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                        return;
                    }
                    write write4 = ReRegistrationPresenter.this.e;
                    OpenAccountSuccessActivity<Object> body5 = response.body();
                    detailRTGSCNY detailrtgscny5 = body5.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = body5.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny5.e;
                    write4.h_(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny5.b);
                    return;
                }
                ReRegistrationPresenter.this.e.j(response.message());
            }
        });
    }
}
