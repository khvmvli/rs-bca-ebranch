package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.Page6CSFragment;
import o.getAnnualFeeAddOnAmount;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC10PasporFormKartuKreditFragment_ViewBinding.class */
public class CC10PasporFormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private CC10PasporFormKartuKreditFragment b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;

    public CC10PasporFormKartuKreditFragment_ViewBinding(final CC10PasporFormKartuKreditFragment cC10PasporFormKartuKreditFragment, View view) {
        this.b = cC10PasporFormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296982, "field 'etFotoID' and method 'fotoID'");
        cC10PasporFormKartuKreditFragment.etFotoID = (EditText) Utils.castView(findRequiredView, 2131296982, "field 'etFotoID'", EditText.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC10PasporFormKartuKreditFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC10PasporFormKartuKreditFragment.fotoID(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297363, "field 'ivFotoID' and method 'fotoID'");
        cC10PasporFormKartuKreditFragment.ivFotoID = (Page6CSFragment) Utils.castView(findRequiredView2, 2131297363, "field 'ivFotoID'", Page6CSFragment.class);
        this.f = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC10PasporFormKartuKreditFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC10PasporFormKartuKreditFragment.fotoID(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297103, "field 'etNoIdentitas' and method 'onChange'");
        cC10PasporFormKartuKreditFragment.etNoIdentitas = (EditText) Utils.castView(findRequiredView3, 2131297103, "field 'etNoIdentitas'", EditText.class);
        this.h = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC10PasporFormKartuKreditFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC10PasporFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297060, "field 'etNamaIdentitas' and method 'onChange'");
        cC10PasporFormKartuKreditFragment.etNamaIdentitas = (EditText) Utils.castView(findRequiredView4, 2131297060, "field 'etNamaIdentitas'", EditText.class);
        this.a = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC10PasporFormKartuKreditFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC10PasporFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297062, "field 'etNamaLengkap' and method 'onChange'");
        cC10PasporFormKartuKreditFragment.etNamaLengkap = (EditText) Utils.castView(findRequiredView5, 2131297062, "field 'etNamaLengkap'", EditText.class);
        this.i = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC10PasporFormKartuKreditFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC10PasporFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297094, "field 'etNoHP' and method 'onChange'");
        cC10PasporFormKartuKreditFragment.etNoHP = (EditText) Utils.castView(findRequiredView6, 2131297094, "field 'etNoHP'", EditText.class);
        this.g = findRequiredView6;
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC10PasporFormKartuKreditFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC10PasporFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'onChange'");
        cC10PasporFormKartuKreditFragment.etEmail = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView7, 2131296976, "field 'etEmail'", getAnnualFeeAddOnAmount.class);
        this.d = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC10PasporFormKartuKreditFragment_ViewBinding.9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC10PasporFormKartuKreditFragment.onChange(view2, z);
            }
        });
        cC10PasporFormKartuKreditFragment.tilFotoPaspor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298531, "field 'tilFotoPaspor'", LogoutDialog_ViewBinding.class);
        cC10PasporFormKartuKreditFragment.tilNoPaspor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilNoPaspor'", LogoutDialog_ViewBinding.class);
        cC10PasporFormKartuKreditFragment.tilNamaLengkap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilNamaLengkap'", LogoutDialog_ViewBinding.class);
        cC10PasporFormKartuKreditFragment.tilNamaPaspor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298607, "field 'tilNamaPaspor'", LogoutDialog_ViewBinding.class);
        cC10PasporFormKartuKreditFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        cC10PasporFormKartuKreditFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        cC10PasporFormKartuKreditFragment.tvErrorFotoId = (TextView) Utils.findRequiredViewAsType(view, 2131299009, "field 'tvErrorFotoId'", TextView.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.e = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC10PasporFormKartuKreditFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC10PasporFormKartuKreditFragment.lanjut(view2);
            }
        });
        cC10PasporFormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297103, "field 'etFields'"), Utils.findRequiredView(view, 2131297060, "field 'etFields'"), Utils.findRequiredView(view, 2131297062, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"), Utils.findRequiredView(view, 2131296976, "field 'etFields'"));
        cC10PasporFormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299122, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299084, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299086, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class));
        cC10PasporFormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298607, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        cC10PasporFormKartuKreditFragment.invalidHandphoneMessage = resources.getString(2131820903);
        cC10PasporFormKartuKreditFragment.invalidFotoPaspor = resources.getString(2131820965);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC10PasporFormKartuKreditFragment cC10PasporFormKartuKreditFragment = this.b;
        if (cC10PasporFormKartuKreditFragment != null) {
            this.b = null;
            cC10PasporFormKartuKreditFragment.etFotoID = null;
            cC10PasporFormKartuKreditFragment.ivFotoID = null;
            cC10PasporFormKartuKreditFragment.etNoIdentitas = null;
            cC10PasporFormKartuKreditFragment.etNamaIdentitas = null;
            cC10PasporFormKartuKreditFragment.etNamaLengkap = null;
            cC10PasporFormKartuKreditFragment.etNoHP = null;
            cC10PasporFormKartuKreditFragment.etEmail = null;
            cC10PasporFormKartuKreditFragment.tilFotoPaspor = null;
            cC10PasporFormKartuKreditFragment.tilNoPaspor = null;
            cC10PasporFormKartuKreditFragment.tilNamaLengkap = null;
            cC10PasporFormKartuKreditFragment.tilNamaPaspor = null;
            cC10PasporFormKartuKreditFragment.tilNoHp = null;
            cC10PasporFormKartuKreditFragment.tilEmail = null;
            cC10PasporFormKartuKreditFragment.tvErrorFotoId = null;
            cC10PasporFormKartuKreditFragment.etFields = null;
            cC10PasporFormKartuKreditFragment.tvErrors = null;
            cC10PasporFormKartuKreditFragment.tilForms = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
