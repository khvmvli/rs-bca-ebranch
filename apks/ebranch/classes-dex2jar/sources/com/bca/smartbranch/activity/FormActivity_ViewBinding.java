package com.bca.smartbranch.activity;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.copyWindowDataInto;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormActivity_ViewBinding.class */
public class FormActivity_ViewBinding implements Unbinder {
    private FormActivity a;

    public FormActivity_ViewBinding(FormActivity formActivity, View view) {
        this.a = formActivity;
        formActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        formActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        formActivity.llLongIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297765, "field 'llLongIndicator'", LinearLayout.class);
        formActivity.llMainIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297767, "field 'llMainIndicator'", LinearLayout.class);
        formActivity.tvIndicator1 = (TextView) Utils.findRequiredViewAsType(view, 2131299276, "field 'tvIndicator1'", TextView.class);
        formActivity.pbIndicator1 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298111, "field 'pbIndicator1'", ProgressBar.class);
        formActivity.tvIndicator2 = (TextView) Utils.findRequiredViewAsType(view, 2131299277, "field 'tvIndicator2'", TextView.class);
        formActivity.pbIndicator2 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298112, "field 'pbIndicator2'", ProgressBar.class);
        formActivity.tvIndicator3 = (TextView) Utils.findRequiredViewAsType(view, 2131299278, "field 'tvIndicator3'", TextView.class);
        formActivity.pbIndicator3 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298113, "field 'pbIndicator3'", ProgressBar.class);
        formActivity.tvIndicator4 = (TextView) Utils.findRequiredViewAsType(view, 2131299279, "field 'tvIndicator4'", TextView.class);
        formActivity.pbIndicator4 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298114, "field 'pbIndicator4'", ProgressBar.class);
        formActivity.tvIndicator5 = (TextView) Utils.findRequiredViewAsType(view, 2131299280, "field 'tvIndicator5'", TextView.class);
        formActivity.ivIndicatorClear1 = (ImageView) Utils.findRequiredViewAsType(view, 2131297377, "field 'ivIndicatorClear1'", ImageView.class);
        formActivity.ivIndicatorClear2 = (ImageView) Utils.findRequiredViewAsType(view, 2131297379, "field 'ivIndicatorClear2'", ImageView.class);
        formActivity.ivIndicatorClear3 = (ImageView) Utils.findRequiredViewAsType(view, 2131297381, "field 'ivIndicatorClear3'", ImageView.class);
        formActivity.ivIndicatorClear4 = (ImageView) Utils.findRequiredViewAsType(view, 2131297383, "field 'ivIndicatorClear4'", ImageView.class);
        formActivity.ivIndicatorClear5 = (ImageView) Utils.findRequiredViewAsType(view, 2131297384, "field 'ivIndicatorClear5'", ImageView.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        formActivity.drawableIndicatorOn = copyWindowDataInto.b(context, 2131231203);
        formActivity.drawableIndicatorOff = copyWindowDataInto.b(context, 2131231202);
        formActivity.toolbarTitleTahapanBCA = resources.getString(2131822244);
        formActivity.toolbarTitleTahapanXpresi = resources.getString(2131822245);
        formActivity.toolbarTitleTapres = resources.getString(2131822246);
        formActivity.toolbarTitleBCADollar = resources.getString(2131822243);
        formActivity.toolbarTitleTahapanBerjangka = resources.getString(2131822275);
        formActivity.toolbarTitleDeposito = resources.getString(2131822203);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FormActivity formActivity = this.a;
        if (formActivity != null) {
            this.a = null;
            formActivity.toolbar = null;
            formActivity.txtToolbarTitle = null;
            formActivity.llLongIndicator = null;
            formActivity.llMainIndicator = null;
            formActivity.tvIndicator1 = null;
            formActivity.pbIndicator1 = null;
            formActivity.tvIndicator2 = null;
            formActivity.pbIndicator2 = null;
            formActivity.tvIndicator3 = null;
            formActivity.pbIndicator3 = null;
            formActivity.tvIndicator4 = null;
            formActivity.pbIndicator4 = null;
            formActivity.tvIndicator5 = null;
            formActivity.ivIndicatorClear1 = null;
            formActivity.ivIndicatorClear2 = null;
            formActivity.ivIndicatorClear3 = null;
            formActivity.ivIndicatorClear4 = null;
            formActivity.ivIndicatorClear5 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
