package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.Page6CSFragment;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC14FormKartuKreditFragment_ViewBinding.class */
public class CC14FormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private CC14FormKartuKreditFragment b;
    private View c;
    private View d;
    private View e;

    public CC14FormKartuKreditFragment_ViewBinding(final CC14FormKartuKreditFragment cC14FormKartuKreditFragment, View view) {
        this.b = cC14FormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296983, "field 'etFotoNPWP' and method 'ivfotoNPWP'");
        cC14FormKartuKreditFragment.etFotoNPWP = (EditText) Utils.castView(findRequiredView, 2131296983, "field 'etFotoNPWP'", EditText.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC14FormKartuKreditFragment.ivfotoNPWP(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297365, "field 'ivFotoNPWP' and method 'ivfotoNPWP'");
        cC14FormKartuKreditFragment.ivFotoNPWP = (Page6CSFragment) Utils.castView(findRequiredView2, 2131297365, "field 'ivFotoNPWP'", Page6CSFragment.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC14FormKartuKreditFragment.ivfotoNPWP(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297106, "field 'etNoNpwp' and method 'inputChange'");
        cC14FormKartuKreditFragment.etNoNpwp = (EditText) Utils.castView(findRequiredView3, 2131297106, "field 'etNoNpwp'", EditText.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC14FormKartuKreditFragment.inputChange(view2, z);
            }
        });
        cC14FormKartuKreditFragment.tilNoNpwp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298652, "field 'tilNoNpwp'", LogoutDialog_ViewBinding.class);
        cC14FormKartuKreditFragment.tilFotoNpwp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298532, "field 'tilFotoNpwp'", LogoutDialog_ViewBinding.class);
        cC14FormKartuKreditFragment.tvErrorFotoNpwp = (TextView) Utils.findRequiredViewAsType(view, 2131299010, "field 'tvErrorFotoNpwp'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC14FormKartuKreditFragment.next(view2);
            }
        });
        cC14FormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297106, "field 'etFields'"), Utils.findRequiredView(view, 2131296983, "field 'etFields'"));
        cC14FormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299125, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299010, "field 'tvErrors'", TextView.class));
        cC14FormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298652, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298532, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        cC14FormKartuKreditFragment.invalidFotoNpwp = view.getContext().getResources().getString(2131820964);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC14FormKartuKreditFragment cC14FormKartuKreditFragment = this.b;
        if (cC14FormKartuKreditFragment != null) {
            this.b = null;
            cC14FormKartuKreditFragment.etFotoNPWP = null;
            cC14FormKartuKreditFragment.ivFotoNPWP = null;
            cC14FormKartuKreditFragment.etNoNpwp = null;
            cC14FormKartuKreditFragment.tilNoNpwp = null;
            cC14FormKartuKreditFragment.tilFotoNpwp = null;
            cC14FormKartuKreditFragment.tvErrorFotoNpwp = null;
            cC14FormKartuKreditFragment.etFields = null;
            cC14FormKartuKreditFragment.tvErrors = null;
            cC14FormKartuKreditFragment.tilForms = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
