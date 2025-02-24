package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DeleteTxnBerkalaPresenter.class */
public class DeleteTxnBerkalaPresenter {
    public Call<OpenAccountSuccessActivity<Object>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DeleteTxnBerkalaPresenter$read.class */
    public interface read {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void t();

        void u();
    }

    public DeleteTxnBerkalaPresenter() {
        App.d().d(this);
    }
}
