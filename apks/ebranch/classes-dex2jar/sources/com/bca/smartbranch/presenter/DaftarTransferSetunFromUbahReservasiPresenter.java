package com.bca.smartbranch.presenter;

import android.util.Base64;
import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import o.InfoProductActivity;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DaftarTransferSetunFromUbahReservasiPresenter.class */
public class DaftarTransferSetunFromUbahReservasiPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<DaftarTransferResponse>> c;
    public IconCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DaftarTransferSetunFromUbahReservasiPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void A();

        void a(List<DaftarTransferResponse.DaftarTransferOutput> list);

        void b(String str);

        void b_(String str);

        void s();

        void u();

        void v();
    }

    public DaftarTransferSetunFromUbahReservasiPresenter() {
        App.d().b(this);
    }

    public final void a(InfoProductActivity infoProductActivity, boolean z) {
        this.e.s();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", infoProductActivity.b);
            jSONObject.put("SessionId", infoProductActivity.a);
            jSONObject.put("IMEI", infoProductActivity.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> n = this.apiService.n(new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString(), infoProductActivity.e);
        this.c = n;
        n.enqueue(new Callback<OpenAccountSuccessActivity<DaftarTransferResponse>>() { // from class: com.bca.smartbranch.presenter.DaftarTransferSetunFromUbahReservasiPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call, Throwable th) {
                if (DaftarTransferSetunFromUbahReservasiPresenter.this.c != null && !DaftarTransferSetunFromUbahReservasiPresenter.this.c.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = DaftarTransferSetunFromUbahReservasiPresenter.this.e;
                    if (th != null && !(th instanceof UnknownHostException)) {
                        boolean z2 = th instanceof SocketTimeoutException;
                    }
                    iconCompatParcelizer.A();
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call, Response<OpenAccountSuccessActivity<DaftarTransferResponse>> response) {
                DaftarTransferResponse daftarTransferResponse;
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
                            OpenAccountSuccessActivity<DaftarTransferResponse> body3 = response.body();
                            detailRTGSCNY detailrtgscny3 = body3.c;
                            if (detailrtgscny3 == null) {
                                detailrtgscny3 = body3.b;
                            }
                            String str2 = detailrtgscny3.a;
                            if (!(str2 != null ? str2 : detailrtgscny3.c).equals("EBR-2-318")) {
                                OpenAccountSuccessActivity<DaftarTransferResponse> body4 = response.body();
                                detailRTGSCNY detailrtgscny4 = body4.c;
                                if (detailrtgscny4 == null) {
                                    detailrtgscny4 = body4.b;
                                }
                                String str3 = detailrtgscny4.a;
                                if ((str3 != null ? str3 : detailrtgscny4.c).equals("MID-00-898")) {
                                    IconCompatParcelizer iconCompatParcelizer = DaftarTransferSetunFromUbahReservasiPresenter.this.e;
                                    OpenAccountSuccessActivity<DaftarTransferResponse> body5 = response.body();
                                    detailRTGSCNY detailrtgscny5 = body5.c;
                                    if (detailrtgscny5 == null) {
                                        detailrtgscny5 = body5.b;
                                    }
                                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny5.e;
                                    iconCompatParcelizer.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny5.b);
                                    return;
                                }
                                OpenAccountSuccessActivity<DaftarTransferResponse> body6 = response.body();
                                detailRTGSCNY detailrtgscny6 = body6.c;
                                if (detailrtgscny6 == null) {
                                    detailrtgscny6 = body6.b;
                                }
                                String str4 = detailrtgscny6.a;
                                if ((str4 != null ? str4 : detailrtgscny6.c).equals("MID-00-899")) {
                                    IconCompatParcelizer iconCompatParcelizer2 = DaftarTransferSetunFromUbahReservasiPresenter.this.e;
                                    OpenAccountSuccessActivity<DaftarTransferResponse> body7 = response.body();
                                    detailRTGSCNY detailrtgscny7 = body7.c;
                                    if (detailrtgscny7 == null) {
                                        detailrtgscny7 = body7.b;
                                    }
                                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny7.e;
                                    iconCompatParcelizer2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny7.b);
                                    return;
                                }
                                IconCompatParcelizer iconCompatParcelizer3 = DaftarTransferSetunFromUbahReservasiPresenter.this.e;
                                OpenAccountSuccessActivity<DaftarTransferResponse> body8 = response.body();
                                detailRTGSCNY detailrtgscny8 = body8.c;
                                if (detailrtgscny8 == null) {
                                    detailrtgscny8 = body8.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny8.e;
                                if (detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null) {
                                    String str5 = detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c;
                                } else {
                                    String str6 = detailrtgscny8.b;
                                }
                                iconCompatParcelizer3.v();
                                return;
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    List<DaftarTransferResponse.DaftarTransferOutput> list = arrayList;
                    if (response.body() != null) {
                        OpenAccountSuccessActivity<DaftarTransferResponse> body9 = response.body();
                        DaftarTransferResponse daftarTransferResponse2 = body9.d;
                        DaftarTransferResponse daftarTransferResponse3 = null;
                        if (daftarTransferResponse2 == null) {
                            daftarTransferResponse2 = body9.a;
                            if (daftarTransferResponse2 == null) {
                                daftarTransferResponse2 = null;
                            }
                        }
                        list = arrayList;
                        if (daftarTransferResponse2 != null) {
                            OpenAccountSuccessActivity<DaftarTransferResponse> body10 = response.body();
                            DaftarTransferResponse daftarTransferResponse4 = body10.d;
                            if (daftarTransferResponse4 == null) {
                                daftarTransferResponse4 = body10.a;
                                if (daftarTransferResponse4 == null) {
                                    daftarTransferResponse4 = null;
                                }
                            }
                            list = arrayList;
                            if (daftarTransferResponse4.getDaftarTransferOutputList() != null) {
                                OpenAccountSuccessActivity<DaftarTransferResponse> body11 = response.body();
                                daftarTransferResponse3 = body11.d;
                                if (daftarTransferResponse3 == null && (daftarTransferResponse = body11.a) != null) {
                                    daftarTransferResponse3 = daftarTransferResponse;
                                }
                                list = daftarTransferResponse3.getDaftarTransferOutputList();
                            }
                        }
                    }
                    DaftarTransferSetunFromUbahReservasiPresenter.this.e.a(list);
                    return;
                }
                IconCompatParcelizer iconCompatParcelizer4 = DaftarTransferSetunFromUbahReservasiPresenter.this.e;
                response.message();
                iconCompatParcelizer4.u();
            }
        });
    }
}
