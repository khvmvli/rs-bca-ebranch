package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.AccountOpeningResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.cancelPicture;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/AccountOpeningPresenter.class */
public class AccountOpeningPresenter {
    public Call<OpenAccountSuccessActivity<AccountOpeningResponse>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/AccountOpeningPresenter$read.class */
    public interface read {
        @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        void c(AccountOpeningResponse accountOpeningResponse);

        void d();

        void f(String str);

        void g(String str);

        @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void g_();

        void h(String str);

        void i(String str);
    }

    public AccountOpeningPresenter() {
        App.d().e(this);
    }

    public final void e(cancelPicture cancelpicture) {
        this.c.g_();
        Call<OpenAccountSuccessActivity<AccountOpeningResponse>> a = this.apiService.a(cancelpicture);
        this.a = a;
        a.enqueue(new Callback<OpenAccountSuccessActivity<AccountOpeningResponse>>() { // from class: com.bca.smartbranch.presenter.AccountOpeningPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<AccountOpeningResponse>> call, Throwable th) {
                String str;
                if (AccountOpeningPresenter.this.a != null && !AccountOpeningPresenter.this.a.isCanceled()) {
                    read read2 = AccountOpeningPresenter.this.c;
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

            public final void onResponse(Call<OpenAccountSuccessActivity<AccountOpeningResponse>> call, Response<OpenAccountSuccessActivity<AccountOpeningResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<AccountOpeningResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        read read2 = AccountOpeningPresenter.this.c;
                        OpenAccountSuccessActivity<AccountOpeningResponse> body2 = response.body();
                        AccountOpeningResponse accountOpeningResponse = body2.d;
                        if (accountOpeningResponse == null) {
                            accountOpeningResponse = body2.a;
                            if (accountOpeningResponse == null) {
                                accountOpeningResponse = null;
                            }
                        }
                        read2.c(accountOpeningResponse);
                        return;
                    }
                    OpenAccountSuccessActivity<AccountOpeningResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        read read3 = AccountOpeningPresenter.this.c;
                        OpenAccountSuccessActivity<AccountOpeningResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        read3.i(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<AccountOpeningResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        read read4 = AccountOpeningPresenter.this.c;
                        OpenAccountSuccessActivity<AccountOpeningResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        read4.f(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    OpenAccountSuccessActivity<AccountOpeningResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    String str3 = detailrtgscny6.a;
                    if ((str3 != null ? str3 : detailrtgscny6.c).equals("MID-07-003")) {
                        read read5 = AccountOpeningPresenter.this.c;
                        OpenAccountSuccessActivity<AccountOpeningResponse> body8 = response.body();
                        detailRTGSCNY detailrtgscny7 = body8.c;
                        if (detailrtgscny7 == null) {
                            detailrtgscny7 = body8.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny7.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null) {
                            String str4 = detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c;
                        } else {
                            String str5 = detailrtgscny7.b;
                        }
                        read5.d();
                        return;
                    }
                    read read6 = AccountOpeningPresenter.this.c;
                    OpenAccountSuccessActivity<AccountOpeningResponse> body9 = response.body();
                    detailRTGSCNY detailrtgscny8 = body9.c;
                    if (detailrtgscny8 == null) {
                        detailrtgscny8 = body9.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny8.e;
                    read6.g(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny8.b);
                    return;
                }
                AccountOpeningPresenter.this.c.h(response.message());
            }
        });
    }
}
