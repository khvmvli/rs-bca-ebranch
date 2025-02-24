package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AvailableBookingTimeROActivity_ViewBinding.class */
public class AvailableBookingTimeROActivity_ViewBinding implements Unbinder {
    private View a;
    private AvailableBookingTimeROActivity b;
    private View c;
    private View d;

    public AvailableBookingTimeROActivity_ViewBinding(final AvailableBookingTimeROActivity availableBookingTimeROActivity, View view) {
        this.b = availableBookingTimeROActivity;
        availableBookingTimeROActivity.tvBranch = (TextView) Utils.findRequiredViewAsType(view, 2131298862, "field 'tvBranch'", TextView.class);
        availableBookingTimeROActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        availableBookingTimeROActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        availableBookingTimeROActivity.lnActivityMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296324, "field 'lnActivityMain'", LinearLayout.class);
        availableBookingTimeROActivity.llJenisRuanganWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297703, "field 'llJenisRuanganWrapper'", LinearLayout.class);
        availableBookingTimeROActivity.lnJenisRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297968, "field 'lnJenisRuangan'", LinearLayout.class);
        availableBookingTimeROActivity.lnReservationDate = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297970, "field 'lnReservationDate'", LinearLayout.class);
        availableBookingTimeROActivity.lnReservationTime = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297971, "field 'lnReservationTime'", LinearLayout.class);
        availableBookingTimeROActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        availableBookingTimeROActivity.tvError = (TextView) Utils.findRequiredViewAsType(view, 2131298952, "field 'tvError'", TextView.class);
        availableBookingTimeROActivity.tvTotalTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299686, "field 'tvTotalTransaksi'", TextView.class);
        availableBookingTimeROActivity.tvEstimasiWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299252, "field 'tvEstimasiWaktu'", TextView.class);
        availableBookingTimeROActivity.llEstimasi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297635, "field 'llEstimasi'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        availableBookingTimeROActivity.btnProses = (Button) Utils.castView(findRequiredView, 2131296440, "field 'btnProses'", Button.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeROActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                availableBookingTimeROActivity.proses(view2);
            }
        });
        availableBookingTimeROActivity.tvErrorClosed = (TextView) Utils.findRequiredViewAsType(view, 2131298997, "field 'tvErrorClosed'", TextView.class);
        availableBookingTimeROActivity.tvErrorFullBook = (TextView) Utils.findRequiredViewAsType(view, 2131299011, "field 'tvErrorFullBook'", TextView.class);
        availableBookingTimeROActivity.tvReservationTimeInfo = (TextView) Utils.findRequiredViewAsType(view, 2131299558, "field 'tvReservationTimeInfo'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131299697, "method 'onClickUbahCabang'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeROActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                availableBookingTimeROActivity.onClickUbahCabang(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeROActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                availableBookingTimeROActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        availableBookingTimeROActivity.txtToolbar = resources.getString(2131822291);
        availableBookingTimeROActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        AvailableBookingTimeROActivity availableBookingTimeROActivity = this.b;
        if (availableBookingTimeROActivity != null) {
            this.b = null;
            availableBookingTimeROActivity.tvBranch = null;
            availableBookingTimeROActivity.toolbar = null;
            availableBookingTimeROActivity.tvToolbar = null;
            availableBookingTimeROActivity.lnActivityMain = null;
            availableBookingTimeROActivity.llJenisRuanganWrapper = null;
            availableBookingTimeROActivity.lnJenisRuangan = null;
            availableBookingTimeROActivity.lnReservationDate = null;
            availableBookingTimeROActivity.lnReservationTime = null;
            availableBookingTimeROActivity.tvErrorMessage = null;
            availableBookingTimeROActivity.tvError = null;
            availableBookingTimeROActivity.tvTotalTransaksi = null;
            availableBookingTimeROActivity.tvEstimasiWaktu = null;
            availableBookingTimeROActivity.llEstimasi = null;
            availableBookingTimeROActivity.btnProses = null;
            availableBookingTimeROActivity.tvErrorClosed = null;
            availableBookingTimeROActivity.tvErrorFullBook = null;
            availableBookingTimeROActivity.tvReservationTimeInfo = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
