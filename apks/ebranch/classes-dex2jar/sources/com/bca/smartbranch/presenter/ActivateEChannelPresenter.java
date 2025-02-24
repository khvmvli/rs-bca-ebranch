package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.ActivateEChannelResponse;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/ActivateEChannelPresenter.class */
public class ActivateEChannelPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public IconCompatParcelizer b;
    public Call<OpenAccountSuccessActivity<ActivateEChannelResponse>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/ActivateEChannelPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        void b(ActivateEChannelResponse activateEChannelResponse);

        void f(String str);

        void g(String str);

        @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void g_();

        void h(String str);

        void i(String str);

        void u();
    }

    public ActivateEChannelPresenter() {
        App.d().c(this);
    }
}
