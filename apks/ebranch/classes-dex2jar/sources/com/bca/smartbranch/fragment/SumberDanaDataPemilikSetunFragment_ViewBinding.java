package com.bca.smartbranch.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.copyWindowDataInto;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/SumberDanaDataPemilikSetunFragment_ViewBinding.class */
public class SumberDanaDataPemilikSetunFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private SumberDanaDataPemilikSetunFragment c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View i;
    private View j;

    public SumberDanaDataPemilikSetunFragment_ViewBinding(final SumberDanaDataPemilikSetunFragment sumberDanaDataPemilikSetunFragment, View view) {
        this.c = sumberDanaDataPemilikSetunFragment;
        sumberDanaDataPemilikSetunFragment.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297065, "field 'etNamaPemilik' and method 'inputChange'");
        sumberDanaDataPemilikSetunFragment.etNamaPemilik = (AutoCompleteTextView) Utils.castView(findRequiredView, 2131297065, "field 'etNamaPemilik'", AutoCompleteTextView.class);
        this.d = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                sumberDanaDataPemilikSetunFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297133, "field 'etNorekPemilik' and method 'inputChange'");
        sumberDanaDataPemilikSetunFragment.etNorekPemilik = (AutoCompleteTextView) Utils.castView(findRequiredView2, 2131297133, "field 'etNorekPemilik'", AutoCompleteTextView.class);
        this.i = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                sumberDanaDataPemilikSetunFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296989, "field 'etIdPemilik' and method 'inputChange'");
        sumberDanaDataPemilikSetunFragment.etIdPemilik = (AutoCompleteTextView) Utils.castView(findRequiredView3, 2131296989, "field 'etIdPemilik'", AutoCompleteTextView.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                sumberDanaDataPemilikSetunFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296934, "field 'etAlamatPemilik' and method 'inputChange'");
        sumberDanaDataPemilikSetunFragment.etAlamatPemilik = (EditText) Utils.castView(findRequiredView4, 2131296934, "field 'etAlamatPemilik'", EditText.class);
        this.e = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                sumberDanaDataPemilikSetunFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297097, "field 'etNoHpPemilik' and method 'inputChange'");
        sumberDanaDataPemilikSetunFragment.etNoHpPemilik = (EditText) Utils.castView(findRequiredView5, 2131297097, "field 'etNoHpPemilik'", EditText.class);
        this.j = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                sumberDanaDataPemilikSetunFragment.inputChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297200, "field 'etSumberDanaPemilik' and method 'clickView'");
        sumberDanaDataPemilikSetunFragment.etSumberDanaPemilik = (EditText) Utils.castView(findRequiredView6, 2131297200, "field 'etSumberDanaPemilik'", EditText.class);
        this.f = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaDataPemilikSetunFragment.clickView(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297230, "field 'etTujuanTransaksiPemilik' and method 'clickView'");
        sumberDanaDataPemilikSetunFragment.etTujuanTransaksiPemilik = (EditText) Utils.castView(findRequiredView7, 2131297230, "field 'etTujuanTransaksiPemilik'", EditText.class);
        this.g = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaDataPemilikSetunFragment.clickView(view2);
            }
        });
        sumberDanaDataPemilikSetunFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        sumberDanaDataPemilikSetunFragment.llDaftarPemilikSumberDana = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297571, "field 'llDaftarPemilikSumberDana'", LinearLayout.class);
        sumberDanaDataPemilikSetunFragment.tilNamaPemilik = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298612, "field 'tilNamaPemilik'", LogoutDialog_ViewBinding.class);
        sumberDanaDataPemilikSetunFragment.tilNorekPemilik = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298678, "field 'tilNorekPemilik'", LogoutDialog_ViewBinding.class);
        sumberDanaDataPemilikSetunFragment.tilIdPemilik = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298538, "field 'tilIdPemilik'", LogoutDialog_ViewBinding.class);
        sumberDanaDataPemilikSetunFragment.tilAlamatPemilik = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298483, "field 'tilAlamatPemilik'", LogoutDialog_ViewBinding.class);
        sumberDanaDataPemilikSetunFragment.tilNoHpPemilik = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298643, "field 'tilNoHpPemilik'", LogoutDialog_ViewBinding.class);
        sumberDanaDataPemilikSetunFragment.tilSumberDanaPemilik = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298732, "field 'tilSumberDanaPemilik'", LogoutDialog_ViewBinding.class);
        sumberDanaDataPemilikSetunFragment.tilTujuanTransaksiPemilik = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298761, "field 'tilTujuanTransaksiPemilik'", LogoutDialog_ViewBinding.class);
        sumberDanaDataPemilikSetunFragment.cbxSimpanDaftarPemilik = (CheckBox) Utils.findRequiredViewAsType(view, 2131296472, "field 'cbxSimpanDaftarPemilik'", CheckBox.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131296396, "method 'clickLanjut'");
        this.b = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaDataPemilikSetunFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaDataPemilikSetunFragment.clickLanjut(view2);
            }
        });
        sumberDanaDataPemilikSetunFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297065, "field 'etFields'"), Utils.findRequiredView(view, 2131297133, "field 'etFields'"), Utils.findRequiredView(view, 2131296989, "field 'etFields'"), Utils.findRequiredView(view, 2131296934, "field 'etFields'"), Utils.findRequiredView(view, 2131297097, "field 'etFields'"), Utils.findRequiredView(view, 2131297200, "field 'etFields'"), Utils.findRequiredView(view, 2131297230, "field 'etFields'"));
        sumberDanaDataPemilikSetunFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299088, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299147, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299014, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298962, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299117, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299200, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299232, "field 'tvErrors'", TextView.class));
        sumberDanaDataPemilikSetunFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298612, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298678, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298538, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298483, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298643, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298732, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298761, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Context context = view.getContext();
        Resources resources = context.getResources();
        sumberDanaDataPemilikSetunFragment.white = copyWindowDataInto.a(context, 17170443);
        sumberDanaDataPemilikSetunFragment.invalidHandphoneMessage = resources.getString(2131820903);
        sumberDanaDataPemilikSetunFragment.titleDataPemilikSumberDana = resources.getString(2131821287);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SumberDanaDataPemilikSetunFragment sumberDanaDataPemilikSetunFragment = this.c;
        if (sumberDanaDataPemilikSetunFragment != null) {
            this.c = null;
            sumberDanaDataPemilikSetunFragment.tvTitle = null;
            sumberDanaDataPemilikSetunFragment.etNamaPemilik = null;
            sumberDanaDataPemilikSetunFragment.etNorekPemilik = null;
            sumberDanaDataPemilikSetunFragment.etIdPemilik = null;
            sumberDanaDataPemilikSetunFragment.etAlamatPemilik = null;
            sumberDanaDataPemilikSetunFragment.etNoHpPemilik = null;
            sumberDanaDataPemilikSetunFragment.etSumberDanaPemilik = null;
            sumberDanaDataPemilikSetunFragment.etTujuanTransaksiPemilik = null;
            sumberDanaDataPemilikSetunFragment.llMain = null;
            sumberDanaDataPemilikSetunFragment.llDaftarPemilikSumberDana = null;
            sumberDanaDataPemilikSetunFragment.tilNamaPemilik = null;
            sumberDanaDataPemilikSetunFragment.tilNorekPemilik = null;
            sumberDanaDataPemilikSetunFragment.tilIdPemilik = null;
            sumberDanaDataPemilikSetunFragment.tilAlamatPemilik = null;
            sumberDanaDataPemilikSetunFragment.tilNoHpPemilik = null;
            sumberDanaDataPemilikSetunFragment.tilSumberDanaPemilik = null;
            sumberDanaDataPemilikSetunFragment.tilTujuanTransaksiPemilik = null;
            sumberDanaDataPemilikSetunFragment.cbxSimpanDaftarPemilik = null;
            sumberDanaDataPemilikSetunFragment.etFields = null;
            sumberDanaDataPemilikSetunFragment.tvErrors = null;
            sumberDanaDataPemilikSetunFragment.tilForms = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
