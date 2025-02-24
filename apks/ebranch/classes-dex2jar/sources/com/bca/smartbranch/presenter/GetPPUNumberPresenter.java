package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.GetPPUNumberResponse;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetPPUNumberPresenter.class */
public class GetPPUNumberPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read b;
    public Call<OpenAccountSuccessActivity<GetPPUNumberResponse>> c;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/GetPPUNumberPresenter$read.class */
    public interface read {
        void b(GetPPUNumberResponse getPPUNumberResponse);

        void d(String str);

        void e(String str);

        @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
        void g(String str);

        @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read, com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
        void u();
    }

    public GetPPUNumberPresenter() {
        App.d().e(this);
    }
}
