package com.bca.smartbranch.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.InfoCodewordORActivity;
import com.bca.smartbranch.activity.OutwardRemittanceFormActivity;
import com.bca.smartbranch.activity.PilihNegaraBagianActivity;
import com.bca.smartbranch.data.api.response.BeneficiaryBankResponse;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter;
import com.bca.smartbranch.presenter.DaftarTransferPresenter;
import com.bca.smartbranch.presenter.InquiryBankByBICPresenter;
import com.bca.smartbranch.presenter.InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.mobsandgeeks.saripaar.QuickRule;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.List;
import o.DetailTundaTellerActivity_ViewBinding;
import o.InfoProductActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.OpenAccountSuccessActivity_ViewBinding;
import o.PhotoCardActivity;
import o.PilihNegaraActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.setMessage;
import o.setOnFocusChangeListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR4DataBankPenerimaFragment.class */
public class OR4DataBankPenerimaFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, AdapterView.OnItemClickListener, BeneficiaryBankDetailPresenter.write, InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver, DaftarTransferPresenter.RemoteActionCompatParcelizer {
    @BindView(2131296396)
    Button btnLanjut;
    @BindView(2131296471)
    CheckBox cbxSettleVia;
    private DaftarTransferPresenter d;
    @BindView(2131296928)
    EditText etAlamatBank;
    @BindView(2131296968)
    @Order(2)
    EditText etCodeword;
    @BindViews({2131297029, 2131296968, 2131297181, 2131297055, 2131297081, 2131296928, 2131297033})
    List<View> etForms;
    @BindView(2131297181)
    @NotEmpty(messageResId = 2131820998, sequence = 6, trim = true)
    @Order(3)
    public EditText etKeteranganAlamat;
    @Order(1)
    @BindView(2131297029)
    @NotEmpty(messageResId = 2131820832, sequence = 1, trim = true)
    @Length(messageResId = 2131820833, min = 8, sequence = 2)
    AutoCompleteTextView etKodeSwift;
    @BindView(2131297033)
    EditText etKota;
    @BindView(2131297055)
    EditText etNamaBank;
    @BindView(2131297081)
    EditText etNegaraBagian;
    private BeneficiaryBankDetailPresenter f;
    private DetailTundaTellerActivity_ViewBinding g;
    private InquiryBankByBICPresenter i;
    private List<BeneficiaryBankResponse.BeneficiaryBank> j;
    private int l;
    @BindView(2131297567)
    LinearLayout llCodeword;
    @BindView(2131297738)
    LinearLayout llKodeSwift;
    @BindView(2131297885)
    LinearLayout llSettleVia;
    @BindView(2131297974)
    setOnFocusChangeListener lottieStatusView;
    private Validator n;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131298477)
    LogoutDialog_ViewBinding tilAlamatBank;
    @BindView(2131298519)
    LogoutDialog_ViewBinding tilCodeword;
    @BindViews({2131298576, 2131298519, 2131298713, 2131298602, 2131298627, 2131298477, 2131298580})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298713)
    public LogoutDialog_ViewBinding tilKeteranganAlamat;
    @BindView(2131298576)
    LogoutDialog_ViewBinding tilKodeSwift;
    @BindView(2131298580)
    LogoutDialog_ViewBinding tilKota;
    @BindView(2131298602)
    LogoutDialog_ViewBinding tilNamaBank;
    @BindView(2131298627)
    LogoutDialog_ViewBinding tilNegaraBagian;
    @BindView(2131298878)
    TextView tvCheck;
    @BindViews({2131299052, 2131298998, 2131299181, 2131299079, 2131299103, 2131298957, 2131299056})
    public List<TextView> tvErrors;
    public setMessage a = new setMessage();
    private boolean h = false;

    private void a(final EditText editText, final int i) {
        StringBuilder sb = new StringBuilder("Kode Kliring Lokal harus ");
        sb.append(i);
        sb.append(" karakter");
        final String obj = sb.toString();
        this.n.put(editText, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment.1
            private boolean a() {
                return !editText.getText().toString().isEmpty() && editText.getText().toString().length() >= i;
            }

            public final String getMessage(Context context) {
                return editText.getText().toString().isEmpty() ? context.getString(2131820763) : obj;
            }

            public final /* synthetic */ boolean isValid(View view) {
                return a();
            }

            public final /* synthetic */ boolean isValid(Object obj2) {
                return a();
            }
        });
    }

    private void b() {
        this.tilNamaBank.setVisibility(0);
        if (this.etNegaraBagian.getText().toString().isEmpty()) {
            this.tilNegaraBagian.setVisibility(8);
        } else {
            this.tilNegaraBagian.setVisibility(0);
        }
        if (this.etAlamatBank.getText().toString().isEmpty()) {
            this.tilAlamatBank.setVisibility(8);
            this.llSettleVia.setVisibility(8);
        } else {
            this.tilAlamatBank.setVisibility(0);
        }
        this.tilKota.setVisibility(0);
    }

    static /* synthetic */ void c(OR4DataBankPenerimaFragment oR4DataBankPenerimaFragment) {
        oR4DataBankPenerimaFragment.etNamaBank.setText("");
        oR4DataBankPenerimaFragment.etNegaraBagian.setText("");
        oR4DataBankPenerimaFragment.etAlamatBank.setText("");
        oR4DataBankPenerimaFragment.etKota.setText("");
        oR4DataBankPenerimaFragment.etKeteranganAlamat.setText("");
        oR4DataBankPenerimaFragment.cbxSettleVia.setChecked(false);
        oR4DataBankPenerimaFragment.tilNamaBank.setHintEnabled(false);
        oR4DataBankPenerimaFragment.tilNegaraBagian.setHintEnabled(false);
        oR4DataBankPenerimaFragment.tilAlamatBank.setHintEnabled(false);
        oR4DataBankPenerimaFragment.tilKota.setHintEnabled(false);
        oR4DataBankPenerimaFragment.tilNamaBank.setVisibility(8);
        oR4DataBankPenerimaFragment.tilNegaraBagian.setVisibility(8);
        oR4DataBankPenerimaFragment.tilAlamatBank.setVisibility(8);
        oR4DataBankPenerimaFragment.tilKota.setVisibility(8);
        oR4DataBankPenerimaFragment.tilKeteranganAlamat.setBackgroundResource(2131230847);
        oR4DataBankPenerimaFragment.llSettleVia.setVisibility(8);
    }

    private void k(String str) {
        getPromotion.d(getContext());
        InquiryBankByBICPresenter inquiryBankByBICPresenter = this.i;
        String e = getPromotion.e(this.e);
        inquiryBankByBICPresenter.a.a();
        Call<OpenAccountSuccessActivity<PhotoCardActivity>> h = inquiryBankByBICPresenter.apiService.h(e, str);
        inquiryBankByBICPresenter.c = h;
        h.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0037: INVOKE  
              (r0v11 'h' retrofit2.Call<o.OpenAccountSuccessActivity<o.PhotoCardActivity>>)
              (wrap: com.bca.smartbranch.presenter.InquiryBankByBICPresenter$3 : 0x0034: CONSTRUCTOR  (r1v2 com.bca.smartbranch.presenter.InquiryBankByBICPresenter$3 A[REMOVE]) = (r0v3 'inquiryBankByBICPresenter' com.bca.smartbranch.presenter.InquiryBankByBICPresenter) call: com.bca.smartbranch.presenter.InquiryBankByBICPresenter.3.<init>(com.bca.smartbranch.presenter.InquiryBankByBICPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment.k(java.lang.String):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR4DataBankPenerimaFragment.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.InquiryBankByBICPresenter, state: GENERATED_AND_UNLOADED
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
            this = this;
            r0 = r5
            android.content.Context r0 = r0.getContext()
            o.getPromotion.d(r0)
            r0 = r5
            com.bca.smartbranch.presenter.InquiryBankByBICPresenter r0 = r0.i
            r7 = r0
            r0 = r5
            com.bca.smartbranch.data.localdb.User r0 = r0.e
            java.lang.String r0 = o.getPromotion.e(r0)
            r8 = r0
            r0 = r7
            com.bca.smartbranch.presenter.InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.a
            r0.a()
            r0 = r7
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r8
            r2 = r6
            retrofit2.Call r0 = r0.h(r1, r2)
            r6 = r0
            r0 = r7
            r1 = r6
            r0.c = r1
            r0 = r6
            com.bca.smartbranch.presenter.InquiryBankByBICPresenter$3 r1 = new com.bca.smartbranch.presenter.InquiryBankByBICPresenter$3
            r2 = r1
            r3 = r7
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment.k(java.lang.String):void");
    }

    @Override // com.bca.smartbranch.presenter.InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        this.tvCheck.setVisibility(8);
        this.btnLanjut.setEnabled(false);
        this.lottieStatusView.setVisibility(0);
        this.lottieStatusView.setRepeatCount(-1);
        this.lottieStatusView.setAnimation(2131755495);
        setOnFocusChangeListener setonfocuschangelistener = this.lottieStatusView;
        if (setonfocuschangelistener.isShown()) {
            setonfocuschangelistener.a.d();
            setonfocuschangelistener.e();
            return;
        }
        setonfocuschangelistener.b = true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etKodeSwift.getEditableText()) {
            if (this.tvErrors.get(this.etForms.indexOf(this.etKodeSwift)).getVisibility() == 0 && !this.etKodeSwift.getText().toString().isEmpty()) {
                this.tvErrors.get(this.etForms.indexOf(this.etKodeSwift)).setVisibility(8);
                this.llKodeSwift.setBackgroundResource(2131230847);
            }
            if (!this.etKodeSwift.isPerformingCompletion()) {
                this.h = false;
                ((OutwardRemittanceFormActivity) getActivity()).n.setFlagKodeAutoCompletePenerima("N");
                new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!((OutwardRemittanceFormActivity) OR4DataBankPenerimaFragment.this.getActivity()).v.equals("L") || !((OutwardRemittanceFormActivity) OR4DataBankPenerimaFragment.this.getActivity()).n.getJenisMataUangTransaksi().substring(0, 3).equals("IDR")) {
                            OR4DataBankPenerimaFragment.c(OR4DataBankPenerimaFragment.this);
                            if (OR4DataBankPenerimaFragment.this.etKodeSwift.getText().toString().length() < 8 || OR4DataBankPenerimaFragment.this.etKodeSwift.getAdapter().getCount() > 0) {
                                OR4DataBankPenerimaFragment.this.tvCheck.setVisibility(8);
                                OR4DataBankPenerimaFragment.this.lottieStatusView.setVisibility(8);
                                return;
                            }
                            OR4DataBankPenerimaFragment.this.tvCheck.setVisibility(0);
                            OR4DataBankPenerimaFragment.this.lottieStatusView.setVisibility(8);
                            return;
                        }
                        OR4DataBankPenerimaFragment.c(OR4DataBankPenerimaFragment.this);
                        OR4DataBankPenerimaFragment.this.lottieStatusView.setVisibility(8);
                    }
                }, 200);
            }
            ((OutwardRemittanceFormActivity) getActivity()).n.setKodeSwiftBankPenerima(this.etKodeSwift.getText().toString());
        } else if (editable == this.etNamaBank.getEditableText()) {
            ((OutwardRemittanceFormActivity) getActivity()).n.setNamaBankPenerima(this.etNamaBank.getText().toString());
        } else if (editable == this.etNegaraBagian.getEditableText()) {
            ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianBankPenerima(this.etNegaraBagian.getText().toString());
        } else if (editable == this.etAlamatBank.getEditableText()) {
            ((OutwardRemittanceFormActivity) getActivity()).n.setAlamatBankPenerima(this.etAlamatBank.getText().toString());
        } else if (editable == this.etKota.getEditableText()) {
            ((OutwardRemittanceFormActivity) getActivity()).n.setKotaBankPenerima(this.etKota.getText().toString());
        } else if (editable == this.etCodeword.getEditableText()) {
            if (this.tvErrors.get(this.etForms.indexOf(this.etCodeword)).getVisibility() == 0) {
                if (this.tvErrors.get(this.etForms.indexOf(this.etCodeword)).getText().toString().equals(getString(2131820763))) {
                    if (!this.etCodeword.getText().toString().isEmpty()) {
                        this.tvErrors.get(this.etForms.indexOf(this.etCodeword)).setVisibility(8);
                        this.llCodeword.setBackgroundResource(2131230847);
                    }
                } else if (this.etCodeword.getText().toString().length() >= this.l) {
                    this.tvErrors.get(this.etForms.indexOf(this.etCodeword)).setVisibility(8);
                    this.llCodeword.setBackgroundResource(2131230847);
                }
            }
            ((OutwardRemittanceFormActivity) getActivity()).n.setCodewordBankPenerima(this.etCodeword.getText().toString());
        } else if (editable == this.etKeteranganAlamat.getEditableText()) {
            getPromotion.b(this.tvErrors, this.tilForms, this.etForms, this.etKeteranganAlamat);
            ((OutwardRemittanceFormActivity) getActivity()).n.setKeteranganAlamatBankPenerima(this.etKeteranganAlamat.getText().toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter.write, com.bca.smartbranch.presenter.InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter.write, com.bca.smartbranch.presenter.InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493196;
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter.write
    public final void c(OpenAccountSuccessActivity_ViewBinding openAccountSuccessActivity_ViewBinding) {
        h();
        this.h = true;
        this.tvCheck.setVisibility(8);
        this.lottieStatusView.setVisibility(0);
        this.lottieStatusView.setRepeatCount(0);
        this.lottieStatusView.setAnimation(2131755496);
        setOnFocusChangeListener setonfocuschangelistener = this.lottieStatusView;
        if (setonfocuschangelistener.isShown()) {
            setonfocuschangelistener.a.d();
            setonfocuschangelistener.e();
        } else {
            setonfocuschangelistener.b = true;
        }
        this.etNamaBank.setText(openAccountSuccessActivity_ViewBinding.d.b);
        if (openAccountSuccessActivity_ViewBinding.d.g == null || openAccountSuccessActivity_ViewBinding.d.g.isEmpty()) {
            this.tilNegaraBagian.setVisibility(8);
        } else {
            this.etNegaraBagian.setText(getPromotion.e(openAccountSuccessActivity_ViewBinding.d.g));
            this.tilNegaraBagian.setVisibility(0);
        }
        EditText editText = this.etAlamatBank;
        StringBuilder sb = new StringBuilder();
        sb.append(openAccountSuccessActivity_ViewBinding.d.a);
        sb.append(" ");
        sb.append(openAccountSuccessActivity_ViewBinding.d.e);
        editText.setText(sb.toString());
        this.etKota.setText(openAccountSuccessActivity_ViewBinding.d.d);
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagBicCode(true);
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianBankPenerimaCode(openAccountSuccessActivity_ViewBinding.d.c);
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianBankPenerima(this.etNegaraBagian.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setAlamatBankPenerima(this.etAlamatBank.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setKotaBankPenerima(this.etKota.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagKodeAutoCompletePenerima("Y");
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagDaftarSwift("N");
        this.tilNamaBank.setHintEnabled(true);
        this.tilNegaraBagian.setHintEnabled(true);
        this.tilAlamatBank.setHintEnabled(true);
        this.tilKota.setHintEnabled(true);
        b();
    }

    @OnClick({2131298878})
    public void checkRendy(View view) {
        String obj = this.etKodeSwift.getText().toString();
        String substring = this.etKodeSwift.getText().toString().substring(4, 6);
        String iSONegaraTujuanTransaksi = ((OutwardRemittanceFormActivity) getActivity()).n.getISONegaraTujuanTransaksi();
        this.tvCheck.setVisibility(8);
        if (!substring.equalsIgnoreCase(iSONegaraTujuanTransaksi) || (obj.length() > 8 && obj.length() < 11)) {
            this.lottieStatusView.setVisibility(0);
            this.lottieStatusView.setRepeatCount(0);
            this.lottieStatusView.setAnimation(2131755008);
            this.lottieStatusView.a();
            this.tvErrors.get(0).setVisibility(0);
            this.tvErrors.get(0).setText(2131820834);
            this.llKodeSwift.setBackgroundResource(2131230870);
        } else if (obj.length() == 8) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append("XXX");
            k(sb.toString());
        } else {
            k(obj);
        }
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter.write
    public final void d() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(PhotoCardActivity photoCardActivity) {
        h();
        this.btnLanjut.setEnabled(true);
        if (photoCardActivity.c.size() > 0) {
            this.h = true;
            this.tvCheck.setVisibility(8);
            this.lottieStatusView.setVisibility(0);
            this.lottieStatusView.setRepeatCount(0);
            this.lottieStatusView.setAnimation(2131755496);
            setOnFocusChangeListener setonfocuschangelistener = this.lottieStatusView;
            if (setonfocuschangelistener.isShown()) {
                setonfocuschangelistener.a.d();
                setonfocuschangelistener.e();
            } else {
                setonfocuschangelistener.b = true;
            }
            this.etNamaBank.setText(photoCardActivity.c.get(0).b);
            this.etNegaraBagian.setText("");
            this.tilNegaraBagian.setVisibility(8);
            EditText editText = this.etAlamatBank;
            StringBuilder sb = new StringBuilder();
            sb.append(photoCardActivity.c.get(0).a);
            sb.append(" ");
            sb.append(photoCardActivity.c.get(0).c);
            editText.setText(sb.toString());
            this.etKota.setText(photoCardActivity.c.get(0).e);
            if (!photoCardActivity.c.get(0).j.isEmpty() || ((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi().substring(0, 3).equals("CNY")) {
                ((OutwardRemittanceFormActivity) getActivity()).n.setFlagSettleViaBankPenerima("N");
                this.llSettleVia.setVisibility(8);
            } else {
                ((OutwardRemittanceFormActivity) getActivity()).n.setFlagSettleViaBankPenerima("Y");
                this.llSettleVia.setVisibility(0);
            }
            ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianBankPenerimaCode(photoCardActivity.c.get(0).g);
            ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianBankPenerima(this.etNegaraBagian.getText().toString());
            ((OutwardRemittanceFormActivity) getActivity()).n.setAlamatBankPenerima(this.etAlamatBank.getText().toString());
            ((OutwardRemittanceFormActivity) getActivity()).n.setKotaBankPenerima(this.etKota.getText().toString());
            ((OutwardRemittanceFormActivity) getActivity()).n.setFlagKodeAutoCompletePenerima("Y");
            ((OutwardRemittanceFormActivity) getActivity()).n.setFlagDaftarSwift("Y");
            ((OutwardRemittanceFormActivity) getActivity()).n.setBankBicKey(photoCardActivity.c.get(0).d);
            this.tilNamaBank.setHintEnabled(true);
            this.tilNegaraBagian.setHintEnabled(true);
            this.tilAlamatBank.setHintEnabled(true);
            this.tilKota.setHintEnabled(true);
            b();
            return;
        }
        this.h = false;
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagSettleViaBankPenerima("N");
        this.llSettleVia.setVisibility(8);
        this.tvCheck.setVisibility(8);
        this.lottieStatusView.setVisibility(0);
        this.lottieStatusView.setRepeatCount(0);
        this.lottieStatusView.setAnimation(2131755008);
        this.lottieStatusView.a();
        this.tvErrors.get(0).setVisibility(0);
        this.tvErrors.get(0).setText(2131820834);
        this.llKodeSwift.setBackgroundResource(2131230870);
        this.etKodeSwift.requestFocus();
    }

    @Override // com.bca.smartbranch.presenter.InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void e() {
        h();
        this.btnLanjut.setEnabled(true);
        this.h = false;
        this.tvCheck.setVisibility(8);
        this.lottieStatusView.setVisibility(0);
        this.lottieStatusView.setRepeatCount(0);
        this.lottieStatusView.setAnimation(2131755008);
        setOnFocusChangeListener setonfocuschangelistener = this.lottieStatusView;
        if (setonfocuschangelistener.isShown()) {
            setonfocuschangelistener.a.d();
            setonfocuschangelistener.e();
        } else {
            setonfocuschangelistener.b = true;
        }
        this.tvErrors.get(0).setVisibility(0);
        this.tvErrors.get(0).setText(2131820834);
        this.llKodeSwift.setBackgroundResource(2131230870);
        this.etKodeSwift.requestFocus();
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        h();
        c(2131296811, new OR5DataPenerimaFragment(), "OR5DataPenerimaFragment");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(List<DaftarTransferResponse.DaftarTransferOutput> list) {
        h();
        ((OutwardRemittanceFormActivity) getActivity()).p = list;
        c(2131296811, new OR5DataPenerimaFragment(), "OR5DataPenerimaFragment");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e_(String str) {
        h();
        c(2131296811, new OR5DataPenerimaFragment(), "OR5DataPenerimaFragment");
    }

    @Override // com.bca.smartbranch.presenter.InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void f(String str) {
        h();
        this.btnLanjut.setEnabled(true);
        this.h = false;
        this.tvCheck.setVisibility(8);
        this.lottieStatusView.setVisibility(0);
        this.lottieStatusView.setRepeatCount(0);
        this.lottieStatusView.setAnimation(2131755008);
        setOnFocusChangeListener setonfocuschangelistener = this.lottieStatusView;
        if (setonfocuschangelistener.isShown()) {
            setonfocuschangelistener.a.d();
            setonfocuschangelistener.e();
        } else {
            setonfocuschangelistener.b = true;
        }
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).g();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagBicCode(false);
        ((OutwardRemittanceFormActivity) getActivity()).n.setKodeSwiftBankPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNamaBankPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianBankPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setAlamatBankPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setKotaBankPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setCodewordBankPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagKodeAutoCompletePenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagSettleViaBankPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagAlamatBankPenerimaBelumSesuai("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setKeteranganAlamatBankPenerima("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setBankBicKey("");
        e(2131296811, new OR3DataTransaksiBFragment(), "OR3DataTransaksiBFragment");
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter.write
    public final void g(String str) {
        h();
        this.h = false;
        this.tvCheck.setVisibility(8);
        this.lottieStatusView.setVisibility(0);
        this.lottieStatusView.setRepeatCount(0);
        this.lottieStatusView.setAnimation(2131755008);
        setOnFocusChangeListener setonfocuschangelistener = this.lottieStatusView;
        if (setonfocuschangelistener.isShown()) {
            setonfocuschangelistener.a.d();
            setonfocuschangelistener.e();
        } else {
            setonfocuschangelistener.b = true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void g_(String str) {
        h();
        c(2131296811, new OR5DataPenerimaFragment(), "OR5DataPenerimaFragment");
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter.write
    public final void h(String str) {
        h();
        this.h = false;
        this.tvCheck.setVisibility(8);
        this.lottieStatusView.setVisibility(0);
        this.lottieStatusView.setRepeatCount(0);
        this.lottieStatusView.setAnimation(2131755008);
        setOnFocusChangeListener setonfocuschangelistener = this.lottieStatusView;
        if (setonfocuschangelistener.isShown()) {
            setonfocuschangelistener.a.d();
            setonfocuschangelistener.e();
        } else {
            setonfocuschangelistener.b = true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter.write
    public final void i(String str) {
        h();
        this.h = false;
        this.tvCheck.setVisibility(8);
        this.lottieStatusView.setVisibility(0);
        this.lottieStatusView.setRepeatCount(0);
        this.lottieStatusView.setAnimation(2131755008);
        setOnFocusChangeListener setonfocuschangelistener = this.lottieStatusView;
        if (setonfocuschangelistener.isShown()) {
            setonfocuschangelistener.a.d();
            setonfocuschangelistener.e();
        } else {
            setonfocuschangelistener.b = true;
        }
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).g();
    }

    @OnFocusChange({2131297029, 2131297055, 2131297081, 2131296928, 2131297033, 2131296968, 2131297181})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296928:
                    this.tilAlamatBank.setHintEnabled(true);
                    return;
                case 2131296968:
                    this.tilCodeword.setHintEnabled(true);
                    return;
                case 2131297029:
                    this.tilKodeSwift.setHintEnabled(true);
                    return;
                case 2131297033:
                    this.tilKota.setHintEnabled(true);
                    return;
                case 2131297055:
                    this.tilNamaBank.setHintEnabled(true);
                    return;
                case 2131297081:
                    this.tilNegaraBagian.setHintEnabled(true);
                    return;
                case 2131297181:
                    this.tilKeteranganAlamat.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296928:
                    if (this.etAlamatBank.getText().toString().isEmpty()) {
                        this.tilAlamatBank.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296968:
                    if (this.etCodeword.getText().toString().isEmpty()) {
                        this.tilCodeword.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297029:
                    if (this.etKodeSwift.getText().toString().isEmpty()) {
                        this.tilKodeSwift.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297033:
                    if (this.etKota.getText().toString().isEmpty()) {
                        this.tilKota.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297055:
                    if (this.etNamaBank.getText().toString().isEmpty()) {
                        this.tilNamaBank.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297081:
                    if (this.etNegaraBagian.getText().toString().isEmpty()) {
                        this.tilNegaraBagian.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297181:
                    if (this.etKeteranganAlamat.getText().toString().isEmpty()) {
                        this.tilKeteranganAlamat.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.InquiryBankByBICPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void j(String str) {
        h();
        this.btnLanjut.setEnabled(true);
        this.h = false;
        this.tvCheck.setVisibility(8);
        this.lottieStatusView.setVisibility(0);
        this.lottieStatusView.setRepeatCount(0);
        this.lottieStatusView.setAnimation(2131755008);
        setOnFocusChangeListener setonfocuschangelistener = this.lottieStatusView;
        if (setonfocuschangelistener.isShown()) {
            setonfocuschangelistener.a.d();
            setonfocuschangelistener.e();
        } else {
            setonfocuschangelistener.b = true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @OnClick({2131296396})
    public void lanjut(View view) {
        getPromotion.d(getContext());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        this.llKodeSwift.setBackgroundResource(2131230847);
        this.llCodeword.setBackgroundResource(2131230847);
        this.tilKeteranganAlamat.setBackgroundResource(2131230847);
        this.n.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegaraBagian(PilihNegaraActivity pilihNegaraActivity) {
        this.etNegaraBagian.setError(null);
        this.tilNegaraBagian.setHintEnabled(true);
        this.etNegaraBagian.setText(pilihNegaraActivity.e);
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianBankPenerima(pilihNegaraActivity.e);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        BeneficiaryBankDetailPresenter beneficiaryBankDetailPresenter = this.f;
        Call<OpenAccountSuccessActivity<OpenAccountSuccessActivity_ViewBinding>> call = beneficiaryBankDetailPresenter.e;
        if (call != null) {
            call.cancel();
        }
        beneficiaryBankDetailPresenter.e = null;
        InquiryBankByBICPresenter inquiryBankByBICPresenter = this.i;
        Call<OpenAccountSuccessActivity<PhotoCardActivity>> call2 = inquiryBankByBICPresenter.c;
        if (call2 != null) {
            call2.cancel();
        }
        inquiryBankByBICPresenter.c = null;
        DaftarTransferPresenter daftarTransferPresenter = this.d;
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call3 = daftarTransferPresenter.a;
        if (call3 != null) {
            call3.cancel();
        }
        daftarTransferPresenter.c = null;
        documentProvider.b().e(this);
        onDestroyView();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.etKodeSwift.removeTextChangedListener(this);
        this.etKodeSwift.setAdapter(null);
        this.etKodeSwift.setText(this.g.e.get(i).d);
        this.tvErrors.get(this.etForms.indexOf(this.etKodeSwift)).setVisibility(8);
        this.llKodeSwift.setBackgroundResource(2131230847);
        ((OutwardRemittanceFormActivity) getActivity()).n.setKodeSwiftBankPenerima(this.etKodeSwift.getText().toString());
        String str = this.g.e.get(i).c;
        getPromotion.d(getContext());
        BeneficiaryBankDetailPresenter beneficiaryBankDetailPresenter = this.f;
        String e = getPromotion.e(this.e);
        beneficiaryBankDetailPresenter.d.d();
        Call<OpenAccountSuccessActivity<OpenAccountSuccessActivity_ViewBinding>> c = beneficiaryBankDetailPresenter.apiService.c(e, str);
        beneficiaryBankDetailPresenter.e = c;
        c.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b5: INVOKE  
              (r0v33 'c' retrofit2.Call<o.OpenAccountSuccessActivity<o.OpenAccountSuccessActivity_ViewBinding>>)
              (wrap: com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter$3 : 0x00b2: CONSTRUCTOR  (r1v20 com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter$3 A[REMOVE]) = (r0v25 'beneficiaryBankDetailPresenter' com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter) call: com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter.3.<init>(com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment.onItemClick(android.widget.AdapterView<?>, android.view.View, int, long):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR4DataBankPenerimaFragment.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter, state: GENERATED_AND_UNLOADED
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
            this = this;
            r0 = r5
            android.widget.AutoCompleteTextView r0 = r0.etKodeSwift
            r1 = r5
            r0.removeTextChangedListener(r1)
            r0 = r5
            android.widget.AutoCompleteTextView r0 = r0.etKodeSwift
            r1 = 0
            r0.setAdapter(r1)
            r0 = r5
            android.widget.AutoCompleteTextView r0 = r0.etKodeSwift
            r1 = r5
            o.DetailTundaTellerActivity_ViewBinding r1 = r1.g
            java.util.List<o.ConfirmSubBCACardAdapter$ViewHolder_ViewBinding> r1 = r1.e
            r2 = r8
            java.lang.Object r1 = r1.get(r2)
            o.ConfirmSubBCACardAdapter$ViewHolder_ViewBinding r1 = (o.ConfirmSubBCACardAdapter$ViewHolder_ViewBinding) r1
            java.lang.String r1 = r1.d
            r0.setText(r1)
            r0 = r5
            java.util.List<android.widget.TextView> r0 = r0.tvErrors
            r1 = r5
            java.util.List<android.view.View> r1 = r1.etForms
            r2 = r5
            android.widget.AutoCompleteTextView r2 = r2.etKodeSwift
            int r1 = r1.indexOf(r2)
            java.lang.Object r0 = r0.get(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 8
            r0.setVisibility(r1)
            r0 = r5
            android.widget.LinearLayout r0 = r0.llKodeSwift
            r1 = 2131230847(0x7f08007f, float:1.8077758E38)
            r0.setBackgroundResource(r1)
            r0 = r5
            o.getView r0 = r0.getActivity()
            com.bca.smartbranch.activity.OutwardRemittanceFormActivity r0 = (com.bca.smartbranch.activity.OutwardRemittanceFormActivity) r0
            com.bca.smartbranch.data.localdb.KirimanUang r0 = r0.n
            r1 = r5
            android.widget.AutoCompleteTextView r1 = r1.etKodeSwift
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.setKodeSwiftBankPenerima(r1)
            r0 = r5
            o.DetailTundaTellerActivity_ViewBinding r0 = r0.g
            java.util.List<o.ConfirmSubBCACardAdapter$ViewHolder_ViewBinding> r0 = r0.e
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            o.ConfirmSubBCACardAdapter$ViewHolder_ViewBinding r0 = (o.ConfirmSubBCACardAdapter$ViewHolder_ViewBinding) r0
            java.lang.String r0 = r0.c
            r11 = r0
            r0 = r5
            android.content.Context r0 = r0.getContext()
            o.getPromotion.d(r0)
            r0 = r5
            com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter r0 = r0.f
            r6 = r0
            r0 = r5
            com.bca.smartbranch.data.localdb.User r0 = r0.e
            java.lang.String r0 = o.getPromotion.e(r0)
            r7 = r0
            r0 = r6
            com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter$write r0 = r0.d
            r0.d()
            r0 = r6
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r7
            r2 = r11
            retrofit2.Call r0 = r0.c(r1, r2)
            r7 = r0
            r0 = r6
            r1 = r7
            r0.e = r1
            r0 = r7
            com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter$3 r1 = new com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter$3
            r2 = r1
            r3 = r6
            r2.<init>()
            r0.enqueue(r1)
            r0 = r5
            android.widget.AutoCompleteTextView r0 = r0.etKodeSwift
            r1 = r5
            o.DetailTundaTellerActivity_ViewBinding r1 = r1.g
            r0.setAdapter(r1)
            r0 = r5
            android.widget.AutoCompleteTextView r0 = r0.etKodeSwift
            r1 = r5
            r0.addTextChangedListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
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
                if (id == 2131296968) {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.llCodeword.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id == 2131297029) {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.llKodeSwift.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297181) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(2).setVisibility(0);
                    this.tvErrors.get(2).setText(message);
                    this.tilKeteranganAlamat.setBackgroundResource(2131230870);
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
        if (!this.h) {
            this.tvErrors.get(0).setVisibility(0);
            this.tvErrors.get(0).setText(2131820834);
            this.llKodeSwift.setBackgroundResource(2131230870);
            this.etKodeSwift.requestFocus();
            return;
        }
        getPromotion.d(getContext());
        this.d.d(new InfoProductActivity(this.e.getEmail(), this.e.getSessionId(), this.e.getImei(), "Transfer Valuta Asing"), true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x043c, code lost:
        if (r0.equals("GBGBP") == false) goto L_0x046f;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 1627
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @OnClick({2131297081})
    public void pilihNegaraBagian(View view) {
        Intent intent = new Intent(getContext(), PilihNegaraBagianActivity.class);
        intent.putExtra("country", this.etNegaraBagian.getText().toString());
        intent.putExtra("is_from_reservation", ((OutwardRemittanceFormActivity) getActivity()).s);
        intent.putExtra("is_save_draft_and_hit_service", ((OutwardRemittanceFormActivity) getActivity()).u == null || ((OutwardRemittanceFormActivity) getActivity()).u.getCountAll() == 0);
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void s() {
        g();
    }

    @OnClick({2131297388})
    public void showInfoCodewordnOR(View view) {
        startActivity(new Intent(getContext(), InfoCodewordORActivity.class));
    }
}
