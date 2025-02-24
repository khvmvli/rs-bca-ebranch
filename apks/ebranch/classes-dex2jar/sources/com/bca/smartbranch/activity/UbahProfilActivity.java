package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.CameraDialog;
import com.bca.smartbranch.dialog.JenisIdDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SuccessUpdateProfileDialog;
import com.bca.smartbranch.presenter.UpdateProfilePresenter;
import com.bca.smartbranch.presenter.UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.bumptech.glide.Glide;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.io.File;
import java.util.List;
import o.ConfirmSubBCACardAdapter$ViewHolder;
import o.DetailFailedEChannelActivity_ViewBinding;
import o.GetPPUNumberResponse;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogRedirector;
import o.LogoutDialog_ViewBinding;
import o.OR6ReviewUbahFragment_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Page6CSFragment;
import o.PilihKantorCabangActivity;
import o.ReRegistrationSuccessActivity;
import o.RegistrationActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.VersiActivity_ViewBinding;
import o.chooseReservasiTeller;
import o.documentProvider;
import o.getCardSlogan;
import o.getCurrencyCode;
import o.getPromotion;
import o.getRelationCode;
import o.indexOf;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.w;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/UbahProfilActivity.class */
public class UbahProfilActivity extends BaseActivityPostLogin implements UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver, Validator.ValidationListener, TextWatcher {
    @BindString(2131822071)
    String dialogSuccessMessage;
    @BindView(2131296976)
    EditText etEmail;
    @BindViews({2131297075, 2131297131, 2131297101, 2131297094})
    List<View> etFields;
    @BindView(2131296984)
    EditText etFotoProfil;
    @BindView(2131296993)
    EditText etJenisId;
    @BindView(2131297075)
    @NotEmpty(messageResId = 2131820798, sequence = 1, trim = true)
    @Order(1)
    EditText etNamaProfil;
    @BindView(2131297094)
    @Order(4)
    getCardSlogan etNoHp;
    @BindView(2131297101)
    @Order(3)
    EditText etNoId;
    @Order(2)
    @BindView(2131297131)
    @NotEmpty(messageResId = 2131820947, sequence = 1, trim = true)
    @Length(messageResId = 2131820948, min = 10, sequence = 2)
    EditText etNorek;
    private AsyncTask<Void, Void, File> f;
    @BindView(2131297366)
    Page6CSFragment ivFotoProfil;
    @BindString(2131821815)
    String ktp;
    @BindView(2131297766)
    LinearLayout llMain;
    private boolean n;
    @BindString(2131821553)
    String nomorKtp;
    @BindString(2131821556)
    String nomorPaspor;
    @BindString(2131821986)
    String paspor;
    private Validator q;
    @BindString(2131822074)
    String rekening;
    @BindString(2131822092)
    String retry;
    private String s;
    @BindView(2131298420)
    ScrollView svMain;
    private UpdateProfilePresenter t;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindViews({2131298621, 2131298676, 2131298647, 2131298640})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298533)
    LogoutDialog_ViewBinding tilFotoProfil;
    @BindView(2131298542)
    LogoutDialog_ViewBinding tilJenisId;
    @BindView(2131298621)
    LogoutDialog_ViewBinding tilNamaProfil;
    @BindView(2131298640)
    LogoutDialog_ViewBinding tilNoHp;
    @BindView(2131298647)
    LogoutDialog_ViewBinding tilNoId;
    @BindView(2131298676)
    LogoutDialog_ViewBinding tilNorek;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindViews({2131299097, 2131299146, 2131299121, 2131299115})
    List<TextView> tvErrors;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    public static void d(LogRedirector.Logger logger) {
        logger.a();
    }

    private void u() {
        Intent intent = new Intent(this, FotoActivity.class);
        intent.putExtra("TAKE_FOTO", 2);
        intent.putExtra("title", "profil");
        startActivity(intent);
    }

    public void y() {
        this.etEmail.getText();
        String obj = this.etNamaProfil.getText().toString();
        this.m.getSessionId();
        String obj2 = this.etNoHp.getText().toString();
        String str = this.etNorek.getText().toString();
        String idType = this.m.getIdType();
        String str2 = this.m.getIdNum();
        str = null;
        String str3 = idType;
        if (this.etJenisId.getText() != null) {
            str3 = idType;
            if (!this.etJenisId.getText().toString().isEmpty()) {
                if (this.etJenisId.getText().toString().equalsIgnoreCase(this.ktp)) {
                    String upperCase = "KTP".toUpperCase();
                    str3 = upperCase;
                    if (this.etNoId.getText() != null) {
                        str3 = upperCase;
                        if (!this.etNoId.getText().toString().isEmpty()) {
                            str2 = this.etNoId.getText().toString();
                            str3 = upperCase;
                        }
                    }
                } else if (this.etJenisId.getText().toString().equalsIgnoreCase(this.paspor)) {
                    String upperCase2 = "Paspor".toUpperCase();
                    str3 = upperCase2;
                    if (this.etNoId.getText() != null) {
                        str3 = upperCase2;
                        if (!this.etNoId.getText().toString().isEmpty()) {
                            str2 = this.etNoId.getText().toString();
                            str3 = upperCase2;
                        }
                    }
                } else {
                    str3 = idType;
                    if (this.etJenisId.getText().toString().equalsIgnoreCase(this.rekening)) {
                        str3 = "Rekening".toUpperCase();
                        str3 = str3;
                        if (this.etNorek.getText() != null) {
                            str3 = str3;
                            if (!this.etNorek.getText().toString().isEmpty()) {
                                str = this.etNorek.getText().toString();
                                str2 = null;
                            }
                        }
                    }
                }
                this.t.d(getPromotion.e(this.m), new chooseReservasiTeller(null, null, obj, obj2, str, null, str3, str2));
            }
        }
        this.t.d(getPromotion.e(this.m), new chooseReservasiTeller(null, null, obj, obj2, str, null, str3, str2));
    }

    @Override // com.bca.smartbranch.presenter.UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void a(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etNamaProfil.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etNamaProfil);
        } else if (editable == this.etNoId.getEditableText()) {
            getPromotion.d(this, this.tvErrors, this.tilForms, this.etFields, this.etNoId);
        } else if (editable != this.etNorek.getEditableText() || this.tvErrors.get(this.etFields.indexOf(this.etNorek)).getVisibility() != 0) {
        } else {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNorek)).getText().toString().equals(getString(2131820948))) {
                if (this.etNorek.getText().toString().length() == 10) {
                    List<TextView> list = this.tvErrors;
                    List<LogoutDialog_ViewBinding> list2 = this.tilForms;
                    int indexOf = this.etFields.indexOf(this.etNorek);
                    list.get(indexOf).setVisibility(8);
                    list2.get(indexOf).setBackgroundResource(2131230847);
                }
            } else if (!this.etNorek.getText().toString().isEmpty()) {
                List<TextView> list3 = this.tvErrors;
                List<LogoutDialog_ViewBinding> list4 = this.tilForms;
                int indexOf2 = this.etFields.indexOf(this.etNorek);
                list3.get(indexOf2).setVisibility(8);
                list4.get(indexOf2).setBackgroundResource(2131230847);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        Bitmap bitmap;
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Ubah Profil");
        this.n = getIntent().getExtras().getBoolean("fill_nohp");
        Validator validator = new Validator(this);
        this.q = validator;
        validator.setValidationListener(this);
        UpdateProfilePresenter updateProfilePresenter = new UpdateProfilePresenter();
        this.t = updateProfilePresenter;
        updateProfilePresenter.e = this;
        this.etNoHp.setWatcher();
        this.etNoHp.setMaxLength(13);
        ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
        confirmSubBCACardAdapter$ViewHolder.c = 2131820902;
        confirmSubBCACardAdapter$ViewHolder.e = 2131820905;
        confirmSubBCACardAdapter$ViewHolder.d = 2131820903;
        confirmSubBCACardAdapter$ViewHolder.a = 2131820904;
        Validator validator2 = this.q;
        getCardSlogan getcardslogan = this.etNoHp;
        validator2.put(getcardslogan, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b4: INVOKE  
              (r0v27 'validator2' com.mobsandgeeks.saripaar.Validator)
              (r0v29 'getcardslogan' o.getCardSlogan)
              (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v3 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
              (wrap: o.getPromotion$2 : 0x00b0: CONSTRUCTOR  
              (r0v29 'getcardslogan' o.getCardSlogan)
              (r0v21 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
             call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
             elemType: com.mobsandgeeks.saripaar.QuickRule)
             type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.activity.UbahProfilActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/UbahProfilActivity.class
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
        // Method dump skipped, instructions count: 900
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.UbahProfilActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.UbahProfilActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UbahProfilActivity.this.y();
            }
        }).g();
    }

    @OnFocusChange({2131296984, 2131297075, 2131297094, 2131297131, 2131296993, 2131297101})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296984:
                    this.tilFotoProfil.setHintEnabled(true);
                    return;
                case 2131296993:
                    this.tilJenisId.setHintEnabled(true);
                    return;
                case 2131297075:
                    this.tilNamaProfil.setHintEnabled(true);
                    return;
                case 2131297094:
                    getCardSlogan getcardslogan = (getCardSlogan) view;
                    if (getcardslogan.getText().toString().isEmpty()) {
                        getCardSlogan getcardslogan2 = this.etNoHp;
                        getcardslogan2.setText(getcardslogan2.e);
                        this.etNoHp.setSelection(getcardslogan.getText().length());
                    }
                    this.tilNoHp.setHintEnabled(true);
                    return;
                case 2131297101:
                    this.tilNoId.setHintEnabled(true);
                    return;
                case 2131297131:
                    this.tilNorek.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296984:
                    if (this.etFotoProfil.getText().toString().isEmpty()) {
                        this.tilFotoProfil.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296993:
                    if (this.etJenisId.getText().toString().isEmpty()) {
                        this.tilJenisId.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297075:
                    if (this.etNamaProfil.getText().toString().isEmpty()) {
                        this.tilNamaProfil.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297094:
                    if (this.etNoHp.getText().toString().isEmpty()) {
                        this.tilNoHp.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297101:
                    if (this.etNoId.getText().toString().isEmpty()) {
                        this.tilNoId.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297131:
                    if (this.etNorek.getText().toString().isEmpty()) {
                        this.tilNorek.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @OnClick({2131297366})
    public void ivfotoProfil(View view) {
        if (this.s.isEmpty()) {
            u();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("foto_diri", true);
        CameraDialog cameraDialog = new CameraDialog();
        cameraDialog.setArguments(bundle);
        cameraDialog.show(l(), "CameraDialog");
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
        indexOf.c(i, i2, intent, this, new w() { // from class: com.bca.smartbranch.activity.UbahProfilActivity.2
            public final void b(final File file) {
                if (UbahProfilActivity.this.f != null && UbahProfilActivity.this.f.getStatus() == AsyncTask.Status.RUNNING) {
                    UbahProfilActivity.this.f.cancel(true);
                }
                UbahProfilActivity.this.f = new AsyncTask<Void, Void, File>() { // from class: com.bca.smartbranch.activity.UbahProfilActivity.2.2
                    @Override // android.os.AsyncTask
                    protected final /* synthetic */ File doInBackground(Void[] voidArr) {
                        OR6ReviewUbahFragment_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new OR6ReviewUbahFragment_ViewBinding.RemoteActionCompatParcelizer(UbahProfilActivity.this);
                        remoteActionCompatParcelizer.d.b = (float) UbahProfilActivity.this.getWindowManager().getDefaultDisplay().getWidth();
                        return remoteActionCompatParcelizer.d.d(file);
                    }

                    @Override // android.os.AsyncTask
                    protected final /* synthetic */ void onPostExecute(File file2) {
                        File file3 = file2;
                        onPostExecute(file3);
                        Uri fromFile = Uri.fromFile(file3);
                        Intent intent2 = new Intent(UbahProfilActivity.this, FotoActivity.class);
                        intent2.putExtra("TAKE_FOTO", 2);
                        intent2.putExtra("IMAGE_URI", fromFile.toString());
                        UbahProfilActivity.this.startActivity(intent2);
                    }
                };
                UbahProfilActivity.this.f.execute(new Void[0]);
            }

            public final void c(Exception exc) {
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory(e = ThreadMode.MAIN)
    public void onChooseCameraEvent(PilihKantorCabangActivity pilihKantorCabangActivity) {
        if (pilihKantorCabangActivity.c) {
            u();
        } else if (!pilihKantorCabangActivity.a) {
            this.ivFotoProfil.setImageResource(2131231178);
            this.s = "";
        } else if (Build.VERSION.SDK_INT >= 33) {
            startActivityForResult(indexOf.b(this, 0), 7458);
        } else {
            DetailFailedEChannelActivity_ViewBinding.c(this);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseJenisId(RegistrationActivity_ViewBinding registrationActivity_ViewBinding) {
        this.etJenisId.setText(registrationActivity_ViewBinding.d);
        this.etNoId.clearFocus();
        this.tvErrors.get(1).setVisibility(8);
        this.tilForms.get(1).setBackgroundResource(2131230847);
        this.tvErrors.get(2).setVisibility(8);
        this.tilForms.get(2).setBackgroundResource(2131230847);
        this.tilNorek.setHintEnabled(false);
        this.etNorek.setText("");
        this.etNorek.setTag(registrationActivity_ViewBinding.d);
        this.tilNoId.setHintEnabled(false);
        this.etNoId.setText("");
        this.etNoId.setTag(registrationActivity_ViewBinding.d);
        if (registrationActivity_ViewBinding.d.equalsIgnoreCase(this.ktp)) {
            this.tilNoId.setVisibility(0);
            this.tilNorek.setVisibility(8);
            getPromotion.c(this.etNoId, registrationActivity_ViewBinding.d);
            Validator validator = this.q;
            EditText editText = this.etNoId;
            validator.put(editText, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00db: INVOKE  
                  (r0v62 'validator' com.mobsandgeeks.saripaar.Validator)
                  (r0v64 'editText' android.widget.EditText)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v3 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$7 : 0x00d7: CONSTRUCTOR  (r0v64 'editText' android.widget.EditText) call: o.getPromotion.7.<init>(android.widget.EditText):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.activity.UbahProfilActivity.onChooseJenisId(o.RegistrationActivity_ViewBinding):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/UbahProfilActivity.class
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
            // Method dump skipped, instructions count: 336
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.UbahProfilActivity.onChooseJenisId(o.RegistrationActivity_ViewBinding):void");
        }

        @Stetho$Initializer$RealSocketHandlerFactory(e = ThreadMode.MAIN)
        public void onChooseValueFotoDiri(ReRegistrationSuccessActivity reRegistrationSuccessActivity) {
            Bitmap bitmap = reRegistrationSuccessActivity.e;
            Glide.d(this).e(bitmap).c(new GetPPUNumberResponse().a(getCurrencyCode.d, new getRelationCode())).c((ImageView) this.ivFotoProfil);
            this.etFotoProfil.setText(" ");
            this.tilFotoProfil.setHintEnabled(true);
            this.s = getPromotion.b(bitmap);
        }

        @OnClick({2131296993})
        public void onClickJenisId(View view) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etJenisId.getText().toString());
            JenisIdDialog jenisIdDialog = new JenisIdDialog();
            jenisIdDialog.setArguments(bundle);
            jenisIdDialog.show(l(), "JenisIdDialog");
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
        public void onDestroy() {
            onDestroy();
            UpdateProfilePresenter updateProfilePresenter = this.t;
            Call<OpenAccountSuccessActivity<Object>> call = updateProfilePresenter.a;
            if (call != null) {
                call.cancel();
            }
            updateProfilePresenter.e = null;
        }

        @Override // android.app.Activity
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return onOptionsItemSelected(menuItem);
            }
            onBackPressed();
            return true;
        }

        @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            onRequestPermissionsResult(i, strArr, iArr);
            DetailFailedEChannelActivity_ViewBinding.c(this, i, iArr);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
        public void onValidationFailed(List<ValidationError> list) {
            EditText editText = null;
            for (ValidationError validationError : list) {
                View view = validationError.getView();
                String message = validationError.getFailedRules().get(0).getMessage(this);
                if (view instanceof EditText) {
                    EditText editText2 = editText;
                    if (editText == null) {
                        editText2 = (EditText) view;
                    }
                    switch (view.getId()) {
                        case 2131297075:
                            this.tvErrors.get(0).setVisibility(0);
                            this.tvErrors.get(0).setText(message);
                            this.tilNamaProfil.setBackgroundResource(2131230870);
                            editText = editText2;
                            continue;
                        case 2131297094:
                            this.tvErrors.get(3).setVisibility(0);
                            this.tvErrors.get(3).setText(message);
                            this.tilNoHp.setBackgroundResource(2131230870);
                            editText = editText2;
                            continue;
                        case 2131297101:
                            this.tvErrors.get(2).setVisibility(0);
                            this.tvErrors.get(2).setText(message);
                            this.tilNoId.setBackgroundResource(2131230870);
                            editText = editText2;
                            continue;
                        case 2131297131:
                            this.tvErrors.get(1).setVisibility(0);
                            this.tvErrors.get(1).setText(message);
                            this.tilNorek.setBackgroundResource(2131230870);
                            editText = editText2;
                            continue;
                        default:
                            editText = editText2;
                            continue;
                    }
                } else {
                    a(this.llMain, message);
                }
            }
            if (editText != null) {
                editText.requestFocus();
            }
        }

        @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
        public void onValidationSucceeded() {
            y();
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final void p() {
            setCardSlogan.e().b = "UbahProfilActivity";
            this.j = "UbahProfilActivity";
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            return 2131493016;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            return this;
        }

        @Override // com.bca.smartbranch.presenter.UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver
        public final void s() {
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.UbahProfilActivity.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    UbahProfilActivity.this.m.setUserPhoto(UbahProfilActivity.this.s);
                    UbahProfilActivity.this.m.setName(UbahProfilActivity.this.etNamaProfil.getText().toString());
                    UbahProfilActivity.this.m.setNoHandphone(UbahProfilActivity.this.etNoHp.getText().toString());
                    UbahProfilActivity.this.m.setAcctNo(UbahProfilActivity.this.etNorek.getText().toString());
                    if (!UbahProfilActivity.this.etJenisId.getText().toString().isEmpty()) {
                        UbahProfilActivity.this.m.setIdType(UbahProfilActivity.this.etJenisId.getText().toString());
                        UbahProfilActivity.this.m.setIdNum(UbahProfilActivity.this.etNoId.getText().toString());
                    }
                }
            });
            documentProvider.b().d(new VersiActivity_ViewBinding());
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", this.dialogSuccessMessage);
            bundle.putBoolean("isMessageSuccess", true);
            SuccessUpdateProfileDialog successUpdateProfileDialog = new SuccessUpdateProfileDialog();
            successUpdateProfileDialog.setArguments(bundle);
            successUpdateProfileDialog.show(l(), "MessageDialog");
        }

        @Override // com.bca.smartbranch.presenter.UpdateProfilePresenter$MediaBrowserCompat$CustomActionResultReceiver
        public final void t() {
            z();
        }

        @OnClick({2131296450})
        public void updateProfil(View view) {
            getPromotion.d(this);
            for (TextView textView : this.tvErrors) {
                textView.setVisibility(8);
            }
            for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
                logoutDialog_ViewBinding.setBackgroundResource(2131230847);
            }
            this.q.validate();
        }
    }
