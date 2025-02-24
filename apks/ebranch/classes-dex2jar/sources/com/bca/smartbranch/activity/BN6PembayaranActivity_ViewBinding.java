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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BN6PembayaranActivity_ViewBinding.class */
public class BN6PembayaranActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private BN6PembayaranActivity d;
    private View e;
    private View g;
    private View j;

    public BN6PembayaranActivity_ViewBinding(final BN6PembayaranActivity bN6PembayaranActivity, View view) {
        this.d = bN6PembayaranActivity;
        bN6PembayaranActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        bN6PembayaranActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        bN6PembayaranActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        bN6PembayaranActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        bN6PembayaranActivity.tvVAAccount = (TextView) Utils.findRequiredViewAsType(view, 2131299731, "field 'tvVAAccount'", TextView.class);
        bN6PembayaranActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        bN6PembayaranActivity.tvTujuanPembelian = (TextView) Utils.findRequiredViewAsType(view, 2131299694, "field 'tvTujuanPembelian'", TextView.class);
        bN6PembayaranActivity.tvDariRekening = (TextView) Utils.findRequiredViewAsType(view, 2131298889, "field 'tvDariRekening'", TextView.class);
        bN6PembayaranActivity.tvJumlahPembelian = (TextView) Utils.findRequiredViewAsType(view, 2131299327, "field 'tvJumlahPembelian'", TextView.class);
        bN6PembayaranActivity.tvKurs = (TextView) Utils.findRequiredViewAsType(view, 2131299385, "field 'tvKurs'", TextView.class);
        bN6PembayaranActivity.tvTotalPembayaran = (TextView) Utils.findRequiredViewAsType(view, 2131299684, "field 'tvTotalPembayaran'", TextView.class);
        bN6PembayaranActivity.tvMenit1 = (TextView) Utils.findRequiredViewAsType(view, 2131299406, "field 'tvMenit1'", TextView.class);
        bN6PembayaranActivity.tvMenit2 = (TextView) Utils.findRequiredViewAsType(view, 2131299407, "field 'tvMenit2'", TextView.class);
        bN6PembayaranActivity.tvDetik1 = (TextView) Utils.findRequiredViewAsType(view, 2131298935, "field 'tvDetik1'", TextView.class);
        bN6PembayaranActivity.tvDetik2 = (TextView) Utils.findRequiredViewAsType(view, 2131298936, "field 'tvDetik2'", TextView.class);
        bN6PembayaranActivity.llHeaderRincianPembelian = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297676, "field 'llHeaderRincianPembelian'", LinearLayout.class);
        bN6PembayaranActivity.llLayoutRincianPembelian = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297499, "field 'llLayoutRincianPembelian'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297415, "field 'ivRincianPembelian' and method 'showDetailPembayaran'");
        bN6PembayaranActivity.ivRincianPembelian = (ImageView) Utils.castView(findRequiredView, 2131297415, "field 'ivRincianPembelian'", ImageView.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranActivity.showDetailPembayaran(view2);
            }
        });
        bN6PembayaranActivity.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299400, "field 'tvMataUang'", TextView.class);
        bN6PembayaranActivity.tvTitleDenom = (TextView) Utils.findRequiredViewAsType(view, 2131299628, "field 'tvTitleDenom'", TextView.class);
        bN6PembayaranActivity.tvDenom = (TextView) Utils.findRequiredViewAsType(view, 2131298917, "field 'tvDenom'", TextView.class);
        bN6PembayaranActivity.llDenom = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297613, "field 'llDenom'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131299560, "method 'showDetailPembayaran'");
        this.g = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranActivity.showDetailPembayaran(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297544, "method 'onClickBcaMobile'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranActivity.onClickBcaMobile();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297542, "method 'onClickBcaKlikpay'");
        this.a = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranActivity.onClickBcaKlikpay();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297315, "method 'showDialogCaraPembayaran'");
        this.b = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranActivity.showDialogCaraPembayaran();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131299566, "method 'copyNoRef'");
        this.j = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BN6PembayaranActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN6PembayaranActivity.copyNoRef();
            }
        });
        bN6PembayaranActivity.toolbarTitle = view.getContext().getResources().getString(2131822242);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN6PembayaranActivity bN6PembayaranActivity = this.d;
        if (bN6PembayaranActivity != null) {
            this.d = null;
            bN6PembayaranActivity.toolbar = null;
            bN6PembayaranActivity.txtToolbarTitle = null;
            bN6PembayaranActivity.tvErrorMessage = null;
            bN6PembayaranActivity.llMain = null;
            bN6PembayaranActivity.tvVAAccount = null;
            bN6PembayaranActivity.tvStatus = null;
            bN6PembayaranActivity.tvTujuanPembelian = null;
            bN6PembayaranActivity.tvDariRekening = null;
            bN6PembayaranActivity.tvJumlahPembelian = null;
            bN6PembayaranActivity.tvKurs = null;
            bN6PembayaranActivity.tvTotalPembayaran = null;
            bN6PembayaranActivity.tvMenit1 = null;
            bN6PembayaranActivity.tvMenit2 = null;
            bN6PembayaranActivity.tvDetik1 = null;
            bN6PembayaranActivity.tvDetik2 = null;
            bN6PembayaranActivity.llHeaderRincianPembelian = null;
            bN6PembayaranActivity.llLayoutRincianPembelian = null;
            bN6PembayaranActivity.ivRincianPembelian = null;
            bN6PembayaranActivity.tvMataUang = null;
            bN6PembayaranActivity.tvTitleDenom = null;
            bN6PembayaranActivity.tvDenom = null;
            bN6PembayaranActivity.llDenom = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.j.setOnClickListener(null);
            this.j = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
