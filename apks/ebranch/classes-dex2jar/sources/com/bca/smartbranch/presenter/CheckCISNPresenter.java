package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.CISNResponse;
import com.bca.smartbranch.data.localdb.User;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.getPromotion;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckCISNPresenter.class */
public class CheckCISNPresenter {
    public Call<OpenAccountSuccessActivity<CISNResponse>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public write d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckCISNPresenter$write.class */
    public interface write {
        void a();

        void b();

        void c(String str);

        void d();

        void e();

        void e(String str);

        void h(String str);
    }

    public CheckCISNPresenter() {
        App.d().e(this);
    }

    public final void d(User user, String str) {
        this.d.a();
        Call<OpenAccountSuccessActivity<CISNResponse>> e = this.apiService.e(getPromotion.e(user), str);
        this.a = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<CISNResponse>>() { // from class: com.bca.smartbranch.presenter.CheckCISNPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<CISNResponse>> call, Throwable th) {
                if (CheckCISNPresenter.this.a != null && !CheckCISNPresenter.this.a.isCanceled()) {
                    write write2 = CheckCISNPresenter.this.d;
                    if (th != null && !(th instanceof UnknownHostException)) {
                        boolean z = th instanceof SocketTimeoutException;
                    }
                    write2.b();
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<CISNResponse>> call, Response<OpenAccountSuccessActivity<CISNResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<CISNResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = CheckCISNPresenter.this.d;
                        OpenAccountSuccessActivity<CISNResponse> body2 = response.body();
                        CISNResponse cISNResponse = body2.d;
                        if (cISNResponse == null) {
                            cISNResponse = body2.a;
                            if (cISNResponse == null) {
                                cISNResponse = null;
                            }
                        }
                        write2.h(cISNResponse.getFlag());
                        return;
                    }
                    OpenAccountSuccessActivity<CISNResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str2 = detailrtgscny2.a;
                    if ((str2 != null ? str2 : detailrtgscny2.c).equals("MID-00-898")) {
                        write write3 = CheckCISNPresenter.this.d;
                        OpenAccountSuccessActivity<CISNResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        write3.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<CISNResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str3 = detailrtgscny4.a;
                    if ((str3 != null ? str3 : detailrtgscny4.c).equals("MID-00-899")) {
                        write write4 = CheckCISNPresenter.this.d;
                        OpenAccountSuccessActivity<CISNResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        write4.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    write write5 = CheckCISNPresenter.this.d;
                    OpenAccountSuccessActivity<CISNResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    if (detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null) {
                        String str4 = detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c;
                    } else {
                        String str5 = detailrtgscny6.b;
                    }
                    write5.d();
                    return;
                }
                write write6 = CheckCISNPresenter.this.d;
                response.message();
                write6.e();
            }
        });
    }
}
