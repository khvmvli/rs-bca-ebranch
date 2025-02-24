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
import com.bca.smartbranch.activity.DetailDaftarTransferORActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DaftarTransferORBerhasilDihapusDialog;
import com.bca.smartbranch.dialog.DaftarTransferORBerhasilDiupdateDialog;
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
import o.LogoutDialog_ViewBinding;
import o.PlaybackStateCompat;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.eventJenisIdentitasPemilikSumberDana;
import o.setCardSlogan;
import o.setCheckable;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailDaftarTransferORActivity.class */
public class DetailDaftarTransferORActivity extends BaseActivityPostLogin implements UpdateDeleteDaftarTransferPresenter.write {
    @BindView(2131296932)
    LogoutDialog etAlamatLengkap;
    @BindView(2131296948)
    LogoutDialog etBankTujuan;
    @BindView(2131297038)
    LogoutDialog etKotaPenerima;
    @BindView(2131297065)
    LogoutDialog etNamaPemilik;
    @BindView(2131297088)
    LogoutDialog etNegaraPenerima;
    @BindView(2131297128)
    LogoutDialog etNomorRekening;
    @BindView(2131297210)
    LogoutDialog etTipeNasabahPenerima;
    ActivityResultRegistry$1<Intent> f = c(new setCheckable.write(), new PlaybackStateCompat.CustomAction<ComponentActivity$3>() { // from class: com.bca.smartbranch.activity.DetailDaftarTransferORActivity.5
        @Override // o.PlaybackStateCompat.CustomAction
        public final /* synthetic */ void a(ComponentActivity$3 componentActivity$3) {
            ComponentActivity$3 componentActivity$32 = componentActivity$3;
            if (componentActivity$32.b == -1) {
                Bundle extras = componentActivity$32.c.getExtras();
                DetailDaftarTransferORActivity.this.etBankTujuan.setText(extras.getString("bank_name", ""));
                DetailDaftarTransferORActivity.this.etNegaraPenerima.setText(extras.getString("receiver_country_name", ""));
                DetailDaftarTransferORActivity.this.etNomorRekening.setText(extras.getString("account_number", ""));
                DetailDaftarTransferORActivity.this.etNamaPemilik.setText(extras.getString("account_name", ""));
                DetailDaftarTransferORActivity.this.etAlamatLengkap.setText(extras.getString("receiver_address", ""));
                DetailDaftarTransferORActivity.this.etKotaPenerima.setText(extras.getString("receiver_city", ""));
                if (extras.getString("receiver_city", "").isEmpty()) {
                    DetailDaftarTransferORActivity.this.etKotaPenerima.setText("-");
                }
                DetailDaftarTransferORActivity.this.etTipeNasabahPenerima.setText(extras.getString("customer_type", ""));
                DetailDaftarTransferORActivity.this.q.setBankCode(extras.getString("bank_code", ""));
                DetailDaftarTransferORActivity.this.q.setBankName(extras.getString("bank_name", ""));
                DetailDaftarTransferORActivity.this.q.setReceiverCountry(extras.getString("receiver_country", ""));
                DetailDaftarTransferORActivity.this.q.setReceiverCountryName(extras.getString("receiver_country_name", ""));
                DetailDaftarTransferORActivity.this.q.setAccountNumber(extras.getString("account_number", ""));
                DetailDaftarTransferORActivity.this.q.setAccountName(extras.getString("account_name", ""));
                DetailDaftarTransferORActivity.this.q.setReceiverAddress(extras.getString("receiver_address", ""));
                DetailDaftarTransferORActivity.this.q.setReceiverCity(extras.getString("receiver_city", ""));
                if (extras.getString("customer_type", "").equalsIgnoreCase("Individu")) {
                    DetailDaftarTransferORActivity.this.q.setCustomerType("I");
                } else {
                    DetailDaftarTransferORActivity.this.q.setCustomerType("P");
                }
            }
        }
    });
    @BindString(2131821181)
    String hintNoIban;
    @BindView(2131297969)
    LinearLayout lnMain;
    private Bundle n;
    private DaftarTransferResponse.DaftarTransferOutput q;
    @BindString(2131822092)
    String retry;
    private UpdateDeleteDaftarTransferPresenter s;
    @BindView(2131298673)
    LogoutDialog_ViewBinding tilNorek;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131821438)
    String toolbarTitle;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    /* renamed from: y */
    public void s() {
        this.s.b(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Transfer Valuta Asing"), new InfoBankingtActivity(this.q.getToken()));
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
        this.q = daftarTransferOutput;
        if (daftarTransferOutput.getIbanFlag().equals("Y")) {
            this.tilNorek.setHint(this.hintNoIban);
        }
        this.etBankTujuan.setText(this.q.getBankName());
        this.etNegaraPenerima.setText(this.q.getReceiverCountryName());
        this.etNomorRekening.setText(this.q.getAccountNumber());
        this.etNamaPemilik.setText(this.q.getAccountName());
        this.etAlamatLengkap.setText(this.q.getReceiverAddress());
        this.etKotaPenerima.setText(this.q.getReceiverCity().isEmpty() ? "-" : this.q.getReceiverCity());
        if (this.q.getCustomerType().equalsIgnoreCase("I")) {
            this.etTipeNasabahPenerima.setText("Individu");
        } else if (this.q.getCustomerType().equalsIgnoreCase("P")) {
            this.etTipeNasabahPenerima.setText("Perusahaan");
        } else {
            this.etTipeNasabahPenerima.setText("");
        }
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
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: o.lanjut
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailDaftarTransferORActivity.this.s();
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
        setCardSlogan.e().b = "DetailDaftarTransferORActivity";
        this.j = "DetailDaftarTransferORActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492934;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void t() {
        x();
        new DaftarTransferORBerhasilDihapusDialog().show(l(), "DaftarTransferORBerhasilDihapusDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void u() {
        z();
    }

    @OnClick({2131296457})
    public void ubah() {
        Intent intent = new Intent(this, EditDaftarTransferORActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.q));
        this.f.e(intent, null);
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void v() {
        x();
        new DaftarTransferORBerhasilDiupdateDialog().show(l(), "DaftarTransferORBerhasilDiupdateDialog");
    }
}
