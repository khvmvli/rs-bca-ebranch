package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.StockListBNResponse;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAvailableBranchPresenter.class */
public class GetAvailableBranchPresenter {
    public write a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<StockListBNResponse>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAvailableBranchPresenter$write.class */
    public interface write {
        void b(String str);

        void d(String str);

        void e(String str);

        void e(List<StockListBNResponse.StockBranch> list);

        void f(String str);

        void h(String str);

        void i_();

        void j(String str);
    }

    public GetAvailableBranchPresenter() {
        App.d().c(this);
    }
}
