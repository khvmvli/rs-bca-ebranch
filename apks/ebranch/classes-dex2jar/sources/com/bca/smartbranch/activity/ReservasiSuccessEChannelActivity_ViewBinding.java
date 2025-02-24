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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiSuccessEChannelActivity_ViewBinding.class */
public class ReservasiSuccessEChannelActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private ReservasiSuccessEChannelActivity d;
    private View e;
    private View h;
    private View i;
    private View j;

    public ReservasiSuccessEChannelActivity_ViewBinding(final ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity, View view) {
        this.d = reservasiSuccessEChannelActivity;
        reservasiSuccessEChannelActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        reservasiSuccessEChannelActivity.tvDescriptionKey = (TextView) Utils.findRequiredViewAsType(view, 2131298925, "field 'tvDescriptionKey'", TextView.class);
        reservasiSuccessEChannelActivity.tvDescriptionValue = (TextView) Utils.findRequiredViewAsType(view, 2131298928, "field 'tvDescriptionValue'", TextView.class);
        reservasiSuccessEChannelActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        reservasiSuccessEChannelActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        reservasiSuccessEChannelActivity.tvReservasiDate = (TextView) Utils.findRequiredViewAsType(view, 2131299554, "field 'tvReservasiDate'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299502, "field 'tvNote' and method 'showWebView'");
        reservasiSuccessEChannelActivity.tvNote = (TextView) Utils.castView(findRequiredView, 2131299502, "field 'tvNote'", TextView.class);
        this.j = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessEChannelActivity.showWebView(view2);
            }
        });
        reservasiSuccessEChannelActivity.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        reservasiSuccessEChannelActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297409, "field 'ivQrCode' and method 'zoomQRCode'");
        reservasiSuccessEChannelActivity.ivQrCode = (ImageView) Utils.castView(findRequiredView2, 2131297409, "field 'ivQrCode'", ImageView.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessEChannelActivity.zoomQRCode();
            }
        });
        reservasiSuccessEChannelActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        reservasiSuccessEChannelActivity.ivDetail = (ImageView) Utils.castView(findRequiredView3, 2131297355, "field 'ivDetail'", ImageView.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessEChannelActivity.showDetail();
            }
        });
        reservasiSuccessEChannelActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296448, "method 'simpanGallery'");
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessEChannelActivity.simpanGallery(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessEChannelActivity.showDetail();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessEChannelActivity.showDetail();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296447, "method 'selesai'");
        this.a = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reservasiSuccessEChannelActivity.selesai(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        reservasiSuccessEChannelActivity.retry = resources.getString(2131822092);
        reservasiSuccessEChannelActivity.note = resources.getString(2131821358);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity = this.d;
        if (reservasiSuccessEChannelActivity != null) {
            this.d = null;
            reservasiSuccessEChannelActivity.tvNoReferensi = null;
            reservasiSuccessEChannelActivity.tvDescriptionKey = null;
            reservasiSuccessEChannelActivity.tvDescriptionValue = null;
            reservasiSuccessEChannelActivity.tvBranchName = null;
            reservasiSuccessEChannelActivity.tvBranchAddress = null;
            reservasiSuccessEChannelActivity.tvReservasiDate = null;
            reservasiSuccessEChannelActivity.tvNote = null;
            reservasiSuccessEChannelActivity.tvTitle = null;
            reservasiSuccessEChannelActivity.svMain = null;
            reservasiSuccessEChannelActivity.ivQrCode = null;
            reservasiSuccessEChannelActivity.llDetail = null;
            reservasiSuccessEChannelActivity.ivDetail = null;
            reservasiSuccessEChannelActivity.llMain = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
