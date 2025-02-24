package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.PhotoCardActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/InquiryBankByBICPresenter.class */
public class InquiryBankByBICPresenter {
    public InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<PhotoCardActivity>> c;

    public InquiryBankByBICPresenter() {
        App.d().a(this);
    }
}
