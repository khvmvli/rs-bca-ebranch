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
import o.getAnnualFeeAddOnAmount;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6HLFragment_ViewBinding.class */
public class Page6HLFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private Page6HLFragment c;
    private View d;
    private View e;
    private View h;
    private View i;

    public Page6HLFragment_ViewBinding(final Page6HLFragment page6HLFragment, View view) {
        this.c = page6HLFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297019, "field 'etKodeArea' and method 'inputChange'");
        page6HLFragment.etKodeArea = (EditText) Utils.castView(findRequiredView, 2131297019, "field 'etKodeArea'", EditText.class);
        this.a = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6HLFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6HLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297115, "field 'etNoTelepon' and method 'inputChange'");
        page6HLFragment.etNoTelepon = (EditText) Utils.castView(findRequiredView2, 2131297115, "field 'etNoTelepon'", EditText.class);
        this.i = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6HLFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6HLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297021, "field 'etKodeNegara' and method 'inputChange'");
        page6HLFragment.etKodeNegara = (EditText) Utils.castView(findRequiredView3, 2131297021, "field 'etKodeNegara'", EditText.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6HLFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6HLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'inputChange'");
        page6HLFragment.etNoHp = (EditText) Utils.castView(findRequiredView4, 2131297094, "field 'etNoHp'", EditText.class);
        this.h = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6HLFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6HLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296978, "field 'etEmailGuest' and method 'inputChange'");
        page6HLFragment.etEmailGuest = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView5, 2131296978, "field 'etEmailGuest'", getAnnualFeeAddOnAmount.class);
        this.e = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6HLFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6HLFragment.inputChange(view2, z);
            }
        });
        page6HLFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6HLFragment.tilKodeArea = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298565, "field 'tilKodeArea'", LogoutDialog_ViewBinding.class);
        page6HLFragment.tilNoTelepon = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298661, "field 'tilNoTelepon'", LogoutDialog_ViewBinding.class);
        page6HLFragment.tilKodeNegara = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298567, "field 'tilKodeNegara'", LogoutDialog_ViewBinding.class);
        page6HLFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        page6HLFragment.tilEmailGuest = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298528, "field 'tilEmailGuest'", LogoutDialog_ViewBinding.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.b = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6HLFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6HLFragment.next(view2);
            }
        });
        page6HLFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297021, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"), Utils.findRequiredView(view, 2131296978, "field 'etFields'"), Utils.findRequiredView(view, 2131297019, "field 'etFields'"), Utils.findRequiredView(view, 2131297115, "field 'etFields'"));
        page6HLFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299043, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299007, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299041, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299134, "field 'tvErrors'", TextView.class));
        page6HLFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298567, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298528, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298565, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298661, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6HLFragment.invalidHandphoneMessage = resources.getString(2131820903);
        page6HLFragment.invalidTeleponMessage = resources.getString(2131820953);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6HLFragment page6HLFragment = this.c;
        if (page6HLFragment != null) {
            this.c = null;
            page6HLFragment.etKodeArea = null;
            page6HLFragment.etNoTelepon = null;
            page6HLFragment.etKodeNegara = null;
            page6HLFragment.etNoHp = null;
            page6HLFragment.etEmailGuest = null;
            page6HLFragment.llMain = null;
            page6HLFragment.tilKodeArea = null;
            page6HLFragment.tilNoTelepon = null;
            page6HLFragment.tilKodeNegara = null;
            page6HLFragment.tilNoHp = null;
            page6HLFragment.tilEmailGuest = null;
            page6HLFragment.etFields = null;
            page6HLFragment.tvErrors = null;
            page6HLFragment.tilForms = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
