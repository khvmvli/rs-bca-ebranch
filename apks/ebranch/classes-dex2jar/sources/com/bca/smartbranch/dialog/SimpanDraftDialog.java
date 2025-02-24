package com.bca.smartbranch.dialog;

import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SimpanDraftDialog.class */
public class SimpanDraftDialog extends BaseDialog {
    public String b;
    private Unbinder e;
    @BindView(2131298883)
    TextView tvContent;
    @BindString(2131822117)
    String txtContentCS;
    @BindString(2131822119)
    String txtContentTeller;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
        this.tvContent.setText(Html.fromHtml(this.txtContentTeller));
    }

    @OnClick({2131296416})
    public void clickedNo(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new ReservasiSuccessEChannelActivity_ViewBinding("N"));
    }

    @OnClick({2131296462})
    public void clickedYes(View view) {
        getDialog().dismiss();
        DraftBerhasilDialog draftBerhasilDialog = new DraftBerhasilDialog();
        String str = this.b;
        if (str == null || !str.equals("transaction_teller")) {
            draftBerhasilDialog.a = "transaction_cs";
        } else {
            draftBerhasilDialog.a = "transaction_teller";
        }
        draftBerhasilDialog.show(getActivity().l(), "DraftBerhasilDialog");
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
        this.e.unbind();
    }
}
