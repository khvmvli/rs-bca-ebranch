package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihBankPenerbitActivity_ViewBinding.class */
public class PilihBankPenerbitActivity_ViewBinding implements Unbinder {
    private PilihBankPenerbitActivity c;

    public PilihBankPenerbitActivity_ViewBinding(PilihBankPenerbitActivity pilihBankPenerbitActivity, View view) {
        this.c = pilihBankPenerbitActivity;
        pilihBankPenerbitActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihBankPenerbitActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        pilihBankPenerbitActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihBankPenerbitActivity.rvListItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvListItem'", setOnStartEnterTransitionListener.class);
        pilihBankPenerbitActivity.va = (ViewAnimator) Utils.findRequiredViewAsType(view, 2131299749, "field 'va'", ViewAnimator.class);
        pilihBankPenerbitActivity.llBankPenerbitTidakDitemukan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297536, "field 'llBankPenerbitTidakDitemukan'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihBankPenerbitActivity pilihBankPenerbitActivity = this.c;
        if (pilihBankPenerbitActivity != null) {
            this.c = null;
            pilihBankPenerbitActivity.toolbar = null;
            pilihBankPenerbitActivity.txtToolbarTitle = null;
            pilihBankPenerbitActivity.etFilter = null;
            pilihBankPenerbitActivity.rvListItem = null;
            pilihBankPenerbitActivity.va = null;
            pilihBankPenerbitActivity.llBankPenerbitTidakDitemukan = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
