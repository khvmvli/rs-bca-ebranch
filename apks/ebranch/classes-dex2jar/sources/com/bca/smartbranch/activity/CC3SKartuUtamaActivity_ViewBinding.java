package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC3SKartuUtamaActivity_ViewBinding.class */
public class CC3SKartuUtamaActivity_ViewBinding implements Unbinder {
    private CC3SKartuUtamaActivity a;
    private View d;
    private View e;

    public CC3SKartuUtamaActivity_ViewBinding(final CC3SKartuUtamaActivity cC3SKartuUtamaActivity, View view) {
        this.a = cC3SKartuUtamaActivity;
        cC3SKartuUtamaActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC3SKartuUtamaActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297093, "field 'etNoCC' and method 'inputChange'");
        cC3SKartuUtamaActivity.etNoCC = (EditText) Utils.castView(findRequiredView, 2131297093, "field 'etNoCC'", EditText.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.CC3SKartuUtamaActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC3SKartuUtamaActivity.inputChange(view2, z);
            }
        });
        cC3SKartuUtamaActivity.tilNoCC = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298639, "field 'tilNoCC'", LogoutDialog_ViewBinding.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut', method 'lanjut', and method 'onClickLanjut'");
        cC3SKartuUtamaActivity.btnLanjut = (Button) Utils.castView(findRequiredView2, 2131296396, "field 'btnLanjut'", Button.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC3SKartuUtamaActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC3SKartuUtamaActivity.lanjut();
                cC3SKartuUtamaActivity.onClickLanjut(view2);
            }
        });
        cC3SKartuUtamaActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        cC3SKartuUtamaActivity.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299440, "field 'tvNama'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC3SKartuUtamaActivity cC3SKartuUtamaActivity = this.a;
        if (cC3SKartuUtamaActivity != null) {
            this.a = null;
            cC3SKartuUtamaActivity.toolbar = null;
            cC3SKartuUtamaActivity.tvToolbarTitle = null;
            cC3SKartuUtamaActivity.etNoCC = null;
            cC3SKartuUtamaActivity.tilNoCC = null;
            cC3SKartuUtamaActivity.btnLanjut = null;
            cC3SKartuUtamaActivity.llMain = null;
            cC3SKartuUtamaActivity.tvNama = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
