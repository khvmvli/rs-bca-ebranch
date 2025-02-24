package com.bca.smartbranch.activity;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC1CreditCardActivity_ViewBinding.class */
public class CC1CreditCardActivity_ViewBinding implements Unbinder {
    private View b;
    private CC1CreditCardActivity c;

    public CC1CreditCardActivity_ViewBinding(final CC1CreditCardActivity cC1CreditCardActivity, View view) {
        this.c = cC1CreditCardActivity;
        View findRequiredView = Utils.findRequiredView(view, 2131296381, "method 'onClickedBelum'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.CC1CreditCardActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC1CreditCardActivity.onClickedBelum();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        if (this.c != null) {
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
