package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormReservasiUbahTellerActivity_ViewBinding.class */
public class FormReservasiUbahTellerActivity_ViewBinding implements Unbinder {
    private FormReservasiUbahTellerActivity d;

    public FormReservasiUbahTellerActivity_ViewBinding(FormReservasiUbahTellerActivity formReservasiUbahTellerActivity, View view) {
        this.d = formReservasiUbahTellerActivity;
        formReservasiUbahTellerActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        formReservasiUbahTellerActivity.llMainIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297767, "field 'llMainIndicator'", LinearLayout.class);
        formReservasiUbahTellerActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        formReservasiUbahTellerActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        formReservasiUbahTellerActivity.toolbarTitle = view.getContext().getResources().getString(2131822281);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FormReservasiUbahTellerActivity formReservasiUbahTellerActivity = this.d;
        if (formReservasiUbahTellerActivity != null) {
            this.d = null;
            formReservasiUbahTellerActivity.llMain = null;
            formReservasiUbahTellerActivity.llMainIndicator = null;
            formReservasiUbahTellerActivity.toolbar = null;
            formReservasiUbahTellerActivity.tvToolbarTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
