package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.getCardCode;
import o.setPopupBackgroundDrawable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/LoginSessionActivity_ViewBinding.class */
public class LoginSessionActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private LoginSessionActivity d;
    private View e;
    private View i;
    private View j;

    public LoginSessionActivity_ViewBinding(final LoginSessionActivity loginSessionActivity, View view) {
        this.d = loginSessionActivity;
        View findRequiredView = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        loginSessionActivity.etEmail = (getCardCode) Utils.castView(findRequiredView, 2131296976, "field 'etEmail'", getCardCode.class);
        this.a = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.LoginSessionActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                loginSessionActivity.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297156, "field 'etPin' and method 'inputChange'");
        loginSessionActivity.etPin = (setPopupBackgroundDrawable) Utils.castView(findRequiredView2, 2131297156, "field 'etPin'", setPopupBackgroundDrawable.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.LoginSessionActivity_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                loginSessionActivity.inputChange(view2, z);
            }
        });
        loginSessionActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        loginSessionActivity.cbxRememberMe = (CheckBox) Utils.findRequiredViewAsType(view, 2131296470, "field 'cbxRememberMe'", CheckBox.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131299261, "field 'txtForgotPin' and method 'forgotPin'");
        loginSessionActivity.txtForgotPin = (TextView) Utils.castView(findRequiredView3, 2131299261, "field 'txtForgotPin'", TextView.class);
        this.i = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.LoginSessionActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                loginSessionActivity.forgotPin(view2);
            }
        });
        loginSessionActivity.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        loginSessionActivity.tilPin = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298692, "field 'tilPin'", LogoutDialog_ViewBinding.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131298781, "field 'ivTogglePin' and method 'togglePIN'");
        loginSessionActivity.ivTogglePin = (ImageView) Utils.castView(findRequiredView4, 2131298781, "field 'ivTogglePin'", ImageView.class);
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.LoginSessionActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                loginSessionActivity.togglePIN();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296398, "method 'login'");
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.LoginSessionActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                loginSessionActivity.login(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131299548, "method 'clickedRemember'");
        this.j = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.LoginSessionActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                loginSessionActivity.clickedRemember();
            }
        });
        loginSessionActivity.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296976, "field 'etFields'"), Utils.findRequiredView(view, 2131297156, "field 'etFields'"));
        loginSessionActivity.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299159, "field 'tvErrors'", TextView.class));
        loginSessionActivity.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298692, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        loginSessionActivity.labelForgotPin = resources.getString(2131821664);
        loginSessionActivity.retry = resources.getString(2131822092);
        loginSessionActivity.masuk = resources.getString(2131822234);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        LoginSessionActivity loginSessionActivity = this.d;
        if (loginSessionActivity != null) {
            this.d = null;
            loginSessionActivity.etEmail = null;
            loginSessionActivity.etPin = null;
            loginSessionActivity.svMain = null;
            loginSessionActivity.cbxRememberMe = null;
            loginSessionActivity.txtForgotPin = null;
            loginSessionActivity.tilEmail = null;
            loginSessionActivity.tilPin = null;
            loginSessionActivity.ivTogglePin = null;
            loginSessionActivity.etFields = null;
            loginSessionActivity.tvErrors = null;
            loginSessionActivity.tilForms = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.j.setOnClickListener(null);
            this.j = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
