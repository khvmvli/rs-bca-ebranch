package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.presenter.KliringPresenter;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.clikedKartuRusak;
import o.clikedKeyHilang;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.getPromotion;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import o.subscribeReservationRescheduleEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/KliringPresenter.class */
public final class KliringPresenter {
    public static final write a = new write((byte) 0);
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> b;
    public User c;
    public RemoteActionCompatParcelizer d;
    public String e;
    private Call<OpenAccountSuccessActivity<clikedKartuRusak>> i;
    private GetCustAcctListResponse j;
    private Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> k;

    /* renamed from: o */
    private Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> f64o;
    private final String f = "sumber-dana-kliring";
    private final String h = "sumber-dana-kliring-badan";
    private final String g = "tujuan-transaksi-kliring";
    private List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> l = new ArrayList();
    private List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> m = new ArrayList();
    private List<clikedKeyHilang> n = new ArrayList();

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/KliringPresenter$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Callback<OpenAccountSuccessActivity<GetCustAcctListResponse>> {
        public IconCompatParcelizer() {
            KliringPresenter.this = r4;
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call, Throwable th) {
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            if (KliringPresenter.this.b != null) {
                Call call2 = KliringPresenter.this.b;
                subscribeReservationRescheduleEvent.c(call2);
                if (!call2.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = KliringPresenter.this.d;
                    subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer);
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        remoteActionCompatParcelizer.a_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    remoteActionCompatParcelizer.a_(str);
                }
            }
        }

        public final void onResponse(Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call, Response<OpenAccountSuccessActivity<GetCustAcctListResponse>> response) {
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(response, "");
            if (response.isSuccessful()) {
                OpenAccountSuccessActivity<GetCustAcctListResponse> body = response.body();
                subscribeReservationRescheduleEvent.c(body);
                OpenAccountSuccessActivity<GetCustAcctListResponse> openAccountSuccessActivity = body;
                detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                if (detailrtgscny == null) {
                    detailrtgscny = openAccountSuccessActivity.b;
                }
                if (detailrtgscny.e()) {
                    KliringPresenter kliringPresenter = KliringPresenter.this;
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body2 = response.body();
                    subscribeReservationRescheduleEvent.c(body2);
                    OpenAccountSuccessActivity<GetCustAcctListResponse> openAccountSuccessActivity2 = body2;
                    GetCustAcctListResponse getCustAcctListResponse = openAccountSuccessActivity2.d;
                    if (getCustAcctListResponse == null) {
                        getCustAcctListResponse = openAccountSuccessActivity2.a;
                        if (getCustAcctListResponse == null) {
                            getCustAcctListResponse = null;
                        }
                    }
                    kliringPresenter.j = getCustAcctListResponse;
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = KliringPresenter.this.d;
                    if (remoteActionCompatParcelizer != null) {
                        remoteActionCompatParcelizer.b(KliringPresenter.this.j);
                        return;
                    }
                    return;
                }
                OpenAccountSuccessActivity<GetCustAcctListResponse> body3 = response.body();
                subscribeReservationRescheduleEvent.c(body3);
                OpenAccountSuccessActivity<GetCustAcctListResponse> openAccountSuccessActivity3 = body3;
                detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity3.c;
                if (detailrtgscny2 == null) {
                    detailrtgscny2 = openAccountSuccessActivity3.b;
                }
                String str = detailrtgscny2.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str != null ? str : detailrtgscny2.c), (Object) "MID-00-898")) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = KliringPresenter.this.d;
                    subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer2);
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body4 = response.body();
                    subscribeReservationRescheduleEvent.c(body4);
                    OpenAccountSuccessActivity<GetCustAcctListResponse> openAccountSuccessActivity4 = body4;
                    detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity4.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = openAccountSuccessActivity4.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                    remoteActionCompatParcelizer2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                    return;
                }
                OpenAccountSuccessActivity<GetCustAcctListResponse> body5 = response.body();
                subscribeReservationRescheduleEvent.c(body5);
                OpenAccountSuccessActivity<GetCustAcctListResponse> openAccountSuccessActivity5 = body5;
                detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity5.c;
                if (detailrtgscny4 == null) {
                    detailrtgscny4 = openAccountSuccessActivity5.b;
                }
                String str2 = detailrtgscny4.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str2 != null ? str2 : detailrtgscny4.c), (Object) "MID-00-899")) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = KliringPresenter.this.d;
                    subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer3);
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body6 = response.body();
                    subscribeReservationRescheduleEvent.c(body6);
                    OpenAccountSuccessActivity<GetCustAcctListResponse> openAccountSuccessActivity6 = body6;
                    detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity6.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = openAccountSuccessActivity6.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                    remoteActionCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                    return;
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = KliringPresenter.this.d;
                subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer4);
                OpenAccountSuccessActivity<GetCustAcctListResponse> body7 = response.body();
                subscribeReservationRescheduleEvent.c(body7);
                OpenAccountSuccessActivity<GetCustAcctListResponse> openAccountSuccessActivity7 = body7;
                detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity7.c;
                if (detailrtgscny6 == null) {
                    detailrtgscny6 = openAccountSuccessActivity7.b;
                }
                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                remoteActionCompatParcelizer4.s(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                return;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = KliringPresenter.this.d;
            subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer5);
            remoteActionCompatParcelizer5.r(response.message());
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/KliringPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a_(String str);

        void b(GetCustAcctListResponse getCustAcctListResponse);

        @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
        void b(String str);

        @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
        void b_(String str);

        void d(List<clikedKeyHilang> list);

        void e(List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2);

        @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void g_();

        void r(String str);

        void s(String str);
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/KliringPresenter$read.class */
    public static final class read implements Callback<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> {
        read() {
            KliringPresenter.this = r4;
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call, Throwable th) {
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            if (KliringPresenter.this.f64o != null) {
                Call call2 = KliringPresenter.this.f64o;
                subscribeReservationRescheduleEvent.c(call2);
                if (!call2.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = KliringPresenter.this.d;
                    subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer);
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        remoteActionCompatParcelizer.a_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    remoteActionCompatParcelizer.a_(str);
                }
            }
        }

        public final void onResponse(Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call, Response<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> response) {
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(response, "");
            if (response.isSuccessful()) {
                OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body = response.body();
                subscribeReservationRescheduleEvent.c(body);
                OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity = body;
                detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                if (detailrtgscny == null) {
                    detailrtgscny = openAccountSuccessActivity.b;
                }
                if (detailrtgscny.e()) {
                    KliringPresenter kliringPresenter = KliringPresenter.this;
                    OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body2 = response.body();
                    ArrayList arrayList = null;
                    if (body2 != null) {
                        OutwardRemittanceFormActivity_ViewBinding outwardRemittanceFormActivity_ViewBinding = body2.d;
                        if (outwardRemittanceFormActivity_ViewBinding == null) {
                            outwardRemittanceFormActivity_ViewBinding = body2.a;
                            if (outwardRemittanceFormActivity_ViewBinding == null) {
                                outwardRemittanceFormActivity_ViewBinding = null;
                            }
                        }
                        OutwardRemittanceFormActivity_ViewBinding outwardRemittanceFormActivity_ViewBinding2 = outwardRemittanceFormActivity_ViewBinding;
                        arrayList = null;
                        if (outwardRemittanceFormActivity_ViewBinding2 != null) {
                            List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list = outwardRemittanceFormActivity_ViewBinding2.e;
                            arrayList = null;
                            if (list != null) {
                                List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2 = list;
                                subscribeReservationRescheduleEvent.e(list2, "");
                                arrayList = new ArrayList(list2);
                            }
                        }
                    }
                    kliringPresenter.m = arrayList;
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = KliringPresenter.this.d;
                    if (remoteActionCompatParcelizer != null) {
                        remoteActionCompatParcelizer.e(KliringPresenter.this.l, KliringPresenter.this.m);
                        return;
                    }
                    return;
                }
                OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body3 = response.body();
                subscribeReservationRescheduleEvent.c(body3);
                OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity2 = body3;
                detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity2.c;
                if (detailrtgscny2 == null) {
                    detailrtgscny2 = openAccountSuccessActivity2.b;
                }
                String str = detailrtgscny2.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str != null ? str : detailrtgscny2.c), (Object) "MID-00-898")) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = KliringPresenter.this.d;
                    subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer2);
                    OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body4 = response.body();
                    subscribeReservationRescheduleEvent.c(body4);
                    OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity3 = body4;
                    detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity3.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = openAccountSuccessActivity3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                    remoteActionCompatParcelizer2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                    return;
                }
                OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body5 = response.body();
                subscribeReservationRescheduleEvent.c(body5);
                OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity4 = body5;
                detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity4.c;
                if (detailrtgscny4 == null) {
                    detailrtgscny4 = openAccountSuccessActivity4.b;
                }
                String str2 = detailrtgscny4.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str2 != null ? str2 : detailrtgscny4.c), (Object) "MID-00-899")) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = KliringPresenter.this.d;
                    subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer3);
                    OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body6 = response.body();
                    subscribeReservationRescheduleEvent.c(body6);
                    OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity5 = body6;
                    detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity5.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = openAccountSuccessActivity5.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                    remoteActionCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                    return;
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = KliringPresenter.this.d;
                subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer4);
                OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body7 = response.body();
                subscribeReservationRescheduleEvent.c(body7);
                OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity6 = body7;
                detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity6.c;
                if (detailrtgscny6 == null) {
                    detailrtgscny6 = openAccountSuccessActivity6.b;
                }
                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                remoteActionCompatParcelizer4.s(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                return;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = KliringPresenter.this.d;
            subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer5);
            remoteActionCompatParcelizer5.r(response.message());
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/KliringPresenter$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public KliringPresenter() {
        App.d().d(this);
    }

    public static /* synthetic */ Calendar d(KliringPresenter kliringPresenter, int i, int i2) {
        Calendar instance = Calendar.getInstance();
        subscribeReservationRescheduleEvent.d(instance, "");
        return instance;
    }

    public static Calendar e(int i) {
        Calendar instance = Calendar.getInstance();
        if (i > 1) {
            instance.add(5, i);
        }
        subscribeReservationRescheduleEvent.d(instance, "");
        return instance;
    }

    public static final /* synthetic */ void e(KliringPresenter kliringPresenter, boolean z) {
        if (!z) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = kliringPresenter.d;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.e(kliringPresenter.l, kliringPresenter.m);
                return;
            }
            return;
        }
        setIncomeDisplayAmount setincomedisplayamount = kliringPresenter.apiService;
        if (setincomedisplayamount == null) {
            subscribeReservationRescheduleEvent.e("");
            setincomedisplayamount = null;
        }
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> c = setincomedisplayamount.c(kliringPresenter.e, kliringPresenter.g, "Y");
        kliringPresenter.f64o = c;
        if (c != null) {
            c.enqueue((Callback) new read());
        }
    }

    public final void a(User user, String str, String str2) {
        subscribeReservationRescheduleEvent.e(user, "");
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        this.e = getPromotion.e(user);
        setIncomeDisplayAmount setincomedisplayamount = this.apiService;
        if (setincomedisplayamount == null) {
            subscribeReservationRescheduleEvent.e("");
            setincomedisplayamount = null;
        }
        Call<OpenAccountSuccessActivity<clikedKartuRusak>> d = setincomedisplayamount.d(this.e, str, str2);
        this.i = d;
        if (d != null) {
            d.enqueue((Callback) new Callback<OpenAccountSuccessActivity<clikedKartuRusak>>() { // from class: com.bca.smartbranch.presenter.KliringPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void onFailure(Call<OpenAccountSuccessActivity<clikedKartuRusak>> call, Throwable th) {
                    String str3;
                    subscribeReservationRescheduleEvent.e(call, "");
                    subscribeReservationRescheduleEvent.e(th, "");
                    if (KliringPresenter.this.i != null) {
                        Call call2 = KliringPresenter.this.i;
                        subscribeReservationRescheduleEvent.c(call2);
                        if (!call2.isCanceled()) {
                            KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer = KliringPresenter.this.d;
                            subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer);
                            if (th != null) {
                                if (th instanceof UnknownHostException) {
                                    str3 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                                } else if (th instanceof SocketTimeoutException) {
                                    str3 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                                }
                                remoteActionCompatParcelizer.a_(str3);
                            }
                            str3 = "Oops! Terjadi kesalahan.";
                            remoteActionCompatParcelizer.a_(str3);
                        }
                    }
                }

                public final void onResponse(Call<OpenAccountSuccessActivity<clikedKartuRusak>> call, Response<OpenAccountSuccessActivity<clikedKartuRusak>> response) {
                    KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
                    subscribeReservationRescheduleEvent.e(call, "");
                    subscribeReservationRescheduleEvent.e(response, "");
                    if (response.isSuccessful()) {
                        OpenAccountSuccessActivity<clikedKartuRusak> body = response.body();
                        subscribeReservationRescheduleEvent.c(body);
                        OpenAccountSuccessActivity<clikedKartuRusak> openAccountSuccessActivity = body;
                        detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                        if (detailrtgscny == null) {
                            detailrtgscny = openAccountSuccessActivity.b;
                        }
                        if (detailrtgscny.e()) {
                            KliringPresenter kliringPresenter = KliringPresenter.this;
                            OpenAccountSuccessActivity<clikedKartuRusak> body2 = response.body();
                            ArrayList arrayList = null;
                            if (body2 != null) {
                                clikedKartuRusak clikedkarturusak = body2.d;
                                if (clikedkarturusak == null) {
                                    clikedkarturusak = body2.a;
                                    if (clikedkarturusak == null) {
                                        clikedkarturusak = null;
                                    }
                                }
                                clikedKartuRusak clikedkarturusak2 = clikedkarturusak;
                                arrayList = null;
                                if (clikedkarturusak2 != null) {
                                    List<clikedKeyHilang> list = clikedkarturusak2.c;
                                    arrayList = null;
                                    if (list != null) {
                                        List<clikedKeyHilang> list2 = list;
                                        subscribeReservationRescheduleEvent.e(list2, "");
                                        arrayList = new ArrayList(list2);
                                    }
                                }
                            }
                            kliringPresenter.n = arrayList;
                            List list3 = KliringPresenter.this.n;
                            boolean z = true;
                            if (list3 == null || !list3.isEmpty()) {
                                z = false;
                            }
                            if (!z && (remoteActionCompatParcelizer = KliringPresenter.this.d) != null) {
                                List<clikedKeyHilang> list4 = KliringPresenter.this.n;
                                subscribeReservationRescheduleEvent.c(list4);
                                remoteActionCompatParcelizer.d(list4);
                                return;
                            }
                            return;
                        }
                        OpenAccountSuccessActivity<clikedKartuRusak> body3 = response.body();
                        subscribeReservationRescheduleEvent.c(body3);
                        OpenAccountSuccessActivity<clikedKartuRusak> openAccountSuccessActivity2 = body3;
                        detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = openAccountSuccessActivity2.b;
                        }
                        String str3 = detailrtgscny2.a;
                        if (subscribeReservationRescheduleEvent.b((Object) (str3 != null ? str3 : detailrtgscny2.c), (Object) "MID-00-898")) {
                            KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = KliringPresenter.this.d;
                            subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer2);
                            OpenAccountSuccessActivity<clikedKartuRusak> body4 = response.body();
                            subscribeReservationRescheduleEvent.c(body4);
                            OpenAccountSuccessActivity<clikedKartuRusak> openAccountSuccessActivity3 = body4;
                            detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity3.c;
                            if (detailrtgscny3 == null) {
                                detailrtgscny3 = openAccountSuccessActivity3.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                            remoteActionCompatParcelizer2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                            return;
                        }
                        OpenAccountSuccessActivity<clikedKartuRusak> body5 = response.body();
                        subscribeReservationRescheduleEvent.c(body5);
                        OpenAccountSuccessActivity<clikedKartuRusak> openAccountSuccessActivity4 = body5;
                        detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity4.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = openAccountSuccessActivity4.b;
                        }
                        String str4 = detailrtgscny4.a;
                        if (subscribeReservationRescheduleEvent.b((Object) (str4 != null ? str4 : detailrtgscny4.c), (Object) "MID-00-899")) {
                            KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = KliringPresenter.this.d;
                            subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer3);
                            OpenAccountSuccessActivity<clikedKartuRusak> body6 = response.body();
                            subscribeReservationRescheduleEvent.c(body6);
                            OpenAccountSuccessActivity<clikedKartuRusak> openAccountSuccessActivity5 = body6;
                            detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity5.c;
                            if (detailrtgscny5 == null) {
                                detailrtgscny5 = openAccountSuccessActivity5.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                            remoteActionCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                            return;
                        }
                        KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = KliringPresenter.this.d;
                        subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer4);
                        OpenAccountSuccessActivity<clikedKartuRusak> body7 = response.body();
                        subscribeReservationRescheduleEvent.c(body7);
                        OpenAccountSuccessActivity<clikedKartuRusak> openAccountSuccessActivity6 = body7;
                        detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity6.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = openAccountSuccessActivity6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        remoteActionCompatParcelizer4.s(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = KliringPresenter.this.d;
                    subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer5);
                    remoteActionCompatParcelizer5.r(response.message());
                }
            });
        }
    }

    public final void b() {
        Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call = this.b;
        if (call != null) {
            subscribeReservationRescheduleEvent.c(call);
            call.cancel();
        }
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call2 = this.k;
        if (call2 != null) {
            subscribeReservationRescheduleEvent.c(call2);
            call2.cancel();
        }
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call3 = this.f64o;
        if (call3 != null) {
            subscribeReservationRescheduleEvent.c(call3);
            call3.cancel();
        }
        Call<OpenAccountSuccessActivity<clikedKartuRusak>> call4 = this.i;
        if (!(call4 == null || call4 == null)) {
            call4.cancel();
        }
        this.d = null;
    }

    public final void d(User user, String str) {
        subscribeReservationRescheduleEvent.e(user, "");
        subscribeReservationRescheduleEvent.e(str, "");
        this.e = getPromotion.e(user);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.d;
        subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer);
        remoteActionCompatParcelizer.g_();
        setIncomeDisplayAmount setincomedisplayamount = null;
        setIncomeDisplayAmount setincomedisplayamount2 = null;
        setIncomeDisplayAmount setincomedisplayamount3 = null;
        setIncomeDisplayAmount setincomedisplayamount4 = null;
        switch (str.hashCode()) {
            case -1205044271:
                if (str.equals("Pemerintah")) {
                    setincomedisplayamount3 = this.apiService;
                    if (setincomedisplayamount3 == null) {
                        subscribeReservationRescheduleEvent.e("");
                    }
                    this.k = setincomedisplayamount3.c(this.e, this.h, "Y");
                    break;
                }
                break;
            case -803225625:
                if (str.equals("Perorangan")) {
                    setincomedisplayamount2 = this.apiService;
                    if (setincomedisplayamount2 == null) {
                        subscribeReservationRescheduleEvent.e("");
                    }
                    this.k = setincomedisplayamount2.c(this.e, this.f, "Y");
                    break;
                }
                break;
            case 180796942:
                if (str.equals("Individu")) {
                    setincomedisplayamount = this.apiService;
                    if (setincomedisplayamount == null) {
                        subscribeReservationRescheduleEvent.e("");
                    }
                    this.k = setincomedisplayamount.c(this.e, this.f, "Y");
                    break;
                }
                break;
            case 255273804:
                if (str.equals("Perusahaan")) {
                    setIncomeDisplayAmount setincomedisplayamount5 = this.apiService;
                    if (setincomedisplayamount5 != null) {
                        setincomedisplayamount4 = setincomedisplayamount5;
                    } else {
                        subscribeReservationRescheduleEvent.e("");
                    }
                    this.k = setincomedisplayamount4.c(this.e, this.h, "Y");
                    break;
                }
                break;
        }
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call = this.k;
        if (call != null) {
            call.enqueue((Callback) new Callback<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>>(str) { // from class: com.bca.smartbranch.presenter.KliringPresenter$MediaBrowserCompat$MediaItem
                final /* synthetic */ String d;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.d = r5;
                }

                public final void onFailure(Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call2, Throwable th) {
                    String str2;
                    subscribeReservationRescheduleEvent.e(call2, "");
                    subscribeReservationRescheduleEvent.e(th, "");
                    if (KliringPresenter.this.k != null) {
                        Call call3 = KliringPresenter.this.k;
                        subscribeReservationRescheduleEvent.c(call3);
                        if (!call3.isCanceled()) {
                            KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = KliringPresenter.this.d;
                            subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer2);
                            if (th != null) {
                                if (th instanceof UnknownHostException) {
                                    str2 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                                } else if (th instanceof SocketTimeoutException) {
                                    str2 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                                }
                                remoteActionCompatParcelizer2.a_(str2);
                            }
                            str2 = "Oops! Terjadi kesalahan.";
                            remoteActionCompatParcelizer2.a_(str2);
                        }
                    }
                }

                public final void onResponse(Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call2, Response<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> response) {
                    subscribeReservationRescheduleEvent.e(call2, "");
                    subscribeReservationRescheduleEvent.e(response, "");
                    if (response.isSuccessful()) {
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body = response.body();
                        subscribeReservationRescheduleEvent.c(body);
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity = body;
                        detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                        if (detailrtgscny == null) {
                            detailrtgscny = openAccountSuccessActivity.b;
                        }
                        if (detailrtgscny.e()) {
                            KliringPresenter kliringPresenter = KliringPresenter.this;
                            OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body2 = response.body();
                            ArrayList arrayList = null;
                            if (body2 != null) {
                                OutwardRemittanceFormActivity_ViewBinding outwardRemittanceFormActivity_ViewBinding = body2.d;
                                if (outwardRemittanceFormActivity_ViewBinding == null) {
                                    outwardRemittanceFormActivity_ViewBinding = body2.a;
                                    if (outwardRemittanceFormActivity_ViewBinding == null) {
                                        outwardRemittanceFormActivity_ViewBinding = null;
                                    }
                                }
                                OutwardRemittanceFormActivity_ViewBinding outwardRemittanceFormActivity_ViewBinding2 = outwardRemittanceFormActivity_ViewBinding;
                                arrayList = null;
                                if (outwardRemittanceFormActivity_ViewBinding2 != null) {
                                    List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list = outwardRemittanceFormActivity_ViewBinding2.e;
                                    arrayList = null;
                                    if (list != null) {
                                        List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2 = list;
                                        subscribeReservationRescheduleEvent.e(list2, "");
                                        arrayList = new ArrayList(list2);
                                    }
                                }
                            }
                            kliringPresenter.l = arrayList;
                            KliringPresenter.e(KliringPresenter.this, subscribeReservationRescheduleEvent.b((Object) this.d, (Object) "Individu"));
                            return;
                        }
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body3 = response.body();
                        subscribeReservationRescheduleEvent.c(body3);
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity2 = body3;
                        detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = openAccountSuccessActivity2.b;
                        }
                        String str2 = detailrtgscny2.a;
                        if (subscribeReservationRescheduleEvent.b((Object) (str2 != null ? str2 : detailrtgscny2.c), (Object) "MID-00-898")) {
                            KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = KliringPresenter.this.d;
                            subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer2);
                            OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body4 = response.body();
                            subscribeReservationRescheduleEvent.c(body4);
                            OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity3 = body4;
                            detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity3.c;
                            if (detailrtgscny3 == null) {
                                detailrtgscny3 = openAccountSuccessActivity3.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                            remoteActionCompatParcelizer2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                            return;
                        }
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body5 = response.body();
                        subscribeReservationRescheduleEvent.c(body5);
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity4 = body5;
                        detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity4.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = openAccountSuccessActivity4.b;
                        }
                        String str3 = detailrtgscny4.a;
                        if (subscribeReservationRescheduleEvent.b((Object) (str3 != null ? str3 : detailrtgscny4.c), (Object) "MID-00-899")) {
                            KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = KliringPresenter.this.d;
                            subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer3);
                            OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body6 = response.body();
                            subscribeReservationRescheduleEvent.c(body6);
                            OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity5 = body6;
                            detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity5.c;
                            if (detailrtgscny5 == null) {
                                detailrtgscny5 = openAccountSuccessActivity5.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                            remoteActionCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                            return;
                        }
                        KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = KliringPresenter.this.d;
                        subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer4);
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body7 = response.body();
                        String str4 = null;
                        if (body7 != null) {
                            detailRTGSCNY detailrtgscny6 = body7.c;
                            if (detailrtgscny6 == null) {
                                detailrtgscny6 = body7.b;
                            }
                            str4 = null;
                            if (detailrtgscny6 != null) {
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                                str4 = detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b;
                            }
                        }
                        remoteActionCompatParcelizer4.s(str4);
                        return;
                    }
                    KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = KliringPresenter.this.d;
                    subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer5);
                    remoteActionCompatParcelizer5.r(response.message());
                }
            });
        }
    }
}
