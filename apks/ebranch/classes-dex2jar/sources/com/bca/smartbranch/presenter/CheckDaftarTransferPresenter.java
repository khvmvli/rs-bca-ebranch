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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckDaftarTransferPresenter.class */
public class CheckDaftarTransferPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read c;
    public Call<OpenAccountSuccessActivity<Object>> d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckDaftarTransferPresenter$read.class */
    public interface read {
        @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
        void a_(String str);

        void b();

        @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
        void b(String str);

        @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
        void b_(String str);

        void c(String str);

        void e(String str);

        @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
        void g_();
    }

    public CheckDaftarTransferPresenter() {
        App.d().e(this);
    }

    public final void e(User user, String str, String str2, String str3) {
        this.c.g_();
        if (str3.isEmpty()) {
            this.d = this.apiService.c(getPromotion.e(user), user.getEmail(), str, str2);
        } else {
            this.d = this.apiService.d(getPromotion.e(user), user.getEmail(), str, str2, str3);
        }
        this.d.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str4;
                if (CheckDaftarTransferPresenter.this.d != null && !CheckDaftarTransferPresenter.this.d.isCanceled()) {
                    read read2 = CheckDaftarTransferPresenter.this.c;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str4 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str4 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        read2.a_(str4);
                    }
                    str4 = "Oops! Terjadi kesalahan.";
                    read2.a_(str4);
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
                                read read2 = CheckDaftarTransferPresenter.this.c;
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
                                read read3 = CheckDaftarTransferPresenter.this.c;
                                OpenAccountSuccessActivity<Object> body6 = response.body();
                                detailRTGSCNY detailrtgscny6 = body6.c;
                                if (detailrtgscny6 == null) {
                                    detailrtgscny6 = body6.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny6.e;
                                read3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny6.b);
                                return;
                            }
                            read read4 = CheckDaftarTransferPresenter.this.c;
                            OpenAccountSuccessActivity<Object> body7 = response.body();
                            detailRTGSCNY detailrtgscny7 = body7.c;
                            if (detailrtgscny7 == null) {
                                detailrtgscny7 = body7.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny7.e;
                            read4.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny7.b);
                            return;
                        }
                    }
                    read read5 = CheckDaftarTransferPresenter.this.c;
                    OpenAccountSuccessActivity<Object> body8 = response.body();
                    detailRTGSCNY detailrtgscny8 = body8.c;
                    if (detailrtgscny8 == null) {
                        detailrtgscny8 = body8.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny8.e;
                    if (detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null) {
                        String str7 = detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c;
                    } else {
                        String str8 = detailrtgscny8.b;
                    }
                    read5.b();
                    return;
                }
                CheckDaftarTransferPresenter.this.c.c(response.message());
            }
        });
    }
}
