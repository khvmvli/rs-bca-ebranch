package com.bca.smartbranch.dialog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.LandingActivity;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/Tarikan100JutaGuestDialog.class */
public class Tarikan100JutaGuestDialog extends BaseKonfirmasiDialog {
    private Unbinder e;
    @BindString(2131822163)
    String txtContent;

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
    }

    @OnClick({2131296462})
    public void clickedLogin(View view) {
        getDialog().dismiss();
        startActivity(new Intent(getContext(), LandingActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText("Info");
        this.tvDesc.setText(Html.fromHtml(this.txtContent));
        this.btnNo.setText("Batal");
        this.btnYes.setText("Login");
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
