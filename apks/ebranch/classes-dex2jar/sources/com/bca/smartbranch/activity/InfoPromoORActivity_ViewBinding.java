package com.bca.smartbranch.activity;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoPromoORActivity_ViewBinding.class */
public class InfoPromoORActivity_ViewBinding implements Unbinder {
    private InfoPromoORActivity e;

    public InfoPromoORActivity_ViewBinding(InfoPromoORActivity infoPromoORActivity, View view) {
        this.e = infoPromoORActivity;
        infoPromoORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoPromoORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoPromoORActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoPromoORActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoPromoORActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        infoPromoORActivity.infoPromo = view.getContext().getResources().getString(2131821261);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoPromoORActivity infoPromoORActivity = this.e;
        if (infoPromoORActivity != null) {
            this.e = null;
            infoPromoORActivity.toolbar = null;
            infoPromoORActivity.txtToolbarTitle = null;
            infoPromoORActivity.tvErrorMessage = null;
            infoPromoORActivity.wvContent = null;
            infoPromoORActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
