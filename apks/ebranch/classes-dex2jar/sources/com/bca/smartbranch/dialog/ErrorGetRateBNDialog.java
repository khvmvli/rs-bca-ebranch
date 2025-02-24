package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.documentProvider;
import o.eventJenisIdentitas;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ErrorGetRateBNDialog.class */
public class ErrorGetRateBNDialog extends BaseDialog {
    private Unbinder b;
    @BindView(2131298918)
    TextView tvDesc;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
    }

    @OnClick({2131296380})
    public void clickedNo() {
        dismiss();
        documentProvider.b().d(new eventJenisIdentitas(Boolean.FALSE));
    }

    @OnClick({2131296458})
    public void clickedYes() {
        dismiss();
        documentProvider.b().d(new eventJenisIdentitas(Boolean.TRUE));
    }

    @OnClick({2131296385})
    public void close() {
        dismiss();
        documentProvider.b().d(new eventJenisIdentitas(Boolean.FALSE));
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493065;
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
