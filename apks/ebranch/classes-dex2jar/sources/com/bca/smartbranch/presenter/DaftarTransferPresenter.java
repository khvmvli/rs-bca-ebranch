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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DaftarTransferPresenter.class */
public class DaftarTransferPresenter {
    public Call<OpenAccountSuccessActivity<DaftarTransferResponse>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RemoteActionCompatParcelizer c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DaftarTransferPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void b(String str);

        void b_(String str);

        void e(String str);

        void e(List<DaftarTransferResponse.DaftarTransferOutput> list);

        void e_(String str);

        void g_(String str);

        void s();
    }

    public DaftarTransferPresenter() {
        App.d().a(this);
    }

    public final void d(InfoProductActivity infoProductActivity, boolean z) {
        if (z) {
            this.c.s();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", infoProductActivity.b);
            jSONObject.put("SessionId", infoProductActivity.a);
            jSONObject.put("IMEI", infoProductActivity.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> n = this.apiService.n(new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString(), infoProductActivity.e);
        this.a = n;
        n.enqueue(new Callback<OpenAccountSuccessActivity<DaftarTransferResponse>>() { // from class: com.bca.smartbranch.presenter.DaftarTransferPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call, Throwable th) {
                String str;
                if (DaftarTransferPresenter.this.a != null && !DaftarTransferPresenter.this.a.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = DaftarTransferPresenter.this.c;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        remoteActionCompatParcelizer.g_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    remoteActionCompatParcelizer.g_(str);
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
                                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = DaftarTransferPresenter.this.c;
                                    OpenAccountSuccessActivity<DaftarTransferResponse> body5 = response.body();
                                    detailRTGSCNY detailrtgscny5 = body5.c;
                                    if (detailrtgscny5 == null) {
                                        detailrtgscny5 = body5.b;
                                    }
                                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny5.e;
                                    remoteActionCompatParcelizer.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny5.b);
                                    return;
                                }
                                OpenAccountSuccessActivity<DaftarTransferResponse> body6 = response.body();
                                detailRTGSCNY detailrtgscny6 = body6.c;
                                if (detailrtgscny6 == null) {
                                    detailrtgscny6 = body6.b;
                                }
                                String str4 = detailrtgscny6.a;
                                if ((str4 != null ? str4 : detailrtgscny6.c).equals("MID-00-899")) {
                                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = DaftarTransferPresenter.this.c;
                                    OpenAccountSuccessActivity<DaftarTransferResponse> body7 = response.body();
                                    detailRTGSCNY detailrtgscny7 = body7.c;
                                    if (detailrtgscny7 == null) {
                                        detailrtgscny7 = body7.b;
                                    }
                                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny7.e;
                                    remoteActionCompatParcelizer2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny7.b);
                                    return;
                                }
                                RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = DaftarTransferPresenter.this.c;
                                OpenAccountSuccessActivity<DaftarTransferResponse> body8 = response.body();
                                detailRTGSCNY detailrtgscny8 = body8.c;
                                if (detailrtgscny8 == null) {
                                    detailrtgscny8 = body8.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny8.e;
                                remoteActionCompatParcelizer3.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny8.b);
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
                    DaftarTransferPresenter.this.c.e(list);
                    return;
                }
                DaftarTransferPresenter.this.c.e_(response.message());
            }
        });
    }
}
