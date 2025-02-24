package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/BranchDetailPresenter.class */
public class BranchDetailPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity>> c;
    public RemoteActionCompatParcelizer d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/BranchDetailPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a(String str);

        void c(String str);

        void d(String str);

        void d(OutwardRemittanceFormActivity outwardRemittanceFormActivity);

        void e(String str);

        void h(String str);
    }

    public BranchDetailPresenter() {
        App.d().d(this);
    }
}
