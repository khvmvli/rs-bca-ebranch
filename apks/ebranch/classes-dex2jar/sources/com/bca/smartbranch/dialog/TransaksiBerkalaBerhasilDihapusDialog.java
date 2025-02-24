package com.bca.smartbranch.dialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TransaksiBerkalaBerhasilDihapusDialog.class */
public class TransaksiBerkalaBerhasilDihapusDialog extends BaseInfoDialog {
    public static final String TAG = "InfoDialog";
    private Unbinder mUnbinder;

    @Override // com.bca.smartbranch.dialog.BaseInfoDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void bindViews(View view) {
        bindViews(view);
        this.mUnbinder = ButterKnife.bind(this, view);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        if (getActivity() != null) {
            setOnHierarchyChangeListener.a((Activity) getActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.llContent.setMinimumHeight(0);
        getArguments().getString("nama", "");
        this.tvTitle.setText("Data Berhasil Dihapus");
        this.tvDesc.setText("Transaksi Berkala telah terhapus");
    }

    @Override // com.bca.smartbranch.dialog.BaseInfoDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void unbindViews() {
        unbindViews();
        this.mUnbinder.unbind();
    }
}
