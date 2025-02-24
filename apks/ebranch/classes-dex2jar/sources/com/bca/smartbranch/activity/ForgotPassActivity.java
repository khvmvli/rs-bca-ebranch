package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.dialog.LimitActivationDialog;
import com.bca.smartbranch.dialog.LimitPengaturanPINDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.UserBlockedDialog;
import com.bca.smartbranch.presenter.ForgotEmailPassPresenter;
import com.bca.smartbranch.presenter.ReRegistrationPresenter;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import java.util.List;
import o.InfoCodewordORActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LandingActivity;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.getPromotion;
import o.onChooseBankTujuan;
import o.setPopupBackgroundDrawable;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ForgotPassActivity.class */
public class ForgotPassActivity extends BaseActivityPreLogin implements ForgotEmailPassPresenter.write, Validator.ValidationListener, ReRegistrationPresenter.write, TextWatcher {
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 2)
    @Order(1)
    @BindView(2131296976)
    @NotEmpty(messageResId = 2131820778, sequence = 1, trim = true)
    setPopupBackgroundDrawable etEmail;
    @BindViews({2131296976})
    List<View> etFields;
    private Validator k;
    private ReRegistrationPresenter l;
    @BindString(2131822205)
    String lupaPin;
    private ForgotEmailPassPresenter n;
    @BindString(2131822092)
    String retry;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindViews({2131298527})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindViews({2131299006})
    List<TextView> tvErrors;

    static /* synthetic */ void a(ForgotPassActivity forgotPassActivity) {
        forgotPassActivity.n.e(new InfoCodewordORActivity(forgotPassActivity.etEmail.getText().toString()));
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write
    public final void a(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write, com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void a_(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.ForgotPassActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotPassActivity.a(ForgotPassActivity.this);
            }
        }).g();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        setPopupBackgroundDrawable setpopupbackgrounddrawable = this.etEmail;
        int indexOf = this.etFields.indexOf(setpopupbackgrounddrawable);
        if (this.tvErrors.get(indexOf).getVisibility() == 0 && getPromotion.a(this, this.tvErrors.get(indexOf).getText().toString(), setpopupbackgrounddrawable)) {
            this.tvErrors.get(indexOf).setVisibility(8);
            this.tilForms.get(indexOf).setBackgroundResource(2131231358);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    public final void b(Bundle bundle) {
        b(bundle);
        ForgotEmailPassPresenter forgotEmailPassPresenter = new ForgotEmailPassPresenter();
        this.n = forgotEmailPassPresenter;
        forgotEmailPassPresenter.d = this;
        ReRegistrationPresenter reRegistrationPresenter = new ReRegistrationPresenter();
        this.l = reRegistrationPresenter;
        reRegistrationPresenter.e = this;
        Validator validator = new Validator(this);
        this.k = validator;
        validator.setValidationListener(this);
        this.etEmail.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0047: INVOKE  
              (wrap: o.setPopupBackgroundDrawable : 0x003d: IGET  (r0v11 o.setPopupBackgroundDrawable A[REMOVE]) = (r4v0 'this' com.bca.smartbranch.activity.ForgotPassActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.ForgotPassActivity.etEmail o.setPopupBackgroundDrawable)
              (wrap: o.getPromotion$3 : 0x0044: CONSTRUCTOR  (r1v10 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.ForgotPassActivity.b(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/ForgotPassActivity.class
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
            com.bca.smartbranch.presenter.ForgotEmailPassPresenter r0 = new com.bca.smartbranch.presenter.ForgotEmailPassPresenter
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            r1 = r5
            r0.n = r1
            r0 = r5
            r1 = r4
            r0.d = r1
            com.bca.smartbranch.presenter.ReRegistrationPresenter r0 = new com.bca.smartbranch.presenter.ReRegistrationPresenter
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            r1 = r5
            r0.l = r1
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
            r0.k = r1
            r0 = r5
            r1 = r4
            r0.setValidationListener(r1)
            r0 = r4
            o.setPopupBackgroundDrawable r0 = r0.etEmail
            o.getPromotion$3 r1 = new o.getPromotion$3
            r2 = r1
            r2.<init>()
            r0.addTextChangedListener(r1)
            r0 = r4
            o.setPopupBackgroundDrawable r0 = r0.etEmail
            r1 = r4
            r0.addTextChangedListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ForgotPassActivity.b(android.os.Bundle):void");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write, com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void c(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        LimitPengaturanPINDialog limitPengaturanPINDialog = new LimitPengaturanPINDialog();
        limitPengaturanPINDialog.setArguments(bundle);
        limitPengaturanPINDialog.show(l(), LimitActivationDialog.TAG);
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write
    public final void d(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write, com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void g_() {
        t();
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void h_(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write
    public final void i(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        UserBlockedDialog userBlockedDialog = new UserBlockedDialog();
        userBlockedDialog.setArguments(bundle);
        userBlockedDialog.show(l(), "UserBlockedDialog");
    }

    @OnFocusChange({2131296976})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131296976) {
                this.tilEmail.setHintEnabled(true);
            }
        } else if (view.getId() == 2131296976 && this.etEmail.getText().toString().isEmpty()) {
            this.tilEmail.setHintEnabled(false);
        }
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void j(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onAktivasiUlangEvent(onChooseBankTujuan onchoosebanktujuan) {
        this.l.e(new LandingActivity(this.etEmail.getText().toString()));
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        ForgotEmailPassPresenter forgotEmailPassPresenter = this.n;
        Call<OpenAccountSuccessActivity<Object>> call = forgotEmailPassPresenter.e;
        if (call != null) {
            call.cancel();
        }
        forgotEmailPassPresenter.d = null;
        ReRegistrationPresenter reRegistrationPresenter = this.l;
        Call<OpenAccountSuccessActivity<Object>> call2 = reRegistrationPresenter.b;
        if (call2 != null) {
            call2.cancel();
        }
        reRegistrationPresenter.e = null;
        documentProvider.b().e(this);
        onDestroy();
    }

    @Override // o.setPadding, o.getView, android.app.Activity
    public void onStart() {
        onStart();
        documentProvider.b().c(this);
    }

    @Override // o.setPadding, o.getView, android.app.Activity
    public void onStop() {
        documentProvider.b().e(this);
        onStop();
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
            if (view.getId() == 2131296976) {
                this.tvErrors.get(0).setVisibility(0);
                this.tvErrors.get(0).setText(message);
                this.tilEmail.setBackgroundResource(2131230869);
            }
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        this.n.e(new InfoCodewordORActivity(this.etEmail.getText().toString()));
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final int p() {
        return 2131492951;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296452})
    public void send(View view) {
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131231358);
        }
        this.k.validate();
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write
    public final void u() {
        q();
        this.tvErrors.get(0).setVisibility(0);
        this.tvErrors.get(0).setText(getString(2131820779));
        this.tilEmail.setBackgroundResource(2131230869);
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write
    public final void v() {
        q();
        setResult(86);
        Intent intent = new Intent(this, ForgotPassSuccessActivity.class);
        intent.putExtra("email", this.etEmail.getText().toString());
        startActivity(intent);
        finish();
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void y() {
        q();
        Intent intent = new Intent(this, ReRegistrationSuccessActivity.class);
        intent.putExtra("email", this.etEmail.getText().toString());
        intent.putExtra("toolbar_title", this.lupaPin);
        startActivity(intent);
        finish();
    }
}
