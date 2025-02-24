package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.TransactionCSActivity_ViewBinding;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HapusTransaksiBerkalaDialog.class */
public class HapusTransaksiBerkalaDialog extends BaseKonfirmasiDialog {
    private Unbinder b;
    @BindString(2131821604)
    String desc;
    @BindString(2131822169)
    String no;
    @BindString(2131822180)
    String title;
    @BindString(2131822353)
    String yes;

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
    }

    @OnClick({2131296462})
    public void clickedYes() {
        dismiss();
        documentProvider.b().d(new TransactionCSActivity_ViewBinding());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText(this.title);
        this.tvDesc.setText(this.desc);
        this.btnNo.setText(this.no);
        this.btnYes.setText(this.yes);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
