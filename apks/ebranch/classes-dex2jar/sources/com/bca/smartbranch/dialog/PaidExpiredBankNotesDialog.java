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
import com.bca.smartbranch.activity.TransactionActivity;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PaidExpiredBankNotesDialog.class */
public class PaidExpiredBankNotesDialog extends BaseDialog {
    String c;
    private Unbinder d;
    private Bundle e;
    @BindString(2131821616)
    String messageTitle;
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
        Intent intent = new Intent(getActivity(), TransactionActivity.class);
        intent.putExtra("expired", true);
        getActivity().startActivity(intent);
        getActivity().finishAffinity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.e = arguments;
        this.c = arguments.getString("MessageDialogContent", "");
        this.tvTitle.setText(Html.fromHtml(this.messageTitle));
        this.tvContent.setText(Html.fromHtml(this.c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.d.unbind();
    }
}
