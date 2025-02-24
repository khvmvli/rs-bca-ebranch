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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ReviewSetoranFragment_ViewBinding.class */
public class ReviewSetoranFragment_ViewBinding implements Unbinder {
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
    private View M;
    private View a;
    private View b;
    private ReviewSetoranFragment c;
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
    private View f56o;
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

    public ReviewSetoranFragment_ViewBinding(final ReviewSetoranFragment reviewSetoranFragment, View view) {
        this.c = reviewSetoranFragment;
        reviewSetoranFragment.tvPenerimaNama = (TextView) Utils.findRequiredViewAsType(view, 2131299519, "field 'tvPenerimaNama'", TextView.class);
        reviewSetoranFragment.tvPenerimaNorek = (TextView) Utils.findRequiredViewAsType(view, 2131299520, "field 'tvPenerimaNorek'", TextView.class);
        reviewSetoranFragment.tvPenerimaSimpanNama = (TextView) Utils.findRequiredViewAsType(view, 2131299521, "field 'tvPenerimaSimpanNama'", TextView.class);
        reviewSetoranFragment.rlPenerimaSimpanNamaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298289, "field 'rlPenerimaSimpanNamaDisabled'", RelativeLayout.class);
        reviewSetoranFragment.tvTransaksiJumlah = (TextView) Utils.findRequiredViewAsType(view, 2131299316, "field 'tvTransaksiJumlah'", TextView.class);
        reviewSetoranFragment.tvTransaksiBerita = (TextView) Utils.findRequiredViewAsType(view, 2131298847, "field 'tvTransaksiBerita'", TextView.class);
        reviewSetoranFragment.tvBerkalaSetiap = (TextView) Utils.findRequiredViewAsType(view, 2131299569, "field 'tvBerkalaSetiap'", TextView.class);
        reviewSetoranFragment.tvBerkalaTanggalBerakhir = (TextView) Utils.findRequiredViewAsType(view, 2131299595, "field 'tvBerkalaTanggalBerakhir'", TextView.class);
        reviewSetoranFragment.tvBerkalaTitleSetiap = (TextView) Utils.findRequiredViewAsType(view, 2131299665, "field 'tvBerkalaTitleSetiap'", TextView.class);
        reviewSetoranFragment.tvPengirimPemilikSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299530, "field 'tvPengirimPemilikSumberDana'", TextView.class);
        reviewSetoranFragment.tvPengirimJenisId = (TextView) Utils.findRequiredViewAsType(view, 2131299525, "field 'tvPengirimJenisId'", TextView.class);
        reviewSetoranFragment.tvPengirimNama = (TextView) Utils.findRequiredViewAsType(view, 2131299526, "field 'tvPengirimNama'", TextView.class);
        reviewSetoranFragment.tvPengirimNoId = (TextView) Utils.findRequiredViewAsType(view, 2131299528, "field 'tvPengirimNoId'", TextView.class);
        reviewSetoranFragment.tvPengirimNoRek = (TextView) Utils.findRequiredViewAsType(view, 2131299529, "field 'tvPengirimNoRek'", TextView.class);
        reviewSetoranFragment.tvPengirimAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131299524, "field 'tvPengirimAlamat'", TextView.class);
        reviewSetoranFragment.tvPengirimNoHp = (TextView) Utils.findRequiredViewAsType(view, 2131299527, "field 'tvPengirimNoHp'", TextView.class);
        reviewSetoranFragment.tvPengirimSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299531, "field 'tvPengirimSumberDana'", TextView.class);
        reviewSetoranFragment.tvPengirimTujuanTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299535, "field 'tvPengirimTujuanTransaksi'", TextView.class);
        reviewSetoranFragment.tvPengirimTitleNoId = (TextView) Utils.findRequiredViewAsType(view, 2131299534, "field 'tvPengirimTitleNoId'", TextView.class);
        reviewSetoranFragment.tvPengirimTitleAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131299532, "field 'tvPengirimTitleAlamat'", TextView.class);
        reviewSetoranFragment.tvPengirimTitleNama = (TextView) Utils.findRequiredViewAsType(view, 2131299533, "field 'tvPengirimTitleNama'", TextView.class);
        reviewSetoranFragment.tvOrangSamaDenganPemilikSD = (TextView) Utils.findRequiredViewAsType(view, 2131299507, "field 'tvOrangSamaDenganPemilikSD'", TextView.class);
        reviewSetoranFragment.tvOrangJenisID = (TextView) Utils.findRequiredViewAsType(view, 2131299504, "field 'tvOrangJenisID'", TextView.class);
        reviewSetoranFragment.tvOrangNama = (TextView) Utils.findRequiredViewAsType(view, 2131299505, "field 'tvOrangNama'", TextView.class);
        reviewSetoranFragment.tvOrangNomorID = (TextView) Utils.findRequiredViewAsType(view, 2131299506, "field 'tvOrangNomorID'", TextView.class);
        reviewSetoranFragment.tvOrangTitleNama = (TextView) Utils.findRequiredViewAsType(view, 2131299508, "field 'tvOrangTitleNama'", TextView.class);
        reviewSetoranFragment.tvOrangTitleNomorID = (TextView) Utils.findRequiredViewAsType(view, 2131299509, "field 'tvOrangTitleNomorID'", TextView.class);
        reviewSetoranFragment.rlPengirimPemilikSumberDanaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298296, "field 'rlPengirimPemilikSumberDanaDisabled'", RelativeLayout.class);
        reviewSetoranFragment.rlPengirimJenisIdDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298291, "field 'rlPengirimJenisIdDisabled'", RelativeLayout.class);
        reviewSetoranFragment.rlPengirimNamaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298292, "field 'rlPengirimNamaDisabled'", RelativeLayout.class);
        reviewSetoranFragment.rlPengirimNoIdDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298294, "field 'rlPengirimNoIdDisabled'", RelativeLayout.class);
        reviewSetoranFragment.rlPengirimNorekDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298295, "field 'rlPengirimNorekDisabled'", RelativeLayout.class);
        reviewSetoranFragment.rlPengirimAlamatDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298290, "field 'rlPengirimAlamatDisabled'", RelativeLayout.class);
        reviewSetoranFragment.rlPengirimNoHpDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298293, "field 'rlPengirimNoHpDisabled'", RelativeLayout.class);
        reviewSetoranFragment.rlPengirimSumberDanaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298297, "field 'rlPengirimSumberDanaDisabled'", RelativeLayout.class);
        reviewSetoranFragment.rlPengirimTujuanDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298298, "field 'rlPengirimTujuanDisabled'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297142, "field 'etNamaPenerima' and method 'inputChangePenerima'");
        reviewSetoranFragment.etNamaPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView, 2131297142, "field 'etNamaPenerima'", AutoCompleteTextView.class);
        this.i = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297143, "field 'etNoRekPenerima' and method 'inputChangePenerima'");
        reviewSetoranFragment.etNoRekPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView2, 2131297143, "field 'etNoRekPenerima'", AutoCompleteTextView.class);
        this.k = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.13
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297144, "field 'etSimpanNama' and method 'inputChangePenerima'");
        reviewSetoranFragment.etSimpanNama = (EditText) Utils.castView(findRequiredView3, 2131297144, "field 'etSimpanNama'", EditText.class);
        this.l = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.21
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranFragment.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilSimpanNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298714, "field 'tilSimpanNama'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.etJumlahSetoran = (EditText) Utils.findRequiredViewAsType(view, 2131297006, "field 'etJumlahSetoran'", EditText.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296954, "field 'etBeritaSetoran' and method 'inputChangePenerima'");
        reviewSetoranFragment.etBeritaSetoran = (EditText) Utils.castView(findRequiredView4, 2131296954, "field 'etBeritaSetoran'", EditText.class);
        this.b = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.35
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranFragment.tilJumlah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilJumlah'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilBerita = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298504, "field 'tilBerita'", LogoutDialog_ViewBinding.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131297178, "field 'etSetiapBeberapaHari', method 'updateDaftarTransfer', and method 'inputChangePenerima'");
        reviewSetoranFragment.etSetiapBeberapaHari = (EditText) Utils.castView(findRequiredView5, 2131297178, "field 'etSetiapBeberapaHari'", EditText.class);
        this.t = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.31
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.updateDaftarTransfer(view2);
            }
        });
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.33
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranFragment.tvErrorSetiapBeberapaHari = (TextView) Utils.findRequiredViewAsType(view, 2131299180, "field 'tvErrorSetiapBeberapaHari'", TextView.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131297203, "field 'etTanggalBerakhir' and method 'updateDaftarTransfer'");
        reviewSetoranFragment.etTanggalBerakhir = (EditText) Utils.castView(findRequiredView6, 2131297203, "field 'etTanggalBerakhir'", EditText.class);
        this.y = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.34
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.updateDaftarTransfer(view2);
            }
        });
        reviewSetoranFragment.tilSetiapBeberapaHari = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298712, "field 'tilSetiapBeberapaHari'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilTanggalBerakhir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298735, "field 'tilTanggalBerakhir'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.etPengirimPemilikSumberDana = (EditText) Utils.findRequiredViewAsType(view, 2131297152, "field 'etPengirimPemilikSumberDana'", EditText.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297148, "field 'etJenisId' and method 'clickJenisIdentitasPemilikSumberDana'");
        reviewSetoranFragment.etJenisId = (EditText) Utils.castView(findRequiredView7, 2131297148, "field 'etJenisId'", EditText.class);
        this.f56o = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.36
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.clickJenisIdentitasPemilikSumberDana(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297149, "field 'etNamaPengirim' and method 'inputChangePenerima'");
        reviewSetoranFragment.etNamaPengirim = (EditText) Utils.castView(findRequiredView8, 2131297149, "field 'etNamaPengirim'", EditText.class);
        this.m = findRequiredView8;
        findRequiredView8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.37
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297151, "field 'etNoIDPengirim' and method 'inputChangePenerima'");
        reviewSetoranFragment.etNoIDPengirim = (EditText) Utils.castView(findRequiredView9, 2131297151, "field 'etNoIDPengirim'", EditText.class);
        this.q = findRequiredView9;
        findRequiredView9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297134, "field 'etNorekPengirim' and method 'inputChangePenerima'");
        reviewSetoranFragment.etNorekPengirim = (EditText) Utils.castView(findRequiredView10, 2131297134, "field 'etNorekPengirim'", EditText.class);
        this.e = findRequiredView10;
        findRequiredView10.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297147, "field 'etAlamatPengirim' and method 'inputChangePenerima'");
        reviewSetoranFragment.etAlamatPengirim = (EditText) Utils.castView(findRequiredView11, 2131297147, "field 'etAlamatPengirim'", EditText.class);
        this.n = findRequiredView11;
        findRequiredView11.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297150, "field 'etNoHpPengirim' and method 'inputChangePenerima'");
        reviewSetoranFragment.etNoHpPengirim = (EditText) Utils.castView(findRequiredView12, 2131297150, "field 'etNoHpPengirim'", EditText.class);
        this.r = findRequiredView12;
        findRequiredView12.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297153, "field 'etPengirimSumberDana' and method 'clickView'");
        reviewSetoranFragment.etPengirimSumberDana = (EditText) Utils.castView(findRequiredView13, 2131297153, "field 'etPengirimSumberDana'", EditText.class);
        this.p = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.clickView(view2);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297154, "field 'etPengirimTujuanTransaksi' and method 'clickView'");
        reviewSetoranFragment.etPengirimTujuanTransaksi = (EditText) Utils.castView(findRequiredView14, 2131297154, "field 'etPengirimTujuanTransaksi'", EditText.class);
        this.s = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.clickView(view2);
            }
        });
        reviewSetoranFragment.llData100TransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297573, "field 'llData100TransaksiSetoran'", LinearLayout.class);
        reviewSetoranFragment.tilJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilJenisId'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilNoId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilNoId'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilNamaLengkap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilNamaLengkap'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilNorekPengirim = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298679, "field 'tilNorekPengirim'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilALamatLengkap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298481, "field 'tilALamatLengkap'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilPengirimSumberDana = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298689, "field 'tilPengirimSumberDana'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilPengirimTujuanTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298690, "field 'tilPengirimTujuanTransaksi'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilPemilikSumberDana = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298685, "field 'tilPemilikSumberDana'", LogoutDialog_ViewBinding.class);
        View findRequiredView15 = Utils.findRequiredView(view, 2131297138, "field 'etOrangSamaDenganPemilik' and method 'clickOrangSamaDenganPemilik'");
        reviewSetoranFragment.etOrangSamaDenganPemilik = (EditText) Utils.castView(findRequiredView15, 2131297138, "field 'etOrangSamaDenganPemilik'", EditText.class);
        this.h = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.clickOrangSamaDenganPemilik(view2);
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131297135, "field 'etOrangJenisId' and method 'clickJenisIdentitas'");
        reviewSetoranFragment.etOrangJenisId = (EditText) Utils.castView(findRequiredView16, 2131297135, "field 'etOrangJenisId'", EditText.class);
        this.j = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.clickJenisIdentitas(view2);
            }
        });
        View findRequiredView17 = Utils.findRequiredView(view, 2131297136, "field 'etOrangNama' and method 'inputChangePenerima'");
        reviewSetoranFragment.etOrangNama = (EditText) Utils.castView(findRequiredView17, 2131297136, "field 'etOrangNama'", EditText.class);
        this.g = findRequiredView17;
        findRequiredView17.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView18 = Utils.findRequiredView(view, 2131297137, "field 'etOrangNoID' and method 'inputChangePenerima'");
        reviewSetoranFragment.etOrangNoID = (EditText) Utils.castView(findRequiredView18, 2131297137, "field 'etOrangNoID'", EditText.class);
        this.f = findRequiredView18;
        findRequiredView18.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.12
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                reviewSetoranFragment.inputChangePenerima(view2, z);
            }
        });
        reviewSetoranFragment.tilOrangSamaDenganPemilik = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298683, "field 'tilOrangSamaDenganPemilik'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilOrangJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298680, "field 'tilOrangJenisId'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilOrangNoId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298682, "field 'tilOrangNoId'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.tilOrangNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298681, "field 'tilOrangNama'", LogoutDialog_ViewBinding.class);
        reviewSetoranFragment.formJenisIdentitas = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297257, "field 'formJenisIdentitas'", LinearLayout.class);
        reviewSetoranFragment.llUneditableBedaDenganPemilikSumberDana = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297928, "field 'llUneditableBedaDenganPemilikSumberDana'", LinearLayout.class);
        reviewSetoranFragment.rlOrangSamaDenganPemilikSdUneditable = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298286, "field 'rlOrangSamaDenganPemilikSdUneditable'", RelativeLayout.class);
        reviewSetoranFragment.llWrapperDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297948, "field 'llWrapperDataPenerima'", LinearLayout.class);
        reviewSetoranFragment.llHeaderDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297665, "field 'llHeaderDataPenerima'", LinearLayout.class);
        View findRequiredView19 = Utils.findRequiredView(view, 2131297344, "field 'ivDataPenerima' and method 'showDataPenerima'");
        reviewSetoranFragment.ivDataPenerima = (ImageView) Utils.castView(findRequiredView19, 2131297344, "field 'ivDataPenerima'", ImageView.class);
        this.x = findRequiredView19;
        findRequiredView19.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.15
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.showDataPenerima(view2);
            }
        });
        reviewSetoranFragment.llWrapperTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297963, "field 'llWrapperTransaksiSetoran'", LinearLayout.class);
        reviewSetoranFragment.llHeaderTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297678, "field 'llHeaderTransaksiSetoran'", LinearLayout.class);
        View findRequiredView20 = Utils.findRequiredView(view, 2131297419, "field 'ivTransaksiSetoran' and method 'showDataTransaksiSetoran'");
        reviewSetoranFragment.ivTransaksiSetoran = (ImageView) Utils.castView(findRequiredView20, 2131297419, "field 'ivTransaksiSetoran'", ImageView.class);
        this.u = findRequiredView20;
        findRequiredView20.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.showDataTransaksiSetoran(view2);
            }
        });
        reviewSetoranFragment.llWrapperTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297964, "field 'llWrapperTransferBerkala'", LinearLayout.class);
        reviewSetoranFragment.llHeaderTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297679, "field 'llHeaderTransferBerkala'", LinearLayout.class);
        View findRequiredView21 = Utils.findRequiredView(view, 2131297420, "field 'ivTransferBerkala' and method 'showDataTransaksiBerkala'");
        reviewSetoranFragment.ivTransferBerkala = (ImageView) Utils.castView(findRequiredView21, 2131297420, "field 'ivTransferBerkala'", ImageView.class);
        this.A = findRequiredView21;
        findRequiredView21.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.showDataTransaksiBerkala(view2);
            }
        });
        reviewSetoranFragment.llWrapperPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297954, "field 'llWrapperPengirim'", LinearLayout.class);
        reviewSetoranFragment.llHeaderPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297671, "field 'llHeaderPengirim'", LinearLayout.class);
        View findRequiredView22 = Utils.findRequiredView(view, 2131297350, "field 'ivPengirim' and method 'showDataPengirim'");
        reviewSetoranFragment.ivPengirim = (ImageView) Utils.castView(findRequiredView22, 2131297350, "field 'ivPengirim'", ImageView.class);
        this.w = findRequiredView22;
        findRequiredView22.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.19
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.showDataPengirim(view2);
            }
        });
        reviewSetoranFragment.llWrapperDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297946, "field 'llWrapperDataOrangDatangKeCabang'", LinearLayout.class);
        reviewSetoranFragment.llHeaderDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297663, "field 'llHeaderDataOrangDatangKeCabang'", LinearLayout.class);
        View findRequiredView23 = Utils.findRequiredView(view, 2131297342, "field 'ivDataOrangDatangKeCabang' and method 'showDataOrangDatangKeCabang'");
        reviewSetoranFragment.ivDataOrangDatangKeCabang = (ImageView) Utils.castView(findRequiredView23, 2131297342, "field 'ivDataOrangDatangKeCabang'", ImageView.class);
        this.v = findRequiredView23;
        findRequiredView23.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.18
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.showDataOrangDatangKeCabang(view2);
            }
        });
        reviewSetoranFragment.llLayoutDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297465, "field 'llLayoutDataPenerima'", LinearLayout.class);
        reviewSetoranFragment.llLayoutTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297503, "field 'llLayoutTransaksiSetoran'", LinearLayout.class);
        reviewSetoranFragment.llLayoutTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297504, "field 'llLayoutTransferBerkala'", LinearLayout.class);
        reviewSetoranFragment.llLayoutPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297473, "field 'llLayoutPengirim'", LinearLayout.class);
        reviewSetoranFragment.llLayoutDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297461, "field 'llLayoutDataOrangDatangKeCabang'", LinearLayout.class);
        reviewSetoranFragment.llDataPenerimaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297599, "field 'llDataPenerimaDisabled'", LinearLayout.class);
        reviewSetoranFragment.llDataTransaksiSetoranDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297611, "field 'llDataTransaksiSetoranDisabled'", LinearLayout.class);
        reviewSetoranFragment.llDataTransferBerkalaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297607, "field 'llDataTransferBerkalaDisabled'", LinearLayout.class);
        reviewSetoranFragment.llDataPengirimDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297602, "field 'llDataPengirimDisabled'", LinearLayout.class);
        reviewSetoranFragment.llDataOrangDatangKeCabangDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297586, "field 'llDataOrangDatangKeCabangDisabled'", LinearLayout.class);
        reviewSetoranFragment.llDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297588, "field 'llDataPenerima'", LinearLayout.class);
        reviewSetoranFragment.llDataTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297610, "field 'llDataTransaksiSetoran'", LinearLayout.class);
        reviewSetoranFragment.llDataTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297606, "field 'llDataTransferBerkala'", LinearLayout.class);
        reviewSetoranFragment.llDataPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297600, "field 'llDataPengirim'", LinearLayout.class);
        reviewSetoranFragment.llDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297585, "field 'llDataOrangDatangKeCabang'", LinearLayout.class);
        View findRequiredView24 = Utils.findRequiredView(view, 2131299714, "field 'tvUbahPenerima' and method 'onClickUbahDataPenerima'");
        reviewSetoranFragment.tvUbahPenerima = (TextView) Utils.castView(findRequiredView24, 2131299714, "field 'tvUbahPenerima'", TextView.class);
        this.H = findRequiredView24;
        findRequiredView24.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.16
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.onClickUbahDataPenerima(view2);
            }
        });
        View findRequiredView25 = Utils.findRequiredView(view, 2131299727, "field 'tvUbahTransaksiSetoran' and method 'onClickUbahTransaksiSetoran'");
        reviewSetoranFragment.tvUbahTransaksiSetoran = (TextView) Utils.castView(findRequiredView25, 2131299727, "field 'tvUbahTransaksiSetoran'", TextView.class);
        this.L = findRequiredView25;
        findRequiredView25.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.20
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.onClickUbahTransaksiSetoran(view2);
            }
        });
        View findRequiredView26 = Utils.findRequiredView(view, 2131299728, "field 'tvUbahTransaksiBerkala' and method 'onClickUbahTransferBerkala'");
        reviewSetoranFragment.tvUbahTransaksiBerkala = (TextView) Utils.castView(findRequiredView26, 2131299728, "field 'tvUbahTransaksiBerkala'", TextView.class);
        this.M = findRequiredView26;
        findRequiredView26.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.17
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.onClickUbahTransferBerkala(view2);
            }
        });
        View findRequiredView27 = Utils.findRequiredView(view, 2131299720, "field 'tvUbahPengirim' and method 'onClickUbahDataPengirim'");
        reviewSetoranFragment.tvUbahPengirim = (TextView) Utils.castView(findRequiredView27, 2131299720, "field 'tvUbahPengirim'", TextView.class);
        this.F = findRequiredView27;
        findRequiredView27.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.22
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.onClickUbahDataPengirim(view2);
            }
        });
        View findRequiredView28 = Utils.findRequiredView(view, 2131299712, "field 'tvUbahDataOrangDatangKeCabang' and method 'onClickUbahDataOrangDatangKeCabang'");
        reviewSetoranFragment.tvUbahDataOrangDatangKeCabang = (TextView) Utils.castView(findRequiredView28, 2131299712, "field 'tvUbahDataOrangDatangKeCabang'", TextView.class);
        this.I = findRequiredView28;
        findRequiredView28.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.23
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.onClickUbahDataOrangDatangKeCabang(view2);
            }
        });
        View findRequiredView29 = Utils.findRequiredView(view, 2131296469, "field 'cbxAgree' and method 'checkboxAgree'");
        reviewSetoranFragment.cbxAgree = (CheckBox) Utils.castView(findRequiredView29, 2131296469, "field 'cbxAgree'", CheckBox.class);
        this.d = findRequiredView29;
        ((CompoundButton) findRequiredView29).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.25
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                reviewSetoranFragment.checkboxAgree(compoundButton, z);
            }
        });
        View findRequiredView30 = Utils.findRequiredView(view, 2131299604, "field 'tvTermCondition' and method 'clickedTermsCondition'");
        reviewSetoranFragment.tvTermCondition = (TextView) Utils.castView(findRequiredView30, 2131299604, "field 'tvTermCondition'", TextView.class);
        this.z = findRequiredView30;
        findRequiredView30.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.24
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.clickedTermsCondition(view2);
            }
        });
        reviewSetoranFragment.llSyaratKetentuan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297904, "field 'llSyaratKetentuan'", LinearLayout.class);
        View findRequiredView31 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'onClicedButton'");
        reviewSetoranFragment.btnProses = (Button) Utils.castView(findRequiredView31, 2131296440, "field 'btnProses'", Button.class);
        this.a = findRequiredView31;
        findRequiredView31.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.30
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.onClicedButton(view2);
            }
        });
        reviewSetoranFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView32 = Utils.findRequiredView(view, 2131298904, "method 'showDataPenerima'");
        this.C = findRequiredView32;
        findRequiredView32.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.27
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.showDataPenerima(view2);
            }
        });
        View findRequiredView33 = Utils.findRequiredView(view, 2131299691, "method 'showDataTransaksiSetoran'");
        this.E = findRequiredView33;
        findRequiredView33.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.28
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.showDataTransaksiSetoran(view2);
            }
        });
        View findRequiredView34 = Utils.findRequiredView(view, 2131298910, "method 'showDataPengirim'");
        this.B = findRequiredView34;
        findRequiredView34.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.26
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.showDataPengirim(view2);
            }
        });
        View findRequiredView35 = Utils.findRequiredView(view, 2131298902, "method 'showDataOrangDatangKeCabang'");
        this.D = findRequiredView35;
        findRequiredView35.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.29
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.showDataOrangDatangKeCabang(view2);
            }
        });
        View findRequiredView36 = Utils.findRequiredView(view, 2131299693, "method 'showDataTransaksiBerkala'");
        this.G = findRequiredView36;
        findRequiredView36.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment_ViewBinding.32
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reviewSetoranFragment.showDataTransaksiBerkala(view2);
            }
        });
        reviewSetoranFragment.viewGroupPenerima = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297142, "field 'viewGroupPenerima'"), Utils.findRequiredView(view, 2131297143, "field 'viewGroupPenerima'"), Utils.findRequiredView(view, 2131297144, "field 'viewGroupPenerima'"));
        reviewSetoranFragment.tvErrorsPenerima = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299078, "field 'tvErrorsPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrorsPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299182, "field 'tvErrorsPenerima'", TextView.class));
        reviewSetoranFragment.tilFormsPenerima = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298714, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class));
        reviewSetoranFragment.viewGroupTransaksiSetoran = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296954, "field 'viewGroupTransaksiSetoran'"));
        reviewSetoranFragment.tilFormsSetoran = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilFormsSetoran'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298504, "field 'tilFormsSetoran'", LogoutDialog_ViewBinding.class));
        reviewSetoranFragment.viewGroupTransaksiBerkala = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297178, "field 'viewGroupTransaksiBerkala'"), Utils.findRequiredView(view, 2131297203, "field 'viewGroupTransaksiBerkala'"));
        reviewSetoranFragment.tilFormsTransaksiBerkala = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298712, "field 'tilFormsTransaksiBerkala'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298735, "field 'tilFormsTransaksiBerkala'", LogoutDialog_ViewBinding.class));
        reviewSetoranFragment.viewGroupPengirim = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297148, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297151, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297149, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297134, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297147, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297150, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297153, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297154, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297152, "field 'viewGroupPengirim'"));
        reviewSetoranFragment.tvErrorsPengirim = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299157, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299121, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299086, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299148, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298961, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299199, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299231, "field 'tvErrorsPengirim'", TextView.class));
        reviewSetoranFragment.tilFormsPengirim = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298679, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298481, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298689, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298690, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298685, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class));
        reviewSetoranFragment.viewGroupOrangDatangKeCabang = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297138, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131297135, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131297137, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131297136, "field 'viewGroupOrangDatangKeCabang'"));
        reviewSetoranFragment.tvErrorsOrangDatangKeCabang = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299152, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299149, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299151, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299150, "field 'tvErrorsOrangDatangKeCabang'", TextView.class));
        reviewSetoranFragment.tilFormsOrangDatangKeCabang = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298683, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298680, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298682, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298681, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class));
        Context context = view.getContext();
        Resources resources = context.getResources();
        reviewSetoranFragment.arrayHari = resources.getStringArray(2130903059);
        reviewSetoranFragment.colorPaleGrey = copyWindowDataInto.a(context, 2131099821);
        reviewSetoranFragment.colorPaleBlue = copyWindowDataInto.a(context, 2131099820);
        reviewSetoranFragment.labelSetiapBeberapaHari = resources.getString(2131821580);
        reviewSetoranFragment.labelSetiapHari = resources.getString(2131821581);
        reviewSetoranFragment.labelSetiapTanggal = resources.getString(2131821582);
        reviewSetoranFragment.nomorKtp = resources.getString(2131821553);
        reviewSetoranFragment.nomorPaspor = resources.getString(2131821556);
        reviewSetoranFragment.nomorRekening = resources.getString(2131821949);
        reviewSetoranFragment.labelKtp = resources.getString(2131821815);
        reviewSetoranFragment.labelPaspor = resources.getString(2131821986);
        reviewSetoranFragment.labelSiupNib = resources.getString(2131822122);
        reviewSetoranFragment.labelRekening = resources.getString(2131822074);
        reviewSetoranFragment.namaSesuaiKtp = resources.getString(2131821933);
        reviewSetoranFragment.namaSesuaiPaspor = resources.getString(2131821530);
        reviewSetoranFragment.namaRekening = resources.getString(2131821919);
        reviewSetoranFragment.namaPerusahaan = resources.getString(2131821931);
        reviewSetoranFragment.alamatSesuaiKtp = resources.getString(2131821060);
        reviewSetoranFragment.alamatSesuaiPaspor = resources.getString(2131821061);
        reviewSetoranFragment.nomorSiupNib = resources.getString(2131821192);
        reviewSetoranFragment.txtTermCondition = resources.getString(2131821427);
        reviewSetoranFragment.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReviewSetoranFragment reviewSetoranFragment = this.c;
        if (reviewSetoranFragment != null) {
            this.c = null;
            reviewSetoranFragment.tvPenerimaNama = null;
            reviewSetoranFragment.tvPenerimaNorek = null;
            reviewSetoranFragment.tvPenerimaSimpanNama = null;
            reviewSetoranFragment.rlPenerimaSimpanNamaDisabled = null;
            reviewSetoranFragment.tvTransaksiJumlah = null;
            reviewSetoranFragment.tvTransaksiBerita = null;
            reviewSetoranFragment.tvBerkalaSetiap = null;
            reviewSetoranFragment.tvBerkalaTanggalBerakhir = null;
            reviewSetoranFragment.tvBerkalaTitleSetiap = null;
            reviewSetoranFragment.tvPengirimPemilikSumberDana = null;
            reviewSetoranFragment.tvPengirimJenisId = null;
            reviewSetoranFragment.tvPengirimNama = null;
            reviewSetoranFragment.tvPengirimNoId = null;
            reviewSetoranFragment.tvPengirimNoRek = null;
            reviewSetoranFragment.tvPengirimAlamat = null;
            reviewSetoranFragment.tvPengirimNoHp = null;
            reviewSetoranFragment.tvPengirimSumberDana = null;
            reviewSetoranFragment.tvPengirimTujuanTransaksi = null;
            reviewSetoranFragment.tvPengirimTitleNoId = null;
            reviewSetoranFragment.tvPengirimTitleAlamat = null;
            reviewSetoranFragment.tvPengirimTitleNama = null;
            reviewSetoranFragment.tvOrangSamaDenganPemilikSD = null;
            reviewSetoranFragment.tvOrangJenisID = null;
            reviewSetoranFragment.tvOrangNama = null;
            reviewSetoranFragment.tvOrangNomorID = null;
            reviewSetoranFragment.tvOrangTitleNama = null;
            reviewSetoranFragment.tvOrangTitleNomorID = null;
            reviewSetoranFragment.rlPengirimPemilikSumberDanaDisabled = null;
            reviewSetoranFragment.rlPengirimJenisIdDisabled = null;
            reviewSetoranFragment.rlPengirimNamaDisabled = null;
            reviewSetoranFragment.rlPengirimNoIdDisabled = null;
            reviewSetoranFragment.rlPengirimNorekDisabled = null;
            reviewSetoranFragment.rlPengirimAlamatDisabled = null;
            reviewSetoranFragment.rlPengirimNoHpDisabled = null;
            reviewSetoranFragment.rlPengirimSumberDanaDisabled = null;
            reviewSetoranFragment.rlPengirimTujuanDisabled = null;
            reviewSetoranFragment.etNamaPenerima = null;
            reviewSetoranFragment.etNoRekPenerima = null;
            reviewSetoranFragment.etSimpanNama = null;
            reviewSetoranFragment.tilNama = null;
            reviewSetoranFragment.tilNorek = null;
            reviewSetoranFragment.tilSimpanNama = null;
            reviewSetoranFragment.etJumlahSetoran = null;
            reviewSetoranFragment.etBeritaSetoran = null;
            reviewSetoranFragment.tilJumlah = null;
            reviewSetoranFragment.tilBerita = null;
            reviewSetoranFragment.etSetiapBeberapaHari = null;
            reviewSetoranFragment.tvErrorSetiapBeberapaHari = null;
            reviewSetoranFragment.etTanggalBerakhir = null;
            reviewSetoranFragment.tilSetiapBeberapaHari = null;
            reviewSetoranFragment.tilTanggalBerakhir = null;
            reviewSetoranFragment.etPengirimPemilikSumberDana = null;
            reviewSetoranFragment.etJenisId = null;
            reviewSetoranFragment.etNamaPengirim = null;
            reviewSetoranFragment.etNoIDPengirim = null;
            reviewSetoranFragment.etNorekPengirim = null;
            reviewSetoranFragment.etAlamatPengirim = null;
            reviewSetoranFragment.etNoHpPengirim = null;
            reviewSetoranFragment.etPengirimSumberDana = null;
            reviewSetoranFragment.etPengirimTujuanTransaksi = null;
            reviewSetoranFragment.llData100TransaksiSetoran = null;
            reviewSetoranFragment.tilJenisId = null;
            reviewSetoranFragment.tilNoId = null;
            reviewSetoranFragment.tilNamaLengkap = null;
            reviewSetoranFragment.tilNorekPengirim = null;
            reviewSetoranFragment.tilALamatLengkap = null;
            reviewSetoranFragment.tilNoHp = null;
            reviewSetoranFragment.tilPengirimSumberDana = null;
            reviewSetoranFragment.tilPengirimTujuanTransaksi = null;
            reviewSetoranFragment.tilPemilikSumberDana = null;
            reviewSetoranFragment.etOrangSamaDenganPemilik = null;
            reviewSetoranFragment.etOrangJenisId = null;
            reviewSetoranFragment.etOrangNama = null;
            reviewSetoranFragment.etOrangNoID = null;
            reviewSetoranFragment.tilOrangSamaDenganPemilik = null;
            reviewSetoranFragment.tilOrangJenisId = null;
            reviewSetoranFragment.tilOrangNoId = null;
            reviewSetoranFragment.tilOrangNama = null;
            reviewSetoranFragment.formJenisIdentitas = null;
            reviewSetoranFragment.llUneditableBedaDenganPemilikSumberDana = null;
            reviewSetoranFragment.rlOrangSamaDenganPemilikSdUneditable = null;
            reviewSetoranFragment.llWrapperDataPenerima = null;
            reviewSetoranFragment.llHeaderDataPenerima = null;
            reviewSetoranFragment.ivDataPenerima = null;
            reviewSetoranFragment.llWrapperTransaksiSetoran = null;
            reviewSetoranFragment.llHeaderTransaksiSetoran = null;
            reviewSetoranFragment.ivTransaksiSetoran = null;
            reviewSetoranFragment.llWrapperTransferBerkala = null;
            reviewSetoranFragment.llHeaderTransferBerkala = null;
            reviewSetoranFragment.ivTransferBerkala = null;
            reviewSetoranFragment.llWrapperPengirim = null;
            reviewSetoranFragment.llHeaderPengirim = null;
            reviewSetoranFragment.ivPengirim = null;
            reviewSetoranFragment.llWrapperDataOrangDatangKeCabang = null;
            reviewSetoranFragment.llHeaderDataOrangDatangKeCabang = null;
            reviewSetoranFragment.ivDataOrangDatangKeCabang = null;
            reviewSetoranFragment.llLayoutDataPenerima = null;
            reviewSetoranFragment.llLayoutTransaksiSetoran = null;
            reviewSetoranFragment.llLayoutTransferBerkala = null;
            reviewSetoranFragment.llLayoutPengirim = null;
            reviewSetoranFragment.llLayoutDataOrangDatangKeCabang = null;
            reviewSetoranFragment.llDataPenerimaDisabled = null;
            reviewSetoranFragment.llDataTransaksiSetoranDisabled = null;
            reviewSetoranFragment.llDataTransferBerkalaDisabled = null;
            reviewSetoranFragment.llDataPengirimDisabled = null;
            reviewSetoranFragment.llDataOrangDatangKeCabangDisabled = null;
            reviewSetoranFragment.llDataPenerima = null;
            reviewSetoranFragment.llDataTransaksiSetoran = null;
            reviewSetoranFragment.llDataTransferBerkala = null;
            reviewSetoranFragment.llDataPengirim = null;
            reviewSetoranFragment.llDataOrangDatangKeCabang = null;
            reviewSetoranFragment.tvUbahPenerima = null;
            reviewSetoranFragment.tvUbahTransaksiSetoran = null;
            reviewSetoranFragment.tvUbahTransaksiBerkala = null;
            reviewSetoranFragment.tvUbahPengirim = null;
            reviewSetoranFragment.tvUbahDataOrangDatangKeCabang = null;
            reviewSetoranFragment.cbxAgree = null;
            reviewSetoranFragment.tvTermCondition = null;
            reviewSetoranFragment.llSyaratKetentuan = null;
            reviewSetoranFragment.btnProses = null;
            reviewSetoranFragment.svMain = null;
            reviewSetoranFragment.viewGroupPenerima = null;
            reviewSetoranFragment.tvErrorsPenerima = null;
            reviewSetoranFragment.tilFormsPenerima = null;
            reviewSetoranFragment.viewGroupTransaksiSetoran = null;
            reviewSetoranFragment.tilFormsSetoran = null;
            reviewSetoranFragment.viewGroupTransaksiBerkala = null;
            reviewSetoranFragment.tilFormsTransaksiBerkala = null;
            reviewSetoranFragment.viewGroupPengirim = null;
            reviewSetoranFragment.tvErrorsPengirim = null;
            reviewSetoranFragment.tilFormsPengirim = null;
            reviewSetoranFragment.viewGroupOrangDatangKeCabang = null;
            reviewSetoranFragment.tvErrorsOrangDatangKeCabang = null;
            reviewSetoranFragment.tilFormsOrangDatangKeCabang = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.k.setOnFocusChangeListener(null);
            this.k = null;
            this.l.setOnFocusChangeListener(null);
            this.l = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.t.setOnClickListener(null);
            this.t.setOnFocusChangeListener(null);
            this.t = null;
            this.y.setOnClickListener(null);
            this.y = null;
            this.f56o.setOnClickListener(null);
            this.f56o = null;
            this.m.setOnFocusChangeListener(null);
            this.m = null;
            this.q.setOnFocusChangeListener(null);
            this.q = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.n.setOnFocusChangeListener(null);
            this.n = null;
            this.r.setOnFocusChangeListener(null);
            this.r = null;
            this.p.setOnClickListener(null);
            this.p = null;
            this.s.setOnClickListener(null);
            this.s = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.x.setOnClickListener(null);
            this.x = null;
            this.u.setOnClickListener(null);
            this.u = null;
            this.A.setOnClickListener(null);
            this.A = null;
            this.w.setOnClickListener(null);
            this.w = null;
            this.v.setOnClickListener(null);
            this.v = null;
            this.H.setOnClickListener(null);
            this.H = null;
            this.L.setOnClickListener(null);
            this.L = null;
            this.M.setOnClickListener(null);
            this.M = null;
            this.F.setOnClickListener(null);
            this.F = null;
            this.I.setOnClickListener(null);
            this.I = null;
            ((CompoundButton) this.d).setOnCheckedChangeListener(null);
            this.d = null;
            this.z.setOnClickListener(null);
            this.z = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.C.setOnClickListener(null);
            this.C = null;
            this.E.setOnClickListener(null);
            this.E = null;
            this.B.setOnClickListener(null);
            this.B = null;
            this.D.setOnClickListener(null);
            this.D = null;
            this.G.setOnClickListener(null);
            this.G = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
