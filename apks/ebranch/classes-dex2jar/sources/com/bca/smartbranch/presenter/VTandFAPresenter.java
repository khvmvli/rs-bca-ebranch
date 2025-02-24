package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.PilihBankPenerbitActivity_ViewBinding;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/VTandFAPresenter.class */
public class VTandFAPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public Call<OpenAccountSuccessActivity<PilihBankPenerbitActivity_ViewBinding>> b;
    public IconCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/VTandFAPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void b();

        @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
        void b(String str);

        @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
        void b_(String str);

        void c(String str);

        void d(String str);

        void d(PilihBankPenerbitActivity_ViewBinding pilihBankPenerbitActivity_ViewBinding);

        void e(String str);
    }

    public VTandFAPresenter() {
        App.d().c(this);
    }
}
