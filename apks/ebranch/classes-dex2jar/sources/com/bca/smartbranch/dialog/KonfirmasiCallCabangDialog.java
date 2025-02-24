package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.PilihJabatanActivity;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/KonfirmasiCallCabangDialog.class */
public class KonfirmasiCallCabangDialog extends BaseKonfirmasiDialog {
    private Unbinder d;
    @BindString(2131821813)
    String txtContent;

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void bindViews(View view) {
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
    }

    @OnClick({2131296462})
    public void clickedLanjut(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new PilihJabatanActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText("Info");
        this.tvDesc.setText(Html.fromHtml(this.txtContent));
        this.btnNo.setText("Batal");
        this.btnYes.setText("Lanjut");
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void unbindViews() {
        unbindViews();
        this.d.unbind();
    }
}
