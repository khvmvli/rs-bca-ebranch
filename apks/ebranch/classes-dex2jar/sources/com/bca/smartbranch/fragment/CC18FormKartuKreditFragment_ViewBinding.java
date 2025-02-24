package com.bca.smartbranch.fragment;

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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC18FormKartuKreditFragment_ViewBinding.class */
public class CC18FormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private CC18FormKartuKreditFragment e;

    public CC18FormKartuKreditFragment_ViewBinding(final CC18FormKartuKreditFragment cC18FormKartuKreditFragment, View view) {
        this.e = cC18FormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296947, "field 'etBankPenerbit' and method 'onClickBankPenerbit'");
        cC18FormKartuKreditFragment.etBankPenerbit = (EditText) Utils.castView(findRequiredView, 2131296947, "field 'etBankPenerbit'", EditText.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC18FormKartuKreditFragment.onClickBankPenerbit();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297104, "field 'etNoKartuKredit' and method 'onChange'");
        cC18FormKartuKreditFragment.etNoKartuKredit = (EditText) Utils.castView(findRequiredView2, 2131297104, "field 'etNoKartuKredit'", EditText.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC18FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297204, "field 'etTanggalExpired' and method 'clickTanggalExp'");
        cC18FormKartuKreditFragment.etTanggalExpired = (EditText) Utils.castView(findRequiredView3, 2131297204, "field 'etTanggalExpired'", EditText.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC18FormKartuKreditFragment.clickTanggalExp(view2);
            }
        });
        cC18FormKartuKreditFragment.llBankPenerbitLain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297535, "field 'llBankPenerbitLain'", LinearLayout.class);
        cC18FormKartuKreditFragment.rgKartuKredit = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298218, "field 'rgKartuKredit'", RadioGroup.class);
        cC18FormKartuKreditFragment.rbYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298194, "field 'rbYa'", RadioButton.class);
        cC18FormKartuKreditFragment.rbTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298183, "field 'rbTidak'", RadioButton.class);
        cC18FormKartuKreditFragment.tilBankPenerbit = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298497, "field 'tilBankPenerbit'", LogoutDialog_ViewBinding.class);
        cC18FormKartuKreditFragment.tilNomorKartuKredit = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298650, "field 'tilNomorKartuKredit'", LogoutDialog_ViewBinding.class);
        cC18FormKartuKreditFragment.tilTanggalExpired = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298736, "field 'tilTanggalExpired'", LogoutDialog_ViewBinding.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.a = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC18FormKartuKreditFragment.next(view2);
            }
        });
        cC18FormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296947, "field 'etFields'"), Utils.findRequiredView(view, 2131297104, "field 'etFields'"), Utils.findRequiredView(view, 2131297204, "field 'etFields'"));
        cC18FormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131298976, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299123, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299204, "field 'tvErrors'", TextView.class));
        cC18FormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298497, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298650, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298736, "field 'tilForms'", LogoutDialog_ViewBinding.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC18FormKartuKreditFragment cC18FormKartuKreditFragment = this.e;
        if (cC18FormKartuKreditFragment != null) {
            this.e = null;
            cC18FormKartuKreditFragment.etBankPenerbit = null;
            cC18FormKartuKreditFragment.etNoKartuKredit = null;
            cC18FormKartuKreditFragment.etTanggalExpired = null;
            cC18FormKartuKreditFragment.llBankPenerbitLain = null;
            cC18FormKartuKreditFragment.rgKartuKredit = null;
            cC18FormKartuKreditFragment.rbYa = null;
            cC18FormKartuKreditFragment.rbTidak = null;
            cC18FormKartuKreditFragment.tilBankPenerbit = null;
            cC18FormKartuKreditFragment.tilNomorKartuKredit = null;
            cC18FormKartuKreditFragment.tilTanggalExpired = null;
            cC18FormKartuKreditFragment.etFields = null;
            cC18FormKartuKreditFragment.tvErrors = null;
            cC18FormKartuKreditFragment.tilForms = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
