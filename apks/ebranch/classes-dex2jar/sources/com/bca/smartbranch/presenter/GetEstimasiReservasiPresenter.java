package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import o.InfoCodewordORActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailMultiCurrencyBCA;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetEstimasiReservasiPresenter.class */
public class GetEstimasiReservasiPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read d;
    public Call<OpenAccountSuccessActivity<detailMultiCurrencyBCA>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetEstimasiReservasiPresenter$read.class */
    public interface read {
        void a(String str);

        void b(String str);

        void b(List<detailMultiCurrencyBCA.IconCompatParcelizer> list);

        void c(String str);

        void d(String str);

        void e(String str);

        void s();
    }

    public GetEstimasiReservasiPresenter() {
        App.d().b(this);
    }

    public final void b(InfoCodewordORActivity_ViewBinding infoCodewordORActivity_ViewBinding) {
        this.d.s();
        Call<OpenAccountSuccessActivity<detailMultiCurrencyBCA>> c = this.apiService.c(infoCodewordORActivity_ViewBinding);
        this.e = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<detailMultiCurrencyBCA>>() { // from class: com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<detailMultiCurrencyBCA>> call, Throwable th) {
                String str;
                if (GetEstimasiReservasiPresenter.this.e != null && !GetEstimasiReservasiPresenter.this.e.isCanceled()) {
                    read read2 = GetEstimasiReservasiPresenter.this.d;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        read2.d(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    read2.d(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<detailMultiCurrencyBCA>> call, Response<OpenAccountSuccessActivity<detailMultiCurrencyBCA>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<detailMultiCurrencyBCA> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        read read2 = GetEstimasiReservasiPresenter.this.d;
                        OpenAccountSuccessActivity<detailMultiCurrencyBCA> body2 = response.body();
                        detailMultiCurrencyBCA detailmulticurrencybca = body2.d;
                        if (detailmulticurrencybca == null) {
                            detailmulticurrencybca = body2.a;
                            if (detailmulticurrencybca == null) {
                                detailmulticurrencybca = null;
                            }
                        }
                        read2.b(detailmulticurrencybca.b);
                        return;
                    }
                    OpenAccountSuccessActivity<detailMultiCurrencyBCA> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        read read3 = GetEstimasiReservasiPresenter.this.d;
                        OpenAccountSuccessActivity<detailMultiCurrencyBCA> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        read3.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<detailMultiCurrencyBCA> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        read read4 = GetEstimasiReservasiPresenter.this.d;
                        OpenAccountSuccessActivity<detailMultiCurrencyBCA> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        read4.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    read read5 = GetEstimasiReservasiPresenter.this.d;
                    OpenAccountSuccessActivity<detailMultiCurrencyBCA> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    read5.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                GetEstimasiReservasiPresenter.this.d.b(response.message());
            }
        });
    }
}
