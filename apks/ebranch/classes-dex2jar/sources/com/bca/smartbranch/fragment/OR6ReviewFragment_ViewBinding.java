package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.CISNResponse$$Parcelable;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewFragment_ViewBinding.class */
public class OR6ReviewFragment_ViewBinding implements Unbinder {
    private View A;
    private View B;
    private View C;
    private View D;
    private View E;
    private View F;
    private View G;
    private View H;
    private View I;
    private View J;
    private View K;
    private View L;
    private View M;
    private View N;
    private View O;
    private View P;
    private View Q;
    private View R;
    private View S;
    private View T;
    private View a;
    private View b;
    private View c;
    private View d;
    private OR6ReviewFragment e;
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
    private View f45o;
    private View p;
    private View q;
    private View r;
    private View s;
    private View t;
    private View u;
    private View v;
    private View w;
    private View x;
    private View y;
    private View z;

    public OR6ReviewFragment_ViewBinding(final OR6ReviewFragment oR6ReviewFragment, View view) {
        this.e = oR6ReviewFragment;
        oR6ReviewFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        oR6ReviewFragment.tvNorekPengirim = (TextView) Utils.findRequiredViewAsType(view, 2131299500, "field 'tvNorekPengirim'", TextView.class);
        oR6ReviewFragment.tvNamaPengirim = (TextView) Utils.findRequiredViewAsType(view, 2131299434, "field 'tvNamaPengirim'", TextView.class);
        oR6ReviewFragment.tvNoHpPengirim = (TextView) Utils.findRequiredViewAsType(view, 2131299484, "field 'tvNoHpPengirim'", TextView.class);
        oR6ReviewFragment.tvNegaraTujuanTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299451, "field 'tvNegaraTujuanTransaksi'", TextView.class);
        oR6ReviewFragment.tvMataUangTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299309, "field 'tvMataUangTransaksi'", TextView.class);
        oR6ReviewFragment.tvNominalTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299491, "field 'tvNominalTransaksi'", TextView.class);
        oR6ReviewFragment.tvFullAmountTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299263, "field 'tvFullAmountTransaksi'", TextView.class);
        oR6ReviewFragment.tvValueTodayTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299733, "field 'tvValueTodayTransaksi'", TextView.class);
        oR6ReviewFragment.tvJenisProduk = (TextView) Utils.findRequiredViewAsType(view, 2131299310, "field 'tvJenisProduk'", TextView.class);
        oR6ReviewFragment.tvKategoriTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299339, "field 'tvKategoriTransaksi'", TextView.class);
        oR6ReviewFragment.tvTujuanTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299696, "field 'tvTujuanTransaksi'", TextView.class);
        oR6ReviewFragment.tvSumberDanaTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299591, "field 'tvSumberDanaTransaksi'", TextView.class);
        oR6ReviewFragment.tvBeritaTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131298853, "field 'tvBeritaTransaksi'", TextView.class);
        oR6ReviewFragment.tvHubunganKeuanganTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299274, "field 'tvHubunganKeuanganTransaksi'", TextView.class);
        oR6ReviewFragment.llJenisProdukDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297701, "field 'llJenisProdukDisabled'", LinearLayout.class);
        oR6ReviewFragment.tvKodeSwiftBankPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299374, "field 'tvKodeSwiftBankPenerima'", TextView.class);
        oR6ReviewFragment.tvNamaBankPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299418, "field 'tvNamaBankPenerima'", TextView.class);
        oR6ReviewFragment.tvAlamatBankPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131298814, "field 'tvAlamatBankPenerima'", TextView.class);
        oR6ReviewFragment.tvNegaraBagianBankPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299443, "field 'tvNegaraBagianBankPenerima'", TextView.class);
        oR6ReviewFragment.tvKotaBankPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299376, "field 'tvKotaBankPenerima'", TextView.class);
        oR6ReviewFragment.tvCodewordBankPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131298882, "field 'tvCodewordBankPenerima'", TextView.class);
        oR6ReviewFragment.tvKeteranganAlamatBankPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299570, "field 'tvKeteranganAlamatBankPenerima'", TextView.class);
        oR6ReviewFragment.llCodewordBankPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297568, "field 'llCodewordBankPenerima'", LinearLayout.class);
        oR6ReviewFragment.llKeteranganAlamatDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297886, "field 'llKeteranganAlamatDisabled'", LinearLayout.class);
        oR6ReviewFragment.llNegaraBagianBankPenerimaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297807, "field 'llNegaraBagianBankPenerimaDisabled'", LinearLayout.class);
        oR6ReviewFragment.llNegaraBagianBankPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297806, "field 'llNegaraBagianBankPenerima'", LinearLayout.class);
        oR6ReviewFragment.tvNoRekeningPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299494, "field 'tvNoRekeningPenerima'", TextView.class);
        oR6ReviewFragment.tvNoIbanPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299492, "field 'tvNoIbanPenerima'", TextView.class);
        oR6ReviewFragment.tvNamaPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299427, "field 'tvNamaPenerima'", TextView.class);
        oR6ReviewFragment.tvNoTelpPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299478, "field 'tvNoTelpPenerima'", TextView.class);
        oR6ReviewFragment.tvNegaraTujuanPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299450, "field 'tvNegaraTujuanPenerima'", TextView.class);
        oR6ReviewFragment.tvAlamatLengkapPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131298819, "field 'tvAlamatLengkapPenerima'", TextView.class);
        oR6ReviewFragment.tvKotaPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299382, "field 'tvKotaPenerima'", TextView.class);
        oR6ReviewFragment.tvNegaraBagianPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299444, "field 'tvNegaraBagianPenerima'", TextView.class);
        oR6ReviewFragment.tvKodePosPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299370, "field 'tvKodePosPenerima'", TextView.class);
        oR6ReviewFragment.tvTipeNasabahPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299607, "field 'tvTipeNasabahPenerima'", TextView.class);
        oR6ReviewFragment.tvTipeTujuanTransaksiPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299614, "field 'tvTipeTujuanTransaksiPenerima'", TextView.class);
        oR6ReviewFragment.llNoRekPenerimaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297824, "field 'llNoRekPenerimaDisabled'", LinearLayout.class);
        oR6ReviewFragment.llNoIbanDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297819, "field 'llNoIbanDisabled'", LinearLayout.class);
        oR6ReviewFragment.llNoTelpPenerimaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297826, "field 'llNoTelpPenerimaDisabled'", LinearLayout.class);
        oR6ReviewFragment.llAlamatPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297531, "field 'llAlamatPenerima'", LinearLayout.class);
        oR6ReviewFragment.llNegaraBagianPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297808, "field 'llNegaraBagianPenerima'", LinearLayout.class);
        oR6ReviewFragment.llNegaraBagianPenerimaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297809, "field 'llNegaraBagianPenerimaDisabled'", LinearLayout.class);
        oR6ReviewFragment.llKodePosPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297732, "field 'llKodePosPenerima'", LinearLayout.class);
        oR6ReviewFragment.llKodePosPenerimaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297733, "field 'llKodePosPenerimaDisabled'", LinearLayout.class);
        oR6ReviewFragment.llTipeTujuanTransaksiDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297915, "field 'llTipeTujuanTransaksiDisabled'", LinearLayout.class);
        oR6ReviewFragment.tvKodePromosi = (TextView) Utils.findRequiredViewAsType(view, 2131299371, "field 'tvKodePromosi'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297114, "field 'etNorekPengirim', method 'pilihNorekPengirim', and method 'inputChange'");
        oR6ReviewFragment.etNorekPengirim = (EditText) Utils.castView(findRequiredView, 2131297114, "field 'etNorekPengirim'", EditText.class);
        this.y = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.pilihNorekPengirim(view2);
            }
        });
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.15
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297073, "field 'etNamaPengirim' and method 'inputChange'");
        oR6ReviewFragment.etNamaPengirim = (EditText) Utils.castView(findRequiredView2, 2131297073, "field 'etNamaPengirim'", EditText.class);
        this.s = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.25
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297098, "field 'etNoHpPengirim' and method 'inputChange'");
        oR6ReviewFragment.etNoHpPengirim = (EditText) Utils.castView(findRequiredView3, 2131297098, "field 'etNoHpPengirim'", EditText.class);
        this.u = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.34
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        oR6ReviewFragment.tilNorekPengirim = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298660, "field 'tilNorekPengirim'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilNamaPengirim = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298619, "field 'tilNamaPengirim'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilNoHPPengirim = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298644, "field 'tilNoHPPengirim'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.etNegaraTujuanTransaksi = (EditText) Utils.findRequiredViewAsType(view, 2131297091, "field 'etNegaraTujuanTransaksi'", EditText.class);
        oR6ReviewFragment.etJenisMataUangTransaksi = (EditText) Utils.findRequiredViewAsType(view, 2131297001, "field 'etJenisMataUangTransaksi'", EditText.class);
        oR6ReviewFragment.etFullAmountTransaksi = (EditText) Utils.findRequiredViewAsType(view, 2131296985, "field 'etFullAmountTransaksi'", EditText.class);
        oR6ReviewFragment.etValueTodayTransaksi = (EditText) Utils.findRequiredViewAsType(view, 2131297232, "field 'etValueTodayTransaksi'", EditText.class);
        oR6ReviewFragment.etJenisProdukTransaksi = (EditText) Utils.findRequiredViewAsType(view, 2131297002, "field 'etJenisProdukTransaksi'", EditText.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131297125, "field 'etNominalTransaksi' and method 'inputChange'");
        oR6ReviewFragment.etNominalTransaksi = (CISNResponse$$Parcelable) Utils.castView(findRequiredView4, 2131297125, "field 'etNominalTransaksi'", CISNResponse$$Parcelable.class);
        this.D = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.42
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297010, "field 'etKategoriTransaksi' and method 'pilihKategoriTujuanTransaksiOR'");
        oR6ReviewFragment.etKategoriTransaksi = (EditText) Utils.castView(findRequiredView5, 2131297010, "field 'etKategoriTransaksi'", EditText.class);
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.45
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.pilihKategoriTujuanTransaksiOR(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297229, "field 'etTujuanTransaksi' and method 'pilihTujuanTransaksi'");
        oR6ReviewFragment.etTujuanTransaksi = (EditText) Utils.castView(findRequiredView6, 2131297229, "field 'etTujuanTransaksi'", EditText.class);
        this.H = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.44
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.pilihTujuanTransaksi(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297201, "field 'etSumberDanaTransaksi' and method 'pilihSumberDanaOR'");
        oR6ReviewFragment.etSumberDanaTransaksi = (EditText) Utils.castView(findRequiredView7, 2131297201, "field 'etSumberDanaTransaksi'", EditText.class);
        this.z = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.43
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.pilihSumberDanaOR(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131296960, "field 'etBeritaTransaksi' and method 'inputChange'");
        oR6ReviewFragment.etBeritaTransaksi = (EditText) Utils.castView(findRequiredView8, 2131296960, "field 'etBeritaTransaksi'", EditText.class);
        this.b = findRequiredView8;
        findRequiredView8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.50
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131296988, "field 'etHubunganKeuanganTransaksi' and method 'pilihHubunganKeuanganOR'");
        oR6ReviewFragment.etHubunganKeuanganTransaksi = (EditText) Utils.castView(findRequiredView9, 2131296988, "field 'etHubunganKeuanganTransaksi'", EditText.class);
        this.i = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.pilihHubunganKeuanganOR(view2);
            }
        });
        oR6ReviewFragment.tilNegaraTujuanTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298637, "field 'tilNegaraTujuanTransaksi'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilJenisMataUangTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298549, "field 'tilJenisMataUangTransaksi'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilNominalTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298671, "field 'tilNominalTransaksi'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilFullAmountTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298534, "field 'tilFullAmountTransaksi'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilValueTodayTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298763, "field 'tilValueTodayTransaksi'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilJenisProdukTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298550, "field 'tilJenisProdukTransaksi'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilKategoriTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298556, "field 'tilKategoriTransaksi'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilTujuanTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298760, "field 'tilTujuanTransaksi'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilSumberDanaTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298733, "field 'tilSumberDanaTransaksi'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilBeritaTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298510, "field 'tilBeritaTransaksi'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilHubunganKeuanganTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298537, "field 'tilHubunganKeuanganTransaksi'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.llNominalTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297832, "field 'llNominalTransaksi'", LinearLayout.class);
        View findRequiredView10 = Utils.findRequiredView(view, 2131297030, "field 'etKodeSwiftBankPenerima' and method 'inputChange'");
        oR6ReviewFragment.etKodeSwiftBankPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView10, 2131297030, "field 'etKodeSwiftBankPenerima'", AutoCompleteTextView.class);
        this.m = findRequiredView10;
        findRequiredView10.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297056, "field 'etNamaBankPenerima' and method 'inputChange'");
        oR6ReviewFragment.etNamaBankPenerima = (EditText) Utils.castView(findRequiredView11, 2131297056, "field 'etNamaBankPenerima'", EditText.class);
        this.l = findRequiredView11;
        findRequiredView11.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131296929, "field 'etAlamatBankPenerima' and method 'inputChange'");
        oR6ReviewFragment.etAlamatBankPenerima = (EditText) Utils.castView(findRequiredView12, 2131296929, "field 'etAlamatBankPenerima'", EditText.class);
        this.d = findRequiredView12;
        findRequiredView12.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297082, "field 'etNegaraBagianBankPenerima' and method 'inputChange'");
        oR6ReviewFragment.etNegaraBagianBankPenerima = (EditText) Utils.castView(findRequiredView13, 2131297082, "field 'etNegaraBagianBankPenerima'", EditText.class);
        this.q = findRequiredView13;
        findRequiredView13.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297034, "field 'etKotaBankPenerima' and method 'inputChange'");
        oR6ReviewFragment.etKotaBankPenerima = (EditText) Utils.castView(findRequiredView14, 2131297034, "field 'etKotaBankPenerima'", EditText.class);
        this.k = findRequiredView14;
        findRequiredView14.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView15 = Utils.findRequiredView(view, 2131296969, "field 'etCodewordBankPenerima' and method 'inputChange'");
        oR6ReviewFragment.etCodewordBankPenerima = (EditText) Utils.castView(findRequiredView15, 2131296969, "field 'etCodewordBankPenerima'", EditText.class);
        this.f = findRequiredView15;
        findRequiredView15.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131297181, "field 'etKeteranganAlamatBankPenerima' and method 'inputChange'");
        oR6ReviewFragment.etKeteranganAlamatBankPenerima = (EditText) Utils.castView(findRequiredView16, 2131297181, "field 'etKeteranganAlamatBankPenerima'", EditText.class);
        this.A = findRequiredView16;
        findRequiredView16.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        oR6ReviewFragment.tilKodeSwiftBankPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298577, "field 'tilKodeSwiftBankPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilNamaBankPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298603, "field 'tilNamaBankPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilAlamatBankPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298478, "field 'tilAlamatBankPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilNegaraBagianBankPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298628, "field 'tilNegaraBagianBankPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilKotaBankPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298581, "field 'tilKotaBankPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilCodewordBankPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298520, "field 'tilCodewordBankPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilKeteranganAlamatBankPenerim = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298713, "field 'tilKeteranganAlamatBankPenerim'", LogoutDialog_ViewBinding.class);
        View findRequiredView17 = Utils.findRequiredView(view, 2131297108, "field 'etNorekPenerima' and method 'inputChange'");
        oR6ReviewFragment.etNorekPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView17, 2131297108, "field 'etNorekPenerima'", AutoCompleteTextView.class);
        this.v = findRequiredView17;
        findRequiredView17.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.8
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView18 = Utils.findRequiredView(view, 2131297100, "field 'etNoIbanPenerima' and method 'inputChange'");
        oR6ReviewFragment.etNoIbanPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView18, 2131297100, "field 'etNoIbanPenerima'", AutoCompleteTextView.class);
        this.w = findRequiredView18;
        findRequiredView18.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.14
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView19 = Utils.findRequiredView(view, 2131297066, "field 'etNamaPenerima' and method 'inputChange'");
        oR6ReviewFragment.etNamaPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView19, 2131297066, "field 'etNamaPenerima'", AutoCompleteTextView.class);
        this.t = findRequiredView19;
        findRequiredView19.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.11
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView20 = Utils.findRequiredView(view, 2131297090, "field 'etNegaraTujuanPenerima' and method 'pilihNegaraTujuanPenerima'");
        oR6ReviewFragment.etNegaraTujuanPenerima = (EditText) Utils.castView(findRequiredView20, 2131297090, "field 'etNegaraTujuanPenerima'", EditText.class);
        this.r = findRequiredView20;
        findRequiredView20.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.pilihNegaraTujuanPenerima(view2);
            }
        });
        View findRequiredView21 = Utils.findRequiredView(view, 2131297083, "field 'etNegaraBagianPenerima' and method 'pilihNegaraBagian'");
        oR6ReviewFragment.etNegaraBagianPenerima = (EditText) Utils.castView(findRequiredView21, 2131297083, "field 'etNegaraBagianPenerima'", EditText.class);
        this.p = findRequiredView21;
        findRequiredView21.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.pilihNegaraBagian(view2);
            }
        });
        View findRequiredView22 = Utils.findRequiredView(view, 2131296935, "field 'etAlamatPenerima' and method 'inputChange'");
        oR6ReviewFragment.etAlamatPenerima = (EditText) Utils.castView(findRequiredView22, 2131296935, "field 'etAlamatPenerima'", EditText.class);
        this.a = findRequiredView22;
        findRequiredView22.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.19
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView23 = Utils.findRequiredView(view, 2131297038, "field 'etKotaPenerima' and method 'inputChange'");
        oR6ReviewFragment.etKotaPenerima = (EditText) Utils.castView(findRequiredView23, 2131297038, "field 'etKotaPenerima'", EditText.class);
        this.f45o = findRequiredView23;
        findRequiredView23.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.18
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView24 = Utils.findRequiredView(view, 2131297025, "field 'etKodePosPenerima' and method 'inputChange'");
        oR6ReviewFragment.etKodePosPenerima = (EditText) Utils.castView(findRequiredView24, 2131297025, "field 'etKodePosPenerima'", EditText.class);
        this.j = findRequiredView24;
        findRequiredView24.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.17
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        View findRequiredView25 = Utils.findRequiredView(view, 2131297210, "field 'etTipeNasabahPenerima' and method 'pilihTipeNasabahPenerima'");
        oR6ReviewFragment.etTipeNasabahPenerima = (EditText) Utils.castView(findRequiredView25, 2131297210, "field 'etTipeNasabahPenerima'", EditText.class);
        this.B = findRequiredView25;
        findRequiredView25.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.16
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.pilihTipeNasabahPenerima(view2);
            }
        });
        View findRequiredView26 = Utils.findRequiredView(view, 2131297218, "field 'etTipeTujuanTransaksiPenerima' and method 'pilihTipeTujuanTransaksiPenerima'");
        oR6ReviewFragment.etTipeTujuanTransaksiPenerima = (EditText) Utils.castView(findRequiredView26, 2131297218, "field 'etTipeTujuanTransaksiPenerima'", EditText.class);
        this.C = findRequiredView26;
        findRequiredView26.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.20
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.pilihTipeTujuanTransaksiPenerima(view2);
            }
        });
        View findRequiredView27 = Utils.findRequiredView(view, 2131297117, "field 'etNoTelpPenerima' and method 'inputChange'");
        oR6ReviewFragment.etNoTelpPenerima = (EditText) Utils.castView(findRequiredView27, 2131297117, "field 'etNoTelpPenerima'", EditText.class);
        this.x = findRequiredView27;
        findRequiredView27.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.23
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        oR6ReviewFragment.tilNorekPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298654, "field 'tilNorekPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilNoIbanPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298646, "field 'tilNoIbanPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilNamaPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298613, "field 'tilNamaPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilNoTelpPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298663, "field 'tilNoTelpPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilNegaraTujuanPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298636, "field 'tilNegaraTujuanPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilAlamatPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298484, "field 'tilAlamatPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilKotaPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298585, "field 'tilKotaPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilKodePosPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298571, "field 'tilKodePosPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilNegaraBagianPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298629, "field 'tilNegaraBagianPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilTipeNasabahPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298742, "field 'tilTipeNasabahPenerima'", LogoutDialog_ViewBinding.class);
        oR6ReviewFragment.tilTipeTujuanTransaksiPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298749, "field 'tilTipeTujuanTransaksiPenerima'", LogoutDialog_ViewBinding.class);
        View findRequiredView28 = Utils.findRequiredView(view, 2131297027, "field 'etKodePromosi' and method 'inputChange'");
        oR6ReviewFragment.etKodePromosi = (EditText) Utils.castView(findRequiredView28, 2131297027, "field 'etKodePromosi'", EditText.class);
        this.n = findRequiredView28;
        findRequiredView28.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.22
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6ReviewFragment.inputChange(view2, z);
            }
        });
        oR6ReviewFragment.tilKodePromosi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298574, "field 'tilKodePromosi'", LogoutDialog_ViewBinding.class);
        View findRequiredView29 = Utils.findRequiredView(view, 2131299720, "field 'tvUbahDataPengirim' and method 'ubahDataPengirim'");
        oR6ReviewFragment.tvUbahDataPengirim = (TextView) Utils.castView(findRequiredView29, 2131299720, "field 'tvUbahDataPengirim'", TextView.class);
        this.Q = findRequiredView29;
        findRequiredView29.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.24
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.ubahDataPengirim(view2);
            }
        });
        View findRequiredView30 = Utils.findRequiredView(view, 2131299722, "field 'tvUbahDataTransaksi' and method 'setTvUbahDataTransaksi'");
        oR6ReviewFragment.tvUbahDataTransaksi = (TextView) Utils.castView(findRequiredView30, 2131299722, "field 'tvUbahDataTransaksi'", TextView.class);
        this.T = findRequiredView30;
        findRequiredView30.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.21
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.setTvUbahDataTransaksi(view2);
            }
        });
        View findRequiredView31 = Utils.findRequiredView(view, 2131299704, "field 'tvUbahDataBankPenerima' and method 'ubahDataBankPenerima'");
        oR6ReviewFragment.tvUbahDataBankPenerima = (TextView) Utils.castView(findRequiredView31, 2131299704, "field 'tvUbahDataBankPenerima'", TextView.class);
        this.O = findRequiredView31;
        findRequiredView31.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.30
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.ubahDataBankPenerima(view2);
            }
        });
        View findRequiredView32 = Utils.findRequiredView(view, 2131299714, "field 'tvUbahDataPenerima' and method 'ubahDataPenerima'");
        oR6ReviewFragment.tvUbahDataPenerima = (TextView) Utils.castView(findRequiredView32, 2131299714, "field 'tvUbahDataPenerima'", TextView.class);
        this.S = findRequiredView32;
        findRequiredView32.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.28
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.ubahDataPenerima(view2);
            }
        });
        View findRequiredView33 = Utils.findRequiredView(view, 2131299711, "field 'tvUbahDataLainnya' and method 'ubahDataLainnya'");
        oR6ReviewFragment.tvUbahDataLainnya = (TextView) Utils.castView(findRequiredView33, 2131299711, "field 'tvUbahDataLainnya'", TextView.class);
        this.P = findRequiredView33;
        findRequiredView33.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.26
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.ubahDataLainnya(view2);
            }
        });
        oR6ReviewFragment.llHeaderPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297675, "field 'llHeaderPengirim'", LinearLayout.class);
        oR6ReviewFragment.llHeaderTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297677, "field 'llHeaderTransaksi'", LinearLayout.class);
        oR6ReviewFragment.llHeaderBankPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297651, "field 'llHeaderBankPenerima'", LinearLayout.class);
        oR6ReviewFragment.llHeaderPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297674, "field 'llHeaderPenerima'", LinearLayout.class);
        oR6ReviewFragment.llHeaderLainnya = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297662, "field 'llHeaderLainnya'", LinearLayout.class);
        oR6ReviewFragment.flLayoutDataPengirim = (FrameLayout) Utils.findRequiredViewAsType(view, 2131297473, "field 'flLayoutDataPengirim'", FrameLayout.class);
        oR6ReviewFragment.flLayoutDataTransaksi = (FrameLayout) Utils.findRequiredViewAsType(view, 2131297479, "field 'flLayoutDataTransaksi'", FrameLayout.class);
        oR6ReviewFragment.flLayoutDataBankPenerima = (FrameLayout) Utils.findRequiredViewAsType(view, 2131297444, "field 'flLayoutDataBankPenerima'", FrameLayout.class);
        oR6ReviewFragment.flLayoutDataPenerima = (FrameLayout) Utils.findRequiredViewAsType(view, 2131297465, "field 'flLayoutDataPenerima'", FrameLayout.class);
        oR6ReviewFragment.flLayoutDataLainnya = (FrameLayout) Utils.findRequiredViewAsType(view, 2131297458, "field 'flLayoutDataLainnya'", FrameLayout.class);
        View findRequiredView34 = Utils.findRequiredView(view, 2131297350, "field 'ivDataPengirim' and method 'showDataPengirim'");
        oR6ReviewFragment.ivDataPengirim = (ImageView) Utils.castView(findRequiredView34, 2131297350, "field 'ivDataPengirim'", ImageView.class);
        this.E = findRequiredView34;
        findRequiredView34.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.29
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.showDataPengirim(view2);
            }
        });
        View findRequiredView35 = Utils.findRequiredView(view, 2131297353, "field 'ivDataTransaksi' and method 'showDataTransaksi'");
        oR6ReviewFragment.ivDataTransaksi = (ImageView) Utils.castView(findRequiredView35, 2131297353, "field 'ivDataTransaksi'", ImageView.class);
        this.L = findRequiredView35;
        findRequiredView35.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.27
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.showDataTransaksi(view2);
            }
        });
        View findRequiredView36 = Utils.findRequiredView(view, 2131297333, "field 'ivDataBankPenerima' and method 'showDataBankPenerima'");
        oR6ReviewFragment.ivDataBankPenerima = (ImageView) Utils.castView(findRequiredView36, 2131297333, "field 'ivDataBankPenerima'", ImageView.class);
        this.I = findRequiredView36;
        findRequiredView36.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.33
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.showDataBankPenerima(view2);
            }
        });
        View findRequiredView37 = Utils.findRequiredView(view, 2131297344, "field 'ivDataPenerima' and method 'showDataPenerima'");
        oR6ReviewFragment.ivDataPenerima = (ImageView) Utils.castView(findRequiredView37, 2131297344, "field 'ivDataPenerima'", ImageView.class);
        this.F = findRequiredView37;
        findRequiredView37.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.31
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.showDataPenerima(view2);
            }
        });
        View findRequiredView38 = Utils.findRequiredView(view, 2131297340, "field 'ivDataLainnya' and method 'showDataLainnya'");
        oR6ReviewFragment.ivDataLainnya = (ImageView) Utils.castView(findRequiredView38, 2131297340, "field 'ivDataLainnya'", ImageView.class);
        this.G = findRequiredView38;
        findRequiredView38.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.32
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.showDataLainnya(view2);
            }
        });
        oR6ReviewFragment.llWrapperDataPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297495, "field 'llWrapperDataPengirim'", LinearLayout.class);
        oR6ReviewFragment.llDataPengirimUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297475, "field 'llDataPengirimUneditable'", LinearLayout.class);
        oR6ReviewFragment.llDataPengirimEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297474, "field 'llDataPengirimEditable'", LinearLayout.class);
        oR6ReviewFragment.llWrapperDataTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297497, "field 'llWrapperDataTransaksi'", LinearLayout.class);
        oR6ReviewFragment.llDataTransaksiEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297480, "field 'llDataTransaksiEditable'", LinearLayout.class);
        oR6ReviewFragment.llDataTransaksiUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297481, "field 'llDataTransaksiUneditable'", LinearLayout.class);
        oR6ReviewFragment.llWrapperDataBankPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297490, "field 'llWrapperDataBankPenerima'", LinearLayout.class);
        oR6ReviewFragment.llDataBankPenerimaEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297445, "field 'llDataBankPenerimaEditable'", LinearLayout.class);
        oR6ReviewFragment.llDataBankPenerimaUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297446, "field 'llDataBankPenerimaUneditable'", LinearLayout.class);
        oR6ReviewFragment.llWrapperDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297494, "field 'llWrapperDataPenerima'", LinearLayout.class);
        oR6ReviewFragment.llDataPenerimaEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297471, "field 'llDataPenerimaEditable'", LinearLayout.class);
        oR6ReviewFragment.llDataPenerimaUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297472, "field 'llDataPenerimaUneditable'", LinearLayout.class);
        oR6ReviewFragment.llWrapperDataLainnya = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297492, "field 'llWrapperDataLainnya'", LinearLayout.class);
        oR6ReviewFragment.llDataLainnyaEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297459, "field 'llDataLainnyaEditable'", LinearLayout.class);
        oR6ReviewFragment.llDataLainnyaUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297460, "field 'llDataLainnyaUneditable'", LinearLayout.class);
        View findRequiredView39 = Utils.findRequiredView(view, 2131298910, "method 'showDataPengirim'");
        this.N = findRequiredView39;
        findRequiredView39.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.35
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.showDataPengirim(view2);
            }
        });
        View findRequiredView40 = Utils.findRequiredView(view, 2131298912, "method 'showDataTransaksi'");
        this.R = findRequiredView40;
        findRequiredView40.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.40
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.showDataTransaksi(view2);
            }
        });
        View findRequiredView41 = Utils.findRequiredView(view, 2131298894, "method 'showDataBankPenerima'");
        this.M = findRequiredView41;
        findRequiredView41.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.36
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.showDataBankPenerima(view2);
            }
        });
        View findRequiredView42 = Utils.findRequiredView(view, 2131298904, "method 'showDataPenerima'");
        this.J = findRequiredView42;
        findRequiredView42.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.39
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.showDataPenerima(view2);
            }
        });
        View findRequiredView43 = Utils.findRequiredView(view, 2131298901, "method 'showDataLainnya'");
        this.K = findRequiredView43;
        findRequiredView43.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.37
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.showDataLainnya(view2);
            }
        });
        View findRequiredView44 = Utils.findRequiredView(view, 2131296999, "method 'pilihJenisKodeBankTransaksi'");
        this.g = findRequiredView44;
        findRequiredView44.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.38
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.pilihJenisKodeBankTransaksi(view2);
            }
        });
        View findRequiredView45 = Utils.findRequiredView(view, 2131296440, "method 'proses'");
        this.c = findRequiredView45;
        findRequiredView45.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment_ViewBinding.41
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6ReviewFragment.proses(view2);
            }
        });
        oR6ReviewFragment.etFormsDataPengirim = Utils.listFilteringNull((EditText) Utils.findRequiredViewAsType(view, 2131297114, "field 'etFormsDataPengirim'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297073, "field 'etFormsDataPengirim'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297098, "field 'etFormsDataPengirim'", EditText.class));
        oR6ReviewFragment.viewGroupDataPengirim = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297114, "field 'viewGroupDataPengirim'"), Utils.findRequiredView(view, 2131297073, "field 'viewGroupDataPengirim'"), Utils.findRequiredView(view, 2131297098, "field 'viewGroupDataPengirim'"));
        oR6ReviewFragment.tilFormDataPengirim = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298660, "field 'tilFormDataPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298619, "field 'tilFormDataPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298644, "field 'tilFormDataPengirim'", LogoutDialog_ViewBinding.class));
        oR6ReviewFragment.tvErrorDataPengirim = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299133, "field 'tvErrorDataPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299095, "field 'tvErrorDataPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299118, "field 'tvErrorDataPengirim'", TextView.class));
        oR6ReviewFragment.etFormsDataTransaksi = Utils.listFilteringNull((EditText) Utils.findRequiredViewAsType(view, 2131297091, "field 'etFormsDataTransaksi'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297001, "field 'etFormsDataTransaksi'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297125, "field 'etFormsDataTransaksi'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297010, "field 'etFormsDataTransaksi'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297229, "field 'etFormsDataTransaksi'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297201, "field 'etFormsDataTransaksi'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296960, "field 'etFormsDataTransaksi'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296988, "field 'etFormsDataTransaksi'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296985, "field 'etFormsDataTransaksi'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297232, "field 'etFormsDataTransaksi'", EditText.class));
        oR6ReviewFragment.viewGroupDataTransaksi = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297091, "field 'viewGroupDataTransaksi'"), Utils.findRequiredView(view, 2131297001, "field 'viewGroupDataTransaksi'"), Utils.findRequiredView(view, 2131297125, "field 'viewGroupDataTransaksi'"), Utils.findRequiredView(view, 2131297010, "field 'viewGroupDataTransaksi'"), Utils.findRequiredView(view, 2131297229, "field 'viewGroupDataTransaksi'"), Utils.findRequiredView(view, 2131297201, "field 'viewGroupDataTransaksi'"), Utils.findRequiredView(view, 2131296960, "field 'viewGroupDataTransaksi'"), Utils.findRequiredView(view, 2131296988, "field 'viewGroupDataTransaksi'"), Utils.findRequiredView(view, 2131296985, "field 'viewGroupDataTransaksi'"), Utils.findRequiredView(view, 2131297232, "field 'viewGroupDataTransaksi'"));
        oR6ReviewFragment.tilFormDataTransaksi = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298637, "field 'tilFormDataTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298549, "field 'tilFormDataTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298671, "field 'tilFormDataTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298556, "field 'tilFormDataTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298760, "field 'tilFormDataTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298733, "field 'tilFormDataTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298510, "field 'tilFormDataTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298537, "field 'tilFormDataTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298534, "field 'tilFormDataTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298763, "field 'tilFormDataTransaksi'", LogoutDialog_ViewBinding.class));
        oR6ReviewFragment.tvErrorDataTransaksi = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299112, "field 'tvErrorDataTransaksi'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299025, "field 'tvErrorDataTransaksi'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299143, "field 'tvErrorDataTransaksi'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299033, "field 'tvErrorDataTransaksi'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299231, "field 'tvErrorDataTransaksi'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299201, "field 'tvErrorDataTransaksi'", TextView.class));
        oR6ReviewFragment.etFormsDataBankPenerima = Utils.listFilteringNull((EditText) Utils.findRequiredViewAsType(view, 2131297030, "field 'etFormsDataBankPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297056, "field 'etFormsDataBankPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296929, "field 'etFormsDataBankPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297082, "field 'etFormsDataBankPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297034, "field 'etFormsDataBankPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296969, "field 'etFormsDataBankPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297181, "field 'etFormsDataBankPenerima'", EditText.class));
        oR6ReviewFragment.viewGroupDataBankPenerima = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297030, "field 'viewGroupDataBankPenerima'"), Utils.findRequiredView(view, 2131297056, "field 'viewGroupDataBankPenerima'"), Utils.findRequiredView(view, 2131296929, "field 'viewGroupDataBankPenerima'"), Utils.findRequiredView(view, 2131297082, "field 'viewGroupDataBankPenerima'"), Utils.findRequiredView(view, 2131297034, "field 'viewGroupDataBankPenerima'"), Utils.findRequiredView(view, 2131296969, "field 'viewGroupDataBankPenerima'"), Utils.findRequiredView(view, 2131297181, "field 'viewGroupDataBankPenerima'"));
        oR6ReviewFragment.tilFormDataBankPenerima = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298577, "field 'tilFormDataBankPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298603, "field 'tilFormDataBankPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298478, "field 'tilFormDataBankPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298628, "field 'tilFormDataBankPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298581, "field 'tilFormDataBankPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298520, "field 'tilFormDataBankPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298713, "field 'tilFormDataBankPenerima'", LogoutDialog_ViewBinding.class));
        oR6ReviewFragment.tvErrorDataBankPenerima = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299053, "field 'tvErrorDataBankPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299080, "field 'tvErrorDataBankPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298958, "field 'tvErrorDataBankPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299104, "field 'tvErrorDataBankPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299057, "field 'tvErrorDataBankPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298999, "field 'tvErrorDataBankPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299181, "field 'tvErrorDataBankPenerima'", TextView.class));
        oR6ReviewFragment.etFormsDataPenerima = Utils.listFilteringNull((EditText) Utils.findRequiredViewAsType(view, 2131297108, "field 'etFormsDataPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297066, "field 'etFormsDataPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297090, "field 'etFormsDataPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297083, "field 'etFormsDataPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296935, "field 'etFormsDataPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297038, "field 'etFormsDataPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297025, "field 'etFormsDataPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297210, "field 'etFormsDataPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297100, "field 'etFormsDataPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297218, "field 'etFormsDataPenerima'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297117, "field 'etFormsDataPenerima'", EditText.class));
        oR6ReviewFragment.viewGroupDataPenerima = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297108, "field 'viewGroupDataPenerima'"), Utils.findRequiredView(view, 2131297066, "field 'viewGroupDataPenerima'"), Utils.findRequiredView(view, 2131297090, "field 'viewGroupDataPenerima'"), Utils.findRequiredView(view, 2131297083, "field 'viewGroupDataPenerima'"), Utils.findRequiredView(view, 2131296935, "field 'viewGroupDataPenerima'"), Utils.findRequiredView(view, 2131297038, "field 'viewGroupDataPenerima'"), Utils.findRequiredView(view, 2131297025, "field 'viewGroupDataPenerima'"), Utils.findRequiredView(view, 2131297210, "field 'viewGroupDataPenerima'"), Utils.findRequiredView(view, 2131297100, "field 'viewGroupDataPenerima'"), Utils.findRequiredView(view, 2131297218, "field 'viewGroupDataPenerima'"), Utils.findRequiredView(view, 2131297117, "field 'viewGroupDataPenerima'"));
        oR6ReviewFragment.tilFormDataPenerima = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298654, "field 'tilFormDataPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298613, "field 'tilFormDataPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298636, "field 'tilFormDataPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298629, "field 'tilFormDataPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298484, "field 'tilFormDataPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298585, "field 'tilFormDataPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298571, "field 'tilFormDataPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298742, "field 'tilFormDataPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298646, "field 'tilFormDataPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298749, "field 'tilFormDataPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298663, "field 'tilFormDataPenerima'", LogoutDialog_ViewBinding.class));
        oR6ReviewFragment.tvErrorDataPenerima = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299127, "field 'tvErrorDataPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299089, "field 'tvErrorDataPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299111, "field 'tvErrorDataPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299105, "field 'tvErrorDataPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298963, "field 'tvErrorDataPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299061, "field 'tvErrorDataPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299048, "field 'tvErrorDataPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299210, "field 'tvErrorDataPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299120, "field 'tvErrorDataPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299218, "field 'tvErrorDataPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299136, "field 'tvErrorDataPenerima'", TextView.class));
        oR6ReviewFragment.etFormsDataLainnya = Utils.listFilteringNull((EditText) Utils.findRequiredViewAsType(view, 2131297027, "field 'etFormsDataLainnya'", EditText.class));
        oR6ReviewFragment.viewGroupDataLainnya = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297027, "field 'viewGroupDataLainnya'"));
        oR6ReviewFragment.tilFormDataLainnya = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298574, "field 'tilFormDataLainnya'", LogoutDialog_ViewBinding.class));
        oR6ReviewFragment.tvErrorDataLainnya = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299050, "field 'tvErrorDataLainnya'", TextView.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OR6ReviewFragment oR6ReviewFragment = this.e;
        if (oR6ReviewFragment != null) {
            this.e = null;
            oR6ReviewFragment.svMain = null;
            oR6ReviewFragment.tvNorekPengirim = null;
            oR6ReviewFragment.tvNamaPengirim = null;
            oR6ReviewFragment.tvNoHpPengirim = null;
            oR6ReviewFragment.tvNegaraTujuanTransaksi = null;
            oR6ReviewFragment.tvMataUangTransaksi = null;
            oR6ReviewFragment.tvNominalTransaksi = null;
            oR6ReviewFragment.tvFullAmountTransaksi = null;
            oR6ReviewFragment.tvValueTodayTransaksi = null;
            oR6ReviewFragment.tvJenisProduk = null;
            oR6ReviewFragment.tvKategoriTransaksi = null;
            oR6ReviewFragment.tvTujuanTransaksi = null;
            oR6ReviewFragment.tvSumberDanaTransaksi = null;
            oR6ReviewFragment.tvBeritaTransaksi = null;
            oR6ReviewFragment.tvHubunganKeuanganTransaksi = null;
            oR6ReviewFragment.llJenisProdukDisabled = null;
            oR6ReviewFragment.tvKodeSwiftBankPenerima = null;
            oR6ReviewFragment.tvNamaBankPenerima = null;
            oR6ReviewFragment.tvAlamatBankPenerima = null;
            oR6ReviewFragment.tvNegaraBagianBankPenerima = null;
            oR6ReviewFragment.tvKotaBankPenerima = null;
            oR6ReviewFragment.tvCodewordBankPenerima = null;
            oR6ReviewFragment.tvKeteranganAlamatBankPenerima = null;
            oR6ReviewFragment.llCodewordBankPenerima = null;
            oR6ReviewFragment.llKeteranganAlamatDisabled = null;
            oR6ReviewFragment.llNegaraBagianBankPenerimaDisabled = null;
            oR6ReviewFragment.llNegaraBagianBankPenerima = null;
            oR6ReviewFragment.tvNoRekeningPenerima = null;
            oR6ReviewFragment.tvNoIbanPenerima = null;
            oR6ReviewFragment.tvNamaPenerima = null;
            oR6ReviewFragment.tvNoTelpPenerima = null;
            oR6ReviewFragment.tvNegaraTujuanPenerima = null;
            oR6ReviewFragment.tvAlamatLengkapPenerima = null;
            oR6ReviewFragment.tvKotaPenerima = null;
            oR6ReviewFragment.tvNegaraBagianPenerima = null;
            oR6ReviewFragment.tvKodePosPenerima = null;
            oR6ReviewFragment.tvTipeNasabahPenerima = null;
            oR6ReviewFragment.tvTipeTujuanTransaksiPenerima = null;
            oR6ReviewFragment.llNoRekPenerimaDisabled = null;
            oR6ReviewFragment.llNoIbanDisabled = null;
            oR6ReviewFragment.llNoTelpPenerimaDisabled = null;
            oR6ReviewFragment.llAlamatPenerima = null;
            oR6ReviewFragment.llNegaraBagianPenerima = null;
            oR6ReviewFragment.llNegaraBagianPenerimaDisabled = null;
            oR6ReviewFragment.llKodePosPenerima = null;
            oR6ReviewFragment.llKodePosPenerimaDisabled = null;
            oR6ReviewFragment.llTipeTujuanTransaksiDisabled = null;
            oR6ReviewFragment.tvKodePromosi = null;
            oR6ReviewFragment.etNorekPengirim = null;
            oR6ReviewFragment.etNamaPengirim = null;
            oR6ReviewFragment.etNoHpPengirim = null;
            oR6ReviewFragment.tilNorekPengirim = null;
            oR6ReviewFragment.tilNamaPengirim = null;
            oR6ReviewFragment.tilNoHPPengirim = null;
            oR6ReviewFragment.etNegaraTujuanTransaksi = null;
            oR6ReviewFragment.etJenisMataUangTransaksi = null;
            oR6ReviewFragment.etFullAmountTransaksi = null;
            oR6ReviewFragment.etValueTodayTransaksi = null;
            oR6ReviewFragment.etJenisProdukTransaksi = null;
            oR6ReviewFragment.etNominalTransaksi = null;
            oR6ReviewFragment.etKategoriTransaksi = null;
            oR6ReviewFragment.etTujuanTransaksi = null;
            oR6ReviewFragment.etSumberDanaTransaksi = null;
            oR6ReviewFragment.etBeritaTransaksi = null;
            oR6ReviewFragment.etHubunganKeuanganTransaksi = null;
            oR6ReviewFragment.tilNegaraTujuanTransaksi = null;
            oR6ReviewFragment.tilJenisMataUangTransaksi = null;
            oR6ReviewFragment.tilNominalTransaksi = null;
            oR6ReviewFragment.tilFullAmountTransaksi = null;
            oR6ReviewFragment.tilValueTodayTransaksi = null;
            oR6ReviewFragment.tilJenisProdukTransaksi = null;
            oR6ReviewFragment.tilKategoriTransaksi = null;
            oR6ReviewFragment.tilTujuanTransaksi = null;
            oR6ReviewFragment.tilSumberDanaTransaksi = null;
            oR6ReviewFragment.tilBeritaTransaksi = null;
            oR6ReviewFragment.tilHubunganKeuanganTransaksi = null;
            oR6ReviewFragment.llNominalTransaksi = null;
            oR6ReviewFragment.etKodeSwiftBankPenerima = null;
            oR6ReviewFragment.etNamaBankPenerima = null;
            oR6ReviewFragment.etAlamatBankPenerima = null;
            oR6ReviewFragment.etNegaraBagianBankPenerima = null;
            oR6ReviewFragment.etKotaBankPenerima = null;
            oR6ReviewFragment.etCodewordBankPenerima = null;
            oR6ReviewFragment.etKeteranganAlamatBankPenerima = null;
            oR6ReviewFragment.tilKodeSwiftBankPenerima = null;
            oR6ReviewFragment.tilNamaBankPenerima = null;
            oR6ReviewFragment.tilAlamatBankPenerima = null;
            oR6ReviewFragment.tilNegaraBagianBankPenerima = null;
            oR6ReviewFragment.tilKotaBankPenerima = null;
            oR6ReviewFragment.tilCodewordBankPenerima = null;
            oR6ReviewFragment.tilKeteranganAlamatBankPenerim = null;
            oR6ReviewFragment.etNorekPenerima = null;
            oR6ReviewFragment.etNoIbanPenerima = null;
            oR6ReviewFragment.etNamaPenerima = null;
            oR6ReviewFragment.etNegaraTujuanPenerima = null;
            oR6ReviewFragment.etNegaraBagianPenerima = null;
            oR6ReviewFragment.etAlamatPenerima = null;
            oR6ReviewFragment.etKotaPenerima = null;
            oR6ReviewFragment.etKodePosPenerima = null;
            oR6ReviewFragment.etTipeNasabahPenerima = null;
            oR6ReviewFragment.etTipeTujuanTransaksiPenerima = null;
            oR6ReviewFragment.etNoTelpPenerima = null;
            oR6ReviewFragment.tilNorekPenerima = null;
            oR6ReviewFragment.tilNoIbanPenerima = null;
            oR6ReviewFragment.tilNamaPenerima = null;
            oR6ReviewFragment.tilNoTelpPenerima = null;
            oR6ReviewFragment.tilNegaraTujuanPenerima = null;
            oR6ReviewFragment.tilAlamatPenerima = null;
            oR6ReviewFragment.tilKotaPenerima = null;
            oR6ReviewFragment.tilKodePosPenerima = null;
            oR6ReviewFragment.tilNegaraBagianPenerima = null;
            oR6ReviewFragment.tilTipeNasabahPenerima = null;
            oR6ReviewFragment.tilTipeTujuanTransaksiPenerima = null;
            oR6ReviewFragment.etKodePromosi = null;
            oR6ReviewFragment.tilKodePromosi = null;
            oR6ReviewFragment.tvUbahDataPengirim = null;
            oR6ReviewFragment.tvUbahDataTransaksi = null;
            oR6ReviewFragment.tvUbahDataBankPenerima = null;
            oR6ReviewFragment.tvUbahDataPenerima = null;
            oR6ReviewFragment.tvUbahDataLainnya = null;
            oR6ReviewFragment.llHeaderPengirim = null;
            oR6ReviewFragment.llHeaderTransaksi = null;
            oR6ReviewFragment.llHeaderBankPenerima = null;
            oR6ReviewFragment.llHeaderPenerima = null;
            oR6ReviewFragment.llHeaderLainnya = null;
            oR6ReviewFragment.flLayoutDataPengirim = null;
            oR6ReviewFragment.flLayoutDataTransaksi = null;
            oR6ReviewFragment.flLayoutDataBankPenerima = null;
            oR6ReviewFragment.flLayoutDataPenerima = null;
            oR6ReviewFragment.flLayoutDataLainnya = null;
            oR6ReviewFragment.ivDataPengirim = null;
            oR6ReviewFragment.ivDataTransaksi = null;
            oR6ReviewFragment.ivDataBankPenerima = null;
            oR6ReviewFragment.ivDataPenerima = null;
            oR6ReviewFragment.ivDataLainnya = null;
            oR6ReviewFragment.llWrapperDataPengirim = null;
            oR6ReviewFragment.llDataPengirimUneditable = null;
            oR6ReviewFragment.llDataPengirimEditable = null;
            oR6ReviewFragment.llWrapperDataTransaksi = null;
            oR6ReviewFragment.llDataTransaksiEditable = null;
            oR6ReviewFragment.llDataTransaksiUneditable = null;
            oR6ReviewFragment.llWrapperDataBankPenerima = null;
            oR6ReviewFragment.llDataBankPenerimaEditable = null;
            oR6ReviewFragment.llDataBankPenerimaUneditable = null;
            oR6ReviewFragment.llWrapperDataPenerima = null;
            oR6ReviewFragment.llDataPenerimaEditable = null;
            oR6ReviewFragment.llDataPenerimaUneditable = null;
            oR6ReviewFragment.llWrapperDataLainnya = null;
            oR6ReviewFragment.llDataLainnyaEditable = null;
            oR6ReviewFragment.llDataLainnyaUneditable = null;
            oR6ReviewFragment.etFormsDataPengirim = null;
            oR6ReviewFragment.viewGroupDataPengirim = null;
            oR6ReviewFragment.tilFormDataPengirim = null;
            oR6ReviewFragment.tvErrorDataPengirim = null;
            oR6ReviewFragment.etFormsDataTransaksi = null;
            oR6ReviewFragment.viewGroupDataTransaksi = null;
            oR6ReviewFragment.tilFormDataTransaksi = null;
            oR6ReviewFragment.tvErrorDataTransaksi = null;
            oR6ReviewFragment.etFormsDataBankPenerima = null;
            oR6ReviewFragment.viewGroupDataBankPenerima = null;
            oR6ReviewFragment.tilFormDataBankPenerima = null;
            oR6ReviewFragment.tvErrorDataBankPenerima = null;
            oR6ReviewFragment.etFormsDataPenerima = null;
            oR6ReviewFragment.viewGroupDataPenerima = null;
            oR6ReviewFragment.tilFormDataPenerima = null;
            oR6ReviewFragment.tvErrorDataPenerima = null;
            oR6ReviewFragment.etFormsDataLainnya = null;
            oR6ReviewFragment.viewGroupDataLainnya = null;
            oR6ReviewFragment.tilFormDataLainnya = null;
            oR6ReviewFragment.tvErrorDataLainnya = null;
            this.y.setOnClickListener(null);
            this.y.setOnFocusChangeListener(null);
            this.y = null;
            this.s.setOnFocusChangeListener(null);
            this.s = null;
            this.u.setOnFocusChangeListener(null);
            this.u = null;
            this.D.setOnFocusChangeListener(null);
            this.D = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.H.setOnClickListener(null);
            this.H = null;
            this.z.setOnClickListener(null);
            this.z = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.m.setOnFocusChangeListener(null);
            this.m = null;
            this.l.setOnFocusChangeListener(null);
            this.l = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.q.setOnFocusChangeListener(null);
            this.q = null;
            this.k.setOnFocusChangeListener(null);
            this.k = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.A.setOnFocusChangeListener(null);
            this.A = null;
            this.v.setOnFocusChangeListener(null);
            this.v = null;
            this.w.setOnFocusChangeListener(null);
            this.w = null;
            this.t.setOnFocusChangeListener(null);
            this.t = null;
            this.r.setOnClickListener(null);
            this.r = null;
            this.p.setOnClickListener(null);
            this.p = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.f45o.setOnFocusChangeListener(null);
            this.f45o = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.B.setOnClickListener(null);
            this.B = null;
            this.C.setOnClickListener(null);
            this.C = null;
            this.x.setOnFocusChangeListener(null);
            this.x = null;
            this.n.setOnFocusChangeListener(null);
            this.n = null;
            this.Q.setOnClickListener(null);
            this.Q = null;
            this.T.setOnClickListener(null);
            this.T = null;
            this.O.setOnClickListener(null);
            this.O = null;
            this.S.setOnClickListener(null);
            this.S = null;
            this.P.setOnClickListener(null);
            this.P = null;
            this.E.setOnClickListener(null);
            this.E = null;
            this.L.setOnClickListener(null);
            this.L = null;
            this.I.setOnClickListener(null);
            this.I = null;
            this.F.setOnClickListener(null);
            this.F = null;
            this.G.setOnClickListener(null);
            this.G = null;
            this.N.setOnClickListener(null);
            this.N = null;
            this.R.setOnClickListener(null);
            this.R = null;
            this.M.setOnClickListener(null);
            this.M = null;
            this.J.setOnClickListener(null);
            this.J = null;
            this.K.setOnClickListener(null);
            this.K = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
