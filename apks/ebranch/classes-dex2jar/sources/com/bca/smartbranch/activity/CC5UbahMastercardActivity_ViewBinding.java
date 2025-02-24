package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC5UbahMastercardActivity_ViewBinding.class */
public class CC5UbahMastercardActivity_ViewBinding implements Unbinder {
    private View a;
    private CC5UbahMastercardActivity c;

    public CC5UbahMastercardActivity_ViewBinding(final CC5UbahMastercardActivity cC5UbahMastercardActivity, View view) {
        this.c = cC5UbahMastercardActivity;
        cC5UbahMastercardActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC5UbahMastercardActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC5UbahMastercardActivity.rvMastercard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298330, "field 'rvMastercard'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'onCLickedLanjut'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC5UbahMastercardActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC5UbahMastercardActivity.onCLickedLanjut();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC5UbahMastercardActivity cC5UbahMastercardActivity = this.c;
        if (cC5UbahMastercardActivity != null) {
            this.c = null;
            cC5UbahMastercardActivity.toolbar = null;
            cC5UbahMastercardActivity.tvToolbarTitle = null;
            cC5UbahMastercardActivity.rvMastercard = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
