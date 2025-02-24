package com.bca.smartbranch.dialog;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.BranchMapItemBNAdapter$BranchMapItemVH;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/QRCodeDialog.class */
public class QRCodeDialog extends BaseDialog {
    public Bitmap b;
    public String d;
    private Unbinder e;
    @BindView(2131297409)
    ImageView ivQrCode;
    @BindView(2131299466)
    TextView tvNoRef;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close() {
        dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493097;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.ivQrCode.setImageBitmap(this.b);
        this.tvNoRef.setText(this.d);
    }

    @OnClick({2131296450})
    public void saveImage() {
        documentProvider.b().d(new BranchMapItemBNAdapter$BranchMapItemVH(false));
    }

    @OnClick({2131296379})
    public void share() {
        documentProvider.b().d(new BranchMapItemBNAdapter$BranchMapItemVH(true));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
