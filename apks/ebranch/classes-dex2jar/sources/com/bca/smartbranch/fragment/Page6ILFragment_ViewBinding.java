package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6ILFragment_ViewBinding.class */
public class Page6ILFragment_ViewBinding implements Unbinder {
    private Page6ILFragment a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View m;

    public Page6ILFragment_ViewBinding(final Page6ILFragment page6ILFragment, View view) {
        this.a = page6ILFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297080, "field 'etNegara' and method 'onClickNegara'");
        page6ILFragment.etNegara = (EditText) Utils.castView(findRequiredView, 2131297080, "field 'etNegara'", EditText.class);
        this.g = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ILFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ILFragment.onClickNegara(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296927, "field 'etAlamat' and method 'inputChange'");
        page6ILFragment.etAlamat = (EditText) Utils.castView(findRequiredView2, 2131296927, "field 'etAlamat'", EditText.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6ILFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6ILFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297167, "field 'etRT' and method 'inputChange'");
        page6ILFragment.etRT = (EditText) Utils.castView(findRequiredView3, 2131297167, "field 'etRT'", EditText.class);
        this.f = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6ILFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6ILFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297170, "field 'etRW' and method 'inputChange'");
        page6ILFragment.etRW = (EditText) Utils.castView(findRequiredView4, 2131297170, "field 'etRW'", EditText.class);
        this.m = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6ILFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6ILFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297161, "field 'etProvinsi' and method 'onClickProvinsi'");
        page6ILFragment.etProvinsi = (EditText) Utils.castView(findRequiredView5, 2131297161, "field 'etProvinsi'", EditText.class);
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ILFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ILFragment.onClickProvinsi(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297014, "field 'etKelurahan' and method 'onClickKelurahan'");
        page6ILFragment.etKelurahan = (EditText) Utils.castView(findRequiredView6, 2131297014, "field 'etKelurahan'", EditText.class);
        this.b = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ILFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ILFragment.onClickKelurahan(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297011, "field 'etKecamatan' and method 'onClickKecamatan'");
        page6ILFragment.etKecamatan = (EditText) Utils.castView(findRequiredView7, 2131297011, "field 'etKecamatan'", EditText.class);
        this.c = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ILFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ILFragment.onClickKecamatan(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297033, "field 'etKota' and method 'onClickKota'");
        page6ILFragment.etKota = (EditText) Utils.castView(findRequiredView8, 2131297033, "field 'etKota'", EditText.class);
        this.i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ILFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ILFragment.onClickKota(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297022, "field 'etKodePos' and method 'onClickKodePos'");
        page6ILFragment.etKodePos = (EditText) Utils.castView(findRequiredView9, 2131297022, "field 'etKodePos'", EditText.class);
        this.j = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ILFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ILFragment.onClickKodePos(view2);
            }
        });
        page6ILFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6ILFragment.llKtp = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297753, "field 'llKtp'", LinearLayout.class);
        page6ILFragment.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        page6ILFragment.tilNegara = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298626, "field 'tilNegara'", LogoutDialog_ViewBinding.class);
        page6ILFragment.tilAlamat = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298476, "field 'tilAlamat'", LogoutDialog_ViewBinding.class);
        page6ILFragment.tilRt = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298703, "field 'tilRt'", LogoutDialog_ViewBinding.class);
        page6ILFragment.tilRw = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298706, "field 'tilRw'", LogoutDialog_ViewBinding.class);
        page6ILFragment.tilProvinsi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilProvinsi'", LogoutDialog_ViewBinding.class);
        page6ILFragment.tilKelurahan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298560, "field 'tilKelurahan'", LogoutDialog_ViewBinding.class);
        page6ILFragment.tilKecamatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298557, "field 'tilKecamatan'", LogoutDialog_ViewBinding.class);
        page6ILFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        page6ILFragment.tilKodePos = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilKodePos'", LogoutDialog_ViewBinding.class);
        View findRequiredView10 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.e = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ILFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ILFragment.next(view2);
            }
        });
        page6ILFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296927, "field 'etFields'"), Utils.findRequiredView(view, 2131297167, "field 'etFields'"), Utils.findRequiredView(view, 2131297170, "field 'etFields'"), Utils.findRequiredView(view, 2131297014, "field 'etFields'"), Utils.findRequiredView(view, 2131297011, "field 'etFields'"), Utils.findRequiredView(view, 2131297033, "field 'etFields'"), Utils.findRequiredView(view, 2131297022, "field 'etFields'"), Utils.findRequiredView(view, 2131297161, "field 'etFields'"), Utils.findRequiredView(view, 2131297080, "field 'etFields'"));
        page6ILFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131298956, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299171, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299174, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299037, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299034, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299045, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299164, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299102, "field 'tvErrors'", TextView.class));
        page6ILFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298476, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298703, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298706, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298560, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298557, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298626, "field 'tilForms'", LogoutDialog_ViewBinding.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6ILFragment page6ILFragment = this.a;
        if (page6ILFragment != null) {
            this.a = null;
            page6ILFragment.etNegara = null;
            page6ILFragment.etAlamat = null;
            page6ILFragment.etRT = null;
            page6ILFragment.etRW = null;
            page6ILFragment.etProvinsi = null;
            page6ILFragment.etKelurahan = null;
            page6ILFragment.etKecamatan = null;
            page6ILFragment.etKota = null;
            page6ILFragment.etKodePos = null;
            page6ILFragment.llMain = null;
            page6ILFragment.llKtp = null;
            page6ILFragment.tvTitle = null;
            page6ILFragment.tilNegara = null;
            page6ILFragment.tilAlamat = null;
            page6ILFragment.tilRt = null;
            page6ILFragment.tilRw = null;
            page6ILFragment.tilProvinsi = null;
            page6ILFragment.tilKelurahan = null;
            page6ILFragment.tilKecamatan = null;
            page6ILFragment.tilKota = null;
            page6ILFragment.tilKodePos = null;
            page6ILFragment.etFields = null;
            page6ILFragment.tvErrors = null;
            page6ILFragment.tilForms = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.m.setOnFocusChangeListener(null);
            this.m = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
