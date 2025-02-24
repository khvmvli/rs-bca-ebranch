package com.bca.smartbranch.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/CancelAskTransaksiDialog.class */
public class CancelAskTransaksiDialog extends BaseDialog {
    private String c;
    private String d;
    private Unbinder e;
    @BindView(2131298174)
    RadioButton rbReservasi;
    @BindView(2131298175)
    RadioButton rbReservasiTransaksi;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
    }

    @OnClick({2131296383, 2131296385})
    public void cancel() {
        dismiss();
    }

    @OnClick({2131299553, 2131298175})
    public void cancelReservationAndTransaction(View view) {
        this.rbReservasiTransaksi.setChecked(true);
        this.rbReservasi.setChecked(false);
    }

    @OnClick({2131299551, 2131298174})
    public void cancelReservationOnly(View view) {
        this.rbReservasi.setChecked(true);
        this.rbReservasiTransaksi.setChecked(false);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493057;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.d = arguments.getString("noref");
        this.c = arguments.getString("token");
    }

    @OnClick({2131296452})
    public void submit() {
        dismiss();
        if (this.rbReservasi.isChecked()) {
            CancelReservasiDialog cancelReservasiDialog = new CancelReservasiDialog();
            Bundle bundle = new Bundle();
            bundle.putString("token", this.c);
            bundle.putString("noref", this.d);
            cancelReservasiDialog.setArguments(bundle);
            cancelReservasiDialog.show(getFragmentManager(), "CancelReservasiDialog");
            return;
        }
        CancelTransaksiDialog cancelTransaksiDialog = new CancelTransaksiDialog();
        Bundle bundle2 = new Bundle();
        bundle2.putString("token", this.c);
        bundle2.putString("noref", this.d);
        cancelTransaksiDialog.setArguments(bundle2);
        cancelTransaksiDialog.show(getFragmentManager(), "CancelTransaksiDialog");
    }
}
