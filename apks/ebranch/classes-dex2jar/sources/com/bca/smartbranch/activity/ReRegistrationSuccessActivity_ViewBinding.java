package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReRegistrationSuccessActivity_ViewBinding.class */
public class ReRegistrationSuccessActivity_ViewBinding implements Unbinder {
    private ReRegistrationSuccessActivity b;
    private View c;
    private View e;

    public ReRegistrationSuccessActivity_ViewBinding(final ReRegistrationSuccessActivity reRegistrationSuccessActivity, View view) {
        this.b = reRegistrationSuccessActivity;
        reRegistrationSuccessActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        reRegistrationSuccessActivity.tvSuccessContent = (TextView) Utils.findRequiredViewAsType(view, 2131299586, "field 'tvSuccessContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299550, "field 'tvResendLinkActivation' and method 'resendLinkActivation'");
        reRegistrationSuccessActivity.tvResendLinkActivation = (TextView) Utils.castView(findRequiredView, 2131299550, "field 'tvResendLinkActivation'", TextView.class);
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReRegistrationSuccessActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reRegistrationSuccessActivity.resendLinkActivation(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ReRegistrationSuccessActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                reRegistrationSuccessActivity.close(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        reRegistrationSuccessActivity.retry = resources.getString(2131822092);
        reRegistrationSuccessActivity.successRegistrationDesc = resources.getString(2131821863);
        reRegistrationSuccessActivity.resendActivationLink = resources.getString(2131822079);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ReRegistrationSuccessActivity reRegistrationSuccessActivity = this.b;
        if (reRegistrationSuccessActivity != null) {
            this.b = null;
            reRegistrationSuccessActivity.svMain = null;
            reRegistrationSuccessActivity.tvSuccessContent = null;
            reRegistrationSuccessActivity.tvResendLinkActivation = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
