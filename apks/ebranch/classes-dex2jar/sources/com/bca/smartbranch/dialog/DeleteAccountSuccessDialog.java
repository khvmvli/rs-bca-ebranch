package com.bca.smartbranch.dialog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.LandingActivity;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DeleteAccountSuccessDialog.class */
public class DeleteAccountSuccessDialog extends BaseDialog {
    @BindString(2131822433)
    String content;
    private Unbinder d;
    @BindString(2131822506)
    String title;
    @BindView(2131298883)
    TextView tvContent;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493092;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        startActivity(new Intent(getContext(), LandingActivity.class));
        requireActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) requireActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText(this.title);
        this.tvContent.setText(this.content);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.d.unbind();
    }
}
