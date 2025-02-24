package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6DataLainnyaFragment_ViewBinding.class */
public class OR6DataLainnyaFragment_ViewBinding implements Unbinder {
    private OR6DataLainnyaFragment a;
    private View c;
    private View d;
    private View e;

    public OR6DataLainnyaFragment_ViewBinding(final OR6DataLainnyaFragment oR6DataLainnyaFragment, View view) {
        this.a = oR6DataLainnyaFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297027, "field 'etPromoCode' and method 'inputChange'");
        oR6DataLainnyaFragment.etPromoCode = (EditText) Utils.castView(findRequiredView, 2131297027, "field 'etPromoCode'", EditText.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR6DataLainnyaFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR6DataLainnyaFragment.inputChange(view2, z);
            }
        });
        oR6DataLainnyaFragment.rgPromoCode = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298220, "field 'rgPromoCode'", RadioGroup.class);
        oR6DataLainnyaFragment.rbPromoCodeYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298156, "field 'rbPromoCodeYa'", RadioButton.class);
        oR6DataLainnyaFragment.rbPromoCodeTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298155, "field 'rbPromoCodeTidak'", RadioButton.class);
        oR6DataLainnyaFragment.tilPromoCode = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298573, "field 'tilPromoCode'", LogoutDialog_ViewBinding.class);
        oR6DataLainnyaFragment.tvErrorPromoCode = (TextView) Utils.findRequiredViewAsType(view, 2131299050, "field 'tvErrorPromoCode'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296396, "method 'onClickLanjut'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6DataLainnyaFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6DataLainnyaFragment.onClickLanjut(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296393, "method 'onClickInfoPromo'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR6DataLainnyaFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR6DataLainnyaFragment.onClickInfoPromo(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OR6DataLainnyaFragment oR6DataLainnyaFragment = this.a;
        if (oR6DataLainnyaFragment != null) {
            this.a = null;
            oR6DataLainnyaFragment.etPromoCode = null;
            oR6DataLainnyaFragment.rgPromoCode = null;
            oR6DataLainnyaFragment.rbPromoCodeYa = null;
            oR6DataLainnyaFragment.rbPromoCodeTidak = null;
            oR6DataLainnyaFragment.tilPromoCode = null;
            oR6DataLainnyaFragment.tvErrorPromoCode = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
