package com.bca.smartbranch.presenter;

import android.util.Base64;
import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import o.InfoProductActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.detailBCAFullPayment;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import o.subscribeReservationRescheduleEvent;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DaftarPemilikSumberDanaPresenter.class */
public final class DaftarPemilikSumberDanaPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read d;
    public Call<OpenAccountSuccessActivity<detailBCAFullPayment>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DaftarPemilikSumberDanaPresenter$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Callback<OpenAccountSuccessActivity<detailBCAFullPayment>> {
        IconCompatParcelizer() {
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<detailBCAFullPayment>> call, Throwable th) {
            read read;
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            Call call2 = DaftarPemilikSumberDanaPresenter.this.e;
            boolean z = false;
            if (call2 != null) {
                z = false;
                if (!call2.isCanceled()) {
                    z = true;
                }
            }
            if (z && (read = DaftarPemilikSumberDanaPresenter.this.d) != null) {
                if (th != null) {
                    if (th instanceof UnknownHostException) {
                        str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                    } else if (th instanceof SocketTimeoutException) {
                        str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                    }
                    read.a(str);
                }
                str = "Oops! Terjadi kesalahan.";
                read.a(str);
            }
        }

        public final void onResponse(Call<OpenAccountSuccessActivity<detailBCAFullPayment>> call, Response<OpenAccountSuccessActivity<detailBCAFullPayment>> response) {
            detailBCAFullPayment detailbcafullpayment;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(response, "");
            if (response.isSuccessful()) {
                OpenAccountSuccessActivity<detailBCAFullPayment> body = response.body();
                subscribeReservationRescheduleEvent.c(body);
                OpenAccountSuccessActivity<detailBCAFullPayment> openAccountSuccessActivity = body;
                detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                if (detailrtgscny == null) {
                    detailrtgscny = openAccountSuccessActivity.b;
                }
                if (!detailrtgscny.e()) {
                    OpenAccountSuccessActivity<detailBCAFullPayment> body2 = response.body();
                    subscribeReservationRescheduleEvent.c(body2);
                    OpenAccountSuccessActivity<detailBCAFullPayment> openAccountSuccessActivity2 = body2;
                    detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity2.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = openAccountSuccessActivity2.b;
                    }
                    String str = detailrtgscny2.a;
                    if (!subscribeReservationRescheduleEvent.b((Object) (str != null ? str : detailrtgscny2.c), (Object) "MID-09-111")) {
                        OpenAccountSuccessActivity<detailBCAFullPayment> body3 = response.body();
                        subscribeReservationRescheduleEvent.c(body3);
                        OpenAccountSuccessActivity<detailBCAFullPayment> openAccountSuccessActivity3 = body3;
                        detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity3.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = openAccountSuccessActivity3.b;
                        }
                        String str2 = detailrtgscny3.a;
                        if (!subscribeReservationRescheduleEvent.b((Object) (str2 != null ? str2 : detailrtgscny3.c), (Object) "EBR-2-318")) {
                            OpenAccountSuccessActivity<detailBCAFullPayment> body4 = response.body();
                            subscribeReservationRescheduleEvent.c(body4);
                            OpenAccountSuccessActivity<detailBCAFullPayment> openAccountSuccessActivity4 = body4;
                            detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity4.c;
                            if (detailrtgscny4 == null) {
                                detailrtgscny4 = openAccountSuccessActivity4.b;
                            }
                            String str3 = detailrtgscny4.a;
                            if (subscribeReservationRescheduleEvent.b((Object) (str3 != null ? str3 : detailrtgscny4.c), (Object) "MID-00-898")) {
                                read read = DaftarPemilikSumberDanaPresenter.this.d;
                                if (read != null) {
                                    OpenAccountSuccessActivity<detailBCAFullPayment> body5 = response.body();
                                    subscribeReservationRescheduleEvent.c(body5);
                                    OpenAccountSuccessActivity<detailBCAFullPayment> openAccountSuccessActivity5 = body5;
                                    detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity5.c;
                                    if (detailrtgscny5 == null) {
                                        detailrtgscny5 = openAccountSuccessActivity5.b;
                                    }
                                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny5.e;
                                    read.e(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny5.b);
                                    return;
                                }
                                return;
                            }
                            OpenAccountSuccessActivity<detailBCAFullPayment> body6 = response.body();
                            subscribeReservationRescheduleEvent.c(body6);
                            OpenAccountSuccessActivity<detailBCAFullPayment> openAccountSuccessActivity6 = body6;
                            detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity6.c;
                            if (detailrtgscny6 == null) {
                                detailrtgscny6 = openAccountSuccessActivity6.b;
                            }
                            String str4 = detailrtgscny6.a;
                            if (subscribeReservationRescheduleEvent.b((Object) (str4 != null ? str4 : detailrtgscny6.c), (Object) "MID-00-899")) {
                                read read2 = DaftarPemilikSumberDanaPresenter.this.d;
                                if (read2 != null) {
                                    OpenAccountSuccessActivity<detailBCAFullPayment> body7 = response.body();
                                    subscribeReservationRescheduleEvent.c(body7);
                                    OpenAccountSuccessActivity<detailBCAFullPayment> openAccountSuccessActivity7 = body7;
                                    detailRTGSCNY detailrtgscny7 = openAccountSuccessActivity7.c;
                                    if (detailrtgscny7 == null) {
                                        detailrtgscny7 = openAccountSuccessActivity7.b;
                                    }
                                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny7.e;
                                    read2.c(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny7.b);
                                    return;
                                }
                                return;
                            }
                            read read3 = DaftarPemilikSumberDanaPresenter.this.d;
                            if (read3 != null) {
                                OpenAccountSuccessActivity<detailBCAFullPayment> body8 = response.body();
                                subscribeReservationRescheduleEvent.c(body8);
                                OpenAccountSuccessActivity<detailBCAFullPayment> openAccountSuccessActivity8 = body8;
                                detailRTGSCNY detailrtgscny8 = openAccountSuccessActivity8.c;
                                if (detailrtgscny8 == null) {
                                    detailrtgscny8 = openAccountSuccessActivity8.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny8.e;
                                read3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny8.b);
                                return;
                            }
                            return;
                        }
                    }
                }
                ArrayList<detailBCAFullPayment.read> arrayList = new ArrayList<>();
                ArrayList<detailBCAFullPayment.read> arrayList2 = arrayList;
                if (response.body() != null) {
                    OpenAccountSuccessActivity<detailBCAFullPayment> body9 = response.body();
                    subscribeReservationRescheduleEvent.c(body9);
                    OpenAccountSuccessActivity<detailBCAFullPayment> openAccountSuccessActivity9 = body9;
                    detailBCAFullPayment detailbcafullpayment2 = openAccountSuccessActivity9.d;
                    detailBCAFullPayment detailbcafullpayment3 = null;
                    if (detailbcafullpayment2 == null) {
                        detailbcafullpayment2 = openAccountSuccessActivity9.a;
                        if (detailbcafullpayment2 == null) {
                            detailbcafullpayment2 = null;
                        }
                    }
                    arrayList2 = arrayList;
                    if (detailbcafullpayment2 != null) {
                        OpenAccountSuccessActivity<detailBCAFullPayment> body10 = response.body();
                        subscribeReservationRescheduleEvent.c(body10);
                        OpenAccountSuccessActivity<detailBCAFullPayment> openAccountSuccessActivity10 = body10;
                        detailBCAFullPayment detailbcafullpayment4 = openAccountSuccessActivity10.d;
                        if (detailbcafullpayment4 == null) {
                            detailbcafullpayment4 = openAccountSuccessActivity10.a;
                            if (detailbcafullpayment4 == null) {
                                detailbcafullpayment4 = null;
                            }
                        }
                        arrayList2 = arrayList;
                        if (detailbcafullpayment4.d != null) {
                            OpenAccountSuccessActivity<detailBCAFullPayment> body11 = response.body();
                            subscribeReservationRescheduleEvent.c(body11);
                            OpenAccountSuccessActivity<detailBCAFullPayment> openAccountSuccessActivity11 = body11;
                            detailbcafullpayment3 = openAccountSuccessActivity11.d;
                            if (detailbcafullpayment3 == null && (detailbcafullpayment = openAccountSuccessActivity11.a) != null) {
                                detailbcafullpayment3 = detailbcafullpayment;
                            }
                            arrayList2 = detailbcafullpayment3.d;
                        }
                    }
                }
                read read4 = DaftarPemilikSumberDanaPresenter.this.d;
                if (read4 != null) {
                    read4.b(arrayList2);
                    return;
                }
                return;
            }
            read read5 = DaftarPemilikSumberDanaPresenter.this.d;
            if (read5 != null) {
                read5.d(response.message());
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DaftarPemilikSumberDanaPresenter$read.class */
    public interface read {
        void a(String str);

        void b(String str);

        void b(List<detailBCAFullPayment.read> list);

        @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
        void c(String str);

        void d(String str);

        @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
        void e(String str);

        void p();
    }

    public DaftarPemilikSumberDanaPresenter() {
        App.d().b(this);
    }

    public final void c(InfoProductActivity_ViewBinding infoProductActivity_ViewBinding, Integer num, Integer num2, String str, String str2, String str3, Boolean bool) {
        String str4;
        read read2;
        if (subscribeReservationRescheduleEvent.b(bool, Boolean.TRUE) && (read2 = this.d) != null) {
            read2.p();
        }
        JSONObject jSONObject = new JSONObject();
        String str5 = null;
        if (infoProductActivity_ViewBinding != null) {
            try {
                str4 = infoProductActivity_ViewBinding.d;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            str4 = null;
        }
        jSONObject.put("Email", str4);
        jSONObject.put("SessionId", infoProductActivity_ViewBinding != null ? infoProductActivity_ViewBinding.c : null);
        jSONObject.put("IMEI", infoProductActivity_ViewBinding != null ? infoProductActivity_ViewBinding.e : null);
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
        if (infoProductActivity_ViewBinding != null) {
            str5 = infoProductActivity_ViewBinding.a;
        }
        Call<OpenAccountSuccessActivity<detailBCAFullPayment>> a = setincomedisplayamount.a(obj, str5, num, num2, str, str2, str3);
        this.e = a;
        if (a != null) {
            a.enqueue((Callback) new IconCompatParcelizer());
        }
    }
}
