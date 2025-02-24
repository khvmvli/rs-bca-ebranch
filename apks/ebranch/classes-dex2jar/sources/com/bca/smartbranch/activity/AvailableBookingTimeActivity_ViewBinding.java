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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AvailableBookingTimeActivity_ViewBinding.class */
public class AvailableBookingTimeActivity_ViewBinding implements Unbinder {
    private AvailableBookingTimeActivity a;
    private View b;
    private View c;
    private View d;

    public AvailableBookingTimeActivity_ViewBinding(final AvailableBookingTimeActivity availableBookingTimeActivity, View view) {
        this.a = availableBookingTimeActivity;
        availableBookingTimeActivity.tvBranch = (TextView) Utils.findRequiredViewAsType(view, 2131298862, "field 'tvBranch'", TextView.class);
        availableBookingTimeActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        availableBookingTimeActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        availableBookingTimeActivity.lnActivityMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296324, "field 'lnActivityMain'", LinearLayout.class);
        availableBookingTimeActivity.lnReservationDate = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297970, "field 'lnReservationDate'", LinearLayout.class);
        availableBookingTimeActivity.lnReservationTime = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297971, "field 'lnReservationTime'", LinearLayout.class);
        availableBookingTimeActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        availableBookingTimeActivity.tvError = (TextView) Utils.findRequiredViewAsType(view, 2131298952, "field 'tvError'", TextView.class);
        availableBookingTimeActivity.tvTotalTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299686, "field 'tvTotalTransaksi'", TextView.class);
        availableBookingTimeActivity.tvEstimasiWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299252, "field 'tvEstimasiWaktu'", TextView.class);
        availableBookingTimeActivity.llEstimasi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297635, "field 'llEstimasi'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299697, "method 'onClickUbahCabang'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                availableBookingTimeActivity.onClickUbahCabang(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "method 'proses'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                availableBookingTimeActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                availableBookingTimeActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        availableBookingTimeActivity.txtToolbar = resources.getString(2131822291);
        availableBookingTimeActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        AvailableBookingTimeActivity availableBookingTimeActivity = this.a;
        if (availableBookingTimeActivity != null) {
            this.a = null;
            availableBookingTimeActivity.tvBranch = null;
            availableBookingTimeActivity.toolbar = null;
            availableBookingTimeActivity.tvToolbar = null;
            availableBookingTimeActivity.lnActivityMain = null;
            availableBookingTimeActivity.lnReservationDate = null;
            availableBookingTimeActivity.lnReservationTime = null;
            availableBookingTimeActivity.tvErrorMessage = null;
            availableBookingTimeActivity.tvError = null;
            availableBookingTimeActivity.tvTotalTransaksi = null;
            availableBookingTimeActivity.tvEstimasiWaktu = null;
            availableBookingTimeActivity.llEstimasi = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
