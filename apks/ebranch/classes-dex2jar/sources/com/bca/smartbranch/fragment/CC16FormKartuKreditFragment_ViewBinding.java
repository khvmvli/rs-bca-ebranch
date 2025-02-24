package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.getCardCode;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC16FormKartuKreditFragment_ViewBinding.class */
public class CC16FormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private CC16FormKartuKreditFragment d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View m;

    public CC16FormKartuKreditFragment_ViewBinding(final CC16FormKartuKreditFragment cC16FormKartuKreditFragment, View view) {
        this.d = cC16FormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297062, "field 'etNamaLengkap' and method 'onChange'");
        cC16FormKartuKreditFragment.etNamaLengkap = (EditText) Utils.castView(findRequiredView, 2131297062, "field 'etNamaLengkap'", EditText.class);
        this.f = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC16FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296987, "field 'etHubungan' and method 'onClickedHubungan'");
        cC16FormKartuKreditFragment.etHubungan = (EditText) Utils.castView(findRequiredView2, 2131296987, "field 'etHubungan'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC16FormKartuKreditFragment.onClickedHubungan();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296930, "field 'etAlamatDomisili' and method 'onChange'");
        cC16FormKartuKreditFragment.etAlamatDomisili = (EditText) Utils.castView(findRequiredView3, 2131296930, "field 'etAlamatDomisili'", EditText.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC16FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297033, "field 'etKota' and method 'onChange'");
        cC16FormKartuKreditFragment.etKota = (getCardCode) Utils.castView(findRequiredView4, 2131297033, "field 'etKota'", getCardCode.class);
        this.i = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC16FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297022, "field 'etKodePos' and method 'onChange'");
        cC16FormKartuKreditFragment.etKodePos = (EditText) Utils.castView(findRequiredView5, 2131297022, "field 'etKodePos'", EditText.class);
        this.j = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment_ViewBinding.9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC16FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297220, "field 'etTlpRumah' and method 'onChange'");
        cC16FormKartuKreditFragment.etTlpRumah = (EditText) Utils.castView(findRequiredView6, 2131297220, "field 'etTlpRumah'", EditText.class);
        this.m = findRequiredView6;
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC16FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297219, "field 'etTlpKantor' and method 'onChange'");
        cC16FormKartuKreditFragment.etTlpKantor = (EditText) Utils.castView(findRequiredView7, 2131297219, "field 'etTlpKantor'", EditText.class);
        this.h = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment_ViewBinding.8
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC16FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131296979, "field 'etExtKantor' and method 'onChange'");
        cC16FormKartuKreditFragment.etExtKantor = (EditText) Utils.castView(findRequiredView8, 2131296979, "field 'etExtKantor'", EditText.class);
        this.c = findRequiredView8;
        findRequiredView8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC16FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297094, "field 'etNoHP' and method 'onChange'");
        cC16FormKartuKreditFragment.etNoHP = (EditText) Utils.castView(findRequiredView9, 2131297094, "field 'etNoHP'", EditText.class);
        this.g = findRequiredView9;
        findRequiredView9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC16FormKartuKreditFragment.onChange(view2, z);
            }
        });
        cC16FormKartuKreditFragment.tilNamaLengkap = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilNamaLengkap'", LogoutDialog_ViewBinding.class);
        cC16FormKartuKreditFragment.tilHubungan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298536, "field 'tilHubungan'", LogoutDialog_ViewBinding.class);
        cC16FormKartuKreditFragment.tilAlamatDomisili = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298479, "field 'tilAlamatDomisili'", LogoutDialog_ViewBinding.class);
        cC16FormKartuKreditFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        cC16FormKartuKreditFragment.tilKodePos = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilKodePos'", LogoutDialog_ViewBinding.class);
        cC16FormKartuKreditFragment.tilTlpRumah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298751, "field 'tilTlpRumah'", LogoutDialog_ViewBinding.class);
        cC16FormKartuKreditFragment.tilTlpKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298750, "field 'tilTlpKantor'", LogoutDialog_ViewBinding.class);
        cC16FormKartuKreditFragment.tilExtKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298529, "field 'tilExtKantor'", LogoutDialog_ViewBinding.class);
        cC16FormKartuKreditFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        View findRequiredView10 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.e = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC16FormKartuKreditFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC16FormKartuKreditFragment.next(view2);
            }
        });
        cC16FormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297062, "field 'etFields'"), Utils.findRequiredView(view, 2131296987, "field 'etFields'"), Utils.findRequiredView(view, 2131296930, "field 'etFields'"), Utils.findRequiredView(view, 2131297033, "field 'etFields'"), Utils.findRequiredView(view, 2131297022, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"));
        cC16FormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299086, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299013, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298959, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299045, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class));
        cC16FormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298609, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298536, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298479, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        cC16FormKartuKreditFragment.invalidHandphoneMessage = resources.getString(2131820903);
        cC16FormKartuKreditFragment.invalidTeleponMessage = resources.getString(2131820953);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC16FormKartuKreditFragment cC16FormKartuKreditFragment = this.d;
        if (cC16FormKartuKreditFragment != null) {
            this.d = null;
            cC16FormKartuKreditFragment.etNamaLengkap = null;
            cC16FormKartuKreditFragment.etHubungan = null;
            cC16FormKartuKreditFragment.etAlamatDomisili = null;
            cC16FormKartuKreditFragment.etKota = null;
            cC16FormKartuKreditFragment.etKodePos = null;
            cC16FormKartuKreditFragment.etTlpRumah = null;
            cC16FormKartuKreditFragment.etTlpKantor = null;
            cC16FormKartuKreditFragment.etExtKantor = null;
            cC16FormKartuKreditFragment.etNoHP = null;
            cC16FormKartuKreditFragment.tilNamaLengkap = null;
            cC16FormKartuKreditFragment.tilHubungan = null;
            cC16FormKartuKreditFragment.tilAlamatDomisili = null;
            cC16FormKartuKreditFragment.tilKota = null;
            cC16FormKartuKreditFragment.tilKodePos = null;
            cC16FormKartuKreditFragment.tilTlpRumah = null;
            cC16FormKartuKreditFragment.tilTlpKantor = null;
            cC16FormKartuKreditFragment.tilExtKantor = null;
            cC16FormKartuKreditFragment.tilNoHp = null;
            cC16FormKartuKreditFragment.etFields = null;
            cC16FormKartuKreditFragment.tvErrors = null;
            cC16FormKartuKreditFragment.tilForms = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.m.setOnFocusChangeListener(null);
            this.m = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
