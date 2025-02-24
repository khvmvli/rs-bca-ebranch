package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC23UbahSubVisacardActivity_ViewBinding.class */
public class CC23UbahSubVisacardActivity_ViewBinding implements Unbinder {
    private CC23UbahSubVisacardActivity a;
    private View d;

    public CC23UbahSubVisacardActivity_ViewBinding(final CC23UbahSubVisacardActivity cC23UbahSubVisacardActivity, View view) {
        this.a = cC23UbahSubVisacardActivity;
        cC23UbahSubVisacardActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC23UbahSubVisacardActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC23UbahSubVisacardActivity.rvVisacard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298341, "field 'rvVisacard'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'onCLickedLanjut'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC23UbahSubVisacardActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC23UbahSubVisacardActivity.onCLickedLanjut();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC23UbahSubVisacardActivity cC23UbahSubVisacardActivity = this.a;
        if (cC23UbahSubVisacardActivity != null) {
            this.a = null;
            cC23UbahSubVisacardActivity.toolbar = null;
            cC23UbahSubVisacardActivity.tvToolbarTitle = null;
            cC23UbahSubVisacardActivity.rvVisacard = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
