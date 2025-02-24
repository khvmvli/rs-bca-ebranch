package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.Page6CSFragment;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6FLKartuPelajarFragment_ViewBinding.class */
public class Page6FLKartuPelajarFragment_ViewBinding implements Unbinder {
    private Page6FLKartuPelajarFragment a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;

    public Page6FLKartuPelajarFragment_ViewBinding(final Page6FLKartuPelajarFragment page6FLKartuPelajarFragment, View view) {
        this.a = page6FLKartuPelajarFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297103, "field 'etNoIdentitas' and method 'inputChange'");
        page6FLKartuPelajarFragment.etNoIdentitas = (EditText) Utils.castView(findRequiredView, 2131297103, "field 'etNoIdentitas'", EditText.class);
        this.f = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6FLKartuPelajarFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297044, "field 'etMasaBerlaku' and method 'showDatePicker'");
        page6FLKartuPelajarFragment.etMasaBerlaku = (EditText) Utils.castView(findRequiredView2, 2131297044, "field 'etMasaBerlaku'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKartuPelajarFragment.showDatePicker(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297077, "field 'etNamaSesuai' and method 'inputChange'");
        page6FLKartuPelajarFragment.etNamaSesuai = (EditText) Utils.castView(findRequiredView3, 2131297077, "field 'etNamaSesuai'", EditText.class);
        this.g = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6FLKartuPelajarFragment.inputChange(view2, z);
            }
        });
        page6FLKartuPelajarFragment.rgJenisKelamin = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298217, "field 'rgJenisKelamin'", RadioGroup.class);
        page6FLKartuPelajarFragment.rbLakiLaki = (RadioButton) Utils.findRequiredViewAsType(view, 2131298148, "field 'rbLakiLaki'", RadioButton.class);
        page6FLKartuPelajarFragment.rbPerempuan = (RadioButton) Utils.findRequiredViewAsType(view, 2131298149, "field 'rbPerempuan'", RadioButton.class);
        page6FLKartuPelajarFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296982, "field 'etFotoID' and method 'fotoID'");
        page6FLKartuPelajarFragment.etFotoID = (EditText) Utils.castView(findRequiredView4, 2131296982, "field 'etFotoID'", EditText.class);
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKartuPelajarFragment.fotoID(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297364, "field 'ivFotoID' and method 'fotoID'");
        page6FLKartuPelajarFragment.ivFotoID = (Page6CSFragment) Utils.castView(findRequiredView5, 2131297364, "field 'ivFotoID'", Page6CSFragment.class);
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKartuPelajarFragment.fotoID(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296981, "field 'etFotoDiri' and method 'fotoDiri'");
        page6FLKartuPelajarFragment.etFotoDiri = (EditText) Utils.castView(findRequiredView6, 2131296981, "field 'etFotoDiri'", EditText.class);
        this.c = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKartuPelajarFragment.fotoDiri(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297362, "field 'ivFotoDiri' and method 'fotoDiri'");
        page6FLKartuPelajarFragment.ivFotoDiri = (Page6CSFragment) Utils.castView(findRequiredView7, 2131297362, "field 'ivFotoDiri'", Page6CSFragment.class);
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKartuPelajarFragment.fotoDiri(view2);
            }
        });
        page6FLKartuPelajarFragment.tilFotoIdentitas = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298531, "field 'tilFotoIdentitas'", LogoutDialog_ViewBinding.class);
        page6FLKartuPelajarFragment.tilNoIdentitas = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilNoIdentitas'", LogoutDialog_ViewBinding.class);
        page6FLKartuPelajarFragment.tilMasaBerlaku = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298591, "field 'tilMasaBerlaku'", LogoutDialog_ViewBinding.class);
        page6FLKartuPelajarFragment.tilNamaSesuai = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298623, "field 'tilNamaSesuai'", LogoutDialog_ViewBinding.class);
        page6FLKartuPelajarFragment.tilFotoDiri = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298530, "field 'tilFotoDiri'", LogoutDialog_ViewBinding.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.d = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKartuPelajarFragment.next(view2);
            }
        });
        page6FLKartuPelajarFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297103, "field 'etFields'"), Utils.findRequiredView(view, 2131297044, "field 'etFields'"), Utils.findRequiredView(view, 2131297077, "field 'etFields'"));
        page6FLKartuPelajarFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299122, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299067, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299099, "field 'tvErrors'", TextView.class));
        page6FLKartuPelajarFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298591, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298623, "field 'tilForms'", LogoutDialog_ViewBinding.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6FLKartuPelajarFragment page6FLKartuPelajarFragment = this.a;
        if (page6FLKartuPelajarFragment != null) {
            this.a = null;
            page6FLKartuPelajarFragment.etNoIdentitas = null;
            page6FLKartuPelajarFragment.etMasaBerlaku = null;
            page6FLKartuPelajarFragment.etNamaSesuai = null;
            page6FLKartuPelajarFragment.rgJenisKelamin = null;
            page6FLKartuPelajarFragment.rbLakiLaki = null;
            page6FLKartuPelajarFragment.rbPerempuan = null;
            page6FLKartuPelajarFragment.llMain = null;
            page6FLKartuPelajarFragment.etFotoID = null;
            page6FLKartuPelajarFragment.ivFotoID = null;
            page6FLKartuPelajarFragment.etFotoDiri = null;
            page6FLKartuPelajarFragment.ivFotoDiri = null;
            page6FLKartuPelajarFragment.tilFotoIdentitas = null;
            page6FLKartuPelajarFragment.tilNoIdentitas = null;
            page6FLKartuPelajarFragment.tilMasaBerlaku = null;
            page6FLKartuPelajarFragment.tilNamaSesuai = null;
            page6FLKartuPelajarFragment.tilFotoDiri = null;
            page6FLKartuPelajarFragment.etFields = null;
            page6FLKartuPelajarFragment.tvErrors = null;
            page6FLKartuPelajarFragment.tilForms = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
