package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.InfoFullAmountORActivity;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onChooseMenu;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAreaPresenter.class */
public class GetAreaPresenter {
    public write a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<onChooseMenu>> c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAreaPresenter$write.class */
    public interface write {
        @Override // com.bca.smartbranch.presenter.GetBranchPresenter.IconCompatParcelizer
        void b();

        @Override // com.bca.smartbranch.presenter.GetBranchPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
        void c(String str);

        void c(onChooseMenu onchoosemenu);

        void d();

        @Override // com.bca.smartbranch.presenter.GetBranchPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
        void d(String str);

        void e();

        @Override // com.bca.smartbranch.presenter.GetBranchPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
        void h(String str);
    }

    public GetAreaPresenter() {
        App.d().a(this);
    }

    public final void c(InfoFullAmountORActivity infoFullAmountORActivity) {
        this.a.b();
        Call<OpenAccountSuccessActivity<onChooseMenu>> c = this.apiService.c(infoFullAmountORActivity);
        this.c = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<onChooseMenu>>() { // from class: com.bca.smartbranch.presenter.GetAreaPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<onChooseMenu>> call, Throwable th) {
                String str;
                if (GetAreaPresenter.this.c != null && !GetAreaPresenter.this.c.isCanceled()) {
                    write write2 = GetAreaPresenter.this.a;
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

            public final void onResponse(Call<OpenAccountSuccessActivity<onChooseMenu>> call, Response<OpenAccountSuccessActivity<onChooseMenu>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<onChooseMenu> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = GetAreaPresenter.this.a;
                        OpenAccountSuccessActivity<onChooseMenu> body2 = response.body();
                        onChooseMenu onchoosemenu = body2.d;
                        if (onchoosemenu == null) {
                            onchoosemenu = body2.a;
                            if (onchoosemenu == null) {
                                onchoosemenu = null;
                            }
                        }
                        write2.c(onchoosemenu);
                        return;
                    }
                    OpenAccountSuccessActivity<onChooseMenu> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        write write3 = GetAreaPresenter.this.a;
                        OpenAccountSuccessActivity<onChooseMenu> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        write3.h(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<onChooseMenu> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        write write4 = GetAreaPresenter.this.a;
                        OpenAccountSuccessActivity<onChooseMenu> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        write4.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    write write5 = GetAreaPresenter.this.a;
                    OpenAccountSuccessActivity<onChooseMenu> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    if (detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null) {
                        String str3 = detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c;
                    } else {
                        String str4 = detailrtgscny6.b;
                    }
                    write5.e();
                    return;
                }
                write write6 = GetAreaPresenter.this.a;
                response.message();
                write6.d();
            }
        });
    }
}
