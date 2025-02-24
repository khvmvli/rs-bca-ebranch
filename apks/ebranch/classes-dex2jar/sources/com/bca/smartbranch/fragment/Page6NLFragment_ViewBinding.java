package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6NLFragment_ViewBinding.class */
public class Page6NLFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private Page6NLFragment d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;

    public Page6NLFragment_ViewBinding(final Page6NLFragment page6NLFragment, View view) {
        this.d = page6NLFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297078, "field 'etNama' and method 'inputChange'");
        page6NLFragment.etNama = (EditText) Utils.castView(findRequiredView, 2131297078, "field 'etNama'", EditText.class);
        this.f = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6NLFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6NLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296992, "field 'etJabatan', method 'onChoose', and method 'inputChange'");
        page6NLFragment.etJabatan = (EditText) Utils.castView(findRequiredView2, 2131296992, "field 'etJabatan'", EditText.class);
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6NLFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6NLFragment.onChoose(view2);
            }
        });
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6NLFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6NLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296967, "field 'etBidangUsaha', method 'onChoose', and method 'inputChange'");
        page6NLFragment.etBidangUsaha = (EditText) Utils.castView(findRequiredView3, 2131296967, "field 'etBidangUsaha'", EditText.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6NLFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6NLFragment.onChoose(view2);
            }
        });
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6NLFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6NLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296944, "field 'etAlamat' and method 'inputChange'");
        page6NLFragment.etAlamat = (EditText) Utils.castView(findRequiredView4, 2131296944, "field 'etAlamat'", EditText.class);
        this.b = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6NLFragment_ViewBinding.8
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6NLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297033, "field 'etKota' and method 'onClickKota'");
        page6NLFragment.etKota = (EditText) Utils.castView(findRequiredView5, 2131297033, "field 'etKota'", EditText.class);
        this.i = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6NLFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6NLFragment.onClickKota(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297022, "field 'etKodePos' and method 'onClickKodePos'");
        page6NLFragment.etKodePos = (EditText) Utils.castView(findRequiredView6, 2131297022, "field 'etKodePos'", EditText.class);
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6NLFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6NLFragment.onClickKodePos(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297161, "field 'etProvinsi' and method 'onClickProvinsi'");
        page6NLFragment.etProvinsi = (EditText) Utils.castView(findRequiredView7, 2131297161, "field 'etProvinsi'", EditText.class);
        this.g = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6NLFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6NLFragment.onClickProvinsi(view2);
            }
        });
        page6NLFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6NLFragment.tilNamaTempatUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298624, "field 'tilNamaTempatUsaha'", LogoutDialog_ViewBinding.class);
        page6NLFragment.tilJabatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilJabatan'", LogoutDialog_ViewBinding.class);
        page6NLFragment.tilBidangUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilBidangUsaha'", LogoutDialog_ViewBinding.class);
        page6NLFragment.tilAlamatTempatUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298493, "field 'tilAlamatTempatUsaha'", LogoutDialog_ViewBinding.class);
        page6NLFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        page6NLFragment.tilKodePos = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilKodePos'", LogoutDialog_ViewBinding.class);
        page6NLFragment.tilProvinsi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilProvinsi'", LogoutDialog_ViewBinding.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.e = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6NLFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6NLFragment.next(view2);
            }
        });
        page6NLFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297078, "field 'etFields'"), Utils.findRequiredView(view, 2131296992, "field 'etFields'"), Utils.findRequiredView(view, 2131296967, "field 'etFields'"), Utils.findRequiredView(view, 2131296944, "field 'etFields'"), Utils.findRequiredView(view, 2131297033, "field 'etFields'"), Utils.findRequiredView(view, 2131297022, "field 'etFields'"), Utils.findRequiredView(view, 2131297161, "field 'etFields'"));
        page6NLFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299100, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299016, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298996, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298972, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299045, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299164, "field 'tvErrors'", TextView.class));
        page6NLFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298624, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298493, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilForms'", LogoutDialog_ViewBinding.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6NLFragment page6NLFragment = this.d;
        if (page6NLFragment != null) {
            this.d = null;
            page6NLFragment.etNama = null;
            page6NLFragment.etJabatan = null;
            page6NLFragment.etBidangUsaha = null;
            page6NLFragment.etAlamat = null;
            page6NLFragment.etKota = null;
            page6NLFragment.etKodePos = null;
            page6NLFragment.etProvinsi = null;
            page6NLFragment.llMain = null;
            page6NLFragment.tilNamaTempatUsaha = null;
            page6NLFragment.tilJabatan = null;
            page6NLFragment.tilBidangUsaha = null;
            page6NLFragment.tilAlamatTempatUsaha = null;
            page6NLFragment.tilKota = null;
            page6NLFragment.tilKodePos = null;
            page6NLFragment.tilProvinsi = null;
            page6NLFragment.etFields = null;
            page6NLFragment.tvErrors = null;
            page6NLFragment.tilForms = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.a.setOnClickListener(null);
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
