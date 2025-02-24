package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC7ReviewCreditCardActivity_ViewBinding.class */
public class CC7ReviewCreditCardActivity_ViewBinding implements Unbinder {
    private View a;
    private CC7ReviewCreditCardActivity b;
    private View c;
    private View d;
    private View e;

    public CC7ReviewCreditCardActivity_ViewBinding(final CC7ReviewCreditCardActivity cC7ReviewCreditCardActivity, View view) {
        this.b = cC7ReviewCreditCardActivity;
        cC7ReviewCreditCardActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        cC7ReviewCreditCardActivity.tvToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbarTitle'", TextView.class);
        cC7ReviewCreditCardActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        cC7ReviewCreditCardActivity.llBcaCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297545, "field 'llBcaCard'", LinearLayout.class);
        cC7ReviewCreditCardActivity.llMasterCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297771, "field 'llMasterCard'", LinearLayout.class);
        cC7ReviewCreditCardActivity.dvdMastercard = Utils.findRequiredView(view, 2131296901, "field 'dvdMastercard'");
        cC7ReviewCreditCardActivity.llVisaCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297931, "field 'llVisaCard'", LinearLayout.class);
        cC7ReviewCreditCardActivity.dvdVisacard = Utils.findRequiredView(view, 2131296908, "field 'dvdVisacard'");
        cC7ReviewCreditCardActivity.rvBcaCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298317, "field 'rvBcaCard'", setOnStartEnterTransitionListener.class);
        cC7ReviewCreditCardActivity.rvMasterCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298330, "field 'rvMasterCard'", setOnStartEnterTransitionListener.class);
        cC7ReviewCreditCardActivity.rvVisaCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298342, "field 'rvVisaCard'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299698, "method 'ubahBcaCard'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC7ReviewCreditCardActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC7ReviewCreditCardActivity.ubahBcaCard();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131299725, "method 'ubahMasterCard'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC7ReviewCreditCardActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC7ReviewCreditCardActivity.ubahMasterCard();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131299729, "method 'ubahVisaCard'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC7ReviewCreditCardActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC7ReviewCreditCardActivity.ubahVisaCard();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'onCLickedLanjut'");
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC7ReviewCreditCardActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC7ReviewCreditCardActivity.onCLickedLanjut();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC7ReviewCreditCardActivity cC7ReviewCreditCardActivity = this.b;
        if (cC7ReviewCreditCardActivity != null) {
            this.b = null;
            cC7ReviewCreditCardActivity.toolbar = null;
            cC7ReviewCreditCardActivity.tvToolbarTitle = null;
            cC7ReviewCreditCardActivity.llMain = null;
            cC7ReviewCreditCardActivity.llBcaCard = null;
            cC7ReviewCreditCardActivity.llMasterCard = null;
            cC7ReviewCreditCardActivity.dvdMastercard = null;
            cC7ReviewCreditCardActivity.llVisaCard = null;
            cC7ReviewCreditCardActivity.dvdVisacard = null;
            cC7ReviewCreditCardActivity.rvBcaCard = null;
            cC7ReviewCreditCardActivity.rvMasterCard = null;
            cC7ReviewCreditCardActivity.rvVisaCard = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
