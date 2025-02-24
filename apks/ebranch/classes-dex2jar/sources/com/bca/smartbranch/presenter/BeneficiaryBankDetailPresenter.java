package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.OpenAccountSuccessActivity_ViewBinding;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/BeneficiaryBankDetailPresenter.class */
public class BeneficiaryBankDetailPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public write d;
    public Call<OpenAccountSuccessActivity<OpenAccountSuccessActivity_ViewBinding>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/BeneficiaryBankDetailPresenter$write.class */
    public interface write {
        @Override // com.bca.smartbranch.presenter.InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        void b(String str);

        @Override // com.bca.smartbranch.presenter.InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        void b_(String str);

        void c(OpenAccountSuccessActivity_ViewBinding openAccountSuccessActivity_ViewBinding);

        void d();

        void g(String str);

        void h(String str);

        void i(String str);
    }

    public BeneficiaryBankDetailPresenter() {
        App.d().a(this);
    }
}
