package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceMenuActivity_ViewBinding;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAvailableBookingPresenter.class */
public class GetAvailableBookingPresenter {
    public Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> a;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public IconCompatParcelizer b;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetAvailableBookingPresenter$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        void b(OutwardRemittanceMenuActivity_ViewBinding outwardRemittanceMenuActivity_ViewBinding);

        void f(String str);

        void g(String str);

        void j(String str);

        void k(String str);

        void t();
    }

    public GetAvailableBookingPresenter() {
        App.d().b(this);
    }
}
