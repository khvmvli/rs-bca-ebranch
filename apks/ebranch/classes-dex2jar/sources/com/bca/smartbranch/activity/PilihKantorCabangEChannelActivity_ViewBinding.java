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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihKantorCabangEChannelActivity_ViewBinding.class */
public class PilihKantorCabangEChannelActivity_ViewBinding implements Unbinder {
    private PilihKantorCabangEChannelActivity b;

    public PilihKantorCabangEChannelActivity_ViewBinding(PilihKantorCabangEChannelActivity pilihKantorCabangEChannelActivity, View view) {
        this.b = pilihKantorCabangEChannelActivity;
        pilihKantorCabangEChannelActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        pilihKantorCabangEChannelActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        pilihKantorCabangEChannelActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        pilihKantorCabangEChannelActivity.rvKantorCabang = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvKantorCabang'", setOnStartEnterTransitionListener.class);
        pilihKantorCabangEChannelActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        pilihKantorCabangEChannelActivity.txtToolbar = view.getContext().getResources().getString(2131822259);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PilihKantorCabangEChannelActivity pilihKantorCabangEChannelActivity = this.b;
        if (pilihKantorCabangEChannelActivity != null) {
            this.b = null;
            pilihKantorCabangEChannelActivity.toolbar = null;
            pilihKantorCabangEChannelActivity.tvToolbar = null;
            pilihKantorCabangEChannelActivity.llMain = null;
            pilihKantorCabangEChannelActivity.rvKantorCabang = null;
            pilihKantorCabangEChannelActivity.etFilter = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
