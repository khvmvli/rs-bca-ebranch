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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihJabatanActivity_ViewBinding.class */
public class PilihJabatanActivity_ViewBinding implements Unbinder {
    private PilihJabatanActivity d;

    public PilihJabatanActivity_ViewBinding(PilihJabatanActivity pilihJabatanActivity, View view) {
        this.d = pilihJabatanActivity;
        pilihJabatanActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihJabatanActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihJabatanActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihJabatanActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihJabatanActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihJabatanActivity pilihJabatanActivity = this.d;
        if (pilihJabatanActivity != null) {
            this.d = null;
            pilihJabatanActivity.toolbar = null;
            pilihJabatanActivity.txtToolbarTitle = null;
            pilihJabatanActivity.etFilter = null;
            pilihJabatanActivity.rvListItem = null;
            pilihJabatanActivity.va = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
