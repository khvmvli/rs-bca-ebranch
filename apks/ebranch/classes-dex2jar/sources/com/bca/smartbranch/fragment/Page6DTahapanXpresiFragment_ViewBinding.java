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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DTahapanXpresiFragment_ViewBinding.class */
public class Page6DTahapanXpresiFragment_ViewBinding implements Unbinder {
    private View a;
    private Page6DTahapanXpresiFragment b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View i;

    public Page6DTahapanXpresiFragment_ViewBinding(final Page6DTahapanXpresiFragment page6DTahapanXpresiFragment, View view) {
        this.b = page6DTahapanXpresiFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        page6DTahapanXpresiFragment.etEmail = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView, 2131296976, "field 'etEmail'", getAnnualFeeAddOnAmount.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTahapanXpresiFragment.inputChange(view2, z);
            }
        });
        page6DTahapanXpresiFragment.tbNoHpCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298448, "field 'tbNoHpCheck'", CheckBox.class);
        page6DTahapanXpresiFragment.tbEmailCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298443, "field 'tbEmailCheck'", CheckBox.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'inputChange'");
        page6DTahapanXpresiFragment.etNoHp = (EditText) Utils.castView(findRequiredView2, 2131297094, "field 'etNoHp'", EditText.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTahapanXpresiFragment.inputChange(view2, z);
            }
        });
        page6DTahapanXpresiFragment.llMobileBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297774, "field 'llMobileBanking'", LinearLayout.class);
        page6DTahapanXpresiFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6DTahapanXpresiFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        page6DTahapanXpresiFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        page6DTahapanXpresiFragment.llInternertBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297691, "field 'llInternertBanking'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanXpresiFragment.next(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131299404, "method 'clikedMBCA'");
        this.i = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanXpresiFragment.clikedMBCA(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297358, "method 'showInfoBanking'");
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanXpresiFragment.showInfoBanking(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297404, "method 'showInfoBanking'");
        this.f = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanXpresiFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanXpresiFragment.showInfoBanking(view2);
            }
        });
        page6DTahapanXpresiFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296976, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"));
        page6DTahapanXpresiFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class));
        page6DTahapanXpresiFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6DTahapanXpresiFragment.txtJudul = resources.getString(2131821646);
        page6DTahapanXpresiFragment.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6DTahapanXpresiFragment page6DTahapanXpresiFragment = this.b;
        if (page6DTahapanXpresiFragment != null) {
            this.b = null;
            page6DTahapanXpresiFragment.etEmail = null;
            page6DTahapanXpresiFragment.tbNoHpCheck = null;
            page6DTahapanXpresiFragment.tbEmailCheck = null;
            page6DTahapanXpresiFragment.etNoHp = null;
            page6DTahapanXpresiFragment.llMobileBanking = null;
            page6DTahapanXpresiFragment.llMain = null;
            page6DTahapanXpresiFragment.tilEmail = null;
            page6DTahapanXpresiFragment.tilNoHp = null;
            page6DTahapanXpresiFragment.llInternertBanking = null;
            page6DTahapanXpresiFragment.etFields = null;
            page6DTahapanXpresiFragment.tvErrors = null;
            page6DTahapanXpresiFragment.tilForms = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.f.setOnClickListener(null);
            this.f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
