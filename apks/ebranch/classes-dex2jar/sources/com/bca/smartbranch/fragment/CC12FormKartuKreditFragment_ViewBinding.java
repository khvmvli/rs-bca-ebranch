package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.getCardCode;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC12FormKartuKreditFragment_ViewBinding.class */
public class CC12FormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private CC12FormKartuKreditFragment e;
    private View f;
    private View h;
    private View j;

    public CC12FormKartuKreditFragment_ViewBinding(final CC12FormKartuKreditFragment cC12FormKartuKreditFragment, View view) {
        this.e = cC12FormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296927, "field 'etAlamat' and method 'inputChange'");
        cC12FormKartuKreditFragment.etAlamat = (EditText) Utils.castView(findRequiredView, 2131296927, "field 'etAlamat'", EditText.class);
        this.a = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC12FormKartuKreditFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297033, "field 'etKota' and method 'inputChange'");
        cC12FormKartuKreditFragment.etKota = (getCardCode) Utils.castView(findRequiredView2, 2131297033, "field 'etKota'", getCardCode.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC12FormKartuKreditFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297022, "field 'etKodePos' and method 'inputChange'");
        cC12FormKartuKreditFragment.etKodePos = (EditText) Utils.castView(findRequiredView3, 2131297022, "field 'etKodePos'", EditText.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC12FormKartuKreditFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297198, "field 'etStatusTempat' and method 'showStatusTempatTinggalDialog'");
        cC12FormKartuKreditFragment.etStatusTempat = (EditText) Utils.castView(findRequiredView4, 2131297198, "field 'etStatusTempat'", EditText.class);
        this.f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC12FormKartuKreditFragment.showStatusTempatTinggalDialog(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297042, "field 'etLamaMenempati' and method 'onClickLamaTinggal'");
        cC12FormKartuKreditFragment.etLamaMenempati = (EditText) Utils.castView(findRequiredView5, 2131297042, "field 'etLamaMenempati'", EditText.class);
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC12FormKartuKreditFragment.onClickLamaTinggal();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297118, "field 'etNoTelepon' and method 'inputChange'");
        cC12FormKartuKreditFragment.etNoTelepon = (EditText) Utils.castView(findRequiredView6, 2131297118, "field 'etNoTelepon'", EditText.class);
        this.j = findRequiredView6;
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC12FormKartuKreditFragment.inputChange(view2, z);
            }
        });
        cC12FormKartuKreditFragment.tilAlamat = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298476, "field 'tilAlamat'", LogoutDialog_ViewBinding.class);
        cC12FormKartuKreditFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        cC12FormKartuKreditFragment.tilKodePos = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilKodePos'", LogoutDialog_ViewBinding.class);
        cC12FormKartuKreditFragment.tilStatusTempat = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298730, "field 'tilStatusTempat'", LogoutDialog_ViewBinding.class);
        cC12FormKartuKreditFragment.tilNoTelepon = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298664, "field 'tilNoTelepon'", LogoutDialog_ViewBinding.class);
        cC12FormKartuKreditFragment.tilLamaMenempati = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298589, "field 'tilLamaMenempati'", LogoutDialog_ViewBinding.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.c = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC12FormKartuKreditFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC12FormKartuKreditFragment.lanjut(view2);
            }
        });
        cC12FormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296927, "field 'etFields'"), Utils.findRequiredView(view, 2131297033, "field 'etFields'"), Utils.findRequiredView(view, 2131297022, "field 'etFields'"), Utils.findRequiredView(view, 2131297198, "field 'etFields'"), Utils.findRequiredView(view, 2131297042, "field 'etFields'"));
        cC12FormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131298956, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299045, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299198, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299065, "field 'tvErrors'", TextView.class));
        cC12FormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298476, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298730, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298589, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        cC12FormKartuKreditFragment.invalidTeleponMessage = view.getContext().getResources().getString(2131820953);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC12FormKartuKreditFragment cC12FormKartuKreditFragment = this.e;
        if (cC12FormKartuKreditFragment != null) {
            this.e = null;
            cC12FormKartuKreditFragment.etAlamat = null;
            cC12FormKartuKreditFragment.etKota = null;
            cC12FormKartuKreditFragment.etKodePos = null;
            cC12FormKartuKreditFragment.etStatusTempat = null;
            cC12FormKartuKreditFragment.etLamaMenempati = null;
            cC12FormKartuKreditFragment.etNoTelepon = null;
            cC12FormKartuKreditFragment.tilAlamat = null;
            cC12FormKartuKreditFragment.tilKota = null;
            cC12FormKartuKreditFragment.tilKodePos = null;
            cC12FormKartuKreditFragment.tilStatusTempat = null;
            cC12FormKartuKreditFragment.tilNoTelepon = null;
            cC12FormKartuKreditFragment.tilLamaMenempati = null;
            cC12FormKartuKreditFragment.etFields = null;
            cC12FormKartuKreditFragment.tvErrors = null;
            cC12FormKartuKreditFragment.tilForms = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
