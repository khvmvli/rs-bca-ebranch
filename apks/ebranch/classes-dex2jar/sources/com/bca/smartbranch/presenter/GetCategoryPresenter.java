package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.CategoryResponse;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.clikedKeyRusak;
import o.detailRTGSCNY;
import o.detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCategoryPresenter.class */
public class GetCategoryPresenter {
    private List<CategoryResponse> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver b;
    private List<CategoryResponse> c;
    private List<CategoryResponse> d;
    public Call<OpenAccountSuccessActivity<clikedKeyRusak>> e;
    private List<CategoryResponse> f;
    private List<CategoryResponse> g;
    private List<CategoryResponse> h;
    private List<CategoryResponse> i;
    private List<CategoryResponse> j;
    private Call<OpenAccountSuccessActivity<clikedKeyRusak>> k;
    private Call<OpenAccountSuccessActivity<clikedKeyRusak>> l;
    private Call<OpenAccountSuccessActivity<clikedKeyRusak>> m;
    private Call<OpenAccountSuccessActivity<clikedKeyRusak>> n;

    /* renamed from: o  reason: collision with root package name */
    private Call<OpenAccountSuccessActivity<clikedKeyRusak>> f61o;
    private Call<OpenAccountSuccessActivity<clikedKeyRusak>> p;
    private Call<OpenAccountSuccessActivity<clikedKeyRusak>> r;

    public GetCategoryPresenter() {
        App.d().b(this);
    }

    static /* synthetic */ void b(GetCategoryPresenter getCategoryPresenter) {
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> e = getCategoryPresenter.apiService.e("homestatus");
        getCategoryPresenter.l = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<clikedKeyRusak>>() { // from class: com.bca.smartbranch.presenter.GetCategoryPresenter.3
            public final void onFailure(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Throwable th) {
                String str;
                if (GetCategoryPresenter.this.l != null && !GetCategoryPresenter.this.l.isCanceled()) {
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Response<OpenAccountSuccessActivity<clikedKeyRusak>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<clikedKeyRusak> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        GetCategoryPresenter getCategoryPresenter2 = GetCategoryPresenter.this;
                        OpenAccountSuccessActivity<clikedKeyRusak> body2 = response.body();
                        clikedKeyRusak clikedkeyrusak = body2.d;
                        if (clikedkeyrusak == null) {
                            clikedkeyrusak = body2.a;
                            if (clikedkeyrusak == null) {
                                clikedkeyrusak = null;
                            }
                        }
                        getCategoryPresenter2.h = clikedkeyrusak.b;
                        GetCategoryPresenter.q(GetCategoryPresenter.this);
                        return;
                    }
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    OpenAccountSuccessActivity<clikedKeyRusak> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.p_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                GetCategoryPresenter.this.b.a(response.message());
            }
        });
    }

    static /* synthetic */ void c(GetCategoryPresenter getCategoryPresenter) {
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> e = getCategoryPresenter.apiService.e("bankname");
        getCategoryPresenter.f61o = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<clikedKeyRusak>>() { // from class: com.bca.smartbranch.presenter.GetCategoryPresenter.2
            public final void onFailure(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Throwable th) {
                String str;
                if (GetCategoryPresenter.this.f61o != null && !GetCategoryPresenter.this.f61o.isCanceled()) {
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Response<OpenAccountSuccessActivity<clikedKeyRusak>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<clikedKeyRusak> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        GetCategoryPresenter getCategoryPresenter2 = GetCategoryPresenter.this;
                        OpenAccountSuccessActivity<clikedKeyRusak> body2 = response.body();
                        clikedKeyRusak clikedkeyrusak = body2.d;
                        if (clikedkeyrusak == null) {
                            clikedkeyrusak = body2.a;
                            if (clikedkeyrusak == null) {
                                clikedkeyrusak = null;
                            }
                        }
                        getCategoryPresenter2.d = clikedkeyrusak.b;
                        GetCategoryPresenter.j(GetCategoryPresenter.this);
                        return;
                    }
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    OpenAccountSuccessActivity<clikedKeyRusak> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.p_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                GetCategoryPresenter.this.b.a(response.message());
            }
        });
    }

    static /* synthetic */ void f(GetCategoryPresenter getCategoryPresenter) {
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> e = getCategoryPresenter.apiService.e("relationship");
        getCategoryPresenter.r = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<clikedKeyRusak>>() { // from class: com.bca.smartbranch.presenter.GetCategoryPresenter.9
            public final void onFailure(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Throwable th) {
                String str;
                if (GetCategoryPresenter.this.r != null && !GetCategoryPresenter.this.r.isCanceled()) {
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Response<OpenAccountSuccessActivity<clikedKeyRusak>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<clikedKeyRusak> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        GetCategoryPresenter getCategoryPresenter2 = GetCategoryPresenter.this;
                        OpenAccountSuccessActivity<clikedKeyRusak> body2 = response.body();
                        clikedKeyRusak clikedkeyrusak = body2.d;
                        if (clikedkeyrusak == null) {
                            clikedkeyrusak = body2.a;
                            if (clikedkeyrusak == null) {
                                clikedkeyrusak = null;
                            }
                        }
                        getCategoryPresenter2.g = clikedkeyrusak.b;
                        GetCategoryPresenter.m(GetCategoryPresenter.this);
                        return;
                    }
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    OpenAccountSuccessActivity<clikedKeyRusak> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.p_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                GetCategoryPresenter.this.b.a(response.message());
            }
        });
    }

    static /* synthetic */ void j(GetCategoryPresenter getCategoryPresenter) {
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> e = getCategoryPresenter.apiService.e("maritalstatus");
        getCategoryPresenter.p = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<clikedKeyRusak>>() { // from class: com.bca.smartbranch.presenter.GetCategoryPresenter.8
            public final void onFailure(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Throwable th) {
                String str;
                if (GetCategoryPresenter.this.p != null && !GetCategoryPresenter.this.p.isCanceled()) {
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Response<OpenAccountSuccessActivity<clikedKeyRusak>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<clikedKeyRusak> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        GetCategoryPresenter getCategoryPresenter2 = GetCategoryPresenter.this;
                        OpenAccountSuccessActivity<clikedKeyRusak> body2 = response.body();
                        clikedKeyRusak clikedkeyrusak = body2.d;
                        if (clikedkeyrusak == null) {
                            clikedkeyrusak = body2.a;
                            if (clikedkeyrusak == null) {
                                clikedkeyrusak = null;
                            }
                        }
                        getCategoryPresenter2.j = clikedkeyrusak.b;
                        GetCategoryPresenter.f(GetCategoryPresenter.this);
                        return;
                    }
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    OpenAccountSuccessActivity<clikedKeyRusak> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.p_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                GetCategoryPresenter.this.b.a(response.message());
            }
        });
    }

    static /* synthetic */ void m(GetCategoryPresenter getCategoryPresenter) {
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> e = getCategoryPresenter.apiService.e("city");
        getCategoryPresenter.n = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<clikedKeyRusak>>() { // from class: com.bca.smartbranch.presenter.GetCategoryPresenter.6
            public final void onFailure(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Throwable th) {
                String str;
                if (GetCategoryPresenter.this.n != null && !GetCategoryPresenter.this.n.isCanceled()) {
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Response<OpenAccountSuccessActivity<clikedKeyRusak>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<clikedKeyRusak> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        GetCategoryPresenter getCategoryPresenter2 = GetCategoryPresenter.this;
                        OpenAccountSuccessActivity<clikedKeyRusak> body2 = response.body();
                        clikedKeyRusak clikedkeyrusak = body2.d;
                        if (clikedkeyrusak == null) {
                            clikedkeyrusak = body2.a;
                            if (clikedkeyrusak == null) {
                                clikedkeyrusak = null;
                            }
                        }
                        getCategoryPresenter2.c = clikedkeyrusak.b;
                        GetCategoryPresenter.this.b.b(GetCategoryPresenter.this.f, GetCategoryPresenter.this.h, GetCategoryPresenter.this.i, GetCategoryPresenter.this.a, GetCategoryPresenter.this.d, GetCategoryPresenter.this.j, GetCategoryPresenter.this.g, GetCategoryPresenter.this.c);
                        return;
                    }
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    OpenAccountSuccessActivity<clikedKeyRusak> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.p_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                GetCategoryPresenter.this.b.a(response.message());
            }
        });
    }

    static /* synthetic */ void q(GetCategoryPresenter getCategoryPresenter) {
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> e = getCategoryPresenter.apiService.e("education");
        getCategoryPresenter.m = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<clikedKeyRusak>>() { // from class: com.bca.smartbranch.presenter.GetCategoryPresenter.1
            public final void onFailure(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Throwable th) {
                String str;
                if (GetCategoryPresenter.this.m != null && !GetCategoryPresenter.this.m.isCanceled()) {
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Response<OpenAccountSuccessActivity<clikedKeyRusak>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<clikedKeyRusak> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        GetCategoryPresenter getCategoryPresenter2 = GetCategoryPresenter.this;
                        OpenAccountSuccessActivity<clikedKeyRusak> body2 = response.body();
                        clikedKeyRusak clikedkeyrusak = body2.d;
                        if (clikedkeyrusak == null) {
                            clikedkeyrusak = body2.a;
                            if (clikedkeyrusak == null) {
                                clikedkeyrusak = null;
                            }
                        }
                        getCategoryPresenter2.i = clikedkeyrusak.b;
                        GetCategoryPresenter.x(GetCategoryPresenter.this);
                        return;
                    }
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    OpenAccountSuccessActivity<clikedKeyRusak> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.p_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                GetCategoryPresenter.this.b.a(response.message());
            }
        });
    }

    static /* synthetic */ void x(GetCategoryPresenter getCategoryPresenter) {
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> e = getCategoryPresenter.apiService.e("businessfield");
        getCategoryPresenter.k = e;
        e.enqueue(new Callback<OpenAccountSuccessActivity<clikedKeyRusak>>() { // from class: com.bca.smartbranch.presenter.GetCategoryPresenter.5
            public final void onFailure(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Throwable th) {
                String str;
                if (GetCategoryPresenter.this.k != null && !GetCategoryPresenter.this.k.isCanceled()) {
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    if (th != null) {
                        if (th instanceof UnknownHostException) {
                            str = "Kamu tidak terhubung dengan koneksi internet. Pastikan koneksi internet tersedia.";
                        } else if (th instanceof SocketTimeoutException) {
                            str = "Sementara transaksi tidak dapat diproses. Silakan ulangi beberapa saat lagi.";
                        }
                        getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                    }
                    str = "Oops! Terjadi kesalahan.";
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.q_(str);
                }
            }

            public final void onResponse(Call<OpenAccountSuccessActivity<clikedKeyRusak>> call, Response<OpenAccountSuccessActivity<clikedKeyRusak>> response) {
                if (response.isSuccessful()) {
                    OpenAccountSuccessActivity<clikedKeyRusak> body = response.body();
                    detailRTGSCNY detailrtgscny = body.c;
                    if (detailrtgscny == null) {
                        detailrtgscny = body.b;
                    }
                    if (detailrtgscny.e()) {
                        GetCategoryPresenter getCategoryPresenter2 = GetCategoryPresenter.this;
                        OpenAccountSuccessActivity<clikedKeyRusak> body2 = response.body();
                        clikedKeyRusak clikedkeyrusak = body2.d;
                        if (clikedkeyrusak == null) {
                            clikedkeyrusak = body2.a;
                            if (clikedkeyrusak == null) {
                                clikedkeyrusak = null;
                            }
                        }
                        getCategoryPresenter2.a = clikedkeyrusak.b;
                        GetCategoryPresenter.c(GetCategoryPresenter.this);
                        return;
                    }
                    GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver = GetCategoryPresenter.this.b;
                    OpenAccountSuccessActivity<clikedKeyRusak> body3 = response.body();
                    detailRTGSCNY detailrtgscny2 = body3.c;
                    if (detailrtgscny2 == null) {
                        detailrtgscny2 = body3.b;
                    }
                    detailRTGSCNY$MediaBrowserCompat$CustomActionResultReceiver detailrtgscny_mediabrowsercompat_customactionresultreceiver = detailrtgscny2.e;
                    getCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver.p_(detailrtgscny_mediabrowsercompat_customactionresultreceiver != null ? detailrtgscny_mediabrowsercompat_customactionresultreceiver.c : detailrtgscny2.b);
                    return;
                }
                GetCategoryPresenter.this.b.a(response.message());
            }
        });
    }

    public final void c() {
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> call = this.e;
        if (call != null) {
            call.cancel();
        }
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> call2 = this.l;
        if (call2 != null) {
            call2.cancel();
        }
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> call3 = this.m;
        if (call3 != null) {
            call3.cancel();
        }
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> call4 = this.k;
        if (call4 != null) {
            call4.cancel();
        }
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> call5 = this.f61o;
        if (call5 != null) {
            call5.cancel();
        }
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> call6 = this.p;
        if (call6 != null) {
            call6.cancel();
        }
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> call7 = this.r;
        if (call7 != null) {
            call7.cancel();
        }
        Call<OpenAccountSuccessActivity<clikedKeyRusak>> call8 = this.n;
        if (call8 != null) {
            call8.cancel();
        }
        this.b = null;
    }
}
