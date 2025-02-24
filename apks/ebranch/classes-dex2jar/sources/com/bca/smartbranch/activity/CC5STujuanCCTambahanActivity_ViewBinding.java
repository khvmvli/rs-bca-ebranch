package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC5STujuanCCTambahanActivity_ViewBinding.class */
public class CC5STujuanCCTambahanActivity_ViewBinding implements Unbinder {
    private CC5STujuanCCTambahanActivity b;

    public CC5STujuanCCTambahanActivity_ViewBinding(CC5STujuanCCTambahanActivity cC5STujuanCCTambahanActivity, View view) {
        this.b = cC5STujuanCCTambahanActivity;
        cC5STujuanCCTambahanActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC5STujuanCCTambahanActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC5STujuanCCTambahanActivity.rgTujuanPembukaan = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298233, "field 'rgTujuanPembukaan'", RadioGroup.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC5STujuanCCTambahanActivity cC5STujuanCCTambahanActivity = this.b;
        if (cC5STujuanCCTambahanActivity != null) {
            this.b = null;
            cC5STujuanCCTambahanActivity.toolbar = null;
            cC5STujuanCCTambahanActivity.tvToolbarTitle = null;
            cC5STujuanCCTambahanActivity.rgTujuanPembukaan = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
