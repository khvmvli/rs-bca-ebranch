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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AvailableBookingTimeV2Activity_ViewBinding.class */
public class AvailableBookingTimeV2Activity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View d;
    private AvailableBookingTimeV2Activity e;

    public AvailableBookingTimeV2Activity_ViewBinding(final AvailableBookingTimeV2Activity availableBookingTimeV2Activity, View view) {
        this.e = availableBookingTimeV2Activity;
        availableBookingTimeV2Activity.tvBranch = (TextView) Utils.findRequiredViewAsType(view, 2131298862, "field 'tvBranch'", TextView.class);
        availableBookingTimeV2Activity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        availableBookingTimeV2Activity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        availableBookingTimeV2Activity.lnActivityMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296324, "field 'lnActivityMain'", LinearLayout.class);
        availableBookingTimeV2Activity.llJenisRuanganWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297703, "field 'llJenisRuanganWrapper'", LinearLayout.class);
        availableBookingTimeV2Activity.lnJenisRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297968, "field 'lnJenisRuangan'", LinearLayout.class);
        availableBookingTimeV2Activity.lnReservationDate = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297970, "field 'lnReservationDate'", LinearLayout.class);
        availableBookingTimeV2Activity.lnReservationTime = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297971, "field 'lnReservationTime'", LinearLayout.class);
        availableBookingTimeV2Activity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        availableBookingTimeV2Activity.tvError = (TextView) Utils.findRequiredViewAsType(view, 2131298952, "field 'tvError'", TextView.class);
        availableBookingTimeV2Activity.tvTotalTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299686, "field 'tvTotalTransaksi'", TextView.class);
        availableBookingTimeV2Activity.tvEstimasiWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299252, "field 'tvEstimasiWaktu'", TextView.class);
        availableBookingTimeV2Activity.llEstimasi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297635, "field 'llEstimasi'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        availableBookingTimeV2Activity.btnProses = (Button) Utils.castView(findRequiredView, 2131296440, "field 'btnProses'", Button.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeV2Activity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                availableBookingTimeV2Activity.proses(view2);
            }
        });
        availableBookingTimeV2Activity.tvErrorClosed = (TextView) Utils.findRequiredViewAsType(view, 2131298997, "field 'tvErrorClosed'", TextView.class);
        availableBookingTimeV2Activity.tvErrorFullBook = (TextView) Utils.findRequiredViewAsType(view, 2131299011, "field 'tvErrorFullBook'", TextView.class);
        availableBookingTimeV2Activity.tvReservationTimeInfo = (TextView) Utils.findRequiredViewAsType(view, 2131299558, "field 'tvReservationTimeInfo'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131299697, "method 'onClickUbahCabang'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeV2Activity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                availableBookingTimeV2Activity.onClickUbahCabang(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.AvailableBookingTimeV2Activity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                availableBookingTimeV2Activity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        availableBookingTimeV2Activity.txtToolbar = resources.getString(2131822291);
        availableBookingTimeV2Activity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        AvailableBookingTimeV2Activity availableBookingTimeV2Activity = this.e;
        if (availableBookingTimeV2Activity != null) {
            this.e = null;
            availableBookingTimeV2Activity.tvBranch = null;
            availableBookingTimeV2Activity.toolbar = null;
            availableBookingTimeV2Activity.tvToolbar = null;
            availableBookingTimeV2Activity.lnActivityMain = null;
            availableBookingTimeV2Activity.llJenisRuanganWrapper = null;
            availableBookingTimeV2Activity.lnJenisRuangan = null;
            availableBookingTimeV2Activity.lnReservationDate = null;
            availableBookingTimeV2Activity.lnReservationTime = null;
            availableBookingTimeV2Activity.tvErrorMessage = null;
            availableBookingTimeV2Activity.tvError = null;
            availableBookingTimeV2Activity.tvTotalTransaksi = null;
            availableBookingTimeV2Activity.tvEstimasiWaktu = null;
            availableBookingTimeV2Activity.llEstimasi = null;
            availableBookingTimeV2Activity.btnProses = null;
            availableBookingTimeV2Activity.tvErrorClosed = null;
            availableBookingTimeV2Activity.tvErrorFullBook = null;
            availableBookingTimeV2Activity.tvReservationTimeInfo = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
