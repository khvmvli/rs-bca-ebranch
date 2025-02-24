package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.CreateQueueReservationResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onAddFingerPrintSuccess;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/RescheduleReservationV2Presenter.class */
public class RescheduleReservationV2Presenter {
    public IconCompatParcelizer a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    private Call<OpenAccountSuccessActivity<CreateQueueReservationResponse>> c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/RescheduleReservationV2Presenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        @Override // com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write, com.bca.smartbranch.presenter.SaveToEformPresenter.write, com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        @Override // com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write, com.bca.smartbranch.presenter.SaveToEformPresenter.write, com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
        void b(String str);

        @Override // com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.write, com.bca.smartbranch.presenter.SaveToEformPresenter.write, com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
        void b_(String str);

        void d(CreateQueueReservationResponse createQueueReservationResponse);

        void g(String str);

        @Override // com.bca.smartbranch.presenter.SaveToEformPresenter.write, com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void g_();

        void i(String str);
    }

    public RescheduleReservationV2Presenter() {
        App.d().b(this);
    }

    public final void d(onAddFingerPrintSuccess onaddfingerprintsuccess) {
        this.a.g_();
        Call<OpenAccountSuccessActivity<CreateQueueReservationResponse>> b = this.apiService.b(onaddfingerprintsuccess);
        this.c = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<CreateQueueReservationResponse>>() { // from class: com.bca.smartbranch.presenter.RescheduleReservationV2Presenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<CreateQueueReservationResponse>> call, Throwable th) {
                String str;
                if (RescheduleReservationV2Presenter.this.c != null && !RescheduleReservationV2Presenter.this.c.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = RescheduleReservationV2Presenter.this.a;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.a_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.a_(str);
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
                        IconCompatParcelizer iconCompatParcelizer = RescheduleReservationV2Presenter.this.a;
                        OpenAccountSuccessActivity<CreateQueueReservationResponse> body2 = response.body();
                        CreateQueueReservationResponse createQueueReservationResponse = body2.d;
                        if (createQueueReservationResponse == null) {
                            createQueueReservationResponse = body2.a;
                            if (createQueueReservationResponse == null) {
                                createQueueReservationResponse = null;
                            }
                        }
                        iconCompatParcelizer.d(createQueueReservationResponse);
                        return;
                    }
                    OpenAccountSuccessActivity<CreateQueueReservationResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        IconCompatParcelizer iconCompatParcelizer2 = RescheduleReservationV2Presenter.this.a;
                        OpenAccountSuccessActivity<CreateQueueReservationResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        iconCompatParcelizer2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<CreateQueueReservationResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        IconCompatParcelizer iconCompatParcelizer3 = RescheduleReservationV2Presenter.this.a;
                        OpenAccountSuccessActivity<CreateQueueReservationResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        iconCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    IconCompatParcelizer iconCompatParcelizer4 = RescheduleReservationV2Presenter.this.a;
                    OpenAccountSuccessActivity<CreateQueueReservationResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    iconCompatParcelizer4.g(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                RescheduleReservationV2Presenter.this.a.i(response.message());
            }
        });
    }
}
