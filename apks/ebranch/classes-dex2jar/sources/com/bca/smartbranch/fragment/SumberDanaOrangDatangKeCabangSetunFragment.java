package com.bca.smartbranch.fragment;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.View;
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
import com.bca.smartbranch.activity.FormTellerActivity;
import com.bca.smartbranch.data.api.response.CISNResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.PilihJenisIdentitasDialog;
import com.bca.smartbranch.fragment.SumberDanaOrangDatangKeCabangSetunFragment;
import com.bca.smartbranch.presenter.CheckCISNPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.ConfirmSubBCACardAdapter$ViewHolder;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getAnnualFeeAddOnDisplayAmount;
import o.getPromotion;
import o.onClickUbahDataOrangDatangKeCabang;
import o.onRetry;
import o.setMessage;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/SumberDanaOrangDatangKeCabangSetunFragment.class */
public class SumberDanaOrangDatangKeCabangSetunFragment extends BaseFragment implements RadioGroup.OnCheckedChangeListener, Validator.ValidationListener, TextWatcher, CheckCISNPresenter.write {
    private setMessage a = new setMessage();
    private CheckCISNPresenter d;
    @BindView(2131296933)
    @NotEmpty(messageResId = 2131820719, sequence = 1, trim = true)
    @Order(9)
    EditText etAlamatOrangYangDatangKeCabang;
    @BindViews({2131296993, 2131297126, 2131297059})
    List<View> etFields;
    @BindView(2131296993)
    @NotEmpty(messageResId = 2131820809, sequence = 1, trim = true)
    @Order(1)
    EditText etJenisId;
    @BindView(2131297059)
    @NotEmpty(messageResId = 2131820869, sequence = 1, trim = true)
    @Order(2)
    EditText etNamaId;
    @BindView(2131297064)
    @NotEmpty(messageResId = 2131820852, sequence = 1, trim = true)
    @Order(5)
    EditText etNamaOrangDatangKeCabang;
    @BindView(2131297096)
    @NotEmpty(messageResId = 2131820902, sequence = 1, trim = true)
    @Order(7)
    EditText etNoHpOrangDatangKeCabang;
    @BindView(2131297126)
    @NotEmpty(messageResId = 2131820951, sequence = 1, trim = true)
    @Order(3)
    EditText etNoId;
    @BindView(2131297102)
    @NotEmpty(messageResId = 2131820912, sequence = 1, trim = true)
    @Order(8)
    EditText etNoIdOrangDatangKeCabang;
    @BindView(2131297132)
    @NotEmpty(messageResId = 2131820893, sequence = 1, trim = true)
    @Order(6)
    EditText etNorekOrangDatangKeCabang;
    @BindView(2131297257)
    LinearLayout formJenisIdentitas;
    private Validator i;
    @BindString(2131821815)
    String labelKtp;
    @BindString(2131821986)
    String labelPaspor;
    @BindString(2131822074)
    String labelRekening;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297877)
    LinearLayout llSama;
    @BindView(2131297914)
    LinearLayout llTidakSama;
    @BindString(2131821919)
    String nama;
    @BindString(2131821933)
    String namaSesuaiKtp;
    @BindString(2131821530)
    String namaSesuaiPaspor;
    @BindString(2131821553)
    String nomorKtp;
    @BindString(2131821556)
    String nomorPaspor;
    @BindString(2131821949)
    String nomorRekening;
    @BindView(2131298168)
    RadioButton rbOrangDatangKeCabangTidak;
    @BindView(2131298169)
    RadioButton rbOrangDatangKeCabangYa;
    @BindView(2131298226)
    RadioGroup rgOrangDatangKeCabang;
    @BindView(2131298482)
    LogoutDialog_ViewBinding tilAlamatOrangYangDatangKeCabang;
    @BindViews({2131298542, 2131298647, 2131298606})
    List<View> tilForms;
    @BindView(2131298542)
    LogoutDialog_ViewBinding tilJenisId;
    @BindView(2131298606)
    LogoutDialog_ViewBinding tilNamaId;
    @BindView(2131298611)
    LogoutDialog_ViewBinding tilNamaOrangDatangKeCabang;
    @BindView(2131298642)
    LogoutDialog_ViewBinding tilNoHpOrangDatangKeCabang;
    @BindView(2131298647)
    LogoutDialog_ViewBinding tilNoId;
    @BindView(2131298648)
    LogoutDialog_ViewBinding tilNoIdOrangDatangKeCabang;
    @BindView(2131298677)
    LogoutDialog_ViewBinding tilNorekOrangDatangKeCabang;
    @BindViews({2131299017, 2131299121, 2131299083})
    List<TextView> tvErrors;

    private void c(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    private void f() {
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (View view : this.tilForms) {
            view.setBackgroundResource(2131230847);
        }
        this.etJenisId.setText("");
        this.etNoId.setText("");
        this.etNamaId.setText("");
        if (this.etJenisId.hasFocus()) {
            this.tilJenisId.setHintEnabled(true);
        } else {
            this.tilJenisId.setHintEnabled(false);
        }
        if (this.etNoId.hasFocus()) {
            this.tilNoId.setHintEnabled(true);
        } else {
            this.tilNoId.setHintEnabled(false);
        }
        if (this.etNamaId.hasFocus()) {
            this.tilNamaId.setHintEnabled(true);
        } else {
            this.tilNamaId.setHintEnabled(false);
        }
        EditText editText = this.etJenisId;
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.tilJenisId;
        editText.setEnabled(true);
        editText.setTextColor(ColorStateList.valueOf(getResources().getColor(2131099759)));
        logoutDialog_ViewBinding.setHintTextAppearance(2131886846);
        logoutDialog_ViewBinding.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099731)));
        ((FormTellerActivity) getActivity()).f.setRepresentativeIdType("");
        ((FormTellerActivity) getActivity()).f.setRepresentativeIdNumber("");
        ((FormTellerActivity) getActivity()).f.setRepresentativeName("");
    }

    private void l() {
        if (((FormTellerActivity) getActivity()).f.getSenderIdType().equalsIgnoreCase("KTP") || ((FormTellerActivity) getActivity()).f.getSenderIdType().equalsIgnoreCase("Paspor")) {
            ((FormTellerActivity) getActivity()).f.setFlagRepresentativeTransaction("Y");
            this.rbOrangDatangKeCabangYa.setEnabled(false);
            this.rbOrangDatangKeCabangTidak.setEnabled(false);
        }
        if (((FormTellerActivity) getActivity()).f.getFlagRepresentativeTransaction().equalsIgnoreCase("N")) {
            this.rbOrangDatangKeCabangYa.setChecked(false);
            this.rbOrangDatangKeCabangTidak.setChecked(true);
        } else {
            this.rbOrangDatangKeCabangYa.setChecked(true);
            this.rbOrangDatangKeCabangTidak.setChecked(false);
        }
        switch (this.rgOrangDatangKeCabang.getCheckedRadioButtonId()) {
            case 2131298168:
                j();
                break;
            case 2131298169:
                i();
                break;
        }
        this.rgOrangDatangKeCabang.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.getLongitude
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                SumberDanaOrangDatangKeCabangSetunFragment sumberDanaOrangDatangKeCabangSetunFragment = SumberDanaOrangDatangKeCabangSetunFragment.this;
                switch (i) {
                    case 2131298168:
                        sumberDanaOrangDatangKeCabangSetunFragment.j();
                        return;
                    case 2131298169:
                        sumberDanaOrangDatangKeCabangSetunFragment.i();
                        return;
                    default:
                        return;
                }
            }
        });
    }

    private void o() {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new ReviewSetoranFragment(), "ReviewSetoranFragment");
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void a() {
        g();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etNoId.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNoId)).getVisibility() == 0 && getPromotion.d(getContext(), this.tvErrors.get(this.etFields.indexOf(this.etNoId)).getText().toString(), this.etNoId)) {
                c(this.etFields.indexOf(this.etNoId));
            }
            ((FormTellerActivity) getActivity()).f.setRepresentativeIdNumber(editable.toString());
        } else if (editable == this.etNamaId.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNamaId)).getVisibility() == 0) {
                c(this.etFields.indexOf(this.etNamaId));
            }
            ((FormTellerActivity) getActivity()).f.setRepresentativeName(editable.toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void b() {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new ReviewSetoranFragment(), "ReviewSetoranFragment");
        h();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493272;
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void c(String str) {
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

    @OnClick({2131296993})
    public void clickJenisIdentitas(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etJenisId.getText().toString());
        PilihJenisIdentitasDialog pilihJenisIdentitasDialog = new PilihJenisIdentitasDialog();
        pilihJenisIdentitasDialog.setArguments(bundle);
        pilihJenisIdentitasDialog.show(getParentFragmentManager(), "PilihJenisIdentitasDialog");
    }

    @OnClick({2131296396})
    public void clickLanjut(View view) {
        getPromotion.d(getContext());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (View view2 : this.tilForms) {
            view2.setBackgroundResource(2131230847);
        }
        this.i.validate();
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void d() {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new ReviewSetoranFragment(), "ReviewSetoranFragment");
        h();
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void e() {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new ReviewSetoranFragment(), "ReviewSetoranFragment");
        h();
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void e(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void eventJenisIdentitas(onRetry onretry) {
        if (!onretry.d.equalsIgnoreCase(((FormTellerActivity) getActivity()).f.getRepresentativeIdType())) {
            f();
            this.tilJenisId.setHintEnabled(true);
            this.etJenisId.setText(onretry.d);
            this.formJenisIdentitas.setVisibility(0);
            if (onretry.d.equalsIgnoreCase(this.labelKtp)) {
                this.etNoId.setTag("KTP");
                getPromotion.c(this.etNoId, "KTP");
                if (this.tilNoId.t) {
                    this.tilNoId.setHint(this.nomorKtp);
                } else {
                    this.etNoId.setHint(this.nomorKtp);
                }
                this.etNamaId.setTag("KTP");
                if (this.tilNamaId.t) {
                    this.tilNamaId.setHint(this.namaSesuaiKtp);
                } else {
                    this.etNamaId.setHint(this.namaSesuaiKtp);
                }
            } else if (onretry.d.equalsIgnoreCase(this.labelPaspor)) {
                this.etNoId.setTag("Paspor");
                getPromotion.c(this.etNoId, "Paspor");
                if (this.tilNoId.t) {
                    this.tilNoId.setHint(this.nomorPaspor);
                } else {
                    this.etNoId.setHint(this.nomorPaspor);
                }
                this.etNamaId.setTag("Paspor");
                if (this.tilNamaId.t) {
                    this.tilNamaId.setHint(this.namaSesuaiPaspor);
                } else {
                    this.etNamaId.setHint(this.namaSesuaiPaspor);
                }
            } else {
                this.etNoId.setTag("Rekening");
                this.etNoId.setInputType(2);
                this.etNoId.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
                this.etNoId.setFilters(new InputFilter[]{new getAnnualFeeAddOnDisplayAmount(getResources().getString(2131820714)), new InputFilter.LengthFilter(10)});
                if (this.tilNoId.t) {
                    this.tilNoId.setHint(this.nomorRekening);
                } else {
                    this.etNoId.setHint(this.nomorRekening);
                }
                this.etNamaId.setTag("Rekening");
                if (this.tilNamaId.t) {
                    this.tilNamaId.setHint(this.nama);
                } else {
                    this.etNamaId.setHint(this.nama);
                }
            }
            ((FormTellerActivity) getActivity()).f.setRepresentativeIdType(this.etJenisId.getText().toString());
            c(this.etFields.indexOf(this.etJenisId));
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckCISNPresenter.write
    public final void h(String str) {
        h();
        if (str.equalsIgnoreCase("True")) {
            this.etNoId.setTag("Rekening");
            this.etNoId.setInputType(2);
            this.etNoId.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
            this.etNoId.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            if (this.tilNoId.t) {
                this.tilNoId.setHint(this.nomorRekening);
            } else {
                this.etNoId.setHint(this.nomorRekening);
            }
            this.etNamaId.setTag("Rekening");
            if (this.tilNamaId.t) {
                this.tilNamaId.setHint(this.nama);
            } else {
                this.etNamaId.setHint(this.nama);
            }
            this.etNoId.getText().clear();
            this.etJenisId.setText(this.labelRekening);
            EditText editText = this.etJenisId;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.tilJenisId;
            editText.setEnabled(false);
            editText.setTextColor(ColorStateList.valueOf(getResources().getColor(2131099774)));
            logoutDialog_ViewBinding.setHintTextAppearance(2131886849);
            logoutDialog_ViewBinding.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099739)));
            ((FormTellerActivity) getActivity()).f.setRepresentativeIdType(this.etJenisId.getText().toString());
            c(this.etFields.indexOf(this.etJenisId));
            this.i.validate();
            return;
        }
        o();
    }

    public void i() {
        this.llTidakSama.setVisibility(8);
        if (((FormTellerActivity) getActivity()).f.getFlagRepresentativeTransaction().equalsIgnoreCase("N")) {
            f();
            if (this.etJenisId.getText().toString().isEmpty()) {
                this.formJenisIdentitas.setVisibility(8);
            }
        }
        ((FormTellerActivity) getActivity()).f.setFlagRepresentativeTransaction("Y");
    }

    @OnFocusChange({2131296993, 2131297126, 2131297059})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131296993) {
                this.tilJenisId.setHintEnabled(true);
            } else if (id == 2131297059) {
                this.tilNamaId.setHintEnabled(true);
            } else if (id == 2131297126) {
                this.tilNoId.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131296993) {
                if (id2 != 2131297059) {
                    if (id2 == 2131297126 && this.etNoId.getText().toString().isEmpty()) {
                        this.tilNoId.setHintEnabled(false);
                    }
                } else if (this.etNamaId.getText().toString().isEmpty()) {
                    this.tilNamaId.setHintEnabled(false);
                }
            } else if (this.etJenisId.getText().toString().isEmpty()) {
                this.tilJenisId.setHintEnabled(false);
            }
        }
    }

    public void j() {
        this.llTidakSama.setVisibility(0);
        if (((FormTellerActivity) getActivity()).f.getFlagRepresentativeTransaction().equalsIgnoreCase("Y")) {
            f();
            if (this.etJenisId.getText().toString().isEmpty()) {
                this.formJenisIdentitas.setVisibility(8);
            }
        }
        ((FormTellerActivity) getActivity()).f.setFlagRepresentativeTransaction("N");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        getPromotion.d(getContext());
        ((FormTellerActivity) getActivity()).f.setFlagRepresentativeTransaction("");
        ((FormTellerActivity) getActivity()).f.setRepresentativeIdType("");
        ((FormTellerActivity) getActivity()).f.setRepresentativeIdNumber("");
        ((FormTellerActivity) getActivity()).f.setRepresentativeName("");
        ((FormTellerActivity) getActivity()).f.setRepresentativeRelationship("");
        e(2131296811, new SumberDanaDataPemilikSetunFragment(), "SumberDanaDataPemilikSetunFragment");
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case 2131298168:
                this.llTidakSama.setVisibility(0);
                f();
                if (this.etJenisId.getText().toString().isEmpty()) {
                    this.formJenisIdentitas.setVisibility(8);
                }
                ((FormTellerActivity) getActivity()).f.setFlagRepresentativeTransaction("N");
                return;
            case 2131298169:
                this.llTidakSama.setVisibility(8);
                f();
                if (this.etJenisId.getText().toString().isEmpty()) {
                    this.formJenisIdentitas.setVisibility(8);
                }
                ((FormTellerActivity) getActivity()).f.setFlagRepresentativeTransaction("Y");
                return;
            default:
                return;
        }
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.c.close();
        CheckCISNPresenter checkCISNPresenter = this.d;
        Call<OpenAccountSuccessActivity<CISNResponse>> call = checkCISNPresenter.a;
        if (call != null) {
            call.cancel();
        }
        checkCISNPresenter.d = null;
        documentProvider.b().e(this);
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
                EditText editText2 = editText;
                if (editText == null) {
                    editText2 = (EditText) view;
                }
                int id = view.getId();
                if (id == 2131296993) {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilJenisId.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id == 2131297059) {
                    this.tvErrors.get(2).setVisibility(0);
                    this.tvErrors.get(2).setText(message);
                    this.tilNamaId.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297126) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilNoId.setBackgroundResource(2131230870);
                    editText = editText2;
                }
            } else {
                b(this.llMain, message);
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        if (String.valueOf(this.etJenisId.getText()).equalsIgnoreCase("Rekening")) {
            documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
            c(2131296811, new ReviewSetoranFragment(), "ReviewSetoranFragment");
            return;
        }
        this.d.d(this.e, this.etNoId.getText().toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        this.c = Realm.getDefaultInstance();
        Validator validator = new Validator(this);
        this.i = validator;
        validator.setValidationListener(this);
        CheckCISNPresenter checkCISNPresenter = new CheckCISNPresenter();
        this.d = checkCISNPresenter;
        checkCISNPresenter.d = this;
        if (this.etNoHpOrangDatangKeCabang.getVisibility() == 0) {
            ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
            confirmSubBCACardAdapter$ViewHolder.c = 2131820902;
            confirmSubBCACardAdapter$ViewHolder.e = 2131820905;
            confirmSubBCACardAdapter$ViewHolder.d = 2131820903;
            confirmSubBCACardAdapter$ViewHolder.a = 2131820904;
            Validator validator2 = this.i;
            EditText editText = this.etNoHpOrangDatangKeCabang;
            validator2.put(editText, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0087: INVOKE  
                  (r0v225 'validator2' com.mobsandgeeks.saripaar.Validator)
                  (r0v227 'editText' android.widget.EditText)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v23 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$2 : 0x0083: CONSTRUCTOR  
                  (r0v227 'editText' android.widget.EditText)
                  (r0v219 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
                 call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.SumberDanaOrangDatangKeCabangSetunFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/SumberDanaOrangDatangKeCabangSetunFragment.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getPromotion, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.processVarArg(InsnGen.java:998)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:971)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 21 more
                */
            /*
            // Method dump skipped, instructions count: 1227
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.SumberDanaOrangDatangKeCabangSetunFragment.onViewCreated(android.view.View, android.os.Bundle):void");
        }
    }
