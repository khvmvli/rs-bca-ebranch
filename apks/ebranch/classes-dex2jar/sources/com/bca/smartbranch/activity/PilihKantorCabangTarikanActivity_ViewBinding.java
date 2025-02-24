package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihKantorCabangTarikanActivity_ViewBinding.class */
public class PilihKantorCabangTarikanActivity_ViewBinding implements Unbinder {
    private PilihKantorCabangTarikanActivity a;

    public PilihKantorCabangTarikanActivity_ViewBinding(PilihKantorCabangTarikanActivity pilihKantorCabangTarikanActivity, View view) {
        this.a = pilihKantorCabangTarikanActivity;
        pilihKantorCabangTarikanActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihKantorCabangTarikanActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        pilihKantorCabangTarikanActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        pilihKantorCabangTarikanActivity.rvKantorCabang = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvKantorCabang'", setOnStartEnterTransitionListener.class);
        pilihKantorCabangTarikanActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihKantorCabangTarikanActivity.txtToolbar = view.getContext().getResources().getString(2131822045);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihKantorCabangTarikanActivity pilihKantorCabangTarikanActivity = this.a;
        if (pilihKantorCabangTarikanActivity != null) {
            this.a = null;
            pilihKantorCabangTarikanActivity.toolbar = null;
            pilihKantorCabangTarikanActivity.tvToolbar = null;
            pilihKantorCabangTarikanActivity.llMain = null;
            pilihKantorCabangTarikanActivity.rvKantorCabang = null;
            pilihKantorCabangTarikanActivity.etFilter = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
