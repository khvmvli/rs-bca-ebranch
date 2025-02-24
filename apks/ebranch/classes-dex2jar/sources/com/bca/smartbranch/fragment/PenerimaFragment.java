package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormTellerActivity;
import com.bca.smartbranch.activity.InfoTellerActivity;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import com.bca.smartbranch.data.global.DaftarTransfer;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.HariDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SetiapTanggalDialog;
import com.bca.smartbranch.presenter.CheckDaftarTransferPresenter;
import com.bca.smartbranch.presenter.GetFundPurposePresenter;
import com.bca.smartbranch.presenter.GetIdentityPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.Calendar;
import java.util.List;
import o.AccountOpeningResponse;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.DetailTundaEChannelActivity;
import o.LogoutDialog_ViewBinding;
import o.OR2PilihProductFragment_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.ReservasiListChosenActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getAnnualFeeBasicAmount;
import o.getPromotion;
import o.lewati;
import o.onClickUbahDataOrangDatangKeCabang;
import o.onExitTransaction;
import o.register;
import o.setMessage;
import o.setOnHierarchyChangeListener;
import o.showInfoValueTodayOR;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/PenerimaFragment.class */
public class PenerimaFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver, CompoundButton.OnCheckedChangeListener, CheckDaftarTransferPresenter.read, AdapterView.OnItemClickListener, GetIdentityPresenter.write, GetFundPurposePresenter.IconCompatParcelizer {
    public setMessage a = new setMessage();
    @BindArray(2130903059)
    String[] arrayHari;
    @BindView(2131296473)
    CheckBox cbxSimpanDaftarTransfer;
    List<DaftarTransfer> d;
    @BindViews({2131297177, 2131297179, 2131297180})
    List<EditText> editTextList;
    @BindViews({2131297054, 2131297107, 2131297182, 2131297006, 2131297203})
    public List<View> etFields;
    @BindView(2131297054)
    @NotEmpty(messageResId = 2131820869, sequence = 1, trim = true)
    @Order(1)
    AutoCompleteTextView etFullName;
    @BindView(2131297006)
    @NotEmpty(messageResId = 2131820819, sequence = 5, trim = true)
    @Order(4)
    EditText etJumlah;
    @BindView(2131296954)
    EditText etNews;
    @Order(2)
    @BindView(2131297107)
    @NotEmpty(messageResId = 2131820920, sequence = 2, trim = true)
    @Length(messageResId = 2131820948, min = 10, sequence = 3)
    AutoCompleteTextView etNumberRek;
    @BindView(2131297177)
    public EditText etSetiap;
    @BindView(2131297179)
    public EditText etSetiapHari;
    @BindView(2131297180)
    public EditText etSetiapTanggal;
    @BindView(2131297182)
    @NotEmpty(messageResId = 2131820999, sequence = 4, trim = true)
    @Order(3)
    public EditText etSimpanNama;
    @BindView(2131297203)
    public EditText etTanggalBerakhir;
    private DetailTundaEChannelActivity f;
    private CheckDaftarTransferPresenter g;
    private GetFundPurposePresenter h;
    private GetIdentityPresenter i;
    private DetailTundaEChannelActivity j;
    private Validator l;
    @BindView(2131297643)
    public LinearLayout llFieldTransaksiBerkala;
    @BindView(2131297706)
    LinearLayout llJumlah;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297888)
    LinearLayout llSimpanNama;
    @BindView(2131297889)
    public LinearLayout llSimpanNamaField;
    @BindView(2131297922)
    LinearLayout llTransaksiBerkala;
    private int m;
    @BindViews({2131298177, 2131298178, 2131298179})
    List<RadioButton> radioButtonList;
    @BindView(2131298177)
    public RadioButton rbSetiap;
    @BindView(2131298178)
    public RadioButton rbSetiapHari;
    @BindView(2131298179)
    public RadioButton rbSetiapTanggal;
    @BindView(2131298188)
    RadioButton rbTransaksiBerkalaTidak;
    @BindView(2131298189)
    RadioButton rbTransaksiBerkalaYa;
    @BindString(2131822092)
    String retry;
    @BindView(2131298231)
    RadioGroup rgTransaksiBerkala;
    @BindView(2131298504)
    LogoutDialog_ViewBinding tilBerita;
    @BindViews({2131298601, 2131298653, 2131298714, 2131297706, 2131298735})
    List<View> tilForms;
    @BindView(2131298554)
    LogoutDialog_ViewBinding tilJumlah;
    @BindView(2131298601)
    LogoutDialog_ViewBinding tilNama;
    @BindView(2131298653)
    LogoutDialog_ViewBinding tilNoRek;
    @BindView(2131298714)
    public LogoutDialog_ViewBinding tilSimpanNama;
    @BindView(2131298735)
    public LogoutDialog_ViewBinding tilTanggalBerakhir;
    @BindView(2131299203)
    TextView tvErrorTanggalBerakhir;
    @BindView(2131299227)
    TextView tvErrorTransaksiBerkala;
    @BindViews({2131299078, 2131299126, 2131299182, 2131299030, 2131299203, 2131299227})
    List<TextView> tvErrors;
    @BindView(2131299400)
    TextView tvMataUang;

    private void d() {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        if (!((FormTellerActivity) getActivity()).w) {
            h();
            if (!((FormTellerActivity) getActivity()).n.getVerified().equalsIgnoreCase("Y")) {
                ((FormTellerActivity) getActivity()).f.setSourceAccountOwnerType("Saya Sendiri");
                c(2131296811, new SumberDanaPilihIdentitasSetunFragment(), "SumberDanaPilihIdentitasSetunFragment");
            } else if (Double.parseDouble(((FormTellerActivity) getActivity()).f.getTxnAmount().replace(",", ".")) >= 1.0E8d) {
                GetFundPurposePresenter getFundPurposePresenter = this.h;
                String e = getPromotion.e(this.e);
                getFundPurposePresenter.e.g_();
                getFundPurposePresenter.b(e, "Y", false);
            } else {
                ((FormTellerActivity) getActivity()).f.setSourceAccountOwnerType("Saya Sendiri");
                ((FormTellerActivity) getActivity()).f.setSenderIdType("Rekening");
                c(2131296811, new SumberDanaDataPemilikSetunFragment(), "SumberDanaDataPemilikSetunFragment");
            }
        } else if (Double.parseDouble(((FormTellerActivity) getActivity()).f.getTxnAmount().replace(",", ".")) >= 1.0E8d) {
            boolean equalsIgnoreCase = ((FormTellerActivity) getActivity()).f.getSourceAccountOwnerType().equalsIgnoreCase("Perusahaan");
            GetFundPurposePresenter getFundPurposePresenter2 = this.h;
            String e2 = getPromotion.e(this.e);
            getFundPurposePresenter2.e.g_();
            getFundPurposePresenter2.b(e2, "Y", equalsIgnoreCase);
        } else {
            h();
            ((FormTellerActivity) getActivity()).f.setIsLongForm("N");
            c(2131296811, new ReviewSetoranFragment(), "ReviewSetoranFragment");
        }
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void A(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    public final /* synthetic */ void a() {
        Setoran setoran = (Setoran) this.c.where(Setoran.class).equalTo("id", Long.valueOf(((FormTellerActivity) getActivity()).f.getId())).findFirst();
        if (setoran != null && setoran.isValid()) {
            setoran.deleteFromRealm();
            documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read, com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void a_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String str;
        getPromotion.a(editable);
        if (editable == this.etFullName.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etFullName)).getVisibility() == 0 && !this.etFullName.getText().toString().isEmpty()) {
                d(this.etFields.indexOf(this.etFullName));
            }
            ((FormTellerActivity) getActivity()).f.setReceiverName(editable.toString());
        } else if (editable == this.etNumberRek.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etNumberRek)).getVisibility() == 0) {
                if (this.tvErrors.get(this.etFields.indexOf(this.etNumberRek)).getText().equals(getString(2131820920))) {
                    if (!this.etNumberRek.getText().toString().isEmpty()) {
                        d(this.etFields.indexOf(this.etNumberRek));
                    }
                } else if (this.tvErrors.get(this.etFields.indexOf(this.etNumberRek)).getText().equals(getString(2131820948)) && this.etNumberRek.getText().toString().length() >= 10) {
                    d(this.etFields.indexOf(this.etNumberRek));
                }
            }
            ((FormTellerActivity) getActivity()).f.setReceiverAccount(editable.toString());
        } else if (editable == this.etSimpanNama.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etSimpanNama)).getVisibility() == 0 && !this.etSimpanNama.getText().toString().isEmpty()) {
                d(this.etFields.indexOf(this.etSimpanNama));
            }
            ((FormTellerActivity) getActivity()).f.setReceiverAlias(editable.toString());
        } else if (editable == this.etJumlah.getEditableText()) {
            this.etJumlah.removeTextChangedListener(this);
            String replaceAll = this.etJumlah.getText().toString().replaceAll("[^0-9.,]", "");
            String str2 = replaceAll;
            if (replaceAll.equals("0")) {
                str2 = "";
            }
            if (this.tvErrors.get(this.etFields.indexOf(this.etJumlah)).getVisibility() == 0 && !this.etJumlah.getText().toString().isEmpty()) {
                d(this.etFields.indexOf(this.etJumlah));
            }
            int length = this.etJumlah.length();
            EditText editText = this.etJumlah;
            String replaceAll2 = str2.replaceAll(",", "");
            if (replaceAll2.isEmpty()) {
                str = "";
            } else {
                String a = getPromotion.a(replaceAll2, 17, 2);
                if (Double.parseDouble(a.replace("\\.", ",")) == 0.0d) {
                    str = "";
                } else if (!a.contains(".")) {
                    str = String.format("%,.0f", Double.valueOf(Double.parseDouble(a))).replaceAll("\\.", ",");
                } else {
                    String[] split = a.split("\\.");
                    if (split.length > 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll("\\.", ","));
                        sb.append(".");
                        sb.append(split[1]);
                        str = sb.toString();
                    } else {
                        str = split[0].isEmpty() ? "" : String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll("\\.", ",");
                    }
                }
            }
            editText.setText(str);
            int length2 = (this.m + this.etJumlah.length()) - length;
            if (length2 > 0) {
                this.etJumlah.setSelection(length2);
            } else {
                this.etJumlah.setSelection(0);
            }
            this.etJumlah.addTextChangedListener(this);
            ((FormTellerActivity) getActivity()).f.setTxnAmount(getPromotion.a(this.etJumlah.getText().toString(), Boolean.TRUE));
        } else if (editable == this.etNews.getEditableText()) {
            ((FormTellerActivity) getActivity()).f.setTxnNotes(editable.toString());
        } else if (editable == this.etSetiap.getEditableText()) {
            if (this.tvErrorTransaksiBerkala.getVisibility() == 0 && !this.etSetiap.getText().toString().isEmpty()) {
                this.tvErrorTransaksiBerkala.setVisibility(8);
            }
            if (this.etSetiap.getText().toString().equals("0")) {
                this.etSetiap.setText("");
            }
            ((FormTellerActivity) getActivity()).f.setRecurringValue(editable.toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read
    public final void b() {
        d();
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read, com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void b(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read, com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void b_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493210;
    }

    public final /* synthetic */ void c(int i) {
        this.c.executeTransaction(new Realm.Transaction(i) { // from class: o.getKey
            public final /* synthetic */ int e;

            {
                this.e = r5;
            }

            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009c: IPUT  
                  (wrap: o.setMessage$1 : 0x0099: CONSTRUCTOR  (r1v10 o.setMessage$1 A[REMOVE]) = (r0v21 'setmessage' o.setMessage), (r0v23 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v21 'setmessage' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: o.getKey.execute(io.realm.Realm):void, file: classes-dex2jar.jar:o/getKey.class
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
                    com.bca.smartbranch.fragment.PenerimaFragment r0 = com.bca.smartbranch.fragment.PenerimaFragment.this
                    r8 = r0
                    r0 = r6
                    int r0 = r0.e
                    switch(r0) {
                        case 2131298188: goto L_0x003c;
                        case 2131298189: goto L_0x0021;
                        default: goto L_0x0020;
                    }
                L_0x0020:
                    return
                L_0x0021:
                    r0 = r8
                    o.setMessage r0 = r0.a
                    r1 = r8
                    android.widget.LinearLayout r1 = r1.llFieldTransaksiBerkala
                    r0.c(r1)
                    r0 = r8
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.FormTellerActivity r0 = (com.bca.smartbranch.activity.FormTellerActivity) r0
                    com.bca.smartbranch.data.localdb.Setoran r0 = r0.f
                    java.lang.String r1 = "Y"
                    r0.setFlagTxnBerkala(r1)
                    return
                L_0x003c:
                    r0 = r8
                    android.widget.RadioButton r0 = r0.rbSetiap
                    r1 = 0
                    r0.setChecked(r1)
                    r0 = r8
                    android.widget.EditText r0 = r0.etSetiap
                    java.lang.String r1 = ""
                    r0.setText(r1)
                    r0 = r8
                    android.widget.RadioButton r0 = r0.rbSetiapHari
                    r1 = 0
                    r0.setChecked(r1)
                    r0 = r8
                    android.widget.EditText r0 = r0.etSetiapHari
                    java.lang.String r1 = ""
                    r0.setText(r1)
                    r0 = r8
                    android.widget.RadioButton r0 = r0.rbSetiapTanggal
                    r1 = 0
                    r0.setChecked(r1)
                    r0 = r8
                    android.widget.EditText r0 = r0.etSetiapTanggal
                    java.lang.String r1 = ""
                    r0.setText(r1)
                    r0 = r8
                    android.widget.EditText r0 = r0.etTanggalBerakhir
                    java.lang.String r1 = ""
                    r0.setText(r1)
                    r0 = r8
                    o.LogoutDialog_ViewBinding r0 = r0.tilTanggalBerakhir
                    r1 = 0
                    r0.setHintEnabled(r1)
                    r0 = r8
                    o.setMessage r0 = r0.a
                    r9 = r0
                    r0 = r8
                    android.widget.LinearLayout r0 = r0.llFieldTransaksiBerkala
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
                    r0 = r8
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.FormTellerActivity r0 = (com.bca.smartbranch.activity.FormTellerActivity) r0
                    com.bca.smartbranch.data.localdb.Setoran r0 = r0.f
                    java.lang.String r1 = "N"
                    r0.setFlagTxnBerkala(r1)
                    r0 = r8
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.FormTellerActivity r0 = (com.bca.smartbranch.activity.FormTellerActivity) r0
                    com.bca.smartbranch.data.localdb.Setoran r0 = r0.f
                    java.lang.String r1 = ""
                    r0.setRecurringVar(r1)
                    r0 = r8
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.FormTellerActivity r0 = (com.bca.smartbranch.activity.FormTellerActivity) r0
                    com.bca.smartbranch.data.localdb.Setoran r0 = r0.f
                    java.lang.String r1 = ""
                    r0.setRecurringValue(r1)
                    r0 = r8
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.FormTellerActivity r0 = (com.bca.smartbranch.activity.FormTellerActivity) r0
                    com.bca.smartbranch.data.localdb.Setoran r0 = r0.f
                    java.lang.String r1 = ""
                    r0.setRecurringEndDate(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getKey.execute(io.realm.Realm):void");
            }
        });
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @OnCheckedChanged({2131296473})
    public void checkSimpanNama(CompoundButton compoundButton, boolean z) {
        this.c.executeTransaction(new Realm.Transaction(z) { // from class: o.setValue
            public final /* synthetic */ boolean c;

            {
                this.c = r5;
            }

            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: IPUT  
                  (wrap: o.setMessage$1 : 0x0040: CONSTRUCTOR  (r1v2 o.setMessage$1 A[REMOVE]) = (r0v5 'setmessage' o.setMessage), (r0v7 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v5 'setmessage' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: o.setValue.execute(io.realm.Realm):void, file: classes-dex2jar.jar:o/setValue.class
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 14 more
                */
            @Override // io.realm.Realm.Transaction
            public final void execute(io.realm.Realm r7) {
                /*
                    r6 = this;
                    r0 = r6
                    com.bca.smartbranch.fragment.PenerimaFragment r0 = com.bca.smartbranch.fragment.PenerimaFragment.this
                    r8 = r0
                    r0 = r6
                    boolean r0 = r0.c
                    if (r0 == 0) goto L_0x0027
                    r0 = r8
                    o.setMessage r0 = r0.a
                    r1 = r8
                    android.widget.LinearLayout r1 = r1.llSimpanNamaField
                    r0.c(r1)
                    r0 = r8
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.FormTellerActivity r0 = (com.bca.smartbranch.activity.FormTellerActivity) r0
                    com.bca.smartbranch.data.localdb.Setoran r0 = r0.f
                    java.lang.String r1 = "Y"
                    r0.setFlagDaftarTransfer(r1)
                    return
                L_0x0027:
                    r0 = r8
                    o.setMessage r0 = r0.a
                    r9 = r0
                    r0 = r8
                    android.widget.LinearLayout r0 = r0.llSimpanNamaField
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
                    r0 = r8
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.FormTellerActivity r0 = (com.bca.smartbranch.activity.FormTellerActivity) r0
                    com.bca.smartbranch.data.localdb.Setoran r0 = r0.f
                    java.lang.String r1 = "N"
                    r0.setFlagDaftarTransfer(r1)
                    r0 = r8
                    android.widget.EditText r0 = r0.etSimpanNama
                    java.lang.String r1 = ""
                    r0.setText(r1)
                    r0 = r8
                    o.LogoutDialog_ViewBinding r0 = r0.tilSimpanNama
                    r1 = 0
                    r0.setHintEnabled(r1)
                    r0 = r8
                    r1 = r8
                    java.util.List<android.view.View> r1 = r1.etFields
                    r2 = r8
                    android.widget.EditText r2 = r2.etSimpanNama
                    int r1 = r1.indexOf(r2)
                    r0.d(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setValue.execute(io.realm.Realm):void");
            }
        });
    }

    @OnClick({2131296396})
    public void clickLanjut(View view) {
        getPromotion.d(getContext());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (View view2 : this.tilForms) {
            view2.setBackgroundResource(2131230847);
        }
        this.etJumlah.clearFocus();
        this.l.validate();
    }

    @OnClick({2131299400})
    public void clickMataUang(View view) {
    }

    @OnClick({2131299572})
    public void clickSimpanNama(View view) {
        CheckBox checkBox = this.cbxSimpanDaftarTransfer;
        checkBox.setChecked(!checkBox.isChecked());
    }

    public void d(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
        String str;
        this.tvErrorTanggalBerakhir.setVisibility(8);
        this.tilTanggalBerakhir.setBackgroundResource(2131230847);
        this.etTanggalBerakhir.setError(null);
        this.tilTanggalBerakhir.setHintEnabled(true);
        EditText editText = this.etTanggalBerakhir;
        StringBuilder sb = new StringBuilder();
        if (String.valueOf(i3).length() < 2) {
            StringBuilder sb2 = new StringBuilder("0");
            sb2.append(String.valueOf(i3));
            str = sb2.toString();
        } else {
            str = String.valueOf(i3);
        }
        sb.append(str);
        sb.append(" ");
        sb.append(getAnnualFeeBasicAmount.a(i2));
        sb.append(" ");
        sb.append(i);
        editText.setText(sb.toString());
        ((FormTellerActivity) getActivity()).f.setRecurringEndDate(getAnnualFeeBasicAmount.d(i, i2, i3));
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void e(MasterFundSourcePurposeResponse masterFundSourcePurposeResponse) {
        h();
        ((FormTellerActivity) getActivity()).q = masterFundSourcePurposeResponse.getFundSource();
        ((FormTellerActivity) getActivity()).s = masterFundSourcePurposeResponse.getTransactionPurpose();
        if (((FormTellerActivity) getActivity()).w) {
            ((FormTellerActivity) getActivity()).f.setIsLongForm("N");
            c(2131296811, new ReviewSetoranFragment(), "ReviewSetoranFragment");
            return;
        }
        ((FormTellerActivity) getActivity()).f.setSourceAccountOwnerType("Saya Sendiri");
        ((FormTellerActivity) getActivity()).f.setSenderIdType("Rekening");
        c(2131296811, new SumberDanaDataPemilikSetunFragment(), "SumberDanaDataPemilikSetunFragment");
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read
    public final void e(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read, com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void g_() {
        g();
    }

    @OnFocusChange({2131297054, 2131297107, 2131297182, 2131297006, 2131296954})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296954:
                    this.tilBerita.setHintEnabled(true);
                    return;
                case 2131297006:
                    this.tilJumlah.setHintEnabled(true);
                    this.etJumlah.setFilters(new InputFilter[]{new InputFilter.LengthFilter(17)});
                    if (!this.etJumlah.getText().toString().isEmpty()) {
                        EditText editText = this.etJumlah;
                        editText.setText(getPromotion.a(editText.getText().toString(), Boolean.FALSE));
                        return;
                    }
                    return;
                case 2131297054:
                    this.tilNama.setHintEnabled(true);
                    return;
                case 2131297107:
                    this.tilNoRek.setHintEnabled(true);
                    return;
                case 2131297182:
                    this.tilSimpanNama.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296954:
                    if (this.etNews.getText().toString().isEmpty()) {
                        this.tilBerita.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297006:
                    if (this.etJumlah.getText().toString().isEmpty()) {
                        this.tilJumlah.setHintEnabled(false);
                        return;
                    }
                    this.etJumlah.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
                    EditText editText2 = this.etJumlah;
                    editText2.setText(getPromotion.g(editText2.getText().toString().replaceAll("[^0-9.,]", "")));
                    return;
                case 2131297054:
                    if (this.etFullName.getText().toString().isEmpty()) {
                        this.tilNama.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297107:
                    if (this.etNumberRek.getText().toString().isEmpty()) {
                        this.tilNoRek.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297182:
                    if (this.etSimpanNama.getText().toString().isEmpty()) {
                        this.tilSimpanNama.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void m(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        getPromotion.d(getContext());
        if (!((FormTellerActivity) getActivity()).t) {
            this.c.executeTransaction(new AccountOpeningResponse.TxnDataOutput(this));
        }
        setOnHierarchyChangeListener.a((Activity) getActivity());
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            for (int i = 0; i < this.radioButtonList.size(); i++) {
                if (this.radioButtonList.get(i) == compoundButton) {
                    if (i == 0) {
                        ((FormTellerActivity) getActivity()).f.setRecurringVar("Hari");
                    } else if (i == 1) {
                        ((FormTellerActivity) getActivity()).f.setRecurringVar("Minggu");
                    } else if (i == 2) {
                        ((FormTellerActivity) getActivity()).f.setRecurringVar("Tanggal");
                    }
                    this.editTextList.get(i).setEnabled(true);
                    getPromotion.a(this.editTextList.get(i));
                    if (!this.editTextList.get(i).isFocused()) {
                        this.editTextList.get(i).performClick();
                    }
                } else {
                    this.radioButtonList.get(i).setChecked(false);
                    this.editTextList.get(i).setEnabled(false);
                    this.editTextList.get(i).setText("");
                }
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseMataUangEvent(ReservasiListChosenActivity reservasiListChosenActivity) {
        this.tvMataUang.setText(reservasiListChosenActivity.b);
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.PenerimaFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
            }
        });
    }

    @OnClick({2131297179})
    public void onClickedSetiapHari(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etSetiapHari.getText().toString());
        HariDialog hariDialog = new HariDialog();
        hariDialog.setArguments(bundle);
        hariDialog.show(getFragmentManager(), "HariDialog");
    }

    @OnClick({2131297180})
    public void onClickedSetiapTanggal(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etSetiapTanggal.getText().toString());
        SetiapTanggalDialog setiapTanggalDialog = new SetiapTanggalDialog();
        setiapTanggalDialog.setArguments(bundle);
        setiapTanggalDialog.show(getFragmentManager(), "SetiapTanggalDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        documentProvider.b().e(this);
        CheckDaftarTransferPresenter checkDaftarTransferPresenter = this.g;
        Call<OpenAccountSuccessActivity<Object>> call = checkDaftarTransferPresenter.d;
        if (call != null) {
            call.cancel();
        }
        checkDaftarTransferPresenter.c = null;
        GetIdentityPresenter getIdentityPresenter = this.i;
        Call<OpenAccountSuccessActivity<Object>> call2 = getIdentityPresenter.e;
        if (call2 != null) {
            call2.cancel();
        }
        getIdentityPresenter.d = null;
        GetFundPurposePresenter getFundPurposePresenter = this.h;
        Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call3 = getFundPurposePresenter.c;
        if (call3 != null) {
            call3.cancel();
        }
        getFundPurposePresenter.e = null;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.etFullName.isFocused()) {
            this.etFullName.setAdapter(null);
            this.etFullName.setText(this.j.d.get(i).d);
            AutoCompleteTextView autoCompleteTextView = this.etFullName;
            autoCompleteTextView.setSelection(autoCompleteTextView.length());
            this.etNumberRek.setText(this.j.d.get(i).b);
            AutoCompleteTextView autoCompleteTextView2 = this.etNumberRek;
            autoCompleteTextView2.setSelection(autoCompleteTextView2.length());
            this.etFullName.setAdapter(this.j);
            this.tilNoRek.setHintEnabled(true);
        } else if (this.etNumberRek.isFocused()) {
            this.etNumberRek.setAdapter(null);
            this.etFullName.setText(this.f.d.get(i).d);
            AutoCompleteTextView autoCompleteTextView3 = this.etFullName;
            autoCompleteTextView3.setSelection(autoCompleteTextView3.length());
            this.etNumberRek.setText(this.f.d.get(i).b);
            AutoCompleteTextView autoCompleteTextView4 = this.etNumberRek;
            autoCompleteTextView4.setSelection(autoCompleteTextView4.length());
            this.etNumberRek.setAdapter(this.f);
            this.tilNama.setHintEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 == 0) {
            this.m = i + 1;
        } else {
            this.m = i;
        }
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
                    case 2131297006:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.llJumlah.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297054:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilNama.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297107:
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilNoRek.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297182:
                        this.tvErrors.get(2).setVisibility(0);
                        this.tvErrors.get(2).setText(message);
                        this.tilSimpanNama.setBackgroundResource(2131230870);
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
        if (this.rbTransaksiBerkalaYa.isChecked() && ((!this.rbSetiap.isChecked() && !this.rbSetiapHari.isChecked() && !this.rbSetiapTanggal.isChecked()) || ((this.rbSetiap.isChecked() && this.etSetiap.getText().toString().isEmpty()) || ((this.rbSetiapHari.isChecked() && this.etSetiapHari.getText().toString().isEmpty()) || (this.rbSetiapTanggal.isChecked() && this.etSetiapTanggal.getText().toString().isEmpty()))))) {
            this.tvErrorTransaksiBerkala.setText(2131821022);
            this.tvErrorTransaksiBerkala.setVisibility(0);
        }
        if (this.rbTransaksiBerkalaYa.isChecked() && this.etTanggalBerakhir.getText().toString().isEmpty()) {
            this.tvErrorTanggalBerakhir.setText(2131821010);
            this.tvErrorTanggalBerakhir.setVisibility(0);
            this.tilTanggalBerakhir.setBackgroundResource(2131230870);
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        boolean z = false;
        if (!this.rbTransaksiBerkalaYa.isChecked() || ((this.rbSetiap.isChecked() || this.rbSetiapHari.isChecked() || this.rbSetiapTanggal.isChecked()) && ((!this.rbSetiap.isChecked() || !this.etSetiap.getText().toString().isEmpty()) && ((!this.rbSetiapHari.isChecked() || !this.etSetiapHari.getText().toString().isEmpty()) && (!this.rbSetiapTanggal.isChecked() || !this.etSetiapTanggal.getText().toString().isEmpty()))))) {
            z = true;
        } else {
            this.tvErrorTransaksiBerkala.setText(2131821022);
            this.tvErrorTransaksiBerkala.setVisibility(0);
            z = false;
        }
        if (this.rbTransaksiBerkalaYa.isChecked() && this.etTanggalBerakhir.getText().toString().isEmpty()) {
            this.tvErrorTanggalBerakhir.setText(2131821010);
            this.tvErrorTanggalBerakhir.setVisibility(0);
            this.tilTanggalBerakhir.setBackgroundResource(2131230870);
        }
        if (!z) {
            return;
        }
        if (this.cbxSimpanDaftarTransfer.isChecked()) {
            this.g.e(this.e, "Setoran Tunai", this.etNumberRek.getText().toString(), "");
        } else {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03d6  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 1405
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.PenerimaFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @OnClick({2131297203})
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

    @OnClick({2131297387})
    public void showInfo(View view) {
        Intent intent = new Intent(getContext(), InfoTellerActivity.class);
        intent.putExtra("url", "https://www.bca.co.id/teller-smartbranch");
        startActivity(intent);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subsriberChooseValueHariEvent(register register) {
        this.tvErrorTransaksiBerkala.setVisibility(8);
        this.etSetiapHari.setText(this.arrayHari[register.d]);
        ((FormTellerActivity) getActivity()).f.setRecurringValue(String.valueOf(register.d + 1));
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subsriberChooseValueSetiapTanggalEvent(onExitTransaction onexittransaction) {
        this.tvErrorTransaksiBerkala.setVisibility(8);
        this.etSetiapTanggal.setText(onexittransaction.a);
        ((FormTellerActivity) getActivity()).f.setRecurringValue(onexittransaction.a);
    }
}
