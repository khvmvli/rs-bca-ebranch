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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiTundaSuccessActivity_ViewBinding.class */
public class ReservasiTundaSuccessActivity_ViewBinding implements Unbinder {
    private View a;
    private ReservasiTundaSuccessActivity b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View h;
    private View j;

    public ReservasiTundaSuccessActivity_ViewBinding(final ReservasiTundaSuccessActivity reservasiTundaSuccessActivity, View view) {
        this.b = reservasiTundaSuccessActivity;
        reservasiTundaSuccessActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        reservasiTundaSuccessActivity.tvDescriptionKey = (TextView) Utils.findRequiredViewAsType(view, 2131298925, "field 'tvDescriptionKey'", TextView.class);
        reservasiTundaSuccessActivity.tvDescriptionValue = (TextView) Utils.findRequiredViewAsType(view, 2131298928, "field 'tvDescriptionValue'", TextView.class);
        reservasiTundaSuccessActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        reservasiTundaSuccessActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        reservasiTundaSuccessActivity.tvBranchCityProvince = (TextView) Utils.findRequiredViewAsType(view, 2131298866, "field 'tvBranchCityProvince'", TextView.class);
        reservasiTundaSuccessActivity.tvBranchPhone = (TextView) Utils.findRequiredViewAsType(view, 2131298868, "field 'tvBranchPhone'", TextView.class);
        reservasiTundaSuccessActivity.tvReservasiDate = (TextView) Utils.findRequiredViewAsType(view, 2131299554, "field 'tvReservasiDate'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        reservasiTundaSuccessActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.h = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTundaSuccessActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTundaSuccessActivity.showWebView(view2);
            }
        });
        reservasiTundaSuccessActivity.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        reservasiTundaSuccessActivity.svMain = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", getLifecycle.class);
        reservasiTundaSuccessActivity.tvMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299409, "field 'tvMessage'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297409, "field 'ivQrCode' and method 'zoomQRCode'");
        reservasiTundaSuccessActivity.ivQrCode = (ImageView) Utils.castView(findRequiredView2, 2131297409, "field 'ivQrCode'", ImageView.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTundaSuccessActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTundaSuccessActivity.zoomQRCode();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131299268, "field 'tvHeaderTransaksi' and method 'showDetail'");
        reservasiTundaSuccessActivity.tvHeaderTransaksi = (TextView) Utils.castView(findRequiredView3, 2131299268, "field 'tvHeaderTransaksi'", TextView.class);
        this.f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTundaSuccessActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTundaSuccessActivity.showDetail();
            }
        });
        reservasiTundaSuccessActivity.llDetailTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297625, "field 'llDetailTransaksi'", LinearLayout.class);
        reservasiTundaSuccessActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        reservasiTundaSuccessActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        reservasiTundaSuccessActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        reservasiTundaSuccessActivity.ivDetail = (ImageView) Utils.castView(findRequiredView4, 2131297355, "field 'ivDetail'", ImageView.class);
        this.d = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTundaSuccessActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTundaSuccessActivity.showDetail();
            }
        });
        reservasiTundaSuccessActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        reservasiTundaSuccessActivity.rvTransaksi = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298336, "field 'rvTransaksi'", setOnStartEnterTransitionListener.class);
        reservasiTundaSuccessActivity.llPhoneWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297858, "field 'llPhoneWrapper'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296448, "method 'simpanGallery'");
        this.e = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTundaSuccessActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTundaSuccessActivity.simpanGallery(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.j = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTundaSuccessActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTundaSuccessActivity.showDetail();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296447, "method 'selesai'");
        this.a = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiTundaSuccessActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiTundaSuccessActivity.selesai(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        reservasiTundaSuccessActivity.retry = resources.getString(2131822092);
        reservasiTundaSuccessActivity.note = resources.getString(2131821358);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReservasiTundaSuccessActivity reservasiTundaSuccessActivity = this.b;
        if (reservasiTundaSuccessActivity != null) {
            this.b = null;
            reservasiTundaSuccessActivity.tvNoReferensi = null;
            reservasiTundaSuccessActivity.tvDescriptionKey = null;
            reservasiTundaSuccessActivity.tvDescriptionValue = null;
            reservasiTundaSuccessActivity.tvBranchName = null;
            reservasiTundaSuccessActivity.tvBranchAddress = null;
            reservasiTundaSuccessActivity.tvBranchCityProvince = null;
            reservasiTundaSuccessActivity.tvBranchPhone = null;
            reservasiTundaSuccessActivity.tvReservasiDate = null;
            reservasiTundaSuccessActivity.tvNote = null;
            reservasiTundaSuccessActivity.tvTitle = null;
            reservasiTundaSuccessActivity.svMain = null;
            reservasiTundaSuccessActivity.tvMessage = null;
            reservasiTundaSuccessActivity.ivQrCode = null;
            reservasiTundaSuccessActivity.tvHeaderTransaksi = null;
            reservasiTundaSuccessActivity.llDetailTransaksi = null;
            reservasiTundaSuccessActivity.llRuangan = null;
            reservasiTundaSuccessActivity.tvJenisRuangan = null;
            reservasiTundaSuccessActivity.llDetail = null;
            reservasiTundaSuccessActivity.ivDetail = null;
            reservasiTundaSuccessActivity.llMain = null;
            reservasiTundaSuccessActivity.rvTransaksi = null;
            reservasiTundaSuccessActivity.llPhoneWrapper = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
