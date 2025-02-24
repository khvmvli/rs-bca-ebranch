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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC3ChooseBCACardActivity_ViewBinding.class */
public class CC3ChooseBCACardActivity_ViewBinding implements Unbinder {
    private CC3ChooseBCACardActivity a;
    private View b;

    public CC3ChooseBCACardActivity_ViewBinding(final CC3ChooseBCACardActivity cC3ChooseBCACardActivity, View view) {
        this.a = cC3ChooseBCACardActivity;
        cC3ChooseBCACardActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC3ChooseBCACardActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC3ChooseBCACardActivity.rvData = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298323, "field 'rvData'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'onCLickedLanjut'");
        cC3ChooseBCACardActivity.btnLanjut = (Button) Utils.castView(findRequiredView, 2131296396, "field 'btnLanjut'", Button.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC3ChooseBCACardActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC3ChooseBCACardActivity.onCLickedLanjut();
            }
        });
        cC3ChooseBCACardActivity.tvErrorBCACard = (TextView) Utils.findRequiredViewAsType(view, 2131298983, "field 'tvErrorBCACard'", TextView.class);
        cC3ChooseBCACardActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        cC3ChooseBCACardActivity.errorBcaCardEmpty = view.getContext().getResources().getString(2131820743);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC3ChooseBCACardActivity cC3ChooseBCACardActivity = this.a;
        if (cC3ChooseBCACardActivity != null) {
            this.a = null;
            cC3ChooseBCACardActivity.toolbar = null;
            cC3ChooseBCACardActivity.tvToolbarTitle = null;
            cC3ChooseBCACardActivity.rvData = null;
            cC3ChooseBCACardActivity.btnLanjut = null;
            cC3ChooseBCACardActivity.tvErrorBCACard = null;
            cC3ChooseBCACardActivity.llMain = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
