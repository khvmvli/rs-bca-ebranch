package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.Unbinder;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/InfoEchannelDialog.class */
public class InfoEchannelDialog extends BaseInfoDialog {
    public static final String TAG = "InfoDialog";
    @BindString(2131821619)
    String labelValue;
    private Unbinder mUnbinder;

    @Override // com.bca.smartbranch.dialog.BaseInfoDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void bindViews(View view) {
        bindViews(view);
        this.mUnbinder = ButterKnife.bind(this, view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText("Info");
        this.tvDesc.setText(Html.fromHtml(this.labelValue));
    }

    @Override // com.bca.smartbranch.dialog.BaseInfoDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void unbindViews() {
        unbindViews();
        this.mUnbinder.unbind();
    }
}
