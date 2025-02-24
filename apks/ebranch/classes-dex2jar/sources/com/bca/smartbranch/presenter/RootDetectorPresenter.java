package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/RootDetectorPresenter.class */
public class RootDetectorPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RemoteActionCompatParcelizer b;
    public Call<OpenAccountSuccessActivity<Object>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/RootDetectorPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
    }

    public RootDetectorPresenter() {
        App.d().c(this);
    }
}
