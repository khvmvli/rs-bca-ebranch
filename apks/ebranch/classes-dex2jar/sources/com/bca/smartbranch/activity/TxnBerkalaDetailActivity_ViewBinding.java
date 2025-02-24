package com.bca.smartbranch.activity;

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
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TxnBerkalaDetailActivity_ViewBinding.class */
public class TxnBerkalaDetailActivity_ViewBinding implements Unbinder {
    private View A;
    private View B;
    private View C;
    private View D;
    private View E;
    private View F;
    private View G;
    private View H;
    private View I;
    private View K;
    private View M;
    private View a;
    private View b;
    private View c;
    private TxnBerkalaDetailActivity d;
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
    private View f27o;
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

    public TxnBerkalaDetailActivity_ViewBinding(final TxnBerkalaDetailActivity txnBerkalaDetailActivity, View view) {
        this.d = txnBerkalaDetailActivity;
        txnBerkalaDetailActivity.tvPenerimaNama = (TextView) Utils.findRequiredViewAsType(view, 2131299519, "field 'tvPenerimaNama'", TextView.class);
        txnBerkalaDetailActivity.tvPenerimaNorek = (TextView) Utils.findRequiredViewAsType(view, 2131299520, "field 'tvPenerimaNorek'", TextView.class);
        txnBerkalaDetailActivity.tvPenerimaSimpanNama = (TextView) Utils.findRequiredViewAsType(view, 2131299521, "field 'tvPenerimaSimpanNama'", TextView.class);
        txnBerkalaDetailActivity.rlPenerimaSimpanNamaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298289, "field 'rlPenerimaSimpanNamaDisabled'", RelativeLayout.class);
        txnBerkalaDetailActivity.tvTransaksiJumlah = (TextView) Utils.findRequiredViewAsType(view, 2131299316, "field 'tvTransaksiJumlah'", TextView.class);
        txnBerkalaDetailActivity.tvTransaksiBerita = (TextView) Utils.findRequiredViewAsType(view, 2131298847, "field 'tvTransaksiBerita'", TextView.class);
        txnBerkalaDetailActivity.tvBerkalaSetiap = (TextView) Utils.findRequiredViewAsType(view, 2131299569, "field 'tvBerkalaSetiap'", TextView.class);
        txnBerkalaDetailActivity.tvBerkalaTanggalBerakhir = (TextView) Utils.findRequiredViewAsType(view, 2131299595, "field 'tvBerkalaTanggalBerakhir'", TextView.class);
        txnBerkalaDetailActivity.tvBerkalaTitleSetiap = (TextView) Utils.findRequiredViewAsType(view, 2131299665, "field 'tvBerkalaTitleSetiap'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimPemilikSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299530, "field 'tvPengirimPemilikSumberDana'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimJenisId = (TextView) Utils.findRequiredViewAsType(view, 2131299525, "field 'tvPengirimJenisId'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimNama = (TextView) Utils.findRequiredViewAsType(view, 2131299526, "field 'tvPengirimNama'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimNoId = (TextView) Utils.findRequiredViewAsType(view, 2131299528, "field 'tvPengirimNoId'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimNoRek = (TextView) Utils.findRequiredViewAsType(view, 2131299529, "field 'tvPengirimNoRek'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131299524, "field 'tvPengirimAlamat'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimNoHp = (TextView) Utils.findRequiredViewAsType(view, 2131299527, "field 'tvPengirimNoHp'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299531, "field 'tvPengirimSumberDana'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimTujuanTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299535, "field 'tvPengirimTujuanTransaksi'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimTitleNoId = (TextView) Utils.findRequiredViewAsType(view, 2131299534, "field 'tvPengirimTitleNoId'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimTitleAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131299532, "field 'tvPengirimTitleAlamat'", TextView.class);
        txnBerkalaDetailActivity.tvPengirimTitleNama = (TextView) Utils.findRequiredViewAsType(view, 2131299533, "field 'tvPengirimTitleNama'", TextView.class);
        txnBerkalaDetailActivity.tvOrangSamaDenganPemilikSD = (TextView) Utils.findRequiredViewAsType(view, 2131299507, "field 'tvOrangSamaDenganPemilikSD'", TextView.class);
        txnBerkalaDetailActivity.tvOrangJenisID = (TextView) Utils.findRequiredViewAsType(view, 2131299504, "field 'tvOrangJenisID'", TextView.class);
        txnBerkalaDetailActivity.tvOrangNama = (TextView) Utils.findRequiredViewAsType(view, 2131299505, "field 'tvOrangNama'", TextView.class);
        txnBerkalaDetailActivity.tvOrangNomorID = (TextView) Utils.findRequiredViewAsType(view, 2131299506, "field 'tvOrangNomorID'", TextView.class);
        txnBerkalaDetailActivity.tvOrangTitleNama = (TextView) Utils.findRequiredViewAsType(view, 2131299508, "field 'tvOrangTitleNama'", TextView.class);
        txnBerkalaDetailActivity.tvOrangTitleNomorID = (TextView) Utils.findRequiredViewAsType(view, 2131299509, "field 'tvOrangTitleNomorID'", TextView.class);
        txnBerkalaDetailActivity.rlPengirimPemilikSumberDanaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298296, "field 'rlPengirimPemilikSumberDanaDisabled'", RelativeLayout.class);
        txnBerkalaDetailActivity.rlPengirimJenisIdDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298291, "field 'rlPengirimJenisIdDisabled'", RelativeLayout.class);
        txnBerkalaDetailActivity.rlPengirimNamaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298292, "field 'rlPengirimNamaDisabled'", RelativeLayout.class);
        txnBerkalaDetailActivity.rlPengirimNoIdDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298294, "field 'rlPengirimNoIdDisabled'", RelativeLayout.class);
        txnBerkalaDetailActivity.rlPengirimNorekDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298295, "field 'rlPengirimNorekDisabled'", RelativeLayout.class);
        txnBerkalaDetailActivity.rlPengirimAlamatDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298290, "field 'rlPengirimAlamatDisabled'", RelativeLayout.class);
        txnBerkalaDetailActivity.rlPengirimNoHpDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298293, "field 'rlPengirimNoHpDisabled'", RelativeLayout.class);
        txnBerkalaDetailActivity.rlPengirimSumberDanaDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298297, "field 'rlPengirimSumberDanaDisabled'", RelativeLayout.class);
        txnBerkalaDetailActivity.rlPengirimTujuanDisabled = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298298, "field 'rlPengirimTujuanDisabled'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297142, "field 'etNamaPenerima' and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etNamaPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView, 2131297142, "field 'etNamaPenerima'", AutoCompleteTextView.class);
        this.i = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297143, "field 'etNoRekPenerima' and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etNoRekPenerima = (AutoCompleteTextView) Utils.castView(findRequiredView2, 2131297143, "field 'etNoRekPenerima'", AutoCompleteTextView.class);
        this.l = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.13
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297144, "field 'etSimpanNama' and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etSimpanNama = (EditText) Utils.castView(findRequiredView3, 2131297144, "field 'etSimpanNama'", EditText.class);
        this.m = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.21
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        txnBerkalaDetailActivity.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilSimpanNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298714, "field 'tilSimpanNama'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.etJumlahSetoran = (EditText) Utils.findRequiredViewAsType(view, 2131297006, "field 'etJumlahSetoran'", EditText.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296954, "field 'etBeritaSetoran' and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etBeritaSetoran = (EditText) Utils.castView(findRequiredView4, 2131296954, "field 'etBeritaSetoran'", EditText.class);
        this.c = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.32
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        txnBerkalaDetailActivity.tilJumlah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilJumlah'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilBerita = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298504, "field 'tilBerita'", LogoutDialog_ViewBinding.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131297178, "field 'etSetiapBeberapaHari', method 'updateDaftarTransfer', and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etSetiapBeberapaHari = (EditText) Utils.castView(findRequiredView5, 2131297178, "field 'etSetiapBeberapaHari'", EditText.class);
        this.q = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.34
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.updateDaftarTransfer(view2);
            }
        });
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.31
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        txnBerkalaDetailActivity.tvErrorSetiapBeberapaHari = (TextView) Utils.findRequiredViewAsType(view, 2131299180, "field 'tvErrorSetiapBeberapaHari'", TextView.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131297203, "field 'etTanggalBerakhir' and method 'updateDaftarTransfer'");
        txnBerkalaDetailActivity.etTanggalBerakhir = (EditText) Utils.castView(findRequiredView6, 2131297203, "field 'etTanggalBerakhir'", EditText.class);
        this.v = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.33
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.updateDaftarTransfer(view2);
            }
        });
        txnBerkalaDetailActivity.tilSetiapBeberapaHari = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298712, "field 'tilSetiapBeberapaHari'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilTanggalBerakhir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298735, "field 'tilTanggalBerakhir'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.etPengirimPemilikSumberDana = (EditText) Utils.findRequiredViewAsType(view, 2131297152, "field 'etPengirimPemilikSumberDana'", EditText.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297148, "field 'etJenisId' and method 'clickJenisIdentitasPemilikSumberDana'");
        txnBerkalaDetailActivity.etJenisId = (EditText) Utils.castView(findRequiredView7, 2131297148, "field 'etJenisId'", EditText.class);
        this.n = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.38
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.clickJenisIdentitasPemilikSumberDana(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297149, "field 'etNamaPengirim' and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etNamaPengirim = (EditText) Utils.castView(findRequiredView8, 2131297149, "field 'etNamaPengirim'", EditText.class);
        this.f27o = findRequiredView8;
        findRequiredView8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.40
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297151, "field 'etNoIDPengirim' and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etNoIDPengirim = (EditText) Utils.castView(findRequiredView9, 2131297151, "field 'etNoIDPengirim'", EditText.class);
        this.p = findRequiredView9;
        findRequiredView9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297134, "field 'etNorekPengirim' and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etNorekPengirim = (EditText) Utils.castView(findRequiredView10, 2131297134, "field 'etNorekPengirim'", EditText.class);
        this.a = findRequiredView10;
        findRequiredView10.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297147, "field 'etAlamatPengirim' and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etAlamatPengirim = (EditText) Utils.castView(findRequiredView11, 2131297147, "field 'etAlamatPengirim'", EditText.class);
        this.k = findRequiredView11;
        findRequiredView11.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297150, "field 'etNoHpPengirim' and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etNoHpPengirim = (EditText) Utils.castView(findRequiredView12, 2131297150, "field 'etNoHpPengirim'", EditText.class);
        this.t = findRequiredView12;
        findRequiredView12.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297153, "field 'etPengirimSumberDana' and method 'clickView'");
        txnBerkalaDetailActivity.etPengirimSumberDana = (EditText) Utils.castView(findRequiredView13, 2131297153, "field 'etPengirimSumberDana'", EditText.class);
        this.s = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.clickView(view2);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297154, "field 'etPengirimTujuanTransaksi' and method 'clickView'");
        txnBerkalaDetailActivity.etPengirimTujuanTransaksi = (EditText) Utils.castView(findRequiredView14, 2131297154, "field 'etPengirimTujuanTransaksi'", EditText.class);
        this.r = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.clickView(view2);
            }
        });
        txnBerkalaDetailActivity.llData100TransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297573, "field 'llData100TransaksiSetoran'", LinearLayout.class);
        txnBerkalaDetailActivity.tilJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilJenisId'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilNoId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilNoId'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilNamaLengkap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilNamaLengkap'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilNorekPengirim = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298679, "field 'tilNorekPengirim'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilALamatLengkap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298481, "field 'tilALamatLengkap'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilPengirimSumberDana = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298689, "field 'tilPengirimSumberDana'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilPengirimTujuanTransaksi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298690, "field 'tilPengirimTujuanTransaksi'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilPemilikSumberDana = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298685, "field 'tilPemilikSumberDana'", LogoutDialog_ViewBinding.class);
        View findRequiredView15 = Utils.findRequiredView(view, 2131297138, "field 'etOrangSamaDenganPemilik' and method 'clickOrangSamaDenganPemilik'");
        txnBerkalaDetailActivity.etOrangSamaDenganPemilik = (EditText) Utils.castView(findRequiredView15, 2131297138, "field 'etOrangSamaDenganPemilik'", EditText.class);
        this.g = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.clickOrangSamaDenganPemilik(view2);
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131297135, "field 'etOrangJenisId' and method 'clickJenisIdentitas'");
        txnBerkalaDetailActivity.etOrangJenisId = (EditText) Utils.castView(findRequiredView16, 2131297135, "field 'etOrangJenisId'", EditText.class);
        this.j = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.clickJenisIdentitas(view2);
            }
        });
        View findRequiredView17 = Utils.findRequiredView(view, 2131297136, "field 'etOrangNama' and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etOrangNama = (EditText) Utils.castView(findRequiredView17, 2131297136, "field 'etOrangNama'", EditText.class);
        this.h = findRequiredView17;
        findRequiredView17.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        View findRequiredView18 = Utils.findRequiredView(view, 2131297137, "field 'etOrangNoID' and method 'inputChangePenerima'");
        txnBerkalaDetailActivity.etOrangNoID = (EditText) Utils.castView(findRequiredView18, 2131297137, "field 'etOrangNoID'", EditText.class);
        this.f = findRequiredView18;
        findRequiredView18.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.15
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                txnBerkalaDetailActivity.inputChangePenerima(view2, z);
            }
        });
        txnBerkalaDetailActivity.tilOrangSamaDenganPemilik = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298683, "field 'tilOrangSamaDenganPemilik'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilOrangJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298680, "field 'tilOrangJenisId'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilOrangNoId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298682, "field 'tilOrangNoId'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.tilOrangNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298681, "field 'tilOrangNama'", LogoutDialog_ViewBinding.class);
        txnBerkalaDetailActivity.formJenisIdentitas = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297257, "field 'formJenisIdentitas'", LinearLayout.class);
        txnBerkalaDetailActivity.llUneditableBedaDenganPemilikSumberDana = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297928, "field 'llUneditableBedaDenganPemilikSumberDana'", LinearLayout.class);
        txnBerkalaDetailActivity.rlOrangSamaDenganPemilikSdUneditable = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298286, "field 'rlOrangSamaDenganPemilikSdUneditable'", RelativeLayout.class);
        txnBerkalaDetailActivity.llWrapperDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297948, "field 'llWrapperDataPenerima'", LinearLayout.class);
        txnBerkalaDetailActivity.llHeaderDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297665, "field 'llHeaderDataPenerima'", LinearLayout.class);
        View findRequiredView19 = Utils.findRequiredView(view, 2131297344, "field 'ivDataPenerima' and method 'showDataPenerima'");
        txnBerkalaDetailActivity.ivDataPenerima = (ImageView) Utils.castView(findRequiredView19, 2131297344, "field 'ivDataPenerima'", ImageView.class);
        this.w = findRequiredView19;
        findRequiredView19.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.showDataPenerima(view2);
            }
        });
        txnBerkalaDetailActivity.llWrapperTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297963, "field 'llWrapperTransaksiSetoran'", LinearLayout.class);
        txnBerkalaDetailActivity.llHeaderTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297678, "field 'llHeaderTransaksiSetoran'", LinearLayout.class);
        View findRequiredView20 = Utils.findRequiredView(view, 2131297419, "field 'ivTransaksiSetoran' and method 'showDataTransaksiSetoran'");
        txnBerkalaDetailActivity.ivTransaksiSetoran = (ImageView) Utils.castView(findRequiredView20, 2131297419, "field 'ivTransaksiSetoran'", ImageView.class);
        this.y = findRequiredView20;
        findRequiredView20.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.showDataTransaksiSetoran(view2);
            }
        });
        txnBerkalaDetailActivity.llWrapperTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297964, "field 'llWrapperTransferBerkala'", LinearLayout.class);
        txnBerkalaDetailActivity.llHeaderTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297679, "field 'llHeaderTransferBerkala'", LinearLayout.class);
        View findRequiredView21 = Utils.findRequiredView(view, 2131297420, "field 'ivTransferBerkala' and method 'showDataTransaksiBerkala'");
        txnBerkalaDetailActivity.ivTransferBerkala = (ImageView) Utils.castView(findRequiredView21, 2131297420, "field 'ivTransferBerkala'", ImageView.class);
        this.D = findRequiredView21;
        findRequiredView21.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.showDataTransaksiBerkala(view2);
            }
        });
        txnBerkalaDetailActivity.llWrapperPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297954, "field 'llWrapperPengirim'", LinearLayout.class);
        txnBerkalaDetailActivity.llHeaderPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297671, "field 'llHeaderPengirim'", LinearLayout.class);
        View findRequiredView22 = Utils.findRequiredView(view, 2131297350, "field 'ivPengirim' and method 'showDataPengirim'");
        txnBerkalaDetailActivity.ivPengirim = (ImageView) Utils.castView(findRequiredView22, 2131297350, "field 'ivPengirim'", ImageView.class);
        this.x = findRequiredView22;
        findRequiredView22.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.16
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.showDataPengirim(view2);
            }
        });
        txnBerkalaDetailActivity.llWrapperDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297946, "field 'llWrapperDataOrangDatangKeCabang'", LinearLayout.class);
        txnBerkalaDetailActivity.llHeaderDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297663, "field 'llHeaderDataOrangDatangKeCabang'", LinearLayout.class);
        View findRequiredView23 = Utils.findRequiredView(view, 2131297342, "field 'ivDataOrangDatangKeCabang' and method 'showDataOrangDatangKeCabang'");
        txnBerkalaDetailActivity.ivDataOrangDatangKeCabang = (ImageView) Utils.castView(findRequiredView23, 2131297342, "field 'ivDataOrangDatangKeCabang'", ImageView.class);
        this.u = findRequiredView23;
        findRequiredView23.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.20
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.showDataOrangDatangKeCabang(view2);
            }
        });
        txnBerkalaDetailActivity.llLayoutDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297465, "field 'llLayoutDataPenerima'", LinearLayout.class);
        txnBerkalaDetailActivity.llLayoutTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297503, "field 'llLayoutTransaksiSetoran'", LinearLayout.class);
        txnBerkalaDetailActivity.llLayoutTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297504, "field 'llLayoutTransferBerkala'", LinearLayout.class);
        txnBerkalaDetailActivity.llLayoutPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297473, "field 'llLayoutPengirim'", LinearLayout.class);
        txnBerkalaDetailActivity.llLayoutDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297461, "field 'llLayoutDataOrangDatangKeCabang'", LinearLayout.class);
        txnBerkalaDetailActivity.llDataPenerimaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297599, "field 'llDataPenerimaDisabled'", LinearLayout.class);
        txnBerkalaDetailActivity.llDataTransaksiSetoranDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297611, "field 'llDataTransaksiSetoranDisabled'", LinearLayout.class);
        txnBerkalaDetailActivity.llDataTransferBerkalaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297607, "field 'llDataTransferBerkalaDisabled'", LinearLayout.class);
        txnBerkalaDetailActivity.llDataPengirimDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297602, "field 'llDataPengirimDisabled'", LinearLayout.class);
        txnBerkalaDetailActivity.llDataOrangDatangKeCabangDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297586, "field 'llDataOrangDatangKeCabangDisabled'", LinearLayout.class);
        txnBerkalaDetailActivity.llDataPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297588, "field 'llDataPenerima'", LinearLayout.class);
        txnBerkalaDetailActivity.llDataTransaksiSetoran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297610, "field 'llDataTransaksiSetoran'", LinearLayout.class);
        txnBerkalaDetailActivity.llDataTransferBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297606, "field 'llDataTransferBerkala'", LinearLayout.class);
        txnBerkalaDetailActivity.llDataPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297600, "field 'llDataPengirim'", LinearLayout.class);
        txnBerkalaDetailActivity.llDataOrangDatangKeCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297585, "field 'llDataOrangDatangKeCabang'", LinearLayout.class);
        View findRequiredView24 = Utils.findRequiredView(view, 2131299714, "field 'tvUbahPenerima' and method 'onClickUbahDataPenerima'");
        txnBerkalaDetailActivity.tvUbahPenerima = (TextView) Utils.castView(findRequiredView24, 2131299714, "field 'tvUbahPenerima'", TextView.class);
        this.G = findRequiredView24;
        findRequiredView24.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.19
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.onClickUbahDataPenerima(view2);
            }
        });
        View findRequiredView25 = Utils.findRequiredView(view, 2131299727, "field 'tvUbahTransaksiSetoran' and method 'onClickUbahTransaksiSetoran'");
        txnBerkalaDetailActivity.tvUbahTransaksiSetoran = (TextView) Utils.castView(findRequiredView25, 2131299727, "field 'tvUbahTransaksiSetoran'", TextView.class);
        this.M = findRequiredView25;
        findRequiredView25.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.18
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.onClickUbahTransaksiSetoran(view2);
            }
        });
        View findRequiredView26 = Utils.findRequiredView(view, 2131299728, "field 'tvUbahTransaksiBerkala' and method 'onClickUbahTransferBerkala'");
        txnBerkalaDetailActivity.tvUbahTransaksiBerkala = (TextView) Utils.castView(findRequiredView26, 2131299728, "field 'tvUbahTransaksiBerkala'", TextView.class);
        this.K = findRequiredView26;
        findRequiredView26.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.17
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.onClickUbahTransferBerkala(view2);
            }
        });
        View findRequiredView27 = Utils.findRequiredView(view, 2131299720, "field 'tvUbahPengirim' and method 'onClickUbahDataPengirim'");
        txnBerkalaDetailActivity.tvUbahPengirim = (TextView) Utils.castView(findRequiredView27, 2131299720, "field 'tvUbahPengirim'", TextView.class);
        this.E = findRequiredView27;
        findRequiredView27.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.22
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.onClickUbahDataPengirim(view2);
            }
        });
        View findRequiredView28 = Utils.findRequiredView(view, 2131299712, "field 'tvUbahDataOrangDatangKeCabang' and method 'onClickUbahDataOrangDatangKeCabang'");
        txnBerkalaDetailActivity.tvUbahDataOrangDatangKeCabang = (TextView) Utils.castView(findRequiredView28, 2131299712, "field 'tvUbahDataOrangDatangKeCabang'", TextView.class);
        this.H = findRequiredView28;
        findRequiredView28.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.24
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.onClickUbahDataOrangDatangKeCabang(view2);
            }
        });
        View findRequiredView29 = Utils.findRequiredView(view, 2131296469, "field 'cbxAgree' and method 'checkboxAgree'");
        txnBerkalaDetailActivity.cbxAgree = (CheckBox) Utils.castView(findRequiredView29, 2131296469, "field 'cbxAgree'", CheckBox.class);
        this.e = findRequiredView29;
        ((CompoundButton) findRequiredView29).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.23
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                txnBerkalaDetailActivity.checkboxAgree(compoundButton, z);
            }
        });
        View findRequiredView30 = Utils.findRequiredView(view, 2131299604, "field 'tvTermCondition' and method 'clickedTermsCondition'");
        txnBerkalaDetailActivity.tvTermCondition = (TextView) Utils.castView(findRequiredView30, 2131299604, "field 'tvTermCondition'", TextView.class);
        this.A = findRequiredView30;
        findRequiredView30.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.25
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.clickedTermsCondition(view2);
            }
        });
        txnBerkalaDetailActivity.llSyaratKetentuan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297904, "field 'llSyaratKetentuan'", LinearLayout.class);
        View findRequiredView31 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'onClicedButton'");
        txnBerkalaDetailActivity.btnProses = (Button) Utils.castView(findRequiredView31, 2131296440, "field 'btnProses'", Button.class);
        this.b = findRequiredView31;
        findRequiredView31.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.27
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.onClicedButton(view2);
            }
        });
        txnBerkalaDetailActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        txnBerkalaDetailActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        txnBerkalaDetailActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        View findRequiredView32 = Utils.findRequiredView(view, 2131298904, "method 'showDataPenerima'");
        this.C = findRequiredView32;
        findRequiredView32.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.26
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.showDataPenerima(view2);
            }
        });
        View findRequiredView33 = Utils.findRequiredView(view, 2131299691, "method 'showDataTransaksiSetoran'");
        this.I = findRequiredView33;
        findRequiredView33.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.30
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.showDataTransaksiSetoran(view2);
            }
        });
        View findRequiredView34 = Utils.findRequiredView(view, 2131298910, "method 'showDataPengirim'");
        this.B = findRequiredView34;
        findRequiredView34.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.29
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.showDataPengirim(view2);
            }
        });
        View findRequiredView35 = Utils.findRequiredView(view, 2131298902, "method 'showDataOrangDatangKeCabang'");
        this.z = findRequiredView35;
        findRequiredView35.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.28
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.showDataOrangDatangKeCabang(view2);
            }
        });
        View findRequiredView36 = Utils.findRequiredView(view, 2131299693, "method 'showDataTransaksiBerkala'");
        this.F = findRequiredView36;
        findRequiredView36.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.TxnBerkalaDetailActivity_ViewBinding.35
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                txnBerkalaDetailActivity.showDataTransaksiBerkala(view2);
            }
        });
        txnBerkalaDetailActivity.viewGroupPenerima = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297142, "field 'viewGroupPenerima'"), Utils.findRequiredView(view, 2131297143, "field 'viewGroupPenerima'"), Utils.findRequiredView(view, 2131297144, "field 'viewGroupPenerima'"));
        txnBerkalaDetailActivity.tvErrorsPenerima = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299078, "field 'tvErrorsPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrorsPenerima'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299182, "field 'tvErrorsPenerima'", TextView.class));
        txnBerkalaDetailActivity.tilFormsPenerima = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298714, "field 'tilFormsPenerima'", LogoutDialog_ViewBinding.class));
        txnBerkalaDetailActivity.viewGroupTransaksiSetoran = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296954, "field 'viewGroupTransaksiSetoran'"));
        txnBerkalaDetailActivity.tilFormsSetoran = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilFormsSetoran'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298504, "field 'tilFormsSetoran'", LogoutDialog_ViewBinding.class));
        txnBerkalaDetailActivity.viewGroupTransaksiBerkala = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297178, "field 'viewGroupTransaksiBerkala'"), Utils.findRequiredView(view, 2131297203, "field 'viewGroupTransaksiBerkala'"));
        txnBerkalaDetailActivity.tilFormsTransaksiBerkala = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298712, "field 'tilFormsTransaksiBerkala'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298735, "field 'tilFormsTransaksiBerkala'", LogoutDialog_ViewBinding.class));
        txnBerkalaDetailActivity.viewGroupPengirim = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297148, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297151, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297149, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297134, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297147, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297150, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297153, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297154, "field 'viewGroupPengirim'"), Utils.findRequiredView(view, 2131297152, "field 'viewGroupPengirim'"));
        txnBerkalaDetailActivity.tvErrorsPengirim = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299157, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299121, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299086, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299148, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298961, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299199, "field 'tvErrorsPengirim'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299231, "field 'tvErrorsPengirim'", TextView.class));
        txnBerkalaDetailActivity.tilFormsPengirim = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298679, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298481, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298689, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298690, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298685, "field 'tilFormsPengirim'", LogoutDialog_ViewBinding.class));
        txnBerkalaDetailActivity.viewGroupOrangDatangKeCabang = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297138, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131297135, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131297137, "field 'viewGroupOrangDatangKeCabang'"), Utils.findRequiredView(view, 2131297136, "field 'viewGroupOrangDatangKeCabang'"));
        txnBerkalaDetailActivity.tvErrorsOrangDatangKeCabang = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299152, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299149, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299151, "field 'tvErrorsOrangDatangKeCabang'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299150, "field 'tvErrorsOrangDatangKeCabang'", TextView.class));
        txnBerkalaDetailActivity.tilFormsOrangDatangKeCabang = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298683, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298680, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298682, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298681, "field 'tilFormsOrangDatangKeCabang'", LogoutDialog_ViewBinding.class));
        Context context = view.getContext();
        Resources resources = context.getResources();
        txnBerkalaDetailActivity.arrayHari = resources.getStringArray(2130903059);
        txnBerkalaDetailActivity.colorPaleGrey = copyWindowDataInto.a(context, 2131099821);
        txnBerkalaDetailActivity.colorPaleBlue = copyWindowDataInto.a(context, 2131099820);
        txnBerkalaDetailActivity.labelSetiapBeberapaHari = resources.getString(2131821580);
        txnBerkalaDetailActivity.labelSetiapHari = resources.getString(2131821581);
        txnBerkalaDetailActivity.labelSetiapTanggal = resources.getString(2131821582);
        txnBerkalaDetailActivity.nomorKtp = resources.getString(2131821553);
        txnBerkalaDetailActivity.nomorPaspor = resources.getString(2131821556);
        txnBerkalaDetailActivity.nomorRekening = resources.getString(2131821949);
        txnBerkalaDetailActivity.labelKtp = resources.getString(2131821815);
        txnBerkalaDetailActivity.labelPaspor = resources.getString(2131821986);
        txnBerkalaDetailActivity.labelSiupNib = resources.getString(2131822122);
        txnBerkalaDetailActivity.labelRekening = resources.getString(2131822074);
        txnBerkalaDetailActivity.namaSesuaiKtp = resources.getString(2131821933);
        txnBerkalaDetailActivity.namaSesuaiPaspor = resources.getString(2131821530);
        txnBerkalaDetailActivity.namaRekening = resources.getString(2131821919);
        txnBerkalaDetailActivity.namaPerusahaan = resources.getString(2131821931);
        txnBerkalaDetailActivity.alamatSesuaiKtp = resources.getString(2131821060);
        txnBerkalaDetailActivity.alamatSesuaiPaspor = resources.getString(2131821061);
        txnBerkalaDetailActivity.nomorSiupNib = resources.getString(2131821192);
        txnBerkalaDetailActivity.txtTermCondition = resources.getString(2131821427);
        txnBerkalaDetailActivity.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TxnBerkalaDetailActivity txnBerkalaDetailActivity = this.d;
        if (txnBerkalaDetailActivity != null) {
            this.d = null;
            txnBerkalaDetailActivity.tvPenerimaNama = null;
            txnBerkalaDetailActivity.tvPenerimaNorek = null;
            txnBerkalaDetailActivity.tvPenerimaSimpanNama = null;
            txnBerkalaDetailActivity.rlPenerimaSimpanNamaDisabled = null;
            txnBerkalaDetailActivity.tvTransaksiJumlah = null;
            txnBerkalaDetailActivity.tvTransaksiBerita = null;
            txnBerkalaDetailActivity.tvBerkalaSetiap = null;
            txnBerkalaDetailActivity.tvBerkalaTanggalBerakhir = null;
            txnBerkalaDetailActivity.tvBerkalaTitleSetiap = null;
            txnBerkalaDetailActivity.tvPengirimPemilikSumberDana = null;
            txnBerkalaDetailActivity.tvPengirimJenisId = null;
            txnBerkalaDetailActivity.tvPengirimNama = null;
            txnBerkalaDetailActivity.tvPengirimNoId = null;
            txnBerkalaDetailActivity.tvPengirimNoRek = null;
            txnBerkalaDetailActivity.tvPengirimAlamat = null;
            txnBerkalaDetailActivity.tvPengirimNoHp = null;
            txnBerkalaDetailActivity.tvPengirimSumberDana = null;
            txnBerkalaDetailActivity.tvPengirimTujuanTransaksi = null;
            txnBerkalaDetailActivity.tvPengirimTitleNoId = null;
            txnBerkalaDetailActivity.tvPengirimTitleAlamat = null;
            txnBerkalaDetailActivity.tvPengirimTitleNama = null;
            txnBerkalaDetailActivity.tvOrangSamaDenganPemilikSD = null;
            txnBerkalaDetailActivity.tvOrangJenisID = null;
            txnBerkalaDetailActivity.tvOrangNama = null;
            txnBerkalaDetailActivity.tvOrangNomorID = null;
            txnBerkalaDetailActivity.tvOrangTitleNama = null;
            txnBerkalaDetailActivity.tvOrangTitleNomorID = null;
            txnBerkalaDetailActivity.rlPengirimPemilikSumberDanaDisabled = null;
            txnBerkalaDetailActivity.rlPengirimJenisIdDisabled = null;
            txnBerkalaDetailActivity.rlPengirimNamaDisabled = null;
            txnBerkalaDetailActivity.rlPengirimNoIdDisabled = null;
            txnBerkalaDetailActivity.rlPengirimNorekDisabled = null;
            txnBerkalaDetailActivity.rlPengirimAlamatDisabled = null;
            txnBerkalaDetailActivity.rlPengirimNoHpDisabled = null;
            txnBerkalaDetailActivity.rlPengirimSumberDanaDisabled = null;
            txnBerkalaDetailActivity.rlPengirimTujuanDisabled = null;
            txnBerkalaDetailActivity.etNamaPenerima = null;
            txnBerkalaDetailActivity.etNoRekPenerima = null;
            txnBerkalaDetailActivity.etSimpanNama = null;
            txnBerkalaDetailActivity.tilNama = null;
            txnBerkalaDetailActivity.tilNorek = null;
            txnBerkalaDetailActivity.tilSimpanNama = null;
            txnBerkalaDetailActivity.etJumlahSetoran = null;
            txnBerkalaDetailActivity.etBeritaSetoran = null;
            txnBerkalaDetailActivity.tilJumlah = null;
            txnBerkalaDetailActivity.tilBerita = null;
            txnBerkalaDetailActivity.etSetiapBeberapaHari = null;
            txnBerkalaDetailActivity.tvErrorSetiapBeberapaHari = null;
            txnBerkalaDetailActivity.etTanggalBerakhir = null;
            txnBerkalaDetailActivity.tilSetiapBeberapaHari = null;
            txnBerkalaDetailActivity.tilTanggalBerakhir = null;
            txnBerkalaDetailActivity.etPengirimPemilikSumberDana = null;
            txnBerkalaDetailActivity.etJenisId = null;
            txnBerkalaDetailActivity.etNamaPengirim = null;
            txnBerkalaDetailActivity.etNoIDPengirim = null;
            txnBerkalaDetailActivity.etNorekPengirim = null;
            txnBerkalaDetailActivity.etAlamatPengirim = null;
            txnBerkalaDetailActivity.etNoHpPengirim = null;
            txnBerkalaDetailActivity.etPengirimSumberDana = null;
            txnBerkalaDetailActivity.etPengirimTujuanTransaksi = null;
            txnBerkalaDetailActivity.llData100TransaksiSetoran = null;
            txnBerkalaDetailActivity.tilJenisId = null;
            txnBerkalaDetailActivity.tilNoId = null;
            txnBerkalaDetailActivity.tilNamaLengkap = null;
            txnBerkalaDetailActivity.tilNorekPengirim = null;
            txnBerkalaDetailActivity.tilALamatLengkap = null;
            txnBerkalaDetailActivity.tilNoHp = null;
            txnBerkalaDetailActivity.tilPengirimSumberDana = null;
            txnBerkalaDetailActivity.tilPengirimTujuanTransaksi = null;
            txnBerkalaDetailActivity.tilPemilikSumberDana = null;
            txnBerkalaDetailActivity.etOrangSamaDenganPemilik = null;
            txnBerkalaDetailActivity.etOrangJenisId = null;
            txnBerkalaDetailActivity.etOrangNama = null;
            txnBerkalaDetailActivity.etOrangNoID = null;
            txnBerkalaDetailActivity.tilOrangSamaDenganPemilik = null;
            txnBerkalaDetailActivity.tilOrangJenisId = null;
            txnBerkalaDetailActivity.tilOrangNoId = null;
            txnBerkalaDetailActivity.tilOrangNama = null;
            txnBerkalaDetailActivity.formJenisIdentitas = null;
            txnBerkalaDetailActivity.llUneditableBedaDenganPemilikSumberDana = null;
            txnBerkalaDetailActivity.rlOrangSamaDenganPemilikSdUneditable = null;
            txnBerkalaDetailActivity.llWrapperDataPenerima = null;
            txnBerkalaDetailActivity.llHeaderDataPenerima = null;
            txnBerkalaDetailActivity.ivDataPenerima = null;
            txnBerkalaDetailActivity.llWrapperTransaksiSetoran = null;
            txnBerkalaDetailActivity.llHeaderTransaksiSetoran = null;
            txnBerkalaDetailActivity.ivTransaksiSetoran = null;
            txnBerkalaDetailActivity.llWrapperTransferBerkala = null;
            txnBerkalaDetailActivity.llHeaderTransferBerkala = null;
            txnBerkalaDetailActivity.ivTransferBerkala = null;
            txnBerkalaDetailActivity.llWrapperPengirim = null;
            txnBerkalaDetailActivity.llHeaderPengirim = null;
            txnBerkalaDetailActivity.ivPengirim = null;
            txnBerkalaDetailActivity.llWrapperDataOrangDatangKeCabang = null;
            txnBerkalaDetailActivity.llHeaderDataOrangDatangKeCabang = null;
            txnBerkalaDetailActivity.ivDataOrangDatangKeCabang = null;
            txnBerkalaDetailActivity.llLayoutDataPenerima = null;
            txnBerkalaDetailActivity.llLayoutTransaksiSetoran = null;
            txnBerkalaDetailActivity.llLayoutTransferBerkala = null;
            txnBerkalaDetailActivity.llLayoutPengirim = null;
            txnBerkalaDetailActivity.llLayoutDataOrangDatangKeCabang = null;
            txnBerkalaDetailActivity.llDataPenerimaDisabled = null;
            txnBerkalaDetailActivity.llDataTransaksiSetoranDisabled = null;
            txnBerkalaDetailActivity.llDataTransferBerkalaDisabled = null;
            txnBerkalaDetailActivity.llDataPengirimDisabled = null;
            txnBerkalaDetailActivity.llDataOrangDatangKeCabangDisabled = null;
            txnBerkalaDetailActivity.llDataPenerima = null;
            txnBerkalaDetailActivity.llDataTransaksiSetoran = null;
            txnBerkalaDetailActivity.llDataTransferBerkala = null;
            txnBerkalaDetailActivity.llDataPengirim = null;
            txnBerkalaDetailActivity.llDataOrangDatangKeCabang = null;
            txnBerkalaDetailActivity.tvUbahPenerima = null;
            txnBerkalaDetailActivity.tvUbahTransaksiSetoran = null;
            txnBerkalaDetailActivity.tvUbahTransaksiBerkala = null;
            txnBerkalaDetailActivity.tvUbahPengirim = null;
            txnBerkalaDetailActivity.tvUbahDataOrangDatangKeCabang = null;
            txnBerkalaDetailActivity.cbxAgree = null;
            txnBerkalaDetailActivity.tvTermCondition = null;
            txnBerkalaDetailActivity.llSyaratKetentuan = null;
            txnBerkalaDetailActivity.btnProses = null;
            txnBerkalaDetailActivity.svMain = null;
            txnBerkalaDetailActivity.toolbar = null;
            txnBerkalaDetailActivity.tvToolbarTitle = null;
            txnBerkalaDetailActivity.viewGroupPenerima = null;
            txnBerkalaDetailActivity.tvErrorsPenerima = null;
            txnBerkalaDetailActivity.tilFormsPenerima = null;
            txnBerkalaDetailActivity.viewGroupTransaksiSetoran = null;
            txnBerkalaDetailActivity.tilFormsSetoran = null;
            txnBerkalaDetailActivity.viewGroupTransaksiBerkala = null;
            txnBerkalaDetailActivity.tilFormsTransaksiBerkala = null;
            txnBerkalaDetailActivity.viewGroupPengirim = null;
            txnBerkalaDetailActivity.tvErrorsPengirim = null;
            txnBerkalaDetailActivity.tilFormsPengirim = null;
            txnBerkalaDetailActivity.viewGroupOrangDatangKeCabang = null;
            txnBerkalaDetailActivity.tvErrorsOrangDatangKeCabang = null;
            txnBerkalaDetailActivity.tilFormsOrangDatangKeCabang = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.l.setOnFocusChangeListener(null);
            this.l = null;
            this.m.setOnFocusChangeListener(null);
            this.m = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.q.setOnClickListener(null);
            this.q.setOnFocusChangeListener(null);
            this.q = null;
            this.v.setOnClickListener(null);
            this.v = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.f27o.setOnFocusChangeListener(null);
            this.f27o = null;
            this.p.setOnFocusChangeListener(null);
            this.p = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.k.setOnFocusChangeListener(null);
            this.k = null;
            this.t.setOnFocusChangeListener(null);
            this.t = null;
            this.s.setOnClickListener(null);
            this.s = null;
            this.r.setOnClickListener(null);
            this.r = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.w.setOnClickListener(null);
            this.w = null;
            this.y.setOnClickListener(null);
            this.y = null;
            this.D.setOnClickListener(null);
            this.D = null;
            this.x.setOnClickListener(null);
            this.x = null;
            this.u.setOnClickListener(null);
            this.u = null;
            this.G.setOnClickListener(null);
            this.G = null;
            this.M.setOnClickListener(null);
            this.M = null;
            this.K.setOnClickListener(null);
            this.K = null;
            this.E.setOnClickListener(null);
            this.E = null;
            this.H.setOnClickListener(null);
            this.H = null;
            ((CompoundButton) this.e).setOnCheckedChangeListener(null);
            this.e = null;
            this.A.setOnClickListener(null);
            this.A = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.C.setOnClickListener(null);
            this.C = null;
            this.I.setOnClickListener(null);
            this.I = null;
            this.B.setOnClickListener(null);
            this.B = null;
            this.z.setOnClickListener(null);
            this.z = null;
            this.F.setOnClickListener(null);
            this.F = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
