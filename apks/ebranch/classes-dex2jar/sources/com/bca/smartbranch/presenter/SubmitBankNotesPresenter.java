package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.SubmitBankNotesResponse;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/SubmitBankNotesPresenter.class */
public class SubmitBankNotesPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public RemoteActionCompatParcelizer c;
    public Call<OpenAccountSuccessActivity<SubmitBankNotesResponse>> d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/SubmitBankNotesPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a(SubmitBankNotesResponse submitBankNotesResponse);

        @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
        void b(String str);

        void e(String str);

        void f(String str);

        @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
        void h(String str);

        void i(String str);

        @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
        void i_();
    }

    public SubmitBankNotesPresenter() {
        App.d().c(this);
    }
}
