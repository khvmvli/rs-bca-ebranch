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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaActivity_ViewBinding.class */
public class DetailTundaActivity_ViewBinding implements Unbinder {
    private DetailTundaActivity a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;

    public DetailTundaActivity_ViewBinding(final DetailTundaActivity detailTundaActivity, View view) {
        this.a = detailTundaActivity;
        detailTundaActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailTundaActivity.tvDescriptionKey = (TextView) Utils.findRequiredViewAsType(view, 2131298925, "field 'tvDescriptionKey'", TextView.class);
        detailTundaActivity.tvDescriptionValue = (TextView) Utils.findRequiredViewAsType(view, 2131298928, "field 'tvDescriptionValue'", TextView.class);
        detailTundaActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        detailTundaActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.j = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaActivity.showWebView(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297408, "field 'ivQRCode' and method 'zoomQRCode'");
        detailTundaActivity.ivQRCode = (ImageView) Utils.castView(findRequiredView2, 2131297408, "field 'ivQRCode'", ImageView.class);
        this.h = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaActivity.zoomQRCode();
            }
        });
        detailTundaActivity.llKcp = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297711, "field 'llKcp'", LinearLayout.class);
        detailTundaActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        detailTundaActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        detailTundaActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299557, "field 'tvWaktu'", TextView.class);
        detailTundaActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        detailTundaActivity.ivDetail = (ImageView) Utils.castView(findRequiredView3, 2131297355, "field 'ivDetail'", ImageView.class);
        this.g = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaActivity.showDetail();
            }
        });
        detailTundaActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296380, "field 'btnBatal' and method 'batal'");
        detailTundaActivity.btnBatal = (Button) Utils.castView(findRequiredView4, 2131296380, "field 'btnBatal'", Button.class);
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaActivity.batal(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296444, "field 'btnReservasi' and method 'clickedReservation'");
        detailTundaActivity.btnReservasi = (Button) Utils.castView(findRequiredView5, 2131296444, "field 'btnReservasi'", Button.class);
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaActivity.clickedReservation(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296443, "field 'btnReschedule' and method 'clickedReservation'");
        detailTundaActivity.btnReschedule = (Button) Utils.castView(findRequiredView6, 2131296443, "field 'btnReschedule'", Button.class);
        this.d = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaActivity.clickedReservation(view2);
            }
        });
        detailTundaActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailTundaActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.f = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaActivity.showDetail();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaActivity.showDetail();
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.e = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailTundaActivity.note = resources.getString(2131821357);
        detailTundaActivity.buktiPengisianForm = resources.getString(2131820609);
        detailTundaActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailTundaActivity detailTundaActivity = this.a;
        if (detailTundaActivity != null) {
            this.a = null;
            detailTundaActivity.tvNoReferensi = null;
            detailTundaActivity.tvDescriptionKey = null;
            detailTundaActivity.tvDescriptionValue = null;
            detailTundaActivity.llMain = null;
            detailTundaActivity.tvNote = null;
            detailTundaActivity.ivQRCode = null;
            detailTundaActivity.llKcp = null;
            detailTundaActivity.tvBranchName = null;
            detailTundaActivity.tvBranchAddress = null;
            detailTundaActivity.tvWaktu = null;
            detailTundaActivity.llDetail = null;
            detailTundaActivity.ivDetail = null;
            detailTundaActivity.tvErrorMessage = null;
            detailTundaActivity.btnBatal = null;
            detailTundaActivity.btnReservasi = null;
            detailTundaActivity.btnReschedule = null;
            detailTundaActivity.llRuangan = null;
            detailTundaActivity.tvJenisRuangan = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
