package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceMenuActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DaftarTransferBerkalaPresenter.class */
public class DaftarTransferBerkalaPresenter {
    public Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public IconCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/DaftarTransferBerkalaPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(String str);

        void a(List<OutwardRemittanceMenuActivity.IconCompatParcelizer> list);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void s();
    }

    public DaftarTransferBerkalaPresenter() {
        App.d().b(this);
    }
}
