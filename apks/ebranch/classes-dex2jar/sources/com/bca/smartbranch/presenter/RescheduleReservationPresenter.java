package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.CreateReservationResponse;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/RescheduleReservationPresenter.class */
public class RescheduleReservationPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public write c;
    public Call<OpenAccountSuccessActivity<CreateReservationResponse>> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/RescheduleReservationPresenter$write.class */
    public interface write {
        @Override // com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void a_(String str);

        void c(CreateReservationResponse createReservationResponse);

        @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
        void g_();

        void i(String str);

        @Override // com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer
        void j(String str);

        @Override // com.bca.smartbranch.presenter.GetAvailableBookingPresenter.IconCompatParcelizer
        void k(String str);

        void o(String str);
    }

    public RescheduleReservationPresenter() {
        App.d().e(this);
    }
}
