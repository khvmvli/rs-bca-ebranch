package com.bca.smartbranch.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.AskAccountActivity;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.InfoProductActivity;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TahapanBCADialog.class */
public class TahapanBCADialog extends BaseDialog {
    private Unbinder a;
    private String b;
    private Bundle d;
    @BindView(2131299282)
    TextView tvInfo;
    @BindString(2131822144)
    String txtInfo;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.a = ButterKnife.bind(this, view);
        this.tvInfo.setText(Html.fromHtml(this.txtInfo));
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @OnClick({2131296386})
    public void fillForm(View view) {
        getDialog().dismiss();
        if (this.b.equals("Y")) {
            Intent intent = new Intent(getActivity(), FormActivity.class);
            intent.putExtra("product_type", "Tahapan BCA");
            intent.putExtra("old_cust", this.b);
            startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(getActivity(), AskAccountActivity.class);
        intent2.putExtra("product_type", "Tahapan BCA");
        startActivity(intent2);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493102;
    }

    @OnClick({2131296392})
    public void infoProduct(View view) {
        getDialog().dismiss();
        Intent intent = new Intent(getActivity(), InfoProductActivity.class);
        intent.putExtra("product_type", "Tahapan BCA");
        intent.putExtra("old_cust", this.b);
        intent.putExtra("is_member", this.d.getBoolean("is_member", false));
        startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.d = arguments;
        this.b = arguments.getString("old_cust", "N");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.a.unbind();
    }
}
