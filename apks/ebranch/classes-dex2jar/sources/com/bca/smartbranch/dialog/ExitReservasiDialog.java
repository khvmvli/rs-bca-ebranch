package com.bca.smartbranch.dialog;

import android.view.View;
import butterknife.OnClick;
import o.TransaksiTellerActivity;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ExitReservasiDialog.class */
public class ExitReservasiDialog extends BaseKonfirmasiDialog {
    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void bindViews(View view) {
        bindViews(view);
        this.tvTitle.setText(getString(2131821716));
        this.tvDesc.setText(getString(2131821643));
        this.btnYes.setText(2131821409);
        this.btnNo.setText(2131821405);
    }

    @OnClick({2131296462})
    public void onClickYes(View view) {
        documentProvider.b().d(new TransaksiTellerActivity());
    }
}
