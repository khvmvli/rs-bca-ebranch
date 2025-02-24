package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateReceiverDataPresenter.class */
public class UpdateReceiverDataPresenter {
    public IconCompatParcelizer a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity> b;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/UpdateReceiverDataPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void t();

        void v();
    }

    public UpdateReceiverDataPresenter() {
        App.d().d(this);
    }
}
