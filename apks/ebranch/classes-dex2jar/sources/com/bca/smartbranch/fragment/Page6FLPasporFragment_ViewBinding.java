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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6FLPasporFragment_ViewBinding.class */
public class Page6FLPasporFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private Page6FLPasporFragment c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;

    public Page6FLPasporFragment_ViewBinding(final Page6FLPasporFragment page6FLPasporFragment, View view) {
        this.c = page6FLPasporFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297077, "field 'etNamaSesuai' and method 'inputChange'");
        page6FLPasporFragment.etNamaSesuai = (EditText) Utils.castView(findRequiredView, 2131297077, "field 'etNamaSesuai'", EditText.class);
        this.f = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6FLPasporFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6FLPasporFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297103, "field 'etNoIdentitas' and method 'inputChange'");
        page6FLPasporFragment.etNoIdentitas = (EditText) Utils.castView(findRequiredView2, 2131297103, "field 'etNoIdentitas'", EditText.class);
        this.h = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6FLPasporFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6FLPasporFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297080, "field 'etNegaraPaspor' and method 'onClickNegaraPaspor'");
        page6FLPasporFragment.etNegaraPaspor = (EditText) Utils.castView(findRequiredView3, 2131297080, "field 'etNegaraPaspor'", EditText.class);
        this.g = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLPasporFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLPasporFragment.onClickNegaraPaspor(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297044, "field 'etMasaBerlaku' and method 'showDatePicker'");
        page6FLPasporFragment.etMasaBerlaku = (EditText) Utils.castView(findRequiredView4, 2131297044, "field 'etMasaBerlaku'", EditText.class);
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLPasporFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLPasporFragment.showDatePicker(view2);
            }
        });
        page6FLPasporFragment.rgJenisKelamin = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298217, "field 'rgJenisKelamin'", RadioGroup.class);
        page6FLPasporFragment.rbLakiLaki = (RadioButton) Utils.findRequiredViewAsType(view, 2131298148, "field 'rbLakiLaki'", RadioButton.class);
        page6FLPasporFragment.rbPerempuan = (RadioButton) Utils.findRequiredViewAsType(view, 2131298149, "field 'rbPerempuan'", RadioButton.class);
        page6FLPasporFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296982, "field 'etFotoID' and method 'fotoID'");
        page6FLPasporFragment.etFotoID = (EditText) Utils.castView(findRequiredView5, 2131296982, "field 'etFotoID'", EditText.class);
        this.b = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLPasporFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLPasporFragment.fotoID(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297364, "field 'ivFotoID' and method 'fotoID'");
        page6FLPasporFragment.ivFotoID = (Page6CSFragment) Utils.castView(findRequiredView6, 2131297364, "field 'ivFotoID'", Page6CSFragment.class);
        this.j = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLPasporFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLPasporFragment.fotoID(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296981, "field 'etFotoDiri' and method 'fotoDiri'");
        page6FLPasporFragment.etFotoDiri = (EditText) Utils.castView(findRequiredView7, 2131296981, "field 'etFotoDiri'", EditText.class);
        this.d = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLPasporFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLPasporFragment.fotoDiri(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297362, "field 'ivFotoDiri' and method 'fotoDiri'");
        page6FLPasporFragment.ivFotoDiri = (Page6CSFragment) Utils.castView(findRequiredView8, 2131297362, "field 'ivFotoDiri'", Page6CSFragment.class);
        this.i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLPasporFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLPasporFragment.fotoDiri(view2);
            }
        });
        page6FLPasporFragment.tilFotoIdentitas = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298531, "field 'tilFotoIdentitas'", LogoutDialog_ViewBinding.class);
        page6FLPasporFragment.tilNoIdentitas = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilNoIdentitas'", LogoutDialog_ViewBinding.class);
        page6FLPasporFragment.tilMasaBerlaku = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298591, "field 'tilMasaBerlaku'", LogoutDialog_ViewBinding.class);
        page6FLPasporFragment.tilNamaSesuai = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298623, "field 'tilNamaSesuai'", LogoutDialog_ViewBinding.class);
        page6FLPasporFragment.tilNegaraPaspor = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298626, "field 'tilNegaraPaspor'", LogoutDialog_ViewBinding.class);
        page6FLPasporFragment.tilFotoDiri = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298530, "field 'tilFotoDiri'", LogoutDialog_ViewBinding.class);
        View findRequiredView9 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.a = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FLPasporFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6FLPasporFragment.next(view2);
            }
        });
        page6FLPasporFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297103, "field 'etFields'"), Utils.findRequiredView(view, 2131297044, "field 'etFields'"), Utils.findRequiredView(view, 2131297077, "field 'etFields'"), Utils.findRequiredView(view, 2131297080, "field 'etFields'"));
        page6FLPasporFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299122, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299067, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299099, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299102, "field 'tvErrors'", TextView.class));
        page6FLPasporFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298649, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298591, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298623, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298626, "field 'tilForms'", LogoutDialog_ViewBinding.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6FLPasporFragment page6FLPasporFragment = this.c;
        if (page6FLPasporFragment != null) {
            this.c = null;
            page6FLPasporFragment.etNamaSesuai = null;
            page6FLPasporFragment.etNoIdentitas = null;
            page6FLPasporFragment.etNegaraPaspor = null;
            page6FLPasporFragment.etMasaBerlaku = null;
            page6FLPasporFragment.rgJenisKelamin = null;
            page6FLPasporFragment.rbLakiLaki = null;
            page6FLPasporFragment.rbPerempuan = null;
            page6FLPasporFragment.llMain = null;
            page6FLPasporFragment.etFotoID = null;
            page6FLPasporFragment.ivFotoID = null;
            page6FLPasporFragment.etFotoDiri = null;
            page6FLPasporFragment.ivFotoDiri = null;
            page6FLPasporFragment.tilFotoIdentitas = null;
            page6FLPasporFragment.tilNoIdentitas = null;
            page6FLPasporFragment.tilMasaBerlaku = null;
            page6FLPasporFragment.tilNamaSesuai = null;
            page6FLPasporFragment.tilNegaraPaspor = null;
            page6FLPasporFragment.tilFotoDiri = null;
            page6FLPasporFragment.etFields = null;
            page6FLPasporFragment.tvErrors = null;
            page6FLPasporFragment.tilForms = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
