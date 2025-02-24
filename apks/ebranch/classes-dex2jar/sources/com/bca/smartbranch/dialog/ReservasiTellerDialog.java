package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ReservasiTellerDialog.class */
public class ReservasiTellerDialog extends BaseDialog {
    private Unbinder b;
    private String c;
    private boolean d;
    private String e;
    @BindView(2131296385)
    ImageView ivClose;
    @BindView(2131297372)
    ImageView ivIcon;
    @BindView(2131299615)
    TextView tvTitle;

    public ReservasiTellerDialog() {
        this.d = true;
        this.c = "";
    }

    public ReservasiTellerDialog(boolean z) {
        this.c = "";
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
        if (!this.d) {
            this.ivClose.setVisibility(8);
        }
        this.tvTitle.setText(2131822089);
        this.ivIcon.setImageDrawable(getContext().getResources().getDrawable(2131231298));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.e = arguments.getString("product");
        }
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493098;
    }

    @OnClick({2131296416})
    public void onClickNo(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding(false, this.e));
    }

    @OnClick({2131296462})
    public void onClickYes(View view) {
        getDialog().dismiss();
        BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding branchMapROItemAdapter$BranchMapROItemVH_ViewBinding = new BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding(true, this.e);
        branchMapROItemAdapter$BranchMapROItemVH_ViewBinding.a = this.c;
        documentProvider.b().d(branchMapROItemAdapter$BranchMapROItemVH_ViewBinding);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
