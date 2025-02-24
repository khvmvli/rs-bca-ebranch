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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormTellerActivity_ViewBinding.class */
public class FormTellerActivity_ViewBinding implements Unbinder {
    private FormTellerActivity a;

    public FormTellerActivity_ViewBinding(FormTellerActivity formTellerActivity, View view) {
        this.a = formTellerActivity;
        formTellerActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        formTellerActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        formTellerActivity.rlToolbar = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298304, "field 'rlToolbar'", RelativeLayout.class);
        formTellerActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        formTellerActivity.tvIndicator1 = (TextView) Utils.findRequiredViewAsType(view, 2131299276, "field 'tvIndicator1'", TextView.class);
        formTellerActivity.pbIndicator1 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298111, "field 'pbIndicator1'", ProgressBar.class);
        formTellerActivity.tvIndicator2 = (TextView) Utils.findRequiredViewAsType(view, 2131299277, "field 'tvIndicator2'", TextView.class);
        formTellerActivity.pbIndicator2 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298112, "field 'pbIndicator2'", ProgressBar.class);
        formTellerActivity.tvIndicator3 = (TextView) Utils.findRequiredViewAsType(view, 2131299278, "field 'tvIndicator3'", TextView.class);
        formTellerActivity.pbIndicator3 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298113, "field 'pbIndicator3'", ProgressBar.class);
        formTellerActivity.tvIndicator4 = (TextView) Utils.findRequiredViewAsType(view, 2131299279, "field 'tvIndicator4'", TextView.class);
        formTellerActivity.pbIndicator4 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298114, "field 'pbIndicator4'", ProgressBar.class);
        formTellerActivity.tvIndicator5 = (TextView) Utils.findRequiredViewAsType(view, 2131299280, "field 'tvIndicator5'", TextView.class);
        formTellerActivity.ivIndicatorClear1 = (ImageView) Utils.findRequiredViewAsType(view, 2131297377, "field 'ivIndicatorClear1'", ImageView.class);
        formTellerActivity.ivIndicatorClear2 = (ImageView) Utils.findRequiredViewAsType(view, 2131297379, "field 'ivIndicatorClear2'", ImageView.class);
        formTellerActivity.ivIndicatorClear3 = (ImageView) Utils.findRequiredViewAsType(view, 2131297381, "field 'ivIndicatorClear3'", ImageView.class);
        formTellerActivity.ivIndicatorClear4 = (ImageView) Utils.findRequiredViewAsType(view, 2131297383, "field 'ivIndicatorClear4'", ImageView.class);
        formTellerActivity.ivIndicatorClear5 = (ImageView) Utils.findRequiredViewAsType(view, 2131297384, "field 'ivIndicatorClear5'", ImageView.class);
        formTellerActivity.llIndicator3 = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297685, "field 'llIndicator3'", LinearLayout.class);
        formTellerActivity.llIndicator4 = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297686, "field 'llIndicator4'", LinearLayout.class);
        formTellerActivity.llIndicator5 = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297687, "field 'llIndicator5'", LinearLayout.class);
        formTellerActivity.llMainIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297767, "field 'llMainIndicator'", LinearLayout.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        formTellerActivity.drawableIndicatorOn = copyWindowDataInto.b(context, 2131231203);
        formTellerActivity.drawableIndicatorOff = copyWindowDataInto.b(context, 2131231202);
        formTellerActivity.toolbarTitle = resources.getString(2131822281);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FormTellerActivity formTellerActivity = this.a;
        if (formTellerActivity != null) {
            this.a = null;
            formTellerActivity.llMain = null;
            formTellerActivity.toolbar = null;
            formTellerActivity.rlToolbar = null;
            formTellerActivity.tvToolbarTitle = null;
            formTellerActivity.tvIndicator1 = null;
            formTellerActivity.pbIndicator1 = null;
            formTellerActivity.tvIndicator2 = null;
            formTellerActivity.pbIndicator2 = null;
            formTellerActivity.tvIndicator3 = null;
            formTellerActivity.pbIndicator3 = null;
            formTellerActivity.tvIndicator4 = null;
            formTellerActivity.pbIndicator4 = null;
            formTellerActivity.tvIndicator5 = null;
            formTellerActivity.ivIndicatorClear1 = null;
            formTellerActivity.ivIndicatorClear2 = null;
            formTellerActivity.ivIndicatorClear3 = null;
            formTellerActivity.ivIndicatorClear4 = null;
            formTellerActivity.ivIndicatorClear5 = null;
            formTellerActivity.llIndicator3 = null;
            formTellerActivity.llIndicator4 = null;
            formTellerActivity.llIndicator5 = null;
            formTellerActivity.llMainIndicator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
