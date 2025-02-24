package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6MLFragment_ViewBinding.class */
public class Page6MLFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private Page6MLFragment d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;

    public Page6MLFragment_ViewBinding(final Page6MLFragment page6MLFragment, View view) {
        this.d = page6MLFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297061, "field 'etNama' and method 'inputChange'");
        page6MLFragment.etNama = (EditText) Utils.castView(findRequiredView, 2131297061, "field 'etNama'", EditText.class);
        this.h = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6MLFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6MLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296992, "field 'etJabatan' and method 'inputChange'");
        page6MLFragment.etJabatan = (EditText) Utils.castView(findRequiredView2, 2131296992, "field 'etJabatan'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6MLFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6MLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296967, "field 'etBidangUsaha' and method 'inputChange'");
        page6MLFragment.etBidangUsaha = (EditText) Utils.castView(findRequiredView3, 2131296967, "field 'etBidangUsaha'", EditText.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6MLFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6MLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296931, "field 'etAlamat' and method 'inputChange'");
        page6MLFragment.etAlamat = (EditText) Utils.castView(findRequiredView4, 2131296931, "field 'etAlamat'", EditText.class);
        this.e = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6MLFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6MLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297033, "field 'etKota' and method 'onClickKota'");
        page6MLFragment.etKota = (EditText) Utils.castView(findRequiredView5, 2131297033, "field 'etKota'", EditText.class);
        this.f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6MLFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6MLFragment.onClickKota(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297022, "field 'etKodePos' and method 'onClickKodePos'");
        page6MLFragment.etKodePos = (EditText) Utils.castView(findRequiredView6, 2131297022, "field 'etKodePos'", EditText.class);
        this.g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6MLFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6MLFragment.onClickKodePos(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297161, "field 'etProvinsi' and method 'onClickProvinsi'");
        page6MLFragment.etProvinsi = (EditText) Utils.castView(findRequiredView7, 2131297161, "field 'etProvinsi'", EditText.class);
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6MLFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6MLFragment.onClickProvinsi(view2);
            }
        });
        page6MLFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6MLFragment.tilNamaKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298608, "field 'tilNamaKantor'", LogoutDialog_ViewBinding.class);
        page6MLFragment.tilJabatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilJabatan'", LogoutDialog_ViewBinding.class);
        page6MLFragment.tilBidangUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilBidangUsaha'", LogoutDialog_ViewBinding.class);
        page6MLFragment.tilAlamatKantor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298480, "field 'tilAlamatKantor'", LogoutDialog_ViewBinding.class);
        page6MLFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        page6MLFragment.tilKodePos = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilKodePos'", LogoutDialog_ViewBinding.class);
        page6MLFragment.tilProvinsi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilProvinsi'", LogoutDialog_ViewBinding.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.c = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6MLFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6MLFragment.next(view2);
            }
        });
        page6MLFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297061, "field 'etFields'"), Utils.findRequiredView(view, 2131296992, "field 'etFields'"), Utils.findRequiredView(view, 2131296967, "field 'etFields'"), Utils.findRequiredView(view, 2131296931, "field 'etFields'"), Utils.findRequiredView(view, 2131297033, "field 'etFields'"), Utils.findRequiredView(view, 2131297022, "field 'etFields'"), Utils.findRequiredView(view, 2131297161, "field 'etFields'"));
        page6MLFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299085, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299016, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298996, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298960, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299045, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299164, "field 'tvErrors'", TextView.class));
        page6MLFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298608, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298480, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilForms'", LogoutDialog_ViewBinding.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6MLFragment page6MLFragment = this.d;
        if (page6MLFragment != null) {
            this.d = null;
            page6MLFragment.etNama = null;
            page6MLFragment.etJabatan = null;
            page6MLFragment.etBidangUsaha = null;
            page6MLFragment.etAlamat = null;
            page6MLFragment.etKota = null;
            page6MLFragment.etKodePos = null;
            page6MLFragment.etProvinsi = null;
            page6MLFragment.llMain = null;
            page6MLFragment.tilNamaKantor = null;
            page6MLFragment.tilJabatan = null;
            page6MLFragment.tilBidangUsaha = null;
            page6MLFragment.tilAlamatKantor = null;
            page6MLFragment.tilKota = null;
            page6MLFragment.tilKodePos = null;
            page6MLFragment.tilProvinsi = null;
            page6MLFragment.etFields = null;
            page6MLFragment.tvErrors = null;
            page6MLFragment.tilForms = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
