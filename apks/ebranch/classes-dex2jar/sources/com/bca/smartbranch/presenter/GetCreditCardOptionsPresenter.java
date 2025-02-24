package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.clikedKartuHilang;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCreditCardOptionsPresenter.class */
public class GetCreditCardOptionsPresenter {
    public Call<OpenAccountSuccessActivity<clikedKartuHilang>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCreditCardOptionsPresenter$read.class */
    public interface read {
        void B_(String str);

        @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        void b(String str);

        @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        void b_(String str);

        void d(clikedKartuHilang clikedkartuhilang);

        @Override // com.bca.smartbranch.presenter.CheckCutOffPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
        void g_();

        void r_(String str);

        void s_(String str);
    }

    public GetCreditCardOptionsPresenter() {
        App.d().a(this);
    }

    public final void c() {
        this.c.g_();
        Call<OpenAccountSuccessActivity<clikedKartuHilang>> a = this.apiService.a();
        this.a = a;
        a.enqueue(new Callback<OpenAccountSuccessActivity<clikedKartuHilang>>() { // from class: com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<clikedKartuHilang>> call, Throwable th) {
                String str;
                if (GetCreditCardOptionsPresenter.this.a != null && !GetCreditCardOptionsPresenter.this.a.isCanceled()) {
                    read read2 = GetCreditCardOptionsPresenter.this.c;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        read2.s_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    read2.s_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<clikedKartuHilang>> call, Response<OpenAccountSuccessActivity<clikedKartuHilang>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<clikedKartuHilang> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        read read2 = GetCreditCardOptionsPresenter.this.c;
                        OpenAccountSuccessActivity<clikedKartuHilang> body2 = response.body();
                        clikedKartuHilang clikedkartuhilang = body2.d;
                        if (clikedkartuhilang == null) {
                            clikedkartuhilang = body2.a;
                            if (clikedkartuhilang == null) {
                                clikedkartuhilang = null;
                            }
                        }
                        read2.d(clikedkartuhilang);
                        return;
                    }
                    OpenAccountSuccessActivity<clikedKartuHilang> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        read read3 = GetCreditCardOptionsPresenter.this.c;
                        OpenAccountSuccessActivity<clikedKartuHilang> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        read3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<clikedKartuHilang> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        read read4 = GetCreditCardOptionsPresenter.this.c;
                        OpenAccountSuccessActivity<clikedKartuHilang> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        read4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    read read5 = GetCreditCardOptionsPresenter.this.c;
                    OpenAccountSuccessActivity<clikedKartuHilang> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    read5.r_(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                GetCreditCardOptionsPresenter.this.c.B_(response.message());
            }
        });
    }
}
