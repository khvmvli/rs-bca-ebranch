package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.ScrollView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ForgotPassSuccessActivity_ViewBinding.class */
public class ForgotPassSuccessActivity_ViewBinding implements Unbinder {
    private ForgotPassSuccessActivity a;
    private View c;
    private View d;

    public ForgotPassSuccessActivity_ViewBinding(final ForgotPassSuccessActivity forgotPassSuccessActivity, View view) {
        this.a = forgotPassSuccessActivity;
        forgotPassSuccessActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ForgotPassSuccessActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                forgotPassSuccessActivity.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131299550, "method 'resendLinkActivation'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ForgotPassSuccessActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                forgotPassSuccessActivity.resendLinkActivation(view2);
            }
        });
        forgotPassSuccessActivity.retry = view.getContext().getResources().getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ForgotPassSuccessActivity forgotPassSuccessActivity = this.a;
        if (forgotPassSuccessActivity != null) {
            this.a = null;
            forgotPassSuccessActivity.svMain = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
