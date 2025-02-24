package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.InfoBankingtActivity;
import com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.CheckUserPresenter;
import com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter;
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
import o.setMessage;
import o.setPadding;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DTapresFragment.class */
public class Page6DTapresFragment extends BaseFragment implements Validator.ValidationListener, CompoundButton.OnCheckedChangeListener, TextWatcher, RadioGroup.OnCheckedChangeListener, CheckUserPresenter.RemoteActionCompatParcelizer, GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer {
    private CheckUserPresenter a;
    private setMessage d = new setMessage();
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 2)
    @Order(1)
    @BindView(2131296976)
    @NotEmpty(messageResId = 2131820778, sequence = 1, trim = true)
    getAnnualFeeAddOnAmount etEmail;
    @BindViews({2131296976, 2131297094})
    List<View> etFields;
    @BindView(2131297094)
    @NotEmpty(messageResId = 2131820902, sequence = 1, trim = true)
    @Order(2)
    EditText etNoHp;
    private GetAcctOpeningCategoryDataPresenter f;
    private Validator g;
    @BindString(2131820903)
    String invalidHandphoneMessage;
    @BindView(2131297691)
    LinearLayout llInternertBanking;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297774)
    LinearLayout llMobileBanking;
    @BindView(2131298163)
    RadioButton rbLanguageEng;
    @BindView(2131298164)
    RadioButton rbLanguageIna;
    @BindView(2131298223)
    RadioGroup rgLanguage;
    @BindView(2131298443)
    CheckBox tbEmailCheck;
    @BindView(2131298448)
    CheckBox tbNoHpCheck;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindViews({2131298527, 2131298640})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298640)
    LogoutDialog_ViewBinding tilNoHp;
    @BindViews({2131299006, 2131299115})
    List<TextView> tvErrors;
    @BindView(2131296946)
    TextView tvLanguageATM;
    @BindString(2131821646)
    String txtJudul;
    @BindString(2131821339)
    String txtLanguageATM;

    private void d(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    @Override // com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer
    public final void a(GetAcctOpeningCategoryDataResponse getAcctOpeningCategoryDataResponse) {
        h();
        ((FormActivity) getActivity()).d(getAcctOpeningCategoryDataResponse);
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new Page6ELFragment(), "Page6ELFragment");
    }

    @Override // com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etEmail.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etEmail)).getVisibility() == 0 && getPromotion.a(getContext(), this.tvErrors.get(this.etFields.indexOf(this.etEmail)).getText().toString(), this.etEmail)) {
                d(this.etFields.indexOf(this.etEmail));
            }
            ((FormActivity) getActivity()).n.setEmailIB(editable.toString());
        } else if (editable == this.etNoHp.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNoHp)).getVisibility() == 0 && !this.etNoHp.getText().toString().isEmpty()) {
                d(this.etFields.indexOf(this.etNoHp));
            }
            ((FormActivity) getActivity()).n.setHphoneMB(editable.toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer
    public final void b_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493119;
    }

    @OnClick({2131299360})
    public void clikedKlikBCA(View view) {
        CheckBox checkBox = this.tbEmailCheck;
        checkBox.setChecked(!checkBox.isChecked());
    }

    @OnClick({2131299404})
    public void clikedMBCA(View view) {
        CheckBox checkBox = this.tbNoHpCheck;
        checkBox.setChecked(!checkBox.isChecked());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.Page6DTapresFragment.2
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((FormActivity) Page6DTapresFragment.this.getActivity()).n.setLanguage("");
                ((FormActivity) Page6DTapresFragment.this.getActivity()).n.setFlagIB("");
                ((FormActivity) Page6DTapresFragment.this.getActivity()).n.setEmailIB("");
                ((FormActivity) Page6DTapresFragment.this.getActivity()).n.setFlagMB("");
                ((FormActivity) Page6DTapresFragment.this.getActivity()).n.setHphoneMB("");
            }
        });
        e(2131296811, new Page6CFragment(), "Page6CFragment");
    }

    @Override // com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        g();
    }

    @OnFocusChange({2131296976, 2131297094})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131296976) {
                this.tilEmail.setHintEnabled(true);
            } else if (id == 2131297094) {
                this.tilNoHp.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131296976) {
                if (id2 == 2131297094 && this.etNoHp.getText().toString().isEmpty()) {
                    this.tilNoHp.setHintEnabled(false);
                }
            } else if (this.etEmail.getText().toString().isEmpty()) {
                this.tilEmail.setHintEnabled(false);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer
    public final void m_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter.RemoteActionCompatParcelizer
    public final void n_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @OnClick({2131296396})
    public void next(View view) {
        getPromotion.d(getActivity());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.g.validate();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int id = compoundButton.getId();
        if (id != 2131298443) {
            if (id != 2131298448) {
                return;
            }
            if (z) {
                if (((FormActivity) getActivity()).n.getHphoneMB().isEmpty()) {
                    this.etNoHp.setText(((FormActivity) getActivity()).r.getNoHandphone());
                }
                if (!this.etNoHp.getText().toString().isEmpty()) {
                    this.tilNoHp.setHintEnabled(true);
                    this.tilNoHp.setHint(getResources().getString(2131821178));
                }
                ((FormActivity) getActivity()).n.setFlagMB("1");
                this.d.c(this.llMobileBanking);
                ((FormActivity) getActivity()).n.setHphoneMB(this.etNoHp.getText().toString());
                return;
            }
            getPromotion.d(getActivity());
            this.etNoHp.getText().clear();
            this.tilNoHp.setHintEnabled(false);
            ((FormActivity) getActivity()).n.setFlagMB("0");
            setMessage setmessage = this.d;
            LinearLayout linearLayout = this.llMobileBanking;
            setmessage.a = linearLayout.getMeasuredHeight();
            setmessage.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e2: IPUT  
                  (wrap: o.setMessage$1 : 0x00df: CONSTRUCTOR  (r1v8 o.setMessage$1 A[REMOVE]) = (r0v26 'setmessage' o.setMessage), (r0v28 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v26 'setmessage' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6DTapresFragment.onCheckedChanged(android.widget.CompoundButton, boolean):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DTapresFragment.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 317
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6DTapresFragment.onCheckedChanged(android.widget.CompoundButton, boolean):void");
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (i) {
                case 2131298163:
                    Bundle bundle = new Bundle();
                    bundle.putString("MessageDialogTitle", getResources().getString(2131821997));
                    bundle.putString("MessageDialogContent", getResources().getString(2131821909));
                    MessageDialog messageDialog = new MessageDialog();
                    messageDialog.setArguments(bundle);
                    messageDialog.show(getActivity().l(), "MessageDialog");
                    ((FormActivity) getActivity()).n.setLanguage("English");
                    return;
                case 2131298164:
                    ((FormActivity) getActivity()).n.setLanguage("Indonesia");
                    return;
                default:
                    return;
            }
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
            GetAcctOpeningCategoryDataPresenter getAcctOpeningCategoryDataPresenter = this.f;
            Call<OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse>> call2 = getAcctOpeningCategoryDataPresenter.a;
            if (call2 != null) {
                call2.cancel();
            }
            getAcctOpeningCategoryDataPresenter.a = null;
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
                    if (id == 2131296976) {
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilEmail.setBackgroundResource(2131230870);
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
            if (editText != null) {
                editText.requestFocus();
            }
        }

        @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
        public void onValidationSucceeded() {
            documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
            if (((FormActivity) getActivity()).f == null) {
                this.f.b();
            } else {
                c(2131296811, new Page6ELFragment(), "Page6ELFragment");
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle bundle) {
            onViewCreated(view, bundle);
            setHasOptionsMenu(true);
            documentProvider.b().c(this);
            this.c = Realm.getDefaultInstance();
            CheckUserPresenter checkUserPresenter = new CheckUserPresenter();
            this.a = checkUserPresenter;
            checkUserPresenter.b = this;
            GetAcctOpeningCategoryDataPresenter getAcctOpeningCategoryDataPresenter = new GetAcctOpeningCategoryDataPresenter();
            this.f = getAcctOpeningCategoryDataPresenter;
            getAcctOpeningCategoryDataPresenter.c = this;
            ((FormActivity) getActivity()).n.setCurrentPage("Page6DTapresFragment");
            this.tvLanguageATM.setText(Html.fromHtml(this.txtLanguageATM));
            ((setPadding) getActivity()).i();
            ((setPadding) getActivity()).i().d(true);
            ((setPadding) getActivity()).i().d("");
            Validator validator = new Validator(this);
            this.g = validator;
            validator.setValidationListener(this);
            int i = 0;
            if (this.etNoHp.getVisibility() == 0) {
                ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
                confirmSubBCACardAdapter$ViewHolder.c = 2131820902;
                confirmSubBCACardAdapter$ViewHolder.e = 2131820905;
                confirmSubBCACardAdapter$ViewHolder.d = 2131820903;
                confirmSubBCACardAdapter$ViewHolder.a = 2131820904;
                Validator validator2 = this.g;
                EditText editText = this.etNoHp;
                validator2.put(editText, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ea: INVOKE  
                      (r0v141 'validator2' com.mobsandgeeks.saripaar.Validator)
                      (r0v143 'editText' android.widget.EditText)
                      (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v5 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                      (wrap: o.getPromotion$2 : 0x00e6: CONSTRUCTOR  
                      (r0v143 'editText' android.widget.EditText)
                      (r0v135 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
                     call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
                     elemType: com.mobsandgeeks.saripaar.QuickRule)
                     type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.Page6DTapresFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DTapresFragment.class
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
                // Method dump skipped, instructions count: 693
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6DTapresFragment.onViewCreated(android.view.View, android.os.Bundle):void");
            }

            @OnClick({2131297358, 2131297404})
            public void showInfoBanking(View view) {
                Intent intent = new Intent(getContext(), InfoBankingtActivity.class);
                intent.putExtra("banking_type", view.getId() == 2131297358 ? "INFO KLIKBCA" : "INFO M-BCA");
                intent.putExtra("current_account_id", ((FormActivity) getActivity()).n.getId());
                intent.putExtra("current_user_id", ((FormActivity) getActivity()).r.getEmail());
                startActivity(intent);
            }
        }
