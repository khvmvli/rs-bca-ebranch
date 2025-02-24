package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormUbahTellerActivity_ViewBinding.class */
public class FormUbahTellerActivity_ViewBinding implements Unbinder {
    private FormUbahTellerActivity b;

    public FormUbahTellerActivity_ViewBinding(FormUbahTellerActivity formUbahTellerActivity, View view) {
        this.b = formUbahTellerActivity;
        formUbahTellerActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        formUbahTellerActivity.llMainIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297767, "field 'llMainIndicator'", LinearLayout.class);
        formUbahTellerActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        formUbahTellerActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        formUbahTellerActivity.toolbarTitle = view.getContext().getResources().getString(2131822281);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FormUbahTellerActivity formUbahTellerActivity = this.b;
        if (formUbahTellerActivity != null) {
            this.b = null;
            formUbahTellerActivity.llMain = null;
            formUbahTellerActivity.llMainIndicator = null;
            formUbahTellerActivity.toolbar = null;
            formUbahTellerActivity.tvToolbarTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
