package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.CreateReservationResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.InfoBiayaActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CreateReservationPresenter.class */
public class CreateReservationPresenter {
    public Call<OpenAccountSuccessActivity<CreateReservationResponse>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CreateReservationPresenter$read.class */
    public interface read {
        @Override // com.bca.smartbranch.presenter.RescheduleReservationPresenter.write, com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        void c(String str);

        void d(CreateReservationResponse createReservationResponse);

        @Override // com.bca.smartbranch.presenter.RescheduleReservationPresenter.write, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void g_();

        void h(String str);

        @Override // com.bca.smartbranch.presenter.RescheduleReservationPresenter.write, com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer
        void j(String str);

        @Override // com.bca.smartbranch.presenter.RescheduleReservationPresenter.write, com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer
        void k(String str);
    }

    public CreateReservationPresenter() {
        App.d().e(this);
    }

    public final void d(InfoBiayaActivity_ViewBinding infoBiayaActivity_ViewBinding) {
        this.d.g_();
        Call<OpenAccountSuccessActivity<CreateReservationResponse>> b = this.apiService.b(infoBiayaActivity_ViewBinding);
        this.a = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<CreateReservationResponse>>() { // from class: com.bca.smartbranch.presenter.CreateReservationPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<CreateReservationResponse>> call, Throwable th) {
                String str;
                if (CreateReservationPresenter.this.a != null && !CreateReservationPresenter.this.a.isCanceled()) {
                    read read2 = CreateReservationPresenter.this.d;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        read2.a_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    read2.a_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<CreateReservationResponse>> call, Response<OpenAccountSuccessActivity<CreateReservationResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<CreateReservationResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        read read2 = CreateReservationPresenter.this.d;
                        OpenAccountSuccessActivity<CreateReservationResponse> body2 = response.body();
                        CreateReservationResponse createReservationResponse = body2.d;
                        if (createReservationResponse == null) {
                            createReservationResponse = body2.a;
                            if (createReservationResponse == null) {
                                createReservationResponse = null;
                            }
                        }
                        read2.d(createReservationResponse);
                        return;
                    }
                    OpenAccountSuccessActivity<CreateReservationResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        read read3 = CreateReservationPresenter.this.d;
                        OpenAccountSuccessActivity<CreateReservationResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        read3.k(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<CreateReservationResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        read read4 = CreateReservationPresenter.this.d;
                        OpenAccountSuccessActivity<CreateReservationResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        read4.j(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    read read5 = CreateReservationPresenter.this.d;
                    OpenAccountSuccessActivity<CreateReservationResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    read5.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                CreateReservationPresenter.this.d.h(response.message());
            }
        });
    }
}
