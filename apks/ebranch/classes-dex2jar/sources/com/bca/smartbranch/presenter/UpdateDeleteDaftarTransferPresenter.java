package com.bca.smartbranch.presenter;

import android.util.Base64;
import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import o.InfoBankingtActivity;
import o.InfoProductActivity;
import o.MainActivity;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateDeleteDaftarTransferPresenter.class */
public class UpdateDeleteDaftarTransferPresenter {
    public write a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    private Call<OpenAccountSuccessActivity<Object>> b;
    private Call<OpenAccountSuccessActivity<Object>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateDeleteDaftarTransferPresenter$write.class */
    public interface write {
        void b(String str);

        void b_(String str);

        void c(String str);

        void d(String str);

        void l_(String str);

        void t();

        void u();

        void v();
    }

    public UpdateDeleteDaftarTransferPresenter() {
        App.d().b(this);
    }

    public final void b(InfoProductActivity infoProductActivity, InfoBankingtActivity infoBankingtActivity) {
        this.a.u();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", infoProductActivity.b);
            jSONObject.put("SessionId", infoProductActivity.a);
            jSONObject.put("IMEI", infoProductActivity.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Call<OpenAccountSuccessActivity<Object>> b = this.apiService.b(new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString(), infoProductActivity.e, infoBankingtActivity);
        this.e = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (UpdateDeleteDaftarTransferPresenter.this.e != null && !UpdateDeleteDaftarTransferPresenter.this.e.isCanceled()) {
                    write write2 = UpdateDeleteDaftarTransferPresenter.this.a;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        write2.l_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    write2.l_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<Object> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = UpdateDeleteDaftarTransferPresenter.this.a;
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        detailRTGSCNY detailrtgscny2 = body2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body2.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver != null) {
                            String str = detailrtgscny_mediabrowsercompat_customactionresultreceiver.c;
                        } else {
                            String str2 = detailrtgscny2.b;
                        }
                        write2.t();
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body3 = response.body();
                    detailRTGSCNY detailrtgscny3 = body3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body3.b;
                    }
                    String str3 = detailrtgscny3.a;
                    if ((str3 != null ? str3 : detailrtgscny3.c).equals("MID-00-898")) {
                        write write3 = UpdateDeleteDaftarTransferPresenter.this.a;
                        OpenAccountSuccessActivity<Object> body4 = response.body();
                        detailRTGSCNY detailrtgscny4 = body4.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                        write3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body5 = response.body();
                    detailRTGSCNY detailrtgscny5 = body5.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = body5.b;
                    }
                    String str4 = detailrtgscny5.a;
                    if ((str4 != null ? str4 : detailrtgscny5.c).equals("MID-00-899")) {
                        write write4 = UpdateDeleteDaftarTransferPresenter.this.a;
                        OpenAccountSuccessActivity<Object> body6 = response.body();
                        detailRTGSCNY detailrtgscny6 = body6.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        write4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    write write5 = UpdateDeleteDaftarTransferPresenter.this.a;
                    OpenAccountSuccessActivity<Object> body7 = response.body();
                    detailRTGSCNY detailrtgscny7 = body7.c;
                    if (detailrtgscny7 == null) {
                        detailrtgscny7 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny7.e;
                    write5.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny7.b);
                    return;
                }
                UpdateDeleteDaftarTransferPresenter.this.a.c(response.message());
            }
        });
    }

    public final void c() {
        Call<OpenAccountSuccessActivity<Object>> call = this.b;
        if (call != null) {
            call.cancel();
        }
        Call<OpenAccountSuccessActivity<Object>> call2 = this.e;
        if (call2 != null) {
            call2.cancel();
        }
        this.a = null;
    }

    public final void e(InfoProductActivity infoProductActivity, MainActivity mainActivity) {
        this.a.u();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", infoProductActivity.b);
            jSONObject.put("SessionId", infoProductActivity.a);
            jSONObject.put("IMEI", infoProductActivity.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Call<OpenAccountSuccessActivity<Object>> e2 = this.apiService.e(new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString(), infoProductActivity.e, mainActivity);
        this.b = e2;
        e2.enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                String str;
                if (UpdateDeleteDaftarTransferPresenter.this.b != null && !UpdateDeleteDaftarTransferPresenter.this.b.isCanceled()) {
                    write write2 = UpdateDeleteDaftarTransferPresenter.this.a;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        write2.l_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    write2.l_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<Object> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        write write2 = UpdateDeleteDaftarTransferPresenter.this.a;
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        detailRTGSCNY detailrtgscny2 = body2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body2.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver != null) {
                            String str = detailrtgscny_mediabrowsercompat_customactionresultreceiver.c;
                        } else {
                            String str2 = detailrtgscny2.b;
                        }
                        write2.v();
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body3 = response.body();
                    detailRTGSCNY detailrtgscny3 = body3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = body3.b;
                    }
                    String str3 = detailrtgscny3.a;
                    if ((str3 != null ? str3 : detailrtgscny3.c).equals("MID-00-898")) {
                        write write3 = UpdateDeleteDaftarTransferPresenter.this.a;
                        OpenAccountSuccessActivity<Object> body4 = response.body();
                        detailRTGSCNY detailrtgscny4 = body4.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                        write3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                        return;
                    }
                    OpenAccountSuccessActivity<Object> body5 = response.body();
                    detailRTGSCNY detailrtgscny5 = body5.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = body5.b;
                    }
                    String str4 = detailrtgscny5.a;
                    if ((str4 != null ? str4 : detailrtgscny5.c).equals("MID-00-899")) {
                        write write4 = UpdateDeleteDaftarTransferPresenter.this.a;
                        OpenAccountSuccessActivity<Object> body6 = response.body();
                        detailRTGSCNY detailrtgscny6 = body6.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        write4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    write write5 = UpdateDeleteDaftarTransferPresenter.this.a;
                    OpenAccountSuccessActivity<Object> body7 = response.body();
                    detailRTGSCNY detailrtgscny7 = body7.c;
                    if (detailrtgscny7 == null) {
                        detailrtgscny7 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny7.e;
                    write5.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny7.b);
                    return;
                }
                UpdateDeleteDaftarTransferPresenter.this.a.c(response.message());
            }
        });
    }
}
