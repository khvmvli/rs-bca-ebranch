package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCategoriesORPresenter.class */
public class GetCategoriesORPresenter {
    public write a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<CategoriesORResponse>> d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCategoriesORPresenter$write.class */
    public interface write {
        void b(String str);

        void b_(String str);

        void d(CategoriesORResponse categoriesORResponse);

        void g(String str);

        void g_();

        void o_(String str);

        void y_(String str);
    }

    public GetCategoriesORPresenter() {
        App.d().b(this);
    }

    public final void c(String str, String str2) {
        this.a.g_();
        Call<OpenAccountSuccessActivity<CategoriesORResponse>> a = this.apiService.a(str, str2);
        this.d = a;
        a.enqueue(new Callback<OpenAccountSuccessActivity<CategoriesORResponse>>() { // from class: com.bca.smartbranch.presenter.GetCategoriesORPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<CategoriesORResponse>> call, Throwable th) {
                String str3;
                if (!GetCategoriesORPresenter.this.d.isCanceled()) {
                    write write2 = GetCategoriesORPresenter.this.a;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str3 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str3 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        write2.y_(str3);
                    }
                    str3 = "Oops! Terjadi kesalahan.";
                    write2.y_(str3);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<CategoriesORResponse>> call, Response<OpenAccountSuccessActivity<CategoriesORResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<CategoriesORResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = GetCategoriesORPresenter.this.a;
                        OpenAccountSuccessActivity<CategoriesORResponse> body2 = response.body();
                        CategoriesORResponse categoriesORResponse = body2.d;
                        if (categoriesORResponse == null) {
                            categoriesORResponse = body2.a;
                            if (categoriesORResponse == null) {
                                categoriesORResponse = null;
                            }
                        }
                        write2.d(categoriesORResponse);
                        return;
                    }
                    OpenAccountSuccessActivity<CategoriesORResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str3 = detailrtgscny2.a;
                    if ((str3 != null ? str3 : detailrtgscny2.c).equals("MID-00-898")) {
                        write write3 = GetCategoriesORPresenter.this.a;
                        OpenAccountSuccessActivity<CategoriesORResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        write3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<CategoriesORResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str4 = detailrtgscny4.a;
                    if ((str4 != null ? str4 : detailrtgscny4.c).equals("MID-00-899")) {
                        write write4 = GetCategoriesORPresenter.this.a;
                        OpenAccountSuccessActivity<CategoriesORResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        write4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    write write5 = GetCategoriesORPresenter.this.a;
                    OpenAccountSuccessActivity<CategoriesORResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    write5.o_(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                GetCategoriesORPresenter.this.a.g(response.message());
            }
        });
    }
}
