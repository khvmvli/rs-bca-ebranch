package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.getCardCode;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC11FormKartuKreditFragment_ViewBinding.class */
public class CC11FormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private CC11FormKartuKreditFragment e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;

    public CC11FormKartuKreditFragment_ViewBinding(final CC11FormKartuKreditFragment cC11FormKartuKreditFragment, View view) {
        this.e = cC11FormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297208, "field 'etTempatLahir' and method 'inputChange'");
        cC11FormKartuKreditFragment.etTempatLahir = (getCardCode) Utils.castView(findRequiredView, 2131297208, "field 'etTempatLahir'", getCardCode.class);
        this.g = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC11FormKartuKreditFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297207, "field 'etTanggalLahir' and method 'clickTanggalLahir'");
        cC11FormKartuKreditFragment.etTanggalLahir = (EditText) Utils.castView(findRequiredView2, 2131297207, "field 'etTanggalLahir'", EditText.class);
        this.f = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC11FormKartuKreditFragment.clickTanggalLahir(view2);
            }
        });
        cC11FormKartuKreditFragment.rgJenisKelamin = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298217, "field 'rgJenisKelamin'", RadioGroup.class);
        cC11FormKartuKreditFragment.rbLakiLaki = (RadioButton) Utils.findRequiredViewAsType(view, 2131298148, "field 'rbLakiLaki'", RadioButton.class);
        cC11FormKartuKreditFragment.rbPerempuan = (RadioButton) Utils.findRequiredViewAsType(view, 2131298149, "field 'rbPerempuan'", RadioButton.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131297197, "field 'etStatusPerkawinan' and method 'onClickedStatusPerkawinan'");
        cC11FormKartuKreditFragment.etStatusPerkawinan = (EditText) Utils.castView(findRequiredView3, 2131297197, "field 'etStatusPerkawinan'", EditText.class);
        this.i = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC11FormKartuKreditFragment.onClickedStatusPerkawinan();
            }
        });
        cC11FormKartuKreditFragment.llWNA = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297934, "field 'llWNA'", LinearLayout.class);
        cC11FormKartuKreditFragment.rgKewarganegaraan = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298219, "field 'rgKewarganegaraan'", RadioGroup.class);
        cC11FormKartuKreditFragment.rbWargaWNI = (RadioButton) Utils.findRequiredViewAsType(view, 2131298154, "field 'rbWargaWNI'", RadioButton.class);
        cC11FormKartuKreditFragment.rbWargaWNA = (RadioButton) Utils.findRequiredViewAsType(view, 2131298153, "field 'rbWargaWNA'", RadioButton.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131297105, "field 'etNoKitas' and method 'inputChange'");
        cC11FormKartuKreditFragment.etNoKitas = (EditText) Utils.castView(findRequiredView4, 2131297105, "field 'etNoKitas'", EditText.class);
        this.j = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC11FormKartuKreditFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297044, "field 'etMasaBerlakuKitas' and method 'clickTanggalLahir'");
        cC11FormKartuKreditFragment.etMasaBerlakuKitas = (EditText) Utils.castView(findRequiredView5, 2131297044, "field 'etMasaBerlakuKitas'", EditText.class);
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC11FormKartuKreditFragment.clickTanggalLahir(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297141, "field 'etPendidikanTerakhir' and method 'onClickedPendidikanTerakhir'");
        cC11FormKartuKreditFragment.etPendidikanTerakhir = (EditText) Utils.castView(findRequiredView6, 2131297141, "field 'etPendidikanTerakhir'", EditText.class);
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC11FormKartuKreditFragment.onClickedPendidikanTerakhir();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297058, "field 'etNamaIbu' and method 'inputChange'");
        cC11FormKartuKreditFragment.etNamaIbu = (EditText) Utils.castView(findRequiredView7, 2131297058, "field 'etNamaIbu'", EditText.class);
        this.b = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment_ViewBinding.8
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC11FormKartuKreditFragment.inputChange(view2, z);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297080, "field 'etNegara' and method 'clickNegara'");
        cC11FormKartuKreditFragment.etNegara = (EditText) Utils.castView(findRequiredView8, 2131297080, "field 'etNegara'", EditText.class);
        this.a = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC11FormKartuKreditFragment.clickNegara(view2);
            }
        });
        cC11FormKartuKreditFragment.rgKITAS = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298228, "field 'rgKITAS'", RadioGroup.class);
        cC11FormKartuKreditFragment.rbKitasYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298171, "field 'rbKitasYa'", RadioButton.class);
        cC11FormKartuKreditFragment.rbKitasTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298170, "field 'rbKitasTidak'", RadioButton.class);
        cC11FormKartuKreditFragment.llKitas = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297865, "field 'llKitas'", LinearLayout.class);
        cC11FormKartuKreditFragment.tilTempatLahir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298740, "field 'tilTempatLahir'", LogoutDialog_ViewBinding.class);
        cC11FormKartuKreditFragment.tilTanggalLahir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilTanggalLahir'", LogoutDialog_ViewBinding.class);
        cC11FormKartuKreditFragment.tilPendidikanTerakhir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298686, "field 'tilPendidikanTerakhir'", LogoutDialog_ViewBinding.class);
        cC11FormKartuKreditFragment.tilNamaIbu = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298605, "field 'tilNamaIbu'", LogoutDialog_ViewBinding.class);
        cC11FormKartuKreditFragment.tilStatusPerkawinan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298729, "field 'tilStatusPerkawinan'", LogoutDialog_ViewBinding.class);
        cC11FormKartuKreditFragment.tilNegara = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298626, "field 'tilNegara'", LogoutDialog_ViewBinding.class);
        cC11FormKartuKreditFragment.tilNoKitas = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298651, "field 'tilNoKitas'", LogoutDialog_ViewBinding.class);
        cC11FormKartuKreditFragment.tilMasaBerlaku = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298591, "field 'tilMasaBerlaku'", LogoutDialog_ViewBinding.class);
        View findRequiredView9 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.d = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC11FormKartuKreditFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC11FormKartuKreditFragment.lanjut(view2);
            }
        });
        cC11FormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297208, "field 'etFields'"), Utils.findRequiredView(view, 2131297207, "field 'etFields'"), Utils.findRequiredView(view, 2131297197, "field 'etFields'"), Utils.findRequiredView(view, 2131297105, "field 'etFields'"), Utils.findRequiredView(view, 2131297044, "field 'etFields'"), Utils.findRequiredView(view, 2131297141, "field 'etFields'"), Utils.findRequiredView(view, 2131297058, "field 'etFields'"), Utils.findRequiredView(view, 2131297080, "field 'etFields'"));
        cC11FormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299208, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299207, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299197, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299124, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299067, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299154, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299082, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299102, "field 'tvErrors'", TextView.class));
        cC11FormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298740, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298729, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298651, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298591, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298686, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298605, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298626, "field 'tilForms'", LogoutDialog_ViewBinding.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC11FormKartuKreditFragment cC11FormKartuKreditFragment = this.e;
        if (cC11FormKartuKreditFragment != null) {
            this.e = null;
            cC11FormKartuKreditFragment.etTempatLahir = null;
            cC11FormKartuKreditFragment.etTanggalLahir = null;
            cC11FormKartuKreditFragment.rgJenisKelamin = null;
            cC11FormKartuKreditFragment.rbLakiLaki = null;
            cC11FormKartuKreditFragment.rbPerempuan = null;
            cC11FormKartuKreditFragment.etStatusPerkawinan = null;
            cC11FormKartuKreditFragment.llWNA = null;
            cC11FormKartuKreditFragment.rgKewarganegaraan = null;
            cC11FormKartuKreditFragment.rbWargaWNI = null;
            cC11FormKartuKreditFragment.rbWargaWNA = null;
            cC11FormKartuKreditFragment.etNoKitas = null;
            cC11FormKartuKreditFragment.etMasaBerlakuKitas = null;
            cC11FormKartuKreditFragment.etPendidikanTerakhir = null;
            cC11FormKartuKreditFragment.etNamaIbu = null;
            cC11FormKartuKreditFragment.etNegara = null;
            cC11FormKartuKreditFragment.rgKITAS = null;
            cC11FormKartuKreditFragment.rbKitasYa = null;
            cC11FormKartuKreditFragment.rbKitasTidak = null;
            cC11FormKartuKreditFragment.llKitas = null;
            cC11FormKartuKreditFragment.tilTempatLahir = null;
            cC11FormKartuKreditFragment.tilTanggalLahir = null;
            cC11FormKartuKreditFragment.tilPendidikanTerakhir = null;
            cC11FormKartuKreditFragment.tilNamaIbu = null;
            cC11FormKartuKreditFragment.tilStatusPerkawinan = null;
            cC11FormKartuKreditFragment.tilNegara = null;
            cC11FormKartuKreditFragment.tilNoKitas = null;
            cC11FormKartuKreditFragment.tilMasaBerlaku = null;
            cC11FormKartuKreditFragment.etFields = null;
            cC11FormKartuKreditFragment.tvErrors = null;
            cC11FormKartuKreditFragment.tilForms = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
