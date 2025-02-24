package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetHBPresenter.class */
public class GetHBPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<Object>> b;
    public write e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetHBPresenter$write.class */
    public interface write {
    }

    public GetHBPresenter() {
        App.d().b(this);
    }
}
