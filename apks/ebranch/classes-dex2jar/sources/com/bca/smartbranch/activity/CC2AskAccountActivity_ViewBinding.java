package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC2AskAccountActivity_ViewBinding.class */
public class CC2AskAccountActivity_ViewBinding implements Unbinder {
    private View b;
    private View c;
    private CC2AskAccountActivity d;

    public CC2AskAccountActivity_ViewBinding(final CC2AskAccountActivity cC2AskAccountActivity, View view) {
        this.d = cC2AskAccountActivity;
        cC2AskAccountActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC2AskAccountActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296416, "method 'onCLickedBelum'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC2AskAccountActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC2AskAccountActivity.onCLickedBelum();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296462, "method 'onClickedYes'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC2AskAccountActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC2AskAccountActivity.onClickedYes();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC2AskAccountActivity cC2AskAccountActivity = this.d;
        if (cC2AskAccountActivity != null) {
            this.d = null;
            cC2AskAccountActivity.toolbar = null;
            cC2AskAccountActivity.tvToolbarTitle = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
