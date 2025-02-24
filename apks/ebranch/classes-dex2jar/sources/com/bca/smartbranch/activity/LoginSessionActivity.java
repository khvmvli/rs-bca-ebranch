package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.App;
import com.bca.smartbranch.activity.LoginSessionActivity;
import com.bca.smartbranch.dialog.LimitActivationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.UserBlockedDialog;
import com.bca.smartbranch.presenter.LoginFingerprintPresenter;
import com.bca.smartbranch.presenter.LoginPresenter;
import com.bca.smartbranch.presenter.ReRegistrationPresenter;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Password;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.util.List;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LandingActivity;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.getCardCode;
import o.getPromotion;
import o.onChooseBankTujuan;
import o.onChooseUlangi;
import o.onClickNegara;
import o.realmSet;
import o.setCardSlogan;
import o.setOnHierarchyChangeListener;
import o.setPopupBackgroundDrawable;
import o.sumberDanaEvent;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/LoginSessionActivity.class */
public class LoginSessionActivity extends BaseActivityPreLogin implements LoginPresenter.RemoteActionCompatParcelizer, TextWatcher, LoginFingerprintPresenter.IconCompatParcelizer, Validator.ValidationListener, ReRegistrationPresenter.write {
    @BindView(2131296470)
    CheckBox cbxRememberMe;
    @onClickNegara
    public SharedPreferences.Editor editor;
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 2)
    @Order(1)
    @BindView(2131296976)
    @NotEmpty(messageResId = 2131820778, sequence = 1, trim = true)
    public getCardCode etEmail;
    @BindViews({2131296976, 2131297156})
    List<View> etFields;
    @Password(messageResId = 2131820973, sequence = 4)
    @Order(2)
    @BindView(2131297156)
    @NotEmpty(messageResId = 2131820969, sequence = 3, trim = true)
    public setPopupBackgroundDrawable etPin;
    @BindView(2131298781)
    ImageView ivTogglePin;
    private String k;
    public LoginPresenter l;
    @BindString(2131821664)
    String labelForgotPin;
    private String m;
    @BindString(2131822234)
    String masuk;
    public LoginFingerprintPresenter n;

    /* renamed from: o */
    public String f18o;
    private KeyStore q;
    private Validator r;
    @BindString(2131822092)
    String retry;
    private ReRegistrationPresenter s;
    @onClickNegara
    public SharedPreferences sharedPreferences;
    @BindView(2131298420)
    ScrollView svMain;
    private Signature t;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindViews({2131298527, 2131298692})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298692)
    LogoutDialog_ViewBinding tilPin;
    @BindViews({2131299006, 2131299159})
    List<TextView> tvErrors;
    @BindView(2131299261)
    TextView txtForgotPin;

    @Override // com.bca.smartbranch.presenter.LoginPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer
    public final void a(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.LoginPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void a_(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etEmail.getEditableText()) {
            getCardCode getcardcode = this.etEmail;
            int indexOf = this.etFields.indexOf(getcardcode);
            if (this.tvErrors.get(indexOf).getVisibility() == 0 && getPromotion.a(this, this.tvErrors.get(indexOf).getText().toString(), getcardcode)) {
                this.tvErrors.get(this.etFields.indexOf(getcardcode)).setVisibility(8);
                this.tilForms.get(this.etFields.indexOf(getcardcode)).setBackgroundResource(2131231358);
            }
        } else if (editable != this.etPin.getEditableText() || this.tvErrors.get(this.etFields.indexOf(this.etPin)).getVisibility() != 0) {
        } else {
            if (this.tvErrors.get(this.etFields.indexOf(this.etPin)).getText().toString().equals(getString(2131820973))) {
                if (this.etPin.getText().toString().length() == 6) {
                    this.tvErrors.get(this.etFields.indexOf(this.etPin)).setVisibility(8);
                    this.tilForms.get(this.etFields.indexOf(this.etPin)).setBackgroundResource(2131231358);
                }
            } else if (!this.etPin.getText().toString().isEmpty()) {
                this.tvErrors.get(this.etFields.indexOf(this.etPin)).setVisibility(8);
                this.tilForms.get(this.etFields.indexOf(this.etPin)).setBackgroundResource(2131231358);
            }
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    public final void b(Bundle bundle) {
        b(bundle);
        App.d().a(this);
        setCardSlogan.e().d();
        this.k = this.sharedPreferences.getString("email_session", "");
        LoginPresenter loginPresenter = new LoginPresenter();
        this.l = loginPresenter;
        loginPresenter.e = this;
        LoginFingerprintPresenter loginFingerprintPresenter = new LoginFingerprintPresenter();
        this.n = loginFingerprintPresenter;
        loginFingerprintPresenter.d = this;
        ReRegistrationPresenter reRegistrationPresenter = new ReRegistrationPresenter();
        this.s = reRegistrationPresenter;
        reRegistrationPresenter.e = this;
        Validator validator = new Validator(this);
        this.r = validator;
        validator.setValidationListener(this);
        this.r.setValidationMode(Validator.Mode.IMMEDIATE);
        try {
            this.q = KeyStore.getInstance("AndroidKeyStore");
            this.t = Signature.getInstance("SHA256withECDSA");
        } catch (KeyStoreException | NoSuchAlgorithmException e) {
        }
        this.etEmail.setText(this.sharedPreferences.getString("email_remember", ""));
        if (!this.sharedPreferences.getString("email_remember", "").isEmpty()) {
            this.cbxRememberMe.setChecked(true);
            this.tilEmail.setHintEnabled(true);
        }
        this.txtForgotPin.setText(Html.fromHtml(this.labelForgotPin));
        this.etEmail.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e5: INVOKE  
              (wrap: o.getCardCode : 0x00db: IGET  (r0v27 o.getCardCode A[REMOVE]) = (r5v0 'this' com.bca.smartbranch.activity.LoginSessionActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.LoginSessionActivity.etEmail o.getCardCode)
              (wrap: o.getPromotion$3 : 0x00e2: CONSTRUCTOR  (r1v25 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.LoginSessionActivity.b(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/LoginSessionActivity.class
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
        // Method dump skipped, instructions count: 531
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.LoginSessionActivity.b(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0309  */
    @Override // com.bca.smartbranch.presenter.LoginPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void b(final o.onChooseUlangi r9, boolean r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 892
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.LoginSessionActivity.b(o.onChooseUlangi, boolean, java.lang.String):void");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void c(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        LimitActivationDialog limitActivationDialog = new LimitActivationDialog();
        limitActivationDialog.setArguments(bundle);
        limitActivationDialog.show(l(), LimitActivationDialog.TAG);
    }

    @OnClick({2131299548})
    public void clickedRemember() {
        CheckBox checkBox = this.cbxRememberMe;
        checkBox.setChecked(!checkBox.isChecked());
    }

    @Override // com.bca.smartbranch.presenter.LoginPresenter.RemoteActionCompatParcelizer
    public final void d(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.LoginPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer
    public final void f(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        UserBlockedDialog userBlockedDialog = new UserBlockedDialog();
        userBlockedDialog.setArguments(bundle);
        userBlockedDialog.show(l(), "UserBlockedDialog");
    }

    @OnClick({2131299261})
    public void forgotPin(View view) {
        startActivityForResult(new Intent(this, ForgotPassActivity.class), 0);
    }

    @Override // com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer
    public final void g(String str) {
        this.sharedPreferences.edit().putString("is_use_fingerprint", "N").commit();
        this.sharedPreferences.edit().putString("email_fingerprint", "").commit();
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.LoginPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void g_() {
        t();
    }

    @Override // com.bca.smartbranch.presenter.LoginPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.LoginFingerprintPresenter.IconCompatParcelizer
    public final void h(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
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

    @Override // com.bca.smartbranch.presenter.LoginPresenter.RemoteActionCompatParcelizer
    public final void i(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @OnFocusChange({2131296976, 2131297156})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131296976) {
                this.tilEmail.setHintEnabled(true);
            } else if (id == 2131297156) {
                this.tilPin.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131296976) {
                if (id2 == 2131297156 && this.etPin.getText().toString().isEmpty()) {
                    this.tilPin.setHintEnabled(false);
                }
            } else if (this.etEmail.getText().toString().isEmpty()) {
                this.tilEmail.setHintEnabled(false);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void j(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @OnClick({2131296398})
    public void login(View view) {
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131231358);
        }
        this.r.validate();
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
        if (i == 0 && i2 == 86) {
            finish();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onAktivasiUlangEvent(onChooseBankTujuan onchoosebanktujuan) {
        this.s.e(new LandingActivity(this.etEmail.getText().toString()));
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        onBackPressed();
        startActivity(new Intent(this, LandingActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) this);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        LoginPresenter loginPresenter = this.l;
        Call<OpenAccountSuccessActivity<onChooseUlangi>> call = loginPresenter.c;
        if (call != null) {
            call.cancel();
        }
        loginPresenter.e = null;
        LoginFingerprintPresenter loginFingerprintPresenter = this.n;
        Call<OpenAccountSuccessActivity<onChooseUlangi>> call2 = loginFingerprintPresenter.e;
        if (call2 != null) {
            call2.cancel();
        }
        loginFingerprintPresenter.d = null;
        ReRegistrationPresenter reRegistrationPresenter = this.s;
        Call<OpenAccountSuccessActivity<Object>> call3 = reRegistrationPresenter.b;
        if (call3 != null) {
            call3.cancel();
        }
        reRegistrationPresenter.e = null;
        onDestroy();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onLoginFingerprintEvent(sumberDanaEvent sumberdanaevent) {
        if (Build.VERSION.SDK_INT >= 23) {
            FingerprintManager.CryptoObject cryptoObject = sumberdanaevent.e;
            t();
            FirebaseMessaging.getInstance().getToken().d((realmSet.localClearingCodeBank<String>) new realmSet.localClearingCodeBank(cryptoObject) { // from class: o.isUseFingerprint
                public final /* synthetic */ FingerprintManager.CryptoObject b;

                {
                    this.b = r5;
                }

                public final void b(setJatuhTempo setjatuhtempo) {
                    byte[] bArr;
                    LoginSessionActivity loginSessionActivity = LoginSessionActivity.this;
                    FingerprintManager.CryptoObject cryptoObject2 = this.b;
                    String str = setjatuhtempo.b() ? (String) setjatuhtempo.c() : "";
                    String str2 = loginSessionActivity.f18o;
                    Long valueOf = Long.valueOf(new SecureRandom().nextLong());
                    String c = getPromotion.c();
                    String valueOf2 = String.valueOf(getPromotion.b(loginSessionActivity));
                    String string = Settings.Secure.getString(loginSessionActivity.getContentResolver(), "android_id");
                    InfoValueTodayORActivity infoValueTodayORActivity = new InfoValueTodayORActivity();
                    Signature signature = cryptoObject2.getSignature();
                    try {
                        signature.update(InfoValueTodayORActivity.d(str2, valueOf, c, str, valueOf2, string));
                        bArr = signature.sign();
                    } catch (SignatureException e) {
                        e.printStackTrace();
                        bArr = new byte[0];
                    }
                    infoValueTodayORActivity.e = str2;
                    infoValueTodayORActivity.c = valueOf;
                    infoValueTodayORActivity.f = c;
                    infoValueTodayORActivity.i = str;
                    infoValueTodayORActivity.b = valueOf2;
                    infoValueTodayORActivity.a = string;
                    infoValueTodayORActivity.d = new StringBuilder(Base64.encodeToString(bArr, 2)).reverse().toString();
                    loginSessionActivity.n.d(infoValueTodayORActivity);
                }
            });
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
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
            int id = view.getId();
            if (id == 2131296976) {
                this.tvErrors.get(0).setVisibility(0);
                this.tvErrors.get(0).setText(message);
                this.tilEmail.setBackgroundResource(2131230869);
            } else if (id == 2131297156) {
                this.tvErrors.get(1).setVisibility(0);
                this.tvErrors.get(1).setText(message);
                this.tilPin.setBackgroundResource(2131230869);
            }
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        t();
        FirebaseMessaging.getInstance().getToken().d((realmSet.localClearingCodeBank<String>) new realmSet.localClearingCodeBank() { // from class: o.subscribeLogoutEvent
            public final void b(setJatuhTempo setjatuhtempo) {
                LoginSessionActivity loginSessionActivity = LoginSessionActivity.this;
                String str = "";
                String str2 = setjatuhtempo.b() ? (String) setjatuhtempo.c() : "";
                String obj = loginSessionActivity.etEmail.getText().toString();
                String n = getPromotion.n(loginSessionActivity.etPin.getText().toString());
                String c = getPromotion.c();
                String valueOf = String.valueOf(getPromotion.b(loginSessionActivity));
                String string = Settings.Secure.getString(loginSessionActivity.getContentResolver(), "android_id");
                if (Build.VERSION.SDK_INT >= 23) {
                    str = getAnnualFeeBasicDisplayAmount.e();
                }
                loginSessionActivity.l.e(new login(obj, n, c, str2, valueOf, string, str));
            }
        });
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final int p() {
        return 2131492965;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final Activity r() {
        return this;
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

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void y() {
        q();
        Intent intent = new Intent(this, ReRegistrationSuccessActivity.class);
        intent.putExtra("email", this.etEmail.getText().toString());
        intent.putExtra("toolbar_title", this.masuk);
        startActivity(intent);
        finishAffinity();
    }
}
