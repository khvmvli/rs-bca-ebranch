package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.TermConditionDialog;
import com.bca.smartbranch.presenter.RegistrationPresenter;
import com.bca.smartbranch.presenter.RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.ConfirmPassword;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Password;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import java.util.List;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.forgotPin;
import o.getCardCode;
import o.getPromotion;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/RegistrationActivity.class */
public class RegistrationActivity extends BaseActivityPreLogin implements RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver, Validator.ValidationListener, TextWatcher {
    @BindView(2131296441)
    Button btnRegister;
    @Order(4)
    @BindView(2131297159)
    @NotEmpty(messageResId = 2131820967, sequence = 7, trim = true)
    @ConfirmPassword(messageResId = 2131820968, sequence = 8)
    EditText etConfirmPin;
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 4)
    @Order(2)
    @BindView(2131296976)
    @NotEmpty(messageResId = 2131820778, sequence = 2, trim = true)
    getCardCode etEmail;
    @BindViews({2131297079, 2131296976, 2131297156, 2131297159})
    List<View> etFields;
    @BindView(2131297079)
    @NotEmpty(messageResId = 2131820869, sequence = 1, trim = true)
    @Order(1)
    EditText etName;
    @Password(messageResId = 2131820973, sequence = 6)
    @Order(3)
    @BindView(2131297156)
    @NotEmpty(messageResId = 2131820969, sequence = 5, trim = true)
    EditText etPin;
    @BindView(2131298784)
    ImageView ivToggleConfirmPin;
    @BindView(2131298781)
    ImageView ivTogglePin;
    @BindString(2131822112)
    String labelSetujuPendaftaran;
    private Validator m;
    private RegistrationPresenter n;
    @BindString(2131822092)
    String retry;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindViews({2131298625, 2131298527, 2131298692, 2131298695})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298625)
    LogoutDialog_ViewBinding tilName;
    @BindView(2131298692)
    LogoutDialog_ViewBinding tilPin;
    @BindView(2131298695)
    LogoutDialog_ViewBinding tilPinConfirm;
    @BindViews({2131299101, 2131299006, 2131299159, 2131299162})
    List<TextView> tvErrors;
    @BindView(2131299604)
    TextView txtTermsConditions;

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.n.e(new forgotPin(this.etEmail.getText().toString(), getPromotion.n(this.etPin.getText().toString()), this.etName.getText().toString()));
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etName.getEditableText()) {
            EditText editText = this.etName;
            int indexOf = this.etFields.indexOf(editText);
            if (this.tvErrors.get(indexOf).getVisibility() == 0 && !editText.getText().toString().isEmpty()) {
                this.tvErrors.get(indexOf).setVisibility(8);
                this.tilForms.get(indexOf).setBackgroundResource(2131231358);
            }
        } else if (editable == this.etEmail.getEditableText()) {
            getCardCode getcardcode = this.etEmail;
            int indexOf2 = this.etFields.indexOf(getcardcode);
            if (this.tvErrors.get(indexOf2).getVisibility() == 0 && getPromotion.a(this, this.tvErrors.get(indexOf2).getText().toString(), getcardcode)) {
                this.tvErrors.get(indexOf2).setVisibility(8);
                this.tilForms.get(indexOf2).setBackgroundResource(2131231358);
            }
        } else if (editable == this.etPin.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etPin)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrors.get(this.etFields.indexOf(this.etPin)).getText().toString().equals(getString(2131820973))) {
                if (this.etPin.getText().toString().length() == 6) {
                    this.tvErrors.get(this.etFields.indexOf(this.etPin)).setVisibility(8);
                    this.tilForms.get(this.etFields.indexOf(this.etPin)).setBackgroundResource(2131231358);
                }
            } else if (!this.etPin.getText().toString().isEmpty()) {
                this.tvErrors.get(this.etFields.indexOf(this.etPin)).setVisibility(8);
                this.tilForms.get(this.etFields.indexOf(this.etPin)).setBackgroundResource(2131231358);
            }
        } else if (editable != this.etConfirmPin.getEditableText() || this.tvErrors.get(this.etFields.indexOf(this.etConfirmPin)).getVisibility() != 0) {
        } else {
            if (this.tvErrors.get(this.etFields.indexOf(this.etConfirmPin)).getText().toString().equals(getString(2131820968))) {
                if (this.etConfirmPin.getText().toString().length() == 6) {
                    this.tvErrors.get(this.etFields.indexOf(this.etConfirmPin)).setVisibility(8);
                    this.tilForms.get(this.etFields.indexOf(this.etConfirmPin)).setBackgroundResource(2131231358);
                }
            } else if (!this.etConfirmPin.getText().toString().isEmpty()) {
                this.tvErrors.get(this.etFields.indexOf(this.etConfirmPin)).setVisibility(8);
                this.tilForms.get(this.etFields.indexOf(this.etConfirmPin)).setBackgroundResource(2131231358);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    public final void b(Bundle bundle) {
        b(bundle);
        setResult(-1);
        RegistrationPresenter registrationPresenter = new RegistrationPresenter();
        this.n = registrationPresenter;
        registrationPresenter.e = this;
        Validator validator = new Validator(this);
        this.m = validator;
        validator.setValidationListener(this);
        this.etEmail.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003a: INVOKE  
              (wrap: o.getCardCode : 0x0030: IGET  (r0v9 o.getCardCode A[REMOVE]) = (r4v0 'this' com.bca.smartbranch.activity.RegistrationActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.RegistrationActivity.etEmail o.getCardCode)
              (wrap: o.getPromotion$3 : 0x0037: CONSTRUCTOR  (r1v8 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.RegistrationActivity.b(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/RegistrationActivity.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getPromotion, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 15 more
            */
        /*
            this = this;
            r0 = r4
            r1 = r5
            r0.b(r1)
            r0 = r4
            r1 = -1
            r0.setResult(r1)
            com.bca.smartbranch.presenter.RegistrationPresenter r0 = new com.bca.smartbranch.presenter.RegistrationPresenter
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            r1 = r5
            r0.n = r1
            r0 = r5
            r1 = r4
            r0.e = r1
            com.mobsandgeeks.saripaar.Validator r0 = new com.mobsandgeeks.saripaar.Validator
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            r1 = r5
            r0.m = r1
            r0 = r5
            r1 = r4
            r0.setValidationListener(r1)
            r0 = r4
            o.getCardCode r0 = r0.etEmail
            o.getPromotion$3 r1 = new o.getPromotion$3
            r2 = r1
            r2.<init>()
            r0.addTextChangedListener(r1)
            r0 = r4
            android.widget.EditText r0 = r0.etName
            o.getPromotion$3 r1 = new o.getPromotion$3
            r2 = r1
            r2.<init>()
            r0.addTextChangedListener(r1)
            r0 = r4
            android.widget.TextView r0 = r0.txtTermsConditions
            r1 = r4
            java.lang.String r1 = r1.labelSetujuPendaftaran
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r0.setText(r1)
            r0 = r4
            android.widget.EditText r0 = r0.etName
            r1 = r4
            r0.addTextChangedListener(r1)
            r0 = r4
            o.getCardCode r0 = r0.etEmail
            r1 = r4
            r0.addTextChangedListener(r1)
            r0 = r4
            android.widget.EditText r0 = r0.etPin
            r1 = r4
            r0.addTextChangedListener(r1)
            r0 = r4
            android.widget.EditText r0 = r0.etConfirmPin
            r1 = r4
            r0.addTextChangedListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.RegistrationActivity.b(android.os.Bundle):void");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.RegistrationActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationActivity.this.v();
            }
        }).g();
    }

    @OnFocusChange({2131297079, 2131296976, 2131297156, 2131297159})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296976:
                    this.tilEmail.setHintEnabled(true);
                    return;
                case 2131297079:
                    this.tilName.setHintEnabled(true);
                    return;
                case 2131297156:
                    this.tilPin.setHintEnabled(true);
                    return;
                case 2131297159:
                    this.tilPinConfirm.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296976:
                    if (this.etEmail.getText().toString().isEmpty()) {
                        this.tilEmail.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297079:
                    if (this.etName.getText().toString().isEmpty()) {
                        this.tilName.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297156:
                    if (this.etPin.getText().toString().isEmpty()) {
                        this.tilPin.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297159:
                    if (this.etConfirmPin.getText().toString().isEmpty()) {
                        this.tilPinConfirm.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @OnClick({2131299395})
    public void login() {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        RegistrationPresenter registrationPresenter = this.n;
        Call<OpenAccountSuccessActivity<Object>> call = registrationPresenter.c;
        if (call != null) {
            call.cancel();
        }
        registrationPresenter.e = null;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationFailed(List<ValidationError> list) {
        View view = list.get(0).getView();
        String message = list.get(0).getFailedRules().get(0).getMessage(this);
        if (view instanceof EditText) {
            view.requestFocus();
            switch (view.getId()) {
                case 2131296976:
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilEmail.setBackgroundResource(2131230869);
                    return;
                case 2131297079:
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilName.setBackgroundResource(2131230869);
                    return;
                case 2131297156:
                    this.tvErrors.get(2).setVisibility(0);
                    this.tvErrors.get(2).setText(message);
                    this.tilPin.setBackgroundResource(2131230869);
                    return;
                case 2131297159:
                    this.tvErrors.get(3).setVisibility(0);
                    this.tvErrors.get(3).setText(message);
                    this.tilPinConfirm.setBackgroundResource(2131230869);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        v();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final int p() {
        return 2131492989;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296441})
    public void register(View view) {
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131231358);
        }
        this.m.validate();
    }

    @Override // com.bca.smartbranch.presenter.RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void s() {
        q();
        this.tvErrors.get(1).setVisibility(0);
        this.tvErrors.get(1).setText(getString(2131820777));
        this.tilEmail.setBackgroundResource(2131230869);
    }

    @OnClick({2131299604})
    public void termCondition(View view) {
        new TermConditionDialog().show(l(), "TermConditionDialog");
    }

    @OnClick({2131298781})
    public void togglePIN() {
        if (this.etPin.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())) {
            this.etPin.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.ivTogglePin.setImageDrawable(getResources().getDrawable(2131231152));
            return;
        }
        this.etPin.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        this.ivTogglePin.setImageDrawable(getResources().getDrawable(2131231151));
    }

    @OnClick({2131298784})
    public void togglePINConfirm() {
        if (this.etConfirmPin.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())) {
            this.etConfirmPin.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.ivToggleConfirmPin.setImageDrawable(getResources().getDrawable(2131231152));
            return;
        }
        this.etConfirmPin.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        this.ivToggleConfirmPin.setImageDrawable(getResources().getDrawable(2131231151));
    }

    @Override // com.bca.smartbranch.presenter.RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void w() {
        t();
    }

    @Override // com.bca.smartbranch.presenter.RegistrationPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void y() {
        q();
        Intent intent = new Intent(this, RegistrationSuccessActivity.class);
        intent.putExtra("email", this.etEmail.getText().toString());
        startActivity(intent);
        finish();
    }
}
