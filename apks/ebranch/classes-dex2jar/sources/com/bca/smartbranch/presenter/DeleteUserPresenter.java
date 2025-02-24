package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DeleteUserPresenter.class */
public class DeleteUserPresenter {
    public read a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<Object>> c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DeleteUserPresenter$read.class */
    public interface read {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void s();

        void u();

        void y();
    }

    public DeleteUserPresenter() {
        App.d().d(this);
    }
}
