package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.BeneficiaryBankResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/BeneficiaryBankPresenter.class */
public class BeneficiaryBankPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver b;
    public Call<OpenAccountSuccessActivity<BeneficiaryBankResponse>> e;

    public BeneficiaryBankPresenter() {
        App.d().b(this);
    }

    public final void d(String str, String str2, String str3) {
        this.b.g_();
        Call<OpenAccountSuccessActivity<BeneficiaryBankResponse>> e = this.apiService.e(str, str2, str3);
        this.e = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<BeneficiaryBankResponse>>() { // from class: com.bca.smartbranch.presenter.BeneficiaryBankPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<BeneficiaryBankResponse>> call, Throwable th) {
                String str4;
                if (!BeneficiaryBankPresenter.this.e.isCanceled()) {
                    BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver beneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver = BeneficiaryBankPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str4 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str4 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        beneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver.v_(str4);
                    }
                    str4 = "Oops! Terjadi kesalahan.";
                    beneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver.v_(str4);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<BeneficiaryBankResponse>> call, Response<OpenAccountSuccessActivity<BeneficiaryBankResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<BeneficiaryBankResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver beneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver = BeneficiaryBankPresenter.this.b;
                        OpenAccountSuccessActivity<BeneficiaryBankResponse> body2 = response.body();
                        BeneficiaryBankResponse beneficiaryBankResponse = body2.d;
                        if (beneficiaryBankResponse == null) {
                            beneficiaryBankResponse = body2.a;
                            if (beneficiaryBankResponse == null) {
                                beneficiaryBankResponse = null;
                            }
                        }
                        beneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver.b(beneficiaryBankResponse);
                        return;
                    }
                    OpenAccountSuccessActivity<BeneficiaryBankResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str4 = detailrtgscny2.a;
                    if ((str4 != null ? str4 : detailrtgscny2.c).equals("MID-00-898")) {
                        BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver beneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = BeneficiaryBankPresenter.this.b;
                        OpenAccountSuccessActivity<BeneficiaryBankResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        beneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<BeneficiaryBankResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str5 = detailrtgscny4.a;
                    if ((str5 != null ? str5 : detailrtgscny4.c).equals("MID-00-899")) {
                        BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver beneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = BeneficiaryBankPresenter.this.b;
                        OpenAccountSuccessActivity<BeneficiaryBankResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        beneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    BeneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver beneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver4 = BeneficiaryBankPresenter.this.b;
                    OpenAccountSuccessActivity<BeneficiaryBankResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    beneficiaryBankPresenter$MediaBrowserCompat$CustomActionResultReceiver4.f(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                BeneficiaryBankPresenter.this.b.h(response.message());
            }
        });
    }
}
