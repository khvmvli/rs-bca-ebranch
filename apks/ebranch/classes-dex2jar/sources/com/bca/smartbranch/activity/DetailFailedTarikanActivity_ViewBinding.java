package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailFailedTarikanActivity_ViewBinding.class */
public class DetailFailedTarikanActivity_ViewBinding implements Unbinder {
    private DetailFailedTarikanActivity b;
    private View d;

    public DetailFailedTarikanActivity_ViewBinding(final DetailFailedTarikanActivity detailFailedTarikanActivity, View view) {
        this.b = detailFailedTarikanActivity;
        detailFailedTarikanActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailFailedTarikanActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailFailedTarikanActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailFailedTarikanActivity.tvTitleTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299672, "field 'tvTitleTransaksi'", TextView.class);
        detailFailedTarikanActivity.tvTanggal = (TextView) Utils.findRequiredViewAsType(view, 2131299594, "field 'tvTanggal'", TextView.class);
        detailFailedTarikanActivity.tvJam = (TextView) Utils.findRequiredViewAsType(view, 2131299299, "field 'tvJam'", TextView.class);
        detailFailedTarikanActivity.tvPenarik = (TextView) Utils.findRequiredViewAsType(view, 2131299475, "field 'tvPenarik'", TextView.class);
        detailFailedTarikanActivity.tvPenarikInfo = (TextView) Utils.findRequiredViewAsType(view, 2131299291, "field 'tvPenarikInfo'", TextView.class);
        detailFailedTarikanActivity.tvNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299316, "field 'tvNominal'", TextView.class);
        detailFailedTarikanActivity.tvNominalInfo = (TextView) Utils.findRequiredViewAsType(view, 2131299289, "field 'tvNominalInfo'", TextView.class);
        detailFailedTarikanActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailFailedTarikanActivity.llBatal = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297626, "field 'llBatal'", LinearLayout.class);
        detailFailedTarikanActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299497, "field 'tvNoReferensi'", TextView.class);
        detailFailedTarikanActivity.llNoref = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297836, "field 'llNoref'", LinearLayout.class);
        detailFailedTarikanActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailFailedTarikanActivity.tvKeterangan = (TextView) Utils.findRequiredViewAsType(view, 2131299349, "field 'tvKeterangan'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailFailedTarikanActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailFailedTarikanActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailFailedTarikanActivity.retry = resources.getString(2131822092);
        detailFailedTarikanActivity.toolbarTitle = resources.getString(2131822262);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailFailedTarikanActivity detailFailedTarikanActivity = this.b;
        if (detailFailedTarikanActivity != null) {
            this.b = null;
            detailFailedTarikanActivity.toolbar = null;
            detailFailedTarikanActivity.txtToolbarTitle = null;
            detailFailedTarikanActivity.tvErrorMessage = null;
            detailFailedTarikanActivity.tvTitleTransaksi = null;
            detailFailedTarikanActivity.tvTanggal = null;
            detailFailedTarikanActivity.tvJam = null;
            detailFailedTarikanActivity.tvPenarik = null;
            detailFailedTarikanActivity.tvPenarikInfo = null;
            detailFailedTarikanActivity.tvNominal = null;
            detailFailedTarikanActivity.tvNominalInfo = null;
            detailFailedTarikanActivity.tvStatus = null;
            detailFailedTarikanActivity.llBatal = null;
            detailFailedTarikanActivity.tvNoReferensi = null;
            detailFailedTarikanActivity.llNoref = null;
            detailFailedTarikanActivity.llMain = null;
            detailFailedTarikanActivity.tvKeterangan = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
