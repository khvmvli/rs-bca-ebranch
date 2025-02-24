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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC19FormKartuKreditFragment_ViewBinding.class */
public class CC19FormKartuKreditFragment_ViewBinding implements Unbinder {
    private CC19FormKartuKreditFragment a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View h;
    private View i;

    public CC19FormKartuKreditFragment_ViewBinding(final CC19FormKartuKreditFragment cC19FormKartuKreditFragment, View view) {
        this.a = cC19FormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297040, "field 'etKrisFlyer' and method 'onChange'");
        cC19FormKartuKreditFragment.etKrisFlyer = (EditText) Utils.castView(findRequiredView, 2131297040, "field 'etKrisFlyer'", EditText.class);
        this.f = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC19FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297027, "field 'etKodePromosi' and method 'onChange'");
        cC19FormKartuKreditFragment.etKodePromosi = (EditText) Utils.castView(findRequiredView2, 2131297027, "field 'etKodePromosi'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC19FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297028, "field 'etKodeReferal' and method 'onChange'");
        cC19FormKartuKreditFragment.etKodeReferal = (EditText) Utils.castView(findRequiredView3, 2131297028, "field 'etKodeReferal'", EditText.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC19FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297063, "field 'etNamaMarketing' and method 'onChange'");
        cC19FormKartuKreditFragment.etNamaMarketing = (EditText) Utils.castView(findRequiredView4, 2131297063, "field 'etNamaMarketing'", EditText.class);
        this.i = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC19FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297173, "field 'etSalesNIP' and method 'onChange'");
        cC19FormKartuKreditFragment.etSalesNIP = (EditText) Utils.castView(findRequiredView5, 2131297173, "field 'etSalesNIP'", EditText.class);
        this.h = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC19FormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297020, "field 'etKodeCabang' and method 'onChange'");
        cC19FormKartuKreditFragment.etKodeCabang = (EditText) Utils.castView(findRequiredView6, 2131297020, "field 'etKodeCabang'", EditText.class);
        this.e = findRequiredView6;
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment_ViewBinding.8
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC19FormKartuKreditFragment.onChange(view2, z);
            }
        });
        cC19FormKartuKreditFragment.llMarketing = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297769, "field 'llMarketing'", LinearLayout.class);
        cC19FormKartuKreditFragment.rgMarketing = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298224, "field 'rgMarketing'", RadioGroup.class);
        cC19FormKartuKreditFragment.rbYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298194, "field 'rbYa'", RadioButton.class);
        cC19FormKartuKreditFragment.rbTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298183, "field 'rbTidak'", RadioButton.class);
        cC19FormKartuKreditFragment.rgPromoCode = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298220, "field 'rgPromoCode'", RadioGroup.class);
        cC19FormKartuKreditFragment.rbPromoCodeYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298156, "field 'rbPromoCodeYa'", RadioButton.class);
        cC19FormKartuKreditFragment.rbPromoCodeTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298155, "field 'rbPromoCodeTidak'", RadioButton.class);
        cC19FormKartuKreditFragment.rgReferalCode = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298221, "field 'rgReferalCode'", RadioGroup.class);
        cC19FormKartuKreditFragment.rbReferalCodeYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298158, "field 'rbReferalCodeYa'", RadioButton.class);
        cC19FormKartuKreditFragment.rbReferalCodeTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298157, "field 'rbReferalCodeTidak'", RadioButton.class);
        cC19FormKartuKreditFragment.rgKrisFlyer = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298222, "field 'rgKrisFlyer'", RadioGroup.class);
        cC19FormKartuKreditFragment.rbKrisFlyerYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298160, "field 'rbKrisFlyerYa'", RadioButton.class);
        cC19FormKartuKreditFragment.rbKrisFlyerTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298159, "field 'rbKrisFlyerTidak'", RadioButton.class);
        cC19FormKartuKreditFragment.tilKrisFlyer = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298587, "field 'tilKrisFlyer'", LogoutDialog_ViewBinding.class);
        cC19FormKartuKreditFragment.tilKodePromosi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298573, "field 'tilKodePromosi'", LogoutDialog_ViewBinding.class);
        cC19FormKartuKreditFragment.tilKodeReferal = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298575, "field 'tilKodeReferal'", LogoutDialog_ViewBinding.class);
        cC19FormKartuKreditFragment.tilNamaMarketing = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298610, "field 'tilNamaMarketing'", LogoutDialog_ViewBinding.class);
        cC19FormKartuKreditFragment.tilSalesNIP = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298709, "field 'tilSalesNIP'", LogoutDialog_ViewBinding.class);
        cC19FormKartuKreditFragment.tilKodeCabang = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298566, "field 'tilKodeCabang'", LogoutDialog_ViewBinding.class);
        cC19FormKartuKreditFragment.llWrapperKrisFlyer = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297958, "field 'llWrapperKrisFlyer'", LinearLayout.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.c = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC19FormKartuKreditFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC19FormKartuKreditFragment.next(view2);
            }
        });
        cC19FormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297040, "field 'etFields'"), Utils.findRequiredView(view, 2131297027, "field 'etFields'"), Utils.findRequiredView(view, 2131297028, "field 'etFields'"), Utils.findRequiredView(view, 2131297063, "field 'etFields'"), Utils.findRequiredView(view, 2131297173, "field 'etFields'"), Utils.findRequiredView(view, 2131297020, "field 'etFields'"));
        cC19FormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299063, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299050, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299051, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299087, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299113, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299042, "field 'tvErrors'", TextView.class));
        cC19FormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298587, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298573, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298575, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298610, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298709, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298566, "field 'tilForms'", LogoutDialog_ViewBinding.class));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC19FormKartuKreditFragment cC19FormKartuKreditFragment = this.a;
        if (cC19FormKartuKreditFragment != null) {
            this.a = null;
            cC19FormKartuKreditFragment.etKrisFlyer = null;
            cC19FormKartuKreditFragment.etKodePromosi = null;
            cC19FormKartuKreditFragment.etKodeReferal = null;
            cC19FormKartuKreditFragment.etNamaMarketing = null;
            cC19FormKartuKreditFragment.etSalesNIP = null;
            cC19FormKartuKreditFragment.etKodeCabang = null;
            cC19FormKartuKreditFragment.llMarketing = null;
            cC19FormKartuKreditFragment.rgMarketing = null;
            cC19FormKartuKreditFragment.rbYa = null;
            cC19FormKartuKreditFragment.rbTidak = null;
            cC19FormKartuKreditFragment.rgPromoCode = null;
            cC19FormKartuKreditFragment.rbPromoCodeYa = null;
            cC19FormKartuKreditFragment.rbPromoCodeTidak = null;
            cC19FormKartuKreditFragment.rgReferalCode = null;
            cC19FormKartuKreditFragment.rbReferalCodeYa = null;
            cC19FormKartuKreditFragment.rbReferalCodeTidak = null;
            cC19FormKartuKreditFragment.rgKrisFlyer = null;
            cC19FormKartuKreditFragment.rbKrisFlyerYa = null;
            cC19FormKartuKreditFragment.rbKrisFlyerTidak = null;
            cC19FormKartuKreditFragment.tilKrisFlyer = null;
            cC19FormKartuKreditFragment.tilKodePromosi = null;
            cC19FormKartuKreditFragment.tilKodeReferal = null;
            cC19FormKartuKreditFragment.tilNamaMarketing = null;
            cC19FormKartuKreditFragment.tilSalesNIP = null;
            cC19FormKartuKreditFragment.tilKodeCabang = null;
            cC19FormKartuKreditFragment.llWrapperKrisFlyer = null;
            cC19FormKartuKreditFragment.etFields = null;
            cC19FormKartuKreditFragment.tvErrors = null;
            cC19FormKartuKreditFragment.tilForms = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
