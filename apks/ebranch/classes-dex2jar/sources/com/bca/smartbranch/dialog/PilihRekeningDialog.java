package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import butterknife.Unbinder;
import com.bca.smartbranch.adapter.RekeningSumberDanaAdapter;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.LogoutDialog_ViewBinding;
import o.ReservasiROSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TransaksiTellerActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PilihRekeningDialog.class */
public class PilihRekeningDialog extends BaseDialog implements Validator.ValidationListener, TextWatcher {
    public String c;
    public GetCustAcctListResponse e;
    @BindString(2131820918)
    String errorNomorRekeningBaruEmpty;
    @BindString(2131820919)
    String errorNomorRekeningBaruNotValid;
    @Order(1)
    @BindView(2131297166)
    @NotEmpty(messageResId = 2131820918, sequence = 1, trim = true)
    @Length(messageResId = 2131820919, min = 10, sequence = 2)
    EditText etRekeningLain;
    @BindView(2131297176)
    EditText etSearch;
    private RekeningSumberDanaAdapter f;
    private Bundle h;
    private Unbinder j;
    private Validator m;
    @BindString(2131821966)
    String nomorRekeningTidakAda;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindView(2131298702)
    LogoutDialog_ViewBinding tilRekeningLain;
    @BindString(2131822257)
    String title;
    @BindView(2131299170)
    TextView tvErrorRekeningLain;
    @BindView(2131299615)
    TextView tvTitle;
    List<String> d = new ArrayList();
    List<DaftarTransferAdapter$DaftarTransferVH> b = new ArrayList();
    private final List<DaftarTransferAdapter$DaftarTransferVH> i = new ArrayList();
    public boolean a = false;
    private String g = null;

    private void d() {
        this.i.clear();
        String str = this.g;
        if (str != null) {
            if (!this.nomorRekeningTidakAda.equalsIgnoreCase(str)) {
                this.c = this.g;
            } else if (!this.etRekeningLain.getText().toString().isEmpty()) {
                this.c = this.etRekeningLain.getText().toString();
            } else {
                this.c = this.nomorRekeningTidakAda;
            }
        }
        boolean z = true;
        boolean z2 = true;
        for (String str2 : this.d) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = str2;
            if (this.c.isEmpty() && z2) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
                z = false;
                z2 = false;
            } else if (this.c.isEmpty() || !str2.contains(this.c)) {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = true;
                z = false;
            }
            this.i.add(daftarTransferAdapter$DaftarTransferVH);
        }
        if (this.a) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH2 = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH2.e = this.nomorRekeningTidakAda;
            daftarTransferAdapter$DaftarTransferVH2.d = z;
            this.i.add(daftarTransferAdapter$DaftarTransferVH2);
            if (z && this.c != null) {
                this.tilRekeningLain.setVisibility(0);
                if (!this.nomorRekeningTidakAda.contains(this.c)) {
                    this.tilRekeningLain.setHintEnabled(true);
                    this.etRekeningLain.setText(this.c);
                }
            }
        }
    }

    private void e() {
        d();
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        RekeningSumberDanaAdapter rekeningSumberDanaAdapter = new RekeningSumberDanaAdapter(getContext(), this.i);
        this.f = rekeningSumberDanaAdapter;
        this.rvContent.setAdapter(rekeningSumberDanaAdapter);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etRekeningLain.getEditableText()) {
            this.tvErrorRekeningLain.setVisibility(8);
            this.tilRekeningLain.setBackgroundResource(2131230847);
            return;
        }
        d();
        if (editable.toString().length() > 0) {
            this.b.clear();
            for (DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH : this.i) {
                if (daftarTransferAdapter$DaftarTransferVH.e.toLowerCase().contains(editable.toString().toLowerCase()) || daftarTransferAdapter$DaftarTransferVH.e.toLowerCase().contains(this.nomorRekeningTidakAda.toLowerCase())) {
                    this.b.add(daftarTransferAdapter$DaftarTransferVH);
                } else {
                    daftarTransferAdapter$DaftarTransferVH.d = false;
                }
            }
            RekeningSumberDanaAdapter rekeningSumberDanaAdapter = this.f;
            rekeningSumberDanaAdapter.e = this.b;
            rekeningSumberDanaAdapter.b = null;
            rekeningSumberDanaAdapter.f = -1;
            rekeningSumberDanaAdapter.a.b();
            return;
        }
        RekeningSumberDanaAdapter rekeningSumberDanaAdapter2 = this.f;
        rekeningSumberDanaAdapter2.e = this.i;
        rekeningSumberDanaAdapter2.b = null;
        rekeningSumberDanaAdapter2.f = -1;
        rekeningSumberDanaAdapter2.a.b();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        documentProvider.b().c(this);
        this.j = ButterKnife.bind(this, view);
        Bundle arguments = getArguments();
        this.h = arguments;
        if (arguments != null) {
            this.title = arguments.getString("PilihRekeningDialogTitle", getContext().getResources().getString(2131822257));
        }
        Validator validator = new Validator(this);
        this.m = validator;
        validator.setValidationListener(this);
        for (GetCustAcctListResponse.AccountData accountData : this.e.getAccountList()) {
            List<String> list = this.d;
            StringBuilder sb = new StringBuilder();
            sb.append(accountData.getAccountNumber());
            sb.append(" - ");
            sb.append(accountData.getAccountType());
            list.add(sb.toString());
        }
        getDialog().setCanceledOnTouchOutside(false);
        String str = this.title;
        if (str == null || str.isEmpty()) {
            this.tvTitle.setText(getContext().getResources().getString(2131822257));
        } else {
            this.tvTitle.setText(this.title);
        }
        this.etSearch.addTextChangedListener(this);
        this.etRekeningLain.addTextChangedListener(this);
        e();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493095;
    }

    @OnFocusChange({2131297166})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297166) {
                this.tilRekeningLain.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297166 && this.etRekeningLain.getText().toString().isEmpty()) {
            this.tilRekeningLain.setHintEnabled(false);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseRekening(TransaksiTellerActivity_ViewBinding transaksiTellerActivity_ViewBinding) {
        if (transaksiTellerActivity_ViewBinding.a.toLowerCase().contains(this.nomorRekeningTidakAda.toLowerCase())) {
            this.tilRekeningLain.setVisibility(0);
        } else {
            this.tilRekeningLain.setVisibility(8);
        }
        this.tvErrorRekeningLain.setVisibility(8);
        this.tilRekeningLain.setBackgroundResource(2131230847);
        try {
            if (this.nomorRekeningTidakAda.equalsIgnoreCase(transaksiTellerActivity_ViewBinding.a)) {
                this.g = this.nomorRekeningTidakAda;
            } else {
                this.g = transaksiTellerActivity_ViewBinding.a.split(" - ")[0].trim();
            }
        } catch (Exception e) {
        }
    }

    @OnClick({2131296385})
    public void onClickClose(View view) {
        dismiss();
    }

    @OnClick({2131296419})
    public void onClickPilih(View view) {
        this.m.validate();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        documentProvider.b().e(this);
        onDestroy();
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
                if (view.getId() != 2131297166) {
                    editText = editText2;
                } else {
                    this.tvErrorRekeningLain.setVisibility(0);
                    this.tvErrorRekeningLain.setText(message);
                    this.tilRekeningLain.setBackgroundResource(2131230870);
                    editText = editText2;
                }
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        if (this.f.f >= 0) {
            String e = this.f.e();
            String str = e;
            if (e.toLowerCase().contains(this.nomorRekeningTidakAda.toLowerCase())) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.etRekeningLain.getText().toString());
                sb.append("-");
                sb.append(e);
                str = sb.toString();
            }
            documentProvider.b().d(new ReservasiROSuccessActivity(str));
        }
        dismiss();
    }

    @OnClick({2131296852})
    public void search() {
        this.etSearch.requestFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.etSearch, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.j.unbind();
    }
}
