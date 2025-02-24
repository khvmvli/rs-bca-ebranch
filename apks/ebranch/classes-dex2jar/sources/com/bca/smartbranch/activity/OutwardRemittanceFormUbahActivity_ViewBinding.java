package com.bca.smartbranch.activity;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.copyWindowDataInto;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OutwardRemittanceFormUbahActivity_ViewBinding.class */
public class OutwardRemittanceFormUbahActivity_ViewBinding implements Unbinder {
    private OutwardRemittanceFormUbahActivity c;

    public OutwardRemittanceFormUbahActivity_ViewBinding(OutwardRemittanceFormUbahActivity outwardRemittanceFormUbahActivity, View view) {
        this.c = outwardRemittanceFormUbahActivity;
        outwardRemittanceFormUbahActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        outwardRemittanceFormUbahActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        outwardRemittanceFormUbahActivity.rlToolbar = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298304, "field 'rlToolbar'", RelativeLayout.class);
        outwardRemittanceFormUbahActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        outwardRemittanceFormUbahActivity.llMainIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297767, "field 'llMainIndicator'", LinearLayout.class);
        outwardRemittanceFormUbahActivity.tvIndicator1 = (TextView) Utils.findRequiredViewAsType(view, 2131299276, "field 'tvIndicator1'", TextView.class);
        outwardRemittanceFormUbahActivity.pbIndicator1 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298111, "field 'pbIndicator1'", ProgressBar.class);
        outwardRemittanceFormUbahActivity.tvIndicator2 = (TextView) Utils.findRequiredViewAsType(view, 2131299277, "field 'tvIndicator2'", TextView.class);
        outwardRemittanceFormUbahActivity.pbIndicator2 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298112, "field 'pbIndicator2'", ProgressBar.class);
        outwardRemittanceFormUbahActivity.tvIndicator3 = (TextView) Utils.findRequiredViewAsType(view, 2131299278, "field 'tvIndicator3'", TextView.class);
        outwardRemittanceFormUbahActivity.pbIndicator3 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298113, "field 'pbIndicator3'", ProgressBar.class);
        outwardRemittanceFormUbahActivity.tvIndicator4 = (TextView) Utils.findRequiredViewAsType(view, 2131299279, "field 'tvIndicator4'", TextView.class);
        outwardRemittanceFormUbahActivity.pbIndicator4 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298114, "field 'pbIndicator4'", ProgressBar.class);
        outwardRemittanceFormUbahActivity.tvIndicator5 = (TextView) Utils.findRequiredViewAsType(view, 2131299280, "field 'tvIndicator5'", TextView.class);
        outwardRemittanceFormUbahActivity.pbIndicator5 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298115, "field 'pbIndicator5'", ProgressBar.class);
        outwardRemittanceFormUbahActivity.tvIndicator6 = (TextView) Utils.findRequiredViewAsType(view, 2131299281, "field 'tvIndicator6'", TextView.class);
        outwardRemittanceFormUbahActivity.ivIndicatorClear1 = (ImageView) Utils.findRequiredViewAsType(view, 2131297377, "field 'ivIndicatorClear1'", ImageView.class);
        outwardRemittanceFormUbahActivity.ivIndicatorClear2 = (ImageView) Utils.findRequiredViewAsType(view, 2131297379, "field 'ivIndicatorClear2'", ImageView.class);
        outwardRemittanceFormUbahActivity.ivIndicatorClear3 = (ImageView) Utils.findRequiredViewAsType(view, 2131297381, "field 'ivIndicatorClear3'", ImageView.class);
        outwardRemittanceFormUbahActivity.ivIndicatorClear4 = (ImageView) Utils.findRequiredViewAsType(view, 2131297383, "field 'ivIndicatorClear4'", ImageView.class);
        outwardRemittanceFormUbahActivity.ivIndicatorClear5 = (ImageView) Utils.findRequiredViewAsType(view, 2131297384, "field 'ivIndicatorClear5'", ImageView.class);
        outwardRemittanceFormUbahActivity.ivIndicatorClear6 = (ImageView) Utils.findRequiredViewAsType(view, 2131297385, "field 'ivIndicatorClear6'", ImageView.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        outwardRemittanceFormUbahActivity.drawableIndicatorOn = copyWindowDataInto.b(context, 2131231203);
        outwardRemittanceFormUbahActivity.drawableIndicatorOff = copyWindowDataInto.b(context, 2131231202);
        outwardRemittanceFormUbahActivity.titleOutwardRemittance = resources.getString(2131822238);
        outwardRemittanceFormUbahActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OutwardRemittanceFormUbahActivity outwardRemittanceFormUbahActivity = this.c;
        if (outwardRemittanceFormUbahActivity != null) {
            this.c = null;
            outwardRemittanceFormUbahActivity.llMain = null;
            outwardRemittanceFormUbahActivity.toolbar = null;
            outwardRemittanceFormUbahActivity.rlToolbar = null;
            outwardRemittanceFormUbahActivity.tvToolbarTitle = null;
            outwardRemittanceFormUbahActivity.llMainIndicator = null;
            outwardRemittanceFormUbahActivity.tvIndicator1 = null;
            outwardRemittanceFormUbahActivity.pbIndicator1 = null;
            outwardRemittanceFormUbahActivity.tvIndicator2 = null;
            outwardRemittanceFormUbahActivity.pbIndicator2 = null;
            outwardRemittanceFormUbahActivity.tvIndicator3 = null;
            outwardRemittanceFormUbahActivity.pbIndicator3 = null;
            outwardRemittanceFormUbahActivity.tvIndicator4 = null;
            outwardRemittanceFormUbahActivity.pbIndicator4 = null;
            outwardRemittanceFormUbahActivity.tvIndicator5 = null;
            outwardRemittanceFormUbahActivity.pbIndicator5 = null;
            outwardRemittanceFormUbahActivity.tvIndicator6 = null;
            outwardRemittanceFormUbahActivity.ivIndicatorClear1 = null;
            outwardRemittanceFormUbahActivity.ivIndicatorClear2 = null;
            outwardRemittanceFormUbahActivity.ivIndicatorClear3 = null;
            outwardRemittanceFormUbahActivity.ivIndicatorClear4 = null;
            outwardRemittanceFormUbahActivity.ivIndicatorClear5 = null;
            outwardRemittanceFormUbahActivity.ivIndicatorClear6 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
