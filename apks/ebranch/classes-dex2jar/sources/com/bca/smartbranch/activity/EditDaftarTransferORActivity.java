package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.EditDaftarTransferORActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DaftarTransferORBerhasilDihapusDialog;
import com.bca.smartbranch.dialog.DaftarTransferORBerhasilDiupdateDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.TipeNasabahDialog;
import com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.List;
import o.InfoProductActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.MainActivity;
import o.ReservasiTundaSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/EditDaftarTransferORActivity.class */
public class EditDaftarTransferORActivity extends BaseActivityPostLogin implements Validator.ValidationListener, TextWatcher, UpdateDeleteDaftarTransferPresenter.write {
    @BindView(2131296935)
    @NotEmpty(messageResId = 2131820797, sequence = 1, trim = true)
    @Order(4)
    EditText etAlamatPenerima;
    @BindView(2131296948)
    EditText etBankTujuan;
    @BindViews({2131297107, 2131297099, 2131297066, 2131296935, 2131297038, 2131297210})
    List<View> etForms;
    @BindView(2131297038)
    EditText etKotaPenerima;
    @BindView(2131297066)
    @NotEmpty(messageResId = 2131820861, sequence = 1, trim = true)
    @Order(3)
    EditText etNamaPenerima;
    @BindView(2131297089)
    EditText etNegaraTujuan;
    @BindView(2131297099)
    @NotEmpty(messageResId = 2131820910, sequence = 1, trim = true)
    @Order(2)
    EditText etNoIBAN;
    @BindView(2131297107)
    @NotEmpty(messageResId = 2131820951, sequence = 1, trim = true)
    @Order(1)
    AutoCompleteTextView etNorek;
    @BindView(2131297210)
    @NotEmpty(messageResId = 2131821018, sequence = 1, trim = true)
    @Order(5)
    EditText etTipeNasabahPenerima;
    private Bundle f;
    @BindView(2131297969)
    LinearLayout llMain;
    private DaftarTransferResponse.DaftarTransferOutput n;
    private UpdateDeleteDaftarTransferPresenter p;
    private int q = 0;
    private int r = 0;
    @BindString(2131822092)
    String retry;
    private String s;
    private Validator t;
    @BindView(2131298484)
    LogoutDialog_ViewBinding tilAlamatPenerima;
    @BindViews({2131298653, 2131298645, 2131298613, 2131298484, 2131298585, 2131298742})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298585)
    LogoutDialog_ViewBinding tilKotaPenerima;
    @BindView(2131298613)
    LogoutDialog_ViewBinding tilNamaPenerima;
    @BindView(2131298645)
    LogoutDialog_ViewBinding tilNoIBAN;
    @BindView(2131298653)
    LogoutDialog_ViewBinding tilNorek;
    @BindView(2131298742)
    LogoutDialog_ViewBinding tilTipeNasabahPenerima;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822320)
    String toolbarTitle;
    @BindViews({2131299126, 2131299119, 2131299089, 2131298963, 2131299061, 2131299210})
    List<TextView> tvErrors;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    private void e(View view) {
        this.tvErrors.get(this.etForms.indexOf(view)).setVisibility(8);
        this.tilForms.get(this.etForms.indexOf(view)).setBackgroundResource(2131230847);
    }

    /* renamed from: y */
    public void s() {
        String obj = this.etNorek.getText().toString();
        if (this.n.getIbanFlag().equals("Y")) {
            obj = this.etNoIBAN.getText().toString();
        }
        this.p.e(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Transfer Valuta Asing"), new MainActivity(this.n.getToken(), this.etNamaPenerima.getText().toString(), this.n.getAliasName(), obj, this.etAlamatPenerima.getText().toString(), this.etKotaPenerima.getText().toString(), this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Perusahaan") ? "P" : this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Individu") ? "I" : "", this.n.getIbanFlag(), this.n.getBankCode(), this.n.getBankName(), this.n.getReceiverCountry(), this.n.getReceiverCountryName()));
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etNorek.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etNorek);
        } else if (editable == this.etNoIBAN.getEditableText()) {
            if (this.tvErrors.get(this.etForms.indexOf(this.etNoIBAN)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrors.get(this.etForms.indexOf(this.etNoIBAN)).getText().toString().equals(getString(2131820910))) {
                if (!this.etNoIBAN.getText().toString().isEmpty()) {
                    e(this.etNoIBAN);
                }
            } else if (this.etNoIBAN.getText().toString().length() >= 2) {
                e(this.etNoIBAN);
            }
        } else if (editable == this.etNamaPenerima.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etNamaPenerima);
        } else if (editable == this.etAlamatPenerima.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etAlamatPenerima);
        } else if (editable == this.etKotaPenerima.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etKotaPenerima);
        }
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void b(String str) {
        x();
        setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void b_(String str) {
        x();
        setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.r = this.etNoIBAN.getSelectionStart();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
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
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(this.toolbarTitle);
        Validator validator = new Validator(this);
        this.t = validator;
        validator.setValidationListener(this);
        setResult(-1);
        UpdateDeleteDaftarTransferPresenter updateDeleteDaftarTransferPresenter = new UpdateDeleteDaftarTransferPresenter();
        this.p = updateDeleteDaftarTransferPresenter;
        updateDeleteDaftarTransferPresenter.a = this;
        Bundle extras = getIntent().getExtras();
        this.f = extras;
        DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput = (DaftarTransferResponse.DaftarTransferOutput) ListUtil.OneItemImmutableList.a(extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
        this.n = daftarTransferOutput;
        if (daftarTransferOutput.getIbanFlag().equalsIgnoreCase("Y")) {
            this.tilNorek.setVisibility(8);
            this.tilNoIBAN.setVisibility(0);
            this.etNoIBAN.setTag(this.s);
            Validator validator2 = this.t;
            EditText editText = this.etNoIBAN;
            validator2.put(editText, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c4: INVOKE  
                  (r0v79 'validator2' com.mobsandgeeks.saripaar.Validator)
                  (r0v81 'editText' android.widget.EditText)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v4 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$8 : 0x00c0: CONSTRUCTOR  (r0v81 'editText' android.widget.EditText), ("") call: o.getPromotion.8.<init>(android.widget.EditText, java.lang.String):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.activity.EditDaftarTransferORActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/EditDaftarTransferORActivity.class
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
                	... 21 more
                */
            /*
            // Method dump skipped, instructions count: 460
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.EditDaftarTransferORActivity.d(android.os.Bundle):void");
        }

        @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
        public final void d(String str) {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
        }

        @OnFocusChange({2131297107, 2131297099, 2131297066, 2131296935, 2131297038, 2131297210})
        public void inputChange(View view, boolean z) {
            if (z) {
                switch (view.getId()) {
                    case 2131296935:
                        this.tilAlamatPenerima.setHintEnabled(true);
                        return;
                    case 2131297038:
                        this.tilKotaPenerima.setHintEnabled(true);
                        return;
                    case 2131297066:
                        this.tilNamaPenerima.setHintEnabled(true);
                        return;
                    case 2131297099:
                        this.tilNoIBAN.setHintEnabled(true);
                        return;
                    case 2131297107:
                        this.tilNorek.setHintEnabled(true);
                        return;
                    case 2131297210:
                        this.tilTipeNasabahPenerima.setHintEnabled(true);
                        return;
                    default:
                        return;
                }
            } else {
                switch (view.getId()) {
                    case 2131296935:
                        if (this.etAlamatPenerima.getText().toString().isEmpty()) {
                            this.tilAlamatPenerima.setHintEnabled(false);
                            return;
                        }
                        return;
                    case 2131297038:
                        if (this.etKotaPenerima.getText().toString().isEmpty()) {
                            this.tilKotaPenerima.setHintEnabled(false);
                            return;
                        }
                        return;
                    case 2131297066:
                        if (this.etNamaPenerima.getText().toString().isEmpty()) {
                            this.tilNamaPenerima.setHintEnabled(false);
                            return;
                        }
                        return;
                    case 2131297099:
                        if (this.etNoIBAN.getText().toString().isEmpty()) {
                            this.tilNoIBAN.setHintEnabled(false);
                            return;
                        }
                        return;
                    case 2131297107:
                        if (this.etNorek.getText().toString().isEmpty()) {
                            this.tilNorek.setHintEnabled(false);
                            return;
                        }
                        return;
                    case 2131297210:
                        if (this.etTipeNasabahPenerima.getText().toString().isEmpty()) {
                            this.tilTipeNasabahPenerima.setHintEnabled(false);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
        public final void l_(String str) {
            x();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: o.CC5UbahMastercardActivity_ViewBinding
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditDaftarTransferORActivity.this.s();
                }
            }).g();
        }

        @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
        public void onBackPressed() {
            setResult(0);
            onBackPressed();
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseTipeNasabahPenerima(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity) {
            e(this.etTipeNasabahPenerima);
            this.etTipeNasabahPenerima.setError(null);
            this.tilTipeNasabahPenerima.setHintEnabled(true);
            this.etTipeNasabahPenerima.setText(reservasiTundaSuccessActivity.a);
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
        public void onDestroy() {
            onDestroy();
            this.p.c();
        }

        @Override // android.app.Activity
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return onOptionsItemSelected(menuItem);
            }
            setResult(0);
            k();
            return true;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.q = this.etNoIBAN.getSelectionStart();
        }

        @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
        public void onValidationFailed(List<ValidationError> list) {
            EditText editText = null;
            for (ValidationError validationError : list) {
                View view = validationError.getView();
                String message = validationError.getFailedRules().get(0).getMessage(this);
                if (view instanceof EditText) {
                    editText = editText;
                    if (editText == null) {
                        editText = (EditText) view;
                    }
                    this.tvErrors.get(this.etForms.indexOf(view)).setVisibility(0);
                    this.tvErrors.get(this.etForms.indexOf(view)).setText(message);
                    this.tilForms.get(this.etForms.indexOf(view)).setBackgroundResource(2131230870);
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
            s();
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final void p() {
            setCardSlogan.e().b = "EditDaftarTransferORActivity";
            this.j = "EditDaftarTransferORActivity";
        }

        @OnClick({2131297210})
        public void pilihTipeNasabahPenerima(View view) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etTipeNasabahPenerima.getText().toString());
            TipeNasabahDialog tipeNasabahDialog = new TipeNasabahDialog();
            tipeNasabahDialog.setArguments(bundle);
            tipeNasabahDialog.show(l(), "TipeNasabahDialog");
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            return 2131492948;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            return this;
        }

        @OnClick({2131296450})
        public void simpan() {
            getPromotion.d(this);
            for (TextView textView : this.tvErrors) {
                textView.setVisibility(8);
            }
            for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
                if (logoutDialog_ViewBinding.f.isEnabled()) {
                    logoutDialog_ViewBinding.setBackgroundResource(2131230847);
                }
            }
            this.t.validate();
        }

        @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
        public final void t() {
            x();
            new DaftarTransferORBerhasilDihapusDialog().show(l(), "DaftarTransferORBerhasilDihapusDialog");
        }

        @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
        public final void u() {
            z();
        }

        @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
        public final void v() {
            x();
            Intent intent = new Intent();
            intent.putExtra("bank_code", this.n.getBankCode());
            intent.putExtra("bank_name", this.n.getBankName());
            intent.putExtra("receiver_country", this.n.getReceiverCountry());
            intent.putExtra("receiver_country_name", this.n.getReceiverCountryName());
            intent.putExtra("account_number", this.etNorek.getText().toString());
            if (this.n.getIbanFlag().equalsIgnoreCase("Y")) {
                intent.putExtra("account_number", this.etNoIBAN.getText().toString());
            }
            intent.putExtra("account_name", this.etNamaPenerima.getText().toString());
            intent.putExtra("receiver_address", this.etAlamatPenerima.getText().toString());
            intent.putExtra("receiver_city", this.etKotaPenerima.getText().toString());
            intent.putExtra("customer_type", this.etTipeNasabahPenerima.getText().toString());
            setResult(-1, intent);
            new DaftarTransferORBerhasilDiupdateDialog().show(l(), "DaftarTransferORBerhasilDiupdateDialog");
        }
    }
