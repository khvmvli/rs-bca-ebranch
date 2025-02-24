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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihKodePosActivity_ViewBinding.class */
public class PilihKodePosActivity_ViewBinding implements Unbinder {
    private PilihKodePosActivity b;

    public PilihKodePosActivity_ViewBinding(PilihKodePosActivity pilihKodePosActivity, View view) {
        this.b = pilihKodePosActivity;
        pilihKodePosActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihKodePosActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihKodePosActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihKodePosActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihKodePosActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        pilihKodePosActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihKodePosActivity pilihKodePosActivity = this.b;
        if (pilihKodePosActivity != null) {
            this.b = null;
            pilihKodePosActivity.toolbar = null;
            pilihKodePosActivity.txtToolbarTitle = null;
            pilihKodePosActivity.etFilter = null;
            pilihKodePosActivity.rvListItem = null;
            pilihKodePosActivity.tvErrorMessage = null;
            pilihKodePosActivity.va = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
