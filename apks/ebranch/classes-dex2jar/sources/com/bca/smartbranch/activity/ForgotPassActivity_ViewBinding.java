package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setPopupBackgroundDrawable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ForgotPassActivity_ViewBinding.class */
public class ForgotPassActivity_ViewBinding implements Unbinder {
    private ForgotPassActivity c;
    private View d;
    private View e;

    public ForgotPassActivity_ViewBinding(final ForgotPassActivity forgotPassActivity, View view) {
        this.c = forgotPassActivity;
        View findRequiredView = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        forgotPassActivity.etEmail = (setPopupBackgroundDrawable) Utils.castView(findRequiredView, 2131296976, "field 'etEmail'", setPopupBackgroundDrawable.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.ForgotPassActivity_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                forgotPassActivity.inputChange(view2, z);
            }
        });
        forgotPassActivity.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        forgotPassActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296452, "method 'send'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ForgotPassActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                forgotPassActivity.send(view2);
            }
        });
        forgotPassActivity.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296976, "field 'etFields'"));
        forgotPassActivity.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class));
        forgotPassActivity.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        forgotPassActivity.lupaPin = resources.getString(2131822205);
        forgotPassActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ForgotPassActivity forgotPassActivity = this.c;
        if (forgotPassActivity != null) {
            this.c = null;
            forgotPassActivity.etEmail = null;
            forgotPassActivity.tilEmail = null;
            forgotPassActivity.svMain = null;
            forgotPassActivity.etFields = null;
            forgotPassActivity.tvErrors = null;
            forgotPassActivity.tilForms = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
