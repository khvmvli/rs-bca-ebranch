package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoProductActivity_ViewBinding.class */
public class InfoProductActivity_ViewBinding implements Unbinder {
    private InfoProductActivity a;
    private View b;

    public InfoProductActivity_ViewBinding(final InfoProductActivity infoProductActivity, View view) {
        this.a = infoProductActivity;
        infoProductActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        infoProductActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        infoProductActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        infoProductActivity.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        infoProductActivity.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296386, "method 'fillForm'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.InfoProductActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                infoProductActivity.fillForm(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        infoProductActivity.toolbarTitleTahapanBCA = resources.getString(2131822222);
        infoProductActivity.toolbarTitleTahapanXpresi = resources.getString(2131822224);
        infoProductActivity.toolbarTitleTapres = resources.getString(2131822225);
        infoProductActivity.toolbarTitleBCADollar = resources.getString(2131822214);
        infoProductActivity.toolbarTitleTahapanBerjangka = resources.getString(2131822223);
        infoProductActivity.toolbarTitleDeposito = resources.getString(2131822216);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoProductActivity infoProductActivity = this.a;
        if (infoProductActivity != null) {
            this.a = null;
            infoProductActivity.toolbar = null;
            infoProductActivity.txtToolbarTitle = null;
            infoProductActivity.tvErrorMessage = null;
            infoProductActivity.wvContent = null;
            infoProductActivity.pb = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
