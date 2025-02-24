package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/Tarikan100JutaMemberDialog.class */
public class Tarikan100JutaMemberDialog extends BaseDialog {
    @BindView(2131296462)
    Button btnYes;
    private Unbinder c;
    @BindView(2131298918)
    TextView tvDesc;
    @BindView(2131299615)
    TextView tvTitle;
    @BindString(2131822164)
    String txtContent;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.c = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void clickedClose(View view) {
        getDialog().dismiss();
    }

    @OnClick({2131296462})
    public void clickedLanjut(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493107;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText("Info");
        this.tvDesc.setText(this.txtContent);
        this.btnYes.setText("Lanjut");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.c.unbind();
    }
}
