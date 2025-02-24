package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.data.localdb.Warkat;
import java.io.StringReader;
import o.BN5PilihNomorOTPFragment_ViewBinding;
import o.TransactionCSActivity;
import o.documentProvider;
import o.onChooseValueFotoID;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HapusTransaksiWarkatDialog.class */
public class HapusTransaksiWarkatDialog extends BaseKonfirmasiDialog {
    private Unbinder b;
    private int d;
    Bundle e;
    @BindString(2131822169)
    String no;
    @BindString(2131822353)
    String yes;

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
    }

    @OnClick({2131296462})
    public void clickedYes() {
        dismiss();
        int i = this.e.getInt("warkatPosition", -1);
        BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding = new BN5PilihNomorOTPFragment_ViewBinding();
        String string = this.e.getString("warkatDetail");
        documentProvider.b().d(new TransactionCSActivity(i, (Warkat) onChooseValueFotoID.e(Warkat.class).cast(string == null ? null : bN5PilihNomorOTPFragment_ViewBinding.b(new StringReader(string), Warkat.class)), this.e.getString("warkatAction", "")));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.e = arguments;
        this.d = arguments.getInt("warkatPosition", -1);
        this.tvTitle.setText(requireContext().getString(2131822181, Integer.valueOf(this.d + 1)));
        this.tvDesc.setText(requireContext().getString(2131821605, Integer.valueOf(this.d + 1)));
        this.btnNo.setText(this.no);
        this.btnYes.setText(this.yes);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog, com.bca.smartbranch.dialog.BaseDialog
    protected void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
