package com.bca.smartbranch.activity;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoJenisKartuActivity_ViewBinding.class */
public class InfoJenisKartuActivity_ViewBinding implements Unbinder {
    private InfoJenisKartuActivity e;

    public InfoJenisKartuActivity_ViewBinding(InfoJenisKartuActivity infoJenisKartuActivity, View view) {
        this.e = infoJenisKartuActivity;
        infoJenisKartuActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoJenisKartuActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoJenisKartuActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoJenisKartuActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoJenisKartuActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        infoJenisKartuActivity.infoKartu = view.getContext().getResources().getString(2131821260);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoJenisKartuActivity infoJenisKartuActivity = this.e;
        if (infoJenisKartuActivity != null) {
            this.e = null;
            infoJenisKartuActivity.toolbar = null;
            infoJenisKartuActivity.txtToolbarTitle = null;
            infoJenisKartuActivity.tvErrorMessage = null;
            infoJenisKartuActivity.wvContent = null;
            infoJenisKartuActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
