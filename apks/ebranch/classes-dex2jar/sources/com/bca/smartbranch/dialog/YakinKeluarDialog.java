package com.bca.smartbranch.dialog;

import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/YakinKeluarDialog.class */
public class YakinKeluarDialog extends BaseDialog {
    private Unbinder b;
    public String d = "";
    @BindView(2131298883)
    TextView tvContent;
    @BindString(2131822358)
    String txtContent;
    @BindString(2131822361)
    String txtContentTeller;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
        this.tvContent.setText(Html.fromHtml(this.txtContent));
        this.tvContent.setText(Html.fromHtml(this.txtContentTeller));
    }

    @OnClick({2131296416})
    public void clickedNo(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new TarikanReservasiUbahTransaksiActivity_ViewBinding("N"));
    }

    @OnClick({2131296462})
    public void clickedYes(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new TarikanReservasiUbahTransaksiActivity_ViewBinding("Y"));
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493080;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
