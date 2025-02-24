package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.request.TxnTellerRequest;
import com.bca.smartbranch.data.api.response.AccountOpeningResponse;
import com.bca.smartbranch.data.api.response.ActivateEChannelResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.data.api.response.UpdateRefNumberResponse;
import com.bca.smartbranch.data.localdb.User;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.FotoActivity;
import o.MainActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.cancelPicture;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.getPromotion;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/ReservasiListChosenPresenter.class */
public class ReservasiListChosenPresenter {
    public Call<OpenAccountSuccessActivity<UpdateRefNumberResponse>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<AccountOpeningResponse>> b;
    public Call<OpenAccountSuccessActivity<TxnTellerResponse>> c;
    public Call<OpenAccountSuccessActivity<ActivateEChannelResponse>> d;
    public ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver e;
    private String f;
    private String g;
    private String h;
    private String i;
    public TxnTellerResponse j;
    private TxnTellerRequest k;
    private FotoActivity l;
    private String m;
    private User n;

    /* renamed from: o  reason: collision with root package name */
    private cancelPicture f65o;
    private String p;
    private String q;
    private String s;

    public ReservasiListChosenPresenter() {
        App.d().b(this);
    }

    private void b() {
        Call<OpenAccountSuccessActivity<AccountOpeningResponse>> a = this.apiService.a(this.f65o);
        this.b = a;
        a.enqueue(new Callback<OpenAccountSuccessActivity<AccountOpeningResponse>>() { // from class: com.bca.smartbranch.presenter.ReservasiListChosenPresenter.4
            public final void onFailure(Call<OpenAccountSuccessActivity<AccountOpeningResponse>> call, Throwable th) {
                String str;
                if (ReservasiListChosenPresenter.this.b != null && !ReservasiListChosenPresenter.this.b.isCanceled()) {
                    ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver = ReservasiListChosenPresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.x(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.x(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<AccountOpeningResponse>> call, Response<OpenAccountSuccessActivity<AccountOpeningResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<AccountOpeningResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        ReservasiListChosenPresenter reservasiListChosenPresenter = ReservasiListChosenPresenter.this;
                        OpenAccountSuccessActivity<AccountOpeningResponse> body2 = response.body();
                        AccountOpeningResponse accountOpeningResponse = body2.d;
                        if (accountOpeningResponse == null) {
                            accountOpeningResponse = body2.a;
                            if (accountOpeningResponse == null) {
                                accountOpeningResponse = null;
                            }
                        }
                        reservasiListChosenPresenter.q = accountOpeningResponse.getTxnDataOutput().getNoReff();
                        ReservasiListChosenPresenter.e(ReservasiListChosenPresenter.this);
                        return;
                    }
                    OpenAccountSuccessActivity<AccountOpeningResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver = ReservasiListChosenPresenter.this.e;
                        OpenAccountSuccessActivity<AccountOpeningResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<AccountOpeningResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = ReservasiListChosenPresenter.this.e;
                        OpenAccountSuccessActivity<AccountOpeningResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    OpenAccountSuccessActivity<AccountOpeningResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    String str3 = detailrtgscny6.a;
                    if ((str3 != null ? str3 : detailrtgscny6.c).equals("MID-07-003")) {
                        ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = ReservasiListChosenPresenter.this.e;
                        OpenAccountSuccessActivity<AccountOpeningResponse> body8 = response.body();
                        detailRTGSCNY detailrtgscny7 = body8.c;
                        if (detailrtgscny7 == null) {
                            detailrtgscny7 = body8.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny7.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null) {
                            String str4 = detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c;
                        } else {
                            String str5 = detailrtgscny7.b;
                        }
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver3.C();
                        return;
                    }
                    ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver4 = ReservasiListChosenPresenter.this.e;
                    OpenAccountSuccessActivity<AccountOpeningResponse> body9 = response.body();
                    detailRTGSCNY detailrtgscny8 = body9.c;
                    if (detailrtgscny8 == null) {
                        detailrtgscny8 = body9.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny8.e;
                    reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver4.u(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny8.b);
                    return;
                }
                ReservasiListChosenPresenter.this.e.z(response.message());
            }
        });
    }

    private void c() {
        Call<OpenAccountSuccessActivity<TxnTellerResponse>> d = this.apiService.d(getPromotion.c(this.n, this.g, ""), this.k);
        this.c = d;
        d.enqueue(new Callback<OpenAccountSuccessActivity<TxnTellerResponse>>() { // from class: com.bca.smartbranch.presenter.ReservasiListChosenPresenter.5
            public final void onFailure(Call<OpenAccountSuccessActivity<TxnTellerResponse>> call, Throwable th) {
                String str;
                if (ReservasiListChosenPresenter.this.c != null && !ReservasiListChosenPresenter.this.c.isCanceled()) {
                    ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver = ReservasiListChosenPresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.x(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.x(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<TxnTellerResponse>> call, Response<OpenAccountSuccessActivity<TxnTellerResponse>> response) {
                TxnTellerResponse txnTellerResponse;
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<TxnTellerResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        ReservasiListChosenPresenter reservasiListChosenPresenter = ReservasiListChosenPresenter.this;
                        OpenAccountSuccessActivity<TxnTellerResponse> body2 = response.body();
                        TxnTellerResponse txnTellerResponse2 = body2.d;
                        TxnTellerResponse txnTellerResponse3 = null;
                        if (txnTellerResponse2 == null) {
                            txnTellerResponse2 = body2.a;
                            if (txnTellerResponse2 == null) {
                                txnTellerResponse2 = null;
                            }
                        }
                        reservasiListChosenPresenter.j = txnTellerResponse2;
                        ReservasiListChosenPresenter reservasiListChosenPresenter2 = ReservasiListChosenPresenter.this;
                        OpenAccountSuccessActivity<TxnTellerResponse> body3 = response.body();
                        txnTellerResponse3 = body3.d;
                        if (txnTellerResponse3 == null && (txnTellerResponse = body3.a) != null) {
                            txnTellerResponse3 = txnTellerResponse;
                        }
                        reservasiListChosenPresenter2.q = txnTellerResponse3.getTxnDataOutput().getNoReff();
                        ReservasiListChosenPresenter.e(ReservasiListChosenPresenter.this);
                        return;
                    }
                    OpenAccountSuccessActivity<TxnTellerResponse> body4 = response.body();
                    detailRTGSCNY detailrtgscny2 = body4.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body4.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver = ReservasiListChosenPresenter.this.e;
                        OpenAccountSuccessActivity<TxnTellerResponse> body5 = response.body();
                        detailRTGSCNY detailrtgscny3 = body5.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<TxnTellerResponse> body6 = response.body();
                    detailRTGSCNY detailrtgscny4 = body6.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body6.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = ReservasiListChosenPresenter.this.e;
                        OpenAccountSuccessActivity<TxnTellerResponse> body7 = response.body();
                        detailRTGSCNY detailrtgscny5 = body7.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body7.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = ReservasiListChosenPresenter.this.e;
                    OpenAccountSuccessActivity<TxnTellerResponse> body8 = response.body();
                    detailRTGSCNY detailrtgscny6 = body8.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body8.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver3.u(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                ReservasiListChosenPresenter.this.e.z(response.message());
            }
        });
    }

    private void e() {
        Call<OpenAccountSuccessActivity<ActivateEChannelResponse>> c = this.apiService.c(this.l);
        this.d = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<ActivateEChannelResponse>>() { // from class: com.bca.smartbranch.presenter.ReservasiListChosenPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<ActivateEChannelResponse>> call, Throwable th) {
                String str;
                if (ReservasiListChosenPresenter.this.d != null && !ReservasiListChosenPresenter.this.d.isCanceled()) {
                    ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver = ReservasiListChosenPresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.x(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.x(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<ActivateEChannelResponse>> call, Response<OpenAccountSuccessActivity<ActivateEChannelResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<ActivateEChannelResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        ReservasiListChosenPresenter reservasiListChosenPresenter = ReservasiListChosenPresenter.this;
                        OpenAccountSuccessActivity<ActivateEChannelResponse> body2 = response.body();
                        ActivateEChannelResponse activateEChannelResponse = body2.d;
                        if (activateEChannelResponse == null) {
                            activateEChannelResponse = body2.a;
                            if (activateEChannelResponse == null) {
                                activateEChannelResponse = null;
                            }
                        }
                        reservasiListChosenPresenter.q = activateEChannelResponse.getTxnDataOutput().getNoReff();
                        ReservasiListChosenPresenter.e(ReservasiListChosenPresenter.this);
                        return;
                    }
                    OpenAccountSuccessActivity<ActivateEChannelResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver = ReservasiListChosenPresenter.this.e;
                        OpenAccountSuccessActivity<ActivateEChannelResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<ActivateEChannelResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = ReservasiListChosenPresenter.this.e;
                        OpenAccountSuccessActivity<ActivateEChannelResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    OpenAccountSuccessActivity<ActivateEChannelResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    String str3 = detailrtgscny6.a;
                    if ((str3 != null ? str3 : detailrtgscny6.c).equals("MID-07-003")) {
                        ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = ReservasiListChosenPresenter.this.e;
                        OpenAccountSuccessActivity<ActivateEChannelResponse> body8 = response.body();
                        detailRTGSCNY detailrtgscny7 = body8.c;
                        if (detailrtgscny7 == null) {
                            detailrtgscny7 = body8.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny7.e;
                        if (detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null) {
                            String str4 = detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c;
                        } else {
                            String str5 = detailrtgscny7.b;
                        }
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver3.C();
                        return;
                    }
                    ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver4 = ReservasiListChosenPresenter.this.e;
                    OpenAccountSuccessActivity<ActivateEChannelResponse> body9 = response.body();
                    detailRTGSCNY detailrtgscny8 = body9.c;
                    if (detailrtgscny8 == null) {
                        detailrtgscny8 = body9.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny8.e;
                    reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver4.u(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny8.b);
                    return;
                }
                ReservasiListChosenPresenter.this.e.z(response.message());
            }
        });
    }

    static /* synthetic */ void e(ReservasiListChosenPresenter reservasiListChosenPresenter) {
        Call<OpenAccountSuccessActivity<UpdateRefNumberResponse>> c = reservasiListChosenPresenter.apiService.c(new MainActivity_ViewBinding(reservasiListChosenPresenter.f, reservasiListChosenPresenter.m, reservasiListChosenPresenter.s, reservasiListChosenPresenter.i, reservasiListChosenPresenter.p, reservasiListChosenPresenter.q, reservasiListChosenPresenter.h));
        reservasiListChosenPresenter.a = c;
        c.enqueue(new Callback<OpenAccountSuccessActivity<UpdateRefNumberResponse>>() { // from class: com.bca.smartbranch.presenter.ReservasiListChosenPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<UpdateRefNumberResponse>> call, Throwable th) {
                String str;
                if (ReservasiListChosenPresenter.this.a != null && !ReservasiListChosenPresenter.this.a.isCanceled()) {
                    ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver = ReservasiListChosenPresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.x(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.x(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<UpdateRefNumberResponse>> call, Response<OpenAccountSuccessActivity<UpdateRefNumberResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<UpdateRefNumberResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver = ReservasiListChosenPresenter.this.e;
                        OpenAccountSuccessActivity<UpdateRefNumberResponse> body2 = response.body();
                        UpdateRefNumberResponse updateRefNumberResponse = body2.d;
                        if (updateRefNumberResponse == null) {
                            updateRefNumberResponse = body2.a;
                            if (updateRefNumberResponse == null) {
                                updateRefNumberResponse = null;
                            }
                        }
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver.D(updateRefNumberResponse.getNewRefNum());
                        return;
                    }
                    OpenAccountSuccessActivity<UpdateRefNumberResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = ReservasiListChosenPresenter.this.e;
                        OpenAccountSuccessActivity<UpdateRefNumberResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<UpdateRefNumberResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = ReservasiListChosenPresenter.this.e;
                        OpenAccountSuccessActivity<UpdateRefNumberResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    ReservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver4 = ReservasiListChosenPresenter.this.e;
                    OpenAccountSuccessActivity<UpdateRefNumberResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    reservasiListChosenPresenter$MediaBrowserCompat$CustomActionResultReceiver4.u(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                ReservasiListChosenPresenter.this.e.z(response.message());
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void e(String str, String str2, String str3, String str4, String str5, String str6, cancelPicture cancelpicture, FotoActivity fotoActivity, TxnTellerRequest txnTellerRequest, String str7, String str8, User user) {
        char c;
        this.f = str2;
        this.m = str3;
        this.s = str4;
        this.i = str5;
        this.h = str6;
        this.f65o = cancelpicture;
        this.l = fotoActivity;
        this.k = txnTellerRequest;
        this.p = str7;
        this.g = str8;
        this.n = user;
        this.e.B();
        str.hashCode();
        switch (str.hashCode()) {
            case -1938537344:
                if (str.equals("PEMREK")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1824056290:
                if (str.equals("TELLER")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 89047352:
                if (str.equals("KLIRING")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1451761918:
                if (str.equals("ECHANNEL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            b();
        } else if (c == 1) {
            c();
        } else if (c == 2) {
            c();
        } else if (c == 3) {
            e();
        }
    }
}
