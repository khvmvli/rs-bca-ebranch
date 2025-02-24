package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BN7PengambilanNotificationActivity_ViewBinding.class */
public class BN7PengambilanNotificationActivity_ViewBinding implements Unbinder {
    private BN7PengambilanNotificationActivity a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View g;
    private View i;
    private View j;

    public BN7PengambilanNotificationActivity_ViewBinding(final BN7PengambilanNotificationActivity bN7PengambilanNotificationActivity, View view) {
        this.a = bN7PengambilanNotificationActivity;
        bN7PengambilanNotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        bN7PengambilanNotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        bN7PengambilanNotificationActivity.llDetail = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        bN7PengambilanNotificationActivity.ivDetail = (ImageView) Utils.castView(findRequiredView, 2131297355, "field 'ivDetail'", ImageView.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanNotificationActivity.showDetail();
            }
        });
        bN7PengambilanNotificationActivity.tvNamaPengambil = (TextView) Utils.findRequiredViewAsType(view, 2131299433, "field 'tvNamaPengambil'", TextView.class);
        bN7PengambilanNotificationActivity.tvIdPengambil = (TextView) Utils.findRequiredViewAsType(view, 2131299275, "field 'tvIdPengambil'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131299700, "field 'tvUbahData' and method 'ubahData'");
        bN7PengambilanNotificationActivity.tvUbahData = (TextView) Utils.castView(findRequiredView2, 2131299700, "field 'tvUbahData'", TextView.class);
        this.g = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanNotificationActivity.ubahData();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297408, "field 'ivQRCode' and method 'zoomQRCode'");
        bN7PengambilanNotificationActivity.ivQRCode = (ImageView) Utils.castView(findRequiredView3, 2131297408, "field 'ivQRCode'", ImageView.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanNotificationActivity.zoomQRCode();
            }
        });
        bN7PengambilanNotificationActivity.tvNoRef = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoRef'", TextView.class);
        bN7PengambilanNotificationActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvCabang'", TextView.class);
        bN7PengambilanNotificationActivity.tvALamat = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvALamat'", TextView.class);
        bN7PengambilanNotificationActivity.tvJumlahPembelian = (TextView) Utils.findRequiredViewAsType(view, 2131299327, "field 'tvJumlahPembelian'", TextView.class);
        bN7PengambilanNotificationActivity.tvTotalPembayaran = (TextView) Utils.findRequiredViewAsType(view, 2131299684, "field 'tvTotalPembayaran'", TextView.class);
        bN7PengambilanNotificationActivity.tvBatasWaktuPengambilan = (TextView) Utils.findRequiredViewAsType(view, 2131298843, "field 'tvBatasWaktuPengambilan'", TextView.class);
        bN7PengambilanNotificationActivity.tvNote = (TextView) Utils.findRequiredViewAsType(view, 2131299502, "field 'tvNote'", TextView.class);
        bN7PengambilanNotificationActivity.tvDenom = (TextView) Utils.findRequiredViewAsType(view, 2131298917, "field 'tvDenom'", TextView.class);
        bN7PengambilanNotificationActivity.tvKodeOtorisasi = (TextView) Utils.findRequiredViewAsType(view, 2131299364, "field 'tvKodeOtorisasi'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296448, "method 'share'");
        this.d = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanNotificationActivity.share();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296447, "method 'selesai'");
        this.e = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanNotificationActivity.selesai();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.j = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanNotificationActivity.showDetail();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanNotificationActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanNotificationActivity.showDetail();
            }
        });
        bN7PengambilanNotificationActivity.listJenisID = view.getContext().getResources().getStringArray(2130903064);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN7PengambilanNotificationActivity bN7PengambilanNotificationActivity = this.a;
        if (bN7PengambilanNotificationActivity != null) {
            this.a = null;
            bN7PengambilanNotificationActivity.llMain = null;
            bN7PengambilanNotificationActivity.tvErrorMessage = null;
            bN7PengambilanNotificationActivity.llDetail = null;
            bN7PengambilanNotificationActivity.ivDetail = null;
            bN7PengambilanNotificationActivity.tvNamaPengambil = null;
            bN7PengambilanNotificationActivity.tvIdPengambil = null;
            bN7PengambilanNotificationActivity.tvUbahData = null;
            bN7PengambilanNotificationActivity.ivQRCode = null;
            bN7PengambilanNotificationActivity.tvNoRef = null;
            bN7PengambilanNotificationActivity.tvCabang = null;
            bN7PengambilanNotificationActivity.tvALamat = null;
            bN7PengambilanNotificationActivity.tvJumlahPembelian = null;
            bN7PengambilanNotificationActivity.tvTotalPembayaran = null;
            bN7PengambilanNotificationActivity.tvBatasWaktuPengambilan = null;
            bN7PengambilanNotificationActivity.tvNote = null;
            bN7PengambilanNotificationActivity.tvDenom = null;
            bN7PengambilanNotificationActivity.tvKodeOtorisasi = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.i.setOnClickListener(null);
            this.i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
