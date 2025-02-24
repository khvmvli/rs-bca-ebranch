package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.documentProvider;
import o.onChooseBankTujuan;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/UserBlockedDialog.class */
public class UserBlockedDialog extends BaseDialog {
    private Unbinder a;
    @BindView(2131298883)
    TextView tvContent;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.a = ButterKnife.bind(this, view);
    }

    @OnClick({2131296380})
    public void clickedBatal(View view) {
        getDialog().dismiss();
    }

    @OnClick({2131296378})
    public void clickedLogin(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new onChooseBankTujuan());
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493113;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        getArguments();
        this.tvContent.setText(Html.fromHtml(getString(2131822335)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.a.unbind();
    }
}
