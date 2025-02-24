package com.bca.smartbranch.activity;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoKursORActivity_ViewBinding.class */
public class InfoKursORActivity_ViewBinding implements Unbinder {
    private InfoKursORActivity e;

    public InfoKursORActivity_ViewBinding(InfoKursORActivity infoKursORActivity, View view) {
        this.e = infoKursORActivity;
        infoKursORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoKursORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoKursORActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoKursORActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoKursORActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        infoKursORActivity.infoKursOR = view.getContext().getResources().getString(2131821262);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoKursORActivity infoKursORActivity = this.e;
        if (infoKursORActivity != null) {
            this.e = null;
            infoKursORActivity.toolbar = null;
            infoKursORActivity.txtToolbarTitle = null;
            infoKursORActivity.tvErrorMessage = null;
            infoKursORActivity.wvContent = null;
            infoKursORActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
