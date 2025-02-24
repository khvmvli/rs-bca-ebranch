package com.bca.smartbranch.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.RegistrationActivity;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/FiturSignUpDialog.class */
public class FiturSignUpDialog extends BaseKonfirmasiDialog {
    private Unbinder c;
    @BindString(2131822327)
    String desc;
    @BindString(2131822172)
    String no;
    @BindString(2131822326)
    String title;
    @BindString(2131822357)
    String yes;

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void bindViews(View view) {
        bindViews(view);
        this.c = ButterKnife.bind(this, view);
    }

    @OnClick({2131296462})
    public void clickedYes() {
        getActivity().startActivityForResult(new Intent(getContext(), RegistrationActivity.class), 9898);
        getDialog().dismiss();
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
        this.c.unbind();
    }
}
