package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.view.View;
import android.widget.TextView;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/InfoCaraPembayaranDialog.class */
public class InfoCaraPembayaranDialog extends BaseDialog {
    @BindArray(2130903043)
    String[] caraBayar;
    private Unbinder e;
    @BindString(2131821617)
    String labelValue;
    @BindString(2131821716)
    String title;
    @BindView(2131298918)
    TextView tvDesc;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close() {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493052;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText(this.title);
        this.tvDesc.setText(Html.fromHtml(this.labelValue));
        String[] strArr = this.caraBayar;
        for (String str : strArr) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new BulletSpan(15), 0, str.length(), 0);
            this.tvDesc.append(spannableString);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
