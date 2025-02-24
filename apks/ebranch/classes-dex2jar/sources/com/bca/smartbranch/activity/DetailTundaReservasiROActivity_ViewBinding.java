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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailTundaReservasiROActivity_ViewBinding.class */
public class DetailTundaReservasiROActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private DetailTundaReservasiROActivity d;
    private View e;
    private View f;
    private View h;
    private View j;

    public DetailTundaReservasiROActivity_ViewBinding(final DetailTundaReservasiROActivity detailTundaReservasiROActivity, View view) {
        this.d = detailTundaReservasiROActivity;
        detailTundaReservasiROActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299268, "field 'tvHeader' and method 'showDetail'");
        detailTundaReservasiROActivity.tvHeader = (TextView) Utils.castView(findRequiredView, 2131299268, "field 'tvHeader'", TextView.class);
        this.j = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaReservasiROActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaReservasiROActivity.showDetail();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'onClickNote'");
        detailTundaReservasiROActivity.tvNote = (TextView) Utils.castView(findRequiredView2, 2131299502, "field 'tvNote'", TextView.class);
        this.f = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaReservasiROActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaReservasiROActivity.onClickNote(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297408, "field 'ivQRCode' and method 'zoomQRCode'");
        detailTundaReservasiROActivity.ivQRCode = (ImageView) Utils.castView(findRequiredView3, 2131297408, "field 'ivQRCode'", ImageView.class);
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaReservasiROActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaReservasiROActivity.zoomQRCode();
            }
        });
        detailTundaReservasiROActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        detailTundaReservasiROActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        detailTundaReservasiROActivity.tvDate = (TextView) Utils.findRequiredViewAsType(view, 2131298914, "field 'tvDate'", TextView.class);
        detailTundaReservasiROActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        detailTundaReservasiROActivity.ivDetail = (ImageView) Utils.castView(findRequiredView4, 2131297355, "field 'ivDetail'", ImageView.class);
        this.a = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaReservasiROActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaReservasiROActivity.showDetail();
            }
        });
        detailTundaReservasiROActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailTundaReservasiROActivity.rvListTransaksi = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298329, "field 'rvListTransaksi'", setOnStartEnterTransitionListener.class);
        detailTundaReservasiROActivity.tvNoReff = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReff'", TextView.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296443, "field 'btnReschedule' and method 'clickedReservation'");
        detailTundaReservasiROActivity.btnReschedule = (Button) Utils.castView(findRequiredView5, 2131296443, "field 'btnReschedule'", Button.class);
        this.e = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaReservasiROActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaReservasiROActivity.clickedReservation(view2);
            }
        });
        detailTundaReservasiROActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailTundaReservasiROActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131296380, "method 'batal'");
        this.c = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaReservasiROActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaReservasiROActivity.batal();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailTundaReservasiROActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailTundaReservasiROActivity.showDetail();
            }
        });
        Resources resources = view.getContext().getResources();
        detailTundaReservasiROActivity.tarikanTunai = resources.getString(2131822499);
        detailTundaReservasiROActivity.tarikanCek = resources.getString(2131822498);
        detailTundaReservasiROActivity.note = resources.getString(2131821357);
        detailTundaReservasiROActivity.buktiPengisianForm = resources.getString(2131820609);
        detailTundaReservasiROActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailTundaReservasiROActivity detailTundaReservasiROActivity = this.d;
        if (detailTundaReservasiROActivity != null) {
            this.d = null;
            detailTundaReservasiROActivity.llMain = null;
            detailTundaReservasiROActivity.tvHeader = null;
            detailTundaReservasiROActivity.tvNote = null;
            detailTundaReservasiROActivity.ivQRCode = null;
            detailTundaReservasiROActivity.tvBranchName = null;
            detailTundaReservasiROActivity.tvBranchAddress = null;
            detailTundaReservasiROActivity.tvDate = null;
            detailTundaReservasiROActivity.llDetail = null;
            detailTundaReservasiROActivity.ivDetail = null;
            detailTundaReservasiROActivity.tvErrorMessage = null;
            detailTundaReservasiROActivity.rvListTransaksi = null;
            detailTundaReservasiROActivity.tvNoReff = null;
            detailTundaReservasiROActivity.btnReschedule = null;
            detailTundaReservasiROActivity.llRuangan = null;
            detailTundaReservasiROActivity.tvJenisRuangan = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.h.setOnClickListener(null);
            this.h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
