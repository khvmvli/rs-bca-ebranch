package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.ResetAccountActivity;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DeleteAccountFailedDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.ResetAccountSuccessDialog;
import com.bca.smartbranch.presenter.ResetAccountPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.ImportFlag;
import io.realm.Realm;
import java.util.List;
import java.util.regex.Pattern;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ResetAccountActivity.class */
public class ResetAccountActivity extends BaseActivityPostLogin implements Validator.ValidationListener, TextWatcher, ResetAccountPresenter.write {
    static String f;
    @BindString(2131821609)
    String descResetAccount;
    @BindView(2131296970)
    @NotEmpty(messageResId = 2131820767, sequence = 1, trim = true)
    @Order(1)
    EditText etConfirm;
    @BindViews({2131296970})
    List<View> etFields;
    @BindView(2131297766)
    LinearLayout llMain;
    private Realm n;
    private Validator q;
    private int r = 0;
    @BindString(2131822092)
    String retry;
    private ResetAccountPresenter t;
    @BindView(2131298521)
    LogoutDialog_ViewBinding tilConfirm;
    @BindViews({2131298521})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822039)
    String toolbarTitle;
    @BindView(2131298918)
    TextView tvDesc;
    @BindViews({2131299000})
    List<TextView> tvErrors;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    public final /* synthetic */ void a(Realm realm) {
        this.m.setAcctNo("");
        this.m.setIdType("");
        this.m.setIdNum("");
        this.m.setVerified("N");
        realm.copyToRealmOrUpdate((Realm) this.m, new ImportFlag[0]);
    }

    @Override // com.bca.smartbranch.presenter.ResetAccountPresenter.write
    public final void a(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etConfirm.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etConfirm);
        }
        String upperCase = this.etConfirm.getText().toString().replace(Pattern.compile("[^A-Za-z]+").pattern(), "").toUpperCase();
        String str = upperCase;
        if (upperCase.length() > 6) {
            str = upperCase.substring(0, 6);
        }
        int length = this.etConfirm.length();
        this.etConfirm.removeTextChangedListener(this);
        this.etConfirm.setText(str);
        this.etConfirm.addTextChangedListener(this);
        int length2 = (this.r + this.etConfirm.length()) - length;
        if (length2 > 0) {
            this.etConfirm.setSelection(length2);
        } else {
            this.etConfirm.setSelection(0);
        }
    }

    @Override // com.bca.smartbranch.presenter.ResetAccountPresenter.write
    public final void b(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.ResetAccountPresenter.write
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Validator validator = new Validator(this);
        this.q = validator;
        validator.setValidationListener(this);
        Validator validator2 = this.q;
        EditText editText = this.etConfirm;
        validator2.put(editText, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: INVOKE  
              (r0v5 'validator2' com.mobsandgeeks.saripaar.Validator)
              (r0v7 'editText' android.widget.EditText)
              (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v2 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
              (wrap: o.getPromotion$1 : 0x002f: CONSTRUCTOR  (r0v7 'editText' android.widget.EditText) call: o.getPromotion.1.<init>(android.widget.EditText):void type: CONSTRUCTOR)
             elemType: com.mobsandgeeks.saripaar.QuickRule)
             type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.activity.ResetAccountActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/ResetAccountActivity.class
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
            	at jadx.core.codegen.InsnGen.processVarArg(InsnGen.java:998)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:971)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 15 more
            */
        /*
            this = this;
            r0 = r9
            r1 = r10
            r0.d(r1)
            com.mobsandgeeks.saripaar.Validator r0 = new com.mobsandgeeks.saripaar.Validator
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r10 = r0
            r0 = r9
            r1 = r10
            r0.q = r1
            r0 = r10
            r1 = r9
            r0.setValidationListener(r1)
            r0 = r9
            com.mobsandgeeks.saripaar.Validator r0 = r0.q
            r10 = r0
            r0 = r9
            android.widget.EditText r0 = r0.etConfirm
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = 1
            com.mobsandgeeks.saripaar.QuickRule[] r2 = new com.mobsandgeeks.saripaar.QuickRule[r2]
            r3 = r2
            r4 = 0
            o.getPromotion$1 r5 = new o.getPromotion$1
            r6 = r5
            r7 = r11
            r6.<init>(r7)
            r3[r4] = r5
            r0.put(r1, r2)
            r0 = r9
            io.realm.Realm r1 = io.realm.Realm.getDefaultInstance()
            r0.n = r1
            r0 = r9
            r1 = r9
            o.setInputType r1 = r1.toolbar
            r0.b(r1)
            r0 = r9
            o.setBackgroundResource r0 = r0.i()
            r0 = r9
            o.setBackgroundResource r0 = r0.i()
            r1 = 1
            r0.d(r1)
            r0 = r9
            o.setBackgroundResource r0 = r0.i()
            java.lang.String r1 = ""
            r0.d(r1)
            r0 = r9
            android.widget.TextView r0 = r0.txtToolbarTitle
            r1 = r9
            java.lang.String r1 = r1.toolbarTitle
            r0.setText(r1)
            com.bca.smartbranch.presenter.ResetAccountPresenter r0 = new com.bca.smartbranch.presenter.ResetAccountPresenter
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            r1 = r10
            r0.t = r1
            r0 = r10
            r1 = r9
            r0.d = r1
            r0 = r9
            android.widget.TextView r0 = r0.tvDesc
            r1 = r9
            java.lang.String r1 = r1.descResetAccount
            r2 = 0
            android.text.Spanned r1 = o.getDialog.c(r1, r2)
            r0.setText(r1)
            r0 = r9
            android.widget.EditText r0 = r0.etConfirm
            r1 = r9
            r0.addTextChangedListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ResetAccountActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.ResetAccountPresenter.write
    public final void d(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.ResetAccountPresenter.write
    public final void e(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @OnFocusChange({2131296970})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131296970) {
                this.tilConfirm.setHintEnabled(true);
            }
        } else if (view.getId() == 2131296970 && this.etConfirm.getText().toString().isEmpty()) {
            this.tilConfirm.setHintEnabled(false);
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        ResetAccountPresenter resetAccountPresenter = this.t;
        Call<OpenAccountSuccessActivity<Object>> call = resetAccountPresenter.a;
        if (call != null) {
            call.cancel();
        }
        resetAccountPresenter.d = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.r = this.etConfirm.getSelectionStart();
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationFailed(List<ValidationError> list) {
        EditText editText = null;
        for (ValidationError validationError : list) {
            View view = validationError.getView();
            String message = validationError.getFailedRules().get(0).getMessage(this);
            if (view instanceof EditText) {
                EditText editText2 = editText;
                if (editText == null) {
                    editText2 = (EditText) view;
                }
                if (view.getId() != 2131296970) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilConfirm.setBackgroundResource(2131230870);
                    editText = editText2;
                }
            } else {
                a(this.llMain, message);
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        ResetAccountPresenter resetAccountPresenter = this.t;
        String e = getPromotion.e(this.m);
        resetAccountPresenter.d.y();
        Call<OpenAccountSuccessActivity<Object>> f2 = resetAccountPresenter.apiService.f(e);
        resetAccountPresenter.a = f2;
        f2.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: INVOKE  
              (r0v9 'f2' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
              (wrap: com.bca.smartbranch.presenter.ResetAccountPresenter$5 : 0x002c: CONSTRUCTOR  (r1v2 com.bca.smartbranch.presenter.ResetAccountPresenter$5 A[REMOVE]) = (r0v1 'resetAccountPresenter' com.bca.smartbranch.presenter.ResetAccountPresenter) call: com.bca.smartbranch.presenter.ResetAccountPresenter.5.<init>(com.bca.smartbranch.presenter.ResetAccountPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.ResetAccountActivity.onValidationSucceeded():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/ResetAccountActivity.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.ResetAccountPresenter, state: GENERATED_AND_UNLOADED
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
            r0 = r5
            com.bca.smartbranch.presenter.ResetAccountPresenter r0 = r0.t
            r6 = r0
            r0 = r5
            com.bca.smartbranch.data.localdb.User r0 = r0.m
            java.lang.String r0 = o.getPromotion.e(r0)
            r7 = r0
            r0 = r6
            com.bca.smartbranch.presenter.ResetAccountPresenter$write r0 = r0.d
            r0.y()
            r0 = r6
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r7
            retrofit2.Call r0 = r0.f(r1)
            r7 = r0
            r0 = r6
            r1 = r7
            r0.a = r1
            r0 = r7
            com.bca.smartbranch.presenter.ResetAccountPresenter$5 r1 = new com.bca.smartbranch.presenter.ResetAccountPresenter$5
            r2 = r1
            r3 = r6
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ResetAccountActivity.onValidationSucceeded():void");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = f;
        this.j = f;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131493000;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296445})
    public void resetAccount() {
        getPromotion.d(this);
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.q.validate();
    }

    @Override // com.bca.smartbranch.presenter.ResetAccountPresenter.write
    public final void s() {
        x();
        this.n.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilTellerNotificationActivity_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ResetAccountActivity.this.a(realm);
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.a(User.class, this.m));
        ResetAccountSuccessDialog resetAccountSuccessDialog = new ResetAccountSuccessDialog();
        resetAccountSuccessDialog.setArguments(bundle);
        resetAccountSuccessDialog.show(l(), "ResetAccountSuccessDialog");
    }

    @Override // com.bca.smartbranch.presenter.ResetAccountPresenter.write
    public final void t() {
        x();
        new DeleteAccountFailedDialog().show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ResetAccountPresenter.write
    public final void y() {
        z();
    }
}
