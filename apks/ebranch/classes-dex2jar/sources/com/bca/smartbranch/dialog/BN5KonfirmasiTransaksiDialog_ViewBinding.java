package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/BN5KonfirmasiTransaksiDialog_ViewBinding.class */
public class BN5KonfirmasiTransaksiDialog_ViewBinding implements Unbinder {
    private View a;
    private BN5KonfirmasiTransaksiDialog b;
    private View c;
    private View d;

    public BN5KonfirmasiTransaksiDialog_ViewBinding(final BN5KonfirmasiTransaksiDialog bN5KonfirmasiTransaksiDialog, View view) {
        this.b = bN5KonfirmasiTransaksiDialog;
        bN5KonfirmasiTransaksiDialog.tvTitleInfo = (TextView) Utils.findRequiredViewAsType(view, 2131299632, "field 'tvTitleInfo'", TextView.class);
        bN5KonfirmasiTransaksiDialog.tvJumlahAwal = (TextView) Utils.findRequiredViewAsType(view, 2131299318, "field 'tvJumlahAwal'", TextView.class);
        bN5KonfirmasiTransaksiDialog.tvJumlahAkhir = (TextView) Utils.findRequiredViewAsType(view, 2131299317, "field 'tvJumlahAkhir'", TextView.class);
        bN5KonfirmasiTransaksiDialog.tvTotalPembayaran = (TextView) Utils.findRequiredViewAsType(view, 2131299684, "field 'tvTotalPembayaran'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296461, "field 'btnYa' and method 'clickedYes'");
        bN5KonfirmasiTransaksiDialog.btnYa = (Button) Utils.castView(findRequiredView, 2131296461, "field 'btnYa'", Button.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.BN5KonfirmasiTransaksiDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN5KonfirmasiTransaksiDialog.clickedYes(view2);
            }
        });
        bN5KonfirmasiTransaksiDialog.tvCountDownTimer = (TextView) Utils.findRequiredViewAsType(view, 2131298886, "field 'tvCountDownTimer'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.BN5KonfirmasiTransaksiDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN5KonfirmasiTransaksiDialog.close(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296455, "method 'clickedNo'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.BN5KonfirmasiTransaksiDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN5KonfirmasiTransaksiDialog.clickedNo(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN5KonfirmasiTransaksiDialog bN5KonfirmasiTransaksiDialog = this.b;
        if (bN5KonfirmasiTransaksiDialog != null) {
            this.b = null;
            bN5KonfirmasiTransaksiDialog.tvTitleInfo = null;
            bN5KonfirmasiTransaksiDialog.tvJumlahAwal = null;
            bN5KonfirmasiTransaksiDialog.tvJumlahAkhir = null;
            bN5KonfirmasiTransaksiDialog.tvTotalPembayaran = null;
            bN5KonfirmasiTransaksiDialog.btnYa = null;
            bN5KonfirmasiTransaksiDialog.tvCountDownTimer = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
