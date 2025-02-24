package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.detailKirimanUangNormal;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetCurrenciesBNPresenter.class */
public class GetCurrenciesBNPresenter {
    public Call<OpenAccountSuccessActivity<detailKirimanUangNormal>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public GetCurrenciesBNPresenter$MediaBrowserCompat$CustomActionResultReceiver d;

    public GetCurrenciesBNPresenter() {
        App.d().b(this);
    }
}
