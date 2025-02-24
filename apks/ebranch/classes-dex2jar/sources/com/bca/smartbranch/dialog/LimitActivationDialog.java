package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.Unbinder;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/LimitActivationDialog.class */
public class LimitActivationDialog extends BaseInfoDialog {
    public static final String TAG = "LimitActivationDialog";
    private Unbinder mUnbinder;
    @BindString(2131822036)
    String title;

    @Override // com.bca.smartbranch.dialog.BaseInfoDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void bindViews(View view) {
        bindViews(view);
        this.mUnbinder = ButterKnife.bind(this, view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText(this.title);
        this.tvDesc.setText(getArguments().getString("desc", ""));
    }

    @Override // com.bca.smartbranch.dialog.BaseInfoDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void unbindViews() {
        unbindViews();
        this.mUnbinder.unbind();
    }
}
