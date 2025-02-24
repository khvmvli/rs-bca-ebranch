package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormUbahActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CountriesORPresenter.class */
public class CountriesORPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public IconCompatParcelizer d;
    public Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CountriesORPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void d(OutwardRemittanceFormUbahActivity outwardRemittanceFormUbahActivity);

        void e(String str);

        void s();
    }

    public CountriesORPresenter() {
        App.d().d(this);
    }
}
