package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.PilihKodePosActivity;
import com.bca.smartbranch.activity.PilihKotaActivity;
import com.bca.smartbranch.activity.PilihProvinsiActivity;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.LogoutDialog_ViewBinding;
import o.PilihNegaraORActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onChooseKodePosHome;
import o.onChooseKotaKantor;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setPadding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6MLFragment.class */
public class Page6MLFragment extends BaseFragment implements TextWatcher, Validator.ValidationListener {
    private Validator a;
    private Realm d;
    @BindView(2131296931)
    @NotEmpty(messageResId = 2131820955, sequence = 4, trim = true)
    @Order(4)
    EditText etAlamat;
    @BindView(2131296967)
    @NotEmpty(messageResId = 2131820753, sequence = 3, trim = true)
    @Order(3)
    EditText etBidangUsaha;
    @BindViews({2131297061, 2131296992, 2131296967, 2131296931, 2131297033, 2131297022, 2131297161})
    List<View> etFields;
    @BindView(2131296992)
    @NotEmpty(messageResId = 2131820808, sequence = 2, trim = true)
    @Order(2)
    EditText etJabatan;
    @Order(6)
    @BindView(2131297022)
    @NotEmpty(messageResId = 2131820978, sequence = 6, trim = true)
    @Length(messageResId = 2131820979, min = 5, sequence = 7)
    EditText etKodePos;
    @BindView(2131297033)
    @NotEmpty(messageResId = 2131820761, sequence = 5, trim = true)
    @Order(5)
    EditText etKota;
    @BindView(2131297061)
    @NotEmpty(messageResId = 2131820957, sequence = 1, trim = true)
    @Order(1)
    EditText etNama;
    @BindView(2131297161)
    @NotEmpty(messageResId = 2131820981, sequence = 7, trim = true)
    @Order(7)
    EditText etProvinsi;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298480)
    LogoutDialog_ViewBinding tilAlamatKantor;
    @BindView(2131298517)
    LogoutDialog_ViewBinding tilBidangUsaha;
    @BindViews({2131298608, 2131298541, 2131298517, 2131298480, 2131298580, 2131298568, 2131298697})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298541)
    LogoutDialog_ViewBinding tilJabatan;
    @BindView(2131298568)
    LogoutDialog_ViewBinding tilKodePos;
    @BindView(2131298580)
    LogoutDialog_ViewBinding tilKota;
    @BindView(2131298608)
    LogoutDialog_ViewBinding tilNamaKantor;
    @BindView(2131298697)
    LogoutDialog_ViewBinding tilProvinsi;
    @BindViews({2131299085, 2131299016, 2131298996, 2131298960, 2131299056, 2131299045, 2131299164})
    List<TextView> tvErrors;

    private void c(EditText editText) {
        if (this.tvErrors.get(this.etFields.indexOf(editText)).getVisibility() == 0 && !editText.getText().toString().isEmpty()) {
            e(this.etFields.indexOf(editText));
        }
    }

    private void e(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etNama.getEditableText()) {
            c(this.etNama);
            ((FormActivity) getActivity()).n.setOfficeName(editable.toString());
        } else if (editable == this.etAlamat.getEditableText()) {
            c(this.etAlamat);
            ((FormActivity) getActivity()).n.setOfficeAddress(editable.toString());
        } else if (editable == this.etKota.getEditableText()) {
            ((FormActivity) getActivity()).n.setOfficeCity(editable.toString());
        } else if (editable == this.etKodePos.getEditableText()) {
            ((FormActivity) getActivity()).n.setOfficePostCode(editable.toString());
        } else if (editable == this.etJabatan.getEditableText()) {
            c(this.etJabatan);
            ((FormActivity) getActivity()).n.setOccupation(editable.toString());
        } else if (editable == this.etBidangUsaha.getEditableText()) {
            c(this.etBidangUsaha);
            ((FormActivity) getActivity()).n.setBusinessField(editable.toString());
        } else if (editable == this.etProvinsi.getEditableText()) {
            ((FormActivity) getActivity()).n.setOfficeProvince(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493139;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.d.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.Page6MLFragment.1
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((FormActivity) Page6MLFragment.this.getActivity()).n.setOfficeName("");
                ((FormActivity) Page6MLFragment.this.getActivity()).n.setOfficeAddress("");
                ((FormActivity) Page6MLFragment.this.getActivity()).n.setOfficeProvince("");
                ((FormActivity) Page6MLFragment.this.getActivity()).n.setOfficeCity("");
                ((FormActivity) Page6MLFragment.this.getActivity()).n.setOfficePostCode("");
            }
        });
        e(2131296811, new Page6KL2Fragment(), "Page6KL2Fragment");
    }

    @OnFocusChange({2131297061, 2131296931, 2131296992, 2131296967})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296931:
                    this.tilAlamatKantor.setHintEnabled(true);
                    return;
                case 2131296967:
                    this.tilBidangUsaha.setHintEnabled(true);
                    return;
                case 2131296992:
                    this.tilJabatan.setHintEnabled(true);
                    return;
                case 2131297061:
                    this.tilNamaKantor.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296931:
                    if (this.etAlamat.getText().toString().isEmpty()) {
                        this.tilAlamatKantor.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296967:
                    if (this.etBidangUsaha.getText().toString().isEmpty()) {
                        this.tilBidangUsaha.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296992:
                    if (this.etJabatan.getText().toString().isEmpty()) {
                        this.tilJabatan.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297061:
                    if (this.etNama.getText().toString().isEmpty()) {
                        this.tilNamaKantor.setHintEnabled(false);
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
        for (int i = 0; i < this.etFields.size(); i++) {
            if (this.etFields.get(i) == this.etJabatan) {
                if (((FormActivity) getActivity()).n.getOccupationFlagFreeText().equals("N")) {
                }
                this.tvErrors.get(i).setVisibility(8);
                this.tilForms.get(i).setBackgroundResource(2131230847);
            } else {
                if (this.etFields.get(i) == this.etBidangUsaha && ((FormActivity) getActivity()).n.getBusinessFieldFlagFreeText().equals("N")) {
                }
                this.tvErrors.get(i).setVisibility(8);
                this.tilForms.get(i).setBackgroundResource(2131230847);
            }
        }
        this.a.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKodePos(onChooseKodePosHome onchoosekodeposhome) {
        e(this.etFields.indexOf(this.etKodePos));
        this.tilKodePos.setHintEnabled(true);
        this.etKodePos.setText(onchoosekodeposhome.e);
        ((FormActivity) getActivity()).n.setOfficePostCode(onchoosekodeposhome.e);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKota(onChooseKotaKantor onchoosekotakantor) {
        e(this.etFields.indexOf(this.etKota));
        e(this.etFields.indexOf(this.etKodePos));
        this.tilKodePos.setVisibility(0);
        this.tilKodePos.setHintEnabled(false);
        this.etKodePos.getText().clear();
        this.tilKota.setHintEnabled(true);
        this.etKota.setText(onchoosekotakantor.a);
        ((FormActivity) getActivity()).n.setOfficeCity(onchoosekotakantor.a);
        ((FormActivity) getActivity()).n.setOfficePostCode("");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseProvinsi(PilihNegaraORActivity pilihNegaraORActivity) {
        e(this.etFields.indexOf(this.etProvinsi));
        e(this.etFields.indexOf(this.etKota));
        e(this.etFields.indexOf(this.etKodePos));
        this.tilKota.setVisibility(0);
        this.tilKota.setHintEnabled(false);
        this.tilKodePos.setVisibility(8);
        this.etKota.getText().clear();
        this.etKodePos.getText().clear();
        this.tilProvinsi.setHintEnabled(true);
        this.etProvinsi.setText(pilihNegaraORActivity.b);
        ((FormActivity) getActivity()).n.setOfficeProvince(pilihNegaraORActivity.b);
        ((FormActivity) getActivity()).n.setOfficeCity("");
        ((FormActivity) getActivity()).n.setOfficePostCode("");
    }

    @OnClick({2131297022})
    public void onClickKodePos(View view) {
        Intent intent = new Intent(getContext(), PilihKodePosActivity.class);
        intent.putExtra("provinsi", this.etProvinsi.getText().toString());
        intent.putExtra("kota", this.etKota.getText().toString());
        startActivity(intent);
    }

    @OnClick({2131297033})
    public void onClickKota(View view) {
        Intent intent = new Intent(getContext(), PilihKotaActivity.class);
        intent.putExtra("provinsi", this.etProvinsi.getText().toString());
        startActivity(intent);
    }

    @OnClick({2131297161})
    public void onClickProvinsi(View view) {
        startActivity(new Intent(getContext(), PilihProvinsiActivity.class));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.d.close();
        documentProvider.b().e(this);
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
                switch (view.getId()) {
                    case 2131296931:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.tilAlamatKantor.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131296967:
                        this.tvErrors.get(2).setVisibility(0);
                        this.tvErrors.get(2).setText(message);
                        this.tilBidangUsaha.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131296992:
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilJabatan.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297022:
                        this.tvErrors.get(5).setVisibility(0);
                        this.tvErrors.get(5).setText(message);
                        this.tilKodePos.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297033:
                        this.tvErrors.get(4).setVisibility(0);
                        this.tvErrors.get(4).setText(message);
                        this.tilKota.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297061:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilNamaKantor.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297161:
                        this.tvErrors.get(6).setVisibility(0);
                        this.tvErrors.get(6).setText(message);
                        this.tilProvinsi.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    default:
                        editText = editText2;
                        continue;
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
        c(2131296811, new Page6PLFragment(), "Page6PLFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        this.d = Realm.getDefaultInstance();
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        Validator validator = new Validator(this);
        this.a = validator;
        validator.setValidationListener(this);
        ((FormActivity) getActivity()).n.setCurrentPage("Page6MLFragment");
        if (!((FormActivity) getActivity()).n.getOccupationFlagFreeText().equals("N")) {
            this.etJabatan.setEnabled(true);
            this.tilJabatan.setBackgroundResource(2131230847);
            this.tilJabatan.setHintTextAppearance(2131886846);
            this.tilJabatan.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099731)));
        }
        if (!((FormActivity) getActivity()).n.getBusinessFieldFlagFreeText().equals("N")) {
            this.etBidangUsaha.setEnabled(true);
            this.tilBidangUsaha.setBackgroundResource(2131230847);
            this.tilBidangUsaha.setHintTextAppearance(2131886846);
            this.tilBidangUsaha.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099731)));
        }
        this.etNama.setText(((FormActivity) getActivity()).n.getOfficeName());
        if (!((FormActivity) getActivity()).n.getOfficeName().isEmpty()) {
            this.tilNamaKantor.setHintEnabled(true);
        }
        this.etJabatan.setText(((FormActivity) getActivity()).n.getOccupation());
        if (!((FormActivity) getActivity()).n.getOccupation().isEmpty()) {
            this.tilJabatan.setHintEnabled(true);
        }
        this.etBidangUsaha.setText(((FormActivity) getActivity()).n.getBusinessField());
        if (!((FormActivity) getActivity()).n.getBusinessField().isEmpty()) {
            this.tilBidangUsaha.setHintEnabled(true);
        }
        this.etAlamat.setText(((FormActivity) getActivity()).n.getOfficeAddress());
        if (!((FormActivity) getActivity()).n.getOfficeAddress().isEmpty()) {
            this.tilAlamatKantor.setHintEnabled(true);
        }
        this.etAlamat.setOnTouchListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b6: INVOKE  
              (wrap: android.widget.EditText : 0x01ac: IGET  (r0v68 android.widget.EditText A[REMOVE]) = (r4v0 'this' com.bca.smartbranch.fragment.Page6MLFragment A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.fragment.Page6MLFragment.etAlamat android.widget.EditText)
              (wrap: o.getPromotion$4 : 0x01b3: CONSTRUCTOR  (r1v32 o.getPromotion$4 A[REMOVE]) =  call: o.getPromotion.4.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.view.View.setOnTouchListener(android.view.View$OnTouchListener):void in method: com.bca.smartbranch.fragment.Page6MLFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6MLFragment.class
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
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 15 more
            */
        /*
        // Method dump skipped, instructions count: 679
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6MLFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
