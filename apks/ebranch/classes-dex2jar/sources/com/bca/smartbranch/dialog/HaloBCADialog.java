package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.LogRedirector;
import o.MenuPemrekAdapter$ViewHolder;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HaloBCADialog.class */
public class HaloBCADialog extends BaseKonfirmasiDialog {
    private Unbinder b;
    @BindString(2131821692)
    String desc;
    @BindString(2131822169)
    String no;
    @BindString(2131822477)
    public String nomorHalloBCA;
    @BindString(2131821335)
    String title;
    @BindString(2131822354)
    String yes;

    public static void e(LogRedirector.Logger logger) {
        logger.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
    }

    @OnClick({2131296462})
    public void clickedYes() {
        MenuPemrekAdapter$ViewHolder.c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onRequestPermissionsResult(i, strArr, iArr);
        MenuPemrekAdapter$ViewHolder.e(this, i, iArr);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText(this.title);
        this.tvDesc.setText(this.desc);
        this.btnNo.setText(this.no);
        this.btnYes.setText(this.yes);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
