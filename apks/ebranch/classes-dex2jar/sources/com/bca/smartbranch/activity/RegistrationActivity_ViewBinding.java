package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.getCardCode;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/RegistrationActivity_ViewBinding.class */
public class RegistrationActivity_ViewBinding implements Unbinder {
    private RegistrationActivity a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;

    public RegistrationActivity_ViewBinding(final RegistrationActivity registrationActivity, View view) {
        this.a = registrationActivity;
        View findRequiredView = Utils.findRequiredView(view, 2131297079, "field 'etName' and method 'inputChange'");
        registrationActivity.etName = (EditText) Utils.castView(findRequiredView, 2131297079, "field 'etName'", EditText.class);
        this.c = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.RegistrationActivity_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                registrationActivity.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        registrationActivity.etEmail = (getCardCode) Utils.castView(findRequiredView2, 2131296976, "field 'etEmail'", getCardCode.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.RegistrationActivity_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                registrationActivity.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297156, "field 'etPin' and method 'inputChange'");
        registrationActivity.etPin = (EditText) Utils.castView(findRequiredView3, 2131297156, "field 'etPin'", EditText.class);
        this.b = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.RegistrationActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                registrationActivity.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297159, "field 'etConfirmPin' and method 'inputChange'");
        registrationActivity.etConfirmPin = (EditText) Utils.castView(findRequiredView4, 2131297159, "field 'etConfirmPin'", EditText.class);
        this.j = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.RegistrationActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                registrationActivity.inputChange(view2, z);
            }
        });
        registrationActivity.tilName = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298625, "field 'tilName'", LogoutDialog_ViewBinding.class);
        registrationActivity.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        registrationActivity.tilPin = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298692, "field 'tilPin'", LogoutDialog_ViewBinding.class);
        registrationActivity.tilPinConfirm = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298695, "field 'tilPinConfirm'", LogoutDialog_ViewBinding.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131299604, "field 'txtTermsConditions' and method 'termCondition'");
        registrationActivity.txtTermsConditions = (TextView) Utils.castView(findRequiredView5, 2131299604, "field 'txtTermsConditions'", TextView.class);
        this.i = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.RegistrationActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                registrationActivity.termCondition(view2);
            }
        });
        registrationActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131296441, "field 'btnRegister' and method 'register'");
        registrationActivity.btnRegister = (Button) Utils.castView(findRequiredView6, 2131296441, "field 'btnRegister'", Button.class);
        this.d = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.RegistrationActivity_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                registrationActivity.register(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131298781, "field 'ivTogglePin' and method 'togglePIN'");
        registrationActivity.ivTogglePin = (ImageView) Utils.castView(findRequiredView7, 2131298781, "field 'ivTogglePin'", ImageView.class);
        this.f = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.RegistrationActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                registrationActivity.togglePIN();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131298784, "field 'ivToggleConfirmPin' and method 'togglePINConfirm'");
        registrationActivity.ivToggleConfirmPin = (ImageView) Utils.castView(findRequiredView8, 2131298784, "field 'ivToggleConfirmPin'", ImageView.class);
        this.h = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.RegistrationActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                registrationActivity.togglePINConfirm();
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131299395, "method 'login'");
        this.g = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.RegistrationActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                registrationActivity.login();
            }
        });
        registrationActivity.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297079, "field 'etFields'"), Utils.findRequiredView(view, 2131296976, "field 'etFields'"), Utils.findRequiredView(view, 2131297156, "field 'etFields'"), Utils.findRequiredView(view, 2131297159, "field 'etFields'"));
        registrationActivity.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299101, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299159, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299162, "field 'tvErrors'", TextView.class));
        registrationActivity.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298625, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298692, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298695, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        registrationActivity.labelSetujuPendaftaran = resources.getString(2131822112);
        registrationActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        RegistrationActivity registrationActivity = this.a;
        if (registrationActivity != null) {
            this.a = null;
            registrationActivity.etName = null;
            registrationActivity.etEmail = null;
            registrationActivity.etPin = null;
            registrationActivity.etConfirmPin = null;
            registrationActivity.tilName = null;
            registrationActivity.tilEmail = null;
            registrationActivity.tilPin = null;
            registrationActivity.tilPinConfirm = null;
            registrationActivity.txtTermsConditions = null;
            registrationActivity.svMain = null;
            registrationActivity.btnRegister = null;
            registrationActivity.ivTogglePin = null;
            registrationActivity.ivToggleConfirmPin = null;
            registrationActivity.etFields = null;
            registrationActivity.tvErrors = null;
            registrationActivity.tilForms = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
