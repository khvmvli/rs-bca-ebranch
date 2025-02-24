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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6GLFragment_ViewBinding.class */
public class Page6GLFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private Page6GLFragment e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View n;

    /* renamed from: o  reason: collision with root package name */
    private View f51o;

    public Page6GLFragment_ViewBinding(final Page6GLFragment page6GLFragment, View view) {
        this.e = page6GLFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297080, "field 'etNegaraLahir' and method 'onButtonClicked'");
        page6GLFragment.etNegaraLahir = (EditText) Utils.castView(findRequiredView, 2131297080, "field 'etNegaraLahir'", EditText.class);
        this.i = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6GLFragment.onButtonClicked(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297033, "field 'etKotaLahir' and method 'inputChange'");
        page6GLFragment.etKotaLahir = (EditText) Utils.castView(findRequiredView2, 2131297033, "field 'etKotaLahir'", EditText.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6GLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297207, "field 'etTanggalLahir' and method 'onButtonClicked'");
        page6GLFragment.etTanggalLahir = (EditText) Utils.castView(findRequiredView3, 2131297207, "field 'etTanggalLahir'", EditText.class);
        this.f51o = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6GLFragment.onButtonClicked(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297141, "field 'etPendidikanTerakhir' and method 'onButtonClicked'");
        page6GLFragment.etPendidikanTerakhir = (EditText) Utils.castView(findRequiredView4, 2131297141, "field 'etPendidikanTerakhir'", EditText.class);
        this.j = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6GLFragment.onButtonClicked(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297197, "field 'etStatusPerkawinan' and method 'onButtonClicked'");
        page6GLFragment.etStatusPerkawinan = (EditText) Utils.castView(findRequiredView5, 2131297197, "field 'etStatusPerkawinan'", EditText.class);
        this.n = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6GLFragment.onButtonClicked(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296925, "field 'etAgama' and method 'onButtonClicked'");
        page6GLFragment.etAgama = (EditText) Utils.castView(findRequiredView6, 2131296925, "field 'etAgama'", EditText.class);
        this.a = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6GLFragment.onButtonClicked(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296926, "field 'etAgamaLainnya' and method 'inputChange'");
        page6GLFragment.etAgamaLainnya = (EditText) Utils.castView(findRequiredView7, 2131296926, "field 'etAgamaLainnya'", EditText.class);
        this.c = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6GLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297058, "field 'etNamaIbu' and method 'inputChange'");
        page6GLFragment.etNamaIbu = (EditText) Utils.castView(findRequiredView8, 2131297058, "field 'etNamaIbu'", EditText.class);
        this.f = findRequiredView8;
        findRequiredView8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6GLFragment.inputChange(view2, z);
            }
        });
        page6GLFragment.llWNA = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297934, "field 'llWNA'", LinearLayout.class);
        page6GLFragment.llKitas = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297865, "field 'llKitas'", LinearLayout.class);
        page6GLFragment.rgKITAS = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298228, "field 'rgKITAS'", RadioGroup.class);
        page6GLFragment.rbKitasYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298171, "field 'rbKitasYa'", RadioButton.class);
        page6GLFragment.rbKitasTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298170, "field 'rbKitasTidak'", RadioButton.class);
        View findRequiredView9 = Utils.findRequiredView(view, 2131297105, "field 'etNoKitas' and method 'inputChange'");
        page6GLFragment.etNoKitas = (EditText) Utils.castView(findRequiredView9, 2131297105, "field 'etNoKitas'", EditText.class);
        this.h = findRequiredView9;
        findRequiredView9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment_ViewBinding.13
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6GLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297044, "field 'etMasaBerlakuKitas' and method 'onButtonClicked'");
        page6GLFragment.etMasaBerlakuKitas = (EditText) Utils.castView(findRequiredView10, 2131297044, "field 'etMasaBerlakuKitas'", EditText.class);
        this.g = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6GLFragment.onButtonClicked(view2);
            }
        });
        page6GLFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6GLFragment.tilPendidikanTerakhir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298686, "field 'tilPendidikanTerakhir'", LogoutDialog_ViewBinding.class);
        page6GLFragment.tilNamaIbu = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298605, "field 'tilNamaIbu'", LogoutDialog_ViewBinding.class);
        page6GLFragment.tilStatusPerkawinan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298729, "field 'tilStatusPerkawinan'", LogoutDialog_ViewBinding.class);
        page6GLFragment.tilAgama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298474, "field 'tilAgama'", LogoutDialog_ViewBinding.class);
        page6GLFragment.tilAgamaLainnya = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298475, "field 'tilAgamaLainnya'", LogoutDialog_ViewBinding.class);
        page6GLFragment.tilNegaraLahir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298626, "field 'tilNegaraLahir'", LogoutDialog_ViewBinding.class);
        page6GLFragment.tilKotaLahir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKotaLahir'", LogoutDialog_ViewBinding.class);
        page6GLFragment.tilTanggalLahir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilTanggalLahir'", LogoutDialog_ViewBinding.class);
        page6GLFragment.tilNoKitas = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298651, "field 'tilNoKitas'", LogoutDialog_ViewBinding.class);
        page6GLFragment.tilMasaBerlaku = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298591, "field 'tilMasaBerlaku'", LogoutDialog_ViewBinding.class);
        View findRequiredView11 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.b = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6GLFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6GLFragment.next(view2);
            }
        });
        page6GLFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297141, "field 'etFields'"), Utils.findRequiredView(view, 2131297058, "field 'etFields'"), Utils.findRequiredView(view, 2131297197, "field 'etFields'"), Utils.findRequiredView(view, 2131296925, "field 'etFields'"), Utils.findRequiredView(view, 2131296926, "field 'etFields'"), Utils.findRequiredView(view, 2131297080, "field 'etFields'"), Utils.findRequiredView(view, 2131297033, "field 'etFields'"), Utils.findRequiredView(view, 2131297207, "field 'etFields'"), Utils.findRequiredView(view, 2131297105, "field 'etFields'"), Utils.findRequiredView(view, 2131297044, "field 'etFields'"));
        page6GLFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299154, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299082, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299197, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298954, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298955, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299102, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299207, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299124, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299067, "field 'tvErrors'", TextView.class));
        page6GLFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298686, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298605, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298729, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298474, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298475, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298626, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298651, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298591, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        page6GLFragment.txtLainnya = view.getContext().getResources().getString(2131822363);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6GLFragment page6GLFragment = this.e;
        if (page6GLFragment != null) {
            this.e = null;
            page6GLFragment.etNegaraLahir = null;
            page6GLFragment.etKotaLahir = null;
            page6GLFragment.etTanggalLahir = null;
            page6GLFragment.etPendidikanTerakhir = null;
            page6GLFragment.etStatusPerkawinan = null;
            page6GLFragment.etAgama = null;
            page6GLFragment.etAgamaLainnya = null;
            page6GLFragment.etNamaIbu = null;
            page6GLFragment.llWNA = null;
            page6GLFragment.llKitas = null;
            page6GLFragment.rgKITAS = null;
            page6GLFragment.rbKitasYa = null;
            page6GLFragment.rbKitasTidak = null;
            page6GLFragment.etNoKitas = null;
            page6GLFragment.etMasaBerlakuKitas = null;
            page6GLFragment.llMain = null;
            page6GLFragment.tilPendidikanTerakhir = null;
            page6GLFragment.tilNamaIbu = null;
            page6GLFragment.tilStatusPerkawinan = null;
            page6GLFragment.tilAgama = null;
            page6GLFragment.tilAgamaLainnya = null;
            page6GLFragment.tilNegaraLahir = null;
            page6GLFragment.tilKotaLahir = null;
            page6GLFragment.tilTanggalLahir = null;
            page6GLFragment.tilNoKitas = null;
            page6GLFragment.tilMasaBerlaku = null;
            page6GLFragment.etFields = null;
            page6GLFragment.tvErrors = null;
            page6GLFragment.tilForms = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.f51o.setOnClickListener(null);
            this.f51o = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
