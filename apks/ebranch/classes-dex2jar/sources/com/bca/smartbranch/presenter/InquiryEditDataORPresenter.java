package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import com.bca.smartbranch.data.api.response.TujuanTransaksiORResponse;
import com.bca.smartbranch.data.localdb.User;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import o.InfoProductActivity;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormUbahActivity;
import o.OutwardRemittanceFormUbahActivity_ViewBinding;
import o.detailLCS;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.getPromotion;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/InquiryEditDataORPresenter.class */
public class InquiryEditDataORPresenter {
    private CategoriesORResponse a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver b;
    private GetCustAcctListResponse c;
    private List<DaftarTransferResponse.DaftarTransferOutput> d = new ArrayList();
    private String e;
    private Call<OpenAccountSuccessActivity<CategoriesORResponse>> f;
    private Call<OpenAccountSuccessActivity<detailLCS>> g;
    private Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity>> h;
    private Call<OpenAccountSuccessActivity<DaftarTransferResponse>> i;
    private GetTxnTellerDetailResponse j;
    private Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding>> k;
    private Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> l;
    private KategoriTujuanTransaksiORResponse m;
    private Call<OpenAccountSuccessActivity<TujuanTransaksiORResponse>> n;

    /* renamed from: o  reason: collision with root package name */
    private Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> f62o;
    private User q;

    public InquiryEditDataORPresenter() {
        App.d().e(this);
    }

    static /* synthetic */ void c(InquiryEditDataORPresenter inquiryEditDataORPresenter) {
        String str = inquiryEditDataORPresenter.e;
        inquiryEditDataORPresenter.b.g_();
        Call<OpenAccountSuccessActivity<CategoriesORResponse>> a = inquiryEditDataORPresenter.apiService.a(str, "C015");
        inquiryEditDataORPresenter.f = a;
        a.enqueue(new Callback<OpenAccountSuccessActivity<CategoriesORResponse>>() { // from class: com.bca.smartbranch.presenter.InquiryEditDataORPresenter.4
            public final void onFailure(Call<OpenAccountSuccessActivity<CategoriesORResponse>> call, Throwable th) {
                String str2;
                if (!InquiryEditDataORPresenter.this.f.isCanceled()) {
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str2 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str2 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str2);
                    }
                    str2 = "Oops! Terjadi kesalahan.";
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str2);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<CategoriesORResponse>> call, Response<OpenAccountSuccessActivity<CategoriesORResponse>> response) {
                CategoriesORResponse categoriesORResponse;
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<CategoriesORResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        InquiryEditDataORPresenter inquiryEditDataORPresenter2 = InquiryEditDataORPresenter.this;
                        OpenAccountSuccessActivity<CategoriesORResponse> body2 = response.body();
                        CategoriesORResponse categoriesORResponse2 = body2.d;
                        CategoriesORResponse categoriesORResponse3 = null;
                        if (categoriesORResponse2 == null) {
                            categoriesORResponse2 = body2.a;
                            if (categoriesORResponse2 == null) {
                                categoriesORResponse2 = null;
                            }
                        }
                        inquiryEditDataORPresenter2.a = categoriesORResponse2;
                        OpenAccountSuccessActivity<CategoriesORResponse> body3 = response.body();
                        categoriesORResponse3 = body3.d;
                        if (categoriesORResponse3 == null && (categoriesORResponse = body3.a) != null) {
                            categoriesORResponse3 = categoriesORResponse;
                        }
                        for (CategoriesORResponse.Category category : categoriesORResponse3.getCategories()) {
                            if (String.format("%02d", Integer.valueOf(Integer.parseInt(category.getContentOrder()))).equals(InquiryEditDataORPresenter.this.j.getTxnDetail().getTxnSource())) {
                                InquiryEditDataORPresenter.this.j.getTxnDetail().setTxnSourceValue(category.getContentIn());
                            }
                        }
                        InquiryEditDataORPresenter.g(InquiryEditDataORPresenter.this);
                        return;
                    }
                    OpenAccountSuccessActivity<CategoriesORResponse> body4 = response.body();
                    detailRTGSCNY detailrtgscny2 = body4.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body4.b;
                    }
                    String str2 = detailrtgscny2.a;
                    if ((str2 != null ? str2 : detailrtgscny2.c).equals("MID-00-898")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<CategoriesORResponse> body5 = response.body();
                        detailRTGSCNY detailrtgscny3 = body5.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<CategoriesORResponse> body6 = response.body();
                    detailRTGSCNY detailrtgscny4 = body6.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body6.b;
                    }
                    String str3 = detailrtgscny4.a;
                    if ((str3 != null ? str3 : detailrtgscny4.c).equals("MID-00-899")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<CategoriesORResponse> body7 = response.body();
                        detailRTGSCNY detailrtgscny5 = body7.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body7.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = InquiryEditDataORPresenter.this.b;
                    OpenAccountSuccessActivity<CategoriesORResponse> body8 = response.body();
                    detailRTGSCNY detailrtgscny6 = body8.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body8.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3.k(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                InquiryEditDataORPresenter.this.b.q(response.message());
            }
        });
    }

    private void e(InfoProductActivity infoProductActivity) {
        this.b.g_();
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> n = this.apiService.n(this.e, infoProductActivity.e);
        this.i = n;
        n.enqueue(new Callback<OpenAccountSuccessActivity<DaftarTransferResponse>>() { // from class: com.bca.smartbranch.presenter.InquiryEditDataORPresenter.5
            public final void onFailure(Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call, Throwable th) {
                if (InquiryEditDataORPresenter.this.i != null && !InquiryEditDataORPresenter.this.i.isCanceled()) {
                    if (InquiryEditDataORPresenter.this.q.getVerified().equals("Y")) {
                        InquiryEditDataORPresenter.o(InquiryEditDataORPresenter.this);
                    } else {
                        InquiryEditDataORPresenter.m(InquiryEditDataORPresenter.this);
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
                if ((r0 != null ? r0 : r4.c).equals("MID-09-111") != false) goto L_0x005c;
             */
            /* Code decompiled incorrectly, please refer to instructions dump */
            public final void onResponse(retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.DaftarTransferResponse>> r4, retrofit2.Response<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.DaftarTransferResponse>> r5) {
                /*
                    r3 = this;
                    r0 = r5
                    boolean r0 = r0.isSuccessful()
                    if (r0 == 0) goto L_0x008f
                    r0 = r5
                    java.lang.Object r0 = r0.body()
                    o.OpenAccountSuccessActivity r0 = (o.OpenAccountSuccessActivity) r0
                    r6 = r0
                    r0 = r6
                    o.detailRTGSCNY r0 = r0.c
                    r4 = r0
                    r0 = r4
                    if (r0 == 0) goto L_0x001b
                    goto L_0x0020
                L_0x001b:
                    r0 = r6
                    o.detailRTGSCNY r0 = r0.b
                    r4 = r0
                L_0x0020:
                    r0 = r4
                    boolean r0 = r0.e()
                    if (r0 != 0) goto L_0x005c
                    r0 = r5
                    java.lang.Object r0 = r0.body()
                    o.OpenAccountSuccessActivity r0 = (o.OpenAccountSuccessActivity) r0
                    r6 = r0
                    r0 = r6
                    o.detailRTGSCNY r0 = r0.c
                    r4 = r0
                    r0 = r4
                    if (r0 == 0) goto L_0x003b
                    goto L_0x0040
                L_0x003b:
                    r0 = r6
                    o.detailRTGSCNY r0 = r0.b
                    r4 = r0
                L_0x0040:
                    r0 = r4
                    java.lang.String r0 = r0.a
                    r6 = r0
                    r0 = r6
                    if (r0 == 0) goto L_0x004e
                    r0 = r6
                    r4 = r0
                    goto L_0x0053
                L_0x004e:
                    r0 = r4
                    java.lang.String r0 = r0.c
                    r4 = r0
                L_0x0053:
                    r0 = r4
                    java.lang.String r1 = "MID-09-111"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x008f
                L_0x005c:
                    r0 = r3
                    com.bca.smartbranch.presenter.InquiryEditDataORPresenter r0 = com.bca.smartbranch.presenter.InquiryEditDataORPresenter.this
                    r6 = r0
                    r0 = r5
                    java.lang.Object r0 = r0.body()
                    o.OpenAccountSuccessActivity r0 = (o.OpenAccountSuccessActivity) r0
                    r5 = r0
                    r0 = r5
                    T r0 = r0.d
                    r4 = r0
                    r0 = r4
                    if (r0 == 0) goto L_0x0075
                    goto L_0x0083
                L_0x0075:
                    r0 = r5
                    T r0 = r0.a
                    r4 = r0
                    r0 = r4
                    if (r0 == 0) goto L_0x0081
                    goto L_0x0083
                L_0x0081:
                    r0 = 0
                    r4 = r0
                L_0x0083:
                    r0 = r6
                    r1 = r4
                    com.bca.smartbranch.data.api.response.DaftarTransferResponse r1 = (com.bca.smartbranch.data.api.response.DaftarTransferResponse) r1
                    java.util.List r1 = r1.getDaftarTransferOutputList()
                    java.util.List r0 = com.bca.smartbranch.presenter.InquiryEditDataORPresenter.a(r0, r1)
                L_0x008f:
                    r0 = r3
                    com.bca.smartbranch.presenter.InquiryEditDataORPresenter r0 = com.bca.smartbranch.presenter.InquiryEditDataORPresenter.this
                    com.bca.smartbranch.data.localdb.User r0 = com.bca.smartbranch.presenter.InquiryEditDataORPresenter.b(r0)
                    java.lang.String r0 = r0.getVerified()
                    java.lang.String r1 = "Y"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x00a9
                    r0 = r3
                    com.bca.smartbranch.presenter.InquiryEditDataORPresenter r0 = com.bca.smartbranch.presenter.InquiryEditDataORPresenter.this
                    com.bca.smartbranch.presenter.InquiryEditDataORPresenter.o(r0)
                    return
                L_0x00a9:
                    r0 = r3
                    com.bca.smartbranch.presenter.InquiryEditDataORPresenter r0 = com.bca.smartbranch.presenter.InquiryEditDataORPresenter.this
                    com.bca.smartbranch.presenter.InquiryEditDataORPresenter.m(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.presenter.InquiryEditDataORPresenter.AnonymousClass5.onResponse(retrofit2.Call, retrofit2.Response):void");
            }
        });
    }

    static /* synthetic */ void g(InquiryEditDataORPresenter inquiryEditDataORPresenter) {
        inquiryEditDataORPresenter.b.g_();
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding>> g = inquiryEditDataORPresenter.apiService.g(inquiryEditDataORPresenter.j.getTxnDetail().getCountryCode(), inquiryEditDataORPresenter.e);
        inquiryEditDataORPresenter.k = g;
        g.enqueue(new Callback<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding>>() { // from class: com.bca.smartbranch.presenter.InquiryEditDataORPresenter.6
            public final void onFailure(Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding>> call, Throwable th) {
                String str;
                if (InquiryEditDataORPresenter.this.k != null && !InquiryEditDataORPresenter.this.k.isCanceled()) {
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding>> call, Response<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding> body2 = response.body();
                        OutwardRemittanceFormUbahActivity_ViewBinding outwardRemittanceFormUbahActivity_ViewBinding = body2.d;
                        if (outwardRemittanceFormUbahActivity_ViewBinding == null) {
                            outwardRemittanceFormUbahActivity_ViewBinding = body2.a;
                            if (outwardRemittanceFormUbahActivity_ViewBinding == null) {
                                outwardRemittanceFormUbahActivity_ViewBinding = null;
                            }
                        }
                        for (OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer : outwardRemittanceFormUbahActivity_ViewBinding.b) {
                            if (remoteActionCompatParcelizer.c.equals(InquiryEditDataORPresenter.this.j.getTxnDetail().getCurrency())) {
                                InquiryEditDataORPresenter.this.j.getTxnDetail().setCurrencyName(remoteActionCompatParcelizer.a);
                                if (remoteActionCompatParcelizer.b != null) {
                                    InquiryEditDataORPresenter.this.j.getTxnDetail().setLimitMin(remoteActionCompatParcelizer.b);
                                }
                                if (remoteActionCompatParcelizer.e != null) {
                                    InquiryEditDataORPresenter.this.j.getTxnDetail().setLimitMax(remoteActionCompatParcelizer.e);
                                }
                            }
                        }
                        InquiryEditDataORPresenter.j(InquiryEditDataORPresenter.this);
                        return;
                    }
                    OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = InquiryEditDataORPresenter.this.b;
                    OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3.k(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                InquiryEditDataORPresenter.this.b.q(response.message());
            }
        });
    }

    static /* synthetic */ void i(InquiryEditDataORPresenter inquiryEditDataORPresenter) {
        inquiryEditDataORPresenter.b.g_();
        Call<OpenAccountSuccessActivity<detailLCS>> b = inquiryEditDataORPresenter.apiService.b(inquiryEditDataORPresenter.j.getTxnDetail().getReceiverCountry(), inquiryEditDataORPresenter.e);
        inquiryEditDataORPresenter.g = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<detailLCS>>() { // from class: com.bca.smartbranch.presenter.InquiryEditDataORPresenter.7
            public final void onFailure(Call<OpenAccountSuccessActivity<detailLCS>> call, Throwable th) {
                String str;
                if (InquiryEditDataORPresenter.this.g != null && !InquiryEditDataORPresenter.this.g.isCanceled()) {
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<detailLCS>> call, Response<OpenAccountSuccessActivity<detailLCS>> response) {
                detailLCS detaillcs;
                String str;
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<detailLCS> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        detailLCS detaillcs2 = null;
                        detailLCS detaillcs3 = null;
                        if (!InquiryEditDataORPresenter.this.j.getTxnDetail().getCountryCode().equals("AU") || !InquiryEditDataORPresenter.this.j.getTxnDetail().getProduct().equals("F")) {
                            OpenAccountSuccessActivity<detailLCS> body2 = response.body();
                            detaillcs2 = body2.d;
                            if (detaillcs2 == null && (detaillcs = body2.a) != null) {
                                detaillcs2 = detaillcs;
                            }
                            for (detailLCS.read read : detaillcs2.a) {
                                if (read.e.equals(InquiryEditDataORPresenter.this.j.getTxnDetail().getReceiverStates())) {
                                    InquiryEditDataORPresenter.this.j.getTxnDetail().setReceiverStates(read.e);
                                    InquiryEditDataORPresenter.this.j.getTxnDetail().setReceiverStatesName(read.b);
                                }
                                if (read.e.equals(InquiryEditDataORPresenter.this.j.getTxnDetail().getBankStates())) {
                                    InquiryEditDataORPresenter.this.j.getTxnDetail().setBankStates(read.e);
                                    InquiryEditDataORPresenter.this.j.getTxnDetail().setBankStatesName(read.b);
                                }
                            }
                        } else {
                            if (!InquiryEditDataORPresenter.this.j.getTxnDetail().getAddress2().isEmpty()) {
                                String[] split = InquiryEditDataORPresenter.this.j.getTxnDetail().getAddress2().split("/");
                                str = split[split.length - 1];
                            } else {
                                str = "";
                            }
                            OpenAccountSuccessActivity<detailLCS> body3 = response.body();
                            detailLCS detaillcs4 = body3.d;
                            if (detaillcs4 != null) {
                                detaillcs3 = detaillcs4;
                            } else {
                                detailLCS detaillcs5 = body3.a;
                                if (detaillcs5 != null) {
                                    detaillcs3 = detaillcs5;
                                }
                            }
                            for (detailLCS.read read2 : detaillcs3.a) {
                                if (read2.e.equals(str)) {
                                    InquiryEditDataORPresenter.this.j.getTxnDetail().setReceiverStates(read2.e);
                                    InquiryEditDataORPresenter.this.j.getTxnDetail().setReceiverStatesName(read2.b);
                                }
                                if (read2.e.equals(InquiryEditDataORPresenter.this.j.getTxnDetail().getBankStates())) {
                                    InquiryEditDataORPresenter.this.j.getTxnDetail().setBankStates(read2.e);
                                    InquiryEditDataORPresenter.this.j.getTxnDetail().setBankStatesName(read2.b);
                                }
                            }
                        }
                        InquiryEditDataORPresenter.k(InquiryEditDataORPresenter.this);
                        return;
                    }
                    OpenAccountSuccessActivity<detailLCS> body4 = response.body();
                    detailRTGSCNY detailrtgscny2 = body4.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body4.b;
                    }
                    String str2 = detailrtgscny2.a;
                    if ((str2 != null ? str2 : detailrtgscny2.c).equals("MID-00-898")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<detailLCS> body5 = response.body();
                        detailRTGSCNY detailrtgscny3 = body5.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<detailLCS> body6 = response.body();
                    detailRTGSCNY detailrtgscny4 = body6.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body6.b;
                    }
                    String str3 = detailrtgscny4.a;
                    if ((str3 != null ? str3 : detailrtgscny4.c).equals("MID-00-899")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<detailLCS> body7 = response.body();
                        detailRTGSCNY detailrtgscny5 = body7.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body7.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = InquiryEditDataORPresenter.this.b;
                    OpenAccountSuccessActivity<detailLCS> body8 = response.body();
                    detailRTGSCNY detailrtgscny6 = body8.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body8.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3.k(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver4 = InquiryEditDataORPresenter.this.b;
                OpenAccountSuccessActivity<detailLCS> body9 = response.body();
                detailRTGSCNY detailrtgscny7 = body9.c;
                if (detailrtgscny7 == null) {
                    detailrtgscny7 = body9.b;
                }
                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver4 = detailrtgscny7.e;
                inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver4.q(detailrtgscny_mediabrowsercompat_customactionresultreceiver4 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver4.c : detailrtgscny7.b);
            }
        });
    }

    static /* synthetic */ void j(InquiryEditDataORPresenter inquiryEditDataORPresenter) {
        inquiryEditDataORPresenter.b.g_();
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity>> b = inquiryEditDataORPresenter.apiService.b(inquiryEditDataORPresenter.e);
        inquiryEditDataORPresenter.h = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity>>() { // from class: com.bca.smartbranch.presenter.InquiryEditDataORPresenter.10
            public final void onFailure(Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity>> call, Throwable th) {
                String str;
                if (InquiryEditDataORPresenter.this.h != null && !InquiryEditDataORPresenter.this.h.isCanceled()) {
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity>> call, Response<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity> body2 = response.body();
                        OutwardRemittanceFormUbahActivity outwardRemittanceFormUbahActivity = body2.d;
                        if (outwardRemittanceFormUbahActivity == null) {
                            outwardRemittanceFormUbahActivity = body2.a;
                            if (outwardRemittanceFormUbahActivity == null) {
                                outwardRemittanceFormUbahActivity = null;
                            }
                        }
                        for (OutwardRemittanceFormUbahActivity.write write : outwardRemittanceFormUbahActivity.a) {
                            if (write.b.equals(InquiryEditDataORPresenter.this.j.getTxnDetail().getCountryCode())) {
                                InquiryEditDataORPresenter.this.j.getTxnDetail().setCountryName(write.a);
                                InquiryEditDataORPresenter.this.j.getTxnDetail().setFlag_iban(write.e ? "Y" : "N");
                            }
                            if (write.b.equals(InquiryEditDataORPresenter.this.j.getTxnDetail().getReceiverCountry())) {
                                InquiryEditDataORPresenter.this.j.getTxnDetail().setReceiverCountryName(write.a);
                            }
                        }
                        String product = InquiryEditDataORPresenter.this.j.getTxnDetail().getProduct();
                        product.hashCode();
                        if (!product.equals("F")) {
                            if (!product.equals("O")) {
                                InquiryEditDataORPresenter.k(InquiryEditDataORPresenter.this);
                            } else if (InquiryEditDataORPresenter.this.j.getTxnDetail().getReceiverCountry().equals("US")) {
                                InquiryEditDataORPresenter.i(InquiryEditDataORPresenter.this);
                            } else {
                                InquiryEditDataORPresenter.k(InquiryEditDataORPresenter.this);
                            }
                        } else if (InquiryEditDataORPresenter.this.j.getTxnDetail().getCountryCode().equals("US") || InquiryEditDataORPresenter.this.j.getTxnDetail().getCountryCode().equals("AU")) {
                            InquiryEditDataORPresenter.i(InquiryEditDataORPresenter.this);
                        } else {
                            InquiryEditDataORPresenter.k(InquiryEditDataORPresenter.this);
                        }
                    } else {
                        OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity> body3 = response.body();
                        detailRTGSCNY detailrtgscny2 = body3.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body3.b;
                        }
                        String str = detailrtgscny2.a;
                        if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                            InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                            OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity> body4 = response.body();
                            detailRTGSCNY detailrtgscny3 = body4.c;
                            if (detailrtgscny3 == null) {
                                detailrtgscny3 = body4.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                            inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                            return;
                        }
                        OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity> body5 = response.body();
                        detailRTGSCNY detailrtgscny4 = body5.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = body5.b;
                        }
                        String str2 = detailrtgscny4.a;
                        if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                            InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = InquiryEditDataORPresenter.this.b;
                            OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity> body6 = response.body();
                            detailRTGSCNY detailrtgscny5 = body6.c;
                            if (detailrtgscny5 == null) {
                                detailrtgscny5 = body6.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                            inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                            return;
                        }
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity> body7 = response.body();
                        detailRTGSCNY detailrtgscny6 = body7.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = body7.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3.k(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    }
                } else {
                    InquiryEditDataORPresenter.this.b.q(response.message());
                }
            }
        });
    }

    static /* synthetic */ void k(InquiryEditDataORPresenter inquiryEditDataORPresenter) {
        inquiryEditDataORPresenter.b.d(inquiryEditDataORPresenter.j, inquiryEditDataORPresenter.c, inquiryEditDataORPresenter.m, inquiryEditDataORPresenter.a, inquiryEditDataORPresenter.d);
    }

    static /* synthetic */ void m(InquiryEditDataORPresenter inquiryEditDataORPresenter) {
        inquiryEditDataORPresenter.b.g_();
        Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> i = inquiryEditDataORPresenter.apiService.i(inquiryEditDataORPresenter.e);
        inquiryEditDataORPresenter.l = i;
        i.enqueue(new Callback<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>>() { // from class: com.bca.smartbranch.presenter.InquiryEditDataORPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> call, Throwable th) {
                String str;
                if (!InquiryEditDataORPresenter.this.l.isCanceled()) {
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> call, Response<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        InquiryEditDataORPresenter inquiryEditDataORPresenter2 = InquiryEditDataORPresenter.this;
                        OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body2 = response.body();
                        KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse = body2.d;
                        if (kategoriTujuanTransaksiORResponse == null) {
                            kategoriTujuanTransaksiORResponse = body2.a;
                            if (kategoriTujuanTransaksiORResponse == null) {
                                kategoriTujuanTransaksiORResponse = null;
                            }
                        }
                        inquiryEditDataORPresenter2.m = kategoriTujuanTransaksiORResponse;
                        InquiryEditDataORPresenter.p(InquiryEditDataORPresenter.this);
                        return;
                    }
                    OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = InquiryEditDataORPresenter.this.b;
                    OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3.k(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                InquiryEditDataORPresenter.this.b.q(response.message());
            }
        });
    }

    static /* synthetic */ void o(InquiryEditDataORPresenter inquiryEditDataORPresenter) {
        inquiryEditDataORPresenter.b.g_();
        Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> b = inquiryEditDataORPresenter.apiService.b(inquiryEditDataORPresenter.e, inquiryEditDataORPresenter.q.getEmail(), "Transfer Valuta Asing");
        inquiryEditDataORPresenter.f62o = b;
        b.enqueue(new Callback<OpenAccountSuccessActivity<GetCustAcctListResponse>>() { // from class: com.bca.smartbranch.presenter.InquiryEditDataORPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call, Throwable th) {
                String str;
                if (InquiryEditDataORPresenter.this.f62o != null && !InquiryEditDataORPresenter.this.f62o.isCanceled()) {
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call, Response<OpenAccountSuccessActivity<GetCustAcctListResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        InquiryEditDataORPresenter inquiryEditDataORPresenter2 = InquiryEditDataORPresenter.this;
                        OpenAccountSuccessActivity<GetCustAcctListResponse> body2 = response.body();
                        GetCustAcctListResponse getCustAcctListResponse = body2.d;
                        if (getCustAcctListResponse == null) {
                            getCustAcctListResponse = body2.a;
                            if (getCustAcctListResponse == null) {
                                getCustAcctListResponse = null;
                            }
                        }
                        inquiryEditDataORPresenter2.c = getCustAcctListResponse;
                        InquiryEditDataORPresenter.m(InquiryEditDataORPresenter.this);
                        return;
                    }
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<GetCustAcctListResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<GetCustAcctListResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = InquiryEditDataORPresenter.this.b;
                    OpenAccountSuccessActivity<GetCustAcctListResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3.k(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                InquiryEditDataORPresenter.this.b.q(response.message());
            }
        });
    }

    static /* synthetic */ void p(InquiryEditDataORPresenter inquiryEditDataORPresenter) {
        inquiryEditDataORPresenter.b.g_();
        Call<OpenAccountSuccessActivity<TujuanTransaksiORResponse>> m = inquiryEditDataORPresenter.apiService.m(inquiryEditDataORPresenter.e, inquiryEditDataORPresenter.j.getTxnDetail().getTxnPurpose());
        inquiryEditDataORPresenter.n = m;
        m.enqueue(new Callback<OpenAccountSuccessActivity<TujuanTransaksiORResponse>>() { // from class: com.bca.smartbranch.presenter.InquiryEditDataORPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<TujuanTransaksiORResponse>> call, Throwable th) {
                String str;
                if (InquiryEditDataORPresenter.this.n != null && !InquiryEditDataORPresenter.this.n.isCanceled()) {
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.w(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<TujuanTransaksiORResponse>> call, Response<OpenAccountSuccessActivity<TujuanTransaksiORResponse>> response) {
                TujuanTransaksiORResponse tujuanTransaksiORResponse;
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<TujuanTransaksiORResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        OpenAccountSuccessActivity<TujuanTransaksiORResponse> body2 = response.body();
                        TujuanTransaksiORResponse tujuanTransaksiORResponse2 = body2.d;
                        TujuanTransaksiORResponse tujuanTransaksiORResponse3 = null;
                        if (tujuanTransaksiORResponse2 == null) {
                            tujuanTransaksiORResponse2 = body2.a;
                            if (tujuanTransaksiORResponse2 == null) {
                                tujuanTransaksiORResponse2 = null;
                            }
                        }
                        if (!tujuanTransaksiORResponse2.getListData().isEmpty()) {
                            GetTxnTellerDetailResponse.TxnDetail txnDetail = InquiryEditDataORPresenter.this.j.getTxnDetail();
                            OpenAccountSuccessActivity<TujuanTransaksiORResponse> body3 = response.body();
                            TujuanTransaksiORResponse tujuanTransaksiORResponse4 = body3.d;
                            if (tujuanTransaksiORResponse4 == null) {
                                tujuanTransaksiORResponse4 = body3.a;
                                if (tujuanTransaksiORResponse4 == null) {
                                    tujuanTransaksiORResponse4 = null;
                                }
                            }
                            txnDetail.setTxnPurposeValue(tujuanTransaksiORResponse4.getListData().get(0).getSttDesc());
                            GetTxnTellerDetailResponse.TxnDetail txnDetail2 = InquiryEditDataORPresenter.this.j.getTxnDetail();
                            OpenAccountSuccessActivity<TujuanTransaksiORResponse> body4 = response.body();
                            TujuanTransaksiORResponse tujuanTransaksiORResponse5 = body4.d;
                            if (tujuanTransaksiORResponse5 == null) {
                                tujuanTransaksiORResponse5 = body4.a;
                                if (tujuanTransaksiORResponse5 == null) {
                                    tujuanTransaksiORResponse5 = null;
                                }
                            }
                            txnDetail2.setTxnCategoryPurpose(tujuanTransaksiORResponse5.getListData().get(0).getCategorySttCode());
                            GetTxnTellerDetailResponse.TxnDetail txnDetail3 = InquiryEditDataORPresenter.this.j.getTxnDetail();
                            OpenAccountSuccessActivity<TujuanTransaksiORResponse> body5 = response.body();
                            tujuanTransaksiORResponse3 = body5.d;
                            if (tujuanTransaksiORResponse3 == null && (tujuanTransaksiORResponse = body5.a) != null) {
                                tujuanTransaksiORResponse3 = tujuanTransaksiORResponse;
                            }
                            txnDetail3.setTxnCategoryPurposeValue(tujuanTransaksiORResponse3.getListData().get(0).getCategorySttDesc());
                        }
                        InquiryEditDataORPresenter.c(InquiryEditDataORPresenter.this);
                        return;
                    }
                    OpenAccountSuccessActivity<TujuanTransaksiORResponse> body6 = response.body();
                    detailRTGSCNY detailrtgscny2 = body6.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body6.b;
                    }
                    String str = detailrtgscny2.a;
                    if ((str != null ? str : detailrtgscny2.c).equals("MID-00-898")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<TujuanTransaksiORResponse> body7 = response.body();
                        detailRTGSCNY detailrtgscny3 = body7.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body7.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<TujuanTransaksiORResponse> body8 = response.body();
                    detailRTGSCNY detailrtgscny4 = body8.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body8.b;
                    }
                    String str2 = detailrtgscny4.a;
                    if ((str2 != null ? str2 : detailrtgscny4.c).equals("MID-00-899")) {
                        InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = InquiryEditDataORPresenter.this.b;
                        OpenAccountSuccessActivity<TujuanTransaksiORResponse> body9 = response.body();
                        detailRTGSCNY detailrtgscny5 = body9.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body9.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    InquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = InquiryEditDataORPresenter.this.b;
                    OpenAccountSuccessActivity<TujuanTransaksiORResponse> body10 = response.body();
                    detailRTGSCNY detailrtgscny6 = body10.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body10.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    inquiryEditDataORPresenter$MediaBrowserCompat$CustomActionResultReceiver3.k(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                InquiryEditDataORPresenter.this.b.q(response.message());
            }
        });
    }

    public final void a(User user, GetTxnTellerDetailResponse getTxnTellerDetailResponse) {
        this.j = getTxnTellerDetailResponse;
        this.q = user;
        this.e = getPromotion.e(user);
        e(new InfoProductActivity(user.getEmail(), user.getSessionId(), user.getImei(), "Transfer Valuta Asing"));
    }

    public final void d() {
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call = this.i;
        if (call != null) {
            call.cancel();
        }
        Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call2 = this.f62o;
        if (call2 != null) {
            call2.cancel();
        }
        Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> call3 = this.l;
        if (call3 != null) {
            call3.cancel();
        }
        Call<OpenAccountSuccessActivity<TujuanTransaksiORResponse>> call4 = this.n;
        if (call4 != null) {
            call4.cancel();
        }
        Call<OpenAccountSuccessActivity<CategoriesORResponse>> call5 = this.f;
        if (call5 != null) {
            call5.cancel();
        }
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding>> call6 = this.k;
        if (call6 != null) {
            call6.cancel();
        }
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity>> call7 = this.h;
        if (call7 != null) {
            call7.cancel();
        }
        Call<OpenAccountSuccessActivity<detailLCS>> call8 = this.g;
        if (call8 != null) {
            call8.cancel();
        }
        this.b = null;
    }
}
