package com.bca.smartbranch.activity;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoFullAmountORActivity_ViewBinding.class */
public class InfoFullAmountORActivity_ViewBinding implements Unbinder {
    private InfoFullAmountORActivity e;

    public InfoFullAmountORActivity_ViewBinding(InfoFullAmountORActivity infoFullAmountORActivity, View view) {
        this.e = infoFullAmountORActivity;
        infoFullAmountORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoFullAmountORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoFullAmountORActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoFullAmountORActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoFullAmountORActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        infoFullAmountORActivity.infoFullAmountOR = view.getContext().getResources().getString(2131821257);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoFullAmountORActivity infoFullAmountORActivity = this.e;
        if (infoFullAmountORActivity != null) {
            this.e = null;
            infoFullAmountORActivity.toolbar = null;
            infoFullAmountORActivity.txtToolbarTitle = null;
            infoFullAmountORActivity.tvErrorMessage = null;
            infoFullAmountORActivity.wvContent = null;
            infoFullAmountORActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
