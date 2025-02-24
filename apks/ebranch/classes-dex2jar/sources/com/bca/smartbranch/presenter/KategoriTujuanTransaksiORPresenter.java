package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/KategoriTujuanTransaksiORPresenter.class */
public class KategoriTujuanTransaksiORPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> c;
    public IconCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/KategoriTujuanTransaksiORPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
        void b(String str);

        @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
        void b_(String str);

        void c(KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse);

        @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
        void g_();

        void t_(String str);

        void u_(String str);

        void z_(String str);
    }

    public KategoriTujuanTransaksiORPresenter() {
        App.d().a(this);
    }

    public final void d(String str) {
        this.e.g_();
        Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> i = this.apiService.i(str);
        this.c = i;
        i.enqueue(new Callback<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>>() { // from class: com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> call, Throwable th) {
                String str2;
                if (!KategoriTujuanTransaksiORPresenter.this.c.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = KategoriTujuanTransaksiORPresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str2 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str2 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.z_(str2);
                    }
                    str2 = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.z_(str2);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> call, Response<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        IconCompatParcelizer iconCompatParcelizer = KategoriTujuanTransaksiORPresenter.this.e;
                        OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body2 = response.body();
                        KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse = body2.d;
                        if (kategoriTujuanTransaksiORResponse == null) {
                            kategoriTujuanTransaksiORResponse = body2.a;
                            if (kategoriTujuanTransaksiORResponse == null) {
                                kategoriTujuanTransaksiORResponse = null;
                            }
                        }
                        iconCompatParcelizer.c(kategoriTujuanTransaksiORResponse);
                        return;
                    }
                    OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str2 = detailrtgscny2.a;
                    if ((str2 != null ? str2 : detailrtgscny2.c).equals("MID-00-898")) {
                        IconCompatParcelizer iconCompatParcelizer2 = KategoriTujuanTransaksiORPresenter.this.e;
                        OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        iconCompatParcelizer2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str3 = detailrtgscny4.a;
                    if ((str3 != null ? str3 : detailrtgscny4.c).equals("MID-00-899")) {
                        IconCompatParcelizer iconCompatParcelizer3 = KategoriTujuanTransaksiORPresenter.this.e;
                        OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        iconCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    IconCompatParcelizer iconCompatParcelizer4 = KategoriTujuanTransaksiORPresenter.this.e;
                    OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    iconCompatParcelizer4.t_(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                KategoriTujuanTransaksiORPresenter.this.e.u_(response.message());
            }
        });
    }
}
