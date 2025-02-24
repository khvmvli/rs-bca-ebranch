package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.LoginSessionActivity;
import o.LoginSessionActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/SendEmailTransactionSuccessPresenter.class */
public class SendEmailTransactionSuccessPresenter {
    public Call<OpenAccountSuccessActivity<Object>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RemoteActionCompatParcelizer b;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/SendEmailTransactionSuccessPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a(String str);

        void a_(String str);

        void c_(String str);

        void d_(String str);

        void g_();
    }

    public SendEmailTransactionSuccessPresenter() {
        App.d().c(this);
    }

    public final void a(String str, String str2, LoginSessionActivity loginSessionActivity) {
        this.b.g_();
        Call<OpenAccountSuccessActivity<Object>> a = this.apiService.a(str, str2, loginSessionActivity);
        this.a = a;
        a.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str3;
                if (SendEmailTransactionSuccessPresenter.this.a != null && !SendEmailTransactionSuccessPresenter.this.a.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = SendEmailTransactionSuccessPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str3 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str3 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        remoteActionCompatParcelizer.a_(str3);
                    }
                    str3 = "Oops! Terjadi kesalahan.";
                    remoteActionCompatParcelizer.a_(str3);
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
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = SendEmailTransactionSuccessPresenter.this.b;
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        detailRTGSCNY detailrtgscny2 = body2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body2.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        remoteActionCompatParcelizer.d_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                        return;
                    }
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = SendEmailTransactionSuccessPresenter.this.b;
                    OpenAccountSuccessActivity<Object> body3 = response.body();
                    detailRTGSCNY detailrtgscny3 = body3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny3.e;
                    remoteActionCompatParcelizer2.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny3.b);
                    return;
                }
                SendEmailTransactionSuccessPresenter.this.b.c_(response.message());
            }
        });
    }

    public final void c(LoginSessionActivity_ViewBinding loginSessionActivity_ViewBinding) {
        this.b.g_();
        Call<OpenAccountSuccessActivity<Object>> b = this.apiService.b(loginSessionActivity_ViewBinding);
        this.a = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (!SendEmailTransactionSuccessPresenter.this.a.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = SendEmailTransactionSuccessPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        remoteActionCompatParcelizer.a_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    remoteActionCompatParcelizer.a_(str);
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
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = SendEmailTransactionSuccessPresenter.this.b;
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        detailRTGSCNY detailrtgscny2 = body2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body2.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        remoteActionCompatParcelizer.d_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                        return;
                    }
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = SendEmailTransactionSuccessPresenter.this.b;
                    OpenAccountSuccessActivity<Object> body3 = response.body();
                    detailRTGSCNY detailrtgscny3 = body3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny3.e;
                    remoteActionCompatParcelizer2.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny3.b);
                    return;
                }
                SendEmailTransactionSuccessPresenter.this.b.c_(response.message());
            }
        });
    }

    public final void d(LoginSessionActivity_ViewBinding loginSessionActivity_ViewBinding) {
        this.b.g_();
        Call<OpenAccountSuccessActivity<Object>> c = this.apiService.c(loginSessionActivity_ViewBinding);
        this.a = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.4
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (SendEmailTransactionSuccessPresenter.this.a != null && !SendEmailTransactionSuccessPresenter.this.a.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = SendEmailTransactionSuccessPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        remoteActionCompatParcelizer.a_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    remoteActionCompatParcelizer.a_(str);
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
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = SendEmailTransactionSuccessPresenter.this.b;
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        detailRTGSCNY detailrtgscny2 = body2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body2.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        remoteActionCompatParcelizer.d_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                        return;
                    }
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = SendEmailTransactionSuccessPresenter.this.b;
                    OpenAccountSuccessActivity<Object> body3 = response.body();
                    detailRTGSCNY detailrtgscny3 = body3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny3.e;
                    remoteActionCompatParcelizer2.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny3.b);
                    return;
                }
                SendEmailTransactionSuccessPresenter.this.b.c_(response.message());
            }
        });
    }
}
