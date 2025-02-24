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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihKotaActivity_ViewBinding.class */
public class PilihKotaActivity_ViewBinding implements Unbinder {
    private PilihKotaActivity d;

    public PilihKotaActivity_ViewBinding(PilihKotaActivity pilihKotaActivity, View view) {
        this.d = pilihKotaActivity;
        pilihKotaActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihKotaActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihKotaActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihKotaActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihKotaActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        pilihKotaActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihKotaActivity pilihKotaActivity = this.d;
        if (pilihKotaActivity != null) {
            this.d = null;
            pilihKotaActivity.toolbar = null;
            pilihKotaActivity.txtToolbarTitle = null;
            pilihKotaActivity.etFilter = null;
            pilihKotaActivity.rvListItem = null;
            pilihKotaActivity.tvErrorMessage = null;
            pilihKotaActivity.va = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
