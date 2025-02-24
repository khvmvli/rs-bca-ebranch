package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import o.simpanGallery;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/ApplyCCPresenter.class */
public class ApplyCCPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<simpanGallery>> b;
    public RemoteActionCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/ApplyCCPresenter$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void b(String str);

        @Override // com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
        void c(String str);

        void c(simpanGallery simpangallery);

        void d(String str);

        @Override // com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer
        void e();

        void i(String str);

        void j(String str);
    }

    public ApplyCCPresenter() {
        App.d().a(this);
    }
}
