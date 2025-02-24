package com.bca.smartbranch.dialog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.activity.TransactionActivity;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/WaktuHabisDialog.class */
public class WaktuHabisDialog extends BaseDialog {
    private boolean a = false;
    String b;
    private Bundle c;
    String d;
    private Unbinder e;
    @BindView(2131298883)
    TextView tvContent;
    @BindView(2131299615)
    TextView tvTitle;

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
        return 2131493092;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        if (this.a) {
            startActivity(new Intent(getActivity(), MainActivity.class));
            return;
        }
        Intent intent = new Intent(getActivity(), TransactionActivity.class);
        intent.putExtra("expired", true);
        startActivity(intent);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.c = arguments;
        this.b = arguments.getString("MessageDialogContent", "");
        this.d = this.c.getString("MessageDialogTitle", "Info");
        this.a = this.c.getBoolean("IsFromForm", false);
        this.tvTitle.setText(Html.fromHtml(this.d));
        this.tvContent.setText(Html.fromHtml(this.b));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
