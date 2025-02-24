package com.bca.smartbranch.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.ConfirmBCACardAdapter$ViewHolder_ViewBinding;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/UpdateDaftarTransferSuccessDialog.class */
public class UpdateDaftarTransferSuccessDialog extends BaseDialog {
    private Unbinder b;
    @BindString(2131822334)
    String desc;
    @BindString(2131821405)
    String no;
    @BindString(2131822509)
    String title;
    @BindView(2131298883)
    TextView tvDesc;
    @BindView(2131299615)
    TextView tvTitle;
    @BindString(2131821409)
    String yes;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
        Bundle arguments = getArguments();
        this.tvTitle.setText(getString(2131822509, "Nomor Rekening"));
        this.tvDesc.setText(getString(2131822334, "Nomor Rekening"));
        if (arguments != null && arguments.getBoolean("flag-iban", false)) {
            this.tvTitle.setText(getString(2131822509, "Nomor IBAN"));
            this.tvDesc.setText(getString(2131822334, "Nomor IBAN"));
        }
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493092;
    }

    @OnClick({2131296385})
    public void onClickClose(View view) {
        dismiss();
    }

    @Override // o.getText, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        documentProvider.b().d(new ConfirmBCACardAdapter$ViewHolder_ViewBinding());
        onDismiss(dialogInterface);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
