package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.presenter.InquiryLoadDataSetunPresenter;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import o.CheckOTPSessionPresenter;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import o.subscribeReservationRescheduleEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/InquiryLoadDataSetunPresenter.class */
public final class InquiryLoadDataSetunPresenter {
    public String a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> b;
    public boolean c;
    public Call<OpenAccountSuccessActivity<DaftarTransferResponse>> d;
    public GetTxnTellerDetailResponse e;
    public String f;
    public write g;
    String[] h;
    String[] i;
    public String j;
    private MasterFundSourcePurposeResponse k;
    public User l;
    private List<? extends DaftarTransferResponse.DaftarTransferOutput> m = new ArrayList();
    private int n;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/InquiryLoadDataSetunPresenter$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Callback<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> {
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        IconCompatParcelizer(String str, String str2) {
            InquiryLoadDataSetunPresenter.this = r4;
            this.d = str;
            this.e = str2;
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call, Throwable th) {
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            if (InquiryLoadDataSetunPresenter.this.b != null) {
                Call call2 = InquiryLoadDataSetunPresenter.this.b;
                subscribeReservationRescheduleEvent.c(call2);
                if (!call2.isCanceled()) {
                    write write = InquiryLoadDataSetunPresenter.this.g;
                    subscribeReservationRescheduleEvent.c(write);
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        write.F(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    write.F(str);
                }
            }
        }

        public final void onResponse(Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call, Response<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> response) {
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(response, "");
            if (response.isSuccessful()) {
                OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body = response.body();
                subscribeReservationRescheduleEvent.c(body);
                OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity = body;
                detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                if (detailrtgscny == null) {
                    detailrtgscny = openAccountSuccessActivity.b;
                }
                if (detailrtgscny.e()) {
                    OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body2 = response.body();
                    subscribeReservationRescheduleEvent.c(body2);
                    OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity2 = body2;
                    MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = openAccountSuccessActivity2.d;
                    if (masterFundSourcePurposeResponse == null) {
                        masterFundSourcePurposeResponse = openAccountSuccessActivity2.a;
                        if (masterFundSourcePurposeResponse == null) {
                            masterFundSourcePurposeResponse = null;
                        }
                    }
                    MasterFundSourcePurposeResponse masterFundSourcePurposeResponse2 = masterFundSourcePurposeResponse;
                    ArrayList arrayList = new ArrayList();
                    int size = masterFundSourcePurposeResponse2.getCategories().size();
                    for (int i = 0; i < size; i++) {
                        String contentIn = masterFundSourcePurposeResponse2.getCategories().get(i).getContentIn();
                        subscribeReservationRescheduleEvent.d(contentIn, "");
                        arrayList.add(contentIn);
                    }
                    if (!arrayList.isEmpty()) {
                        try {
                            InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter = InquiryLoadDataSetunPresenter.this;
                            Object[] array = arrayList.toArray(new String[0]);
                            subscribeReservationRescheduleEvent.c(array);
                            inquiryLoadDataSetunPresenter.h = (String[]) array;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String[] strArr = InquiryLoadDataSetunPresenter.this.h;
                    subscribeReservationRescheduleEvent.c(strArr);
                    if (strArr.length > 0) {
                        InquiryLoadDataSetunPresenter.c(InquiryLoadDataSetunPresenter.this, this.d, this.e);
                        InquiryLoadDataSetunPresenter.j(InquiryLoadDataSetunPresenter.this);
                        return;
                    }
                    write write = InquiryLoadDataSetunPresenter.this.g;
                    subscribeReservationRescheduleEvent.c(write);
                    write.H("Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.");
                    return;
                }
                OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body3 = response.body();
                subscribeReservationRescheduleEvent.c(body3);
                OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity3 = body3;
                detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity3.c;
                if (detailrtgscny2 == null) {
                    detailrtgscny2 = openAccountSuccessActivity3.b;
                }
                String str = detailrtgscny2.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str != null ? str : detailrtgscny2.c), (Object) "MID-00-898")) {
                    write write2 = InquiryLoadDataSetunPresenter.this.g;
                    subscribeReservationRescheduleEvent.c(write2);
                    OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body4 = response.body();
                    subscribeReservationRescheduleEvent.c(body4);
                    OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity4 = body4;
                    detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity4.c;
                    if (detailrtgscny3 == null) {
                        detailrtgscny3 = openAccountSuccessActivity4.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                    write2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                    return;
                }
                OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body5 = response.body();
                subscribeReservationRescheduleEvent.c(body5);
                OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity5 = body5;
                detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity5.c;
                if (detailrtgscny4 == null) {
                    detailrtgscny4 = openAccountSuccessActivity5.b;
                }
                String str2 = detailrtgscny4.a;
                if (subscribeReservationRescheduleEvent.b((Object) (str2 != null ? str2 : detailrtgscny4.c), (Object) "MID-00-899")) {
                    write write3 = InquiryLoadDataSetunPresenter.this.g;
                    subscribeReservationRescheduleEvent.c(write3);
                    OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body6 = response.body();
                    subscribeReservationRescheduleEvent.c(body6);
                    OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity6 = body6;
                    detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity6.c;
                    if (detailrtgscny5 == null) {
                        detailrtgscny5 = openAccountSuccessActivity6.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                    write3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                    return;
                }
                write write4 = InquiryLoadDataSetunPresenter.this.g;
                subscribeReservationRescheduleEvent.c(write4);
                OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body7 = response.body();
                subscribeReservationRescheduleEvent.c(body7);
                OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity7 = body7;
                detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity7.c;
                if (detailrtgscny6 == null) {
                    detailrtgscny6 = openAccountSuccessActivity7.b;
                }
                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                write4.H(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                return;
            }
            write write5 = InquiryLoadDataSetunPresenter.this.g;
            subscribeReservationRescheduleEvent.c(write5);
            write5.E(response.message());
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/InquiryLoadDataSetunPresenter$read.class */
    public static final class read implements Callback<OpenAccountSuccessActivity<DaftarTransferResponse>> {
        public read() {
            InquiryLoadDataSetunPresenter.this = r4;
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call, Throwable th) {
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            if (InquiryLoadDataSetunPresenter.this.d != null) {
                Call call2 = InquiryLoadDataSetunPresenter.this.d;
                subscribeReservationRescheduleEvent.c(call2);
                if (!call2.isCanceled()) {
                    if (InquiryLoadDataSetunPresenter.this.j == null || CheckOTPSessionPresenter.d(InquiryLoadDataSetunPresenter.this.j, "", true)) {
                        InquiryLoadDataSetunPresenter.this.j = "0";
                    }
                    String str = InquiryLoadDataSetunPresenter.this.j;
                    subscribeReservationRescheduleEvent.c((Object) str);
                    if (BigDecimal.valueOf(Double.parseDouble(str)).compareTo(BigDecimal.valueOf(100000000L)) >= 0) {
                        InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter = InquiryLoadDataSetunPresenter.this;
                        String str2 = inquiryLoadDataSetunPresenter.a;
                        subscribeReservationRescheduleEvent.c((Object) str2);
                        boolean unused = InquiryLoadDataSetunPresenter.this.c;
                        inquiryLoadDataSetunPresenter.a(str2);
                        return;
                    }
                    InquiryLoadDataSetunPresenter.this.a();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
            if (o.subscribeReservationRescheduleEvent.b((java.lang.Object) (r0 != null ? r0 : r5.c), (java.lang.Object) "MID-09-111") != false) goto L_0x0074;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final void onResponse(retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.DaftarTransferResponse>> r5, retrofit2.Response<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.DaftarTransferResponse>> r6) {
            /*
            // Method dump skipped, instructions count: 282
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.presenter.InquiryLoadDataSetunPresenter.read.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/InquiryLoadDataSetunPresenter$write.class */
    public interface write {
        void E(String str);

        void F(String str);

        void H(String str);

        void b(String str);

        void b_(String str);

        void d(List<? extends DaftarTransferResponse.DaftarTransferOutput> list, MasterFundSourcePurposeResponse masterFundSourcePurposeResponse, String str);

        void g_();
    }

    public InquiryLoadDataSetunPresenter() {
        App.d().d(this);
    }

    public final void a() {
        write write2 = this.g;
        subscribeReservationRescheduleEvent.c(write2);
        write2.d(this.m, this.k, this.f);
    }

    public static final /* synthetic */ void c(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, String str, String str2) {
        setIncomeDisplayAmount setincomedisplayamount = inquiryLoadDataSetunPresenter.apiService;
        if (setincomedisplayamount == null) {
            subscribeReservationRescheduleEvent.e("");
            setincomedisplayamount = null;
        }
        Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> f = setincomedisplayamount.f(str, str2);
        inquiryLoadDataSetunPresenter.b = f;
        if (f != null) {
            f.enqueue((Callback) new Callback<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>>() { // from class: com.bca.smartbranch.presenter.InquiryLoadDataSetunPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void onFailure(Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call, Throwable th) {
                    String str3;
                    subscribeReservationRescheduleEvent.e(call, "");
                    subscribeReservationRescheduleEvent.e(th, "");
                    if (InquiryLoadDataSetunPresenter.this.b != null) {
                        Call call2 = InquiryLoadDataSetunPresenter.this.b;
                        subscribeReservationRescheduleEvent.c(call2);
                        if (!call2.isCanceled()) {
                            InquiryLoadDataSetunPresenter.write write2 = InquiryLoadDataSetunPresenter.this.g;
                            subscribeReservationRescheduleEvent.c(write2);
                            if (th != null) {
                                if (th instanceof UnknownHostException) {
                                    str3 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                                } else if (th instanceof SocketTimeoutException) {
                                    str3 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                                }
                                write2.F(str3);
                            }
                            str3 = "Oops! Terjadi kesalahan.";
                            write2.F(str3);
                        }
                    }
                }

                public final void onResponse(Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call, Response<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> response) {
                    subscribeReservationRescheduleEvent.e(call, "");
                    subscribeReservationRescheduleEvent.e(response, "");
                    if (response.isSuccessful()) {
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body = response.body();
                        subscribeReservationRescheduleEvent.c(body);
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity = body;
                        detailRTGSCNY detailrtgscny = openAccountSuccessActivity.c;
                        if (detailrtgscny == null) {
                            detailrtgscny = openAccountSuccessActivity.b;
                        }
                        if (detailrtgscny.e()) {
                            OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body2 = response.body();
                            subscribeReservationRescheduleEvent.c(body2);
                            OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity2 = body2;
                            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = openAccountSuccessActivity2.d;
                            if (masterFundSourcePurposeResponse == null) {
                                masterFundSourcePurposeResponse = openAccountSuccessActivity2.a;
                                if (masterFundSourcePurposeResponse == null) {
                                    masterFundSourcePurposeResponse = null;
                                }
                            }
                            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse2 = masterFundSourcePurposeResponse;
                            ArrayList arrayList = new ArrayList();
                            int size = masterFundSourcePurposeResponse2.getCategories().size();
                            for (int i = 0; i < size; i++) {
                                String contentIn = masterFundSourcePurposeResponse2.getCategories().get(i).getContentIn();
                                subscribeReservationRescheduleEvent.d(contentIn, "");
                                arrayList.add(contentIn);
                            }
                            if (!arrayList.isEmpty()) {
                                try {
                                    InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter2 = InquiryLoadDataSetunPresenter.this;
                                    Object[] array = arrayList.toArray(new String[0]);
                                    subscribeReservationRescheduleEvent.c(array);
                                    inquiryLoadDataSetunPresenter2.i = (String[]) array;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            String[] strArr = InquiryLoadDataSetunPresenter.this.i;
                            subscribeReservationRescheduleEvent.c(strArr);
                            if (strArr.length > 0) {
                                InquiryLoadDataSetunPresenter.j(InquiryLoadDataSetunPresenter.this);
                                return;
                            }
                            InquiryLoadDataSetunPresenter.write write2 = InquiryLoadDataSetunPresenter.this.g;
                            subscribeReservationRescheduleEvent.c(write2);
                            write2.H("Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.");
                            return;
                        }
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body3 = response.body();
                        subscribeReservationRescheduleEvent.c(body3);
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity3 = body3;
                        detailRTGSCNY detailrtgscny2 = openAccountSuccessActivity3.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = openAccountSuccessActivity3.b;
                        }
                        String str3 = detailrtgscny2.a;
                        if (subscribeReservationRescheduleEvent.b((Object) (str3 != null ? str3 : detailrtgscny2.c), (Object) "MID-00-898")) {
                            InquiryLoadDataSetunPresenter.write write3 = InquiryLoadDataSetunPresenter.this.g;
                            subscribeReservationRescheduleEvent.c(write3);
                            OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body4 = response.body();
                            subscribeReservationRescheduleEvent.c(body4);
                            OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity4 = body4;
                            detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity4.c;
                            if (detailrtgscny3 == null) {
                                detailrtgscny3 = openAccountSuccessActivity4.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                            write3.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                            return;
                        }
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body5 = response.body();
                        subscribeReservationRescheduleEvent.c(body5);
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity5 = body5;
                        detailRTGSCNY detailrtgscny4 = openAccountSuccessActivity5.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = openAccountSuccessActivity5.b;
                        }
                        String str4 = detailrtgscny4.a;
                        if (subscribeReservationRescheduleEvent.b((Object) (str4 != null ? str4 : detailrtgscny4.c), (Object) "MID-00-899")) {
                            InquiryLoadDataSetunPresenter.write write4 = InquiryLoadDataSetunPresenter.this.g;
                            subscribeReservationRescheduleEvent.c(write4);
                            OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body6 = response.body();
                            subscribeReservationRescheduleEvent.c(body6);
                            OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity6 = body6;
                            detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity6.c;
                            if (detailrtgscny5 == null) {
                                detailrtgscny5 = openAccountSuccessActivity6.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                            write4.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                            return;
                        }
                        InquiryLoadDataSetunPresenter.write write5 = InquiryLoadDataSetunPresenter.this.g;
                        subscribeReservationRescheduleEvent.c(write5);
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body7 = response.body();
                        subscribeReservationRescheduleEvent.c(body7);
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> openAccountSuccessActivity7 = body7;
                        detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity7.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = openAccountSuccessActivity7.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        write5.H(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                        return;
                    }
                    InquiryLoadDataSetunPresenter.write write6 = InquiryLoadDataSetunPresenter.this.g;
                    subscribeReservationRescheduleEvent.c(write6);
                    write6.E(response.message());
                }
            });
        }
    }

    public static final /* synthetic */ void j(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter) {
        int i = inquiryLoadDataSetunPresenter.n + 1;
        inquiryLoadDataSetunPresenter.n = i;
        if (i >= 2) {
            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = new MasterFundSourcePurposeResponse();
            inquiryLoadDataSetunPresenter.k = masterFundSourcePurposeResponse;
            subscribeReservationRescheduleEvent.c(masterFundSourcePurposeResponse);
            masterFundSourcePurposeResponse.setFundSource(inquiryLoadDataSetunPresenter.h);
            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse2 = inquiryLoadDataSetunPresenter.k;
            subscribeReservationRescheduleEvent.c(masterFundSourcePurposeResponse2);
            masterFundSourcePurposeResponse2.setTransactionPurpose(inquiryLoadDataSetunPresenter.i);
            inquiryLoadDataSetunPresenter.a();
        }
    }

    public final void a(String str) {
        Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call;
        subscribeReservationRescheduleEvent.e(str, "");
        this.n = 0;
        write write2 = this.g;
        subscribeReservationRescheduleEvent.c(write2);
        write2.g_();
        setIncomeDisplayAmount setincomedisplayamount = null;
        setIncomeDisplayAmount setincomedisplayamount2 = null;
        if (this.c) {
            setIncomeDisplayAmount setincomedisplayamount3 = this.apiService;
            if (setincomedisplayamount3 != null) {
                setincomedisplayamount2 = setincomedisplayamount3;
            } else {
                subscribeReservationRescheduleEvent.e("");
            }
            call = setincomedisplayamount2.i(str, "Y");
        } else {
            setincomedisplayamount = this.apiService;
            if (setincomedisplayamount == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            call = setincomedisplayamount.j(str, "Y");
        }
        this.b = call;
        if (call != null) {
            call.enqueue((Callback) new IconCompatParcelizer(str, "Y"));
        }
    }
}
