package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC3UbahBCACardActivity_ViewBinding.class */
public class CC3UbahBCACardActivity_ViewBinding implements Unbinder {
    private View a;
    private CC3UbahBCACardActivity d;

    public CC3UbahBCACardActivity_ViewBinding(final CC3UbahBCACardActivity cC3UbahBCACardActivity, View view) {
        this.d = cC3UbahBCACardActivity;
        cC3UbahBCACardActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC3UbahBCACardActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC3UbahBCACardActivity.rvData = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298323, "field 'rvData'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'onCLickedLanjut'");
        cC3UbahBCACardActivity.btnLanjut = (Button) Utils.castView(findRequiredView, 2131296396, "field 'btnLanjut'", Button.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC3UbahBCACardActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC3UbahBCACardActivity.onCLickedLanjut();
            }
        });
        cC3UbahBCACardActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        cC3UbahBCACardActivity.errorBcaCardEmpty = view.getContext().getResources().getString(2131820743);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC3UbahBCACardActivity cC3UbahBCACardActivity = this.d;
        if (cC3UbahBCACardActivity != null) {
            this.d = null;
            cC3UbahBCACardActivity.toolbar = null;
            cC3UbahBCACardActivity.tvToolbarTitle = null;
            cC3UbahBCACardActivity.rvData = null;
            cC3UbahBCACardActivity.btnLanjut = null;
            cC3UbahBCACardActivity.llMain = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
