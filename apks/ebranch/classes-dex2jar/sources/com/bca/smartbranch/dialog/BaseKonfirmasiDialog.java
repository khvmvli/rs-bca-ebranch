package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/BaseKonfirmasiDialog.class */
public class BaseKonfirmasiDialog extends BaseDialog {
    private Unbinder b;
    @BindView(2131296416)
    Button btnNo;
    @BindView(2131296462)
    Button btnYes;
    @BindView(2131298918)
    TextView tvDesc;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
    }

    @OnClick({2131296416})
    public void clickedNo() {
        getDialog().dismiss();
    }

    @OnClick({2131296385})
    public void close() {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493053;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
