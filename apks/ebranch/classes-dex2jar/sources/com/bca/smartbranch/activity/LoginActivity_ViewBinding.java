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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/LoginActivity_ViewBinding.class */
public class LoginActivity_ViewBinding implements Unbinder {
    private View a;
    private LoginActivity b;
    private View c;
    private View d;
    private View e;
    private View h;
    private View i;

    public LoginActivity_ViewBinding(final LoginActivity loginActivity, View view) {
        this.b = loginActivity;
        View findRequiredView = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        loginActivity.etEmail = (getCardCode) Utils.castView(findRequiredView, 2131296976, "field 'etEmail'", getCardCode.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.LoginActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                loginActivity.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297156, "field 'etPin' and method 'inputChange'");
        loginActivity.etPin = (setPopupBackgroundDrawable) Utils.castView(findRequiredView2, 2131297156, "field 'etPin'", setPopupBackgroundDrawable.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.LoginActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                loginActivity.inputChange(view2, z);
            }
        });
        loginActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        loginActivity.cbxRememberMe = (CheckBox) Utils.findRequiredViewAsType(view, 2131296470, "field 'cbxRememberMe'", CheckBox.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131298781, "field 'ivTogglePin' and method 'togglePIN'");
        loginActivity.ivTogglePin = (ImageView) Utils.castView(findRequiredView3, 2131298781, "field 'ivTogglePin'", ImageView.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.LoginActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                loginActivity.togglePIN();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131299261, "field 'txtForgotPin' and method 'forgotPin'");
        loginActivity.txtForgotPin = (TextView) Utils.castView(findRequiredView4, 2131299261, "field 'txtForgotPin'", TextView.class);
        this.i = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.LoginActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                loginActivity.forgotPin(view2);
            }
        });
        loginActivity.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        loginActivity.tilPin = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298692, "field 'tilPin'", LogoutDialog_ViewBinding.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296398, "method 'login'");
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.LoginActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                loginActivity.login(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131299548, "method 'clickedRemember'");
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.LoginActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                loginActivity.clickedRemember();
            }
        });
        loginActivity.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296976, "field 'etFields'"), Utils.findRequiredView(view, 2131297156, "field 'etFields'"));
        loginActivity.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299159, "field 'tvErrors'", TextView.class));
        loginActivity.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298692, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        loginActivity.labelForgotPin = resources.getString(2131821664);
        loginActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        LoginActivity loginActivity = this.b;
        if (loginActivity != null) {
            this.b = null;
            loginActivity.etEmail = null;
            loginActivity.etPin = null;
            loginActivity.svMain = null;
            loginActivity.cbxRememberMe = null;
            loginActivity.ivTogglePin = null;
            loginActivity.txtForgotPin = null;
            loginActivity.tilEmail = null;
            loginActivity.tilPin = null;
            loginActivity.etFields = null;
            loginActivity.tvErrors = null;
            loginActivity.tilForms = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.h.setOnClickListener(null);
            this.h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
