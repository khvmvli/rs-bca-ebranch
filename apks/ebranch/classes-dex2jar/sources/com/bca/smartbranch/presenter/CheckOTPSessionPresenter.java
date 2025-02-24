package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.retakePicture;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckOTPSessionPresenter.class */
public class CheckOTPSessionPresenter {
    public RemoteActionCompatParcelizer a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity> c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckOTPSessionPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a();

        void b();

        void b(String str);

        void d();

        void d(String str);

        void h(String str);

        void j_(String str);

        void k_(String str);
    }

    public CheckOTPSessionPresenter() {
        App.d().e(this);
    }

    public final void e(retakePicture retakepicture) {
        this.a.d();
        Call<OpenAccountSuccessActivity> e = this.apiService.e(retakepicture);
        this.c = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity>() { // from class: com.bca.smartbranch.presenter.CheckOTPSessionPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity> call, Throwable th) {
                String str;
                if (CheckOTPSessionPresenter.this.c != null && !CheckOTPSessionPresenter.this.c.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = CheckOTPSessionPresenter.this.a;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        remoteActionCompatParcelizer.j_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    remoteActionCompatParcelizer.j_(str);
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
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = CheckOTPSessionPresenter.this.a;
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
                        remoteActionCompatParcelizer.b();
                        return;
                    }
                    OpenAccountSuccessActivity body3 = response.body();
                    detailRTGSCNY detailrtgscny3 = body3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body3.b;
                    }
                    String str3 = detailrtgscny3.a;
                    if ((str3 != null ? str3 : detailrtgscny3.c).equals("MID-99-996")) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = CheckOTPSessionPresenter.this.a;
                        OpenAccountSuccessActivity body4 = response.body();
                        detailRTGSCNY detailrtgscny4 = body4.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null) {
                            String str4 = detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c;
                        } else {
                            String str5 = detailrtgscny4.b;
                        }
                        remoteActionCompatParcelizer2.a();
                        return;
                    }
                    OpenAccountSuccessActivity body5 = response.body();
                    detailRTGSCNY detailrtgscny5 = body5.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = body5.b;
                    }
                    String str6 = detailrtgscny5.a;
                    if ((str6 != null ? str6 : detailrtgscny5.c).equals("MID-00-898")) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = CheckOTPSessionPresenter.this.a;
                        OpenAccountSuccessActivity body6 = response.body();
                        detailRTGSCNY detailrtgscny6 = body6.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        remoteActionCompatParcelizer3.h(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    OpenAccountSuccessActivity body7 = response.body();
                    detailRTGSCNY detailrtgscny7 = body7.c;
                    if (detailrtgscny7 == null) {
                        detailrtgscny7 = body7.b;
                    }
                    String str7 = detailrtgscny7.a;
                    if ((str7 != null ? str7 : detailrtgscny7.c).equals("MID-00-899")) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = CheckOTPSessionPresenter.this.a;
                        OpenAccountSuccessActivity body8 = response.body();
                        detailRTGSCNY detailrtgscny8 = body8.c;
                        if (detailrtgscny8 == null) {
                            detailrtgscny8 = body8.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny8.e;
                        remoteActionCompatParcelizer4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny8.b);
                        return;
                    }
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = CheckOTPSessionPresenter.this.a;
                    OpenAccountSuccessActivity body9 = response.body();
                    detailRTGSCNY detailrtgscny9 = body9.c;
                    if (detailrtgscny9 == null) {
                        detailrtgscny9 = body9.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver5 = detailrtgscny9.e;
                    remoteActionCompatParcelizer5.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver5 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver5.c : detailrtgscny9.b);
                    return;
                }
                CheckOTPSessionPresenter.this.a.k_(response.message());
            }
        });
    }
}
