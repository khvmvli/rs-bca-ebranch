package com.bca.smartbranch.dialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import o.ListUtil;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DaftarTransferBerhasilDiupdateDialog.class */
public class DaftarTransferBerhasilDiupdateDialog extends BaseInfoDialog {
    public static final String TAG = "InfoDialog";
    private DaftarTransferResponse.DaftarTransferOutput mDataTransfer;
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
        DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput = (DaftarTransferResponse.DaftarTransferOutput) ListUtil.OneItemImmutableList.a(getArguments().getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
        this.mDataTransfer = daftarTransferOutput;
        daftarTransferOutput.getAccountName();
        this.tvTitle.setText("Status Daftar Rekening");
        this.tvDesc.setText("Daftar Rekening telah tersimpan");
    }

    @Override // com.bca.smartbranch.dialog.BaseInfoDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void unbindViews() {
        unbindViews();
        this.mUnbinder.unbind();
    }
}
