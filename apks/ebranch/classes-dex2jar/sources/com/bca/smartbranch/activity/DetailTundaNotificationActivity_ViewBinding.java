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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaNotificationActivity_ViewBinding.class */
public class DetailTundaNotificationActivity_ViewBinding implements Unbinder {
    private View a;
    private DetailTundaNotificationActivity b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View h;
    private View i;
    private View j;

    public DetailTundaNotificationActivity_ViewBinding(final DetailTundaNotificationActivity detailTundaNotificationActivity, View view) {
        this.b = detailTundaNotificationActivity;
        detailTundaNotificationActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailTundaNotificationActivity.tvDescriptionKey = (TextView) Utils.findRequiredViewAsType(view, 2131298925, "field 'tvDescriptionKey'", TextView.class);
        detailTundaNotificationActivity.tvDescriptionValue = (TextView) Utils.findRequiredViewAsType(view, 2131298928, "field 'tvDescriptionValue'", TextView.class);
        detailTundaNotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        detailTundaNotificationActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.f = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationActivity.showWebView(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297408, "field 'ivQRCode' and method 'zoomQRCode'");
        detailTundaNotificationActivity.ivQRCode = (ImageView) Utils.castView(findRequiredView2, 2131297408, "field 'ivQRCode'", ImageView.class);
        this.j = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationActivity.zoomQRCode();
            }
        });
        detailTundaNotificationActivity.llKcp = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297711, "field 'llKcp'", LinearLayout.class);
        detailTundaNotificationActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        detailTundaNotificationActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        detailTundaNotificationActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299557, "field 'tvWaktu'", TextView.class);
        detailTundaNotificationActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        detailTundaNotificationActivity.ivDetail = (ImageView) Utils.castView(findRequiredView3, 2131297355, "field 'ivDetail'", ImageView.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationActivity.showDetail();
            }
        });
        detailTundaNotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296380, "field 'btnBatal' and method 'batal'");
        detailTundaNotificationActivity.btnBatal = (Button) Utils.castView(findRequiredView4, 2131296380, "field 'btnBatal'", Button.class);
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationActivity.batal(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296444, "field 'btnReservasi' and method 'clickedReservation'");
        detailTundaNotificationActivity.btnReservasi = (Button) Utils.castView(findRequiredView5, 2131296444, "field 'btnReservasi'", Button.class);
        this.d = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationActivity.clickedReservation(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296443, "field 'btnReschedule' and method 'clickedReservation'");
        detailTundaNotificationActivity.btnReschedule = (Button) Utils.castView(findRequiredView6, 2131296443, "field 'btnReschedule'", Button.class);
        this.a = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationActivity.clickedReservation(view2);
            }
        });
        detailTundaNotificationActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailTundaNotificationActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationActivity.showDetail();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationActivity.showDetail();
            }
        });
        Resources resources = view.getContext().getResources();
        detailTundaNotificationActivity.note = resources.getString(2131821357);
        detailTundaNotificationActivity.buktiPengisianForm = resources.getString(2131820609);
        detailTundaNotificationActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailTundaNotificationActivity detailTundaNotificationActivity = this.b;
        if (detailTundaNotificationActivity != null) {
            this.b = null;
            detailTundaNotificationActivity.tvNoReferensi = null;
            detailTundaNotificationActivity.tvDescriptionKey = null;
            detailTundaNotificationActivity.tvDescriptionValue = null;
            detailTundaNotificationActivity.llMain = null;
            detailTundaNotificationActivity.tvNote = null;
            detailTundaNotificationActivity.ivQRCode = null;
            detailTundaNotificationActivity.llKcp = null;
            detailTundaNotificationActivity.tvBranchName = null;
            detailTundaNotificationActivity.tvBranchAddress = null;
            detailTundaNotificationActivity.tvWaktu = null;
            detailTundaNotificationActivity.llDetail = null;
            detailTundaNotificationActivity.ivDetail = null;
            detailTundaNotificationActivity.tvErrorMessage = null;
            detailTundaNotificationActivity.btnBatal = null;
            detailTundaNotificationActivity.btnReservasi = null;
            detailTundaNotificationActivity.btnReschedule = null;
            detailTundaNotificationActivity.llRuangan = null;
            detailTundaNotificationActivity.tvJenisRuangan = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
