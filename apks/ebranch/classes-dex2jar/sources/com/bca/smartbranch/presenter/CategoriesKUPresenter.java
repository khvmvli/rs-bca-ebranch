package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.localdb.User;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.getPromotion;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import o.subscribeReservationRescheduleEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CategoriesKUPresenter.class */
public final class CategoriesKUPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver b;
    public Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> c;
    private final String a = "sumber-dana-ku";
    private final String e = "sumber-dana-ku-badan";
    private final String d = "tujuan-transaksi-ku";
    private List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> j = new ArrayList();
    private List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> i = new ArrayList();
    private String f = "";

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CategoriesKUPresenter$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Callback<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> {
        IconCompatParcelizer() {
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call, Throwable th) {
            CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver;
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            Call call2 = CategoriesKUPresenter.this.c;
            boolean z = false;
            if (call2 != null) {
                z = false;
                if (!call2.isCanceled()) {
                    z = true;
                }
            }
            if (z && (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver = CategoriesKUPresenter.this.b) != null) {
                if (th != null) {
                    if (th instanceof UnknownHostException) {
                        str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                    } else if (th instanceof SocketTimeoutException) {
                        str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                    }
                    categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver.g(str);
                }
                str = "Oops! Terjadi kesalahan.";
                categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver.g(str);
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
                    CategoriesKUPresenter categoriesKUPresenter = CategoriesKUPresenter.this;
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
                    categoriesKUPresenter.j = arrayList;
                    CategoriesKUPresenter.b(CategoriesKUPresenter.this);
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
                    CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver = CategoriesKUPresenter.this.b;
                    if (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver != null) {
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body4 = response.body();
                        subscribeReservationRescheduleEvent.c(body4);
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity3 = body4;
                        detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity3.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = openAccountSuccessActivity3.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
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
                    CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = CategoriesKUPresenter.this.b;
                    if (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body6 = response.body();
                        subscribeReservationRescheduleEvent.c(body6);
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity5 = body6;
                        detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity5.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = openAccountSuccessActivity5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    return;
                }
                CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = CategoriesKUPresenter.this.b;
                if (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver3 != null) {
                    OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body7 = response.body();
                    subscribeReservationRescheduleEvent.c(body7);
                    OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity6 = body7;
                    detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity6.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = openAccountSuccessActivity6.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver3.h(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                return;
            }
            CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver4 = CategoriesKUPresenter.this.b;
            if (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver4 != null) {
                categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver4.m(response.message());
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CategoriesKUPresenter$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements Callback<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> {
        RemoteActionCompatParcelizer() {
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call, Throwable th) {
            CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver;
            String str;
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
            Call call2 = CategoriesKUPresenter.this.c;
            boolean z = false;
            if (call2 != null) {
                z = false;
                if (!call2.isCanceled()) {
                    z = true;
                }
            }
            if (z && (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver = CategoriesKUPresenter.this.b) != null) {
                if (th != null) {
                    if (th instanceof UnknownHostException) {
                        str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                    } else if (th instanceof SocketTimeoutException) {
                        str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                    }
                    categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver.g(str);
                }
                str = "Oops! Terjadi kesalahan.";
                categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver.g(str);
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
                    CategoriesKUPresenter categoriesKUPresenter = CategoriesKUPresenter.this;
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
                    categoriesKUPresenter.i = arrayList;
                    CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver = CategoriesKUPresenter.this.b;
                    if (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver != null) {
                        categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver.c(CategoriesKUPresenter.this.j, CategoriesKUPresenter.this.i);
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
                    CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = CategoriesKUPresenter.this.b;
                    if (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body4 = response.body();
                        subscribeReservationRescheduleEvent.c(body4);
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity3 = body4;
                        detailRTGSCNY detailrtgscny3 = openAccountSuccessActivity3.c;
                        if (detailrtgscny3 == null) {
                            detailrtgscny3 = openAccountSuccessActivity3.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny3.e;
                        categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver2.b_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny3.b);
                        return;
                    }
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
                    CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver3 = CategoriesKUPresenter.this.b;
                    if (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver3 != null) {
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body6 = response.body();
                        subscribeReservationRescheduleEvent.c(body6);
                        OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity5 = body6;
                        detailRTGSCNY detailrtgscny5 = openAccountSuccessActivity5.c;
                        if (detailrtgscny5 == null) {
                            detailrtgscny5 = openAccountSuccessActivity5.b;
                        }
                        detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver2 = detailrtgscny5.e;
                        categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver3.b(detailrtgscny_mediabrowsercompat_customactionresultreceiver2 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver2.c : detailrtgscny5.b);
                        return;
                    }
                    return;
                }
                CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver4 = CategoriesKUPresenter.this.b;
                if (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver4 != null) {
                    OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> body7 = response.body();
                    subscribeReservationRescheduleEvent.c(body7);
                    OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding> openAccountSuccessActivity6 = body7;
                    detailRTGSCNY detailrtgscny6 = openAccountSuccessActivity6.c;
                    if (detailrtgscny6 == null) {
                        detailrtgscny6 = openAccountSuccessActivity6.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver3 = detailrtgscny6.e;
                    categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver4.h(detailrtgscny_mediabrowsercompat_customactionresultreceiver3 != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver3.c : detailrtgscny6.b);
                    return;
                }
                return;
            }
            CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver5 = CategoriesKUPresenter.this.b;
            if (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver5 != null) {
                categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver5.m(response.message());
            }
        }
    }

    public CategoriesKUPresenter() {
        App.d().b(this);
    }

    public static final /* synthetic */ void b(CategoriesKUPresenter categoriesKUPresenter) {
        setIncomeDisplayAmount setincomedisplayamount = categoriesKUPresenter.apiService;
        if (setincomedisplayamount == null) {
            subscribeReservationRescheduleEvent.e("");
            setincomedisplayamount = null;
        }
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> c = setincomedisplayamount.c(categoriesKUPresenter.f, categoriesKUPresenter.d, "Y");
        categoriesKUPresenter.c = c;
        if (c != null) {
            c.enqueue((Callback) new RemoteActionCompatParcelizer());
        }
    }

    private final void e(String str) {
        int hashCode = str.hashCode();
        setIncomeDisplayAmount setincomedisplayamount = null;
        setIncomeDisplayAmount setincomedisplayamount2 = null;
        setIncomeDisplayAmount setincomedisplayamount3 = null;
        if (hashCode != -1205044271) {
            if (hashCode != -803225625) {
                if (hashCode == 255273804 && str.equals("Perusahaan")) {
                    setincomedisplayamount3 = this.apiService;
                    if (setincomedisplayamount3 == null) {
                        subscribeReservationRescheduleEvent.e("");
                    }
                    this.c = setincomedisplayamount3.c(this.f, this.e, "Y");
                }
            } else if (str.equals("Perorangan")) {
                setincomedisplayamount = this.apiService;
                if (setincomedisplayamount == null) {
                    subscribeReservationRescheduleEvent.e("");
                }
                this.c = setincomedisplayamount.c(this.f, this.a, "Y");
            }
        } else if (str.equals("Pemerintah")) {
            setincomedisplayamount2 = this.apiService;
            if (setincomedisplayamount2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            this.c = setincomedisplayamount2.c(this.f, this.e, "Y");
        }
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> call = this.c;
        if (call != null) {
            call.enqueue((Callback) new IconCompatParcelizer());
        }
    }

    public final void a(User user, String str) {
        subscribeReservationRescheduleEvent.e(user, "");
        subscribeReservationRescheduleEvent.e(str, "");
        CategoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver = this.b;
        if (categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver != null) {
            categoriesKUPresenter$MediaBrowserCompat$CustomActionResultReceiver.u();
        }
        String e = getPromotion.e(user);
        subscribeReservationRescheduleEvent.d(e, "");
        this.f = e;
        e(str);
    }
}
