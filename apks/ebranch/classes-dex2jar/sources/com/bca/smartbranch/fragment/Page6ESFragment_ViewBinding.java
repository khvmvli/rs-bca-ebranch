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
import o.Page6CSFragment;
import o.getAnnualFeeAddOnAmount;
import o.setCurrentItem;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6ESFragment_ViewBinding.class */
public class Page6ESFragment_ViewBinding implements Unbinder {
    private View a;
    private Page6ESFragment b;
    private View c;
    private View d;
    private View e;
    private View f;

    public Page6ESFragment_ViewBinding(final Page6ESFragment page6ESFragment, View view) {
        this.b = page6ESFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297092, "field 'etNoATM' and method 'inputChange'");
        page6ESFragment.etNoATM = (setCurrentItem) Utils.castView(findRequiredView, 2131297092, "field 'etNoATM'", setCurrentItem.class);
        this.d = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6ESFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6ESFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296981, "field 'etFotoDiri' and method 'fotoDiri'");
        page6ESFragment.etFotoDiri = (EditText) Utils.castView(findRequiredView2, 2131296981, "field 'etFotoDiri'", EditText.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ESFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ESFragment.fotoDiri(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297362, "field 'ivFotoDiri' and method 'ivfotoDiri'");
        page6ESFragment.ivFotoDiri = (Page6CSFragment) Utils.castView(findRequiredView3, 2131297362, "field 'ivFotoDiri'", Page6CSFragment.class);
        this.f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ESFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ESFragment.ivfotoDiri(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296976, "field 'etEmailGuest' and method 'inputChange'");
        page6ESFragment.etEmailGuest = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView4, 2131296976, "field 'etEmailGuest'", getAnnualFeeAddOnAmount.class);
        this.e = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6ESFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6ESFragment.inputChange(view2, z);
            }
        });
        page6ESFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6ESFragment.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        page6ESFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        page6ESFragment.tilNoAtm = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298638, "field 'tilNoAtm'", LogoutDialog_ViewBinding.class);
        page6ESFragment.tilFotoDiri = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298530, "field 'tilFotoDiri'", LogoutDialog_ViewBinding.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.a = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ESFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ESFragment.next(view2);
            }
        });
        page6ESFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297092, "field 'etFields'"), Utils.findRequiredView(view, 2131296976, "field 'etFields'"));
        page6ESFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298638, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        page6ESFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299114, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class));
        Resources resources = view.getContext().getResources();
        page6ESFragment.txtTitle = resources.getString(2131821887);
        page6ESFragment.hintAtm = resources.getString(2131821161);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6ESFragment page6ESFragment = this.b;
        if (page6ESFragment != null) {
            this.b = null;
            page6ESFragment.etNoATM = null;
            page6ESFragment.etFotoDiri = null;
            page6ESFragment.ivFotoDiri = null;
            page6ESFragment.etEmailGuest = null;
            page6ESFragment.llMain = null;
            page6ESFragment.tvTitle = null;
            page6ESFragment.tilEmail = null;
            page6ESFragment.tilNoAtm = null;
            page6ESFragment.tilFotoDiri = null;
            page6ESFragment.etFields = null;
            page6ESFragment.tilForms = null;
            page6ESFragment.tvErrors = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
