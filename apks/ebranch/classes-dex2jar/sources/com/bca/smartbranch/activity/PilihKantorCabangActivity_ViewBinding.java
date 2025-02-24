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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihKantorCabangActivity_ViewBinding.class */
public class PilihKantorCabangActivity_ViewBinding implements Unbinder {
    private PilihKantorCabangActivity e;

    public PilihKantorCabangActivity_ViewBinding(PilihKantorCabangActivity pilihKantorCabangActivity, View view) {
        this.e = pilihKantorCabangActivity;
        pilihKantorCabangActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihKantorCabangActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        pilihKantorCabangActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        pilihKantorCabangActivity.rvKantorCabang = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvKantorCabang'", setOnStartEnterTransitionListener.class);
        pilihKantorCabangActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihKantorCabangActivity.txtToolbar = view.getContext().getResources().getString(2131822259);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihKantorCabangActivity pilihKantorCabangActivity = this.e;
        if (pilihKantorCabangActivity != null) {
            this.e = null;
            pilihKantorCabangActivity.toolbar = null;
            pilihKantorCabangActivity.tvToolbar = null;
            pilihKantorCabangActivity.llMain = null;
            pilihKantorCabangActivity.rvKantorCabang = null;
            pilihKantorCabangActivity.etFilter = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
