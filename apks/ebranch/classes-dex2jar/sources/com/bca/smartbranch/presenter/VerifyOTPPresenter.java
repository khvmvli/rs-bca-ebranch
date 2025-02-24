package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.NoAtmEChannelActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/VerifyOTPPresenter.class */
public class VerifyOTPPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read d;
    public Call<OpenAccountSuccessActivity> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/VerifyOTPPresenter$read.class */
    public interface read {
        void a();

        void b(String str);

        void d();

        void e(String str);

        void f(String str);

        void g(String str);

        void i(String str);
    }

    public VerifyOTPPresenter() {
        App.d().d(this);
    }

    public final void b(NoAtmEChannelActivity_ViewBinding noAtmEChannelActivity_ViewBinding) {
        this.d.a();
        Call<OpenAccountSuccessActivity> b = this.apiService.b(noAtmEChannelActivity_ViewBinding);
        this.e = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity>() { // from class: com.bca.smartbranch.presenter.VerifyOTPPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity> call, Throwable th) {
                String str;
                if (VerifyOTPPresenter.this.e != null && !VerifyOTPPresenter.this.e.isCanceled()) {
                    read read2 = VerifyOTPPresenter.this.d;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        read2.f(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    read2.f(str);
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
                        read read2 = VerifyOTPPresenter.this.d;
                        OpenAccountSuccessActivity body2 = response.body();
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
                        read2.d();
                        return;
                    }
                    OpenAccountSuccessActivity body3 = response.body();
                    detailRTGSCNY detailrtgscny3 = body3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body3.b;
                    }
                    String str3 = detailrtgscny3.a;
                    if ((str3 != null ? str3 : detailrtgscny3.c).equals("MID-00-898")) {
                        read read3 = VerifyOTPPresenter.this.d;
                        OpenAccountSuccessActivity body4 = response.body();
                        detailRTGSCNY detailrtgscny4 = body4.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                        read3.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                        return;
                    }
                    OpenAccountSuccessActivity body5 = response.body();
                    detailRTGSCNY detailrtgscny5 = body5.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = body5.b;
                    }
                    String str4 = detailrtgscny5.a;
                    if ((str4 != null ? str4 : detailrtgscny5.c).equals("MID-00-899")) {
                        read read4 = VerifyOTPPresenter.this.d;
                        OpenAccountSuccessActivity body6 = response.body();
                        detailRTGSCNY detailrtgscny6 = body6.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        read4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    read read5 = VerifyOTPPresenter.this.d;
                    OpenAccountSuccessActivity body7 = response.body();
                    detailRTGSCNY detailrtgscny7 = body7.c;
                    if (detailrtgscny7 == null) {
                        detailrtgscny7 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny7.e;
                    read5.i(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny7.b);
                    return;
                }
                VerifyOTPPresenter.this.d.g(response.message());
            }
        });
    }
}
