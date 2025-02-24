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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaNotificationBookedActivity_ViewBinding.class */
public class DetailTundaNotificationBookedActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private DetailTundaNotificationBookedActivity c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;

    public DetailTundaNotificationBookedActivity_ViewBinding(final DetailTundaNotificationBookedActivity detailTundaNotificationBookedActivity, View view) {
        this.c = detailTundaNotificationBookedActivity;
        detailTundaNotificationBookedActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailTundaNotificationBookedActivity.tvDescriptionKey = (TextView) Utils.findRequiredViewAsType(view, 2131298925, "field 'tvDescriptionKey'", TextView.class);
        detailTundaNotificationBookedActivity.tvDescriptionValue = (TextView) Utils.findRequiredViewAsType(view, 2131298928, "field 'tvDescriptionValue'", TextView.class);
        detailTundaNotificationBookedActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        detailTundaNotificationBookedActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.h = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationBookedActivity.showWebView(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297408, "field 'ivQRCode' and method 'zoomQRCode'");
        detailTundaNotificationBookedActivity.ivQRCode = (ImageView) Utils.castView(findRequiredView2, 2131297408, "field 'ivQRCode'", ImageView.class);
        this.f = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationBookedActivity.zoomQRCode();
            }
        });
        detailTundaNotificationBookedActivity.llKcp = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297711, "field 'llKcp'", LinearLayout.class);
        detailTundaNotificationBookedActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        detailTundaNotificationBookedActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        detailTundaNotificationBookedActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299557, "field 'tvWaktu'", TextView.class);
        detailTundaNotificationBookedActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        detailTundaNotificationBookedActivity.ivDetail = (ImageView) Utils.castView(findRequiredView3, 2131297355, "field 'ivDetail'", ImageView.class);
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationBookedActivity.showDetail();
            }
        });
        detailTundaNotificationBookedActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296380, "field 'btnBatal' and method 'batal'");
        detailTundaNotificationBookedActivity.btnBatal = (Button) Utils.castView(findRequiredView4, 2131296380, "field 'btnBatal'", Button.class);
        this.d = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationBookedActivity.batal(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296444, "field 'btnReservasi' and method 'clickedReservation'");
        detailTundaNotificationBookedActivity.btnReservasi = (Button) Utils.castView(findRequiredView5, 2131296444, "field 'btnReservasi'", Button.class);
        this.a = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationBookedActivity.clickedReservation(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296443, "field 'btnReschedule' and method 'clickedReservation'");
        detailTundaNotificationBookedActivity.btnReschedule = (Button) Utils.castView(findRequiredView6, 2131296443, "field 'btnReschedule'", Button.class);
        this.e = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationBookedActivity.clickedReservation(view2);
            }
        });
        detailTundaNotificationBookedActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailTundaNotificationBookedActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.g = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationBookedActivity.showDetail();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaNotificationBookedActivity.showDetail();
            }
        });
        Resources resources = view.getContext().getResources();
        detailTundaNotificationBookedActivity.note = resources.getString(2131821357);
        detailTundaNotificationBookedActivity.buktiPengisianForm = resources.getString(2131820609);
        detailTundaNotificationBookedActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailTundaNotificationBookedActivity detailTundaNotificationBookedActivity = this.c;
        if (detailTundaNotificationBookedActivity != null) {
            this.c = null;
            detailTundaNotificationBookedActivity.tvNoReferensi = null;
            detailTundaNotificationBookedActivity.tvDescriptionKey = null;
            detailTundaNotificationBookedActivity.tvDescriptionValue = null;
            detailTundaNotificationBookedActivity.llMain = null;
            detailTundaNotificationBookedActivity.tvNote = null;
            detailTundaNotificationBookedActivity.ivQRCode = null;
            detailTundaNotificationBookedActivity.llKcp = null;
            detailTundaNotificationBookedActivity.tvBranchName = null;
            detailTundaNotificationBookedActivity.tvBranchAddress = null;
            detailTundaNotificationBookedActivity.tvWaktu = null;
            detailTundaNotificationBookedActivity.llDetail = null;
            detailTundaNotificationBookedActivity.ivDetail = null;
            detailTundaNotificationBookedActivity.tvErrorMessage = null;
            detailTundaNotificationBookedActivity.btnBatal = null;
            detailTundaNotificationBookedActivity.btnReservasi = null;
            detailTundaNotificationBookedActivity.btnReschedule = null;
            detailTundaNotificationBookedActivity.llRuangan = null;
            detailTundaNotificationBookedActivity.tvJenisRuangan = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.i.setOnClickListener(null);
            this.i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
