package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6LLFragment_ViewBinding.class */
public class Page6LLFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private Page6LLFragment c;
    private View d;
    private View e;
    private View g;
    private View h;
    private View i;
    private View j;

    public Page6LLFragment_ViewBinding(final Page6LLFragment page6LLFragment, View view) {
        this.c = page6LLFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297076, "field 'etNama' and method 'inputChange'");
        page6LLFragment.etNama = (EditText) Utils.castView(findRequiredView, 2131297076, "field 'etNama'", EditText.class);
        this.i = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6LLFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6LLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296992, "field 'etJabatan' and method 'inputChange'");
        page6LLFragment.etJabatan = (EditText) Utils.castView(findRequiredView2, 2131296992, "field 'etJabatan'", EditText.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6LLFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6LLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296967, "field 'etBidangUsaha' and method 'inputChange'");
        page6LLFragment.etBidangUsaha = (EditText) Utils.castView(findRequiredView3, 2131296967, "field 'etBidangUsaha'", EditText.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6LLFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6LLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296943, "field 'etAlamat' and method 'inputChange'");
        page6LLFragment.etAlamat = (EditText) Utils.castView(findRequiredView4, 2131296943, "field 'etAlamat'", EditText.class);
        this.b = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6LLFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6LLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297033, "field 'etKota' and method 'onClickKota'");
        page6LLFragment.etKota = (EditText) Utils.castView(findRequiredView5, 2131297033, "field 'etKota'", EditText.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6LLFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6LLFragment.onClickKota(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297022, "field 'etKodePos' and method 'onClickKodePos'");
        page6LLFragment.etKodePos = (EditText) Utils.castView(findRequiredView6, 2131297022, "field 'etKodePos'", EditText.class);
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6LLFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6LLFragment.onClickKodePos(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297161, "field 'etProvinsi' and method 'onClickProvinsi'");
        page6LLFragment.etProvinsi = (EditText) Utils.castView(findRequiredView7, 2131297161, "field 'etProvinsi'", EditText.class);
        this.j = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6LLFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6LLFragment.onClickProvinsi(view2);
            }
        });
        page6LLFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6LLFragment.tilNamaSekolah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298622, "field 'tilNamaSekolah'", LogoutDialog_ViewBinding.class);
        page6LLFragment.tilJabatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilJabatan'", LogoutDialog_ViewBinding.class);
        page6LLFragment.tilBidangUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilBidangUsaha'", LogoutDialog_ViewBinding.class);
        page6LLFragment.tilAlamatSekolah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298492, "field 'tilAlamatSekolah'", LogoutDialog_ViewBinding.class);
        page6LLFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        page6LLFragment.tilKodePos = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilKodePos'", LogoutDialog_ViewBinding.class);
        page6LLFragment.tilProvinsi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilProvinsi'", LogoutDialog_ViewBinding.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.a = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6LLFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6LLFragment.next(view2);
            }
        });
        page6LLFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297076, "field 'etFields'"), Utils.findRequiredView(view, 2131296943, "field 'etFields'"), Utils.findRequiredView(view, 2131297033, "field 'etFields'"), Utils.findRequiredView(view, 2131297022, "field 'etFields'"), Utils.findRequiredView(view, 2131296992, "field 'etFields'"), Utils.findRequiredView(view, 2131296967, "field 'etFields'"), Utils.findRequiredView(view, 2131297161, "field 'etFields'"));
        page6LLFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299098, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298971, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299045, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299016, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298996, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299164, "field 'tvErrors'", TextView.class));
        page6LLFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298622, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298492, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilForms'", LogoutDialog_ViewBinding.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6LLFragment page6LLFragment = this.c;
        if (page6LLFragment != null) {
            this.c = null;
            page6LLFragment.etNama = null;
            page6LLFragment.etJabatan = null;
            page6LLFragment.etBidangUsaha = null;
            page6LLFragment.etAlamat = null;
            page6LLFragment.etKota = null;
            page6LLFragment.etKodePos = null;
            page6LLFragment.etProvinsi = null;
            page6LLFragment.llMain = null;
            page6LLFragment.tilNamaSekolah = null;
            page6LLFragment.tilJabatan = null;
            page6LLFragment.tilBidangUsaha = null;
            page6LLFragment.tilAlamatSekolah = null;
            page6LLFragment.tilKota = null;
            page6LLFragment.tilKodePos = null;
            page6LLFragment.tilProvinsi = null;
            page6LLFragment.etFields = null;
            page6LLFragment.tvErrors = null;
            page6LLFragment.tilForms = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
