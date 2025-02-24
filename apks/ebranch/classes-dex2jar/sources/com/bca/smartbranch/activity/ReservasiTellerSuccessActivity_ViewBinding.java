package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.getLifecycle;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiTellerSuccessActivity_ViewBinding.class */
public class ReservasiTellerSuccessActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private ReservasiTellerSuccessActivity c;
    private View d;
    private View e;
    private View f;
    private View i;
    private View j;

    public ReservasiTellerSuccessActivity_ViewBinding(final ReservasiTellerSuccessActivity reservasiTellerSuccessActivity, View view) {
        this.c = reservasiTellerSuccessActivity;
        reservasiTellerSuccessActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        reservasiTellerSuccessActivity.tvDescriptionKey = (TextView) Utils.findRequiredViewAsType(view, 2131298925, "field 'tvDescriptionKey'", TextView.class);
        reservasiTellerSuccessActivity.tvDescriptionValue = (TextView) Utils.findRequiredViewAsType(view, 2131298928, "field 'tvDescriptionValue'", TextView.class);
        reservasiTellerSuccessActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        reservasiTellerSuccessActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        reservasiTellerSuccessActivity.tvBranchTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298869, "field 'tvBranchTitle'", TextView.class);
        reservasiTellerSuccessActivity.tvBranchCityProvince = (TextView) Utils.findRequiredViewAsType(view, 2131298866, "field 'tvBranchCityProvince'", TextView.class);
        reservasiTellerSuccessActivity.tvBranchPhone = (TextView) Utils.findRequiredViewAsType(view, 2131298868, "field 'tvBranchPhone'", TextView.class);
        reservasiTellerSuccessActivity.tvReservasiDate = (TextView) Utils.findRequiredViewAsType(view, 2131299554, "field 'tvReservasiDate'", TextView.class);
        reservasiTellerSuccessActivity.tvReservasiTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299559, "field 'tvReservasiTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        reservasiTellerSuccessActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.j = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTellerSuccessActivity.showWebView(view2);
            }
        });
        reservasiTellerSuccessActivity.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        reservasiTellerSuccessActivity.svMain = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", getLifecycle.class);
        reservasiTellerSuccessActivity.tvMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299409, "field 'tvMessage'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297409, "field 'ivQrCode' and method 'zoomQRCode'");
        reservasiTellerSuccessActivity.ivQrCode = (ImageView) Utils.castView(findRequiredView2, 2131297409, "field 'ivQrCode'", ImageView.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTellerSuccessActivity.zoomQRCode();
            }
        });
        reservasiTellerSuccessActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        reservasiTellerSuccessActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        reservasiTellerSuccessActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        reservasiTellerSuccessActivity.ivDetail = (ImageView) Utils.castView(findRequiredView3, 2131297355, "field 'ivDetail'", ImageView.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTellerSuccessActivity.showDetail();
            }
        });
        reservasiTellerSuccessActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        reservasiTellerSuccessActivity.rvTransaksi = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298336, "field 'rvTransaksi'", setOnStartEnterTransitionListener.class);
        reservasiTellerSuccessActivity.llPhoneWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297858, "field 'llPhoneWrapper'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296448, "method 'simpanGallery'");
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTellerSuccessActivity.simpanGallery(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTellerSuccessActivity.showDetail();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTellerSuccessActivity.showDetail();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296447, "method 'selesai'");
        this.d = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTellerSuccessActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTellerSuccessActivity.selesai(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        reservasiTellerSuccessActivity.retry = resources.getString(2131822092);
        reservasiTellerSuccessActivity.note = resources.getString(2131821358);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReservasiTellerSuccessActivity reservasiTellerSuccessActivity = this.c;
        if (reservasiTellerSuccessActivity != null) {
            this.c = null;
            reservasiTellerSuccessActivity.tvNoReferensi = null;
            reservasiTellerSuccessActivity.tvDescriptionKey = null;
            reservasiTellerSuccessActivity.tvDescriptionValue = null;
            reservasiTellerSuccessActivity.tvBranchName = null;
            reservasiTellerSuccessActivity.tvBranchAddress = null;
            reservasiTellerSuccessActivity.tvBranchTitle = null;
            reservasiTellerSuccessActivity.tvBranchCityProvince = null;
            reservasiTellerSuccessActivity.tvBranchPhone = null;
            reservasiTellerSuccessActivity.tvReservasiDate = null;
            reservasiTellerSuccessActivity.tvReservasiTitle = null;
            reservasiTellerSuccessActivity.tvNote = null;
            reservasiTellerSuccessActivity.tvTitle = null;
            reservasiTellerSuccessActivity.svMain = null;
            reservasiTellerSuccessActivity.tvMessage = null;
            reservasiTellerSuccessActivity.ivQrCode = null;
            reservasiTellerSuccessActivity.llRuangan = null;
            reservasiTellerSuccessActivity.tvJenisRuangan = null;
            reservasiTellerSuccessActivity.llDetail = null;
            reservasiTellerSuccessActivity.ivDetail = null;
            reservasiTellerSuccessActivity.llMain = null;
            reservasiTellerSuccessActivity.rvTransaksi = null;
            reservasiTellerSuccessActivity.llPhoneWrapper = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
