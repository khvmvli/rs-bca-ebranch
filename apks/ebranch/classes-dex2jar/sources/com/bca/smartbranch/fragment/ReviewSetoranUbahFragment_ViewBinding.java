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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ReviewSetoranUbahFragment_ViewBinding.class */
public class ReviewSetoranUbahFragment_ViewBinding implements Unbinder {
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
    private View M;
    private View a;
    private View b;
    private View c;
    private ReviewSetoranUbahFragment d;
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
    private View f58o;
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

    public ReviewSetoranUbahFragment_ViewBinding(final ReviewSetoranUbahFragment reviewSetoranUbahFragment, View view) {
        this.d = reviewSetoranUbahFragment;
        reviewSetoranUbahFragment.tvPenerimaNama = (TextView) Utils.findRequiredViewAsType(view, 2131299519, "field 'tvPenerimaNama'", TextView.class);
        reviewSetoranUbahFragment.tvPenerimaNorek = (TextView) Utils.findRequiredViewAsType(view, 2131299520, "field 'tvPenerimaNorek'", TextView.class);
        reviewSetoranUbahFragment.tvPenerimaSimpanNama = (TextView) Utils.findRequiredViewAsType(view, 2131299521, "field 'tvPenerimaSimpanNama'", TextView.class);
        reviewSetoranUbahFragment.rlPenerimaSimpanNamaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298289, "field 'rlPenerimaSimpanNamaDisabled'", RelativeLayout.class);
        reviewSetoranUbahFragment.tvTransaksiJumlah = (TextView) Utils.findRequiredViewAsType(view, 2131299316, "field 'tvTransaksiJumlah'", TextView.class);
        reviewSetoranUbahFragment.tvTransaksiBerita = (TextView) Utils.findRequiredViewAsType(view, 2131298847, "field 'tvTransaksiBerita'", TextView.class);
        reviewSetoranUbahFragment.tvBerkalaSetiap = (TextView) Utils.findRequiredViewAsType(view, 2131299569, "field 'tvBerkalaSetiap'", TextView.class);
        reviewSetoranUbahFragment.tvBerkalaTanggalBerakhir = (TextView) Utils.findRequiredViewAsType(view, 2131299595, "field 'tvBerkalaTanggalBerakhir'", TextView.class);
        reviewSetoranUbahFragment.tvBerkalaTitleSetiap = (TextView) Utils.findRequiredViewAsType(view, 2131299665, "field 'tvBerkalaTitleSetiap'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimPemilikSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299530, "field 'tvPengirimPemilikSumberDana'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimJenisId = (TextView) Utils.findRequiredViewAsType(view, 2131299525, "field 'tvPengirimJenisId'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimNama = (TextView) Utils.findRequiredViewAsType(view, 2131299526, "field 'tvPengirimNama'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimNoId = (TextView) Utils.findRequiredViewAsType(view, 2131299528, "field 'tvPengirimNoId'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimNoRek = (TextView) Utils.findRequiredViewAsType(view, 2131299529, "field 'tvPengirimNoRek'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131299524, "field 'tvPengirimAlamat'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimNoHp = (TextView) Utils.findRequiredViewAsType(view, 2131299527, "field 'tvPengirimNoHp'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299531, "field 'tvPengirimSumberDana'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimTujuanTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299535, "field 'tvPengirimTujuanTransaksi'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimTitleNoId = (TextView) Utils.findRequiredViewAsType(view, 2131299534, "field 'tvPengirimTitleNoId'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimTitleAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131299532, "field 'tvPengirimTitleAlamat'", TextView.class);
        reviewSetoranUbahFragment.tvPengirimTitleNama = (TextView) Utils.findRequiredViewAsType(view, 2131299533, "field 'tvPengirimTitleNama'", TextView.class);
        reviewSetoranUbahFragment.tvOrangSamaDenganPemilikSD = (TextView) Utils.findRequiredViewAsType(view, 2131299507, "field 'tvOrangSamaDenganPemilikSD'", TextView.class);
        reviewSetoranUbahFragment.tvOrangJenisID = (TextView) Utils.findRequiredViewAsType(view, 2131299504, "field 'tvOrangJenisID'", TextView.class);
        reviewSetoranUbahFragment.tvOrangNama = (TextView) Utils.findRequiredViewAsType(view, 2131299505, "field 'tvOrangNama'", TextView.class);
        reviewSetoranUbahFragment.tvOrangNomorID = (TextView) Utils.findRequiredViewAsType(view, 2131299506, "field 'tvOrangNomorID'", TextView.class);
        reviewSetoranUbahFragment.tvOrangTitleNama = (TextView) Utils.findRequiredViewAsType(view, 2131299508, "field 'tvOrangTitleNama'", TextView.class);
        reviewSetoranUbahFragment.tvOrangTitleNomorID = (TextView) Utils.findRequiredViewAsType(view, 2131299509, "field 'tvOrangTitleNomorID'", TextView.class);
        reviewSetoranUbahFragment.rlPengirimPemilikSumberDanaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298296, "field 'rlPengirimPemilikSumberDanaDisabled'", RelativeLayout.class);
        reviewSetoranUbahFragment.rlPengirimJenisIdDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298291, "field 'rlPengirimJenisIdDisabled'", RelativeLayout.class);
        reviewSetoranUbahFragment.rlPengirimNamaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298292, "field 'rlPengirimNamaDisabled'", RelativeLayout.class);
        reviewSetoranUbahFragment.rlPengirimNoIdDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298294, "field 'rlPengirimNoIdDisabled'", RelativeLayout.class);
        reviewSetoranUbahFragment.rlPengirimNorekDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298295, "field 'rlPengirimNorekDisabled'", RelativeLayout.class);
        reviewSetoranUbahFragment.rlPengirimAlamatDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298290, "field 'rlPengirimAlamatDisabled'", RelativeLayout.class);
        reviewSetoranUbahFragment.rlPengirimNoHpDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298293, "field 'rlPengirimNoHpDisabled'", RelativeLayout.class);
        reviewSetoranUbahFragment.rlPengirimSumberDanaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298297, "field 'rlPengirimSumberDanaDisabled'", RelativeLayout.class);
        reviewSetoranUbahFragment.rlPengirimTujuanDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298298, "field 'rlPengirimTujuanDisabled'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297142, "field 'etNamaPenerima' and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etNamaPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView, 2131297142, "field 'etNamaPenerima'", AutoCompleteTextView.class);
        this.g = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297143, "field 'etNoRekPenerima' and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etNoRekPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView2, 2131297143, "field 'etNoRekPenerima'", AutoCompleteTextView.class);
        this.l = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.11
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297144, "field 'etSimpanNama' and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etSimpanNama = (EditText) Utils.castView(findRequiredView3, 2131297144, "field 'etSimpanNama'", EditText.class);
        this.m = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.21
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranUbahFragment.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilSimpanNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298714, "field 'tilSimpanNama'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.etJumlahSetoran = (EditText) Utils.findRequiredViewAsType(view, 2131297006, "field 'etJumlahSetoran'", EditText.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296954, "field 'etBeritaSetoran' and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etBeritaSetoran = (EditText) Utils.castView(findRequiredView4, 2131296954, "field 'etBeritaSetoran'", EditText.class);
        this.e = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.32
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranUbahFragment.tilJumlah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilJumlah'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilBerita = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298504, "field 'tilBerita'", LogoutDialog_ViewBinding.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131297178, "field 'etSetiapBeberapaHari', method 'updateDaftarTransfer', and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etSetiapBeberapaHari = (EditText) Utils.castView(findRequiredView5, 2131297178, "field 'etSetiapBeberapaHari'", EditText.class);
        this.p = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.31
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.updateDaftarTransfer(view2);
            }
        });
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.34
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranUbahFragment.tvErrorSetiapBeberapaHari = (TextView) Utils.findRequiredViewAsType(view, 2131299180, "field 'tvErrorSetiapBeberapaHari'", TextView.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131297203, "field 'etTanggalBerakhir' and method 'updateDaftarTransfer'");
        reviewSetoranUbahFragment.etTanggalBerakhir = (EditText) Utils.castView(findRequiredView6, 2131297203, "field 'etTanggalBerakhir'", EditText.class);
        this.y = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.33
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.updateDaftarTransfer(view2);
            }
        });
        reviewSetoranUbahFragment.tilSetiapBeberapaHari = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298712, "field 'tilSetiapBeberapaHari'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilTanggalBerakhir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298735, "field 'tilTanggalBerakhir'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.etPengirimPemilikSumberDana = (EditText) Utils.findRequiredViewAsType(view, 2131297152, "field 'etPengirimPemilikSumberDana'", EditText.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297148, "field 'etJenisId' and method 'clickJenisIdentitasPemilikSumberDana'");
        reviewSetoranUbahFragment.etJenisId = (EditText) Utils.castView(findRequiredView7, 2131297148, "field 'etJenisId'", EditText.class);
        this.n = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.37
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.clickJenisIdentitasPemilikSumberDana(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297149, "field 'etNamaPengirim' and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etNamaPengirim = (EditText) Utils.castView(findRequiredView8, 2131297149, "field 'etNamaPengirim'", EditText.class);
        this.f58o = findRequiredView8;
        findRequiredView8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.36
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297151, "field 'etNoIDPengirim' and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etNoIDPengirim = (EditText) Utils.castView(findRequiredView9, 2131297151, "field 'etNoIDPengirim'", EditText.class);
        this.t = findRequiredView9;
        findRequiredView9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297134, "field 'etNorekPengirim' and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etNorekPengirim = (EditText) Utils.castView(findRequiredView10, 2131297134, "field 'etNorekPengirim'", EditText.class);
        this.a = findRequiredView10;
        findRequiredView10.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297147, "field 'etAlamatPengirim' and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etAlamatPengirim = (EditText) Utils.castView(findRequiredView11, 2131297147, "field 'etAlamatPengirim'", EditText.class);
        this.k = findRequiredView11;
        findRequiredView11.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297150, "field 'etNoHpPengirim' and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etNoHpPengirim = (EditText) Utils.castView(findRequiredView12, 2131297150, "field 'etNoHpPengirim'", EditText.class);
        this.q = findRequiredView12;
        findRequiredView12.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297153, "field 'etPengirimSumberDana' and method 'clickView'");
        reviewSetoranUbahFragment.etPengirimSumberDana = (EditText) Utils.castView(findRequiredView13, 2131297153, "field 'etPengirimSumberDana'", EditText.class);
        this.s = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.clickView(view2);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297154, "field 'etPengirimTujuanTransaksi' and method 'clickView'");
        reviewSetoranUbahFragment.etPengirimTujuanTransaksi = (EditText) Utils.castView(findRequiredView14, 2131297154, "field 'etPengirimTujuanTransaksi'", EditText.class);
        this.r = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.clickView(view2);
            }
        });
        reviewSetoranUbahFragment.llData100TransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297573, "field 'llData100TransaksiSetoran'", LinearLayout.class);
        reviewSetoranUbahFragment.tilJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilJenisId'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilNoId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilNoId'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilNamaLengkap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilNamaLengkap'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilNorekPengirim = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298679, "field 'tilNorekPengirim'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilALamatLengkap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298481, "field 'tilALamatLengkap'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilPengirimSumberDana = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298689, "field 'tilPengirimSumberDana'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilPengirimTujuanTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298690, "field 'tilPengirimTujuanTransaksi'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilPemilikSumberDana = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298685, "field 'tilPemilikSumberDana'", LogoutDialog_ViewBinding.class);
        View findRequiredView15 = Utils.findRequiredView(view, 2131297138, "field 'etOrangSamaDenganPemilik' and method 'clickOrangSamaDenganPemilik'");
        reviewSetoranUbahFragment.etOrangSamaDenganPemilik = (EditText) Utils.castView(findRequiredView15, 2131297138, "field 'etOrangSamaDenganPemilik'", EditText.class);
        this.i = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.clickOrangSamaDenganPemilik(view2);
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131297135, "field 'etOrangJenisId' and method 'clickJenisIdentitas'");
        reviewSetoranUbahFragment.etOrangJenisId = (EditText) Utils.castView(findRequiredView16, 2131297135, "field 'etOrangJenisId'", EditText.class);
        this.h = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.clickJenisIdentitas(view2);
            }
        });
        View findRequiredView17 = Utils.findRequiredView(view, 2131297136, "field 'etOrangNama' and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etOrangNama = (EditText) Utils.castView(findRequiredView17, 2131297136, "field 'etOrangNama'", EditText.class);
        this.f = findRequiredView17;
        findRequiredView17.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView18 = Utils.findRequiredView(view, 2131297137, "field 'etOrangNoID' and method 'inputChangePenerima'");
        reviewSetoranUbahFragment.etOrangNoID = (EditText) Utils.castView(findRequiredView18, 2131297137, "field 'etOrangNoID'", EditText.class);
        this.j = findRequiredView18;
        findRequiredView18.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.12
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranUbahFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranUbahFragment.tilOrangSamaDenganPemilik = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298683, "field 'tilOrangSamaDenganPemilik'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilOrangJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298680, "field 'tilOrangJenisId'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilOrangNoId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298682, "field 'tilOrangNoId'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.tilOrangNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298681, "field 'tilOrangNama'", LogoutDialog_ViewBinding.class);
        reviewSetoranUbahFragment.formJenisIdentitas = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297257, "field 'formJenisIdentitas'", LinearLayout.class);
        reviewSetoranUbahFragment.llUneditableBedaDenganPemilikSumberDana = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297928, "field 'llUneditableBedaDenganPemilikSumberDana'", LinearLayout.class);
        reviewSetoranUbahFragment.rlOrangSamaDenganPemilikSdUneditable = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298286, "field 'rlOrangSamaDenganPemilikSdUneditable'", RelativeLayout.class);
        reviewSetoranUbahFragment.llWrapperDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297948, "field 'llWrapperDataPenerima'", LinearLayout.class);
        reviewSetoranUbahFragment.llHeaderDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297665, "field 'llHeaderDataPenerima'", LinearLayout.class);
        View findRequiredView19 = Utils.findRequiredView(view, 2131297344, "field 'ivDataPenerima' and method 'showDataPenerima'");
        reviewSetoranUbahFragment.ivDataPenerima = (ImageView) Utils.castView(findRequiredView19, 2131297344, "field 'ivDataPenerima'", ImageView.class);
        this.x = findRequiredView19;
        findRequiredView19.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.showDataPenerima(view2);
            }
        });
        reviewSetoranUbahFragment.llWrapperTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297963, "field 'llWrapperTransaksiSetoran'", LinearLayout.class);
        reviewSetoranUbahFragment.llHeaderTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297678, "field 'llHeaderTransaksiSetoran'", LinearLayout.class);
        View findRequiredView20 = Utils.findRequiredView(view, 2131297419, "field 'ivTransaksiSetoran' and method 'showDataTransaksiSetoran'");
        reviewSetoranUbahFragment.ivTransaksiSetoran = (ImageView) Utils.castView(findRequiredView20, 2131297419, "field 'ivTransaksiSetoran'", ImageView.class);
        this.u = findRequiredView20;
        findRequiredView20.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.15
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.showDataTransaksiSetoran(view2);
            }
        });
        reviewSetoranUbahFragment.llWrapperTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297964, "field 'llWrapperTransferBerkala'", LinearLayout.class);
        reviewSetoranUbahFragment.llHeaderTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297679, "field 'llHeaderTransferBerkala'", LinearLayout.class);
        View findRequiredView21 = Utils.findRequiredView(view, 2131297420, "field 'ivTransferBerkala' and method 'showDataTransaksiBerkala'");
        reviewSetoranUbahFragment.ivTransferBerkala = (ImageView) Utils.castView(findRequiredView21, 2131297420, "field 'ivTransferBerkala'", ImageView.class);
        this.D = findRequiredView21;
        findRequiredView21.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.showDataTransaksiBerkala(view2);
            }
        });
        reviewSetoranUbahFragment.llWrapperPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297954, "field 'llWrapperPengirim'", LinearLayout.class);
        reviewSetoranUbahFragment.llHeaderPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297671, "field 'llHeaderPengirim'", LinearLayout.class);
        View findRequiredView22 = Utils.findRequiredView(view, 2131297350, "field 'ivPengirim' and method 'showDataPengirim'");
        reviewSetoranUbahFragment.ivPengirim = (ImageView) Utils.castView(findRequiredView22, 2131297350, "field 'ivPengirim'", ImageView.class);
        this.v = findRequiredView22;
        findRequiredView22.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.16
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.showDataPengirim(view2);
            }
        });
        reviewSetoranUbahFragment.llWrapperDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297946, "field 'llWrapperDataOrangDatangKeCabang'", LinearLayout.class);
        reviewSetoranUbahFragment.llHeaderDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297663, "field 'llHeaderDataOrangDatangKeCabang'", LinearLayout.class);
        View findRequiredView23 = Utils.findRequiredView(view, 2131297342, "field 'ivDataOrangDatangKeCabang' and method 'showDataOrangDatangKeCabang'");
        reviewSetoranUbahFragment.ivDataOrangDatangKeCabang = (ImageView) Utils.castView(findRequiredView23, 2131297342, "field 'ivDataOrangDatangKeCabang'", ImageView.class);
        this.w = findRequiredView23;
        findRequiredView23.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.20
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.showDataOrangDatangKeCabang(view2);
            }
        });
        reviewSetoranUbahFragment.llLayoutDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297465, "field 'llLayoutDataPenerima'", LinearLayout.class);
        reviewSetoranUbahFragment.llLayoutTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297503, "field 'llLayoutTransaksiSetoran'", LinearLayout.class);
        reviewSetoranUbahFragment.llLayoutTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297504, "field 'llLayoutTransferBerkala'", LinearLayout.class);
        reviewSetoranUbahFragment.llLayoutPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297473, "field 'llLayoutPengirim'", LinearLayout.class);
        reviewSetoranUbahFragment.llLayoutDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297461, "field 'llLayoutDataOrangDatangKeCabang'", LinearLayout.class);
        reviewSetoranUbahFragment.llDataPenerimaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297599, "field 'llDataPenerimaDisabled'", LinearLayout.class);
        reviewSetoranUbahFragment.llDataTransaksiSetoranDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297611, "field 'llDataTransaksiSetoranDisabled'", LinearLayout.class);
        reviewSetoranUbahFragment.llDataTransferBerkalaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297607, "field 'llDataTransferBerkalaDisabled'", LinearLayout.class);
        reviewSetoranUbahFragment.llDataPengirimDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297602, "field 'llDataPengirimDisabled'", LinearLayout.class);
        reviewSetoranUbahFragment.llDataOrangDatangKeCabangDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297586, "field 'llDataOrangDatangKeCabangDisabled'", LinearLayout.class);
        reviewSetoranUbahFragment.llDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297588, "field 'llDataPenerima'", LinearLayout.class);
        reviewSetoranUbahFragment.llDataTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297610, "field 'llDataTransaksiSetoran'", LinearLayout.class);
        reviewSetoranUbahFragment.llDataTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297606, "field 'llDataTransferBerkala'", LinearLayout.class);
        reviewSetoranUbahFragment.llDataPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297600, "field 'llDataPengirim'", LinearLayout.class);
        reviewSetoranUbahFragment.llDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297585, "field 'llDataOrangDatangKeCabang'", LinearLayout.class);
        View findRequiredView24 = Utils.findRequiredView(view, 2131299714, "field 'tvUbahPenerima' and method 'onClickUbahDataPenerima'");
        reviewSetoranUbahFragment.tvUbahPenerima = (TextView) Utils.castView(findRequiredView24, 2131299714, "field 'tvUbahPenerima'", TextView.class);
        this.H = findRequiredView24;
        findRequiredView24.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.17
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.onClickUbahDataPenerima(view2);
            }
        });
        View findRequiredView25 = Utils.findRequiredView(view, 2131299727, "field 'tvUbahTransaksiSetoran' and method 'onClickUbahTransaksiSetoran'");
        reviewSetoranUbahFragment.tvUbahTransaksiSetoran = (TextView) Utils.castView(findRequiredView25, 2131299727, "field 'tvUbahTransaksiSetoran'", TextView.class);
        this.M = findRequiredView25;
        findRequiredView25.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.18
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.onClickUbahTransaksiSetoran(view2);
            }
        });
        View findRequiredView26 = Utils.findRequiredView(view, 2131299728, "field 'tvUbahTransaksiBerkala' and method 'onClickUbahTransferBerkala'");
        reviewSetoranUbahFragment.tvUbahTransaksiBerkala = (TextView) Utils.castView(findRequiredView26, 2131299728, "field 'tvUbahTransaksiBerkala'", TextView.class);
        this.J = findRequiredView26;
        findRequiredView26.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.19
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.onClickUbahTransferBerkala(view2);
            }
        });
        View findRequiredView27 = Utils.findRequiredView(view, 2131299720, "field 'tvUbahPengirim' and method 'onClickUbahDataPengirim'");
        reviewSetoranUbahFragment.tvUbahPengirim = (TextView) Utils.castView(findRequiredView27, 2131299720, "field 'tvUbahPengirim'", TextView.class);
        this.I = findRequiredView27;
        findRequiredView27.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.22
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.onClickUbahDataPengirim(view2);
            }
        });
        View findRequiredView28 = Utils.findRequiredView(view, 2131299712, "field 'tvUbahDataOrangDatangKeCabang' and method 'onClickUbahDataOrangDatangKeCabang'");
        reviewSetoranUbahFragment.tvUbahDataOrangDatangKeCabang = (TextView) Utils.castView(findRequiredView28, 2131299712, "field 'tvUbahDataOrangDatangKeCabang'", TextView.class);
        this.G = findRequiredView28;
        findRequiredView28.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.24
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.onClickUbahDataOrangDatangKeCabang(view2);
            }
        });
        View findRequiredView29 = Utils.findRequiredView(view, 2131296469, "field 'cbxAgree' and method 'checkboxAgree'");
        reviewSetoranUbahFragment.cbxAgree = (CheckBox) Utils.castView(findRequiredView29, 2131296469, "field 'cbxAgree'", CheckBox.class);
        this.b = findRequiredView29;
        ((CompoundButton) findRequiredView29).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.25
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                reviewSetoranUbahFragment.checkboxAgree(compoundButton, z);
            }
        });
        View findRequiredView30 = Utils.findRequiredView(view, 2131299604, "field 'tvTermCondition' and method 'clickedTermsCondition'");
        reviewSetoranUbahFragment.tvTermCondition = (TextView) Utils.castView(findRequiredView30, 2131299604, "field 'tvTermCondition'", TextView.class);
        this.B = findRequiredView30;
        findRequiredView30.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.23
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.clickedTermsCondition(view2);
            }
        });
        reviewSetoranUbahFragment.llSyaratKetentuan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297904, "field 'llSyaratKetentuan'", LinearLayout.class);
        View findRequiredView31 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'onClicedButton'");
        reviewSetoranUbahFragment.btnProses = (Button) Utils.castView(findRequiredView31, 2131296440, "field 'btnProses'", Button.class);
        this.c = findRequiredView31;
        findRequiredView31.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.30
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.onClicedButton(view2);
            }
        });
        reviewSetoranUbahFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView32 = Utils.findRequiredView(view, 2131298904, "method 'showDataPenerima'");
        this.A = findRequiredView32;
        findRequiredView32.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.28
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.showDataPenerima(view2);
            }
        });
        View findRequiredView33 = Utils.findRequiredView(view, 2131299691, "method 'showDataTransaksiSetoran'");
        this.E = findRequiredView33;
        findRequiredView33.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.27
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.showDataTransaksiSetoran(view2);
            }
        });
        View findRequiredView34 = Utils.findRequiredView(view, 2131298910, "method 'showDataPengirim'");
        this.z = findRequiredView34;
        findRequiredView34.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.29
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.showDataPengirim(view2);
            }
        });
        View findRequiredView35 = Utils.findRequiredView(view, 2131298902, "method 'showDataOrangDatangKeCabang'");
        this.C = findRequiredView35;
        findRequiredView35.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.26
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.showDataOrangDatangKeCabang(view2);
            }
        });
        View findRequiredView36 = Utils.findRequiredView(view, 2131299693, "method 'showDataTransaksiBerkala'");
        this.F = findRequiredView36;
        findRequiredView36.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranUbahFragment_ViewBinding.35
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranUbahFragment.showDataTransaksiBerkala(view2);
            }
        });
        reviewSetoranUbahFragment.viewGroupPenerima = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297142, "field 'viewGroupPenerima'"), Utils.findRequiredView(view, 2131297143, "field 'viewGroupPenerima'"), Utils.findRequiredView(view, 2131297144, "field 'viewGroupPenerima'"));
        reviewSetoranUbahFragment.tvErrorsPenerima = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299078, "field 'tvErrorsPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrorsPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299182, "field 'tvErrorsPenerima'", TextView.class));
        reviewSetoranUbahFragment.tilFormsPenerima = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298714, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class));
        reviewSetoranUbahFragment.viewGroupTransaksiSetoran = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296954, "field 'viewGroupTransaksiSetoran'"));
        reviewSetoranUbahFragment.tilFormsSetoran = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilFormsSetoran'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298504, "field 'tilFormsSetoran'", LogoutDialog_ViewBinding.class));
        reviewSetoranUbahFragment.viewGroupTransaksiBerkala = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297178, "field 'viewGroupTransaksiBerkala'"), Utils.findRequiredView(view, 2131297203, "field 'viewGroupTransaksiBerkala'"));
        reviewSetoranUbahFragment.tilFormsTransaksiBerkala = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298712, "field 'tilFormsTransaksiBerkala'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298735, "field 'tilFormsTransaksiBerkala'", LogoutDialog_ViewBinding.class));
        reviewSetoranUbahFragment.viewGroupPengirim = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297148, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297151, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297149, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297134, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297147, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297150, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297153, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297154, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297152, "field 'viewGroupPengirim'"));
        reviewSetoranUbahFragment.tvErrorsPengirim = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299157, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299121, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299086, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299148, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298961, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299199, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299231, "field 'tvErrorsPengirim'", TextView.class));
        reviewSetoranUbahFragment.tilFormsPengirim = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298679, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298481, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298689, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298690, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298685, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class));
        reviewSetoranUbahFragment.viewGroupOrangDatangKeCabang = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297138, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131297135, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131297137, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131297136, "field 'viewGroupOrangDatangKeCabang'"));
        reviewSetoranUbahFragment.tvErrorsOrangDatangKeCabang = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299152, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299149, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299151, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299150, "field 'tvErrorsOrangDatangKeCabang'", TextView.class));
        reviewSetoranUbahFragment.tilFormsOrangDatangKeCabang = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298683, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298680, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298682, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298681, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class));
        Context context = view.getContext();
        Resources resources = context.getResources();
        reviewSetoranUbahFragment.arrayHari = resources.getStringArray(2130903059);
        reviewSetoranUbahFragment.colorPaleGrey = copyWindowDataInto.a(context, 2131099821);
        reviewSetoranUbahFragment.colorPaleBlue = copyWindowDataInto.a(context, 2131099820);
        reviewSetoranUbahFragment.labelSetiapBeberapaHari = resources.getString(2131821580);
        reviewSetoranUbahFragment.labelSetiapHari = resources.getString(2131821581);
        reviewSetoranUbahFragment.labelSetiapTanggal = resources.getString(2131821582);
        reviewSetoranUbahFragment.nomorKtp = resources.getString(2131821553);
        reviewSetoranUbahFragment.nomorPaspor = resources.getString(2131821556);
        reviewSetoranUbahFragment.nomorRekening = resources.getString(2131821949);
        reviewSetoranUbahFragment.labelKtp = resources.getString(2131821815);
        reviewSetoranUbahFragment.labelPaspor = resources.getString(2131821986);
        reviewSetoranUbahFragment.labelSiupNib = resources.getString(2131822122);
        reviewSetoranUbahFragment.labelRekening = resources.getString(2131822074);
        reviewSetoranUbahFragment.namaSesuaiKtp = resources.getString(2131821933);
        reviewSetoranUbahFragment.namaSesuaiPaspor = resources.getString(2131821530);
        reviewSetoranUbahFragment.namaRekening = resources.getString(2131821919);
        reviewSetoranUbahFragment.namaPerusahaan = resources.getString(2131821931);
        reviewSetoranUbahFragment.alamatSesuaiKtp = resources.getString(2131821060);
        reviewSetoranUbahFragment.alamatSesuaiPaspor = resources.getString(2131821061);
        reviewSetoranUbahFragment.nomorSiupNib = resources.getString(2131821192);
        reviewSetoranUbahFragment.txtTermCondition = resources.getString(2131821427);
        reviewSetoranUbahFragment.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReviewSetoranUbahFragment reviewSetoranUbahFragment = this.d;
        if (reviewSetoranUbahFragment != null) {
            this.d = null;
            reviewSetoranUbahFragment.tvPenerimaNama = null;
            reviewSetoranUbahFragment.tvPenerimaNorek = null;
            reviewSetoranUbahFragment.tvPenerimaSimpanNama = null;
            reviewSetoranUbahFragment.rlPenerimaSimpanNamaDisabled = null;
            reviewSetoranUbahFragment.tvTransaksiJumlah = null;
            reviewSetoranUbahFragment.tvTransaksiBerita = null;
            reviewSetoranUbahFragment.tvBerkalaSetiap = null;
            reviewSetoranUbahFragment.tvBerkalaTanggalBerakhir = null;
            reviewSetoranUbahFragment.tvBerkalaTitleSetiap = null;
            reviewSetoranUbahFragment.tvPengirimPemilikSumberDana = null;
            reviewSetoranUbahFragment.tvPengirimJenisId = null;
            reviewSetoranUbahFragment.tvPengirimNama = null;
            reviewSetoranUbahFragment.tvPengirimNoId = null;
            reviewSetoranUbahFragment.tvPengirimNoRek = null;
            reviewSetoranUbahFragment.tvPengirimAlamat = null;
            reviewSetoranUbahFragment.tvPengirimNoHp = null;
            reviewSetoranUbahFragment.tvPengirimSumberDana = null;
            reviewSetoranUbahFragment.tvPengirimTujuanTransaksi = null;
            reviewSetoranUbahFragment.tvPengirimTitleNoId = null;
            reviewSetoranUbahFragment.tvPengirimTitleAlamat = null;
            reviewSetoranUbahFragment.tvPengirimTitleNama = null;
            reviewSetoranUbahFragment.tvOrangSamaDenganPemilikSD = null;
            reviewSetoranUbahFragment.tvOrangJenisID = null;
            reviewSetoranUbahFragment.tvOrangNama = null;
            reviewSetoranUbahFragment.tvOrangNomorID = null;
            reviewSetoranUbahFragment.tvOrangTitleNama = null;
            reviewSetoranUbahFragment.tvOrangTitleNomorID = null;
            reviewSetoranUbahFragment.rlPengirimPemilikSumberDanaDisabled = null;
            reviewSetoranUbahFragment.rlPengirimJenisIdDisabled = null;
            reviewSetoranUbahFragment.rlPengirimNamaDisabled = null;
            reviewSetoranUbahFragment.rlPengirimNoIdDisabled = null;
            reviewSetoranUbahFragment.rlPengirimNorekDisabled = null;
            reviewSetoranUbahFragment.rlPengirimAlamatDisabled = null;
            reviewSetoranUbahFragment.rlPengirimNoHpDisabled = null;
            reviewSetoranUbahFragment.rlPengirimSumberDanaDisabled = null;
            reviewSetoranUbahFragment.rlPengirimTujuanDisabled = null;
            reviewSetoranUbahFragment.etNamaPenerima = null;
            reviewSetoranUbahFragment.etNoRekPenerima = null;
            reviewSetoranUbahFragment.etSimpanNama = null;
            reviewSetoranUbahFragment.tilNama = null;
            reviewSetoranUbahFragment.tilNorek = null;
            reviewSetoranUbahFragment.tilSimpanNama = null;
            reviewSetoranUbahFragment.etJumlahSetoran = null;
            reviewSetoranUbahFragment.etBeritaSetoran = null;
            reviewSetoranUbahFragment.tilJumlah = null;
            reviewSetoranUbahFragment.tilBerita = null;
            reviewSetoranUbahFragment.etSetiapBeberapaHari = null;
            reviewSetoranUbahFragment.tvErrorSetiapBeberapaHari = null;
            reviewSetoranUbahFragment.etTanggalBerakhir = null;
            reviewSetoranUbahFragment.tilSetiapBeberapaHari = null;
            reviewSetoranUbahFragment.tilTanggalBerakhir = null;
            reviewSetoranUbahFragment.etPengirimPemilikSumberDana = null;
            reviewSetoranUbahFragment.etJenisId = null;
            reviewSetoranUbahFragment.etNamaPengirim = null;
            reviewSetoranUbahFragment.etNoIDPengirim = null;
            reviewSetoranUbahFragment.etNorekPengirim = null;
            reviewSetoranUbahFragment.etAlamatPengirim = null;
            reviewSetoranUbahFragment.etNoHpPengirim = null;
            reviewSetoranUbahFragment.etPengirimSumberDana = null;
            reviewSetoranUbahFragment.etPengirimTujuanTransaksi = null;
            reviewSetoranUbahFragment.llData100TransaksiSetoran = null;
            reviewSetoranUbahFragment.tilJenisId = null;
            reviewSetoranUbahFragment.tilNoId = null;
            reviewSetoranUbahFragment.tilNamaLengkap = null;
            reviewSetoranUbahFragment.tilNorekPengirim = null;
            reviewSetoranUbahFragment.tilALamatLengkap = null;
            reviewSetoranUbahFragment.tilNoHp = null;
            reviewSetoranUbahFragment.tilPengirimSumberDana = null;
            reviewSetoranUbahFragment.tilPengirimTujuanTransaksi = null;
            reviewSetoranUbahFragment.tilPemilikSumberDana = null;
            reviewSetoranUbahFragment.etOrangSamaDenganPemilik = null;
            reviewSetoranUbahFragment.etOrangJenisId = null;
            reviewSetoranUbahFragment.etOrangNama = null;
            reviewSetoranUbahFragment.etOrangNoID = null;
            reviewSetoranUbahFragment.tilOrangSamaDenganPemilik = null;
            reviewSetoranUbahFragment.tilOrangJenisId = null;
            reviewSetoranUbahFragment.tilOrangNoId = null;
            reviewSetoranUbahFragment.tilOrangNama = null;
            reviewSetoranUbahFragment.formJenisIdentitas = null;
            reviewSetoranUbahFragment.llUneditableBedaDenganPemilikSumberDana = null;
            reviewSetoranUbahFragment.rlOrangSamaDenganPemilikSdUneditable = null;
            reviewSetoranUbahFragment.llWrapperDataPenerima = null;
            reviewSetoranUbahFragment.llHeaderDataPenerima = null;
            reviewSetoranUbahFragment.ivDataPenerima = null;
            reviewSetoranUbahFragment.llWrapperTransaksiSetoran = null;
            reviewSetoranUbahFragment.llHeaderTransaksiSetoran = null;
            reviewSetoranUbahFragment.ivTransaksiSetoran = null;
            reviewSetoranUbahFragment.llWrapperTransferBerkala = null;
            reviewSetoranUbahFragment.llHeaderTransferBerkala = null;
            reviewSetoranUbahFragment.ivTransferBerkala = null;
            reviewSetoranUbahFragment.llWrapperPengirim = null;
            reviewSetoranUbahFragment.llHeaderPengirim = null;
            reviewSetoranUbahFragment.ivPengirim = null;
            reviewSetoranUbahFragment.llWrapperDataOrangDatangKeCabang = null;
            reviewSetoranUbahFragment.llHeaderDataOrangDatangKeCabang = null;
            reviewSetoranUbahFragment.ivDataOrangDatangKeCabang = null;
            reviewSetoranUbahFragment.llLayoutDataPenerima = null;
            reviewSetoranUbahFragment.llLayoutTransaksiSetoran = null;
            reviewSetoranUbahFragment.llLayoutTransferBerkala = null;
            reviewSetoranUbahFragment.llLayoutPengirim = null;
            reviewSetoranUbahFragment.llLayoutDataOrangDatangKeCabang = null;
            reviewSetoranUbahFragment.llDataPenerimaDisabled = null;
            reviewSetoranUbahFragment.llDataTransaksiSetoranDisabled = null;
            reviewSetoranUbahFragment.llDataTransferBerkalaDisabled = null;
            reviewSetoranUbahFragment.llDataPengirimDisabled = null;
            reviewSetoranUbahFragment.llDataOrangDatangKeCabangDisabled = null;
            reviewSetoranUbahFragment.llDataPenerima = null;
            reviewSetoranUbahFragment.llDataTransaksiSetoran = null;
            reviewSetoranUbahFragment.llDataTransferBerkala = null;
            reviewSetoranUbahFragment.llDataPengirim = null;
            reviewSetoranUbahFragment.llDataOrangDatangKeCabang = null;
            reviewSetoranUbahFragment.tvUbahPenerima = null;
            reviewSetoranUbahFragment.tvUbahTransaksiSetoran = null;
            reviewSetoranUbahFragment.tvUbahTransaksiBerkala = null;
            reviewSetoranUbahFragment.tvUbahPengirim = null;
            reviewSetoranUbahFragment.tvUbahDataOrangDatangKeCabang = null;
            reviewSetoranUbahFragment.cbxAgree = null;
            reviewSetoranUbahFragment.tvTermCondition = null;
            reviewSetoranUbahFragment.llSyaratKetentuan = null;
            reviewSetoranUbahFragment.btnProses = null;
            reviewSetoranUbahFragment.svMain = null;
            reviewSetoranUbahFragment.viewGroupPenerima = null;
            reviewSetoranUbahFragment.tvErrorsPenerima = null;
            reviewSetoranUbahFragment.tilFormsPenerima = null;
            reviewSetoranUbahFragment.viewGroupTransaksiSetoran = null;
            reviewSetoranUbahFragment.tilFormsSetoran = null;
            reviewSetoranUbahFragment.viewGroupTransaksiBerkala = null;
            reviewSetoranUbahFragment.tilFormsTransaksiBerkala = null;
            reviewSetoranUbahFragment.viewGroupPengirim = null;
            reviewSetoranUbahFragment.tvErrorsPengirim = null;
            reviewSetoranUbahFragment.tilFormsPengirim = null;
            reviewSetoranUbahFragment.viewGroupOrangDatangKeCabang = null;
            reviewSetoranUbahFragment.tvErrorsOrangDatangKeCabang = null;
            reviewSetoranUbahFragment.tilFormsOrangDatangKeCabang = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.l.setOnFocusChangeListener(null);
            this.l = null;
            this.m.setOnFocusChangeListener(null);
            this.m = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.p.setOnClickListener(null);
            this.p.setOnFocusChangeListener(null);
            this.p = null;
            this.y.setOnClickListener(null);
            this.y = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.f58o.setOnFocusChangeListener(null);
            this.f58o = null;
            this.t.setOnFocusChangeListener(null);
            this.t = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.k.setOnFocusChangeListener(null);
            this.k = null;
            this.q.setOnFocusChangeListener(null);
            this.q = null;
            this.s.setOnClickListener(null);
            this.s = null;
            this.r.setOnClickListener(null);
            this.r = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.x.setOnClickListener(null);
            this.x = null;
            this.u.setOnClickListener(null);
            this.u = null;
            this.D.setOnClickListener(null);
            this.D = null;
            this.v.setOnClickListener(null);
            this.v = null;
            this.w.setOnClickListener(null);
            this.w = null;
            this.H.setOnClickListener(null);
            this.H = null;
            this.M.setOnClickListener(null);
            this.M = null;
            this.J.setOnClickListener(null);
            this.J = null;
            this.I.setOnClickListener(null);
            this.I = null;
            this.G.setOnClickListener(null);
            this.G = null;
            ((CompoundButton) this.b).setOnCheckedChangeListener(null);
            this.b = null;
            this.B.setOnClickListener(null);
            this.B = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.A.setOnClickListener(null);
            this.A = null;
            this.E.setOnClickListener(null);
            this.E = null;
            this.z.setOnClickListener(null);
            this.z = null;
            this.C.setOnClickListener(null);
            this.C = null;
            this.F.setOnClickListener(null);
            this.F = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
