package com.bca.smartbranch.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.dialog.BaseDialog;
import o.PilihNegaraORActivity_ViewBinding;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ChooseProductORDialog.class */
public class ChooseProductORDialog extends BaseDialog {
    private Unbinder b;
    @BindView(2131298918)
    TextView tvDesc;

    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
    }

    @OnClick({2131296380})
    public void clickedNo() {
        dismiss();
    }

    @OnClick({2131296396})
    public void clickedYes() {
        dismiss();
        documentProvider.b().d(new PilihNegaraORActivity_ViewBinding());
    }

    @OnClick({2131296385})
    public void close() {
        dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    public int getContentView() {
        return 2131493060;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        getDialog().setCanceledOnTouchOutside(false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.tvDesc.setText(arguments.getString("desc", ""));
        }
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
