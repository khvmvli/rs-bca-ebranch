package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.GetBranchReservationResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.InfoJenisKartuActivity;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetBranchPresenter.class */
public class GetBranchPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public IconCompatParcelizer b;
    public Call<OpenAccountSuccessActivity<GetBranchReservationResponse>> c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetBranchPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void b();

        void b(String str);

        @Override // com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
        void c(String str);

        @Override // com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
        void d(String str);

        void e(GetBranchReservationResponse getBranchReservationResponse);

        @Override // com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
        void h(String str);

        void i(String str);
    }

    public GetBranchPresenter() {
        App.d().c(this);
    }

    public final void b(InfoJenisKartuActivity infoJenisKartuActivity) {
        this.b.b();
        Call<OpenAccountSuccessActivity<GetBranchReservationResponse>> b = this.apiService.b(infoJenisKartuActivity);
        this.c = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<GetBranchReservationResponse>>() { // from class: com.bca.smartbranch.presenter.GetBranchPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<GetBranchReservationResponse>> call, Throwable th) {
                String str;
                if (GetBranchPresenter.this.c != null && !GetBranchPresenter.this.c.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = GetBranchPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.c(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.c(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<GetBranchReservationResponse>> call, Response<OpenAccountSuccessActivity<GetBranchReservationResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<GetBranchReservationResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        IconCompatParcelizer iconCompatParcelizer = GetBranchPresenter.this.b;
                        OpenAccountSuccessActivity<GetBranchReservationResponse> body2 = response.body();
                        GetBranchReservationResponse getBranchReservationResponse = body2.d;
                        if (getBranchReservationResponse == null) {
                            getBranchReservationResponse = body2.a;
                            if (getBranchReservationResponse == null) {
                                getBranchReservationResponse = null;
                            }
                        }
                        iconCompatParcelizer.e(getBranchReservationResponse);
                        return;
                    }
                    OpenAccountSuccessActivity<GetBranchReservationResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        IconCompatParcelizer iconCompatParcelizer2 = GetBranchPresenter.this.b;
                        OpenAccountSuccessActivity<GetBranchReservationResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        iconCompatParcelizer2.h(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<GetBranchReservationResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        IconCompatParcelizer iconCompatParcelizer3 = GetBranchPresenter.this.b;
                        OpenAccountSuccessActivity<GetBranchReservationResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        iconCompatParcelizer3.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    IconCompatParcelizer iconCompatParcelizer4 = GetBranchPresenter.this.b;
                    OpenAccountSuccessActivity<GetBranchReservationResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    iconCompatParcelizer4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                GetBranchPresenter.this.b.i(response.message());
            }
        });
    }
}
