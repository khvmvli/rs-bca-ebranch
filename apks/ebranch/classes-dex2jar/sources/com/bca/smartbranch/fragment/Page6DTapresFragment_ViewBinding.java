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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DTapresFragment_ViewBinding.class */
public class Page6DTapresFragment_ViewBinding implements Unbinder {
    private Page6DTapresFragment a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View j;

    public Page6DTapresFragment_ViewBinding(final Page6DTapresFragment page6DTapresFragment, View view) {
        this.a = page6DTapresFragment;
        page6DTapresFragment.tvLanguageATM = (TextView) Utils.findRequiredViewAsType(view, 2131296946, "field 'tvLanguageATM'", TextView.class);
        page6DTapresFragment.rgLanguage = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298223, "field 'rgLanguage'", RadioGroup.class);
        page6DTapresFragment.rbLanguageIna = (RadioButton) Utils.findRequiredViewAsType(view, 2131298164, "field 'rbLanguageIna'", RadioButton.class);
        page6DTapresFragment.rbLanguageEng = (RadioButton) Utils.findRequiredViewAsType(view, 2131298163, "field 'rbLanguageEng'", RadioButton.class);
        page6DTapresFragment.tbEmailCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298443, "field 'tbEmailCheck'", CheckBox.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        page6DTapresFragment.etEmail = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView, 2131296976, "field 'etEmail'", getAnnualFeeAddOnAmount.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTapresFragment.inputChange(view2, z);
            }
        });
        page6DTapresFragment.tbNoHpCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298448, "field 'tbNoHpCheck'", CheckBox.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'inputChange'");
        page6DTapresFragment.etNoHp = (EditText) Utils.castView(findRequiredView2, 2131297094, "field 'etNoHp'", EditText.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTapresFragment.inputChange(view2, z);
            }
        });
        page6DTapresFragment.llInternertBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297691, "field 'llInternertBanking'", LinearLayout.class);
        page6DTapresFragment.llMobileBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297774, "field 'llMobileBanking'", LinearLayout.class);
        page6DTapresFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6DTapresFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        page6DTapresFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTapresFragment.next(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131299360, "method 'clikedKlikBCA'");
        this.f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTapresFragment.clikedKlikBCA(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131299404, "method 'clikedMBCA'");
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTapresFragment.clikedMBCA(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297358, "method 'showInfoBanking'");
        this.d = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTapresFragment.showInfoBanking(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297404, "method 'showInfoBanking'");
        this.j = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTapresFragment.showInfoBanking(view2);
            }
        });
        page6DTapresFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296976, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"));
        page6DTapresFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class));
        page6DTapresFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6DTapresFragment.txtJudul = resources.getString(2131821646);
        page6DTapresFragment.txtLanguageATM = resources.getString(2131821339);
        page6DTapresFragment.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6DTapresFragment page6DTapresFragment = this.a;
        if (page6DTapresFragment != null) {
            this.a = null;
            page6DTapresFragment.tvLanguageATM = null;
            page6DTapresFragment.rgLanguage = null;
            page6DTapresFragment.rbLanguageIna = null;
            page6DTapresFragment.rbLanguageEng = null;
            page6DTapresFragment.tbEmailCheck = null;
            page6DTapresFragment.etEmail = null;
            page6DTapresFragment.tbNoHpCheck = null;
            page6DTapresFragment.etNoHp = null;
            page6DTapresFragment.llInternertBanking = null;
            page6DTapresFragment.llMobileBanking = null;
            page6DTapresFragment.llMain = null;
            page6DTapresFragment.tilEmail = null;
            page6DTapresFragment.tilNoHp = null;
            page6DTapresFragment.etFields = null;
            page6DTapresFragment.tvErrors = null;
            page6DTapresFragment.tilForms = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.j.setOnClickListener(null);
            this.j = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
