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
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaTellerActivity_ViewBinding.class */
public class DetailTundaTellerActivity_ViewBinding implements Unbinder {
    private View a;
    private DetailTundaTellerActivity b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;

    public DetailTundaTellerActivity_ViewBinding(final DetailTundaTellerActivity detailTundaTellerActivity, View view) {
        this.b = detailTundaTellerActivity;
        detailTundaTellerActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'onClickNote'");
        detailTundaTellerActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.j = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaTellerActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaTellerActivity.onClickNote(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297408, "field 'ivQRCode' and method 'zoomQRCode'");
        detailTundaTellerActivity.ivQRCode = (ImageView) Utils.castView(findRequiredView2, 2131297408, "field 'ivQRCode'", ImageView.class);
        this.f = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaTellerActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaTellerActivity.zoomQRCode();
            }
        });
        detailTundaTellerActivity.llKcp = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297711, "field 'llKcp'", LinearLayout.class);
        detailTundaTellerActivity.vwSeparator = Utils.findRequiredView(view, 2131299803, "field 'vwSeparator'");
        detailTundaTellerActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        detailTundaTellerActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        detailTundaTellerActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299554, "field 'tvWaktu'", TextView.class);
        detailTundaTellerActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        detailTundaTellerActivity.ivDetail = (ImageView) Utils.castView(findRequiredView3, 2131297355, "field 'ivDetail'", ImageView.class);
        this.h = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaTellerActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaTellerActivity.showDetail();
            }
        });
        detailTundaTellerActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailTundaTellerActivity.rvListTransaksi = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298329, "field 'rvListTransaksi'", setOnStartEnterTransitionListener.class);
        detailTundaTellerActivity.tvNoReff = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReff'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296444, "field 'btnReservasi' and method 'clickedReservation'");
        detailTundaTellerActivity.btnReservasi = (Button) Utils.castView(findRequiredView4, 2131296444, "field 'btnReservasi'", Button.class);
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaTellerActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaTellerActivity.clickedReservation(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296443, "field 'btnReschedule' and method 'clickedReservation'");
        detailTundaTellerActivity.btnReschedule = (Button) Utils.castView(findRequiredView5, 2131296443, "field 'btnReschedule'", Button.class);
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaTellerActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaTellerActivity.clickedReservation(view2);
            }
        });
        detailTundaTellerActivity.tvMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299409, "field 'tvMessage'", TextView.class);
        detailTundaTellerActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailTundaTellerActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.d = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaTellerActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaTellerActivity.retry(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296380, "method 'batal'");
        this.a = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaTellerActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaTellerActivity.batal();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaTellerActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaTellerActivity.showDetail();
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.g = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaTellerActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaTellerActivity.showDetail();
            }
        });
        Resources resources = view.getContext().getResources();
        detailTundaTellerActivity.tarikanTunai = resources.getString(2131822499);
        detailTundaTellerActivity.tarikanCek = resources.getString(2131822498);
        detailTundaTellerActivity.note = resources.getString(2131821357);
        detailTundaTellerActivity.buktiPengisianForm = resources.getString(2131820609);
        detailTundaTellerActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailTundaTellerActivity detailTundaTellerActivity = this.b;
        if (detailTundaTellerActivity != null) {
            this.b = null;
            detailTundaTellerActivity.llMain = null;
            detailTundaTellerActivity.tvNote = null;
            detailTundaTellerActivity.ivQRCode = null;
            detailTundaTellerActivity.llKcp = null;
            detailTundaTellerActivity.vwSeparator = null;
            detailTundaTellerActivity.tvBranchName = null;
            detailTundaTellerActivity.tvBranchAddress = null;
            detailTundaTellerActivity.tvWaktu = null;
            detailTundaTellerActivity.llDetail = null;
            detailTundaTellerActivity.ivDetail = null;
            detailTundaTellerActivity.tvErrorMessage = null;
            detailTundaTellerActivity.rvListTransaksi = null;
            detailTundaTellerActivity.tvNoReff = null;
            detailTundaTellerActivity.btnReservasi = null;
            detailTundaTellerActivity.btnReschedule = null;
            detailTundaTellerActivity.tvMessage = null;
            detailTundaTellerActivity.llRuangan = null;
            detailTundaTellerActivity.tvJenisRuangan = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
