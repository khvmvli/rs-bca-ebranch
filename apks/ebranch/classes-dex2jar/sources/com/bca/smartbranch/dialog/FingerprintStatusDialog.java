package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.documentProvider;
import o.onClicedButton;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/FingerprintStatusDialog.class */
public class FingerprintStatusDialog extends BaseDialog {
    private Bundle a;
    private boolean b;
    private Unbinder e;
    @BindView(2131297361)
    ImageView ivFingerprint;
    @BindView(2131299259)
    TextView tvFingerprintStatus;
    @BindView(2131299260)
    TextView tvFingerprintStatusDescription;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
    }

    @OnClick({2131296385})
    public void clickedOk(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493068;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        documentProvider.b().d(new onClicedButton(this.b));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.a = arguments;
        boolean z = arguments.getBoolean("is_fingerprint_active", false);
        this.b = z;
        if (z) {
            this.tvFingerprintStatus.setText(2131821651);
            this.tvFingerprintStatusDescription.setText(2131821658);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
