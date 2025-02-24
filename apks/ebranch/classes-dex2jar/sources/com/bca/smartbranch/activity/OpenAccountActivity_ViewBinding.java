package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OpenAccountActivity_ViewBinding.class */
public class OpenAccountActivity_ViewBinding implements Unbinder {
    private OpenAccountActivity e;

    public OpenAccountActivity_ViewBinding(OpenAccountActivity openAccountActivity, View view) {
        this.e = openAccountActivity;
        openAccountActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        openAccountActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        openAccountActivity.rvAccountType = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298316, "field 'rvAccountType'", setOnStartEnterTransitionListener.class);
        Resources resources = view.getContext().getResources();
        openAccountActivity.accountType = resources.getStringArray(2130903042);
        openAccountActivity.accountDesc = resources.getStringArray(2130903041);
        openAccountActivity.toolbarTitle = resources.getString(2131822236);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OpenAccountActivity openAccountActivity = this.e;
        if (openAccountActivity != null) {
            this.e = null;
            openAccountActivity.toolbar = null;
            openAccountActivity.txtToolbarTitle = null;
            openAccountActivity.rvAccountType = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
