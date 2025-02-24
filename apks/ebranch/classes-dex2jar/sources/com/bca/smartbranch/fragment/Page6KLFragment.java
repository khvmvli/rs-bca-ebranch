package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
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
import com.bca.smartbranch.activity.PhotoCardActivity;
import com.bca.smartbranch.dialog.CameraDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.StatusNPWPDialog;
import com.bca.smartbranch.presenter.OcrPresenter;
import com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bumptech.glide.Glide;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.GetPPUNumberResponse;
import o.InfoValueTodayORActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Page6CSFragment;
import o.PhotoCardActivity_ViewBinding;
import o.PilihKantorCabangActivity;
import o.ReRegistrationSuccessActivity_ViewBinding;
import o.ReservasiSuccessAskNextActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getCurrencyCode;
import o.getPromotion;
import o.getRelationCode;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setMessage;
import o.setPadding;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6KLFragment.class */
public class Page6KLFragment extends BaseFragment implements Validator.ValidationListener, RadioGroup.OnCheckedChangeListener, TextWatcher, OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private String a;
    private Validator d;
    @BindViews({2131297189, 2131297106})
    List<View> etFields;
    @BindView(2131296983)
    EditText etFotoNPWP;
    @Order(2)
    @BindView(2131297106)
    @NotEmpty(messageResId = 2131820940, sequence = 1, trim = true)
    @Length(messageResId = 2131820941, min = 16, sequence = 2)
    EditText etNoNPWP;
    @BindView(2131297189)
    @NotEmpty(messageResId = 2131821002, sequence = 1, trim = true)
    @Order(1)
    EditText etStatusNPWP;
    @BindString(2131820941)
    String invalidNpwpLengthMessage;
    @BindString(2131820943)
    String invalidNpwpOrangtuaEmptyMessage;
    @BindString(2131820944)
    String invalidNpwpOrangtuaLengthMessage;
    @BindView(2131297365)
    Page6CSFragment ivFotoNPWP;
    private OcrPresenter j;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297866)
    LinearLayout llPunyaNPWP;
    @BindView(2131298172)
    RadioButton rbNPWP_N;
    @BindView(2131298173)
    RadioButton rbNPWP_Y;
    @BindView(2131298229)
    RadioGroup rgNPWP;
    @BindViews({2131298721, 2131298652})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298532)
    LogoutDialog_ViewBinding tilFotoNpwp;
    @BindView(2131298652)
    LogoutDialog_ViewBinding tilNoNpwp;
    @BindView(2131298721)
    LogoutDialog_ViewBinding tilStatusNpwp;
    @BindViews({2131299189, 2131299125})
    List<TextView> tvErrors;
    @BindView(2131298832)
    TextView tvPunyaNPWP;

    private void a(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (" ".equals(editable)) {
            editable.clear();
        }
        if (editable == this.etNoNPWP.getEditableText()) {
            EditText editText = this.etNoNPWP;
            if (this.tvErrors.get(this.etFields.indexOf(editText)).getVisibility() == 0 && !editText.getText().toString().isEmpty()) {
                a(this.etFields.indexOf(editText));
            }
            ((FormActivity) getActivity()).n.setNpwp(editable.toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(String str) {
        h();
        this.etNoNPWP.setText(str);
        if (!this.etNoNPWP.getText().toString().isEmpty()) {
            this.tilNoNpwp.setHintEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493136;
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.Page6KLFragment.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((FormActivity) Page6KLFragment.this.getActivity()).n.setFlagNPWP("");
                ((FormActivity) Page6KLFragment.this.getActivity()).n.setNpwp("");
                ((FormActivity) Page6KLFragment.this.getActivity()).n.setFotoNpwp("");
            }
        });
        e(2131296811, new Page6JLFragment(), "Page6JLFragment");
    }

    @Override // com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void h(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
    }

    @OnFocusChange({2131297106})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297106) {
                this.tilNoNpwp.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297106 && this.etNoNPWP.getText().toString().isEmpty()) {
            this.tilNoNpwp.setHintEnabled(false);
        }
    }

    @OnClick({2131296983, 2131297365})
    public void ivfotoNPWP(View view) {
        if (((FormActivity) getActivity()).n.getFotoNpwp().isEmpty()) {
            Intent intent = new Intent(getActivity(), PhotoCardActivity.class);
            intent.putExtra("TAKE_FOTO", 3);
            startActivity(intent);
            return;
        }
        new CameraDialog().show(getFragmentManager(), "CameraDialog");
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

    @OnClick({2131297189})
    public void onCLickStatusNpwp(View view) {
        StatusNPWPDialog statusNPWPDialog = new StatusNPWPDialog();
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etStatusNPWP.getText().toString());
        statusNPWPDialog.setArguments(bundle);
        statusNPWPDialog.show(getFragmentManager(), "StatusNPWPDialog");
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        setMessage setmessage = new setMessage();
        switch (i) {
            case 2131298172:
                LinearLayout linearLayout = this.llPunyaNPWP;
                setmessage.a = linearLayout.getMeasuredHeight();
                setmessage.b = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006b: IPUT  
                      (wrap: o.setMessage$1 : 0x0068: CONSTRUCTOR  (r1v3 o.setMessage$1 A[REMOVE]) = (r0v0 'setmessage' o.setMessage), (r0v3 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                      (r0v0 'setmessage' o.setMessage)
                     o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6KLFragment.onCheckedChanged(android.widget.RadioGroup, int):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6KLFragment.class
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
                    o.setMessage r0 = new o.setMessage
                    r1 = r0
                    r1.<init>()
                    r9 = r0
                    r0 = r8
                    switch(r0) {
                        case 2131298172: goto L_0x0054;
                        case 2131298173: goto L_0x0021;
                        default: goto L_0x0020;
                    }
                L_0x0020:
                    return
                L_0x0021:
                    r0 = r6
                    android.widget.EditText r0 = r0.etNoNPWP
                    java.lang.String r1 = ""
                    r0.setText(r1)
                    r0 = r6
                    android.widget.EditText r0 = r0.etStatusNPWP
                    java.lang.String r1 = ""
                    r0.setText(r1)
                    r0 = r6
                    android.widget.EditText r0 = r0.etFotoNPWP
                    r1 = 0
                    r2 = 0
                    r3 = 2131230927(0x7f0800cf, float:1.807792E38)
                    r4 = 0
                    r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
                    r0 = r6
                    o.Page6CSFragment r0 = r0.ivFotoNPWP
                    r1 = 8
                    r0.setVisibility(r1)
                    r0 = r9
                    r1 = r6
                    android.widget.LinearLayout r1 = r1.llPunyaNPWP
                    r0.c(r1)
                    return
                L_0x0054:
                    r0 = r6
                    android.widget.LinearLayout r0 = r0.llPunyaNPWP
                    r7 = r0
                    r0 = r9
                    r1 = r7
                    int r1 = r1.getMeasuredHeight()
                    r0.a = r1
                    r0 = r9
                    o.setMessage$1 r1 = new o.setMessage$1
                    r2 = r1
                    r3 = r9
                    r4 = r7
                    r2.<init>(r4)
                    r0.b = r1
                    r0 = r9
                    r1 = r7
                    r0.b(r1)
                    r0 = r6
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.FormActivity r0 = (com.bca.smartbranch.activity.FormActivity) r0
                    com.bca.smartbranch.data.localdb.Account r0 = r0.n
                    java.lang.String r1 = "N"
                    r0.setFlagNPWP(r1)
                    r0 = r6
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.FormActivity r0 = (com.bca.smartbranch.activity.FormActivity) r0
                    com.bca.smartbranch.data.localdb.Account r0 = r0.n
                    java.lang.String r1 = ""
                    r0.setFotoNpwp(r1)
                    r0 = r6
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.FormActivity r0 = (com.bca.smartbranch.activity.FormActivity) r0
                    com.bca.smartbranch.data.localdb.Account r0 = r0.n
                    java.lang.String r1 = ""
                    r0.setNpwp(r1)
                    r0 = r6
                    o.LogoutDialog_ViewBinding r0 = r0.tilStatusNpwp
                    r1 = 0
                    r0.setHintEnabled(r1)
                    r0 = r6
                    o.LogoutDialog_ViewBinding r0 = r0.tilNoNpwp
                    r1 = 0
                    r0.setHintEnabled(r1)
                    r0 = r6
                    o.getView r0 = r0.getActivity()
                    o.getPromotion.d(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6KLFragment.onCheckedChanged(android.widget.RadioGroup, int):void");
            }

            @Stetho$Initializer$RealSocketHandlerFactory(e = ThreadMode.MAIN)
            public void onChooseCameraEvent(PilihKantorCabangActivity pilihKantorCabangActivity) {
                if (pilihKantorCabangActivity.c) {
                    Intent intent = new Intent(getActivity(), PhotoCardActivity.class);
                    intent.putExtra("TAKE_FOTO", 3);
                    startActivity(intent);
                    return;
                }
                ((FormActivity) getActivity()).n.setFotoNpwp("");
                this.etFotoNPWP.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131230927, 0);
                this.ivFotoNPWP.setVisibility(8);
                this.etFotoNPWP.setText((CharSequence) null);
                this.tilFotoNpwp.setHintEnabled(false);
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValueFotoNPWP(ReRegistrationSuccessActivity_ViewBinding reRegistrationSuccessActivity_ViewBinding) {
                this.etFotoNPWP.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                this.ivFotoNPWP.setVisibility(0);
                this.tilFotoNpwp.setHintEnabled(true);
                this.etFotoNPWP.setText("  ");
                Glide.d(getContext()).e(reRegistrationSuccessActivity_ViewBinding.e).c(new GetPPUNumberResponse().a(getCurrencyCode.d, new getRelationCode())).c((ImageView) this.ivFotoNPWP);
                this.a = getPromotion.b(reRegistrationSuccessActivity_ViewBinding.e);
                ((FormActivity) getActivity()).n.setFotoNpwp(this.a);
                this.j.d(new InfoValueTodayORActivity_ViewBinding("NPWP", this.a));
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValueStatusNPWP(ReservasiSuccessAskNextActivity_ViewBinding reservasiSuccessAskNextActivity_ViewBinding) {
                a(this.etFields.indexOf(this.etStatusNPWP));
                this.tilStatusNpwp.setHintEnabled(true);
                this.etStatusNPWP.setText(reservasiSuccessAskNextActivity_ViewBinding.d);
                if (reservasiSuccessAskNextActivity_ViewBinding.d.equals("Individu")) {
                    ((FormActivity) getActivity()).n.setFlagNPWP("I");
                } else {
                    ((FormActivity) getActivity()).n.setFlagNPWP("S");
                }
            }

            @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
            public void onDestroyView() {
                onDestroyView();
                this.c.close();
                documentProvider.b().e(this);
                OcrPresenter ocrPresenter = this.j;
                Call<OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding>> call = ocrPresenter.a;
                if (call != null) {
                    call.cancel();
                }
                ocrPresenter.c = null;
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
                        if (id == 2131297106) {
                            this.tvErrors.get(1).setVisibility(0);
                            if (!((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar")) {
                                this.tvErrors.get(1).setText(message);
                            } else if (message.equalsIgnoreCase(this.invalidNpwpLengthMessage)) {
                                this.tvErrors.get(1).setText(this.invalidNpwpOrangtuaLengthMessage);
                            } else {
                                this.tvErrors.get(1).setText(this.invalidNpwpOrangtuaEmptyMessage);
                            }
                            this.tilNoNpwp.setBackgroundResource(2131230870);
                            editText = editText2;
                        } else if (id != 2131297189) {
                            editText = editText2;
                        } else {
                            this.tvErrors.get(0).setVisibility(0);
                            this.tvErrors.get(0).setText(message);
                            this.tilStatusNpwp.setBackgroundResource(2131230870);
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
                c(2131296811, new Page6KL2Fragment(), "Page6KL2Fragment");
            }

            @Override // androidx.fragment.app.Fragment
            public void onViewCreated(View view, Bundle bundle) {
                Bitmap bitmap;
                onViewCreated(view, bundle);
                setHasOptionsMenu(true);
                documentProvider.b().c(this);
                this.c = Realm.getDefaultInstance();
                OcrPresenter ocrPresenter = new OcrPresenter();
                this.j = ocrPresenter;
                ocrPresenter.c = this;
                ((setPadding) getActivity()).i();
                ((setPadding) getActivity()).i().d(true);
                ((setPadding) getActivity()).i().d("");
                Validator validator = new Validator(this);
                this.d = validator;
                validator.setValidationListener(this);
                ((FormActivity) getActivity()).n.setCurrentPage("Page6KLFragment");
                if ("I".equals(((FormActivity) getActivity()).n.getFlagNPWP())) {
                    this.etStatusNPWP.setText("Individu");
                } else if ("S".equals(((FormActivity) getActivity()).n.getFlagNPWP())) {
                    this.etStatusNPWP.setText("Suami/Istri");
                }
                if (!this.etStatusNPWP.getText().toString().isEmpty()) {
                    this.tilStatusNpwp.setHintEnabled(true);
                }
                if (((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar")) {
                    this.tvPunyaNPWP.setText(2131821329);
                    this.etNoNPWP.setHint(2131821186);
                    ((FormActivity) getActivity()).n.setFlagNPWP("N");
                    this.tilStatusNpwp.setVisibility(8);
                    if (((FormActivity) getActivity()).n.getNpwp().isEmpty()) {
                        this.rbNPWP_N.setChecked(true);
                        this.llPunyaNPWP.setVisibility(8);
                    }
                } else if (((FormActivity) getActivity()).n.getFlagNPWP().equals("N")) {
                    this.rbNPWP_N.setChecked(true);
                    this.llPunyaNPWP.setVisibility(8);
                }
                if (!((FormActivity) getActivity()).n.getNpwp().isEmpty()) {
                    this.tilNoNpwp.setHintEnabled(true);
                }
                this.etNoNPWP.setText(((FormActivity) getActivity()).n.getNpwp());
                if (!((FormActivity) getActivity()).n.getFotoNpwp().isEmpty()) {
                    String fotoNpwp = ((FormActivity) getActivity()).n.getFotoNpwp();
                    if (!"".equalsIgnoreCase(fotoNpwp)) {
                        byte[] decode = Base64.decode(fotoNpwp.getBytes(), 2);
                        bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    } else {
                        bitmap = null;
                    }
                    this.ivFotoNPWP.setVisibility(0);
                    this.ivFotoNPWP.setImageBitmap(bitmap);
                    this.etFotoNPWP.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.tilFotoNpwp.setHintEnabled(true);
                }
                this.rgNPWP.setOnCheckedChangeListener(this);
                this.etNoNPWP.addTextChangedListener(this);
            }
        }
