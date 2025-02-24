package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.localdb.User;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.getPromotion;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckDaftarTransferORPresenter.class */
public class CheckDaftarTransferORPresenter {
    public read a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<Object>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckDaftarTransferORPresenter$read.class */
    public interface read {
        void a();

        @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
        void b(String str);

        @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
        void b_(String str);

        void f(String str);

        void g(String str);

        void i(String str);

        void j(String str);

        @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
        void u();
    }

    public CheckDaftarTransferORPresenter() {
        App.d().a(this);
    }

    public final void d(User user, String str, String str2, String str3) {
        this.a.u();
        if (str3.isEmpty()) {
            this.e = this.apiService.c(getPromotion.e(user), user.getEmail(), str, str2);
        } else {
            this.e = this.apiService.d(getPromotion.e(user), user.getEmail(), str, str2, str3);
        }
        this.e.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str4;
                if (CheckDaftarTransferORPresenter.this.e != null && !CheckDaftarTransferORPresenter.this.e.isCanceled()) {
                    read read2 = CheckDaftarTransferORPresenter.this.a;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str4 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str4 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        read2.g(str4);
                    }
                    str4 = "Oops! Terjadi kesalahan.";
                    read2.g(str4);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<Object> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (!detailrtgscny.e()) {
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        detailRTGSCNY detailrtgscny2 = body2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body2.b;
                        }
                        String str4 = detailrtgscny2.a;
                        if (!(str4 != null ? str4 : detailrtgscny2.c).equals("MID-18-000")) {
                            OpenAccountSuccessActivity<Object> body3 = response.body();
                            detailRTGSCNY detailrtgscny3 = body3.c;
                            if (detailrtgscny3 == null) {
                                detailrtgscny3 = body3.b;
                            }
                            String str5 = detailrtgscny3.a;
                            if ((str5 != null ? str5 : detailrtgscny3.c).equals("MID-00-898")) {
                                read read2 = CheckDaftarTransferORPresenter.this.a;
                                OpenAccountSuccessActivity<Object> body4 = response.body();
                                detailRTGSCNY detailrtgscny4 = body4.c;
                                if (detailrtgscny4 == null) {
                                    detailrtgscny4 = body4.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny4.e;
                                read2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny4.b);
                                return;
                            }
                            OpenAccountSuccessActivity<Object> body5 = response.body();
                            detailRTGSCNY detailrtgscny5 = body5.c;
                            if (detailrtgscny5 == null) {
                                detailrtgscny5 = body5.b;
                            }
                            String str6 = detailrtgscny5.a;
                            if ((str6 != null ? str6 : detailrtgscny5.c).equals("MID-00-899")) {
                                read read3 = CheckDaftarTransferORPresenter.this.a;
                                OpenAccountSuccessActivity<Object> body6 = response.body();
                                detailRTGSCNY detailrtgscny6 = body6.c;
                                if (detailrtgscny6 == null) {
                                    detailrtgscny6 = body6.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny6.e;
                                read3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny6.b);
                                return;
                            }
                            OpenAccountSuccessActivity<Object> body7 = response.body();
                            detailRTGSCNY detailrtgscny7 = body7.c;
                            if (detailrtgscny7 == null) {
                                detailrtgscny7 = body7.b;
                            }
                            String str7 = detailrtgscny7.a;
                            if (!(str7 != null ? str7 : detailrtgscny7.c).equals("EBR-2-319")) {
                                OpenAccountSuccessActivity<Object> body8 = response.body();
                                detailRTGSCNY detailrtgscny8 = body8.c;
                                if (detailrtgscny8 == null) {
                                    detailrtgscny8 = body8.b;
                                }
                                String str8 = detailrtgscny8.a;
                                if (!(str8 != null ? str8 : detailrtgscny8.c).equals("EBR-2-355")) {
                                    read read4 = CheckDaftarTransferORPresenter.this.a;
                                    OpenAccountSuccessActivity<Object> body9 = response.body();
                                    detailRTGSCNY detailrtgscny9 = body9.c;
                                    if (detailrtgscny9 == null) {
                                        detailrtgscny9 = body9.b;
                                    }
                                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny9.e;
                                    read4.f(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny9.b);
                                    return;
                                }
                            }
                            read read5 = CheckDaftarTransferORPresenter.this.a;
                            OpenAccountSuccessActivity<Object> body10 = response.body();
                            detailRTGSCNY detailrtgscny10 = body10.c;
                            if (detailrtgscny10 == null) {
                                detailrtgscny10 = body10.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny10.e;
                            read5.i(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny10.b);
                            return;
                        }
                    }
                    read read6 = CheckDaftarTransferORPresenter.this.a;
                    OpenAccountSuccessActivity<Object> body11 = response.body();
                    detailRTGSCNY detailrtgscny11 = body11.c;
                    if (detailrtgscny11 == null) {
                        detailrtgscny11 = body11.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver5 = detailrtgscny11.e;
                    if (detailrtgscny_mediabrowsercompat_customactionresultreceiver5 != null) {
                        String str9 = detailrtgscny_mediabrowsercompat_customactionresultreceiver5.c;
                    } else {
                        String str10 = detailrtgscny11.b;
                    }
                    read6.a();
                    return;
                }
                CheckDaftarTransferORPresenter.this.a.j(response.message());
            }
        });
    }
}
