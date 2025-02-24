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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TarikanReservasiUbahTransaksiActivity_ViewBinding.class */
public class TarikanReservasiUbahTransaksiActivity_ViewBinding implements Unbinder {
    private TarikanReservasiUbahTransaksiActivity d;

    public TarikanReservasiUbahTransaksiActivity_ViewBinding(TarikanReservasiUbahTransaksiActivity tarikanReservasiUbahTransaksiActivity, View view) {
        this.d = tarikanReservasiUbahTransaksiActivity;
        tarikanReservasiUbahTransaksiActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        tarikanReservasiUbahTransaksiActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        tarikanReservasiUbahTransaksiActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        tarikanReservasiUbahTransaksiActivity.llLongIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297765, "field 'llLongIndicator'", LinearLayout.class);
        tarikanReservasiUbahTransaksiActivity.llMainIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297767, "field 'llMainIndicator'", LinearLayout.class);
        tarikanReservasiUbahTransaksiActivity.tvIndicator1 = (TextView) Utils.findRequiredViewAsType(view, 2131299276, "field 'tvIndicator1'", TextView.class);
        tarikanReservasiUbahTransaksiActivity.pbIndicator1 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298111, "field 'pbIndicator1'", ProgressBar.class);
        tarikanReservasiUbahTransaksiActivity.tvIndicator2 = (TextView) Utils.findRequiredViewAsType(view, 2131299277, "field 'tvIndicator2'", TextView.class);
        tarikanReservasiUbahTransaksiActivity.pbIndicator2 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298112, "field 'pbIndicator2'", ProgressBar.class);
        tarikanReservasiUbahTransaksiActivity.tvIndicator3 = (TextView) Utils.findRequiredViewAsType(view, 2131299278, "field 'tvIndicator3'", TextView.class);
        tarikanReservasiUbahTransaksiActivity.ivIndicatorClear1 = (ImageView) Utils.findRequiredViewAsType(view, 2131297377, "field 'ivIndicatorClear1'", ImageView.class);
        tarikanReservasiUbahTransaksiActivity.ivIndicatorClear2 = (ImageView) Utils.findRequiredViewAsType(view, 2131297379, "field 'ivIndicatorClear2'", ImageView.class);
        tarikanReservasiUbahTransaksiActivity.ivIndicatorClear3 = (ImageView) Utils.findRequiredViewAsType(view, 2131297381, "field 'ivIndicatorClear3'", ImageView.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        tarikanReservasiUbahTransaksiActivity.drawableIndicatorOn = copyWindowDataInto.b(context, 2131231203);
        tarikanReservasiUbahTransaksiActivity.drawableIndicatorOff = copyWindowDataInto.b(context, 2131231202);
        tarikanReservasiUbahTransaksiActivity.tarikanTunai = resources.getString(2131822499);
        tarikanReservasiUbahTransaksiActivity.tarikanCek = resources.getString(2131822498);
        tarikanReservasiUbahTransaksiActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TarikanReservasiUbahTransaksiActivity tarikanReservasiUbahTransaksiActivity = this.d;
        if (tarikanReservasiUbahTransaksiActivity != null) {
            this.d = null;
            tarikanReservasiUbahTransaksiActivity.toolbar = null;
            tarikanReservasiUbahTransaksiActivity.txtToolbarTitle = null;
            tarikanReservasiUbahTransaksiActivity.llMain = null;
            tarikanReservasiUbahTransaksiActivity.llLongIndicator = null;
            tarikanReservasiUbahTransaksiActivity.llMainIndicator = null;
            tarikanReservasiUbahTransaksiActivity.tvIndicator1 = null;
            tarikanReservasiUbahTransaksiActivity.pbIndicator1 = null;
            tarikanReservasiUbahTransaksiActivity.tvIndicator2 = null;
            tarikanReservasiUbahTransaksiActivity.pbIndicator2 = null;
            tarikanReservasiUbahTransaksiActivity.tvIndicator3 = null;
            tarikanReservasiUbahTransaksiActivity.ivIndicatorClear1 = null;
            tarikanReservasiUbahTransaksiActivity.ivIndicatorClear2 = null;
            tarikanReservasiUbahTransaksiActivity.ivIndicatorClear3 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
