package com.bca.smartbranch.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.Page6CSFragment;
import o.copyWindowDataInto;
import o.getAnnualFeeAddOnAmount;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6PLFragment_ViewBinding.class */
public class Page6PLFragment_ViewBinding implements Unbinder {
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
    private View U;
    private View V;
    private View W;
    private View X;
    private View Y;
    private View Z;
    private View a;
    private View aa;
    private View ab;
    private View ac;
    private View ad;
    private View ae;
    private View af;
    private View ag;
    private View ah;
    private View ai;
    private View aj;
    private View ak;
    private View al;
    private View am;
    private View an;
    private View ao;
    private View ap;
    private View aq;
    private View ar;
    private View b;
    private View c;
    private View d;
    private Page6PLFragment e;
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
    private View f54o;
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

    public Page6PLFragment_ViewBinding(final Page6PLFragment page6PLFragment, View view) {
        this.e = page6PLFragment;
        page6PLFragment.etTypeId = (getAnnualFeeAddOnAmount) Utils.findRequiredViewAsType(view, 2131296994, "field 'etTypeId'", getAnnualFeeAddOnAmount.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297060, "field 'etNamaId' and method 'onFocusChangeDataDiri'");
        page6PLFragment.etNamaId = (EditText) Utils.castView(findRequiredView, 2131297060, "field 'etNamaId'", EditText.class);
        this.H = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297103, "field 'etNoId' and method 'onFocusChangeDataDiri'");
        page6PLFragment.etNoId = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView2, 2131297103, "field 'etNoId'", getAnnualFeeAddOnAmount.class);
        this.L = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.12
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297086, "field 'etNegaraId', method 'updateDataDiri', and method 'onFocusChangeDataDiri'");
        page6PLFragment.etNegaraId = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView3, 2131297086, "field 'etNegaraId'", getAnnualFeeAddOnAmount.class);
        this.F = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.23
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataDiri(view2);
            }
        });
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.35
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297045, "field 'etExpId', method 'updateDataDiri', and method 'onFocusChangeDataDiri'");
        page6PLFragment.etExpId = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView4, 2131297045, "field 'etExpId'", getAnnualFeeAddOnAmount.class);
        this.D = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.45
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataDiri(view2);
            }
        });
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.57
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296997, "field 'etSex', method 'updateDataDiri', and method 'onFocusChangeDataDiri'");
        page6PLFragment.etSex = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView5, 2131296997, "field 'etSex'", getAnnualFeeAddOnAmount.class);
        this.m = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.67
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataDiri(view2);
            }
        });
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.77
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297087, "field 'etNegaraLahir', method 'updateDataDiri', and method 'onFocusChangeDataDiri'");
        page6PLFragment.etNegaraLahir = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView6, 2131297087, "field 'etNegaraLahir'", getAnnualFeeAddOnAmount.class);
        this.M = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.86
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataDiri(view2);
            }
        });
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297037, "field 'etKotaLahir' and method 'onFocusChangeDataDiri'");
        page6PLFragment.etKotaLahir = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView7, 2131297037, "field 'etKotaLahir'", getAnnualFeeAddOnAmount.class);
        this.u = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297207, "field 'etBornDate', method 'updateDataDiri', and method 'onFocusChangeDataDiri'");
        page6PLFragment.etBornDate = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView8, 2131297207, "field 'etBornDate'", getAnnualFeeAddOnAmount.class);
        this.aa = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataDiri(view2);
            }
        });
        findRequiredView8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297197, "field 'etMaritStatus', method 'updateDataDiri', and method 'onFocusChangeDataDiri'");
        page6PLFragment.etMaritStatus = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView9, 2131297197, "field 'etMaritStatus'", getAnnualFeeAddOnAmount.class);
        this.ac = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataDiri(view2);
            }
        });
        findRequiredView9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131296925, "field 'etReligion', method 'updateDataDiri', and method 'onFocusChangeDataDiri'");
        page6PLFragment.etReligion = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView10, 2131296925, "field 'etReligion'", getAnnualFeeAddOnAmount.class);
        this.b = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataDiri(view2);
            }
        });
        findRequiredView10.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.8
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297058, "field 'etMotherName' and method 'onFocusChangeDataDiri'");
        page6PLFragment.etMotherName = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView11, 2131297058, "field 'etMotherName'", getAnnualFeeAddOnAmount.class);
        this.z = findRequiredView11;
        findRequiredView11.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297021, "field 'etKodeNegara' and method 'onFocusChangeDataDiri'");
        page6PLFragment.etKodeNegara = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView12, 2131297021, "field 'etKodeNegara'", getAnnualFeeAddOnAmount.class);
        this.p = findRequiredView12;
        findRequiredView12.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.14
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'onFocusChangeDataDiri'");
        page6PLFragment.etNoHp = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView13, 2131297094, "field 'etNoHp'", getAnnualFeeAddOnAmount.class);
        this.J = findRequiredView13;
        findRequiredView13.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.15
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297019, "field 'etKodeArea' and method 'onFocusChangeDataDiri'");
        page6PLFragment.etKodeArea = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView14, 2131297019, "field 'etKodeArea'", getAnnualFeeAddOnAmount.class);
        this.t = findRequiredView14;
        findRequiredView14.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.11
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView15 = Utils.findRequiredView(view, 2131297115, "field 'etNoTelp' and method 'onFocusChangeDataDiri'");
        page6PLFragment.etNoTelp = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView15, 2131297115, "field 'etNoTelp'", getAnnualFeeAddOnAmount.class);
        this.O = findRequiredView15;
        findRequiredView15.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.13
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'onFocusChangeDataDiri'");
        page6PLFragment.etEmail = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView16, 2131296976, "field 'etEmail'", getAnnualFeeAddOnAmount.class);
        this.h = findRequiredView16;
        findRequiredView16.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.19
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView17 = Utils.findRequiredView(view, 2131297105, "field 'etNoKitasKitap' and method 'onFocusChangeDataDiri'");
        page6PLFragment.etNoKitasKitap = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView17, 2131297105, "field 'etNoKitasKitap'", getAnnualFeeAddOnAmount.class);
        this.N = findRequiredView17;
        findRequiredView17.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.16
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        View findRequiredView18 = Utils.findRequiredView(view, 2131297046, "field 'etMasaBerlakuKitasKitap', method 'updateDataDiri', and method 'onFocusChangeDataDiri'");
        page6PLFragment.etMasaBerlakuKitasKitap = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView18, 2131297046, "field 'etMasaBerlakuKitasKitap'", getAnnualFeeAddOnAmount.class);
        this.A = findRequiredView18;
        findRequiredView18.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.20
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataDiri(view2);
            }
        });
        findRequiredView18.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.17
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeDataDiri(view2, z);
            }
        });
        page6PLFragment.tilJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298543, "field 'tilJenisId'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilNamaId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298607, "field 'tilNamaId'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilNomorId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilNomorId'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilNegaraId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298632, "field 'tilNegaraId'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilMasaBerlakuId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298592, "field 'tilMasaBerlakuId'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilJenisKelamin = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298545, "field 'tilJenisKelamin'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilNegaraLahir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298633, "field 'tilNegaraLahir'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKotaLahir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298584, "field 'tilKotaLahir'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilTanggalLahir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilTanggalLahir'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilStatusPerkawinan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298729, "field 'tilStatusPerkawinan'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilAgama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298474, "field 'tilAgama'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilNamaIbu = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298605, "field 'tilNamaIbu'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKodeNegara = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298567, "field 'tilKodeNegara'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKodeArea = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298565, "field 'tilKodeArea'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilNoTelp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298661, "field 'tilNoTelp'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilNoKitasKitap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298651, "field 'tilNoKitasKitap'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilMasaBerlakuKitasKitap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298593, "field 'tilMasaBerlakuKitasKitap'", LogoutDialog_ViewBinding.class);
        page6PLFragment.llEditableKitasKitapWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297629, "field 'llEditableKitasKitapWrapper'", LinearLayout.class);
        View findRequiredView19 = Utils.findRequiredView(view, 2131297085, "field 'etNegaraHome', method 'onUbahFieldDataAlamatHome', and method 'onFocusChangeAlamatNonKtp'");
        page6PLFragment.etNegaraHome = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView19, 2131297085, "field 'etNegaraHome'", getAnnualFeeAddOnAmount.class);
        this.G = findRequiredView19;
        findRequiredView19.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.18
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatHome(view2);
            }
        });
        findRequiredView19.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.22
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamatNonKtp(view2, z);
            }
        });
        View findRequiredView20 = Utils.findRequiredView(view, 2131296942, "field 'etHouseAddrHome' and method 'onFocusChangeAlamatNonKtp'");
        page6PLFragment.etHouseAddrHome = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView20, 2131296942, "field 'etHouseAddrHome'", getAnnualFeeAddOnAmount.class);
        this.j = findRequiredView20;
        findRequiredView20.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.25
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamatNonKtp(view2, z);
            }
        });
        View findRequiredView21 = Utils.findRequiredView(view, 2131297169, "field 'etHouseRTHome' and method 'onFocusChangeAlamatNonKtp'");
        page6PLFragment.etHouseRTHome = (EditText) Utils.castView(findRequiredView21, 2131297169, "field 'etHouseRTHome'", EditText.class);
        this.W = findRequiredView21;
        findRequiredView21.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.24
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamatNonKtp(view2, z);
            }
        });
        View findRequiredView22 = Utils.findRequiredView(view, 2131297172, "field 'etHouseRWHome' and method 'onFocusChangeAlamatNonKtp'");
        page6PLFragment.etHouseRWHome = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView22, 2131297172, "field 'etHouseRWHome'", getAnnualFeeAddOnAmount.class);
        this.U = findRequiredView22;
        findRequiredView22.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.21
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamatNonKtp(view2, z);
            }
        });
        View findRequiredView23 = Utils.findRequiredView(view, 2131297163, "field 'etHouseProvinceHome', method 'onUbahFieldDataAlamatHome', and method 'onFocusChangeAlamatNonKtp'");
        page6PLFragment.etHouseProvinceHome = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView23, 2131297163, "field 'etHouseProvinceHome'", getAnnualFeeAddOnAmount.class);
        this.Q = findRequiredView23;
        findRequiredView23.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.30
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatHome(view2);
            }
        });
        findRequiredView23.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.29
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamatNonKtp(view2, z);
            }
        });
        View findRequiredView24 = Utils.findRequiredView(view, 2131297039, "field 'etHouseCityHome', method 'onUbahFieldDataAlamatHome', and method 'onFocusChangeAlamatNonKtp'");
        page6PLFragment.etHouseCityHome = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView24, 2131297039, "field 'etHouseCityHome'", getAnnualFeeAddOnAmount.class);
        this.C = findRequiredView24;
        findRequiredView24.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.28
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatHome(view2);
            }
        });
        findRequiredView24.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.27
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamatNonKtp(view2, z);
            }
        });
        View findRequiredView25 = Utils.findRequiredView(view, 2131297013, "field 'etHouseSubDistricHome', method 'onUbahFieldDataAlamatHome', and method 'onFocusChangeAlamatNonKtp'");
        page6PLFragment.etHouseSubDistricHome = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView25, 2131297013, "field 'etHouseSubDistricHome'", getAnnualFeeAddOnAmount.class);
        this.f54o = findRequiredView25;
        findRequiredView25.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.26
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatHome(view2);
            }
        });
        findRequiredView25.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.33
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamatNonKtp(view2, z);
            }
        });
        View findRequiredView26 = Utils.findRequiredView(view, 2131297016, "field 'etHouseVillageHome', method 'onUbahFieldDataAlamatHome', and method 'onFocusChangeAlamatNonKtp'");
        page6PLFragment.etHouseVillageHome = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView26, 2131297016, "field 'etHouseVillageHome'", getAnnualFeeAddOnAmount.class);
        this.r = findRequiredView26;
        findRequiredView26.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.32
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatHome(view2);
            }
        });
        findRequiredView26.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.34
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamatNonKtp(view2, z);
            }
        });
        View findRequiredView27 = Utils.findRequiredView(view, 2131297026, "field 'etHousePostCodeHome', method 'onUbahFieldDataAlamatHome', and method 'onFocusChangeAlamatNonKtp'");
        page6PLFragment.etHousePostCodeHome = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView27, 2131297026, "field 'etHousePostCodeHome'", getAnnualFeeAddOnAmount.class);
        this.x = findRequiredView27;
        findRequiredView27.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.31
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatHome(view2);
            }
        });
        findRequiredView27.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.36
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamatNonKtp(view2, z);
            }
        });
        page6PLFragment.tilNegaraHome = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298631, "field 'tilNegaraHome'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilAlamatSaatIniHome = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298491, "field 'tilAlamatSaatIniHome'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilRtHome = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298705, "field 'tilRtHome'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilRwHome = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298708, "field 'tilRwHome'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilProvinsiHome = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298699, "field 'tilProvinsiHome'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKotaRumahHome = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298586, "field 'tilKotaRumahHome'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKecamatanHome = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298559, "field 'tilKecamatanHome'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKelurahanHome = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298562, "field 'tilKelurahanHome'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKodePosRumahHome = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298572, "field 'tilKodePosRumahHome'", LogoutDialog_ViewBinding.class);
        page6PLFragment.llKotaHome = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297750, "field 'llKotaHome'", LinearLayout.class);
        page6PLFragment.llKecamatanHome = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297714, "field 'llKecamatanHome'", LinearLayout.class);
        page6PLFragment.llKelurahanHome = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297719, "field 'llKelurahanHome'", LinearLayout.class);
        page6PLFragment.llKodePosRumahHome = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297734, "field 'llKodePosRumahHome'", LinearLayout.class);
        page6PLFragment.llEditableNonPasporWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297630, "field 'llEditableNonPasporWrapper'", LinearLayout.class);
        View findRequiredView28 = Utils.findRequiredView(view, 2131297084, "field 'etNegaraDomisili', method 'onUbahFieldDataAlamatRes', and method 'onFocusChangeAlamat'");
        page6PLFragment.etNegaraDomisili = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView28, 2131297084, "field 'etNegaraDomisili'", getAnnualFeeAddOnAmount.class);
        this.E = findRequiredView28;
        findRequiredView28.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.38
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatRes(view2);
            }
        });
        findRequiredView28.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.39
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamat(view2, z);
            }
        });
        View findRequiredView29 = Utils.findRequiredView(view, 2131296930, "field 'etHouseAddr' and method 'onFocusChangeAlamat'");
        page6PLFragment.etHouseAddr = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView29, 2131296930, "field 'etHouseAddr'", getAnnualFeeAddOnAmount.class);
        this.d = findRequiredView29;
        findRequiredView29.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.40
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamat(view2, z);
            }
        });
        View findRequiredView30 = Utils.findRequiredView(view, 2131297168, "field 'etHouseRT' and method 'onFocusChangeAlamat'");
        page6PLFragment.etHouseRT = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView30, 2131297168, "field 'etHouseRT'", getAnnualFeeAddOnAmount.class);
        this.T = findRequiredView30;
        findRequiredView30.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.37
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamat(view2, z);
            }
        });
        View findRequiredView31 = Utils.findRequiredView(view, 2131297171, "field 'etHouseRW' and method 'onFocusChangeAlamat'");
        page6PLFragment.etHouseRW = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView31, 2131297171, "field 'etHouseRW'", getAnnualFeeAddOnAmount.class);
        this.X = findRequiredView31;
        findRequiredView31.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.41
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamat(view2, z);
            }
        });
        View findRequiredView32 = Utils.findRequiredView(view, 2131297162, "field 'etHouseProvince', method 'onUbahFieldDataAlamatRes', and method 'onFocusChangeAlamat'");
        page6PLFragment.etHouseProvince = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView32, 2131297162, "field 'etHouseProvince'", getAnnualFeeAddOnAmount.class);
        this.R = findRequiredView32;
        findRequiredView32.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.43
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatRes(view2);
            }
        });
        findRequiredView32.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.44
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamat(view2, z);
            }
        });
        View findRequiredView33 = Utils.findRequiredView(view, 2131297035, "field 'etHouseCity', method 'onUbahFieldDataAlamatRes', and method 'onFocusChangeAlamat'");
        page6PLFragment.etHouseCity = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView33, 2131297035, "field 'etHouseCity'", getAnnualFeeAddOnAmount.class);
        this.v = findRequiredView33;
        findRequiredView33.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.42
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatRes(view2);
            }
        });
        findRequiredView33.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.46
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamat(view2, z);
            }
        });
        View findRequiredView34 = Utils.findRequiredView(view, 2131297012, "field 'etHouseSubDistric', method 'onUbahFieldDataAlamatRes', and method 'onFocusChangeAlamat'");
        page6PLFragment.etHouseSubDistric = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView34, 2131297012, "field 'etHouseSubDistric'", getAnnualFeeAddOnAmount.class);
        this.k = findRequiredView34;
        findRequiredView34.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.49
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatRes(view2);
            }
        });
        findRequiredView34.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.50
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamat(view2, z);
            }
        });
        View findRequiredView35 = Utils.findRequiredView(view, 2131297015, "field 'etHouseVillage', method 'onUbahFieldDataAlamatRes', and method 'onFocusChangeAlamat'");
        page6PLFragment.etHouseVillage = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView35, 2131297015, "field 'etHouseVillage'", getAnnualFeeAddOnAmount.class);
        this.s = findRequiredView35;
        findRequiredView35.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.48
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatRes(view2);
            }
        });
        findRequiredView35.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.47
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamat(view2, z);
            }
        });
        View findRequiredView36 = Utils.findRequiredView(view, 2131297023, "field 'etHousePostCode', method 'onUbahFieldDataAlamatRes', and method 'onFocusChangeAlamat'");
        page6PLFragment.etHousePostCode = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView36, 2131297023, "field 'etHousePostCode'", getAnnualFeeAddOnAmount.class);
        this.q = findRequiredView36;
        findRequiredView36.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.52
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onUbahFieldDataAlamatRes(view2);
            }
        });
        findRequiredView36.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.53
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeAlamat(view2, z);
            }
        });
        page6PLFragment.tilNegaraDomisili = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298630, "field 'tilNegaraDomisili'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilAlamatSaatIni = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298479, "field 'tilAlamatSaatIni'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilRt = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298704, "field 'tilRt'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilRw = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298707, "field 'tilRw'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilProvinsi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298698, "field 'tilProvinsi'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKotaRumah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298582, "field 'tilKotaRumah'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKecamatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298558, "field 'tilKecamatan'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKelurahan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298561, "field 'tilKelurahan'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKodePosRumah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298569, "field 'tilKodePosRumah'", LogoutDialog_ViewBinding.class);
        page6PLFragment.llKotaDomisili = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297741, "field 'llKotaDomisili'", LinearLayout.class);
        page6PLFragment.llKecamatanDomisili = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297712, "field 'llKecamatanDomisili'", LinearLayout.class);
        page6PLFragment.llKelurahanDomisili = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297716, "field 'llKelurahanDomisili'", LinearLayout.class);
        page6PLFragment.llKodePosRumahDomisili = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297728, "field 'llKodePosRumahDomisili'", LinearLayout.class);
        page6PLFragment.llEditableIndonesianWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297628, "field 'llEditableIndonesianWrapper'", LinearLayout.class);
        View findRequiredView37 = Utils.findRequiredView(view, 2131297106, "field 'etNoNPWP' and method 'onFocusChangePekerjaan'");
        page6PLFragment.etNoNPWP = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView37, 2131297106, "field 'etNoNPWP'", getAnnualFeeAddOnAmount.class);
        this.K = findRequiredView37;
        findRequiredView37.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.51
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangePekerjaan(view2, z);
            }
        });
        View findRequiredView38 = Utils.findRequiredView(view, 2131297189, "field 'etStatusNPWP' and method 'updateDataPekerjaan'");
        page6PLFragment.etStatusNPWP = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView38, 2131297189, "field 'etStatusNPWP'", getAnnualFeeAddOnAmount.class);
        this.Y = findRequiredView38;
        findRequiredView38.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.55
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataPekerjaan(view2);
            }
        });
        page6PLFragment.etJob = (getAnnualFeeAddOnAmount) Utils.findRequiredViewAsType(view, 2131297140, "field 'etJob'", getAnnualFeeAddOnAmount.class);
        page6PLFragment.etDescPekerjaan = (getAnnualFeeAddOnAmount) Utils.findRequiredViewAsType(view, 2131296973, "field 'etDescPekerjaan'", getAnnualFeeAddOnAmount.class);
        page6PLFragment.etBidangPekerjaan = (getAnnualFeeAddOnAmount) Utils.findRequiredViewAsType(view, 2131296966, "field 'etBidangPekerjaan'", getAnnualFeeAddOnAmount.class);
        View findRequiredView39 = Utils.findRequiredView(view, 2131297202, "field 'etSumberPenghasilan' and method 'updateDataPekerjaan'");
        page6PLFragment.etSumberPenghasilan = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView39, 2131297202, "field 'etSumberPenghasilan'", getAnnualFeeAddOnAmount.class);
        this.ab = findRequiredView39;
        findRequiredView39.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.54
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataPekerjaan(view2);
            }
        });
        View findRequiredView40 = Utils.findRequiredView(view, 2131297145, "field 'etPenghasilan' and method 'updateDataPekerjaan'");
        page6PLFragment.etPenghasilan = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView40, 2131297145, "field 'etPenghasilan'", getAnnualFeeAddOnAmount.class);
        this.P = findRequiredView40;
        findRequiredView40.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.60
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataPekerjaan(view2);
            }
        });
        View findRequiredView41 = Utils.findRequiredView(view, 2131297003, "field 'etJenisProfesi' and method 'onFocusChangePekerjaan'");
        page6PLFragment.etJenisProfesi = (EditText) Utils.castView(findRequiredView41, 2131297003, "field 'etJenisProfesi'", EditText.class);
        this.n = findRequiredView41;
        findRequiredView41.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.58
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangePekerjaan(view2, z);
            }
        });
        View findRequiredView42 = Utils.findRequiredView(view, 2131297061, "field 'etOfficeName' and method 'onFocusChangePekerjaan'");
        page6PLFragment.etOfficeName = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView42, 2131297061, "field 'etOfficeName'", getAnnualFeeAddOnAmount.class);
        this.I = findRequiredView42;
        findRequiredView42.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.59
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangePekerjaan(view2, z);
            }
        });
        View findRequiredView43 = Utils.findRequiredView(view, 2131296992, "field 'etOccupation' and method 'onFocusChangePekerjaan'");
        page6PLFragment.etOccupation = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView43, 2131296992, "field 'etOccupation'", getAnnualFeeAddOnAmount.class);
        this.f = findRequiredView43;
        findRequiredView43.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.56
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangePekerjaan(view2, z);
            }
        });
        View findRequiredView44 = Utils.findRequiredView(view, 2131296967, "field 'etBussinesField' and method 'onFocusChangePekerjaan'");
        page6PLFragment.etBussinesField = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView44, 2131296967, "field 'etBussinesField'", getAnnualFeeAddOnAmount.class);
        this.i = findRequiredView44;
        findRequiredView44.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.64
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangePekerjaan(view2, z);
            }
        });
        View findRequiredView45 = Utils.findRequiredView(view, 2131296931, "field 'etOfficeAddr' and method 'onFocusChangePekerjaan'");
        page6PLFragment.etOfficeAddr = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView45, 2131296931, "field 'etOfficeAddr'", getAnnualFeeAddOnAmount.class);
        this.a = findRequiredView45;
        findRequiredView45.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.61
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangePekerjaan(view2, z);
            }
        });
        View findRequiredView46 = Utils.findRequiredView(view, 2131297036, "field 'etOfficeCity', method 'updateDataPekerjaan', and method 'onFocusChangePekerjaan'");
        page6PLFragment.etOfficeCity = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView46, 2131297036, "field 'etOfficeCity'", getAnnualFeeAddOnAmount.class);
        this.y = findRequiredView46;
        findRequiredView46.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.65
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataPekerjaan(view2);
            }
        });
        findRequiredView46.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.62
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangePekerjaan(view2, z);
            }
        });
        View findRequiredView47 = Utils.findRequiredView(view, 2131297024, "field 'etOfficePostCode', method 'updateDataPekerjaan', and method 'onFocusChangePekerjaan'");
        page6PLFragment.etOfficePostCode = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView47, 2131297024, "field 'etOfficePostCode'", getAnnualFeeAddOnAmount.class);
        this.w = findRequiredView47;
        findRequiredView47.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.63
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataPekerjaan(view2);
            }
        });
        findRequiredView47.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.68
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangePekerjaan(view2, z);
            }
        });
        View findRequiredView48 = Utils.findRequiredView(view, 2131297164, "field 'etOfficeProvince', method 'updateDataPekerjaan', and method 'onFocusChangePekerjaan'");
        page6PLFragment.etOfficeProvince = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView48, 2131297164, "field 'etOfficeProvince'", getAnnualFeeAddOnAmount.class);
        this.V = findRequiredView48;
        findRequiredView48.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.70
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.updateDataPekerjaan(view2);
            }
        });
        findRequiredView48.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.66
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangePekerjaan(view2, z);
            }
        });
        View findRequiredView49 = Utils.findRequiredView(view, 2131297146, "field 'etPenghasilanLain' and method 'onFocusChangePekerjaan'");
        page6PLFragment.etPenghasilanLain = (EditText) Utils.castView(findRequiredView49, 2131297146, "field 'etPenghasilanLain'", EditText.class);
        this.S = findRequiredView49;
        findRequiredView49.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.69
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangePekerjaan(view2, z);
            }
        });
        page6PLFragment.tilNoNpwp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298652, "field 'tilNoNpwp'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilStatusNPWP = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298721, "field 'tilStatusNPWP'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilPekerjaan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298684, "field 'tilPekerjaan'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilDescPekerjaan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298524, "field 'tilDescPekerjaan'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilBidangPekerjaan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298516, "field 'tilBidangPekerjaan'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilSumberPenghasilan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298734, "field 'tilSumberPenghasilan'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilPenghasilanLain = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298688, "field 'tilPenghasilanLain'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilPenghasilan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298687, "field 'tilPenghasilan'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilJenisProfesi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298551, "field 'tilJenisProfesi'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilNamaKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298608, "field 'tilNamaKantor'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilJabatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilJabatan'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilBidangUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilBidangUsaha'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilAlamatKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298480, "field 'tilAlamatKantor'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKotaKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298583, "field 'tilKotaKantor'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilKodePosKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298570, "field 'tilKodePosKantor'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilProvinsiKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298700, "field 'tilProvinsiKantor'", LogoutDialog_ViewBinding.class);
        page6PLFragment.llKotaKantor = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297746, "field 'llKotaKantor'", LinearLayout.class);
        page6PLFragment.llKodePosKantor = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297731, "field 'llKodePosKantor'", LinearLayout.class);
        page6PLFragment.etPurposePemRek = (getAnnualFeeAddOnAmount) Utils.findRequiredViewAsType(view, 2131297228, "field 'etPurposePemRek'", getAnnualFeeAddOnAmount.class);
        page6PLFragment.etLanguage = (getAnnualFeeAddOnAmount) Utils.findRequiredViewAsType(view, 2131296946, "field 'etLanguage'", getAnnualFeeAddOnAmount.class);
        View findRequiredView50 = Utils.findRequiredView(view, 2131296996, "field 'etTypeCard', method 'onClickDataRekening', and method 'onFocusChangeRekening'");
        page6PLFragment.etTypeCard = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView50, 2131296996, "field 'etTypeCard'", getAnnualFeeAddOnAmount.class);
        this.l = findRequiredView50;
        findRequiredView50.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.74
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onClickDataRekening(view2);
            }
        });
        findRequiredView50.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.75
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeRekening(view2, z);
            }
        });
        page6PLFragment.etDollarCurrCode = (getAnnualFeeAddOnAmount) Utils.findRequiredViewAsType(view, 2131297047, "field 'etDollarCurrCode'", getAnnualFeeAddOnAmount.class);
        View findRequiredView51 = Utils.findRequiredView(view, 2131296990, "field 'etInternetBanking' and method 'onFocusChangeRekening'");
        page6PLFragment.etInternetBanking = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView51, 2131296990, "field 'etInternetBanking'", getAnnualFeeAddOnAmount.class);
        this.g = findRequiredView51;
        findRequiredView51.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.73
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeRekening(view2, z);
            }
        });
        View findRequiredView52 = Utils.findRequiredView(view, 2131297053, "field 'etMobileBanking' and method 'onFocusChangeRekening'");
        page6PLFragment.etMobileBanking = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView52, 2131297053, "field 'etMobileBanking'", getAnnualFeeAddOnAmount.class);
        this.B = findRequiredView52;
        findRequiredView52.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.71
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6PLFragment.onFocusChangeRekening(view2, z);
            }
        });
        page6PLFragment.tilInternetBanking = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298539, "field 'tilInternetBanking'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilMobileBanking = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298600, "field 'tilMobileBanking'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilJenisKartu = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298544, "field 'tilJenisKartu'", LogoutDialog_ViewBinding.class);
        page6PLFragment.tilMataUang = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298594, "field 'tilMataUang'", LogoutDialog_ViewBinding.class);
        page6PLFragment.cbxAgree = (CheckBox) Utils.findRequiredViewAsType(view, 2131296469, "field 'cbxAgree'", CheckBox.class);
        page6PLFragment.llMainDataDiri = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297491, "field 'llMainDataDiri'", LinearLayout.class);
        page6PLFragment.llMainDataAlamatHome = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297488, "field 'llMainDataAlamatHome'", LinearLayout.class);
        page6PLFragment.llMainDataAlamatResidence = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297489, "field 'llMainDataAlamatResidence'", LinearLayout.class);
        page6PLFragment.llMainDataPekerjaan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297493, "field 'llMainDataPekerjaan'", LinearLayout.class);
        page6PLFragment.llMainDataRekening = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297496, "field 'llMainDataRekening'", LinearLayout.class);
        page6PLFragment.llDataDiri = (FrameLayout) Utils.findRequiredViewAsType(view, 2131297447, "field 'llDataDiri'", FrameLayout.class);
        page6PLFragment.llDataAlamatHome = (FrameLayout) Utils.findRequiredViewAsType(view, 2131297437, "field 'llDataAlamatHome'", FrameLayout.class);
        page6PLFragment.llDataAlamatResidence = (FrameLayout) Utils.findRequiredViewAsType(view, 2131297440, "field 'llDataAlamatResidence'", FrameLayout.class);
        page6PLFragment.llDataPekerjaan = (FrameLayout) Utils.findRequiredViewAsType(view, 2131297462, "field 'llDataPekerjaan'", FrameLayout.class);
        page6PLFragment.llDataRekening = (FrameLayout) Utils.findRequiredViewAsType(view, 2131297476, "field 'llDataRekening'", FrameLayout.class);
        page6PLFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        page6PLFragment.llFasilitasBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297639, "field 'llFasilitasBanking'", LinearLayout.class);
        page6PLFragment.ivFotoNpwp = (Page6CSFragment) Utils.findRequiredViewAsType(view, 2131297365, "field 'ivFotoNpwp'", Page6CSFragment.class);
        View findRequiredView53 = Utils.findRequiredView(view, 2131299705, "field 'tvUbahDataDiri' and method 'onClickUbahDataDiri'");
        page6PLFragment.tvUbahDataDiri = (TextView) Utils.castView(findRequiredView53, 2131299705, "field 'tvUbahDataDiri'", TextView.class);
        this.ar = findRequiredView53;
        findRequiredView53.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.72
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onClickUbahDataDiri(view2);
            }
        });
        View findRequiredView54 = Utils.findRequiredView(view, 2131299702, "field 'tvUbahDataAlamatHome' and method 'onClickUbahDataAlamatIdentitas'");
        page6PLFragment.tvUbahDataAlamatHome = (TextView) Utils.castView(findRequiredView54, 2131299702, "field 'tvUbahDataAlamatHome'", TextView.class);
        this.an = findRequiredView54;
        findRequiredView54.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.78
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onClickUbahDataAlamatIdentitas(view2);
            }
        });
        View findRequiredView55 = Utils.findRequiredView(view, 2131299703, "field 'tvUbahDataAlamatResidence' and method 'onClickUbahDataAlamat'");
        page6PLFragment.tvUbahDataAlamatResidence = (TextView) Utils.castView(findRequiredView55, 2131299703, "field 'tvUbahDataAlamatResidence'", TextView.class);
        this.ao = findRequiredView55;
        findRequiredView55.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.76
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onClickUbahDataAlamat(view2);
            }
        });
        View findRequiredView56 = Utils.findRequiredView(view, 2131299713, "field 'tvUbahDataPekerjaan' and method 'onClickUbahDataPekerjaan'");
        page6PLFragment.tvUbahDataPekerjaan = (TextView) Utils.castView(findRequiredView56, 2131299713, "field 'tvUbahDataPekerjaan'", TextView.class);
        this.aq = findRequiredView56;
        findRequiredView56.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.80
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.onClickUbahDataPekerjaan(view2);
            }
        });
        View findRequiredView57 = Utils.findRequiredView(view, 2131299721, "field 'tvUbahDataRekening' and method 'ubahDataRekening'");
        page6PLFragment.tvUbahDataRekening = (TextView) Utils.castView(findRequiredView57, 2131299721, "field 'tvUbahDataRekening'", TextView.class);
        this.ap = findRequiredView57;
        findRequiredView57.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.79
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.ubahDataRekening(view2);
            }
        });
        page6PLFragment.llNamaKantor = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297780, "field 'llNamaKantor'", LinearLayout.class);
        page6PLFragment.llAlamatKantor = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297529, "field 'llAlamatKantor'", LinearLayout.class);
        page6PLFragment.llDescPekerjaan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297619, "field 'llDescPekerjaan'", LinearLayout.class);
        page6PLFragment.llBidangPekerjaan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297551, "field 'llBidangPekerjaan'", LinearLayout.class);
        page6PLFragment.llJabatan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297694, "field 'llJabatan'", LinearLayout.class);
        page6PLFragment.llBidangUsaha = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297553, "field 'llBidangUsaha'", LinearLayout.class);
        page6PLFragment.llKotaKodePosKantor = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297748, "field 'llKotaKodePosKantor'", LinearLayout.class);
        View findRequiredView58 = Utils.findRequiredView(view, 2131299604, "field 'tvTermCondition' and method 'clickedTermsCondition'");
        page6PLFragment.tvTermCondition = (TextView) Utils.castView(findRequiredView58, 2131299604, "field 'tvTermCondition'", TextView.class);
        this.ai = findRequiredView58;
        findRequiredView58.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.83
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.clickedTermsCondition(view2);
            }
        });
        page6PLFragment.tilBahasaPetunjuk = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298496, "field 'tilBahasaPetunjuk'", LogoutDialog_ViewBinding.class);
        page6PLFragment.llSyaratKetentuan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297904, "field 'llSyaratKetentuan'", LinearLayout.class);
        View findRequiredView59 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'next'");
        page6PLFragment.btnProses = (Button) Utils.castView(findRequiredView59, 2131296440, "field 'btnProses'", Button.class);
        this.c = findRequiredView59;
        findRequiredView59.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.81
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.next(view2);
            }
        });
        View findRequiredView60 = Utils.findRequiredView(view, 2131297334, "field 'ivDataDiri' and method 'showDataDiri'");
        page6PLFragment.ivDataDiri = (ImageView) Utils.castView(findRequiredView60, 2131297334, "field 'ivDataDiri'", ImageView.class);
        this.ah = findRequiredView60;
        findRequiredView60.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.85
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.showDataDiri(view2);
            }
        });
        View findRequiredView61 = Utils.findRequiredView(view, 2131297331, "field 'ivDataAlamatHome' and method 'showDataAlamatNKTP'");
        page6PLFragment.ivDataAlamatHome = (ImageView) Utils.castView(findRequiredView61, 2131297331, "field 'ivDataAlamatHome'", ImageView.class);
        this.Z = findRequiredView61;
        findRequiredView61.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.84
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.showDataAlamatNKTP(view2);
            }
        });
        View findRequiredView62 = Utils.findRequiredView(view, 2131297332, "field 'ivDataAlamatResidence' and method 'showDataAlamat'");
        page6PLFragment.ivDataAlamatResidence = (ImageView) Utils.castView(findRequiredView62, 2131297332, "field 'ivDataAlamatResidence'", ImageView.class);
        this.ae = findRequiredView62;
        findRequiredView62.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.82
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.showDataAlamat(view2);
            }
        });
        View findRequiredView63 = Utils.findRequiredView(view, 2131297343, "field 'ivDataPekerjaan' and method 'showDataPekerjaan'");
        page6PLFragment.ivDataPekerjaan = (ImageView) Utils.castView(findRequiredView63, 2131297343, "field 'ivDataPekerjaan'", ImageView.class);
        this.af = findRequiredView63;
        findRequiredView63.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.89
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.showDataPekerjaan(view2);
            }
        });
        View findRequiredView64 = Utils.findRequiredView(view, 2131297352, "field 'ivDataRekening' and method 'showDataRekening'");
        page6PLFragment.ivDataRekening = (ImageView) Utils.castView(findRequiredView64, 2131297352, "field 'ivDataRekening'", ImageView.class);
        this.ag = findRequiredView64;
        findRequiredView64.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.90
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.showDataRekening(view2);
            }
        });
        page6PLFragment.llHeaderDataDiri = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297656, "field 'llHeaderDataDiri'", LinearLayout.class);
        page6PLFragment.llHeaderDataAlamatHome = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297654, "field 'llHeaderDataAlamatHome'", LinearLayout.class);
        page6PLFragment.llHeaderDataAlamatResidence = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297655, "field 'llHeaderDataAlamatResidence'", LinearLayout.class);
        page6PLFragment.llHeaderDataPekerjaan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297664, "field 'llHeaderDataPekerjaan'", LinearLayout.class);
        page6PLFragment.llHeaderDataRekening = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297672, "field 'llHeaderDataRekening'", LinearLayout.class);
        page6PLFragment.llLayoutDataDiriUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297449, "field 'llLayoutDataDiriUneditable'", LinearLayout.class);
        page6PLFragment.llLayoutDataDiriEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297448, "field 'llLayoutDataDiriEditable'", LinearLayout.class);
        page6PLFragment.llLayoutDataAlamatHomeUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297439, "field 'llLayoutDataAlamatHomeUneditable'", LinearLayout.class);
        page6PLFragment.llLayoutDataAlamatHomeEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297438, "field 'llLayoutDataAlamatHomeEditable'", LinearLayout.class);
        page6PLFragment.llLayoutDataAlamatResidenceUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297442, "field 'llLayoutDataAlamatResidenceUneditable'", LinearLayout.class);
        page6PLFragment.llLayoutDataAlamatResidenceEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297441, "field 'llLayoutDataAlamatResidenceEditable'", LinearLayout.class);
        page6PLFragment.llLayoutDataPekerjaanUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297464, "field 'llLayoutDataPekerjaanUneditable'", LinearLayout.class);
        page6PLFragment.llLayoutDataPekerjaanEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297463, "field 'llLayoutDataPekerjaanEditable'", LinearLayout.class);
        page6PLFragment.llLayoutDataRekeningUneditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297478, "field 'llLayoutDataRekeningUneditable'", LinearLayout.class);
        page6PLFragment.llLayoutDataRekeningEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297477, "field 'llLayoutDataRekeningEditable'", LinearLayout.class);
        page6PLFragment.tvJenisIdentitas = (TextView) Utils.findRequiredViewAsType(view, 2131299301, "field 'tvJenisIdentitas'", TextView.class);
        page6PLFragment.tvTitleNamaSesuaiId = (TextView) Utils.findRequiredViewAsType(view, 2131299643, "field 'tvTitleNamaSesuaiId'", TextView.class);
        page6PLFragment.tvNamaId = (TextView) Utils.findRequiredViewAsType(view, 2131299423, "field 'tvNamaId'", TextView.class);
        page6PLFragment.tvTitleNoIdentitas = (TextView) Utils.findRequiredViewAsType(view, 2131299649, "field 'tvTitleNoIdentitas'", TextView.class);
        page6PLFragment.tvNoIdentitas = (TextView) Utils.findRequiredViewAsType(view, 2131299459, "field 'tvNoIdentitas'", TextView.class);
        page6PLFragment.tvTitleNegaraId = (TextView) Utils.findRequiredViewAsType(view, 2131299648, "field 'tvTitleNegaraId'", TextView.class);
        page6PLFragment.tvNegaraId = (TextView) Utils.findRequiredViewAsType(view, 2131299447, "field 'tvNegaraId'", TextView.class);
        page6PLFragment.tvTitleMasaBerlakuId = (TextView) Utils.findRequiredViewAsType(view, 2131299639, "field 'tvTitleMasaBerlakuId'", TextView.class);
        page6PLFragment.tvMasaBerlakuId = (TextView) Utils.findRequiredViewAsType(view, 2131299397, "field 'tvMasaBerlakuId'", TextView.class);
        page6PLFragment.tvJenisKelamin = (TextView) Utils.findRequiredViewAsType(view, 2131299304, "field 'tvJenisKelamin'", TextView.class);
        page6PLFragment.tvNegaraLahir = (TextView) Utils.findRequiredViewAsType(view, 2131299448, "field 'tvNegaraLahir'", TextView.class);
        page6PLFragment.tvKotaLahir = (TextView) Utils.findRequiredViewAsType(view, 2131299381, "field 'tvKotaLahir'", TextView.class);
        page6PLFragment.tvTanggalLahir = (TextView) Utils.findRequiredViewAsType(view, 2131299598, "field 'tvTanggalLahir'", TextView.class);
        page6PLFragment.tvStatusPerkawinan = (TextView) Utils.findRequiredViewAsType(view, 2131299582, "field 'tvStatusPerkawinan'", TextView.class);
        page6PLFragment.tvAgama = (TextView) Utils.findRequiredViewAsType(view, 2131298810, "field 'tvAgama'", TextView.class);
        page6PLFragment.tvNamaIbu = (TextView) Utils.findRequiredViewAsType(view, 2131299422, "field 'tvNamaIbu'", TextView.class);
        page6PLFragment.tvKodeNegara = (TextView) Utils.findRequiredViewAsType(view, 2131299363, "field 'tvKodeNegara'", TextView.class);
        page6PLFragment.tvNoHp = (TextView) Utils.findRequiredViewAsType(view, 2131299453, "field 'tvNoHp'", TextView.class);
        page6PLFragment.tvKodeArea = (TextView) Utils.findRequiredViewAsType(view, 2131299361, "field 'tvKodeArea'", TextView.class);
        page6PLFragment.tvNoTlpRumah = (TextView) Utils.findRequiredViewAsType(view, 2131299481, "field 'tvNoTlpRumah'", TextView.class);
        page6PLFragment.tvEmail = (TextView) Utils.findRequiredViewAsType(view, 2131298950, "field 'tvEmail'", TextView.class);
        page6PLFragment.tvNoKitas = (TextView) Utils.findRequiredViewAsType(view, 2131299462, "field 'tvNoKitas'", TextView.class);
        page6PLFragment.tvMasaBerlakuKitas = (TextView) Utils.findRequiredViewAsType(view, 2131299399, "field 'tvMasaBerlakuKitas'", TextView.class);
        page6PLFragment.llNegaraIdentitasDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297812, "field 'llNegaraIdentitasDisabled'", LinearLayout.class);
        page6PLFragment.llNoKitasDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297820, "field 'llNoKitasDisabled'", LinearLayout.class);
        page6PLFragment.llMasaBerlakuKitasDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297770, "field 'llMasaBerlakuKitasDisabled'", LinearLayout.class);
        page6PLFragment.llNegaraHomeDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297811, "field 'llNegaraHomeDisabled'", LinearLayout.class);
        page6PLFragment.llProvinsiHomeDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297863, "field 'llProvinsiHomeDisabled'", LinearLayout.class);
        page6PLFragment.llKotaHomeDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297744, "field 'llKotaHomeDisabled'", LinearLayout.class);
        page6PLFragment.llKecamatanHomeDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297715, "field 'llKecamatanHomeDisabled'", LinearLayout.class);
        page6PLFragment.llKelurahanHomeDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297720, "field 'llKelurahanHomeDisabled'", LinearLayout.class);
        page6PLFragment.llKodePosHomeDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297730, "field 'llKodePosHomeDisabled'", LinearLayout.class);
        page6PLFragment.llKotaHomeWrapperDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297745, "field 'llKotaHomeWrapperDisabled'", LinearLayout.class);
        page6PLFragment.llKelurahanHomeWrapperDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297721, "field 'llKelurahanHomeWrapperDisabled'", LinearLayout.class);
        page6PLFragment.llRtRwHomeDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297873, "field 'llRtRwHomeDisabled'", LinearLayout.class);
        page6PLFragment.tvTitleNegaraHome = (TextView) Utils.findRequiredViewAsType(view, 2131299647, "field 'tvTitleNegaraHome'", TextView.class);
        page6PLFragment.tvNegaraHome = (TextView) Utils.findRequiredViewAsType(view, 2131299446, "field 'tvNegaraHome'", TextView.class);
        page6PLFragment.tvTitleAlamatHome = (TextView) Utils.findRequiredViewAsType(view, 2131299618, "field 'tvTitleAlamatHome'", TextView.class);
        page6PLFragment.tvAlamatHome = (TextView) Utils.findRequiredViewAsType(view, 2131298817, "field 'tvAlamatHome'", TextView.class);
        page6PLFragment.tvRtHome = (TextView) Utils.findRequiredViewAsType(view, 2131299562, "field 'tvRtHome'", TextView.class);
        page6PLFragment.tvRwHome = (TextView) Utils.findRequiredViewAsType(view, 2131299564, "field 'tvRwHome'", TextView.class);
        page6PLFragment.tvProvinsiHome = (TextView) Utils.findRequiredViewAsType(view, 2131299544, "field 'tvProvinsiHome'", TextView.class);
        page6PLFragment.tvKelurahanHome = (TextView) Utils.findRequiredViewAsType(view, 2131299345, "field 'tvKelurahanHome'", TextView.class);
        page6PLFragment.tvKecamatanHome = (TextView) Utils.findRequiredViewAsType(view, 2131299343, "field 'tvKecamatanHome'", TextView.class);
        page6PLFragment.tvKotaHome = (TextView) Utils.findRequiredViewAsType(view, 2131299378, "field 'tvKotaHome'", TextView.class);
        page6PLFragment.tvKodePosHome = (TextView) Utils.findRequiredViewAsType(view, 2131299367, "field 'tvKodePosHome'", TextView.class);
        page6PLFragment.llNegaraDomisiliDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297810, "field 'llNegaraDomisiliDisabled'", LinearLayout.class);
        page6PLFragment.llProvinsiDomisiliDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297862, "field 'llProvinsiDomisiliDisabled'", LinearLayout.class);
        page6PLFragment.llKotaDomisiliDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297742, "field 'llKotaDomisiliDisabled'", LinearLayout.class);
        page6PLFragment.llKecamatanDomisiliDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297713, "field 'llKecamatanDomisiliDisabled'", LinearLayout.class);
        page6PLFragment.llKelurahanDomisiliDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297717, "field 'llKelurahanDomisiliDisabled'", LinearLayout.class);
        page6PLFragment.llKodePosDomisiliDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297729, "field 'llKodePosDomisiliDisabled'", LinearLayout.class);
        page6PLFragment.llKotaDomisiliWrapperDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297743, "field 'llKotaDomisiliWrapperDisabled'", LinearLayout.class);
        page6PLFragment.llKelurahanDomisiliWrapperDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297718, "field 'llKelurahanDomisiliWrapperDisabled'", LinearLayout.class);
        page6PLFragment.llRtRwDomisiliDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297872, "field 'llRtRwDomisiliDisabled'", LinearLayout.class);
        page6PLFragment.tvTitleNegaraDomisili = (TextView) Utils.findRequiredViewAsType(view, 2131299646, "field 'tvTitleNegaraDomisili'", TextView.class);
        page6PLFragment.tvNegaraDomisili = (TextView) Utils.findRequiredViewAsType(view, 2131299445, "field 'tvNegaraDomisili'", TextView.class);
        page6PLFragment.tvTitleAlamatDomisili = (TextView) Utils.findRequiredViewAsType(view, 2131299617, "field 'tvTitleAlamatDomisili'", TextView.class);
        page6PLFragment.tvAlamatDomisili = (TextView) Utils.findRequiredViewAsType(view, 2131298816, "field 'tvAlamatDomisili'", TextView.class);
        page6PLFragment.tvRtDomisili = (TextView) Utils.findRequiredViewAsType(view, 2131299561, "field 'tvRtDomisili'", TextView.class);
        page6PLFragment.tvRwDomisili = (TextView) Utils.findRequiredViewAsType(view, 2131299563, "field 'tvRwDomisili'", TextView.class);
        page6PLFragment.tvProvinsiDomisili = (TextView) Utils.findRequiredViewAsType(view, 2131299543, "field 'tvProvinsiDomisili'", TextView.class);
        page6PLFragment.tvKotaDomisili = (TextView) Utils.findRequiredViewAsType(view, 2131299377, "field 'tvKotaDomisili'", TextView.class);
        page6PLFragment.tvKecamatanDomisili = (TextView) Utils.findRequiredViewAsType(view, 2131299342, "field 'tvKecamatanDomisili'", TextView.class);
        page6PLFragment.tvKelurahanDomisili = (TextView) Utils.findRequiredViewAsType(view, 2131299344, "field 'tvKelurahanDomisili'", TextView.class);
        page6PLFragment.tvKodePosDomisili = (TextView) Utils.findRequiredViewAsType(view, 2131299366, "field 'tvKodePosDomisili'", TextView.class);
        page6PLFragment.llNomorNpwpDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297834, "field 'llNomorNpwpDisabled'", LinearLayout.class);
        page6PLFragment.llStatusNpwpDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297892, "field 'llStatusNpwpDisabled'", LinearLayout.class);
        page6PLFragment.llPekerjaanDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297843, "field 'llPekerjaanDisabled'", LinearLayout.class);
        page6PLFragment.llDescPekerjaanDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297620, "field 'llDescPekerjaanDisabled'", LinearLayout.class);
        page6PLFragment.llSumberPenghasilanDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297902, "field 'llSumberPenghasilanDisabled'", LinearLayout.class);
        page6PLFragment.llSumberPenghasilanLainnyaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297903, "field 'llSumberPenghasilanLainnyaDisabled'", LinearLayout.class);
        page6PLFragment.llPenghasilanDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297854, "field 'llPenghasilanDisabled'", LinearLayout.class);
        page6PLFragment.llJenisProfesiDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297702, "field 'llJenisProfesiDisabled'", LinearLayout.class);
        page6PLFragment.llJabatanDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297696, "field 'llJabatanDisabled'", LinearLayout.class);
        page6PLFragment.llNamaKantorDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297781, "field 'llNamaKantorDisabled'", LinearLayout.class);
        page6PLFragment.llAlamatKantorDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297530, "field 'llAlamatKantorDisabled'", LinearLayout.class);
        page6PLFragment.llProvinsiKantorDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297864, "field 'llProvinsiKantorDisabled'", LinearLayout.class);
        page6PLFragment.llKotaKantorDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297747, "field 'llKotaKantorDisabled'", LinearLayout.class);
        page6PLFragment.llBidangPekerjaanWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297552, "field 'llBidangPekerjaanWrapper'", LinearLayout.class);
        page6PLFragment.tvNoNpwp = (TextView) Utils.findRequiredViewAsType(view, 2131299464, "field 'tvNoNpwp'", TextView.class);
        page6PLFragment.tvTitleNoNpwp = (TextView) Utils.findRequiredViewAsType(view, 2131299651, "field 'tvTitleNoNpwp'", TextView.class);
        page6PLFragment.tvStatusNpwp = (TextView) Utils.findRequiredViewAsType(view, 2131299575, "field 'tvStatusNpwp'", TextView.class);
        page6PLFragment.tvPekerjaan = (TextView) Utils.findRequiredViewAsType(view, 2131299511, "field 'tvPekerjaan'", TextView.class);
        page6PLFragment.tvDescPekerjaan = (TextView) Utils.findRequiredViewAsType(view, 2131298923, "field 'tvDescPekerjaan'", TextView.class);
        page6PLFragment.tvBidangPekerjaan = (TextView) Utils.findRequiredViewAsType(view, 2131298860, "field 'tvBidangPekerjaan'", TextView.class);
        page6PLFragment.tvSumberPenghasilan = (TextView) Utils.findRequiredViewAsType(view, 2131299592, "field 'tvSumberPenghasilan'", TextView.class);
        page6PLFragment.tvSumberPenghasilanLainnya = (TextView) Utils.findRequiredViewAsType(view, 2131299593, "field 'tvSumberPenghasilanLainnya'", TextView.class);
        page6PLFragment.tvPenghasilan = (TextView) Utils.findRequiredViewAsType(view, 2131299522, "field 'tvPenghasilan'", TextView.class);
        page6PLFragment.tvJenisProfesi = (TextView) Utils.findRequiredViewAsType(view, 2131299311, "field 'tvJenisProfesi'", TextView.class);
        page6PLFragment.tvJabatan = (TextView) Utils.findRequiredViewAsType(view, 2131299298, "field 'tvJabatan'", TextView.class);
        page6PLFragment.tvBidangUsaha = (TextView) Utils.findRequiredViewAsType(view, 2131298861, "field 'tvBidangUsaha'", TextView.class);
        page6PLFragment.tvTitleNamaKantor = (TextView) Utils.findRequiredViewAsType(view, 2131299644, "field 'tvTitleNamaKantor'", TextView.class);
        page6PLFragment.tvNamaKantor = (TextView) Utils.findRequiredViewAsType(view, 2131299424, "field 'tvNamaKantor'", TextView.class);
        page6PLFragment.tvTitleAlamatKantor = (TextView) Utils.findRequiredViewAsType(view, 2131299619, "field 'tvTitleAlamatKantor'", TextView.class);
        page6PLFragment.tvAlamatKantor = (TextView) Utils.findRequiredViewAsType(view, 2131298818, "field 'tvAlamatKantor'", TextView.class);
        page6PLFragment.tvProvinsiKantor = (TextView) Utils.findRequiredViewAsType(view, 2131299545, "field 'tvProvinsiKantor'", TextView.class);
        page6PLFragment.tvKotaKantor = (TextView) Utils.findRequiredViewAsType(view, 2131299379, "field 'tvKotaKantor'", TextView.class);
        page6PLFragment.tvKodePosKantor = (TextView) Utils.findRequiredViewAsType(view, 2131299368, "field 'tvKodePosKantor'", TextView.class);
        page6PLFragment.llTujuanPemrekDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297926, "field 'llTujuanPemrekDisabled'", LinearLayout.class);
        page6PLFragment.llBahasaPetunjukDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297533, "field 'llBahasaPetunjukDisabled'", LinearLayout.class);
        page6PLFragment.llJenisKartuAtmDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297699, "field 'llJenisKartuAtmDisabled'", LinearLayout.class);
        page6PLFragment.llMataUangDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297772, "field 'llMataUangDisabled'", LinearLayout.class);
        page6PLFragment.llFasilitasKlikBcaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297640, "field 'llFasilitasKlikBcaDisabled'", LinearLayout.class);
        page6PLFragment.llFasilitasMBcaDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297641, "field 'llFasilitasMBcaDisabled'", LinearLayout.class);
        page6PLFragment.tvTujuanPemrek = (TextView) Utils.findRequiredViewAsType(view, 2131299695, "field 'tvTujuanPemrek'", TextView.class);
        page6PLFragment.tvBahasaPetunjuk = (TextView) Utils.findRequiredViewAsType(view, 2131298834, "field 'tvBahasaPetunjuk'", TextView.class);
        page6PLFragment.tvJenisKartuAtm = (TextView) Utils.findRequiredViewAsType(view, 2131299303, "field 'tvJenisKartuAtm'", TextView.class);
        page6PLFragment.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299400, "field 'tvMataUang'", TextView.class);
        page6PLFragment.tvFasilitasKlikBca = (TextView) Utils.findRequiredViewAsType(view, 2131299255, "field 'tvFasilitasKlikBca'", TextView.class);
        page6PLFragment.tvFasilitasMBca = (TextView) Utils.findRequiredViewAsType(view, 2131299256, "field 'tvFasilitasMBca'", TextView.class);
        View findRequiredView65 = Utils.findRequiredView(view, 2131298892, "field 'tvDataAlamatHome' and method 'showDataAlamatNKTP'");
        page6PLFragment.tvDataAlamatHome = (TextView) Utils.castView(findRequiredView65, 2131298892, "field 'tvDataAlamatHome'", TextView.class);
        this.ad = findRequiredView65;
        findRequiredView65.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.87
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.showDataAlamatNKTP(view2);
            }
        });
        View findRequiredView66 = Utils.findRequiredView(view, 2131298895, "method 'showDataDiri'");
        this.am = findRequiredView66;
        findRequiredView66.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.88
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.showDataDiri(view2);
            }
        });
        View findRequiredView67 = Utils.findRequiredView(view, 2131298893, "method 'showDataAlamat'");
        this.ak = findRequiredView67;
        findRequiredView67.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.91
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.showDataAlamat(view2);
            }
        });
        View findRequiredView68 = Utils.findRequiredView(view, 2131298903, "method 'showDataPekerjaan'");
        this.aj = findRequiredView68;
        findRequiredView68.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.94
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.showDataPekerjaan(view2);
            }
        });
        View findRequiredView69 = Utils.findRequiredView(view, 2131298911, "method 'showDataRekening'");
        this.al = findRequiredView69;
        findRequiredView69.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6PLFragment_ViewBinding.92
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6PLFragment.showDataRekening(view2);
            }
        });
        page6PLFragment.viewGroupDataDiri = Utils.listFilteringNull((EditText) Utils.findRequiredViewAsType(view, 2131296994, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297060, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297103, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297086, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297045, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296997, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297087, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297037, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297207, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297197, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296925, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297058, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297021, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297094, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297019, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297115, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296976, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297105, "field 'viewGroupDataDiri'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297046, "field 'viewGroupDataDiri'", EditText.class));
        page6PLFragment.tilFormGroupDataDiri = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298543, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298607, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298632, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298592, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298545, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298633, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298584, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298729, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298474, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298605, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298567, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298565, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298661, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298651, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298593, "field 'tilFormGroupDataDiri'", LogoutDialog_ViewBinding.class));
        page6PLFragment.tvErrorGroupDataDiri = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299018, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299084, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299122, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299108, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299068, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299021, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299109, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299060, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299207, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299197, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298954, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299082, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299043, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299041, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299134, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299124, "field 'tvErrorGroupDataDiri'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299069, "field 'tvErrorGroupDataDiri'", TextView.class));
        page6PLFragment.viewGroupDataAlamatNKTP = Utils.listFilteringNull((EditText) Utils.findRequiredViewAsType(view, 2131297085, "field 'viewGroupDataAlamatNKTP'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296942, "field 'viewGroupDataAlamatNKTP'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297169, "field 'viewGroupDataAlamatNKTP'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297172, "field 'viewGroupDataAlamatNKTP'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297163, "field 'viewGroupDataAlamatNKTP'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297039, "field 'viewGroupDataAlamatNKTP'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297013, "field 'viewGroupDataAlamatNKTP'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297016, "field 'viewGroupDataAlamatNKTP'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297026, "field 'viewGroupDataAlamatNKTP'", EditText.class));
        page6PLFragment.tilFormGroupDataAlamatNKTP = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298631, "field 'tilFormGroupDataAlamatNKTP'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298491, "field 'tilFormGroupDataAlamatNKTP'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298705, "field 'tilFormGroupDataAlamatNKTP'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298708, "field 'tilFormGroupDataAlamatNKTP'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298699, "field 'tilFormGroupDataAlamatNKTP'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298586, "field 'tilFormGroupDataAlamatNKTP'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298559, "field 'tilFormGroupDataAlamatNKTP'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298562, "field 'tilFormGroupDataAlamatNKTP'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298572, "field 'tilFormGroupDataAlamatNKTP'", LogoutDialog_ViewBinding.class));
        page6PLFragment.tvErrorGroupDataAlamatNKTP = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299107, "field 'tvErrorGroupDataAlamatNKTP'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298970, "field 'tvErrorGroupDataAlamatNKTP'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299173, "field 'tvErrorGroupDataAlamatNKTP'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299176, "field 'tvErrorGroupDataAlamatNKTP'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299166, "field 'tvErrorGroupDataAlamatNKTP'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299062, "field 'tvErrorGroupDataAlamatNKTP'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299036, "field 'tvErrorGroupDataAlamatNKTP'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299039, "field 'tvErrorGroupDataAlamatNKTP'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299049, "field 'tvErrorGroupDataAlamatNKTP'", TextView.class));
        page6PLFragment.viewGroupDataAlamat = Utils.listFilteringNull((EditText) Utils.findRequiredViewAsType(view, 2131297084, "field 'viewGroupDataAlamat'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296930, "field 'viewGroupDataAlamat'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297168, "field 'viewGroupDataAlamat'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297171, "field 'viewGroupDataAlamat'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297162, "field 'viewGroupDataAlamat'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297035, "field 'viewGroupDataAlamat'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297012, "field 'viewGroupDataAlamat'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297015, "field 'viewGroupDataAlamat'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297023, "field 'viewGroupDataAlamat'", EditText.class));
        page6PLFragment.tilFormGroupDataAlamat = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298630, "field 'tilFormGroupDataAlamat'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298479, "field 'tilFormGroupDataAlamat'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298704, "field 'tilFormGroupDataAlamat'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298707, "field 'tilFormGroupDataAlamat'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298698, "field 'tilFormGroupDataAlamat'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298582, "field 'tilFormGroupDataAlamat'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298558, "field 'tilFormGroupDataAlamat'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298561, "field 'tilFormGroupDataAlamat'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298569, "field 'tilFormGroupDataAlamat'", LogoutDialog_ViewBinding.class));
        page6PLFragment.tvErrorGroupDataAlamat = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299106, "field 'tvErrorGroupDataAlamat'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298959, "field 'tvErrorGroupDataAlamat'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299172, "field 'tvErrorGroupDataAlamat'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299175, "field 'tvErrorGroupDataAlamat'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299165, "field 'tvErrorGroupDataAlamat'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299058, "field 'tvErrorGroupDataAlamat'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299035, "field 'tvErrorGroupDataAlamat'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299038, "field 'tvErrorGroupDataAlamat'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299046, "field 'tvErrorGroupDataAlamat'", TextView.class));
        page6PLFragment.viewGroupDataPekerjaan = Utils.listFilteringNull((EditText) Utils.findRequiredViewAsType(view, 2131297106, "field 'viewGroupDataPekerjaan'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297061, "field 'viewGroupDataPekerjaan'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297146, "field 'viewGroupDataPekerjaan'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296992, "field 'viewGroupDataPekerjaan'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296967, "field 'viewGroupDataPekerjaan'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296931, "field 'viewGroupDataPekerjaan'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297036, "field 'viewGroupDataPekerjaan'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297024, "field 'viewGroupDataPekerjaan'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297164, "field 'viewGroupDataPekerjaan'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297003, "field 'viewGroupDataPekerjaan'", EditText.class));
        page6PLFragment.tilFormGroupDataPekerjaan = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298652, "field 'tilFormGroupDataPekerjaan'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298608, "field 'tilFormGroupDataPekerjaan'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298688, "field 'tilFormGroupDataPekerjaan'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilFormGroupDataPekerjaan'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilFormGroupDataPekerjaan'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298480, "field 'tilFormGroupDataPekerjaan'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298583, "field 'tilFormGroupDataPekerjaan'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298570, "field 'tilFormGroupDataPekerjaan'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298700, "field 'tilFormGroupDataPekerjaan'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298551, "field 'tilFormGroupDataPekerjaan'", LogoutDialog_ViewBinding.class));
        page6PLFragment.tvErrorGroupDataPekerjaan = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299125, "field 'tvErrorGroupDataPekerjaan'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299085, "field 'tvErrorGroupDataPekerjaan'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299156, "field 'tvErrorGroupDataPekerjaan'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299016, "field 'tvErrorGroupDataPekerjaan'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298996, "field 'tvErrorGroupDataPekerjaan'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298960, "field 'tvErrorGroupDataPekerjaan'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299059, "field 'tvErrorGroupDataPekerjaan'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299047, "field 'tvErrorGroupDataPekerjaan'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299167, "field 'tvErrorGroupDataPekerjaan'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299027, "field 'tvErrorGroupDataPekerjaan'", TextView.class));
        page6PLFragment.viewGroupDataRekening = Utils.listFilteringNull((EditText) Utils.findRequiredViewAsType(view, 2131296996, "field 'viewGroupDataRekening'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131296990, "field 'viewGroupDataRekening'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297053, "field 'viewGroupDataRekening'", EditText.class));
        page6PLFragment.tilFormGroupDataRekening = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298544, "field 'tilFormGroupDataRekening'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298539, "field 'tilFormGroupDataRekening'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298600, "field 'tilFormGroupDataRekening'", LogoutDialog_ViewBinding.class));
        page6PLFragment.tvErrorGroupDataRekening = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299020, "field 'tvErrorGroupDataRekening'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299015, "field 'tvErrorGroupDataRekening'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299077, "field 'tvErrorGroupDataRekening'", TextView.class));
        Context context = view.getContext();
        Resources resources = context.getResources();
        page6PLFragment.statusPerkawinan = resources.getStringArray(2130903092);
        page6PLFragment.statusTempatTinggal = resources.getStringArray(2130903093);
        page6PLFragment.jenisPekerjaan = resources.getStringArray(2130903070);
        page6PLFragment.sumberPenghasilan = resources.getStringArray(2130903096);
        page6PLFragment.penghasilanPertahun = resources.getStringArray(2130903084);
        page6PLFragment.listSex = resources.getStringArray(2130903088);
        page6PLFragment.colorDataGrey = copyWindowDataInto.a(context, 2131099793);
        page6PLFragment.colorDataGreyDarker = copyWindowDataInto.a(context, 2131099794);
        page6PLFragment.retry = resources.getString(2131822092);
        page6PLFragment.txtTermCondition = resources.getString(2131821427);
        page6PLFragment.invalidHandphoneMessage = resources.getString(2131820903);
        page6PLFragment.invalidTeleponMessage = resources.getString(2131820953);
        page6PLFragment.invalidNpwpLengthMessage = resources.getString(2131820941);
        page6PLFragment.invalidNpwpOrangtuaLengthMessage = resources.getString(2131820944);
        page6PLFragment.invalidNpwpOrangtuaEmptyMessage = resources.getString(2131820943);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6PLFragment page6PLFragment = this.e;
        if (page6PLFragment != null) {
            this.e = null;
            page6PLFragment.etTypeId = null;
            page6PLFragment.etNamaId = null;
            page6PLFragment.etNoId = null;
            page6PLFragment.etNegaraId = null;
            page6PLFragment.etExpId = null;
            page6PLFragment.etSex = null;
            page6PLFragment.etNegaraLahir = null;
            page6PLFragment.etKotaLahir = null;
            page6PLFragment.etBornDate = null;
            page6PLFragment.etMaritStatus = null;
            page6PLFragment.etReligion = null;
            page6PLFragment.etMotherName = null;
            page6PLFragment.etKodeNegara = null;
            page6PLFragment.etNoHp = null;
            page6PLFragment.etKodeArea = null;
            page6PLFragment.etNoTelp = null;
            page6PLFragment.etEmail = null;
            page6PLFragment.etNoKitasKitap = null;
            page6PLFragment.etMasaBerlakuKitasKitap = null;
            page6PLFragment.tilJenisId = null;
            page6PLFragment.tilNamaId = null;
            page6PLFragment.tilNomorId = null;
            page6PLFragment.tilNegaraId = null;
            page6PLFragment.tilMasaBerlakuId = null;
            page6PLFragment.tilJenisKelamin = null;
            page6PLFragment.tilNegaraLahir = null;
            page6PLFragment.tilKotaLahir = null;
            page6PLFragment.tilTanggalLahir = null;
            page6PLFragment.tilStatusPerkawinan = null;
            page6PLFragment.tilAgama = null;
            page6PLFragment.tilNamaIbu = null;
            page6PLFragment.tilKodeNegara = null;
            page6PLFragment.tilNoHp = null;
            page6PLFragment.tilKodeArea = null;
            page6PLFragment.tilNoTelp = null;
            page6PLFragment.tilEmail = null;
            page6PLFragment.tilNoKitasKitap = null;
            page6PLFragment.tilMasaBerlakuKitasKitap = null;
            page6PLFragment.llEditableKitasKitapWrapper = null;
            page6PLFragment.etNegaraHome = null;
            page6PLFragment.etHouseAddrHome = null;
            page6PLFragment.etHouseRTHome = null;
            page6PLFragment.etHouseRWHome = null;
            page6PLFragment.etHouseProvinceHome = null;
            page6PLFragment.etHouseCityHome = null;
            page6PLFragment.etHouseSubDistricHome = null;
            page6PLFragment.etHouseVillageHome = null;
            page6PLFragment.etHousePostCodeHome = null;
            page6PLFragment.tilNegaraHome = null;
            page6PLFragment.tilAlamatSaatIniHome = null;
            page6PLFragment.tilRtHome = null;
            page6PLFragment.tilRwHome = null;
            page6PLFragment.tilProvinsiHome = null;
            page6PLFragment.tilKotaRumahHome = null;
            page6PLFragment.tilKecamatanHome = null;
            page6PLFragment.tilKelurahanHome = null;
            page6PLFragment.tilKodePosRumahHome = null;
            page6PLFragment.llKotaHome = null;
            page6PLFragment.llKecamatanHome = null;
            page6PLFragment.llKelurahanHome = null;
            page6PLFragment.llKodePosRumahHome = null;
            page6PLFragment.llEditableNonPasporWrapper = null;
            page6PLFragment.etNegaraDomisili = null;
            page6PLFragment.etHouseAddr = null;
            page6PLFragment.etHouseRT = null;
            page6PLFragment.etHouseRW = null;
            page6PLFragment.etHouseProvince = null;
            page6PLFragment.etHouseCity = null;
            page6PLFragment.etHouseSubDistric = null;
            page6PLFragment.etHouseVillage = null;
            page6PLFragment.etHousePostCode = null;
            page6PLFragment.tilNegaraDomisili = null;
            page6PLFragment.tilAlamatSaatIni = null;
            page6PLFragment.tilRt = null;
            page6PLFragment.tilRw = null;
            page6PLFragment.tilProvinsi = null;
            page6PLFragment.tilKotaRumah = null;
            page6PLFragment.tilKecamatan = null;
            page6PLFragment.tilKelurahan = null;
            page6PLFragment.tilKodePosRumah = null;
            page6PLFragment.llKotaDomisili = null;
            page6PLFragment.llKecamatanDomisili = null;
            page6PLFragment.llKelurahanDomisili = null;
            page6PLFragment.llKodePosRumahDomisili = null;
            page6PLFragment.llEditableIndonesianWrapper = null;
            page6PLFragment.etNoNPWP = null;
            page6PLFragment.etStatusNPWP = null;
            page6PLFragment.etJob = null;
            page6PLFragment.etDescPekerjaan = null;
            page6PLFragment.etBidangPekerjaan = null;
            page6PLFragment.etSumberPenghasilan = null;
            page6PLFragment.etPenghasilan = null;
            page6PLFragment.etJenisProfesi = null;
            page6PLFragment.etOfficeName = null;
            page6PLFragment.etOccupation = null;
            page6PLFragment.etBussinesField = null;
            page6PLFragment.etOfficeAddr = null;
            page6PLFragment.etOfficeCity = null;
            page6PLFragment.etOfficePostCode = null;
            page6PLFragment.etOfficeProvince = null;
            page6PLFragment.etPenghasilanLain = null;
            page6PLFragment.tilNoNpwp = null;
            page6PLFragment.tilStatusNPWP = null;
            page6PLFragment.tilPekerjaan = null;
            page6PLFragment.tilDescPekerjaan = null;
            page6PLFragment.tilBidangPekerjaan = null;
            page6PLFragment.tilSumberPenghasilan = null;
            page6PLFragment.tilPenghasilanLain = null;
            page6PLFragment.tilPenghasilan = null;
            page6PLFragment.tilJenisProfesi = null;
            page6PLFragment.tilNamaKantor = null;
            page6PLFragment.tilJabatan = null;
            page6PLFragment.tilBidangUsaha = null;
            page6PLFragment.tilAlamatKantor = null;
            page6PLFragment.tilKotaKantor = null;
            page6PLFragment.tilKodePosKantor = null;
            page6PLFragment.tilProvinsiKantor = null;
            page6PLFragment.llKotaKantor = null;
            page6PLFragment.llKodePosKantor = null;
            page6PLFragment.etPurposePemRek = null;
            page6PLFragment.etLanguage = null;
            page6PLFragment.etTypeCard = null;
            page6PLFragment.etDollarCurrCode = null;
            page6PLFragment.etInternetBanking = null;
            page6PLFragment.etMobileBanking = null;
            page6PLFragment.tilInternetBanking = null;
            page6PLFragment.tilMobileBanking = null;
            page6PLFragment.tilJenisKartu = null;
            page6PLFragment.tilMataUang = null;
            page6PLFragment.cbxAgree = null;
            page6PLFragment.llMainDataDiri = null;
            page6PLFragment.llMainDataAlamatHome = null;
            page6PLFragment.llMainDataAlamatResidence = null;
            page6PLFragment.llMainDataPekerjaan = null;
            page6PLFragment.llMainDataRekening = null;
            page6PLFragment.llDataDiri = null;
            page6PLFragment.llDataAlamatHome = null;
            page6PLFragment.llDataAlamatResidence = null;
            page6PLFragment.llDataPekerjaan = null;
            page6PLFragment.llDataRekening = null;
            page6PLFragment.svMain = null;
            page6PLFragment.llFasilitasBanking = null;
            page6PLFragment.ivFotoNpwp = null;
            page6PLFragment.tvUbahDataDiri = null;
            page6PLFragment.tvUbahDataAlamatHome = null;
            page6PLFragment.tvUbahDataAlamatResidence = null;
            page6PLFragment.tvUbahDataPekerjaan = null;
            page6PLFragment.tvUbahDataRekening = null;
            page6PLFragment.llNamaKantor = null;
            page6PLFragment.llAlamatKantor = null;
            page6PLFragment.llDescPekerjaan = null;
            page6PLFragment.llBidangPekerjaan = null;
            page6PLFragment.llJabatan = null;
            page6PLFragment.llBidangUsaha = null;
            page6PLFragment.llKotaKodePosKantor = null;
            page6PLFragment.tvTermCondition = null;
            page6PLFragment.tilBahasaPetunjuk = null;
            page6PLFragment.llSyaratKetentuan = null;
            page6PLFragment.btnProses = null;
            page6PLFragment.ivDataDiri = null;
            page6PLFragment.ivDataAlamatHome = null;
            page6PLFragment.ivDataAlamatResidence = null;
            page6PLFragment.ivDataPekerjaan = null;
            page6PLFragment.ivDataRekening = null;
            page6PLFragment.llHeaderDataDiri = null;
            page6PLFragment.llHeaderDataAlamatHome = null;
            page6PLFragment.llHeaderDataAlamatResidence = null;
            page6PLFragment.llHeaderDataPekerjaan = null;
            page6PLFragment.llHeaderDataRekening = null;
            page6PLFragment.llLayoutDataDiriUneditable = null;
            page6PLFragment.llLayoutDataDiriEditable = null;
            page6PLFragment.llLayoutDataAlamatHomeUneditable = null;
            page6PLFragment.llLayoutDataAlamatHomeEditable = null;
            page6PLFragment.llLayoutDataAlamatResidenceUneditable = null;
            page6PLFragment.llLayoutDataAlamatResidenceEditable = null;
            page6PLFragment.llLayoutDataPekerjaanUneditable = null;
            page6PLFragment.llLayoutDataPekerjaanEditable = null;
            page6PLFragment.llLayoutDataRekeningUneditable = null;
            page6PLFragment.llLayoutDataRekeningEditable = null;
            page6PLFragment.tvJenisIdentitas = null;
            page6PLFragment.tvTitleNamaSesuaiId = null;
            page6PLFragment.tvNamaId = null;
            page6PLFragment.tvTitleNoIdentitas = null;
            page6PLFragment.tvNoIdentitas = null;
            page6PLFragment.tvTitleNegaraId = null;
            page6PLFragment.tvNegaraId = null;
            page6PLFragment.tvTitleMasaBerlakuId = null;
            page6PLFragment.tvMasaBerlakuId = null;
            page6PLFragment.tvJenisKelamin = null;
            page6PLFragment.tvNegaraLahir = null;
            page6PLFragment.tvKotaLahir = null;
            page6PLFragment.tvTanggalLahir = null;
            page6PLFragment.tvStatusPerkawinan = null;
            page6PLFragment.tvAgama = null;
            page6PLFragment.tvNamaIbu = null;
            page6PLFragment.tvKodeNegara = null;
            page6PLFragment.tvNoHp = null;
            page6PLFragment.tvKodeArea = null;
            page6PLFragment.tvNoTlpRumah = null;
            page6PLFragment.tvEmail = null;
            page6PLFragment.tvNoKitas = null;
            page6PLFragment.tvMasaBerlakuKitas = null;
            page6PLFragment.llNegaraIdentitasDisabled = null;
            page6PLFragment.llNoKitasDisabled = null;
            page6PLFragment.llMasaBerlakuKitasDisabled = null;
            page6PLFragment.llNegaraHomeDisabled = null;
            page6PLFragment.llProvinsiHomeDisabled = null;
            page6PLFragment.llKotaHomeDisabled = null;
            page6PLFragment.llKecamatanHomeDisabled = null;
            page6PLFragment.llKelurahanHomeDisabled = null;
            page6PLFragment.llKodePosHomeDisabled = null;
            page6PLFragment.llKotaHomeWrapperDisabled = null;
            page6PLFragment.llKelurahanHomeWrapperDisabled = null;
            page6PLFragment.llRtRwHomeDisabled = null;
            page6PLFragment.tvTitleNegaraHome = null;
            page6PLFragment.tvNegaraHome = null;
            page6PLFragment.tvTitleAlamatHome = null;
            page6PLFragment.tvAlamatHome = null;
            page6PLFragment.tvRtHome = null;
            page6PLFragment.tvRwHome = null;
            page6PLFragment.tvProvinsiHome = null;
            page6PLFragment.tvKelurahanHome = null;
            page6PLFragment.tvKecamatanHome = null;
            page6PLFragment.tvKotaHome = null;
            page6PLFragment.tvKodePosHome = null;
            page6PLFragment.llNegaraDomisiliDisabled = null;
            page6PLFragment.llProvinsiDomisiliDisabled = null;
            page6PLFragment.llKotaDomisiliDisabled = null;
            page6PLFragment.llKecamatanDomisiliDisabled = null;
            page6PLFragment.llKelurahanDomisiliDisabled = null;
            page6PLFragment.llKodePosDomisiliDisabled = null;
            page6PLFragment.llKotaDomisiliWrapperDisabled = null;
            page6PLFragment.llKelurahanDomisiliWrapperDisabled = null;
            page6PLFragment.llRtRwDomisiliDisabled = null;
            page6PLFragment.tvTitleNegaraDomisili = null;
            page6PLFragment.tvNegaraDomisili = null;
            page6PLFragment.tvTitleAlamatDomisili = null;
            page6PLFragment.tvAlamatDomisili = null;
            page6PLFragment.tvRtDomisili = null;
            page6PLFragment.tvRwDomisili = null;
            page6PLFragment.tvProvinsiDomisili = null;
            page6PLFragment.tvKotaDomisili = null;
            page6PLFragment.tvKecamatanDomisili = null;
            page6PLFragment.tvKelurahanDomisili = null;
            page6PLFragment.tvKodePosDomisili = null;
            page6PLFragment.llNomorNpwpDisabled = null;
            page6PLFragment.llStatusNpwpDisabled = null;
            page6PLFragment.llPekerjaanDisabled = null;
            page6PLFragment.llDescPekerjaanDisabled = null;
            page6PLFragment.llSumberPenghasilanDisabled = null;
            page6PLFragment.llSumberPenghasilanLainnyaDisabled = null;
            page6PLFragment.llPenghasilanDisabled = null;
            page6PLFragment.llJenisProfesiDisabled = null;
            page6PLFragment.llJabatanDisabled = null;
            page6PLFragment.llNamaKantorDisabled = null;
            page6PLFragment.llAlamatKantorDisabled = null;
            page6PLFragment.llProvinsiKantorDisabled = null;
            page6PLFragment.llKotaKantorDisabled = null;
            page6PLFragment.llBidangPekerjaanWrapper = null;
            page6PLFragment.tvNoNpwp = null;
            page6PLFragment.tvTitleNoNpwp = null;
            page6PLFragment.tvStatusNpwp = null;
            page6PLFragment.tvPekerjaan = null;
            page6PLFragment.tvDescPekerjaan = null;
            page6PLFragment.tvBidangPekerjaan = null;
            page6PLFragment.tvSumberPenghasilan = null;
            page6PLFragment.tvSumberPenghasilanLainnya = null;
            page6PLFragment.tvPenghasilan = null;
            page6PLFragment.tvJenisProfesi = null;
            page6PLFragment.tvJabatan = null;
            page6PLFragment.tvBidangUsaha = null;
            page6PLFragment.tvTitleNamaKantor = null;
            page6PLFragment.tvNamaKantor = null;
            page6PLFragment.tvTitleAlamatKantor = null;
            page6PLFragment.tvAlamatKantor = null;
            page6PLFragment.tvProvinsiKantor = null;
            page6PLFragment.tvKotaKantor = null;
            page6PLFragment.tvKodePosKantor = null;
            page6PLFragment.llTujuanPemrekDisabled = null;
            page6PLFragment.llBahasaPetunjukDisabled = null;
            page6PLFragment.llJenisKartuAtmDisabled = null;
            page6PLFragment.llMataUangDisabled = null;
            page6PLFragment.llFasilitasKlikBcaDisabled = null;
            page6PLFragment.llFasilitasMBcaDisabled = null;
            page6PLFragment.tvTujuanPemrek = null;
            page6PLFragment.tvBahasaPetunjuk = null;
            page6PLFragment.tvJenisKartuAtm = null;
            page6PLFragment.tvMataUang = null;
            page6PLFragment.tvFasilitasKlikBca = null;
            page6PLFragment.tvFasilitasMBca = null;
            page6PLFragment.tvDataAlamatHome = null;
            page6PLFragment.viewGroupDataDiri = null;
            page6PLFragment.tilFormGroupDataDiri = null;
            page6PLFragment.tvErrorGroupDataDiri = null;
            page6PLFragment.viewGroupDataAlamatNKTP = null;
            page6PLFragment.tilFormGroupDataAlamatNKTP = null;
            page6PLFragment.tvErrorGroupDataAlamatNKTP = null;
            page6PLFragment.viewGroupDataAlamat = null;
            page6PLFragment.tilFormGroupDataAlamat = null;
            page6PLFragment.tvErrorGroupDataAlamat = null;
            page6PLFragment.viewGroupDataPekerjaan = null;
            page6PLFragment.tilFormGroupDataPekerjaan = null;
            page6PLFragment.tvErrorGroupDataPekerjaan = null;
            page6PLFragment.viewGroupDataRekening = null;
            page6PLFragment.tilFormGroupDataRekening = null;
            page6PLFragment.tvErrorGroupDataRekening = null;
            this.H.setOnFocusChangeListener(null);
            this.H = null;
            this.L.setOnFocusChangeListener(null);
            this.L = null;
            this.F.setOnClickListener(null);
            this.F.setOnFocusChangeListener(null);
            this.F = null;
            this.D.setOnClickListener(null);
            this.D.setOnFocusChangeListener(null);
            this.D = null;
            this.m.setOnClickListener(null);
            this.m.setOnFocusChangeListener(null);
            this.m = null;
            this.M.setOnClickListener(null);
            this.M.setOnFocusChangeListener(null);
            this.M = null;
            this.u.setOnFocusChangeListener(null);
            this.u = null;
            this.aa.setOnClickListener(null);
            this.aa.setOnFocusChangeListener(null);
            this.aa = null;
            this.ac.setOnClickListener(null);
            this.ac.setOnFocusChangeListener(null);
            this.ac = null;
            this.b.setOnClickListener(null);
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.z.setOnFocusChangeListener(null);
            this.z = null;
            this.p.setOnFocusChangeListener(null);
            this.p = null;
            this.J.setOnFocusChangeListener(null);
            this.J = null;
            this.t.setOnFocusChangeListener(null);
            this.t = null;
            this.O.setOnFocusChangeListener(null);
            this.O = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.N.setOnFocusChangeListener(null);
            this.N = null;
            this.A.setOnClickListener(null);
            this.A.setOnFocusChangeListener(null);
            this.A = null;
            this.G.setOnClickListener(null);
            this.G.setOnFocusChangeListener(null);
            this.G = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.W.setOnFocusChangeListener(null);
            this.W = null;
            this.U.setOnFocusChangeListener(null);
            this.U = null;
            this.Q.setOnClickListener(null);
            this.Q.setOnFocusChangeListener(null);
            this.Q = null;
            this.C.setOnClickListener(null);
            this.C.setOnFocusChangeListener(null);
            this.C = null;
            this.f54o.setOnClickListener(null);
            this.f54o.setOnFocusChangeListener(null);
            this.f54o = null;
            this.r.setOnClickListener(null);
            this.r.setOnFocusChangeListener(null);
            this.r = null;
            this.x.setOnClickListener(null);
            this.x.setOnFocusChangeListener(null);
            this.x = null;
            this.E.setOnClickListener(null);
            this.E.setOnFocusChangeListener(null);
            this.E = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.T.setOnFocusChangeListener(null);
            this.T = null;
            this.X.setOnFocusChangeListener(null);
            this.X = null;
            this.R.setOnClickListener(null);
            this.R.setOnFocusChangeListener(null);
            this.R = null;
            this.v.setOnClickListener(null);
            this.v.setOnFocusChangeListener(null);
            this.v = null;
            this.k.setOnClickListener(null);
            this.k.setOnFocusChangeListener(null);
            this.k = null;
            this.s.setOnClickListener(null);
            this.s.setOnFocusChangeListener(null);
            this.s = null;
            this.q.setOnClickListener(null);
            this.q.setOnFocusChangeListener(null);
            this.q = null;
            this.K.setOnFocusChangeListener(null);
            this.K = null;
            this.Y.setOnClickListener(null);
            this.Y = null;
            this.ab.setOnClickListener(null);
            this.ab = null;
            this.P.setOnClickListener(null);
            this.P = null;
            this.n.setOnFocusChangeListener(null);
            this.n = null;
            this.I.setOnFocusChangeListener(null);
            this.I = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.y.setOnClickListener(null);
            this.y.setOnFocusChangeListener(null);
            this.y = null;
            this.w.setOnClickListener(null);
            this.w.setOnFocusChangeListener(null);
            this.w = null;
            this.V.setOnClickListener(null);
            this.V.setOnFocusChangeListener(null);
            this.V = null;
            this.S.setOnFocusChangeListener(null);
            this.S = null;
            this.l.setOnClickListener(null);
            this.l.setOnFocusChangeListener(null);
            this.l = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.B.setOnFocusChangeListener(null);
            this.B = null;
            this.ar.setOnClickListener(null);
            this.ar = null;
            this.an.setOnClickListener(null);
            this.an = null;
            this.ao.setOnClickListener(null);
            this.ao = null;
            this.aq.setOnClickListener(null);
            this.aq = null;
            this.ap.setOnClickListener(null);
            this.ap = null;
            this.ai.setOnClickListener(null);
            this.ai = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.ah.setOnClickListener(null);
            this.ah = null;
            this.Z.setOnClickListener(null);
            this.Z = null;
            this.ae.setOnClickListener(null);
            this.ae = null;
            this.af.setOnClickListener(null);
            this.af = null;
            this.ag.setOnClickListener(null);
            this.ag = null;
            this.ad.setOnClickListener(null);
            this.ad = null;
            this.am.setOnClickListener(null);
            this.am = null;
            this.ak.setOnClickListener(null);
            this.ak = null;
            this.aj.setOnClickListener(null);
            this.aj = null;
            this.al.setOnClickListener(null);
            this.al = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
