package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.FotoActivity;
import com.bca.smartbranch.activity.PhotoCardActivity;
import com.bca.smartbranch.dialog.CameraDialog;
import com.bumptech.glide.Glide;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.Calendar;
import java.util.List;
import o.GetPPUNumberResponse;
import o.LogoutDialog_ViewBinding;
import o.OR2PilihProductFragment_ViewBinding;
import o.Page6CSFragment;
import o.PilihKantorCabangActivity;
import o.ReRegistrationSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getAnnualFeeBasicAmount;
import o.getCurrencyCode;
import o.getPromotion;
import o.getRelationCode;
import o.lewati;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setPadding;
import o.showInfoValueTodayOR;
import o.ubahProfil;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6FLKartuPelajarFragment.class */
public class Page6FLKartuPelajarFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver, RadioGroup.OnCheckedChangeListener {
    private int a;
    private Validator d;
    @BindViews({2131297103, 2131297044, 2131297077})
    List<View> etFields;
    @BindView(2131296981)
    EditText etFotoDiri;
    @BindView(2131296982)
    EditText etFotoID;
    @BindView(2131297044)
    @NotEmpty(messageResId = 2131820783, trim = true)
    @Order(2)
    EditText etMasaBerlaku;
    @BindView(2131297077)
    @NotEmpty(messageResId = 2131820871, trim = true)
    @Order(3)
    EditText etNamaSesuai;
    @BindView(2131297103)
    @NotEmpty(messageResId = 2131820913, trim = true)
    @Order(1)
    EditText etNoIdentitas;
    @BindView(2131297362)
    Page6CSFragment ivFotoDiri;
    @BindView(2131297364)
    Page6CSFragment ivFotoID;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298148)
    RadioButton rbLakiLaki;
    @BindView(2131298149)
    RadioButton rbPerempuan;
    @BindView(2131298217)
    RadioGroup rgJenisKelamin;
    @BindViews({2131298649, 2131298591, 2131298623})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298530)
    LogoutDialog_ViewBinding tilFotoDiri;
    @BindView(2131298531)
    LogoutDialog_ViewBinding tilFotoIdentitas;
    @BindView(2131298591)
    LogoutDialog_ViewBinding tilMasaBerlaku;
    @BindView(2131298623)
    LogoutDialog_ViewBinding tilNamaSesuai;
    @BindView(2131298649)
    LogoutDialog_ViewBinding tilNoIdentitas;
    @BindViews({2131299122, 2131299067, 2131299099})
    List<TextView> tvErrors;

    private void a() {
        if (this.a == 2) {
            Intent intent = new Intent(getActivity(), FotoActivity.class);
            intent.putExtra("TAKE_FOTO", this.a);
            startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(getActivity(), PhotoCardActivity.class);
        intent2.putExtra("TAKE_FOTO", this.a);
        startActivity(intent2);
    }

    private void b(int i) {
        this.a = i;
        if ((!((FormActivity) getActivity()).n.getFotoPribadi().isEmpty() || i != 2) && (!((FormActivity) getActivity()).n.getFotoKtp().isEmpty() || i != 1)) {
            new CameraDialog().show(getFragmentManager(), "CameraDialog");
        } else {
            a();
        }
    }

    private void d(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etNoIdentitas.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNoIdentitas)).getVisibility() == 0 && getPromotion.d(getContext(), this.tvErrors.get(this.etFields.indexOf(this.etNoIdentitas)).getText().toString(), this.etNoIdentitas)) {
                d(this.etFields.indexOf(this.etNoIdentitas));
            }
            ((FormActivity) getActivity()).n.setNumberID(editable.toString());
        } else if (editable == this.etNamaSesuai.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNamaSesuai)).getVisibility() == 0 && !this.etNamaSesuai.getText().toString().isEmpty()) {
                d(this.etFields.indexOf(this.etNamaSesuai));
            }
            ((FormActivity) getActivity()).n.setName(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493122;
    }

    public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
        d(this.etFields.indexOf(this.etMasaBerlaku));
        this.tilMasaBerlaku.setHintEnabled(true);
        this.etMasaBerlaku.setError(null);
        this.etMasaBerlaku.setText(getAnnualFeeBasicAmount.a(i, i2, i3));
        ((FormActivity) getActivity()).n.setExpID(getAnnualFeeBasicAmount.a(i, i2, i3));
    }

    @OnClick({2131296981, 2131297362})
    public void fotoDiri(View view) {
        b(2);
    }

    @OnClick({2131296982, 2131297364})
    public void fotoID(View view) {
        b(1);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((FormActivity) Page6FLKartuPelajarFragment.this.getActivity()).n.setFotoKtp("");
                ((FormActivity) Page6FLKartuPelajarFragment.this.getActivity()).n.setNumberID("");
                ((FormActivity) Page6FLKartuPelajarFragment.this.getActivity()).n.setExpID("");
                ((FormActivity) Page6FLKartuPelajarFragment.this.getActivity()).n.setName("");
                ((FormActivity) Page6FLKartuPelajarFragment.this.getActivity()).n.setFotoPribadi("");
                ((FormActivity) Page6FLKartuPelajarFragment.this.getActivity()).n.setSex("");
            }
        });
        e(2131296811, new Page6ELFragment(), "Page6ELFragment");
    }

    @OnFocusChange({2131297103, 2131297077})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131297077) {
                this.tilNamaSesuai.setHintEnabled(true);
            } else if (id == 2131297103) {
                this.tilNoIdentitas.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131297077) {
                if (id2 == 2131297103 && this.etNoIdentitas.getText().toString().isEmpty()) {
                    this.tilNoIdentitas.setHintEnabled(false);
                }
            } else if (this.etNamaSesuai.getText().toString().isEmpty()) {
                this.tilNamaSesuai.setHintEnabled(false);
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
        this.d.validate();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case 2131298148:
                ((FormActivity) getActivity()).n.setSex("L");
                return;
            case 2131298149:
                ((FormActivity) getActivity()).n.setSex("P");
                return;
            default:
                return;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory(e = ThreadMode.MAIN)
    public void onChooseCameraEvent(PilihKantorCabangActivity pilihKantorCabangActivity) {
        if (pilihKantorCabangActivity.c) {
            a();
            return;
        }
        int i = this.a;
        if (i == 2) {
            ((FormActivity) getActivity()).n.setFotoPribadi("");
            this.etFotoDiri.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131230927, 0);
            this.ivFotoDiri.setVisibility(8);
            this.etFotoDiri.setText((CharSequence) null);
            this.tilFotoDiri.setHintEnabled(false);
        } else if (i == 1) {
            ((FormActivity) getActivity()).n.setFotoKtp("");
            this.etFotoID.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131230927, 0);
            this.ivFotoID.setVisibility(8);
            this.etFotoID.setText((CharSequence) null);
            this.tilFotoIdentitas.setHintEnabled(false);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueFotoDiri(ReRegistrationSuccessActivity reRegistrationSuccessActivity) {
        this.etFotoDiri.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.ivFotoDiri.setVisibility(0);
        this.tilFotoDiri.setHintEnabled(true);
        this.etFotoDiri.setText("  ");
        Glide.d(getContext()).e(reRegistrationSuccessActivity.e).c(new GetPPUNumberResponse().a(getCurrencyCode.d, new getRelationCode())).c((ImageView) this.ivFotoDiri);
        ((FormActivity) getActivity()).n.setFotoPribadi(getPromotion.b(reRegistrationSuccessActivity.e));
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueFotoID(ubahProfil ubahprofil) {
        this.etFotoID.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.ivFotoID.setVisibility(0);
        this.tilFotoIdentitas.setHintEnabled(true);
        this.etFotoID.setText("  ");
        Glide.d(getContext()).e(ubahprofil.e).c(new GetPPUNumberResponse().a(getCurrencyCode.d, new getRelationCode())).c((ImageView) this.ivFotoID);
        ((FormActivity) getActivity()).n.setFotoKtp(getPromotion.b(ubahprofil.e));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.c.close();
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
                int id = view.getId();
                if (id == 2131297044) {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilMasaBerlaku.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id == 2131297077) {
                    this.tvErrors.get(2).setVisibility(0);
                    this.tvErrors.get(2).setText(message);
                    this.tilNamaSesuai.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297103) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilNoIdentitas.setBackgroundResource(2131230870);
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
        c(2131296811, new Page6GLFragment(), "Page6GLFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bitmap bitmap;
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        this.c = Realm.getDefaultInstance();
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        Validator validator = new Validator(this);
        this.d = validator;
        validator.setValidationListener(this);
        ((FormActivity) getActivity()).n.setCurrentPage("Page6FLKartuPelajarFragment");
        this.etNoIdentitas.setTag(((FormActivity) getActivity()).n.getTypeID());
        getPromotion.c(this.etNoIdentitas, ((FormActivity) getActivity()).n.getTypeID());
        Validator validator2 = this.d;
        EditText editText = this.etNoIdentitas;
        validator2.put(editText, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a8: INVOKE  
              (r0v28 'validator2' com.mobsandgeeks.saripaar.Validator)
              (r0v30 'editText' android.widget.EditText)
              (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v3 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
              (wrap: o.getPromotion$7 : 0x00a4: CONSTRUCTOR  (r0v30 'editText' android.widget.EditText) call: o.getPromotion.7.<init>(android.widget.EditText):void type: CONSTRUCTOR)
             elemType: com.mobsandgeeks.saripaar.QuickRule)
             type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6FLKartuPelajarFragment.class
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
        // Method dump skipped, instructions count: 618
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @OnClick({2131297044})
    public void showDatePicker(View view) {
        Calendar instance = Calendar.getInstance();
        showInfoValueTodayOR e = showInfoValueTodayOR.e(this, instance.get(1), instance.get(2), instance.get(5));
        OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding = e.b;
        Calendar calendar = (Calendar) instance.clone();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        oR2PilihProductFragment_ViewBinding.e = calendar;
        lewati lewati = e.d;
        if (lewati != null) {
            lewati.c.h();
        }
        int color = getResources().getColor(2131099765);
        e.a = Color.argb(255, Color.red(color), Color.green(color), Color.blue(color));
        e.show(getActivity().getFragmentManager(), "");
    }
}
