package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiSuccessActivity_ViewBinding.class */
public class ReservasiSuccessActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private ReservasiSuccessActivity d;
    private View e;
    private View g;
    private View h;
    private View j;

    public ReservasiSuccessActivity_ViewBinding(final ReservasiSuccessActivity reservasiSuccessActivity, View view) {
        this.d = reservasiSuccessActivity;
        reservasiSuccessActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        reservasiSuccessActivity.tvDescriptionKey = (TextView) Utils.findRequiredViewAsType(view, 2131298925, "field 'tvDescriptionKey'", TextView.class);
        reservasiSuccessActivity.tvDescriptionValue = (TextView) Utils.findRequiredViewAsType(view, 2131298928, "field 'tvDescriptionValue'", TextView.class);
        reservasiSuccessActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        reservasiSuccessActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        reservasiSuccessActivity.tvReservasiDate = (TextView) Utils.findRequiredViewAsType(view, 2131299554, "field 'tvReservasiDate'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        reservasiSuccessActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.j = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessActivity.showWebView(view2);
            }
        });
        reservasiSuccessActivity.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        reservasiSuccessActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297409, "field 'ivQrCode' and method 'zoomQRCode'");
        reservasiSuccessActivity.ivQrCode = (ImageView) Utils.castView(findRequiredView2, 2131297409, "field 'ivQrCode'", ImageView.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessActivity.zoomQRCode();
            }
        });
        reservasiSuccessActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        reservasiSuccessActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        reservasiSuccessActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        reservasiSuccessActivity.ivDetail = (ImageView) Utils.castView(findRequiredView3, 2131297355, "field 'ivDetail'", ImageView.class);
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessActivity.showDetail();
            }
        });
        reservasiSuccessActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296448, "method 'simpanGallery'");
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessActivity.simpanGallery(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessActivity.showDetail();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessActivity.showDetail();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296447, "method 'selesai'");
        this.a = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessActivity.selesai(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        reservasiSuccessActivity.retry = resources.getString(2131822092);
        reservasiSuccessActivity.note = resources.getString(2131821358);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReservasiSuccessActivity reservasiSuccessActivity = this.d;
        if (reservasiSuccessActivity != null) {
            this.d = null;
            reservasiSuccessActivity.tvNoReferensi = null;
            reservasiSuccessActivity.tvDescriptionKey = null;
            reservasiSuccessActivity.tvDescriptionValue = null;
            reservasiSuccessActivity.tvBranchName = null;
            reservasiSuccessActivity.tvBranchAddress = null;
            reservasiSuccessActivity.tvReservasiDate = null;
            reservasiSuccessActivity.tvNote = null;
            reservasiSuccessActivity.tvTitle = null;
            reservasiSuccessActivity.svMain = null;
            reservasiSuccessActivity.ivQrCode = null;
            reservasiSuccessActivity.llRuangan = null;
            reservasiSuccessActivity.tvJenisRuangan = null;
            reservasiSuccessActivity.llDetail = null;
            reservasiSuccessActivity.ivDetail = null;
            reservasiSuccessActivity.llMain = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
