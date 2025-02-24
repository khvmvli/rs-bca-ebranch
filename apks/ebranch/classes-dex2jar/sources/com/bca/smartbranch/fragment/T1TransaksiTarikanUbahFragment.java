package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.TarikanUbahTransaksiActivity;
import com.bca.smartbranch.dialog.InfoTarikanDialog;
import com.bca.smartbranch.dialog.PilihRekeningDialog;
import com.bca.smartbranch.dialog.Tarikan100JutaGuestDialog;
import com.bca.smartbranch.dialog.Tarikan100JutaMemberDialog;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import java.util.List;
import o.LogoutDialog_ViewBinding;
import o.ReservasiROSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.setOnHierarchyChangeListener;
import o.showDataOrangDatangKeCabang;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/T1TransaksiTarikanUbahFragment.class */
public class T1TransaksiTarikanUbahFragment extends BaseFragment implements TextWatcher, Validator.ValidationListener {
    private int a;
    private Validator d;
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 2)
    @Order(3)
    @BindView(2131296976)
    @NotEmpty(messageResId = 2131820778, sequence = 1, trim = true)
    EditText etEmail;
    @BindView(2131297006)
    @NotEmpty(messageResId = 2131820819, trim = true)
    @Order(2)
    EditText etJumlah;
    @Order(1)
    @BindView(2131297107)
    @NotEmpty(messageResId = 2131820920, sequence = 1, trim = true)
    @Length(messageResId = 2131820923, min = 10, sequence = 2)
    EditText etNorek;
    @BindView(2131297706)
    LinearLayout llJumlah;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindViews({2131298653, 2131297706, 2131298527})
    List<View> tilForms;
    @BindView(2131298554)
    LogoutDialog_ViewBinding tilJumlah;
    @BindView(2131298653)
    LogoutDialog_ViewBinding tilNorek;
    @BindViews({2131299126, 2131299030, 2131299006})
    List<TextView> tvErrors;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etJumlah.getEditableText()) {
            this.etJumlah.removeTextChangedListener(this);
            String obj = this.etJumlah.getText().toString();
            String str = obj;
            if (!this.etJumlah.getText().toString().contains(",")) {
                str = obj;
                if (this.etJumlah.length() > 17) {
                    str = this.etJumlah.getText().toString().substring(0, 17);
                }
            }
            String str2 = str;
            if (str.equals("0")) {
                str2 = "";
            }
            int length = this.etJumlah.length();
            this.etJumlah.setText(getPromotion.i(str2));
            int length2 = (this.a + this.etJumlah.length()) - length;
            if (length2 > 0) {
                this.etJumlah.setSelection(length2);
            } else {
                this.etJumlah.setSelection(0);
            }
            this.etJumlah.addTextChangedListener(this);
            ((TarikanUbahTransaksiActivity) getActivity()).f.getTxnDetail().setTxnAmount(this.etJumlah.getText().toString().replaceAll("\\.", ""));
        } else if (editable == this.etNorek.getEditableText()) {
            ((TarikanUbahTransaksiActivity) getActivity()).f.getTxnDetail().setAccountNumber(this.etNorek.getText().toString());
        } else if (editable == this.etEmail.getEditableText()) {
            ((TarikanUbahTransaksiActivity) getActivity()).f.getTxnDetail().setEmail(this.etEmail.getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.fragment.BaseFragment
    public final void b(View view) {
        b(view);
        documentProvider.b().c(this);
        Validator validator = new Validator(this);
        this.d = validator;
        validator.setValidationListener(this);
        if (this.e == null || this.e.getVerified().equals("N")) {
            new InfoTarikanDialog().show(getFragmentManager(), "InfoTarikanDialog");
        }
        if (this.e == null) {
            this.tilEmail.setVisibility(0);
        } else if (this.e.getVerified().equals("Y")) {
            this.etNorek.setFocusable(false);
            this.etNorek.setHint(getString(2131821204));
            this.etNorek.setFilters(new InputFilter[0]);
        }
        this.etNorek.setText(((TarikanUbahTransaksiActivity) getActivity()).f.getTxnDetail().getAccountNumber());
        this.etJumlah.setText(getPromotion.i(((TarikanUbahTransaksiActivity) getActivity()).f.getTxnDetail().getTxnAmount()));
        if (!this.etNorek.getText().toString().isEmpty()) {
            this.tilNorek.setHintEnabled(true);
        }
        if (!this.etJumlah.getText().toString().isEmpty()) {
            this.tilJumlah.setHintEnabled(true);
        }
        if (!this.etEmail.getText().toString().isEmpty()) {
            this.tilEmail.setHintEnabled(true);
        }
        this.etNorek.addTextChangedListener(this);
        this.etJumlah.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493275;
    }

    @OnClick({2131296396})
    public void lanjut() {
        getPromotion.d(getActivity());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (View view : this.tilForms) {
            view.setBackgroundResource(2131230847);
        }
        this.d.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        getPromotion.d(getContext());
        setOnHierarchyChangeListener.a((Activity) getActivity());
    }

    @OnFocusChange({2131297107, 2131297006, 2131296976})
    public void onChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131296976) {
                this.tilEmail.setHintEnabled(true);
            } else if (id == 2131297006) {
                this.tilJumlah.setHintEnabled(true);
            } else if (id == 2131297107) {
                this.tilNorek.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131296976) {
                if (id2 != 2131297006) {
                    if (id2 == 2131297107 && this.etNorek.getText().toString().isEmpty()) {
                        this.tilNorek.setHintEnabled(false);
                    }
                } else if (this.etJumlah.getText().toString().isEmpty()) {
                    this.tilJumlah.setHintEnabled(false);
                }
            } else if (this.etEmail.getText().toString().isEmpty()) {
                this.tilEmail.setHintEnabled(false);
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseRekening(ReservasiROSuccessActivity reservasiROSuccessActivity) {
        if (!reservasiROSuccessActivity.d.isEmpty()) {
            this.etNorek.setText(reservasiROSuccessActivity.d.split("-")[0].trim());
            this.tilNorek.setHintEnabled(true);
            ((TarikanUbahTransaksiActivity) getActivity()).f.getTxnDetail().setAccountNumber(this.etNorek.getText().toString());
            return;
        }
        this.tilNorek.setHintEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        documentProvider.b().e(this);
        onDestroy();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onHubungiCabangTarikanEvent(showDataOrangDatangKeCabang showdataorangdatangkecabang) {
        c(2131296811, new TarikanUbahInfoBiayaFragment(), "TarikanUbahInfoBiayaFragment");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 == 0) {
            this.a = i + 1;
        } else {
            this.a = i;
        }
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
                if (id == 2131296976) {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilEmail.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id == 2131297006) {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilJumlah.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297107) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(0).setVisibility(0);
                    if (this.e == null || !this.e.getVerified().equals("Y")) {
                        this.tvErrors.get(0).setText(message);
                    } else {
                        this.tvErrors.get(0).setText(getString(2131820922));
                    }
                    this.tilNorek.setBackgroundResource(2131230870);
                    editText = editText2;
                }
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
        if (Long.parseLong((this.etJumlah.getText().toString().isEmpty() ? "0" : this.etJumlah.getText().toString()).replaceAll("\\.", "")) <= 100000000) {
            c(2131296811, new TReviewTarikanUbahFragment(), "TReviewTarikanUbahFragment");
        } else if (this.e != null) {
            new Tarikan100JutaMemberDialog().show(getFragmentManager(), "Tarikan100JutaMemberDialog");
        } else {
            new Tarikan100JutaGuestDialog().show(getFragmentManager(), "Tarikan100JutaGuestDialog");
        }
    }

    @OnClick({2131297107})
    public void pilihNoRek() {
        if (this.e != null && this.e.getVerified().equals("Y")) {
            PilihRekeningDialog pilihRekeningDialog = new PilihRekeningDialog();
            pilihRekeningDialog.e = ((TarikanUbahTransaksiActivity) getActivity()).n;
            pilihRekeningDialog.a = true;
            pilihRekeningDialog.c = this.etNorek.getText().toString();
            pilihRekeningDialog.show(getFragmentManager(), "PilihRekeningDialog");
        }
    }
}
