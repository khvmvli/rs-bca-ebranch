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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TarikanUbahTransaksiActivity_ViewBinding.class */
public class TarikanUbahTransaksiActivity_ViewBinding implements Unbinder {
    private TarikanUbahTransaksiActivity c;

    public TarikanUbahTransaksiActivity_ViewBinding(TarikanUbahTransaksiActivity tarikanUbahTransaksiActivity, View view) {
        this.c = tarikanUbahTransaksiActivity;
        tarikanUbahTransaksiActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        tarikanUbahTransaksiActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        tarikanUbahTransaksiActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        tarikanUbahTransaksiActivity.llLongIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297765, "field 'llLongIndicator'", LinearLayout.class);
        tarikanUbahTransaksiActivity.llMainIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297767, "field 'llMainIndicator'", LinearLayout.class);
        tarikanUbahTransaksiActivity.tvIndicator1 = (TextView) Utils.findRequiredViewAsType(view, 2131299276, "field 'tvIndicator1'", TextView.class);
        tarikanUbahTransaksiActivity.pbIndicator1 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298111, "field 'pbIndicator1'", ProgressBar.class);
        tarikanUbahTransaksiActivity.tvIndicator2 = (TextView) Utils.findRequiredViewAsType(view, 2131299277, "field 'tvIndicator2'", TextView.class);
        tarikanUbahTransaksiActivity.pbIndicator2 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298112, "field 'pbIndicator2'", ProgressBar.class);
        tarikanUbahTransaksiActivity.tvIndicator3 = (TextView) Utils.findRequiredViewAsType(view, 2131299278, "field 'tvIndicator3'", TextView.class);
        tarikanUbahTransaksiActivity.ivIndicatorClear1 = (ImageView) Utils.findRequiredViewAsType(view, 2131297377, "field 'ivIndicatorClear1'", ImageView.class);
        tarikanUbahTransaksiActivity.ivIndicatorClear2 = (ImageView) Utils.findRequiredViewAsType(view, 2131297379, "field 'ivIndicatorClear2'", ImageView.class);
        tarikanUbahTransaksiActivity.ivIndicatorClear3 = (ImageView) Utils.findRequiredViewAsType(view, 2131297381, "field 'ivIndicatorClear3'", ImageView.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        tarikanUbahTransaksiActivity.drawableIndicatorOn = copyWindowDataInto.b(context, 2131231203);
        tarikanUbahTransaksiActivity.drawableIndicatorOff = copyWindowDataInto.b(context, 2131231202);
        tarikanUbahTransaksiActivity.tarikanTunai = resources.getString(2131822499);
        tarikanUbahTransaksiActivity.tarikanCek = resources.getString(2131822498);
        tarikanUbahTransaksiActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TarikanUbahTransaksiActivity tarikanUbahTransaksiActivity = this.c;
        if (tarikanUbahTransaksiActivity != null) {
            this.c = null;
            tarikanUbahTransaksiActivity.toolbar = null;
            tarikanUbahTransaksiActivity.txtToolbarTitle = null;
            tarikanUbahTransaksiActivity.llMain = null;
            tarikanUbahTransaksiActivity.llLongIndicator = null;
            tarikanUbahTransaksiActivity.llMainIndicator = null;
            tarikanUbahTransaksiActivity.tvIndicator1 = null;
            tarikanUbahTransaksiActivity.pbIndicator1 = null;
            tarikanUbahTransaksiActivity.tvIndicator2 = null;
            tarikanUbahTransaksiActivity.pbIndicator2 = null;
            tarikanUbahTransaksiActivity.tvIndicator3 = null;
            tarikanUbahTransaksiActivity.ivIndicatorClear1 = null;
            tarikanUbahTransaksiActivity.ivIndicatorClear2 = null;
            tarikanUbahTransaksiActivity.ivIndicatorClear3 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
