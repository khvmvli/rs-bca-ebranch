package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/CancelReservasiDialog_ViewBinding.class */
public class CancelReservasiDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private CancelReservasiDialog c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View n;

    public CancelReservasiDialog_ViewBinding(final CancelReservasiDialog cancelReservasiDialog, View view) {
        this.c = cancelReservasiDialog;
        cancelReservasiDialog.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296945, "field 'etAlasan' and method 'inputChange'");
        cancelReservasiDialog.etAlasan = (EditText) Utils.castView(findRequiredView, 2131296945, "field 'etAlasan'", EditText.class);
        this.a = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cancelReservasiDialog.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131298193, "field 'rbWaktuTidakCocok' and method 'chooseWaktuTidakCocok'");
        cancelReservasiDialog.rbWaktuTidakCocok = (RadioButton) Utils.castView(findRequiredView2, 2131298193, "field 'rbWaktuTidakCocok'", RadioButton.class);
        this.l = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelReservasiDialog.chooseWaktuTidakCocok();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131298151, "field 'rbKeperluanMendadak' and method 'chooseKeperluanMendadak'");
        cancelReservasiDialog.rbKeperluanMendadak = (RadioButton) Utils.castView(findRequiredView3, 2131298151, "field 'rbKeperluanMendadak'", RadioButton.class);
        this.n = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelReservasiDialog.chooseKeperluanMendadak();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131298137, "field 'rbCabangTerlaluJauh' and method 'chooseCabangTerlaluJauh'");
        cancelReservasiDialog.rbCabangTerlaluJauh = (RadioButton) Utils.castView(findRequiredView4, 2131298137, "field 'rbCabangTerlaluJauh'", RadioButton.class);
        this.f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelReservasiDialog.chooseCabangTerlaluJauh();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131298162, "field 'rbLainnya' and method 'chooseLainnya'");
        cancelReservasiDialog.rbLainnya = (RadioButton) Utils.castView(findRequiredView5, 2131298162, "field 'rbLainnya'", RadioButton.class);
        this.k = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelReservasiDialog.chooseLainnya();
            }
        });
        cancelReservasiDialog.tvWaktuTidakCocok = (TextView) Utils.findRequiredViewAsType(view, 2131299739, "field 'tvWaktuTidakCocok'", TextView.class);
        cancelReservasiDialog.tvKeperluanMendadak = (TextView) Utils.findRequiredViewAsType(view, 2131299346, "field 'tvKeperluanMendadak'", TextView.class);
        cancelReservasiDialog.tvCabangTerlaluJauh = (TextView) Utils.findRequiredViewAsType(view, 2131298873, "field 'tvCabangTerlaluJauh'", TextView.class);
        cancelReservasiDialog.tvError = (TextView) Utils.findRequiredViewAsType(view, 2131298952, "field 'tvError'", TextView.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131296383, "method 'cancel'");
        this.d = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelReservasiDialog.cancel();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296385, "method 'cancel'");
        this.e = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelReservasiDialog.cancel();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131296452, "method 'submit'");
        this.b = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelReservasiDialog.submit();
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297933, "method 'chooseWaktuTidakCocok'");
        this.h = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelReservasiDialog.chooseWaktuTidakCocok();
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297722, "method 'chooseKeperluanMendadak'");
        this.j = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelReservasiDialog.chooseKeperluanMendadak();
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297560, "method 'chooseCabangTerlaluJauh'");
        this.i = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelReservasiDialog.chooseCabangTerlaluJauh();
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297755, "method 'chooseLainnya'");
        this.g = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelReservasiDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelReservasiDialog.chooseLainnya();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CancelReservasiDialog cancelReservasiDialog = this.c;
        if (cancelReservasiDialog != null) {
            this.c = null;
            cancelReservasiDialog.tilAlasan = null;
            cancelReservasiDialog.etAlasan = null;
            cancelReservasiDialog.rbWaktuTidakCocok = null;
            cancelReservasiDialog.rbKeperluanMendadak = null;
            cancelReservasiDialog.rbCabangTerlaluJauh = null;
            cancelReservasiDialog.rbLainnya = null;
            cancelReservasiDialog.tvWaktuTidakCocok = null;
            cancelReservasiDialog.tvKeperluanMendadak = null;
            cancelReservasiDialog.tvCabangTerlaluJauh = null;
            cancelReservasiDialog.tvError = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
