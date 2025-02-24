package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SuccessUpdateProfileDialog.class */
public class SuccessUpdateProfileDialog extends BaseDialog {
    String a;
    String c;
    private Unbinder d;
    private Bundle e;
    @BindView(2131298883)
    TextView tvContent;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493092;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        if (this.e.getBoolean("isMessageSuccess", false)) {
            getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.e = arguments;
        this.c = arguments.getString("MessageDialogContent", "");
        String string = this.e.getString("MessageDialogTitle", "Info");
        this.a = string;
        this.tvTitle.setText(Html.fromHtml(string));
        this.tvContent.setText(Html.fromHtml(this.c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.d.unbind();
    }
}
