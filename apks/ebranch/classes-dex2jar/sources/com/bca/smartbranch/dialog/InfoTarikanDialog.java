package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/InfoTarikanDialog.class */
public class InfoTarikanDialog extends BaseDialog {
    private Unbinder a;
    @BindString(2131822075)
    String labelInfo;
    @BindString(2131821625)
    String labelValue;
    @BindView(2131298883)
    TextView tvContent;
    @BindView(2131299282)
    TextView tvInfo;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.a = ButterKnife.bind(this, view);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493079;
    }

    @OnClick({2131296385})
    public void lanjut() {
        getDialog().dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvContent.setText(Html.fromHtml(this.labelValue));
        this.tvInfo.setText(Html.fromHtml(this.labelInfo));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.a.unbind();
    }
}
