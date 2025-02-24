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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC15WiraswastaFormKartuKreditFragment_ViewBinding.class */
public class CC15WiraswastaFormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private CC15WiraswastaFormKartuKreditFragment c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View l;

    /* renamed from: o  reason: collision with root package name */
    private View f34o;

    public CC15WiraswastaFormKartuKreditFragment_ViewBinding(final CC15WiraswastaFormKartuKreditFragment cC15WiraswastaFormKartuKreditFragment, View view) {
        this.c = cC15WiraswastaFormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297074, "field 'etNama' and method 'onChange'");
        cC15WiraswastaFormKartuKreditFragment.etNama = (EditText) Utils.castView(findRequiredView, 2131297074, "field 'etNama'", EditText.class);
        this.f34o = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15WiraswastaFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296992, "field 'etJabatan' and method 'onChange'");
        cC15WiraswastaFormKartuKreditFragment.etJabatan = (EditText) Utils.castView(findRequiredView2, 2131296992, "field 'etJabatan'", EditText.class);
        this.h = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15WiraswastaFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296967, "field 'etBidangUsaha' and method 'onClickBidangUsaha'");
        cC15WiraswastaFormKartuKreditFragment.etBidangUsaha = (EditText) Utils.castView(findRequiredView3, 2131296967, "field 'etBidangUsaha'", EditText.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC15WiraswastaFormKartuKreditFragment.onClickBidangUsaha();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297004, "field 'etJenisUsaha' and method 'onChange'");
        cC15WiraswastaFormKartuKreditFragment.etJenisUsaha = (EditText) Utils.castView(findRequiredView4, 2131297004, "field 'etJenisUsaha'", EditText.class);
        this.j = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment_ViewBinding.9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15WiraswastaFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297041, "field 'etLamaKerja' and method 'onClickLamaTinggal'");
        cC15WiraswastaFormKartuKreditFragment.etLamaKerja = (EditText) Utils.castView(findRequiredView5, 2131297041, "field 'etLamaKerja'", EditText.class);
        this.i = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC15WiraswastaFormKartuKreditFragment.onClickLamaTinggal();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296931, "field 'etAlamat' and method 'onChange'");
        cC15WiraswastaFormKartuKreditFragment.etAlamat = (EditText) Utils.castView(findRequiredView6, 2131296931, "field 'etAlamat'", EditText.class);
        this.a = findRequiredView6;
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15WiraswastaFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297033, "field 'etKota' and method 'onChange'");
        cC15WiraswastaFormKartuKreditFragment.etKota = (getCardCode) Utils.castView(findRequiredView7, 2131297033, "field 'etKota'", getCardCode.class);
        this.f = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment_ViewBinding.8
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15WiraswastaFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297022, "field 'etKodePos' and method 'onChange'");
        cC15WiraswastaFormKartuKreditFragment.etKodePos = (EditText) Utils.castView(findRequiredView8, 2131297022, "field 'etKodePos'", EditText.class);
        this.g = findRequiredView8;
        findRequiredView8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15WiraswastaFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297219, "field 'etTlpKantor' and method 'onChange'");
        cC15WiraswastaFormKartuKreditFragment.etTlpKantor = (EditText) Utils.castView(findRequiredView9, 2131297219, "field 'etTlpKantor'", EditText.class);
        this.l = findRequiredView9;
        findRequiredView9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment_ViewBinding.15
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15WiraswastaFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131296979, "field 'etExtKantor' and method 'onChange'");
        cC15WiraswastaFormKartuKreditFragment.etExtKantor = (EditText) Utils.castView(findRequiredView10, 2131296979, "field 'etExtKantor'", EditText.class);
        this.b = findRequiredView10;
        findRequiredView10.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC15WiraswastaFormKartuKreditFragment.onChange(view2, z);
            }
        });
        cC15WiraswastaFormKartuKreditFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        cC15WiraswastaFormKartuKreditFragment.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298620, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        cC15WiraswastaFormKartuKreditFragment.tilJabatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilJabatan'", LogoutDialog_ViewBinding.class);
        cC15WiraswastaFormKartuKreditFragment.tilBidangUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilBidangUsaha'", LogoutDialog_ViewBinding.class);
        cC15WiraswastaFormKartuKreditFragment.tilJenisUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298552, "field 'tilJenisUsaha'", LogoutDialog_ViewBinding.class);
        cC15WiraswastaFormKartuKreditFragment.tilLamaKerja = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298588, "field 'tilLamaKerja'", LogoutDialog_ViewBinding.class);
        cC15WiraswastaFormKartuKreditFragment.tilAlamat = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298480, "field 'tilAlamat'", LogoutDialog_ViewBinding.class);
        cC15WiraswastaFormKartuKreditFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        cC15WiraswastaFormKartuKreditFragment.tilKodePos = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilKodePos'", LogoutDialog_ViewBinding.class);
        cC15WiraswastaFormKartuKreditFragment.tilTlpKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298750, "field 'tilTlpKantor'", LogoutDialog_ViewBinding.class);
        cC15WiraswastaFormKartuKreditFragment.tilExtKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298529, "field 'tilExtKantor'", LogoutDialog_ViewBinding.class);
        View findRequiredView11 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.e = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC15WiraswastaFormKartuKreditFragment.next(view2);
            }
        });
        cC15WiraswastaFormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297074, "field 'etFields'"), Utils.findRequiredView(view, 2131296992, "field 'etFields'"), Utils.findRequiredView(view, 2131296967, "field 'etFields'"), Utils.findRequiredView(view, 2131297004, "field 'etFields'"), Utils.findRequiredView(view, 2131297041, "field 'etFields'"), Utils.findRequiredView(view, 2131296931, "field 'etFields'"), Utils.findRequiredView(view, 2131297033, "field 'etFields'"), Utils.findRequiredView(view, 2131297022, "field 'etFields'"), Utils.findRequiredView(view, 2131297219, "field 'etFields'"));
        cC15WiraswastaFormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299096, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299016, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298996, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299028, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299064, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298960, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299045, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299219, "field 'tvErrors'", TextView.class));
        cC15WiraswastaFormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298620, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298552, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298588, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298480, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298750, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        cC15WiraswastaFormKartuKreditFragment.invalidTeleponMessage = view.getContext().getResources().getString(2131820953);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC15WiraswastaFormKartuKreditFragment cC15WiraswastaFormKartuKreditFragment = this.c;
        if (cC15WiraswastaFormKartuKreditFragment != null) {
            this.c = null;
            cC15WiraswastaFormKartuKreditFragment.etNama = null;
            cC15WiraswastaFormKartuKreditFragment.etJabatan = null;
            cC15WiraswastaFormKartuKreditFragment.etBidangUsaha = null;
            cC15WiraswastaFormKartuKreditFragment.etJenisUsaha = null;
            cC15WiraswastaFormKartuKreditFragment.etLamaKerja = null;
            cC15WiraswastaFormKartuKreditFragment.etAlamat = null;
            cC15WiraswastaFormKartuKreditFragment.etKota = null;
            cC15WiraswastaFormKartuKreditFragment.etKodePos = null;
            cC15WiraswastaFormKartuKreditFragment.etTlpKantor = null;
            cC15WiraswastaFormKartuKreditFragment.etExtKantor = null;
            cC15WiraswastaFormKartuKreditFragment.llMain = null;
            cC15WiraswastaFormKartuKreditFragment.tilNama = null;
            cC15WiraswastaFormKartuKreditFragment.tilJabatan = null;
            cC15WiraswastaFormKartuKreditFragment.tilBidangUsaha = null;
            cC15WiraswastaFormKartuKreditFragment.tilJenisUsaha = null;
            cC15WiraswastaFormKartuKreditFragment.tilLamaKerja = null;
            cC15WiraswastaFormKartuKreditFragment.tilAlamat = null;
            cC15WiraswastaFormKartuKreditFragment.tilKota = null;
            cC15WiraswastaFormKartuKreditFragment.tilKodePos = null;
            cC15WiraswastaFormKartuKreditFragment.tilTlpKantor = null;
            cC15WiraswastaFormKartuKreditFragment.tilExtKantor = null;
            cC15WiraswastaFormKartuKreditFragment.etFields = null;
            cC15WiraswastaFormKartuKreditFragment.tvErrors = null;
            cC15WiraswastaFormKartuKreditFragment.tilForms = null;
            this.f34o.setOnFocusChangeListener(null);
            this.f34o = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.l.setOnFocusChangeListener(null);
            this.l = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
