package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR5DataPenerimaFragment_ViewBinding.class */
public class OR5DataPenerimaFragment_ViewBinding implements Unbinder {
    private View a;
    private OR5DataPenerimaFragment b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View m;
    private View n;

    /* renamed from: o  reason: collision with root package name */
    private View f43o;

    public OR5DataPenerimaFragment_ViewBinding(final OR5DataPenerimaFragment oR5DataPenerimaFragment, View view) {
        this.b = oR5DataPenerimaFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297107, "field 'etNorek' and method 'inputChange'");
        oR5DataPenerimaFragment.etNorek = (AutoCompleteTextView) Utils.castView(findRequiredView, 2131297107, "field 'etNorek'", AutoCompleteTextView.class);
        this.j = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR5DataPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297099, "field 'etNoIBAN' and method 'inputChange'");
        oR5DataPenerimaFragment.etNoIBAN = (AutoCompleteTextView) Utils.castView(findRequiredView2, 2131297099, "field 'etNoIBAN'", AutoCompleteTextView.class);
        this.f = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR5DataPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297066, "field 'etNamaPenerima' and method 'inputChange'");
        oR5DataPenerimaFragment.etNamaPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView3, 2131297066, "field 'etNamaPenerima'", AutoCompleteTextView.class);
        this.h = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR5DataPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297089, "field 'etNegaraTujuan' and method 'pilihNegaraTujuan'");
        oR5DataPenerimaFragment.etNegaraTujuan = (EditText) Utils.castView(findRequiredView4, 2131297089, "field 'etNegaraTujuan'", EditText.class);
        this.g = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR5DataPenerimaFragment.pilihNegaraTujuan(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296935, "field 'etAlamatPenerima' and method 'inputChange'");
        oR5DataPenerimaFragment.etAlamatPenerima = (EditText) Utils.castView(findRequiredView5, 2131296935, "field 'etAlamatPenerima'", EditText.class);
        this.d = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR5DataPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297038, "field 'etKotaPenerima' and method 'inputChange'");
        oR5DataPenerimaFragment.etKotaPenerima = (EditText) Utils.castView(findRequiredView6, 2131297038, "field 'etKotaPenerima'", EditText.class);
        this.e = findRequiredView6;
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR5DataPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297081, "field 'etNegaraBagian' and method 'pilihNegaraBagian'");
        oR5DataPenerimaFragment.etNegaraBagian = (EditText) Utils.castView(findRequiredView7, 2131297081, "field 'etNegaraBagian'", EditText.class);
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR5DataPenerimaFragment.pilihNegaraBagian(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297025, "field 'etKodePosPenerima' and method 'inputChange'");
        oR5DataPenerimaFragment.etKodePosPenerima = (EditText) Utils.castView(findRequiredView8, 2131297025, "field 'etKodePosPenerima'", EditText.class);
        this.c = findRequiredView8;
        findRequiredView8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.12
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR5DataPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297117, "field 'etNoTelpPenerima' and method 'inputChange'");
        oR5DataPenerimaFragment.etNoTelpPenerima = (EditText) Utils.castView(findRequiredView9, 2131297117, "field 'etNoTelpPenerima'", EditText.class);
        this.n = findRequiredView9;
        findRequiredView9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.11
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR5DataPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297210, "field 'etTipeNasabahPenerima' and method 'pilihTipeNasabahPenerima'");
        oR5DataPenerimaFragment.etTipeNasabahPenerima = (EditText) Utils.castView(findRequiredView10, 2131297210, "field 'etTipeNasabahPenerima'", EditText.class);
        this.f43o = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR5DataPenerimaFragment.pilihTipeNasabahPenerima(view2);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297218, "field 'etTipeTujuanTransaksiPenerima' and method 'pilihTipeTujuanTransaksiPenerima'");
        oR5DataPenerimaFragment.etTipeTujuanTransaksiPenerima = (EditText) Utils.castView(findRequiredView11, 2131297218, "field 'etTipeTujuanTransaksiPenerima'", EditText.class);
        this.m = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR5DataPenerimaFragment.pilihTipeTujuanTransaksiPenerima(view2);
            }
        });
        oR5DataPenerimaFragment.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        oR5DataPenerimaFragment.tilNoIBAN = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298645, "field 'tilNoIBAN'", LogoutDialog_ViewBinding.class);
        oR5DataPenerimaFragment.tilNamaPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298613, "field 'tilNamaPenerima'", LogoutDialog_ViewBinding.class);
        oR5DataPenerimaFragment.tilNegaraTujuan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298635, "field 'tilNegaraTujuan'", LogoutDialog_ViewBinding.class);
        oR5DataPenerimaFragment.tilAlamatPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298484, "field 'tilAlamatPenerima'", LogoutDialog_ViewBinding.class);
        oR5DataPenerimaFragment.tilKotaPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298585, "field 'tilKotaPenerima'", LogoutDialog_ViewBinding.class);
        oR5DataPenerimaFragment.tilNegaraBagianPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298627, "field 'tilNegaraBagianPenerima'", LogoutDialog_ViewBinding.class);
        oR5DataPenerimaFragment.tilKodePosPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298571, "field 'tilKodePosPenerima'", LogoutDialog_ViewBinding.class);
        oR5DataPenerimaFragment.tilNoTelpPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298663, "field 'tilNoTelpPenerima'", LogoutDialog_ViewBinding.class);
        oR5DataPenerimaFragment.tilTipeNasabahPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298742, "field 'tilTipeNasabahPenerima'", LogoutDialog_ViewBinding.class);
        oR5DataPenerimaFragment.tilTipeTujuanTransaksiPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298749, "field 'tilTipeTujuanTransaksiPenerima'", LogoutDialog_ViewBinding.class);
        oR5DataPenerimaFragment.cbxSimpanDaftarTransfer = (CheckBox) Utils.findRequiredViewAsType(view, 2131296473, "field 'cbxSimpanDaftarTransfer'", CheckBox.class);
        oR5DataPenerimaFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView12 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.a = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR5DataPenerimaFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR5DataPenerimaFragment.lanjut(view2);
            }
        });
        oR5DataPenerimaFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299119, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299089, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299110, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298963, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299061, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299103, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299048, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299136, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299210, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299217, "field 'tvErrors'", TextView.class));
        oR5DataPenerimaFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298645, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298613, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298635, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298484, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298585, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298627, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298571, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298663, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298742, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298749, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        oR5DataPenerimaFragment.etForms = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297107, "field 'etForms'"), Utils.findRequiredView(view, 2131297099, "field 'etForms'"), Utils.findRequiredView(view, 2131297066, "field 'etForms'"), Utils.findRequiredView(view, 2131297089, "field 'etForms'"), Utils.findRequiredView(view, 2131296935, "field 'etForms'"), Utils.findRequiredView(view, 2131297038, "field 'etForms'"), Utils.findRequiredView(view, 2131297081, "field 'etForms'"), Utils.findRequiredView(view, 2131297025, "field 'etForms'"), Utils.findRequiredView(view, 2131297117, "field 'etForms'"), Utils.findRequiredView(view, 2131297210, "field 'etForms'"), Utils.findRequiredView(view, 2131297218, "field 'etForms'"));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OR5DataPenerimaFragment oR5DataPenerimaFragment = this.b;
        if (oR5DataPenerimaFragment != null) {
            this.b = null;
            oR5DataPenerimaFragment.etNorek = null;
            oR5DataPenerimaFragment.etNoIBAN = null;
            oR5DataPenerimaFragment.etNamaPenerima = null;
            oR5DataPenerimaFragment.etNegaraTujuan = null;
            oR5DataPenerimaFragment.etAlamatPenerima = null;
            oR5DataPenerimaFragment.etKotaPenerima = null;
            oR5DataPenerimaFragment.etNegaraBagian = null;
            oR5DataPenerimaFragment.etKodePosPenerima = null;
            oR5DataPenerimaFragment.etNoTelpPenerima = null;
            oR5DataPenerimaFragment.etTipeNasabahPenerima = null;
            oR5DataPenerimaFragment.etTipeTujuanTransaksiPenerima = null;
            oR5DataPenerimaFragment.tilNorek = null;
            oR5DataPenerimaFragment.tilNoIBAN = null;
            oR5DataPenerimaFragment.tilNamaPenerima = null;
            oR5DataPenerimaFragment.tilNegaraTujuan = null;
            oR5DataPenerimaFragment.tilAlamatPenerima = null;
            oR5DataPenerimaFragment.tilKotaPenerima = null;
            oR5DataPenerimaFragment.tilNegaraBagianPenerima = null;
            oR5DataPenerimaFragment.tilKodePosPenerima = null;
            oR5DataPenerimaFragment.tilNoTelpPenerima = null;
            oR5DataPenerimaFragment.tilTipeNasabahPenerima = null;
            oR5DataPenerimaFragment.tilTipeTujuanTransaksiPenerima = null;
            oR5DataPenerimaFragment.cbxSimpanDaftarTransfer = null;
            oR5DataPenerimaFragment.svMain = null;
            oR5DataPenerimaFragment.tvErrors = null;
            oR5DataPenerimaFragment.tilForms = null;
            oR5DataPenerimaFragment.etForms = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.n.setOnFocusChangeListener(null);
            this.n = null;
            this.f43o.setOnClickListener(null);
            this.f43o = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
