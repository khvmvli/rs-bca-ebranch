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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DaftarTransferActivity_ViewBinding.class */
public class DaftarTransferActivity_ViewBinding implements Unbinder {
    private DaftarTransferActivity a;

    public DaftarTransferActivity_ViewBinding(DaftarTransferActivity daftarTransferActivity, View view) {
        this.a = daftarTransferActivity;
        daftarTransferActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        daftarTransferActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        daftarTransferActivity.lnMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'lnMain'", LinearLayout.class);
        daftarTransferActivity.rvHapusUbahDaftarTransfer = (getIncomeDisplayAmount) Utils.findRequiredViewAsType(view, 2131298326, "field 'rvHapusUbahDaftarTransfer'", getIncomeDisplayAmount.class);
        daftarTransferActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        daftarTransferActivity.tvTransaksiEmpty = (TextView) Utils.findRequiredViewAsType(view, 2131299690, "field 'tvTransaksiEmpty'", TextView.class);
        daftarTransferActivity.llEmpty = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297634, "field 'llEmpty'", LinearLayout.class);
        Resources resources = view.getContext().getResources();
        daftarTransferActivity.toolbarTitle = resources.getString(2131821441);
        daftarTransferActivity.retry = resources.getString(2131822092);
        daftarTransferActivity.daftarTransfer = resources.getString(2131821439);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DaftarTransferActivity daftarTransferActivity = this.a;
        if (daftarTransferActivity != null) {
            this.a = null;
            daftarTransferActivity.toolbar = null;
            daftarTransferActivity.txtToolbarTitle = null;
            daftarTransferActivity.lnMain = null;
            daftarTransferActivity.rvHapusUbahDaftarTransfer = null;
            daftarTransferActivity.tvErrorMessage = null;
            daftarTransferActivity.tvTransaksiEmpty = null;
            daftarTransferActivity.llEmpty = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
