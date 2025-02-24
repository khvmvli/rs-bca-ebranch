package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.FotoActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckCCValidApplicantPresenter.class */
public class CheckCCValidApplicantPresenter {
    public Call<OpenAccountSuccessActivity<Object>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RemoteActionCompatParcelizer d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckCCValidApplicantPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a();

        void a(String str);

        @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
        void c(String str);

        void e();

        void e(String str);
    }

    public CheckCCValidApplicantPresenter() {
        App.d().d(this);
    }

    public final void b(FotoActivity_ViewBinding fotoActivity_ViewBinding) {
        this.d.e();
        Call<OpenAccountSuccessActivity<Object>> b = this.apiService.b(fotoActivity_ViewBinding);
        this.a = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (CheckCCValidApplicantPresenter.this.a != null && !CheckCCValidApplicantPresenter.this.a.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = CheckCCValidApplicantPresenter.this.d;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        remoteActionCompatParcelizer.c(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    remoteActionCompatParcelizer.c(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<Object> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        CheckCCValidApplicantPresenter.this.d.a();
                        return;
                    }
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = CheckCCValidApplicantPresenter.this.d;
                    OpenAccountSuccessActivity<Object> body2 = response.body();
                    detailRTGSCNY detailrtgscny2 = body2.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body2.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    remoteActionCompatParcelizer.a(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                CheckCCValidApplicantPresenter.this.d.e(response.message());
            }
        });
    }
}
