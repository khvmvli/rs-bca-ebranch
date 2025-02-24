package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.OutwardRemittanceFormActivity;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.dialog.PilihRekeningSumberDanaDialog;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.ConfirmSubBCACardAdapter$ViewHolder;
import o.LogoutDialog_ViewBinding;
import o.ReservasiROSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.setOnHierarchyChangeListener;
import o.setPadding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR1DataPengirimFragment.class */
public class OR1DataPengirimFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher {
    private Validator a;
    @BindViews({2131297107, 2131297054, 2131297094})
    List<View> etForms;
    @BindView(2131297054)
    @NotEmpty(messageResId = 2131820867, sequence = 3, trim = true)
    @Order(2)
    EditText etNama;
    @BindView(2131297094)
    @NotEmpty(messageResId = 2131820898, sequence = 3, trim = true)
    @Order(3)
    EditText etNoHp;
    @Order(1)
    @BindView(2131297107)
    @NotEmpty(messageResId = 2131820949, sequence = 1, trim = true)
    @Length(messageResId = 2131820950, min = 10, sequence = 2)
    EditText etNumberRek;
    @BindView(2131298420)
    ScrollView svMain;
    @BindViews({2131298653, 2131298601, 2131298640})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298601)
    LogoutDialog_ViewBinding tilNama;
    @BindView(2131298640)
    LogoutDialog_ViewBinding tilNoHp;
    @BindView(2131298653)
    LogoutDialog_ViewBinding tilNoRek;
    @BindViews({2131299126, 2131299078, 2131299115})
    List<TextView> tvErrors;

    private void e(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etNumberRek.getEditableText()) {
            if (this.tvErrors.get(this.etForms.indexOf(this.etNumberRek)).getVisibility() == 0) {
                if (this.tvErrors.get(this.etForms.indexOf(this.etNumberRek)).getText().equals(getString(2131820949))) {
                    if (!this.etNumberRek.getText().toString().isEmpty()) {
                        e(this.etForms.indexOf(this.etNumberRek));
                    }
                } else if (this.tvErrors.get(this.etForms.indexOf(this.etNumberRek)).getText().equals(getString(2131820950)) && this.etNumberRek.getText().toString().length() >= 10) {
                    e(this.etForms.indexOf(this.etNumberRek));
                }
            }
            ((OutwardRemittanceFormActivity) getActivity()).n.setNorekPengirim(this.etNumberRek.getText().toString());
        } else if (editable == this.etNama.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etNama);
            ((OutwardRemittanceFormActivity) getActivity()).n.setNamaPengirim(this.etNama.getText().toString());
        } else if (editable == this.etNoHp.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etNoHp);
            ((OutwardRemittanceFormActivity) getActivity()).n.setNoHpPengirim(this.etNoHp.getText().toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493192;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.OR1DataPengirimFragment.2
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                KirimanUang kirimanUang = (KirimanUang) OR1DataPengirimFragment.this.c.where(KirimanUang.class).equalTo("id", Long.valueOf(((OutwardRemittanceFormActivity) OR1DataPengirimFragment.this.getActivity()).n.getId())).findFirst();
                if (kirimanUang != null && kirimanUang.isValid()) {
                    kirimanUang.deleteFromRealm();
                    documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
                }
            }
        });
        setOnHierarchyChangeListener.a((Activity) getActivity());
    }

    @OnFocusChange({2131297107, 2131297054, 2131297094})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131297054) {
                this.tilNama.setHintEnabled(true);
            } else if (id == 2131297094) {
                this.tilNoHp.setHintEnabled(true);
            } else if (id == 2131297107) {
                this.tilNoRek.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131297054) {
                if (id2 != 2131297094) {
                    if (id2 == 2131297107 && this.etNumberRek.getText().toString().isEmpty()) {
                        this.tilNoRek.setHintEnabled(false);
                    }
                } else if (this.etNoHp.getText().toString().isEmpty()) {
                    this.tilNoHp.setHintEnabled(false);
                }
            } else if (this.etNama.getText().toString().isEmpty()) {
                this.tilNama.setHintEnabled(false);
            }
        }
    }

    @OnClick({2131296396})
    public void lanjut(View view) {
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        getPromotion.d(getContext());
        this.a.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseRekeningSumberDana(ReservasiROSuccessActivity reservasiROSuccessActivity) {
        if (!reservasiROSuccessActivity.d.isEmpty()) {
            e(this.etForms.indexOf(this.etNumberRek));
            this.etNumberRek.setText(reservasiROSuccessActivity.d.split("-")[0].trim());
            ((OutwardRemittanceFormActivity) getActivity()).n.setNorekPengirim(this.etNumberRek.getText().toString());
            this.tilNoRek.setHintEnabled(true);
            return;
        }
        this.tilNoRek.setHintEnabled(false);
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
                int id = view.getId();
                if (id == 2131297054) {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilNama.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id == 2131297094) {
                    this.tvErrors.get(2).setVisibility(0);
                    this.tvErrors.get(2).setText(message);
                    this.tilNoHp.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297107) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(0).setVisibility(0);
                    if (this.e == null || !this.e.getVerified().equals("Y")) {
                        this.tvErrors.get(0).setText(message);
                    } else {
                        this.tvErrors.get(0).setText(getString(2131820925));
                    }
                    this.tilNoRek.setBackgroundResource(2131230870);
                    editText = editText2;
                }
            } else {
                b(this.svMain, message);
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        ((OutwardRemittanceFormActivity) getActivity()).t();
        c(2131296811, new OR2DataTransaksiAFragment(), "OR2DataTransaksiAFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        this.c = Realm.getDefaultInstance();
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        Validator validator = new Validator(this);
        this.a = validator;
        validator.setValidationListener(this);
        this.etNumberRek.setText(((OutwardRemittanceFormActivity) getActivity()).n.getNorekPengirim());
        this.etNama.setText(((OutwardRemittanceFormActivity) getActivity()).n.getNamaPengirim());
        this.etNoHp.setText(((OutwardRemittanceFormActivity) getActivity()).n.getNoHpPengirim());
        if (this.etNoHp.getVisibility() == 0) {
            ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
            confirmSubBCACardAdapter$ViewHolder.c = 2131820898;
            confirmSubBCACardAdapter$ViewHolder.e = 2131820901;
            confirmSubBCACardAdapter$ViewHolder.d = 2131820899;
            confirmSubBCACardAdapter$ViewHolder.a = 2131820900;
            Validator validator2 = this.a;
            EditText editText = this.etNoHp;
            validator2.put(editText, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e2: INVOKE  
                  (r0v84 'validator2' com.mobsandgeeks.saripaar.Validator)
                  (r0v86 'editText' android.widget.EditText)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v6 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$2 : 0x00de: CONSTRUCTOR  
                  (r0v86 'editText' android.widget.EditText)
                  (r0v78 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
                 call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.OR1DataPengirimFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR1DataPengirimFragment.class
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
            // Method dump skipped, instructions count: 478
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR1DataPengirimFragment.onViewCreated(android.view.View, android.os.Bundle):void");
        }

        @OnClick({2131297107})
        public void pilihNorek(View view) {
            if (this.e != null && this.e.getVerified().equals("Y")) {
                PilihRekeningSumberDanaDialog pilihRekeningSumberDanaDialog = new PilihRekeningSumberDanaDialog();
                pilihRekeningSumberDanaDialog.d = ((OutwardRemittanceFormActivity) getActivity()).y;
                pilihRekeningSumberDanaDialog.b = this.etNumberRek.getText().toString();
                pilihRekeningSumberDanaDialog.show(getFragmentManager(), "PilihRekeningSumberDanaDialog");
            }
        }
    }
