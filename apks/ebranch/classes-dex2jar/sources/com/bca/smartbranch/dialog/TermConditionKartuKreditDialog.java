package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.dialog.TermConditionKartuKreditDialog;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TermConditionKartuKreditDialog.class */
public class TermConditionKartuKreditDialog extends BaseDialog {
    private Unbinder a;
    @BindString(2131821633)
    String termConditionTitle;
    @BindView(2131299811)
    public WebView wvContent;

    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.a = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493110;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        new Handler().postDelayed(new Runnable() { // from class: o.ReviewSubVisaAdapter$ViewHolder_ViewBinding
            @Override // java.lang.Runnable
            public final void run() {
                TermConditionKartuKreditDialog termConditionKartuKreditDialog = TermConditionKartuKreditDialog.this;
                termConditionKartuKreditDialog.wvContent.setBackgroundColor(0);
                termConditionKartuKreditDialog.wvContent.setLayerType(1, null);
                termConditionKartuKreditDialog.wvContent.loadUrl("https://www.bca.co.id/id/Syarat-dan-Ketentuan/kartu-kredit");
            }
        }, 200);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.a.unbind();
    }
}
