package com.bca.smartbranch.presenter;

import android.util.Base64;
import com.bca.smartbranch.App;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.presenter.AdminFeesPresenter;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickDetail;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import o.subscribeReservationRescheduleEvent;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/AdminFeesPresenter.class */
public final class AdminFeesPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read c;
    public Call<OpenAccountSuccessActivity<onClickDetail>> d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/AdminFeesPresenter$read.class */
    public interface read {
        void b();

        @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        void b(String str);

        @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        void b_(String str);

        void d(onClickDetail onclickdetail);

        void f(String str);

        void g(String str);

        void i(String str);
    }

    public AdminFeesPresenter() {
        App.d().b(this);
    }

    public final void b(User user) {
        subscribeReservationRescheduleEvent.e(user, "");
        read read2 = this.c;
        if (read2 != null) {
            read2.b();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", user.getEmail());
            jSONObject.put("SessionId", user.getSessionId());
            jSONObject.put("IMEI", user.getImei());
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
        Call<OpenAccountSuccessActivity<onClickDetail>> a = setincomedisplayamount.a(obj);
        this.d = a;
        if (a != null) {
            a.enqueue((Callback) new Callback<OpenAccountSuccessActivity<onClickDetail>>() { // from class: com.bca.smartbranch.presenter.AdminFeesPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void onFailure(Call<OpenAccountSuccessActivity<onClickDetail>> call, Throwable th) {
                    AdminFeesPresenter.read read3;
                    String str;
                    subscribeReservationRescheduleEvent.e(call, "");
                    subscribeReservationRescheduleEvent.e(th, "");
                    Call call2 = AdminFeesPresenter.this.d;
                    boolean z = false;
                    if (call2 != null) {
                        z = false;
                        if (!call2.isCanceled()) {
                            z = true;
                        }
                    }
                    if (z && (read3 = AdminFeesPresenter.this.c) != null) {
                        if (th != null) {
                            if (th instanceof UnknownHostException) {
                                str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                            } else if (th instanceof SocketTimeoutException) {
                                str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                            }
                            read3.f(str);
                        }
                        str = "Oops! Terjadi kesalahan.";
                        read3.f(str);
                    }
                }

                public final void onResponse(Call<OpenAccountSuccessActivity<onClickDetail>> call, Response<OpenAccountSuccessActivity<onClickDetail>> response) {
                    subscribeReservationRescheduleEvent.e(call, "");
                    subscribeReservationRescheduleEvent.e(response, "");
                    if (response.isSuccessful()) {
                        OpenAccountSuccessActivity<onClickDetail> body = response.body();
                        subscribeReservationRescheduleEvent.c(body);
                        OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity = body;
                        detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                        if (detailrtgscny == null) {
                            detailrtgscny = openAccountSuccessActivity.b;
                        }
                        if (detailrtgscny.e()) {
                            AdminFeesPresenter.read read3 = AdminFeesPresenter.this.c;
                            if (read3 != null) {
                                OpenAccountSuccessActivity<onClickDetail> body2 = response.body();
                                subscribeReservationRescheduleEvent.c(body2);
                                OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity2 = body2;
                                onClickDetail onclickdetail = openAccountSuccessActivity2.d;
                                if (onclickdetail == null) {
                                    onclickdetail = openAccountSuccessActivity2.a;
                                    if (onclickdetail == null) {
                                        onclickdetail = null;
                                    }
                                }
                                read3.d(onclickdetail);
                                return;
                            }
                            return;
                        }
                        OpenAccountSuccessActivity<onClickDetail> body3 = response.body();
                        subscribeReservationRescheduleEvent.c(body3);
                        OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity3 = body3;
                        detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity3.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = openAccountSuccessActivity3.b;
                        }
                        String str = detailrtgscny2.a;
                        if (subscribeReservationRescheduleEvent.b((Object) (str != null ? str : detailrtgscny2.c), (Object) "MID-00-898")) {
                            AdminFeesPresenter.read read4 = AdminFeesPresenter.this.c;
                            if (read4 != null) {
                                OpenAccountSuccessActivity<onClickDetail> body4 = response.body();
                                subscribeReservationRescheduleEvent.c(body4);
                                OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity4 = body4;
                                detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity4.c;
                                if (detailrtgscny3 == null) {
                                    detailrtgscny3 = openAccountSuccessActivity4.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                                read4.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                                return;
                            }
                            return;
                        }
                        OpenAccountSuccessActivity<onClickDetail> body5 = response.body();
                        subscribeReservationRescheduleEvent.c(body5);
                        OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity5 = body5;
                        detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity5.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = openAccountSuccessActivity5.b;
                        }
                        String str2 = detailrtgscny4.a;
                        if (subscribeReservationRescheduleEvent.b((Object) (str2 != null ? str2 : detailrtgscny4.c), (Object) "MID-00-899")) {
                            AdminFeesPresenter.read read5 = AdminFeesPresenter.this.c;
                            if (read5 != null) {
                                OpenAccountSuccessActivity<onClickDetail> body6 = response.body();
                                subscribeReservationRescheduleEvent.c(body6);
                                OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity6 = body6;
                                detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity6.c;
                                if (detailrtgscny5 == null) {
                                    detailrtgscny5 = openAccountSuccessActivity6.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                                read5.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                                return;
                            }
                            return;
                        }
                        AdminFeesPresenter.read read6 = AdminFeesPresenter.this.c;
                        if (read6 != null) {
                            OpenAccountSuccessActivity<onClickDetail> body7 = response.body();
                            subscribeReservationRescheduleEvent.c(body7);
                            OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity7 = body7;
                            detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity7.c;
                            if (detailrtgscny6 == null) {
                                detailrtgscny6 = openAccountSuccessActivity7.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                            read6.i(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                            return;
                        }
                        return;
                    }
                    AdminFeesPresenter.read read7 = AdminFeesPresenter.this.c;
                    if (read7 != null) {
                        read7.g(response.message());
                    }
                }
            });
        }
    }
}
