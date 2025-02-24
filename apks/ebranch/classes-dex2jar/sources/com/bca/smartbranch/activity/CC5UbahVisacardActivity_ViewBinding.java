package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC5UbahVisacardActivity_ViewBinding.class */
public class CC5UbahVisacardActivity_ViewBinding implements Unbinder {
    private View b;
    private CC5UbahVisacardActivity d;

    public CC5UbahVisacardActivity_ViewBinding(final CC5UbahVisacardActivity cC5UbahVisacardActivity, View view) {
        this.d = cC5UbahVisacardActivity;
        cC5UbahVisacardActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC5UbahVisacardActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC5UbahVisacardActivity.rvVisacard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298341, "field 'rvVisacard'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'onCLickedLanjut'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC5UbahVisacardActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC5UbahVisacardActivity.onCLickedLanjut();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC5UbahVisacardActivity cC5UbahVisacardActivity = this.d;
        if (cC5UbahVisacardActivity != null) {
            this.d = null;
            cC5UbahVisacardActivity.toolbar = null;
            cC5UbahVisacardActivity.tvToolbarTitle = null;
            cC5UbahVisacardActivity.rvVisacard = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
