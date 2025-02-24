package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.InfoValueTodayORActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.PhotoCardActivity_ViewBinding;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/OcrPresenter.class */
public class OcrPresenter {
    public Call<OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver c;

    public OcrPresenter() {
        App.d().a(this);
    }

    public final void d(InfoValueTodayORActivity_ViewBinding infoValueTodayORActivity_ViewBinding) {
        this.c.d();
        Call<OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding>> c = this.apiService.c(infoValueTodayORActivity_ViewBinding);
        this.a = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding>>() { // from class: com.bca.smartbranch.presenter.OcrPresenter.4
            public final void onFailure(Call<OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding>> call, Throwable th) {
                String str;
                if (OcrPresenter.this.a != null && !OcrPresenter.this.a.isCanceled()) {
                    OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver ocrPresenter$MediaBrowserCompat$CustomActionResultReceiver = OcrPresenter.this.c;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        ocrPresenter$MediaBrowserCompat$CustomActionResultReceiver.c(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    ocrPresenter$MediaBrowserCompat$CustomActionResultReceiver.c(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding>> call, Response<OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver ocrPresenter$MediaBrowserCompat$CustomActionResultReceiver = OcrPresenter.this.c;
                        OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding> body2 = response.body();
                        PhotoCardActivity_ViewBinding photoCardActivity_ViewBinding = body2.d;
                        if (photoCardActivity_ViewBinding == null) {
                            photoCardActivity_ViewBinding = body2.a;
                            if (photoCardActivity_ViewBinding == null) {
                                photoCardActivity_ViewBinding = null;
                            }
                        }
                        ocrPresenter$MediaBrowserCompat$CustomActionResultReceiver.b(photoCardActivity_ViewBinding.b);
                        return;
                    }
                    OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver ocrPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = OcrPresenter.this.c;
                    OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    ocrPresenter$MediaBrowserCompat$CustomActionResultReceiver2.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                OcrPresenter.this.c.h(response.message());
            }
        });
    }
}
