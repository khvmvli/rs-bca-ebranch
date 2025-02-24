package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
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
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.CheckUserPresenter;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import io.realm.Realm;
import java.util.List;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getAnnualFeeAddOnAmount;
import o.getPromotion;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setMessage;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DBCADollarSFragment.class */
public class Page6DBCADollarSFragment extends BaseFragment implements Validator.ValidationListener, CompoundButton.OnCheckedChangeListener, TextWatcher, RadioGroup.OnCheckedChangeListener, CheckUserPresenter.RemoteActionCompatParcelizer {
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
    @BindString(2131820903)
    String invalidHandphoneMessage;
    private Validator j;
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
    @BindView(2131298165)
    RadioButton rbMataUangSgd;
    @BindView(2131298166)
    RadioButton rbMataUangUsd;
    @BindView(2131298223)
    RadioGroup rgLanguage;
    @BindView(2131298225)
    RadioGroup rgMataUang;
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
    @BindView(2131297047)
    TextView tvMataUang;
    @BindString(2131821646)
    String txtJudul;
    @BindString(2131821339)
    String txtLanguageATM;
    @BindString(2131822062)
    String txtMataUang;

    private void c(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etEmail.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etEmail)).getVisibility() == 0 && getPromotion.a(getContext(), this.tvErrors.get(this.etFields.indexOf(this.etEmail)).getText().toString(), this.etEmail)) {
                c(this.etFields.indexOf(this.etEmail));
            }
            ((FormActivity) getActivity()).n.setEmailIB(editable.toString());
        } else if (editable == this.etNoHp.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNoHp)).getVisibility() == 0 && !this.etNoHp.getText().toString().isEmpty()) {
                c(this.etFields.indexOf(this.etNoHp));
            }
            ((FormActivity) getActivity()).n.setHphoneMB(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493116;
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
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.Page6DBCADollarSFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((FormActivity) Page6DBCADollarSFragment.this.getActivity()).n.setLanguage("");
                ((FormActivity) Page6DBCADollarSFragment.this.getActivity()).n.setFlagIB("");
                ((FormActivity) Page6DBCADollarSFragment.this.getActivity()).n.setEmailIB("");
                ((FormActivity) Page6DBCADollarSFragment.this.getActivity()).n.setFlagMB("");
                ((FormActivity) Page6DBCADollarSFragment.this.getActivity()).n.setHphoneMB("");
                ((FormActivity) Page6DBCADollarSFragment.this.getActivity()).n.setDollarCurrCode("");
            }
        });
        e(2131296811, new Page6CSFragment(), "Page6CSFragment");
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

    @OnClick({2131296396})
    public void next(View view) {
        getPromotion.d(getActivity());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.j.validate();
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
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e3: IPUT  
                  (wrap: o.setMessage$1 : 0x00e0: CONSTRUCTOR  (r1v8 o.setMessage$1 A[REMOVE]) = (r0v26 'setmessage' o.setMessage), (r0v28 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v26 'setmessage' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6DBCADollarSFragment.onCheckedChanged(android.widget.CompoundButton, boolean):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DBCADollarSFragment.class
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
            // Method dump skipped, instructions count: 318
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6DBCADollarSFragment.onCheckedChanged(android.widget.CompoundButton, boolean):void");
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
                case 2131298165:
                    ((FormActivity) getActivity()).n.setDollarCurrCode("SGD");
                    return;
                case 2131298166:
                    ((FormActivity) getActivity()).n.setDollarCurrCode("USD");
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
            if ("Y".equals(((FormActivity) getActivity()).r.getVerified())) {
                c(2131296811, new Page6FSFragment(), "Page6FSFragment");
            } else {
                c(2131296811, new Page6ESFragment(), "Page6ESFragment");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0263  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x02c2  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0309  */
        @Override // androidx.fragment.app.Fragment
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void onViewCreated(android.view.View r11, android.os.Bundle r12) {
            /*
            // Method dump skipped, instructions count: 836
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6DBCADollarSFragment.onViewCreated(android.view.View, android.os.Bundle):void");
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
