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
import com.bca.smartbranch.activity.ProfileActivity;
import com.bca.smartbranch.data.localdb.User;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import o.ListUtil;
import o.documentProvider;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ResetAccountSuccessDialog.class */
public class ResetAccountSuccessDialog extends BaseDialog {
    @BindString(2131822435)
    String content;
    private User d;
    private Unbinder e;
    @BindString(2131822508)
    String title;
    @BindView(2131298883)
    TextView tvContent;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493099;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        startActivity(new Intent(getContext(), ProfileActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
        documentProvider.b().d(new Object() { // from class: o.BranchMapItemBNAdapter$BranchMapItemVH_ViewBinding
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText(this.title);
        this.tvContent.setText(this.content);
        this.d = (User) ListUtil.OneItemImmutableList.a(getArguments().getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
    }

    @OnClick({2131296439})
    public void profile(View view) {
        getDialog().dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
