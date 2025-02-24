package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.ChooseMastercardAdapter$ViewHolder;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/FingerprintSuccessDialog.class */
public class FingerprintSuccessDialog extends BaseDialog {
    private Unbinder e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
    }

    @OnClick({2131296385})
    public void clickedBatal(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493069;
    }

    @Override // o.getText, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        documentProvider.b().d(new ChooseMastercardAdapter$ViewHolder(true));
        onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
