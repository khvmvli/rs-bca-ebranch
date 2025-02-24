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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CekDokumenActivity_ViewBinding.class */
public class CekDokumenActivity_ViewBinding implements Unbinder {
    private CekDokumenActivity d;

    public CekDokumenActivity_ViewBinding(CekDokumenActivity cekDokumenActivity, View view) {
        this.d = cekDokumenActivity;
        cekDokumenActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cekDokumenActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        cekDokumenActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        cekDokumenActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        cekDokumenActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        Resources resources = view.getContext().getResources();
        cekDokumenActivity.toolbarTitleTahapanBCA = resources.getString(2131822222);
        cekDokumenActivity.toolbarTitleTahapanXpresi = resources.getString(2131822224);
        cekDokumenActivity.toolbarTitleTapres = resources.getString(2131822225);
        cekDokumenActivity.toolbarTitleBCADollar = resources.getString(2131822214);
        cekDokumenActivity.toolbarTitleTahapanBerjangka = resources.getString(2131822275);
        cekDokumenActivity.toolbarTitleDeposito = resources.getString(2131822203);
        cekDokumenActivity.toolbarTitleEChannel = resources.getString(2131822195);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CekDokumenActivity cekDokumenActivity = this.d;
        if (cekDokumenActivity != null) {
            this.d = null;
            cekDokumenActivity.toolbar = null;
            cekDokumenActivity.txtToolbarTitle = null;
            cekDokumenActivity.tvErrorMessage = null;
            cekDokumenActivity.wvContent = null;
            cekDokumenActivity.pb = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
