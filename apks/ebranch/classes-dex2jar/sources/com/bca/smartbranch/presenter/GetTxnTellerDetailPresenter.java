package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetTxnTellerDetailPresenter.class */
public class GetTxnTellerDetailPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    private Call<OpenAccountSuccessActivity<DetailTransactionResponse>> b;
    public RemoteActionCompatParcelizer c;
    public Call<OpenAccountSuccessActivity<GetTxnTellerDetailResponse>> d;
    private String e = "";

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetTxnTellerDetailPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
        void C(String str);

        void b(String str);

        void b_(String str);

        void e(GetTxnTellerDetailResponse getTxnTellerDetailResponse);

        @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
        void g_();

        @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
        void l(String str);

        @Override // com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter.write
        void x(String str);
    }

    public GetTxnTellerDetailPresenter() {
        App.d().c(this);
    }

    public final void e() {
        Call<OpenAccountSuccessActivity<GetTxnTellerDetailResponse>> call = this.d;
        if (call != null) {
            call.cancel();
        }
        Call<OpenAccountSuccessActivity<DetailTransactionResponse>> call2 = this.b;
        if (call2 != null) {
            call2.cancel();
        }
        this.c = null;
    }
}
