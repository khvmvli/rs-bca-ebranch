package com.bca.smartbranch.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.LoginActivity;
import com.bca.smartbranch.activity.RegistrationActivity;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/FiturReservasiGuestDialog.class */
public class FiturReservasiGuestDialog extends BaseKonfirmasiDialog {
    @BindString(2131822086)
    String desc;
    private Unbinder e;
    @BindString(2131821388)
    String no;
    @BindString(2131821716)
    String title;
    @BindString(2131821402)
    String yes;

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog
    @OnClick({2131296416})
    public void clickedNo() {
        getActivity().startActivityForResult(new Intent(getContext(), LoginActivity.class), 9898);
        getDialog().dismiss();
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
        this.e.unbind();
    }
}
