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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC21UbahSubBCACardActivity_ViewBinding.class */
public class CC21UbahSubBCACardActivity_ViewBinding implements Unbinder {
    private View a;
    private CC21UbahSubBCACardActivity e;

    public CC21UbahSubBCACardActivity_ViewBinding(final CC21UbahSubBCACardActivity cC21UbahSubBCACardActivity, View view) {
        this.e = cC21UbahSubBCACardActivity;
        cC21UbahSubBCACardActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC21UbahSubBCACardActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC21UbahSubBCACardActivity.rvData = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298323, "field 'rvData'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'onCLickedLanjut'");
        cC21UbahSubBCACardActivity.btnLanjut = (Button) Utils.castView(findRequiredView, 2131296396, "field 'btnLanjut'", Button.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC21UbahSubBCACardActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC21UbahSubBCACardActivity.onCLickedLanjut();
            }
        });
        cC21UbahSubBCACardActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        cC21UbahSubBCACardActivity.errorBcaCardEmpty = view.getContext().getResources().getString(2131820743);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC21UbahSubBCACardActivity cC21UbahSubBCACardActivity = this.e;
        if (cC21UbahSubBCACardActivity != null) {
            this.e = null;
            cC21UbahSubBCACardActivity.toolbar = null;
            cC21UbahSubBCACardActivity.tvToolbarTitle = null;
            cC21UbahSubBCACardActivity.rvData = null;
            cC21UbahSubBCACardActivity.btnLanjut = null;
            cC21UbahSubBCACardActivity.llMain = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
