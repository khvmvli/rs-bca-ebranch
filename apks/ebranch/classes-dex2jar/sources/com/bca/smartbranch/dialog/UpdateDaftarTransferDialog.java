package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.CityReservationAdapter$CityReservationVH_ViewBinding;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/UpdateDaftarTransferDialog.class */
public class UpdateDaftarTransferDialog extends BaseDialog {
    @BindView(2131296416)
    Button btnNo;
    @BindView(2131296462)
    Button btnYes;
    private Unbinder d;
    @BindString(2131822333)
    String desc;
    @BindString(2131821405)
    String no;
    @BindString(2131821716)
    String title;
    @BindView(2131298918)
    TextView tvDesc;
    @BindView(2131299615)
    TextView tvTitle;
    @BindString(2131821409)
    String yes;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
        Bundle arguments = getArguments();
        this.tvDesc.setText(getString(2131822333, "Nomor Rekening", "nomor rekening"));
        if (arguments != null && arguments.getBoolean("flag-iban", false)) {
            this.tvDesc.setText(getString(2131822333, "Nomor IBAN", "nomor IBAN"));
        }
        this.tvTitle.setText(this.title);
        this.btnNo.setText(this.no);
        this.btnYes.setText(this.yes);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493111;
    }

    @OnClick({2131296416, 2131296385})
    public void onClickNo(View view) {
        dismiss();
    }

    @OnClick({2131296462})
    public void onClickYes(View view) {
        dismiss();
        documentProvider.b().d(new CityReservationAdapter$CityReservationVH_ViewBinding(Boolean.TRUE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.d.unbind();
    }
}
