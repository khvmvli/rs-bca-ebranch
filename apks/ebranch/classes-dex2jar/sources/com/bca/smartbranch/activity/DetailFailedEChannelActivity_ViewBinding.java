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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailFailedEChannelActivity_ViewBinding.class */
public class DetailFailedEChannelActivity_ViewBinding implements Unbinder {
    private DetailFailedEChannelActivity a;
    private View d;

    public DetailFailedEChannelActivity_ViewBinding(final DetailFailedEChannelActivity detailFailedEChannelActivity, View view) {
        this.a = detailFailedEChannelActivity;
        detailFailedEChannelActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailFailedEChannelActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailFailedEChannelActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailFailedEChannelActivity.tvTitleTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299672, "field 'tvTitleTransaksi'", TextView.class);
        detailFailedEChannelActivity.tvTanggal = (TextView) Utils.findRequiredViewAsType(view, 2131299594, "field 'tvTanggal'", TextView.class);
        detailFailedEChannelActivity.tvJam = (TextView) Utils.findRequiredViewAsType(view, 2131299299, "field 'tvJam'", TextView.class);
        detailFailedEChannelActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailFailedEChannelActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailFailedEChannelActivity.tvKeterangan = (TextView) Utils.findRequiredViewAsType(view, 2131299349, "field 'tvKeterangan'", TextView.class);
        detailFailedEChannelActivity.llBatal = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297626, "field 'llBatal'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailFailedEChannelActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailFailedEChannelActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailFailedEChannelActivity.retry = resources.getString(2131822092);
        detailFailedEChannelActivity.toolbarTitle = resources.getString(2131822262);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailFailedEChannelActivity detailFailedEChannelActivity = this.a;
        if (detailFailedEChannelActivity != null) {
            this.a = null;
            detailFailedEChannelActivity.toolbar = null;
            detailFailedEChannelActivity.txtToolbarTitle = null;
            detailFailedEChannelActivity.tvErrorMessage = null;
            detailFailedEChannelActivity.tvTitleTransaksi = null;
            detailFailedEChannelActivity.tvTanggal = null;
            detailFailedEChannelActivity.tvJam = null;
            detailFailedEChannelActivity.tvStatus = null;
            detailFailedEChannelActivity.tvNoReferensi = null;
            detailFailedEChannelActivity.tvKeterangan = null;
            detailFailedEChannelActivity.llBatal = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
