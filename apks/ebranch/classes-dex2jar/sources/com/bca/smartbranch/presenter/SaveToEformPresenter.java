package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onChooseBankPenerbit;
import o.onClickNegara;
import o.onOpenFingerprintDialog;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/SaveToEformPresenter.class */
public class SaveToEformPresenter {
    public write a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<onChooseBankPenerbit>> c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/SaveToEformPresenter$write.class */
    public interface write {
        @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
        void b(String str);

        @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
        void b_(String str);

        void d(onChooseBankPenerbit onchoosebankpenerbit);

        @Override // com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void g_();

        void k(String str);

        void n(String str);
    }

    public SaveToEformPresenter() {
        App.d().d(this);
    }

    public final void a(onOpenFingerprintDialog onopenfingerprintdialog) {
        this.a.g_();
        Call<OpenAccountSuccessActivity<onChooseBankPenerbit>> b = this.apiService.b(onopenfingerprintdialog);
        this.c = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<onChooseBankPenerbit>>() { // from class: com.bca.smartbranch.presenter.SaveToEformPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<onChooseBankPenerbit>> call, Throwable th) {
                String str;
                if (SaveToEformPresenter.this.c != null && !SaveToEformPresenter.this.c.isCanceled()) {
                    write write2 = SaveToEformPresenter.this.a;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        write2.a_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    write2.a_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<onChooseBankPenerbit>> call, Response<OpenAccountSuccessActivity<onChooseBankPenerbit>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<onChooseBankPenerbit> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = SaveToEformPresenter.this.a;
                        OpenAccountSuccessActivity<onChooseBankPenerbit> body2 = response.body();
                        onChooseBankPenerbit onchoosebankpenerbit = body2.d;
                        if (onchoosebankpenerbit == null) {
                            onchoosebankpenerbit = body2.a;
                            if (onchoosebankpenerbit == null) {
                                onchoosebankpenerbit = null;
                            }
                        }
                        write2.d(onchoosebankpenerbit);
                        return;
                    }
                    OpenAccountSuccessActivity<onChooseBankPenerbit> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        write write3 = SaveToEformPresenter.this.a;
                        OpenAccountSuccessActivity<onChooseBankPenerbit> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        write3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<onChooseBankPenerbit> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        write write4 = SaveToEformPresenter.this.a;
                        OpenAccountSuccessActivity<onChooseBankPenerbit> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        write4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    write write5 = SaveToEformPresenter.this.a;
                    OpenAccountSuccessActivity<onChooseBankPenerbit> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    write5.n(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                SaveToEformPresenter.this.a.k(response.message());
            }
        });
    }
}
