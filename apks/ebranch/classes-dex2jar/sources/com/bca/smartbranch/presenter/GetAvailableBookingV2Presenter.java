package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.InfoKursORActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceMenuActivity_ViewBinding;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAvailableBookingV2Presenter.class */
public class GetAvailableBookingV2Presenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public write b;
    public Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAvailableBookingV2Presenter$write.class */
    public interface write {
        @Override // com.bca.smartbranch.presenter.SaveToEformPresenter.write, com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        @Override // com.bca.smartbranch.presenter.SaveToEformPresenter.write, com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
        void b(String str);

        @Override // com.bca.smartbranch.presenter.SaveToEformPresenter.write, com.bca.smartbranch.presenter.CreateQueueReservationPresenter.write
        void b_(String str);

        void d(OutwardRemittanceMenuActivity_ViewBinding outwardRemittanceMenuActivity_ViewBinding);

        void h(String str);

        void j(String str);

        void u();
    }

    public GetAvailableBookingV2Presenter() {
        App.d().b(this);
    }

    public final void a(InfoKursORActivity_ViewBinding infoKursORActivity_ViewBinding) {
        this.b.u();
        Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> c = this.apiService.c(infoKursORActivity_ViewBinding);
        this.e = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>>() { // from class: com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter.5
            public final void onFailure(Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> call, Throwable th) {
                String str;
                if (GetAvailableBookingV2Presenter.this.e != null && !GetAvailableBookingV2Presenter.this.e.isCanceled()) {
                    write write2 = GetAvailableBookingV2Presenter.this.b;
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

            public final void onResponse(Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> call, Response<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = GetAvailableBookingV2Presenter.this.b;
                        OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding> body2 = response.body();
                        OutwardRemittanceMenuActivity_ViewBinding outwardRemittanceMenuActivity_ViewBinding = body2.d;
                        if (outwardRemittanceMenuActivity_ViewBinding == null) {
                            outwardRemittanceMenuActivity_ViewBinding = body2.a;
                            if (outwardRemittanceMenuActivity_ViewBinding == null) {
                                outwardRemittanceMenuActivity_ViewBinding = null;
                            }
                        }
                        write2.d(outwardRemittanceMenuActivity_ViewBinding);
                        return;
                    }
                    OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        write write3 = GetAvailableBookingV2Presenter.this.b;
                        OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        write3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        write write4 = GetAvailableBookingV2Presenter.this.b;
                        OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        write4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    write write5 = GetAvailableBookingV2Presenter.this.b;
                    OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    write5.h(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                GetAvailableBookingV2Presenter.this.b.j(response.message());
            }
        });
    }
}
