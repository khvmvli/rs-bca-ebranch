package com.bca.smartbranch.activity;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoValueTodayORActivity_ViewBinding.class */
public class InfoValueTodayORActivity_ViewBinding implements Unbinder {
    private InfoValueTodayORActivity a;

    public InfoValueTodayORActivity_ViewBinding(InfoValueTodayORActivity infoValueTodayORActivity, View view) {
        this.a = infoValueTodayORActivity;
        infoValueTodayORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoValueTodayORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoValueTodayORActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoValueTodayORActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoValueTodayORActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        infoValueTodayORActivity.infoValueTodayOR = view.getContext().getResources().getString(2131821265);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoValueTodayORActivity infoValueTodayORActivity = this.a;
        if (infoValueTodayORActivity != null) {
            this.a = null;
            infoValueTodayORActivity.toolbar = null;
            infoValueTodayORActivity.txtToolbarTitle = null;
            infoValueTodayORActivity.tvErrorMessage = null;
            infoValueTodayORActivity.wvContent = null;
            infoValueTodayORActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
