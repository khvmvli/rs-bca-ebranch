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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DaftarTransferBTActivity_ViewBinding.class */
public class DaftarTransferBTActivity_ViewBinding implements Unbinder {
    private DaftarTransferBTActivity b;

    public DaftarTransferBTActivity_ViewBinding(DaftarTransferBTActivity daftarTransferBTActivity, View view) {
        this.b = daftarTransferBTActivity;
        daftarTransferBTActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        daftarTransferBTActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        daftarTransferBTActivity.lnMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'lnMain'", LinearLayout.class);
        daftarTransferBTActivity.rvHapusUbahDaftarTransfer = (getIncomeDisplayAmount) Utils.findRequiredViewAsType(view, 2131298326, "field 'rvHapusUbahDaftarTransfer'", getIncomeDisplayAmount.class);
        daftarTransferBTActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        daftarTransferBTActivity.tvTransaksiEmpty = (TextView) Utils.findRequiredViewAsType(view, 2131299690, "field 'tvTransaksiEmpty'", TextView.class);
        daftarTransferBTActivity.llEmpty = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297634, "field 'llEmpty'", LinearLayout.class);
        Resources resources = view.getContext().getResources();
        daftarTransferBTActivity.toolbarTitle = resources.getString(2131821440);
        daftarTransferBTActivity.retry = resources.getString(2131822092);
        daftarTransferBTActivity.daftarTransfer = resources.getString(2131821439);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DaftarTransferBTActivity daftarTransferBTActivity = this.b;
        if (daftarTransferBTActivity != null) {
            this.b = null;
            daftarTransferBTActivity.toolbar = null;
            daftarTransferBTActivity.txtToolbarTitle = null;
            daftarTransferBTActivity.lnMain = null;
            daftarTransferBTActivity.rvHapusUbahDaftarTransfer = null;
            daftarTransferBTActivity.tvErrorMessage = null;
            daftarTransferBTActivity.tvTransaksiEmpty = null;
            daftarTransferBTActivity.llEmpty = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
