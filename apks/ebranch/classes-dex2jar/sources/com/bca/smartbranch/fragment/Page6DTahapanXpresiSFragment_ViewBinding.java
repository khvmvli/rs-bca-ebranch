package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.getAnnualFeeAddOnAmount;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DTahapanXpresiSFragment_ViewBinding.class */
public class Page6DTahapanXpresiSFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private Page6DTahapanXpresiSFragment e;
    private View f;
    private View g;

    public Page6DTahapanXpresiSFragment_ViewBinding(final Page6DTahapanXpresiSFragment page6DTahapanXpresiSFragment, View view) {
        this.e = page6DTahapanXpresiSFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        page6DTahapanXpresiSFragment.etEmail = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView, 2131296976, "field 'etEmail'", getAnnualFeeAddOnAmount.class);
        this.d = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiSFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTahapanXpresiSFragment.inputChange(view2, z);
            }
        });
        page6DTahapanXpresiSFragment.tbNoHpCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298448, "field 'tbNoHpCheck'", CheckBox.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'inputChange'");
        page6DTahapanXpresiSFragment.etNoHp = (EditText) Utils.castView(findRequiredView2, 2131297094, "field 'etNoHp'", EditText.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiSFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTahapanXpresiSFragment.inputChange(view2, z);
            }
        });
        page6DTahapanXpresiSFragment.tbEmailCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298443, "field 'tbEmailCheck'", CheckBox.class);
        page6DTahapanXpresiSFragment.llMobileBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297774, "field 'llMobileBanking'", LinearLayout.class);
        page6DTahapanXpresiSFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6DTahapanXpresiSFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        page6DTahapanXpresiSFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        page6DTahapanXpresiSFragment.llInternertBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297691, "field 'llInternertBanking'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiSFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanXpresiSFragment.next(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131299404, "method 'clikedMBCA'");
        this.f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiSFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanXpresiSFragment.clikedMBCA(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297358, "method 'showInfoBanking'");
        this.a = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiSFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanXpresiSFragment.showInfoBanking(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297404, "method 'showInfoBanking'");
        this.g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiSFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanXpresiSFragment.showInfoBanking(view2);
            }
        });
        page6DTahapanXpresiSFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296976, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"));
        page6DTahapanXpresiSFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class));
        page6DTahapanXpresiSFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6DTahapanXpresiSFragment.txtJudul = resources.getString(2131821646);
        page6DTahapanXpresiSFragment.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6DTahapanXpresiSFragment page6DTahapanXpresiSFragment = this.e;
        if (page6DTahapanXpresiSFragment != null) {
            this.e = null;
            page6DTahapanXpresiSFragment.etEmail = null;
            page6DTahapanXpresiSFragment.tbNoHpCheck = null;
            page6DTahapanXpresiSFragment.etNoHp = null;
            page6DTahapanXpresiSFragment.tbEmailCheck = null;
            page6DTahapanXpresiSFragment.llMobileBanking = null;
            page6DTahapanXpresiSFragment.llMain = null;
            page6DTahapanXpresiSFragment.tilEmail = null;
            page6DTahapanXpresiSFragment.tilNoHp = null;
            page6DTahapanXpresiSFragment.llInternertBanking = null;
            page6DTahapanXpresiSFragment.etFields = null;
            page6DTahapanXpresiSFragment.tvErrors = null;
            page6DTahapanXpresiSFragment.tilForms = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
