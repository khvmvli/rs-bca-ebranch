package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.InfoValueTodayORActivity;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onChooseUlangi;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/LoginFingerprintPresenter.class */
public class LoginFingerprintPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public IconCompatParcelizer d;
    public Call<OpenAccountSuccessActivity<onChooseUlangi>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/LoginFingerprintPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(String str);

        @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
        void a_(String str);

        void b(onChooseUlangi onchooseulangi, boolean z, String str);

        void f(String str);

        void g(String str);

        @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
        void g_();

        void h(String str);
    }

    public LoginFingerprintPresenter() {
        App.d().d(this);
    }

    public final void d(InfoValueTodayORActivity infoValueTodayORActivity) {
        this.d.g_();
        Call<OpenAccountSuccessActivity<onChooseUlangi>> d = this.apiService.d(infoValueTodayORActivity);
        this.e = d;
        d.enqueue(new Callback<OpenAccountSuccessActivity<onChooseUlangi>>() { // from class: com.bca.smartbranch.presenter.LoginFingerprintPresenter.4
            public final void onFailure(Call<OpenAccountSuccessActivity<onChooseUlangi>> call, Throwable th) {
                String str;
                if (LoginFingerprintPresenter.this.e != null && !LoginFingerprintPresenter.this.e.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = LoginFingerprintPresenter.this.d;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.a_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.a_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<onChooseUlangi>> call, Response<OpenAccountSuccessActivity<onChooseUlangi>> response) {
                onChooseUlangi onchooseulangi;
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<onChooseUlangi> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    boolean e = detailrtgscny.e();
                    onChooseUlangi onchooseulangi2 = null;
                    onChooseUlangi onchooseulangi3 = null;
                    if (e) {
                        IconCompatParcelizer iconCompatParcelizer = LoginFingerprintPresenter.this.d;
                        OpenAccountSuccessActivity<onChooseUlangi> body2 = response.body();
                        onChooseUlangi onchooseulangi4 = body2.d;
                        if (onchooseulangi4 != null) {
                            onchooseulangi3 = onchooseulangi4;
                        } else {
                            onChooseUlangi onchooseulangi5 = body2.a;
                            if (onchooseulangi5 != null) {
                                onchooseulangi3 = onchooseulangi5;
                            }
                        }
                        onChooseUlangi onchooseulangi6 = onchooseulangi3;
                        OpenAccountSuccessActivity<onChooseUlangi> body3 = response.body();
                        detailRTGSCNY detailrtgscny2 = body3.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body3.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        iconCompatParcelizer.b(onchooseulangi6, false, detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                        return;
                    }
                    OpenAccountSuccessActivity<onChooseUlangi> body4 = response.body();
                    detailRTGSCNY detailrtgscny3 = body4.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body4.b;
                    }
                    String str = detailrtgscny3.a;
                    if ((str != null ? str : detailrtgscny3.c).equals("EBR-1-900")) {
                        IconCompatParcelizer iconCompatParcelizer2 = LoginFingerprintPresenter.this.d;
                        OpenAccountSuccessActivity<onChooseUlangi> body5 = response.body();
                        onchooseulangi2 = body5.d;
                        if (onchooseulangi2 == null && (onchooseulangi = body5.a) != null) {
                            onchooseulangi2 = onchooseulangi;
                        }
                        onChooseUlangi onchooseulangi7 = onchooseulangi2;
                        OpenAccountSuccessActivity<onChooseUlangi> body6 = response.body();
                        detailRTGSCNY detailrtgscny4 = body6.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                        iconCompatParcelizer2.b(onchooseulangi7, true, detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                        return;
                    }
                    OpenAccountSuccessActivity<onChooseUlangi> body7 = response.body();
                    detailRTGSCNY detailrtgscny5 = body7.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = body7.b;
                    }
                    String str2 = detailrtgscny5.a;
                    if ((str2 != null ? str2 : detailrtgscny5.c).equals("MID-00-117")) {
                        IconCompatParcelizer iconCompatParcelizer3 = LoginFingerprintPresenter.this.d;
                        OpenAccountSuccessActivity<onChooseUlangi> body8 = response.body();
                        detailRTGSCNY detailrtgscny6 = body8.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = body8.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        iconCompatParcelizer3.g(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    OpenAccountSuccessActivity<onChooseUlangi> body9 = response.body();
                    detailRTGSCNY detailrtgscny7 = body9.c;
                    if (detailrtgscny7 == null) {
                        detailrtgscny7 = body9.b;
                    }
                    String str3 = detailrtgscny7.a;
                    if ((str3 != null ? str3 : detailrtgscny7.c).equals("EBR-2-202")) {
                        IconCompatParcelizer iconCompatParcelizer4 = LoginFingerprintPresenter.this.d;
                        OpenAccountSuccessActivity<onChooseUlangi> body10 = response.body();
                        detailRTGSCNY detailrtgscny8 = body10.c;
                        if (detailrtgscny8 == null) {
                            detailrtgscny8 = body10.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny8.e;
                        iconCompatParcelizer4.f(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny8.b);
                        return;
                    }
                    IconCompatParcelizer iconCompatParcelizer5 = LoginFingerprintPresenter.this.d;
                    OpenAccountSuccessActivity<onChooseUlangi> body11 = response.body();
                    detailRTGSCNY detailrtgscny9 = body11.c;
                    if (detailrtgscny9 == null) {
                        detailrtgscny9 = body11.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver5 = detailrtgscny9.e;
                    iconCompatParcelizer5.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver5 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver5.c : detailrtgscny9.b);
                    return;
                }
                LoginFingerprintPresenter.this.d.h(response.message());
            }
        });
    }
}
