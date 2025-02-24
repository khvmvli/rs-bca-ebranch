package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.InfoPromoORActivity;
import com.bca.smartbranch.activity.OutwardRemittanceFormActivity;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.LogoutDialog_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.setMessage;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6DataLainnyaFragment.class */
public class OR6DataLainnyaFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher {
    private Validator a;
    private setMessage d = new setMessage();
    @BindView(2131297027)
    @NotEmpty(messageResId = 2131820890)
    @Order(1)
    EditText etPromoCode;
    @BindView(2131298155)
    RadioButton rbPromoCodeTidak;
    @BindView(2131298156)
    RadioButton rbPromoCodeYa;
    @BindView(2131298220)
    RadioGroup rgPromoCode;
    @BindView(2131298573)
    LogoutDialog_ViewBinding tilPromoCode;
    @BindView(2131299050)
    TextView tvErrorPromoCode;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etPromoCode.getEditableText()) {
            if (this.tvErrorPromoCode.getVisibility() == 0 && !this.etPromoCode.getText().toString().isEmpty()) {
                this.tvErrorPromoCode.setVisibility(8);
                this.tilPromoCode.setBackgroundResource(2131230847);
            }
            ((OutwardRemittanceFormActivity) getActivity()).n.setPromoCode(this.etPromoCode.getText().toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493198;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagPromoCode("N");
        ((OutwardRemittanceFormActivity) getActivity()).n.setPromoCode("");
        e(2131296811, new OR5DataPenerimaFragment(), "OR5DataPenerimaFragment");
    }

    @OnFocusChange({2131297027})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297027) {
                this.tilPromoCode.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297027 && this.etPromoCode.getText().toString().isEmpty()) {
            this.tilPromoCode.setHintEnabled(false);
        }
    }

    @OnClick({2131296393})
    public void onClickInfoPromo(View view) {
        startActivity(new Intent(getContext(), InfoPromoORActivity.class));
    }

    @OnClick({2131296396})
    public void onClickLanjut(View view) {
        getPromotion.d(getContext());
        this.tvErrorPromoCode.setVisibility(8);
        this.tilPromoCode.setBackgroundResource(2131230847);
        this.a.validate();
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        documentProvider.b().e(this);
        onDestroyView();
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
                if (view.getId() != 2131297027) {
                    editText = editText2;
                } else {
                    this.tvErrorPromoCode.setVisibility(0);
                    this.tvErrorPromoCode.setText(message);
                    this.tilPromoCode.setBackgroundResource(2131230870);
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
        ((OutwardRemittanceFormActivity) getActivity()).t();
        c(2131296811, new OR6ReviewFragment(), "OR6ReviewFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        Validator validator = new Validator(this);
        this.a = validator;
        validator.setValidationListener(this);
        String flagPromoCode = ((OutwardRemittanceFormActivity) getActivity()).n.getFlagPromoCode();
        flagPromoCode.hashCode();
        if (!flagPromoCode.equals("N")) {
            if (!flagPromoCode.equals("Y")) {
                ((OutwardRemittanceFormActivity) getActivity()).n.setFlagPromoCode("N");
            } else {
                this.rbPromoCodeYa.setChecked(true);
                this.etPromoCode.setText(((OutwardRemittanceFormActivity) getActivity()).n.getPromoCode());
                this.tilPromoCode.setVisibility(0);
                this.tilPromoCode.setHintEnabled(!this.etPromoCode.getText().toString().isEmpty());
                this.rgPromoCode.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.OR6DataLainnyaFragment.5
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup, final int i) {
                        OR6DataLainnyaFragment.this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.OR6DataLainnyaFragment.5.3
                            @Override // io.realm.Realm.Transaction
                            public final void execute(Realm realm) {
                                switch (i) {
                                    case 2131298155:
                                        setMessage setmessage = OR6DataLainnyaFragment.this.d;
                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding = OR6DataLainnyaFragment.this.tilPromoCode;
                                        setmessage.a = logoutDialog_ViewBinding.getMeasuredHeight();
                                        setmessage.b = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0072: IPUT  
                                              (wrap: o.setMessage$1 : 0x006f: CONSTRUCTOR  (r1v2 o.setMessage$1 A[REMOVE]) = (r0v5 'setmessage' o.setMessage), (r0v9 'logoutDialog_ViewBinding' o.LogoutDialog_ViewBinding) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                                              (r0v5 'setmessage' o.setMessage)
                                             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6DataLainnyaFragment.5.3.execute(io.realm.Realm):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6DataLainnyaFragment$5$3.class
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:266)
                                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:79)
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
                                            	... 21 more
                                            */
                                        /*
                                            this = this;
                                            r0 = r6
                                            int r0 = r8
                                            switch(r0) {
                                                case 2131298155: goto L_0x004a;
                                                case 2131298156: goto L_0x001d;
                                                default: goto L_0x001c;
                                            }
                                        L_0x001c:
                                            return
                                        L_0x001d:
                                            r0 = r6
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                            o.setMessage r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.d(r0)
                                            r1 = r6
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r1 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment r1 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                            o.LogoutDialog_ViewBinding r1 = r1.tilPromoCode
                                            r0.c(r1)
                                            r0 = r6
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                            o.getView r0 = r0.getActivity()
                                            com.bca.smartbranch.activity.OutwardRemittanceFormActivity r0 = (com.bca.smartbranch.activity.OutwardRemittanceFormActivity) r0
                                            com.bca.smartbranch.data.localdb.KirimanUang r0 = r0.n
                                            java.lang.String r1 = "Y"
                                            r0.setFlagPromoCode(r1)
                                            return
                                        L_0x004a:
                                            r0 = r6
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                            o.setMessage r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.d(r0)
                                            r7 = r0
                                            r0 = r6
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                            o.LogoutDialog_ViewBinding r0 = r0.tilPromoCode
                                            r8 = r0
                                            r0 = r7
                                            r1 = r8
                                            int r1 = r1.getMeasuredHeight()
                                            r0.a = r1
                                            r0 = r7
                                            o.setMessage$1 r1 = new o.setMessage$1
                                            r2 = r1
                                            r3 = r7
                                            r4 = r8
                                            r2.<init>(r4)
                                            r0.b = r1
                                            r0 = r7
                                            r1 = r8
                                            r0.b(r1)
                                            r0 = r6
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                            android.widget.EditText r0 = r0.etPromoCode
                                            java.lang.String r1 = ""
                                            r0.setText(r1)
                                            r0 = r6
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                            o.LogoutDialog_ViewBinding r0 = r0.tilPromoCode
                                            r1 = 0
                                            r0.setHintEnabled(r1)
                                            r0 = r6
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                            android.widget.TextView r0 = r0.tvErrorPromoCode
                                            r1 = 8
                                            r0.setVisibility(r1)
                                            r0 = r6
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                            o.LogoutDialog_ViewBinding r0 = r0.tilPromoCode
                                            r1 = 2131230847(0x7f08007f, float:1.8077758E38)
                                            r0.setBackgroundResource(r1)
                                            r0 = r6
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                            com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                            o.getView r0 = r0.getActivity()
                                            com.bca.smartbranch.activity.OutwardRemittanceFormActivity r0 = (com.bca.smartbranch.activity.OutwardRemittanceFormActivity) r0
                                            com.bca.smartbranch.data.localdb.KirimanUang r0 = r0.n
                                            java.lang.String r1 = "N"
                                            r0.setFlagPromoCode(r1)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.AnonymousClass3.execute(io.realm.Realm):void");
                                    }
                                });
                            }
                        });
                        this.etPromoCode.addTextChangedListener(this);
                    }
                }
                this.rbPromoCodeTidak.setChecked(true);
                this.tilPromoCode.setVisibility(8);
                this.rgPromoCode.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.OR6DataLainnyaFragment.5
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup, final int i) {
                        OR6DataLainnyaFragment.this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.OR6DataLainnyaFragment.5.3
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0072: IPUT  
                                  (wrap: o.setMessage$1 : 0x006f: CONSTRUCTOR  (r1v2 o.setMessage$1 A[REMOVE]) = (r0v5 'setmessage' o.setMessage), (r0v9 'logoutDialog_ViewBinding' o.LogoutDialog_ViewBinding) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                                  (r0v5 'setmessage' o.setMessage)
                                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6DataLainnyaFragment.5.3.execute(io.realm.Realm):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6DataLainnyaFragment$5$3.class
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:266)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:79)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                                	... 16 more
                                */
                            @Override // io.realm.Realm.Transaction
                            public final void execute(io.realm.Realm r7) {
                                /*
                                    r6 = this;
                                    r0 = r6
                                    int r0 = r8
                                    switch(r0) {
                                        case 2131298155: goto L_0x004a;
                                        case 2131298156: goto L_0x001d;
                                        default: goto L_0x001c;
                                    }
                                L_0x001c:
                                    return
                                L_0x001d:
                                    r0 = r6
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                    o.setMessage r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.d(r0)
                                    r1 = r6
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r1 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment r1 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                    o.LogoutDialog_ViewBinding r1 = r1.tilPromoCode
                                    r0.c(r1)
                                    r0 = r6
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                    o.getView r0 = r0.getActivity()
                                    com.bca.smartbranch.activity.OutwardRemittanceFormActivity r0 = (com.bca.smartbranch.activity.OutwardRemittanceFormActivity) r0
                                    com.bca.smartbranch.data.localdb.KirimanUang r0 = r0.n
                                    java.lang.String r1 = "Y"
                                    r0.setFlagPromoCode(r1)
                                    return
                                L_0x004a:
                                    r0 = r6
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                    o.setMessage r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.d(r0)
                                    r7 = r0
                                    r0 = r6
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                    o.LogoutDialog_ViewBinding r0 = r0.tilPromoCode
                                    r8 = r0
                                    r0 = r7
                                    r1 = r8
                                    int r1 = r1.getMeasuredHeight()
                                    r0.a = r1
                                    r0 = r7
                                    o.setMessage$1 r1 = new o.setMessage$1
                                    r2 = r1
                                    r3 = r7
                                    r4 = r8
                                    r2.<init>(r4)
                                    r0.b = r1
                                    r0 = r7
                                    r1 = r8
                                    r0.b(r1)
                                    r0 = r6
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                    android.widget.EditText r0 = r0.etPromoCode
                                    java.lang.String r1 = ""
                                    r0.setText(r1)
                                    r0 = r6
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                    o.LogoutDialog_ViewBinding r0 = r0.tilPromoCode
                                    r1 = 0
                                    r0.setHintEnabled(r1)
                                    r0 = r6
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                    android.widget.TextView r0 = r0.tvErrorPromoCode
                                    r1 = 8
                                    r0.setVisibility(r1)
                                    r0 = r6
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                    o.LogoutDialog_ViewBinding r0 = r0.tilPromoCode
                                    r1 = 2131230847(0x7f08007f, float:1.8077758E38)
                                    r0.setBackgroundResource(r1)
                                    r0 = r6
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment$5 r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.this
                                    com.bca.smartbranch.fragment.OR6DataLainnyaFragment r0 = com.bca.smartbranch.fragment.OR6DataLainnyaFragment.this
                                    o.getView r0 = r0.getActivity()
                                    com.bca.smartbranch.activity.OutwardRemittanceFormActivity r0 = (com.bca.smartbranch.activity.OutwardRemittanceFormActivity) r0
                                    com.bca.smartbranch.data.localdb.KirimanUang r0 = r0.n
                                    java.lang.String r1 = "N"
                                    r0.setFlagPromoCode(r1)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6DataLainnyaFragment.AnonymousClass5.AnonymousClass3.execute(io.realm.Realm):void");
                            }
                        });
                    }
                });
                this.etPromoCode.addTextChangedListener(this);
            }
        }
