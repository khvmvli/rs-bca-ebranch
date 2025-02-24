package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BN7PengambilanActivity_ViewBinding.class */
public class BN7PengambilanActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private BN7PengambilanActivity e;
    private View f;
    private View g;
    private View h;
    private View i;

    public BN7PengambilanActivity_ViewBinding(final BN7PengambilanActivity bN7PengambilanActivity, View view) {
        this.e = bN7PengambilanActivity;
        bN7PengambilanActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        bN7PengambilanActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        bN7PengambilanActivity.llDetail = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297355, "field 'ivDetail' and method 'showDetail'");
        bN7PengambilanActivity.ivDetail = (ImageView) Utils.castView(findRequiredView, 2131297355, "field 'ivDetail'", ImageView.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanActivity.showDetail();
            }
        });
        bN7PengambilanActivity.tvNamaPengambil = (TextView) Utils.findRequiredViewAsType(view, 2131299433, "field 'tvNamaPengambil'", TextView.class);
        bN7PengambilanActivity.tvIdPengambil = (TextView) Utils.findRequiredViewAsType(view, 2131299275, "field 'tvIdPengambil'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131299700, "field 'tvUbahData' and method 'ubahData'");
        bN7PengambilanActivity.tvUbahData = (TextView) Utils.castView(findRequiredView2, 2131299700, "field 'tvUbahData'", TextView.class);
        this.f = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanActivity.ubahData();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297408, "field 'ivQRCode' and method 'zoomQRCode'");
        bN7PengambilanActivity.ivQRCode = (ImageView) Utils.castView(findRequiredView3, 2131297408, "field 'ivQRCode'", ImageView.class);
        this.h = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanActivity.zoomQRCode();
            }
        });
        bN7PengambilanActivity.tvNoRef = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoRef'", TextView.class);
        bN7PengambilanActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvCabang'", TextView.class);
        bN7PengambilanActivity.tvALamat = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvALamat'", TextView.class);
        bN7PengambilanActivity.tvJumlahPembelian = (TextView) Utils.findRequiredViewAsType(view, 2131299327, "field 'tvJumlahPembelian'", TextView.class);
        bN7PengambilanActivity.tvTotalPembayaran = (TextView) Utils.findRequiredViewAsType(view, 2131299684, "field 'tvTotalPembayaran'", TextView.class);
        bN7PengambilanActivity.tvBatasWaktuPengambilan = (TextView) Utils.findRequiredViewAsType(view, 2131298843, "field 'tvBatasWaktuPengambilan'", TextView.class);
        bN7PengambilanActivity.tvNote = (TextView) Utils.findRequiredViewAsType(view, 2131299502, "field 'tvNote'", TextView.class);
        bN7PengambilanActivity.tvDenom = (TextView) Utils.findRequiredViewAsType(view, 2131298917, "field 'tvDenom'", TextView.class);
        bN7PengambilanActivity.tvKodeOtorisasi = (TextView) Utils.findRequiredViewAsType(view, 2131299364, "field 'tvKodeOtorisasi'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296448, "method 'share'");
        this.d = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanActivity.share();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296447, "method 'selesai'");
        this.a = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanActivity.selesai();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297650, "method 'showDetail'");
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanActivity.showDetail();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131299268, "method 'showDetail'");
        this.g = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanActivity.showDetail();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.c = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN7PengambilanActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN7PengambilanActivity.retry(view2);
            }
        });
        bN7PengambilanActivity.listJenisID = view.getContext().getResources().getStringArray(2130903064);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN7PengambilanActivity bN7PengambilanActivity = this.e;
        if (bN7PengambilanActivity != null) {
            this.e = null;
            bN7PengambilanActivity.llMain = null;
            bN7PengambilanActivity.tvErrorMessage = null;
            bN7PengambilanActivity.llDetail = null;
            bN7PengambilanActivity.ivDetail = null;
            bN7PengambilanActivity.tvNamaPengambil = null;
            bN7PengambilanActivity.tvIdPengambil = null;
            bN7PengambilanActivity.tvUbahData = null;
            bN7PengambilanActivity.ivQRCode = null;
            bN7PengambilanActivity.tvNoRef = null;
            bN7PengambilanActivity.tvCabang = null;
            bN7PengambilanActivity.tvALamat = null;
            bN7PengambilanActivity.tvJumlahPembelian = null;
            bN7PengambilanActivity.tvTotalPembayaran = null;
            bN7PengambilanActivity.tvBatasWaktuPengambilan = null;
            bN7PengambilanActivity.tvNote = null;
            bN7PengambilanActivity.tvDenom = null;
            bN7PengambilanActivity.tvKodeOtorisasi = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
