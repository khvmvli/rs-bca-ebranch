package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DeleteTxnBerkalaDraftPresenter.class */
public class DeleteTxnBerkalaDraftPresenter {
    public IconCompatParcelizer a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<Object>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DeleteTxnBerkalaDraftPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void D(String str);

        void I(String str);

        void b(String str);

        void b_(String str);

        void d();

        @Override // com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
        void g_();

        void z(String str);
    }

    public DeleteTxnBerkalaDraftPresenter() {
        App.d().b(this);
    }
}
