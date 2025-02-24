package com.bca.smartbranch.activity;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoTellerActivity_ViewBinding.class */
public class InfoTellerActivity_ViewBinding implements Unbinder {
    private InfoTellerActivity d;

    public InfoTellerActivity_ViewBinding(InfoTellerActivity infoTellerActivity, View view) {
        this.d = infoTellerActivity;
        infoTellerActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoTellerActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoTellerActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoTellerActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoTellerActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoTellerActivity infoTellerActivity = this.d;
        if (infoTellerActivity != null) {
            this.d = null;
            infoTellerActivity.toolbar = null;
            infoTellerActivity.tvErrorMessage = null;
            infoTellerActivity.txtToolbarTitle = null;
            infoTellerActivity.wvContent = null;
            infoTellerActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
