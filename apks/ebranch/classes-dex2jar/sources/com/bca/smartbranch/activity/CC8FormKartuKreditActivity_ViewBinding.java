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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC8FormKartuKreditActivity_ViewBinding.class */
public class CC8FormKartuKreditActivity_ViewBinding implements Unbinder {
    private CC8FormKartuKreditActivity e;

    public CC8FormKartuKreditActivity_ViewBinding(CC8FormKartuKreditActivity cC8FormKartuKreditActivity, View view) {
        this.e = cC8FormKartuKreditActivity;
        cC8FormKartuKreditActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        cC8FormKartuKreditActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC8FormKartuKreditActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC8FormKartuKreditActivity.llMainIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297767, "field 'llMainIndicator'", LinearLayout.class);
        cC8FormKartuKreditActivity.tvIndicator1 = (TextView) Utils.findRequiredViewAsType(view, 2131299276, "field 'tvIndicator1'", TextView.class);
        cC8FormKartuKreditActivity.pbIndicator1 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298111, "field 'pbIndicator1'", ProgressBar.class);
        cC8FormKartuKreditActivity.tvIndicator2 = (TextView) Utils.findRequiredViewAsType(view, 2131299277, "field 'tvIndicator2'", TextView.class);
        cC8FormKartuKreditActivity.pbIndicator2 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298112, "field 'pbIndicator2'", ProgressBar.class);
        cC8FormKartuKreditActivity.tvIndicator3 = (TextView) Utils.findRequiredViewAsType(view, 2131299278, "field 'tvIndicator3'", TextView.class);
        cC8FormKartuKreditActivity.pbIndicator3 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298113, "field 'pbIndicator3'", ProgressBar.class);
        cC8FormKartuKreditActivity.tvIndicator4 = (TextView) Utils.findRequiredViewAsType(view, 2131299279, "field 'tvIndicator4'", TextView.class);
        cC8FormKartuKreditActivity.pbIndicator4 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298114, "field 'pbIndicator4'", ProgressBar.class);
        cC8FormKartuKreditActivity.tvIndicator5 = (TextView) Utils.findRequiredViewAsType(view, 2131299280, "field 'tvIndicator5'", TextView.class);
        cC8FormKartuKreditActivity.ivIndicatorClear1 = (ImageView) Utils.findRequiredViewAsType(view, 2131297377, "field 'ivIndicatorClear1'", ImageView.class);
        cC8FormKartuKreditActivity.ivIndicatorClear2 = (ImageView) Utils.findRequiredViewAsType(view, 2131297379, "field 'ivIndicatorClear2'", ImageView.class);
        cC8FormKartuKreditActivity.ivIndicatorClear3 = (ImageView) Utils.findRequiredViewAsType(view, 2131297381, "field 'ivIndicatorClear3'", ImageView.class);
        cC8FormKartuKreditActivity.ivIndicatorClear4 = (ImageView) Utils.findRequiredViewAsType(view, 2131297383, "field 'ivIndicatorClear4'", ImageView.class);
        cC8FormKartuKreditActivity.ivIndicatorClear5 = (ImageView) Utils.findRequiredViewAsType(view, 2131297384, "field 'ivIndicatorClear5'", ImageView.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        cC8FormKartuKreditActivity.drawableIndicatorOn = copyWindowDataInto.b(context, 2131231203);
        cC8FormKartuKreditActivity.drawableIndicatorOff = copyWindowDataInto.b(context, 2131231202);
        cC8FormKartuKreditActivity.titlePengajuanCCBCA = resources.getString(2131822011);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC8FormKartuKreditActivity cC8FormKartuKreditActivity = this.e;
        if (cC8FormKartuKreditActivity != null) {
            this.e = null;
            cC8FormKartuKreditActivity.llMain = null;
            cC8FormKartuKreditActivity.toolbar = null;
            cC8FormKartuKreditActivity.tvToolbarTitle = null;
            cC8FormKartuKreditActivity.llMainIndicator = null;
            cC8FormKartuKreditActivity.tvIndicator1 = null;
            cC8FormKartuKreditActivity.pbIndicator1 = null;
            cC8FormKartuKreditActivity.tvIndicator2 = null;
            cC8FormKartuKreditActivity.pbIndicator2 = null;
            cC8FormKartuKreditActivity.tvIndicator3 = null;
            cC8FormKartuKreditActivity.pbIndicator3 = null;
            cC8FormKartuKreditActivity.tvIndicator4 = null;
            cC8FormKartuKreditActivity.pbIndicator4 = null;
            cC8FormKartuKreditActivity.tvIndicator5 = null;
            cC8FormKartuKreditActivity.ivIndicatorClear1 = null;
            cC8FormKartuKreditActivity.ivIndicatorClear2 = null;
            cC8FormKartuKreditActivity.ivIndicatorClear3 = null;
            cC8FormKartuKreditActivity.ivIndicatorClear4 = null;
            cC8FormKartuKreditActivity.ivIndicatorClear5 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
