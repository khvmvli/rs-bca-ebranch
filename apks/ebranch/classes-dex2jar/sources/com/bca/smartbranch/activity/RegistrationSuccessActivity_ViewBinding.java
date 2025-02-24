package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/RegistrationSuccessActivity_ViewBinding.class */
public class RegistrationSuccessActivity_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private RegistrationSuccessActivity d;

    public RegistrationSuccessActivity_ViewBinding(final RegistrationSuccessActivity registrationSuccessActivity, View view) {
        this.d = registrationSuccessActivity;
        registrationSuccessActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        registrationSuccessActivity.tvSuccessContent = (TextView) Utils.findRequiredViewAsType(view, 2131299586, "field 'tvSuccessContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299550, "method 'resendLinkActivation'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.RegistrationSuccessActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                registrationSuccessActivity.resendLinkActivation(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.RegistrationSuccessActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                registrationSuccessActivity.close(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        registrationSuccessActivity.retry = resources.getString(2131822092);
        registrationSuccessActivity.successRegistrationDesc = resources.getString(2131821863);
        registrationSuccessActivity.resendActivationLink = resources.getString(2131822079);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        RegistrationSuccessActivity registrationSuccessActivity = this.d;
        if (registrationSuccessActivity != null) {
            this.d = null;
            registrationSuccessActivity.svMain = null;
            registrationSuccessActivity.tvSuccessContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
