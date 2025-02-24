package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetTxnTellerDetailKUPresenter.class */
public class GetTxnTellerDetailKUPresenter {
    public write a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<GetTxnTellerDetailKUResponse>> c;
    private String d = "";

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetTxnTellerDetailKUPresenter$write.class */
    public interface write {
        void C(String str);

        void b(GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse);

        void b(String str);

        void b_(String str);

        void g_();

        void l(String str);

        void x(String str);
    }

    public GetTxnTellerDetailKUPresenter() {
        App.d().d(this);
    }
}
