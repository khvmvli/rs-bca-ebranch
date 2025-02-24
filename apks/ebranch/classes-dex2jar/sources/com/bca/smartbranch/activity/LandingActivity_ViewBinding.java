package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setTypeTransaction2;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/LandingActivity_ViewBinding.class */
public class LandingActivity_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private View d;
    private LandingActivity e;

    public LandingActivity_ViewBinding(final LandingActivity landingActivity, View view) {
        this.e = landingActivity;
        landingActivity.vpCarousel = (setTypeTransaction2) Utils.findRequiredViewAsType(view, 2131299788, "field 'vpCarousel'", setTypeTransaction2.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299396, "field 'txtLoginGuest' and method 'loginAsGuest'");
        landingActivity.txtLoginGuest = (TextView) Utils.castView(findRequiredView, 2131299396, "field 'txtLoginGuest'", TextView.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.LandingActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                landingActivity.loginAsGuest();
            }
        });
        landingActivity.rg = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298210, "field 'rg'", RadioGroup.class);
        landingActivity.rb1 = (RadioButton) Utils.findRequiredViewAsType(view, 2131298128, "field 'rb1'", RadioButton.class);
        landingActivity.rb2 = (RadioButton) Utils.findRequiredViewAsType(view, 2131298129, "field 'rb2'", RadioButton.class);
        landingActivity.rb3 = (RadioButton) Utils.findRequiredViewAsType(view, 2131298130, "field 'rb3'", RadioButton.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296398, "method 'login'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.LandingActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                landingActivity.login(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296449, "method 'signUp'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.LandingActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                landingActivity.signUp(view2);
            }
        });
        landingActivity.labelLoginGuest = view.getContext().getResources().getString(2131821874);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        LandingActivity landingActivity = this.e;
        if (landingActivity != null) {
            this.e = null;
            landingActivity.vpCarousel = null;
            landingActivity.txtLoginGuest = null;
            landingActivity.rg = null;
            landingActivity.rb1 = null;
            landingActivity.rb2 = null;
            landingActivity.rb3 = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
