package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetFundPurposePresenter.class */
public class GetFundPurposePresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> c;
    public IconCompatParcelizer e;
    String[] b = null;
    String[] a = null;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetFundPurposePresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void A(String str);

        void a_(String str);

        void b(String str);

        void b_(String str);

        void e(MasterFundSourcePurposeResponse masterFundSourcePurposeResponse);

        void g_();

        void m(String str);
    }

    public GetFundPurposePresenter() {
        App.d().b(this);
    }

    static /* synthetic */ void d(GetFundPurposePresenter getFundPurposePresenter) {
        String[] strArr;
        String[] strArr2 = getFundPurposePresenter.b;
        if (strArr2 != null && strArr2.length > 0 && (strArr = getFundPurposePresenter.a) != null && strArr.length > 0) {
            MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = new MasterFundSourcePurposeResponse();
            masterFundSourcePurposeResponse.setFundSource(getFundPurposePresenter.b);
            masterFundSourcePurposeResponse.setTransactionPurpose(getFundPurposePresenter.a);
            IconCompatParcelizer iconCompatParcelizer = getFundPurposePresenter.e;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.e(masterFundSourcePurposeResponse);
            }
        }
    }

    static /* synthetic */ void e(GetFundPurposePresenter getFundPurposePresenter, String str, String str2) {
        Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> f = getFundPurposePresenter.apiService.f(str, str2);
        getFundPurposePresenter.c = f;
        f.enqueue(new Callback<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>>() { // from class: com.bca.smartbranch.presenter.GetFundPurposePresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call, Throwable th) {
                String str3;
                if (GetFundPurposePresenter.this.c != null && !GetFundPurposePresenter.this.c.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = GetFundPurposePresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str3 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str3 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.a_(str3);
                    }
                    str3 = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.a_(str3);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call, Response<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body2 = response.body();
                        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = body2.d;
                        if (masterFundSourcePurposeResponse == null) {
                            masterFundSourcePurposeResponse = body2.a;
                            if (masterFundSourcePurposeResponse == null) {
                                masterFundSourcePurposeResponse = null;
                            }
                        }
                        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse2 = masterFundSourcePurposeResponse;
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < masterFundSourcePurposeResponse2.getCategories().size(); i++) {
                            arrayList.add(masterFundSourcePurposeResponse2.getCategories().get(i).getContentIn());
                        }
                        if (!arrayList.isEmpty()) {
                            try {
                                GetFundPurposePresenter.this.a = null;
                                GetFundPurposePresenter.this.a = (String[]) arrayList.toArray(new String[arrayList.size()]);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (GetFundPurposePresenter.this.a.length > 0) {
                            GetFundPurposePresenter.d(GetFundPurposePresenter.this);
                        } else {
                            GetFundPurposePresenter.this.e.m("Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.");
                        }
                    } else {
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body3 = response.body();
                        detailRTGSCNY detailrtgscny2 = body3.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body3.b;
                        }
                        String str3 = detailrtgscny2.a;
                        if ((str3 != null ? str3 : detailrtgscny2.c).equals("MID-00-898")) {
                            IconCompatParcelizer iconCompatParcelizer = GetFundPurposePresenter.this.e;
                            OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body4 = response.body();
                            detailRTGSCNY detailrtgscny3 = body4.c;
                            if (detailrtgscny3 == null) {
                                detailrtgscny3 = body4.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                            iconCompatParcelizer.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                            return;
                        }
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body5 = response.body();
                        detailRTGSCNY detailrtgscny4 = body5.c;
                        if (detailrtgscny4 == null) {
                            detailrtgscny4 = body5.b;
                        }
                        String str4 = detailrtgscny4.a;
                        if ((str4 != null ? str4 : detailrtgscny4.c).equals("MID-00-899")) {
                            IconCompatParcelizer iconCompatParcelizer2 = GetFundPurposePresenter.this.e;
                            OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body6 = response.body();
                            detailRTGSCNY detailrtgscny5 = body6.c;
                            if (detailrtgscny5 == null) {
                                detailrtgscny5 = body6.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                            iconCompatParcelizer2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                            return;
                        }
                        IconCompatParcelizer iconCompatParcelizer3 = GetFundPurposePresenter.this.e;
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body7 = response.body();
                        detailRTGSCNY detailrtgscny6 = body7.c;
                        if (detailrtgscny6 == null) {
                            detailrtgscny6 = body7.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                        iconCompatParcelizer3.m(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    }
                } else {
                    GetFundPurposePresenter.this.e.A(response.message());
                }
            }
        });
    }

    public void b(final String str, final String str2, boolean z) {
        this.b = null;
        this.a = null;
        if (z) {
            this.c = this.apiService.i(str, str2);
        } else {
            this.c = this.apiService.j(str, str2);
        }
        this.c.enqueue(new Callback<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>>() { // from class: com.bca.smartbranch.presenter.GetFundPurposePresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call, Throwable th) {
                String str3;
                if (GetFundPurposePresenter.this.c != null && !GetFundPurposePresenter.this.c.isCanceled()) {
                    IconCompatParcelizer iconCompatParcelizer = GetFundPurposePresenter.this.e;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str3 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str3 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        iconCompatParcelizer.a_(str3);
                    }
                    str3 = "Oops! Terjadi kesalahan.";
                    iconCompatParcelizer.a_(str3);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call, Response<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body2 = response.body();
                        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = body2.d;
                        if (masterFundSourcePurposeResponse == null) {
                            masterFundSourcePurposeResponse = body2.a;
                            if (masterFundSourcePurposeResponse == null) {
                                masterFundSourcePurposeResponse = null;
                            }
                        }
                        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse2 = masterFundSourcePurposeResponse;
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < masterFundSourcePurposeResponse2.getCategories().size(); i++) {
                            arrayList.add(masterFundSourcePurposeResponse2.getCategories().get(i).getContentIn());
                        }
                        if (!arrayList.isEmpty()) {
                            try {
                                GetFundPurposePresenter.this.b = null;
                                GetFundPurposePresenter.this.b = (String[]) arrayList.toArray(new String[arrayList.size()]);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (GetFundPurposePresenter.this.b.length > 0) {
                            GetFundPurposePresenter.e(GetFundPurposePresenter.this, str, str2);
                            GetFundPurposePresenter.d(GetFundPurposePresenter.this);
                            return;
                        }
                        GetFundPurposePresenter.this.e.m("Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.");
                        return;
                    }
                    OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    String str3 = detailrtgscny2.a;
                    if ((str3 != null ? str3 : detailrtgscny2.c).equals("MID-00-898")) {
                        IconCompatParcelizer iconCompatParcelizer = GetFundPurposePresenter.this.e;
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body4 = response.body();
                        detailRTGSCNY detailrtgscny3 = body4.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = body4.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        iconCompatParcelizer.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
                    OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body5 = response.body();
                    detailRTGSCNY detailrtgscny4 = body5.c;
                    if (detailrtgscny4 == null) {
                        detailrtgscny4 = body5.b;
                    }
                    String str4 = detailrtgscny4.a;
                    if ((str4 != null ? str4 : detailrtgscny4.c).equals("MID-00-899")) {
                        IconCompatParcelizer iconCompatParcelizer2 = GetFundPurposePresenter.this.e;
                        OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body6 = response.body();
                        detailRTGSCNY detailrtgscny5 = body6.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = body6.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        iconCompatParcelizer2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    IconCompatParcelizer iconCompatParcelizer3 = GetFundPurposePresenter.this.e;
                    OpenAccountSuccessActivity<MasterFundSourcePurposeResponse> body7 = response.body();
                    detailRTGSCNY detailrtgscny6 = body7.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = body7.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    iconCompatParcelizer3.m(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                GetFundPurposePresenter.this.e.A(response.message());
            }
        });
    }
}
