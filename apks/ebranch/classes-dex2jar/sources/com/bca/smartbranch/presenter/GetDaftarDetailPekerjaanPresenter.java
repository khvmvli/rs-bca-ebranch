package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetDaftarDetailPekerjaanPresenter.class */
public class GetDaftarDetailPekerjaanPresenter {
    public write a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetDaftarDetailPekerjaanPresenter$write.class */
    public interface write {
        void b(GetDaftarPekerjaanResponse getDaftarPekerjaanResponse);

        void s();
    }

    public GetDaftarDetailPekerjaanPresenter() {
        App.d().d(this);
    }

    public final void d(String str) {
        this.a.s();
        Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> g = this.apiService.g(str);
        this.d = g;
        g.enqueue(new Callback<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>>() { // from class: com.bca.smartbranch.presenter.GetDaftarDetailPekerjaanPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> call, Throwable th) {
                if (GetDaftarDetailPekerjaanPresenter.this.d != null && !GetDaftarDetailPekerjaanPresenter.this.d.isCanceled()) {
                    write unused = GetDaftarDetailPekerjaanPresenter.this.a;
                    if (th != null && !(th instanceof UnknownHostException)) {
                        boolean z = th instanceof SocketTimeoutException;
                    }
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> call, Response<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<GetDaftarPekerjaanResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = GetDaftarDetailPekerjaanPresenter.this.a;
                        OpenAccountSuccessActivity<GetDaftarPekerjaanResponse> body2 = response.body();
                        GetDaftarPekerjaanResponse getDaftarPekerjaanResponse = body2.d;
                        if (getDaftarPekerjaanResponse == null) {
                            getDaftarPekerjaanResponse = body2.a;
                            if (getDaftarPekerjaanResponse == null) {
                                getDaftarPekerjaanResponse = null;
                            }
                        }
                        write2.b(getDaftarPekerjaanResponse);
                        return;
                    }
                    write unused = GetDaftarDetailPekerjaanPresenter.this.a;
                    OpenAccountSuccessActivity<GetDaftarPekerjaanResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    if (detailrtgscny_mediabrowsercompat_customactionresultreceiver != null) {
                        String str2 = detailrtgscny_mediabrowsercompat_customactionresultreceiver.c;
                    } else {
                        String str3 = detailrtgscny2.b;
                    }
                } else {
                    write unused2 = GetDaftarDetailPekerjaanPresenter.this.a;
                    response.message();
                }
            }
        });
    }
}
