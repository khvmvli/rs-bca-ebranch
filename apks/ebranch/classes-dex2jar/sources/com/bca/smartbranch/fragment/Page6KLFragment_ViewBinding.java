package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.Page6CSFragment;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6KLFragment_ViewBinding.class */
public class Page6KLFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private Page6KLFragment e;
    private View f;

    public Page6KLFragment_ViewBinding(final Page6KLFragment page6KLFragment, View view) {
        this.e = page6KLFragment;
        page6KLFragment.rgNPWP = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298229, "field 'rgNPWP'", RadioGroup.class);
        page6KLFragment.rbNPWP_Y = (RadioButton) Utils.findRequiredViewAsType(view, 2131298173, "field 'rbNPWP_Y'", RadioButton.class);
        page6KLFragment.rbNPWP_N = (RadioButton) Utils.findRequiredViewAsType(view, 2131298172, "field 'rbNPWP_N'", RadioButton.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297189, "field 'etStatusNPWP' and method 'onCLickStatusNpwp'");
        page6KLFragment.etStatusNPWP = (EditText) Utils.castView(findRequiredView, 2131297189, "field 'etStatusNPWP'", EditText.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6KLFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6KLFragment.onCLickStatusNpwp(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297106, "field 'etNoNPWP' and method 'inputChange'");
        page6KLFragment.etNoNPWP = (EditText) Utils.castView(findRequiredView2, 2131297106, "field 'etNoNPWP'", EditText.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6KLFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6KLFragment.inputChange(view2, z);
            }
        });
        page6KLFragment.tvPunyaNPWP = (TextView) Utils.findRequiredViewAsType(view, 2131298832, "field 'tvPunyaNPWP'", TextView.class);
        page6KLFragment.llPunyaNPWP = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297866, "field 'llPunyaNPWP'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296983, "field 'etFotoNPWP' and method 'ivfotoNPWP'");
        page6KLFragment.etFotoNPWP = (EditText) Utils.castView(findRequiredView3, 2131296983, "field 'etFotoNPWP'", EditText.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6KLFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6KLFragment.ivfotoNPWP(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297365, "field 'ivFotoNPWP' and method 'ivfotoNPWP'");
        page6KLFragment.ivFotoNPWP = (Page6CSFragment) Utils.castView(findRequiredView4, 2131297365, "field 'ivFotoNPWP'", Page6CSFragment.class);
        this.f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6KLFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6KLFragment.ivfotoNPWP(view2);
            }
        });
        page6KLFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6KLFragment.tilStatusNpwp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298721, "field 'tilStatusNpwp'", LogoutDialog_ViewBinding.class);
        page6KLFragment.tilNoNpwp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298652, "field 'tilNoNpwp'", LogoutDialog_ViewBinding.class);
        page6KLFragment.tilFotoNpwp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298532, "field 'tilFotoNpwp'", LogoutDialog_ViewBinding.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.b = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6KLFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6KLFragment.next(view2);
            }
        });
        page6KLFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297189, "field 'etFields'"), Utils.findRequiredView(view, 2131297106, "field 'etFields'"));
        page6KLFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299189, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299125, "field 'tvErrors'", TextView.class));
        page6KLFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298721, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298652, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6KLFragment.invalidNpwpLengthMessage = resources.getString(2131820941);
        page6KLFragment.invalidNpwpOrangtuaLengthMessage = resources.getString(2131820944);
        page6KLFragment.invalidNpwpOrangtuaEmptyMessage = resources.getString(2131820943);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6KLFragment page6KLFragment = this.e;
        if (page6KLFragment != null) {
            this.e = null;
            page6KLFragment.rgNPWP = null;
            page6KLFragment.rbNPWP_Y = null;
            page6KLFragment.rbNPWP_N = null;
            page6KLFragment.etStatusNPWP = null;
            page6KLFragment.etNoNPWP = null;
            page6KLFragment.tvPunyaNPWP = null;
            page6KLFragment.llPunyaNPWP = null;
            page6KLFragment.etFotoNPWP = null;
            page6KLFragment.ivFotoNPWP = null;
            page6KLFragment.llMain = null;
            page6KLFragment.tilStatusNpwp = null;
            page6KLFragment.tilNoNpwp = null;
            page6KLFragment.tilFotoNpwp = null;
            page6KLFragment.etFields = null;
            page6KLFragment.tvErrors = null;
            page6KLFragment.tilForms = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
