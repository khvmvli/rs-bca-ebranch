package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.PenggantianKeyBCAActivity_ViewBinding;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetTxnBerkalaDetailPresenter.class */
public class GetTxnBerkalaDetailPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<PenggantianKeyBCAActivity_ViewBinding>> b;
    public IconCompatParcelizer c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetTxnBerkalaDetailPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void G(String str);

        void M(String str);

        void a(List<PenggantianKeyBCAActivity_ViewBinding.read> list);

        void a_(String str);

        void b(String str);

        void b_(String str);

        @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetCategoryPresenter$MediaBrowserCompat$CustomActionResultReceiver
        void g_();
    }

    public GetTxnBerkalaDetailPresenter() {
        App.d().d(this);
    }
}
