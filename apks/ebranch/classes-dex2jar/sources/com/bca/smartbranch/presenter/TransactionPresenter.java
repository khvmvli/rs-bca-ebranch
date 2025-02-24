package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.onCreditCardRedirect;
import o.onTakePicture;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/TransactionPresenter.class */
public class TransactionPresenter {
    private Call<OpenAccountSuccessActivity<onTakePicture>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    private Call<OpenAccountSuccessActivity<onTakePicture>> b;
    public TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver d;

    public TransactionPresenter() {
        App.d().e(this);
    }

    public final void c() {
        Call<OpenAccountSuccessActivity<onTakePicture>> call = this.b;
        if (call != null) {
            call.cancel();
        }
        Call<OpenAccountSuccessActivity<onTakePicture>> call2 = this.a;
        if (call2 != null) {
            call2.cancel();
        }
        this.d = null;
    }

    public final void d(String str, onCreditCardRedirect oncreditcardredirect) {
        this.d.s();
        Call<OpenAccountSuccessActivity<onTakePicture>> o2 = this.apiService.o(str, oncreditcardredirect.a);
        this.b = o2;
        o2.enqueue(new Callback<OpenAccountSuccessActivity<onTakePicture>>() { // from class: com.bca.smartbranch.presenter.TransactionPresenter.4
            public final void onFailure(Call<OpenAccountSuccessActivity<onTakePicture>> call, Throwable th) {
                String str2;
                if (TransactionPresenter.this.b != null && !TransactionPresenter.this.b.isCanceled()) {
                    TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver transactionPresenter$MediaBrowserCompat$CustomActionResultReceiver = TransactionPresenter.this.d;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str2 = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str2 = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        transactionPresenter$MediaBrowserCompat$CustomActionResultReceiver.a_(str2);
                    }
                    str2 = "Oops! Terjadi kesalahan.";
                    transactionPresenter$MediaBrowserCompat$CustomActionResultReceiver.a_(str2);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<onTakePicture>> call, Response<OpenAccountSuccessActivity<onTakePicture>> response) {
                onTakePicture ontakepicture;
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<onTakePicture> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (!detailrtgscny.e()) {
                        OpenAccountSuccessActivity<onTakePicture> body2 = response.body();
                        detailRTGSCNY detailrtgscny2 = body2.c;
                        if (detailrtgscny2 == null) {
                            detailrtgscny2 = body2.b;
                        }
                        String str2 = detailrtgscny2.a;
                        if (!(str2 != null ? str2 : detailrtgscny2.c).equals("MID-09-111")) {
                            OpenAccountSuccessActivity<onTakePicture> body3 = response.body();
                            detailRTGSCNY detailrtgscny3 = body3.c;
                            if (detailrtgscny3 == null) {
                                detailrtgscny3 = body3.b;
                            }
                            String str3 = detailrtgscny3.a;
                            if ((str3 != null ? str3 : detailrtgscny3.c).equals("MID-00-898")) {
                                TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver transactionPresenter$MediaBrowserCompat$CustomActionResultReceiver = TransactionPresenter.this.d;
                                OpenAccountSuccessActivity<onTakePicture> body4 = response.body();
                                detailRTGSCNY detailrtgscny4 = body4.c;
                                if (detailrtgscny4 == null) {
                                    detailrtgscny4 = body4.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny4.e;
                                transactionPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny4.b);
                                return;
                            }
                            OpenAccountSuccessActivity<onTakePicture> body5 = response.body();
                            detailRTGSCNY detailrtgscny5 = body5.c;
                            if (detailrtgscny5 == null) {
                                detailrtgscny5 = body5.b;
                            }
                            String str4 = detailrtgscny5.a;
                            if ((str4 != null ? str4 : detailrtgscny5.c).equals("MID-00-899")) {
                                TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver transactionPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = TransactionPresenter.this.d;
                                OpenAccountSuccessActivity<onTakePicture> body6 = response.body();
                                detailRTGSCNY detailrtgscny6 = body6.c;
                                if (detailrtgscny6 == null) {
                                    detailrtgscny6 = body6.b;
                                }
                                detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny6.e;
                                transactionPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny6.b);
                                return;
                            }
                            TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver transactionPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = TransactionPresenter.this.d;
                            OpenAccountSuccessActivity<onTakePicture> body7 = response.body();
                            detailRTGSCNY detailrtgscny7 = body7.c;
                            if (detailrtgscny7 == null) {
                                detailrtgscny7 = body7.b;
                            }
                            detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny7.e;
                            transactionPresenter$MediaBrowserCompat$CustomActionResultReceiver3.C_(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny7.b);
                            return;
                        }
                    }
                    TransactionPresenter$MediaBrowserCompat$CustomActionResultReceiver transactionPresenter$MediaBrowserCompat$CustomActionResultReceiver4 = TransactionPresenter.this.d;
                    OpenAccountSuccessActivity<onTakePicture> body8 = response.body();
                    onTakePicture ontakepicture2 = body8.d;
                    onTakePicture ontakepicture3 = null;
                    if (ontakepicture2 == null) {
                        ontakepicture2 = body8.a;
                        if (ontakepicture2 == null) {
                            ontakepicture2 = null;
                        }
                    }
                    List<onTakePicture.write> list = ontakepicture2.a;
                    OpenAccountSuccessActivity<onTakePicture> body9 = response.body();
                    onTakePicture ontakepicture4 = body9.d;
                    if (ontakepicture4 == null) {
                        ontakepicture4 = body9.a;
                        if (ontakepicture4 == null) {
                            ontakepicture4 = null;
                        }
                    }
                    List<onTakePicture.IconCompatParcelizer> list2 = ontakepicture4.e;
                    OpenAccountSuccessActivity<onTakePicture> body10 = response.body();
                    ontakepicture3 = body10.d;
                    if (ontakepicture3 == null && (ontakepicture = body10.a) != null) {
                        ontakepicture3 = ontakepicture;
                    }
                    transactionPresenter$MediaBrowserCompat$CustomActionResultReceiver4.b(list, list2, ontakepicture3.d);
                    return;
                }
                TransactionPresenter.this.d.D_(response.message());
            }
        });
    }
}
