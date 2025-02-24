package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC14FormKartuKreditPekerjaanFragment_ViewBinding.class */
public class CC14FormKartuKreditPekerjaanFragment_ViewBinding implements Unbinder {
    private View b;
    private CC14FormKartuKreditPekerjaanFragment c;
    private View d;
    private View e;

    public CC14FormKartuKreditPekerjaanFragment_ViewBinding(final CC14FormKartuKreditPekerjaanFragment cC14FormKartuKreditPekerjaanFragment, View view) {
        this.c = cC14FormKartuKreditPekerjaanFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297140, "field 'etPekerjaan' and method 'showPekerjaanDialog'");
        cC14FormKartuKreditPekerjaanFragment.etPekerjaan = (EditText) Utils.castView(findRequiredView, 2131297140, "field 'etPekerjaan'", EditText.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditPekerjaanFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC14FormKartuKreditPekerjaanFragment.showPekerjaanDialog(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297145, "field 'etPenghasilan' and method 'inputChange'");
        cC14FormKartuKreditPekerjaanFragment.etPenghasilan = (EditText) Utils.castView(findRequiredView2, 2131297145, "field 'etPenghasilan'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditPekerjaanFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC14FormKartuKreditPekerjaanFragment.inputChange(view2, z);
            }
        });
        cC14FormKartuKreditPekerjaanFragment.tilPekerjaan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298684, "field 'tilPekerjaan'", LogoutDialog_ViewBinding.class);
        cC14FormKartuKreditPekerjaanFragment.tilPenghasilan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298687, "field 'tilPenghasilan'", LogoutDialog_ViewBinding.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC14FormKartuKreditPekerjaanFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC14FormKartuKreditPekerjaanFragment.next(view2);
            }
        });
        cC14FormKartuKreditPekerjaanFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297140, "field 'etFields'"), Utils.findRequiredView(view, 2131297145, "field 'etFields'"));
        cC14FormKartuKreditPekerjaanFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299153, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299155, "field 'tvErrors'", TextView.class));
        cC14FormKartuKreditPekerjaanFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298684, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298687, "field 'tilForms'", LogoutDialog_ViewBinding.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC14FormKartuKreditPekerjaanFragment cC14FormKartuKreditPekerjaanFragment = this.c;
        if (cC14FormKartuKreditPekerjaanFragment != null) {
            this.c = null;
            cC14FormKartuKreditPekerjaanFragment.etPekerjaan = null;
            cC14FormKartuKreditPekerjaanFragment.etPenghasilan = null;
            cC14FormKartuKreditPekerjaanFragment.tilPekerjaan = null;
            cC14FormKartuKreditPekerjaanFragment.tilPenghasilan = null;
            cC14FormKartuKreditPekerjaanFragment.etFields = null;
            cC14FormKartuKreditPekerjaanFragment.tvErrors = null;
            cC14FormKartuKreditPekerjaanFragment.tilForms = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
