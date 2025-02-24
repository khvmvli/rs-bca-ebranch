package com.bca.smartbranch.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.AskAccountActivity;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.InfoProductActivity;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DepositoDialog.class */
public class DepositoDialog extends BaseDialog {
    private String a;
    private Unbinder b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @OnClick({2131296386})
    public void fillForm(View view) {
        getDialog().dismiss();
        if (this.a.equals("Y")) {
            Intent intent = new Intent(getActivity(), FormActivity.class);
            intent.putExtra("product_type", "DEPOSITO");
            intent.putExtra("old_cust", this.a);
            startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(getActivity(), AskAccountActivity.class);
        intent2.putExtra("product_type", "DEPOSITO");
        startActivity(intent2);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493063;
    }

    @OnClick({2131296392})
    public void infoProduct(View view) {
        getDialog().dismiss();
        Intent intent = new Intent(getActivity(), InfoProductActivity.class);
        intent.putExtra("product_type", "DEPOSITO");
        intent.putExtra("old_cust", this.a);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.a = getArguments().getString("old_cust", "N");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
