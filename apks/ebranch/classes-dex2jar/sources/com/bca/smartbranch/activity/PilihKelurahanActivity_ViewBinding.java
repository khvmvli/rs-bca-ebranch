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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihKelurahanActivity_ViewBinding.class */
public class PilihKelurahanActivity_ViewBinding implements Unbinder {
    private PilihKelurahanActivity b;

    public PilihKelurahanActivity_ViewBinding(PilihKelurahanActivity pilihKelurahanActivity, View view) {
        this.b = pilihKelurahanActivity;
        pilihKelurahanActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihKelurahanActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihKelurahanActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihKelurahanActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihKelurahanActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        pilihKelurahanActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihKelurahanActivity pilihKelurahanActivity = this.b;
        if (pilihKelurahanActivity != null) {
            this.b = null;
            pilihKelurahanActivity.toolbar = null;
            pilihKelurahanActivity.txtToolbarTitle = null;
            pilihKelurahanActivity.etFilter = null;
            pilihKelurahanActivity.rvListItem = null;
            pilihKelurahanActivity.tvErrorMessage = null;
            pilihKelurahanActivity.va = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
