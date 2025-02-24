package com.bca.smartbranch.activity;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoDocumentUnderlyingActivity_ViewBinding.class */
public class InfoDocumentUnderlyingActivity_ViewBinding implements Unbinder {
    private InfoDocumentUnderlyingActivity e;

    public InfoDocumentUnderlyingActivity_ViewBinding(InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity, View view) {
        this.e = infoDocumentUnderlyingActivity;
        infoDocumentUnderlyingActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoDocumentUnderlyingActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoDocumentUnderlyingActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoDocumentUnderlyingActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoDocumentUnderlyingActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        infoDocumentUnderlyingActivity.infoDocumentUnderlyingOR = view.getContext().getResources().getString(2131821256);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoDocumentUnderlyingActivity infoDocumentUnderlyingActivity = this.e;
        if (infoDocumentUnderlyingActivity != null) {
            this.e = null;
            infoDocumentUnderlyingActivity.toolbar = null;
            infoDocumentUnderlyingActivity.txtToolbarTitle = null;
            infoDocumentUnderlyingActivity.tvErrorMessage = null;
            infoDocumentUnderlyingActivity.wvContent = null;
            infoDocumentUnderlyingActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
