package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6KL2Fragment_ViewBinding.class */
public class Page6KL2Fragment_ViewBinding implements Unbinder {
    private Page6KL2Fragment a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View i;
    private View j;

    public Page6KL2Fragment_ViewBinding(final Page6KL2Fragment page6KL2Fragment, View view) {
        this.a = page6KL2Fragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297140, "field 'etPekerjaan' and method 'showPekerjaanDialog'");
        page6KL2Fragment.etPekerjaan = (EditText) Utils.castView(findRequiredView, 2131297140, "field 'etPekerjaan'", EditText.class);
        this.g = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6KL2Fragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6KL2Fragment.showPekerjaanDialog(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296973, "field 'etDescPekerjaan' and method 'showDescPekerjaanDialog'");
        page6KL2Fragment.etDescPekerjaan = (EditText) Utils.castView(findRequiredView2, 2131296973, "field 'etDescPekerjaan'", EditText.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6KL2Fragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6KL2Fragment.showDescPekerjaanDialog(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296966, "field 'etBidangPekerjaan' and method 'showBidangPekerjaanDialog'");
        page6KL2Fragment.etBidangPekerjaan = (EditText) Utils.castView(findRequiredView3, 2131296966, "field 'etBidangPekerjaan'", EditText.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6KL2Fragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6KL2Fragment.showBidangPekerjaanDialog(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297202, "field 'etSumberPenghasilan' and method 'showSumberPenghasilanDialog'");
        page6KL2Fragment.etSumberPenghasilan = (EditText) Utils.castView(findRequiredView4, 2131297202, "field 'etSumberPenghasilan'", EditText.class);
        this.j = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6KL2Fragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6KL2Fragment.showSumberPenghasilanDialog(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297146, "field 'etPenghasilanLain' and method 'onChange'");
        page6KL2Fragment.etPenghasilanLain = (EditText) Utils.castView(findRequiredView5, 2131297146, "field 'etPenghasilanLain'", EditText.class);
        this.f = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6KL2Fragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6KL2Fragment.onChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297145, "field 'etPenghasilan' and method 'showPenghasilanPerTahunDialog'");
        page6KL2Fragment.etPenghasilan = (EditText) Utils.castView(findRequiredView6, 2131297145, "field 'etPenghasilan'", EditText.class);
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6KL2Fragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6KL2Fragment.showPenghasilanPerTahunDialog(view2);
            }
        });
        page6KL2Fragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6KL2Fragment.tilPekerjaan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298684, "field 'tilPekerjaan'", LogoutDialog_ViewBinding.class);
        page6KL2Fragment.tilDescPekerjaan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298524, "field 'tilDescPekerjaan'", LogoutDialog_ViewBinding.class);
        page6KL2Fragment.tilBidangPekerjaan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298516, "field 'tilBidangPekerjaan'", LogoutDialog_ViewBinding.class);
        page6KL2Fragment.tilSumberPenghasilan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298734, "field 'tilSumberPenghasilan'", LogoutDialog_ViewBinding.class);
        page6KL2Fragment.tilPenghasilanLain = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298688, "field 'tilPenghasilanLain'", LogoutDialog_ViewBinding.class);
        page6KL2Fragment.tilPenghasilan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298687, "field 'tilPenghasilan'", LogoutDialog_ViewBinding.class);
        page6KL2Fragment.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131296446, "method 'onClickRetry'");
        this.c = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6KL2Fragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6KL2Fragment.onClickRetry(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.b = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6KL2Fragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6KL2Fragment.next(view2);
            }
        });
        page6KL2Fragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297140, "field 'etFields'"), Utils.findRequiredView(view, 2131296973, "field 'etFields'"), Utils.findRequiredView(view, 2131296966, "field 'etFields'"), Utils.findRequiredView(view, 2131297202, "field 'etFields'"), Utils.findRequiredView(view, 2131297146, "field 'etFields'"), Utils.findRequiredView(view, 2131297145, "field 'etFields'"));
        page6KL2Fragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299153, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299003, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298995, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299202, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299156, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299155, "field 'tvErrors'", TextView.class));
        page6KL2Fragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298684, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298524, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298516, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298734, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298688, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298687, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6KL2Fragment.listSumberPenghasilan = resources.getStringArray(2130903096);
        page6KL2Fragment.listPenghasilanPerTahun = resources.getStringArray(2130903084);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6KL2Fragment page6KL2Fragment = this.a;
        if (page6KL2Fragment != null) {
            this.a = null;
            page6KL2Fragment.etPekerjaan = null;
            page6KL2Fragment.etDescPekerjaan = null;
            page6KL2Fragment.etBidangPekerjaan = null;
            page6KL2Fragment.etSumberPenghasilan = null;
            page6KL2Fragment.etPenghasilanLain = null;
            page6KL2Fragment.etPenghasilan = null;
            page6KL2Fragment.llMain = null;
            page6KL2Fragment.tilPekerjaan = null;
            page6KL2Fragment.tilDescPekerjaan = null;
            page6KL2Fragment.tilBidangPekerjaan = null;
            page6KL2Fragment.tilSumberPenghasilan = null;
            page6KL2Fragment.tilPenghasilanLain = null;
            page6KL2Fragment.tilPenghasilan = null;
            page6KL2Fragment.tvErrorMessage = null;
            page6KL2Fragment.etFields = null;
            page6KL2Fragment.tvErrors = null;
            page6KL2Fragment.tilForms = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
