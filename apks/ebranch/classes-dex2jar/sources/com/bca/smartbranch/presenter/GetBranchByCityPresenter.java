package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import o.InfoJenisKartuActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetBranchByCityPresenter.class */
public class GetBranchByCityPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RemoteActionCompatParcelizer b;
    public Call<OpenAccountSuccessActivity<GetBranchROResponse>> c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetBranchByCityPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void B();

        void b(String str);

        void b(List<GetBranchROResponse.DetailBranch> list);

        void b_(String str);

        void t();

        void v();

        void y();
    }

    public GetBranchByCityPresenter() {
        App.d().e(this);
    }

    public final void c(String str, InfoJenisKartuActivity_ViewBinding infoJenisKartuActivity_ViewBinding) {
        this.b.B();
        Call<OpenAccountSuccessActivity<GetBranchROResponse>> a = this.apiService.a(str, infoJenisKartuActivity_ViewBinding.d, infoJenisKartuActivity_ViewBinding.c);
        this.c = a;
        a.enqueue(new Callback<OpenAccountSuccessActivity<GetBranchROResponse>>() { // from class: com.bca.smartbranch.presenter.GetBranchByCityPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<GetBranchROResponse>> call, Throwable th) {
                if (GetBranchByCityPresenter.this.c != null && !GetBranchByCityPresenter.this.c.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = GetBranchByCityPresenter.this.b;
                    if (th != null && !(th instanceof UnknownHostException)) {
                        boolean z = th instanceof SocketTimeoutException;
                    }
                    remoteActionCompatParcelizer.y();
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<GetBranchROResponse>> call, Response<OpenAccountSuccessActivity<GetBranchROResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<GetBranchROResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        OpenAccountSuccessActivity<GetBranchROResponse> body2 = response.body();
                        GetBranchROResponse getBranchROResponse = body2.d;
                        if (getBranchROResponse == null) {
                            getBranchROResponse = body2.a;
                            if (getBranchROResponse == null) {
                                getBranchROResponse = null;
                            }
                        }
                        GetBranchROResponse getBranchROResponse2 = getBranchROResponse;
                        ArrayList arrayList = new ArrayList();
                        if (getBranchROResponse2.getBranchLists() != null) {
                            arrayList.addAll(getBranchROResponse2.getBranchLists());
                        }
                        GetBranchByCityPresenter.this.b.b(arrayList);
                        return;
                    }
                    OpenAccountSuccessActivity<GetBranchROResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str2 = detailrtgscny2.a;
                    if ((str2 != null ? str2 : detailrtgscny2.c).equals("MID-00-898")) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = GetBranchByCityPresenter.this.b;
                        OpenAccountSuccessActivity<GetBranchROResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        remoteActionCompatParcelizer.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<GetBranchROResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str3 = detailrtgscny4.a;
                    if ((str3 != null ? str3 : detailrtgscny4.c).equals("MID-00-899")) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = GetBranchByCityPresenter.this.b;
                        OpenAccountSuccessActivity<GetBranchROResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        remoteActionCompatParcelizer2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = GetBranchByCityPresenter.this.b;
                    OpenAccountSuccessActivity<GetBranchROResponse> body7 = response.body();
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
                    remoteActionCompatParcelizer3.t();
                    return;
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = GetBranchByCityPresenter.this.b;
                response.message();
                remoteActionCompatParcelizer4.v();
            }
        });
    }
}
