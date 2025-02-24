package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC23UbahSubMastercardActivity_ViewBinding.class */
public class CC23UbahSubMastercardActivity_ViewBinding implements Unbinder {
    private View b;
    private CC23UbahSubMastercardActivity d;

    public CC23UbahSubMastercardActivity_ViewBinding(final CC23UbahSubMastercardActivity cC23UbahSubMastercardActivity, View view) {
        this.d = cC23UbahSubMastercardActivity;
        cC23UbahSubMastercardActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC23UbahSubMastercardActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC23UbahSubMastercardActivity.rvMastercard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298330, "field 'rvMastercard'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'onCLickedLanjut'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC23UbahSubMastercardActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC23UbahSubMastercardActivity.onCLickedLanjut();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC23UbahSubMastercardActivity cC23UbahSubMastercardActivity = this.d;
        if (cC23UbahSubMastercardActivity != null) {
            this.d = null;
            cC23UbahSubMastercardActivity.toolbar = null;
            cC23UbahSubMastercardActivity.tvToolbarTitle = null;
            cC23UbahSubMastercardActivity.rvMastercard = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
