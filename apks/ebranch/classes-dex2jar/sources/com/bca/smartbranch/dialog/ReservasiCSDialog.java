package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.CategoryListAdapter$CategoryListVH;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ReservasiCSDialog.class */
public class ReservasiCSDialog extends BaseDialog {
    private String b;
    private Unbinder e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.b = arguments.getString("product");
        }
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493098;
    }

    @OnClick({2131296416})
    public void onClickNo(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new CategoryListAdapter$CategoryListVH(false, this.b));
    }

    @OnClick({2131296462})
    public void onClickYes(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new CategoryListAdapter$CategoryListVH(true, this.b));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
