package com.bca.smartbranch.activity;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoBankingtActivity_ViewBinding.class */
public class InfoBankingtActivity_ViewBinding implements Unbinder {
    private InfoBankingtActivity a;

    public InfoBankingtActivity_ViewBinding(InfoBankingtActivity infoBankingtActivity, View view) {
        this.a = infoBankingtActivity;
        infoBankingtActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoBankingtActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoBankingtActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoBankingtActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoBankingtActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoBankingtActivity infoBankingtActivity = this.a;
        if (infoBankingtActivity != null) {
            this.a = null;
            infoBankingtActivity.toolbar = null;
            infoBankingtActivity.txtToolbarTitle = null;
            infoBankingtActivity.tvErrorMessage = null;
            infoBankingtActivity.wvContent = null;
            infoBankingtActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
