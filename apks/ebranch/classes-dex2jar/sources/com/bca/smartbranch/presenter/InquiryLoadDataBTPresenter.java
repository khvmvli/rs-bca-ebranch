package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import o.InfoProductActivity;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.getPromotion;
import o.onCLickStatusNpwp;
import o.onClickDetail;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import o.subscribeReservationRescheduleEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/InquiryLoadDataBTPresenter.class */
public final class InquiryLoadDataBTPresenter {
    private String a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public IconCompatParcelizer e;
    private GetTxnTellerDetailKUResponse f;
    private GetCustAcctListResponse h;
    private Call<OpenAccountSuccessActivity<DaftarTransferResponse>> j;
    private Call<OpenAccountSuccessActivity<onClickDetail>> k;
    private Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> l;
    private Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> n;

    /* renamed from: o */
    private Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> f63o;
    private String p;
    private User q;
    private String r;
    private String t;
    private final String d = "sumber-dana-ku";
    private final String b = "sumber-dana-ku-badan";
    private final String c = "tujuan-transaksi-ku";
    private List<? extends DaftarTransferResponse.DaftarTransferOutput> g = new ArrayList();
    private List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> m = new ArrayList();
    private List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> s = new ArrayList();
    private List<onClickDetail.RemoteActionCompatParcelizer> i = new ArrayList();

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/InquiryLoadDataBTPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse, GetCustAcctListResponse getCustAcctListResponse, List<onClickDetail.RemoteActionCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list3, List<? extends DaftarTransferResponse.DaftarTransferOutput> list4, String str);

        void b(String str);

        void b_(String str);

        void g_();

        void p(String str);

        void t(String str);

        void y(String str);
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/InquiryLoadDataBTPresenter$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements Callback<OpenAccountSuccessActivity<GetCustAcctListResponse>> {
        RemoteActionCompatParcelizer() {
            InquiryLoadDataBTPresenter.this = r4;
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call, Throwable th) {
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            if (InquiryLoadDataBTPresenter.this.l != null) {
                Call call2 = InquiryLoadDataBTPresenter.this.l;
                subscribeReservationRescheduleEvent.c(call2);
                if (!call2.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = InquiryLoadDataBTPresenter.this.e;
                    subscribeReservationRescheduleEvent.c(iconCompatParcelizer);
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.y(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.y(str);
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
                    InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter = InquiryLoadDataBTPresenter.this;
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
                    inquiryLoadDataBTPresenter.h = getCustAcctListResponse;
                    InquiryLoadDataBTPresenter.b(InquiryLoadDataBTPresenter.this);
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
                    IconCompatParcelizer iconCompatParcelizer = InquiryLoadDataBTPresenter.this.e;
                    subscribeReservationRescheduleEvent.c(iconCompatParcelizer);
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body4 = response.body();
                    subscribeReservationRescheduleEvent.c(body4);
                    OpenAccountSuccessActivity<GetCustAcctListResponse> openAccountSuccessActivity4 = body4;
                    detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity4.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = openAccountSuccessActivity4.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                    iconCompatParcelizer.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
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
                    IconCompatParcelizer iconCompatParcelizer2 = InquiryLoadDataBTPresenter.this.e;
                    subscribeReservationRescheduleEvent.c(iconCompatParcelizer2);
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body6 = response.body();
                    subscribeReservationRescheduleEvent.c(body6);
                    OpenAccountSuccessActivity<GetCustAcctListResponse> openAccountSuccessActivity6 = body6;
                    detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity6.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = openAccountSuccessActivity6.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                    iconCompatParcelizer2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                    return;
                }
                IconCompatParcelizer iconCompatParcelizer3 = InquiryLoadDataBTPresenter.this.e;
                subscribeReservationRescheduleEvent.c(iconCompatParcelizer3);
                OpenAccountSuccessActivity<GetCustAcctListResponse> body7 = response.body();
                subscribeReservationRescheduleEvent.c(body7);
                OpenAccountSuccessActivity<GetCustAcctListResponse> openAccountSuccessActivity7 = body7;
                detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity7.c;
                if (detailrtgscny6 == null) {
                    detailrtgscny6 = openAccountSuccessActivity7.b;
                }
                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                iconCompatParcelizer3.p(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                return;
            }
            IconCompatParcelizer iconCompatParcelizer4 = InquiryLoadDataBTPresenter.this.e;
            subscribeReservationRescheduleEvent.c(iconCompatParcelizer4);
            iconCompatParcelizer4.t(response.message());
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/InquiryLoadDataBTPresenter$read.class */
    public static final class read implements Callback<OpenAccountSuccessActivity<onClickDetail>> {
        read() {
            InquiryLoadDataBTPresenter.this = r4;
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<onClickDetail>> call, Throwable th) {
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            if (InquiryLoadDataBTPresenter.this.k != null) {
                Call call2 = InquiryLoadDataBTPresenter.this.k;
                subscribeReservationRescheduleEvent.c(call2);
                if (!call2.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = InquiryLoadDataBTPresenter.this.e;
                    subscribeReservationRescheduleEvent.c(iconCompatParcelizer);
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.y(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.y(str);
                }
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
                    InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter = InquiryLoadDataBTPresenter.this;
                    OpenAccountSuccessActivity<onClickDetail> body2 = response.body();
                    subscribeReservationRescheduleEvent.c(body2);
                    OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity2 = body2;
                    onClickDetail onclickdetail = openAccountSuccessActivity2.d;
                    ArrayList arrayList = null;
                    if (onclickdetail == null) {
                        onclickdetail = openAccountSuccessActivity2.a;
                        if (onclickdetail == null) {
                            onclickdetail = null;
                        }
                    }
                    List<onClickDetail.RemoteActionCompatParcelizer> list = onclickdetail.a;
                    if (list != null) {
                        List<onClickDetail.RemoteActionCompatParcelizer> list2 = list;
                        subscribeReservationRescheduleEvent.e(list2, "");
                        arrayList = new ArrayList(list2);
                    }
                    inquiryLoadDataBTPresenter.i = arrayList;
                    String str = InquiryLoadDataBTPresenter.this.r;
                    subscribeReservationRescheduleEvent.c((Object) str);
                    if (str.length() == 0) {
                        InquiryLoadDataBTPresenter.k(InquiryLoadDataBTPresenter.this);
                        return;
                    }
                    String str2 = InquiryLoadDataBTPresenter.this.r;
                    subscribeReservationRescheduleEvent.c((Object) str2);
                    if (BigDecimal.valueOf(Double.parseDouble(str2)).compareTo(BigDecimal.valueOf(100000000L)) > 0) {
                        InquiryLoadDataBTPresenter.d(InquiryLoadDataBTPresenter.this);
                    } else {
                        InquiryLoadDataBTPresenter.k(InquiryLoadDataBTPresenter.this);
                    }
                } else {
                    OpenAccountSuccessActivity<onClickDetail> body3 = response.body();
                    subscribeReservationRescheduleEvent.c(body3);
                    OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity3 = body3;
                    detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = openAccountSuccessActivity3.b;
                    }
                    String str3 = detailrtgscny2.a;
                    if (subscribeReservationRescheduleEvent.b((Object) (str3 != null ? str3 : detailrtgscny2.c), (Object) "MID-00-898")) {
                        IconCompatParcelizer iconCompatParcelizer = InquiryLoadDataBTPresenter.this.e;
                        subscribeReservationRescheduleEvent.c(iconCompatParcelizer);
                        OpenAccountSuccessActivity<onClickDetail> body4 = response.body();
                        subscribeReservationRescheduleEvent.c(body4);
                        OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity4 = body4;
                        detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = openAccountSuccessActivity4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        iconCompatParcelizer.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<onClickDetail> body5 = response.body();
                    subscribeReservationRescheduleEvent.c(body5);
                    OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity5 = body5;
                    detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = openAccountSuccessActivity5.b;
                    }
                    String str4 = detailrtgscny4.a;
                    if (subscribeReservationRescheduleEvent.b((Object) (str4 != null ? str4 : detailrtgscny4.c), (Object) "MID-00-899")) {
                        IconCompatParcelizer iconCompatParcelizer2 = InquiryLoadDataBTPresenter.this.e;
                        subscribeReservationRescheduleEvent.c(iconCompatParcelizer2);
                        OpenAccountSuccessActivity<onClickDetail> body6 = response.body();
                        subscribeReservationRescheduleEvent.c(body6);
                        OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity6 = body6;
                        detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = openAccountSuccessActivity6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        iconCompatParcelizer2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    IconCompatParcelizer iconCompatParcelizer3 = InquiryLoadDataBTPresenter.this.e;
                    subscribeReservationRescheduleEvent.c(iconCompatParcelizer3);
                    OpenAccountSuccessActivity<onClickDetail> body7 = response.body();
                    subscribeReservationRescheduleEvent.c(body7);
                    OpenAccountSuccessActivity<onClickDetail> openAccountSuccessActivity7 = body7;
                    detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = openAccountSuccessActivity7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    iconCompatParcelizer3.p(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                }
            } else {
                IconCompatParcelizer iconCompatParcelizer4 = InquiryLoadDataBTPresenter.this.e;
                subscribeReservationRescheduleEvent.c(iconCompatParcelizer4);
                iconCompatParcelizer4.t(response.message());
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/InquiryLoadDataBTPresenter$write.class */
    public static final class write implements Callback<OpenAccountSuccessActivity<DaftarTransferResponse>> {
        write() {
            InquiryLoadDataBTPresenter.this = r4;
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call, Throwable th) {
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            if (InquiryLoadDataBTPresenter.this.j != null) {
                Call call2 = InquiryLoadDataBTPresenter.this.j;
                subscribeReservationRescheduleEvent.c(call2);
                if (!call2.isCanceled()) {
                    User user = InquiryLoadDataBTPresenter.this.q;
                    subscribeReservationRescheduleEvent.c(user);
                    if (subscribeReservationRescheduleEvent.b((Object) user.getVerified(), (Object) "Y")) {
                        InquiryLoadDataBTPresenter.e(InquiryLoadDataBTPresenter.this);
                    } else {
                        InquiryLoadDataBTPresenter.b(InquiryLoadDataBTPresenter.this);
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
            if (o.subscribeReservationRescheduleEvent.b((java.lang.Object) (r0 != null ? r0 : r4.c), (java.lang.Object) "MID-09-111") != false) goto L_0x0074;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final void onResponse(retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.DaftarTransferResponse>> r4, retrofit2.Response<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.DaftarTransferResponse>> r5) {
            /*
            // Method dump skipped, instructions count: 220
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.write.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public InquiryLoadDataBTPresenter() {
        App.d().c(this);
    }

    public static final /* synthetic */ void b(InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter) {
        IconCompatParcelizer iconCompatParcelizer = inquiryLoadDataBTPresenter.e;
        subscribeReservationRescheduleEvent.c(iconCompatParcelizer);
        iconCompatParcelizer.g_();
        setIncomeDisplayAmount setincomedisplayamount = inquiryLoadDataBTPresenter.apiService;
        if (setincomedisplayamount == null) {
            subscribeReservationRescheduleEvent.e("");
            setincomedisplayamount = null;
        }
        Call<OpenAccountSuccessActivity<onClickDetail>> a = setincomedisplayamount.a(inquiryLoadDataBTPresenter.a);
        inquiryLoadDataBTPresenter.k = a;
        if (a != null) {
            a.enqueue((Callback) new read());
        }
        onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
    }

    public static final /* synthetic */ void c(InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter) {
        IconCompatParcelizer iconCompatParcelizer = inquiryLoadDataBTPresenter.e;
        subscribeReservationRescheduleEvent.c(iconCompatParcelizer);
        iconCompatParcelizer.g_();
        setIncomeDisplayAmount setincomedisplayamount = inquiryLoadDataBTPresenter.apiService;
        if (setincomedisplayamount == null) {
            subscribeReservationRescheduleEvent.e("");
            setincomedisplayamount = null;
        }
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> c = setincomedisplayamount.c(inquiryLoadDataBTPresenter.a, inquiryLoadDataBTPresenter.c, "Y");
        inquiryLoadDataBTPresenter.f63o = c;
        if (c != null) {
            c.enqueue((Callback) new Callback<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>>() { // from class: com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter$MediaBrowserCompat$MediaItem
                public final void onFailure(Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call, Throwable th) {
                    String str;
                    subscribeReservationRescheduleEvent.e(call, "");
                    subscribeReservationRescheduleEvent.e(th, "");
                    if (InquiryLoadDataBTPresenter.this.f63o != null) {
                        Call call2 = InquiryLoadDataBTPresenter.this.f63o;
                        subscribeReservationRescheduleEvent.c(call2);
                        if (!call2.isCanceled()) {
                            InquiryLoadDataBTPresenter.IconCompatParcelizer iconCompatParcelizer2 = InquiryLoadDataBTPresenter.this.e;
                            subscribeReservationRescheduleEvent.c(iconCompatParcelizer2);
                            if (th != null) {
                                if (th instanceof UnknownHostException) {
                                    str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                                } else if (th instanceof SocketTimeoutException) {
                                    str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                                }
                                iconCompatParcelizer2.y(str);
                            }
                            str = "Oops! Terjadi kesalahan.";
                            iconCompatParcelizer2.y(str);
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
                            InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter2 = InquiryLoadDataBTPresenter.this;
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
                            inquiryLoadDataBTPresenter2.s = arrayList;
                            InquiryLoadDataBTPresenter.k(InquiryLoadDataBTPresenter.this);
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
                            InquiryLoadDataBTPresenter.IconCompatParcelizer iconCompatParcelizer2 = InquiryLoadDataBTPresenter.this.e;
                            subscribeReservationRescheduleEvent.c(iconCompatParcelizer2);
                            OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body4 = response.body();
                            subscribeReservationRescheduleEvent.c(body4);
                            OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity3 = body4;
                            detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity3.c;
                            if (detailrtgscny3 == null) {
                                detailrtgscny3 = openAccountSuccessActivity3.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                            iconCompatParcelizer2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
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
                            InquiryLoadDataBTPresenter.IconCompatParcelizer iconCompatParcelizer3 = InquiryLoadDataBTPresenter.this.e;
                            subscribeReservationRescheduleEvent.c(iconCompatParcelizer3);
                            OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body6 = response.body();
                            subscribeReservationRescheduleEvent.c(body6);
                            OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity5 = body6;
                            detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity5.c;
                            if (detailrtgscny5 == null) {
                                detailrtgscny5 = openAccountSuccessActivity5.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                            iconCompatParcelizer3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                            return;
                        }
                        InquiryLoadDataBTPresenter.IconCompatParcelizer iconCompatParcelizer4 = InquiryLoadDataBTPresenter.this.e;
                        subscribeReservationRescheduleEvent.c(iconCompatParcelizer4);
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body7 = response.body();
                        subscribeReservationRescheduleEvent.c(body7);
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity6 = body7;
                        detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity6.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = openAccountSuccessActivity6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        iconCompatParcelizer4.p(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    InquiryLoadDataBTPresenter.IconCompatParcelizer iconCompatParcelizer5 = InquiryLoadDataBTPresenter.this.e;
                    subscribeReservationRescheduleEvent.c(iconCompatParcelizer5);
                    iconCompatParcelizer5.t(response.message());
                }
            });
        }
        onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
    }

    private void c(InfoProductActivity infoProductActivity) {
        subscribeReservationRescheduleEvent.e(infoProductActivity, "");
        IconCompatParcelizer iconCompatParcelizer = this.e;
        subscribeReservationRescheduleEvent.c(iconCompatParcelizer);
        iconCompatParcelizer.g_();
        setIncomeDisplayAmount setincomedisplayamount = this.apiService;
        if (setincomedisplayamount == null) {
            subscribeReservationRescheduleEvent.e("");
            setincomedisplayamount = null;
        }
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> n = setincomedisplayamount.n(this.a, infoProductActivity.e);
        this.j = n;
        if (n != null) {
            n.enqueue((Callback) new write());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
        if (r0.equals("2") != false) goto L_0x0084;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0084, code lost:
        r0 = r6.apiService;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
        if (r0 == null) goto L_0x0095;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
        o.subscribeReservationRescheduleEvent.e("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
        r6.n = r7.c(r6.a, r6.b, "Y");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
        if (r0.equals("1") == false) goto L_0x0122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c3, code lost:
        if (r0.equals("Perorangan") != false) goto L_0x00c6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
        r7 = r6.apiService;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
        if (r7 == null) goto L_0x00d2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
        o.subscribeReservationRescheduleEvent.e("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00da, code lost:
        r6.n = r7.c(r6.a, r6.d, "Y");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f7, code lost:
        if (r0.equals("Pemerintah") != false) goto L_0x00fa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fa, code lost:
        r7 = r6.apiService;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0100, code lost:
        if (r7 == null) goto L_0x0106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0106, code lost:
        o.subscribeReservationRescheduleEvent.e("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010e, code lost:
        r6.n = r7.c(r6.a, r6.b, "Y");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0069, code lost:
        if (r0.equals("Perusahaan") == false) goto L_0x0122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0075, code lost:
        if (r0.equals("3") == false) goto L_0x0122;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final /* synthetic */ void d(com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter r6) {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter.d(com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter):void");
    }

    public static final /* synthetic */ void e(InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter) {
        IconCompatParcelizer iconCompatParcelizer = inquiryLoadDataBTPresenter.e;
        subscribeReservationRescheduleEvent.c(iconCompatParcelizer);
        iconCompatParcelizer.g_();
        setIncomeDisplayAmount setincomedisplayamount = inquiryLoadDataBTPresenter.apiService;
        if (setincomedisplayamount == null) {
            subscribeReservationRescheduleEvent.e("");
            setincomedisplayamount = null;
        }
        String str = inquiryLoadDataBTPresenter.a;
        User user = inquiryLoadDataBTPresenter.q;
        subscribeReservationRescheduleEvent.c(user);
        Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> b = setincomedisplayamount.b(str, user.getEmail(), "Kiriman Uang");
        inquiryLoadDataBTPresenter.l = b;
        if (b != null) {
            b.enqueue((Callback) new RemoteActionCompatParcelizer());
        }
        onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
    }

    public static final /* synthetic */ void k(InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter) {
        IconCompatParcelizer iconCompatParcelizer = inquiryLoadDataBTPresenter.e;
        subscribeReservationRescheduleEvent.c(iconCompatParcelizer);
        iconCompatParcelizer.a(inquiryLoadDataBTPresenter.f, inquiryLoadDataBTPresenter.h, inquiryLoadDataBTPresenter.i, inquiryLoadDataBTPresenter.m, inquiryLoadDataBTPresenter.s, inquiryLoadDataBTPresenter.g, inquiryLoadDataBTPresenter.t);
    }

    public final void e() {
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call = this.j;
        if (call != null) {
            subscribeReservationRescheduleEvent.c(call);
            call.cancel();
        }
        Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call2 = this.l;
        if (call2 != null) {
            subscribeReservationRescheduleEvent.c(call2);
            call2.cancel();
        }
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call3 = this.n;
        if (call3 != null) {
            subscribeReservationRescheduleEvent.c(call3);
            call3.cancel();
        }
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call4 = this.f63o;
        if (call4 != null) {
            subscribeReservationRescheduleEvent.c(call4);
            call4.cancel();
        }
        Call<OpenAccountSuccessActivity<onClickDetail>> call5 = this.k;
        if (call5 != null) {
            subscribeReservationRescheduleEvent.c(call5);
            call5.cancel();
        }
        this.e = null;
    }

    public final void e(User user, GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse, String str, String str2, String str3) {
        subscribeReservationRescheduleEvent.e(user, "");
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        subscribeReservationRescheduleEvent.e(str3, "");
        this.f = getTxnTellerDetailKUResponse;
        this.p = str;
        this.r = str2;
        this.t = str3;
        this.q = user;
        this.a = getPromotion.e(user);
        c(new InfoProductActivity(user.getEmail(), user.getSessionId(), user.getImei(), "Transfer ke Bank Lain"));
    }
}
