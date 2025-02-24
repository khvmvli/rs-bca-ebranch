package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.InfoCodewordORActivity;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/ForgotEmailPassPresenter.class */
public class ForgotEmailPassPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public write d;
    public Call<OpenAccountSuccessActivity<Object>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/ForgotEmailPassPresenter$write.class */
    public interface write {
        void a(String str);

        @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
        void a_(String str);

        @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
        void c(String str);

        void d(String str);

        @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
        void g_();

        void i(String str);

        void u();

        void v();
    }

    public ForgotEmailPassPresenter() {
        App.d().d(this);
    }

    public final void e(InfoCodewordORActivity infoCodewordORActivity) {
        this.d.g_();
        Call<OpenAccountSuccessActivity<Object>> e = this.apiService.e(infoCodewordORActivity);
        this.e = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.ForgotEmailPassPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (ForgotEmailPassPresenter.this.e != null && !ForgotEmailPassPresenter.this.e.isCanceled()) {
                    write write2 = ForgotEmailPassPresenter.this.d;
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
                        ForgotEmailPassPresenter.this.d.v();
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body2 = response.body();
                    detailRTGSCNY detailrtgscny2 = body2.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body2.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-112")) {
                        write write2 = ForgotEmailPassPresenter.this.d;
                        OpenAccountSuccessActivity<Object> body3 = response.body();
                        detailRTGSCNY detailrtgscny3 = body3.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body3.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver != null) {
                            String str2 = detailrtgscny_mediabrowsercompat_customactionresultreceiver.c;
                        } else {
                            String str3 = detailrtgscny3.b;
                        }
                        write2.u();
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body4 = response.body();
                    detailRTGSCNY detailrtgscny4 = body4.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body4.b;
                    }
                    String str4 = detailrtgscny4.a;
                    if ((str4 != null ? str4 : detailrtgscny4.c).equals("EBR-2-202")) {
                        write write3 = ForgotEmailPassPresenter.this.d;
                        OpenAccountSuccessActivity<Object> body5 = response.body();
                        detailRTGSCNY detailrtgscny5 = body5.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        write3.i(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body6 = response.body();
                    detailRTGSCNY detailrtgscny6 = body6.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body6.b;
                    }
                    String str5 = detailrtgscny6.a;
                    if ((str5 != null ? str5 : detailrtgscny6.c).equals("MID-06-202")) {
                        write write4 = ForgotEmailPassPresenter.this.d;
                        OpenAccountSuccessActivity<Object> body7 = response.body();
                        detailRTGSCNY detailrtgscny7 = body7.c;
                        if (detailrtgscny7 == null) {
                            detailrtgscny7 = body7.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny7.e;
                        write4.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny7.b);
                        return;
                    }
                    write write5 = ForgotEmailPassPresenter.this.d;
                    OpenAccountSuccessActivity<Object> body8 = response.body();
                    detailRTGSCNY detailrtgscny8 = body8.c;
                    if (detailrtgscny8 == null) {
                        detailrtgscny8 = body8.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny8.e;
                    write5.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny8.b);
                    return;
                }
                ForgotEmailPassPresenter.this.d.d(response.message());
            }
        });
    }
}
