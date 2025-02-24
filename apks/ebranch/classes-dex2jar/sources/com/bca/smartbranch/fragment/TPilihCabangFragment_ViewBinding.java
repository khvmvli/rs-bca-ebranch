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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TPilihCabangFragment_ViewBinding.class */
public class TPilihCabangFragment_ViewBinding implements Unbinder {
    private TPilihCabangFragment a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View h;

    public TPilihCabangFragment_ViewBinding(final TPilihCabangFragment tPilihCabangFragment, View view) {
        this.a = tPilihCabangFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296340, "field 'atvKota' and method 'onChange'");
        tPilihCabangFragment.atvKota = (AutoCompleteTextView) Utils.castView(findRequiredView, 2131296340, "field 'atvKota'", AutoCompleteTextView.class);
        this.c = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.TPilihCabangFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                tPilihCabangFragment.onChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296339, "field 'atvArea' and method 'onChange'");
        tPilihCabangFragment.atvArea = (AutoCompleteTextView) Utils.castView(findRequiredView2, 2131296339, "field 'atvArea'", AutoCompleteTextView.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.TPilihCabangFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                tPilihCabangFragment.onChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297008, "field 'etKantorCabang' and method 'showKantorCabang'");
        tPilihCabangFragment.etKantorCabang = (EditText) Utils.castView(findRequiredView3, 2131297008, "field 'etKantorCabang'", EditText.class);
        this.h = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TPilihCabangFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tPilihCabangFragment.showKantorCabang(view2);
            }
        });
        tPilihCabangFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        tPilihCabangFragment.tilArea = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298495, "field 'tilArea'", LogoutDialog_ViewBinding.class);
        tPilihCabangFragment.tilCabang = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298518, "field 'tilCabang'", LogoutDialog_ViewBinding.class);
        tPilihCabangFragment.lnActivityMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'lnActivityMain'", ScrollView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TPilihCabangFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tPilihCabangFragment.lanjut(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296382, "method 'cabangTerdekat'");
        this.e = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TPilihCabangFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tPilihCabangFragment.cabangTerdekat(view2);
            }
        });
        tPilihCabangFragment.fieldList = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296340, "field 'fieldList'"), Utils.findRequiredView(view, 2131296339, "field 'fieldList'"), Utils.findRequiredView(view, 2131297008, "field 'fieldList'"));
        tPilihCabangFragment.inputLayoutList = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'inputLayoutList'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298495, "field 'inputLayoutList'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298518, "field 'inputLayoutList'", LogoutDialog_ViewBinding.class));
        tPilihCabangFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298974, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299031, "field 'tvErrors'", TextView.class));
        tPilihCabangFragment.retry = view.getContext().getResources().getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TPilihCabangFragment tPilihCabangFragment = this.a;
        if (tPilihCabangFragment != null) {
            this.a = null;
            tPilihCabangFragment.atvKota = null;
            tPilihCabangFragment.atvArea = null;
            tPilihCabangFragment.etKantorCabang = null;
            tPilihCabangFragment.tilKota = null;
            tPilihCabangFragment.tilArea = null;
            tPilihCabangFragment.tilCabang = null;
            tPilihCabangFragment.lnActivityMain = null;
            tPilihCabangFragment.fieldList = null;
            tPilihCabangFragment.inputLayoutList = null;
            tPilihCabangFragment.tvErrors = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
