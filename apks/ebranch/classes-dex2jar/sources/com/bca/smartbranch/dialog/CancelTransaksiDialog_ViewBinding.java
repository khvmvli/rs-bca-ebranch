package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/CancelTransaksiDialog_ViewBinding.class */
public class CancelTransaksiDialog_ViewBinding implements Unbinder {
    private View a;
    private CancelTransaksiDialog b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;

    /* renamed from: o  reason: collision with root package name */
    private View f30o;

    public CancelTransaksiDialog_ViewBinding(final CancelTransaksiDialog cancelTransaksiDialog, View view) {
        this.b = cancelTransaksiDialog;
        cancelTransaksiDialog.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296945, "field 'etAlasan' and method 'inputChange'");
        cancelTransaksiDialog.etAlasan = (EditText) Utils.castView(findRequiredView, 2131296945, "field 'etAlasan'", EditText.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cancelTransaksiDialog.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131298138, "field 'rbDokumenBelumLengkap' and method 'chooseDokumenBelumLengkap'");
        cancelTransaksiDialog.rbDokumenBelumLengkap = (RadioButton) Utils.castView(findRequiredView2, 2131298138, "field 'rbDokumenBelumLengkap'", RadioButton.class);
        this.m = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.chooseDokumenBelumLengkap();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131298182, "field 'rbSudahTransaksiEchannel' and method 'chooseSudahTransaksiEchannel'");
        cancelTransaksiDialog.rbSudahTransaksiEchannel = (RadioButton) Utils.castView(findRequiredView3, 2131298182, "field 'rbSudahTransaksiEchannel'", RadioButton.class);
        this.k = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.chooseSudahTransaksiEchannel();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131298181, "field 'rbSudahDatangKeCabang' and method 'chooseSudahDatangKeCabang'");
        cancelTransaksiDialog.rbSudahDatangKeCabang = (RadioButton) Utils.castView(findRequiredView4, 2131298181, "field 'rbSudahDatangKeCabang'", RadioButton.class);
        this.f30o = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.chooseSudahDatangKeCabang();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131298136, "field 'rbBelumYakinBertransaksi' and method 'chooseBelumYakinBertransaksi'");
        cancelTransaksiDialog.rbBelumYakinBertransaksi = (RadioButton) Utils.castView(findRequiredView5, 2131298136, "field 'rbBelumYakinBertransaksi'", RadioButton.class);
        this.l = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.chooseBelumYakinBertransaksi();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131298162, "field 'rbLainnya' and method 'chooseLainnya'");
        cancelTransaksiDialog.rbLainnya = (RadioButton) Utils.castView(findRequiredView6, 2131298162, "field 'rbLainnya'", RadioButton.class);
        this.n = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.chooseLainnya();
            }
        });
        cancelTransaksiDialog.tvDokumenBelumLengkap = (TextView) Utils.findRequiredViewAsType(view, 2131298946, "field 'tvDokumenBelumLengkap'", TextView.class);
        cancelTransaksiDialog.tvSudahTransaksiEchannel = (TextView) Utils.findRequiredViewAsType(view, 2131299588, "field 'tvSudahTransaksiEchannel'", TextView.class);
        cancelTransaksiDialog.tvSudahDatangKeCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299587, "field 'tvSudahDatangKeCabang'", TextView.class);
        cancelTransaksiDialog.tvBelumYakinBertransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131298845, "field 'tvBelumYakinBertransaksi'", TextView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297897, "field 'llSudahTransaksiEchannel' and method 'chooseSudahTransaksiEchannel'");
        cancelTransaksiDialog.llSudahTransaksiEchannel = (LinearLayout) Utils.castView(findRequiredView7, 2131297897, "field 'llSudahTransaksiEchannel'", LinearLayout.class);
        this.h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.15
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.chooseSudahTransaksiEchannel();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297896, "field 'llSudahDatangKeCabang' and method 'chooseSudahDatangKeCabang'");
        cancelTransaksiDialog.llSudahDatangKeCabang = (LinearLayout) Utils.castView(findRequiredView8, 2131297896, "field 'llSudahDatangKeCabang'", LinearLayout.class);
        this.g = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.chooseSudahDatangKeCabang();
            }
        });
        cancelTransaksiDialog.tvError = (TextView) Utils.findRequiredViewAsType(view, 2131298952, "field 'tvError'", TextView.class);
        View findRequiredView9 = Utils.findRequiredView(view, 2131296383, "method 'cancel'");
        this.a = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.cancel();
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131296385, "method 'cancel'");
        this.d = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.cancel();
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131296452, "method 'submit'");
        this.c = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.submit();
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297627, "method 'chooseDokumenBelumLengkap'");
        this.j = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.chooseDokumenBelumLengkap();
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297547, "method 'chooseBelumYakinBertransaksi'");
        this.f = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.chooseBelumYakinBertransaksi();
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297755, "method 'chooseLainnya'");
        this.i = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.CancelTransaksiDialog_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cancelTransaksiDialog.chooseLainnya();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CancelTransaksiDialog cancelTransaksiDialog = this.b;
        if (cancelTransaksiDialog != null) {
            this.b = null;
            cancelTransaksiDialog.tilAlasan = null;
            cancelTransaksiDialog.etAlasan = null;
            cancelTransaksiDialog.rbDokumenBelumLengkap = null;
            cancelTransaksiDialog.rbSudahTransaksiEchannel = null;
            cancelTransaksiDialog.rbSudahDatangKeCabang = null;
            cancelTransaksiDialog.rbBelumYakinBertransaksi = null;
            cancelTransaksiDialog.rbLainnya = null;
            cancelTransaksiDialog.tvDokumenBelumLengkap = null;
            cancelTransaksiDialog.tvSudahTransaksiEchannel = null;
            cancelTransaksiDialog.tvSudahDatangKeCabang = null;
            cancelTransaksiDialog.tvBelumYakinBertransaksi = null;
            cancelTransaksiDialog.llSudahTransaksiEchannel = null;
            cancelTransaksiDialog.llSudahDatangKeCabang = null;
            cancelTransaksiDialog.tvError = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.f30o.setOnClickListener(null);
            this.f30o = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.i.setOnClickListener(null);
            this.i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
