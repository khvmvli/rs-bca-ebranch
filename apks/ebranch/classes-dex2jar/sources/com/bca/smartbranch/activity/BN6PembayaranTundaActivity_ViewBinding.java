package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BN6PembayaranTundaActivity_ViewBinding.class */
public class BN6PembayaranTundaActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private BN6PembayaranTundaActivity d;
    private View e;
    private View f;
    private View g;
    private View i;

    public BN6PembayaranTundaActivity_ViewBinding(final BN6PembayaranTundaActivity bN6PembayaranTundaActivity, View view) {
        this.d = bN6PembayaranTundaActivity;
        bN6PembayaranTundaActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        bN6PembayaranTundaActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        bN6PembayaranTundaActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        bN6PembayaranTundaActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        bN6PembayaranTundaActivity.tvVAAccount = (TextView) Utils.findRequiredViewAsType(view, 2131299731, "field 'tvVAAccount'", TextView.class);
        bN6PembayaranTundaActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        bN6PembayaranTundaActivity.tvDariRekening = (TextView) Utils.findRequiredViewAsType(view, 2131298889, "field 'tvDariRekening'", TextView.class);
        bN6PembayaranTundaActivity.tvJumlahPembelian = (TextView) Utils.findRequiredViewAsType(view, 2131299327, "field 'tvJumlahPembelian'", TextView.class);
        bN6PembayaranTundaActivity.tvKursTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299387, "field 'tvKursTitle'", TextView.class);
        bN6PembayaranTundaActivity.tvKurs = (TextView) Utils.findRequiredViewAsType(view, 2131299385, "field 'tvKurs'", TextView.class);
        bN6PembayaranTundaActivity.tvTotalPembayaran = (TextView) Utils.findRequiredViewAsType(view, 2131299684, "field 'tvTotalPembayaran'", TextView.class);
        bN6PembayaranTundaActivity.tvMenit1 = (TextView) Utils.findRequiredViewAsType(view, 2131299406, "field 'tvMenit1'", TextView.class);
        bN6PembayaranTundaActivity.tvMenit2 = (TextView) Utils.findRequiredViewAsType(view, 2131299407, "field 'tvMenit2'", TextView.class);
        bN6PembayaranTundaActivity.tvDetik1 = (TextView) Utils.findRequiredViewAsType(view, 2131298935, "field 'tvDetik1'", TextView.class);
        bN6PembayaranTundaActivity.tvDetik2 = (TextView) Utils.findRequiredViewAsType(view, 2131298936, "field 'tvDetik2'", TextView.class);
        bN6PembayaranTundaActivity.llHeaderRincianPembelian = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297676, "field 'llHeaderRincianPembelian'", LinearLayout.class);
        bN6PembayaranTundaActivity.llLayoutRincianPembelian = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297499, "field 'llLayoutRincianPembelian'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297415, "field 'ivRincianPembelian' and method 'showDetailPembayaran'");
        bN6PembayaranTundaActivity.ivRincianPembelian = (ImageView) Utils.castView(findRequiredView, 2131297415, "field 'ivRincianPembelian'", ImageView.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranTundaActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranTundaActivity.showDetailPembayaran(view2);
            }
        });
        bN6PembayaranTundaActivity.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299400, "field 'tvMataUang'", TextView.class);
        bN6PembayaranTundaActivity.tvTitleDenom = (TextView) Utils.findRequiredViewAsType(view, 2131299628, "field 'tvTitleDenom'", TextView.class);
        bN6PembayaranTundaActivity.tvDenom = (TextView) Utils.findRequiredViewAsType(view, 2131298917, "field 'tvDenom'", TextView.class);
        bN6PembayaranTundaActivity.llStatus = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297891, "field 'llStatus'", LinearLayout.class);
        bN6PembayaranTundaActivity.llTujuanPemesanan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297925, "field 'llTujuanPemesanan'", LinearLayout.class);
        bN6PembayaranTundaActivity.llDariRekening = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297572, "field 'llDariRekening'", LinearLayout.class);
        bN6PembayaranTundaActivity.llKurs = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297754, "field 'llKurs'", LinearLayout.class);
        bN6PembayaranTundaActivity.llJumlahPemesanan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297708, "field 'llJumlahPemesanan'", LinearLayout.class);
        bN6PembayaranTundaActivity.llDenom = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297613, "field 'llDenom'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131299560, "method 'showDetailPembayaran'");
        this.i = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranTundaActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranTundaActivity.showDetailPembayaran(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297544, "method 'onClickBcaMobile'");
        this.g = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranTundaActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranTundaActivity.onClickBcaMobile();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297542, "method 'onClickBcaKlikpay'");
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranTundaActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranTundaActivity.onClickBcaKlikpay();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297315, "method 'showDialogCaraPembayaran'");
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranTundaActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranTundaActivity.showDialogCaraPembayaran();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131299566, "method 'copyNoRef'");
        this.f = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranTundaActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranTundaActivity.copyNoRef();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.a = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranTundaActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranTundaActivity.retry(view2);
            }
        });
        bN6PembayaranTundaActivity.toolbarTitle = view.getContext().getResources().getString(2131822242);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN6PembayaranTundaActivity bN6PembayaranTundaActivity = this.d;
        if (bN6PembayaranTundaActivity != null) {
            this.d = null;
            bN6PembayaranTundaActivity.toolbar = null;
            bN6PembayaranTundaActivity.txtToolbarTitle = null;
            bN6PembayaranTundaActivity.tvErrorMessage = null;
            bN6PembayaranTundaActivity.llMain = null;
            bN6PembayaranTundaActivity.tvVAAccount = null;
            bN6PembayaranTundaActivity.tvStatus = null;
            bN6PembayaranTundaActivity.tvDariRekening = null;
            bN6PembayaranTundaActivity.tvJumlahPembelian = null;
            bN6PembayaranTundaActivity.tvKursTitle = null;
            bN6PembayaranTundaActivity.tvKurs = null;
            bN6PembayaranTundaActivity.tvTotalPembayaran = null;
            bN6PembayaranTundaActivity.tvMenit1 = null;
            bN6PembayaranTundaActivity.tvMenit2 = null;
            bN6PembayaranTundaActivity.tvDetik1 = null;
            bN6PembayaranTundaActivity.tvDetik2 = null;
            bN6PembayaranTundaActivity.llHeaderRincianPembelian = null;
            bN6PembayaranTundaActivity.llLayoutRincianPembelian = null;
            bN6PembayaranTundaActivity.ivRincianPembelian = null;
            bN6PembayaranTundaActivity.tvMataUang = null;
            bN6PembayaranTundaActivity.tvTitleDenom = null;
            bN6PembayaranTundaActivity.tvDenom = null;
            bN6PembayaranTundaActivity.llStatus = null;
            bN6PembayaranTundaActivity.llTujuanPemesanan = null;
            bN6PembayaranTundaActivity.llDariRekening = null;
            bN6PembayaranTundaActivity.llKurs = null;
            bN6PembayaranTundaActivity.llJumlahPemesanan = null;
            bN6PembayaranTundaActivity.llDenom = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
