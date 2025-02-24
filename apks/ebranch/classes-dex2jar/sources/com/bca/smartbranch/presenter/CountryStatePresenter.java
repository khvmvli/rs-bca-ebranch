package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.detailLCS;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CountryStatePresenter.class */
public class CountryStatePresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RemoteActionCompatParcelizer b;
    public Call<OpenAccountSuccessActivity<detailLCS>> d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/CountryStatePresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a(String str);

        void a(detailLCS detaillcs);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void t();
    }

    public CountryStatePresenter() {
        App.d().d(this);
    }
}
