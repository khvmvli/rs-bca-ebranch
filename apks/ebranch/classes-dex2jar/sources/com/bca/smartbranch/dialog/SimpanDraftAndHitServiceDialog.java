package com.bca.smartbranch.dialog;

import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SimpanDraftAndHitServiceDialog.class */
public class SimpanDraftAndHitServiceDialog extends BaseDialog {
    public int a;
    private Unbinder d;
    @BindView(2131298883)
    TextView tvContent;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
        this.tvContent.setText(Html.fromHtml(getString(2131822119)));
    }

    @OnClick({2131296416})
    public void clickedNo(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new ReservasiSuccessEChannelActivity_ViewBinding("N"));
    }

    @OnClick({2131296462})
    public void clickedYes(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new ReservasiSuccessEChannelActivity_ViewBinding("Y"));
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493078;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.d.unbind();
    }
}
