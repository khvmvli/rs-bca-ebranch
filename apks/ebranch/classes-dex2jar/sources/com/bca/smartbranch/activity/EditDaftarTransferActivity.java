package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.EditDaftarTransferActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DaftarTransferBerhasilDihapusDialog;
import com.bca.smartbranch.dialog.DaftarTransferBerhasilDiupdateDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import o.InfoProductActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.MainActivity;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/EditDaftarTransferActivity.class */
public class EditDaftarTransferActivity extends BaseActivityPostLogin implements UpdateDeleteDaftarTransferPresenter.write {
    @BindView(2131297017)
    EditText etKeterangan;
    @BindView(2131297065)
    EditText etNamaPemilik;
    @BindView(2131297128)
    EditText etNomorRekening;
    private Bundle f;
    @BindView(2131297969)
    LinearLayout lnMain;
    private DaftarTransferResponse.DaftarTransferOutput n;
    private UpdateDeleteDaftarTransferPresenter p;
    @BindString(2131822092)
    String retry;
    @BindView(2131298563)
    LogoutDialog_ViewBinding tilKeterangan;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822320)
    String toolbarTitle;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    /* renamed from: y */
    public void s() {
        this.p.e(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Setoran Tunai"), new MainActivity(this.n.getToken(), this.n.getAccountName(), this.etKeterangan.getText().toString(), this.n.getAccountNumber(), this.n.getReceiverAddress(), this.n.getReceiverCity(), this.n.getCustomerType(), this.n.getIbanFlag(), "", "", "", ""));
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
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

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
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

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(this.toolbarTitle);
        setResult(-1);
        UpdateDeleteDaftarTransferPresenter updateDeleteDaftarTransferPresenter = new UpdateDeleteDaftarTransferPresenter();
        this.p = updateDeleteDaftarTransferPresenter;
        updateDeleteDaftarTransferPresenter.a = this;
        Bundle extras = getIntent().getExtras();
        this.f = extras;
        DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput = (DaftarTransferResponse.DaftarTransferOutput) ListUtil.OneItemImmutableList.a(extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
        this.n = daftarTransferOutput;
        this.etNamaPemilik.setText(daftarTransferOutput.getAccountName());
        this.etKeterangan.setText(this.n.getAliasName());
        this.etNomorRekening.setText(this.n.getAccountNumber());
        this.tilKeterangan.setHintEnabled(true ^ this.etKeterangan.getText().toString().isEmpty());
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void d(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void l_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: o.CC5STujuanCCTambahanActivity
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditDaftarTransferActivity.this.s();
            }
        }).g();
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        onBackPressed();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        this.p.c();
    }

    @OnFocusChange({2131297017})
    public void onFocusChange(View view, boolean z) {
        if (z) {
            this.tilKeterangan.setHintEnabled(true);
        } else if (this.etKeterangan.getText().toString().isEmpty()) {
            this.tilKeterangan.setHintEnabled(false);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        setResult(0);
        k();
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "EditDaftarTransferActivity";
        this.j = "EditDaftarTransferActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492946;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296450})
    public void simpan() {
        s();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void t() {
        x();
        DaftarTransferBerhasilDihapusDialog daftarTransferBerhasilDihapusDialog = new DaftarTransferBerhasilDihapusDialog();
        daftarTransferBerhasilDihapusDialog.setArguments(this.f);
        daftarTransferBerhasilDihapusDialog.show(l(), "DaftarTransferBerhasilDihapusDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void u() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void v() {
        x();
        Intent intent = new Intent();
        intent.putExtra("alias", this.etKeterangan.getText().toString());
        setResult(-1, intent);
        DaftarTransferBerhasilDiupdateDialog daftarTransferBerhasilDiupdateDialog = new DaftarTransferBerhasilDiupdateDialog();
        daftarTransferBerhasilDiupdateDialog.setArguments(this.f);
        daftarTransferBerhasilDiupdateDialog.show(l(), "DaftarTransferBerhasilDiupdateDialog");
    }
}
