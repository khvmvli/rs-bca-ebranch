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
import com.bca.smartbranch.activity.DetailDaftarTransferBTActivity;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailDaftarTransferBTActivity.class */
public class DetailDaftarTransferBTActivity extends BaseActivityPostLogin implements UpdateDeleteDaftarTransferPresenter.write {
    @BindView(2131296932)
    LogoutDialog etAlamatLengkap;
    @BindView(2131296948)
    LogoutDialog etBankTujuan;
    @BindView(2131297066)
    LogoutDialog etNamaPenerima;
    @BindView(2131297128)
    LogoutDialog etNomorRekening;
    @BindView(2131297217)
    LogoutDialog etStatusPenduduk;
    @BindView(2131297210)
    LogoutDialog etTipeNasabahPenerima;
    @BindView(2131297018)
    LogoutDialog etkewarganegaraan;
    ActivityResultRegistry$1<Intent> f = c(new setCheckable.write(), new PlaybackStateCompat.CustomAction<ComponentActivity$3>() { // from class: com.bca.smartbranch.activity.DetailDaftarTransferBTActivity.5
        @Override // o.PlaybackStateCompat.CustomAction
        public final /* synthetic */ void a(ComponentActivity$3 componentActivity$3) {
            ComponentActivity$3 componentActivity$32 = componentActivity$3;
            if (componentActivity$32.b == -1) {
                Bundle extras = componentActivity$32.c.getExtras();
                DetailDaftarTransferBTActivity.this.etAlamatLengkap.setText(extras.getString("receiver_address", ""));
                DetailDaftarTransferBTActivity.this.etTipeNasabahPenerima.setText(extras.getString("customer_type", ""));
                DetailDaftarTransferBTActivity.this.etStatusPenduduk.setText(extras.getString("residency", ""));
                DetailDaftarTransferBTActivity.this.etkewarganegaraan.setText(extras.getString("citizenship", ""));
                DetailDaftarTransferBTActivity.this.t.setReceiverAddress(extras.getString("receiver_address", ""));
                DetailDaftarTransferBTActivity.this.t.setCustomerType(extras.getString("customer_type", ""));
                if (extras.getString("customer_type", "").equalsIgnoreCase("Perorangan")) {
                    DetailDaftarTransferBTActivity.this.t.setCustomerType("1");
                } else if (extras.getString("customer_type", "").equalsIgnoreCase("Perusahaan")) {
                    DetailDaftarTransferBTActivity.this.t.setCustomerType("2");
                } else if (extras.getString("customer_type", "").equalsIgnoreCase("Pemerintah")) {
                    DetailDaftarTransferBTActivity.this.t.setCustomerType("3");
                }
                if (extras.getString("residency", "").equalsIgnoreCase("Penduduk")) {
                    DetailDaftarTransferBTActivity.this.t.setResidency("R");
                } else {
                    DetailDaftarTransferBTActivity.this.t.setResidency("N");
                }
                if (extras.getString("citizenship", "").equalsIgnoreCase("WNI")) {
                    DetailDaftarTransferBTActivity.this.t.setCitizenship("1");
                } else {
                    DetailDaftarTransferBTActivity.this.t.setCitizenship("2");
                }
            }
        }
    });
    @BindString(2131821181)
    String hintNoIban;
    @BindView(2131297969)
    LinearLayout lnMain;
    private Bundle n;
    @BindString(2131822092)
    String retry;
    private UpdateDeleteDaftarTransferPresenter s;
    private DaftarTransferResponse.DaftarTransferOutput t;
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
        this.s.b(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Transfer ke Bank Lain"), new InfoBankingtActivity(this.t.getToken()));
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
        this.t = daftarTransferOutput;
        this.etNomorRekening.setText(daftarTransferOutput.getAccountNumber());
        this.etNamaPenerima.setText(this.t.getAccountName());
        this.etBankTujuan.setText(this.t.getBankName());
        this.etAlamatLengkap.setText(this.t.getReceiverAddress());
        if (this.t.getCustomerType().equalsIgnoreCase("1")) {
            this.etTipeNasabahPenerima.setText("Perorangan");
        } else if (this.t.getCustomerType().equalsIgnoreCase("2")) {
            this.etTipeNasabahPenerima.setText("Perusahaan");
        } else if (this.t.getCustomerType().equalsIgnoreCase("3")) {
            this.etTipeNasabahPenerima.setText("Pemerintah");
        } else {
            this.etTipeNasabahPenerima.setText("");
        }
        if (this.t.getResidency().equalsIgnoreCase("R")) {
            this.etStatusPenduduk.setText("Penduduk");
        } else {
            this.etStatusPenduduk.setText("Non Penduduk");
        }
        if (this.t.getCitizenship().equalsIgnoreCase("1")) {
            this.etkewarganegaraan.setText("WNI");
        } else {
            this.etkewarganegaraan.setText("WNA");
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
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: o.CC3UbahBCACardActivity
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailDaftarTransferBTActivity.this.s();
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
        setCardSlogan.e().b = "DetailDaftarTransferBTActivity";
        this.j = "DetailDaftarTransferBTActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492933;
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
        Intent intent = new Intent(this, EditDaftarTransferBTActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.t));
        this.f.e(intent, null);
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void v() {
        x();
        new DaftarTransferORBerhasilDiupdateDialog().show(l(), "DaftarTransferORBerhasilDiupdateDialog");
    }
}
