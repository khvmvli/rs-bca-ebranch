package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihProvinsiActivity_ViewBinding.class */
public class PilihProvinsiActivity_ViewBinding implements Unbinder {
    private PilihProvinsiActivity b;

    public PilihProvinsiActivity_ViewBinding(PilihProvinsiActivity pilihProvinsiActivity, View view) {
        this.b = pilihProvinsiActivity;
        pilihProvinsiActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihProvinsiActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihProvinsiActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihProvinsiActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihProvinsiActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        pilihProvinsiActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihProvinsiActivity pilihProvinsiActivity = this.b;
        if (pilihProvinsiActivity != null) {
            this.b = null;
            pilihProvinsiActivity.toolbar = null;
            pilihProvinsiActivity.txtToolbarTitle = null;
            pilihProvinsiActivity.etFilter = null;
            pilihProvinsiActivity.rvListItem = null;
            pilihProvinsiActivity.tvErrorMessage = null;
            pilihProvinsiActivity.va = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
