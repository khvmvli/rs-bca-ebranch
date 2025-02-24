package com.bca.smartbranch.presenter;

import android.util.Base64;
import com.bca.smartbranch.App;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.presenter.BankListPresenter;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o.OpenAccountActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.getPromotion;
import o.onClickMenu;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import o.subscribeReservationRescheduleEvent;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/BankListPresenter.class */
public final class BankListPresenter {
    private Call<OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    private Call<OpenAccountSuccessActivity<onClickMenu>> c;
    public IconCompatParcelizer d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/BankListPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a_(String str);

        void b(String str);

        void b_(String str);

        <T> void d(T t);

        void g_();

        void n(String str);

        void u(String str);
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/BankListPresenter$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements Callback<OpenAccountSuccessActivity<onClickMenu>> {
        RemoteActionCompatParcelizer() {
            BankListPresenter.this = r4;
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<onClickMenu>> call, Throwable th) {
            IconCompatParcelizer iconCompatParcelizer;
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            Call call2 = BankListPresenter.this.c;
            boolean z = false;
            if (call2 != null) {
                z = false;
                if (!call2.isCanceled()) {
                    z = true;
                }
            }
            if (z && (iconCompatParcelizer = BankListPresenter.this.d) != null) {
                if (th != null) {
                    if (th instanceof UnknownHostException) {
                        str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                    } else if (th instanceof SocketTimeoutException) {
                        str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                    }
                    iconCompatParcelizer.a_(str);
                }
                str = "Oops! Terjadi kesalahan.";
                iconCompatParcelizer.a_(str);
            }
        }

        public final void onResponse(Call<OpenAccountSuccessActivity<onClickMenu>> call, Response<OpenAccountSuccessActivity<onClickMenu>> response) {
            onClickMenu onclickmenu;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(response, "");
            if (response.isSuccessful()) {
                OpenAccountSuccessActivity<onClickMenu> body = response.body();
                subscribeReservationRescheduleEvent.c(body);
                OpenAccountSuccessActivity<onClickMenu> openAccountSuccessActivity = body;
                detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                if (detailrtgscny == null) {
                    detailrtgscny = openAccountSuccessActivity.b;
                }
                if (detailrtgscny.e()) {
                    IconCompatParcelizer iconCompatParcelizer = BankListPresenter.this.d;
                    if (iconCompatParcelizer != null) {
                        OpenAccountSuccessActivity<onClickMenu> body2 = response.body();
                        onClickMenu onclickmenu2 = null;
                        onClickMenu onclickmenu3 = null;
                        if (body2 != null) {
                            onclickmenu3 = body2.d;
                            if (onclickmenu3 == null && (onclickmenu = body2.a) != null) {
                                onclickmenu3 = onclickmenu;
                            }
                            onclickmenu2 = onclickmenu3;
                        }
                        iconCompatParcelizer.d(onclickmenu2);
                        return;
                    }
                    return;
                }
                OpenAccountSuccessActivity<onClickMenu> body3 = response.body();
                subscribeReservationRescheduleEvent.c(body3);
                OpenAccountSuccessActivity<onClickMenu> openAccountSuccessActivity2 = body3;
                detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity2.c;
                if (detailrtgscny2 == null) {
                    detailrtgscny2 = openAccountSuccessActivity2.b;
                }
                String str = detailrtgscny2.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str != null ? str : detailrtgscny2.c), (Object) "MID-00-898")) {
                    IconCompatParcelizer iconCompatParcelizer2 = BankListPresenter.this.d;
                    if (iconCompatParcelizer2 != null) {
                        OpenAccountSuccessActivity<onClickMenu> body4 = response.body();
                        subscribeReservationRescheduleEvent.c(body4);
                        OpenAccountSuccessActivity<onClickMenu> openAccountSuccessActivity3 = body4;
                        detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity3.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = openAccountSuccessActivity3.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        iconCompatParcelizer2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    return;
                }
                OpenAccountSuccessActivity<onClickMenu> body5 = response.body();
                subscribeReservationRescheduleEvent.c(body5);
                OpenAccountSuccessActivity<onClickMenu> openAccountSuccessActivity4 = body5;
                detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity4.c;
                if (detailrtgscny4 == null) {
                    detailrtgscny4 = openAccountSuccessActivity4.b;
                }
                String str2 = detailrtgscny4.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str2 != null ? str2 : detailrtgscny4.c), (Object) "MID-00-899")) {
                    IconCompatParcelizer iconCompatParcelizer3 = BankListPresenter.this.d;
                    if (iconCompatParcelizer3 != null) {
                        OpenAccountSuccessActivity<onClickMenu> body6 = response.body();
                        subscribeReservationRescheduleEvent.c(body6);
                        OpenAccountSuccessActivity<onClickMenu> openAccountSuccessActivity5 = body6;
                        detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity5.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = openAccountSuccessActivity5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        iconCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    return;
                }
                IconCompatParcelizer iconCompatParcelizer4 = BankListPresenter.this.d;
                if (iconCompatParcelizer4 != null) {
                    OpenAccountSuccessActivity<onClickMenu> body7 = response.body();
                    subscribeReservationRescheduleEvent.c(body7);
                    OpenAccountSuccessActivity<onClickMenu> openAccountSuccessActivity6 = body7;
                    detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity6.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = openAccountSuccessActivity6.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    iconCompatParcelizer4.n(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                return;
            }
            IconCompatParcelizer iconCompatParcelizer5 = BankListPresenter.this.d;
            if (iconCompatParcelizer5 != null) {
                iconCompatParcelizer5.u(response.message());
            }
        }
    }

    public BankListPresenter() {
        App.d().a(this);
    }

    public final void b() {
        Call<OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding>> call = this.a;
        if (call != null) {
            call.cancel();
        }
        Call<OpenAccountSuccessActivity<onClickMenu>> call2 = this.c;
        if (call2 != null) {
            call2.cancel();
        }
        this.d = null;
    }

    public final void d(User user) {
        subscribeReservationRescheduleEvent.e(user, "");
        IconCompatParcelizer iconCompatParcelizer = this.d;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.g_();
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
        Call<OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding>> d = setincomedisplayamount.d(obj);
        this.a = d;
        if (d != null) {
            d.enqueue((Callback) new Callback<OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding>>() { // from class: com.bca.smartbranch.presenter.BankListPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void onFailure(Call<OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding>> call, Throwable th) {
                    BankListPresenter.IconCompatParcelizer iconCompatParcelizer2;
                    String str;
                    subscribeReservationRescheduleEvent.e(call, "");
                    subscribeReservationRescheduleEvent.e(th, "");
                    Call call2 = BankListPresenter.this.a;
                    boolean z = false;
                    if (call2 != null) {
                        z = false;
                        if (!call2.isCanceled()) {
                            z = true;
                        }
                    }
                    if (z && (iconCompatParcelizer2 = BankListPresenter.this.d) != null) {
                        if (th != null) {
                            if (th instanceof UnknownHostException) {
                                str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                            } else if (th instanceof SocketTimeoutException) {
                                str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                            }
                            iconCompatParcelizer2.a_(str);
                        }
                        str = "Oops! Terjadi kesalahan.";
                        iconCompatParcelizer2.a_(str);
                    }
                }

                public final void onResponse(Call<OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding>> call, Response<OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding>> response) {
                    subscribeReservationRescheduleEvent.e(call, "");
                    subscribeReservationRescheduleEvent.e(response, "");
                    if (response.isSuccessful()) {
                        OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> body = response.body();
                        subscribeReservationRescheduleEvent.c(body);
                        OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> openAccountSuccessActivity = body;
                        detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                        if (detailrtgscny == null) {
                            detailrtgscny = openAccountSuccessActivity.b;
                        }
                        if (detailrtgscny.e()) {
                            BankListPresenter.IconCompatParcelizer iconCompatParcelizer2 = BankListPresenter.this.d;
                            if (iconCompatParcelizer2 != null) {
                                OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> body2 = response.body();
                                subscribeReservationRescheduleEvent.c(body2);
                                OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> openAccountSuccessActivity2 = body2;
                                OpenAccountActivity_ViewBinding openAccountActivity_ViewBinding = openAccountSuccessActivity2.d;
                                if (openAccountActivity_ViewBinding == null) {
                                    openAccountActivity_ViewBinding = openAccountSuccessActivity2.a;
                                    if (openAccountActivity_ViewBinding == null) {
                                        openAccountActivity_ViewBinding = null;
                                    }
                                }
                                iconCompatParcelizer2.d(openAccountActivity_ViewBinding);
                                return;
                            }
                            return;
                        }
                        OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> body3 = response.body();
                        subscribeReservationRescheduleEvent.c(body3);
                        OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> openAccountSuccessActivity3 = body3;
                        detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity3.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = openAccountSuccessActivity3.b;
                        }
                        String str = detailrtgscny2.a;
                        if (subscribeReservationRescheduleEvent.b((Object) (str != null ? str : detailrtgscny2.c), (Object) "MID-00-898")) {
                            BankListPresenter.IconCompatParcelizer iconCompatParcelizer3 = BankListPresenter.this.d;
                            if (iconCompatParcelizer3 != null) {
                                OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> body4 = response.body();
                                subscribeReservationRescheduleEvent.c(body4);
                                OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> openAccountSuccessActivity4 = body4;
                                detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity4.c;
                                if (detailrtgscny3 == null) {
                                    detailrtgscny3 = openAccountSuccessActivity4.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                                iconCompatParcelizer3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                                return;
                            }
                            return;
                        }
                        OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> body5 = response.body();
                        subscribeReservationRescheduleEvent.c(body5);
                        OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> openAccountSuccessActivity5 = body5;
                        detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity5.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = openAccountSuccessActivity5.b;
                        }
                        String str2 = detailrtgscny4.a;
                        if (subscribeReservationRescheduleEvent.b((Object) (str2 != null ? str2 : detailrtgscny4.c), (Object) "MID-00-899")) {
                            BankListPresenter.IconCompatParcelizer iconCompatParcelizer4 = BankListPresenter.this.d;
                            if (iconCompatParcelizer4 != null) {
                                OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> body6 = response.body();
                                subscribeReservationRescheduleEvent.c(body6);
                                OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> openAccountSuccessActivity6 = body6;
                                detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity6.c;
                                if (detailrtgscny5 == null) {
                                    detailrtgscny5 = openAccountSuccessActivity6.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                                iconCompatParcelizer4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                                return;
                            }
                            return;
                        }
                        BankListPresenter.IconCompatParcelizer iconCompatParcelizer5 = BankListPresenter.this.d;
                        if (iconCompatParcelizer5 != null) {
                            OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> body7 = response.body();
                            subscribeReservationRescheduleEvent.c(body7);
                            OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding> openAccountSuccessActivity7 = body7;
                            detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity7.c;
                            if (detailrtgscny6 == null) {
                                detailrtgscny6 = openAccountSuccessActivity7.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                            iconCompatParcelizer5.n(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                            return;
                        }
                        return;
                    }
                    BankListPresenter.IconCompatParcelizer iconCompatParcelizer6 = BankListPresenter.this.d;
                    if (iconCompatParcelizer6 != null) {
                        iconCompatParcelizer6.u(response.message());
                    }
                }
            });
        }
    }

    public final void e(User user) {
        subscribeReservationRescheduleEvent.e(user, "");
        IconCompatParcelizer iconCompatParcelizer = this.d;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.g_();
        }
        String e = getPromotion.e(user);
        setIncomeDisplayAmount setincomedisplayamount = this.apiService;
        if (setincomedisplayamount == null) {
            subscribeReservationRescheduleEvent.e("");
            setincomedisplayamount = null;
        }
        Call<OpenAccountSuccessActivity<onClickMenu>> d = setincomedisplayamount.d(e, "LLG");
        this.c = d;
        if (d != null) {
            d.enqueue((Callback) new RemoteActionCompatParcelizer());
        }
    }
}
