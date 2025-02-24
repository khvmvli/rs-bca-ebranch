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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiROSuccessActivity_ViewBinding.class */
public class ReservasiROSuccessActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private ReservasiROSuccessActivity d;
    private View e;
    private View g;
    private View h;
    private View i;

    public ReservasiROSuccessActivity_ViewBinding(final ReservasiROSuccessActivity reservasiROSuccessActivity, View view) {
        this.d = reservasiROSuccessActivity;
        reservasiROSuccessActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        reservasiROSuccessActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        reservasiROSuccessActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        reservasiROSuccessActivity.tvBranchCityProvince = (TextView) Utils.findRequiredViewAsType(view, 2131298866, "field 'tvBranchCityProvince'", TextView.class);
        reservasiROSuccessActivity.tvBranchPhone = (TextView) Utils.findRequiredViewAsType(view, 2131298868, "field 'tvBranchPhone'", TextView.class);
        reservasiROSuccessActivity.tvReservasiDate = (TextView) Utils.findRequiredViewAsType(view, 2131299554, "field 'tvReservasiDate'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        reservasiROSuccessActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.g = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiROSuccessActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiROSuccessActivity.showWebView(view2);
            }
        });
        reservasiROSuccessActivity.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        reservasiROSuccessActivity.svMain = (getLifecycle) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", getLifecycle.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297409, "field 'ivQrCode' and method 'zoomQRCode'");
        reservasiROSuccessActivity.ivQrCode = (ImageView) Utils.castView(findRequiredView2, 2131297409, "field 'ivQrCode'", ImageView.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiROSuccessActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiROSuccessActivity.zoomQRCode();
            }
        });
        reservasiROSuccessActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        reservasiROSuccessActivity.ivDetail = (ImageView) Utils.castView(findRequiredView3, 2131297355, "field 'ivDetail'", ImageView.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiROSuccessActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiROSuccessActivity.showDetail();
            }
        });
        reservasiROSuccessActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        reservasiROSuccessActivity.rvTransaksi = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298336, "field 'rvTransaksi'", setOnStartEnterTransitionListener.class);
        reservasiROSuccessActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        reservasiROSuccessActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131299268, "field 'tvHeader' and method 'showDetail'");
        reservasiROSuccessActivity.tvHeader = (TextView) Utils.castView(findRequiredView4, 2131299268, "field 'tvHeader'", TextView.class);
        this.h = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiROSuccessActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiROSuccessActivity.showDetail();
            }
        });
        reservasiROSuccessActivity.tvMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299409, "field 'tvMessage'", TextView.class);
        reservasiROSuccessActivity.llPhoneWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297858, "field 'llPhoneWrapper'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296448, "method 'simpanGallery'");
        this.a = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiROSuccessActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiROSuccessActivity.simpanGallery(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiROSuccessActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiROSuccessActivity.showDetail();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296447, "method 'selesai'");
        this.c = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiROSuccessActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiROSuccessActivity.selesai(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        reservasiROSuccessActivity.retry = resources.getString(2131822092);
        reservasiROSuccessActivity.note = resources.getString(2131821358);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReservasiROSuccessActivity reservasiROSuccessActivity = this.d;
        if (reservasiROSuccessActivity != null) {
            this.d = null;
            reservasiROSuccessActivity.tvNoReferensi = null;
            reservasiROSuccessActivity.tvBranchName = null;
            reservasiROSuccessActivity.tvBranchAddress = null;
            reservasiROSuccessActivity.tvBranchCityProvince = null;
            reservasiROSuccessActivity.tvBranchPhone = null;
            reservasiROSuccessActivity.tvReservasiDate = null;
            reservasiROSuccessActivity.tvNote = null;
            reservasiROSuccessActivity.tvTitle = null;
            reservasiROSuccessActivity.svMain = null;
            reservasiROSuccessActivity.ivQrCode = null;
            reservasiROSuccessActivity.llDetail = null;
            reservasiROSuccessActivity.ivDetail = null;
            reservasiROSuccessActivity.llMain = null;
            reservasiROSuccessActivity.rvTransaksi = null;
            reservasiROSuccessActivity.llRuangan = null;
            reservasiROSuccessActivity.tvJenisRuangan = null;
            reservasiROSuccessActivity.tvHeader = null;
            reservasiROSuccessActivity.tvMessage = null;
            reservasiROSuccessActivity.llPhoneWrapper = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
