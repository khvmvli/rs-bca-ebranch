package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC5ChooseMastercardVisaActivity_ViewBinding.class */
public class CC5ChooseMastercardVisaActivity_ViewBinding implements Unbinder {
    private CC5ChooseMastercardVisaActivity c;
    private View e;

    public CC5ChooseMastercardVisaActivity_ViewBinding(final CC5ChooseMastercardVisaActivity cC5ChooseMastercardVisaActivity, View view) {
        this.c = cC5ChooseMastercardVisaActivity;
        cC5ChooseMastercardVisaActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC5ChooseMastercardVisaActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC5ChooseMastercardVisaActivity.rvMastercard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298330, "field 'rvMastercard'", setOnStartEnterTransitionListener.class);
        cC5ChooseMastercardVisaActivity.rvVisa = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298341, "field 'rvVisa'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'onCLickedLanjut'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC5ChooseMastercardVisaActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC5ChooseMastercardVisaActivity.onCLickedLanjut();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC5ChooseMastercardVisaActivity cC5ChooseMastercardVisaActivity = this.c;
        if (cC5ChooseMastercardVisaActivity != null) {
            this.c = null;
            cC5ChooseMastercardVisaActivity.toolbar = null;
            cC5ChooseMastercardVisaActivity.tvToolbarTitle = null;
            cC5ChooseMastercardVisaActivity.rvMastercard = null;
            cC5ChooseMastercardVisaActivity.rvVisa = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
