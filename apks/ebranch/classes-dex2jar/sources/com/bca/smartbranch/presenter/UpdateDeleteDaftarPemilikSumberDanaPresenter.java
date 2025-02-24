package com.bca.smartbranch.presenter;

import android.util.Base64;
import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o.InfoProductActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onChooseMenueBranchEvent;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import o.subscribeReservationRescheduleEvent;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateDeleteDaftarPemilikSumberDanaPresenter.class */
public final class UpdateDeleteDaftarPemilikSumberDanaPresenter {
    public IconCompatParcelizer a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<Object>> b;
    private Call<OpenAccountSuccessActivity<Object>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateDeleteDaftarPemilikSumberDanaPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void p();

        void q();

        void t();
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateDeleteDaftarPemilikSumberDanaPresenter$read.class */
    public static final class read implements Callback<OpenAccountSuccessActivity<Object>> {
        public read() {
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
            IconCompatParcelizer iconCompatParcelizer;
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            Call call2 = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.b;
            boolean z = false;
            if (call2 != null) {
                z = false;
                if (!call2.isCanceled()) {
                    z = true;
                }
            }
            if (z && (iconCompatParcelizer = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a) != null) {
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

        public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(response, "");
            if (response.isSuccessful()) {
                OpenAccountSuccessActivity<Object> body = response.body();
                subscribeReservationRescheduleEvent.c(body);
                OpenAccountSuccessActivity<Object> openAccountSuccessActivity = body;
                detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                if (detailrtgscny == null) {
                    detailrtgscny = openAccountSuccessActivity.b;
                }
                if (detailrtgscny.e()) {
                    IconCompatParcelizer iconCompatParcelizer = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a;
                    if (iconCompatParcelizer != null) {
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        subscribeReservationRescheduleEvent.c(body2);
                        OpenAccountSuccessActivity<Object> openAccountSuccessActivity2 = body2;
                        detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = openAccountSuccessActivity2.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver != null) {
                            String str = detailrtgscny_mediabrowsercompat_customactionresultreceiver.c;
                        } else {
                            String str2 = detailrtgscny2.b;
                        }
                        iconCompatParcelizer.t();
                        return;
                    }
                    return;
                }
                OpenAccountSuccessActivity<Object> body3 = response.body();
                subscribeReservationRescheduleEvent.c(body3);
                OpenAccountSuccessActivity<Object> openAccountSuccessActivity3 = body3;
                detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity3.c;
                if (detailrtgscny3 == null) {
                    detailrtgscny3 = openAccountSuccessActivity3.b;
                }
                String str3 = detailrtgscny3.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str3 != null ? str3 : detailrtgscny3.c), (Object) "MID-00-898")) {
                    IconCompatParcelizer iconCompatParcelizer2 = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a;
                    if (iconCompatParcelizer2 != null) {
                        OpenAccountSuccessActivity<Object> body4 = response.body();
                        subscribeReservationRescheduleEvent.c(body4);
                        OpenAccountSuccessActivity<Object> openAccountSuccessActivity4 = body4;
                        detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity4.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = openAccountSuccessActivity4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                        iconCompatParcelizer2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                        return;
                    }
                    return;
                }
                OpenAccountSuccessActivity<Object> body5 = response.body();
                subscribeReservationRescheduleEvent.c(body5);
                OpenAccountSuccessActivity<Object> openAccountSuccessActivity5 = body5;
                detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity5.c;
                if (detailrtgscny5 == null) {
                    detailrtgscny5 = openAccountSuccessActivity5.b;
                }
                String str4 = detailrtgscny5.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str4 != null ? str4 : detailrtgscny5.c), (Object) "MID-00-899")) {
                    IconCompatParcelizer iconCompatParcelizer3 = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a;
                    if (iconCompatParcelizer3 != null) {
                        OpenAccountSuccessActivity<Object> body6 = response.body();
                        subscribeReservationRescheduleEvent.c(body6);
                        OpenAccountSuccessActivity<Object> openAccountSuccessActivity6 = body6;
                        detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity6.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = openAccountSuccessActivity6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        iconCompatParcelizer3.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    return;
                }
                IconCompatParcelizer iconCompatParcelizer4 = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a;
                if (iconCompatParcelizer4 != null) {
                    OpenAccountSuccessActivity<Object> body7 = response.body();
                    subscribeReservationRescheduleEvent.c(body7);
                    OpenAccountSuccessActivity<Object> openAccountSuccessActivity7 = body7;
                    detailRTGSCNY detailrtgscny7 = openAccountSuccessActivity7.c;
                    if (detailrtgscny7 == null) {
                        detailrtgscny7 = openAccountSuccessActivity7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny7.e;
                    iconCompatParcelizer4.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny7.b);
                    return;
                }
                return;
            }
            IconCompatParcelizer iconCompatParcelizer5 = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a;
            if (iconCompatParcelizer5 != null) {
                iconCompatParcelizer5.a(response.message());
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateDeleteDaftarPemilikSumberDanaPresenter$write.class */
    public static final class write implements Callback<OpenAccountSuccessActivity<Object>> {
        write() {
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
            IconCompatParcelizer iconCompatParcelizer;
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            Call call2 = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.e;
            boolean z = false;
            if (call2 != null) {
                z = false;
                if (!call2.isCanceled()) {
                    z = true;
                }
            }
            if (z && (iconCompatParcelizer = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a) != null) {
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

        public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(response, "");
            if (response.isSuccessful()) {
                OpenAccountSuccessActivity<Object> body = response.body();
                subscribeReservationRescheduleEvent.c(body);
                OpenAccountSuccessActivity<Object> openAccountSuccessActivity = body;
                detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                if (detailrtgscny == null) {
                    detailrtgscny = openAccountSuccessActivity.b;
                }
                if (detailrtgscny.e()) {
                    IconCompatParcelizer iconCompatParcelizer = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a;
                    if (iconCompatParcelizer != null) {
                        OpenAccountSuccessActivity<Object> body2 = response.body();
                        subscribeReservationRescheduleEvent.c(body2);
                        OpenAccountSuccessActivity<Object> openAccountSuccessActivity2 = body2;
                        detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = openAccountSuccessActivity2.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver != null) {
                            String str = detailrtgscny_mediabrowsercompat_customactionresultreceiver.c;
                        } else {
                            String str2 = detailrtgscny2.b;
                        }
                        iconCompatParcelizer.q();
                        return;
                    }
                    return;
                }
                OpenAccountSuccessActivity<Object> body3 = response.body();
                subscribeReservationRescheduleEvent.c(body3);
                OpenAccountSuccessActivity<Object> openAccountSuccessActivity3 = body3;
                detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity3.c;
                if (detailrtgscny3 == null) {
                    detailrtgscny3 = openAccountSuccessActivity3.b;
                }
                String str3 = detailrtgscny3.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str3 != null ? str3 : detailrtgscny3.c), (Object) "MID-00-898")) {
                    IconCompatParcelizer iconCompatParcelizer2 = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a;
                    if (iconCompatParcelizer2 != null) {
                        OpenAccountSuccessActivity<Object> body4 = response.body();
                        subscribeReservationRescheduleEvent.c(body4);
                        OpenAccountSuccessActivity<Object> openAccountSuccessActivity4 = body4;
                        detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity4.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = openAccountSuccessActivity4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny4.e;
                        iconCompatParcelizer2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny4.b);
                        return;
                    }
                    return;
                }
                OpenAccountSuccessActivity<Object> body5 = response.body();
                subscribeReservationRescheduleEvent.c(body5);
                OpenAccountSuccessActivity<Object> openAccountSuccessActivity5 = body5;
                detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity5.c;
                if (detailrtgscny5 == null) {
                    detailrtgscny5 = openAccountSuccessActivity5.b;
                }
                String str4 = detailrtgscny5.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str4 != null ? str4 : detailrtgscny5.c), (Object) "MID-00-899")) {
                    IconCompatParcelizer iconCompatParcelizer3 = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a;
                    if (iconCompatParcelizer3 != null) {
                        OpenAccountSuccessActivity<Object> body6 = response.body();
                        subscribeReservationRescheduleEvent.c(body6);
                        OpenAccountSuccessActivity<Object> openAccountSuccessActivity6 = body6;
                        detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity6.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = openAccountSuccessActivity6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        iconCompatParcelizer3.d(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    return;
                }
                IconCompatParcelizer iconCompatParcelizer4 = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a;
                if (iconCompatParcelizer4 != null) {
                    OpenAccountSuccessActivity<Object> body7 = response.body();
                    subscribeReservationRescheduleEvent.c(body7);
                    OpenAccountSuccessActivity<Object> openAccountSuccessActivity7 = body7;
                    detailRTGSCNY detailrtgscny7 = openAccountSuccessActivity7.c;
                    if (detailrtgscny7 == null) {
                        detailrtgscny7 = openAccountSuccessActivity7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny7.e;
                    iconCompatParcelizer4.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny7.b);
                    return;
                }
                return;
            }
            IconCompatParcelizer iconCompatParcelizer5 = UpdateDeleteDaftarPemilikSumberDanaPresenter.this.a;
            if (iconCompatParcelizer5 != null) {
                iconCompatParcelizer5.a(response.message());
            }
        }
    }

    public UpdateDeleteDaftarPemilikSumberDanaPresenter() {
        App.d().a(this);
    }

    public final void a(InfoProductActivity_ViewBinding infoProductActivity_ViewBinding, onChooseMenueBranchEvent onchoosemenuebranchevent) {
        IconCompatParcelizer iconCompatParcelizer = this.a;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.p();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", infoProductActivity_ViewBinding.d);
            jSONObject.put("SessionId", infoProductActivity_ViewBinding.c);
            jSONObject.put("IMEI", infoProductActivity_ViewBinding.e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        subscribeReservationRescheduleEvent.d(jSONObject2, "");
        Charset charset = StandardCharsets.UTF_8;
        subscribeReservationRescheduleEvent.d(charset, "");
        byte[] bytes = jSONObject2.getBytes(charset);
        subscribeReservationRescheduleEvent.d(bytes, "");
        byte[] encode = Base64.encode(bytes, 2);
        subscribeReservationRescheduleEvent.d(encode, "");
        Charset charset2 = StandardCharsets.UTF_8;
        subscribeReservationRescheduleEvent.d(charset2, "");
        String obj = new StringBuilder(new String(encode, charset2)).reverse().toString();
        subscribeReservationRescheduleEvent.d(obj, "");
        setIncomeDisplayAmount setincomedisplayamount = this.apiService;
        if (setincomedisplayamount == null) {
            subscribeReservationRescheduleEvent.e("");
            setincomedisplayamount = null;
        }
        Call<OpenAccountSuccessActivity<Object>> a = setincomedisplayamount.a(obj, onchoosemenuebranchevent);
        this.e = a;
        if (a != null) {
            a.enqueue((Callback) new write());
        }
    }

    public final void c() {
        Call<OpenAccountSuccessActivity<Object>> call = this.e;
        if (call != null) {
            call.cancel();
        }
        Call<OpenAccountSuccessActivity<Object>> call2 = this.b;
        if (call2 != null) {
            call2.cancel();
        }
        this.a = null;
    }
}
