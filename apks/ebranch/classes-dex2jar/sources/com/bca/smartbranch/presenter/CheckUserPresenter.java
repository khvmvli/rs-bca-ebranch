package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckUserPresenter.class */
public class CheckUserPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RemoteActionCompatParcelizer b;
    public Call<OpenAccountSuccessActivity<Object>> d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CheckUserPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
    }

    public CheckUserPresenter() {
        App.d().b(this);
    }
}
