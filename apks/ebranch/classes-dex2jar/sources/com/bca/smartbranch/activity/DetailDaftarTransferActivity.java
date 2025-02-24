package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.DetailDaftarTransferActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DaftarTransferBerhasilDihapusDialog;
import com.bca.smartbranch.dialog.DaftarTransferBerhasilDiupdateDialog;
import com.bca.smartbranch.dialog.HapusDaftarTransferDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import o.ActivityResultRegistry$1;
import o.ComponentActivity$3;
import o.InfoBankingtActivity;
import o.InfoProductActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogoutDialog;
import o.PlaybackStateCompat;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.eventJenisIdentitasPemilikSumberDana;
import o.setCardSlogan;
import o.setCheckable;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailDaftarTransferActivity.class */
public class DetailDaftarTransferActivity extends BaseActivityPostLogin implements UpdateDeleteDaftarTransferPresenter.write {
    @BindView(2131297017)
    LogoutDialog etKeterangan;
    @BindView(2131297065)
    LogoutDialog etNamaPemilik;
    @BindView(2131297128)
    LogoutDialog etNomorRekening;
    ActivityResultRegistry$1<Intent> f = c(new setCheckable.write(), new PlaybackStateCompat.CustomAction<ComponentActivity$3>() { // from class: com.bca.smartbranch.activity.DetailDaftarTransferActivity.2
        @Override // o.PlaybackStateCompat.CustomAction
        public final /* synthetic */ void a(ComponentActivity$3 componentActivity$3) {
            ComponentActivity$3 componentActivity$32 = componentActivity$3;
            if (componentActivity$32.b == -1) {
                Bundle extras = componentActivity$32.c.getExtras();
                DetailDaftarTransferActivity.this.etKeterangan.setText(extras.getString("alias", ""));
                if (extras.getString("alias", "").isEmpty()) {
                    DetailDaftarTransferActivity.this.etKeterangan.setText("-");
                }
                DetailDaftarTransferActivity.this.p.setAliasName(extras.getString("alias", ""));
            }
        }
    });
    @BindView(2131297969)
    LinearLayout lnMain;
    private Bundle n;
    private DaftarTransferResponse.DaftarTransferOutput p;
    @BindString(2131822092)
    String retry;
    private UpdateDeleteDaftarTransferPresenter s;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131821438)
    String toolbarTitle;
    @BindView(2131299724)
    TextView tvUbahKeterangan;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    /* renamed from: y */
    public void s() {
        this.s.b(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Setoran Tunai"), new InfoBankingtActivity(this.p.getToken()));
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
        this.s = updateDeleteDaftarTransferPresenter;
        updateDeleteDaftarTransferPresenter.a = this;
        Bundle extras = getIntent().getExtras();
        this.n = extras;
        DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput = (DaftarTransferResponse.DaftarTransferOutput) ListUtil.OneItemImmutableList.a(extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
        this.p = daftarTransferOutput;
        this.etNamaPemilik.setText(daftarTransferOutput.getAccountName());
        this.etKeterangan.setText(this.p.getAliasName());
        if (this.p.getAliasName().isEmpty()) {
            this.etKeterangan.setText("-");
        }
        this.etNomorRekening.setText(this.p.getAccountNumber());
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

    @OnClick({2131296389})
    public void hapus() {
        new HapusDaftarTransferDialog().show(l(), "HapusDaftarTransferDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void hapusDaftarTransferEvent(eventJenisIdentitasPemilikSumberDana eventjenisidentitaspemiliksumberdana) {
        s();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void l_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: o.CC3SKartuUtamaActivity
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailDaftarTransferActivity.this.s();
            }
        }).g();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        this.s.c();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "DetailDaftarTransferActivity";
        this.j = "DetailDaftarTransferActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492932;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void t() {
        x();
        DaftarTransferBerhasilDihapusDialog daftarTransferBerhasilDihapusDialog = new DaftarTransferBerhasilDihapusDialog();
        daftarTransferBerhasilDihapusDialog.setArguments(this.n);
        daftarTransferBerhasilDihapusDialog.show(l(), "DaftarTransferBerhasilDihapusDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void u() {
        z();
    }

    @OnClick({2131296457})
    public void ubah() {
        Intent intent = new Intent(this, EditDaftarTransferActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.p));
        this.f.e(intent, null);
    }

    @OnClick({2131299724})
    public void ubahKeterangan() {
        this.etKeterangan.setEnabled(true);
        this.etKeterangan.requestFocus();
        LogoutDialog logoutDialog = this.etKeterangan;
        logoutDialog.setSelection(logoutDialog.getText().length());
        this.tvUbahKeterangan.setVisibility(8);
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void v() {
        x();
        DaftarTransferBerhasilDiupdateDialog daftarTransferBerhasilDiupdateDialog = new DaftarTransferBerhasilDiupdateDialog();
        daftarTransferBerhasilDiupdateDialog.setArguments(this.n);
        daftarTransferBerhasilDiupdateDialog.show(l(), "DaftarTransferBerhasilDiupdateDialog");
    }
}
