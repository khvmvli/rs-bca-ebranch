package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TPilihCabangUbahFragment_ViewBinding.class */
public class TPilihCabangUbahFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private TPilihCabangUbahFragment e;
    private View g;

    public TPilihCabangUbahFragment_ViewBinding(final TPilihCabangUbahFragment tPilihCabangUbahFragment, View view) {
        this.e = tPilihCabangUbahFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296340, "field 'atvKota' and method 'onChange'");
        tPilihCabangUbahFragment.atvKota = (AutoCompleteTextView) Utils.castView(findRequiredView, 2131296340, "field 'atvKota'", AutoCompleteTextView.class);
        this.b = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.TPilihCabangUbahFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                tPilihCabangUbahFragment.onChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296339, "field 'atvArea' and method 'onChange'");
        tPilihCabangUbahFragment.atvArea = (AutoCompleteTextView) Utils.castView(findRequiredView2, 2131296339, "field 'atvArea'", AutoCompleteTextView.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.TPilihCabangUbahFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                tPilihCabangUbahFragment.onChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297008, "field 'etKantorCabang' and method 'showKantorCabang'");
        tPilihCabangUbahFragment.etKantorCabang = (EditText) Utils.castView(findRequiredView3, 2131297008, "field 'etKantorCabang'", EditText.class);
        this.g = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TPilihCabangUbahFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tPilihCabangUbahFragment.showKantorCabang(view2);
            }
        });
        tPilihCabangUbahFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        tPilihCabangUbahFragment.tilArea = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298495, "field 'tilArea'", LogoutDialog_ViewBinding.class);
        tPilihCabangUbahFragment.tilCabang = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298518, "field 'tilCabang'", LogoutDialog_ViewBinding.class);
        tPilihCabangUbahFragment.lnActivityMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'lnActivityMain'", ScrollView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.d = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TPilihCabangUbahFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tPilihCabangUbahFragment.lanjut(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296382, "method 'cabangTerdekat'");
        this.a = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TPilihCabangUbahFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tPilihCabangUbahFragment.cabangTerdekat(view2);
            }
        });
        tPilihCabangUbahFragment.fieldList = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296340, "field 'fieldList'"), Utils.findRequiredView(view, 2131296339, "field 'fieldList'"), Utils.findRequiredView(view, 2131297008, "field 'fieldList'"));
        tPilihCabangUbahFragment.inputLayoutList = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'inputLayoutList'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298495, "field 'inputLayoutList'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298518, "field 'inputLayoutList'", LogoutDialog_ViewBinding.class));
        tPilihCabangUbahFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298974, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299031, "field 'tvErrors'", TextView.class));
        tPilihCabangUbahFragment.retry = view.getContext().getResources().getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TPilihCabangUbahFragment tPilihCabangUbahFragment = this.e;
        if (tPilihCabangUbahFragment != null) {
            this.e = null;
            tPilihCabangUbahFragment.atvKota = null;
            tPilihCabangUbahFragment.atvArea = null;
            tPilihCabangUbahFragment.etKantorCabang = null;
            tPilihCabangUbahFragment.tilKota = null;
            tPilihCabangUbahFragment.tilArea = null;
            tPilihCabangUbahFragment.tilCabang = null;
            tPilihCabangUbahFragment.lnActivityMain = null;
            tPilihCabangUbahFragment.fieldList = null;
            tPilihCabangUbahFragment.inputLayoutList = null;
            tPilihCabangUbahFragment.tvErrors = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
