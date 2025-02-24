package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.chooseReservasiCS;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdatePINPresenter.class */
public class UpdatePINPresenter {
    public Call<OpenAccountSuccessActivity<Object>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RemoteActionCompatParcelizer b;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdatePINPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void g(String str);

        void s();

        void t();
    }

    public UpdatePINPresenter() {
        App.d().a(this);
    }

    public final void a(chooseReservasiCS choosereservasics) {
        this.b.t();
        Call<OpenAccountSuccessActivity<Object>> a = this.apiService.a(choosereservasics);
        this.a = a;
        a.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.UpdatePINPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (UpdatePINPresenter.this.a != null && !UpdatePINPresenter.this.a.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = UpdatePINPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        remoteActionCompatParcelizer.c(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    remoteActionCompatParcelizer.c(str);
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
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = UpdatePINPresenter.this.b;
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        detailRTGSCNY detailrtgscny2 = body2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body2.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        remoteActionCompatParcelizer.g(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body3 = response.body();
                    detailRTGSCNY detailrtgscny3 = body3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body3.b;
                    }
                    String str = detailrtgscny3.a;
                    if ((str != null ? str : detailrtgscny3.c).equals("MID-00-898")) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = UpdatePINPresenter.this.b;
                        OpenAccountSuccessActivity<Object> body4 = response.body();
                        detailRTGSCNY detailrtgscny4 = body4.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                        remoteActionCompatParcelizer2.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body5 = response.body();
                    detailRTGSCNY detailrtgscny5 = body5.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = body5.b;
                    }
                    String str2 = detailrtgscny5.a;
                    if ((str2 != null ? str2 : detailrtgscny5.c).equals("MID-00-899")) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = UpdatePINPresenter.this.b;
                        OpenAccountSuccessActivity<Object> body6 = response.body();
                        detailRTGSCNY detailrtgscny6 = body6.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        remoteActionCompatParcelizer3.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body7 = response.body();
                    detailRTGSCNY detailrtgscny7 = body7.c;
                    if (detailrtgscny7 == null) {
                        detailrtgscny7 = body7.b;
                    }
                    String str3 = detailrtgscny7.a;
                    if ((str3 != null ? str3 : detailrtgscny7.c).equals("MID-10-999")) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = UpdatePINPresenter.this.b;
                        OpenAccountSuccessActivity<Object> body8 = response.body();
                        detailRTGSCNY detailrtgscny8 = body8.c;
                        if (detailrtgscny8 == null) {
                            detailrtgscny8 = body8.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny8.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null) {
                            String str4 = detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c;
                        } else {
                            String str5 = detailrtgscny8.b;
                        }
                        remoteActionCompatParcelizer4.s();
                        return;
                    }
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = UpdatePINPresenter.this.b;
                    OpenAccountSuccessActivity<Object> body9 = response.body();
                    detailRTGSCNY detailrtgscny9 = body9.c;
                    if (detailrtgscny9 == null) {
                        detailrtgscny9 = body9.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver5 = detailrtgscny9.e;
                    remoteActionCompatParcelizer5.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver5 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver5.c : detailrtgscny9.b);
                    return;
                }
                UpdatePINPresenter.this.b.b(response.message());
            }
        });
    }
}
