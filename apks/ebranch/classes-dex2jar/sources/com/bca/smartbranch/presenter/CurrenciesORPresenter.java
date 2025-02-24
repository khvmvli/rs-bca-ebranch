package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormUbahActivity_ViewBinding;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CurrenciesORPresenter.class */
public class CurrenciesORPresenter {
    public Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public IconCompatParcelizer b;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CurrenciesORPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void e(OutwardRemittanceFormUbahActivity_ViewBinding outwardRemittanceFormUbahActivity_ViewBinding);

        void t();
    }

    public CurrenciesORPresenter() {
        App.d().a(this);
    }
}
