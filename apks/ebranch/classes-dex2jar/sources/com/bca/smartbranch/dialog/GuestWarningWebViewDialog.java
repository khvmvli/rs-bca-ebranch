package com.bca.smartbranch.dialog;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.RegistrationActivity;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/GuestWarningWebViewDialog.class */
public class GuestWarningWebViewDialog extends BaseDialog {
    private Unbinder c;
    @BindString(2131821689)
    String guestWarningDesc;
    @BindView(2131298918)
    TextView tvDesc;

    @OnClick({2131296460})
    public void aksesViaWeb() {
        dismiss();
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://ebranch.bca.co.id")));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.c = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493071;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvDesc.setText(Html.fromHtml(this.guestWarningDesc));
    }

    @OnClick({2131296449})
    public void signup() {
        dismiss();
        startActivity(new Intent(getContext(), RegistrationActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.c.unbind();
    }
}
