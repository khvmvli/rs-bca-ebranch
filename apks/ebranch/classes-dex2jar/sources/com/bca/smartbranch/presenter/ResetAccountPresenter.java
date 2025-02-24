package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/ResetAccountPresenter.class */
public class ResetAccountPresenter {
    public Call<OpenAccountSuccessActivity<Object>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public write d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/ResetAccountPresenter$write.class */
    public interface write {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void s();

        void t();

        void y();
    }

    public ResetAccountPresenter() {
        App.d().b(this);
    }
}
