package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
import com.bca.smartbranch.activity.FormBankNotesActivity;
import com.bca.smartbranch.activity.ReRegistrationSuccessActivity;
import com.bca.smartbranch.data.api.response.CustDataResponse;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.LimitActivationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.UserBlockedAfterLoginDialog;
import com.bca.smartbranch.presenter.GetCustDataPresenter;
import com.bca.smartbranch.presenter.ReRegistrationPresenter;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.ArrayList;
import java.util.List;
import o.ConfirmSubMastercardAdapter$ViewHolder;
import o.ConfirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LandingActivity;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.fillForm;
import o.getPromotion;
import o.onChooseBankTujuan;
import o.setCurrentItem;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN1NoATMFragment.class */
public class BN1NoATMFragment extends BaseFragment implements TextWatcher, GetCustDataPresenter.write, Validator.ValidationListener, ReRegistrationPresenter.write {
    private ConfirmSubMastercardAdapter$ViewHolder a;
    @BindView(2131296396)
    Button btnLanjut;
    private GetCustDataPresenter d;
    @BindViews({2131297092})
    List<View> etFields;
    @BindView(2131297092)
    @NotEmpty(messageResId = 2131820933, sequence = 1, trim = true)
    @Order(1)
    setCurrentItem etNoATM;
    private Validator g;
    @BindString(2131821161)
    String hintAtm;
    private ReRegistrationPresenter i;
    private User j;
    @BindView(2131297766)
    LinearLayout svMain;
    @BindViews({2131298638})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindViews({2131299114})
    List<TextView> tvErrors;
    @BindView(2131299440)
    TextView tvNama;

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, 0).g();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etNoATM.getEditableText()) {
            getPromotion.a(getContext(), this.tvErrors, this.tilForms, this.etFields, this.etNoATM);
        }
    }

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.j.getImei());
        bundle.putString("email", this.j.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.j.getImei());
        bundle.putString("email", this.j.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493158;
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        LimitActivationDialog limitActivationDialog = new LimitActivationDialog();
        limitActivationDialog.setArguments(bundle);
        limitActivationDialog.show(getParentFragmentManager(), LimitActivationDialog.TAG);
    }

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
    public final void d(CustDataResponse custDataResponse) {
        ArrayList arrayList = new ArrayList();
        for (CustDataResponse.Phone phone : custDataResponse.getPhoneList()) {
            ConfirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver confirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver = new ConfirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver();
            confirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver.e = phone.getPhoneID();
            confirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver.b = phone.getPhoneNumber();
            arrayList.add(confirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver);
        }
        ArrayList arrayList2 = new ArrayList();
        for (CustDataResponse.Account account : custDataResponse.getAccountList()) {
            ConfirmSubMastercardAdapter$ViewHolder.read read = new ConfirmSubMastercardAdapter$ViewHolder.read();
            read.b = account.getAccountID();
            read.e = account.getAccountNumber();
            arrayList2.add(read);
        }
        this.a.g = this.etNoATM.e.e;
        this.a.e = arrayList;
        this.a.d = arrayList2;
        h();
        d(2131296811, this, new BN1TujuanPembelian(), "BN1TujuanPembelian");
    }

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
    public final void g_() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void h_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
    public final void i(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @OnFocusChange({2131297092})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297092) {
                this.tilForms.get(0).setHintEnabled(true);
            }
        } else if (view.getId() == 2131297092 && this.etNoATM.e.e.isEmpty()) {
            this.tilForms.get(0).setHintEnabled(false);
        }
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void j(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @OnClick({2131296396})
    public void lanjut() {
        getPromotion.d(getContext());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.g.validate();
    }

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
    public final void n(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, -1).g();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onAktivasiUlangEvent(onChooseBankTujuan onchoosebanktujuan) {
        ReRegistrationPresenter reRegistrationPresenter = this.i;
        User user = this.j;
        reRegistrationPresenter.e(new LandingActivity(user != null ? user.getEmail() : ""));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        documentProvider.b().e(this);
        GetCustDataPresenter getCustDataPresenter = this.d;
        Call<OpenAccountSuccessActivity<CustDataResponse>> call = getCustDataPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getCustDataPresenter.d = null;
        ReRegistrationPresenter reRegistrationPresenter = this.i;
        Call<OpenAccountSuccessActivity<Object>> call2 = reRegistrationPresenter.b;
        if (call2 != null) {
            call2.cancel();
        }
        reRegistrationPresenter.e = null;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationFailed(List<ValidationError> list) {
        EditText editText = null;
        for (ValidationError validationError : list) {
            View view = validationError.getView();
            String message = validationError.getFailedRules().get(0).getMessage(getContext());
            if (view instanceof EditText) {
                EditText editText2 = editText;
                if (editText == null) {
                    editText2 = (EditText) view;
                }
                if (view.getId() != 2131297092) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilForms.get(0).setBackgroundResource(2131230870);
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
        fillForm fillform = new fillForm();
        fillform.e = this.etNoATM.e.e;
        fillform.c = this.j.getEmail();
        fillform.a = this.j.getImei();
        fillform.b = this.j.getSessionId();
        this.d.e(fillform);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        Validator validator = new Validator(this);
        this.g = validator;
        validator.setValidationListener(this);
        GetCustDataPresenter getCustDataPresenter = new GetCustDataPresenter();
        this.d = getCustDataPresenter;
        getCustDataPresenter.d = this;
        ReRegistrationPresenter reRegistrationPresenter = new ReRegistrationPresenter();
        this.i = reRegistrationPresenter;
        reRegistrationPresenter.e = this;
        this.j = ((FormBankNotesActivity) getActivity()).w();
        this.a = ((FormBankNotesActivity) getActivity()).n;
        TextView textView = this.tvNama;
        StringBuilder sb = new StringBuilder("Hai ");
        sb.append(this.j.getName());
        sb.append(",");
        textView.setText(sb.toString());
        this.etNoATM.setHint(this.hintAtm);
        Validator validator2 = this.g;
        setCurrentItem setcurrentitem = this.etNoATM;
        validator2.put(setcurrentitem, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b2: INVOKE  
              (r0v24 'validator2' com.mobsandgeeks.saripaar.Validator)
              (r0v26 'setcurrentitem' o.setCurrentItem)
              (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v4 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
              (wrap: o.getPromotion$5 : 0x00ae: CONSTRUCTOR  (r0v26 'setcurrentitem' o.setCurrentItem) call: o.getPromotion.5.<init>(o.setCurrentItem):void type: CONSTRUCTOR)
             elemType: com.mobsandgeeks.saripaar.QuickRule)
             type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.BN1NoATMFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN1NoATMFragment.class
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
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.BN1NoATMFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
    public final void u() {
        h();
        new UserBlockedAfterLoginDialog().show(getFragmentManager(), "UserBlockedAfterLoginDialog");
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void y() {
        h();
        Intent intent = new Intent(getContext(), ReRegistrationSuccessActivity.class);
        User user = this.j;
        intent.putExtra("email", user != null ? user.getEmail() : "");
        startActivity(intent);
        getActivity().finishAffinity();
    }
}
