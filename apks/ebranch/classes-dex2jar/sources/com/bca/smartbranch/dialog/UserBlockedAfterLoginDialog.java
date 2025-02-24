package com.bca.smartbranch.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.LandingActivity;
import o.documentProvider;
import o.onChooseBankTujuan;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/UserBlockedAfterLoginDialog.class */
public class UserBlockedAfterLoginDialog extends BaseDialog {
    private Unbinder b;
    @BindView(2131298883)
    TextView tvContent;

    private void e() {
        getDialog().dismiss();
        startActivity(new Intent(getContext(), LandingActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
    }

    @OnClick({2131296380})
    public void clickedBatal(View view) {
        e();
    }

    @OnClick({2131296378})
    public void clickedLogin(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new onChooseBankTujuan());
    }

    @OnClick({2131296385})
    public void close(View view) {
        e();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493113;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvContent.setText(Html.fromHtml(getString(2131822335)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
