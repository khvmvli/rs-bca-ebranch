package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o.OpenAccountSuccessActivity;
import o.login;
import o.onChooseUlangi;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
import retrofit2.Callback;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/LoginPresenter.class */
public class LoginPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<onChooseUlangi>> c;
    public RemoteActionCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/LoginPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        @Override // com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer
        void a(String str);

        @Override // com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.ReRegistrationPresenter.write
        void a_(String str);

        @Override // com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer
        void b(onChooseUlangi onchooseulangi, boolean z, String str);

        void d(String str);

        @Override // com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer
        void f(String str);

        @Override // com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.ReRegistrationPresenter.write
        void g_();

        @Override // com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer
        void h(String str);

        void i(String str);
    }

    public LoginPresenter() {
        App.d().c(this);
    }

    public final void e(login login) {
        this.e.g_();
        Call<OpenAccountSuccessActivity<onChooseUlangi>> a = this.apiService.a(login);
        this.c = a;
        a.enqueue(new Callback<OpenAccountSuccessActivity<onChooseUlangi>>() { // from class: com.bca.smartbranch.presenter.LoginPresenter.5
            public final void onFailure(Call<OpenAccountSuccessActivity<onChooseUlangi>> call, Throwable th) {
                String str;
                if (LoginPresenter.this.c != null && !LoginPresenter.this.c.isCanceled()) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = LoginPresenter.this.e;
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

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
                if ("000".equalsIgnoreCase(r0.substring(r0.length() - 3)) != false) goto L_0x0048;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
                r9 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
                if ("000".equalsIgnoreCase(r0.substring(r0.length() - 3)) != false) goto L_0x0048;
             */
            /* Code decompiled incorrectly, please refer to instructions dump */
            public final void onResponse(retrofit2.Call<o.OpenAccountSuccessActivity<o.onChooseUlangi>> r6, retrofit2.Response<o.OpenAccountSuccessActivity<o.onChooseUlangi>> r7) {
                /*
                // Method dump skipped, instructions count: 839
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.presenter.LoginPresenter.AnonymousClass5.onResponse(retrofit2.Call, retrofit2.Response):void");
            }
        });
    }
}
