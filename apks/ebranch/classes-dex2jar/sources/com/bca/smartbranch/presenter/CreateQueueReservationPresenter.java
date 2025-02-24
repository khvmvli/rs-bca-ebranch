package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.CreateQueueReservationResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.HapusTransaksiBerkalaActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CreateQueueReservationPresenter.class */
public class CreateQueueReservationPresenter {
    public Call<OpenAccountSuccessActivity<CreateQueueReservationResponse>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public write b;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CreateQueueReservationPresenter$write.class */
    public interface write {
        void a(CreateQueueReservationResponse createQueueReservationResponse);

        @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        void b(String str);

        void b_(String str);

        void c(String str);

        void f(String str);

        @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void g_();
    }

    public CreateQueueReservationPresenter() {
        App.d().b(this);
    }

    public final void a(HapusTransaksiBerkalaActivity_ViewBinding hapusTransaksiBerkalaActivity_ViewBinding) {
        this.b.g_();
        Call<OpenAccountSuccessActivity<CreateQueueReservationResponse>> c = this.apiService.c(hapusTransaksiBerkalaActivity_ViewBinding);
        this.a = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<CreateQueueReservationResponse>>() { // from class: com.bca.smartbranch.presenter.CreateQueueReservationPresenter.4
            public final void onFailure(Call<OpenAccountSuccessActivity<CreateQueueReservationResponse>> call, Throwable th) {
                String str;
                if (CreateQueueReservationPresenter.this.a != null && !CreateQueueReservationPresenter.this.a.isCanceled()) {
                    write write2 = CreateQueueReservationPresenter.this.b;
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

            public final void onResponse(Call<OpenAccountSuccessActivity<CreateQueueReservationResponse>> call, Response<OpenAccountSuccessActivity<CreateQueueReservationResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<CreateQueueReservationResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = CreateQueueReservationPresenter.this.b;
                        OpenAccountSuccessActivity<CreateQueueReservationResponse> body2 = response.body();
                        CreateQueueReservationResponse createQueueReservationResponse = body2.d;
                        if (createQueueReservationResponse == null) {
                            createQueueReservationResponse = body2.a;
                            if (createQueueReservationResponse == null) {
                                createQueueReservationResponse = null;
                            }
                        }
                        write2.a(createQueueReservationResponse);
                        return;
                    }
                    OpenAccountSuccessActivity<CreateQueueReservationResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        write write3 = CreateQueueReservationPresenter.this.b;
                        OpenAccountSuccessActivity<CreateQueueReservationResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        write3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<CreateQueueReservationResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        write write4 = CreateQueueReservationPresenter.this.b;
                        OpenAccountSuccessActivity<CreateQueueReservationResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        write4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    write write5 = CreateQueueReservationPresenter.this.b;
                    OpenAccountSuccessActivity<CreateQueueReservationResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    write5.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                CreateQueueReservationPresenter.this.b.f(response.message());
            }
        });
    }
}
