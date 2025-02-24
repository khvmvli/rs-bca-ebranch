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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC10KTPFormKartuKreditFragment_ViewBinding.class */
public class CC10KTPFormKartuKreditFragment_ViewBinding implements Unbinder {
    private CC10KTPFormKartuKreditFragment a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;

    public CC10KTPFormKartuKreditFragment_ViewBinding(final CC10KTPFormKartuKreditFragment cC10KTPFormKartuKreditFragment, View view) {
        this.a = cC10KTPFormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296982, "field 'etFotoID' and method 'fotoID'");
        cC10KTPFormKartuKreditFragment.etFotoID = (EditText) Utils.castView(findRequiredView, 2131296982, "field 'etFotoID'", EditText.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC10KTPFormKartuKreditFragment.fotoID(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297363, "field 'ivFotoID' and method 'fotoID'");
        cC10KTPFormKartuKreditFragment.ivFotoID = (Page6CSFragment) Utils.castView(findRequiredView2, 2131297363, "field 'ivFotoID'", Page6CSFragment.class);
        this.g = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC10KTPFormKartuKreditFragment.fotoID(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297103, "field 'etNoIdentitas' and method 'onChange'");
        cC10KTPFormKartuKreditFragment.etNoIdentitas = (EditText) Utils.castView(findRequiredView3, 2131297103, "field 'etNoIdentitas'", EditText.class);
        this.i = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC10KTPFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297060, "field 'etNamaIdentitas' and method 'onChange'");
        cC10KTPFormKartuKreditFragment.etNamaIdentitas = (EditText) Utils.castView(findRequiredView4, 2131297060, "field 'etNamaIdentitas'", EditText.class);
        this.b = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC10KTPFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297062, "field 'etNamaLengkap' and method 'onChange'");
        cC10KTPFormKartuKreditFragment.etNamaLengkap = (EditText) Utils.castView(findRequiredView5, 2131297062, "field 'etNamaLengkap'", EditText.class);
        this.h = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC10KTPFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297094, "field 'etNoHP' and method 'onChange'");
        cC10KTPFormKartuKreditFragment.etNoHP = (EditText) Utils.castView(findRequiredView6, 2131297094, "field 'etNoHP'", EditText.class);
        this.f = findRequiredView6;
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment_ViewBinding.9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC10KTPFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'onChange'");
        cC10KTPFormKartuKreditFragment.etEmail = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView7, 2131296976, "field 'etEmail'", getAnnualFeeAddOnAmount.class);
        this.e = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC10KTPFormKartuKreditFragment.onChange(view2, z);
            }
        });
        cC10KTPFormKartuKreditFragment.tilFotoKtp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298531, "field 'tilFotoKtp'", LogoutDialog_ViewBinding.class);
        cC10KTPFormKartuKreditFragment.tilNoIdentitas = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilNoIdentitas'", LogoutDialog_ViewBinding.class);
        cC10KTPFormKartuKreditFragment.tilNamaLengkap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilNamaLengkap'", LogoutDialog_ViewBinding.class);
        cC10KTPFormKartuKreditFragment.tilNamaIdentitas = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298607, "field 'tilNamaIdentitas'", LogoutDialog_ViewBinding.class);
        cC10KTPFormKartuKreditFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        cC10KTPFormKartuKreditFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        cC10KTPFormKartuKreditFragment.tvErrorFotoId = (TextView) Utils.findRequiredViewAsType(view, 2131299009, "field 'tvErrorFotoId'", TextView.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.d = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC10KTPFormKartuKreditFragment.lanjut(view2);
            }
        });
        cC10KTPFormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297103, "field 'etFields'"), Utils.findRequiredView(view, 2131297060, "field 'etFields'"), Utils.findRequiredView(view, 2131297062, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"), Utils.findRequiredView(view, 2131296976, "field 'etFields'"));
        cC10KTPFormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299122, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299084, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299086, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class));
        cC10KTPFormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298607, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        cC10KTPFormKartuKreditFragment.invalidHandphoneMessage = resources.getString(2131820903);
        cC10KTPFormKartuKreditFragment.invalidFotoKtp = resources.getString(2131820963);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC10KTPFormKartuKreditFragment cC10KTPFormKartuKreditFragment = this.a;
        if (cC10KTPFormKartuKreditFragment != null) {
            this.a = null;
            cC10KTPFormKartuKreditFragment.etFotoID = null;
            cC10KTPFormKartuKreditFragment.ivFotoID = null;
            cC10KTPFormKartuKreditFragment.etNoIdentitas = null;
            cC10KTPFormKartuKreditFragment.etNamaIdentitas = null;
            cC10KTPFormKartuKreditFragment.etNamaLengkap = null;
            cC10KTPFormKartuKreditFragment.etNoHP = null;
            cC10KTPFormKartuKreditFragment.etEmail = null;
            cC10KTPFormKartuKreditFragment.tilFotoKtp = null;
            cC10KTPFormKartuKreditFragment.tilNoIdentitas = null;
            cC10KTPFormKartuKreditFragment.tilNamaLengkap = null;
            cC10KTPFormKartuKreditFragment.tilNamaIdentitas = null;
            cC10KTPFormKartuKreditFragment.tilNoHp = null;
            cC10KTPFormKartuKreditFragment.tilEmail = null;
            cC10KTPFormKartuKreditFragment.tvErrorFotoId = null;
            cC10KTPFormKartuKreditFragment.etFields = null;
            cC10KTPFormKartuKreditFragment.tvErrors = null;
            cC10KTPFormKartuKreditFragment.tilForms = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
