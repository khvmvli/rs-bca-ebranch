package com.bca.smartbranch.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.InfoProductActivity;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TahapanBerjangkaDialog.class */
public class TahapanBerjangkaDialog extends BaseDialog {
    private Bundle b;
    private Unbinder e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = getArguments();
        this.e = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @OnClick({2131296386})
    public void fillForm(View view) {
        getDialog().dismiss();
        Intent intent = new Intent(getActivity(), FormActivity.class);
        intent.putExtra("product_type", "Tahapan Berjangka");
        intent.putExtra("old_cust", "Y");
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493103;
    }

    @OnClick({2131296392})
    public void infoProduct(View view) {
        getDialog().dismiss();
        Intent intent = new Intent(getActivity(), InfoProductActivity.class);
        intent.putExtra("product_type", "Tahapan Berjangka");
        intent.putExtra("old_cust", "Y");
        startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
