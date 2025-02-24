package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import o.OpenAccountActivity;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAddressPresenter.class */
public class GetAddressPresenter {
    public IconCompatParcelizer a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<OpenAccountActivity>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAddressPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(String str);

        void c(OpenAccountActivity openAccountActivity);

        void d(String str);

        void e(String str);

        void s();
    }

    public GetAddressPresenter() {
        App.d().b(this);
    }

    public final void a(String str, Map<String, String> map) {
        this.a.s();
        Call<OpenAccountSuccessActivity<OpenAccountActivity>> c = this.apiService.c(str, map);
        this.e = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<OpenAccountActivity>>() { // from class: com.bca.smartbranch.presenter.GetAddressPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<OpenAccountActivity>> call, Throwable th) {
                String str2;
                if (GetAddressPresenter.this.e != null && !GetAddressPresenter.this.e.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = GetAddressPresenter.this.a;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str2 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str2 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.e(str2);
                    }
                    str2 = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.e(str2);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<OpenAccountActivity>> call, Response<OpenAccountSuccessActivity<OpenAccountActivity>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<OpenAccountActivity> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        IconCompatParcelizer iconCompatParcelizer = GetAddressPresenter.this.a;
                        OpenAccountSuccessActivity<OpenAccountActivity> body2 = response.body();
                        OpenAccountActivity openAccountActivity = body2.d;
                        if (openAccountActivity == null) {
                            openAccountActivity = body2.a;
                            if (openAccountActivity == null) {
                                openAccountActivity = null;
                            }
                        }
                        iconCompatParcelizer.c(openAccountActivity);
                        return;
                    }
                    IconCompatParcelizer iconCompatParcelizer2 = GetAddressPresenter.this.a;
                    OpenAccountSuccessActivity<OpenAccountActivity> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    iconCompatParcelizer2.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                GetAddressPresenter.this.a.a(response.message());
            }
        });
    }
}
