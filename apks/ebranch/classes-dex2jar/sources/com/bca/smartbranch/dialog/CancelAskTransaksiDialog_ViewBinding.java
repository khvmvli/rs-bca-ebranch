package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.RadioButton;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/CancelAskTransaksiDialog_ViewBinding.class */
public class CancelAskTransaksiDialog_ViewBinding implements Unbinder {
    private View a;
    private CancelAskTransaksiDialog b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View i;

    public CancelAskTransaksiDialog_ViewBinding(final CancelAskTransaksiDialog cancelAskTransaksiDialog, View view) {
        this.b = cancelAskTransaksiDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131298174, "field 'rbReservasi' and method 'cancelReservationOnly'");
        cancelAskTransaksiDialog.rbReservasi = (RadioButton) Utils.castView(findRequiredView, 2131298174, "field 'rbReservasi'", RadioButton.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelAskTransaksiDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelAskTransaksiDialog.cancelReservationOnly(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131298175, "field 'rbReservasiTransaksi' and method 'cancelReservationAndTransaction'");
        cancelAskTransaksiDialog.rbReservasiTransaksi = (RadioButton) Utils.castView(findRequiredView2, 2131298175, "field 'rbReservasiTransaksi'", RadioButton.class);
        this.g = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelAskTransaksiDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelAskTransaksiDialog.cancelReservationAndTransaction(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131299551, "method 'cancelReservationOnly'");
        this.i = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelAskTransaksiDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelAskTransaksiDialog.cancelReservationOnly(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131299553, "method 'cancelReservationAndTransaction'");
        this.f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelAskTransaksiDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelAskTransaksiDialog.cancelReservationAndTransaction(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296383, "method 'cancel'");
        this.e = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelAskTransaksiDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelAskTransaksiDialog.cancel();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296385, "method 'cancel'");
        this.c = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelAskTransaksiDialog_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelAskTransaksiDialog.cancel();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296452, "method 'submit'");
        this.a = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelAskTransaksiDialog_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelAskTransaksiDialog.submit();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CancelAskTransaksiDialog cancelAskTransaksiDialog = this.b;
        if (cancelAskTransaksiDialog != null) {
            this.b = null;
            cancelAskTransaksiDialog.rbReservasi = null;
            cancelAskTransaksiDialog.rbReservasiTransaksi = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
