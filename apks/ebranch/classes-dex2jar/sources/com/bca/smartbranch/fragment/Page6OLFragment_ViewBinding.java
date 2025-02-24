package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6OLFragment_ViewBinding.class */
public class Page6OLFragment_ViewBinding implements Unbinder {
    private View a;
    private Page6OLFragment b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;

    public Page6OLFragment_ViewBinding(final Page6OLFragment page6OLFragment, View view) {
        this.b = page6OLFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297003, "field 'etJenisProfesi' and method 'inputChange'");
        page6OLFragment.etJenisProfesi = (EditText) Utils.castView(findRequiredView, 2131297003, "field 'etJenisProfesi'", EditText.class);
        this.g = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6OLFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6OLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297061, "field 'etNama' and method 'inputChange'");
        page6OLFragment.etNama = (EditText) Utils.castView(findRequiredView2, 2131297061, "field 'etNama'", EditText.class);
        this.h = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6OLFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6OLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296992, "field 'etJabatan' and method 'inputChange'");
        page6OLFragment.etJabatan = (EditText) Utils.castView(findRequiredView3, 2131296992, "field 'etJabatan'", EditText.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6OLFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6OLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296967, "field 'etBidangUsaha' and method 'inputChange'");
        page6OLFragment.etBidangUsaha = (EditText) Utils.castView(findRequiredView4, 2131296967, "field 'etBidangUsaha'", EditText.class);
        this.d = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6OLFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6OLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296931, "field 'etAlamat' and method 'inputChange'");
        page6OLFragment.etAlamat = (EditText) Utils.castView(findRequiredView5, 2131296931, "field 'etAlamat'", EditText.class);
        this.e = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6OLFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6OLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297033, "field 'etKota' and method 'onClickKota'");
        page6OLFragment.etKota = (EditText) Utils.castView(findRequiredView6, 2131297033, "field 'etKota'", EditText.class);
        this.j = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6OLFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6OLFragment.onClickKota(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297022, "field 'etKodePos' and method 'onClickKodePos'");
        page6OLFragment.etKodePos = (EditText) Utils.castView(findRequiredView7, 2131297022, "field 'etKodePos'", EditText.class);
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6OLFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6OLFragment.onClickKodePos(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297161, "field 'etProvinsi' and method 'onClickProvinsi'");
        page6OLFragment.etProvinsi = (EditText) Utils.castView(findRequiredView8, 2131297161, "field 'etProvinsi'", EditText.class);
        this.f = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6OLFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6OLFragment.onClickProvinsi(view2);
            }
        });
        page6OLFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6OLFragment.tilJenisProfesi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298551, "field 'tilJenisProfesi'", LogoutDialog_ViewBinding.class);
        page6OLFragment.tilNamaKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298608, "field 'tilNamaKantor'", LogoutDialog_ViewBinding.class);
        page6OLFragment.tilJabatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilJabatan'", LogoutDialog_ViewBinding.class);
        page6OLFragment.tilBidangUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilBidangUsaha'", LogoutDialog_ViewBinding.class);
        page6OLFragment.tilAlamatKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298480, "field 'tilAlamatKantor'", LogoutDialog_ViewBinding.class);
        page6OLFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        page6OLFragment.tilKodePos = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilKodePos'", LogoutDialog_ViewBinding.class);
        page6OLFragment.tilProvinsi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilProvinsi'", LogoutDialog_ViewBinding.class);
        View findRequiredView9 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.c = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6OLFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6OLFragment.next(view2);
            }
        });
        page6OLFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297003, "field 'etFields'"), Utils.findRequiredView(view, 2131297061, "field 'etFields'"), Utils.findRequiredView(view, 2131296992, "field 'etFields'"), Utils.findRequiredView(view, 2131296967, "field 'etFields'"), Utils.findRequiredView(view, 2131296931, "field 'etFields'"), Utils.findRequiredView(view, 2131297033, "field 'etFields'"), Utils.findRequiredView(view, 2131297022, "field 'etFields'"), Utils.findRequiredView(view, 2131297161, "field 'etFields'"));
        page6OLFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299027, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299085, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299016, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298996, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298960, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299045, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299164, "field 'tvErrors'", TextView.class));
        page6OLFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298551, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298608, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298480, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilForms'", LogoutDialog_ViewBinding.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6OLFragment page6OLFragment = this.b;
        if (page6OLFragment != null) {
            this.b = null;
            page6OLFragment.etJenisProfesi = null;
            page6OLFragment.etNama = null;
            page6OLFragment.etJabatan = null;
            page6OLFragment.etBidangUsaha = null;
            page6OLFragment.etAlamat = null;
            page6OLFragment.etKota = null;
            page6OLFragment.etKodePos = null;
            page6OLFragment.etProvinsi = null;
            page6OLFragment.llMain = null;
            page6OLFragment.tilJenisProfesi = null;
            page6OLFragment.tilNamaKantor = null;
            page6OLFragment.tilJabatan = null;
            page6OLFragment.tilBidangUsaha = null;
            page6OLFragment.tilAlamatKantor = null;
            page6OLFragment.tilKota = null;
            page6OLFragment.tilKodePos = null;
            page6OLFragment.tilProvinsi = null;
            page6OLFragment.etFields = null;
            page6OLFragment.tvErrors = null;
            page6OLFragment.tilForms = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
