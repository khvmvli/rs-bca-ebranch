package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.PenggantianKartuATMActivity_ViewBinding;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCitySearchPresenter.class */
public class GetCitySearchPresenter {
    public write a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding>> b;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCitySearchPresenter$write.class */
    public interface write {
        @Override // com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
        void B();

        @Override // com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
        void b(String str);

        @Override // com.bca.smartbranch.presenter.GetBranchByCityPresenter.RemoteActionCompatParcelizer
        void b_(String str);

        void c(PenggantianKartuATMActivity_ViewBinding penggantianKartuATMActivity_ViewBinding);

        void g(String str);

        void i(String str);

        void j(String str);
    }

    public GetCitySearchPresenter() {
        App.d().c(this);
    }

    public final void a(String str) {
        this.a.B();
        Call<OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding>> c = this.apiService.c(str);
        this.b = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding>>() { // from class: com.bca.smartbranch.presenter.GetCitySearchPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding>> call, Throwable th) {
                String str2;
                if (GetCitySearchPresenter.this.b != null && !GetCitySearchPresenter.this.b.isCanceled()) {
                    write write2 = GetCitySearchPresenter.this.a;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str2 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str2 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        write2.g(str2);
                    }
                    str2 = "Oops! Terjadi kesalahan.";
                    write2.g(str2);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding>> call, Response<OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = GetCitySearchPresenter.this.a;
                        OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding> body2 = response.body();
                        PenggantianKartuATMActivity_ViewBinding penggantianKartuATMActivity_ViewBinding = body2.d;
                        if (penggantianKartuATMActivity_ViewBinding == null) {
                            penggantianKartuATMActivity_ViewBinding = body2.a;
                            if (penggantianKartuATMActivity_ViewBinding == null) {
                                penggantianKartuATMActivity_ViewBinding = null;
                            }
                        }
                        write2.c(penggantianKartuATMActivity_ViewBinding);
                        return;
                    }
                    OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str2 = detailrtgscny2.a;
                    if ((str2 != null ? str2 : detailrtgscny2.c).equals("MID-00-898")) {
                        write write3 = GetCitySearchPresenter.this.a;
                        OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        write3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str3 = detailrtgscny4.a;
                    if ((str3 != null ? str3 : detailrtgscny4.c).equals("MID-00-899")) {
                        write write4 = GetCitySearchPresenter.this.a;
                        OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        write4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    write write5 = GetCitySearchPresenter.this.a;
                    OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    write5.j(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                GetCitySearchPresenter.this.a.i(response.message());
            }
        });
    }
}
