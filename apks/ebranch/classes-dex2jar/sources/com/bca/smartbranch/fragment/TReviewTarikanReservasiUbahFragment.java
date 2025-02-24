package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.InfoBiayaActivity;
import com.bca.smartbranch.activity.TarikanReservasiUbahTransaksiActivity;
import com.bca.smartbranch.dialog.PilihRekeningDialog;
import com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Checked;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import io.realm.Realm;
import java.util.Iterator;
import java.util.List;
import o.LogoutDialog_ViewBinding;
import o.ReservasiROSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.copyWindowDataInto;
import o.documentProvider;
import o.getPromotion;
import o.setBranchAddress;
import o.setMessage;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TReviewTarikanReservasiUbahFragment.class */
public class TReviewTarikanReservasiUbahFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher {
    private setMessage a = new setMessage();
    @BindView(2131296440)
    Button btnProses;
    @Checked(messageResId = 2131820725, sequence = 3)
    @BindView(2131296469)
    @Order(3)
    CheckBox cbxAgree;
    private Validator d;
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 2)
    @Order(2)
    @BindView(2131296976)
    @NotEmpty(messageResId = 2131820778, sequence = 1, trim = true)
    EditText etEmail;
    @BindView(2131297006)
    EditText etJumlah;
    @Order(1)
    @BindView(2131297107)
    @NotEmpty(messageResId = 2131820920, sequence = 2, trim = true)
    @Length(messageResId = 2131820923, min = 10, sequence = 3)
    public EditText etNorek;
    @BindView(2131297353)
    ImageView ivDataTransaksi;
    @BindView(2131297559)
    LinearLayout llCabang;
    @BindView(2131297608)
    LinearLayout llDataTransaksiDisabled;
    @BindView(2131297609)
    LinearLayout llDataTransaksiEditable;
    @BindView(2131297633)
    LinearLayout llEmailDisabled;
    @BindView(2131297673)
    LinearLayout llHeaderDataTransaksi;
    @BindView(2131297479)
    LinearLayout llLayoutDataTransaksi;
    @BindView(2131297904)
    LinearLayout llSyaratKetentuan;
    @BindView(2131297956)
    LinearLayout llWrapperDataTransaksi;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindViews({2131298653, 2131298527})
    List<LogoutDialog_ViewBinding> tilFormsTransaksi;
    @BindView(2131298554)
    LogoutDialog_ViewBinding tilJumlah;
    @BindView(2131298653)
    LogoutDialog_ViewBinding tilNoRek;
    @BindView(2131298872)
    TextView tvCabang;
    @BindView(2131298950)
    TextView tvEmail;
    @BindViews({2131299126, 2131299006})
    List<TextView> tvErrorsTransaksi;
    @BindView(2131299335)
    TextView tvJumlah;
    @BindView(2131299468)
    TextView tvNorek;
    @BindView(2131299604)
    TextView tvTermCondition;
    @BindView(2131299722)
    TextView tvUbahTransaksi;
    @BindString(2131821427)
    String txtTermCondition;
    @BindViews({2131297107, 2131296976})
    public List<View> viewGroupTransaksi;

    private void d(int i) {
        this.tvErrorsTransaksi.get(i).setVisibility(8);
        this.tilFormsTransaksi.get(i).setBackgroundResource(2131230847);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etNorek.getEditableText()) {
            if (this.tvErrorsTransaksi.get(0).getVisibility() != 0) {
                return;
            }
            if (this.tvErrorsTransaksi.get(0).getText().toString().equals(getString(2131820920))) {
                if (!this.etNorek.getText().toString().isEmpty()) {
                    d(this.viewGroupTransaksi.indexOf(this.etNorek));
                }
            } else if (this.tvErrorsTransaksi.get(0).getText().toString().equals(getString(2131820923)) && this.etNorek.getText().toString().length() >= 10) {
                d(this.viewGroupTransaksi.indexOf(this.etNorek));
            }
        } else if (editable != this.etEmail.getEditableText() || this.tvErrorsTransaksi.get(1).getVisibility() != 0) {
        } else {
            if (this.tvErrorsTransaksi.get(1).getText().toString().equals(getString(2131820778))) {
                if (!this.etEmail.getText().toString().isEmpty()) {
                    d(this.viewGroupTransaksi.indexOf(this.etEmail));
                }
            } else if (this.tvErrorsTransaksi.get(1).getText().toString().equals(getString(2131820780)) && this.etEmail.getText().toString().matches("^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$")) {
                d(this.viewGroupTransaksi.indexOf(this.etEmail));
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493278;
    }

    @OnCheckedChanged({2131296469})
    public void checkboxAgree(CompoundButton compoundButton, boolean z) {
        this.cbxAgree.setBackgroundDrawable(copyWindowDataInto.b(getContext(), 2131231322));
        this.tvTermCondition.setTextColor(copyWindowDataInto.a(getContext(), 2131099737));
    }

    @OnFocusChange({2131297107, 2131296976})
    public void inputChangeTransaksi(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131296976) {
                this.tilFormsTransaksi.get(1).setHintEnabled(true);
            } else if (id == 2131297107) {
                this.tilFormsTransaksi.get(0).setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131296976) {
                if (id2 == 2131297107 && this.etNorek.getText().toString().isEmpty()) {
                    this.tilFormsTransaksi.get(0).setHintEnabled(false);
                }
            } else if (this.etEmail.getText().toString().isEmpty()) {
                this.tilFormsTransaksi.get(1).setHintEnabled(false);
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        getActivity().finish();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseRekening(ReservasiROSuccessActivity reservasiROSuccessActivity) {
        if (!reservasiROSuccessActivity.d.isEmpty()) {
            d(this.viewGroupTransaksi.indexOf(this.etNorek));
            this.etNorek.setText(reservasiROSuccessActivity.d.split("-")[0].trim());
            this.tilNoRek.setHintEnabled(true);
            return;
        }
        this.tilNoRek.setHintEnabled(false);
    }

    @OnClick({2131297387})
    public void onClickInfo(View view) {
        startActivity(new Intent(getContext(), InfoBiayaActivity.class));
    }

    @OnClick({2131296440})
    public void onClickLanjut(View view) {
        for (TextView textView : this.tvErrorsTransaksi) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilFormsTransaksi) {
            logoutDialog_ViewBinding.setBackgroundResource(2131231360);
        }
        this.d.validate();
    }

    @OnClick({2131299722})
    public void onClickUbahDataTransaksi(View view) {
        this.tvUbahTransaksi.setVisibility(8);
        this.llDataTransaksiDisabled.setVisibility(8);
        this.llDataTransaksiEditable.setVisibility(0);
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilFormsTransaksi) {
            logoutDialog_ViewBinding.setHintTextAppearance(2131886846);
            logoutDialog_ViewBinding.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099731)));
        }
        setBranchAddress setbranchaddress = new Runnable() { // from class: o.setBranchAddress
            @Override // java.lang.Runnable
            public final void run() {
                TReviewTarikanReservasiUbahFragment tReviewTarikanReservasiUbahFragment = TReviewTarikanReservasiUbahFragment.this;
                EditText editText = null;
                for (int size = tReviewTarikanReservasiUbahFragment.viewGroupTransaksi.size() - 1; size >= 0; size--) {
                    tReviewTarikanReservasiUbahFragment.viewGroupTransaksi.get(size).setEnabled(true);
                    editText = editText;
                    if (tReviewTarikanReservasiUbahFragment.viewGroupTransaksi.get(size).getVisibility() == 0) {
                        editText = editText;
                        if (tReviewTarikanReservasiUbahFragment.viewGroupTransaksi.get(size).isFocusable()) {
                            editText = (EditText) tReviewTarikanReservasiUbahFragment.viewGroupTransaksi.get(size);
                        }
                    }
                }
                if (editText != null) {
                    editText.requestFocus();
                }
            }
        };
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataTransaksi.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataTransaksi.getVisibility() == 8) {
            this.a.c(this.llLayoutDataTransaksi);
            setMessage setmessage = this.a;
            ImageView imageView = this.ivDataTransaksi;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            new Handler().postDelayed(setbranchaddress, 300);
        } else {
            setbranchaddress.run();
        }
        if (this.e != null && this.e.getVerified().equals("Y")) {
            this.etNorek.setFocusable(false);
            this.etNorek.setHint(getString(2131821204));
            this.etNorek.setFilters(new InputFilter[0]);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        documentProvider.b().e(this);
        onDestroy();
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
            if (this.viewGroupTransaksi.contains(view) && this.llLayoutDataTransaksi.getVisibility() == 8) {
                this.a.c(this.llLayoutDataTransaksi);
                setMessage setmessage = this.a;
                ImageView imageView = this.ivDataTransaksi;
                setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
            }
            if (view instanceof EditText) {
                EditText editText2 = editText;
                if (editText == null) {
                    editText2 = (EditText) view;
                }
                int id = view.getId();
                if (id == 2131296976) {
                    this.tvErrorsTransaksi.get(1).setVisibility(0);
                    this.tvErrorsTransaksi.get(1).setText(message);
                    this.tilFormsTransaksi.get(1).setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297107) {
                    editText = editText2;
                } else {
                    this.tvErrorsTransaksi.get(0).setVisibility(0);
                    this.tvErrorsTransaksi.get(0).setText(message);
                    this.tilFormsTransaksi.get(0).setBackgroundResource(2131230870);
                    editText = editText2;
                }
            } else if (view instanceof CheckBox) {
                this.cbxAgree.setBackgroundDrawable(copyWindowDataInto.b(getContext(), 2131231323));
                this.tvTermCondition.setTextColor(copyWindowDataInto.a(getContext(), 2131099826));
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
        this.c.executeTransaction(new Realm.Transaction() { // from class: o.CISNResponse
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                TReviewTarikanReservasiUbahFragment tReviewTarikanReservasiUbahFragment = TReviewTarikanReservasiUbahFragment.this;
                ((TarikanReservasiUbahTransaksiActivity) tReviewTarikanReservasiUbahFragment.getActivity()).f.setNoRekening(tReviewTarikanReservasiUbahFragment.etNorek.getText().toString());
            }
        });
        ((TarikanReservasiUbahTransaksiActivity) getActivity()).s();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        Validator validator = new Validator(this);
        this.d = validator;
        validator.setValidationListener(this);
        this.d.validateInvisibleViews(true);
        this.etEmail.setText(((TarikanReservasiUbahTransaksiActivity) getActivity()).f.getEmail());
        EditText editText = this.etJumlah;
        StringBuilder sb = new StringBuilder();
        sb.append(getPromotion.i(String.valueOf(((TarikanReservasiUbahTransaksiActivity) getActivity()).f.getJumlah())));
        sb.append(" IDR");
        editText.setText(sb.toString());
        this.etNorek.setText(((TarikanReservasiUbahTransaksiActivity) getActivity()).f.getNoRekening());
        this.tvEmail.setText(this.etEmail.getText().toString());
        this.tvJumlah.setText(this.etJumlah.getText().toString());
        this.tvNorek.setText(this.etNorek.getText().toString());
        if (this.e != null) {
            this.tilEmail.setVisibility(8);
            this.llEmailDisabled.setVisibility(8);
            this.d.removeRules(this.etEmail);
        }
        int i = 0;
        if (this.e == null) {
            this.llSyaratKetentuan.setVisibility(0);
            this.tvTermCondition.setText(Html.fromHtml(this.txtTermCondition));
        } else {
            this.d.removeRules(this.cbxAgree);
        }
        Iterator<View> it = this.viewGroupTransaksi.iterator();
        while (it.hasNext()) {
            if (!((EditText) it.next()).getText().toString().isEmpty()) {
                this.tilFormsTransaksi.get(i).setHintEnabled(true);
            }
            i++;
        }
        this.etNorek.addTextChangedListener(this);
        this.etEmail.addTextChangedListener(this);
    }

    @OnClick({2131297107})
    public void pilihNoRek() {
        if (this.e != null && this.e.getVerified().equals("Y")) {
            PilihRekeningDialog pilihRekeningDialog = new PilihRekeningDialog();
            pilihRekeningDialog.e = ((TarikanReservasiUbahTransaksiActivity) getActivity()).n;
            pilihRekeningDialog.c = this.etNorek.getText().toString();
            pilihRekeningDialog.show(getFragmentManager(), "PilihRekeningDialog");
        }
    }

    @OnClick({2131297353, 2131298913})
    public void showDataTransaksi(View view) {
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataTransaksi.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataTransaksi.getVisibility() == 8) {
            this.a.c(this.llLayoutDataTransaksi);
            setMessage setmessage = this.a;
            ImageView imageView = this.ivDataTransaksi;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.a;
        LinearLayout linearLayout = this.llLayoutDataTransaksi;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006f: IPUT  
              (wrap: o.setMessage$1 : 0x006c: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v9 'setmessage2' o.setMessage), (r0v11 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v9 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment.showDataTransaksi(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/TReviewTarikanReservasiUbahFragment.class
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
            	... 19 more
            */
        /*
            this = this;
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderDataTransaksi
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataTransaksi
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0053
            r0 = r10
            o.setMessage r0 = r0.a
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutDataTransaksi
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.a
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataTransaksi
            r13 = r0
            r0 = r12
            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
            r2 = r1
            r3 = 0
            r4 = -1020002304(0xffffffffc3340000, float:-180.0)
            r5 = 1
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1
            r8 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.c = r1
            r0 = r12
            r1 = r13
            r0.e(r1)
            r0 = r11
            r1 = 0
            r0.startTransition(r1)
            return
        L_0x0053:
            r0 = r10
            o.setMessage r0 = r0.a
            r12 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataTransaksi
            r13 = r0
            r0 = r12
            r1 = r13
            int r1 = r1.getMeasuredHeight()
            r0.a = r1
            r0 = r12
            o.setMessage$1 r1 = new o.setMessage$1
            r2 = r1
            r3 = r12
            r4 = r13
            r2.<init>(r4)
            r0.b = r1
            r0 = r12
            r1 = r13
            r0.b(r1)
            r0 = r10
            o.setMessage r0 = r0.a
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataTransaksi
            r13 = r0
            r0 = r12
            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
            r2 = r1
            r3 = -1020002304(0xffffffffc3340000, float:-180.0)
            r4 = 0
            r5 = 1
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1
            r8 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.c = r1
            r0 = r12
            r1 = r13
            r0.e(r1)
            r0 = r11
            r1 = 0
            r0.reverseTransition(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment.showDataTransaksi(android.view.View):void");
    }
}
