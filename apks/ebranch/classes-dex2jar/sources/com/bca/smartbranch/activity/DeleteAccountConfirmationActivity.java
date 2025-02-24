package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.DeleteAccountConfirmationActivity;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DeleteAccountFailedDialog;
import com.bca.smartbranch.dialog.DeleteAccountSuccessDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.DeleteUserPresenter;
import java.util.regex.Pattern;
import o.InfoDocumentUnderlyingActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DeleteAccountConfirmationActivity.class */
public class DeleteAccountConfirmationActivity extends BaseActivityPostLogin implements View.OnFocusChangeListener, TextWatcher, DeleteUserPresenter.read {
    @BindView(2131297032)
    EditText etKonfirmasi;
    private DeleteUserPresenter f;
    @BindView(2131297969)
    LinearLayout lnMain;
    private String n;
    @BindString(2131822092)
    String retry;
    @BindString(2131822438)
    String stringContent;
    @BindString(2131822038)
    String stringTitle;
    private int t = 0;
    @BindView(2131298579)
    LogoutDialog_ViewBinding tilKonfirmasi;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView toolbarTitle;
    @BindView(2131298883)
    TextView tvContent;
    @BindView(2131299055)
    TextView tvErrorKonfirmasi;

    /* renamed from: v */
    public void t() {
        DeleteUserPresenter deleteUserPresenter = this.f;
        InfoDocumentUnderlyingActivity_ViewBinding infoDocumentUnderlyingActivity_ViewBinding = new InfoDocumentUnderlyingActivity_ViewBinding(this.m.getEmail(), this.m.getImei(), this.m.getSessionId(), this.n);
        deleteUserPresenter.a.u();
        Call<OpenAccountSuccessActivity<Object>> a = deleteUserPresenter.apiService.a(infoDocumentUnderlyingActivity_ViewBinding);
        deleteUserPresenter.c = a;
        a.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0048: INVOKE  
              (r0v7 'a' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
              (wrap: com.bca.smartbranch.presenter.DeleteUserPresenter$3 : 0x0045: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.DeleteUserPresenter$3 A[REMOVE]) = (r0v1 'deleteUserPresenter' com.bca.smartbranch.presenter.DeleteUserPresenter) call: com.bca.smartbranch.presenter.DeleteUserPresenter.3.<init>(com.bca.smartbranch.presenter.DeleteUserPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.DeleteAccountConfirmationActivity.v():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DeleteAccountConfirmationActivity.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.DeleteUserPresenter, state: GENERATED_AND_UNLOADED
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
            r0 = r7
            com.bca.smartbranch.presenter.DeleteUserPresenter r0 = r0.f
            r8 = r0
            o.InfoDocumentUnderlyingActivity_ViewBinding r0 = new o.InfoDocumentUnderlyingActivity_ViewBinding
            r1 = r0
            r2 = r7
            com.bca.smartbranch.data.localdb.User r2 = r2.m
            java.lang.String r2 = r2.getEmail()
            r3 = r7
            com.bca.smartbranch.data.localdb.User r3 = r3.m
            java.lang.String r3 = r3.getImei()
            r4 = r7
            com.bca.smartbranch.data.localdb.User r4 = r4.m
            java.lang.String r4 = r4.getSessionId()
            r5 = r7
            java.lang.String r5 = r5.n
            r1.<init>(r2, r3, r4, r5)
            r9 = r0
            r0 = r8
            com.bca.smartbranch.presenter.DeleteUserPresenter$read r0 = r0.a
            r0.u()
            r0 = r8
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r9
            retrofit2.Call r0 = r0.a(r1)
            r9 = r0
            r0 = r8
            r1 = r9
            r0.c = r1
            r0 = r9
            com.bca.smartbranch.presenter.DeleteUserPresenter$3 r1 = new com.bca.smartbranch.presenter.DeleteUserPresenter$3
            r2 = r1
            r3 = r8
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DeleteAccountConfirmationActivity.t():void");
    }

    @Override // com.bca.smartbranch.presenter.DeleteUserPresenter.read
    public final void a(String str) {
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

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.tvErrorKonfirmasi.getVisibility() == 0) {
            if (this.tvErrorKonfirmasi.getText().toString().equals(getString(2131820835))) {
                if (!this.etKonfirmasi.getText().toString().isEmpty()) {
                    this.tvErrorKonfirmasi.setVisibility(8);
                    this.tilKonfirmasi.setBackgroundResource(2131230847);
                }
            } else if (this.tvErrorKonfirmasi.getText().toString().equals(getString(2131820836)) && this.etKonfirmasi.getText().toString().equalsIgnoreCase("setuju")) {
                this.tvErrorKonfirmasi.setVisibility(8);
                this.tilKonfirmasi.setBackgroundResource(2131230847);
            }
        }
        String upperCase = this.etKonfirmasi.getText().toString().replace(Pattern.compile("[^A-Za-z]+").pattern(), "").toUpperCase();
        String str = upperCase;
        if (upperCase.length() > 6) {
            str = upperCase.substring(0, 6);
        }
        int length = this.etKonfirmasi.length();
        this.etKonfirmasi.removeTextChangedListener(this);
        this.etKonfirmasi.setText(str);
        this.etKonfirmasi.addTextChangedListener(this);
        int length2 = (this.t + this.etKonfirmasi.length()) - length;
        if (length2 > 0) {
            this.etKonfirmasi.setSelection(length2);
        } else {
            this.etKonfirmasi.setSelection(0);
        }
    }

    @Override // com.bca.smartbranch.presenter.DeleteUserPresenter.read
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

    @Override // com.bca.smartbranch.presenter.DeleteUserPresenter.read
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
        this.toolbarTitle.setText(this.stringTitle);
        this.n = getIntent().getExtras().getString("REASON", "");
        DeleteUserPresenter deleteUserPresenter = new DeleteUserPresenter();
        this.f = deleteUserPresenter;
        deleteUserPresenter.a = this;
        this.tvContent.setText(Html.fromHtml(this.stringContent));
        this.etKonfirmasi.setOnFocusChangeListener(this);
        this.etKonfirmasi.addTextChangedListener(this);
    }

    @Override // com.bca.smartbranch.presenter.DeleteUserPresenter.read
    public final void d(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: o.subscribeChooseUbahBCACardEvent
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccountConfirmationActivity.this.t();
            }
        }).g();
    }

    @Override // com.bca.smartbranch.presenter.DeleteUserPresenter.read
    public final void e(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DeleteUserPresenter deleteUserPresenter = this.f;
        Call<OpenAccountSuccessActivity<Object>> call = deleteUserPresenter.c;
        if (call != null) {
            call.cancel();
        }
        deleteUserPresenter.a = null;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297032) {
                this.tilKonfirmasi.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297032 && this.etKonfirmasi.getText().toString().isEmpty()) {
            this.tilKonfirmasi.setHintEnabled(false);
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

    @OnClick({2131296452})
    public void onSubmit(View view) {
        boolean z = false;
        if (this.etKonfirmasi.getText().toString().isEmpty()) {
            this.tvErrorKonfirmasi.setText(getString(2131820835));
            this.tvErrorKonfirmasi.setVisibility(0);
            this.tilKonfirmasi.setBackgroundResource(2131230870);
        } else if (!this.etKonfirmasi.getText().toString().equalsIgnoreCase("setuju")) {
            this.tvErrorKonfirmasi.setText(getString(2131820836));
            this.tvErrorKonfirmasi.setVisibility(0);
            this.tilKonfirmasi.setBackgroundResource(2131230870);
        } else {
            z = true;
        }
        if (z) {
            t();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.t = this.etKonfirmasi.getSelectionStart();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "DeleteAccountConfirmationActivity";
        this.j = "DeleteAccountConfirmationActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492921;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.DeleteUserPresenter.read
    public final void s() {
        x();
        new DeleteAccountFailedDialog().show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.DeleteUserPresenter.read
    public final void u() {
        z();
    }

    @Override // com.bca.smartbranch.presenter.DeleteUserPresenter.read
    public final void y() {
        x();
        new DeleteAccountSuccessDialog().show(l(), "MessageDialog");
    }
}
