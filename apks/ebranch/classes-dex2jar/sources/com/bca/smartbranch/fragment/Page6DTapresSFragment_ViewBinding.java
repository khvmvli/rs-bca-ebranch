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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DTapresSFragment_ViewBinding.class */
public class Page6DTapresSFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private Page6DTapresSFragment d;
    private View e;
    private View g;
    private View h;
    private View i;

    public Page6DTapresSFragment_ViewBinding(final Page6DTapresSFragment page6DTapresSFragment, View view) {
        this.d = page6DTapresSFragment;
        page6DTapresSFragment.tvLanguageATM = (TextView) Utils.findRequiredViewAsType(view, 2131296946, "field 'tvLanguageATM'", TextView.class);
        page6DTapresSFragment.rgLanguage = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298223, "field 'rgLanguage'", RadioGroup.class);
        page6DTapresSFragment.rbLanguageIna = (RadioButton) Utils.findRequiredViewAsType(view, 2131298164, "field 'rbLanguageIna'", RadioButton.class);
        page6DTapresSFragment.rbLanguageEng = (RadioButton) Utils.findRequiredViewAsType(view, 2131298163, "field 'rbLanguageEng'", RadioButton.class);
        page6DTapresSFragment.tbEmailCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298443, "field 'tbEmailCheck'", CheckBox.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        page6DTapresSFragment.etEmail = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView, 2131296976, "field 'etEmail'", getAnnualFeeAddOnAmount.class);
        this.c = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresSFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTapresSFragment.inputChange(view2, z);
            }
        });
        page6DTapresSFragment.tbNoHpCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298448, "field 'tbNoHpCheck'", CheckBox.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'inputChange'");
        page6DTapresSFragment.etNoHp = (EditText) Utils.castView(findRequiredView2, 2131297094, "field 'etNoHp'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresSFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTapresSFragment.inputChange(view2, z);
            }
        });
        page6DTapresSFragment.llInternertBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297691, "field 'llInternertBanking'", LinearLayout.class);
        page6DTapresSFragment.llMobileBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297774, "field 'llMobileBanking'", LinearLayout.class);
        page6DTapresSFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6DTapresSFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        page6DTapresSFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresSFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTapresSFragment.next(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131299360, "method 'clikedKlikBCA'");
        this.i = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresSFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTapresSFragment.clikedKlikBCA(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131299404, "method 'clikedMBCA'");
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresSFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTapresSFragment.clikedMBCA(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297358, "method 'showInfoBanking'");
        this.a = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresSFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTapresSFragment.showInfoBanking(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297404, "method 'showInfoBanking'");
        this.g = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTapresSFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTapresSFragment.showInfoBanking(view2);
            }
        });
        page6DTapresSFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296976, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"));
        page6DTapresSFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class));
        page6DTapresSFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6DTapresSFragment.txtJudul = resources.getString(2131821646);
        page6DTapresSFragment.txtLanguageATM = resources.getString(2131821339);
        page6DTapresSFragment.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6DTapresSFragment page6DTapresSFragment = this.d;
        if (page6DTapresSFragment != null) {
            this.d = null;
            page6DTapresSFragment.tvLanguageATM = null;
            page6DTapresSFragment.rgLanguage = null;
            page6DTapresSFragment.rbLanguageIna = null;
            page6DTapresSFragment.rbLanguageEng = null;
            page6DTapresSFragment.tbEmailCheck = null;
            page6DTapresSFragment.etEmail = null;
            page6DTapresSFragment.tbNoHpCheck = null;
            page6DTapresSFragment.etNoHp = null;
            page6DTapresSFragment.llInternertBanking = null;
            page6DTapresSFragment.llMobileBanking = null;
            page6DTapresSFragment.llMain = null;
            page6DTapresSFragment.tilEmail = null;
            page6DTapresSFragment.tilNoHp = null;
            page6DTapresSFragment.etFields = null;
            page6DTapresSFragment.tvErrors = null;
            page6DTapresSFragment.tilForms = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
