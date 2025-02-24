package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaEChannelNotificationActivity_ViewBinding.class */
public class DetailTundaEChannelNotificationActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private DetailTundaEChannelNotificationActivity d;
    private View e;
    private View g;
    private View h;
    private View i;
    private View j;

    public DetailTundaEChannelNotificationActivity_ViewBinding(final DetailTundaEChannelNotificationActivity detailTundaEChannelNotificationActivity, View view) {
        this.d = detailTundaEChannelNotificationActivity;
        detailTundaEChannelNotificationActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailTundaEChannelNotificationActivity.tvDescriptionKey = (TextView) Utils.findRequiredViewAsType(view, 2131298925, "field 'tvDescriptionKey'", TextView.class);
        detailTundaEChannelNotificationActivity.tvDescriptionValue = (TextView) Utils.findRequiredViewAsType(view, 2131298928, "field 'tvDescriptionValue'", TextView.class);
        detailTundaEChannelNotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        detailTundaEChannelNotificationActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.g = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelNotificationActivity.showWebView(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297408, "field 'ivQRCode' and method 'zoomQRCode'");
        detailTundaEChannelNotificationActivity.ivQRCode = (ImageView) Utils.castView(findRequiredView2, 2131297408, "field 'ivQRCode'", ImageView.class);
        this.h = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelNotificationActivity.zoomQRCode();
            }
        });
        detailTundaEChannelNotificationActivity.llKcp = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297711, "field 'llKcp'", LinearLayout.class);
        detailTundaEChannelNotificationActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        detailTundaEChannelNotificationActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        detailTundaEChannelNotificationActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299557, "field 'tvWaktu'", TextView.class);
        detailTundaEChannelNotificationActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        detailTundaEChannelNotificationActivity.ivDetail = (ImageView) Utils.castView(findRequiredView3, 2131297355, "field 'ivDetail'", ImageView.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelNotificationActivity.showDetail();
            }
        });
        detailTundaEChannelNotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296380, "field 'btnBatal' and method 'batal'");
        detailTundaEChannelNotificationActivity.btnBatal = (Button) Utils.castView(findRequiredView4, 2131296380, "field 'btnBatal'", Button.class);
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelNotificationActivity.batal(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296444, "field 'btnReservasi' and method 'clickedReservation'");
        detailTundaEChannelNotificationActivity.btnReservasi = (Button) Utils.castView(findRequiredView5, 2131296444, "field 'btnReservasi'", Button.class);
        this.e = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelNotificationActivity.clickedReservation(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296443, "field 'btnReschedule' and method 'clickedReservation'");
        detailTundaEChannelNotificationActivity.btnReschedule = (Button) Utils.castView(findRequiredView6, 2131296443, "field 'btnReschedule'", Button.class);
        this.b = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelNotificationActivity.clickedReservation(view2);
            }
        });
        detailTundaEChannelNotificationActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailTundaEChannelNotificationActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.j = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelNotificationActivity.showDetail();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelNotificationActivity.showDetail();
            }
        });
        Resources resources = view.getContext().getResources();
        detailTundaEChannelNotificationActivity.note = resources.getString(2131821357);
        detailTundaEChannelNotificationActivity.buktiPengisianForm = resources.getString(2131820609);
        detailTundaEChannelNotificationActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailTundaEChannelNotificationActivity detailTundaEChannelNotificationActivity = this.d;
        if (detailTundaEChannelNotificationActivity != null) {
            this.d = null;
            detailTundaEChannelNotificationActivity.tvNoReferensi = null;
            detailTundaEChannelNotificationActivity.tvDescriptionKey = null;
            detailTundaEChannelNotificationActivity.tvDescriptionValue = null;
            detailTundaEChannelNotificationActivity.llMain = null;
            detailTundaEChannelNotificationActivity.tvNote = null;
            detailTundaEChannelNotificationActivity.ivQRCode = null;
            detailTundaEChannelNotificationActivity.llKcp = null;
            detailTundaEChannelNotificationActivity.tvBranchName = null;
            detailTundaEChannelNotificationActivity.tvBranchAddress = null;
            detailTundaEChannelNotificationActivity.tvWaktu = null;
            detailTundaEChannelNotificationActivity.llDetail = null;
            detailTundaEChannelNotificationActivity.ivDetail = null;
            detailTundaEChannelNotificationActivity.tvErrorMessage = null;
            detailTundaEChannelNotificationActivity.btnBatal = null;
            detailTundaEChannelNotificationActivity.btnReservasi = null;
            detailTundaEChannelNotificationActivity.btnReschedule = null;
            detailTundaEChannelNotificationActivity.llRuangan = null;
            detailTundaEChannelNotificationActivity.tvJenisRuangan = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.i.setOnClickListener(null);
            this.i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
