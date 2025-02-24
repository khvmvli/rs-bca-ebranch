package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR1DataPengirimFragment_ViewBinding.class */
public class OR1DataPengirimFragment_ViewBinding implements Unbinder {
    private OR1DataPengirimFragment a;
    private View b;
    private View c;
    private View d;
    private View e;

    public OR1DataPengirimFragment_ViewBinding(final OR1DataPengirimFragment oR1DataPengirimFragment, View view) {
        this.a = oR1DataPengirimFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297107, "field 'etNumberRek', method 'pilihNorek', and method 'inputChange'");
        oR1DataPengirimFragment.etNumberRek = (EditText) Utils.castView(findRequiredView, 2131297107, "field 'etNumberRek'", EditText.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR1DataPengirimFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR1DataPengirimFragment.pilihNorek(view2);
            }
        });
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR1DataPengirimFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR1DataPengirimFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297054, "field 'etNama' and method 'inputChange'");
        oR1DataPengirimFragment.etNama = (EditText) Utils.castView(findRequiredView2, 2131297054, "field 'etNama'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR1DataPengirimFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR1DataPengirimFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'inputChange'");
        oR1DataPengirimFragment.etNoHp = (EditText) Utils.castView(findRequiredView3, 2131297094, "field 'etNoHp'", EditText.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR1DataPengirimFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR1DataPengirimFragment.inputChange(view2, z);
            }
        });
        oR1DataPengirimFragment.tilNoRek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNoRek'", LogoutDialog_ViewBinding.class);
        oR1DataPengirimFragment.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        oR1DataPengirimFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        oR1DataPengirimFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR1DataPengirimFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR1DataPengirimFragment.lanjut(view2);
            }
        });
        oR1DataPengirimFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299078, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class));
        oR1DataPengirimFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        oR1DataPengirimFragment.etForms = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297107, "field 'etForms'"), Utils.findRequiredView(view, 2131297054, "field 'etForms'"), Utils.findRequiredView(view, 2131297094, "field 'etForms'"));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OR1DataPengirimFragment oR1DataPengirimFragment = this.a;
        if (oR1DataPengirimFragment != null) {
            this.a = null;
            oR1DataPengirimFragment.etNumberRek = null;
            oR1DataPengirimFragment.etNama = null;
            oR1DataPengirimFragment.etNoHp = null;
            oR1DataPengirimFragment.tilNoRek = null;
            oR1DataPengirimFragment.tilNama = null;
            oR1DataPengirimFragment.tilNoHp = null;
            oR1DataPengirimFragment.svMain = null;
            oR1DataPengirimFragment.tvErrors = null;
            oR1DataPengirimFragment.tilForms = null;
            oR1DataPengirimFragment.etForms = null;
            this.d.setOnClickListener(null);
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
