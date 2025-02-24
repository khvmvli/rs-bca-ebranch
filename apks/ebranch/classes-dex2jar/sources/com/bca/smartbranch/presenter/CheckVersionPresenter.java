package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.OpenCCSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckVersionPresenter.class */
public class CheckVersionPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RemoteActionCompatParcelizer c;
    public Call<OpenAccountSuccessActivity<OpenCCSuccessActivity>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckVersionPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        @Override // com.bca.smartbranch.presenter.CheckCutOffPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        void c(OpenCCSuccessActivity openCCSuccessActivity);

        @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read, com.bca.smartbranch.presenter.CheckCutOffPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
        void g_();

        void j(String str);

        void l(String str);
    }

    public CheckVersionPresenter() {
        App.d().b(this);
    }
}
