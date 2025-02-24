package com.bca.smartbranch.activity;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoCodewordORActivity_ViewBinding.class */
public class InfoCodewordORActivity_ViewBinding implements Unbinder {
    private InfoCodewordORActivity d;

    public InfoCodewordORActivity_ViewBinding(InfoCodewordORActivity infoCodewordORActivity, View view) {
        this.d = infoCodewordORActivity;
        infoCodewordORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoCodewordORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoCodewordORActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoCodewordORActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoCodewordORActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        infoCodewordORActivity.infoCodewordOR = view.getContext().getResources().getString(2131821255);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoCodewordORActivity infoCodewordORActivity = this.d;
        if (infoCodewordORActivity != null) {
            this.d = null;
            infoCodewordORActivity.toolbar = null;
            infoCodewordORActivity.txtToolbarTitle = null;
            infoCodewordORActivity.tvErrorMessage = null;
            infoCodewordORActivity.wvContent = null;
            infoCodewordORActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
