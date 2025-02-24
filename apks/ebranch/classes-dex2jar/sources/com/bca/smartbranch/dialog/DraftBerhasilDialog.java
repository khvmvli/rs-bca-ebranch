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
import com.bca.smartbranch.activity.MainActivity;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DraftBerhasilDialog.class */
public class DraftBerhasilDialog extends BaseDialog {
    public String a;
    private Unbinder e;
    @BindString(2131821638)
    String messageContent;
    @BindString(2131821639)
    String messageContentTeller;
    @BindView(2131298883)
    TextView tvContent;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493064;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        startActivity(new Intent(getActivity(), MainActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvContent.setText(Html.fromHtml(this.messageContentTeller));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
