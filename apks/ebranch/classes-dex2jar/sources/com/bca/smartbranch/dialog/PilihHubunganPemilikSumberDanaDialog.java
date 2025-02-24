package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import butterknife.Unbinder;
import com.bca.smartbranch.adapter.HubunganPemilikSumberDanaAdapter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.LogoutDialog_ViewBinding;
import o.PilihNegaraBagianActivity_ViewBinding;
import o.RegistrationSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PilihHubunganPemilikSumberDanaDialog.class */
public class PilihHubunganPemilikSumberDanaDialog extends BaseDialog implements Validator.ValidationListener, TextWatcher {
    private Validator b;
    private List<DaftarTransferAdapter$DaftarTransferVH> c = new ArrayList();
    private HubunganPemilikSumberDanaAdapter d;
    @BindArray(2130903061)
    String[] data;
    private Unbinder e;
    @BindView(2131297017)
    @NotEmpty(messageResId = 2131820826, sequence = 1, trim = true)
    @Order(1)
    EditText etKeterangan;
    @BindString(2131821822)
    String labelLainnya;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindView(2131298563)
    LogoutDialog_ViewBinding tilKeterangan;
    @BindString(2131822049)
    String title;
    @BindView(2131299040)
    TextView tvErrorKeterangan;
    @BindView(2131299615)
    TextView tvTitle;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etKeterangan.getEditableText()) {
            this.tvErrorKeterangan.setVisibility(8);
            this.tilKeterangan.setBackgroundResource(2131230847);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        documentProvider.b().c(this);
        this.e = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        Validator validator = new Validator(this);
        this.b = validator;
        validator.setValidationListener(this);
        Bundle arguments = getArguments();
        int i = -1;
        if (arguments != null) {
            String string = arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "");
            int i2 = 0;
            int i3 = -1;
            while (true) {
                String[] strArr = this.data;
                if (i2 >= strArr.length) {
                    break;
                }
                if (string.equals(strArr[i2])) {
                    i3 = i2;
                }
                i2++;
            }
            if (i3 != -1 || string.isEmpty()) {
                i = i3 == -1 ? 0 : i3;
            } else {
                i = this.data.length - 1;
                this.tilKeterangan.setVisibility(0);
                this.tilKeterangan.setHintEnabled(true);
                this.etKeterangan.setText(string);
            }
        }
        String[] strArr2 = this.data;
        int i4 = 0;
        for (String str : strArr2) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = str;
            if (i == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.c.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        this.d = new HubunganPemilikSumberDanaAdapter(getContext(), this.c);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvContent.setAdapter(this.d);
        this.tvTitle.setText(this.title);
        this.etKeterangan.addTextChangedListener(this);
    }

    @OnClick({2131296419})
    public void clickPilih(View view) {
        this.b.validate();
    }

    @OnClick({2131296385})
    public void close() {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493093;
    }

    @OnFocusChange({2131297017})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297017) {
                this.tilKeterangan.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297017 && this.etKeterangan.getText().toString().isEmpty()) {
            this.tilKeterangan.setHintEnabled(false);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseRekening(PilihNegaraBagianActivity_ViewBinding pilihNegaraBagianActivity_ViewBinding) {
        this.tvErrorKeterangan.setVisibility(8);
        this.tilKeterangan.setBackgroundResource(2131230847);
        if (pilihNegaraBagianActivity_ViewBinding.c.equalsIgnoreCase(this.labelLainnya)) {
            this.tilKeterangan.setVisibility(0);
        } else {
            this.tilKeterangan.setVisibility(8);
        }
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
                if (view.getId() != 2131297017) {
                    editText = editText2;
                } else {
                    this.tvErrorKeterangan.setVisibility(0);
                    this.tvErrorKeterangan.setText(message);
                    this.tilKeterangan.setBackgroundResource(2131230870);
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
        if (this.d.e >= 0) {
            HubunganPemilikSumberDanaAdapter hubunganPemilikSumberDanaAdapter = this.d;
            String str = (hubunganPemilikSumberDanaAdapter.b.isEmpty() || !hubunganPemilikSumberDanaAdapter.b.get(hubunganPemilikSumberDanaAdapter.e).d) ? "" : hubunganPemilikSumberDanaAdapter.b.get(hubunganPemilikSumberDanaAdapter.e).e;
            String str2 = str;
            if (str.equalsIgnoreCase(this.labelLainnya)) {
                str2 = this.etKeterangan.getText().toString();
            }
            documentProvider.b().d(new RegistrationSuccessActivity(str2));
        }
        dismiss();
    }
}
