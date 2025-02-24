package com.bca.smartbranch.presenter;

import com.bca.smartbranch.App;
import com.bca.smartbranch.data.api.response.TujuanTransaksiORResponse;
import o.OpenAccountSuccessActivity;
import o.onClickNegara;
import o.setIncomeDisplayAmount;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/TujuanTransaksiORPresenter.class */
public class TujuanTransaksiORPresenter {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    public read b;
    public Call<OpenAccountSuccessActivity<TujuanTransaksiORResponse>> d;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/presenter/TujuanTransaksiORPresenter$read.class */
    public interface read {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(TujuanTransaksiORResponse tujuanTransaksiORResponse);

        void e(String str);

        void t();
    }

    public TujuanTransaksiORPresenter() {
        App.d().e(this);
    }
}
