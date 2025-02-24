package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.getIncomeDisplayAmount;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DaftarTransferORActivity_ViewBinding.class */
public class DaftarTransferORActivity_ViewBinding implements Unbinder {
    private DaftarTransferORActivity d;

    public DaftarTransferORActivity_ViewBinding(DaftarTransferORActivity daftarTransferORActivity, View view) {
        this.d = daftarTransferORActivity;
        daftarTransferORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        daftarTransferORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        daftarTransferORActivity.lnMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'lnMain'", LinearLayout.class);
        daftarTransferORActivity.rvHapusUbahDaftarTransfer = (getIncomeDisplayAmount) Utils.findRequiredViewAsType(view, 2131298326, "field 'rvHapusUbahDaftarTransfer'", getIncomeDisplayAmount.class);
        daftarTransferORActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        daftarTransferORActivity.tvTransaksiEmpty = (TextView) Utils.findRequiredViewAsType(view, 2131299690, "field 'tvTransaksiEmpty'", TextView.class);
        daftarTransferORActivity.llEmpty = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297634, "field 'llEmpty'", LinearLayout.class);
        Resources resources = view.getContext().getResources();
        daftarTransferORActivity.toolbarTitle = resources.getString(2131821442);
        daftarTransferORActivity.retry = resources.getString(2131822092);
        daftarTransferORActivity.daftarTransfer = resources.getString(2131821439);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DaftarTransferORActivity daftarTransferORActivity = this.d;
        if (daftarTransferORActivity != null) {
            this.d = null;
            daftarTransferORActivity.toolbar = null;
            daftarTransferORActivity.txtToolbarTitle = null;
            daftarTransferORActivity.lnMain = null;
            daftarTransferORActivity.rvHapusUbahDaftarTransfer = null;
            daftarTransferORActivity.tvErrorMessage = null;
            daftarTransferORActivity.tvTransaksiEmpty = null;
            daftarTransferORActivity.llEmpty = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
