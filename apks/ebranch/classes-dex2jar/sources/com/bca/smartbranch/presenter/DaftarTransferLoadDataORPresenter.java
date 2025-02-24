package com.bca.smartbranch.presenter;

import android.util.Base64;
import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;
import o.InfoProductActivity;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DaftarTransferLoadDataORPresenter.class */
public class DaftarTransferLoadDataORPresenter {
    public RemoteActionCompatParcelizer a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<DaftarTransferResponse>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DaftarTransferLoadDataORPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void b(List<DaftarTransferResponse.DaftarTransferOutput> list);

        void g_();
    }

    public DaftarTransferLoadDataORPresenter() {
        App.d().a(this);
    }

    public final void e(InfoProductActivity infoProductActivity) {
        this.a.g_();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", infoProductActivity.b);
            jSONObject.put("SessionId", infoProductActivity.a);
            jSONObject.put("IMEI", infoProductActivity.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> n = this.apiService.n(new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString(), infoProductActivity.e);
        this.e = n;
        n.enqueue(new Callback<OpenAccountSuccessActivity<DaftarTransferResponse>>() { // from class: com.bca.smartbranch.presenter.DaftarTransferLoadDataORPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call, Throwable th) {
                if (DaftarTransferLoadDataORPresenter.this.e != null && !DaftarTransferLoadDataORPresenter.this.e.isCanceled()) {
                    DaftarTransferLoadDataORPresenter.this.a.b(null);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call, Response<OpenAccountSuccessActivity<DaftarTransferResponse>> response) {
                DaftarTransferResponse daftarTransferResponse;
                DaftarTransferResponse daftarTransferResponse2 = null;
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<DaftarTransferResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (!detailrtgscny.e()) {
                        OpenAccountSuccessActivity<DaftarTransferResponse> body2 = response.body();
                        detailRTGSCNY detailrtgscny2 = body2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body2.b;
                        }
                        String str = detailrtgscny2.a;
                        if (!(str != null ? str : detailrtgscny2.c).equals("MID-09-111")) {
                            DaftarTransferLoadDataORPresenter.this.a.b(null);
                            return;
                        }
                    }
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = DaftarTransferLoadDataORPresenter.this.a;
                    OpenAccountSuccessActivity<DaftarTransferResponse> body3 = response.body();
                    daftarTransferResponse2 = body3.d;
                    if (daftarTransferResponse2 == null && (daftarTransferResponse = body3.a) != null) {
                        daftarTransferResponse2 = daftarTransferResponse;
                    }
                    remoteActionCompatParcelizer.b(daftarTransferResponse2.getDaftarTransferOutputList());
                    return;
                }
                DaftarTransferLoadDataORPresenter.this.a.b(null);
            }
        });
    }
}
