package com.bca.smartbranch.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/CancelTransaksiDialog.class */
public class CancelTransaksiDialog extends BaseDialog implements Validator.ValidationListener {
    private Unbinder a;
    private String b;
    private Validator d;
    private String e;
    @BindView(2131296945)
    @NotEmpty(messageResId = 2131820736, sequence = 1, trim = true)
    @Order(1)
    EditText etAlasan;
    @BindView(2131297896)
    LinearLayout llSudahDatangKeCabang;
    @BindView(2131297897)
    LinearLayout llSudahTransaksiEchannel;
    @BindView(2131298136)
    RadioButton rbBelumYakinBertransaksi;
    @BindView(2131298138)
    RadioButton rbDokumenBelumLengkap;
    @BindView(2131298162)
    RadioButton rbLainnya;
    @BindView(2131298181)
    RadioButton rbSudahDatangKeCabang;
    @BindView(2131298182)
    RadioButton rbSudahTransaksiEchannel;
    @BindView(2131298494)
    LogoutDialog_ViewBinding tilAlasan;
    @BindView(2131298845)
    TextView tvBelumYakinBertransaksi;
    @BindView(2131298946)
    TextView tvDokumenBelumLengkap;
    @BindView(2131298952)
    TextView tvError;
    @BindView(2131299587)
    TextView tvSudahDatangKeCabang;
    @BindView(2131299588)
    TextView tvSudahTransaksiEchannel;

    private void d() {
        this.rbDokumenBelumLengkap.setChecked(false);
        this.rbSudahTransaksiEchannel.setChecked(false);
        this.rbSudahDatangKeCabang.setChecked(false);
        this.rbBelumYakinBertransaksi.setChecked(false);
        this.rbLainnya.setChecked(false);
        this.tilAlasan.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.a = ButterKnife.bind(this, view);
    }

    @OnClick({2131296383, 2131296385})
    public void cancel() {
        dismiss();
    }

    @OnClick({2131297547, 2131298136})
    public void chooseBelumYakinBertransaksi() {
        d();
        this.rbBelumYakinBertransaksi.setChecked(true);
        this.tvError.setVisibility(8);
        this.tilAlasan.setBackgroundResource(2131230847);
    }

    @OnClick({2131297627, 2131298138})
    public void chooseDokumenBelumLengkap() {
        d();
        this.rbDokumenBelumLengkap.setChecked(true);
        this.tvError.setVisibility(8);
        this.tilAlasan.setBackgroundResource(2131230847);
    }

    @OnClick({2131297755, 2131298162})
    public void chooseLainnya() {
        d();
        this.rbLainnya.setChecked(true);
        this.tilAlasan.setVisibility(0);
    }

    @OnClick({2131297896, 2131298181})
    public void chooseSudahDatangKeCabang() {
        d();
        this.rbSudahDatangKeCabang.setChecked(true);
        this.tvError.setVisibility(8);
        this.tilAlasan.setBackgroundResource(2131230847);
    }

    @OnClick({2131297897, 2131298182})
    public void chooseSudahTransaksiEchannel() {
        d();
        this.rbSudahTransaksiEchannel.setChecked(true);
        this.tvError.setVisibility(8);
        this.tilAlasan.setBackgroundResource(2131230847);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493059;
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
        this.d = validator;
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
        documentProvider.b().d(new ChooseBCACardAdapter$ViewHolder(this.b, this.e, this.rbDokumenBelumLengkap.isChecked() ? this.tvDokumenBelumLengkap.getText().toString() : this.rbSudahTransaksiEchannel.isChecked() ? this.tvSudahTransaksiEchannel.getText().toString() : this.rbSudahDatangKeCabang.isChecked() ? this.tvSudahDatangKeCabang.getText().toString() : this.rbBelumYakinBertransaksi.isChecked() ? this.tvBelumYakinBertransaksi.getText().toString() : this.etAlasan.getText().toString(), false));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.b = arguments.getString("noref");
        this.e = arguments.getString("token");
    }

    @OnClick({2131296452})
    public void submit() {
        getPromotion.d(getContext());
        this.tvError.setVisibility(8);
        this.tilAlasan.setBackgroundResource(2131230847);
        this.d.validate();
    }
}
