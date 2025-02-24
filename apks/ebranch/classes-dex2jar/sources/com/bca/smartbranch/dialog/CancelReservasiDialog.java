package com.bca.smartbranch.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import butterknife.Unbinder;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.List;
import o.ChooseBCACardAdapter$ViewHolder;
import o.LogoutDialog_ViewBinding;
import o.documentProvider;
import o.getPromotion;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/CancelReservasiDialog.class */
public class CancelReservasiDialog extends BaseDialog implements Validator.ValidationListener {
    private Validator a;
    private String b;
    private Unbinder c;
    private String d;
    @BindView(2131296945)
    @NotEmpty(messageResId = 2131820736, sequence = 1, trim = true)
    @Order(1)
    EditText etAlasan;
    @BindView(2131298137)
    RadioButton rbCabangTerlaluJauh;
    @BindView(2131298151)
    RadioButton rbKeperluanMendadak;
    @BindView(2131298162)
    RadioButton rbLainnya;
    @BindView(2131298193)
    RadioButton rbWaktuTidakCocok;
    @BindView(2131298494)
    LogoutDialog_ViewBinding tilAlasan;
    @BindView(2131298873)
    TextView tvCabangTerlaluJauh;
    @BindView(2131298952)
    TextView tvError;
    @BindView(2131299346)
    TextView tvKeperluanMendadak;
    @BindView(2131299739)
    TextView tvWaktuTidakCocok;

    private void c() {
        this.rbWaktuTidakCocok.setChecked(false);
        this.rbKeperluanMendadak.setChecked(false);
        this.rbCabangTerlaluJauh.setChecked(false);
        this.rbLainnya.setChecked(false);
        this.tilAlasan.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.c = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
    }

    @OnClick({2131296383, 2131296385})
    public void cancel() {
        dismiss();
    }

    @OnClick({2131297560, 2131298137})
    public void chooseCabangTerlaluJauh() {
        c();
        this.rbCabangTerlaluJauh.setChecked(true);
        this.tvError.setVisibility(8);
        this.tilAlasan.setBackgroundResource(2131230847);
    }

    @OnClick({2131297722, 2131298151})
    public void chooseKeperluanMendadak() {
        c();
        this.rbKeperluanMendadak.setChecked(true);
        this.tvError.setVisibility(8);
        this.tilAlasan.setBackgroundResource(2131230847);
    }

    @OnClick({2131297755, 2131298162})
    public void chooseLainnya() {
        c();
        this.rbLainnya.setChecked(true);
        this.tilAlasan.setVisibility(0);
    }

    @OnClick({2131297933, 2131298193})
    public void chooseWaktuTidakCocok() {
        c();
        this.rbWaktuTidakCocok.setChecked(true);
        this.tvError.setVisibility(8);
        this.tilAlasan.setBackgroundResource(2131230847);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493058;
    }

    @OnFocusChange({2131296945})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131296945) {
                this.tilAlasan.setHintEnabled(true);
            }
        } else if (view.getId() == 2131296945 && this.etAlasan.getText().toString().isEmpty()) {
            this.tilAlasan.setHintEnabled(false);
        }
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Validator validator = new Validator(this);
        this.a = validator;
        validator.setValidationListener(this);
        return onCreateDialog;
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationFailed(List<ValidationError> list) {
        View view = list.get(0).getView();
        list.get(0).getFailedRules().get(0).getMessage(getContext());
        if (view instanceof EditText) {
            this.tvError.setVisibility(0);
            this.tilAlasan.setBackgroundResource(2131230870);
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        dismiss();
        documentProvider.b().d(new ChooseBCACardAdapter$ViewHolder(this.b, this.d, this.rbWaktuTidakCocok.isChecked() ? this.tvWaktuTidakCocok.getText().toString() : this.rbKeperluanMendadak.isChecked() ? this.tvKeperluanMendadak.getText().toString() : this.rbCabangTerlaluJauh.isChecked() ? this.tvCabangTerlaluJauh.getText().toString() : this.etAlasan.getText().toString(), true));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.b = arguments.getString("noref");
        this.d = arguments.getString("token");
    }

    @OnClick({2131296452})
    public void submit() {
        getPromotion.d(getContext());
        this.tvError.setVisibility(8);
        this.tilAlasan.setBackgroundResource(2131230847);
        this.a.validate();
    }
}
