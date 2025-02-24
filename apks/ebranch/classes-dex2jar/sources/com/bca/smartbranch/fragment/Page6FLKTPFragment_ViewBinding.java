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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6FLKTPFragment_ViewBinding.class */
public class Page6FLKTPFragment_ViewBinding implements Unbinder {
    private View a;
    private Page6FLKTPFragment b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View j;

    public Page6FLKTPFragment_ViewBinding(final Page6FLKTPFragment page6FLKTPFragment, View view) {
        this.b = page6FLKTPFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297077, "field 'etNamaSesuai' and method 'inputChange'");
        page6FLKTPFragment.etNamaSesuai = (EditText) Utils.castView(findRequiredView, 2131297077, "field 'etNamaSesuai'", EditText.class);
        this.f = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6FLKTPFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6FLKTPFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297103, "field 'etNoIdentitas' and method 'inputChange'");
        page6FLKTPFragment.etNoIdentitas = (EditText) Utils.castView(findRequiredView2, 2131297103, "field 'etNoIdentitas'", EditText.class);
        this.g = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6FLKTPFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6FLKTPFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297044, "field 'etMasaBerlaku' and method 'showDatePicker'");
        page6FLKTPFragment.etMasaBerlaku = (EditText) Utils.castView(findRequiredView3, 2131297044, "field 'etMasaBerlaku'", EditText.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKTPFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKTPFragment.showDatePicker(view2);
            }
        });
        page6FLKTPFragment.rgJenisKelamin = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298217, "field 'rgJenisKelamin'", RadioGroup.class);
        page6FLKTPFragment.rbLakiLaki = (RadioButton) Utils.findRequiredViewAsType(view, 2131298148, "field 'rbLakiLaki'", RadioButton.class);
        page6FLKTPFragment.rbPerempuan = (RadioButton) Utils.findRequiredViewAsType(view, 2131298149, "field 'rbPerempuan'", RadioButton.class);
        page6FLKTPFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296982, "field 'etFotoID' and method 'fotoID'");
        page6FLKTPFragment.etFotoID = (EditText) Utils.castView(findRequiredView4, 2131296982, "field 'etFotoID'", EditText.class);
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKTPFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKTPFragment.fotoID(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297364, "field 'ivFotoID' and method 'fotoID'");
        page6FLKTPFragment.ivFotoID = (Page6CSFragment) Utils.castView(findRequiredView5, 2131297364, "field 'ivFotoID'", Page6CSFragment.class);
        this.j = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKTPFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKTPFragment.fotoID(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296981, "field 'etFotoDiri' and method 'fotoDiri'");
        page6FLKTPFragment.etFotoDiri = (EditText) Utils.castView(findRequiredView6, 2131296981, "field 'etFotoDiri'", EditText.class);
        this.a = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKTPFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKTPFragment.fotoDiri(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297362, "field 'ivFotoDiri' and method 'fotoDiri'");
        page6FLKTPFragment.ivFotoDiri = (Page6CSFragment) Utils.castView(findRequiredView7, 2131297362, "field 'ivFotoDiri'", Page6CSFragment.class);
        this.h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKTPFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKTPFragment.fotoDiri(view2);
            }
        });
        page6FLKTPFragment.tilFotoIdentitas = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298531, "field 'tilFotoIdentitas'", LogoutDialog_ViewBinding.class);
        page6FLKTPFragment.tilNoIdentitas = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilNoIdentitas'", LogoutDialog_ViewBinding.class);
        page6FLKTPFragment.tilNamaSesuai = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298623, "field 'tilNamaSesuai'", LogoutDialog_ViewBinding.class);
        page6FLKTPFragment.tilMasaBerlaku = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298591, "field 'tilMasaBerlaku'", LogoutDialog_ViewBinding.class);
        page6FLKTPFragment.tilFotoDiri = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298530, "field 'tilFotoDiri'", LogoutDialog_ViewBinding.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.e = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLKTPFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLKTPFragment.next(view2);
            }
        });
        page6FLKTPFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297077, "field 'etFields'"), Utils.findRequiredView(view, 2131297103, "field 'etFields'"), Utils.findRequiredView(view, 2131297044, "field 'etFields'"));
        page6FLKTPFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299099, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299122, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299067, "field 'tvErrors'", TextView.class));
        page6FLKTPFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298623, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298591, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        page6FLKTPFragment.masaBerlakuEKTP = view.getContext().getResources().getString(2131822369);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6FLKTPFragment page6FLKTPFragment = this.b;
        if (page6FLKTPFragment != null) {
            this.b = null;
            page6FLKTPFragment.etNamaSesuai = null;
            page6FLKTPFragment.etNoIdentitas = null;
            page6FLKTPFragment.etMasaBerlaku = null;
            page6FLKTPFragment.rgJenisKelamin = null;
            page6FLKTPFragment.rbLakiLaki = null;
            page6FLKTPFragment.rbPerempuan = null;
            page6FLKTPFragment.llMain = null;
            page6FLKTPFragment.etFotoID = null;
            page6FLKTPFragment.ivFotoID = null;
            page6FLKTPFragment.etFotoDiri = null;
            page6FLKTPFragment.ivFotoDiri = null;
            page6FLKTPFragment.tilFotoIdentitas = null;
            page6FLKTPFragment.tilNoIdentitas = null;
            page6FLKTPFragment.tilNamaSesuai = null;
            page6FLKTPFragment.tilMasaBerlaku = null;
            page6FLKTPFragment.tilFotoDiri = null;
            page6FLKTPFragment.etFields = null;
            page6FLKTPFragment.tvErrors = null;
            page6FLKTPFragment.tilForms = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
