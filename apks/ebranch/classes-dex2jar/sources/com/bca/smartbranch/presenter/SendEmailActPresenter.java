package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.LoginActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/SendEmailActPresenter.class */
public class SendEmailActPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public write b;
    public Call<OpenAccountSuccessActivity<Object>> c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/SendEmailActPresenter$write.class */
    public interface write {
        void a(String str);

        void b(String str);

        void c(String str);

        void e(String str);

        void s();

        void w();
    }

    public SendEmailActPresenter() {
        App.d().b(this);
    }

    public final void d(LoginActivity_ViewBinding loginActivity_ViewBinding) {
        this.b.w();
        Call<OpenAccountSuccessActivity<Object>> e = this.apiService.e(loginActivity_ViewBinding);
        this.c = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.SendEmailActPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (SendEmailActPresenter.this.c != null && !SendEmailActPresenter.this.c.isCanceled()) {
                    write write2 = SendEmailActPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        write2.c(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    write2.c(str);
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
                        SendEmailActPresenter.this.b.s();
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body2 = response.body();
                    detailRTGSCNY detailrtgscny2 = body2.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body2.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-03-222")) {
                        write write2 = SendEmailActPresenter.this.b;
                        OpenAccountSuccessActivity<Object> body3 = response.body();
                        detailRTGSCNY detailrtgscny3 = body3.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body3.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        write2.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    write write3 = SendEmailActPresenter.this.b;
                    OpenAccountSuccessActivity<Object> body4 = response.body();
                    detailRTGSCNY detailrtgscny4 = body4.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body4.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                    write3.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                    return;
                }
                SendEmailActPresenter.this.b.b(response.message());
            }
        });
    }
}
