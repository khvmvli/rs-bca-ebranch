package com.bca.smartbranch.activity;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoBiayaActivity_ViewBinding.class */
public class InfoBiayaActivity_ViewBinding implements Unbinder {
    private InfoBiayaActivity a;

    public InfoBiayaActivity_ViewBinding(InfoBiayaActivity infoBiayaActivity, View view) {
        this.a = infoBiayaActivity;
        infoBiayaActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoBiayaActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoBiayaActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoBiayaActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoBiayaActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        infoBiayaActivity.infoBiaya = view.getContext().getResources().getString(2131821254);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoBiayaActivity infoBiayaActivity = this.a;
        if (infoBiayaActivity != null) {
            this.a = null;
            infoBiayaActivity.toolbar = null;
            infoBiayaActivity.txtToolbarTitle = null;
            infoBiayaActivity.tvErrorMessage = null;
            infoBiayaActivity.wvContent = null;
            infoBiayaActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
