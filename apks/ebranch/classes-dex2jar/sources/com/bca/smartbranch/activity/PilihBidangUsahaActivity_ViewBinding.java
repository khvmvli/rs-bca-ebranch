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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihBidangUsahaActivity_ViewBinding.class */
public class PilihBidangUsahaActivity_ViewBinding implements Unbinder {
    private PilihBidangUsahaActivity e;

    public PilihBidangUsahaActivity_ViewBinding(PilihBidangUsahaActivity pilihBidangUsahaActivity, View view) {
        this.e = pilihBidangUsahaActivity;
        pilihBidangUsahaActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihBidangUsahaActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihBidangUsahaActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihBidangUsahaActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihBidangUsahaActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihBidangUsahaActivity pilihBidangUsahaActivity = this.e;
        if (pilihBidangUsahaActivity != null) {
            this.e = null;
            pilihBidangUsahaActivity.toolbar = null;
            pilihBidangUsahaActivity.txtToolbarTitle = null;
            pilihBidangUsahaActivity.etFilter = null;
            pilihBidangUsahaActivity.rvListItem = null;
            pilihBidangUsahaActivity.va = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
