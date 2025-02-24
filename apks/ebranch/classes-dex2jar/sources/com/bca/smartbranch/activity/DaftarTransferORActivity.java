package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.adapter.DaftarTransferORAdapter;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.presenter.DaftarTransferPresenter;
import java.util.ArrayList;
import java.util.List;
import o.InfoProductActivity;
import o.OpenAccountSuccessActivity;
import o.getIncomeDisplayAmount;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DaftarTransferORActivity.class */
public class DaftarTransferORActivity extends BaseActivityPostLogin implements DaftarTransferPresenter.RemoteActionCompatParcelizer {
    @BindString(2131821439)
    String daftarTransfer;
    private DaftarTransferORAdapter f;
    @BindView(2131297634)
    LinearLayout llEmpty;
    @BindView(2131297969)
    LinearLayout lnMain;
    private List<DaftarTransferResponse.DaftarTransferOutput> n = new ArrayList();
    private DaftarTransferPresenter p;
    private ViewAnimator r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298326)
    getIncomeDisplayAmount rvHapusUbahDaftarTransfer;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131821442)
    String toolbarTitle;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299690)
    TextView tvTransaksiEmpty;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        x();
        setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b_(String str) {
        x();
        setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.r = (ViewAnimator) findViewById(2131299749);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(this.toolbarTitle);
        DaftarTransferPresenter daftarTransferPresenter = new DaftarTransferPresenter();
        this.p = daftarTransferPresenter;
        daftarTransferPresenter.c = this;
        this.f = new DaftarTransferORAdapter(this, this.n);
        this.rvHapusUbahDaftarTransfer.setLayoutManager(new LinearLayoutManager(1, false));
        this.tvTransaksiEmpty.setText(this.daftarTransfer);
        this.rvHapusUbahDaftarTransfer.setEmptyView(this.llEmpty);
        this.rvHapusUbahDaftarTransfer.setAdapter(this.f);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        this.r.setDisplayedChild(1);
        this.tvErrorMessage.setText(str);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(List<DaftarTransferResponse.DaftarTransferOutput> list) {
        this.r.setDisplayedChild(0);
        for (DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput : list) {
            if (daftarTransferOutput.getAccountNumber() != null && daftarTransferOutput.getAccountNumber().length() > 34) {
                daftarTransferOutput.setAccountNumber(daftarTransferOutput.getAccountNumber().substring(0, 34));
            }
            this.n.add(daftarTransferOutput);
        }
        DaftarTransferORAdapter daftarTransferORAdapter = this.f;
        daftarTransferORAdapter.e = list;
        daftarTransferORAdapter.a.b();
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e_(String str) {
        this.r.setDisplayedChild(1);
        this.tvErrorMessage.setText(str);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void g_(String str) {
        this.r.setDisplayedChild(1);
        this.tvErrorMessage.setText(str);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DaftarTransferPresenter daftarTransferPresenter = this.p;
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call = daftarTransferPresenter.a;
        if (call != null) {
            call.cancel();
        }
        daftarTransferPresenter.c = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.getView, android.app.Activity
    public void onResume() {
        onResume();
        this.p.d(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Transfer Valuta Asing"), true);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "DaftarTransferORActivity";
        this.j = "DaftarTransferORActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492959;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void s() {
        this.r.setDisplayedChild(2);
    }
}
