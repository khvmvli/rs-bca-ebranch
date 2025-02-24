package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.InfoTellerActivity;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onChooseLanjut;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetRatePresenter.class */
public class GetRatePresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public IconCompatParcelizer d;
    public Call<OpenAccountSuccessActivity<onChooseLanjut>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetRatePresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(String str);

        @Override // com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
        void b(String str);

        void c(String str);

        void c(onChooseLanjut onchooselanjut);

        void g(String str);

        @Override // com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
        void h(String str);

        @Override // com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
        void i_();
    }

    public GetRatePresenter() {
        App.d().a(this);
    }

    public final void b(InfoTellerActivity infoTellerActivity) {
        this.d.i_();
        Call<OpenAccountSuccessActivity<onChooseLanjut>> c = this.apiService.c(infoTellerActivity);
        this.e = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<onChooseLanjut>>() { // from class: com.bca.smartbranch.presenter.GetRatePresenter.5
            public final void onFailure(Call<OpenAccountSuccessActivity<onChooseLanjut>> call, Throwable th) {
                String str;
                if (GetRatePresenter.this.e != null && !GetRatePresenter.this.e.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = GetRatePresenter.this.d;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.c(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.c(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<onChooseLanjut>> call, Response<OpenAccountSuccessActivity<onChooseLanjut>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<onChooseLanjut> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        IconCompatParcelizer iconCompatParcelizer = GetRatePresenter.this.d;
                        OpenAccountSuccessActivity<onChooseLanjut> body2 = response.body();
                        onChooseLanjut onchooselanjut = body2.d;
                        if (onchooselanjut == null) {
                            onchooselanjut = body2.a;
                            if (onchooselanjut == null) {
                                onchooselanjut = null;
                            }
                        }
                        iconCompatParcelizer.c(onchooselanjut);
                        return;
                    }
                    OpenAccountSuccessActivity<onChooseLanjut> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        IconCompatParcelizer iconCompatParcelizer2 = GetRatePresenter.this.d;
                        OpenAccountSuccessActivity<onChooseLanjut> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        iconCompatParcelizer2.h(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<onChooseLanjut> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        IconCompatParcelizer iconCompatParcelizer3 = GetRatePresenter.this.d;
                        OpenAccountSuccessActivity<onChooseLanjut> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        iconCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    IconCompatParcelizer iconCompatParcelizer4 = GetRatePresenter.this.d;
                    OpenAccountSuccessActivity<onChooseLanjut> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    iconCompatParcelizer4.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                GetRatePresenter.this.d.g(response.message());
            }
        });
    }
}
