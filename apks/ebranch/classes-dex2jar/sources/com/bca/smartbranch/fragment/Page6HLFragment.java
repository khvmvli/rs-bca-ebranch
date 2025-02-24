package com.bca.smartbranch.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.presenter.CheckUserPresenter;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import io.realm.Realm;
import java.util.List;
import o.ConfirmSubBCACardAdapter$ViewHolder;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getAnnualFeeAddOnAmount;
import o.getPromotion;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setPadding;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6HLFragment.class */
public class Page6HLFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, CheckUserPresenter.RemoteActionCompatParcelizer {
    private CheckUserPresenter a;
    private Validator d;
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 3)
    @Order(3)
    @BindView(2131296978)
    @NotEmpty(messageResId = 2131820778, sequence = 2, trim = true)
    getAnnualFeeAddOnAmount etEmailGuest;
    @BindViews({2131297021, 2131297094, 2131296978, 2131297019, 2131297115})
    List<View> etFields;
    @BindView(2131297019)
    EditText etKodeArea;
    @BindView(2131297021)
    @NotEmpty(messageResId = 2131820770, sequence = 1, trim = true)
    @Order(1)
    EditText etKodeNegara;
    @BindView(2131297094)
    @NotEmpty(messageResId = 2131820885, sequence = 1, trim = true)
    @Order(2)
    EditText etNoHp;
    @BindView(2131297115)
    EditText etNoTelepon;
    @BindString(2131820903)
    String invalidHandphoneMessage;
    @BindString(2131820953)
    String invalidTeleponMessage;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298528)
    LogoutDialog_ViewBinding tilEmailGuest;
    @BindViews({2131298567, 2131298640, 2131298528, 2131298565, 2131298661})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298565)
    LogoutDialog_ViewBinding tilKodeArea;
    @BindView(2131298567)
    LogoutDialog_ViewBinding tilKodeNegara;
    @BindView(2131298640)
    LogoutDialog_ViewBinding tilNoHp;
    @BindView(2131298661)
    LogoutDialog_ViewBinding tilNoTelepon;
    @BindViews({2131299043, 2131299115, 2131299007, 2131299041, 2131299134})
    List<TextView> tvErrors;

    private void d(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etNoTelepon.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etKodeArea)).getVisibility() == 0 || this.tvErrors.get(this.etFields.indexOf(this.etNoTelepon)).getVisibility() == 0) {
                if (!this.etNoTelepon.getText().toString().isEmpty()) {
                    d(this.etFields.indexOf(this.etNoTelepon));
                } else {
                    d(this.etFields.indexOf(this.etKodeArea));
                }
            }
            ((FormActivity) getActivity()).n.setHmPhoneNumber(editable.toString());
        } else if (editable == this.etKodeArea.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etKodeArea)).getVisibility() == 0 || this.tvErrors.get(this.etFields.indexOf(this.etNoTelepon)).getVisibility() == 0) {
                if (!this.etKodeArea.getText().toString().isEmpty()) {
                    d(this.etFields.indexOf(this.etKodeArea));
                } else {
                    d(this.etFields.indexOf(this.etNoTelepon));
                }
            }
            ((FormActivity) getActivity()).n.setHmPhoneCodeNumber(editable.toString());
        } else if (editable == this.etKodeNegara.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etKodeNegara)).getVisibility() == 0 && !this.etKodeNegara.getText().toString().isEmpty()) {
                d(this.etFields.indexOf(this.etKodeNegara));
            }
            ((FormActivity) getActivity()).n.setHandPhoneCountryCodeNumber(editable.toString());
        } else if (editable == this.etNoHp.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNoHp)).getVisibility() == 0 && !this.etNoHp.getText().toString().isEmpty()) {
                d(this.etFields.indexOf(this.etNoHp));
            }
            ((FormActivity) getActivity()).n.setHandPhoneNumber(editable.toString());
        } else if (editable == this.etEmailGuest.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etEmailGuest)).getVisibility() == 0 && getPromotion.a(getContext(), this.tvErrors.get(this.etFields.indexOf(this.etEmailGuest)).getText().toString(), this.etEmailGuest)) {
                d(this.etFields.indexOf(this.etEmailGuest));
            }
            ((FormActivity) getActivity()).n.setEmailAddr(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493132;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.Page6HLFragment.3
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((FormActivity) Page6HLFragment.this.getActivity()).n.setHmPhoneCodeNumber("");
                ((FormActivity) Page6HLFragment.this.getActivity()).n.setHmPhoneNumber("");
                ((FormActivity) Page6HLFragment.this.getActivity()).n.setHandPhoneNumber("");
                ((FormActivity) Page6HLFragment.this.getActivity()).n.setHandPhoneCountryCodeNumber("");
                if (((FormActivity) Page6HLFragment.this.getActivity()).n.getFlagGuest().equals("Y")) {
                    ((FormActivity) Page6HLFragment.this.getActivity()).n.setEmailAddr("");
                }
            }
        });
        e(2131296811, new Page6GLFragment(), "Page6GLFragment");
    }

    @OnFocusChange({2131297021, 2131297019, 2131297115, 2131297094, 2131296978})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296978:
                    this.tilEmailGuest.setHintEnabled(true);
                    return;
                case 2131297019:
                    this.tilKodeArea.setHintEnabled(true);
                    return;
                case 2131297021:
                    this.tilKodeNegara.setHintEnabled(true);
                    return;
                case 2131297094:
                    this.tilNoHp.setHintEnabled(true);
                    return;
                case 2131297115:
                    this.tilNoTelepon.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296978:
                    if (this.etEmailGuest.getText().toString().isEmpty()) {
                        this.tilEmailGuest.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297019:
                    if (this.etKodeArea.getText().toString().isEmpty()) {
                        this.tilKodeArea.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297021:
                    if (this.etKodeNegara.getText().toString().isEmpty()) {
                        this.tilKodeNegara.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297094:
                    if (this.etNoHp.getText().toString().isEmpty()) {
                        this.tilNoHp.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297115:
                    if (this.etNoTelepon.getText().toString().isEmpty()) {
                        this.tilNoTelepon.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @OnClick({2131296396})
    public void next(View view) {
        getPromotion.d(getActivity());
        if ("N".equals(((FormActivity) getActivity()).n.getFlagGuest())) {
            this.d.removeRules(this.etEmailGuest);
        }
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.d.validate();
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.c.close();
        documentProvider.b().e(this);
        CheckUserPresenter checkUserPresenter = this.a;
        Call<OpenAccountSuccessActivity<Object>> call = checkUserPresenter.d;
        if (call != null) {
            call.cancel();
        }
        checkUserPresenter.b = null;
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
                int id = view.getId();
                if (id == 2131296978) {
                    this.tvErrors.get(2).setVisibility(0);
                    this.tvErrors.get(2).setText(message);
                    this.tilEmailGuest.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id == 2131297021) {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilKodeNegara.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297094) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilNoHp.setBackgroundResource(2131230870);
                    editText = editText2;
                }
            } else {
                b(this.llMain, message);
            }
        }
        if (!this.etNoTelepon.getText().toString().isEmpty() && this.etKodeArea.getText().toString().isEmpty()) {
            this.tvErrors.get(3).setVisibility(0);
            this.tvErrors.get(3).setText(2131820935);
            this.tilKodeArea.setBackgroundResource(2131230870);
        }
        if (!this.etKodeArea.getText().toString().isEmpty() && this.etNoTelepon.getText().toString().isEmpty()) {
            this.tvErrors.get(4).setVisibility(0);
            this.tvErrors.get(4).setText(2131820897);
            this.tilNoTelepon.setBackgroundResource(2131230870);
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        if (!this.etNoTelepon.getText().toString().isEmpty() && this.etKodeArea.getText().toString().isEmpty()) {
            this.tvErrors.get(3).setVisibility(0);
            this.tvErrors.get(3).setText(2131820935);
            this.tilKodeArea.setBackgroundResource(2131230870);
        } else if (this.etKodeArea.getText().toString().isEmpty() || !this.etNoTelepon.getText().toString().isEmpty()) {
            documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
            c(2131296811, new Page6ILFragment(), "Page6ILFragment");
        } else {
            this.tvErrors.get(4).setVisibility(0);
            this.tvErrors.get(4).setText(2131820897);
            this.tilNoTelepon.setBackgroundResource(2131230870);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        Validator validator = new Validator(this);
        this.d = validator;
        validator.setValidationListener(this);
        CheckUserPresenter checkUserPresenter = new CheckUserPresenter();
        this.a = checkUserPresenter;
        checkUserPresenter.b = this;
        if (this.etNoHp.getVisibility() == 0) {
            ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
            confirmSubBCACardAdapter$ViewHolder.c = 2131820902;
            confirmSubBCACardAdapter$ViewHolder.e = 2131820905;
            confirmSubBCACardAdapter$ViewHolder.d = 2131820903;
            confirmSubBCACardAdapter$ViewHolder.a = 2131820904;
            Validator validator2 = this.d;
            EditText editText = this.etNoHp;
            validator2.put(editText, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b0: INVOKE  
                  (r0v145 'validator2' com.mobsandgeeks.saripaar.Validator)
                  (r0v147 'editText' android.widget.EditText)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v4 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$2 : 0x00ac: CONSTRUCTOR  
                  (r0v147 'editText' android.widget.EditText)
                  (r0v139 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
                 call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.Page6HLFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6HLFragment.class
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
            // Method dump skipped, instructions count: 720
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6HLFragment.onViewCreated(android.view.View, android.os.Bundle):void");
        }
    }
