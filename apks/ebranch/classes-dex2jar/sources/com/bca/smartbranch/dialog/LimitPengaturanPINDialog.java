package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.Unbinder;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/LimitPengaturanPINDialog.class */
public class LimitPengaturanPINDialog extends BaseInfoDialog {
    public static final String TAG = "LimitPengaturanPINDialog";
    private Unbinder mUnbinder;
    @BindString(2131822037)
    String title;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseInfoDialog, com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.mUnbinder = ButterKnife.bind(this, view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText(this.title);
        this.tvDesc.setText(getArguments().getString("desc", ""));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseInfoDialog, com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.mUnbinder.unbind();
    }
}
