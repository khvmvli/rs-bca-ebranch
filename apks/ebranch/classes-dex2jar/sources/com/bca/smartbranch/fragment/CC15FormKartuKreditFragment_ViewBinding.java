package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.getCardCode;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC15FormKartuKreditFragment_ViewBinding.class */
public class CC15FormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private CC15FormKartuKreditFragment b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;

    public CC15FormKartuKreditFragment_ViewBinding(final CC15FormKartuKreditFragment cC15FormKartuKreditFragment, View view) {
        this.b = cC15FormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297074, "field 'etNama' and method 'onChange'");
        cC15FormKartuKreditFragment.etNama = (EditText) Utils.castView(findRequiredView, 2131297074, "field 'etNama'", EditText.class);
        this.l = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296992, "field 'etJabatan' and method 'onChange'");
        cC15FormKartuKreditFragment.etJabatan = (EditText) Utils.castView(findRequiredView2, 2131296992, "field 'etJabatan'", EditText.class);
        this.f = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296967, "field 'etBidangUsaha' and method 'onClickBidangUsaha'");
        cC15FormKartuKreditFragment.etBidangUsaha = (EditText) Utils.castView(findRequiredView3, 2131296967, "field 'etBidangUsaha'", EditText.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC15FormKartuKreditFragment.onClickBidangUsaha();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297004, "field 'etJenisUsaha' and method 'onChange'");
        cC15FormKartuKreditFragment.etJenisUsaha = (EditText) Utils.castView(findRequiredView4, 2131297004, "field 'etJenisUsaha'", EditText.class);
        this.j = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment_ViewBinding.8
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297041, "field 'etLamaKerja' and method 'onClickLamaTinggal'");
        cC15FormKartuKreditFragment.etLamaKerja = (EditText) Utils.castView(findRequiredView5, 2131297041, "field 'etLamaKerja'", EditText.class);
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC15FormKartuKreditFragment.onClickLamaTinggal();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296931, "field 'etAlamat' and method 'onChange'");
        cC15FormKartuKreditFragment.etAlamat = (EditText) Utils.castView(findRequiredView6, 2131296931, "field 'etAlamat'", EditText.class);
        this.a = findRequiredView6;
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297033, "field 'etKota' and method 'onChange'");
        cC15FormKartuKreditFragment.etKota = (getCardCode) Utils.castView(findRequiredView7, 2131297033, "field 'etKota'", getCardCode.class);
        this.g = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297022, "field 'etKodePos' and method 'onChange'");
        cC15FormKartuKreditFragment.etKodePos = (EditText) Utils.castView(findRequiredView8, 2131297022, "field 'etKodePos'", EditText.class);
        this.i = findRequiredView8;
        findRequiredView8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297219, "field 'etTlpKantor' and method 'onChange'");
        cC15FormKartuKreditFragment.etTlpKantor = (EditText) Utils.castView(findRequiredView9, 2131297219, "field 'etTlpKantor'", EditText.class);
        this.k = findRequiredView9;
        findRequiredView9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment_ViewBinding.12
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131296979, "field 'etExtKantor' and method 'onChange'");
        cC15FormKartuKreditFragment.etExtKantor = (EditText) Utils.castView(findRequiredView10, 2131296979, "field 'etExtKantor'", EditText.class);
        this.c = findRequiredView10;
        findRequiredView10.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15FormKartuKreditFragment.onChange(view2, z);
            }
        });
        cC15FormKartuKreditFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        cC15FormKartuKreditFragment.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298620, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        cC15FormKartuKreditFragment.tilJabatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilJabatan'", LogoutDialog_ViewBinding.class);
        cC15FormKartuKreditFragment.tilBidangUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilBidangUsaha'", LogoutDialog_ViewBinding.class);
        cC15FormKartuKreditFragment.tilJenisUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298552, "field 'tilJenisUsaha'", LogoutDialog_ViewBinding.class);
        cC15FormKartuKreditFragment.tilLamaKerja = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298588, "field 'tilLamaKerja'", LogoutDialog_ViewBinding.class);
        cC15FormKartuKreditFragment.tilAlamat = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298480, "field 'tilAlamat'", LogoutDialog_ViewBinding.class);
        cC15FormKartuKreditFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        cC15FormKartuKreditFragment.tilKodePos = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilKodePos'", LogoutDialog_ViewBinding.class);
        cC15FormKartuKreditFragment.tilTlpKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298750, "field 'tilTlpKantor'", LogoutDialog_ViewBinding.class);
        cC15FormKartuKreditFragment.tilExtKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298529, "field 'tilExtKantor'", LogoutDialog_ViewBinding.class);
        View findRequiredView11 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.d = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC15FormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC15FormKartuKreditFragment.next(view2);
            }
        });
        cC15FormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297074, "field 'etFields'"), Utils.findRequiredView(view, 2131296992, "field 'etFields'"), Utils.findRequiredView(view, 2131296967, "field 'etFields'"), Utils.findRequiredView(view, 2131297004, "field 'etFields'"), Utils.findRequiredView(view, 2131297041, "field 'etFields'"), Utils.findRequiredView(view, 2131296931, "field 'etFields'"), Utils.findRequiredView(view, 2131297033, "field 'etFields'"), Utils.findRequiredView(view, 2131297022, "field 'etFields'"), Utils.findRequiredView(view, 2131297219, "field 'etFields'"));
        cC15FormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299096, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299016, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298996, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299028, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299064, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298960, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299045, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299219, "field 'tvErrors'", TextView.class));
        cC15FormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298620, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298552, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298588, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298480, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298750, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        cC15FormKartuKreditFragment.invalidTeleponMessage = view.getContext().getResources().getString(2131820953);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC15FormKartuKreditFragment cC15FormKartuKreditFragment = this.b;
        if (cC15FormKartuKreditFragment != null) {
            this.b = null;
            cC15FormKartuKreditFragment.etNama = null;
            cC15FormKartuKreditFragment.etJabatan = null;
            cC15FormKartuKreditFragment.etBidangUsaha = null;
            cC15FormKartuKreditFragment.etJenisUsaha = null;
            cC15FormKartuKreditFragment.etLamaKerja = null;
            cC15FormKartuKreditFragment.etAlamat = null;
            cC15FormKartuKreditFragment.etKota = null;
            cC15FormKartuKreditFragment.etKodePos = null;
            cC15FormKartuKreditFragment.etTlpKantor = null;
            cC15FormKartuKreditFragment.etExtKantor = null;
            cC15FormKartuKreditFragment.llMain = null;
            cC15FormKartuKreditFragment.tilNama = null;
            cC15FormKartuKreditFragment.tilJabatan = null;
            cC15FormKartuKreditFragment.tilBidangUsaha = null;
            cC15FormKartuKreditFragment.tilJenisUsaha = null;
            cC15FormKartuKreditFragment.tilLamaKerja = null;
            cC15FormKartuKreditFragment.tilAlamat = null;
            cC15FormKartuKreditFragment.tilKota = null;
            cC15FormKartuKreditFragment.tilKodePos = null;
            cC15FormKartuKreditFragment.tilTlpKantor = null;
            cC15FormKartuKreditFragment.tilExtKantor = null;
            cC15FormKartuKreditFragment.etFields = null;
            cC15FormKartuKreditFragment.tvErrors = null;
            cC15FormKartuKreditFragment.tilForms = null;
            this.l.setOnFocusChangeListener(null);
            this.l = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.k.setOnFocusChangeListener(null);
            this.k = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
