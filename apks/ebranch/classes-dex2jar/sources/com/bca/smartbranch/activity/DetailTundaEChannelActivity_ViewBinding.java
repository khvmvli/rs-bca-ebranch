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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaEChannelActivity_ViewBinding.class */
public class DetailTundaEChannelActivity_ViewBinding implements Unbinder {
    private DetailTundaEChannelActivity a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;

    public DetailTundaEChannelActivity_ViewBinding(final DetailTundaEChannelActivity detailTundaEChannelActivity, View view) {
        this.a = detailTundaEChannelActivity;
        detailTundaEChannelActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailTundaEChannelActivity.tvDescriptionKey = (TextView) Utils.findRequiredViewAsType(view, 2131298925, "field 'tvDescriptionKey'", TextView.class);
        detailTundaEChannelActivity.tvDescriptionValue = (TextView) Utils.findRequiredViewAsType(view, 2131298928, "field 'tvDescriptionValue'", TextView.class);
        detailTundaEChannelActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        detailTundaEChannelActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.f = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelActivity.showWebView(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297408, "field 'ivQRCode' and method 'zoomQRCode'");
        detailTundaEChannelActivity.ivQRCode = (ImageView) Utils.castView(findRequiredView2, 2131297408, "field 'ivQRCode'", ImageView.class);
        this.g = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelActivity.zoomQRCode();
            }
        });
        detailTundaEChannelActivity.llKcp = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297711, "field 'llKcp'", LinearLayout.class);
        detailTundaEChannelActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        detailTundaEChannelActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        detailTundaEChannelActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299557, "field 'tvWaktu'", TextView.class);
        detailTundaEChannelActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        detailTundaEChannelActivity.ivDetail = (ImageView) Utils.castView(findRequiredView3, 2131297355, "field 'ivDetail'", ImageView.class);
        this.j = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelActivity.showDetail();
            }
        });
        detailTundaEChannelActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296380, "field 'btnBatal' and method 'batal'");
        detailTundaEChannelActivity.btnBatal = (Button) Utils.castView(findRequiredView4, 2131296380, "field 'btnBatal'", Button.class);
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelActivity.batal(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296444, "field 'btnReservasi' and method 'clickedReservation'");
        detailTundaEChannelActivity.btnReservasi = (Button) Utils.castView(findRequiredView5, 2131296444, "field 'btnReservasi'", Button.class);
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelActivity.clickedReservation(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296443, "field 'btnReschedule' and method 'clickedReservation'");
        detailTundaEChannelActivity.btnReschedule = (Button) Utils.castView(findRequiredView6, 2131296443, "field 'btnReschedule'", Button.class);
        this.e = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelActivity.clickedReservation(view2);
            }
        });
        detailTundaEChannelActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailTundaEChannelActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelActivity.showDetail();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.h = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelActivity.showDetail();
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.d = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaEChannelActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaEChannelActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailTundaEChannelActivity.note = resources.getString(2131821357);
        detailTundaEChannelActivity.buktiPengisianForm = resources.getString(2131820609);
        detailTundaEChannelActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailTundaEChannelActivity detailTundaEChannelActivity = this.a;
        if (detailTundaEChannelActivity != null) {
            this.a = null;
            detailTundaEChannelActivity.tvNoReferensi = null;
            detailTundaEChannelActivity.tvDescriptionKey = null;
            detailTundaEChannelActivity.tvDescriptionValue = null;
            detailTundaEChannelActivity.llMain = null;
            detailTundaEChannelActivity.tvNote = null;
            detailTundaEChannelActivity.ivQRCode = null;
            detailTundaEChannelActivity.llKcp = null;
            detailTundaEChannelActivity.tvBranchName = null;
            detailTundaEChannelActivity.tvBranchAddress = null;
            detailTundaEChannelActivity.tvWaktu = null;
            detailTundaEChannelActivity.llDetail = null;
            detailTundaEChannelActivity.ivDetail = null;
            detailTundaEChannelActivity.tvErrorMessage = null;
            detailTundaEChannelActivity.btnBatal = null;
            detailTundaEChannelActivity.btnReservasi = null;
            detailTundaEChannelActivity.btnReschedule = null;
            detailTundaEChannelActivity.llRuangan = null;
            detailTundaEChannelActivity.tvJenisRuangan = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
