package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoProductORActivity_ViewBinding.class */
public class InfoProductORActivity_ViewBinding implements Unbinder {
    private InfoProductORActivity e;

    public InfoProductORActivity_ViewBinding(InfoProductORActivity infoProductORActivity, View view) {
        this.e = infoProductORActivity;
        infoProductORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoProductORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoProductORActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoProductORActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoProductORActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        Resources resources = view.getContext().getResources();
        infoProductORActivity.infoKirimanUangNormal = resources.getString(2131822218);
        infoProductORActivity.infoBCAFullPayment = resources.getString(2131822215);
        infoProductORActivity.infoMulticurrencyBCA = resources.getString(2131822220);
        infoProductORActivity.infoRTGSCNY = resources.getString(2131822221);
        infoProductORActivity.infoLocalCurrencySettlement = resources.getString(2131822219);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoProductORActivity infoProductORActivity = this.e;
        if (infoProductORActivity != null) {
            this.e = null;
            infoProductORActivity.toolbar = null;
            infoProductORActivity.txtToolbarTitle = null;
            infoProductORActivity.tvErrorMessage = null;
            infoProductORActivity.wvContent = null;
            infoProductORActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
