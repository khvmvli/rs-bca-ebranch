package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.NoAtmEChannelActivity;
import com.bca.smartbranch.data.api.response.ActivateEChannelResponse;
import com.bca.smartbranch.data.localdb.EChannel;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.InfoEchannelDialog;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.LimitActivationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.UserBlockedAfterLoginDialog;
import com.bca.smartbranch.presenter.ActivateEChannelPresenter;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.ReRegistrationPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import io.realm.Realm;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.InfoProductORActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LandingActivity;
import o.ListUtil;
import o.LoginSessionActivity_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.documentProvider;
import o.getPromotion;
import o.onChooseBankTujuan;
import o.onUbahFormReservasiEvent;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setCurrentItem;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/NoAtmEChannelActivity.class */
public class NoAtmEChannelActivity extends BaseActivityPostLogin implements TextWatcher, ActivateEChannelPresenter.IconCompatParcelizer, Validator.ValidationListener, GetHBPresenter.write, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer, ReRegistrationPresenter.write {
    @BindView(2131296396)
    Button btnLanjut;
    @BindString(2131820933)
    String errorMessageEmptyATM;
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 2)
    @Order(2)
    @BindView(2131296976)
    @NotEmpty(messageResId = 2131820778, sequence = 1, trim = true)
    EditText etEmail;
    @BindViews({2131297092, 2131296976})
    List<View> etFields;
    @BindView(2131297092)
    @NotEmpty(messageResId = 2131820933, sequence = 1, trim = true)
    @Order(1)
    public setCurrentItem etNoATM;
    public EChannel f;
    @BindString(2131821161)
    String hintAtm;
    @BindView(2131297632)
    LinearLayout llEmail;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindString(2131821882)
    String masukanATMEChannel;
    @BindString(2131821883)
    String masukanATMEmailEChannel;
    private ActivateEChannelResponse.TxnDataOutput n;
    private boolean p;
    private SendEmailTransactionSuccessPresenter q;
    private ActivateEChannelPresenter r;
    private GetHBPresenter s;
    private ReRegistrationPresenter t;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindViews({2131298638, 2131298527})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298638)
    LogoutDialog_ViewBinding tilNoAtm;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindViews({2131299114, 2131299006})
    List<TextView> tvErrors;
    @BindView(2131299440)
    TextView tvNama;
    @BindView(2131299615)
    TextView tvTitle;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    private Validator x;
    private long y;

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        x();
        Intent intent = new Intent(this, FormSuccessActivity.class);
        intent.putExtra("Transaction_name", "Internet/Mobile Banking");
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.n));
        intent.putExtra("email", this.etEmail.getText().toString());
        intent.putExtra("id_reservation", this.y);
        startActivity(intent);
        finish();
    }

    @Override // com.bca.smartbranch.presenter.ActivateEChannelPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        if (this.n != null) {
            Intent intent = new Intent(this, FormSuccessActivity.class);
            intent.putExtra("Transaction_name", "Internet/Mobile Banking");
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.n));
            intent.putExtra("email", this.etEmail.getText().toString());
            intent.putExtra("id_reservation", this.y);
            startActivity(intent);
            finish();
            return;
        }
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).g();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etNoATM.getEditableText()) {
            getPromotion.a(this, this.tvErrors, this.tilForms, this.etFields, this.etNoATM);
        } else if (editable == this.etEmail.getEditableText()) {
            getPromotion.c(this, this.tvErrors, this.tilForms, this.etFields, this.etEmail);
        }
    }

    @Override // com.bca.smartbranch.presenter.ActivateEChannelPresenter.IconCompatParcelizer
    public final void b(ActivateEChannelResponse activateEChannelResponse) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.NoAtmEChannelActivity.2
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                EChannel eChannel = (EChannel) realm.where(EChannel.class).equalTo("id", NoAtmEChannelActivity.this.f.getId()).findFirst();
                if (eChannel != null) {
                    eChannel.deleteFromRealm();
                }
            }
        });
        this.n = activateEChannelResponse.getTxnDataOutput();
        this.q.d(new LoginSessionActivity_ViewBinding(this.m != null ? this.m.getEmail() : this.etEmail.getText().toString(), activateEChannelResponse.getTxnDataOutput().getNoReff()));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final /* synthetic */ void c(Realm realm) {
        EChannel eChannel = (EChannel) realm.where(EChannel.class).equalTo("id", this.f.getId()).findFirst();
        if (eChannel == null) {
            EChannel eChannel2 = (EChannel) realm.createObject(EChannel.class, this.f.getId());
            eChannel2.setCreatedAt(this.f.getCreatedAt());
            eChannel2.setNoRekening(this.etNoATM.e.e);
            this.m.geteChannels().add(eChannel2);
            return;
        }
        eChannel.setCreatedAt(this.f.getCreatedAt());
        eChannel.setNoRekening(this.etNoATM.e.e);
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        LimitActivationDialog limitActivationDialog = new LimitActivationDialog();
        limitActivationDialog.setArguments(bundle);
        limitActivationDialog.show(l(), LimitActivationDialog.TAG);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        x();
        Intent intent = new Intent(this, FormSuccessActivity.class);
        intent.putExtra("Transaction_name", "Internet/Mobile Banking");
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.n));
        intent.putExtra("email", this.etEmail.getText().toString());
        intent.putExtra("id_reservation", this.y);
        startActivity(intent);
        finish();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        ActivateEChannelPresenter activateEChannelPresenter = new ActivateEChannelPresenter();
        this.r = activateEChannelPresenter;
        activateEChannelPresenter.b = this;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.q = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        ReRegistrationPresenter reRegistrationPresenter = new ReRegistrationPresenter();
        this.t = reRegistrationPresenter;
        reRegistrationPresenter.e = this;
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.s = getHBPresenter;
        getHBPresenter.e = this;
        Validator validator = new Validator(this);
        this.x = validator;
        validator.setValidationListener(this);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbarTitle.setText("Internet/Mobile Banking");
        boolean z = false;
        if (this.m != null) {
            TextView textView = this.tvNama;
            StringBuilder sb = new StringBuilder("Hai ");
            sb.append(this.m.getName());
            sb.append(",");
            textView.setText(sb.toString());
            this.tvTitle.setText(this.masukanATMEChannel);
        } else {
            this.tvTitle.setText(this.masukanATMEmailEChannel);
            this.llEmail.setVisibility(0);
        }
        InfoEchannelDialog infoEchannelDialog = new InfoEchannelDialog();
        infoEchannelDialog.show(l(), infoEchannelDialog.getTag());
        Bundle extras = getIntent().getExtras();
        this.etNoATM.setHint(this.hintAtm);
        Validator validator2 = this.x;
        setCurrentItem setcurrentitem = this.etNoATM;
        validator2.put(setcurrentitem, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0125: INVOKE  
              (r0v37 'validator2' com.mobsandgeeks.saripaar.Validator)
              (r0v39 'setcurrentitem' o.setCurrentItem)
              (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v4 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
              (wrap: o.getPromotion$5 : 0x0121: CONSTRUCTOR  (r0v39 'setcurrentitem' o.setCurrentItem) call: o.getPromotion.5.<init>(o.setCurrentItem):void type: CONSTRUCTOR)
             elemType: com.mobsandgeeks.saripaar.QuickRule)
             type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.activity.NoAtmEChannelActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/NoAtmEChannelActivity.class
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
        // Method dump skipped, instructions count: 659
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.NoAtmEChannelActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        x();
        Intent intent = new Intent(this, FormSuccessActivity.class);
        intent.putExtra("Transaction_name", "Internet/Mobile Banking");
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.n));
        intent.putExtra("email", this.etEmail.getText().toString());
        intent.putExtra("id_reservation", this.y);
        intent.putExtra("email_success", str);
        startActivity(intent);
        finish();
    }

    @Override // com.bca.smartbranch.presenter.ActivateEChannelPresenter.IconCompatParcelizer
    public final void f(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.ActivateEChannelPresenter.IconCompatParcelizer
    public final void g(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        bundle.putString("MessageDialogTitle", getResources().getString(2131822128));
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ActivateEChannelPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.ActivateEChannelPresenter.IconCompatParcelizer
    public final void h(String str) {
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

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void h_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ActivateEChannelPresenter.IconCompatParcelizer
    public final void i(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @OnFocusChange({2131296976, 2131297092})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131296976) {
                this.tilEmail.setHintEnabled(true);
            } else if (id == 2131297092) {
                this.tilNoAtm.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131296976) {
                if (id2 == 2131297092 && this.etNoATM.e.e.isEmpty()) {
                    this.tilNoAtm.setHintEnabled(false);
                }
            } else if (this.etEmail.getText().toString().isEmpty()) {
                this.tilEmail.setHintEnabled(false);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void j(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @OnClick({2131296396})
    public void lanjut() {
        getPromotion.d(this);
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.x.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onAktivasiUlangEvent(onChooseBankTujuan onchoosebanktujuan) {
        this.t.e(new LandingActivity(this.m != null ? this.m.getEmail() : this.etEmail.getText().toString()));
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        if (!this.p) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: o.chooseSyaratKetentuan
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    NoAtmEChannelActivity.this.t();
                }
            });
        }
        onBackPressed();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueKeluarFormReservation(onUbahFormReservasiEvent onubahformreservasievent) {
        if (onubahformreservasievent.b.equals("Y")) {
            finish();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.NoAtmEChannelActivity.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    EChannel eChannel = (EChannel) realm.where(EChannel.class).equalTo("id", NoAtmEChannelActivity.this.f.getId()).findFirst();
                    if (eChannel != null) {
                        eChannel.deleteFromRealm();
                    }
                }
            });
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return;
        }
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.chooseProfile
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                NoAtmEChannelActivity.this.c(realm);
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.p) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        ActivateEChannelPresenter activateEChannelPresenter = this.r;
        Call<OpenAccountSuccessActivity<ActivateEChannelResponse>> call = activateEChannelPresenter.e;
        if (call != null) {
            call.cancel();
        }
        activateEChannelPresenter.e = null;
        GetHBPresenter getHBPresenter = this.s;
        Call<OpenAccountSuccessActivity<Object>> call2 = getHBPresenter.b;
        if (call2 != null) {
            call2.cancel();
        }
        getHBPresenter.e = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.q;
        Call<OpenAccountSuccessActivity<Object>> call3 = sendEmailTransactionSuccessPresenter.a;
        if (call3 != null) {
            call3.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
        ReRegistrationPresenter reRegistrationPresenter = this.t;
        Call<OpenAccountSuccessActivity<Object>> call4 = reRegistrationPresenter.b;
        if (call4 != null) {
            call4.cancel();
        }
        reRegistrationPresenter.e = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            if (this.p) {
                new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
                return true;
            }
            SimpanDraftDialog simpanDraftDialog = new SimpanDraftDialog();
            simpanDraftDialog.b = "transaction_cs";
            simpanDraftDialog.show(l(), "SimpanDraftDialog");
            return true;
        }
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
                if (id == 2131296976) {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilEmail.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297092) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilNoAtm.setBackgroundResource(2131230870);
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
        if (this.m != null) {
            GetHBPresenter getHBPresenter = this.s;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                  (r0v67 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x003c: CONSTRUCTOR  (r1v19 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v63 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.NoAtmEChannelActivity.onValidationSucceeded():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/NoAtmEChannelActivity.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetHBPresenter, state: GENERATED_AND_UNLOADED
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
                	... 21 more
                */
            /*
            // Method dump skipped, instructions count: 349
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.NoAtmEChannelActivity.onValidationSucceeded():void");
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final void p() {
            setCardSlogan.e().b = "NoAtmEChannelActivity";
            this.j = "NoAtmEChannelActivity";
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            return 2131492967;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            return this;
        }

        public final /* synthetic */ void t() {
            EChannel eChannel = (EChannel) this.k.where(EChannel.class).equalTo("id", this.f.getId()).findFirst();
            if (eChannel != null && eChannel.isValid()) {
                eChannel.deleteFromRealm();
                documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
            }
        }

        @Override // com.bca.smartbranch.presenter.ActivateEChannelPresenter.IconCompatParcelizer
        public final void u() {
            x();
            new UserBlockedAfterLoginDialog().show(l(), "UserBlockedAfterLoginDialog");
        }

        @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
        public final void y() {
            x();
            Intent intent = new Intent(this, ReRegistrationSuccessActivity.class);
            intent.putExtra("email", this.m != null ? this.m.getEmail() : this.etEmail.getText().toString());
            startActivity(intent);
            finishAffinity();
        }
    }
