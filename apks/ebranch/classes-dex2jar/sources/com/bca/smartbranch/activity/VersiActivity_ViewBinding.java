package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/VersiActivity_ViewBinding.class */
public class VersiActivity_ViewBinding implements Unbinder {
    private VersiActivity c;

    public VersiActivity_ViewBinding(VersiActivity versiActivity, View view) {
        this.c = versiActivity;
        versiActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        versiActivity.tvTitleToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvTitleToolbar'", TextView.class);
        versiActivity.tvVersi = (TextView) Utils.findRequiredViewAsType(view, 2131299735, "field 'tvVersi'", TextView.class);
        versiActivity.txtToolbarTitle = view.getContext().getResources().getString(2131822290);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        VersiActivity versiActivity = this.c;
        if (versiActivity != null) {
            this.c = null;
            versiActivity.toolbar = null;
            versiActivity.tvTitleToolbar = null;
            versiActivity.tvVersi = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
