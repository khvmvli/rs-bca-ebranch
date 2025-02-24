package com.bca.smartbranch.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.PilihJabatanActivity_ViewBinding;
import o.documentProvider;
import o.getText;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SuratPernyataanBNDialog.class */
public class SuratPernyataanBNDialog extends getText {
    @BindView(2131296416)
    Button btnNo;
    @BindView(2131296462)
    Button btnYes;
    @BindString(2131821627)
    String desc;
    private Unbinder e;
    @BindString(2131821406)
    String no;
    @BindString(2131822142)
    String title;
    @BindView(2131298918)
    TextView tvDesc;
    @BindView(2131299615)
    TextView tvTitle;
    @BindString(2131821401)
    String yes;

    @OnClick({2131296416})
    public void clickedNo() {
        getDialog().dismiss();
        documentProvider.b().d(new PilihJabatanActivity_ViewBinding(false));
    }

    @OnClick({2131296462})
    public void clickedYes() {
        getDialog().dismiss();
        documentProvider.b().d(new PilihJabatanActivity_ViewBinding(true));
    }

    @OnClick({2131296385})
    public void close() {
        getDialog().dismiss();
    }

    @Override // o.getText
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = onCreateDialog(bundle);
        onCreateDialog.getWindow().requestFeature(1);
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        onCreateDialog.getWindow().getAttributes().windowAnimations = 2131886328;
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131493101, viewGroup, false);
        this.e = ButterKnife.bind(this, inflate);
        return inflate;
    }

    @Override // o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.e.unbind();
    }

    @Override // o.getText, androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        getDialog().getWindow().setLayout(-1, -2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitle.setText(this.title);
        this.tvDesc.setText(Html.fromHtml(this.desc));
        this.btnNo.setText(this.no);
        this.btnYes.setText(this.yes);
    }
}
