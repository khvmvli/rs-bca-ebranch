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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DBCADollarSFragment_ViewBinding.class */
public class Page6DBCADollarSFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private Page6DBCADollarSFragment e;
    private View f;
    private View g;
    private View i;

    public Page6DBCADollarSFragment_ViewBinding(final Page6DBCADollarSFragment page6DBCADollarSFragment, View view) {
        this.e = page6DBCADollarSFragment;
        page6DBCADollarSFragment.tvLanguageATM = (TextView) Utils.findRequiredViewAsType(view, 2131296946, "field 'tvLanguageATM'", TextView.class);
        page6DBCADollarSFragment.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131297047, "field 'tvMataUang'", TextView.class);
        page6DBCADollarSFragment.rgLanguage = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298223, "field 'rgLanguage'", RadioGroup.class);
        page6DBCADollarSFragment.rbLanguageIna = (RadioButton) Utils.findRequiredViewAsType(view, 2131298164, "field 'rbLanguageIna'", RadioButton.class);
        page6DBCADollarSFragment.rbLanguageEng = (RadioButton) Utils.findRequiredViewAsType(view, 2131298163, "field 'rbLanguageEng'", RadioButton.class);
        page6DBCADollarSFragment.rgMataUang = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298225, "field 'rgMataUang'", RadioGroup.class);
        page6DBCADollarSFragment.rbMataUangUsd = (RadioButton) Utils.findRequiredViewAsType(view, 2131298166, "field 'rbMataUangUsd'", RadioButton.class);
        page6DBCADollarSFragment.rbMataUangSgd = (RadioButton) Utils.findRequiredViewAsType(view, 2131298165, "field 'rbMataUangSgd'", RadioButton.class);
        page6DBCADollarSFragment.tbEmailCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298443, "field 'tbEmailCheck'", CheckBox.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        page6DBCADollarSFragment.etEmail = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView, 2131296976, "field 'etEmail'", getAnnualFeeAddOnAmount.class);
        this.a = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarSFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DBCADollarSFragment.inputChange(view2, z);
            }
        });
        page6DBCADollarSFragment.tbNoHpCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298448, "field 'tbNoHpCheck'", CheckBox.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'inputChange'");
        page6DBCADollarSFragment.etNoHp = (EditText) Utils.castView(findRequiredView2, 2131297094, "field 'etNoHp'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarSFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DBCADollarSFragment.inputChange(view2, z);
            }
        });
        page6DBCADollarSFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6DBCADollarSFragment.llInternertBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297691, "field 'llInternertBanking'", LinearLayout.class);
        page6DBCADollarSFragment.llMobileBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297774, "field 'llMobileBanking'", LinearLayout.class);
        page6DBCADollarSFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        page6DBCADollarSFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarSFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DBCADollarSFragment.next(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131299360, "method 'clikedKlikBCA'");
        this.i = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarSFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DBCADollarSFragment.clikedKlikBCA(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131299404, "method 'clikedMBCA'");
        this.f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarSFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DBCADollarSFragment.clikedMBCA(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297358, "method 'showInfoBanking'");
        this.c = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarSFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DBCADollarSFragment.showInfoBanking(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297404, "method 'showInfoBanking'");
        this.g = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarSFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DBCADollarSFragment.showInfoBanking(view2);
            }
        });
        page6DBCADollarSFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296976, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"));
        page6DBCADollarSFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class));
        page6DBCADollarSFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6DBCADollarSFragment.txtJudul = resources.getString(2131821646);
        page6DBCADollarSFragment.txtLanguageATM = resources.getString(2131821339);
        page6DBCADollarSFragment.txtMataUang = resources.getString(2131822062);
        page6DBCADollarSFragment.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6DBCADollarSFragment page6DBCADollarSFragment = this.e;
        if (page6DBCADollarSFragment != null) {
            this.e = null;
            page6DBCADollarSFragment.tvLanguageATM = null;
            page6DBCADollarSFragment.tvMataUang = null;
            page6DBCADollarSFragment.rgLanguage = null;
            page6DBCADollarSFragment.rbLanguageIna = null;
            page6DBCADollarSFragment.rbLanguageEng = null;
            page6DBCADollarSFragment.rgMataUang = null;
            page6DBCADollarSFragment.rbMataUangUsd = null;
            page6DBCADollarSFragment.rbMataUangSgd = null;
            page6DBCADollarSFragment.tbEmailCheck = null;
            page6DBCADollarSFragment.etEmail = null;
            page6DBCADollarSFragment.tbNoHpCheck = null;
            page6DBCADollarSFragment.etNoHp = null;
            page6DBCADollarSFragment.llMain = null;
            page6DBCADollarSFragment.llInternertBanking = null;
            page6DBCADollarSFragment.llMobileBanking = null;
            page6DBCADollarSFragment.tilEmail = null;
            page6DBCADollarSFragment.tilNoHp = null;
            page6DBCADollarSFragment.etFields = null;
            page6DBCADollarSFragment.tvErrors = null;
            page6DBCADollarSFragment.tilForms = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
