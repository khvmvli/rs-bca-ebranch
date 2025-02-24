package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.getAnnualFeeAddOnAmount;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DBCADollarFragment_ViewBinding.class */
public class Page6DBCADollarFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private Page6DBCADollarFragment c;
    private View d;
    private View e;
    private View g;
    private View h;
    private View i;

    public Page6DBCADollarFragment_ViewBinding(final Page6DBCADollarFragment page6DBCADollarFragment, View view) {
        this.c = page6DBCADollarFragment;
        page6DBCADollarFragment.tvLanguageATM = (TextView) Utils.findRequiredViewAsType(view, 2131296946, "field 'tvLanguageATM'", TextView.class);
        page6DBCADollarFragment.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131297047, "field 'tvMataUang'", TextView.class);
        page6DBCADollarFragment.rgLanguage = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298223, "field 'rgLanguage'", RadioGroup.class);
        page6DBCADollarFragment.rbLanguageIna = (RadioButton) Utils.findRequiredViewAsType(view, 2131298164, "field 'rbLanguageIna'", RadioButton.class);
        page6DBCADollarFragment.rbLanguageEng = (RadioButton) Utils.findRequiredViewAsType(view, 2131298163, "field 'rbLanguageEng'", RadioButton.class);
        page6DBCADollarFragment.rgMataUang = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298225, "field 'rgMataUang'", RadioGroup.class);
        page6DBCADollarFragment.rbMataUangUsd = (RadioButton) Utils.findRequiredViewAsType(view, 2131298166, "field 'rbMataUangUsd'", RadioButton.class);
        page6DBCADollarFragment.rbMataUangSgd = (RadioButton) Utils.findRequiredViewAsType(view, 2131298165, "field 'rbMataUangSgd'", RadioButton.class);
        page6DBCADollarFragment.tbEmailCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298443, "field 'tbEmailCheck'", CheckBox.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        page6DBCADollarFragment.etEmail = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView, 2131296976, "field 'etEmail'", getAnnualFeeAddOnAmount.class);
        this.d = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DBCADollarFragment.inputChange(view2, z);
            }
        });
        page6DBCADollarFragment.tbNoHpCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298448, "field 'tbNoHpCheck'", CheckBox.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'inputChange'");
        page6DBCADollarFragment.etNoHp = (EditText) Utils.castView(findRequiredView2, 2131297094, "field 'etNoHp'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DBCADollarFragment.inputChange(view2, z);
            }
        });
        page6DBCADollarFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6DBCADollarFragment.llInternertBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297691, "field 'llInternertBanking'", LinearLayout.class);
        page6DBCADollarFragment.llMobileBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297774, "field 'llMobileBanking'", LinearLayout.class);
        page6DBCADollarFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        page6DBCADollarFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DBCADollarFragment.next(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131299360, "method 'clikedKlikBCA'");
        this.h = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DBCADollarFragment.clikedKlikBCA(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131299404, "method 'clikedMBCA'");
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DBCADollarFragment.clikedMBCA(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297358, "method 'showInfoBanking'");
        this.e = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DBCADollarFragment.showInfoBanking(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297404, "method 'showInfoBanking'");
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DBCADollarFragment.showInfoBanking(view2);
            }
        });
        page6DBCADollarFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296976, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"));
        page6DBCADollarFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class));
        page6DBCADollarFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6DBCADollarFragment.txtJudul = resources.getString(2131821646);
        page6DBCADollarFragment.txtLanguageATM = resources.getString(2131821339);
        page6DBCADollarFragment.txtMataUang = resources.getString(2131822062);
        page6DBCADollarFragment.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6DBCADollarFragment page6DBCADollarFragment = this.c;
        if (page6DBCADollarFragment != null) {
            this.c = null;
            page6DBCADollarFragment.tvLanguageATM = null;
            page6DBCADollarFragment.tvMataUang = null;
            page6DBCADollarFragment.rgLanguage = null;
            page6DBCADollarFragment.rbLanguageIna = null;
            page6DBCADollarFragment.rbLanguageEng = null;
            page6DBCADollarFragment.rgMataUang = null;
            page6DBCADollarFragment.rbMataUangUsd = null;
            page6DBCADollarFragment.rbMataUangSgd = null;
            page6DBCADollarFragment.tbEmailCheck = null;
            page6DBCADollarFragment.etEmail = null;
            page6DBCADollarFragment.tbNoHpCheck = null;
            page6DBCADollarFragment.etNoHp = null;
            page6DBCADollarFragment.llMain = null;
            page6DBCADollarFragment.llInternertBanking = null;
            page6DBCADollarFragment.llMobileBanking = null;
            page6DBCADollarFragment.tilEmail = null;
            page6DBCADollarFragment.tilNoHp = null;
            page6DBCADollarFragment.etFields = null;
            page6DBCADollarFragment.tvErrors = null;
            page6DBCADollarFragment.tilForms = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.i.setOnClickListener(null);
            this.i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
