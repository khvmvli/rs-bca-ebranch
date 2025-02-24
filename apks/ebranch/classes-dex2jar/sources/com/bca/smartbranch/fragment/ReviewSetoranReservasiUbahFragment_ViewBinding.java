package com.bca.smartbranch.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.copyWindowDataInto;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ReviewSetoranReservasiUbahFragment_ViewBinding.class */
public class ReviewSetoranReservasiUbahFragment_ViewBinding implements Unbinder {
    private View A;
    private View B;
    private View C;
    private View D;
    private View E;
    private View F;
    private View G;
    private View H;
    private View I;
    private View L;
    private View N;
    private View a;
    private View b;
    private View c;
    private ReviewSetoranReservasiUbahFragment d;
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
    private View f57o;
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

    public ReviewSetoranReservasiUbahFragment_ViewBinding(final ReviewSetoranReservasiUbahFragment reviewSetoranReservasiUbahFragment, View view) {
        this.d = reviewSetoranReservasiUbahFragment;
        reviewSetoranReservasiUbahFragment.tvPenerimaNama = (TextView) Utils.findRequiredViewAsType(view, 2131299519, "field 'tvPenerimaNama'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPenerimaNorek = (TextView) Utils.findRequiredViewAsType(view, 2131299520, "field 'tvPenerimaNorek'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPenerimaSimpanNama = (TextView) Utils.findRequiredViewAsType(view, 2131299521, "field 'tvPenerimaSimpanNama'", TextView.class);
        reviewSetoranReservasiUbahFragment.rlPenerimaSimpanNamaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298289, "field 'rlPenerimaSimpanNamaDisabled'", RelativeLayout.class);
        reviewSetoranReservasiUbahFragment.tvTransaksiJumlah = (TextView) Utils.findRequiredViewAsType(view, 2131299316, "field 'tvTransaksiJumlah'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvTransaksiBerita = (TextView) Utils.findRequiredViewAsType(view, 2131298847, "field 'tvTransaksiBerita'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvBerkalaSetiap = (TextView) Utils.findRequiredViewAsType(view, 2131299569, "field 'tvBerkalaSetiap'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvBerkalaTanggalBerakhir = (TextView) Utils.findRequiredViewAsType(view, 2131299595, "field 'tvBerkalaTanggalBerakhir'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvBerkalaTitleSetiap = (TextView) Utils.findRequiredViewAsType(view, 2131299665, "field 'tvBerkalaTitleSetiap'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimPemilikSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299530, "field 'tvPengirimPemilikSumberDana'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimJenisId = (TextView) Utils.findRequiredViewAsType(view, 2131299525, "field 'tvPengirimJenisId'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimNama = (TextView) Utils.findRequiredViewAsType(view, 2131299526, "field 'tvPengirimNama'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimNoId = (TextView) Utils.findRequiredViewAsType(view, 2131299528, "field 'tvPengirimNoId'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimNoRek = (TextView) Utils.findRequiredViewAsType(view, 2131299529, "field 'tvPengirimNoRek'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131299524, "field 'tvPengirimAlamat'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimNoHp = (TextView) Utils.findRequiredViewAsType(view, 2131299527, "field 'tvPengirimNoHp'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299531, "field 'tvPengirimSumberDana'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimTujuanTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299535, "field 'tvPengirimTujuanTransaksi'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimTitleNoId = (TextView) Utils.findRequiredViewAsType(view, 2131299534, "field 'tvPengirimTitleNoId'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimTitleAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131299532, "field 'tvPengirimTitleAlamat'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvPengirimTitleNama = (TextView) Utils.findRequiredViewAsType(view, 2131299533, "field 'tvPengirimTitleNama'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvOrangSamaDenganPemilikSD = (TextView) Utils.findRequiredViewAsType(view, 2131299507, "field 'tvOrangSamaDenganPemilikSD'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvOrangJenisID = (TextView) Utils.findRequiredViewAsType(view, 2131299504, "field 'tvOrangJenisID'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvOrangNama = (TextView) Utils.findRequiredViewAsType(view, 2131299505, "field 'tvOrangNama'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvOrangNomorID = (TextView) Utils.findRequiredViewAsType(view, 2131299506, "field 'tvOrangNomorID'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvOrangTitleNama = (TextView) Utils.findRequiredViewAsType(view, 2131299508, "field 'tvOrangTitleNama'", TextView.class);
        reviewSetoranReservasiUbahFragment.tvOrangTitleNomorID = (TextView) Utils.findRequiredViewAsType(view, 2131299509, "field 'tvOrangTitleNomorID'", TextView.class);
        reviewSetoranReservasiUbahFragment.rlPengirimPemilikSumberDanaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298296, "field 'rlPengirimPemilikSumberDanaDisabled'", RelativeLayout.class);
        reviewSetoranReservasiUbahFragment.rlPengirimJenisIdDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298291, "field 'rlPengirimJenisIdDisabled'", RelativeLayout.class);
        reviewSetoranReservasiUbahFragment.rlPengirimNamaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298292, "field 'rlPengirimNamaDisabled'", RelativeLayout.class);
        reviewSetoranReservasiUbahFragment.rlPengirimNoIdDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298294, "field 'rlPengirimNoIdDisabled'", RelativeLayout.class);
        reviewSetoranReservasiUbahFragment.rlPengirimNorekDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298295, "field 'rlPengirimNorekDisabled'", RelativeLayout.class);
        reviewSetoranReservasiUbahFragment.rlPengirimAlamatDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298290, "field 'rlPengirimAlamatDisabled'", RelativeLayout.class);
        reviewSetoranReservasiUbahFragment.rlPengirimNoHpDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298293, "field 'rlPengirimNoHpDisabled'", RelativeLayout.class);
        reviewSetoranReservasiUbahFragment.rlPengirimSumberDanaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298297, "field 'rlPengirimSumberDanaDisabled'", RelativeLayout.class);
        reviewSetoranReservasiUbahFragment.rlPengirimTujuanDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298298, "field 'rlPengirimTujuanDisabled'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297142, "field 'etNamaPenerima' and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etNamaPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView, 2131297142, "field 'etNamaPenerima'", AutoCompleteTextView.class);
        this.j = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297143, "field 'etNoRekPenerima' and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etNoRekPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView2, 2131297143, "field 'etNoRekPenerima'", AutoCompleteTextView.class);
        this.n = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.15
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297144, "field 'etSimpanNama' and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etSimpanNama = (EditText) Utils.castView(findRequiredView3, 2131297144, "field 'etSimpanNama'", EditText.class);
        this.l = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.23
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranReservasiUbahFragment.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilSimpanNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298714, "field 'tilSimpanNama'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.etJumlahSetoran = (EditText) Utils.findRequiredViewAsType(view, 2131297006, "field 'etJumlahSetoran'", EditText.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296954, "field 'etBeritaSetoran' and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etBeritaSetoran = (EditText) Utils.castView(findRequiredView4, 2131296954, "field 'etBeritaSetoran'", EditText.class);
        this.b = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.35
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranReservasiUbahFragment.tilJumlah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilJumlah'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilBerita = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298504, "field 'tilBerita'", LogoutDialog_ViewBinding.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131297178, "field 'etSetiapBeberapaHari', method 'updateDaftarTransfer', and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etSetiapBeberapaHari = (EditText) Utils.castView(findRequiredView5, 2131297178, "field 'etSetiapBeberapaHari'", EditText.class);
        this.s = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.33
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.updateDaftarTransfer(view2);
            }
        });
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.34
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranReservasiUbahFragment.tvErrorSetiapBeberapaHari = (TextView) Utils.findRequiredViewAsType(view, 2131299180, "field 'tvErrorSetiapBeberapaHari'", TextView.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131297203, "field 'etTanggalBerakhir' and method 'updateDaftarTransfer'");
        reviewSetoranReservasiUbahFragment.etTanggalBerakhir = (EditText) Utils.castView(findRequiredView6, 2131297203, "field 'etTanggalBerakhir'", EditText.class);
        this.y = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.32
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.updateDaftarTransfer(view2);
            }
        });
        reviewSetoranReservasiUbahFragment.tilSetiapBeberapaHari = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298712, "field 'tilSetiapBeberapaHari'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilTanggalBerakhir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298735, "field 'tilTanggalBerakhir'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.etPengirimPemilikSumberDana = (EditText) Utils.findRequiredViewAsType(view, 2131297152, "field 'etPengirimPemilikSumberDana'", EditText.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297148, "field 'etJenisId' and method 'clickJenisIdentitasPemilikSumberDana'");
        reviewSetoranReservasiUbahFragment.etJenisId = (EditText) Utils.castView(findRequiredView7, 2131297148, "field 'etJenisId'", EditText.class);
        this.k = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.38
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.clickJenisIdentitasPemilikSumberDana(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297149, "field 'etNamaPengirim' and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etNamaPengirim = (EditText) Utils.castView(findRequiredView8, 2131297149, "field 'etNamaPengirim'", EditText.class);
        this.f57o = findRequiredView8;
        findRequiredView8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.36
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297151, "field 'etNoIDPengirim' and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etNoIDPengirim = (EditText) Utils.castView(findRequiredView9, 2131297151, "field 'etNoIDPengirim'", EditText.class);
        this.p = findRequiredView9;
        findRequiredView9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297134, "field 'etNorekPengirim' and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etNorekPengirim = (EditText) Utils.castView(findRequiredView10, 2131297134, "field 'etNorekPengirim'", EditText.class);
        this.c = findRequiredView10;
        findRequiredView10.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297147, "field 'etAlamatPengirim' and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etAlamatPengirim = (EditText) Utils.castView(findRequiredView11, 2131297147, "field 'etAlamatPengirim'", EditText.class);
        this.m = findRequiredView11;
        findRequiredView11.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297150, "field 'etNoHpPengirim' and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etNoHpPengirim = (EditText) Utils.castView(findRequiredView12, 2131297150, "field 'etNoHpPengirim'", EditText.class);
        this.r = findRequiredView12;
        findRequiredView12.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297153, "field 'etPengirimSumberDana' and method 'clickView'");
        reviewSetoranReservasiUbahFragment.etPengirimSumberDana = (EditText) Utils.castView(findRequiredView13, 2131297153, "field 'etPengirimSumberDana'", EditText.class);
        this.q = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.clickView(view2);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297154, "field 'etPengirimTujuanTransaksi' and method 'clickView'");
        reviewSetoranReservasiUbahFragment.etPengirimTujuanTransaksi = (EditText) Utils.castView(findRequiredView14, 2131297154, "field 'etPengirimTujuanTransaksi'", EditText.class);
        this.t = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.clickView(view2);
            }
        });
        reviewSetoranReservasiUbahFragment.llData100TransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297573, "field 'llData100TransaksiSetoran'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.tilJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilJenisId'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilNoId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilNoId'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilNamaLengkap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilNamaLengkap'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilNorekPengirim = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298679, "field 'tilNorekPengirim'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilALamatLengkap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298481, "field 'tilALamatLengkap'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilPengirimSumberDana = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298689, "field 'tilPengirimSumberDana'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilPengirimTujuanTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298690, "field 'tilPengirimTujuanTransaksi'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilPemilikSumberDana = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298685, "field 'tilPemilikSumberDana'", LogoutDialog_ViewBinding.class);
        View findRequiredView15 = Utils.findRequiredView(view, 2131297138, "field 'etOrangSamaDenganPemilik' and method 'clickOrangSamaDenganPemilik'");
        reviewSetoranReservasiUbahFragment.etOrangSamaDenganPemilik = (EditText) Utils.castView(findRequiredView15, 2131297138, "field 'etOrangSamaDenganPemilik'", EditText.class);
        this.f = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.clickOrangSamaDenganPemilik(view2);
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131297135, "field 'etOrangJenisId' and method 'clickJenisIdentitas'");
        reviewSetoranReservasiUbahFragment.etOrangJenisId = (EditText) Utils.castView(findRequiredView16, 2131297135, "field 'etOrangJenisId'", EditText.class);
        this.g = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.clickJenisIdentitas(view2);
            }
        });
        View findRequiredView17 = Utils.findRequiredView(view, 2131297137, "field 'etOrangNoID' and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etOrangNoID = (EditText) Utils.castView(findRequiredView17, 2131297137, "field 'etOrangNoID'", EditText.class);
        this.i = findRequiredView17;
        findRequiredView17.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView18 = Utils.findRequiredView(view, 2131297136, "field 'etOrangNama' and method 'inputChangePenerima'");
        reviewSetoranReservasiUbahFragment.etOrangNama = (EditText) Utils.castView(findRequiredView18, 2131297136, "field 'etOrangNama'", EditText.class);
        this.h = findRequiredView18;
        findRequiredView18.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.11
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranReservasiUbahFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranReservasiUbahFragment.tilOrangSamaDenganPemilik = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298683, "field 'tilOrangSamaDenganPemilik'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilOrangJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298680, "field 'tilOrangJenisId'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilOrangNoId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298682, "field 'tilOrangNoId'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.tilOrangNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298681, "field 'tilOrangNama'", LogoutDialog_ViewBinding.class);
        reviewSetoranReservasiUbahFragment.formJenisIdentitas = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297257, "field 'formJenisIdentitas'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llUneditableBedaDenganPemilikSumberDana = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297928, "field 'llUneditableBedaDenganPemilikSumberDana'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.rlOrangSamaDenganPemilikSdUneditable = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298286, "field 'rlOrangSamaDenganPemilikSdUneditable'", RelativeLayout.class);
        reviewSetoranReservasiUbahFragment.llWrapperDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297948, "field 'llWrapperDataPenerima'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llHeaderDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297665, "field 'llHeaderDataPenerima'", LinearLayout.class);
        View findRequiredView19 = Utils.findRequiredView(view, 2131297344, "field 'ivDataPenerima' and method 'showDataPenerima'");
        reviewSetoranReservasiUbahFragment.ivDataPenerima = (ImageView) Utils.castView(findRequiredView19, 2131297344, "field 'ivDataPenerima'", ImageView.class);
        this.w = findRequiredView19;
        findRequiredView19.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.showDataPenerima(view2);
            }
        });
        reviewSetoranReservasiUbahFragment.llWrapperTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297963, "field 'llWrapperTransaksiSetoran'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llHeaderTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297678, "field 'llHeaderTransaksiSetoran'", LinearLayout.class);
        View findRequiredView20 = Utils.findRequiredView(view, 2131297419, "field 'ivTransaksiSetoran' and method 'showDataTransaksiSetoran'");
        reviewSetoranReservasiUbahFragment.ivTransaksiSetoran = (ImageView) Utils.castView(findRequiredView20, 2131297419, "field 'ivTransaksiSetoran'", ImageView.class);
        this.u = findRequiredView20;
        findRequiredView20.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.showDataTransaksiSetoran(view2);
            }
        });
        reviewSetoranReservasiUbahFragment.llWrapperTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297964, "field 'llWrapperTransferBerkala'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llHeaderTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297679, "field 'llHeaderTransferBerkala'", LinearLayout.class);
        View findRequiredView21 = Utils.findRequiredView(view, 2131297420, "field 'ivTransferBerkala' and method 'showDataTransaksiBerkala'");
        reviewSetoranReservasiUbahFragment.ivTransferBerkala = (ImageView) Utils.castView(findRequiredView21, 2131297420, "field 'ivTransferBerkala'", ImageView.class);
        this.z = findRequiredView21;
        findRequiredView21.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.showDataTransaksiBerkala(view2);
            }
        });
        reviewSetoranReservasiUbahFragment.llWrapperPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297954, "field 'llWrapperPengirim'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llHeaderPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297671, "field 'llHeaderPengirim'", LinearLayout.class);
        View findRequiredView22 = Utils.findRequiredView(view, 2131297350, "field 'ivPengirim' and method 'showDataPengirim'");
        reviewSetoranReservasiUbahFragment.ivPengirim = (ImageView) Utils.castView(findRequiredView22, 2131297350, "field 'ivPengirim'", ImageView.class);
        this.v = findRequiredView22;
        findRequiredView22.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.16
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.showDataPengirim(view2);
            }
        });
        reviewSetoranReservasiUbahFragment.llWrapperDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297946, "field 'llWrapperDataOrangDatangKeCabang'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llHeaderDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297663, "field 'llHeaderDataOrangDatangKeCabang'", LinearLayout.class);
        View findRequiredView23 = Utils.findRequiredView(view, 2131297342, "field 'ivDataOrangDatangKeCabang' and method 'showDataOrangDatangKeCabang'");
        reviewSetoranReservasiUbahFragment.ivDataOrangDatangKeCabang = (ImageView) Utils.castView(findRequiredView23, 2131297342, "field 'ivDataOrangDatangKeCabang'", ImageView.class);
        this.x = findRequiredView23;
        findRequiredView23.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.17
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.showDataOrangDatangKeCabang(view2);
            }
        });
        reviewSetoranReservasiUbahFragment.llLayoutDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297465, "field 'llLayoutDataPenerima'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llLayoutTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297503, "field 'llLayoutTransaksiSetoran'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llLayoutTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297504, "field 'llLayoutTransferBerkala'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llLayoutPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297473, "field 'llLayoutPengirim'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llLayoutDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297461, "field 'llLayoutDataOrangDatangKeCabang'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llDataPenerimaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297599, "field 'llDataPenerimaDisabled'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llDataTransaksiSetoranDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297611, "field 'llDataTransaksiSetoranDisabled'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llDataTransferBerkalaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297607, "field 'llDataTransferBerkalaDisabled'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llDataPengirimDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297602, "field 'llDataPengirimDisabled'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llDataOrangDatangKeCabangDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297586, "field 'llDataOrangDatangKeCabangDisabled'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297588, "field 'llDataPenerima'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llDataTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297610, "field 'llDataTransaksiSetoran'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llDataTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297606, "field 'llDataTransferBerkala'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llDataPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297600, "field 'llDataPengirim'", LinearLayout.class);
        reviewSetoranReservasiUbahFragment.llDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297585, "field 'llDataOrangDatangKeCabang'", LinearLayout.class);
        View findRequiredView24 = Utils.findRequiredView(view, 2131299714, "field 'tvUbahPenerima' and method 'onClickUbahDataPenerima'");
        reviewSetoranReservasiUbahFragment.tvUbahPenerima = (TextView) Utils.castView(findRequiredView24, 2131299714, "field 'tvUbahPenerima'", TextView.class);
        this.H = findRequiredView24;
        findRequiredView24.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.20
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.onClickUbahDataPenerima(view2);
            }
        });
        View findRequiredView25 = Utils.findRequiredView(view, 2131299727, "field 'tvUbahTransaksiSetoran' and method 'onClickUbahTransaksiSetoran'");
        reviewSetoranReservasiUbahFragment.tvUbahTransaksiSetoran = (TextView) Utils.castView(findRequiredView25, 2131299727, "field 'tvUbahTransaksiSetoran'", TextView.class);
        this.N = findRequiredView25;
        findRequiredView25.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.19
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.onClickUbahTransaksiSetoran(view2);
            }
        });
        View findRequiredView26 = Utils.findRequiredView(view, 2131299728, "field 'tvUbahTransaksiBerkala' and method 'onClickUbahTransferBerkala'");
        reviewSetoranReservasiUbahFragment.tvUbahTransaksiBerkala = (TextView) Utils.castView(findRequiredView26, 2131299728, "field 'tvUbahTransaksiBerkala'", TextView.class);
        this.L = findRequiredView26;
        findRequiredView26.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.18
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.onClickUbahTransferBerkala(view2);
            }
        });
        View findRequiredView27 = Utils.findRequiredView(view, 2131299720, "field 'tvUbahPengirim' and method 'onClickUbahDataPengirim'");
        reviewSetoranReservasiUbahFragment.tvUbahPengirim = (TextView) Utils.castView(findRequiredView27, 2131299720, "field 'tvUbahPengirim'", TextView.class);
        this.I = findRequiredView27;
        findRequiredView27.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.21
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.onClickUbahDataPengirim(view2);
            }
        });
        View findRequiredView28 = Utils.findRequiredView(view, 2131299712, "field 'tvUbahDataOrangDatangKeCabang' and method 'onClickUbahDataOrangDatangKeCabang'");
        reviewSetoranReservasiUbahFragment.tvUbahDataOrangDatangKeCabang = (TextView) Utils.castView(findRequiredView28, 2131299712, "field 'tvUbahDataOrangDatangKeCabang'", TextView.class);
        this.G = findRequiredView28;
        findRequiredView28.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.22
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.onClickUbahDataOrangDatangKeCabang(view2);
            }
        });
        View findRequiredView29 = Utils.findRequiredView(view, 2131296469, "field 'cbxAgree' and method 'checkboxAgree'");
        reviewSetoranReservasiUbahFragment.cbxAgree = (CheckBox) Utils.castView(findRequiredView29, 2131296469, "field 'cbxAgree'", CheckBox.class);
        this.a = findRequiredView29;
        ((CompoundButton) findRequiredView29).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.25
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                reviewSetoranReservasiUbahFragment.checkboxAgree(compoundButton, z);
            }
        });
        View findRequiredView30 = Utils.findRequiredView(view, 2131299604, "field 'tvTermCondition' and method 'clickedTermsCondition'");
        reviewSetoranReservasiUbahFragment.tvTermCondition = (TextView) Utils.castView(findRequiredView30, 2131299604, "field 'tvTermCondition'", TextView.class);
        this.D = findRequiredView30;
        findRequiredView30.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.24
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.clickedTermsCondition(view2);
            }
        });
        reviewSetoranReservasiUbahFragment.llSyaratKetentuan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297904, "field 'llSyaratKetentuan'", LinearLayout.class);
        View findRequiredView31 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'onClicedButton'");
        reviewSetoranReservasiUbahFragment.btnProses = (Button) Utils.castView(findRequiredView31, 2131296440, "field 'btnProses'", Button.class);
        this.e = findRequiredView31;
        findRequiredView31.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.26
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.onClicedButton(view2);
            }
        });
        reviewSetoranReservasiUbahFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView32 = Utils.findRequiredView(view, 2131298904, "method 'showDataPenerima'");
        this.B = findRequiredView32;
        findRequiredView32.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.30
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.showDataPenerima(view2);
            }
        });
        View findRequiredView33 = Utils.findRequiredView(view, 2131299691, "method 'showDataTransaksiSetoran'");
        this.E = findRequiredView33;
        findRequiredView33.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.27
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.showDataTransaksiSetoran(view2);
            }
        });
        View findRequiredView34 = Utils.findRequiredView(view, 2131298910, "method 'showDataPengirim'");
        this.A = findRequiredView34;
        findRequiredView34.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.28
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.showDataPengirim(view2);
            }
        });
        View findRequiredView35 = Utils.findRequiredView(view, 2131298902, "method 'showDataOrangDatangKeCabang'");
        this.C = findRequiredView35;
        findRequiredView35.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.29
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.showDataOrangDatangKeCabang(view2);
            }
        });
        View findRequiredView36 = Utils.findRequiredView(view, 2131299693, "method 'showDataTransaksiBerkala'");
        this.F = findRequiredView36;
        findRequiredView36.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranReservasiUbahFragment_ViewBinding.31
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranReservasiUbahFragment.showDataTransaksiBerkala(view2);
            }
        });
        reviewSetoranReservasiUbahFragment.viewGroupPenerima = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297142, "field 'viewGroupPenerima'"), Utils.findRequiredView(view, 2131297143, "field 'viewGroupPenerima'"), Utils.findRequiredView(view, 2131297144, "field 'viewGroupPenerima'"));
        reviewSetoranReservasiUbahFragment.tvErrorsPenerima = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299078, "field 'tvErrorsPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrorsPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299182, "field 'tvErrorsPenerima'", TextView.class));
        reviewSetoranReservasiUbahFragment.tilFormsPenerima = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298714, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class));
        reviewSetoranReservasiUbahFragment.viewGroupTransaksiSetoran = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296954, "field 'viewGroupTransaksiSetoran'"));
        reviewSetoranReservasiUbahFragment.tilFormsSetoran = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilFormsSetoran'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298504, "field 'tilFormsSetoran'", LogoutDialog_ViewBinding.class));
        reviewSetoranReservasiUbahFragment.viewGroupTransaksiBerkala = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297178, "field 'viewGroupTransaksiBerkala'"), Utils.findRequiredView(view, 2131297203, "field 'viewGroupTransaksiBerkala'"));
        reviewSetoranReservasiUbahFragment.tilFormsTransaksiBerkala = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298712, "field 'tilFormsTransaksiBerkala'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298735, "field 'tilFormsTransaksiBerkala'", LogoutDialog_ViewBinding.class));
        reviewSetoranReservasiUbahFragment.viewGroupPengirim = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297148, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297151, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297149, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297134, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297147, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297150, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297153, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297154, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297152, "field 'viewGroupPengirim'"));
        reviewSetoranReservasiUbahFragment.tvErrorsPengirim = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299157, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299121, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299086, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299148, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298961, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299199, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299231, "field 'tvErrorsPengirim'", TextView.class));
        reviewSetoranReservasiUbahFragment.tilFormsPengirim = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298679, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298481, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298689, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298690, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298685, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class));
        reviewSetoranReservasiUbahFragment.viewGroupOrangDatangKeCabang = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297138, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131298680, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131297137, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131297136, "field 'viewGroupOrangDatangKeCabang'"));
        reviewSetoranReservasiUbahFragment.tvErrorsOrangDatangKeCabang = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299152, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299149, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299151, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299150, "field 'tvErrorsOrangDatangKeCabang'", TextView.class));
        reviewSetoranReservasiUbahFragment.tilFormsOrangDatangKeCabang = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298683, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298680, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298682, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298681, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class));
        Context context = view.getContext();
        Resources resources = context.getResources();
        reviewSetoranReservasiUbahFragment.arrayHari = resources.getStringArray(2130903059);
        reviewSetoranReservasiUbahFragment.colorPaleGrey = copyWindowDataInto.a(context, 2131099821);
        reviewSetoranReservasiUbahFragment.colorPaleBlue = copyWindowDataInto.a(context, 2131099820);
        reviewSetoranReservasiUbahFragment.labelSetiapBeberapaHari = resources.getString(2131821580);
        reviewSetoranReservasiUbahFragment.labelSetiapHari = resources.getString(2131821581);
        reviewSetoranReservasiUbahFragment.labelSetiapTanggal = resources.getString(2131821582);
        reviewSetoranReservasiUbahFragment.nomorKtp = resources.getString(2131821553);
        reviewSetoranReservasiUbahFragment.nomorPaspor = resources.getString(2131821556);
        reviewSetoranReservasiUbahFragment.nomorRekening = resources.getString(2131821949);
        reviewSetoranReservasiUbahFragment.labelKtp = resources.getString(2131821815);
        reviewSetoranReservasiUbahFragment.labelPaspor = resources.getString(2131821986);
        reviewSetoranReservasiUbahFragment.labelSiupNib = resources.getString(2131822122);
        reviewSetoranReservasiUbahFragment.labelRekening = resources.getString(2131822074);
        reviewSetoranReservasiUbahFragment.namaSesuaiKtp = resources.getString(2131821933);
        reviewSetoranReservasiUbahFragment.namaSesuaiPaspor = resources.getString(2131821530);
        reviewSetoranReservasiUbahFragment.namaRekening = resources.getString(2131821919);
        reviewSetoranReservasiUbahFragment.namaPerusahaan = resources.getString(2131821931);
        reviewSetoranReservasiUbahFragment.alamatSesuaiKtp = resources.getString(2131821060);
        reviewSetoranReservasiUbahFragment.alamatSesuaiPaspor = resources.getString(2131821061);
        reviewSetoranReservasiUbahFragment.nomorSiupNib = resources.getString(2131821192);
        reviewSetoranReservasiUbahFragment.txtTermCondition = resources.getString(2131821427);
        reviewSetoranReservasiUbahFragment.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReviewSetoranReservasiUbahFragment reviewSetoranReservasiUbahFragment = this.d;
        if (reviewSetoranReservasiUbahFragment != null) {
            this.d = null;
            reviewSetoranReservasiUbahFragment.tvPenerimaNama = null;
            reviewSetoranReservasiUbahFragment.tvPenerimaNorek = null;
            reviewSetoranReservasiUbahFragment.tvPenerimaSimpanNama = null;
            reviewSetoranReservasiUbahFragment.rlPenerimaSimpanNamaDisabled = null;
            reviewSetoranReservasiUbahFragment.tvTransaksiJumlah = null;
            reviewSetoranReservasiUbahFragment.tvTransaksiBerita = null;
            reviewSetoranReservasiUbahFragment.tvBerkalaSetiap = null;
            reviewSetoranReservasiUbahFragment.tvBerkalaTanggalBerakhir = null;
            reviewSetoranReservasiUbahFragment.tvBerkalaTitleSetiap = null;
            reviewSetoranReservasiUbahFragment.tvPengirimPemilikSumberDana = null;
            reviewSetoranReservasiUbahFragment.tvPengirimJenisId = null;
            reviewSetoranReservasiUbahFragment.tvPengirimNama = null;
            reviewSetoranReservasiUbahFragment.tvPengirimNoId = null;
            reviewSetoranReservasiUbahFragment.tvPengirimNoRek = null;
            reviewSetoranReservasiUbahFragment.tvPengirimAlamat = null;
            reviewSetoranReservasiUbahFragment.tvPengirimNoHp = null;
            reviewSetoranReservasiUbahFragment.tvPengirimSumberDana = null;
            reviewSetoranReservasiUbahFragment.tvPengirimTujuanTransaksi = null;
            reviewSetoranReservasiUbahFragment.tvPengirimTitleNoId = null;
            reviewSetoranReservasiUbahFragment.tvPengirimTitleAlamat = null;
            reviewSetoranReservasiUbahFragment.tvPengirimTitleNama = null;
            reviewSetoranReservasiUbahFragment.tvOrangSamaDenganPemilikSD = null;
            reviewSetoranReservasiUbahFragment.tvOrangJenisID = null;
            reviewSetoranReservasiUbahFragment.tvOrangNama = null;
            reviewSetoranReservasiUbahFragment.tvOrangNomorID = null;
            reviewSetoranReservasiUbahFragment.tvOrangTitleNama = null;
            reviewSetoranReservasiUbahFragment.tvOrangTitleNomorID = null;
            reviewSetoranReservasiUbahFragment.rlPengirimPemilikSumberDanaDisabled = null;
            reviewSetoranReservasiUbahFragment.rlPengirimJenisIdDisabled = null;
            reviewSetoranReservasiUbahFragment.rlPengirimNamaDisabled = null;
            reviewSetoranReservasiUbahFragment.rlPengirimNoIdDisabled = null;
            reviewSetoranReservasiUbahFragment.rlPengirimNorekDisabled = null;
            reviewSetoranReservasiUbahFragment.rlPengirimAlamatDisabled = null;
            reviewSetoranReservasiUbahFragment.rlPengirimNoHpDisabled = null;
            reviewSetoranReservasiUbahFragment.rlPengirimSumberDanaDisabled = null;
            reviewSetoranReservasiUbahFragment.rlPengirimTujuanDisabled = null;
            reviewSetoranReservasiUbahFragment.etNamaPenerima = null;
            reviewSetoranReservasiUbahFragment.etNoRekPenerima = null;
            reviewSetoranReservasiUbahFragment.etSimpanNama = null;
            reviewSetoranReservasiUbahFragment.tilNama = null;
            reviewSetoranReservasiUbahFragment.tilNorek = null;
            reviewSetoranReservasiUbahFragment.tilSimpanNama = null;
            reviewSetoranReservasiUbahFragment.etJumlahSetoran = null;
            reviewSetoranReservasiUbahFragment.etBeritaSetoran = null;
            reviewSetoranReservasiUbahFragment.tilJumlah = null;
            reviewSetoranReservasiUbahFragment.tilBerita = null;
            reviewSetoranReservasiUbahFragment.etSetiapBeberapaHari = null;
            reviewSetoranReservasiUbahFragment.tvErrorSetiapBeberapaHari = null;
            reviewSetoranReservasiUbahFragment.etTanggalBerakhir = null;
            reviewSetoranReservasiUbahFragment.tilSetiapBeberapaHari = null;
            reviewSetoranReservasiUbahFragment.tilTanggalBerakhir = null;
            reviewSetoranReservasiUbahFragment.etPengirimPemilikSumberDana = null;
            reviewSetoranReservasiUbahFragment.etJenisId = null;
            reviewSetoranReservasiUbahFragment.etNamaPengirim = null;
            reviewSetoranReservasiUbahFragment.etNoIDPengirim = null;
            reviewSetoranReservasiUbahFragment.etNorekPengirim = null;
            reviewSetoranReservasiUbahFragment.etAlamatPengirim = null;
            reviewSetoranReservasiUbahFragment.etNoHpPengirim = null;
            reviewSetoranReservasiUbahFragment.etPengirimSumberDana = null;
            reviewSetoranReservasiUbahFragment.etPengirimTujuanTransaksi = null;
            reviewSetoranReservasiUbahFragment.llData100TransaksiSetoran = null;
            reviewSetoranReservasiUbahFragment.tilJenisId = null;
            reviewSetoranReservasiUbahFragment.tilNoId = null;
            reviewSetoranReservasiUbahFragment.tilNamaLengkap = null;
            reviewSetoranReservasiUbahFragment.tilNorekPengirim = null;
            reviewSetoranReservasiUbahFragment.tilALamatLengkap = null;
            reviewSetoranReservasiUbahFragment.tilNoHp = null;
            reviewSetoranReservasiUbahFragment.tilPengirimSumberDana = null;
            reviewSetoranReservasiUbahFragment.tilPengirimTujuanTransaksi = null;
            reviewSetoranReservasiUbahFragment.tilPemilikSumberDana = null;
            reviewSetoranReservasiUbahFragment.etOrangSamaDenganPemilik = null;
            reviewSetoranReservasiUbahFragment.etOrangJenisId = null;
            reviewSetoranReservasiUbahFragment.etOrangNoID = null;
            reviewSetoranReservasiUbahFragment.etOrangNama = null;
            reviewSetoranReservasiUbahFragment.tilOrangSamaDenganPemilik = null;
            reviewSetoranReservasiUbahFragment.tilOrangJenisId = null;
            reviewSetoranReservasiUbahFragment.tilOrangNoId = null;
            reviewSetoranReservasiUbahFragment.tilOrangNama = null;
            reviewSetoranReservasiUbahFragment.formJenisIdentitas = null;
            reviewSetoranReservasiUbahFragment.llUneditableBedaDenganPemilikSumberDana = null;
            reviewSetoranReservasiUbahFragment.rlOrangSamaDenganPemilikSdUneditable = null;
            reviewSetoranReservasiUbahFragment.llWrapperDataPenerima = null;
            reviewSetoranReservasiUbahFragment.llHeaderDataPenerima = null;
            reviewSetoranReservasiUbahFragment.ivDataPenerima = null;
            reviewSetoranReservasiUbahFragment.llWrapperTransaksiSetoran = null;
            reviewSetoranReservasiUbahFragment.llHeaderTransaksiSetoran = null;
            reviewSetoranReservasiUbahFragment.ivTransaksiSetoran = null;
            reviewSetoranReservasiUbahFragment.llWrapperTransferBerkala = null;
            reviewSetoranReservasiUbahFragment.llHeaderTransferBerkala = null;
            reviewSetoranReservasiUbahFragment.ivTransferBerkala = null;
            reviewSetoranReservasiUbahFragment.llWrapperPengirim = null;
            reviewSetoranReservasiUbahFragment.llHeaderPengirim = null;
            reviewSetoranReservasiUbahFragment.ivPengirim = null;
            reviewSetoranReservasiUbahFragment.llWrapperDataOrangDatangKeCabang = null;
            reviewSetoranReservasiUbahFragment.llHeaderDataOrangDatangKeCabang = null;
            reviewSetoranReservasiUbahFragment.ivDataOrangDatangKeCabang = null;
            reviewSetoranReservasiUbahFragment.llLayoutDataPenerima = null;
            reviewSetoranReservasiUbahFragment.llLayoutTransaksiSetoran = null;
            reviewSetoranReservasiUbahFragment.llLayoutTransferBerkala = null;
            reviewSetoranReservasiUbahFragment.llLayoutPengirim = null;
            reviewSetoranReservasiUbahFragment.llLayoutDataOrangDatangKeCabang = null;
            reviewSetoranReservasiUbahFragment.llDataPenerimaDisabled = null;
            reviewSetoranReservasiUbahFragment.llDataTransaksiSetoranDisabled = null;
            reviewSetoranReservasiUbahFragment.llDataTransferBerkalaDisabled = null;
            reviewSetoranReservasiUbahFragment.llDataPengirimDisabled = null;
            reviewSetoranReservasiUbahFragment.llDataOrangDatangKeCabangDisabled = null;
            reviewSetoranReservasiUbahFragment.llDataPenerima = null;
            reviewSetoranReservasiUbahFragment.llDataTransaksiSetoran = null;
            reviewSetoranReservasiUbahFragment.llDataTransferBerkala = null;
            reviewSetoranReservasiUbahFragment.llDataPengirim = null;
            reviewSetoranReservasiUbahFragment.llDataOrangDatangKeCabang = null;
            reviewSetoranReservasiUbahFragment.tvUbahPenerima = null;
            reviewSetoranReservasiUbahFragment.tvUbahTransaksiSetoran = null;
            reviewSetoranReservasiUbahFragment.tvUbahTransaksiBerkala = null;
            reviewSetoranReservasiUbahFragment.tvUbahPengirim = null;
            reviewSetoranReservasiUbahFragment.tvUbahDataOrangDatangKeCabang = null;
            reviewSetoranReservasiUbahFragment.cbxAgree = null;
            reviewSetoranReservasiUbahFragment.tvTermCondition = null;
            reviewSetoranReservasiUbahFragment.llSyaratKetentuan = null;
            reviewSetoranReservasiUbahFragment.btnProses = null;
            reviewSetoranReservasiUbahFragment.svMain = null;
            reviewSetoranReservasiUbahFragment.viewGroupPenerima = null;
            reviewSetoranReservasiUbahFragment.tvErrorsPenerima = null;
            reviewSetoranReservasiUbahFragment.tilFormsPenerima = null;
            reviewSetoranReservasiUbahFragment.viewGroupTransaksiSetoran = null;
            reviewSetoranReservasiUbahFragment.tilFormsSetoran = null;
            reviewSetoranReservasiUbahFragment.viewGroupTransaksiBerkala = null;
            reviewSetoranReservasiUbahFragment.tilFormsTransaksiBerkala = null;
            reviewSetoranReservasiUbahFragment.viewGroupPengirim = null;
            reviewSetoranReservasiUbahFragment.tvErrorsPengirim = null;
            reviewSetoranReservasiUbahFragment.tilFormsPengirim = null;
            reviewSetoranReservasiUbahFragment.viewGroupOrangDatangKeCabang = null;
            reviewSetoranReservasiUbahFragment.tvErrorsOrangDatangKeCabang = null;
            reviewSetoranReservasiUbahFragment.tilFormsOrangDatangKeCabang = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.n.setOnFocusChangeListener(null);
            this.n = null;
            this.l.setOnFocusChangeListener(null);
            this.l = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.s.setOnClickListener(null);
            this.s.setOnFocusChangeListener(null);
            this.s = null;
            this.y.setOnClickListener(null);
            this.y = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.f57o.setOnFocusChangeListener(null);
            this.f57o = null;
            this.p.setOnFocusChangeListener(null);
            this.p = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.m.setOnFocusChangeListener(null);
            this.m = null;
            this.r.setOnFocusChangeListener(null);
            this.r = null;
            this.q.setOnClickListener(null);
            this.q = null;
            this.t.setOnClickListener(null);
            this.t = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.w.setOnClickListener(null);
            this.w = null;
            this.u.setOnClickListener(null);
            this.u = null;
            this.z.setOnClickListener(null);
            this.z = null;
            this.v.setOnClickListener(null);
            this.v = null;
            this.x.setOnClickListener(null);
            this.x = null;
            this.H.setOnClickListener(null);
            this.H = null;
            this.N.setOnClickListener(null);
            this.N = null;
            this.L.setOnClickListener(null);
            this.L = null;
            this.I.setOnClickListener(null);
            this.I = null;
            this.G.setOnClickListener(null);
            this.G = null;
            ((CompoundButton) this.a).setOnCheckedChangeListener(null);
            this.a = null;
            this.D.setOnClickListener(null);
            this.D = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.B.setOnClickListener(null);
            this.B = null;
            this.E.setOnClickListener(null);
            this.E = null;
            this.A.setOnClickListener(null);
            this.A = null;
            this.C.setOnClickListener(null);
            this.C = null;
            this.F.setOnClickListener(null);
            this.F = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
