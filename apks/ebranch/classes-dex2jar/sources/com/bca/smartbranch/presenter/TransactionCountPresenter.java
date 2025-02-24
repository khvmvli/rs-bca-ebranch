package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.onTakePicture;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/TransactionCountPresenter.class */
public class TransactionCountPresenter {
    public Call<OpenAccountSuccessActivity<onTakePicture>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read b;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/TransactionCountPresenter$read.class */
    public interface read {
    }

    public TransactionCountPresenter() {
        App.d().d(this);
    }
}
