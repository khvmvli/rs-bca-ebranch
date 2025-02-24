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
import com.bca.smartbranch.activity.BN7PengambilanUpdateReceiverActivity;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.JenisIdDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.UpdateReceiverSuccessDialog;
import com.bca.smartbranch.presenter.UpdateReceiverDataPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.List;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.NoAtmEChannelActivity;
import o.OpenAccountSuccessActivity;
import o.RegistrationActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.updateProfil;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BN7PengambilanUpdateReceiverActivity.class */
public class BN7PengambilanUpdateReceiverActivity extends BaseActivityPostLogin implements Validator.ValidationListener, UpdateReceiverDataPresenter.IconCompatParcelizer, TextWatcher {
    @BindViews({2131296993, 2131297127, 2131297072})
    List<View> etFields;
    @BindView(2131296993)
    @NotEmpty(messageResId = 2131820809, trim = true)
    @Order(1)
    EditText etJenisID;
    @BindView(2131297072)
    @NotEmpty(messageResId = 2131820864, trim = true)
    @Order(3)
    EditText etNamaPengambil;
    @BindView(2131297127)
    @NotEmpty(messageResId = 2131820930, trim = true)
    @Order(2)
    EditText etNomorIDPengambil;
    private String f;
    @BindView(2131297969)
    LinearLayout llMain;
    private String n;
    private Validator r;
    @BindString(2131822092)
    String retry;
    private UpdateReceiverDataPresenter s;
    @BindViews({2131298542, 2131298647, 2131298601})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298542)
    LogoutDialog_ViewBinding tilJenisID;
    @BindView(2131298601)
    LogoutDialog_ViewBinding tilNama;
    @BindView(2131298647)
    LogoutDialog_ViewBinding tilNomorID;
    @BindString(2131822191)
    String title;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822324)
    String toolbarTitle;
    @BindViews({2131299017, 2131299121, 2131299078})
    List<TextView> tvErrors;
    @BindView(2131299658)
    TextView tvTitlePage;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    private void a(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    /* renamed from: y */
    public void s() {
        UpdateReceiverDataPresenter updateReceiverDataPresenter = this.s;
        NoAtmEChannelActivity noAtmEChannelActivity = new NoAtmEChannelActivity(this.n, this.m.getEmail(), this.m.getImei(), this.m.getSessionId(), this.etJenisID.getText().toString().toUpperCase(), this.etNamaPengambil.getText().toString(), this.etNomorIDPengambil.getText().toString());
        updateReceiverDataPresenter.a.t();
        Call<OpenAccountSuccessActivity> c = updateReceiverDataPresenter.apiService.c(noAtmEChannelActivity);
        updateReceiverDataPresenter.b = c;
        c.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0069: INVOKE  
              (r0v7 'c' retrofit2.Call<o.OpenAccountSuccessActivity>)
              (wrap: com.bca.smartbranch.presenter.UpdateReceiverDataPresenter$3 : 0x0066: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.UpdateReceiverDataPresenter$3 A[REMOVE]) = (r0v1 'updateReceiverDataPresenter' com.bca.smartbranch.presenter.UpdateReceiverDataPresenter) call: com.bca.smartbranch.presenter.UpdateReceiverDataPresenter.3.<init>(com.bca.smartbranch.presenter.UpdateReceiverDataPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.BN7PengambilanUpdateReceiverActivity.y():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/BN7PengambilanUpdateReceiverActivity.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.UpdateReceiverDataPresenter, state: GENERATED_AND_UNLOADED
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
            r0 = r10
            com.bca.smartbranch.presenter.UpdateReceiverDataPresenter r0 = r0.s
            r11 = r0
            o.NoAtmEChannelActivity r0 = new o.NoAtmEChannelActivity
            r1 = r0
            r2 = r10
            java.lang.String r2 = r2.n
            r3 = r10
            com.bca.smartbranch.data.localdb.User r3 = r3.m
            java.lang.String r3 = r3.getEmail()
            r4 = r10
            com.bca.smartbranch.data.localdb.User r4 = r4.m
            java.lang.String r4 = r4.getImei()
            r5 = r10
            com.bca.smartbranch.data.localdb.User r5 = r5.m
            java.lang.String r5 = r5.getSessionId()
            r6 = r10
            android.widget.EditText r6 = r6.etJenisID
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toUpperCase()
            r7 = r10
            android.widget.EditText r7 = r7.etNamaPengambil
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            r8 = r10
            android.widget.EditText r8 = r8.etNomorIDPengambil
            android.text.Editable r8 = r8.getText()
            java.lang.String r8 = r8.toString()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12 = r0
            r0 = r11
            com.bca.smartbranch.presenter.UpdateReceiverDataPresenter$IconCompatParcelizer r0 = r0.a
            r0.t()
            r0 = r11
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r12
            retrofit2.Call r0 = r0.c(r1)
            r12 = r0
            r0 = r11
            r1 = r12
            r0.b = r1
            r0 = r12
            com.bca.smartbranch.presenter.UpdateReceiverDataPresenter$3 r1 = new com.bca.smartbranch.presenter.UpdateReceiverDataPresenter$3
            r2 = r1
            r3 = r11
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN7PengambilanUpdateReceiverActivity.s():void");
    }

    @Override // com.bca.smartbranch.presenter.UpdateReceiverDataPresenter.IconCompatParcelizer
    public final void a(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: o.BN7PengambilanActivity
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BN7PengambilanUpdateReceiverActivity.this.s();
            }
        }).g();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etNomorIDPengambil.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNomorIDPengambil)).getVisibility() == 0 && !this.etNomorIDPengambil.getText().toString().isEmpty()) {
                a(this.etFields.indexOf(this.etNomorIDPengambil));
            }
        } else if (editable == this.etNamaPengambil.getEditableText() && this.tvErrors.get(this.etFields.indexOf(this.etNamaPengambil)).getVisibility() == 0 && !this.etNamaPengambil.getText().toString().isEmpty()) {
            a(this.etFields.indexOf(this.etNamaPengambil));
        }
    }

    @Override // com.bca.smartbranch.presenter.UpdateReceiverDataPresenter.IconCompatParcelizer
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

    @Override // com.bca.smartbranch.presenter.UpdateReceiverDataPresenter.IconCompatParcelizer
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Validator validator = new Validator(this);
        this.r = validator;
        validator.setValidationListener(this);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(this.toolbarTitle);
        UpdateReceiverDataPresenter updateReceiverDataPresenter = new UpdateReceiverDataPresenter();
        this.s = updateReceiverDataPresenter;
        updateReceiverDataPresenter.a = this;
        Bundle extras = getIntent().getExtras();
        this.n = extras.getString("token", "");
        this.f = extras.getString("cabang", "");
        StringBuilder sb = new StringBuilder(this.title);
        sb.append(" ");
        sb.append(this.f);
        sb.append(".");
        this.tvTitlePage.setText(sb.toString());
        this.etNomorIDPengambil.addTextChangedListener(this);
        this.etNamaPengambil.addTextChangedListener(this);
    }

    @Override // com.bca.smartbranch.presenter.UpdateReceiverDataPresenter.IconCompatParcelizer
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

    @Override // com.bca.smartbranch.presenter.UpdateReceiverDataPresenter.IconCompatParcelizer
    public final void e(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @OnFocusChange({2131297127, 2131297072})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131297072) {
                this.tilForms.get(2).setHintEnabled(true);
            } else if (id == 2131297127) {
                this.tilForms.get(1).setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131297072) {
                if (id2 == 2131297127 && this.etNomorIDPengambil.getText().toString().isEmpty()) {
                    this.tilForms.get(1).setHintEnabled(false);
                }
            } else if (this.etNamaPengambil.getText().toString().isEmpty()) {
                this.tilForms.get(2).setHintEnabled(false);
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseJenisId(RegistrationActivity_ViewBinding registrationActivity_ViewBinding) {
        this.tilJenisID.setHintEnabled(true);
        this.etJenisID.setText(registrationActivity_ViewBinding.d);
        this.etNomorIDPengambil.clearFocus();
        a(this.etFields.indexOf(this.etJenisID));
        this.tilNomorID.setHintEnabled(false);
        this.etNomorIDPengambil.setText("");
        this.etNomorIDPengambil.setTag(registrationActivity_ViewBinding.d);
        getPromotion.c(this.etNomorIDPengambil, registrationActivity_ViewBinding.d);
        Validator validator = this.r;
        EditText editText = this.etNomorIDPengambil;
        validator.put(editText, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006e: INVOKE  
              (r0v16 'validator' com.mobsandgeeks.saripaar.Validator)
              (r0v18 'editText' android.widget.EditText)
              (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v3 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
              (wrap: o.getPromotion$9 : 0x006a: CONSTRUCTOR  (r0v18 'editText' android.widget.EditText) call: o.getPromotion.9.<init>(android.widget.EditText):void type: CONSTRUCTOR)
             elemType: com.mobsandgeeks.saripaar.QuickRule)
             type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.activity.BN7PengambilanUpdateReceiverActivity.onChooseJenisId(o.RegistrationActivity_ViewBinding):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/BN7PengambilanUpdateReceiverActivity.class
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
            o.LogoutDialog_ViewBinding r0 = r0.tilJenisID
            r1 = 1
            r0.setHintEnabled(r1)
            r0 = r9
            android.widget.EditText r0 = r0.etJenisID
            r1 = r10
            java.lang.String r1 = r1.d
            r0.setText(r1)
            r0 = r9
            android.widget.EditText r0 = r0.etNomorIDPengambil
            r0.clearFocus()
            r0 = r9
            r1 = r9
            java.util.List<android.view.View> r1 = r1.etFields
            r2 = r9
            android.widget.EditText r2 = r2.etJenisID
            int r1 = r1.indexOf(r2)
            r0.a(r1)
            r0 = r9
            o.LogoutDialog_ViewBinding r0 = r0.tilNomorID
            r1 = 0
            r0.setHintEnabled(r1)
            r0 = r9
            android.widget.EditText r0 = r0.etNomorIDPengambil
            java.lang.String r1 = ""
            r0.setText(r1)
            r0 = r9
            android.widget.EditText r0 = r0.etNomorIDPengambil
            r1 = r10
            java.lang.String r1 = r1.d
            r0.setTag(r1)
            r0 = r9
            android.widget.EditText r0 = r0.etNomorIDPengambil
            r1 = r10
            java.lang.String r1 = r1.d
            o.getPromotion.c(r0, r1)
            r0 = r9
            com.mobsandgeeks.saripaar.Validator r0 = r0.r
            r11 = r0
            r0 = r9
            android.widget.EditText r0 = r0.etNomorIDPengambil
            r10 = r0
            r0 = r11
            r1 = r10
            r2 = 1
            com.mobsandgeeks.saripaar.QuickRule[] r2 = new com.mobsandgeeks.saripaar.QuickRule[r2]
            r3 = r2
            r4 = 0
            o.getPromotion$9 r5 = new o.getPromotion$9
            r6 = r5
            r7 = r10
            r6.<init>(r7)
            r3[r4] = r5
            r0.put(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN7PengambilanUpdateReceiverActivity.onChooseJenisId(o.RegistrationActivity_ViewBinding):void");
    }

    @OnClick({2131296993})
    public void onClickJenisId(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etJenisID.getText().toString());
        JenisIdDialog jenisIdDialog = new JenisIdDialog();
        jenisIdDialog.setArguments(bundle);
        jenisIdDialog.show(l(), "JenisIdDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        UpdateReceiverDataPresenter updateReceiverDataPresenter = this.s;
        Call<OpenAccountSuccessActivity> call = updateReceiverDataPresenter.b;
        if (call != null) {
            call.cancel();
        }
        updateReceiverDataPresenter.b = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
                int id = view.getId();
                if (id == 2131296993) {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilForms.get(0).setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id == 2131297072) {
                    this.tvErrors.get(2).setVisibility(0);
                    this.tvErrors.get(2).setText(message);
                    this.tilForms.get(2).setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297127) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilForms.get(1).setBackgroundResource(2131230870);
                    editText = editText2;
                }
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        s();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "BN7PengambilanUpdateReceiverActivity";
        this.j = "BN7PengambilanUpdateReceiverActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492900;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296450})
    public void simpan() {
        getPromotion.d(this);
        this.r.validate();
    }

    @Override // com.bca.smartbranch.presenter.UpdateReceiverDataPresenter.IconCompatParcelizer
    public final void t() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.UpdateReceiverDataPresenter.IconCompatParcelizer
    public final void v() {
        documentProvider.b().d(new updateProfil(this.etJenisID.getText().toString(), this.etNomorIDPengambil.getText().toString(), this.etNamaPengambil.getText().toString()));
        x();
        new UpdateReceiverSuccessDialog().show(l(), UpdateReceiverSuccessDialog.TAG);
    }
}
