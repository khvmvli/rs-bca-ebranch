package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.FotoActivity;
import com.bca.smartbranch.dialog.CameraDialog;
import com.bumptech.glide.Glide;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import io.realm.Realm;
import java.util.List;
import o.GetPPUNumberResponse;
import o.LogoutDialog_ViewBinding;
import o.Page6CSFragment;
import o.PilihKantorCabangActivity;
import o.ReRegistrationSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getAnnualFeeAddOnAmount;
import o.getCurrencyCode;
import o.getPromotion;
import o.getRelationCode;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setCurrentItem;
import o.setPadding;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6ESFragment.class */
public class Page6ESFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher {
    private Validator a;
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 4)
    @Order(2)
    @BindView(2131296976)
    @NotEmpty(messageResId = 2131820778, sequence = 3, trim = true)
    getAnnualFeeAddOnAmount etEmailGuest;
    @BindViews({2131297092, 2131296976})
    List<View> etFields;
    @BindView(2131296981)
    EditText etFotoDiri;
    @Order(1)
    @BindView(2131297092)
    @NotEmpty(messageResId = 2131820933, sequence = 1, trim = true)
    @Length(messageResId = 2131820934, min = 19, sequence = 2)
    setCurrentItem etNoATM;
    @BindString(2131821161)
    String hintAtm;
    @BindView(2131297362)
    Page6CSFragment ivFotoDiri;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindViews({2131298638, 2131298527})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298530)
    LogoutDialog_ViewBinding tilFotoDiri;
    @BindView(2131298638)
    LogoutDialog_ViewBinding tilNoAtm;
    @BindViews({2131299114, 2131299006})
    List<TextView> tvErrors;
    @BindView(2131299615)
    TextView tvTitle;
    @BindString(2131821887)
    String txtTitle;

    private void a(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etNoATM.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNoATM)).getVisibility() == 0 && getPromotion.b(getContext(), this.tvErrors.get(this.etFields.indexOf(this.etNoATM)).getText().toString(), this.etNoATM)) {
                a(this.etFields.indexOf(this.etNoATM));
            }
            ((FormActivity) getActivity()).n.setNumberID(this.etNoATM.e.e);
        } else if (editable == this.etEmailGuest.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etEmailGuest)).getVisibility() == 0 && getPromotion.a(getContext(), this.tvErrors.get(this.etFields.indexOf(this.etEmailGuest)).getText().toString(), this.etEmailGuest)) {
                a(this.etFields.indexOf(this.etEmailGuest));
            }
            ((FormActivity) getActivity()).n.setEmailAddr(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493121;
    }

    @OnClick({2131296981})
    public void fotoDiri(View view) {
        Intent intent = new Intent(getActivity(), FotoActivity.class);
        intent.putExtra("TAKE_FOTO", 2);
        startActivity(intent);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        ((FormActivity) getActivity()).n.setNumberID("");
        ((FormActivity) getActivity()).n.setFotoPribadi("");
        if (((FormActivity) getActivity()).n.getFlagGuest().equals("Y")) {
            ((FormActivity) getActivity()).n.setEmailAddr("");
        }
        String str = ((FormActivity) getActivity()).p;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -748993769:
                if (str.equals("Tahapan BCA")) {
                    c = 0;
                    break;
                }
                break;
            case -245309302:
                if (str.equals("Tahapan Xpresi")) {
                    c = 1;
                    break;
                }
                break;
            case 164545469:
                if (str.equals("Tapres BCA")) {
                    c = 2;
                    break;
                }
                break;
            case 1076132060:
                if (str.equals("BCA Dollar")) {
                    c = 3;
                    break;
                }
                break;
            case 1269943660:
                if (str.equals("Tahapan Berjangka")) {
                    c = 4;
                    break;
                }
                break;
            case 1726066065:
                if (str.equals("DEPOSITO")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0) {
            e(2131296811, new Page6DTahapanBCASFragment(), "Page6DTahapanBCASFragment");
        } else if (c == 1) {
            e(2131296811, new Page6DTahapanXpresiSFragment(), "Page6DTahapanXpresiSFragment");
        } else if (c == 2) {
            e(2131296811, new Page6DTapresSFragment(), "Page6DTapresSFragment");
        } else if (c == 3) {
            e(2131296811, new Page6DBCADollarSFragment(), "Page6DBCADollarSFragment");
        } else if (c == 4 || c == 5) {
            e(2131296811, new Page6CSFragment(), "Page6CSFragment");
        }
    }

    @OnFocusChange({2131296976, 2131297092})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131296976) {
                this.tilEmail.setHintEnabled(true);
            } else if (id == 2131297092) {
                this.tilNoAtm.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131296976) {
                if (id2 == 2131297092 && this.etNoATM.e.e.isEmpty()) {
                    this.tilNoAtm.setHintEnabled(false);
                }
            } else if (this.etEmailGuest.getText().toString().isEmpty()) {
                this.tilEmail.setHintEnabled(false);
            }
        }
    }

    @OnClick({2131297362})
    public void ivfotoDiri(View view) {
        if (((FormActivity) getActivity()).n.getFotoPribadi().isEmpty()) {
            Intent intent = new Intent(getActivity(), FotoActivity.class);
            intent.putExtra("TAKE_FOTO", 2);
            startActivity(intent);
            return;
        }
        new CameraDialog().show(getFragmentManager(), "CameraDialog");
    }

    @OnClick({2131296396})
    public void next(View view) {
        getPromotion.d(getContext());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.a.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory(e = ThreadMode.MAIN)
    public void onChooseCameraEvent(PilihKantorCabangActivity pilihKantorCabangActivity) {
        if (pilihKantorCabangActivity.c) {
            Intent intent = new Intent(getActivity(), FotoActivity.class);
            intent.putExtra("TAKE_FOTO", 2);
            startActivity(intent);
            return;
        }
        ((FormActivity) getActivity()).n.setFotoPribadi("");
        this.etFotoDiri.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231142, 0);
        this.ivFotoDiri.setVisibility(8);
        this.etFotoDiri.setText((CharSequence) null);
        this.tilFotoDiri.setHintEnabled(false);
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
                if (id == 2131296976) {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilEmail.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297092) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilNoAtm.setBackgroundResource(2131230870);
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
        c(2131296811, new Page6FSFragment(), "Page6FSFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bitmap bitmap;
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        if (((FormActivity) getActivity()).r.isMember()) {
            if (((FormActivity) getActivity()).r.getName().length() > 15) {
                ((FormActivity) getActivity()).r.getName();
            } else {
                ((FormActivity) getActivity()).r.getName();
            }
        }
        if ("Y".equals(((FormActivity) getActivity()).r.getVerified())) {
            this.tilNoAtm.setVisibility(8);
        }
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        Validator validator = new Validator(this);
        this.a = validator;
        validator.setValidationListener(this);
        ((FormActivity) getActivity()).n.setCurrentPage("Page6ESFragment");
        this.etNoATM.setHint(this.hintAtm);
        Validator validator2 = this.a;
        setCurrentItem setcurrentitem = this.etNoATM;
        validator2.put(setcurrentitem, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ec: INVOKE  
              (r0v33 'validator2' com.mobsandgeeks.saripaar.Validator)
              (r0v35 'setcurrentitem' o.setCurrentItem)
              (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v3 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
              (wrap: o.getPromotion$5 : 0x00e8: CONSTRUCTOR  (r0v35 'setcurrentitem' o.setCurrentItem) call: o.getPromotion.5.<init>(o.setCurrentItem):void type: CONSTRUCTOR)
             elemType: com.mobsandgeeks.saripaar.QuickRule)
             type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.Page6ESFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6ESFragment.class
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
        // Method dump skipped, instructions count: 583
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6ESFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
