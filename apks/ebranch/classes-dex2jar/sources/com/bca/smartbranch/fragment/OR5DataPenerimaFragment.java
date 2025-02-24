package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.OutwardRemittanceFormActivity;
import com.bca.smartbranch.activity.PilihNegaraBagianActivity;
import com.bca.smartbranch.activity.PilihNegaraORActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.InfoNegaraORDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.TipeNasabahDialog;
import com.bca.smartbranch.dialog.TipeTujuanTransaksiDialog;
import com.bca.smartbranch.dialog.UpdateDaftarTransferDialog;
import com.bca.smartbranch.dialog.UpdateDaftarTransferSuccessDialog;
import com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter;
import com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.ArrayList;
import java.util.List;
import o.CityReservationAdapter$CityReservationVH_ViewBinding;
import o.ConfirmBCACardAdapter$ViewHolder_ViewBinding;
import o.DetailTundaCCActivity_ViewBinding;
import o.InfoProductActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.MainActivity;
import o.OpenAccountSuccessActivity;
import o.PilihNegaraActivity;
import o.ReservasiTundaSuccessActivity;
import o.ResetAccountActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TransactionActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onChooseNegara;
import o.onResultOk;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR5DataPenerimaFragment.class */
public class OR5DataPenerimaFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, AdapterView.OnItemClickListener, CheckDaftarTransferORPresenter.read, UpdateDeleteDaftarTransferPresenter.write {
    private DetailTundaCCActivity_ViewBinding a;
    @BindView(2131296473)
    CheckBox cbxSimpanDaftarTransfer;
    private DetailTundaCCActivity_ViewBinding d;
    @BindView(2131296935)
    @NotEmpty(messageResId = 2131820797, sequence = 5, trim = true)
    @Order(5)
    EditText etAlamatPenerima;
    @BindViews({2131297107, 2131297099, 2131297066, 2131297089, 2131296935, 2131297038, 2131297081, 2131297025, 2131297117, 2131297210, 2131297218})
    List<View> etForms;
    @BindView(2131297025)
    @NotEmpty(messageResId = 2131820977, sequence = 8, trim = true)
    @Order(8)
    EditText etKodePosPenerima;
    @BindView(2131297038)
    EditText etKotaPenerima;
    @BindView(2131297066)
    @NotEmpty(messageResId = 2131820861, sequence = 2, trim = true)
    @Order(3)
    AutoCompleteTextView etNamaPenerima;
    @BindView(2131297081)
    @NotEmpty(messageResId = 2131820879, sequence = 7, trim = true)
    @Order(7)
    EditText etNegaraBagian;
    @BindView(2131297089)
    @NotEmpty(messageResId = 2131820881, sequence = 3, trim = true)
    @Order(4)
    EditText etNegaraTujuan;
    @BindView(2131297099)
    @NotEmpty(messageResId = 2131820910, sequence = 4, trim = true)
    @Order(2)
    AutoCompleteTextView etNoIBAN;
    @BindView(2131297117)
    @NotEmpty(messageResId = 2131820927, sequence = 8, trim = true)
    @Order(9)
    EditText etNoTelpPenerima;
    @BindView(2131297107)
    @NotEmpty(messageResId = 2131820951, sequence = 1, trim = true)
    @Order(1)
    AutoCompleteTextView etNorek;
    @BindView(2131297210)
    @NotEmpty(messageResId = 2131821018, sequence = 1, trim = true)
    @Order(10)
    EditText etTipeNasabahPenerima;
    @BindView(2131297218)
    @NotEmpty(messageResId = 2131821019, sequence = 1, trim = true)
    @Order(11)
    EditText etTipeTujuanTransaksiPenerima;
    private List<DaftarTransferResponse.DaftarTransferOutput> g;
    private DetailTundaCCActivity_ViewBinding.read h;
    private CheckDaftarTransferORPresenter i;
    private UpdateDeleteDaftarTransferPresenter l;

    /* renamed from: o */
    private Validator f42o;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131298484)
    LogoutDialog_ViewBinding tilAlamatPenerima;
    @BindViews({2131298653, 2131298645, 2131298613, 2131298635, 2131298484, 2131298585, 2131298627, 2131298571, 2131298663, 2131298742, 2131298749})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298571)
    LogoutDialog_ViewBinding tilKodePosPenerima;
    @BindView(2131298585)
    LogoutDialog_ViewBinding tilKotaPenerima;
    @BindView(2131298613)
    LogoutDialog_ViewBinding tilNamaPenerima;
    @BindView(2131298627)
    LogoutDialog_ViewBinding tilNegaraBagianPenerima;
    @BindView(2131298635)
    LogoutDialog_ViewBinding tilNegaraTujuan;
    @BindView(2131298645)
    LogoutDialog_ViewBinding tilNoIBAN;
    @BindView(2131298663)
    LogoutDialog_ViewBinding tilNoTelpPenerima;
    @BindView(2131298653)
    LogoutDialog_ViewBinding tilNorek;
    @BindView(2131298742)
    LogoutDialog_ViewBinding tilTipeNasabahPenerima;
    @BindView(2131298749)
    LogoutDialog_ViewBinding tilTipeTujuanTransaksiPenerima;
    @BindViews({2131299126, 2131299119, 2131299089, 2131299110, 2131298963, 2131299061, 2131299103, 2131299048, 2131299136, 2131299210, 2131299217})
    List<TextView> tvErrors;
    private int k = 6;
    private List<DaftarTransferResponse.DaftarTransferOutput> f = new ArrayList();
    private List<DaftarTransferResponse.DaftarTransferOutput> j = new ArrayList();

    private void d() {
        if (((OutwardRemittanceFormActivity) getActivity()).n.getISONegaraTujuanTransaksi().equals(((OutwardRemittanceFormActivity) getActivity()).n.getNegaraTujuanPenerimaISO())) {
            ((OutwardRemittanceFormActivity) getActivity()).t();
            c(2131296811, new OR6DataLainnyaFragment(), "OR6DataLainnyaFragment");
            return;
        }
        new InfoNegaraORDialog().show(getParentFragmentManager(), "InfoNegaraORDialog");
    }

    private void d(View view) {
        this.tvErrors.get(this.etForms.indexOf(view)).setVisibility(8);
        this.tilForms.get(this.etForms.indexOf(view)).setBackgroundResource(2131230847);
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void a() {
        h();
        d();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etNorek.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etNorek);
            ((OutwardRemittanceFormActivity) getActivity()).n.setNorekPenerima(this.etNorek.getText().toString());
        } else if (editable == this.etNoIBAN.getEditableText()) {
            if (this.tvErrors.get(this.etForms.indexOf(this.etNoIBAN)).getVisibility() == 0) {
                if (this.tvErrors.get(this.etForms.indexOf(this.etNoIBAN)).getText().toString().equals(getString(2131820910))) {
                    if (!this.etNoIBAN.getText().toString().isEmpty()) {
                        d(this.etNoIBAN);
                    }
                } else if (this.etNoIBAN.getText().toString().length() >= 2 && this.etNoIBAN.getText().toString().substring(0, 2).equalsIgnoreCase(this.etNoIBAN.getTag().toString())) {
                    d(this.etNoIBAN);
                }
            }
            ((OutwardRemittanceFormActivity) getActivity()).n.setNoIBANPenerima(this.etNoIBAN.getText().toString());
        } else if (editable == this.etNamaPenerima.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etNamaPenerima);
            ((OutwardRemittanceFormActivity) getActivity()).n.setNamaPenerima(this.etNamaPenerima.getText().toString());
        } else if (editable == this.etNoTelpPenerima.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etNoTelpPenerima);
            ((OutwardRemittanceFormActivity) getActivity()).n.setNoTelpPenerima(this.etNoTelpPenerima.getText().toString());
        } else if (editable == this.etNegaraTujuan.getEditableText()) {
            ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerima(this.etNegaraTujuan.getText().toString());
        } else if (editable == this.etAlamatPenerima.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etAlamatPenerima);
            ((OutwardRemittanceFormActivity) getActivity()).n.setAlamatLengkapPenerima(this.etAlamatPenerima.getText().toString());
        } else if (editable == this.etKotaPenerima.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etKotaPenerima);
            ((OutwardRemittanceFormActivity) getActivity()).n.setKotaPenerima(this.etKotaPenerima.getText().toString());
        } else if (editable == this.etKodePosPenerima.getEditableText()) {
            if (this.tvErrors.get(this.etForms.indexOf(this.etKodePosPenerima)).getVisibility() == 0) {
                if (this.tvErrors.get(this.etForms.indexOf(this.etKodePosPenerima)).getText().toString().equals(getString(2131820977))) {
                    getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etKodePosPenerima);
                } else if (this.etKodePosPenerima.getText().toString().length() >= this.k) {
                    d(this.etKodePosPenerima);
                }
            }
            ((OutwardRemittanceFormActivity) getActivity()).n.setKodePosPenerima(this.etKodePosPenerima.getText().toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read, com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void b(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read, com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void b_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493197;
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void d(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void f(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        ((OutwardRemittanceFormActivity) getActivity()).n.setNorekPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNoIBANPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNamaPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNoTelpPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerimaISO("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianPenerimaCode("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setAlamatLengkapPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setKotaPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setKodePosPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setTipeNasabahPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setTipeTujuanTransaksiPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setStatusPendudukPenerima("");
        e(2131296811, new OR4DataBankPenerimaFragment(), "OR4DataBankPenerimaFragment");
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void g(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void i(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("flag-iban", ((OutwardRemittanceFormActivity) getActivity()).n.isFlagIBAN());
        UpdateDaftarTransferDialog updateDaftarTransferDialog = new UpdateDaftarTransferDialog();
        updateDaftarTransferDialog.setArguments(bundle);
        updateDaftarTransferDialog.show(getParentFragmentManager(), "UpdateDaftarTransferDialog");
    }

    @OnFocusChange({2131297107, 2131297099, 2131297066, 2131296935, 2131297038, 2131297025, 2131297117})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296935:
                    this.tilAlamatPenerima.setHintEnabled(true);
                    return;
                case 2131297025:
                    this.tilKodePosPenerima.setHintEnabled(true);
                    return;
                case 2131297038:
                    this.tilKotaPenerima.setHintEnabled(true);
                    return;
                case 2131297066:
                    this.tilNamaPenerima.setHintEnabled(true);
                    return;
                case 2131297099:
                    this.tilNoIBAN.setHintEnabled(true);
                    return;
                case 2131297107:
                    this.tilNorek.setHintEnabled(true);
                    return;
                case 2131297117:
                    this.tilNoTelpPenerima.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296935:
                    if (this.etAlamatPenerima.getText().toString().isEmpty()) {
                        this.tilAlamatPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297025:
                    if (this.etKodePosPenerima.getText().toString().isEmpty()) {
                        this.tilKodePosPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297038:
                    if (this.etKotaPenerima.getText().toString().isEmpty()) {
                        this.tilKotaPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297066:
                    if (this.etNamaPenerima.getText().toString().isEmpty()) {
                        this.tilNamaPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297099:
                    if (this.etNoIBAN.getText().toString().isEmpty()) {
                        this.tilNoIBAN.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297107:
                    if (this.etNorek.getText().toString().isEmpty()) {
                        this.tilNorek.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297117:
                    if (this.etNoTelpPenerima.getText().toString().isEmpty()) {
                        this.tilNoTelpPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void j(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void l_(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).g();
    }

    @OnClick({2131296396})
    public void lanjut(View view) {
        getPromotion.d(getContext());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            if (logoutDialog_ViewBinding.f.isEnabled()) {
                logoutDialog_ViewBinding.setBackgroundResource(2131230847);
            }
        }
        this.f42o.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegaraBagian(PilihNegaraActivity pilihNegaraActivity) {
        d(this.etNegaraBagian);
        this.etNegaraBagian.setError(null);
        this.tilNegaraBagianPenerima.setHintEnabled(true);
        this.etNegaraBagian.setText(pilihNegaraActivity.e);
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianPenerima(pilihNegaraActivity.e);
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianPenerimaCode(pilihNegaraActivity.b);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegaraTujuan(onChooseNegara onchoosenegara) {
        d(this.etNegaraTujuan);
        d(this.etNegaraBagian);
        this.etNegaraTujuan.setError(null);
        this.tilNegaraTujuan.setHintEnabled(true);
        this.etNegaraTujuan.setText(onchoosenegara.b);
        this.etNegaraBagian.setText("");
        this.tilNegaraBagianPenerima.setHintEnabled(false);
        this.etKodePosPenerima.setText("");
        this.tilKodePosPenerima.setHintEnabled(false);
        String str = ((OutwardRemittanceFormActivity) getActivity()).v;
        str.hashCode();
        if (!str.equals("O")) {
            this.tilNegaraBagianPenerima.setVisibility(8);
            this.tilKodePosPenerima.setVisibility(8);
        } else if (onchoosenegara.d.equals("US")) {
            this.tilNegaraBagianPenerima.setVisibility(0);
        } else {
            this.tilNegaraBagianPenerima.setVisibility(8);
        }
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerima(onchoosenegara.b);
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerimaISO(onchoosenegara.d);
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setKodePosPenerima("");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseTipeNasabahPenerima(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity) {
        d(this.etTipeNasabahPenerima);
        this.etTipeNasabahPenerima.setError(null);
        this.tilTipeNasabahPenerima.setHintEnabled(true);
        this.etTipeNasabahPenerima.setText(reservasiTundaSuccessActivity.a);
        ((OutwardRemittanceFormActivity) getActivity()).n.setTipeNasabahPenerima(reservasiTundaSuccessActivity.a);
        String substring = ((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi().substring(0, 3);
        this.tvErrors.get(this.etForms.indexOf(this.etTipeTujuanTransaksiPenerima)).setVisibility(8);
        this.tilForms.get(this.etForms.indexOf(this.etTipeTujuanTransaksiPenerima)).setBackgroundResource(2131230847);
        this.etTipeTujuanTransaksiPenerima.setText("");
        this.tilTipeTujuanTransaksiPenerima.setHintEnabled(false);
        if (!substring.equals("CNY")) {
            return;
        }
        if (this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Individu")) {
            this.tilTipeTujuanTransaksiPenerima.setVisibility(0);
            this.etTipeTujuanTransaksiPenerima.setEnabled(true);
            this.tilTipeTujuanTransaksiPenerima.setBackgroundResource(2131230847);
            this.tilTipeTujuanTransaksiPenerima.setHintTextAppearance(2131886846);
            this.tilTipeTujuanTransaksiPenerima.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099731)));
            return;
        }
        this.tilTipeTujuanTransaksiPenerima.setVisibility(0);
        this.etTipeTujuanTransaksiPenerima.setEnabled(false);
        this.tilTipeTujuanTransaksiPenerima.setBackgroundDrawable(new ColorDrawable(0));
        this.tilTipeTujuanTransaksiPenerima.setHintTextAppearance(2131886849);
        this.tilTipeTujuanTransaksiPenerima.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099739)));
        this.etTipeTujuanTransaksiPenerima.setText("Bisnis");
        this.tilTipeTujuanTransaksiPenerima.setHintEnabled(true);
        ((OutwardRemittanceFormActivity) getActivity()).n.setTipeTujuanTransaksiPenerima(this.etTipeTujuanTransaksiPenerima.getText().toString());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseTipeTujuanTransaksiPenerima(ResetAccountActivity resetAccountActivity) {
        d(this.etTipeTujuanTransaksiPenerima);
        this.etTipeTujuanTransaksiPenerima.setError(null);
        this.tilTipeTujuanTransaksiPenerima.setHintEnabled(true);
        this.etTipeTujuanTransaksiPenerima.setText(resetAccountActivity.a);
        ((OutwardRemittanceFormActivity) getActivity()).n.setTipeTujuanTransaksiPenerima(resetAccountActivity.a);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseUpdateDaftarTransfer(CityReservationAdapter$CityReservationVH_ViewBinding cityReservationAdapter$CityReservationVH_ViewBinding) {
        String str;
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagUpdateDaftarTransferPenerima(cityReservationAdapter$CityReservationVH_ViewBinding.e.booleanValue());
        if (cityReservationAdapter$CityReservationVH_ViewBinding.e.booleanValue()) {
            String obj = this.etNorek.getText().toString();
            if (((OutwardRemittanceFormActivity) getActivity()).n.isFlagIBAN()) {
                obj = this.etNoIBAN.getText().toString();
                str = "Y";
            } else {
                str = "N";
            }
            this.l.e(new InfoProductActivity(this.e.getEmail(), this.e.getSessionId(), this.e.getImei(), "Transfer Valuta Asing"), new MainActivity(this.h.f84o, this.etNamaPenerima.getText().toString(), this.h.a, obj, this.etAlamatPenerima.getText().toString(), this.etKotaPenerima.getText().toString(), this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Perusahaan") ? "P" : this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Individu") ? "I" : "", str, this.h.c, this.h.e, ((OutwardRemittanceFormActivity) getActivity()).n.getNegaraTujuanPenerimaISO(), ((OutwardRemittanceFormActivity) getActivity()).n.getNegaraTujuanPenerima()));
            return;
        }
        d();
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        CheckDaftarTransferORPresenter checkDaftarTransferORPresenter = this.i;
        Call<OpenAccountSuccessActivity<Object>> call = checkDaftarTransferORPresenter.e;
        if (call != null) {
            call.cancel();
        }
        checkDaftarTransferORPresenter.a = null;
        this.l.c();
        documentProvider.b().e(this);
        onDestroyView();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onDismissUpdateDaftarTransfer(ConfirmBCACardAdapter$ViewHolder_ViewBinding confirmBCACardAdapter$ViewHolder_ViewBinding) {
        d();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onDismissWarningDialog(TransactionActivity_ViewBinding transactionActivity_ViewBinding) {
        ((OutwardRemittanceFormActivity) getActivity()).t();
        c(2131296811, new OR6DataLainnyaFragment(), "OR6DataLainnyaFragment");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String substring = ((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi().substring(0, 3);
        if (this.etNamaPenerima.isFocused()) {
            this.etNamaPenerima.setAdapter(null);
            this.etNamaPenerima.setText(this.a.e.get(i).d);
            AutoCompleteTextView autoCompleteTextView = this.etNamaPenerima;
            autoCompleteTextView.setSelection(autoCompleteTextView.length());
            this.etNamaPenerima.setAdapter(this.a);
            this.h = this.a.e.get(i);
            if (((OutwardRemittanceFormActivity) getActivity()).n.isFlagIBAN()) {
                this.etNoIBAN.setText(this.a.e.get(i).b);
                AutoCompleteTextView autoCompleteTextView2 = this.etNoIBAN;
                autoCompleteTextView2.setSelection(autoCompleteTextView2.length());
                this.tilNoIBAN.setHintEnabled(true);
            } else {
                this.etNorek.setText(this.a.e.get(i).b);
                AutoCompleteTextView autoCompleteTextView3 = this.etNorek;
                autoCompleteTextView3.setSelection(autoCompleteTextView3.length());
                this.tilNorek.setHintEnabled(true);
            }
            this.etAlamatPenerima.setText(this.a.e.get(i).f);
            EditText editText = this.etAlamatPenerima;
            editText.setSelection(editText.length());
            this.tilAlamatPenerima.setHintEnabled(true);
            this.etKotaPenerima.setText(this.a.e.get(i).i);
            EditText editText2 = this.etKotaPenerima;
            editText2.setSelection(editText2.length());
            if (!this.etKotaPenerima.getText().toString().isEmpty()) {
                this.tilKotaPenerima.setHintEnabled(true);
            }
            this.etNegaraTujuan.setText(this.a.e.get(i).k);
            ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerimaISO(this.a.e.get(i).h);
            ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerima(this.a.e.get(i).k);
            if (this.etNegaraTujuan.isEnabled()) {
                d(this.etNegaraTujuan);
                this.tilNegaraTujuan.setHintEnabled(true);
                String str = ((OutwardRemittanceFormActivity) getActivity()).v;
                str.hashCode();
                if (!str.equals("O")) {
                    this.tilNegaraBagianPenerima.setVisibility(8);
                    this.tilKodePosPenerima.setVisibility(8);
                } else if (this.a.e.get(i).h.equals("US")) {
                    this.tilNegaraBagianPenerima.setVisibility(0);
                } else {
                    this.tilNegaraBagianPenerima.setVisibility(8);
                }
            }
            d(this.etTipeNasabahPenerima);
            if (this.a.e.get(i).g.equalsIgnoreCase("I")) {
                this.etTipeNasabahPenerima.setText("Individu");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTipeNasabahPenerima("Individu");
            } else if (this.a.e.get(i).g.equalsIgnoreCase("P")) {
                this.etTipeNasabahPenerima.setText("Perusahaan");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTipeNasabahPenerima("Perusahaan");
            } else {
                this.etTipeNasabahPenerima.setText("");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTipeNasabahPenerima("");
            }
            this.tilTipeNasabahPenerima.setHintEnabled(true);
            if (!this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Individu") || !substring.equals("CNY")) {
                this.tvErrors.get(this.etForms.indexOf(this.etTipeTujuanTransaksiPenerima)).setVisibility(8);
                this.tilForms.get(this.etForms.indexOf(this.etTipeTujuanTransaksiPenerima)).setBackgroundResource(2131230847);
                this.tilTipeTujuanTransaksiPenerima.setVisibility(8);
                this.tilTipeTujuanTransaksiPenerima.setHintEnabled(false);
                this.etTipeTujuanTransaksiPenerima.setText("");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTipeTujuanTransaksiPenerima("");
                return;
            }
            this.tilTipeTujuanTransaksiPenerima.setVisibility(0);
        } else if (this.etNorek.isFocused() || this.etNoIBAN.isFocused()) {
            if (this.etNorek.isFocused()) {
                this.etNorek.setAdapter(null);
                this.etNorek.setText(this.d.e.get(i).b);
                AutoCompleteTextView autoCompleteTextView4 = this.etNorek;
                autoCompleteTextView4.setSelection(autoCompleteTextView4.length());
                this.etNorek.setAdapter(this.d);
            } else if (this.etNoIBAN.isFocused()) {
                this.etNoIBAN.setAdapter(null);
                this.etNoIBAN.setText(this.d.e.get(i).b);
                AutoCompleteTextView autoCompleteTextView5 = this.etNoIBAN;
                autoCompleteTextView5.setSelection(autoCompleteTextView5.length());
                this.etNoIBAN.setAdapter(this.d);
            }
            this.h = this.d.e.get(i);
            this.etNamaPenerima.setText(this.d.e.get(i).d);
            AutoCompleteTextView autoCompleteTextView6 = this.etNamaPenerima;
            autoCompleteTextView6.setSelection(autoCompleteTextView6.length());
            this.tilNamaPenerima.setHintEnabled(true);
            this.etAlamatPenerima.setText(this.d.e.get(i).f);
            EditText editText3 = this.etAlamatPenerima;
            editText3.setSelection(editText3.length());
            this.tilAlamatPenerima.setHintEnabled(true);
            this.etKotaPenerima.setText(this.d.e.get(i).i);
            EditText editText4 = this.etKotaPenerima;
            editText4.setSelection(editText4.length());
            if (!this.etKotaPenerima.getText().toString().isEmpty()) {
                this.tilKotaPenerima.setHintEnabled(true);
            }
            this.etNegaraTujuan.setText(this.d.e.get(i).k);
            ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerimaISO(this.d.e.get(i).h);
            ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerima(this.d.e.get(i).k);
            if (this.etNegaraTujuan.isEnabled()) {
                d(this.etNegaraTujuan);
                this.tilNegaraTujuan.setHintEnabled(true);
                String str2 = ((OutwardRemittanceFormActivity) getActivity()).v;
                str2.hashCode();
                if (!str2.equals("O")) {
                    this.tilNegaraBagianPenerima.setVisibility(8);
                    this.tilKodePosPenerima.setVisibility(8);
                } else if (this.d.e.get(i).h.equals("US")) {
                    this.tilNegaraBagianPenerima.setVisibility(0);
                } else {
                    this.tilNegaraBagianPenerima.setVisibility(8);
                }
            }
            d(this.etTipeNasabahPenerima);
            if (this.d.e.get(i).g.equalsIgnoreCase("I")) {
                this.etTipeNasabahPenerima.setText("Individu");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTipeNasabahPenerima("Individu");
            } else if (this.d.e.get(i).g.equalsIgnoreCase("P")) {
                this.etTipeNasabahPenerima.setText("Perusahaan");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTipeNasabahPenerima("Perusahaan");
            } else {
                this.etTipeNasabahPenerima.setText("");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTipeNasabahPenerima("");
            }
            this.tilTipeNasabahPenerima.setHintEnabled(true);
            if (!this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Individu") || !substring.equals("CNY")) {
                this.tvErrors.get(this.etForms.indexOf(this.etTipeTujuanTransaksiPenerima)).setVisibility(8);
                this.tilForms.get(this.etForms.indexOf(this.etTipeTujuanTransaksiPenerima)).setBackgroundResource(2131230847);
                this.tilTipeTujuanTransaksiPenerima.setVisibility(8);
                this.tilTipeTujuanTransaksiPenerima.setHintEnabled(false);
                this.etTipeTujuanTransaksiPenerima.setText("");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTipeTujuanTransaksiPenerima("");
                return;
            }
            this.tilTipeTujuanTransaksiPenerima.setVisibility(0);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationFailed(List<ValidationError> list) {
        EditText editText = null;
        for (ValidationError validationError : list) {
            View view = validationError.getView();
            String message = validationError.getFailedRules().get(0).getMessage(getContext());
            if (view instanceof EditText) {
                editText = editText;
                if (editText == null) {
                    editText = (EditText) view;
                }
                this.tvErrors.get(this.etForms.indexOf(view)).setVisibility(0);
                this.tvErrors.get(this.etForms.indexOf(view)).setText(message);
                this.tilForms.get(this.etForms.indexOf(view)).setBackgroundResource(2131230870);
            } else {
                b(this.svMain, message);
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        if (this.cbxSimpanDaftarTransfer.isChecked()) {
            ((OutwardRemittanceFormActivity) getActivity()).n.setFlagUpdateDaftarTransferPenerima(false);
            String str = "";
            String email = this.e != null ? this.e.getEmail() : "";
            String imei = this.e != null ? this.e.getImei() : "";
            if (this.e != null) {
                str = this.e.getSessionId();
            }
            onResultOk onresultok = new onResultOk();
            onresultok.b = email;
            onresultok.a = imei;
            onresultok.e = str;
            onresultok.c = "Transfer Valuta Asing";
            if (((OutwardRemittanceFormActivity) getActivity()).n.isFlagIBAN()) {
                this.i.d(this.e, "Transfer Valuta Asing", this.etNoIBAN.getText().toString(), "Y");
            } else {
                this.i.d(this.e, "Transfer Valuta Asing", this.etNorek.getText().toString(), "N");
            }
        } else {
            ((OutwardRemittanceFormActivity) getActivity()).n.setFlagUpdateDaftarTransferPenerima(false);
            d();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0903 A[LOOP:1: B:143:0x08f5->B:145:0x0903, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04eb  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 2882
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR5DataPenerimaFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @OnClick({2131297081})
    public void pilihNegaraBagian(View view) {
        Intent intent = new Intent(getContext(), PilihNegaraBagianActivity.class);
        intent.putExtra("country", this.etNegaraTujuan.getText().toString());
        intent.putExtra("is_from_reservation", ((OutwardRemittanceFormActivity) getActivity()).s);
        intent.putExtra("is_save_draft_and_hit_service", ((OutwardRemittanceFormActivity) getActivity()).u == null || ((OutwardRemittanceFormActivity) getActivity()).u.getCountAll() == 0);
        startActivity(intent);
    }

    @OnClick({2131297089})
    public void pilihNegaraTujuan(View view) {
        Intent intent = new Intent(getContext(), PilihNegaraORActivity.class);
        intent.putExtra("title", "Pilih Negara");
        intent.putExtra("is_from_reservation", ((OutwardRemittanceFormActivity) getActivity()).s);
        intent.putExtra("is_save_draft_and_hit_service", ((OutwardRemittanceFormActivity) getActivity()).u == null || ((OutwardRemittanceFormActivity) getActivity()).u.getCountAll() == 0);
        startActivity(intent);
    }

    @OnClick({2131297210})
    public void pilihTipeNasabahPenerima(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etTipeNasabahPenerima.getText().toString());
        TipeNasabahDialog tipeNasabahDialog = new TipeNasabahDialog();
        tipeNasabahDialog.setArguments(bundle);
        tipeNasabahDialog.show(getFragmentManager(), "TipeNasabahDialog");
    }

    @OnClick({2131297218})
    public void pilihTipeTujuanTransaksiPenerima(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etTipeTujuanTransaksiPenerima.getText().toString());
        TipeTujuanTransaksiDialog tipeTujuanTransaksiDialog = new TipeTujuanTransaksiDialog();
        tipeTujuanTransaksiDialog.setArguments(bundle);
        tipeTujuanTransaksiDialog.show(getFragmentManager(), "TipeTujuanTransaksiDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void t() {
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read, com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void u() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void v() {
        h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("flag-iban", ((OutwardRemittanceFormActivity) getActivity()).n.isFlagIBAN());
        UpdateDaftarTransferSuccessDialog updateDaftarTransferSuccessDialog = new UpdateDaftarTransferSuccessDialog();
        updateDaftarTransferSuccessDialog.setArguments(bundle);
        updateDaftarTransferSuccessDialog.show(getParentFragmentManager(), "UpdateDaftarTransferSuccessDialog");
    }
}
