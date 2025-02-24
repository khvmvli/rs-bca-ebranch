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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TarikanTransaksiActivity_ViewBinding.class */
public class TarikanTransaksiActivity_ViewBinding implements Unbinder {
    private TarikanTransaksiActivity a;

    public TarikanTransaksiActivity_ViewBinding(TarikanTransaksiActivity tarikanTransaksiActivity, View view) {
        this.a = tarikanTransaksiActivity;
        tarikanTransaksiActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        tarikanTransaksiActivity.rlToolbar = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298304, "field 'rlToolbar'", RelativeLayout.class);
        tarikanTransaksiActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        tarikanTransaksiActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        tarikanTransaksiActivity.llLongIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297765, "field 'llLongIndicator'", LinearLayout.class);
        tarikanTransaksiActivity.llMainIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297767, "field 'llMainIndicator'", LinearLayout.class);
        tarikanTransaksiActivity.tvIndicator1 = (TextView) Utils.findRequiredViewAsType(view, 2131299276, "field 'tvIndicator1'", TextView.class);
        tarikanTransaksiActivity.pbIndicator1 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298111, "field 'pbIndicator1'", ProgressBar.class);
        tarikanTransaksiActivity.tvIndicator2 = (TextView) Utils.findRequiredViewAsType(view, 2131299277, "field 'tvIndicator2'", TextView.class);
        tarikanTransaksiActivity.pbIndicator2 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298112, "field 'pbIndicator2'", ProgressBar.class);
        tarikanTransaksiActivity.tvIndicator3 = (TextView) Utils.findRequiredViewAsType(view, 2131299278, "field 'tvIndicator3'", TextView.class);
        tarikanTransaksiActivity.ivIndicatorClear1 = (ImageView) Utils.findRequiredViewAsType(view, 2131297377, "field 'ivIndicatorClear1'", ImageView.class);
        tarikanTransaksiActivity.ivIndicatorClear2 = (ImageView) Utils.findRequiredViewAsType(view, 2131297379, "field 'ivIndicatorClear2'", ImageView.class);
        tarikanTransaksiActivity.ivIndicatorClear3 = (ImageView) Utils.findRequiredViewAsType(view, 2131297381, "field 'ivIndicatorClear3'", ImageView.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        tarikanTransaksiActivity.drawableIndicatorOn = copyWindowDataInto.b(context, 2131231203);
        tarikanTransaksiActivity.drawableIndicatorOff = copyWindowDataInto.b(context, 2131231202);
        tarikanTransaksiActivity.tarikanTunai = resources.getString(2131822499);
        tarikanTransaksiActivity.tarikanCek = resources.getString(2131822498);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TarikanTransaksiActivity tarikanTransaksiActivity = this.a;
        if (tarikanTransaksiActivity != null) {
            this.a = null;
            tarikanTransaksiActivity.toolbar = null;
            tarikanTransaksiActivity.rlToolbar = null;
            tarikanTransaksiActivity.txtToolbarTitle = null;
            tarikanTransaksiActivity.llMain = null;
            tarikanTransaksiActivity.llLongIndicator = null;
            tarikanTransaksiActivity.llMainIndicator = null;
            tarikanTransaksiActivity.tvIndicator1 = null;
            tarikanTransaksiActivity.pbIndicator1 = null;
            tarikanTransaksiActivity.tvIndicator2 = null;
            tarikanTransaksiActivity.pbIndicator2 = null;
            tarikanTransaksiActivity.tvIndicator3 = null;
            tarikanTransaksiActivity.ivIndicatorClear1 = null;
            tarikanTransaksiActivity.ivIndicatorClear2 = null;
            tarikanTransaksiActivity.ivIndicatorClear3 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
