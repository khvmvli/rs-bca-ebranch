package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.EditDaftarTransferBTActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DaftarTransferORBerhasilDihapusDialog;
import com.bca.smartbranch.dialog.DaftarTransferORBerhasilDiupdateDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.List;
import o.InfoProductActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.MainActivity;
import o.ReservasiSuccessAskNextActivity;
import o.ReviewMastercardAdapter$ViewHolder;
import o.ReviewVisaAdapter$ViewHolder_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.getPromotion;
import o.resetAccount;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/EditDaftarTransferBTActivity.class */
public class EditDaftarTransferBTActivity extends BaseActivityPostLogin implements Validator.ValidationListener, TextWatcher, UpdateDeleteDaftarTransferPresenter.write {
    @BindView(2131296935)
    @NotEmpty(messageResId = 2131820797, sequence = 1, trim = true)
    @Order(1)
    EditText etAlamatPenerima;
    @BindView(2131296948)
    EditText etBankTujuan;
    @BindViews({2131296935, 2131297210, 2131297190})
    List<View> etForms;
    @BindView(2131297066)
    EditText etNamaPenerima;
    @BindView(2131297107)
    AutoCompleteTextView etNorek;
    @BindView(2131297190)
    @NotEmpty(messageResId = 2131821003, sequence = 1, trim = true)
    @Order(3)
    EditText etStatusPenduduk;
    @BindView(2131297210)
    @NotEmpty(messageResId = 2131821018, sequence = 1, trim = true)
    @Order(2)
    EditText etTipeNasabahPenerima;
    private Bundle f;
    @BindView(2131297969)
    LinearLayout llMain;
    private DaftarTransferResponse.DaftarTransferOutput n;
    private UpdateDeleteDaftarTransferPresenter q;
    private Validator r;
    @BindView(2131298153)
    RadioButton rbKewarganegaraanWna;
    @BindView(2131298154)
    RadioButton rbKewarganegaraanWni;
    @BindString(2131822092)
    String retry;
    @BindView(2131298219)
    RadioGroup rgKewarganegaraan;
    @BindView(2131298484)
    LogoutDialog_ViewBinding tilAlamatPenerima;
    @BindViews({2131298484, 2131298742, 2131298722})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298722)
    LogoutDialog_ViewBinding tilStatusPenduduk;
    @BindView(2131298742)
    LogoutDialog_ViewBinding tilTipeNasabahPenerima;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822320)
    String toolbarTitle;
    @BindViews({2131298963, 2131299210, 2131299190})
    List<TextView> tvErrors;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    private void a(View view) {
        this.tvErrors.get(this.etForms.indexOf(view)).setVisibility(8);
        this.tilForms.get(this.etForms.indexOf(view)).setBackgroundResource(2131230847);
    }

    /* renamed from: y */
    public void s() {
        this.q.e(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Transfer ke Bank Lain"), new MainActivity(this.etNamaPenerima.getText().toString(), this.etNorek.getText().toString(), this.etAlamatPenerima.getText().toString(), this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Perorangan") ? "1" : this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Perusahaan") ? "2" : this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Pemerintah") ? "3" : "", this.n.getBankCode(), this.n.getBankOfficeCode(), this.n.getBankName(), this.rbKewarganegaraanWni.isChecked() ? "1" : "2", this.etStatusPenduduk.getText().toString().equalsIgnoreCase("Penduduk") ? "R" : "N", this.n.getToken()));
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etAlamatPenerima.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etAlamatPenerima);
        }
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

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
        Validator validator = new Validator(this);
        this.r = validator;
        validator.setValidationListener(this);
        setResult(-1);
        UpdateDeleteDaftarTransferPresenter updateDeleteDaftarTransferPresenter = new UpdateDeleteDaftarTransferPresenter();
        this.q = updateDeleteDaftarTransferPresenter;
        updateDeleteDaftarTransferPresenter.a = this;
        Bundle extras = getIntent().getExtras();
        this.f = extras;
        DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput = (DaftarTransferResponse.DaftarTransferOutput) ListUtil.OneItemImmutableList.a(extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
        this.n = daftarTransferOutput;
        this.etNorek.setText(daftarTransferOutput.getAccountNumber());
        this.etNamaPenerima.setText(this.n.getAccountName());
        this.etBankTujuan.setText(this.n.getBankName());
        this.etAlamatPenerima.setText(this.n.getReceiverAddress());
        if (this.n.getCustomerType().equalsIgnoreCase("1")) {
            this.etTipeNasabahPenerima.setText("Perorangan");
        } else if (this.n.getCustomerType().equalsIgnoreCase("2")) {
            this.etTipeNasabahPenerima.setText("Perusahaan");
        } else if (this.n.getCustomerType().equalsIgnoreCase("3")) {
            this.etTipeNasabahPenerima.setText("Pemerintah");
        } else {
            this.etTipeNasabahPenerima.setText("");
        }
        if (this.n.getResidency().equalsIgnoreCase("R")) {
            this.etStatusPenduduk.setText("Penduduk");
        } else {
            this.etStatusPenduduk.setText("Non Penduduk");
        }
        if (this.n.getCitizenship().equalsIgnoreCase("1")) {
            this.rbKewarganegaraanWni.setChecked(true);
        } else {
            this.rbKewarganegaraanWna.setChecked(true);
        }
        for (int i = 0; i < this.etForms.size(); i++) {
            this.tilForms.get(i).setHintEnabled(!((EditText) this.etForms.get(i)).getText().toString().isEmpty());
        }
        this.etAlamatPenerima.addTextChangedListener(this);
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

    @OnFocusChange({2131296935, 2131297210, 2131297190})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131296935) {
                this.tilAlamatPenerima.setHintEnabled(true);
            } else if (id == 2131297190) {
                this.tilStatusPenduduk.setHintEnabled(true);
            } else if (id == 2131297210) {
                this.tilTipeNasabahPenerima.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131296935) {
                if (id2 != 2131297190) {
                    if (id2 == 2131297210 && this.etTipeNasabahPenerima.getText().toString().isEmpty()) {
                        this.tilTipeNasabahPenerima.setHintEnabled(false);
                    }
                } else if (this.etStatusPenduduk.getText().toString().isEmpty()) {
                    this.tilStatusPenduduk.setHintEnabled(false);
                }
            } else if (this.etAlamatPenerima.getText().toString().isEmpty()) {
                this.tilAlamatPenerima.setHintEnabled(false);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void l_(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: o.CC6MastercardInfoActivity
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditDaftarTransferBTActivity.this.s();
            }
        }).g();
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        onBackPressed();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseStatusPenduduk(ReservasiSuccessAskNextActivity reservasiSuccessAskNextActivity) {
        a(this.etStatusPenduduk);
        this.etStatusPenduduk.setError(null);
        this.tilStatusPenduduk.setHintEnabled(true);
        this.etStatusPenduduk.setText(reservasiSuccessAskNextActivity.d);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseTipeNasabahPenerima(resetAccount resetaccount) {
        a(this.etTipeNasabahPenerima);
        this.etTipeNasabahPenerima.setError(null);
        this.tilTipeNasabahPenerima.setHintEnabled(true);
        this.etTipeNasabahPenerima.setText(resetaccount.d);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        this.q.c();
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

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationFailed(List<ValidationError> list) {
        EditText editText = null;
        for (ValidationError validationError : list) {
            View view = validationError.getView();
            String message = validationError.getFailedRules().get(0).getMessage(this);
            if (view instanceof EditText) {
                editText = editText;
                if (editText == null) {
                    editText = (EditText) view;
                }
                this.tvErrors.get(this.etForms.indexOf(view)).setVisibility(0);
                this.tvErrors.get(this.etForms.indexOf(view)).setText(message);
                this.tilForms.get(this.etForms.indexOf(view)).setBackgroundResource(2131230870);
            } else {
                a(this.llMain, message);
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        s();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "EditDaftarTransferBTActivity";
        this.j = "EditDaftarTransferBTActivity";
    }

    @OnClick({2131297190})
    public void pilihStatusPenduduk(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etStatusPenduduk.getText().toString());
        ReviewMastercardAdapter$ViewHolder reviewMastercardAdapter$ViewHolder = new ReviewMastercardAdapter$ViewHolder();
        reviewMastercardAdapter$ViewHolder.setArguments(bundle);
        reviewMastercardAdapter$ViewHolder.show(l(), "StatusPendudukBankTransferDialog");
    }

    @OnClick({2131297210})
    public void pilihTipeNasabahPenerima(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etTipeNasabahPenerima.getText().toString());
        ReviewVisaAdapter$ViewHolder_ViewBinding reviewVisaAdapter$ViewHolder_ViewBinding = new ReviewVisaAdapter$ViewHolder_ViewBinding();
        reviewVisaAdapter$ViewHolder_ViewBinding.setArguments(bundle);
        reviewVisaAdapter$ViewHolder_ViewBinding.show(l(), "TipeNasabahBankTransferDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492947;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296450})
    public void simpan() {
        getPromotion.d(this);
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            if (logoutDialog_ViewBinding.f.isEnabled()) {
                logoutDialog_ViewBinding.setBackgroundResource(2131230847);
            }
        }
        this.r.validate();
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

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void v() {
        x();
        Intent intent = new Intent();
        intent.putExtra("receiver_address", this.etAlamatPenerima.getText().toString());
        intent.putExtra("customer_type", this.etTipeNasabahPenerima.getText().toString());
        intent.putExtra("residency", this.etStatusPenduduk.getText().toString());
        if (this.rbKewarganegaraanWni.isChecked()) {
            intent.putExtra("citizenship", "WNI");
        } else {
            intent.putExtra("citizenship", "WNA");
        }
        setResult(-1, intent);
        new DaftarTransferORBerhasilDiupdateDialog().show(l(), "DaftarTransferORBerhasilDiupdateDialog");
    }
}
