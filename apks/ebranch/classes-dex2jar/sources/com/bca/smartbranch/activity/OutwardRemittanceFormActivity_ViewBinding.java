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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OutwardRemittanceFormActivity_ViewBinding.class */
public class OutwardRemittanceFormActivity_ViewBinding implements Unbinder {
    private OutwardRemittanceFormActivity e;

    public OutwardRemittanceFormActivity_ViewBinding(OutwardRemittanceFormActivity outwardRemittanceFormActivity, View view) {
        this.e = outwardRemittanceFormActivity;
        outwardRemittanceFormActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        outwardRemittanceFormActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        outwardRemittanceFormActivity.rlToolbar = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298304, "field 'rlToolbar'", RelativeLayout.class);
        outwardRemittanceFormActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        outwardRemittanceFormActivity.llMainIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297767, "field 'llMainIndicator'", LinearLayout.class);
        outwardRemittanceFormActivity.tvIndicator1 = (TextView) Utils.findRequiredViewAsType(view, 2131299276, "field 'tvIndicator1'", TextView.class);
        outwardRemittanceFormActivity.pbIndicator1 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298111, "field 'pbIndicator1'", ProgressBar.class);
        outwardRemittanceFormActivity.tvIndicator2 = (TextView) Utils.findRequiredViewAsType(view, 2131299277, "field 'tvIndicator2'", TextView.class);
        outwardRemittanceFormActivity.pbIndicator2 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298112, "field 'pbIndicator2'", ProgressBar.class);
        outwardRemittanceFormActivity.tvIndicator3 = (TextView) Utils.findRequiredViewAsType(view, 2131299278, "field 'tvIndicator3'", TextView.class);
        outwardRemittanceFormActivity.pbIndicator3 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298113, "field 'pbIndicator3'", ProgressBar.class);
        outwardRemittanceFormActivity.tvIndicator4 = (TextView) Utils.findRequiredViewAsType(view, 2131299279, "field 'tvIndicator4'", TextView.class);
        outwardRemittanceFormActivity.pbIndicator4 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298114, "field 'pbIndicator4'", ProgressBar.class);
        outwardRemittanceFormActivity.tvIndicator5 = (TextView) Utils.findRequiredViewAsType(view, 2131299280, "field 'tvIndicator5'", TextView.class);
        outwardRemittanceFormActivity.pbIndicator5 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298115, "field 'pbIndicator5'", ProgressBar.class);
        outwardRemittanceFormActivity.tvIndicator6 = (TextView) Utils.findRequiredViewAsType(view, 2131299281, "field 'tvIndicator6'", TextView.class);
        outwardRemittanceFormActivity.ivIndicatorClear1 = (ImageView) Utils.findRequiredViewAsType(view, 2131297377, "field 'ivIndicatorClear1'", ImageView.class);
        outwardRemittanceFormActivity.ivIndicatorClear2 = (ImageView) Utils.findRequiredViewAsType(view, 2131297379, "field 'ivIndicatorClear2'", ImageView.class);
        outwardRemittanceFormActivity.ivIndicatorClear3 = (ImageView) Utils.findRequiredViewAsType(view, 2131297381, "field 'ivIndicatorClear3'", ImageView.class);
        outwardRemittanceFormActivity.ivIndicatorClear4 = (ImageView) Utils.findRequiredViewAsType(view, 2131297383, "field 'ivIndicatorClear4'", ImageView.class);
        outwardRemittanceFormActivity.ivIndicatorClear5 = (ImageView) Utils.findRequiredViewAsType(view, 2131297384, "field 'ivIndicatorClear5'", ImageView.class);
        outwardRemittanceFormActivity.ivIndicatorClear6 = (ImageView) Utils.findRequiredViewAsType(view, 2131297385, "field 'ivIndicatorClear6'", ImageView.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        outwardRemittanceFormActivity.drawableIndicatorOn = copyWindowDataInto.b(context, 2131231203);
        outwardRemittanceFormActivity.drawableIndicatorOff = copyWindowDataInto.b(context, 2131231202);
        outwardRemittanceFormActivity.titleOutwardRemittance = resources.getString(2131822238);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OutwardRemittanceFormActivity outwardRemittanceFormActivity = this.e;
        if (outwardRemittanceFormActivity != null) {
            this.e = null;
            outwardRemittanceFormActivity.llMain = null;
            outwardRemittanceFormActivity.toolbar = null;
            outwardRemittanceFormActivity.rlToolbar = null;
            outwardRemittanceFormActivity.tvToolbarTitle = null;
            outwardRemittanceFormActivity.llMainIndicator = null;
            outwardRemittanceFormActivity.tvIndicator1 = null;
            outwardRemittanceFormActivity.pbIndicator1 = null;
            outwardRemittanceFormActivity.tvIndicator2 = null;
            outwardRemittanceFormActivity.pbIndicator2 = null;
            outwardRemittanceFormActivity.tvIndicator3 = null;
            outwardRemittanceFormActivity.pbIndicator3 = null;
            outwardRemittanceFormActivity.tvIndicator4 = null;
            outwardRemittanceFormActivity.pbIndicator4 = null;
            outwardRemittanceFormActivity.tvIndicator5 = null;
            outwardRemittanceFormActivity.pbIndicator5 = null;
            outwardRemittanceFormActivity.tvIndicator6 = null;
            outwardRemittanceFormActivity.ivIndicatorClear1 = null;
            outwardRemittanceFormActivity.ivIndicatorClear2 = null;
            outwardRemittanceFormActivity.ivIndicatorClear3 = null;
            outwardRemittanceFormActivity.ivIndicatorClear4 = null;
            outwardRemittanceFormActivity.ivIndicatorClear5 = null;
            outwardRemittanceFormActivity.ivIndicatorClear6 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
